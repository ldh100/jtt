package API;

class task extends API_GUI{
    protected task(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Market_Brand_ID = a.Market_Brand_ID;
        ParentTest = a.ParentTest;
    }
    protected void run() {                                                       
        Auth = "";   // ========================================== 
            JOB_Api_Call("Tasks > 'MarketPlace Brand ID' (hardcoded in JOB config)", "GET",  // ================   Hard Coded for now ======================================================
                BaseAPI + "/task/location/brand/" + Market_Brand_ID + "?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
            if(json != null){
                String Tasks = "Check json"; 
            }         
    }
}
