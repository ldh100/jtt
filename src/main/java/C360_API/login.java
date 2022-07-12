package C360_API;

import java.util.Base64;


class login extends C360_API_main{
    protected login(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        SSO_BaseAPI = a.SSO_BaseAPI;
        C360_Clien_ID = a.C360_Clien_ID;
        C360_ADMIN_ID = a.C360_ADMIN_ID;
        C360_ADMIN_PW = a.C360_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    String COOKIE = "";
    String TICKET = "?????";
/*
SSO authentication often results in setting a cookie. 
If you capture this cookie after the authentication phase, then you can reuse this cookie        
 */ 
    protected void run() { 
        Auth = "";  
        JOB_Api_Call("C360 Welcome > /login API", "GET",      
            BaseAPI + "/login", Auth, "", 200, ParentTest, "no_jira"); 

        JOB_Api_Call("SSO OAuth /authorize?client_id", "GET",      
            SSO_BaseAPI + "/oauth2.0/authorize?client_id=" + C360_Clien_ID +
                     "&redirect_uri=" + BaseAPI + "/home&response_type=code", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }   

        JOB_Api_Call("SSO OAuth /login?service", "GET",      
             SSO_BaseAPI + "/login?service=" +
                 SSO_BaseAPI + "/oauth2.0/callback/Authorize/client_id=" + C360_Clien_ID +
                    "/redirect_uri=" + BaseAPI + "/home/response_type/code/client_name=CasOAuthClient", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
//        JOB_Api_Call("C360 SSO OAuth Login Redirect", "GET",      
//            BaseAPI + "?code=OC-139-cCVucy5kQNDTXzx1TVgKBvUgoX0S54P-", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            AAA = json.toString(4);
//        }        
    }
}
