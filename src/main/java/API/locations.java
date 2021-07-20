package API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class locations extends API_GUI{
    protected locations(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SITE = a.SITE;
        BRAND = a.BRAND;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
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
        if(json != null){
            try{
                JSONArray Groups = json.getJSONArray("groups");
                for (int i = 0; i < Groups.length(); i++) {
                    JSONObject group = Groups.getJSONObject(i);
                    if(group.has("name") && group.getString("name").equals(SITE)){
                        SiteID = group.getString("id");
                        break;
                    } 
                } 
            } catch (Exception ex){
                //
            }
        } 

        Auth = "";                      // =============== AP3 Site Brands ===========================
        JOB_Api_Call("Location > /group/'SiteID'", "GET", 
            BaseAPI + "/location/group/" + SiteID + "?nocache=true&extended=true", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
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
            } catch (Exception ex){
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
        if(json != null){
            MENU_IDS = new ArrayList<>();
            try {
                JSONArray MENUS = json.getJSONArray("menus");
                for (int i = 0; i < MENUS.length(); i++) {
                    JSONObject menu = MENUS.getJSONObject(i);
                    MENU_IDS.add(menu.getString("id"));
                } 
                if(json.has("sector")){           
                    SectorID = json.getString("sector");
                }
                if(json.has("company")){
                    CompanyID = json.getString("company");
                }
            } catch (Exception ex){
                //
            }
        }
        Auth = "Bearer " + AP3_User_TKN;  // ===============    AP3 Sector ===========================
        JOB_Api_Call("Location/Sector > /'SectorID'", "GET", 
            BaseAPI + "/location/sector/" + SectorID + "?extended=true&nocache=1", Auth, "", 200, ParentTest, "no_jira");
 
    }
}
