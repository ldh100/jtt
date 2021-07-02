package C360;
class C360_login extends C360_GUI{
    protected C360_login(C360_GUI a) {
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() {  
    try {    
        EX += " - " + "\t" + " === Login " + "\t" + " ===== " + "\t" + " == Login  Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira"); 
        Wait_For_Element_By_Path_Presence("Wait for Home Image", "xpath", "//img[contains(@class, 'right-side')]", ParentTest,"no_jira");
            if (FAIL) { return;}
        Page_URL("C360 Login page", ParentTest, "no_jira"); 
        Element_By_Path_Text("Get 'Welcome' text", "xpath", "//h1[contains(text(), 'Welcome to Cafe360')]", ParentTest,"no_jira");
//        Element_By_Path_Text("Get 'Email' Text", "xpath", "//*[contains(text(), 'Email')]", ParentTest, "no_jira"); 
//        Element_By_Path_Text("Get 'Password' Text", "xpath", "//*[contains(text(), 'Password')]", ParentTest, "no_jira"); 
//        Element_By_Path_Text("Get 'Sign In' Text", "xpath", "//*[contains(text(), 'Sign In')]", ParentTest, "no_jira");  
//        Element_By_Path_Text("Get 'Forgot Password' Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", ParentTest,"no_jira"); 
//        
//        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "*//input[@type='text']", ParentTest,"no_jira");
//        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", "*//input[@type='password']", ParentTest,"no_jira");
//        Element_By_Path_Text_Enter("Enter Valid Email", "id", "input-9", ADMIN_ID, false, ParentTest,"no_jira");
//            if (FAIL) { return;}            
//        Element_By_Path_Text_Enter("Enter Valid Password", "id", "input-13", ADMIN_PW, true, ParentTest,"no_jira");
//            if (FAIL) { return;}
//        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign In')]", ParentTest,"no_jira");
//            if (FAIL) { return;} 
//        Wait_For_Element_By_Path_Visibility("Wait for 'C360 Dashboard...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest,"no_jira");        
//            if (FAIL) { return;}
//        Page_URL("Cafe 360 Dashboard URL", ParentTest,"no_jira");         
            if (FAIL) { return;}            
        EX += " - " + "\t" + " === ^ Login " + "\t" + " ===== " + "\t" + " == ^ Login End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
    } catch (Exception ex){}   // =============================================  
    }
}
