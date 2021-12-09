package C360_API;

import java.util.Base64;


class login extends C360_API_main{
    protected login(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_ADMIN_ID = a.C360_ADMIN_ID;
        C360_ADMIN_PW = a.C360_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    String COOKIE = "";
/*
SSO authentication often results in setting a cookie. 
If you capture this cookie after the authentication phase, then you can reuse this cookie in every Selenium test.        
      
DL 1st call        
https://ssoqas.compassmanager.com/login?service=https://ssoqas.compassmanager.com/oauth2.0/callbackAuthorize?client_id=FMP+Distilr+Test&redirect_uri=https%3A%2F%2Fstaging.member.distilr.io%2Flogin&response_type=code&client_name=CasOAuthClient    
https://ssoqas.compassmanager.com/oauth2.0/authorize?client_id=FMP Distilr Test&response_type=code&redirect_uri=https://staging.member.distilr.io/login
 */ 
    protected void run() { 
        String C360_Clien_ID = "";
        String C360_Redirect_URL = "";
        String C360_Secret_Key = "?????";
        switch (env) {
            case "DE":               
                C360_Clien_ID = "Cafe 360 DEV";
                C360_Redirect_URL = "https://dev.cafe360.compassdigital.org/home";
                break;
            case "ST":
                C360_Clien_ID = "Cafe 360 Test";
                C360_Redirect_URL = "https://staging.cafe360.compassdigital.org/home";
                break;
            case "PR":
                C360_Clien_ID = "Cafe 360 Prod";
                C360_Redirect_URL = "https://cafe360.compassdigital.org/home";
                break; 
        }

        Auth = "";   
        JOB_Api_Call("C360 SSO OAuth Login Redirect", "GET",      
            "https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=" + C360_Clien_ID +
                     "&response_type=code&redirect_uri=" + C360_Redirect_URL + "&response_type=code", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }        
        
        // https://api.compassdigital.org/dev/cafe360user
    }
}
