package API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class menus extends API_GUI{
    protected menus(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        CompanyID = a.CompanyID;
        MENU_IDS = a.MENU_IDS;
        ParentTest = a.ParentTest;
    }
    protected void run() {             
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                        // =============== AP3 Local Menu(s) ===========================
//        for(int i = 0; i < MENU_IDS.size(); i++){           
//            JOB_Api_Call("Brand > Timeslots > Menu " + (i+1) + " > /timeslots/menu/'Menu_ID'", "GET", 
//                BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MENU_IDS.get(i) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira" );
//
//            JOB_Api_Call("Brand Local Menu " + (i+1) + " > /menu/'Menu_ID'", "GET", 
//                BaseAPI + "/menu/" + MENU_IDS.get(i), Auth, "", 200, ParentTest, "no_jira");
//        }
//        
        JOB_Api_Call("Brand > Timeslots > 1st Menu > /timeslots/menu/'MenuID'", "GET",
            BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MENU_IDS.get(0) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira" );
        if(json != null){
            TIMESLOTS_IDS = new ArrayList<>();
            try {
                if (json.has("timeslots")) {
                    JSONArray timeslots = json.getJSONArray("timeslots");
                    for (int i = 0; i < timeslots.length(); i++) {
                        JSONObject timeslot = timeslots.getJSONObject(i);
                        TIMESLOTS_IDS.add(timeslot.getNumber("id").toString());
                    }
                } 
                TimeSlotID = TIMESLOTS_IDS.get(TIMESLOTS_IDS.size() - 1); // Get LAST available timeslot ID 
            } catch (Exception ex) {}
        }
        
        JOB_Api_Call("Brand 1st Local Menu " + " > /menu/'MenuID'", "GET", 
            BaseAPI + "/menu/" + MENU_IDS.get(0), Auth, "", 200, ParentTest, "no_jira");  
        if(json != null){
            CATEGORIES_IDS = new ArrayList<>();
            ITEMS_IDS = new ArrayList<>();
            JSONArray groups = null;
            try {
                if (json.has("groups")) {
                groups = json.getJSONArray("groups");
                    for (int i = 0; i < groups.length(); i++) {
                        JSONObject g = groups.getJSONObject(i);
                        CATEGORIES_IDS.add(g.getString("id"));
                    }
                }
                Category_ID = CATEGORIES_IDS.get(0);  
                JSONObject g = groups.getJSONObject(0);
                if (g.has("items")) {
                    JSONArray items = g.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject item = items.getJSONObject(i);
                        ITEMS_IDS.add(item.getString("id"));
                    }                    
                }
                Item_ID = ITEMS_IDS.get(0);
            } catch (Exception ex) {
                String AAAAA = ex.getMessage();
            }
        }
    }
}
