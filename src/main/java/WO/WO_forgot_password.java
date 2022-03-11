package WO;

import java.util.Date;

class WO_forgot_password extends WO_GUI {
    protected WO_forgot_password(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        MOBILE_ID = a.MOBILE_ID;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run () { 
    try {
        Navigate_to_URL("Navigate to " + url, url, ParentTest, "no_jira");              
            if (FAIL) { return;}               
        Element_By_Selector_Click("Click 'Log in'", "id", "nav-log-in-btn", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Forgot Password'", "id", "to-forgot-password", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text_Enter("Enter Valid Email", "id", "Email", MOBILE_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
//        Element_By_Selector_Click("Click 'Back to login'", "id", "to-log-in", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Back to login'", "xpath", "//p[text()=' Back to log in ']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Forgot Password'", "id", "to-forgot-password", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Reset Password'", "id", "reset-password-btn", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}
        Find_Text("Verify '... Sent' message", "sent!", true, ParentTest, "no_jira"); 
//        Element_By_Selector_Click("Click 'Back to login'", "id", "to-log-in", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Back to login'", "xpath", "//p[text()=' Back to log in ']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
//        Element_By_Selector_Click("Click 'x' > close 'Login' form", "id", "modal-close-btn", ParentTest, "no_jira"); 
        Element_By_Selector_Click("Click 'x' > close 'Login' form", "xpath", "//div[@class='v-dialog__content v-dialog__content--active']/descendant::button[@id='modal-close-btn']", ParentTest, "no_jira"); 
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    } 
    }
}
