package FW_API;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

class events extends FW_API_main{
    protected events(FW_API_main a) {
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
    protected void run() { 
        Auth = "Bearer " + FW_Admin_TKN;
        JOB_Api_Call("All Events (returns 502 in Prod)", "GET", 
            BaseAPI + "/events", Auth, "", 502, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                                              
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        } 
        
        Date FR = new DateTime(new Date()).minusYears(1).toDate();
        Date TO = new DateTime(new Date()).plusMonths(6).toDate();
        String From = new SimpleDateFormat("yyyy-MM-dd").format(FR);
        String To = new SimpleDateFormat("yyyy-MM-dd").format(TO);
        
        JOB_Api_Call("Market <ID> Events from: " + From + " to: " + To, "GET", 
            BaseAPI + "/markets/" + RestID + "/events?start=" + From + "&end=" + To, Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                             
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }         
        JOB_Api_Call("Unit <ID> Events from: " + From + " to: " + To, "GET", 
            BaseAPI + "/units/" + UnitID + "/events?start=" + From + "&end=" + To, Auth, "", 200, ParentTest, "no_jira"); 
        if(jsonArray != null){
            try {
                //                             
            } catch (Exception ex){
                AAA = ex.getMessage();
            }
        }        
    }          
}

