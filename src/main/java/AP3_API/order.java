package AP3_API;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;

/* Email for DISPUTE
So this functionality was developed long time ago for Frictionless.
It either sends an email specified in location_brand(Station)’s private config, or to
frictionlesssupport@mailsac.com

Tokariev, Sviatoslav
So to send to custom email, you need to update https://api.compassdigital.org/dev/config/$ORDER_BRAND_ID$
{dispute_email: 'keyur.patel@compassdigital.io', ...rest of private config}
or the email will go to
frictionlesssupport@mailsac.com

Patel, Keyur
So all email for dispute will got to ”
frictionlesssupport@mailsac.com" right ?
Dev , staging and prod

Tokariev, Sviatoslav
yes
https://mailsac.com/inbox/frictionlesssupport@mailsac.com
Free hosted email for your domain with no signup, disposable email, forwarding, webhooks, REST and websockets APIs for developers.
Tokariev, Sviatoslav
I guess the functionality was never official ( it’s not even configured in AP3)
I just migrated it from orders to email service
*/

class order extends AP3_API_GUI{
    protected order(AP3_API_GUI a) {
        app = a.app;
        AppID = a.AppID;
        env = a.env;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
        AP3_TKN = a.AP3_TKN;
        BaseAPI = a.BaseAPI;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;

        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        Bolter_Site_ID = a.Bolter_Site_ID;
        
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
        DELIEVEY_TIMESLOTS = a.DELIEVEY_TIMESLOTS;        
        DELIEVERY_DESTINATIONS = a.DELIEVERY_DESTINATIONS;
        
        ShoppingCart_Delivery_ID = a.ShoppingCart_Delivery_ID;
        ShoppingCart_Pickup_ID = a.ShoppingCart_Pickup_ID;
        
        Item_Index = a.Item_Index;
        EXACT_Payment_TKN = a.EXACT_Payment_TKN;
        FP_Payment_TKN = a.FP_Payment_TKN;
    }
    JSONObject requestParams = null;
    JSONObject Task = null;
    String TaskID = "";
    String AAA = "";
    String Requested_Date = "";
    Date requested_date;
    long START;
    
    protected void run() {  
//        if (!env.equals("PR")) {
//            PLACE_ORDERS();
//        }
        
        Auth = "Bearer " + Mobile_User_TKN;
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders - last 7 days", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + "&end=" + m1 + "&order_type=all", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
        

//        JOB_Api_Call("Mobile User All Orders - Brand '" + BRAND + "'", "GET", 
//            BaseAPI + "/order/customer/" + Mobile_User_ID + "/location/brand/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            // Info Found Orders Count
//            AAA = json.toString(4);
//        } 

        Auth = "Bearer " + AP3_TKN;
        JOB_Api_Call("All Orders - Location/Brand '" + BRAND + "'", "GET", 
            BaseAPI + "/order/location/brand/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
        
        JOB_Api_Call("All Orders - Location/Unit '" + UnitNum + "'", "GET", 
            BaseAPI + "/order/location/" + UnitID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 
                
        JOB_Api_Call("All Orders - Location/Group(Site) '" + SITE + "'", "GET", 
            BaseAPI + "/order/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            // Info Found Orders Count
            AAA = json.toString(4);
        } 

        if (!env.equals("PR")) {
            PLACE_ORDERS();
            DELIVERY_TASK();
        }                   
    }

    private void PLACE_ORDERS(){
        Auth = "Bearer " + Mobile_User_TKN;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1)) *1000L);
        //requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(0)) * 1000L);
        Requested_Date = sdf.format(requested_date);        

        requestParams = new JSONObject();       //  Mobile User Place Pickup Order  =================
        requestParams.put("location_brand", BrandID);
        requestParams.put("customer", Mobile_User_ID);
        requestParams.put("pickup_name", env + " JTT API Test Pickup");
        requestParams.put("pickup", Requested_Date);
        requestParams.put("requested_date", Requested_Date);
        requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
        JSONObject payment = new JSONObject();
        payment.put("token", FP_Payment_TKN); // EXACT_Payment_TKN  - no more EXACT
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

