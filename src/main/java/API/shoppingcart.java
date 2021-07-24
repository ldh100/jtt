package API;

class shoppingcart extends API_GUI{
    protected shoppingcart(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_TKN = a.Mobile_User_TKN;

        BrandID = a.BrandID;
        Menu_ID = a.Menu_ID;
        Item_ID = a.Item_ID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"delivery\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + Menu_ID + "\"," +
            "\"payment_method\":{\"credit_card\":{}," +
            "\"mealplan\":{}}," +
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        JOB_Api_Call("Create New ShoppingCart", "POST", 
            BaseAPI + "/shoppingcart", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            try{
                ShoppingCart_ID = json.getString("id");
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }  
        
        BODY = "{\"items\":[{\"id\":\"" + Item_ID + "\"," +
            "\"quantity\":1," +
            "\"price\":{\"amount\":0.05}}]}"; 
        JOB_Api_Call("Add menu item to ShoppingCart", "PUT", 
            BaseAPI + "/shoppingcart/" + ShoppingCart_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
        JOB_Api_Call("Get ShoppingCart", "GET", 
            BaseAPI + "/shoppingcart/" + ShoppingCart_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try{
                ShoppingCart_ID = json.getString("id");
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }
    }
}
