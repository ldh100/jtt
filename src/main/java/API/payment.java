package API;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class payment extends API_GUI {

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
        FP_URL = a.FP_URL;
        exact_gateway_password = a.exact_gateway_password;
        exact_gateway_id = a.exact_gateway_id;
        exact_id = a.exact_id;
    }
    JSONObject requestParams = null;
    List<String> Payment_Tokens_EXACT = new ArrayList<>();
    List<String> Payment_Tokens_FP = new ArrayList<>();
    String AAA = "";
    protected void run() {
        //<editor-fold defaultstate="collapsed" desc="EXACT">
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Mobile User EXACT Payment Method(s)", "GET",
                BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            AAA = json.toString(4);
            try {
                if (json.has("payment_methods")) {
                    JSONArray payment_methods = json.getJSONArray("payment_methods");
                    for (int i = 0; i < payment_methods.length(); i++) {
                        JSONObject p = payment_methods.getJSONObject(i);
                        Payment_Tokens_EXACT.add(p.getString("token"));
                    }
                    Mobile_User_PProvider = payment_methods.getJSONObject(0).getString("type");
                    Card_Type = payment_methods.getJSONObject(0).getString("card_type");
                    Card_Last4 = payment_methods.getJSONObject(0).getString("last4");
                    Card_Name = payment_methods.getJSONObject(0).getString("cardholder_name");
                    Card_Method_TKN = payment_methods.getJSONObject(0).getString("token");
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }

        BODY = "{\"user\":\"" + Mobile_User_ID + "\"}";
        for (int i = 0; i < Payment_Tokens_EXACT.size(); i++) {
            JOB_Api_Call("Mobile User Delete EXACT Payment Method " + (i + 1), "DELETE",
                    BaseAPI + "/payment/" + exact_id + "/method/" + Payment_Tokens_EXACT.get(i), Auth, BODY, 200, ParentTest, "no_jira");
        }

        Auth = "Bearer " + Mobile_User_TKN;
        requestParams = new JSONObject();
        if (env.equals("PR")) {
            requestParams.put("cardholder_name", A.A.C1_Name);
            requestParams.put("cc_expiry", A.A.C1_Exp);
            requestParams.put("cc_number", A.A.C1_Num);       // Mastercard
            requestParams.put("cc_verification_str2", A.A.C1_Cvv);
            requestParams.put("postal_code", A.A.C1_Zip);
        } else {
            requestParams.put("cardholder_name", "JTT API Automation");
            requestParams.put("cc_expiry", "1224");
            requestParams.put("cc_number", "5555555555554444"); // Mastercard
            requestParams.put("cc_verification_str2", "123");
            requestParams.put("postal_code", "L3L3C4");
        }
        JSONObject options = new JSONObject();
        options.put("exact_gateway_id", exact_gateway_id);
        options.put("exact_gateway_password", exact_gateway_password);
        requestParams.put("options", options);
        BODY = requestParams.toString();

        JOB_Api_Call("New Card - Generate Mobile User Payment Token (exact)", "POST",
                BaseAPI + "/payment/" + exact_id + "/paymenttoken", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null && json.has("token")) {
            AAA = json.toString(4);
            try {
                EXACT_Payment_TKN = json.getString("token");
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        //</editor-fold>
 
        //<editor-fold defaultstate="collapsed" desc="FP">        
        String Access_TKN = "";
        JOB_Api_Call("Get Mobile User Freedompay Client Token", "GET",
                BaseAPI + "/payment/" + freedompay_id + "/clienttoken", Auth, "", 200, ParentTest, "no_jira");
        if (json != null && json.has("access_token")) {
            AAA = json.toString(4);
            try {
                Access_TKN = json.getString("access_token");
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        
        Auth = "Bearer " + Access_TKN;
        JOB_Api_Call("Mobile User Freedompay Payment Method(s)", "GET",
                FP_URL + "/TokenService/api/consumers/tokens", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            AAA = json.toString(4);
            try {
                if (json.has("data")) {
                    JSONArray tokens = json.getJSONArray("data");
                    for (int i = 0; i < tokens.length(); i++) {
                        JSONObject p = tokens.getJSONObject(i);
                        Payment_Tokens_FP.add(p.getString("token"));
                    }
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }       

        for (int i = 0; i < Payment_Tokens_FP.size(); i++) {
            JOB_Api_Call("Mobile User Delete Freedompay Payment Method " + (i + 1), "DELETE",
                FP_URL + "/TokenService/api/consumers/tokens/" + Payment_Tokens_FP.get(i), Auth, "", 204, ParentTest, "no_jira");
        }        
        
        Auth = "Bearer " + Access_TKN;          // ??? What if No FP Payments for this User, above failed? How to generaete 1st one? DEBUG
        //Auth = "Bearer " + Mobile_User_TKN;     // ???
        requestParams = new JSONObject();
        if (env.equals("PR")) {
            requestParams.put("nameOnCard", A.A.C1_Name);
            requestParams.put("avsVerificationRequired", true);
            requestParams.put("isPreferred", true);
            requestParams.put("cardNumber", A.A.C1_Num); 
            requestParams.put("expiryYear", "20" + A.A.C1_Exp.substring(2));
            requestParams.put("expiryMonth", A.A.C1_Exp.substring(0,1));
            requestParams.put("CVV", A.A.C1_Cvv);
            requestParams.put("cvvVerificationRequired", true);
            JSONObject billingAddress = new JSONObject();
            billingAddress.put("postalCode", A.A.C1_Zip);
            requestParams.put("billingAddress", billingAddress);            
        } else {
            requestParams.put("nameOnCard", "JTT API Automation");
            requestParams.put("avsVerificationRequired", true);
            requestParams.put("isPreferred", true);
            requestParams.put("cardNumber", "4111111111111111"); // Visa
            requestParams.put("expiryYear", 2024);
            requestParams.put("expiryMonth", 12);
            requestParams.put("CVV", "123");
            requestParams.put("cvvVerificationRequired", true);
            JSONObject billingAddress = new JSONObject();
            billingAddress.put("postalCode", "L3L3C4");
            requestParams.put("billingAddress", billingAddress);
        }        

        BODY = requestParams.toString();
        JOB_Api_Call("New Card - Generate Mobile User Payment Token (freedompay)", "POST",
                FP_URL + "/TokenService/api/consumers/tokens", Auth, BODY, 201, ParentTest, "no_jira");
        if (json != null) {
            AAA = json.toString(4);
            try {
                AAA = json.toString(4);
                FP_Payment_TKN = json.getString("token");           
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        //</editor-fold>
    }
}
