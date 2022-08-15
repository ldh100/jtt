package C360_API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class orders extends C360_API_main{
    protected orders(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_Clien_ID = a.C360_Clien_ID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        

        Order_IDS = a.Order_IDS; 
        Concepts_IDS = a.Concepts_IDS; 
        ConceptGraoups_IDS = a.ConceptGraoups_IDS; 
        PRanges_IDS = a.PRanges_IDS; 
        User_IDS = a.User_IDS; 
        User_IDS = a.User_IDS;
    }
    String AAA = "";
    protected void run() { 
        
        Auth = "";  
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: createdAt/DESC", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=createdAt&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            try {
                if (json.has("results")) {
                    JSONArray results = json.getJSONArray("results");
                    for (int i = 0; i < results.length(); i++) {
                        JSONObject result = results.getJSONObject(i);
                        Order_IDS.add(result.getString("id"));
                    }
                } 
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }   
        JOB_Api_Call("Get Order by ID", "GET", 
            BaseAPI + "/v1/itemcatalog/concepts/" + Order_IDS.get(Order_IDS.size() - 1), Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
 
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: createdAt/DESC", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=createdAt&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: pickup_id/ACS", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=pickup_id&sortOrder=ASC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: pickup_id/DESC", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=pickup_id&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: site_name/DESC", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=site_name&sortOrder=ASC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        Order_IDS =  new ArrayList<>();
        JOB_Api_Call("Get Orders - SortBy: site_name/ASC", "GET", 
            BaseAPI + "/v1/search/order?limit=10&page=1&sortBy=site_name&sortOrder=ASC", Auth, "", 200, ParentTest, "no_jira"); 
            try {
                if (json.has("results")) {
                    JSONArray results = json.getJSONArray("results");
                    for (int i = 0; i < results.length(); i++) {
                        JSONObject result = results.getJSONObject(i);
                        Order_IDS.add(result.getNumber("id").toString());
                    }
                } 
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }

    }
}
