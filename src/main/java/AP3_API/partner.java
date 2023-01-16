package AP3_API;

import org.json.JSONArray;
import org.json.JSONObject;

class partner extends AP3_API_GUI{
    protected partner(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    String AAA = "";
    String CoolrID = "";
    protected void run() { 
        
        JOB_Api_Call("Partner Standardcognition Locations", "GET", 
            BaseAPI + "/partner/standardcognition/locations", "", "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        
        if (!env.equals("PR")) {
            JOB_Api_Call("Partner Standardcognition Stores", "GET", 
                BaseAPI + "/partner/standardcognition/stores", "", "", 200, ParentTest, "no_jira"); 
            if(json != null){
                AAA = json.toString(4);
            }    
        }
        
//        JOB_Api_Call("Partner Coolr Locations", "GET", 
//            BaseAPI + "/partner/coolr/locations", "", "", 200, ParentTest, "no_jira"); 
//        if(json != null){
//            AAA = json.toString(4);
//            try {
//                JSONArray locations = json.getJSONArray("locations");
//                CoolrID = locations.getJSONObject(0).getString("id");
//            } catch (Exception ex) {
//                AAA = ex.getMessage();
//            }
//        }
//        
//        JOB_Api_Call("Partner 1st Coolr Images", "GET", 
//            BaseAPI + "/partner/coolr/" + CoolrID + "/images", "", "", 200, ParentTest, "no_jira"); 
//        if(json != null){
//            AAA = json.toString(4);
//        }      
        // https://api.compassdigital.org/dev/partner/standardcognition/menu  POST Create new Menu
//        body 
//        {
//        "company":"PpzmrEBrveHRB9NLLoAet3dwyv1kl2tRB2rayqrNSe1dD5ev97HlXlOWPR95UQoZwMdMk7HEa1aDj",
//        "sector":"QDaXdWJdvktvLG5qXwYOhwWgGE6LNJC9aXDReBJdHjWlq50lGgFZyXzJ6mLmsvYw17zkjXtDeGQM",
//        "location_brand":"q1BjvDevYgCBWBAN4o5zceB90zX7rpcEB3Pa1Jm3uN7rmryElOtG3LvOQDels97L7PaB8qIQdN",
//        "s3_link": "cdl-partner-menu-frictionless/dev/5001.json"
//        }
    }
}