        JSONArray items;   
        JSONObject item_1;        
        requestParams = new JSONObject();       //  Mobile User Pickup Order Issue DISPUTE =================  
        items = new JSONArray();   
        item_1 = new JSONObject();
            item_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            item_1.put("_index", Item_Index);
            item_1.put("quantity", 1);
            item_1.put("unit", 1);    
            item_1.put("price", new JSONObject().put("amount", 0.05));
            item_1.put("_subtotal", new JSONObject().put("amount", 2.0));
            item_1.put("_promo", new JSONObject().put("amount", 0));
            item_1.put("_loyalty", new JSONObject().put("amount", 0));
            item_1.put("meta", new JSONObject());
            item_1.put("options", new JSONArray());
            item_1.put("reason", "Test type DISPUTE");  
        items.put(item_1);
        requestParams.put("type", "DISPUTE");  
        requestParams.put("items", items); 
        requestParams.put("reason", "Test Order Issue DISPUTE"); 
        BODY = requestParams.toString();
        
        JOB_Api_Call("Pickup Order - Issue/DISPUTE", "POST", 
            BaseAPI + "/order/" + Order_Pickup_ID + "/issue", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 
        
        requestParams = new JSONObject();       //  Mobile User Pickup Order Issue LATE =================  
        items = new JSONArray();   
        item_1 = new JSONObject();
            item_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            item_1.put("_index", Item_Index);
            item_1.put("quantity", 1);
            item_1.put("unit", 1);    
            item_1.put("price", new JSONObject().put("amount", 0.05));
            item_1.put("_subtotal", new JSONObject().put("amount", 2.0));
            item_1.put("_promo", new JSONObject().put("amount", 0));
            item_1.put("_loyalty", new JSONObject().put("amount", 0));
            item_1.put("meta", new JSONObject());
            item_1.put("options", new JSONArray());
            item_1.put("reason", "Test type LATE");  
        items.put(item_1);
        requestParams.put("type", "LATE");  
        requestParams.put("items", items); 
        requestParams.put("reason", "Test Order Issue LATE"); 
        BODY = requestParams.toString();
        
        JOB_Api_Call("Pickup Order - Issue/LATE", "POST", 
            BaseAPI + "/order/" + Order_Pickup_ID + "/issue", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        } 

        requestParams = new JSONObject();       //  Mobile User Pickup Order Issue SEE_KITCHEN =================  
        items = new JSONArray();   
        item_1 = new JSONObject();
            item_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            item_1.put("_index", Item_Index);
            item_1.put("quantity", 1);
            item_1.put("unit", 1);    
            item_1.put("price", new JSONObject().put("amount", 0.05));
            item_1.put("_subtotal", new JSONObject().put("amount", 2.0));
            item_1.put("_promo", new JSONObject().put("amount", 0));
            item_1.put("_loyalty", new JSONObject().put("amount", 0));
            item_1.put("meta", new JSONObject());
            item_1.put("options", new JSONArray());
            item_1.put("reason", "Test type SEE_KITCHEN");  
        items.put(item_1);
        requestParams.put("type", "SEE_KITCHEN");  
        requestParams.put("items", items); 
        requestParams.put("reason", "Test Order Issue SEE_KITCHEN"); 
        BODY = requestParams.toString();
        
        JOB_Api_Call("Pickup Order - Issue/SEE_KITCHEN", "POST", 
            BaseAPI + "/order/" + Order_Pickup_ID + "/issue", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }    
        
        requestParams = new JSONObject();       //  Mobile User Pickup Order Issue DELIVERY_ISSUE =================  
        items = new JSONArray();   
        item_1 = new JSONObject();
            item_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            item_1.put("_index", Item_Index);
            item_1.put("quantity", 1);
            item_1.put("unit", 1);    
            item_1.put("price", new JSONObject().put("amount", 0.05));
            item_1.put("_subtotal", new JSONObject().put("amount", 2.0));
            item_1.put("_promo", new JSONObject().put("amount", 0));
            item_1.put("_loyalty", new JSONObject().put("amount", 0));
            item_1.put("meta", new JSONObject());
            item_1.put("options", new JSONArray());
            item_1.put("reason", "Test Item DELIVERY_ISSUE");  
        items.put(item_1);
        requestParams.put("type", "DELIVERY_ISSUE");  
        requestParams.put("items", items); 
        requestParams.put("reason", "Test type DELIVERY_ISSUE"); 
        BODY = requestParams.toString();
        
        JOB_Api_Call("Pickup Order - Issue/DELIVERY_ISSUE", "POST", 
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
                AAA = ex.getMessage();
            }
        }    
        Auth = "Bearer " + Fresh_TKN;
        requestParams = new JSONObject();       //  Pickup Order Refund =================
        JSONArray refunds = new JSONArray();  
        JSONObject refund_1 = new JSONObject();
            refund_1.put("id", ITEMS_IDS.get(ITEMS_IDS.size() - 1)); 
            refund_1.put("_index", Item_Index);
            refund_1.put("quantity", 1);  
            refund_1.put("price", new JSONObject().put("amount", 0.01));
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
 
