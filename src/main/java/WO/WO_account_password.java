package WO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

class WO_account_password extends WO_GUI {
    protected WO_account_password(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;

        New_ID = a.New_ID;
        Site_ID = a.Site_ID;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }


    protected void run() {   
    try {        
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}   
        Element_By_Selector_Click("Click Menu > 'My Account'", "xpath", "//h4[text()='My account']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}    
        //Element_By_Selector_Text("Get 'Payment methods' tab text", "xpath", "//a[@href='/account-settings/change-password']", ParentTest, "no_jira");  
//        Element_By_Selector_Click("Click 'Update Password' tab", "xpath", "//a[@href='/account-settings/change-password']", ParentTest, "no_jira");
//          if (FAIL) { return;} 
        Element_By_Selector_Click("Click 'Update Password' tab", "id", "to-change-password", ParentTest, "no_jira");
          if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}


        Navigate_Back("Navigate Back", "Account Settings", "Previous page (???)",ParentTest, "no_jira");                  
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }  

}
