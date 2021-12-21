package FW_API;

import org.json.JSONArray;

class settings extends FW_API_main{
    protected settings(FW_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        NewID = a.NewID;
        ParentTest = a.ParentTest; 
        FW_Admin_ID = a.FW_Admin_ID;
        FW_Admin_TKN = a.FW_Admin_TKN;
    }
    String AAA = "";
    protected void run() { 
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("All Units", "GET", 
            BaseAPI + "/settings", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            try {
                JSONArray CUISINES = json.getJSONArray("cuisineTypes");
                for (int i = 0; i < CUISINES.length(); i++) {
                    CUISINE_TYPES.add(CUISINES.getString(i));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }         
    }          
}

