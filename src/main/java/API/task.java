package API;

class task extends API_GUI{
    protected task(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        // UnitNum ???????
        ParentTest = a.ParentTest;
    }
    protected void run() {                                                       
        Auth = "Bearer " + AP3_User_TKN;   // ==========================================
        JOB_Api_Call("Tasks > 'BrandID'", "GET", 
            BaseAPI + "/task/location/brand/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String Tasks = "Check json"; 
        }    
    }
}
