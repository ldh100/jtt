package AP3_API;

import java.util.Base64;
import org.json.JSONObject;

class vendor extends AP3_API_GUI{
    protected vendor(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    String Client_Accces_TKN = "";
    String Client_Refresh_TKN = "";
    protected void run() {   
        Auth = "Bearer " + AP3_TKN;
        JOB_Api_Call("Get all Vendors", "GET", 
            BaseAPI + "/vendor", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
 
        //GET vendor/auth with client_id/client_password as Basic auth - > should return access and refresh token
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WRONG_ID" + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 API Client ID/PW Authentication - Wrong ID", "GET", 
            BaseAPI + "/vendor/auth", Auth, "", 401, ParentTest, "no_jira");         
        if(json != null){ 
            try {
                if(json.has("access")) {
                    Client_Accces_TKN = json.getJSONObject("access").getString("token");                   
                }
                if(json.has("refresh")) {
                    Client_Refresh_TKN = json.getJSONObject("refresh").getString("token");                         
                } 
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }        
    if(!env.equals("DE")) {
        return;
    } 
    
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 API Client ID/PW Authentication", "GET", 
            BaseAPI + "/vendor/auth", Auth, "", 200, ParentTest, "no_jira");         
        if(json != null){ 
            try {
                if(json.has("access")) {
                    Client_Accces_TKN = json.getJSONObject("access").getString("token");                   
                }
                if(json.has("refresh")) {
                    Client_Refresh_TKN = json.getJSONObject("refresh").getString("token");                         
                } 
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
        // POST vendor/auth with body {access_token,refresh_token}-> should return new access and previous refresh token 
        JSONObject requestParams = new JSONObject();
        requestParams.put("access_token", Client_Accces_TKN);
        requestParams.put("refresh_token", Client_Refresh_TKN); 

        BODY = requestParams.toString();
        JOB_Api_Call("AP3 API Client - New Access Token", "POST", 
            BaseAPI + "/vendor/auth", Auth, BODY, 200, ParentTest, "no_jira"); 
        if(json != null){ 
            try {
                if(json.has("access")) {
                    Client_Accces_TKN = json.getJSONObject("access").getString("token");                   
                }
                if(json.has("refresh")) {
                    Client_Refresh_TKN = json.getJSONObject("refresh").getString("token");                         
                } 
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }        
    }
}
