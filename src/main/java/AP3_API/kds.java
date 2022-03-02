package AP3_API;

import org.json.JSONObject;

class kds extends AP3_API_GUI{
    protected kds(AP3_API_GUI a) {
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
    String AAA = "";
    protected void run() {                                                          
        Auth = "Bearer " + AP3_TKN;   // =============== "kds devices for Unit numbers > string separated with commas", ===========================
        KDS_Serial_Number = "";
        JOB_Api_Call("KDS Devices > /kds/devices?'unitNumber(s)'", "GET", 
            BaseAPI + "/kds/devices?unitNumber=" + UnitNum, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String DEVICES = "units";
            // KDS_Serial_Number ????
            AAA = json.toString(4);
        }  
        
//        JSONObject requestParams = new JSONObject();   //  KDS Device Authentication  =================
//        JSONObject serial_number = new JSONObject();
//        serial_number.put("serial_number", "DMPR8EUGG5YL"); // KDS_Serial_Number >> Error: serial_number is missing or invalid.
//        requestParams.put("is", serial_number); 
//        BODY = requestParams.toString();         
//        JOB_Api_Call("KDS Devices > /kds/device/auth/", "POST", 
//            BaseAPI + "/kds/device/auth", "", BODY, 200, ParentTest, "no_jira");
//        if(json != null){
//            String DEVICES = "units";
//            // KDS_Serial_Number ????
//            AAA = json.toString(4);
//        }
        
        //JOB_WS_Call("WebSocket > KDS Get Orders", "wss://ws.compassdigital.org", ParentTest, "no_jira");        

    }
}
