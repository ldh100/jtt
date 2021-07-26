package API;

class menus extends API_GUI{
    protected menus(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_User_TKN = a.AP3_User_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        CompanyID = a.CompanyID;
        MENU_IDS = a.MENU_IDS;
        ParentTest = a.ParentTest;
    }
    protected void run() {             
        Auth = "Bearer " + AP3_User_TKN;   // =============== AP3 Company/Global menus ===================
        JOB_Api_Call("Company / Global Menus > /'CompID'", "GET", 
            BaseAPI + "/menu/company/" + CompanyID, Auth, "", 200, ParentTest, "no_jira");

        Auth = "";                        // =============== AP3 Local Menu(s) ===========================
        for(int i = 0; i < MENU_IDS.size(); i++){
            JOB_Api_Call("Brand Local Menu " + (i+1) + " > /menu/'MenuID'", "GET", 
                BaseAPI + "/menu/" + MENU_IDS.get(i), Auth, "", 200, ParentTest, "no_jira");
            
            JOB_Api_Call("Brand > Timeslots > Menu " + (i+1) + " > /timeslots/menu/'MenuID'", "GET", 
                BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MENU_IDS.get(i) + "?nocache=1&extended=true", Auth, "", 200, ParentTest, "no_jira" );
        }
    }
}
