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
        MenuID = a.MenuID;
    }
    String ShoppingcartID ="";
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"delivery\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + MenuID + "\"," +
            "\"payment_method\":{\"credit_card\":{}," +
            "\"mealplan\":{}}," +
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        JOB_Api_Call("Create New Shoppingcart", "POST", 
            BaseAPI + "/shoppingcart", Auth, BODY, 200, ParentTest, "no_jira");
    }
}
