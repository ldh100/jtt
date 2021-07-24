package API;

class order extends API_GUI{
    protected order(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Mobile_User_ID = a.Mobile_User_ID;
        Mobile_User_TKN = a.Mobile_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Auth = "Bearer " + Mobile_User_TKN;
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders - last 7 days", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1, Auth, "", 200, ParentTest, "no_jira");

    }
}
