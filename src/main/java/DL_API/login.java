package DL_API;

import DL_API.*;
import java.util.Base64;

class login extends DL_API_main{
    protected login(DL_API_main a) {
        env = a.env;
        url = a.url;
        BaseAPI = a.BaseAPI;
        DL_ADMIN_ID = a.DL_ADMIN_ID;
        DL_ADMIN_PW = a.DL_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    String COOKIE = "";
    String API_URL = "";
    protected void run() { 
/*
SSO authentication often results in setting a cookie. 
If you capture this cookie after the authentication phase, then you can reuse this cookie in every Selenium test.        
      
DL 1st call        
https://ssoqas.compassmanager.com/login?service=https://ssoqas.compassmanager.com/oauth2.0/callbackAuthorize?client_id=FMP+Distilr+Test&redirect_uri=https%3A%2F%2Fstaging.member.distilr.io%2Flogin&response_type=code&client_name=CasOAuthClient    
https://ssoqas.compassmanager.com/oauth2.0/authorize?client_id=FMP Distilr Test&response_type=code&redirect_uri=https://staging.member.distilr.io/login
 */  
        String DL_Clien_ID = "";
        String DL_Redirect_URL = "";
        String DL_Secret_Key = "8BC7qCTQApkbAhByhusqY6geDm3nFDgK";
        
        switch (env) {
            case "DE":
                DL_Clien_ID = "FMP Distilr DEV";
                DL_Redirect_URL = "//dev.member.distilr.io/login";
                
                break;
            case "ST":
                DL_Clien_ID = "FMP Distilr Test";
                DL_Redirect_URL = "//staging.member.distilr.io/login";

                break;
            case "PR":
                DL_Clien_ID = "FMP Distilr Prod";
                DL_Redirect_URL = "//member.distilr.io/login";

                break; 
        }
        Auth = "";   
//        JOB_Api_Call("DL SSO OAuth Login Redirect", "GET",      
//            "https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=" + DL_Clien_ID +
//                     "&response_type=code&redirect_uri=" + DL_Redirect_URL + "&response_type=code", Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("DL SSO OAuth /callbackAuthorize?client_id", "GET",      
            "https://ssoqas.compassmanager.com/login?service=https://ssoqas.compassmanager.com/oauth2.0/callbackAuthorize?client_id=FMP+Distilr+Test&redirect_uri=https%3A%2F%2Fstaging.member.distilr.io%2Flogin&response_type=code&client_name=CasOAuthClient" +
                "", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
        JOB_Api_Call("DL SSO /authorize?client_id", "GET",      
            "https://ssoqas.compassmanager.com/oauth2.0/authorize?client_id=FMP Distilr Test&response_type=code&redirect_uri=https://staging.member.distilr.io/login", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
        
//username: distilr.test2@place.com
//password: Compass5
//execution: b975c30.......        
        JOB_Api_Call("DL SSO Login", "POST",      
            "https://ssodev.compassmanager.com/login", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
        JOB_Api_Call("DL auth?code", "GET",      
            url + "/auth?code=OC-177-cWC7-1ilolAMBCNcEAh0MPen3-JLPk5F", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }         
        JOB_Api_Call("DL /login?code", "GET",      
            url + "/login?code=OC-177-cWC7-1ilolAMBCNcEAh0MPen3-JLPk5F", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }         
    }
}
