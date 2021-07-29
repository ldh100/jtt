package API;

import org.json.JSONArray;

class payment extends API_GUI{
    protected payment(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_TKN = a.Mobile_User_TKN;
        Mobile_User_ID = a.Mobile_User_ID;
        SiteID = a.SiteID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                                                           
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Mobile User Payment Method", "GET", 
            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try {
                if (json.has("payment_methods")) {
                    JSONArray payment_methods = json.getJSONArray("payment_methods");
                    PProvider_Type = payment_methods.getJSONObject(0).getString("type");
                    Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
                    Payment_TKN = payment_methods.getJSONObject(0).getString("token");
                }
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        } 
   }
}
