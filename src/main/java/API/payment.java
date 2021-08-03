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
        
        JOB_Api_Call("Mobile User Payment Method(s) (Deprecated?)", "GET", 
            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try {
                if (json.has("payment_methods")) {
                    JSONArray payment_methods = json.getJSONArray("payment_methods");
                    for (int i = 0; i < payment_methods.length(); i++) {
                        JSONObject p = payment_methods.getJSONObject(i);
                        Payment_Methods_IDS.add(p.getString("token"));
                    }
                }
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }   
        
        String P_ID = "";
        if(Site_PProvider.equals("exact")){
            P_ID = exact_id;
        }else{
            P_ID = freedompay_id;
        }
        for(int i = 0; i < Payment_Methods_IDS.size(); i++){
            JOB_Api_Call("Mobile User Delete Payment Method", "DELETE", 
                BaseAPI + "/payment/" + P_ID + "/method/" + Payment_Methods_IDS.get(i) + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        }
        
        
        
//        JOB_Api_Call("Mobile User Payment Method(s) (Deprecated?)", "GET", 
//            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            try {
//                if (json.has("payment_methods")) {
//                    JSONArray payment_methods = json.getJSONArray("payment_methods");
//                    Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
//                    Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
//                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
//                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
//                    Payment_Method_TKN = payment_methods.getJSONObject(0).getString("token");
//                }
//            } catch (Exception ex){
//                String AAAA = ex.getMessage();
//            }
//        } 
//        JOB_Api_Call("Mobile User Payment Method", "GET", 
//            BaseAPI + "/payment/" + Mobile_User_ID + "/method", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            try {
//                if (json.has("payment_methods")) {
//                    JSONArray payment_methods = json.getJSONArray("payment_methods");
//                    Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
//                    Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
//                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
//                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
//                    Payment_Method_TKN = payment_methods.getJSONObject(0).getString("token");
//                }
//            } catch (Exception ex){
//                String AAAA = ex.getMessage();
//            }
//        }    
//        if(Site_PProvider.equals("freedompay")){
//            JOB_Api_Call("Generate Mobile User Payment Token (freedompay)", "GET", 
//                BaseAPI + "/payment/" + freedompay_id + "/paymenttoken", Auth, "", 200, ParentTest, "no_jira");
//            if(json != null){
//                try {
//                    if (json.has("payment_methods")) {
//                        JSONArray payment_methods = json.getJSONArray("payment_methods");
//                        Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
//                        Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
//                        Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
//                        Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
//                        Payment_TKN = payment_methods.getJSONObject(0).getString("token");
//                    }
//                } catch (Exception ex){
//                    String AAAA = ex.getMessage();
//                }
//            }             
//        }
//        if(Site_PProvider.equals("exact")){
//            JSONObject child_object = new JSONObject();
//            JSONObject requestParams = new JSONObject();
//            requestParams.put("cardholder_name", Card_Name);
//            requestParams.put("cc_expiry", "1223");
//            requestParams.put("cc_number", "4111111111111111");
//            requestParams.put("cc_verification_str2", "123");
//            child_object.put("exact_gateway_id", "AE7628-02");
//            child_object.put("exact_gateway_password", "~RSQzgwC");
//            requestParams.put("options", child_object);
//            BODY = requestParams.toString();
//            
//            JOB_Api_Call("Generate Mobile User Payment Token (freedompay)", "GET", 
//                BaseAPI + "/payment/" + exact_id + "/paymenttoken", Auth, "", 200, ParentTest, "no_jira");
//            
//            if(json != null){
//                try {
//                    //Payment_TKN = payment_methods.getJSONObject(0).getString("token");
//                } catch (Exception ex){
//                    String AAAA = ex.getMessage();
//                }
//            }              
//        }
////        JOB_Api_Call("Generate Mobile User Payment Token (freedompay)", "GET", 
////            BaseAPI + "/payment/" + Payment_Id + "/paymenttoken", Auth, "", 200, ParentTest, "no_jira");
////        if(json != null){
////            try {
////                if (json.has("payment_methods")) {
////                    JSONArray payment_methods = json.getJSONArray("payment_methods");
////                    Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
////                    Card_Type = payment_methods.getJSONObject(0).getString("card_type"); 
////                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
////                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name"); 
////                    Payment_Method_TKN = payment_methods.getJSONObject(0).getString("token");
////                }
////            } catch (Exception ex){
////                String AAAA = ex.getMessage();
////            }
////        }  
        
   }
}
