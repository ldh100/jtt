package API;

class announcement extends API_GUI{
    protected announcement(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 announcement ===========================
        JOB_Api_Call("AP3 Announcement", "GET", 
            BaseAPI + "/announcement/resource/", Auth, "", 200, ParentTest, "no_jira");
        //
    }
}
