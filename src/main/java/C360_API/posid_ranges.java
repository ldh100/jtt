package C360_API;

class posid_ranges extends C360_API_main{
    protected posid_ranges(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
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
        
        Auth = "";  //  https://dev.api.cafe360.io/v1/itemcatalog/posid_ranges?limit=10&page=1&sortBy=createdAt&sortOrder=DESC 
        JOB_Api_Call("Get Users", "GET", 
            BaseAPI + "/v1/itemcatalog/posid_ranges?limit=10&page=1&sortBy=createdAt&sortOrder=DESC", Auth, "", 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }          
    }
}
