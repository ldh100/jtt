package FW_API;

import java.util.Base64;
import org.json.JSONObject;


class login extends FW_API_main{
    protected login(FW_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        FW_ADMIN_ID = a.FW_ADMIN_ID;
        FW_ADMIN_PW = a.FW_ADMIN_PW;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    protected void run() { 
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + FW_ADMIN_PW).getBytes());
        JOB_Api_Call("FW Admin Authentication - Wrong ID", "GET", 
            BaseAPI + "/auth", Auth, "", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((FW_ADMIN_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("FW Admin Authentication - Wrong PW", "GET", 
            BaseAPI + "/auth", Auth, "", 401, ParentTest, "no_jira");
                      
        Auth = "Basic " + Base64.getEncoder().encodeToString((FW_ADMIN_ID + ":" + FW_ADMIN_PW).getBytes());
        JOB_Api_Call("FW User Login", "GET", 
            BaseAPI + "/auth", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            try {
                if(json.has("user")) {
                    FW_Admin_ID = json.getJSONObject("user").getString("id");
                } 
                if(json.has("token")) FW_Admin_TKN = json.getString("token");  
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
            AAA = "";
        }
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("FW User' Partners", "GET", 
            BaseAPI + "/partners?ownerUserId=" + FW_Admin_ID, Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            try {
                if(json.has("user")) {
                    FW_Admin_ID = json.getJSONObject("user").getString("id");
                } 
                if(json.has("token")) FW_Admin_TKN = json.getString("token");  
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
            AAA = "";
        } 

        //BODY = "{\"email\":\"" + FW_ADMIN_ID + "\"}";
        JSONObject requestParams = new JSONObject();       
        requestParams.put("email", FW_ADMIN_ID);
        BODY = requestParams.toString();  
        JOB_Api_Call("FW User - Send 'Forgot Password' Link", "POST", 
            BaseAPI + "/users/forgotpassword", Auth, BODY, 200, ParentTest, "no_jira");         
    }
    
    
    
    
    /*
    New User
    https://czb8fru7ij.execute-api.us-east-1.amazonaws.com/dev//users
    
    {name: {first: "Oleg", last: "Spozito"}, email: "cdl.test.xtt@gmail.com", phone: {phone: 6475551234},…}
    email: "cdl.test.xtt@gmail.com"
    is: {disabled: false, approver: false}
    name: {first: "Oleg", last: "Spozito"}
    permissions: {acl: {}, scopes: ["fw_admin"]}
    phone: {phone: 6475551234}
    */
   
}
