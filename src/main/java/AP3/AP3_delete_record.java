package AP3;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

class AP3_delete_record extends AP3_GUI{
    protected AP3_delete_record (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        appId = a.appId;
        BaseAPI = a.BaseAPI;             
        AP3_TKN = a.AP3_TKN;
    }    

    protected void run(String R, String New_SITE_ID) { 
    try {       
        String BODY = "";     
        JOB_Api_Call(R + " > 'location/record/' > API", "DELETE", BaseAPI + "/location/record/" + New_SITE_ID, "Bearer " + AP3_TKN, BODY, 200, ParentTest, "no_jira");
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    } 
    }
}
