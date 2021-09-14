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
        SiteID = a.SiteID;
    }
    String AAA = "";

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
                AAA = ex.getMessage();
            }
        }

        Auth = "Bearer " + Mobile_User_TKN;
        String SECRET = "APA91bH5sCRipn3EPZNZFyyY552jisUoO1ZJDcDYpiHxLYvlTVqWRrXGsqqRsBBRjIpenEOo0EfSOECXotgSeN8yLS1_zG86EbLJl7DFxOYL1I2JfeD43xE4m20esSva7SDrb4rtmfYH";
        BODY = "{\"fcm_token\":\'" + SECRET + "\"}";  
        JOB_Api_Call("Mobile User > /secret/fcm_token", "POST", 
            BaseAPI + "/user/" + Mobile_User_ID + "/secret/fcm_token", Auth, BODY, 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
        }           

        JOB_Api_Call("Mobile User > /secret/fcm_token", "GET", 
            BaseAPI + "/user/" + Mobile_User_ID + "/secret/fcm_token", Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            AAA = json.toString(4);
            if(json.has("fcm_token")) FCM_TKN = json.getString("fcm_token");
        } 
        
        JOB_Api_Call("Mobile User > /permissions", "GET", 
            BaseAPI + "/user/" + Mobile_User_ID + "/permissions", Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("Mobile User ", "OPTIONS", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");          
        
        BODY = "{\"phone\":" + "1" + NewID + "}";                       //  Update Mobile user Phone
        JOB_Api_Call("Mobile User - Update Phone", "PATCH", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira");
        
        BODY = "{\"gender\":" + "\"male\"" + "}";                           //  Update Mobile user Gender
        JOB_Api_Call("Mobile User - Update Gender", "PATCH", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira");  
        if(json != null){
            AAA = json.toString(4);
        }         
        
        
        BODY = "{\"name\":" +                                         //  Change First/Last Name  =================
               "{\"first\":\"API\",\"last\":\"Testing\"}," + 
                "\"realm\":\"" + Realm + "\"}";                        
        JOB_Api_Call("Mobile User - Change First/Last Name", "PUT", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira");           
        
        BODY = "{\"name\":" +                                         //  Update Email Notification Options  =================
               "{\"first\":\"API\",\"last\":\"Testing\"}," + 
                "\"realm\":\"" + Realm + "\"" +
                "\"meta\": " +
                    "{\"marketing_opt_in_source\":\"App\"," +
                    "\"order_status_notification\":{\"send_emails\":true}," +
                    "\"marketing_opt_in\":false}" +
                "\"}";                         
        JOB_Api_Call("Mobile User - Update Email Notification Options", "PUT", 
            BaseAPI + "/user/" + Mobile_User_ID, Auth, BODY, 200, ParentTest, "no_jira"); 

        JOB_Api_Call("Mobile User Zendesk JWT token", "GET", 
            BaseAPI + "/user/zendesk", Auth, "", 200, ParentTest, "no_jira");         

        if(env.equals("DE")){                                  // not in Staging, Production yet
            JOB_Api_Call("Mobile User Send Email Verification", "POST",   //  Mobile User Email Verification ================
                BaseAPI + "/user/" + Mobile_User_ID + "/verification?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");  
            if(json != null){
                AAA = json.toString(4);
            }  
         
            
//            // ==========    Where to Get Verification_TKN from ???? ================
//            BODY = "{\"verification_token\":" + Verification_TKN + "}";  
//            JOB_Api_Call("Mobile User Email Verification Confirm", "PUT",   //  Mobile User Email Verification ================
//                BaseAPI + "/user/" + Mobile_User_ID + "/verification/confirm", Auth, BODY, 200, ParentTest, "no_jira");  
//            if(json != null){
//                AAA = json.toString(4);
//                if(json.has("verification_token")) Verification_TKN = json.getString("verification_token");
//            }             
 
        }
        
        BODY = "{\"email\":\"" + MOBILE_ID + "\"," +            //  Mobile User Forgot Password ================
                "\"type\":\"" + "forgot_password" + "\"}";
        JOB_Api_Call("Mobile User - Forgot password", "POST", 
            BaseAPI + "/user/forgotpassword?realm=" + Realm, Auth, BODY, 200, ParentTest, "no_jira");          

        BODY = "{\"name\":" +                                    //  New Mobile User > Email Exists  =================
               "{\"first\":\"Oleg\",\"last\":\"Spozito\"}," + 
            "\"email\":\"" + Mobile_User_ID + "\"," +
            "\"phone\":" + "1" + NewID + "," +
            "\"realm\":\"" + Realm + "\"," +
            "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
        JOB_Api_Call("Mobile Create New User > Email Already Exists", "POST", 
            BaseAPI + "/user", Auth, BODY, 409, ParentTest, "no_jira"); 
        
        JOB_Api_Call("Mobile User - Location > /group/'SiteID'?include_brands_config=true", "GET",
                BaseAPI + "/location/group/" + SiteID + "?include_brands_config=true", Auth, "", 200, ParentTest, "no_jira");
        if (json != null) {
            try {
                AAA = json.toString(4);
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }         
              
        if (!"PR".equals(env)) {        
            BODY = "{\"name\":" +                                       //  New Mobile User ===============================
                    "{\"first\":\"Jtt\",\"last\":\"Automation\"}," + 
                "\"email\":\"" + "a_" + NewID + "@gmail.com" + "\"," +
                "\"phone\":" + "1" + NewID + "," +
                "\"realm\":\"" + Realm + "\"," +
                "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
            JOB_Api_Call("Mobile User - Create New", "POST", 
                BaseAPI + "/user", Auth, BODY, 200, ParentTest, "no_jira"); 
            String New_User_ID = "";
            if(json != null){ 
                try {
                    if(json.has("id")) New_User_ID = json.getString("id"); 
                } catch (Exception ex){
                    String AAAA = ex.getMessage();
                }
            } 
        }    
    }
}
