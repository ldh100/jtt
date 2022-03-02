package AP3_API;

/*
https://teamideaworks.atlassian.net/browse/EAT-46
https://teamideaworks.atlassian.net/browse/P2-1689
*/

class message extends AP3_API_GUI{
    protected message(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    String AAA= "";
    String Message_ID = "fdwewfft564gsfsfsfsf";
    protected void run() {                                                          
        Auth = "Bearer " + AP3_TKN;         
        BODY = "{" +
                    "\"idfa\": \"" + "IDFA_unknown" + "\"," +
                    "\"location\": {" +
                        "\"latitude\": 0," +
                        "\"longitude\": 0," +
                        "\"id\": \"" + SiteID + "\"" +
                    "}," +
                    "\"meta\": {}," +
                    "\"text\": \"" + "Test API POST Message for Site ID " + SiteID + " > JIRA EAT-46, P2-1689" + "\"" +
                "}";  
        JOB_Api_Call("Create a Message", "POST", 
            BaseAPI + "/message", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
            try {
                if (json.has("id")) {                  
                    Message_ID = json.getString("id");                          
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }        
        }
        
        JOB_Api_Call("Get 'Message' by ID", "GET", 
            BaseAPI + "/message/" + Message_ID, Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
    }
}
