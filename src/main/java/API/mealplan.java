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
    private String AAA = "";
    protected void run() {
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Get MealPlan by ID", "GET", 
            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            AAA = json.toString(4);
        }
//        Auth = "Bearer " + Mobile_User_TKN;
//        JOB_Api_Call("Mobile User > /secret/fcm_token", "POST", 
//            BaseAPI + "/user/" + Mobile_User_ID + "/secret/fcm_token", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            try {
//                if(json.has("fcm_token")) Mobile_User_SECRET = json.getString("fcm_token");  
//            } catch (Exception ex){
//                //
//            }
//        } 

        //POST/mealplan/{id} : Authenticate against the meal plan provider

        //PUT/mealplan/{id} : Save a token for access to the meal plan

        //DELETE/mealplan/{id} : Delete a mealplan or a tender from the user's account
//        JOB_Api_Call(" Meal Plans - DELETE MealPlan by /'MEALPLAN_ID'", "DELETE", 
//            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, "", 200, ParentTest, "no_jira");

        //POST/mealplan/{id}/callback : Callback endpoint for meal plans that make a call back from a webview workflow

        //GET/mealplan/{id}/tender/{tender_ID} : Check the user's tender balance

        //DELETE/mealplan/{id}/tender/{tender_ID} : Debit an amount from the tender balance

        //PATCH/mealplan/{id}/tender/{tender_ID} : Refund an amount to the tender balance

        //POST/mealplan/{id}/verify : Send verification email to user linking a mealplan

        //PUT/mealplan/{id}/verify : Verify email address using provided payload

        //POST/mealplan/{id}/authorize : Authorize transaction
    }
}
