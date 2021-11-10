package API;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;

class notification extends API_GUI {

    protected notification(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    String Notification_ID = "";
    
    protected void run() {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        Auth = "Bearer " + AP3_TKN;   // =============== AP3 Resent Updates===========================
        
         // Test Scenario 0: Get all notification with start/end as in AP3
        Date _ee = new DateTime(new Date()).toDate();
        String _EE = sdf.format(_ee);         
        JOB_Api_Call("AP3 Recent Updates - end 10 days ago", "GET",
                BaseAPI + "/notification?realm=cdl&target=admin_panel&start=1970-01-01T00:00:00.000Z&end=" + _EE, Auth, "", 200, ParentTest, "no_jira");

        // <editor-fold defaultstate="collapsed" desc="POST Notification > RELEASE_DATE">
        // Test Scenario 1: Positive flow for post new notification                
        Date release_date = new DateTime(new Date()).plusMinutes(2).toDate(); //plusHours(4).plusMinutes(1).toDate();
        String RELEASE_DATE = sdf.format(release_date);

        BODY = "{\"text\":\"This is text for post new notification description\","
                + "\"title\":\"Test title - Post " + RELEASE_DATE + "\","
                + "\"realm\":\"cdl\","
                + "\"target\":\"admin_panel\","
                + "\"release_date\":\"" + RELEASE_DATE + "\"}";
        JOB_Api_Call("AP3 add new notification", "POST", BaseAPI + "/notification/", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Notification_ID = json.getString("id");
            }
            catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }

        // Test Scenario 2: Negative flow with null text values
        BODY = "{\"text\":\"\","
                + "\"title\":\"Test title - Post " + RELEASE_DATE + "\","
                + "\"realm\":\"cdl\",\"target\":\"admin_panel\","
                + "\"release_date\":\"" + RELEASE_DATE + "\"}";
        JOB_Api_Call("AP3 add new notification - Negative flow with null text values", "POST", BaseAPI + "/notification/", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 3: Negative flow with null realm id
        BODY = "{\"text\":\"This is text for post new notification description\","
                + "\"title\":\"Test title - Post " + RELEASE_DATE + "\","
                + "\"realm\":\"\","
                + "\"target\":\"admin_panel\","
                + "\"release_date\":\"" + RELEASE_DATE + "\"}";
        JOB_Api_Call("AP3 add new notification - Negative flow with null realm id", "POST", BaseAPI + "/notification/", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 4: Negative flow with null target value
        BODY = "{\"text\":\"This is text for post new notification description\","
                + "\"title\":\"Test title - Post " + RELEASE_DATE + "\","
                + "\"realm\":\"cdl\","
                + "\"target\":\"\","
                + "\"release_date\":\"" + RELEASE_DATE + "\"}";
        JOB_Api_Call("AP3 add new notification - Negative flow with null target value", "POST", BaseAPI + "/notification/", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 5: Negative flow with past release date
        Date _e = new DateTime(new Date()).minusDays(1).toDate();
        String _E = sdf.format(_e);
        BODY = "{\"text\":\"This is text for post new notification description\"," +
                "\"title\":\"Test title - Post " + _E + "\"," +
                "\"realm\":\"cdl\"," + 
                "\"target\":\"admin_panel\"," +
                "\"release_date\":\"" + _E + "\"}";
        JOB_Api_Call("AP3 add new notification - Negative flow with past release date", "POST", BaseAPI + "/notification/", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="GET Notification">
        

        // Test Scenario 1: Positive get all notification 
        JOB_Api_Call("AP3 Recent Updates - end 10 days ago", "GET",
                BaseAPI + "/notification?realm=cdl&target=admin_panel&end=" + _E, Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive get all notification 
        JOB_Api_Call("AP3 Recent Updates - no start/end date", "GET",
                BaseAPI + "/notification?realm=cdl&target=admin_panel", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            NOTIFICATION_IDS = new ArrayList<>();
            try {
                JSONArray notificationArray = json.getJSONArray("notifications");
                for (int i = 0; i < notificationArray.length(); i++) {
                    JSONObject notificationObject = notificationArray.getJSONObject(i);
                    NOTIFICATION_IDS.add(notificationObject.getString("id"));
                }
            }
            catch (Exception ex) {               
                AAA = ex.getMessage();
            }
        }
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" PATCH Notification">This method will send PUT request to update notification title and text
        // Test Scenario 1: Positive flow for patch notification by ID
        BODY = "{\"text\":\"This is text for update notification\","
                + "\"title\":\"Test title - edited " + _E + "\","
                + "\"realm\":\"cdl\","
                + "\"target\":\"admin_panel\"}";
        JOB_Api_Call("AP3 Update Notification Title and Text", "PATCH",
                BaseAPI + "/notification/" + Notification_ID, Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to update notification with null text values
        BODY = "{\"text\":\"\","
                + "\"title\":\"Test title - Post " + RELEASE_DATE + "\","
                + "\"realm\":\"cdl\","
                + "\"target\":\"admin_panel\","
                + "\"release_date\":\"" + RELEASE_DATE + "\"}";
        JOB_Api_Call("AP3 update notification - Negative flow with null text values", "PATCH", BaseAPI + "/notification/" + Notification_ID, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" POST set a notification status ">
        // Test Scenario 1: Positive flow to set read status - True
        BODY = "{\"status\":"
                + "{\"read\": true}"
                + "}";
        JOB_Api_Call("AP3 set notification status true", "POST", BaseAPI + "/notification/" + Notification_ID + "/status", Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive flow to set read status - False
        BODY = "{\"status\":"
                + "{\"read\":false}"
                + "}";
        JOB_Api_Call("AP3 set notification status false", "POST", BaseAPI + "/notification/" + Notification_ID + "/status", Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc=" DELETE Notification">
        // Test Scenario 1: Positive flow for delete notification by ID
        JOB_Api_Call("AP3 Delete Notification by ID", "DELETE", BaseAPI + "/notification/" + Notification_ID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

    }
}
