package API;

class Promo extends API_GUI{
    protected Promo(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
    try {                  
        Auth = "Bearer " + AP3_User_TKN;  // ===============  AP3 Promo ===========================
        JOB_Api_Call("Promo > /'CompanyID'", "GET", 
            BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID, Auth, "", 200, ParentTest, "no_jira");

    } catch (Exception ex){}   // =============================================  
    }
}
