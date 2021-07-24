package API;

class calendar extends API_GUI{
    protected calendar(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                  
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 calendar ===========================
        JOB_Api_Call("Calendar > /'BrandID'", "GET", 
            BaseAPI + "/calendar/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Calendar > /'BrandID'/ Synchronization", "GET", 
//            BaseAPI + "/calendar/" + BrandID + "/sync", Auth, "", 200, ParentTest, "no_jira");
        JOB_Api_Call("Calendar > /'BrandID'/ CDL compatible format for next 7 days", "GET", 
            BaseAPI + "/calendar/" + BrandID + "/cdl", Auth, "", 200, ParentTest, "no_jira");        
    }
}
