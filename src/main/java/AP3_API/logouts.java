package AP3_API;

class logouts extends AP3_API_GUI{
    protected logouts(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ParentTest = a.ParentTest;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        AP3_User_ID = a.AP3_User_ID;
        AP3_TKN = a.AP3_TKN;
        
        MOBILE_ID = a.MOBILE_ID;
        MOBILE_PW = a.MOBILE_PW;
        Mobile_User_ID = a.Mobile_User_ID;        
        Mobile_User_TKN = a.Mobile_User_TKN; 
        
        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        Bolter_User_ID = a.Bolter_User_ID;        
        Bolter_User_TKN = a.Bolter_User_TKN; 
    }
    protected void run() {  

        Realm = A.Func.Realm_ID(app, env);
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Mobile User Logout", "DELETE", // Mobile User Logout ===============================
            BaseAPI + "/user/logout?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        
        Realm = "bolter";
        Auth = "Bearer " + Bolter_User_TKN;
        JOB_Api_Call("Bolter User Logout", "DELETE", // Bolter User Logout ===============================
            BaseAPI + "/user/logout?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
    }
}
