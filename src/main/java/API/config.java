package API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class config extends API_GUI {

    protected config(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        Promo_Voucher_Id = a.Promo_Voucher_Id;
        Promo_Voucher_Code = a.Promo_Voucher_Code;
        ParentTest = a.ParentTest;
    }

    protected void run() {
        Auth = "Bearer " + AP3_TKN;   // =============== config(s) ===================================
//        JOB_Api_Call("config > /'AppID'", "GET", BaseAPI + "/config/" + AppID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Public config > /'AppID'", "GET", BaseAPI + "/config/public/" + AppID, "", "", 200, ParentTest, "no_jira");

        JOB_Api_Call("Config > /'SiteID'", "GET",
                BaseAPI + "/config/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                JSONObject p = json.getJSONObject("payment");
                if (p.has("freedompay")) {
                    Site_PProvider = "freedompay";
                    freedompay_id = p.getJSONObject("freedompay").getString("id");
                    freedompay_terminal_id = p.getJSONObject("freedompay").getString("freedompay_terminal_id");
                    freedompay_store_id = p.getJSONObject("freedompay").getString("freedompay_store_id");
                } else if (p.has("exact")) {
                    Site_PProvider = "exact";
                    exact_gateway_password = p.getJSONObject("exact").getString("exact_gateway_password");
                    exact_gateway_id = p.getJSONObject("exact").getString("exact_gateway_id");
                    exact_id = p.getJSONObject("exact").getString("id");
                }
            } catch (Exception ex) {
                String AAAA = ex.getMessage();
            }
        }

        JOB_Api_Call("Public Config > /'SiteID'", "GET",
                BaseAPI + "/config/public/" + SiteID, "", "", 200, ParentTest, "no_jira");
//{
//    "promotions": [],
//    "mealplan": [{
//        "note": {},
//        "tenders": [{
//            "tax_exempt": false,
//            "id": "1001",
//            "type": "declining_balance"
//        }],
//        "name": "CBORD",
//        "id": "PBeOojlNRlFRPk5d6DgjSNjgOm8oyBSARdMGp1WZUe7WEkzgw2UlX4GPEzYjhQ9zAXk8R6Fz3OGql3RouB7QYN4E1ZtMJ2",
//        "valid_email_domains": [],
//        "type": "CBORD DIRECT"
//    }]
//}        

//        JOB_Api_Call("config > /'UnitID'", "GET", BaseAPI + "/config/" + UnitID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Public config > /'UnitID'", "GET", BaseAPI + "/config/public/" + UnitID, "", "", 200, ParentTest, "no_jira");
        JOB_Api_Call("Config > /'BrandID'", "GET",
                BaseAPI + "/config/" + BrandID, Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("Public Config > /'BrandID'", "GET",
                BaseAPI + "/config/public/" + BrandID, "", "", 200, ParentTest, "no_jira");
        if (json != null) {
            DELIEVERY_DESTINATIONS = new ArrayList<>();
            try {
                JSONArray DESTINATIONS = json.getJSONArray("delivery_destinations");
                for (int i = 0; i < DESTINATIONS.length(); i++) {
                    DELIEVERY_DESTINATIONS.add(DESTINATIONS.getString(i));
                }

            } catch (Exception ex) {
                String AAA = ex.getMessage();
            }
        }

        JOB_Api_Call("Config > JDE Configuration", "GET",
                BaseAPI + "/config/jde-configuration", Auth, "", 200, ParentTest, "no_jira");

// Site
// https://api.compassdigital.org/staging/config/81NDOePO6pCwEaym2Ey8UNaWl9MqB5sjlBZYj3yQfAoRDAPOLZTJvr9E6266hXO4RAkKXgCMB7
// POST
// {"payment":{"exact":{"id":"APE3Ev9vQkfo2mmOpKP7fGJ48NKAPOugo0gdlWJqS3O","exact_gateway_id":"AE7628-02","exact_gateway_password":"~RSQzgwC"},"refund":true},"loyalty":{"enabled":false},"supports":{"reorder":false},"apex":{"apex_integrated":false,"apex_client_numb":""},"mealplan":[]}        
// Brand
// https://api.compassdigital.org/staging/config/81NDOePO6pCwEaym2Ey8UNaWl9MqB5sjlBZYj3yQfAoRDAPOLZTJvr9E6266hXO4RAkKXgCMB7
// POST
// {"payment":{"exact":{"id":"APE3Ev9vQkfo2mmOpKP7fGJ48NKAPOugo0gdlWJqS3O","exact_gateway_id":"AE7628-02","exact_gateway_password":"~RSQzgwC"},"refund":false},"delivery_fee":{"type":"dollar","value":0.2},"service_fee":{"type":"dollar","value":0.1},"loyalty":{"enabled":false},"excluded_payment_methods":{"mealplan":[],"credit_card":false,"digital_wallet_pay":["googlewallet"],"meal_swipes":[]},"supports":{"reorder":false}}
        configAPIs();
        configPublicAPIs();
    }

    protected void configAPIs() {

        //<editor-fold defaultstate="collapsed" desc="POST Config">
        // Test Scenario 1: Positive flow to add Config - Add Payment ID
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"" + exact_id + "\","
                + "\"exact_gateway_id\":\"" + exact_gateway_id + "\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"" + exact_gateway_password + "\""
                + "},"
                + "\"refund\":false"
                + "},"
                + "\"loyalty\":{"
                + "\"enabled\":false"
                + "},"
                + "\"supports\":{"
                + "\"reorder\":false"
                + "},"
                + "\"apex\":{"
                + "\"apex_integrated\":true,"
                + "\"apex_client_numb\":\"188\""
                + "}"
                + "}";
        JOB_Api_Call("Config - POST Positive flow to add Config - Add Payment ID", "POST", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 2: Positive flow to add Config - Add Payment ID & Mealplan
        //Meanplan ID's are harcoded as work is still pending in "mealplan.java"
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"" + exact_id + "\","
                + "\"exact_gateway_id\":\"" + exact_gateway_id + "\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"" + exact_gateway_password + "\""
                + "},"
                + "\"refund\":false"
                + "},"
                + "\"loyalty\":{"
                + "\"enabled\":false"
                + "},"
                + "\"supports\":{"
                + "\"reorder\":false"
                + "},"
                + "\"apex\":{"
                + "\"apex_integrated\":false,"
                + "\"apex_client_numb\":\"\""
                + "},"
                + "\"mealplan\":["
                + "{"
                + "\"keystore\":{"
                + "\"API_URL\":\"https://apipartners.atriumcampus.com/integrations/compassdigital/json\","
                + "\"key\":\"atrium\""
                + "},"
                + "\"version\":1,"
                + "\"id\":\"9PD8QJm7AmtZJ3OgMYXGf2vMjDpz2ySZoqm1ry1dcwvXm1z3vvfN92BJ7wrMTWY7w6pe69HEvlzQqeY2fGerDlkl2KumE52BNdNMIwPglwEJw4UWZv91MmNkiGovE0KvwDhAyeWQ8eD3ilM4wdZJdBHmyy2wYj8rfg1jqN\","
                + "\"name\":\"ATRIUM\","
                + "\"config\":{"
                + "\"version\":\"1\","
                + "\"tenders\":["
                + "{"
                + "\"tender_number\":\"EOGw3rpeApcvreYqo0BLfZdLXMqG1ysey6BpMlBmCeKe\","
                + "\"name\":\"This is API test for Config\","
                + "\"type\":\"meal_equivalent\","
                + "\"max_swipes_per_transaction\":3,"
                + "\"rates\":["
                + "{"
                + "\"hours\":\"00:00-04:00\","
                + "\"amount\":200"
                + "},"
                + "{"
                + "\"hours\":\"04:00-23:59\","
                + "\"amount\":500"
                + "}"
                + "]"
                + "},"
                + "{"
                + "\"type\":\"declining_balance\","
                + "\"name\":\"debit 2\","
                + "\"tender_number\":\"JG40WY3lm3S0E1gYBW48T13GYeQrBEtqwABNzJBWiA9D\""
                + "}"
                + "],"
                + "\"terminal_id\":\"CD-1\","
                + "\"id\":\"8PplQBqGAqtLBEDZJRqofGlR2M9yGOSOeY0QdBQZHjqKgDz2rJuOyAEa9adKsEdXRMB6p1i53JJkjgWgHM1K5PJjaDtvkgzR3kXvFXlD9XdaRXh4OyPKRdPDfk03kEey3eU3p1ayakkpuGYK03l4mKtYMj7vJB6ocwAokOL\""
                + "},"
                + "\"type\":\"ATRIUM\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - POST Positive flow to add Config - Add Payment ID & Mealplan", "POST", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT Config">
        // Test Scenario 1: Positive flow to PUT/Update Config - Add payment
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"" + exact_id + "\","
                + "\"exact_gateway_id\":\"" + exact_gateway_id + "\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"" + exact_gateway_password + "\""
                + "},"
                + "\"refund\":true"
                + "},"
                + "\"loyalty\":{"
                + "\"enabled\":true"
                + "},"
                + "\"supports\":{"
                + "\"reorder\":false"
                + "},"
                + "\"apex\":{"
                + "\"apex_integrated\":true,"
                + "\"apex_client_numb\":\"18889\""
                + "}"
                + "}";
        JOB_Api_Call("Config - PUT Positive flow to PUT/Update Config - Add Payment ID", "PUT", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 2: Positive flow to update Config - Add Payment ID & Mealplan
        //Meanplan ID's are harcoded as work is still pending in "mealplan.java"
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"" + exact_id + "\","
                + "\"exact_gateway_id\":\"" + exact_gateway_id + "\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"" + exact_gateway_password + "\""
                + "},"
                + "\"refund\":false"
                + "},"
                + "\"loyalty\":{"
                + "\"enabled\":false"
                + "},"
                + "\"supports\":{"
                + "\"reorder\":false"
                + "},"
                + "\"apex\":{"
                + "\"apex_integrated\":false,"
                + "\"apex_client_numb\":\"\""
                + "},"
                + "\"mealplan\":["
                + "{"
                + "\"keystore\":{"
                + "\"API_URL\":\"https://apipartners.atriumcampus.com/integrations/compassdigital/json\","
                + "\"key\":\"atrium\""
                + "},"
                + "\"version\":1,"
                + "\"id\":\"9PD8QJm7AmtZJ3OgMYXGf2vMjDpz2ySZoqm1ry1dcwvXm1z3vvfN92BJ7wrMTWY7w6pe69HEvlzQqeY2fGerDlkl2KumE52BNdNMIwPglwEJw4UWZv91MmNkiGovE0KvwDhAyeWQ8eD3ilM4wdZJdBHmyy2wYj8rfg1jqN\","
                + "\"name\":\"ATRIUM\","
                + "\"config\":{"
                + "\"version\":\"1\","
                + "\"tenders\":["
                + "{"
                + "\"tender_number\":\"EOGw3rpeApcvreYqo0BLfZdLXMqG1ysey6BpMlBmCeKe\","
                + "\"name\":\"debit 1\","
                + "\"type\":\"meal_equivalent\","
                + "\"max_swipes_per_transaction\":3,"
                + "\"rates\":["
                + "{"
                + "\"hours\":\"00:00-04:00\","
                + "\"amount\":200"
                + "},"
                + "{"
                + "\"hours\":\"04:00-23:59\","
                + "\"amount\":500"
                + "}"
                + "]"
                + "}"
                + "],"
                + "\"terminal_id\":\"CD-1\","
                + "\"id\":\"8PplQBqGAqtLBEDZJRqofGlR2M9yGOSOeY0QdBQZHjqKgDz2rJuOyAEa9adKsEdXRMB6p1i53JJkjgWgHM1K5PJjaDtvkgzR3kXvFXlD9XdaRXh4OyPKRdPDfk03kEey3eU3p1ayakkpuGYK03l4mKtYMj7vJB6ocwAokOL\""
                + "},"
                + "\"type\":\"ATRIUM\""
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - PUT Positive flow to add Config - Add Payment ID & Mealplan", "PUT", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="GET Config">
        // Test Scenario 1: Positive flow to GET newly added Config - payment
        JOB_Api_Call("Config - GET Positive flow to GET newly added Config - payment", "GET", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="DELETE Config">
        // Test Scenario 1: Positive flow to DELETE newly added Config - payment
        JOB_Api_Call("Config - DELETE  Positive flow to DELETE newly added Config - payment", "DELETE", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");

        // Adding Config - Add Payment ID back after deleting
        BODY = "{"
                + "\"payment\":{"
                + "\"exact\":{"
                + "\"id\":\"" + exact_id + "\","
                + "\"exact_gateway_id\":\"" + exact_gateway_id + "\","
                + "\"exate_gateway_password\":\"\","
                + "\"exact_gateway_password\":\"" + exact_gateway_password + "\""
                + "},"
                + "\"refund\":false"
                + "},"
                + "\"loyalty\":{"
                + "\"enabled\":false"
                + "},"
                + "\"supports\":{"
                + "\"reorder\":false"
                + "},"
                + "\"apex\":{"
                + "\"apex_integrated\":true,"
                + "\"apex_client_numb\":\"188\""
                + "}"
                + "}";
        JOB_Api_Call("Config - Adding Config back after deleting Payment ID", "POST", BaseAPI + "/config/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>
    }

    protected void configPublicAPIs() {
        //<editor-fold defaultstate="collapsed" desc="POST Config-public">
        // Test Scenario 1: Positive flow to POST Config-public - Add Mealplan
        BODY = "{"
                + "\"mealplan\":["
                + "{"
                + "\"id\":\"XDrR37dPedU5RqJYjN8MFQ0PN4XvQ7IDzmk1YR17UdoD57BjGjU8XgWzplLeSpWXR6X5yLF7Gy3Q22AdSje9D6lBlrfRaaywv8mYtZpB2A7QmzuqOGr2mGOvcdDWq69LmKuaGaZYmKEGtqB2Bk9075IJvXBkJ7jKTKWDg7\","
                + "\"name\":\"ATRIUM\","
                + "\"tenders\":["
                + "{"
                + "\"id\":null,"
                + "\"tax_exempt\":true,"
                + "\"name\":\"This is API test for Config\","
                + "\"type\":\"meal_equivalent\","
                + "\"tender_number\":null,"
                + "\"max_swipes_per_transaction\":null,"
                + "\"rates\":["
                + "{"
                + "\"hours\":null,"
                + "\"amount\":null"
                + "}"
                + "]"
                + "}"
                + "],"
                + "\"type\":\"ATRIUM\","
                + "\"note\":{"
                + "},"
                + "\"valid_email_domains\":["
                + "]"
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - POST Positive flow to POST Config-public - Add Mealplan", "POST", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 2: Positive flow to POST Config-public - Add Mealplan & Promotions
        BODY = "{"
                + "\"mealplan\":["
                + "{"
                + "\"id\":\"XDrR37dPedU5RqJYjN8MFQ0PN4XvQ7IDzmk1YR17UdoD57BjGjU8XgWzplLeSpWXR6X5yLF7Gy3Q22AdSje9D6lBlrfRaaywv8mYtZpB2A7QmzuqOGr2mGOvcdDWq69LmKuaGaZYmKEGtqB2Bk9075IJvXBkJ7jKTKWDg7\","
                + "\"name\":\"ATRIUM\","
                + "\"tenders\":["
                + "{"
                + "\"id\":null,"
                + "\"tax_exempt\":true,"
                + "\"name\":\"This is API test for Config-public\","
                + "\"type\":\"meal_equivalent\","
                + "\"tender_number\":null,"
                + "\"max_swipes_per_transaction\":null,"
                + "\"rates\":["
                + "{"
                + "\"hours\":null,"
                + "\"amount\":null"
                + "}"
                + "]"
                + "}"
                + "],"
                + "\"type\":\"ATRIUM\","
                + "\"note\":{"
                + "},"
                + "\"valid_email_domains\":["
                + "]"
                + "}"
                + "],"
                + "\"promotions\":["
                + "{"
                + "\"name\":\"This is promotion test for config-public\","
                + "\"code\":\"" + Promo_Voucher_Code + "\","
                + "\"discountType\":\"AMOUNT\","
                + "\"amount\":100,"
                + "\"active\":true,"
                + "\"id\":\"" + Promo_Voucher_Id + "\","
                + "\"app\":\"rogers\","
                + "\"is_mealplan_promo\":false"
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - POST Positive flow to POST Config-public - Add Mealplan & Promotions", "POST", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="PUT Config-public">
        // Test Scenario 1: Positive flow to PUT/Update Config-public Add only promotions
        BODY = "{"
                + "\"mealplan\":["
                + "],"
                + "\"promotions\":["
                + "{"
                + "\"name\":\"This is promotion-1 test for config-public \","
                + "\"code\":\"" + Promo_Voucher_Code + "\","
                + "\"discountType\":\"AMOUNT\","
                + "\"amount\":100,"
                + "\"active\":false,"
                + "\"id\":\"EOkklRoL4Psr0YgD2dm2IZ5615ZzPKhe6NgZy35qhj1glR1AKlh06Rd06y93cE57prl06eHWOv84MP5OiZ5LzeqrAvCNM9OWp5Z\","
                + "\"app\":\"thrive\","
                + "\"is_mealplan_promo\":true"
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - PUT Positive flow to PUT/Update Config-public Add only promotions", "PUT", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        // Test Scenario 2: Positive flow to PUT/Update Config-public Add multiple promotions
        BODY = "{"
                + "\"mealplan\":["
                + "],"
                + "\"promotions\":["
                + "{"
                + "\"name\":\"This is promotion-1 test for config-public \","
                + "\"code\":\"" + Promo_Voucher_Code + "\","
                + "\"discountType\":\"AMOUNT\","
                + "\"amount\":100,"
                + "\"active\":false,"
                + "\"id\":\"EOkklRoL4Psr0YgD2dm2IZ5615ZzPKhe6NgZy35qhj1glR1AKlh06Rd06y93cE57prl06eHWOv84MP5OiZ5LzeqrAvCNM9OWp5Z\","
                + "\"app\":\"thrive\","
                + "\"is_mealplan_promo\":true"
                + "},"
                + "{"
                + "\"name\":\"This is promotion-2 test for config-public\","
                + "\"code\":\"LOCATION-6881748461302526\","
                + "\"discountType\":\"PERCENT\","
                + "\"amount\":1,"
                + "\"active\":true,"
                + "\"id\":\"JG66NKdawPSEWgpmeZ7eC19oB91JN8fqA48Gwe7Pf0lk3JGAWKsyLXv5a3RyuNZE65pwBktzoZkMovLYHokqpyy78qH5gv1GwWK\","
                + "\"app\":\"thrive\","
                + "\"is_mealplan_promo\":false"
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - PUT Positive flow to PUT/Update Config-public Add multiple promotions", "PUT", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="GET Config-public">
        // Test Scenario 1: Positive flow to GET newly added Config-public by ID
        JOB_Api_Call("Config - GET  Positive flow to GET newly added Config-public by ID", "GET", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="DELETE Config-public">
        // Test Scenario 1: Positive flow to DELETE newly added Config-public by ID
        JOB_Api_Call("Config - DELETE  Positive flow to DELETE newly added Config-public by ID", "DELETE", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");

        // Adding Config Public - Mealplan back after deleting
        BODY = "{"
                + "\"mealplan\":["
                + "{"
                + "\"id\":\"XDrR37dPedU5RqJYjN8MFQ0PN4XvQ7IDzmk1YR17UdoD57BjGjU8XgWzplLeSpWXR6X5yLF7Gy3Q22AdSje9D6lBlrfRaaywv8mYtZpB2A7QmzuqOGr2mGOvcdDWq69LmKuaGaZYmKEGtqB2Bk9075IJvXBkJ7jKTKWDg7\","
                + "\"name\":\"ATRIUM\","
                + "\"tenders\":["
                + "{"
                + "\"id\":null,"
                + "\"tax_exempt\":true,"
                + "\"name\":\"This is API test for Config\","
                + "\"type\":\"meal_equivalent\","
                + "\"tender_number\":null,"
                + "\"max_swipes_per_transaction\":null,"
                + "\"rates\":["
                + "{"
                + "\"hours\":null,"
                + "\"amount\":null"
                + "}"
                + "]"
                + "}"
                + "],"
                + "\"type\":\"ATRIUM\","
                + "\"note\":{"
                + "},"
                + "\"valid_email_domains\":["
                + "]"
                + "}"
                + "]"
                + "}";
        JOB_Api_Call("Config - Adding  Config-public back after deleting - Add Mealplan", "POST", BaseAPI + "/config/public/" + SiteID, Auth, BODY, 200, ParentTest, "no_jira");
        //</editor-fold>
    }
}
