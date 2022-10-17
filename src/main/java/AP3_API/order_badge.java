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
So all email for dispute will got to ”frictionlesssupport@mailsac.com" right ?
Dev, staging and prod

Tokariev, Sviatoslav
yes
https://mailsac.com/inbox/frictionlesssupport@mailsac.com
Free hosted email for your domain with no signup, disposable email, forwarding, webhooks, REST and websockets APIs for developers.
Tokariev, Sviatoslav
I guess the functionality was never official ( it’s not even configured in AP3)
I just migrated it from orders to email service
*/

class order_badge extends AP3_API_GUI{
    protected order_badge(AP3_API_GUI a) {
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
        Auth = "Basic " + Base64.getEncoder().encodeToString((MOBILE_ID + ":" + MOBILE_PW).getBytes());       
        JOB_Api_Call("Mobile User Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try {
                if(json.has("user")) Mobile_User_ID = json.getString("user"); 
                if(json.has("token")) Mobile_User_TKN = json.getString("token");  
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
        if (env.equals("DE")) {
            PLACE_ORDERS();
        }                   
    }

    private void PLACE_ORDERS(){
        Auth = "Bearer " + Mobile_User_TKN;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        //requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1)) *1000L);
        requested_date = new Date();
        Requested_Date = sdf.format(requested_date);        

        requestParams = new JSONObject();       //  Mobile User Place Pickup Badge Pay Order  =================
        requestParams.put("location_brand", BrandID); // ????
        requestParams.put("customer", Mobile_User_ID);
        requestParams.put("pickup_name", env + " Badge Pay");
        requestParams.put("pickup", Requested_Date);
        requestParams.put("requested_date", Requested_Date);
        requestParams.put("shoppingcart", "Okaq5m8j53T46p0mLLzXtJPNvR700OTJAz2N6AOBSa6Kp5vAJLsBaAEq82NGhyejaWo"); //ShoppingCart_Pickup_ID);
        JSONObject payment = new JSONObject();
        JSONObject badge_pay = new JSONObject();
        badge_pay.put("id", "???");       /// 
        badge_pay.put("tender", "???");   /// 
//badge_pay.put("total", "???");  // <<<< no need in POST
//badge_pay: {
//        id: 'dXJ4JlaldWU4wWW0LrOPCgj294XrRkIRD1Z7JL2mT4aKqoGNEXc0M67JMWyRf9magP0ez3tQ3ojYMprrhJ7wmMNzpkFr2E3Yo737h6REyZQ12lTjwN2QNRoBS7qwjZ4Kj7FwAL51qBZoIXAoJvq6JBS9Qklwy',
//        total: 0.01,
//        tender: '8P5p5rYrgRfBEkkLr5YGSN27jJlJg2HJzgazRaXlSjvqvegpY7urP',
//}
        payment.put("badge_pay", badge_pay);
        requestParams.put("payment", payment); 
        BODY = requestParams.toString();  
        
        JOB_Api_Call("Place Pickup Order - Badge Pay", "POST", 
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
    }
}
