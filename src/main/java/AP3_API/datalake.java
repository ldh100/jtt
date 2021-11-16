package AP3_API;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
/*
Corey Cosman        
POST https://api.compassdigital.org/<stage>/datalake/sql
and then whatever entity is being searched for can be specified in the query of the body, for example, orders:
{
    "query": "SELECT * FROM datalake.orders WHERE date_created >= '2021-09-07T12:00:02.000Z' LIMIT 1000"
}
*/
class datalake extends AP3_API_GUI{
    protected datalake(AP3_API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        ParentTest = a.ParentTest;
    }
    private String AAA = "";
    private String sql = "";
    protected void run() {  

        String DATE = ZonedDateTime.now( ZoneOffset.UTC ).format( DateTimeFormatter.ISO_INSTANT );
        sql = "SELECT * FROM datalake.orders WHERE date_created <= '" + DATE + "' LIMIT 10";
        
        Auth = "Bearer " + "fgsgsdgsdfggsfdgsdfgsdfgf";        
        BODY = "{\"query\":\"" + sql + "\"}";  
        JOB_Api_Call("Datalake SQL > Invalid Token", "POST", 
            BaseAPI + "/datalake/sql", Auth, BODY, 401, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
        
        Auth = "Bearer " + AP3_TKN;        
        JOB_Api_Call("Datalake SQL > Valid Token", "POST", 
            BaseAPI + "/datalake/sql", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }
    }
}
