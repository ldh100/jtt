package FW_API;

class users extends FW_API_main{
    protected users(FW_API_main a) {
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
        JOB_Api_Call("All Users", "GET", 
            BaseAPI + "/users", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                UserID = jsonArray.getJSONObject(0).getString("id");
                USER = jsonArray.getJSONObject(0).getString("name");
                for (int i = 0; i < jsonArray.length(); i++) {
                    USER_IDS.add(jsonArray.getJSONObject(i).getString("id"));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("User Access", "GET", 
            BaseAPI + "/users/" + UserID + "/access", Auth, "", 200, ParentTest, "no_jira"); 
//        if(jsonArray != null){
//            try {
//                UserID = jsonArray.getJSONObject(0).getString("id");
//                USER = jsonArray.getJSONObject(0).getString("name");
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    USER_IDS.add(jsonArray.getJSONObject(i).getString("id"));
//                }                               
//            } catch (Exception ex){
//                AAA = ex.getMessage();
//            }
//        }        
    }          
}

