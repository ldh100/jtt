package API;

import org.json.JSONArray;
import org.json.JSONObject;

class partner extends API_GUI{
    protected partner(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        // UnitNum ???????
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    protected void run() { 
        String CoolrID = "";
        JOB_Api_Call("Partner Standardcognition Locations", "GET", 
            BaseAPI + "/partner/standardcognition/locations", "", "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        
        JOB_Api_Call("Partner Coolr Locations", "GET", 
            BaseAPI + "/partner/coolr/locations", "", "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
            try {
                JSONArray locations = json.getJSONArray("locations");
                CoolrID = locations.getJSONObject(0).getString("id");
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }
        JOB_Api_Call("Partner 1st Coolr Images", "GET", 
            BaseAPI + "/partner/coolr/" + CoolrID + "/images", "", "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }         
    }
}
