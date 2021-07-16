package API;

class task extends API_GUI{
    protected task(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        Bolter_User_TKN = a.Bolter_User_TKN;
        Bolter_Site_ID = a.Bolter_Site_ID;
        BolterBrandIDS = a.BolterBrandIDS;

        ParentTest = a.ParentTest;
    }
    protected void run() {                                                       
        Auth = "";   // ==========================================
//        JOB_Api_Call("Tasks > 'BrandID'", "GET", 
//            BaseAPI + "/task/location/brand/" + BolterBrandIDS.get(0) +"?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
//        if(json != null){
//            String Tasks = "Check json"; 
//        }  
        if(env.equals("DE")){
            JOB_Api_Call("Tasks > 'MarketPlace Brand ID' (hardcoded)", "GET",  // ================   Hard Coded for now ======================================================
                BaseAPI + "/task/location/brand/" + "zjYX7Pd7p0U6K64QgeEPfk2J9zQd23UY4peLvzqdF5GqA2GJDKSYdWlj0dNlHkgPKBADE2ijzN" +"?query_type=kds", Auth, "", 200, ParentTest, "no_jira");
            if(json != null){
                String Tasks = "Check json"; 
            }         
        }else{
            Log_Html_Result("INFO", "Need Market Plase Brand ID", ParentTest.createNode("Environment: " + env + ": Tasks > 'MarketPlace Brand ID'"));
        }
    }
}
