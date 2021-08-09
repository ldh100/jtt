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
        SectorID = a.SectorID;
    }
    
    private String New_Menu_ID = "";
    
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
    
//<editor-fold defaultstate="collapsed" desc=" Get Menus the belong to a Company "> 

//GET/menu/company{companyid} : Get menus that belong to a company

        //String menu_id = "";
        String parent_id="";  
        MENU_IDS = new ArrayList<>();       
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
                        MENU_IDS.add(menu.getString("id"));
                    //    menu_id = menu.getString("id");    // "parent_id"  
                        parent_id= (menu.getString("parent_id"));  // "parent_id"  
                    }
                } 
            } catch (Exception ex) {
                AAAA = ex.getMessage();
            }
        }
 //</editor-fold>      
        
//<editor-fold defaultstate="collapsed" desc=" PATCH Menu ">
// Test Scenario 1: Positive flow for Edit Menu
        
       BODY = "{"
                + "\"id\":\"" + parent_id + "\","            
                + "\"meta\":{\"locked_by_user\":\"" + AP3_User_ID + "\""
                + "}"
                + "}";
        JOB_Api_Call("Global Menu - Lock Editing", "PATCH", 
                BaseAPI + "/menu/" + parent_id, Auth, BODY, 200, ParentTest, "no_jira");    // + "?_query=%7Bid,date,meta%7D"
        if (json != null) {  
            AAAA = json.toString(4);
        }    
//</editor-fold>        
        
        
        
        // To Do - some editing 'menu_id'
        
        // " Company " 
        
//<editor-fold defaultstate="collapsed" desc=" Get Menus the belong to a Company "> 

//GET/menu/company{companyid} : Get menus that belong to a company

//        String parent_id="";       
//        MENU_IDS = new ArrayList<>();       
//        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
//        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
//            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
//        if (json != null) {           
//            try {
//              if (json.has("menus")) {
//                   JSONArray menus = json.getJSONArray("menus");
//                    for (int i = 0; i < menus.length(); i++) {
//                        JSONObject g = menus.getJSONObject(i);                        
//                        MENU_IDS.add(g.getString("id"));
//                        System.out.println(MENU_IDS.get(i));
//                        parent_id= (g.getString("parent_id"));
//                    }
//                } 
//            }
//            catch (Exception ex) {
//            }
//        }        
       
//</editor-fold>       

// "Individual Menu "   
//<editor-fold defaultstate="collapsed" desc="Individual Menu "> 

