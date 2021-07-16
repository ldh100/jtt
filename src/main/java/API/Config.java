package API;

class Config extends API_GUI{
    protected Config(API_GUI a) {
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
        Auth = "Bearer " + AP3_User_TKN;   // =============== Config(s) ========================================
//        JOB_Api_Call("Config > /'AppID'", "GET", BaseAPI + "/config/" + AppID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Public Config > /'AppID'", "GET", BaseAPI + "/config/public/" + AppID, "", "", 200, ParentTest, "no_jira");
        
        JOB_Api_Call("Config > /'SiteID'", "GET", 
            BaseAPI + "/config/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        JOB_Api_Call("Public Config > /'SiteID'", "GET", 
            BaseAPI + "/config/public/" + SiteID, "", "", 200, ParentTest, "no_jira");
                
//        JOB_Api_Call("Config > /'UnitID'", "GET", BaseAPI + "/config/" + UnitID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Public Config > /'UnitID'", "GET", BaseAPI + "/config/public/" + UnitID, "", "", 200, ParentTest, "no_jira");
         
        JOB_Api_Call("Config > /'BrandID'", "GET", 
            BaseAPI + "/config/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
        JOB_Api_Call("Public Config > /'BrandID'", "GET", 
            BaseAPI + "/config/public/" + BrandID, "", "", 200, ParentTest, "no_jira");
        
        JOB_Api_Call("Config > JDE Configuration", "GET", 
            BaseAPI + "/config/jde-configuration", Auth, "", 200, ParentTest, "no_jira");        

    } catch (Exception ex){}   // =============================================  
    }
}
