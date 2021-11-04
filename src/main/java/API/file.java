package API;

import java.util.Base64;
import org.json.JSONObject;

class file extends API_GUI{
    protected file(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;
        SiteID = a.SiteID;
        BrandID = a.BrandID;
        UnitID = a.UnitID;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    JSONObject requestParams = new JSONObject();
    String AAA = "";
    String File_Base64 = "";
    protected void run() { 
        Auth = "";
        BODY = "";
        JOB_Api_Call("Upload a file to CDL S3 - Unauthorized", "POST", 
            BaseAPI + "/file", Auth, BODY, 401, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        
        Auth = "Bearer " + AP3_TKN;
        File_Base64 = Base64.getEncoder().encodeToString(("TestFile_" + NewID + "\n" + "Line 1").getBytes());
        requestParams = new JSONObject();
        requestParams.put("file_base64", File_Base64);
        requestParams.put("file_name", "TestFile_" + NewID + "_Please_Delete.txt");
        requestParams.put("bucket_name", "Invalid_Bucket"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Upload a file to CDL S3 - Invalid_Bucket", "POST", 
            BaseAPI + "/file", Auth, BODY, 400, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }  
        
        requestParams = new JSONObject();
        //requestParams.put("file_base64", File_Base64);
        requestParams.put("file_name", "TestFile_" + NewID + "_Please_Delete.txt");
        //requestParams.put("bucket_name", "Invalid_Bucket"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Upload a file to CDL S3 - File object Missing", "POST", 
            BaseAPI + "/file", Auth, BODY, 400, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        
        File_Base64 = "TestFile_" + NewID + "\n" + "Line 1";
        requestParams = new JSONObject();
        requestParams.put("file_base64", File_Base64);
        requestParams.put("file_name", "TestFile_" + NewID + "_Please_Delete.txt");
        //requestParams.put("bucket_name", "Invalid_Bucket"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Upload a file to CDL S3 - File object incorrect Format", "POST", 
            BaseAPI + "/file", Auth, BODY, 400, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }   
        
        if (!env.equals("PR")) {
            // Uplod file
        }        
    }
}
