package API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class config extends API_GUI{
    protected config(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {      
        Auth = "Bearer " + AP3_TKN;   // =============== config(s) ===================================
//        JOB_Api_Call("config > /'AppID'", "GET", BaseAPI + "/config/" + AppID, Auth, "", 200, ParentTest, "no_jira");
//        JOB_Api_Call("Public config > /'AppID'", "GET", BaseAPI + "/config/public/" + AppID, "", "", 200, ParentTest, "no_jira");
        
        JOB_Api_Call("Config > /'SiteID'", "GET", 
            BaseAPI + "/config/" + SiteID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try{
                JSONObject p = json.getJSONObject("payment");
                if(p.has("freedompay")) {
                    Site_PProvider = "freedompay";
                    freedompay_id = p.getJSONObject("freedompay").getString("id");
                    freedompay_terminal_id = p.getJSONObject("freedompay").getString("freedompay_terminal_id");
                    freedompay_store_id = p.getJSONObject("freedompay").getString("freedompay_store_id");                  
                }else if(p.has("exact")) {
                    Site_PProvider = "exact";
                    exact_gateway_password = p.getJSONObject("exact").getString("exact_gateway_password");
                    exact_gateway_id = p.getJSONObject("exact").getString("exact_gateway_id");
                    exact_id = p.getJSONObject("exact").getString("id");                
                }
            } catch (Exception ex){
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

            }
            catch (Exception ex) {
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

    }
}
