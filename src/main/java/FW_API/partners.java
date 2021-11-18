package FW_API;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class partners extends FW_API_main{
    protected partners(FW_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        NewID = a.NewID;
        ParentTest = a.ParentTest; 
        FW_Admin_ID = a.FW_Admin_ID;
        FW_Admin_TKN = a.FW_Admin_TKN;
    }
    String AAA = "";
    protected void run() { 
        RESTAURANT_IDS = new ArrayList<>();
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("All Partners", "GET", 
            BaseAPI + "/partners", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                PartnerID = jsonArray.getJSONObject(0).getString("id");
                PARTNER = jsonArray.getJSONObject(0).getString("name");
                for (int i = 0; i < jsonArray.length(); i++) {
                    PARTNER_IDS.add(jsonArray.getJSONObject(i).getString("id"));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }          
    }
   
}
