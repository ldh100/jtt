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
        AP3_TKN = a.AP3_TKN;
        SITE = a.SITE;
        BRAND = a.BRAND;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
        CompanyID = a.CompanyID;
        SectorID = a.SectorID;
    }
    private String New_SiteID = "";
    private String New_DropOff_LocationID = "";
    private String New_BrandID = "";
    private String New_Business_UnitID = "";
    private String New_SecotorID = "";
    private String New_CompanyID = "";
    private Date release_date = new DateTime(new Date()).plusHours(4).plusMinutes(1).toDate();
    private String RELEASE_DATE = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(release_date);
    private String RELEASE_DATE_SECONDS = new SimpleDateFormat("SSS").format(release_date);
    private String AAA = "";
    
    protected void run() {

        Auth = "Bearer " + AP3_TKN;  // =============== AP3 Sectors > Company ID ================
        JOB_Api_Call("Location > /sector?_provider=cdl", "GET",
                BaseAPI + "/location/sector?_provider=cdl", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                        // =============== AP3 ALL Sites ===========================
        AppID = A.Func.App_ID(app, env);
        JOB_Api_Call("Location > /multigroup/", "GET",
                BaseAPI + "/location/multigroup/", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                       // =============== AP3 App Sites ===========================
        AppID = A.Func.App_ID(app, env);
        JOB_Api_Call("Location > /multigroup/'AppID'?nocache=true&extended=true", "GET",
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
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }

        Auth = "";                      // =============== AP3 Site Brands ===========================
        JOB_Api_Call("Location > /group/'SiteID'?nocache=true&extended=true", "GET",
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
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        } 
        
       

        Auth = "";                      // ===============    AP3 Unit ===========================
        JOB_Api_Call("Location > /'UnitID'?extended=true&nocache=1", "GET",
                BaseAPI + "/location/" + UnitID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                if (json.has("meta")) {
                    UnitNum = json.getJSONObject("meta").getNumber("unit").toString();
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }

        Auth = "";                      // ===============    AP3 Brand ===========================
        JOB_Api_Call("Location > /'BrandID'?extended=true&nocache=1", "GET",
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
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        Auth = "Bearer " + AP3_TKN;  // ===============    AP3 Sector ===========================
        JOB_Api_Call("Location/Sector > /'SectorID'?extended=true&nocache=1", "GET",
                BaseAPI + "/location/sector/" + SectorID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");

        Auth = "Bearer " + AP3_TKN;  // ===============    AP3 Brand Timeslots ===========================
        JOB_Api_Call("Location/brand > /'BrandID' > /timeslots", "GET",
                BaseAPI + "/location/brand/" + BrandID + "/timeslots", Auth, "", 200, ParentTest, "no_jira");
        BRAND_TIMESLOTS = new ArrayList<>();
        if (json != null) {
            try {
                if (json.has("timeslots")) {
                    JSONArray timeslots = json.getJSONArray("timeslots");
                    for (int i = 0; i < timeslots.length(); i++) {
                        JSONObject timeslot = timeslots.getJSONObject(i);
                        BRAND_TIMESLOTS.add(timeslot.getNumber("id").toString());
                    }
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        JOB_Api_Call("Menu (PickUp) > Timeslots > Last Menu > /timeslots/menu/'MenuID'", "GET",
                BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MENU_IDS.get(MENU_IDS.size() - 1) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira");
        MENU_TIMESLOTS = new ArrayList<>();
        if (json != null) {
            try {
                if (json.has("timeslots")) {
                    JSONArray timeslots = json.getJSONArray("timeslots");
                    for (int i = 0; i < timeslots.length(); i++) {
                        JSONObject timeslot = timeslots.getJSONObject(i);
                        MENU_TIMESLOTS.add(timeslot.getNumber("id").toString());
                    }
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        JOB_Api_Call("Menu (Delivery) > Timeslots > Last Menu > /timeslots/delivery/menu/'MenuID'", "GET",
                BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MENU_IDS.get(MENU_IDS.size() - 1) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira");
        DELIEVEY_TIMESLOTS = new ArrayList<>();
        if (json != null) {
            try {
                if (json.has("timeslots")) {
                    JSONArray timeslots = json.getJSONArray("timeslots");
                    for (int i = 0; i < timeslots.length(); i++) {
                        JSONObject timeslot = timeslots.getJSONObject(i);
                        DELIEVEY_TIMESLOTS.add(timeslot.getNumber("id").toString());
                    }
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }        
        if (!env.equals("PR")) {
            Group_APIs();
            Location_APIs();
            Brand_APIs();
            Sector_APIs();
            Company_APIs();
        }

    }

    protected void Group_APIs() {
        //<editor-fold defaultstate="collapsed" desc="POST New Group/Site with Delivery Drop-Off Locations">
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
            } catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow to Add Multigroup to newly created group/site.
        BODY = "{"
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
        JOB_Api_Call("Location - POST add drop-off location to newly created group/site", "POST", 
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
        JOB_Api_Call("Location - POST Negative flow to add duplicate drop-off location to newly created group/site", "POST", 
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
        JOB_Api_Call("Location - POST add drop-off location to newly created group/site with Foodlocker=true", "POST", 
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_DropOff_LocationID = json.getString("id");
            } catch (Exception ex) {
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
        BODY = "{"
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
        JOB_Api_Call("Location - POST Negative drop-off location without valid Name", "POST", 
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
        JOB_Api_Call("Location - POST Negative drop-off location with null folldlocker value", "POST", 
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT > Update Newly created Group/Site">
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
        JOB_Api_Call("Location - PATCH update newly added group/site", "PATCH", 
                BaseAPI + "/location/group/" + New_SiteID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive flow to Update Multigroup to newly created group/site.
        BODY = "{"
                + "\"id\":\"Roj5NWl4mXtl2dZ8yJLKF9Rq5Eow59FJaNGB6\","
                + "\"groups\":["
                        + "{"
                            + "\"id\":\"" + New_SiteID + "\""
                        + "}"
                    + "]"
                + "}";
        JOB_Api_Call("Location - PATCH add multigroup(Thrive) to newly created group/site with multigroup(Boost)", "PATCH", 
                BaseAPI + "/location/multigroup/Roj5NWl4mXtl2dZ8yJLKF9Rq5Eow59FJaNGB6", Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive flow to Update > Patch Drop-off location under newly created group/site.
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
        JOB_Api_Call("Location - PATCH update drop-off location to newly created group/site", "PATCH", 
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
        JOB_Api_Call("Location - PATCH  update drop-off location to newly created group/site with Foodlocker=false", "PATCH", 
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
        JOB_Api_Call("Location - Get newly created group/site by ID", "GET", 
                BaseAPI + "/location/group/" + New_SiteID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 2: Get multigroup for newly created site by Id.
        JOB_Api_Call("Location - Get multigroup for newly created site by ID", "GET", 
                BaseAPI + "/location/multigroup/" + AppID + "/user/" + AP3_User_ID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 3: Get multigroups by Id.
        JOB_Api_Call("Location - Get multigroups by ID", "GET", 
                BaseAPI + "/location/multigroup/" + AppID, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 4: Get drop-off location by group id.
        JOB_Api_Call("Location - Get newly created drop-off location by ID", "GET", 
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination", Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Delete drop-off location">
        // Test Scenario 1: Positive flow to delete Drop-off location under newly created group/site.
        JOB_Api_Call("Location - DELETE drop-off location under newly created group/site", "DELETE", 
                BaseAPI + "/location/group/" + New_SiteID + "/deliverydestination/" + New_DropOff_LocationID, Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>
    }

    protected void Location_APIs() {
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
                + "\"unit\":1112" + RELEASE_DATE_SECONDS + ","
                + "\"unit_id\":1112" + RELEASE_DATE_SECONDS + ","
                + "\"app_name\":\"" + app + "\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST new Busines Unit", "POST", 
                BaseAPI + "/location", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_Business_UnitID = json.getString("id");
            } catch (Exception ex) {
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
        JOB_Api_Call("Location - PATCH/Update Busines Unit under newly create group/site", "PATCH", 
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
                + "\"unit\":1112 " + RELEASE_DATE_SECONDS + ","
                + "\"unit_id\":1112 " + RELEASE_DATE_SECONDS + ","
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
        JOB_Api_Call("Location - PATCH update newly added Busines Unit", "PATCH", BaseAPI + "/location/" + New_Business_UnitID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to update new Business Unit without name
        BODY = "{"
                + "\"id\":\"" + New_Business_UnitID + "\","
                + "\"label\":{"
                + "\"en\":\"\""
                + "},"
                + "\"name\":\"\""
                + "}";
        JOB_Api_Call("Location - PATCH negative flow to update new Busines Unit without name", "PATCH", BaseAPI + "/location/" + New_Business_UnitID, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Get Business unit by ID">
        // Test Scenario 1: Positive flow to get newly added Business Unit by id
        JOB_Api_Call("Location - GET new Busines Unit details by ID", "GET", 
                BaseAPI + "/location/" + New_Business_UnitID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>
    }

    protected void Brand_APIs() {
        //<editor-fold defaultstate="collapsed" desc="POST Brand/Station under newly created Business Unit">
        // Test Scenario 1: Positive flow to Add new Brand/Station under newly created Business Unit
        BODY = "{"
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
                + "\"deliveryHours\":["
                + "],"
                + "\"hours\":["
                + "],"
                + "\"name\":\"This is test for API Station name1\","
                + "\"is\":{"
                + "\"pickup_supported\":true,"
                + "\"delivery_supported\":false,"
                + "\"web_order_enabled\":false,"
                + "\"scan_and_go_supported\":false"
                + "},"
                + "\"label\":{"
                + "\"en\":\"This is test for API Station name\""
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"location\":\"" + New_Business_UnitID + "\","
                + "\"location_description\":\"This is station description\","
                + "\"payment_provider\":null,"
                + "\"pos\":null,"
                + "\"style\":{"
                + "\"logo\":\"\""
                + "},"
                + "\"terminals\":["
                + "],"
                + "\"timezone\":\"America/Toronto\","
                + "\"timeslots\":{"
                + "\"time\":\"00:10:00\","
                + "\"customers_per_slot\":12,"
                + "\"menu_items_per_slot\":null,"
                + "\"delivery_time\":\"00:01:00\","
                + "\"delivery_customers_per_slot\":1,"
                + "\"delivery_menu_items_per_slot\":1,"
                + "\"delivery_prep_time\":null,"
                + "\"averagePrepTime\":\"00:11:00\","
                + "\"delivery_user_defined\":["
                + "]"
                + "},"
                + "\"company\":\"" + CompanyID + "\","
                + "\"meta\":{"
                + "\"type_of_kds\":{"
                + "\"cdl\":false,"
                + "\"nextep\":false,"
                + "\"volante\":false,"
                + "\"agilysys\":false"
                + "},"
                + "\"has_kds\":false,"
                + "\"max_showcase_items\":null,"
                + "\"jde_category\":\"\""
                + "},"
                + "\"sector\":\"" + SectorID + "\""
                + "}";
        JOB_Api_Call("Location - POST Positive flow to Add new Brand/Station under newly created Business Unit", "POST", 
                BaseAPI + "/location/brand", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_BrandID = json.getString("id");
            } catch (Exception ex) {
            }
        }
        // Test Scenario 2: Positive flow to Add public config to new Brand/Station
        BODY = "{"
                + "\"brand_location_description\":\"This is station description\","
                + "\"canadian_calorie_disclaimer\":\"2,000 calories a day is used for general nutrition advice, but calorie needs vary\","
                + "\"display_calories\":false,"
                + "\"has_kds\":false,"
                + "\"get_phone_number\":false,"
                + "\"pickup_asap\":{"
                + "\"enabled\":false,"
                + "\"max\":null"
                + "},"
                + "\"show_instructions\":false,"
                + "\"show_single_timeslot\":false,"
                + "\"runner_app_enabled\":false"
                + "}";
        JOB_Api_Call("Location - POST Positive flow to Add public config to new Brand/Station", "POST", 
                BaseAPI + "/config/public/" + New_BrandID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive flow to Add config/Payment_ID to new Brand/Station
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"APE3Ev9vQkfo2mmOpKP7fGJ48NKAPOugo0gdlWJqS3O\","
                + "\"exact_gateway_id\":\"12\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"12\""
                + "},"
                + "\"refund\":false"
                + "},"
                + "\"tax_rate\":0.1,"
                + "\"delivery_fee\":{"
                + "\"type\":\"dollar\","
                + "\"value\":1"
                + "},"
                + "\"service_fee\":{"
                + "\"type\":\"dollar\","
                + "\"value\":1"
                + "},"
                + "\"loyalty\":{"
                + "\"loyalty_emails\":["
                + "],"
                + "\"enabled\":false"
                + "},"
                + "\"excluded_payment_methods\":{"
                + "\"mealplan\":["
                + "],"
                + "\"credit_card\":false,"
                + "\"digital_wallet_pay\":["
                + "],"
                + "\"meal_swipes\":["
                + "]"
                + "}"
                + "}";
        JOB_Api_Call("Location - POST Positive flow to Add public Config/Payment_ID to new Brand/Station", "POST", 
                BaseAPI + "/config/" + New_BrandID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 4: Negative flow to Add new Brand/Station without Brand/Station name
        BODY = "{"
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
                + "\"deliveryHours\":["
                + "],"
                + "\"hours\":["
                + "],"
                + "\"name\":\"\","
                + "\"is\":{"
                + "\"pickup_supported\":true,"
                + "\"delivery_supported\":false,"
                + "\"web_order_enabled\":false,"
                + "\"scan_and_go_supported\":false"
                + "},"
                + "\"label\":{"
                + "\"en\":\"\""
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"location\":\"" + New_Business_UnitID + "\","
                + "\"location_description\":\"This is station description\","
                + "\"payment_provider\":null,"
                + "\"pos\":null,"
                + "\"style\":{"
                + "\"logo\":\"\""
                + "},"
                + "\"terminals\":["
                + "],"
                + "\"timezone\":\"America/Toronto\","
                + "\"timeslots\":{"
                + "\"time\":\"00:10:00\","
                + "\"customers_per_slot\":12,"
                + "\"menu_items_per_slot\":null,"
                + "\"delivery_time\":\"00:01:00\","
                + "\"delivery_customers_per_slot\":1,"
                + "\"delivery_menu_items_per_slot\":1,"
                + "\"delivery_prep_time\":null,"
                + "\"averagePrepTime\":\"00:11:00\","
                + "\"delivery_user_defined\":["
                + "]"
                + "},"
                + "\"company\":\"" + CompanyID + "\","
                + "\"meta\":{"
                + "\"type_of_kds\":{"
                + "\"cdl\":false,"
                + "\"nextep\":false,"
                + "\"volante\":false,"
                + "\"agilysys\":false"
                + "},"
                + "\"has_kds\":false,"
                + "\"max_showcase_items\":null,"
                + "\"jde_category\":\"\""
                + "},"
                + "\"sector\":\"" + SectorID + "\""
                + "}";
        JOB_Api_Call("Location - POST Negative flow to Add new Brand/Station without Brand/Station name", "POST", 
                BaseAPI + "/location/brand", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 5: Negative flow to Add new Brand/Station without Company ID
        BODY = "{"
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
                + "\"deliveryHours\":["
                + "],"
                + "\"hours\":["
                + "],"
                + "\"name\":\"This is test for API Station name\","
                + "\"is\":{"
                + "\"pickup_supported\":true,"
                + "\"delivery_supported\":false,"
                + "\"web_order_enabled\":false,"
                + "\"scan_and_go_supported\":false"
                + "},"
                + "\"label\":{"
                + "\"en\":\"This is test for API Station name\""
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"location\":\"" + New_Business_UnitID + "\","
                + "\"location_description\":\"This is station description\","
                + "\"payment_provider\":null,"
                + "\"pos\":null,"
                + "\"style\":{"
                + "\"logo\":\"\""
                + "},"
                + "\"terminals\":["
                + "],"
                + "\"timezone\":\"America/Toronto\","
                + "\"timeslots\":{"
                + "\"time\":\"00:10:00\","
                + "\"customers_per_slot\":12,"
                + "\"menu_items_per_slot\":null,"
                + "\"delivery_time\":\"00:01:00\","
                + "\"delivery_customers_per_slot\":1,"
                + "\"delivery_menu_items_per_slot\":1,"
                + "\"delivery_prep_time\":null,"
                + "\"averagePrepTime\":\"00:11:00\","
                + "\"delivery_user_defined\":["
                + "]"
                + "},"
                + "\"company\":\"\","
                + "\"meta\":{"
                + "\"type_of_kds\":{"
                + "\"cdl\":false,"
                + "\"nextep\":false,"
                + "\"volante\":false,"
                + "\"agilysys\":false"
                + "},"
                + "\"has_kds\":false,"
                + "\"max_showcase_items\":null,"
                + "\"jde_category\":\"\""
                + "},"
                + "\"sector\":\"" + SectorID + "\""
                + "}";
        JOB_Api_Call("Location - POST Negative flow to Add new Brand/Station without Company Id", "POST", 
                BaseAPI + "/location/brand", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT > Update newly created Brand/Station">
        // Test Scenario 1: Positive flow to update newly added Brand/Station
        BODY = "{"
                + "\"address\":{"
                + "\"state\":\"ON\","
                + "\"zip\":\"V9V 2C4\","
                + "\"country\":\"CA\","
                + "\"address\":\"8 Pamela Ct\","
                + "\"city\":\"Vancouver\","
                + "\"coordinates\":{"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087"
                + "}"
                + "},"
                + "\"deliveryHours\":["
                + "],"
                + "\"hours\":["
                + "],"
                + "\"name\":\"This is API test to update Station name\","
                + "\"is\":{"
                + "\"pickup_supported\":true,"
                + "\"delivery_supported\":true,"
                + "\"web_order_enabled\":true,"
                + "\"scan_and_go_supported\":false"
                + "},"
                + "\"label\":{"
                + "\"en\":\"This is API test to update Station name\""
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"location\":\"" + New_Business_UnitID + "\","
                + "\"location_description\":\"This is Update for station description\","
                + "\"payment_provider\":null,"
                + "\"pos\":null,"
                + "\"style\":{"
                + "\"logo\":\"\""
                + "},"
                + "\"terminals\":["
                + "],"
                + "\"timezone\":\"America/Toronto\","
                + "\"timeslots\":{"
                + "\"time\":\"00:10:00\","
                + "\"customers_per_slot\":12,"
                + "\"menu_items_per_slot\":null,"
                + "\"delivery_time\":\"00:01:00\","
                + "\"delivery_customers_per_slot\":1,"
                + "\"delivery_menu_items_per_slot\":1,"
                + "\"delivery_prep_time\":null,"
                + "\"averagePrepTime\":\"00:11:00\","
                + "\"delivery_user_defined\":["
                + "]"
                + "},"
                + "\"company\":\"" + CompanyID + "\","
                + "\"meta\":{"
                + "\"type_of_kds\":{"
                + "\"cdl\":false,"
                + "\"nextep\":false,"
                + "\"volante\":false,"
                + "\"agilysys\":false"
                + "},"
                + "\"has_kds\":false,"
                + "\"max_showcase_items\":null,"
                + "\"jde_category\":\"\""
                + "},"
                + "\"sector\":\"" + SectorID + "\""
                + "}";
        JOB_Api_Call("Location - PATCH Positive flow to update newly added Brand/Station", "PATCH", 
                BaseAPI + "/location/brand/" + New_BrandID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to update new Brand/Station without Brand/Station name
        BODY = "{"
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
                + "\"deliveryHours\":["
                + "],"
                + "\"hours\":["
                + "],"
                + "\"name\":\"\","
                + "\"is\":{"
                + "\"pickup_supported\":true,"
                + "\"delivery_supported\":false,"
                + "\"web_order_enabled\":false,"
                + "\"scan_and_go_supported\":false"
                + "},"
                + "\"label\":{"
                + "\"en\":\"\""
                + "},"
                + "\"latitude\":43.7435015,"
                + "\"longitude\":-79.5924087,"
                + "\"location\":\"" + New_Business_UnitID + "\","
                + "\"location_description\":\"This is station description\","
                + "\"payment_provider\":null,"
                + "\"pos\":null,"
                + "\"style\":{"
                + "\"logo\":\"\""
                + "},"
                + "\"terminals\":["
                + "],"
                + "\"timezone\":\"America/Toronto\","
                + "\"timeslots\":{"
                + "\"time\":\"00:10:00\","
                + "\"customers_per_slot\":12,"
                + "\"menu_items_per_slot\":null,"
                + "\"delivery_time\":\"00:01:00\","
                + "\"delivery_customers_per_slot\":1,"
                + "\"delivery_menu_items_per_slot\":1,"
                + "\"delivery_prep_time\":null,"
                + "\"averagePrepTime\":\"00:11:00\","
                + "\"delivery_user_defined\":["
                + "]"
                + "},"
                + "\"company\":\"" + CompanyID + "\","
                + "\"meta\":{"
                + "\"type_of_kds\":{"
                + "\"cdl\":false,"
                + "\"nextep\":false,"
                + "\"volante\":false,"
                + "\"agilysys\":false"
                + "},"
                + "\"has_kds\":false,"
                + "\"max_showcase_items\":null,"
                + "\"jde_category\":\"\""
                + "},"
                + "\"sector\":\"" + SectorID + "\""
                + "}";
        JOB_Api_Call("Location - PATCH Negative flow to update Brand/Station without name", "PATCH", 
                BaseAPI + "/location/brand/" + New_BrandID, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Get Brand/Station by ID">
        // Test Scenario 1: Positive flow to get newly added Brand/Station bt ID
        JOB_Api_Call("Location - GET Brand/Station details by ID", "GET", 
                BaseAPI + "/location/brand/" + New_BrandID, Auth, "", 200, ParentTest, "no_jira");

        //</editor-fold>
    }

    protected void Sector_APIs() {
        //<editor-fold defaultstate="collapsed" desc="POST  New Sector/Group">
        // Test Scenario 1: Positive flow to post new Sector/group
        BODY = "{"
                + "\"name\":\"This is API Test for Group" + RELEASE_DATE_SECONDS + "/CA\""
                + "}";
        JOB_Api_Call("Location - POST New Sector/Group", "POST", 
                BaseAPI + "/location/sector", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_SecotorID = json.getString("id");
            } catch (Exception ex) {
            }
        }
        // Test Scenario 2: Negative flow to post new Sector/group without Name
        BODY = "{"
                + "\"name\":\"\""
                + "}";
        JOB_Api_Call("Location - POST negative flow to create Sector/Group without Name", "POST", 
                BaseAPI + "/location/sector", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT/Update  Newly created Sector/Group">
        // Test Scenario 1: Positive flow to Update/Patch Newly created Sector/Group
        BODY = "{"
                + "\"id\":\"" + New_SecotorID + "\","
                + "\"name\":\"This is API Test for Group" + RELEASE_DATE_SECONDS + "/CA\","
                + "\"country\":\"CA\""
                + "}";
        JOB_Api_Call("Location - PATCH update Sector/Group", "PATCH", 
                BaseAPI + "/location/sector/" + New_SecotorID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to Update/Patch Newly created Sector/Group without name
        BODY = "{"
                + "\"id\":\"" + New_SecotorID + "\","
                + "\"name\":\"\","
                + "\"country\":\"CA\""
                + "}";
        JOB_Api_Call("Location - PATCH negative flow to update Sector/Group without name", "PATCH", 
                BaseAPI + "/location/sector/" + New_SecotorID, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="GET Newly created Sector/Group by ID">
        // Test Scenario 1: Positive flow to Get Newly created Sector/Group by ID
        JOB_Api_Call("Location - Get newly created Sector/Group by Id", "GET", 
                BaseAPI + "/location/sector/" + New_SecotorID, Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>
    }

    protected void Company_APIs() {
        //<editor-fold defaultstate="collapsed" desc="POST  New Company/Global Menu">
        // Test Scenario 1: Positive flow to post new Company/Global Menu
        BODY = "{"
                + "\"sector\":\"" + New_SecotorID + "\","
                + "\"name\":\"This is API test for Add New Global Menu Brand" + RELEASE_DATE_SECONDS + "\","
                + "\"is\":{"
                + "\"global_images_enabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"jde_category\":\"D72zJqPJQ5h9DQzqk3w6TgEpeK6kjvs3AZRJjkQYt3QLEzN\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST New Company/Global Menu", "POST", 
                BaseAPI + "/location/company", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_CompanyID = json.getString("id");
            } catch (Exception ex) {
            }
        }
        // Test Scenario 2: Negative flow to post new Company/Global Menu without valid sector ID
        BODY = "{"
                + "\"sector\":\"\","
                + "\"name\":\"This is API test for Add New Global Menu Brand without sector Id\","
                + "\"is\":{"
                + "\"global_images_enabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"jde_category\":\"D72zJqPJQ5h9DQzqk3w6TgEpeK6kjvs3AZRJjkQYt3QLEzN\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST negative flow to add Company/Global Menu without Sector ID", "POST", 
                BaseAPI + "/location/company", Auth, BODY, 400, ParentTest, "no_jira");
        // Test Scenario 3: Negative flow to post new Company/Global Menu with empty name
        BODY = "{"
                + "\"sector\":\"" + New_SecotorID + "\","
                + "\"name\":\"\","
                + "\"is\":{"
                + "\"global_images_enabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"jde_category\":\"D72zJqPJQ5h9DQzqk3w6TgEpeK6kjvs3AZRJjkQYt3QLEzN\""
                + "}"
                + "}";
        JOB_Api_Call("Location - POST negative flow to add Company/Global Menu with empty name", "POST", 
                BaseAPI + "/location/company", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT/Update  Newly created Company/Global Menu">
        // Test Scenario 1: Positive flow to Update/Patch Newly created Company/Global Menu
        BODY = "{"
                + "\"sector\":\"" + New_SecotorID + "\","
                + "\"name\":\"This is API test for update New Global Menu Brand\","
                + "\"is\":{"
                + "\"global_images_enabled\":true"
                + "},"
                + "\"meta\":{"
                + "\"jde_category\":\"zjYX7Pd7p0UjpDQNvq53FReEQA4awKsQEAG3d8D7Ty88dyJZaqIDJW7JvrOPuPrwGWDNye\""
                + "}"
                + "}";
        JOB_Api_Call("Location - PATCH update newly added Company/Global Menu", "PATCH", 
                BaseAPI + "/location/company/" + New_CompanyID, Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 2: Negative flow to PATCH update Company/Global Menu with empty name
        BODY = "{"
                + "\"sector\":\"" + New_SecotorID + "\","
                + "\"name\":\"\","
                + "\"is\":{"
                + "\"global_images_enabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"jde_category\":\"D72zJqPJQ5h9DQzqk3w6TgEpeK6kjvs3AZRJjkQYt3QLEzN\""
                + "}"
                + "}";
        JOB_Api_Call("Location - PATCH negative flow to update Company/Global Menu with empty name", "PATCH", 
                BaseAPI + "/location/company/" + New_CompanyID, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="GET  Newly created Company/Global Menu">
        // Test Scenario 1: Positive flow to Get Newly created Company/Global Menu by ID
        JOB_Api_Call("Location - Get newly created Sector/Group by Id", "GET", 
                BaseAPI + "/location/company/" + New_CompanyID, Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>
    }
}
