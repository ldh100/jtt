package C360_API;

class user extends C360_API_main{
    protected user(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_Clien_ID = a.C360_Clien_ID;
        C360_ADMIN_ID = a.C360_ADMIN_ID;
        C360_ADMIN_PW = a.C360_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        

        Order_IDS = a.Order_IDS; 
        Concepts_IDS = a.Concepts_IDS; 
        ConceptGraoups_IDS = a.ConceptGraoups_IDS; 
        PRanges_IDS = a.PRanges_IDS; 
        User_IDS = a.User_IDS; 
        User_IDS = a.User_IDS;
    }
    String AAA = "";
    protected void run() {  
        Auth = "";      
        JOB_Api_Call("Get Users", "GET",  // https://dev.cafe360.io/user-management/users?limit=10&page=1&sortBy=createdAt&sortOrder=DESC&search   
            BaseAPI + "/v1/user?limit=10&page=1&sortBy=createdAt&sortOrder=DESC&search", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }        
          
    }
}
