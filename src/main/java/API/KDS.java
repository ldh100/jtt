package API;

class KDS extends API_GUI{
    protected KDS(API_GUI a) {
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
    try {                                                          
        Auth = "Bearer " + AP3_User_TKN;   // =============== "KDS devices for Unit numbers > string separated with commas", ===========================
        JOB_Api_Call("KDS Devices > ?'unitNumber(s)'", "GET", 
            BaseAPI + "/kds/devices?unitNumber=" + "12345,34567,32446673542657", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String DEVICES = "Check json"; 
        }  

    } catch (Exception ex){}   // =============================================  
    }
}
