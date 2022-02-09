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
        
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run() {   
    try {    
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("Login page", ParentTest, "no_jira");             
        Element_By_Selector_Attribute("Find " + app + " Image", "xpath", "//div[@class='v-image__image v-image__image--cover']", "style", ParentTest, "no_jira");
        //Element_By_Selector_Text("Find 'card-header' text", "xpath", "//p[@class='card-header']", ParentTest, "no_jira");           
        Find_Text("Find 'Support' text", "Support", true, ParentTest, "no_jira");           
        Find_Text("Find 'Enter Location' text", "Enter Your " + app.toLowerCase() + " Location", true, ParentTest, "no_jira");           
        Find_Text("Find 'Log In' text", "Log In", true, ParentTest, "no_jira"); 
        Element_By_Selector_Click("Click 'Log In'", "xpath", "//*[text()='Log In']", ParentTest, "no_jira"); 
            if (FAIL) { return;}             
        Thread.sleep(500);   
        Element_E1_Find("Find 'Login' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Child_Text("Find 'Login' dialog Title", e1, "xpath", ".//div[@class='row pt-8 no-gutters']", ParentTest, "no_jira");               
        Element_Child_Text("Find 'Login' dialog Text", e1, "xpath", ".//p[@class='mb-5 mt-2 form-info']", ParentTest, "no_jira"); 

        Element_By_Selector_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='switch-form-text']", ParentTest, "no_jira"); 
        Find_Text("Find 'Forgot password...' text", "Forgot password?", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Need...?' text", "Need an Account?", true, ParentTest, "no_jira");                
        Find_Text("Find 'Sign Up' text", "Sign Up", true, ParentTest, "no_jira"); 
        // Forgot Paswword modal
        //
        Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", ParentTest, "no_jira");             
            if (FAIL) { return;}          
        Element_Child_Text("Input 'Email' label", L1.get(0), "tagName" , "label", ParentTest, "no_jira"); 
            //if (FAIL) { return;}
        Element_Child_Text("Input 'Pssword' label", L1.get(1), "tagName" , "label", ParentTest, "no_jira"); 
            //if (FAIL) { return;}

        if(_New_user) {
            // Larry's code goes here
            // test Create new user
            // Open modal        
            // Element_By_Selector_Click("Click 'Login'", "xpath", "//*[text()='Login']", ParentTest, "no_jira"); 
            //    if (FAIL) { return;}             
            // Element_E1_Find("Find 'Login' dialog", "xpath", "//html/body/div/div/div[3]/div/div/div", ParentTest, "no_jira");
             //   if (FAIL) { return;} 
              //  Thread.sleep(500);      
            Element_By_Selector_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='switch-form-text']", ParentTest, "no_jira");
            Element_By_Selector_Click("Click 'Sign up'", "xpath", "//p[text()='Sign Up']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E1_Find("Find 'Sign up' dialog", "xpath", "(//div[contains(@class,'pa-5 v-card')])[2]", ParentTest, "no_jira");
                if (FAIL) { return;} //  used as element e1 below
        //  verify modal 
            Element_Child_Text("Find 'Sign Up' dialog Title", e1, "xpath", ".//div[@class='v-card__title form-title']", ParentTest, "no_jira");               
            Element_Child_Text("Find 'Sign UP' dialog Sub Title Text", e1, "xpath", ".//div[@class='v-card__text']", ParentTest, "no_jira"); 
            Find_Text("Find 'Subscription' Title", "Get the most", true, ParentTest, "no_jira"); 
            Find_Text("Find 'Subscription' Text", "We're like that friend who ", true, ParentTest, "no_jira");
            Find_Text("Find 'Already have...' text","Already have a", true, ParentTest, "no_jira");//div[contains(@class,'row mt-8')]//p
            Element_By_Selector_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='mt-1 switch-form-text']", ParentTest, "no_jira");
        //  Verify input Label 
            Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", ParentTest, "no_jira");             
                if (FAIL) { return;}  
            Element_Child_Text("Input 'First Name' label", L1.get(0), "tagName" , "label", ParentTest, "no_jira");          
            Element_Child_Text("Input 'Last Name ' label", L1.get(1), "tagName" , "label", ParentTest, "no_jira"); 
            Element_Child_Text("Input 'Email' label", L1.get(2), "tagName" , "label", ParentTest, "no_jira");          
            Element_Child_Text("Input 'Phone Number' label", L1.get(3), "tagName" , "label", ParentTest, "no_jira"); 
            Element_Child_Text("Input 'Password' label", L1.get(4), "tagName" , "label", ParentTest, "no_jira");   
        //  Verify all input field
            Element_Child_Click("Click 'First Name' input", L1.get(0), "id" , "input-94", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_Child_Text_Enter("Enter Valid First Name", L1.get(0), "id" , "input-94", "WebTest", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Child_Click("Click 'Last Name' input", L1.get(1), "id" , "input-97", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_Child_Text_Enter("Enter Valid Last Name", L1.get(1), "id" , "input-97", "Automation", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Child_Click("Click 'Email' input", L1.get(2), "id" , "input-100", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            String emailAassembly = "W.A." + New_ID + "@mailsac.com"; 
            Element_Child_Text_Enter("Enter Valid Email", L1.get(2), "id" , "input-100", emailAassembly, false, ParentTest, "no_jira");
                if (FAIL) { return;}     
            Element_Child_Click("Click 'Phone Number' input", L1.get(3), "id" , "input-103", ParentTest, "no_jira"); 
            Element_Child_Text_Enter("Enter Valid Phone Number", L1.get(3), "id" , "input-103", "6470009999", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Child_Click("Click 'Passsword' input", L1.get(4), "id" , "input-106", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            String password = "Abcwd234";
            Element_Child_Text_Enter("Enter Valid Password", L1.get(4), "id" , "input-106", password, true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Selector_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", ParentTest, "no_jira"); 
            Element_By_Selector_Click("Click 'Create Account'", "xpath", "(//button[@type='button'])[11]",  ParentTest, "no_jira");
                 if (FAIL) { return;} 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                if (FAIL) { return;}
            Thread.sleep(500);         
            //Larry's code complete
            
        }else{
            Element_Child_Click("Click 'Email' input", L1.get(0), "tagName" , "input", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            // Add Invalid Email/PW testing flow   // =================================
            Element_Child_Text_Enter("Enter Valid Email", L1.get(0), "tagName" , "input", MOBILE_ID, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Element_Child_Click("Click 'Pssword' input", L1.get(1), "tagName" , "input", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Element_Child_Text_Enter("Enter Valid Pssword", L1.get(1), "tagName" , "input", MOBILE_PW, true, ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_By_Selector_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", ParentTest, "no_jira"); 
            Element_Child_Click("Click 'LOGIN'", e1,"xpath", ".//button[contains(@class, 'v-btn v-btn--contained theme--light v-size--default')]", ParentTest, "no_jira");             
                if (FAIL) { return;} // =========================    Development Red ^^^^^
        }
//            
//        Thread.sleep(500); 
//        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
//            if (FAIL) { return;}     
//        Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", ParentTest, "no_jira");
//            if (FAIL) { return;}           
//        Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;} 
//    
//        Element_By_Selector_Click("Click 'Account Settings'", "xpath", ".//*[text()='Account Settings']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;}   
//        Element_By_Selector_Text("Title text", "xpath", ".//h1[@class='header']", ParentTest, "no_jira");
//            if (FAIL) { return;}  
//        //try to get User Email   
//        
//        Navigate_Back("Navigate Back", SITE + " Account Settings","Previous page (???)", ParentTest, "no_jira");
//            if (FAIL) { return;}              

    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }
    }
}
