package WO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

class WO_support extends WO_GUI {
    protected WO_support(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(){   
    try{
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}       
        Element_By_Selector_Click("Click 'Support Desk'", "id", "to-support-desk", ParentTest, "no_jira");
          if (FAIL) { return;}  
        Swith_to_Frame("Switch to 'Support' iframe/webWidget", "id", "webWidget", ParentTest, "no_jira"); //Switch to iframe
            if (FAIL) { return;}
        // === to do details
        Element_By_Selector_Click("Click '-' > Close/Minimize 'Support' widget", "css", "[aria-label='Minimize widget']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Swith_to_Frame("Switch back from 'ifarme' to 'defaultContent'", "defaultContent", null, ParentTest, "no_jira"); 
 
        Swith_to_Frame("Switch to 'Support' iframe/launcher", "id", "launcher", ParentTest, "no_jira"); //Switch to iframe
            if (FAIL) { return;}    
        Element_By_Selector_Click("Click '(?) Support' button", "css", "[aria-label='Support']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Swith_to_Frame("Switch back from 'ifarme' to 'defaultContent'", "defaultContent", null, ParentTest, "no_jira"); 
 
        Swith_to_Frame("Switch to 'Support' iframe", "id", "webWidget", ParentTest, "no_jira"); //Switch to iframe
            if (FAIL) { return;}
        // === to do details if required
        Element_By_Selector_Click("\"Click '-' > Close/Minimize 'Support' widget", "css", "[aria-label='Minimize widget']", ParentTest, "no_jira");
          if (FAIL) { return;} 
        Swith_to_Frame("Switch back from 'ifarme' to 'defaultContent'", "defaultContent", null, ParentTest, "no_jira");  

        To_Bottom("Scroll to page bottom > footer links", ParentTest, "no_jira"); // ============= 
        Thread.sleep(100);
        Element_By_Selector_Click("Click > 'Also Available > App Store'", "xpath", "//a[contains(@href, 'https://apps.apple.com/app')]", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Open_Switch_to_2nd_Tab("Switch to 2nd tab > 'App Store'", "", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Page_URL("Get 'App Store' URL", ParentTest, "no_jira");
        Close_Current_Tab_switch_To_1st("Close 'App Store' tab > back to " + app + " WO page", ParentTest, "no_jira");  
            if (FAIL) { return;} 

        Element_By_Selector_Click("Click > 'Also Available > Google Play'", "xpath", "//a[contains(@href, 'https://play.google.com/store/apps')]", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Open_Switch_to_2nd_Tab("Switch to 2nd tab > 'Google Play'", "", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Page_URL("Get 'Google Play' URL", ParentTest, "no_jira");
        Close_Current_Tab_switch_To_1st("Close 'Google Play' tab > back to " + app + " WO page", ParentTest, "no_jira");  
            if (FAIL) { return;} 

        Element_By_Selector_Click("Click > 'Privacy Policy' link", "xpath", "//a[contains(@href, 'https://compassdigital.io/privacy-policy/')]", ParentTest, "no_jira");    
           if (FAIL) { return;} 
        Open_Switch_to_2nd_Tab("Switch to 2nd tab > 'Privacy Policy'", "", ParentTest, "no_jira");  
           if (FAIL) { return;} 
        Page_URL("Get 'Privacy Policy' URL", ParentTest, "no_jira");
        Close_Current_Tab_switch_To_1st("Close 'Privacy Policy'' tab > back to " + app + " WO page", ParentTest, "no_jira");  
           if (FAIL) { return;} 

        Element_By_Selector_Click("Click > 'Terms and Conditions' link", "xpath", "//a[contains(@href, 'https://compassdigital.io/terms-and-conditions/')]", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Open_Switch_to_2nd_Tab("Switch to 2nd tab > 'Terms and Conditions'", "", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Page_URL("Get 'Terms and Conditions' URL", ParentTest, "no_jira");
        Close_Current_Tab_switch_To_1st("Close 'Terms and Conditions'' tab > back to " + app + " WO page", ParentTest, "no_jira");  
            if (FAIL) { return;} 

        Element_By_Selector_Click("Click > 'Privacy Request' link", "xpath", "//a[contains(@href, 'https://privacyportal')]", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Open_Switch_to_2nd_Tab("Switch to 2nd tab > 'Privacy Request'", "", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Page_URL("Get 'Privacy Request' URL", ParentTest, "no_jira");
        Close_Current_Tab_switch_To_1st("Close 'Privacy Request' tab > back to " + app + " WO page", ParentTest, "no_jira");  

     } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }   
}
