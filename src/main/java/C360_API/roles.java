package C360_API;

class roles extends C360_API_main{
    protected roles(C360_API_main a) {
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
        JOB_Api_Call("Get Roles", "GET", 
            BaseAPI + "/v1/user/role?limit=10&page=1&sortBy=createdAt&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }          
    }
}
