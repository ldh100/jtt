package C360_API;

class orders extends C360_API_main{
    protected orders(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_ADMIN_ID = a.C360_ADMIN_ID;
        C360_ADMIN_PW = a.C360_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    protected void run() { 
        
        Auth = "";  //      
//        JOB_Api_Call("Get Users", "GET", 
//            BaseAPI + "/cafe360user", Auth, "", 200, ParentTest, "no_jira"); 
//        if(json != null){
//            AAA = json.toString(4);
//        }        
        // https://dev.cafe360.io/user-management/users?limit=10&page=1&sortBy=createdAt&sortOrder=DESC&search      
    }
}
