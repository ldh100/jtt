package C360_API;

class concepts extends C360_API_main{
    protected concepts(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_Clien_ID = a.C360_Clien_ID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    protected void run() { 
        
        Auth = "";  //      https://dev.api.cafe360.io/v1/itemcatalog/concepts?limit=10&page=1&sortBy=createdAt&sortOrder=DESC
        JOB_Api_Call("Get Users", "GET", 
            BaseAPI + "/v1/itemcatalog/concepts?limit=10&page=1&sortBy=createdAt&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }          
    }
}
