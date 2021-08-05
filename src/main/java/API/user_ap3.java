package API;

import java.util.Base64;

class user_ap3 extends API_GUI{
    protected user_ap3(API_GUI a) {
        app = a.app;
        env = a.env;
        BaseAPI = a.BaseAPI;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        RUNNER_ID = a.RUNNER_ID;
        RUNNER_PW = a.RUNNER_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
        Realm = A.Func.Realm_ID("AP3", env);
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((RUNNER_ID + ":" + RUNNER_PW).getBytes());
        JOB_Api_Call("Bolter/Bolter Login in AP3", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");        
        
        Auth = "Basic " + Base64.getEncoder().encodeToString(("WrongID" + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 Admin Authentication - Wrong ID", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");
        
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + "WrongPW").getBytes());
        JOB_Api_Call("AP3 Admin Authentication - Wrong PW", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 401, ParentTest, "no_jira");
                
        Auth = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + ADMIN_PW).getBytes());
        JOB_Api_Call("AP3 Admin Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){ 
            try {
                if(json.has("user")) AP3_User_ID = json.getString("user"); 
                if(json.has("token")) AP3_TKN = json.getString("token");  
            } catch (Exception ex){
                //
            }
        }

        Auth = "Bearer " + AP3_TKN;
        JOB_Api_Call("AP3 User > /realm", "GET", 
            BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000", Auth, "", 200, ParentTest, "no_jira");

        JOB_Api_Call("AP3 User > /permissions", "GET", 
            BaseAPI + "/user/" + AP3_User_ID + "/permissions" + "?nocache=1", Auth, "", 200, ParentTest, "no_jira");
        
        JOB_Api_Call("AP3 User ", "OPTIONS", 
            BaseAPI + "/user/" + AP3_User_ID, Auth, "", 200, ParentTest, "no_jira");  
        
        BODY = "{\"id\":\"" + AP3_User_ID + "\"," + //  Update AP3 user Phone
                "\"phone\":" + "1" + NewID + "}";
        JOB_Api_Call("AP3 User - Update Phone", "PUT", 
            BaseAPI + "/user/" + AP3_User_ID, Auth, BODY, 200, ParentTest, "no_jira");
         
        BODY = "{\"name\":" +                       //  New AP3 Admin User > Email Exists  =================
                "{\"first\":\"Oleg\",\"last\":\"Spozito\"}," + 
            "\"permissions\":" +
                "{\"scopes\":[\"*:*\",\"*:user\",\"admin_role:*:*\",\"write:order:*\",\"kick:menu:*\",\"read:analytics:*\"]}," +
            "\"email\":\"" + ADMIN_ID + "\"," +
            "\"phone\":" + "1" + NewID + "," +
            "\"realm\":\"" + Realm + "\"," +
            "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
        JOB_Api_Call("AP3 User - Create New > Email Exists", "POST", 
            BaseAPI + "/user", Auth, BODY, 409, ParentTest, "no_jira"); 
        
        
        BODY = "{\"name\":" +       //  ==================   New AP3 Admin User ===============================
                "{\"first\":\"Oleg\",\"last\":\"Spozito\"}," + 
            "\"permissions\":" +
                "{\"scopes\":[\"*:*\",\"*:user\",\"site_operator_role:group:\",\"write:order:*\",\"kick:menu:*\",\"read:analytics:*\"]}," +
            "\"email\":\"" + "a_" + NewID + "@gmail.com" + "\"," +
            "\"phone\":" + "1" + NewID + "," +
            "\"realm\":\"" + Realm + "\"," +
            "\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"}";
        JOB_Api_Call("AP3 User - Create New Admin", "POST", 
            BaseAPI + "/user", Auth, BODY, 200, ParentTest, "no_jira"); 
        String New_AP3_User_ID = "";
        if(json != null){ 
            try {
                if(json.has("id")) New_AP3_User_ID = json.getString("id"); 
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }  
        
        Auth = "Basic " + Base64.getEncoder().encodeToString(("a_" + NewID + "@gmail.com" + ":" + "Zxtsaq9ppnppvbyi11f0nk").getBytes());
        JOB_Api_Call("AP3 New User Authentication", "GET", 
            BaseAPI + "/user/auth" + "?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");
        String New_AP3_User_TKN = "";
        if(json != null){ 
            try {
                if(json.has("token")) New_AP3_User_TKN = json.getString("token");  
            } catch (Exception ex){
                String AAAA = ex.getMessage();
            }
        }        
        Auth = "Bearer " + New_AP3_User_TKN;
        BODY = "{\"password\":\"" + "Zxtsaq9ppnppvbyi11f0nk" + "\"," +  //  New AP3 User Change Password  =========================
                "\"new_password\":\"" + "Password11" + "\"}";
        JOB_Api_Call("AP3 New User - Change password", "POST", 
            BaseAPI + "/user/" + New_AP3_User_ID + "/changepassword", Auth, BODY, 200, ParentTest, "no_jira");   
        
        BODY = "{\"email\":\"" + "a_" + NewID + "@gmail.com" + "\"," +  //  New AP3 User Forgot Password  ==========================
                "\"type\":\"" + "new_user" + "\"}";
        JOB_Api_Call("AP3 New User - Forgot password", "POST", 
            BaseAPI + "/user/forgotpassword?realm=" + Realm, Auth, BODY, 200, ParentTest, "no_jira");   
        
        JOB_Api_Call("AP3 User Logout", "DELETE",               // New AP3 User Logout ===============================
            BaseAPI + "/user/logout?realm=" + Realm, Auth, "", 200, ParentTest, "no_jira");  
        
        Auth = "Bearer " + AP3_TKN;
        JOB_Api_Call("AP3 User - Delete", "DELETE",             // New AP3 User Delete ===============================
            BaseAPI + "/user/" + New_AP3_User_ID, Auth, "", 200, ParentTest, "no_jira");  
    }
}
