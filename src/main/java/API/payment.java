package API;

class payment extends API_GUI{
    protected payment(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_TKN = a.Mobile_User_TKN;
        Mobile_User_ID = a.Mobile_User_ID;
        SiteID = a.SiteID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                                                           
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Mobile User Payment", "GET", 
            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
//
        } 
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1, Auth, "", 200, ParentTest, "no_jira");

    }
}
