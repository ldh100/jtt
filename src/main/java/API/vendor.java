package API;

class vendor extends API_GUI{
    protected vendor(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    String AAA = "";

    protected void run() {   
        Auth = "Bearer " + AP3_TKN;
        JOB_Api_Call("Get all Vendors", "GET", 
            BaseAPI + "/vendor", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
    }
}
