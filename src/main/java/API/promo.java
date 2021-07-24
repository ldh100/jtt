package API;

class promo extends API_GUI{
    protected promo(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                 
        Auth = "Bearer " + AP3_User_TKN;  // ===============  AP3 promo ==============================
        JOB_Api_Call("Promo > /'CompanyID'", "GET", 
            BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");

    }
}
