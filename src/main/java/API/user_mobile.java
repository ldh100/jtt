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
    try {
        //<editor-fold defaultstate="collapsed" desc="Mobile User Authentication">  
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
        //</editor-fold>  
        
        //<editor-fold defaultstate="collapsed" desc="Mobile User Payment">          
        Auth = "Bearer " + Mobile_User_TKN;
        JOB_Api_Call("Mobile User Payment", "GET", 
            BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "", 200, ParentTest, "no_jira");
        if(json != null){
            try{
                //
                
            } catch (Exception ex){
                //
            }
        } 
        long m1 = System.currentTimeMillis();                     
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // - 7 days
        JOB_Api_Call("Mobile User Orders", "GET", 
            BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1, Auth, "", 200, ParentTest, "no_jira");
        //</editor-fold>     
    } catch (Exception ex){}   // =============================================  
    }
}
