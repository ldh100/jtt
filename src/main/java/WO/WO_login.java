package WO;

import java.util.Date;

class WO_login extends WO_GUI {
    protected WO_login(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        
        MOBILE_ID = a.MOBILE_ID;
        MOBILE_PW = a.MOBILE_PW;
        _New_user = a._New_user;
        New_ID = a.New_ID;
        SITE = a.SITE;
        
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() {   
    try {    
        Navigate_to_URL("Navigate to " + url, url, ParentTest, "no_jira");              
            if (FAIL) { return;}              
        Element_By_Selector_Click("Click navigation > 'Log in'", "id", "qa-nav-log-in-btn", ParentTest, "no_jira"); 
            if (FAIL) { return;}

        if(_New_user) {
            Element_By_Selector_Click("Click 'Sign up'", "xpath", "//p[@class='switch-form-text']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Selector_Text_Enter("Enter Valid First Name", "id" , "First name", "NewUser", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Selector_Text_Enter("Enter Valid Last Name", "id" , "Last name", "Automation_" + New_ID, false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Selector_Text_Enter("Enter Valid Email", "id" , "Email", "cdl.test.xtt+" + New_ID + "@gmail.com", false, ParentTest, "no_jira");
                if (FAIL) { return;}     
            Element_By_Selector_Text_Enter("Enter Valid Phone Number", "id" , "qa-international-phone-number-input", "7168965200", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Selector_Text_Enter("Enter Valid Password", "id" , "Password", "Abcwd_234", true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            //Element_By_Selector_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", ParentTest, "no_jira"); 
            Element_By_Selector_Click("Click 'Get most...", "id", "marketing-opt-in", ParentTest, "no_jira"); 
            Element_By_Selector_Click("Click 'Create Account'", "id", "sign-up-btn",  ParentTest, "no_jira");
                 if (FAIL) { return;}  
            Thread.sleep(2000); // no progress spinner after 'Create Account'  !?

        } else {
//            Element_Child_Click("Click 'Email' input", L1.get(0), "tagName" , "input", ParentTest, "no_jira"); 
//                if (FAIL) { return;}  
//            // Add Invalid Email/PW testing flow   // =================================
//            Element_Child_Text_Enter("Enter Valid Email", L1.get(0), "tagName" , "input", MOBILE_ID, false, ParentTest, "no_jira"); 
//                if (FAIL) { return;}            
//            Element_Child_Click("Click 'Pssword' input", L1.get(1), "tagName" , "input", ParentTest, "no_jira"); 
//                if (FAIL) { return;}  
//            Element_Child_Text_Enter("Enter Valid Password", L1.get(1), "tagName" , "input", MOBILE_PW, true, ParentTest, "no_jira"); 
//                if (FAIL) { return;} 
            Element_By_Selector_Text_Enter("Enter Valid Email", "id", "login-Email", MOBILE_ID, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Selector_Text_Enter("Enter Valid Password", "id", "login-Password", MOBILE_PW, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            //Element_By_Selector_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", ParentTest, "no_jira"); } 
            Element_By_Selector_Click("Click 'LOGIN'", "id", "log-in-btn", ParentTest, "no_jira");                                     
                if (FAIL) { return;} 
        }           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}   
        // Change Site from Last visited to Automation target
//        Element_By_Selector_Click("Open User 'Menu'", "xpath", "//i[@class='v-icon notranslate mdi mdi-menu theme--light']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;}          
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;} 
        Element_By_Selector_Click("Click 'Change Location'", "id", "qa-search-location-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;} 
        Thread.sleep(1000);
        Element_E1_Find("Find 'Select Location' input", "xpath", "//input[@type='text']", ParentTest, "no_jira");
            if (FAIL) { return;}
        if(_New_user) {
            Element_Click("Click 'Select Location' input", e1, ParentTest, "no_jira");    
                if (FAIL) { return;}
        }

        Element_Text_Enter("Enter Target Site Name: " + SITE, e1, SITE, ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Element_SendKey_Enter("Click 'Location' combobox 'ENTER'", e1, ParentTest, "no_jira"); 
 
//        List_L0("Find 'Enter Location' combobox", "css", "[role='combobox']", ParentTest, "no_jira");             
//            if (FAIL) { return;}             
//        Element_Child_Click("Click 'Select Location' Slot", L0.get(0), "tagName", "input", ParentTest, "no_jira");             
//            if (FAIL) { return;}                      
//        Element_Child_Text_Enter("Enter Target Site Name: " + SITE, L0.get(0), "tagName", "input", SITE, false, ParentTest, "no_jira");             
//            if (FAIL) { return;} 
//        Wait_For_All_Elements_InVisibility("Wait for 'fetch-sites-loader'...", "xpath", "//*[contains(@class, 'fetch-sites-loader')]", ParentTest, "no_jira");                                                                                     
//            if (FAIL) { return;}            
////        Element_SendKey_Enter("Click 'Location' combobox 'ENTER'", L0.get(0), ParentTest, "no_jira");  
//        Element_E1_Find("Find Matching Location list", "xpath", "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
//            if (FAIL) { return;}  
//        Element_Child_List_L1("Matching Locations Count", e1, "xpath", ".//div[@class='v-list-item__title']", ParentTest, "no_jira");                                     
//            if (FAIL) { return; }  
////            for (int i = 0; i < L1.size(); i++) {
////                Element_Text("Location (" + i + ") Name:", L1.get(i),  ParentTest, "no_jira");             
////            }
//        Element_Click("Select 1st Location in the found Locations list", L1.get(0),ParentTest, "no_jira"); 
//            if (FAIL) { return; }  

//        Element_By_Selector_Text("Find 'Version' text", "xpath", "//div[contains(@class, 'footer-container')]//h6[@style='text-align: center;']", ParentTest, "no_jira"); 
//        if(t != null && t.contains(" ")){
//            Ver = t.substring(t.lastIndexOf(" "));
//        } else{
//            Ver = "No found";
//        }
            Ver = "No found";
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }
    }
}
