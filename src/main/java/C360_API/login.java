package C360_API;

import java.util.Base64;


class login extends C360_API_main{
    protected login(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        FW_ADMIN_ID = a.FW_ADMIN_ID;
        FW_ADMIN_PW = a.FW_ADMIN_PW;
        NewID = a.NewID;
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
                    FW_User_ID = json.getJSONObject("user").getString("id");
                } 
                if(json.has("token")) FW_User_TKN = json.getString("token");  
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
            AAA = "";
        }
        
        
        
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
