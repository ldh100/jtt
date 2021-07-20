package API;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

class notification extends API_GUI{
    protected notification(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                                    
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 Resent Updates===========================
        JOB_Api_Call("AP3 Recent Updates - no end date", "GET", 
            BaseAPI + "/notification?realm=cdl&target=admin_panel", Auth, "", 200, ParentTest, "no_jira");
        
        Date _e = new DateTime(new Date()).minusDays(10).toDate();
        String _E = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(_e); 
        JOB_Api_Call("AP3 Recent Updates - end 10 days ago", "GET", 
            BaseAPI + "/notification?realm=cdl&target=admin_panel&end=" + _E, Auth, "", 200, ParentTest, "no_jira");  
        // get list of ID(s)
        
        // https://api.compassdigital.org/dev/notification/lBG93P10PGCLOD7yzwkkfMq8NQyM8RFQEWRy884OIXagyg2QzNFZL8rljeDzco7gpoGzkvtZY41kEDPJsWM0yOGPwKUv8AkYl4yPseJN/status
        // POST > {"status":{"read":true}}
        
        /* update NOTIFICATIONS_IDS>Index(???) > PATCH; 
        
        {"text":"04-22werqrewrewerq",
        "title":"test - edited",
        "realm":"cdl",
        "target":"admin_panel",
        "date_modified":"2021-04-22T07:00:00.000Z"}
        */
 
    }
}
