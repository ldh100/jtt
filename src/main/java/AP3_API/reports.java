package AP3_API;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

class reports extends AP3_API_GUI{
    protected reports(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        BrandIDS = a.BrandIDS;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Date _Start; 
        Date _End;   
        String Start; 
        String End; 
        Auth = "Bearer " + AP3_TKN;   

        JOB_Api_Call("Sales EOD Report - Default > /'SiteID'", "GET", // =============== AP3 Sales Reporting EOD ========================
            BaseAPI + "/report/eod/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        String From = ""; 
        Date Yesterday = new DateTime(new Date()).minusDays(1).toDate();
        From = new SimpleDateFormat("yyyy-MM-dd").format(Yesterday); 
        String To = From;
        JOB_Api_Call("Sales EOD Report - Yesterday > /'SiteID'", "GET", 
            BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            boolean XXX = true;
            //
        }

//        _Start = new DateTime(new Date()).minusMonths(6).toDate();  // Added 31 March 2022
//        _End = new DateTime(new Date()).minusDays(1).toDate();
//        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
//        End = new SimpleDateFormat("yyyy-MM-dd").format(_End); 
//        JOB_Api_Call("Report Analytics Group > /'SiteID/bills?month?6 Month'", "GET", 
//            BaseAPI + "/report/analytics/group/" + SiteID + "/bills&time_frame=month&start_date=" + Start + "&end_date=" + End, Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            boolean XXX = true;
//            //
//        }

//        _Start = new DateTime(new Date()).minusDays(31).toDate();
//        _End = new DateTime(new Date()).minusDays(1).toDate();
//        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
//        End = new SimpleDateFormat("yyyy-MM-dd").format(_End); 
//        JOB_Api_Call("Report Analytics Combined > /'SiteID/all_brands?week?30 days'", "GET", 
//            BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + BrandIDS + "&time_frame=week&start_date=" + Start + "&end_date=" + End, Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            boolean XXX = true;
//            //
//        } 
 
        _Start = new DateTime(new Date()).minusDays(8).toDate();
        _End = new DateTime(new Date()).minusDays(1).toDate();
        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
        End = new SimpleDateFormat("yyyy-MM-dd").format(_End); 
        JOB_Api_Call("Report Analytics Combined > /'SiteID/brand?day?7 days'", "GET", 
            BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_id=" + BrandID + "&time_frame=day&start_date=" + Start + "&end_date=" + End, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            boolean XXX = true;
            //
        }              
    }
}
