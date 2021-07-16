package API;

import java.util.Base64;

class user_ap3 extends API_GUI{
    protected user_ap3(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Realm = A.Func.Realm_ID("AP3", env);
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter/Runner Login in AP3", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");        
        
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 Admin Authentication - Wrong ID", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("AP3 Admin Authentication - Wrong PW", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");
                
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 Admin Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){ 
            try {
                if(json.has("user")) AP3_User_ID = json.getString("user"); 
                if(json.has("token")) AP3_User_TKN = json.getString("token");  
            } catch (Exception ex){
                //
            }
        }

        Auth = "Bearer " + AP3_User_TKN;
        JOB_Api_Call("AP3 User > /realm", "GET", 
            BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000", Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("AP3 User > /permissions", "GET", 
            BaseAPI + "/user/" + AP3_User_ID + "/permissions" + "?nocache=1", Auth, "", 200, ParentTest, "no_jira");
        JOB_Api_Call("AP3 User ", "OPTIONS", 
            BaseAPI + "/user/" + AP3_User_ID, Auth, "", 200, ParentTest, "no_jira");  
        
        BODY = "{\"id\":\"" + AP3_User_ID + "\"," + //  Update AP3 user Phone
                "\"phone\":" + "1" + NewID + "\"}";
        JOB_Api_Call("AP3 User - Update Phone", "PUT", 
            BaseAPI + "/user/" + AP3_User_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
//        BODY = "{\"id\":\"" + AP3_User_ID + "\"," + //  New AP3 User ===============================
//                "\"phone\":" + "1" + NewID + "\"}";
//        JOB_Api_Call("AP3 User - Create New", "PUT", 
//            BaseAPI + "/user/" + AP3_User_ID, Auth, BODY, 200, ParentTest, "no_jira"); 

    }
}
