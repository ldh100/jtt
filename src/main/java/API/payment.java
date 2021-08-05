package API;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

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
        
        Site_PProvider = a.Site_PProvider;

        freedompay_terminal_id = a.freedompay_terminal_id;
        freedompay_store_id = a.freedompay_store_id;                  
        freedompay_id = a.freedompay_id; 
        exact_gateway_password = a.exact_gateway_password;
        exact_gateway_id = a.exact_gateway_id;
        exact_id = a.exact_id;   
    }
    protected void run() { 
        
        List<String> Payment_Methods_IDS = new ArrayList<>();
        Auth = "Bearer " + Mobile_User_TKN;
        
        JOB_Api_Call("Mobile User Payment Method(s)", "GET", 
            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try {
                if (json.has("payment_methods")) {
                    JSONArray payment_methods = json.getJSONArray("payment_methods");
                    for (int i = 0; i < payment_methods.length(); i++) {
                        JSONObject p = payment_methods.getJSONObject(i);
                        Payment_Methods_IDS.add(p.getString("token"));
                    }
                    Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
                    Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
                    Card_Method_TKN = payment_methods.getJSONObject(0).getString("token");
                }
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        } 
        
        BODY = "{\"user\":\"" + Mobile_User_ID + "\"}";
        for(int i = 0; i < Payment_Methods_IDS.size(); i++){
            JOB_Api_Call("Mobile User Delete Payment Method " + (i+1), "DELETE", 
                BaseAPI + "/payment/" + exact_id + "/method/" + Payment_Methods_IDS.get(i), Auth, BODY, 200, ParentTest, "no_jira");
        }

 
//        if(Site_PProvider.equals("exact")){
            EXACT();
//        }else{
            FP();
//        }
   }
    
   private void EXACT(){
        JSONObject requestParams = new JSONObject();
        requestParams.put("cardholder_name", Card_Name);
        requestParams.put("cc_expiry", "1224");
        requestParams.put("cc_number", "4111111111111111");
        requestParams.put("cc_verification_str2", "123");
        requestParams.put("postal_code", "L3L3C4");        
        JSONObject options = new JSONObject();
        options.put("exact_gateway_id", exact_gateway_id);
        options.put("exact_gateway_password", exact_gateway_password);
        requestParams.put("options", options);
        BODY = requestParams.toString();

        JOB_Api_Call("New Card - Generate Mobile User Payment Token (exact)", "POST", 
            BaseAPI + "/payment/" + exact_id + "/paymenttoken", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("token")){
            try {
                EXACT_Payment_TKN = json.getString("token");
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        } 
   }
    
   private void FP(){
        String FP_Access_TKN = "";
        JOB_Api_Call("Get Mobile User Freedompay Client Token", "GET", 
            BaseAPI + "/payment/" + freedompay_id + "/clienttoken", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("token")){
            try {
                FP_Access_TKN = json.getString("token");
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }      
        
        JSONObject requestParams = new JSONObject();
        requestParams.put("cardholder_name", Card_Name);
        requestParams.put("cc_expiry", "1224");
        requestParams.put("cc_number", "4111111111111111");
        requestParams.put("cc_verification_str2", "123");
        requestParams.put("postal_code", "L3L3C4");        
//        JSONObject options = new JSONObject();
//        options.put("exact_gateway_id", exact_gateway_id);
//        options.put("exact_gateway_password", exact_gateway_password);
//        requestParams.put("options", options);
        BODY = requestParams.toString();

        JOB_Api_Call("New Card - Generate Mobile User Payment Token (freedompay)", "POST", 
            BaseAPI + "/payment/" + freedompay_id + "/paymenttoken", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("token")){
            try {
                FP_Payment_TKN = json.getString("token");
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        } 
   }
}
