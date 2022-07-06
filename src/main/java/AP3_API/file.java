package AP3_API;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import org.json.JSONObject;

class file extends AP3_API_GUI{
    protected file(AP3_API_GUI a) {
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
        String File_Path = System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_brand_image.png"; 
        try{
            byte[] File_Bytes = Files.readAllBytes(Paths.get(File_Path));
            File_Base64 = Base64.getEncoder().encodeToString(File_Bytes);
        }catch(Exception ex){
            AAA = ex.getMessage();
        }

        Auth = "";
        BODY = "";
        JOB_Api_Call("Upload a file to CDL S3 - Unauthorized", "POST", 
            BaseAPI + "/file", Auth, BODY, 401, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
        
        Auth = "Bearer " + AP3_TKN;        
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

        String Wrong_File_Base64 = "TestFile_" + NewID + "\n" + "Line 1";
        requestParams = new JSONObject();
        requestParams.put("file_base64", Wrong_File_Base64);
        requestParams.put("file_name", "TestFile_" + NewID + "_Please_Delete.txt");
        //requestParams.put("bucket_name", "Invalid_Bucket"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Upload a file to CDL S3 - File object incorrect Format", "POST", 
            BaseAPI + "/file", Auth, BODY, 400, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        }   

        String New_S3_File_URL = "";
        requestParams = new JSONObject();
        requestParams.put("file_base64", File_Base64);
        requestParams.put("file_name", "TestFile_" + NewID + "_Please_Delete.txt");
        requestParams.put("bucket_name", "images.compassdigital.org"); 
        BODY = requestParams.toString();
        JOB_Api_Call("Upload a file to CDL S3 - Expect OK", "POST", 
            BaseAPI + "/file", Auth, BODY, 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
            New_S3_File_URL = json.getString("url");
        }   
  
        requestParams = new JSONObject();
        requestParams.put("bucket_name", "images.compassdigital.org"); 
        requestParams.put("file_path", New_S3_File_URL);
        BODY = requestParams.toString();
        JOB_Api_Call("Delete uploaded file from CDL S3 - Expect OK", "DELETE", 
            BaseAPI + "/file", Auth, BODY, 200, ParentTest, "no_jira"); 
        if(json != null){
            AAA = json.toString(4);
        } 
    }
}
