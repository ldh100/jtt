package FW_API;

class events extends FW_API_main{
    protected events(FW_API_main a) {
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
        JOB_Api_Call("All Events", "GET", 
            BaseAPI + "/events", Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
//                UnitID = jsonArray.getJSONObject(0).getString("id");
//                UNIT = jsonArray.getJSONObject(0).getString("name");
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    UNIT_IDS.add(jsonArray.getJSONObject(i).getString("id"));
//                }                               
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        String START = "";
        String END = "";
        //https://fg74jjx1x7.execute-api.us-east-1.amazonaws.com/v1/markets/a842f99d300045fc93b006e531671ab5/events?start=2021-11-01&end=2022-05-31

        //https://fg74jjx1x7.execute-api.us-east-1.amazonaws.com/v1/units/b7e1de7d6e2b479db712412dc329ad70/events?start=2020-08-01&end=2023-08-27        
    }          
}

