package WO;
import java.util.Date;

class WO_account_password extends WO_GUI {
    protected WO_account_password(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        MOBILE_PW = a.MOBILE_PW;

        SITE = a.SITE;
        _Edit_item = a._Edit_item;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run () { 
    try {
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}       
        Element_By_Selector_Click("Click 'My account'", "id", "to-my-account", ParentTest, "no_jira");
          if (FAIL) { return;}         
        Element_By_Selector_Click("Click 'Update Password' tab", "id", "to-change-password", ParentTest, "no_jira");
           if (FAIL) { return;} 
        Element_By_Selector_Text_Enter("Enter wrong Current Password", "id", "Password", "Abcdf_123", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text_Enter("Enter 'New password' > 'abcd'", "id", "New password", "abcd", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > '... min. of 9 characters, 1 capital, 1 number or 1 special character'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter/correct 'New password' > '_A123'", "id", "New password", "_A123", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text_Enter("Enter 'Confirm password' > 'no match'", "id", "Confirm password", "abcd", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > '... must match'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter/correct 'Confirm password' > '_A123'", "id", "Confirm password", "_A123", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Click("Click 'Change Password' button", "id", "change-password-btn", ParentTest, "no_jira");
           if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;} 
        List_L1("Check Error Message(s)", "xpath", "//*[contains(@class, 'error-card')]", ParentTest, "no_jira");
        if(!L1.isEmpty()){  // Check Error: Reset password error Something went wrong when trying to reset your password. Please try again or contact us if the issue persists. Ok
            Element_Text("Get Error Message(s)", L1.get(L1.size() - 1), ParentTest, "no_jira");
            Element_Child_Click("Click 'Error Card > Ok'", L1.get(L1.size() - 1), "xpath", ".//*[text()='Ok']", ParentTest, "no_jira");             
                //if (FAIL) { return;}  
        }                
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }  
}
