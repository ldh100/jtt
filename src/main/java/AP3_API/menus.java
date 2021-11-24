package AP3_API;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class menus extends AP3_API_GUI{
    protected menus(AP3_API_GUI a) {
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
    private String New_GlobalMod_ID = "";
    private List<String> GlobalModGroup_Items_IDS = new ArrayList<>(); 
    private List<String> GL_MENU_IDS = new ArrayList<>(); 
    
    String AAA = "";
    protected void run() {             
        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
        
//        if(json != null){
//            try {
                    // GL_MENU_ID <<<<  parent_id ???
//                } 
//            } catch (Exception ex) {
//                AAA = ex.getMessage();
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
                AAA = ex.getMessage();
            }
        }
        

        JOB_Api_Call("Brand Last Local Menu " + " > /menu/'MenuID'", "GET", 
            BaseAPI + "/menu/" + MENU_IDS.get(MENU_IDS.size() - 1), Auth, "", 200, ParentTest, "no_jira");  
        if(json != null){
            CATEGORIES_IDS = new ArrayList<>();
            ITEMS_IDS = new ArrayList<>();
            JSONArray groups = null;
            try {
                if (json.has("groups")) {
                    groups = json.getJSONArray("groups");
                    for (int i = 0; i < groups.length(); i++) {
                        CATEGORIES_IDS.add(groups.getJSONObject(i).getString("id"));
                    }
                }
                //JSONObject g = groups.getJSONObject(groups.length() - 1);
                JSONObject g = groups.getJSONObject(0);                
                if (g.has("items")) {
                    JSONArray items = g.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        ITEMS_IDS.add(items.getJSONObject(i).getString("id"));
                    }                    
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }         
        }
        
        String menu_id = "";
        GL_MENU_IDS = new ArrayList<>();       
        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {  
            AAA = json.toString(4);
            try {
                if (json.has("menus")) {
                    JSONArray menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                        JSONObject menu = menus.getJSONObject(i);
                        GL_MENU_IDS.add(menu.getString("id"));
                        menu_id = menu.getString("id");    // "parent_id"  
                        //parent_id= (menu.getString("parent_id"));  // "parent_id"  
                    }
                } 
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
    //</editor-fold>      
        
    //<editor-fold defaultstate="collapsed" desc=" PATCH Menu Lock/Unlock Editing">
        // Test Scenario 1: Positive flow for Edit Menu
        BODY = "{"
                + "\"id\":\"" + menu_id + "\","            
                + "\"meta\":{\"locked_by_user\":\"" + AP3_User_ID + "\""
                + "}"
                + "}";
        JOB_Api_Call("Global Menu - Lock Editing", "PATCH", 
                BaseAPI + "/menu/" + menu_id, Auth, BODY, 200, ParentTest, "no_jira");    // + "?_query=%7Bid,date,meta%7D"
        if (json != null) {  
            AAA = json.toString(4);
        }   
        // Test Scenario 2: Positive flow to check when not clicked on Edit in AP3 if the user value is null : Done
        BODY = "{"
                + "\"id\":\"" + menu_id + "\","
                + "\"meta\":{\"locked_by_user\":null}"
                + "}";
        JOB_Api_Call("Menu - Global Menu - UnLock Editing", "PATCH", 
                BaseAPI + "/menu/" + menu_id, Auth, BODY, 200, ParentTest, "no_jira"); // + "?_query=%7Bid,date,meta%7D"
        if (json != null) {  
            AAA = json.toString(4);       
        }           
    //</editor-fold>        
        
    //<editor-fold defaultstate="collapsed" desc=" Get Menus the belong to a Company "> 
    // To Do - some editing 'menu_id'
    // " Company " 
    //GET/menu/company{companyid} : Get menus that belong to a company

    //        String parent_id="";       
    //        GL_MENU_IDS = new ArrayList<>();       
    //        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Company/Global menus ===================
    //        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
    //            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
    //        if (json != null) {           
    //            try {
    //              if (json.has("menus")) {
    //                   JSONArray menus = json.getJSONArray("menus");
    //                    for (int i = 0; i < menus.length(); i++) {
    //                        JSONObject g = menus.getJSONObject(i);                        
    //                        GL_MENU_IDS.add(g.getString("id"));
    //                        parent_id= (g.getString("parent_id"));
    //                    }
    //                } 
    //            }
    //            catch (Exception ex) {
    //            }
    //        }        

    //</editor-fold>       

    //<editor-fold defaultstate="collapsed" desc="Individual Menu "> 
    // GET/menu/{id} : Get an Individual Menu
    // Test Scenario 1: Positive flow to get a new individual Menu by ID

    JOB_Api_Call(" Menu - GET individual Global Menu by /'MenuID'", "GET", 
        BaseAPI + "/menu/" + GL_MENU_IDS.get(GL_MENU_IDS.size() - 1), Auth, "", 200, ParentTest, "no_jira");
    if (json != null) { 
//        JSONArray groups = null;
//        CATEGORIES_IDS = new ArrayList<>();
//        try {
//            if (json.has("groups")) {
//                groups = json.getJSONArray("groups");
//                for (int i = 0; i < groups.length(); i++) {
//                    CATEGORIES_IDS.add(groups.getJSONObject(i).getString("id"));
//                }
//            }
//        }
//        catch (Exception ex) {
//            AAA = ex.getMessage();
//        }
    } 
    
    // https://api.compassdigital.org/v1/menu/a2LAdjyg3BFADGjjLqGXTo0vyKRql5FrZdRGL1OqtKo7PNDPOEsQkYvwwZ5OtkoqQP0/export
    JOB_Api_Call(" Menu - Export Global Menu Set", "GET", 
        BaseAPI + "/menu/" + GL_MENU_IDS.get(GL_MENU_IDS.size() - 1) + "/export", Auth, "", 200, ParentTest, "no_jira");
    if (json != null) { 
        try {
            AAA = json.toString(4);
        }
        catch (Exception ex) {
            AAA = ex.getMessage();
        }
    }    
        
    // Test Scenario 2: Negative flow to get a new individual Menu without I
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
            BaseAPI + "/menu/", Auth, BODY, 200, ParentTest, "no_jira");
            if (json != null) {
            try {
                New_Menu_ID = json.getString("id");
            } catch (Exception ex) {
                //
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
            BaseAPI + "/menu/" + New_Menu_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to Update/Patch a menu with new Name
        // Covered in Scenario 1
        
        //GET/menu/{id}/export: Export a menu set to a zip file
        // Test Scenario 1: Positive flow to export a menu file 
        JOB_Api_Call(" Menu - Modify the new individual Menu", "GET", 
            BaseAPI + "/menu/" + New_Menu_ID + "/export", Auth, "", 200, ParentTest, "no_jira");
        
        //PATCH/menu/{id} : Update a menu
        // Test Scenario 1: Positive flow to check when clicked on Edit in AP3 if the user is locked to edit : Done
        // Test Scenario 2: Positive flow to check when not clicked on Edit in AP3 if the user value is null : Done       
        

        //DELETE/menu/{id} : Delete a menu
        // Test Scenario 1: Negative flow to delete a Menu without MenuID
        JOB_Api_Call(" Menu - Negative flow to delete a Menu without MenuID", "DELETE", 
            BaseAPI + "/menu/" , Auth, "" , 400, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to delete a Menu
        JOB_Api_Call(" Menu - Create a new individual Menu", "DELETE", 
            BaseAPI + "/menu/" + New_Menu_ID, Auth, "", 200, ParentTest, "no_jira");

    //</editor-fold>        
      

    //<editor-fold defaultstate="collapsed" desc=" Menu item  (*Does not work*) "> 

    //POST//menu/item : Post/Create a new menu item : 

        // Test Scenario 1: Positive flow to create a new Menu item with Name 

        // Test Scenario 2: Negative flow to create a new Menu item without Name  

    //GET/menu/item/{id} : Get an menu item  (*Does not work*)
            // Test Scenario 1: Positive flow to get a new individual Menu item by ID
            // Test Scenario 2: Negative flow to get a new individual Menu item without ID

    //GET/menu/items : Search for menu items  (*Does not work*)
            // Test Scenario 1: Positive flow to get all the Menu items




    //PATCH/menu/item/{id} : Update a menu item
            // Test Scenario 1: Positive flow to update a Menu item with Name
            // Test Scenario 2: Negative flow to update a Menu item without Name   

    //DELETE/menu/item/{id} : Delete a menu item
            // Test Scenario 1: Positive flow to delete a Menu item by ID
            // Test Scenario 2: Negative flow to delete a Menu without ID

    //</editor-fold>  

    //<editor-fold defaultstate="collapsed" desc=" Modifier Group "> 
    //POST/menu/modifier/group : Create a new Menu Modifier Group   
    // Test Scenario 1: Negative flow to update a Modifier Group without Unique Name
    BODY = "{"
            + "\"label\":{"
            + "\"en\":\"\""
            + "},"
            + "\"unique_name\":\"\",\""
            + "is\":{"
            + "\"disabled\":false"
            + "},"
            + "\"meta\":{"
            + "\"taxes\":[],"
            + "\"sort_number\":null"
            + "},"
            + "\"items\":["
            + "{"
            + "\"label\":{"
            + "\"en\":\"API 1\""
            + "},"
            + "\"is\":{"
            + "\"disabled\":false"
            + "},"
            + "\"meta\":{"
            + "\"sort_number\":null,"
            + "\"taxes\":["
            + "\"Prepared\""
            + "]"
            + "},"
            + "\"price\":{"
            + "\"amount\":1.89"
            + "},"
            + "\"nutrition\":{"
            + "\"calories\":{"
            + "\"amount\":189"
            + "}"
            + "}"
            + "},"
            + "{"
            + "\"is\":{"
            + "\"disabled\":false"
            + "},"
            + "\"meta\":{"
            + "\"taxes\":["
            + "\"Prepared\""
            + "]"
            + "},"
            + "\"label\":{"
            + "\"en\":\"API 2\""
            + "},"
            + "\"price\":{"
            + "\"amount\":2.89"
            + "},"
            + "\"nutrition\":{"
            + "\"calories\":{"
            + "\"amount\":289"
            + "}"
            + "}"
            + "}"
            + "],"
            + "\"company\":\"" + CompanyID + "\""
                + "}";
        JOB_Api_Call(" Modifier Group - Positive flow to create a Global Modifier Group by Unique Name", "POST", 
            BaseAPI + "/menu/modifier/group", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 2: Positive flow to Create a Modifier Group with Name        
        BODY ="{"
                + "\"label\":{"
                + "\"en\":\"Mod API DS \""
                + "},"
                + "\"unique_name\":\"Mod API DS \",\""
                + "is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"taxes\":[],"
                + "\"sort_number\":null"
                + "},"
                + "\"items\":["
                + "{"
                + "\"label\":{"
                + "\"en\":\"API 1\""
                + "},"
                + "\"is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"sort_number\":null,"
                + "\"taxes\":["
                + "\"Prepared\""
                + "]"
                + "},"
                + "\"price\":{"
                + "\"amount\":1.89"
                + "},"
                + "\"nutrition\":{"
                + "\"calories\":{"
                + "\"amount\":189"
                + "}"
                + "}"
                + "},"
                + "{"
                + "\"is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"taxes\":["
                + "\"Prepared\""
                + "]"
                + "},"
                + "\"label\":{"
                + "\"en\":\"API 2\""
                + "},"
                + "\"price\":{"
                + "\"amount\":2.89"
                + "},"
                + "\"nutrition\":{"
                + "\"calories\":{"
                + "\"amount\":289"
                + "}"
                + "}"
                + "}"
                + "],"
                + "\"company\":\"" + CompanyID + "\""
                + "}";
        JOB_Api_Call(" Modifier Group - Negative flow to create a Global Modifier Group without Unique Name", "POST", 
            BaseAPI + "/menu/modifier/group", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                New_GlobalMod_ID = json.getString("id");
            } catch (Exception ex) {
                String AAA = ex.getMessage();
            }
        }
        
        //GET/menu/modifier/group{id} : Get a Modifier Group =========================================================
        // Test Scenario 1: Negative flow to get a Modifier Group without ID
        JOB_Api_Call(" Global Modifier Group - GET a Modifier Group by /'ModifierGroupID'", "GET", 
            BaseAPI + "/menu/modifier/group/", Auth, "", 503, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to Get a Modifier Group by ID
        JOB_Api_Call(" Global Modifier Group - GET a Modifier Group by /'ModifierGroupID'", "GET", 
            BaseAPI + "/menu/modifier/group/" + New_GlobalMod_ID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {           
            try {
              if (json.has("items")) {
                   JSONArray items = json.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject item = items.getJSONObject(i);
                        if(item.has("id")){                        
                            GlobalModGroup_Items_IDS.add(item.getString("id"));
                        }
                    }
                } 
            }
            catch (Exception ex) {
                String AAA = ex.getMessage();
            }
        }


        //PUT/menu/modifier/group{id} : Update a Modifier Group        
        // Test Scenario 1: Positive flow to update a Modifier Group by ID
        BODY="{"
                + "\"unique_name\":\"Mod API DS PUT\","
                + "\"label\":{"
                + "\"en\":\"Mod API DS PUT\""
                + "},"
                + "\"meta\":{"
                + "\"taxes\":[],"
                + "\"sort_number\":null,"
                + "\"original_label\":{"
                + "\"en\":\"Mod API DS\""
                + "}"
                + "},"
                + "\"is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"id\":\"\","
                + "\"items\":["
                + "{"
                + "\"label\":{"
                + "\"en\":\"API 2 PUT\""
                + "},"
                + "\"is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"sort_number\":null,"
                + "\"taxes\":["
                + "\"Prepared\""
                + "],"
                + "\"original_label\":{"
                + "\"en\":\"API 1\""
                + "}"
                + "},"
                + "\"price\":{"
                + "\"amount\":3.89"
                + "},"
                + "\"nutrition\":{"
                + "\"calories\":{"
                + "\"amount\":389"
                + "}"
                + "},"
                + "\"id\":\"\""
                + "},"
                + "{\"is\":{"
                + "\"disabled\":false"
                + "},"
                + "\"meta\":{"
                + "\"taxes\":["
                + "\"Prepared\""
                + "],"
                + "\"original_label\":{"
                + "\"en\":\"API 2\""
                + "}"
                + "},"
                + "\"label\":{"
                + "\"en\":\"API 2\""
                + "},"
                + "\"price\":{"
                + "\"amount\":2.89"
                + "},"
                + "\"nutrition\":{"
                + "\"calories\":{"
                + "\"amount\":289"
                + "}"
                + "},"
                + "\"id\":\"\""
                + "}"
                + "]"
                + "}";
        // Test Scenario 1: Positive flow to Create a Modifier Group with Name
        JOB_Api_Call(" Modifier Group - Positive flow to update a Global Modifier Group without Unique Name", "PUT", 
            BaseAPI + "/menu/modifier/group/" + New_GlobalMod_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
        // Test Scenario 2: Negative flow to update a Modifier Group without ID
        JOB_Api_Call(" Modifier Group - Negative flow to update a Global Modifier Group without Unique Name", "PUT", 
            BaseAPI + "/menu/modifier/group/", Auth, BODY, 400, ParentTest, "no_jira");
        
   
        
        //GET/menu/modifier/group/company{company_id} : Get a Modifier Group that belongs to company    
        // Test Scenario 1: Negative flow to get a Modifier Group of a company without ID
        JOB_Api_Call(" Modifier Group - Negative flow to get a Modifier Group of a company without /'CompanyID'", "GET", 
            BaseAPI + "/menu/modifier/group/company/", Auth, "", 400, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to get a Modifier Group of a company by ID
        JOB_Api_Call(" Modifier Group - Positive flow to get a Modifier Group of a company by/'CompanyID'", "GET", 
            BaseAPI + "/menu/modifier/group/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");
        
        //GET/menu/modifier/group/company{company_id}/export : Export company modifier groups to a zipped excel file.   
        // Test Scenario 1: Negative flow to get a Modifier Group of a company without CompanyID
        JOB_Api_Call(" Modifier Group - Negative flow to Export a Modifier Group file of a company without /'CompanyID'", "GET", 
            BaseAPI + "/menu/modifier/group/company/export" , Auth, "", 400, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to get a Modifier Group of a company by ID/export
        JOB_Api_Call(" Modifier Group - Negative flow to Export a Modifier Group file of a company without /'CompanyID'", "GET", 
            BaseAPI + "/menu/modifier/group/company/" + CompanyID + "/export", Auth, "", 200, ParentTest, "no_jira");
        
        //DELETE/menu/modifier/group{id} : Delete a Modifier Group        
        // Test Scenario 1: Negative flow to delete a Modifier Group without ID 
        JOB_Api_Call(" Modifier Group - Negative flow to delete a Modifier Group without/ 'GroupID'", "DELETE", 
            BaseAPI + "/menu/modifier/group/", Auth, "" , 400, ParentTest, "no_jira");
        
        // Test Scenario 2: Positive flow to delete a Modifier Group by ID
        JOB_Api_Call(" Modifier Group - Positive flow to delete a Modifier Group by/ 'GroupID'", "DELETE", 
            BaseAPI + "/menu/modifier/group/" + New_GlobalMod_ID, Auth, "", 200, ParentTest, "no_jira");
        
        //</editor-fold>

    }
}
