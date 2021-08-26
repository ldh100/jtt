package API;

import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

class order extends API_GUI{
    protected order(API_GUI a) {
        app = a.app;
        AppID = a.AppID;
        env = a.env;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
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
        if (env != "PR") {
            PLACE_ORDERS();
        }
        
        Auth = "Bearer " + Mobile_User_TKN;
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders - last 7 days", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + "&end=" + m1 + "&order_type=all", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
        
        Auth = "Bearer " + AP3_TKN;
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
    private void PLACE_ORDERS(){
        Auth = "Bearer " + Mobile_User_TKN;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        //Date requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1)) *1000L);
        Date requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(0)) * 1000L);
        String Requested_Date = sdf.format(requested_date);        

        requestParams = new JSONObject();       //  Mobile User Place Pickup Order  =================
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

        Auth = "Bearer " + AP3_TKN;
        requestParams = new JSONObject();   //  Update Pickup Order  =================
        JSONObject isP = new JSONObject();      
        isP.put("in_progress", true);
        isP.put("ready", true);  
        requestParams.put("is", isP); 
        BODY = requestParams.toString();
        JOB_Api_Call("Update Pickup Order Status - ready", "PATCH", 
            BaseAPI + "/order/" + Order_Pickup_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){           
            AAA = json.toString(4);  // Check actual update
        }        
        requestParams = new JSONObject();       //  Mobile User Pickup Order Issue =================  
        JSONArray items = new JSONArray();   
        JSONObject item_1 = new JSONObject();
            item_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            item_1.put("_index", "abcd");
            item_1.put("quantity", 1);
            item_1.put("unit", 1);    
            item_1.put("price", new JSONObject().put("amount", 0.05));
            item_1.put("_subtotal", new JSONObject().put("amount", 2.0));
            item_1.put("_promo", new JSONObject().put("amount", 0));
            item_1.put("_loyalty", new JSONObject().put("amount", 0));
            item_1.put("meta", new JSONObject());
            item_1.put("options", new JSONArray());
            item_1.put("reason", "Test Item reason");  
        items.put(item_1);
        requestParams.put("type", "DISPUTE");  
        requestParams.put("items", items); 
        requestParams.put("reason", "Test Order Issue DISPUTE"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Pickup Order - Issue/Dispute", "POST", 
            BaseAPI + "/order/" + Order_Pickup_ID + "/issue", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
        
        Realm = A.Func.Realm_ID("AP3", env);
        String Fresh_TKN = "";
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 Admin Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){ 
            try {
                if(json.has("token")) Fresh_TKN = json.getString("token");  
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }    
        Auth = "Bearer " + Fresh_TKN;
        requestParams = new JSONObject();       //  Pickup Order Refund =================
        JSONArray refunds = new JSONArray();  
        JSONObject refund_1 = new JSONObject();
            refund_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            refund_1.put("_index", "abcd");
            refund_1.put("quantity", 1);  
            refund_1.put("price", new JSONObject().put("amount", 1.0));
            refund_1.put("reason", "Test Refund reason");  
        refunds.put(refund_1);
        requestParams.put("refunds", refunds); 
        requestParams.put("reason", "Test Order Refund"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Pickup Order - Refund", "PATCH", 
            BaseAPI + "/order/" + Order_Pickup_ID + "/refund", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }         
        
        Auth = "Bearer " + Mobile_User_TKN;
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
        JSONObject isD = new JSONObject();      
        isD.put("in_progress", true);
        isD.put("ready", true);
        //is.put("out_for_delivery", true);        
        requestParams.put("is", isD); 
        BODY = requestParams.toString();
        JOB_Api_Call("Update Delivery Order Status - ready", "PATCH", 
            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){           
            AAA = json.toString(4);  // Check actual update
        }         
    }
}
