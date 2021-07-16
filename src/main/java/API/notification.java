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
 
    }
}
