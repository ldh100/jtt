package Mob_Android;

class An_core_main extends An_GUI {
    protected An_core_main(An_GUI a) {
       Mobile_ID = a.Mobile_ID;
       Mobile_PW = a.Mobile_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }
    protected void Run() throws InterruptedException, Exception {     
        Wait_For_Element_By_Path_InVisibility("Wait for Splash screen", "id", "splashScreenLogo", ParentTest, "no_jira");             
            if (FAIL) { return;}     
        Wait_For_Element_By_Path_Presence("Wait for 'Join/Login' screen", "id", "join_button", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Join <App>' button text", "id", "join_button", ParentTest, "no_jira");             
            //if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Alreay have an account'", "id", "already_have_account_text_view", ParentTest, "no_jira");             
            //if (FAIL) { return;}    
        Element_By_Path_Text("Get 'Explore <App>' text", "id", "explore_button", ParentTest, "no_jira");             
            //if (FAIL) { return;}  
        Element_By_Path_Attribute("Get 'Explore' Content Description", "id", "explore_button_container", "contentDescription", ParentTest, "no_jira");                
            //if (FAIL) { return;}  

        Element_By_Path_Text("Get 'Log in' text", "id", "login_text", ParentTest, "no_jira");             
            //if (FAIL) { return;}             
        Element_By_Path_Action_Click("Click 'Log in'", "id", "login_text", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Welcome...' text", "id", "toolbar_title", ParentTest, "no_jira");             
            //if (FAIL) { return;}     
        Element_By_Path_Text("Get 'Welcome...' subtext", "id", "subtext", ParentTest, "no_jira");             
            //if (FAIL) { return;}  
        Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", ParentTest, "no_jira");             
            //if (FAIL) { return;} 
             
        Element_By_Path_Action_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", ParentTest, "no_jira");             
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter 'Email'", "id", "textInputEditText_login_email_address", Mobile_ID, false,"no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Action_Click("Click 'Password' input", "id", "textInputEditText_login_password", ParentTest, "no_jira");             
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter 'Password' input", "id", "textInputEditText_login_password", Mobile_PW, true,"no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Action_Click("Click 'Unhide  Password' icon", "id", "text_input_end_icon", ParentTest, "no_jira");             
            if (FAIL) { return;}              
        HideKeyboard("Hide Keyboard", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Action_Click("Click 'Log In' button", "id", "button_login", ParentTest, "no_jira");             
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");             
            if (FAIL) { return;}   
            
        Wait_For_Element_By_Path_Presence("Wait for 'Find Food' title", "id", "title", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Title' text", "id", "title", ParentTest, "no_jira");             
            //if (FAIL) { return;}            
        Element_By_Path_Text("Get 'Description' text", "id", "description", ParentTest, "no_jira");             
            //if (FAIL) { return;}   
        if(!devOS.startsWith("11")){    
            Element_By_Path_Text("Get 'Enable..' button text", "id", "btnEnableLocation", ParentTest, "no_jira");             
                if (FAIL) { return;}   
            Element_By_Path_Text("Get 'No..' button text", "id", "btnNoThanks", ParentTest, "no_jira");             
                if (FAIL) { return;}  
            Element_By_Path_Action_Click("Click 'Enable..' button ", "id", "btnEnableLocation", ParentTest, "no_jira");             
                if (FAIL) { return;}             
    //        Element_By_Path_Action_Click("Click 'No..' button ", "id", "btnNoThanks", ParentTest, "no_jira");             
    //            if (FAIL) { return;} 
            Element_By_Path_Action_Click("Click 'Allow..' button ", "id", "com.android.packageinstaller:id/permission_allow_button", ParentTest, "no_jira");             
                if (FAIL) { return;}             
        }else{ // version 11 - different Allow Location fragment
//            Element_By_Path_Text("Get 'No..' button text", "id", "btnNoThanks", ParentTest, "no_jira");             
//                if (FAIL) { return;}  
//            Element_By_Path_Action_Click("Click 'Enable..' button ", "id", "btnEnableLocation", ParentTest, "no_jira");             
//                if (FAIL) { return;}             
//            Element_By_Path_Action_Click("Click 'Allow..' button ", "id", "com.android.packageinstaller:id/permission_allow_button", ParentTest, "no_jira");             
//                if (FAIL) { return;}             
        }
            
        Wait_For_Element_By_Path_Presence("Wait for 'Home' screen", "id", "home", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Home' Content Description", "id", "home", "contentDescription", ParentTest, "no_jira");            
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Orders' Content Description", "id", "order", "contentDescription", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Account' Content Description", "id", "account", "contentDescription", ParentTest, "no_jira");           
            if (FAIL) { return;} 
            
        Element_By_Path_Action_Click("Click 'Account'", "id", "account", ParentTest, "no_jira");             
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Account' screen", "id", "profile_menu", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Swipe_From_Screen_Center("Swipe Up to show 'Logout'", "UP", 500, ParentTest, "no_jira");             
            if (FAIL) { return;}              
            
        Wait_For_Element_By_Path_Presence("Wait for 'Version' visible", "id", "appVersion", ParentTest, "no_jira");             
            if (FAIL) { return;}             
        Element_By_Path_Text("Get 'About' > Version", "id", "appVersion", ParentTest, "no_jira");            
            if (FAIL) { return;} 
            appVersion = t;
        Element_By_Path_Action_Click("Click 'Log out'", "id", "profile_logout", ParentTest, "no_jira");             
            if (FAIL) { return;}   
    }
}
