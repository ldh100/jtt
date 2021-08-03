package API;;

class kds extends API_GUI{
    protected kds(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        UnitNum  = a.UnitNum;
        ParentTest = a.ParentTest;
    }
    protected void run() {                                                          
        Auth = "Bearer " + AP3_TKN;   // =============== "kds devices for Unit numbers > string separated with commas", ===========================
        KDS_Serial_Number = "";
        JOB_Api_Call("KDS Devices > /kds/devices?'unitNumber(s)'", "GET", 
            BaseAPI + "/kds/devices?unitNumber=" + UnitNum, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String DEVICES = "units";
            // KDS_Serial_Number ????
        }  
        
        //JOB_WS_Call("WebSocket > KDS Get Orders", "wss://ws.compassdigital.org", ParentTest, "no_jira");        

    }
}
