package API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class menus extends API_GUI{
    protected menus(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_ID = a.AP3_User_ID;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        CompanyID = a.CompanyID;
        MENU_IDS = a.MENU_IDS;
        ParentTest = a.ParentTest;        
    }
    String AAAA = "";
    protected void run() {             
        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
        
//        if(json != null){
//            try {
                    // GL_MENU_ID <<<<  parent_id ???
//                } 
//            } catch (Exception ex) {
//                AAAA = ex.getMessage();
//            }
//        }
//Request URL: https://api.compassdigital.org/dev/menu/rrgl37yB8LtgOE9rO2RvUojopzLEP5uqJ1DwNMgdsY2Qg6yl8LUKWOzLMA4eT5Wj7ZG?_query=%7Bid,date,meta%7D
//Request Method: PATCH using GL_MENU_ID <<<<  parent_id ???

        Auth = "";                        // =============== AP3 Local Menu(s) ===========================
        JOB_Api_Call("Brand > Timeslots > 1st Menu > /timeslots/menu/'MenuID'", "GET",
            BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MENU_IDS.get(MENU_IDS.size() - 1) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira" );
        MENU_TIMESLOTS = new ArrayList<>();
        if(json != null){
            try {
                if (json.has("timeslots")) {
                    JSONArray timeslots = json.getJSONArray("timeslots");
                    for (int i = 0; i < timeslots.length(); i++) {
                        JSONObject timeslot = timeslots.getJSONObject(i);
                        MENU_TIMESLOTS.add(timeslot.getNumber("id").toString());
                    }
                } 
            } catch (Exception ex) {
                AAAA = ex.getMessage();
            }
        }
        

        JOB_Api_Call("Brand Last Local Menu " + " > /menu/'MenuID'", "GET", 
            BaseAPI + "/menu/" + MENU_IDS.get(MENU_IDS.size() -1), Auth, "", 200, ParentTest, "no_jira");  
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
                JSONObject g = groups.getJSONObject(groups.length() - 1);
                if (g.has("items")) {
                    JSONArray items = g.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject item = items.getJSONObject(i);
                        ITEMS_IDS.add(item.getString("id"));
                    }                    
                }
            } catch (Exception ex) {
                AAAA = ex.getMessage();
            }         
        }
        

        // ================ New development by Dhruv ======================================
//        BODY = "{id:OwrEMjgG5zUeoXRyZRAPHZyMLJWQP3";       
//        JOB_Api_Call("Brand Last Local Menu " + " > /menu/'MenuID'", "PATCH", 
//            BaseAPI + "/menu/" + MENU_IDS.get(MENU_IDS.size() -1), Auth, "", 200, ParentTest, "no_jira"); 
        
        String menu_id = "";

        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {  
            AAAA = json.toString(4);
            try {
                if (json.has("menus")) {
                    JSONArray menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                        JSONObject menu = menus.getJSONObject(i);
                        menu_id = menu.getString("id");    // "parent_id"                  
                    }
                } 
            } catch (Exception ex) {
                AAAA = ex.getMessage();
            }
        }
       
        
         //<editor-fold defaultstate="collapsed" desc=" PATCH Menu ">
        // Test Scenario 1: Positive flow for Edit Menu
        
       BODY = "{"
                + "\"id\":\"" + menu_id + "\","            
                + "\"meta\":{\"locked_by_user\":\"" + AP3_User_ID + "\""
                + "}"
                + "}";
        JOB_Api_Call("Global Menu - Lock Editing", "PATCH", 
                BaseAPI + "/menu/" + menu_id + "_query=%7Bid,date,meta%7D", Auth, BODY, 200, ParentTest, "no_jira");    
        if (json != null) {  
            AAAA = json.toString(4);
        }    
        
        // To Do - some editing 'menu_id'
        
        BODY = "{"
                + "\"id\":\"" + menu_id + "\","
                + "\"meta\":{\"locked_by_user\":null}"
                + "}";
        JOB_Api_Call("Menu - Global Menu - UnLock Editing", "PATCH", 
                BaseAPI + "/menu/" + menu_id + "_query=%7Bid,date,meta%7D", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {  
            AAAA = json.toString(4);
        }         
         //</editor-fold>              
    }//run time
}
