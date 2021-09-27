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
        
        Order_Delivery_ID = a.Order_Delivery_ID;
        ShoppingCart_Delivery_ID = a.ShoppingCart_Delivery_ID;
    }
    String AAA = "";
    protected void run() {                                                       
        // 1628827200000 - today start midnight
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        long START = cal.getTimeInMillis(); 
        
        Auth = "";   // ========================================== 
        JOB_Api_Call("Task > 'MarketPlace Brand ID' (hardcoded in JOB config)", "GET",  // ================   Hard Coded for now ======================================================
            BaseAPI + "/task/location/brand/" + Market_Brand_ID + "?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }  
        
        Auth = "Bearer " + Bolter_User_TKN;   
        
        JOB_Api_Call("Task > 'SiteID' ?created today", "GET",  
            BaseAPI + "/task/location/group/" + SiteID + "?created=" + START, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }      
  
        JOB_Api_Call("Task > 'SiteID' ?created/delivered today", "GET",  
            BaseAPI + "/task/location/group/" + SiteID + "?created=" + START + "&status=delivered", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
        
        // GET /dev/task/order/7kel037M1LS1E22G3P9WupKWYOeY0mCoKdryKGvqCOajAEWROph4lDk83AXYCOMXrN8?_query=%7BALL%2Cshoppingcart_id%7BALL%7D%2Clocation_id%7Bid%2Cname%2Clabel%7BALL%7D%2Clocation_description%7D%7D  
//        JOB_Api_Call("task/order > 'OrderID'", "GET",  
//            BaseAPI + "/task/order/" + Order_Delivery_ID + "?_query={ALL,shoppingcart_id{ALL},location_id{id,name,label{ALL},location_description}}", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            AAA = json.toString(4);
//        }
        
        JOB_Api_Call("task/order > 'OrderID' (no _query)", "GET",  
            BaseAPI + "/task/order/" + Order_Delivery_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }        
        // PATCH /dev/task/4MjmBjLDNJCDdk97LvwGiYBp6lLkpjtway9oza93cpJokXkpzgc4BGWLAEkAc4kL1dWz3WiwdDJ6p

    }
}
