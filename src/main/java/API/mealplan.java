package API;

import org.json.JSONArray;
import org.json.JSONObject;

class mealplan extends API_GUI{
    protected mealplan(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;
        ParentTest = a.ParentTest;
        MEALPLAN_ID = a.MEALPLAN_ID;
        MEALPLAN_TENDER = a.MEALPLAN_TENDER;
    }
    protected void run() {
                       
        JOB_Api_Call("Public Config > /'SiteID'", "GET",
                BaseAPI + "/config/public/" + SiteID, "", "", 200, ParentTest, "no_jira");
        
        if (json != null) {           
            try {
              if (json.has("mealplan")) {
                   JSONArray mealplan = json.getJSONArray("mealplan");
                    for (int i = 0; i < mealplan.length(); i++) {
                        JSONObject mp = mealplan.getJSONObject(i);                        
                        MEALPLAN_ID = mp.getString("id");                          
                    }
                        JSONObject td = mealplan.getJSONObject(mealplan.length()-1);
                        if (td.has("tenders")) {
                          JSONArray tenders = td.getJSONArray("tenders"); 
                          for (int i = 0; i < tenders.length(); i++) {
                           JSONObject tender = tenders.getJSONObject(i);                        
                            MEALPLAN_TENDER = tender.getString("tender_number");                         
                    }
                        }
                    }
            }
            catch (Exception ex) {
            }
        }
        //<editor-fold defaultstate="collapsed" desc=" Get the meal plan that belongs a site "> 

        Auth = "Bearer " + Mobile_User_TKN;
        
//GET/mealplan/{id} : Check the user's meal plan tenders and get the authentication configuration
        JOB_Api_Call(" Meal Plans - GET Meal plan by /'MEALPLAN_ID'", "GET", 
            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, "", 200, ParentTest, "no_jira");


//</editor-fold>  

//POST/mealplan/{id} : Authenticate against the meal plan provider

//PUT/mealplan/{id} : Save a token for access to the meal plan

//DELETE/mealplan/{id} : Delete a mealplan or a tender from the user's account
        JOB_Api_Call(" Meal Plans - DELETE Meal plan by /'MEALPLAN_ID'", "DELETE", 
            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, "", 200, ParentTest, "no_jira");

//POST/mealplan/{id}/callback : Callback endpoint for meal plans that make a call back from a webview workflow

//GET/mealplan/{id}/tender/{tender_ID} : Check the user's tender balance

//DELETE/mealplan/{id}/tender/{tender_ID} : Debit an amount from the tender balance

//PATCH/mealplan/{id}/tender/{tender_ID} : Refund an amount to the tender balance

//POST/mealplan/{id}/verify : Send verification email to user linking a mealplan

//PUT/mealplan/{id}/verify : Verify email address using provided payload

//POST/mealplan/{id}/authorize : Authorize transaction
    }
}
