package API;

import java.util.ArrayList;

class announcement extends API_GUI {

    protected announcement(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }

    protected void run() {
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 announcement ===========================
        String Announcement_ID = "";
        ANNOUNCEMENT_IDS = new ArrayList<>();
        //<editor-fold defaultstate="collapsed" desc=" GET all Announcement ">
        // Test Scenario 1: Positive get all announcement
        JOB_Api_Call("AP3 GET all announcement", "GET", BaseAPI + "/announcement/resource", Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive get all announcement when disabled=true
        JOB_Api_Call("AP3 GET announcement - when disabled=true", "GET", BaseAPI + "/announcement/resource/?disabled=true", Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive get all announcement when disabled=false
        JOB_Api_Call("AP3 GET announcement - when disabled=false", "GET", BaseAPI + "/announcement/resource/?disabled=false", Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" POST Announcement ">
        // Test Scenario 1: Positive flow for post active announcement 
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe\","
                + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":true,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en français\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement - Active status", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Announcement_ID = json.getString("id");
                ANNOUNCEMENT_IDS.add(Announcement_ID);
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow for post In-active announcement 
        BODY = "{\"name\":\"This is API test for Announcement with Status = In Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe\","
               + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en français\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement - In Active status", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Announcement_ID = json.getString("id");
                ANNOUNCEMENT_IDS.add(Announcement_ID);
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 3: Positive flow for post announcement without French Version
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe\","
               + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":true,"
                + "\"info\":{"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement without English Version", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Announcement_ID = json.getString("id");
                ANNOUNCEMENT_IDS.add(Announcement_ID);
            }
            catch (Exception ex) {
            }
        }
        // Test Scenario 3: Positive flow for post announcement without English Version
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe\","
               + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en français\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement without English Version", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                Announcement_ID = json.getString("id");
                ANNOUNCEMENT_IDS.add(Announcement_ID);
            }
            catch (Exception ex) {
            }
        }
         // Test Scenario 4: Negative flow for post announcement without Announcement Type
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"\","
                + "\"key\":\"D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe\","
               + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en français\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement without Announcement Type", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");
      
        // Test Scenario 5: Negative flow for post announcement without Announcement Site/Key
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"\","
               + "\"app\":\"" + app +"\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":1,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en français\"}"
                + "}}";
        JOB_Api_Call("AP3 POST announcement without Announcement Site/Key", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" PUST Announcement ">
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" DELETE Announcement ">
        // Test Scenario 1: Positive flow for delete Announcement by ID
        if (ANNOUNCEMENT_IDS != null) {
            for (int i = 0; i <= ANNOUNCEMENT_IDS.size(); i++) {
                JOB_Api_Call("AP3 Delete Announcement by ID", "DELETE", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(i), Auth, BODY, 200, ParentTest, "no_jira");
            }
        }

        //</editor-fold>
    }
}
