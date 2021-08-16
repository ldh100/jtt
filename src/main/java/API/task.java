package API;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.TimeZone;

class task extends API_GUI{
    protected task(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        SiteID = a.SiteID;
        Bolter_User_ID = a.Bolter_User_ID;
        Bolter_User_TKN = a.Bolter_User_TKN;
        Bolter_Site_ID = a.Bolter_Site_ID;
        BolterBrandIDS = a.BolterBrandIDS;        
        Market_Brand_ID = a.Market_Brand_ID;
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() {                                                       
        Auth = "";   // ========================================== 
        JOB_Api_Call("Tasks > 'MarketPlace Brand ID' (hardcoded in JOB config)", "GET",  // ================   Hard Coded for now ======================================================
            BaseAPI + "/task/location/brand/" + Market_Brand_ID + "?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }  
        
        // 1628827200000 - today start midnight
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long START = cal.getTimeInMillis();   
//        LocalTime midnight = LocalTime.MIDNIGHT; 
//        LocalDate today = LocalDate.now();
//        LocalDateTime todayMidnight = LocalDateTime.of(today, midnight);
//        long START = todayMidnight.toEpochSecond(ZoneOffset.UTC);      
        Auth = "Bearer " + Bolter_User_TKN;   
        JOB_Api_Call("Tasks > 'SiteID' ?created today", "GET",  
            BaseAPI + "/task/location/group/" + SiteID + "?created=" + START, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }         
    }
}