// GET/menu/{id} : Get an Individual Menu

        // Test Scenario 1: Positive flow to get a new individual Menu by ID
        CATEGORIES_IDS = new ArrayList<>();
        JOB_Api_Call(" Menu - GET individual Menu by /'MenuID'", "GET", 
            BaseAPI + "/menu/" + MENU_IDS.get(MENU_IDS.size()-1), Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {           
            try {
              if (json.has("groups")) {
                   JSONArray groups = json.getJSONArray("groups");
                    for (int i = 0; i < groups.length(); i++) {
                        JSONObject Categories = groups.getJSONObject(i);
                        if(Categories.getJSONObject("label").has("en")){                        
                        CATEGORIES_IDS.add(Categories.getString("id"));
                        System.out.println(Categories.getString("id"));
                        }
                    }
                } 
            }
            catch (Exception ex) {
            }
        }
        
        
        // Test Scenario 2: Negative flow to get a new individual Menu without ID
        
//POST/menu/{id} : Create a new Menu
        // Test Scenario 1: Positive flow to create a new individual Menu
        
        BODY ="{"
                + "\"groups\":["
                + "{\"items\":[],"
                + "\"label\":{\"en\":\"Cat DS Modify\""
                + "},"
                + "\"meta\":{"
                + "\"original_label\":{"
                + "\"en\":\"Cat DS Modify\""
                + "}"
                + "},"
                + "\"is\":"
                + "{\"disabled\":false"
                + "},"
                + "\"id\":\"\","
                + "\"name\":\"Cat DS Modify\""
                + "}"
                + "],"               
                + "\"company\":\"" + CompanyID + "\","
                + "\"sector\":\"" + SectorID + "\","
                + "\"meta\":{"
                + "\"version\":2,"
                + "\"last_modified_user\":"
                + "\"\""
                + "},"
                + "\"label\":{"
                + "\"en\":\"Test DS Modify\""
                + "},"
                + "\"id\":\"\""
                + "}";
        JOB_Api_Call(" Menu - Create a new individual Menu", "POST", 
            BaseAPI + "/menu/", Auth, BODY , 200, ParentTest, "no_jira");
            if (json != null) {
            try {
                New_Menu_ID = json.getString("id");
            }
            catch (Exception ex) {
            }
        }
            
        // Test Scenario 2: Negative flow to create a new individual Menu without Name
        
//PUT/menu/{id} : Overide a complete Menu
        // Test Scenario 1: Positive flow to Overide a complete Menu
        
        BODY ="{"
                + "\"groups\":["
                + "{\"items\":[],"
                + "\"label\":{\"en\":\"Cat DS Modified to PUT\""
                + "},"
                + "\"meta\":{"
                + "\"original_label\":{"
                + "\"en\":\"Modified to PUT\""
                + "}"
                + "},"
                + "\"is\":"
                + "{\"disabled\":false"
                + "},"
                + "\"id\":\"\","
                + "\"name\":\"Modified to PUT\""
                + "}"
                + "],"               
                + "\"company\":\"" + CompanyID + "\","
                + "\"sector\":\"" + SectorID + "\","
                + "\"meta\":{"
                + "\"version\":2,"
                + "\"last_modified_user\":"
                + "\"\""
                + "},"
                + "\"label\":{"
                + "\"en\":\"Test DS Modified to PUT\""
                + "},"
                + "\"id\":\"" + New_Menu_ID + "\""
                + "}";
        JOB_Api_Call(" Menu - Modify the new individual Menu", "PUT", 
            BaseAPI + "/menu/" + New_Menu_ID, Auth, BODY , 200, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to Update/Patch a menu with new Name
        // Covered in Scenario 1
        
//PATCH/menu/{id} : Update a menu
        // Test Scenario 1: Positive flow to check when clicked on Edit in AP3 if the user is locked to edit : Done
        // Test Scenario 2: Positive flow to check when not clicked on Edit in AP3 if the user value is null : Done       
        

//DELETE/menu/{id} : Delete a menu

        // Test Scenario 1: Negative flow to delete a Menu without Name
        JOB_Api_Call(" Menu - Create a new individual Menu", "DELETE", 
            BaseAPI + "/menu/" , Auth, "" , 400, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to delete a Menu
        //JOB_Api_Call(" Menu - Create a new individual Menu", "DELETE", 
            //BaseAPI + "/menu/" + New_Menu_ID, Auth, "" , 200, ParentTest, "no_jira");

//</editor-fold>        
       
       
// " Menu Item"   
//<editor-fold defaultstate="collapsed" desc=" Menu item "> 

//POST//menu/item : Post/Create a new menu item

        // Test Scenario 1: Positive flow to create a new Menu item with Name
        
        // Test Scenario 2: Negative flow to create a new Menu item without Name 
        
//GET/menu/item/{id} : Get an menu item
        // Test Scenario 1: Positive flow to get a new individual Menu item by ID
        // Test Scenario 2: Negative flow to get a new individual Menu item without ID

//GET/menu/items : Search for menu items
        // Test Scenario 1: Positive flow to get all the Menu items
       
        
   
        
//PATCH/menu/item/{id} : Update a menu item
        // Test Scenario 1: Positive flow to update a Menu item with Name
        // Test Scenario 2: Negative flow to update a Menu item without Name   
        
//DELETE/menu/item/{id} : Delete a menu item
        // Test Scenario 1: Positive flow to delete a Menu item by ID
        // Test Scenario 2: Negative flow to delete a Menu without ID
        
//</editor-fold>  

// " Modifier Group"   
//<editor-fold defaultstate="collapsed" desc=" Modifier Group "> 

//POST/menu/modifier/group : Create a new Menu Modifier Group
        // Test Scenario 1: Positive flow to Create a Modifier Group with Name
        // Test Scenario 2: Negative flow to update a Modifier Group without Name

//GET/menu/modifier/group{id} : Get a Modifier Group
        // Test Scenario 1: Positive flow to Get a Modifier Group by ID
        // Test Scenario 2: Negative flow to get a Modifier Group without ID

//PUT/menu/modifier/group{id} : Update a Modifier Group        
        // Test Scenario 1: Positive flow to update a Modifier Group by ID
        // Test Scenario 2: Negative flow to update a Modifier Group without ID

//DELETE/menu/modifier/group{id} : Delete a Modifier Group        
        // Test Scenario 1: Positive flow to delete a Modifier Group by ID
        // Test Scenario 2: Negative flow to delete a Modifier Group without ID    
        
//GET/menu/modifier/group/company{company_id} : Get a Modifier Group that belongs to company    
        // Test Scenario 1: Positive flow to get a Modifier Group of a company by ID
        // Test Scenario 2: Negative flow to get a Modifier Group of a company without ID
        
        
//GET/menu/modifier/group/company{company_id}/export : Export company modifier groups to a zipped excel file.   
        // Test Scenario 1: Positive flow to get a Modifier Group of a company by ID/export
        // Test Scenario 2: Negative flow to get a Modifier Group of a company without export
        
 //</editor-fold>


        
        BODY = "{"
                + "\"id\":\"" + parent_id + "\","
                + "\"meta\":{\"locked_by_user\":null}"
                + "}";
        JOB_Api_Call("Menu - Global Menu - UnLock Editing", "PATCH", 
                BaseAPI + "/menu/" + parent_id, Auth, BODY, 200, ParentTest, "no_jira"); // + "?_query=%7Bid,date,meta%7D"
        if (json != null) {  
            AAAA = json.toString(4);
        }         
                
    }//run time
}
