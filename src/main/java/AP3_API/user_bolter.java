package AP3_API;

import java.util.ArrayList;
import java.util.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

class user_bolter extends AP3_API_GUI{
    protected user_bolter(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        Bolter_Site_ID = a.Bolter_Site_ID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
        Order_Delivery_ID = a.Order_Delivery_ID;
        Order_Pickup_ID = a.Order_Pickup_ID;
    }
    String AAA = "";
    protected void run() {  
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter Authentication - Wrong ID> /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Bolter", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("Bolter Authentication - Wrong PW> /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Bolter", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter Authentication > /user/auth?realm=bolter", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + "bolter", Auth, "Bolter", 200, ParentTest, "no_jira");
        if(json != null){
            if(json.has("user")) Bolter_User_ID = json.getString("user"); 
            if(json.has("token")) Bolter_User_TKN = json.getString("token");  
            if(json.has("profile")){    
                Bolter_Site_ID = json.getJSONObject("profile").getString("location_group"); 
            }else{
                if(json.has("error")){
                    Bolter_Site_ID = "Not Found";
                }
            } 
        } 
        if(Bolter_Site_ID != "Not Found") { 
            BolterBrandIDS = new ArrayList<>();
            JOB_Api_Call("Bolter Brands > /location/group/'BolterSiteID'", "GET", 
                BaseAPI + "/location/group/" + Bolter_Site_ID, Auth, "", 200, ParentTest, "no_jira");  // + "?nocache=true&extended=true"      
            try {
                JSONArray Location = json.getJSONArray("locations");
                if (Location != null) {
                    for (Object l : Location) {
                        JSONObject loc = (JSONObject) l;
                        JSONArray brands = loc.getJSONArray("brands");
                        for (Object b : brands) {
                            JSONObject br = (JSONObject) b; 
                            BolterBrandIDS.add(br.getString("id"));
                        }
                    }
                }
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }
        
    }
}
