package WO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

class WO_account_info extends WO_GUI {
    protected WO_account_info(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;

        New_ID = a.New_ID;
        Site_ID = a.Site_ID;
        MOBILE_ID = a.MOBILE_ID;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }


    protected void run() {   
    try {     
//        Element_By_Selector_Click("Open User 'Menu'", "xpath", "//i[@class='v-icon notranslate mdi mdi-menu theme--light']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;}     
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}       
//        Element_By_Selector_Click("Click Menu > 'My Account'", "xpath", "//h4[text()='My account']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;}    
        //Element_By_Selector_Text("Get 'Payment methods' tab text", "xpath", "//a[@href='/account-settings/my-account']", ParentTest, "no_jira");  
//        Element_By_Selector_Click("Click 'My account' tab", "xpath", "//a[@href='/account-settings/my-account']", ParentTest, "no_jira");
//          if (FAIL) { return;} 
        Element_By_Selector_Click("Click 'My account'", "id", "to-my-account", ParentTest, "no_jira");
          if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}
        Element_By_Selector_Input_Select_Clear("Clear 'Fist Name'", "id", "first-name", ParentTest, "no_jira");    
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > 'mandatory field'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter new 'Fist Name'", "id", "first-name", "JTT", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Input_Select_Clear("Clear 'Last Name'", "id", "last-name", ParentTest, "no_jira");    
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > 'mandatory field'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter new 'Last Name'", "id", "last-name", "Test", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}

        Element_By_Selector_Input_Select_Clear("Clear 'Email'", "id", "email", ParentTest, "no_jira");    
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > 'mandatory field'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Text_Enter("Enter invalid 'Email'", "id", "email", "a.b@", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Selector_Text("Verify Error Message > 'Invalid email...'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
        Element_By_Selector_Input_Select_Clear("Clear 'Email'", "id", "email", ParentTest, "no_jira");    
            if (FAIL) { return;}
        Element_By_Selector_Text_Enter("Enter Valid 'Email'", "id", "email", MOBILE_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Element_By_Selector_Click("Click 'Country Selection' button", "id", "country-select-btn", ParentTest, "no_jira");
          if (FAIL) { return;}
        if(COUNTRY.toLowerCase().startsWith("c")){
            Element_By_Selector_Click("Select/Click 'Country - Canada'", "id", "country-Canada", ParentTest, "no_jira");
              if (FAIL) { return;}
            Element_By_Selector_Input_Select_Clear("Clear 'phone-number-input'", "id", "qa-international-phone-number-input", ParentTest, "no_jira");    
                if (FAIL) { return;}
            Element_By_Selector_Text("Verify Error Message > 'mandatory field'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
            Element_By_Selector_Text_Enter("Enter invalid 'Canada Phone number'", "id", "qa-international-phone-number-input", "1902221234", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Selector_Text("Verify Error Message > 'invalid phone number'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
            Element_By_Selector_Input_Select_Clear("Clear 'phone-number-input'", "id", "qa-international-phone-number-input", ParentTest, "no_jira");    
                if (FAIL) { return;}
            Element_By_Selector_Text_Enter("Enter Valid 'Canada Phone number'", "id", "qa-international-phone-number-input", "9058566686", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
        } else{
            Element_By_Selector_Click("Select/Click 'Country - United States'", "id", "country-United States", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Selector_Input_Select_Clear("Clear 'phone-number-input'", "id", "qa-international-phone-number-input", ParentTest, "no_jira");    
                if (FAIL) { return;}
            Element_By_Selector_Text("Verify Error Message > 'mandatory field'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
            Element_By_Selector_Text_Enter("Enter invalid 'Canada Phone number'", "id", "qa-international-phone-number-input", "902221234", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Selector_Text("Verify Error Message > 'invalid phone number'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
            Element_By_Selector_Input_Select_Clear("Clear 'phone-number-input'", "id", "qa-international-phone-number-input", ParentTest, "no_jira");    
                if (FAIL) { return;}
            Element_By_Selector_Text_Enter("Enter Valid 'US Phone number'", "id", "qa-international-phone-number-input", "7168965200", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
        }

        Element_By_Selector_Click("Click 'Account info > Save'", "id", "update-info-btn", ParentTest, "no_jira");
           if (FAIL) { return;} 
        Navigate_Back("Navigate Back", "Account Settings","Previous page (???)",ParentTest, "no_jira");                  
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }  

}
