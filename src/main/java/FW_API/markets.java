package FW_API;

import java.util.ArrayList;


class markets extends FW_API_main{
    protected markets(FW_API_main a) {
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
        JOB_Api_Call("All Markets", "GET", 
            BaseAPI + "/markets", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                RestID = jsonArray.getJSONObject(0).getString("id");
                RESTAURANT = jsonArray.getJSONObject(0).getString("name");
                for (int i = 0; i < jsonArray.length(); i++) {
                    RESTAURANT_IDS.add(jsonArray.getJSONObject(i).getString("id"));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }          
    } 
    
}
