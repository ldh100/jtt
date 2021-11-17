package AP3_API;

class sso extends AP3_API_GUI{
    protected sso(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;       
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() {          
        String DL_Clien_ID = "";
        String DL_Redirect_URL = "";
        String DL_Secret_Key = "8BC7qCTQApkbAhByhusqY6geDm3nFDgK";
        
        String C360_Clien_ID = "";
        String C360_Redirect_URL = "";
        String C360_Secret_Key = "?????";
        switch (env) {
            case "DE":
                DL_Clien_ID = "FMP Distilr DEV";
                DL_Redirect_URL = "//dev.member.distilr.io/login";
                
                C360_Clien_ID = "Cafe 360 DEV";
                C360_Redirect_URL = "https://dev.cafe360.compassdigital.org/home";
                break;
            case "ST":
                DL_Clien_ID = "FMP Distilr Test";
                DL_Redirect_URL = "//staging.member.distilr.io/login";
                
                C360_Clien_ID = "Cafe 360 Test";
                C360_Redirect_URL = "https://staging.cafe360.compassdigital.org/home";
                break;
            case "PR":
                DL_Clien_ID = "FMP Distilr Prod";
                DL_Redirect_URL = "//member.distilr.io/login";
                
                C360_Clien_ID = "Cafe 360 Prod";
                C360_Redirect_URL = "https://cafe360.compassdigital.org/home";
                break; 
        }

        Auth = "";   
        JOB_Api_Call("Distiler SSO OAuth Login Redirect", "GET",      
            "https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=" + DL_Clien_ID +
                     "&response_type=code&redirect_uri=" + DL_Redirect_URL, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }  
       
        JOB_Api_Call("C360 SSO OAuth Login Redirect", "GET",      
            "https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=" + C360_Clien_ID +
                     "&response_type=code&redirect_uri=" + C360_Redirect_URL +"&response_type=code", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
    }
}
