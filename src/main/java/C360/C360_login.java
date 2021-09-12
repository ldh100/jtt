package C360;
class C360_login extends C360_GUI{
    protected C360_login(C360_GUI a) {
        USER_NAME = a.USER_NAME;
        USER_PW = a.USER_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        
        _Invalid_entries = a._Invalid_entries;
    }
    protected void run() {   
    try { 
        EX += " - " + "\t" + " === Login " + "\t" + " ===== " + "\t" + " == Login  Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira"); 
        Wait_For_Element_By_Path_Presence("Wait for Home Image", "xpath", "//img[contains(@class, 'right-side')]", ParentTest,"no_jira");
            if (FAIL) { return;}
        Page_URL("C360 Login page", ParentTest, "no_jira"); 
        Element_By_Path_Text("Get 'Welcome' text", "xpath", "//h4[contains(text(), 'Welcome to Cafe360')]", ParentTest,"no_jira");
        Element_By_Path_Text("Get 'Sign in..' text", "xpath", "//p[contains(text(), 'Sign in ')]", ParentTest,"no_jira");
        Element_By_Path_Text("Get 'Don't have..' text", "xpath", "//p[contains(text(), 'Reach out to your Compass Manager')]", ParentTest,"no_jira");
        Element_By_Path_Text("Get 'Your Compass Account' text", "xpath", "//span[contains(text(), 'Your Compass Account')]", ParentTest,"no_jira");
        Element_By_Path_Click("Click 'Your Compass Account'", "id", "cafe360-login-button", ParentTest,"no_jira");
            if (FAIL) { return;}  
            
        Element_E1_Find("Find 'Language' dropdown", "xpath", "//select[contains(@class, 'locale-select')]", ParentTest, "no_jira");
        Element_By_Path_Text("Get 'English' text", "id", "en", ParentTest,"no_jira");        
        Element_By_Path_Text("Get 'French' text", "id", "fr", ParentTest,"no_jira");        
        Element_By_Path_Text("Get 'Spanish' text", "id", "sp", ParentTest,"no_jira");
        Element_By_Path_Text("Get 'Forgot password?' text", "xpath", "//a[contains(@class, 'forgot-password pull-right')]", ParentTest,"no_jira");
        
        if(_Invalid_entries){
            Element_By_Path_Text_Enter("Enter Invalid Username", "id", "username", "test.invalid@place.com", false, ParentTest, "no_jira");  
                if (FAIL) { return;}            
            Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", USER_PW, true, ParentTest, "no_jira");  
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Sign In'", "name", "login", ParentTest, "no_jira");  
                if (FAIL) { return;}  
            Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true, ParentTest, "no_jira");  
                if (FAIL) { return;} 
        } 
                
        Element_By_Path_Text_Enter("Enter Valid Username", "id", "username", USER_NAME, false, ParentTest,"no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", USER_PW, true, ParentTest,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'LOGIN'", "name", "login", ParentTest,"no_jira");
            if (FAIL) { return;}
                
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);
        Page_URL("Login page URL", ParentTest, "no_jira");  
        
        List_L3("Check for Login Messages (count)", "xpath", "//*[@class = 'message' or @class = 'note note-danger']", ParentTest, "no_jira");              
        if(L3.isEmpty()){ // L3 specific for Login Messages - if No "will expire" or "Locked" - PASS, otherwise - WARN > procees to FAIl in Execution
            Login_OK = true;
        }else{
            Element_Text("Message text", L3.get(0), ParentTest, "no_jira"); 
            if(t.contains("locked")){   // This account has been locked.  
                Login_OK = false;
                return;
            } else {                      // ...will expire
                Element_E1_Find("Find 'Reset Password Now' button", "name", "resetPasswordNow", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_E1_Find("Find 'Reset Later' button", "name", "continue", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_Click("Click 'Reset Later'", e1, ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);  
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                    if (FAIL) { return;}  
                Thread.sleep(500);  
                Login_OK = true;
            }
        }     

        Wait_For_Element_By_Path_Presence("Wait for User Avatar", "xpath", "//span[@class='p-avatar-text']", ParentTest,"no_jira");
            if (FAIL) { 
                Login_OK = false;
                return;
            }
        Login_OK = true;    
        EX += " - " + "\t" + " === ^ Login " + "\t" + " ===== " + "\t" + " == ^ Login End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){}   // =============================================  
    }
}
