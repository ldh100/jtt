package API;

import java.util.Base64;

class user_bolter extends API_GUI{
    protected user_bolter(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        Runner_Site_ID = a.Runner_Site_ID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
    try {
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter Runner Authentication > /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Runner", 200, ParentTest, "no_jira");

            if(json.has("profile")){
                Runner_Site_ID = json.getJSONObject("profile").getString("location_group") + "\r\n";  
            }else{
                if(json.has("error")){
                    Runner_Site_ID = "Not Found";
                }
            }        
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter Runner Authentication - Wrong ID> /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Runner", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("Bolter Runner Authentication - Wrong PW> /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Runner", 401, ParentTest, "no_jira");

    } catch (Exception ex){}   // =============================================  
    }
}
