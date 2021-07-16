package API;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

class Reports extends API_GUI{
    protected Reports(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        BrandIDS = a.BrandIDS;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
    try {           
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 Sales Reporting EOD ===========================
        JOB_Api_Call("Sales EOD Report - Default > /'SiteID'", "GET", 
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
        String Start = ""; 
        String End = ""; 
        Date _Start = new DateTime(new Date()).minusDays(31).toDate();
        Date _End = new DateTime(new Date()).minusDays(1).toDate();
        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
        End = new SimpleDateFormat("yyyy-MM-dd").format(_End); 
        JOB_Api_Call("Report Analytics > /'SiteID/all_brands/week/30 days'", "GET", 
            BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + BrandIDS + "&time_frame=week&start_date=" + Start + "&end_date=" + End, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            boolean XXX = true;
            //
        }  
        Date _Start1 = new DateTime(new Date()).minusDays(8).toDate();
        Date _End1 = new DateTime(new Date()).minusDays(1).toDate();
        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start1); 
        End = new SimpleDateFormat("yyyy-MM-dd").format(_End1); 
        JOB_Api_Call("Report Analytics > /'SiteID/brand/day/7 days'", "GET", 
            BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_id=" + BrandID + "&time_frame=day&start_date=" + Start + "&end_date=" + End, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            boolean XXX = true;
            //
        }              

    } catch (Exception ex){}   // =============================================  
    }
}
