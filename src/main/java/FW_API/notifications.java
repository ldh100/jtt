package FW_API;

class notifications extends FW_API_main{
    protected notifications(FW_API_main a) {
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
        JOB_Api_Call("All Notifications", "GET", 
            BaseAPI + "/notifications", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                NotifID = jsonArray.getJSONObject(0).getString("id");
                NOTIFICATION = jsonArray.getJSONObject(0).getString("name");
                for (int i = 0; i < jsonArray.length(); i++) {
                    NOTIFICATION_IDS.add(jsonArray.getJSONObject(i).getString("id"));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }         
    }          
}

