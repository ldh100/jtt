package API;

class shoppingcart extends API_GUI{
    protected shoppingcart(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
//        Auth = "Bearer " + Mobile_User_TKN;
//        JOB_Api_Call("Create New Shoppingcart", "POST", 
//            BaseAPI + "/shoppingcart/" + BrandID, Auth, "", 200, ParentTest, "no_jira");
    }
}
