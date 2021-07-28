package API;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;

class locations extends API_GUI {

    protected locations(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_ID = a.AP3_User_ID;
        AP3_User_TKN = a.AP3_User_TKN;
        SITE = a.SITE;
        BRAND = a.BRAND;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    private String New_SiteID = "";
    private String New_DropOff_LocationID = "";
    private String New_Business_UnitID = "";
    private Date release_date = new DateTime(new Date()).plusHours(4).plusMinutes(1).toDate();
    private String RELEASE_DATE = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(release_date);

    protected void run() {

        Auth = "Bearer " + AP3_User_TKN;  // =============== AP3 Sectors > Company ID ================
        JOB_Api_Call("Location > /sector", "GET",
                BaseAPI + "/location/sector?_provider=cdl", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                        // =============== AP3 ALL Sites ===========================
        AppID = A.Func.App_ID(app, env);
        JOB_Api_Call("Location > /multigroup/", "GET",
                BaseAPI + "/location/multigroup/", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                       // =============== AP3 App Sites ===========================
        AppID = A.Func.App_ID(app, env);
        JOB_Api_Call("Location > /multigroup/'AppID'", "GET",
                BaseAPI + "/location/multigroup/" + AppID + "?nocache=true&extended=true", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                JSONArray Groups = json.getJSONArray("groups");
                for (int i = 0; i < Groups.length(); i++) {
                    JSONObject group = Groups.getJSONObject(i);
                    if (group.has("name") && group.getString("name").equals(SITE)) {
                        SiteID = group.getString("id");
                        break;
                    }
                }
            }
            catch (Exception ex) {
                //
            }
        }

        Auth = "";                      // =============== AP3 Site Brands ===========================
        JOB_Api_Call("Location > /group/'SiteID'", "GET",
                BaseAPI + "/location/group/" + SiteID + "?nocache=true&extended=true", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                JSONArray Location = json.getJSONArray("locations");
                if (Location != null) {
                    for (Object l : Location) {
                        JSONObject loc = (JSONObject) l;
                        JSONArray brands = loc.getJSONArray("brands");
                        for (Object b : brands) {
                            JSONObject br = (JSONObject) b;
                            BrandIDS += br.getString("id") + ",";
                            if (br.getString("name").equals(BRAND)) {
                                BrandID = br.getString("id");
                                UnitID = loc.getString("id");
                            }
                        }
                    }
                }
                BrandIDS = BrandIDS.substring(0, BrandIDS.length() - 1);
            }
            catch (Exception ex) {
                //
            }
        }

        Auth = "";                      // ===============    AP3 Unit ===========================
        JOB_Api_Call("Location > /'UnitID'", "GET",
                BaseAPI + "/location/" + UnitID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                      // ===============    AP3 Brand ===========================
        JOB_Api_Call("Location > /'BrandID'", "GET",
                BaseAPI + "/location/brand/" + BrandID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");
        SectorID = "";
        CompanyID = "";
        if (json != null) {
            MENU_IDS = new ArrayList<>();
            try {
                JSONArray MENUS = json.getJSONArray("menus");
                for (int i = 0; i < MENUS.length(); i++) {
                    JSONObject menu = MENUS.getJSONObject(i);
                    MENU_IDS.add(menu.getString("id"));
                }

                if (json.has("sector")) {
                    SectorID = json.getString("sector");
                }
                if (json.has("company")) {
                    CompanyID = json.getString("company");
                }
            }
            catch (Exception ex) {
                //
            }
        }
        Auth = "Bearer " + AP3_User_TKN;  // ===============    AP3 Sector ===========================
        JOB_Api_Call("Location/Sector > /'SectorID'", "GET",
                BaseAPI + "/location/sector/" + SectorID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");

        if (env != "PR") {
            groupAPIs();
            locationAPIs();
        }

    }

    protected void groupAPIs() {
        //<editor-fold defaultstate="collapsed" desc="POST New Group/Site">
        // Test Scenario 1: Positive flow to post site
        BODY = "{\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"label\":{"
                + "\"en\":\"Demo\""
                + "},"
                + "\"meta\":{"
                + "\"sector_name\":\"Canteen\""
                + "},"
                + "\"name\":\"This is test for AP3 API Automaion - " + RELEASE_DATE + " (Can be Delete)\"}";
        JOB_Api_Call("Location - POST new group/site", "POST",
                BaseAPI + "/location/group", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_SiteID = json.getString("id");
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow to Add Multigroup to newly created group/site.
        BODY = "{\n"
                + "\"id\":\"" + AppID + "\","
                + "\"groups\":["
                + "{"
                + "\"id\":\"" + New_SiteID + "\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Location - PATCH add multigroup to newly created group/site", "PATCH",
                BaseAPI + "/location/multigroup/" + AppID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive flow to Add Drop-off location to newly created group/site.
        BODY = "{"
                + "\"name\":\"Drop-off location name\","
                + "\"foodlocker\":false,"
                + "\"information\":\"This is foodlocker values\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST add drop-off location to newly created group/site " + New_SiteID + " ", "POST",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 4: Negative flow to Add duplicate Drop-off location to newly created group/site.
        BODY = "{"
                + "\"name\":\"Drop-off location name\","
                + "\"foodlocker\":false,"
                + "\"information\":\"This is foodlocker values\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST Negative flow to add duplicate drop-off location to newly created group/site " + New_SiteID + " ", "POST",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 5: Positive flow to Add Drop-off location with foodlocker = true.
        BODY = "{"
                + "\"name\":\"Drop-off location with foodlocker=true\","
                + "\"foodlocker\":true,"
                + "\"information\":\"\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST add drop-off location to newly created group/site with Foodlocker = true " + New_SiteID + " ", "POST",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_DropOff_LocationID = json.getString("id");
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 6: Negative flow to post site without Name
        BODY = "{\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"label\":{"
                + "\"en\":\"Demo\""
                + "},"
                + "\"meta\":{"
                + "\"sector_name\":\"Canteen\""
                + "},"
                + "\"name\":\"\"}";
        JOB_Api_Call("Location - POST Negative flow for group/site without Name", "POST",
                BaseAPI + "/location/group", Auth, BODY, 400, ParentTest, "no_jira");
        // Test Scenario 7: Negative flow to update site without Group/Site id
        BODY = "{\n"
                + "\"id\":\"" + AppID + "\","
                + "\"groups\":["
                + "{"
                + "\"id\":\"\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Location - PATCH add multigroup without passing valid group/site id", "PATCH",
                BaseAPI + "/location/multigroup/" + AppID, Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 8: Negative flow to Add Drop-off location to without Name
        BODY = "{"
                + "\"name\":\"\","
                + "\"foodlocker\":false,"
                + "\"information\":\"\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST Negative drop-off location without valid Name" + New_SiteID + " ", "POST",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 400, ParentTest, "no_jira");
        // Test Scenario 9: Negative flow to Add Drop-off location to without foodlocker
        BODY = "{"
                + "\"name\":\"This is null value for foodlocker\","
                + "\"foodlocker\":null,"
                + "\"information\":\"\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST Negative drop-off location with null folldlocker value" + New_SiteID + " ", "POST",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT/Update  Newly created Group/Site">
        // Test Scenario 1: Positive flow to Update/Patch Newly created Group/Site
        BODY = "{\"address\":{"
                + "\"state\":\"BC\","
                + "\"zip\":\"V9R 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"8 Pamela Ct\","
                + "\"city\":\"Vancouver\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"label\":{"
                + "\"en\":\"This is test for PATCH/Update on AP3 API Automaion \""
                + "},"
                + "\"meta\":{"
                + "\"sector_name\":\"Canteen\""
                + "},"
                + "\"name\":\"This is test for PATCH/Update on AP3 API Automaion - " + RELEASE_DATE + " (Can be Delete)\"}";
        JOB_Api_Call("Location - POST new group/site", "PATCH",
                BaseAPI + "/location/group/" + New_SiteID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive flow to Update Multigroup to newly created group/site.
        BODY = "{\n"
                + "\"id\":\"Roj5NWl4mXtl2dZ8yJLKF9Rq5Eow59FJaNGB6\","
                + "\"groups\":["
                + "{"
                + "\"id\":\"" + New_SiteID + "\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Location - PATCH add multigroup(Thrive) to newly created group/site with multigroup(Boost)", "PATCH",
                BaseAPI + "/location/multigroup/Roj5NWl4mXtl2dZ8yJLKF9Rq5Eow59FJaNGB6", Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive flow to Update/Patch Drop-off location under newly created group/site.
        BODY = "{"
                + "\"name\":\"This is updated Dropp-off location name\","
                + "\"foodlocker\":true,"
                + "\"information\":\"\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - PATCH update drop-off location to newly created group/site " + New_SiteID + " ", "PATCH",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination/" + New_DropOff_LocationID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 4: Positive flow to Update Drop-off location with foodlocker = false.
        BODY = "{"
                + "\"name\":\"Drop-off location with foodlocker=false\","
                + "\"foodlocker\":false,"
                + "\"information\":\"\","
                + "\"address\":{"
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Location - PATCH  update drop-off location to newly created group/site with Foodlocker = false" + New_SiteID + " ", "PATCH",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination/" + New_DropOff_LocationID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 5: Negative flow to update site without Name
        BODY = "{\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"label\":{"
                + "\"en\":\"Demo\""
                + "},"
                + "\"meta\":{"
                + "\"sector_name\":\"Canteen\""
                + "},"
                + "\"name\":\"\"}";
        JOB_Api_Call("Location - PATCH Negative flow to update group/site without Name", "PATCH",
                BaseAPI + "/location/group/" + New_SiteID, Auth, BODY, 400, ParentTest, "no_jira");

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="GET by ID's">
        // Test Scenario 1: Get newly created group/site by Id.
        JOB_Api_Call("Location - Get newly created group/site by Id " + New_SiteID + " ", "GET",
                BaseAPI + "/location/group/" + New_SiteID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 2: Get multigroup for newly created site by Id.
        JOB_Api_Call("Location - Get multigroup for newly created site by Id :- " + New_SiteID + " ", "GET",
                BaseAPI + "/location/multigroup/" + AppID + "/user/" + AP3_User_ID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 3: Get multigroups by Id.
        JOB_Api_Call("Location - Get multigroups by Id :- " + New_SiteID + " ", "GET",
                BaseAPI + "/location/multigroup/" + AppID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 4: Getdrop-off location by group id.
        JOB_Api_Call("Location - Get newly created drop-off location by Id :-" + New_SiteID + " ", "GET",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, "", 200, ParentTest, "no_jira");

        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Delete drop-off location">
        // Test Scenario 1: Positive flow to delete Drop-off location under newly created group/site.
        JOB_Api_Call("Location - DELETE drop-off location under newly created group/site " + New_SiteID + " ", "DELETE",
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination/" + New_DropOff_LocationID, Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>
    }

    protected void locationAPIs() {

        //<editor-fold defaultstate="collapsed" desc="POST Business Unit/Location">
        // Test Scenario 1: Positive flow to Add new Business Unit 
        BODY = "{"
                + "\"name\":\"This is API test to add Business Unit under  newly created group/site\","
                + "\"label\":{"
                + "\"en\":\"This is API test to add Business Unit under  newly created group/site\""
                + "},"
                + "\"brands\":["
                + "],"
                + "\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"meta\":{"
                + "\"unit\":11 " + release_date + "\","
                + "\"unit_id\":11 " + release_date + "\","
                + "\"app_name\":\"" + app + "\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST new Busines Unit", "POST",
                BaseAPI + "/location", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_DropOff_LocationID = json.getString("id");
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow to update Business Unit under newly created group/site
        BODY = "{"
                + "\"id\":\"" + New_SiteID + "\","
                + "\"locations\":["
                + "{"
                + "\"id\":\"" + New_Business_UnitID + "\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Location - PATCH/Update Busines Unit under newly create group/site : " + New_SiteID + " ", "PATCH",
                BaseAPI + "/location/group/" + New_SiteID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 3: Negative flow to Add new Business Unit without name
        BODY = "{"
                + "\"name\":\"\","
                + "\"label\":{"
                + "\"en\":\"This is API test to add Business Unit under  newly created group/site\""
                + "},"
                + "\"brands\":["
                + "],"
                + "\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"M9V 2C3\","
                + "\"country\":\"CA\","
                + "\"address\":\"6 Pamela Ct\","
                + "\"city\":\"Toronto\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"meta\":{"
                + "\"unit\":11 " + release_date + "\","
                + "\"unit_id\":11 " + release_date + "\","
                + "\"app_name\":\"" + app + "\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST negative flow to add new Busines Unit without name", "POST",
                BaseAPI + "/location", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT/Update newly created Business Unit">
        // Test Scenario 1: Positive flow to update newly added Business Unit 
        BODY = "{"
                + "\"id\":\"" + New_Business_UnitID + "\","
                + "\"label\":{"
                + "\"en\":\"This is API test to update Business Unit name\""
                + "},"
                + "\"name\":\"This is API test to update Business Unit name\""
                + "}";
        JOB_Api_Call("Location - POST new Busines Unit", "PATCH", BaseAPI + "/location", Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to update new Business Unit without name
        BODY = "{"
                + "\"id\":\"" + New_Business_UnitID + "\","
                + "\"label\":{"
                + "\"en\":\"\""
                + "},"
                + "\"name\":\"\""
                + "}";
        JOB_Api_Call("Location - PATCH negative flow to update new Busines Unit without name", "PATCH", BaseAPI + "/location", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Get Business unit by ID">
        // Test Scenario 1: Positive flow to update newly added Business Unit 
        JOB_Api_Call("Location - GET new Busines Unit details by ID", "GET", BaseAPI + "/location/" + New_Business_UnitID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>
    }
}
