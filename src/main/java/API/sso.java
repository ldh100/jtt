package API;

class sso extends API_GUI{
    protected sso(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;       
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() {          
        String Clien_ID = "";
        String Redirect_URL = "";
        String Secret_Key = "8BC7qCTQApkbAhByhusqY6geDm3nFDgK";
        switch (env) {
            case "DE":
                Clien_ID = "FMP Distilr DEV";
                Redirect_URL = "//dev.member.distilr.io/login";
                break;
            case "ST":
                Clien_ID = "FMP Distilr Test";
                Redirect_URL = "//staging.member.distilr.io/login";
                break;
            case "PR":
                Clien_ID = "FMP Distilr Prod";
                Redirect_URL = "//member.distilr.io/login";
                break; 
        }
        // Request URL: https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=FMP%20Distilr%20DEV&response_type=code&redirect_uri=https://dev.member.distilr.io/login

        Auth = "";   
        JOB_Api_Call("Distiler SSO OAuth Login", "GET",      
            "https://ssodev.compassmanager.com/oauth2.0/authorize?client_id=" + Clien_ID +
                     "&response_type=code&redirect_uri=" + Redirect_URL, Auth, "", 302, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }  
        
        Auth = "Bearer " + Bolter_User_TKN;   

    }
}
