package API;

class kds extends API_GUI{
    protected kds(API_GUI a) {
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
        Auth = "Bearer " + AP3_User_TKN;   // =============== "kds devices for Unit numbers > string separated with commas", ===========================
        JOB_Api_Call("KDS Devices > /kds/devices?'unitNumber(s)'", "GET", 
            BaseAPI + "/kds/devices?unitNumber=" + "12345,34567,32446673542657", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String DEVICES = "Check json"; 
        }  
        //
    }
}