        if(DELIEVEY_TIMESLOTS.isEmpty()) {
            EX += " - " + "\t" + "Delivery" + "\t" + "Timeslots" + "\t" + "Empty - Cannot place Devilery Order" + "\t" + "WARN" + "\t" + " - "
                    + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "", ParentTest.createNode("Delivery Timeslots > Empty List - Cannot place Devilery Order"), new Date());
            return;
        }
  
        
        Auth = "Bearer " + Mobile_User_TKN;
        requested_date = new Date(Long.parseLong(DELIEVEY_TIMESLOTS.get(DELIEVEY_TIMESLOTS.size() - 1)) *1000L);
        Requested_Date = sdf.format(requested_date); 
        BODY = "{" +                                                //  Mobile User Place Delivery Order  =================
                "\"location_brand\":\"" + BrandID + "\"," + 
                "\"customer\":\"" + Mobile_User_ID + "\"," +  
                "\"details\":" +                                   
                    "{\"contact_number\":\"4165551234\"," +
                    "\"destination\":\"" + DELIEVERY_DESTINATIONS.get(0) + "\"," +
                    "\"duration\":\"" + "00:05:00" + "\"," +
                    "\"instructions\":\"" + "Discard this Order" + "\"," +
                    "\"name\":\"" + env + " JTT API Test Delivery" + "\"," +
                    "\"order_type\":\"delivery\"}," + 
                "\"payment\":" + 
                    "{\"token\":\"" + FP_Payment_TKN + "\"}," + // EXACT_Payment_TKN  - no more EXACT
                "\"requested_date\":\"" + Requested_Date + "\"," +
                "\"shoppingcart\":\"" + ShoppingCart_Delivery_ID + 
                "\"}";   
        
        JOB_Api_Call("Place Delivery Order", "POST", 
            BaseAPI + "/order", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null && json.has("id")){
            Order_Delivery_ID = json.getString("id");
        }               
