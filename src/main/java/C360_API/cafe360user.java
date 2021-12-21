package C360_API;

import java.util.Base64;

// https://api.compassdigital.org/dev/cafe360user
class cafe360user extends C360_API_main{
    protected cafe360user(C360_API_main a) {
        env = a.env;
        BaseAPI = a.BaseAPI;
        C360_ADMIN_ID = a.C360_ADMIN_ID;
        C360_ADMIN_PW = a.C360_ADMIN_PW;
        NewID = a.NewID;
        ParentTest = a.ParentTest;        
    }
    String AAA = "";
    protected void run() { 
        // https://api.compassdigital.org/dev/cafe360user
        
    }
}
