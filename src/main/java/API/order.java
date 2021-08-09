package API;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

class order extends API_GUI{
    protected order(API_GUI a) {
        app = a.app;
        AppID = a.AppID;
        env = a.env;
        AP3_TKN = a.AP3_TKN;
        BaseAPI = a.BaseAPI;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;
        
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;

        UnitID = a.UnitID;
        UnitNum = a.UnitNum;
        ParentTest = a.ParentTest;
        
        MENU_IDS = a.MENU_IDS;
        ITEMS_IDS = a.ITEMS_IDS;
        MENU_TIMESLOTS = a.MENU_TIMESLOTS;
        BRAND_TIMESLOTS = a.BRAND_TIMESLOTS;
        DELIEVERY_DESTINATIONS = a.DELIEVERY_DESTINATIONS;
        
        ShoppingCart_Delivery_ID = a.ShoppingCart_Delivery_ID;
        ShoppingCart_Pickup_ID = a.ShoppingCart_Pickup_ID;
        EXACT_Payment_TKN = a.EXACT_Payment_TKN;
        FP_Payment_TKN = a.FP_Payment_TKN;
    }
    JSONObject requestParams = null;
    String AAA = "";
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;

        Date requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1))*1000L);
        //Date requested_date = new Date(Long.parseLong(MENU_TIMESLOTS.get(0))*1000L);
        String Requested_Date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(requested_date);

        requestParams = new JSONObject();   //  Mobile User Place Pickup Order  =================
        requestParams.put("location_brand", BrandID);
        requestParams.put("customer", Mobile_User_ID);
        requestParams.put("pickup_name", "JTT API Test Pickup");
        requestParams.put("pickup", Requested_Date);
        requestParams.put("requested_date", Requested_Date);
        requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
        JSONObject payment = new JSONObject();
        payment.put("token", EXACT_Payment_TKN);
        requestParams.put("payment", payment); 
        BODY = requestParams.toString();        
        JOB_Api_Call("Place Pickup Order", "POST", 
            BaseAPI + "/order?lang=en", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("id")){
            Order_Pickup_ID = json.getString("id");
        }          
        
        BODY = "{" +                                                //  Mobile User Place Delivery Order  =================
                "\"location_brand\":\"" + BrandID + "\"," + 
                "\"customer\":\"" + Mobile_User_ID + "\"," +  
                "\"details\":" +                                   
                    "{\"contact_number\":\"4165551234\"," +
                    "\"destination\":\"" + DELIEVERY_DESTINATIONS.get(0) + "\"," +
                    "\"duration\":\"" + "00:05:00" + "\"," +
                    "\"instructions\":\"" + "Discard this Order" + "\"," +
                    "\"name\":\"" + "JTT API Test Delivery" + "\"," +
                    "\"order_type\":\"delivery\"}," + 
                "\"payment\":" + 
                    "{\"token\":\"" + EXACT_Payment_TKN + "\"}," +
                "\"requested_date\":\"" + Requested_Date + "\"," +
                "\"shoppingcart\":\"" + ShoppingCart_Delivery_ID + 
                "\"}";        
        JOB_Api_Call("Place Delivery Order", "POST", 
            BaseAPI + "/order", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("id")){
            Order_Delivery_ID = json.getString("id");
        }
        
        Auth = "Bearer " + AP3_TKN;
        requestParams = new JSONObject();   //  Mobile User Update Delivery Order  =================
        JSONObject is = new JSONObject();
        is.put("in_progress", true);
        is.put("ready", true);
        requestParams.put("is", is); 
        BODY = requestParams.toString();
        JOB_Api_Call("Update Delivery Order Status - ready", "PATCH", 
            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){           
            AAA = json.toString(4);// Check actual update
        } 
        
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders - last 7 days", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
        
        JOB_Api_Call("Mobile User All Orders - Brand '" + BRAND + "'", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "/location/brand/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 

        JOB_Api_Call("All Orders - Brand '" + BRAND + "'", "GET", 
            BaseAPI + "/order/location/brand/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
        } 
        
        JOB_Api_Call("All Orders - Location '" + UnitNum + "'", "GET", 
            BaseAPI + "/order/location/" + UnitID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
                
        JOB_Api_Call("All Orders - Group '" + SITE + "'", "GET", 
            BaseAPI + "/order/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
                   
    }
}
