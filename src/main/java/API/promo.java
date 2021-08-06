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
      

    }
    private Date release_date = new DateTime(new Date()).plusDays(1).toDate();
    private String RELEASE_DATE_SECONDS = new SimpleDateFormat(111 + "mm:ss.SSS").format(release_date);
    private String PROMO_START_DAY = new SimpleDateFormat("d").format(release_date);
    private String PROMO_START_MONTH = new SimpleDateFormat("M").format(release_date);
    private String PROMO_START_YEAR = new SimpleDateFormat("yyyy").format(release_date);
    private String Promo_Voucher_Id = "";
    private String Promo_Voucher_Code = "";

    //private List<String> PROMOTION_IDS;
    protected void run() {
        Auth = "Bearer " + AP3_TKN;  // ===============  AP3 promo ==============================
        PROMO_VOUCHER_IDS = new ArrayList<>();
        
        JOB_Api_Call("Promo > /promo/company/'CompanyID'/location/group/'SiteID'", "GET",
                BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        promoVoucherAPIs();
        // promoAPIs();
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

   
}
