package API;

class Announcement extends API_GUI{
    protected Announcement(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
    try {                    
    
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 Announcement ===========================
        JOB_Api_Call("AP3 Announcement", "GET", 
            BaseAPI + "/announcement/resource/", Auth, "", 200, ParentTest, "no_jira");

    } catch (Exception ex){}   // =============================================  
    }
}
