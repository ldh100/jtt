package FW_API;

class sectors extends FW_API_main{
    protected sectors(FW_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        NewID = a.NewID;
        ParentTest = a.ParentTest; 
        FW_Admin_ID = a.FW_Admin_ID;
        FW_Admin_TKN = a.FW_Admin_TKN;
    }
    String AAA = "";
    protected void run() { 
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("All Sectors", "GET", 
            BaseAPI + "/sectors", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                SectorID = jsonArray.getJSONObject(0).getString("id");
                SECTOR = jsonArray.getJSONObject(0).getString("name");
                for (int i = 0; i < jsonArray.length(); i++) {
                    SECTOR_IDS.add(jsonArray.getJSONObject(i).getString("id"));
                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }          
    }          
}

