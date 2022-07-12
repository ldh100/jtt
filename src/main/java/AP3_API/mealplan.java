package AP3_API;

import org.json.JSONArray;
import org.json.JSONObject;

class mealplan extends AP3_API_GUI{
    protected mealplan(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;
        FCM_TKN = a.FCM_TKN;
        
        MEALPLAN_ID = a.MEALPLAN_ID;
        MEALPLAN_TENDER = a.MEALPLAN_TENDER;   
        
        ParentTest = a.ParentTest;
    }
    JSONObject requestParams = null;
    String AAA = "";
    protected void run() {
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Get MealPlan by ID", "GET", 
            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            AAA = json.toString(4);
        }
        
        
//        // For TRANSACT
//        BODY = "{\"password\":\"123\",\"username\":\"cdl.test.xtt@gmail.com\"}";  
//        JOB_Api_Call("MealPlan > Verify Account", "POST", 
//            BaseAPI + "/mealplan/" + MEALPLAN_ID, Auth, BODY, 404, ParentTest, "no_jira");
//        if (json != null) {
//            AAA = json.toString(4);
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
//        JSONObject email = new JSONObject();
//        email.put("email", Mobile_User_ID);
//        BODY = requestParams.toString();
//        JOB_Api_Call("MealPlan Verify email", "PUT", 
//            BaseAPI + "/mealplan/" + MEALPLAN_ID + "/verify", "", BODY, 200, ParentTest, "no_jira");
//        if (json != null) {
//            AAA = json.toString(4);
//        }

       // k4k9gd1BJ1Fv7qR5Nm31fzP06M8vzdIGWO8kz9kmHywllA2RgmCJpBk4Ea9AIlv9BvB37kHaM686aQANseDLlgNLrmCmoMroAKvYuN40vQgMYrUgNqJrYLkpuRmWeqZwGZfmLLq74q5NtJawML74BoFeX1pNNa8LSvKYzM

        //POST/mealplan/{id}/authorize : Authorize transaction
    }
}
