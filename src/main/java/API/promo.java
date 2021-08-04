package API;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;

class promo extends API_GUI {

    protected promo(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        CompanyID = a.CompanyID;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;

    }
    private Date release_date = new DateTime(new Date()).plusHours(4).plusMinutes(1).toDate();
    private String RELEASE_DATE_SECONDS = new SimpleDateFormat(111 + "mm:ss.SSS").format(release_date);
    private String Promo_Voucher_Id = "";
    private String Promo_Voucher_Code = "";

    protected void run() {

        Auth = "Bearer " + AP3_TKN;  // ===============  AP3 promo ==============================
        JOB_Api_Call("Promo > /promo/company/'CompanyID'/location/group/'SiteID'", "GET",
                BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        promoVoucherAPIs();
    }

    protected void promoVoucherAPIs() {
        //<editor-fold defaultstate="collapsed" desc="POST promo voucher">
        // Test Scenario 1: Positive flow to POST promo voucher
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
        JOB_Api_Call("Promotion - POST new promo voucher", "POST", BaseAPI + "/promo/voucher", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Promo_Voucher_Id = json.getString("id");
                Promo_Voucher_Code = json.getString("code");
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 2: Negative flow to POST promo voucher without code
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

        // Test Scenario 3: Negative flow to POST promo voucher without promo type
        BODY = "{"
                + "\"code\":\"LOCATION-" + RELEASE_DATE_SECONDS + "\","
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
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher", "PUT", BaseAPI + "/promo/voucher/" + Promo_Voucher_Id, Auth, BODY, 200, ParentTest, "no_jira");

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
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher without code", "PUT", BaseAPI + "/promo/voucher/" + Promo_Voucher_Id, Auth, BODY, 400, ParentTest, "no_jira");

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
        JOB_Api_Call("Promotion - PUT/Update nelwly added promo voucher without type", "PUT", BaseAPI + "/promo/voucher" + Promo_Voucher_Id, Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="DELETE promo voucher">
        //</editor-fold>
        // Test Scenario 1: Positive flow to DELETE newly created promo voucher
        JOB_Api_Call("Promotion - POST new promo voucher", "DELETE", BaseAPI + "/promo/voucher/" + Promo_Voucher_Id, Auth, BODY, 200, ParentTest, "no_jira");

    }

}
