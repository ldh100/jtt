package FW_API;

import java.util.ArrayList;


class autoscheduler extends FW_API_main{
    protected autoscheduler(FW_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        NewID = a.NewID;
        ParentTest = a.ParentTest; 
        FW_Admin_ID = a.FW_Admin_ID;
        FW_Admin_TKN = a.FW_Admin_TKN;
        RestID = a.RestID;
        UnitID = a.UnitID; 
    }
    String AAA = "";
    String SchedulerID = "";
    protected void run() { 
        Auth = "Bearer " + FW_Admin_TKN;
        
        // https://fg74jjx1x7.execute-api.us-east-1.amazonaws.com/v1/autoscheduler?marketId=6549f9260e654920a570a91c8c0c338c
        JOB_Api_Call("Market <ID> autoscheduler", "GET", 
            BaseAPI + "/autoscheduler?marketId=" + RestID, Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                              
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        //https://fg74jjx1x7.execute-api.us-east-1.amazonaws.com/v1/autoscheduler/e50c26a2bb264cec9dddabd8d6e9bdd1   <<< ??????
        JOB_Api_Call("Autoscheduler > Invalid ID", "GET", 
            BaseAPI + "/autoscheduler/" + "e50c26a2bb264___9dddabd8d6e9bdd1", Auth, "", 404, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                              
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }          
        String AutoschedulerID = "e50c26a2bb264cec9dddabd8d6e9bdd1";        
        JOB_Api_Call("Autoscheduler <ID>", "GET", 
            BaseAPI + "/autoscheduler/" + AutoschedulerID, Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                              
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }        
    } 
    
}