//        Auth = "Bearer " + AP3_TKN;
//        requestParams = new JSONObject();   //  ADMIN User Update Delivery Order  =================
//        JSONObject isD = new JSONObject();      
//        isD.put("in_progress", true);
//        isD.put("ready", true);
//        //is.put("out_for_delivery", true);        
//        requestParams.put("is", isD); 
//        BODY = requestParams.toString();
//        
//        JOB_Api_Call("Update Delivery Order Status - ready", "PATCH", 
//            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
//        if(json != null){           
//            AAA = json.toString(4);  // Check actual update
//        }         
    }

    private void DELIVERY_TASK(){
        JSONObject TASK_GET = new JSONObject();
        JSONObject TASK_PATCH = new JSONObject();

        Auth = "Bearer " + AP3_TKN;
        JSONObject isD;

        ZoneOffset offset = OffsetDateTime.now(ZoneId.of(TimeZone.getDefault().getID())).getOffset();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = new Date();
        date.setTime(date.getTime() + 5000); // now + 5 sec
        String requested_date = dateFormat.format(date);

        requestParams = new JSONObject();   //  KDS User Update Delivery Order in_progress =================
        isD = new JSONObject();      
        isD.put("in_progress", true);   
        requestParams.put("is", isD); 
        requestParams.put("requested_date", requested_date);        
        BODY = requestParams.toString();
        
        JOB_Api_Call("KDS - Update Delivery Order Status > in_progress, requested date NOW + 10 sec", "PATCH", // ===================================
            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){           
            AAA = json.toString(4);  // Check actual update
        } 

        requestParams = new JSONObject();   //  KDS User Update Delivery Order ready, out_for_delivery =================
        isD = new JSONObject();      
        isD.put("ready", true);
        isD.put("out_for_delivery", true);        
        requestParams.put("is", isD); 
        BODY = requestParams.toString();
        
        JOB_Api_Call("KDS - Update Delivery Order Status > ready, out_for_delivery", "PATCH", 
            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        if(json != null){           
            AAA = json.toString(4);  // Check actual update
        } 

        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter Authentication > /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Bolter", 200, ParentTest, "no_jira");
        if(json != null){
            if(json.has("user")) Bolter_User_ID = json.getString("user"); 
            if(json.has("token")) Bolter_User_TKN = json.getString("token");  
            if(json.has("profile")){    
                Bolter_Site_ID = json.getJSONObject("profile").getString("location_group"); 
            }else{
                if(json.has("error")){
                    Bolter_Site_ID = "Not Found";
                }
            } 
        }
        
        try {
            Thread.sleep(10000); // wait for task creation      
        } catch (Exception e) {
        }

        Task = new JSONObject();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.setTimeZone(TimeZone.getTimeZone("UTC"));
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        START = cal.getTimeInMillis(); 

        Auth = "Bearer " + Bolter_User_TKN;           
        JOB_Api_Call("Bolter Task > 'SiteID' ?created today", "GET",  
            BaseAPI + "/task/location/group/" + SiteID + "?created=" + START, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            if(json.has("tasks")){
                JSONArray tasks = json.getJSONArray("tasks");
                for(int i = 0; i < tasks.length(); i++){
                    Task = tasks.getJSONObject(i); 
                    if(Task.getString("order_id").equals(Order_Delivery_ID) && Task.getString("status").equals("ready")){
                        TASK_GET = new JSONObject(Task.toMap());
                        TaskID = Task.getString("id");
                        AAA = TASK_GET.toString(4);
                    } 
                    JOB_Api_Call("Task " + (i+1) + " > Order", "GET",  
                        BaseAPI + "/task/order/" + Task.getString("order_id"), Auth, "", 200, ParentTest, "no_jira");
                    if(json != null){
                        AAA = json.toString(4);
                    }
                }
            }
        }

        TASK_PATCH = new JSONObject(TASK_GET.toMap());
        // TASK PATCH > in progress
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        TASK_PATCH.put("assignee", Bolter_User_ID);
        TASK_PATCH.put("started", sdf.format(new DateTime(new Date()).toDate()));
        TASK_PATCH = new JSONObject(TASK_GET.toMap());
        if(TASK_PATCH.has("modified")){
            TASK_PATCH.remove("modified");
            TASK_PATCH.put("modified", sdf.format(new DateTime(new Date()).toDate()));
        }
        TASK_PATCH.remove("status");
        TASK_PATCH.put("status", "out_for_delivery");
        BODY = TASK_PATCH.toString();
        JOB_Api_Call("Bolter Task Started > out_for_delivery", "PATCH",  // ===================================
            BaseAPI + "/task/" + TaskID, Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
        try {
            Thread.sleep(1000); // wait for task PATCH update      
        } catch (Exception e) {
        }

        //  TAsk PATCH > complete
        TASK_PATCH.put("completed", sdf.format(new DateTime(new Date()).toDate()));
        TASK_PATCH = new JSONObject(TASK_GET.toMap());
        if(TASK_PATCH.has("modified")){
            TASK_PATCH.remove("modified");
            TASK_PATCH.put("modified", sdf.format(new DateTime(new Date()).toDate()));
        }
        TASK_PATCH.remove("status");
        TASK_PATCH.put("status", "delivered");
        BODY = TASK_PATCH.toString();
        JOB_Api_Call("Bolter Task Completed > delivered", "PATCH",  // ===================================
            BaseAPI + "/task/" + TaskID, Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
        try {
            Thread.sleep(1000); // wait for task PATCH update      
        } catch (Exception e) {
        }
    }
}
