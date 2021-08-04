package API;

import java.util.Base64;

class user_mobile extends API_GUI{
    protected user_mobile(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        MOBILE_ID = a.MOBILE_ID;
        MOBILE_PW = a.MOBILE_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Realm = A.Func.Realm_ID(app, env);
        
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + MOBILE_PW).getBytes());
        JOB_Api_Call("Mobile User Authentication - Wrong ID", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira"); 

        Auth = "Basic " + Base64.getEncoder().encodeToString((MOBILE_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("Mobile User Authentication - Wrong PW", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");  
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((MOBILE_ID + ":" + MOBILE_PW).getBytes());
        JOB_Api_Call("Mobile User Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try {
                if(json.has("user")) Mobile_User_ID = json.getString("user"); 
                if(json.has("token")) Mobile_User_TKN = json.getString("token");  
            } catch (Exception ex){
                //
            }
        }
        
        Auth = "Bearer " + Mobile_User_TKN;
        
        JOB_Api_Call("Mobile User > /permissions", "GET", 
            BaseAPI + "/user/" + Mobile_User_ID + "/permissions", Auth, "", 200, ParentTest, "no_jira");
        
        JOB_Api_Call("Mobile User ", "OPTIONS", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");          
        
        BODY = "{\"phone\":" + "1" + NewID + "}";                       //  Update Mobile user Phone
        JOB_Api_Call("Mobile User - Update Phone", "PUT", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
        BODY = "{\"gender\":" + "male" + "}";                           //  Update Mobile user Gender
        JOB_Api_Call("Mobile User - Update Gender", "PUT", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira");        
        
        JOB_Api_Call("Mobile User Zendesk JWT token", "GET", 
            BaseAPI + "/user/zendesk", Auth, "", 200, ParentTest, "no_jira");         

        JOB_Api_Call("Mobile User Send Email Verification", "POST",   //  Mobile User Email Verification ================
            BaseAPI + "/user/" + Mobile_User_ID + "/verification?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");   
        String verification_token = "";
        
        BODY = "{\"email\":\"" + MOBILE_ID + "\"," +            //  Mobile User Forgot Password ================
                "\"type\":\"" + "forgot_password" + "\"}";
        JOB_Api_Call("Mobile New User - Forgot password", "POST", 
            BaseAPI + "/user/forgotpassword?realm=" + Realm, Auth, BODY, 200, ParentTest, "no_jira");          

        BODY = "{\"name\":" +                                    //  New Mobile User > Email Exists  =================
               "{\"first\":\"Oleg\",\"last\":\"Spozito\"}," + 
            "\"email\":\"" + Mobile_User_ID + "\"," +
            "\"phone\":" + "1" + NewID + "," +
            "\"realm\":\"" + Realm + "\"," +
            "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
        JOB_Api_Call("Mobile Create New User > Email Already Exists", "POST", 
            BaseAPI + "/user", Auth, BODY, 409, ParentTest, "no_jira"); 
              
                
//        BODY = "{\"name\":" +                                       //  New Mobile User ===============================
//                "{\"first\":\"Jtt\",\"last\":\"Automation\"}," + 
//            "\"email\":\"" + "a_" + NewID + "@gmail.com" + "\"," +
//            "\"phone\":" + "1" + NewID + "," +
//            "\"realm\":\"" + Realm + "\"," +
//            "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
//        JOB_Api_Call("Mobile User - Create New", "POST", 
//            BaseAPI + "/user", Auth, BODY, 200, ParentTest, "no_jira"); 
//        String New_User_ID = "";
//        if(json != null){ 
//            try {
//                if(json.has("id")) New_User_ID = json.getString("id"); 
//            } catch (Exception ex){
//                String AAAA = ex.getMessage();
//            }
//        } 

    }
}
