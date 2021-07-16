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
        Auth = "";   // ==========================================
        JOB_Api_Call("Tasks > 'BrandID'", "GET", 
            BaseAPI + "/task/location/brand/" + SiteID +"?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
        //?location_id=zjYX7Pd7p0U6K64QgeEPfk2J9zQd23UY4peLvzqdF5GqA2GJDKSYdWlj0dNlHkgPKBADE2ijzN&query_type=kds
        if(json != null){
            String Tasks = "Check json"; 
        }    
    }
}
