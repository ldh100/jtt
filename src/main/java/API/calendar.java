package API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import org.json.JSONObject;

class calendar extends API_GUI {

    protected calendar(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }

    protected void run() {
        String Closure_ID = "";
        Auth = "Bearer " + AP3_TKN;   // =============== AP3 calendar ===========================

        JOB_Api_Call("Calendar > /'BrandID'/ CDL compatible format for next 7 days", "GET",
                BaseAPI + "/calendar/" + BrandID + "/cdl", Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("Calendar > /'BrandID'", "OPTIONS",
                BaseAPI + "/calendar/" + BrandID, Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("Calendar > /'BrandID'", "GET",
                BaseAPI + "/calendar/" + BrandID, Auth, "", 200, ParentTest, "no_jira");

        LocalTime midnight = LocalTime.MIDNIGHT; // New Closure", "PUT", 
        LocalDate today = LocalDate.now();
        LocalDateTime todayMidnight = LocalDateTime.of(today, midnight);
        long START = todayMidnight.plusDays(1).toEpochSecond(ZoneOffset.UTC);
        long END = todayMidnight.plusDays(1).plusHours(1).toEpochSecond(ZoneOffset.UTC);

        JSONObject data = new JSONObject();
        data.put("title", "JTT Test API ID " + NewID);
        data.put("color", "#ff8c84");
        data.put("calendar", "holiday");

        JSONObject schedule_details = new JSONObject();
        schedule_details.put("duration", 1);
        schedule_details.put("start", START);
        schedule_details.put("end", END);

        JSONObject schedule = new JSONObject();
        schedule.put("schedule", schedule_details);
        schedule.put("data", data);
        JSONObject new_json = json;
        new_json.getJSONArray("events").put(schedule);

        BODY = new_json.toString();
        JOB_Api_Call("Calendar > /'BrandID'/ Override > New Closure", "PUT",
                BaseAPI + "/calendar/" + BrandID, Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Closure_ID = json.getString("id");
            } catch (Exception ex) {
                String AAAA = ex.getMessage();
            }
        }

        BODY = json.toString();
        JOB_Api_Call("Calendar > /'BrandID'/ Override > Delete New Closure", "PUT",
                BaseAPI + "/calendar/" + BrandID, Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Closure_ID = json.getString("id");
            } catch (Exception ex) {
                String AAAA = ex.getMessage();
            }
        }
        JOB_Api_Call("Calendar > /'BrandID'/ Synchronization", "POST",
                BaseAPI + "/calendar/" + BrandID + "/sync", Auth, "", 200, ParentTest, "no_jira");

    }
}
