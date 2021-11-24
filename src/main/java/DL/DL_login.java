package DL;

class DL_login extends DL_GUI {
    protected DL_login(DL_GUI a) {
        url = a.url;
        d1 = a.d1;
        Login_OK = a.Login_OK;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(String ID, String PW, boolean Invalid_Login) {     
    try {    
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");                                 
        Wait_For_Element_By_Path_Presence("Wait 'USERNAME' input", "id", "username", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Page_URL("Foodbuy Login page URL", ParentTest, "no_jira");         
//        Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot your Password?')]", ParentTest, "no_jira");  
//            if (FAIL) { return;}
        Element_By_Path_Text("Button 'Sign in' Text", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira");   
        Element_By_Path_Click("Click 'USERNAME' input", "id", "username", ParentTest, "no_jira");  
            if (FAIL) { return;}  
            
        if(Invalid_Login){            
            // TestCase 01 with Invalid Username/Valid Password by Prathyusha Deshpande
            Element_By_Path_Text_Enter("Enter Invalid Username", "id", "username", "test.invalid@place.com", false, ParentTest, "no_jira");  
                if (FAIL) { return;}            
            Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", PW, true, ParentTest, "no_jira");  
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Sign In'", "name", "login", ParentTest, "no_jira");  
                if (FAIL) { return;}  
            Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true, ParentTest, "no_jira");  
                if (FAIL) { return;}

            //TestCase 02  with Valid Username/Invalid Password by Prathyusha Deshpande
            Element_By_Path_Text_Enter("Enter Valid Username", "id", "username", ID, false, ParentTest, "no_jira");  
                if (FAIL) { return;}            
            Element_By_Path_Text_Enter("Enter Invalid  password", "id", "password", "InvalidPW", false, ParentTest, "no_jira");  
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Sign In'", "name", "login", ParentTest, "no_jira");  
                if (FAIL) { return;}  
            Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true, ParentTest, "no_jira");  
        }
        
        // ==== Valid Login
        Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", ID, false, ParentTest, "no_jira");  
            if (FAIL) { return;}            
        Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", PW, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Sign In'", "name", "login", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);
        Page_URL("Login page URL", ParentTest, "no_jira");  
        
        List_L3("Check for Login Messages (count)", "xpath", "//*[@class = 'message' or @class = 'note note-danger']", ParentTest, "no_jira");              
            if (FAIL) { return;}
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
                Login_OK = false;
                return;
            }
        }
        Find_Text("Find 'Invalid credentials'", "Invalid credentials.", false, ParentTest, "no_jira"); 
        if (t.toLowerCase().contains("invalid")) { 
            EX += _t + "\t" + "Check for 'Invalid credentials' - unexpected" + "\t" + ID + "\t" + "Invalid credentials." + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
            F += "Step: " + _t + " > " + ID + " > " + "Invalid credentials." + "\r\n";
            Login_OK = false;
            return;  // Login Failed FATAL for this User ===================================================
        }
    } catch (Exception ex){}   // =============================================  
    }
}
