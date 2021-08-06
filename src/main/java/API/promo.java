package API;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.joda.time.DateTime;

class promo extends API_GUI {

    protected promo(API_GUI a) {
        app = a.app;
        env = a.env;
        AppID = a.AppID;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        CompanyID = a.CompanyID;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
        //ITEMS_IDS = a.ITEMS_IDS;

    }
    private Date release_date = new DateTime(new Date()).plusDays(1).toDate();
    private String RELEASE_DATE_SECONDS = new SimpleDateFormat(111 + "mm:ss.SSS").format(release_date);
    private String PROMO_START_DAY = new SimpleDateFormat("d").format(release_date);
    private String PROMO_START_MONTH = new SimpleDateFormat("M").format(release_date);
    private String PROMO_START_YEAR = new SimpleDateFormat("yyyy").format(release_date);
    private String Promo_Voucher_Id = "";
    private String Promo_Voucher_Code = "";
    private List<String> PROMO_VOUCHER_IDS = new ArrayList<>();
    private List<String> PROMOTION_IDS = new ArrayList<>();

    protected void run() {
        Auth = "Bearer " + AP3_TKN;  // ===============  AP3 promo ==============================

        JOB_Api_Call("Promo > /promo/company/'CompanyID'/location/group/'SiteID'", "GET",
                BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        promoVoucherAPIs();
        //promoAPIs();
    }

    protected void promoVoucherAPIs() {
        //<editor-fold defaultstate="collapsed" desc="POST promo voucher">
        // Test Scenario 1: Positive flow to POST promo voucher with AMOUNT type
        BODY = "{"
                + "\"code\":\"LOCATION-" + RELEASE_DATE_SECONDS + "\","
                + "\"discount\":{"
                + "\"type\":\"AMOUNT\","
                + "\"amount_off\":1"
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":false"
                + "},"
                + "\"active\":false,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - POST add new promo voucher with AMOUNT type", "POST", BaseAPI + "/promo/voucher", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                // Promo_Voucher_Id = json.getString("id");
                Promo_Voucher_Code = json.getString("code");
                PROMO_VOUCHER_IDS.add(json.getString("id"));
            } catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow to POST promo voucher with PERCENTAGE type
        BODY = "{"
                + "\"code\":\"LOCATION-12" + RELEASE_DATE_SECONDS + "\","
                + "\"discount\":{"
                + "\"type\":\"PERCENT\","
                + "\"percent_off\":\"1\""
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":false"
                + "},"
                + "\"active\":false,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - POST add new promo voucher  with PERCENTAGE type", "POST", BaseAPI + "/promo/voucher", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {

                PROMO_VOUCHER_IDS.add(json.getString("id"));
            } catch (Exception ex) {
            }
        }
        // Test Scenario 3: Negative flow to POST promo voucher without code
        BODY = "{"
                + "\"code\":\"\","
                + "\"discount\":{"
                + "\"type\":\"AMOUNT\","
                + "\"amount_off\":1"
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":false"
                + "},"
                + "\"active\":false,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - POST Negative flow to add promo voucher without code", "POST", BaseAPI + "/promo/voucher", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 4: Negative flow to POST promo voucher without promo type
        BODY = "{"
                + "\"code\":\"LOCATION- 12" + RELEASE_DATE_SECONDS + "\","
                + "\"discount\":{"
                + "\"type\":\"\","
                + "\"amount_off\":1"
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":false"
                + "},"
                + "\"active\":false,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - POST Negative flow to add promo voucher without valid type", "POST", BaseAPI + "/promo/voucher", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT promo voucher">
        // Test Scenario 1: Positive flow to update newly created promo voucher
        BODY = "{"
                + "\"code\":\"" + Promo_Voucher_Code + "\","
                + "\"discount\":{"
                + "\"type\":\"PERCENT\","
                + "\"percent_off\":\"1\""
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test for update promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":true"
                + "},"
                + "\"active\":true,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher", "PUT", BaseAPI + "/promo/voucher/" + PROMO_VOUCHER_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");

        // Test Scenario 2: Negative flow to update newly created promo voucher without valid code
        BODY = "{"
                + "\"code\":\"\","
                + "\"discount\":{"
                + "\"type\":\"AMOUNT\","
                + "\"amount_off\":1"
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test for update promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":true"
                + "},"
                + "\"active\":true,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher without code", "PUT", BaseAPI + "/promo/voucher/" + PROMO_VOUCHER_IDS.get(0), Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 3: Negative flow to update newly created promo voucher without valid type
        BODY = "{"
                + "\"code\":\"" + Promo_Voucher_Code + "\","
                + "\"discount\":{"
                + "\"type\":\"\","
                + "\"amount_off\":1"
                + "},"
                + "\"metadata\":{"
                + "\"name\":\"This is API test for update promo voucher\","
                + "\"location_id\":\"" + SiteID + "\","
                + "\"is_mealplan_promo\":true"
                + "},"
                + "\"active\":true,"
                + "\"app\":\"" + app + "\""
                + "}";
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher without type", "PUT", BaseAPI + "/promo/voucher" + PROMO_VOUCHER_IDS.get(0), Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DELETE promo voucher">

