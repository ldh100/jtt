package AP3_API;

import java.util.ArrayList;

class announcement extends AP3_API_GUI {

    protected announcement(AP3_API_GUI a) {
        app = a.app;
        AppID = a.AppID;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }

    protected void run() {
        Auth = "Bearer " + AP3_TKN;   
        ANNOUNCEMENT_IDS = new ArrayList<>();
        //<editor-fold defaultstate="collapsed" desc=" GET Announcement">
        // Test Scenario 1: Positive get all announcement
        JOB_Api_Call("Announcement - GET All ", "GET", 
                BaseAPI + "/announcement/resource", Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 2: Positive get all announcement when disabled=true
        JOB_Api_Call("Announcement - GET All disabled=true", "GET", 
                BaseAPI + "/announcement/resource/?disabled=true", Auth, "", 200, ParentTest, "no_jira");

        // Test Scenario 3: Positive get all announcement when disabled=false
        JOB_Api_Call("Announcement - GET All disabled=false", "GET", 
                BaseAPI + "/announcement/resource/?disabled=false", Auth, "", 200, ParentTest, "no_jira");

        Auth = "";        
        JOB_Api_Call("Announcement - GET All > Application", "GET", 
                BaseAPI + "/announcement/resource/" + AppID, Auth, "", 200, ParentTest, "no_jira");        

        JOB_Api_Call("Announcement - GET All > Application > Site", "GET", 
                BaseAPI + "/announcement/resource/" + AppID + "?allowed_resource_id=" + SiteID, Auth, "", 200, ParentTest, "no_jira");  
        //https://api.compassdigital.org/staging/announcement/resource/D72zJOpAw4fMKN65g3RjhqOpJLR2O3HLgYAe?allowed_resource_id=B5XY40KAweTdB83OZZBDu5Lp4GmroGc4XB&disabled=false
        //https://api.compassdigital.org/staging/announcement/resource/<....>?allowed_resource_id=<SITE_UD>&disabled=false

        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" POST Announcement ">
        // Test Scenario 1: Positive flow for post active announcement 
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        JOB_Api_Call("Announcement - POST new announcement with Active status", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                ANNOUNCEMENT_IDS.add(json.getString("id"));
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 2: Positive flow for post In-active announcement 
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement with Status = In Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        JOB_Api_Call("Announcement - POST new announcement with In Active status", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                ANNOUNCEMENT_IDS.add(json.getString("id"));
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 3: Positive flow for post announcement without French Version
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement without French Version\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
        JOB_Api_Call("Announcement - POST new announcement without French Version", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                ANNOUNCEMENT_IDS.add(json.getString("id"));
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 4: Positive flow for post announcement without English Version
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement without English Version\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";
        JOB_Api_Call("Announcement - POST new announcement without English Version", "POST", BaseAPI + "/announcement", Auth, BODY, 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                ANNOUNCEMENT_IDS.add(json.getString("id"));
            }
            catch (Exception ex) {
            }
        }

        // Test Scenario 5: Negative flow for post announcement without Announcement Type
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";
        JOB_Api_Call("Announcement - Negative flow to POST new announcement without Announcement Type", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 6: Negative flow for post announcement without Announcement Site/Key
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";
        JOB_Api_Call("Announcement - Negative flow to POST new announcement without Announcement Site/Key", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 7: Negative flow for post without value for Position
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Announcement with Status = Active\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"\","
                + "\"app\":\"" + app + "\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":null,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";

        JOB_Api_Call("AP3 POST announcement without value for Position", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" GET Announcement by ID ">
        // Test Scenario 1: Positive get announcement details by ID
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - Get by ID", "GET", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, "", 200, ParentTest, "no_jira");
        }

        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc=" PUT Announcement ">
        // Test Scenario 1: Positive flow -  PUT to update Announcement Name
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement Name by ID\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement -  PUT/Update Announcement Name by ID", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }

        // Test Scenario 2: Positive flow -  PUT to update Announcement Type
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement Type\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement Type", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }

        // Test Scenario 3: Positive flow -  PUT to update Announcement App
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement App\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"Nourish\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement App", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }
        // Test Scenario 4: Positive flow -  PUT to update Announcement position
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement position\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"Nourish\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":2,"
                + "\"active\":true,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement position", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }
        // Test Scenario 5: Positive flow -  PUT to update Announcement to In-Active
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement to In-Active\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"Nourish\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":2,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is English version for Announcement\","
                + "\"description\":\"This is description for Announcement English version \","
                + "\"sub_text\":\"This is Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement to In-Active", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }
        // Test Scenario 6: Positive flow -  PUT to update Announcement English Version
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update Announcement for English Version\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"Nourish\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":2,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is Update in English version for Announcement\","
                + "\"description\":\"This is update in description for Announcement English version \","
                + "\"sub_text\":\"This is updated Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement for English Version", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }
        // Test Scenario 7: Positive flow -  PUT to update Announcement French Version
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for Update for Announcement French Version\","
                + "\"type\":\"App Feature\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"Nourish\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":2,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Update- Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Update-Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"Update-Ceci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"},"
                + "\"en\":{"
                + "\"image_url\":null,"
                + "\"title\":\"This is Update in English version for Announcement\","
                + "\"description\":\"This is update in description for Announcement English version \","
                + "\"sub_text\":\"This is updated Sub Text for Announcement English version \","
                + "\"button_text\":\"Bottom Text English\"}"
                + "}}";
        if (ANNOUNCEMENT_IDS.size() > 0) {
            JOB_Api_Call("Announcement - PUT/Update Announcement for French Version", "PUT", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(0), Auth, BODY, 200, ParentTest, "no_jira");
        }
        
         // Test Scenario 8: Negative flow for PUT announcement without Announcement Type
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for PUT Announcement  without Announcement Type\","
                + "\"type\":\"\","
                + "\"key\":\"" + AppID + "\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";
        JOB_Api_Call("Announcement - Negative flow to PUT/Update an existing announcement without passing valid Announcement Type", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 9: Negative flow for PUT announcement without Announcement Site/Key
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for PUT Announcement without Announcement Site/Key\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"\","
                + "\"app\":\"" + app + "\","
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
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";
        JOB_Api_Call("Announcement - Negative flow to PUT/Update an existing  announcement without Announcement Site/Key", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");

        // Test Scenario 10: Negative flow for PUT without value for Position
        Auth = "Bearer " + AP3_TKN; 
        BODY = "{\"name\":\"This is API test for PUT Announcement  without value for Position\","
                + "\"type\":\"Promotions\","
                + "\"key\":\"\","
                + "\"app\":\"" + app + "\","
                + "\"is_global\":false,"
                + "\"allowed_resources\":[\"" + SiteID + "\"],"
                + "\"position\":null,"
                + "\"active\":false,"
                + "\"info\":{"
                + "\"fr\":{"
                + "\"image_url\":null,"
                + "\"title\":\"Ceci est la version anglaise pour l'annonce\","
                + "\"description\":\"Ceci est la description de la version anglaise de l'annonce\","
                + "\"sub_text\":\"\\nCeci est le sous-texte de l'annonce Version anglaise\","
                + "\"button_text\":\"Texte du bas en fran??ais\"}"
                + "}}";

        JOB_Api_Call("Announcement - Negative flow to PUT/Update an existing  announcement without value for Position", "POST", BaseAPI + "/announcement", Auth, BODY, 400, ParentTest, "no_jira");
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc=" DELETE Announcement ">
        // Test Scenario 1: Positive flow for delete Announcement by ID
        if (ANNOUNCEMENT_IDS.size() > 0) {
            for (int i = 0; i < ANNOUNCEMENT_IDS.size(); i++) {
                JOB_Api_Call("Announcement - Delete Announcement by ID - " + ANNOUNCEMENT_IDS.get(i), "DELETE", BaseAPI + "/announcement/" + ANNOUNCEMENT_IDS.get(i), Auth, "", 200, ParentTest, "no_jira");
            }
        }

        //</editor-fold>
    }
}
