package API;

import java.text.SimpleDateFormat;
import java.util.Date;

class order extends API_GUI{
    protected order(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
        
        ShoppingCart_ID = a.ShoppingCart_ID;
        MENU_TIMESLOTS = a.MENU_TIMESLOTS;
        BRAND_TIMESLOTS = a.BRAND_TIMESLOTS;
        DELIEVERY_DESTINATIONS = a.DELIEVERY_DESTINATIONS;
        ShoppingCart_ID = a.ShoppingCart_ID;
        Payment_TKN = a.Payment_TKN;
    }
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;
        
        Date requeste_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1))*1000L);
        //Date requeste_date = new Date(Long.parseLong(MENU_TIMESLOTS.get(MENU_TIMESLOTS.size() - 1))*1000L);
        String Requeste_Date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(requeste_date);

//        BODY = "{" +                                                //  Mobile User Place Delivery Order  =================
//                "\"location_brand\":\"" + BrandID + "\"," + 
//                "\"customer\":\"" + Mobile_User_ID + "\"," +  
//                "\"details\":" +                                   
//                    "{\"contact_number\":\"4165551234\"," +
//                    "\"destination\":\"" + DELIEVERY_DESTINATIONS.get(0) + "\"," +
//                    "\"duration\":\"" + "00:30:00" + "\"," +
//                    "\"instructions\":\"" + "Discard this Order" + "\"," +
//                    "\"name\":\"" + "JTT API Test Delivery" + "\"," +
//                    "\"order_type\":\"delivery\"}," + 
//                "\"payment\":" + 
//                    "{\"token\":\"" + Payment_TKN + "\"}," +
//                "\"requested_date\":\"" + Requeste_Date + "\"," +
//                "\"shoppingcart\":\"" + ShoppingCart_ID + 
//                "\"}";        
//        JOB_Api_Call("Place Delivery Order", "POST", 
//            BaseAPI + "/order", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            String AAA = "JSON";
//        }
        
        BODY = "{" +                                               //  Mobile User Place Pickup Order  =================
                "\"location_brand\":\"" + BrandID + "\"," + 
                "\"customer\":\"" + Mobile_User_ID + "\"," +  
                "\"details\":" +                                   
                    "{\"contact_number\":\"4165551234\"," +
                    "\"name\":\"" + "JTT API Test Pickup" + "\"," +
                    "\"order_type\":\"pickup\"}," + 
                "\"payment\":" + 
                    "{\"token\":\"" + Payment_TKN + "\"}," +
                "\"requested_date\":\"" + Requeste_Date + "\"," +
                "\"shoppingcart\":\"" + ShoppingCart_ID + 
                "\"}";        
        JOB_Api_Call("Place Pickup Order", "POST", 
            BaseAPI + "/order?lang=en", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            String AAA = "JSON";
        }        
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders - last 7 days", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1, Auth, "", 200, ParentTest, "no_jira");

    }
}