        // Test Scenario 1: Positive flow to DELETE newly created promo voucher
        if (PROMO_VOUCHER_IDS != null) {
            for (int i = 0; i < PROMO_VOUCHER_IDS.size(); i++) {
                JOB_Api_Call("Promotion - DELETE newly added promo voucher : " + PROMO_VOUCHER_IDS.get(i) + "", "DELETE", BaseAPI + "/promo/voucher/" + PROMO_VOUCHER_IDS.get(i), Auth, BODY, 200, ParentTest, "no_jira");
            }
        }
        //</editor-fold>
    }

    protected void promoAPIs() {
        //<editor-fold defaultstate="collapsed" desc="POST promotions">
        // Test Scenario 1: Positive flow to POST/ADD new promotion - Limited Time Offer (amount_off)
        BODY = "{"
                + "\"label\":{"
                + "\"en\":\"This is API Test for promotion - Limited Time Offer (amount_off)\""
                + "},"
                + "\"description\":{"
                + "\"en\":\"This is test description\""
                + "},"
                + "\"multigroup\":\"" + AppID + "\","
                + "\"company\":\"" + CompanyID + "\","
                + "\"location_group_ids\":["
                + "\"" + SiteID + "\""
                + "],"
                + "\"type\":\"lto\","
                + "\"badge\":{"
                + "\"en\":\"API PROMO\","
                + "\"fr\":\"API PROMO\""
                + "},"
                + "\"status\":\"scheduled\","
                + "\"items\":{"
                + "\"main\":["
                + "{"
                + "\"id\":\"D5BmG6J8jotO7mrAMz0Xtw9k7wBYPJc3Dw05GKB3i2yPaAPM8aiQ5zgAJy5oI5QrPvL\","
                + "\"quantity\":1,"
                + "\"price\":{"
                + "\"amount\":5"
                + "},"
                + "\"label\":{"
                + "\"en\":\"French vanilla\""
                + "},"
                + "\"discount\":{"
                + "\"amount_off\":1,"
                + "\"percent_off\":null"
                + "}"
                + "}"
                + "],"
                + "\"additional\":["
                + "]"
                + "},"
                + "\"calendar\":{"
                + "\"events\":["
                + "{"
                + "\"data\":{"
                + "\"calendar\":\"hours\""
                + "},"
                + "\"schedule\":{"
                + "\"start\":{"
                + "\"year\":" + PROMO_START_YEAR + ","
                + "\"month\":" + PROMO_START_MONTH + ","
                + "\"day\":" + PROMO_START_DAY + ","
                + "\"hour\":0,"
                + "\"minute\":0"
                + "},"
                + "\"end\":{"
                + "\"year\":" + PROMO_START_YEAR + ","
                + "\"month\":" + PROMO_START_MONTH + ","
                + "\"day\":" + PROMO_START_DAY + ","
                + "\"hour\":23,"
                + "\"minute\":59"
                + "},"
                + "\"times\":["
                + "\"00:00\""
                + "],"
                + "\"duration\":720,"
                + "\"durationUnit\":\"minutes\","
                + "\"dayOfWeek\":["
                + "0,"
                + "1,"
                + "2,"
                + "3,"
                + "4,"
                + "5,"
                + "6"
                + "]"
                + "}"
                + "}"
                + "],"
                + "\"timezones\":{"
                + "\"" + SiteID + "\":\"America/Toronto\""
                + "}"
                + "}"
                + "}";
        JOB_Api_Call("Promotion - POST Positive flow to add new promotion - Limited Time Offer (amount_off)", "POST", BaseAPI + "/promo", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {

                PROMOTION_IDS.add(json.getString("id"));
            } catch (Exception ex) {
            }
        }
        // System.err.println("vvvva"+ITEMS_IDS.get(0));
        // Test Scenario 2: Positive flow to POST/ADD new promotion - BOGO
        // Test Scenario 3: Positive flow to POST/ADD new promotion - Bundle
        // Test Scenario 4: Negative flow to POST/ADD new promotion without valid promo label
        // Test Scenario 5: Negative flow to POST/ADD new promotion without valid Multipgroup/APP Id
        // Test Scenario 6: Negative flow to POST/ADD new promotion without valid Company/Group Id
        // Test Scenario 7: Negative flow to POST/ADD new promotion without valid Secror/Site Id
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="PUT promotions">
        //Test Scenario 1: Positive flow to update & PAUSE newly added promotion 
        // Test Scenario 2: Positive flow to update newly added promotion - Limited Time Offer (Percent_off)
        // Test Scenario 3: Positive flow to update newly added promotion - BOGO
        // Test Scenario 4: Positive flow to update newly added - Bundle
        // Test Scenario 5: Negative flow to update newly added promotion without valid promo label
        // Test Scenario 6: Negative flow to update newly added promotion without valid Multipgroup/APP Id
        // Test Scenario 7: Negative flow to update newly added promotion without valid Company/Group Id
        // Test Scenario 8: Negative flow to update newly added promotion without valid Sector/Site Id
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="GET promotions">
        // Test Scenario 1: Positive flow to GET promotions by ID
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DELETE promotions">
        // Test Scenario 1: Positive flow to DELETE newly created promotions
        if (PROMOTION_IDS != null) {
            for (int i = 0; i < PROMOTION_IDS.size(); i++) {
                JOB_Api_Call("Promotion - Delete newly created promotion by ID : - " + PROMOTION_IDS.get(i), "DELETE", BaseAPI + "/promo/" + PROMOTION_IDS.get(i), Auth, "", 200, ParentTest, "no_jira");
            }
        }
        //</editor-fold>
    }
}
