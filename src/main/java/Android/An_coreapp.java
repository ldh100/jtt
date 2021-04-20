/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
/**
 *
 * @author Oleg.Spozito
 */
 class An_coreapp extends An_GUI {
    protected An_coreapp(An_GUI a) {
       Mobile_ID = a.Mobile_ID;
       Mobile_PW = a.Mobile_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       devOS = a.devOS;
       ParentTest = a.ParentTest;
    }
    protected void Run() throws InterruptedException, Exception {     
        Test_EX_Update("CoreApp Test EX Update 1", "no_jira");             
            if (FAIL) { 
                String A = "true";
            }   
        Test_EX_Update("CoreApp Test EX Update 2", "no_jira");             
            if (FAIL) { 
                String A = "false";
            } 
            
            
        Wait_For_Element_By_Path_InVisibility("Wait for Splash screen", "id", "splashScreenLogo", "no_jira");             
            if (FAIL) { return;}     
        Wait_For_Element_By_Path_Presence("Wait for 'Join/Login' screen", "id", "join_button", "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Join <App>' button text", "id", "join_button", "no_jira");             
            //if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Alreay have an account'", "id", "already_have_account_text_view", "no_jira");             
            //if (FAIL) { return;}    
        Element_By_Path_Text("Get 'Explore <App>' text", "id", "explore_button", "no_jira");             
            //if (FAIL) { return;}  
        Element_By_Path_Attribute("Get 'Explore' Content Description", "id", "explore_button_container", "contentDescription","no_jira");             
            //if (FAIL) { return;}  

        Element_By_Path_Text("Get 'Log in' text", "id", "login_text", "no_jira");             
            //if (FAIL) { return;}             
        Element_By_Path_Action_Click("Click 'Log in'", "id", "login_text", "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Welcome...' text", "id", "toolbar_title", "no_jira");             
            //if (FAIL) { return;}     
        Element_By_Path_Text("Get 'Welcome...' subtext", "id", "subtext", "no_jira");             
            //if (FAIL) { return;}  
        Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", "no_jira");             
            //if (FAIL) { return;} 
             
        Element_By_Path_Action_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", "no_jira");             
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter 'Email'", "id", "textInputEditText_login_email_address", Mobile_ID, false,"no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Action_Click("Click 'Password' input", "id", "textInputEditText_login_password", "no_jira");             
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter 'Password' input", "id", "textInputEditText_login_password", Mobile_PW, true,"no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Action_Click("Click 'Undide Password' icon", "id", "text_input_end_icon", "no_jira");             
            if (FAIL) { return;}              
        HideKeyboard("Hide Keyboard", "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Action_Click("Click 'Log In' button", "id", "button_login", "no_jira");             
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", "no_jira");             
            if (FAIL) { return;}   
            
        Wait_For_Element_By_Path_Presence("Wait for 'Find Food' title", "id", "title", "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Text("Get 'Title' text", "id", "title", "no_jira");             
            //if (FAIL) { return;}            
        Element_By_Path_Text("Get 'Decription' text", "id", "description", "no_jira");             
            //if (FAIL) { return;}   
        if(!devOS.startsWith("11")){    
            Element_By_Path_Text("Get 'Enable..' button text", "id", "btnEnableLocation", "no_jira");             
                if (FAIL) { return;}   
            Element_By_Path_Text("Get 'No..' button text", "id", "btnNoThanks", "no_jira");             
                if (FAIL) { return;}  
            Element_By_Path_Action_Click("Click 'Enable..' button ", "id", "btnEnableLocation", "no_jira");             
                if (FAIL) { return;}             
    //        Element_By_Path_Action_Click("Click 'No..' button ", "id", "btnNoThanks", "no_jira");             
    //            if (FAIL) { return;} 
            Element_By_Path_Action_Click("Click 'Allow..' button ", "id", "com.android.packageinstaller:id/permission_allow_button", "no_jira");             
                if (FAIL) { return;}             
        }else{ // version 11 - different Allow Location fragment
//            Element_By_Path_Text("Get 'No..' button text", "id", "btnNoThanks", "no_jira");             
//                if (FAIL) { return;}  
//            Element_By_Path_Action_Click("Click 'Enable..' button ", "id", "btnEnableLocation", "no_jira");             
//                if (FAIL) { return;}             
//            Element_By_Path_Action_Click("Click 'Allow..' button ", "id", "com.android.packageinstaller:id/permission_allow_button", "no_jira");             
//                if (FAIL) { return;}             
        }
            
        Wait_For_Element_By_Path_Presence("Wait for 'Home' screen", "id", "home", "no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Home' Content Description", "id", "home", "contentDescription","no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Orders' Content Description", "id", "order", "contentDescription","no_jira");             
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Get 'Account' Content Description", "id", "account", "contentDescription","no_jira");             
            if (FAIL) { return;} 
            
        Element_By_Path_Action_Click("Click 'Account'", "id", "account", "no_jira");             
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Account' screen", "id", "profile_menu", "no_jira");             
            if (FAIL) { return;}
        Swipe_From_Screen_Center("Swipe Up to show 'Logout'", "UP", 500, "no_jira");             
            if (FAIL) { return;}              
            
        Wait_For_Element_By_Path_Presence("Wait for 'Version' visible", "id", "appVersion", "no_jira");             
            if (FAIL) { return;}             
        Element_By_Path_Text("Get 'About' > Version", "id", "appVersion","no_jira");             
            if (FAIL) { return;} 
            appVersion = t;
        Element_By_Path_Action_Click("Click 'Log out'", "id", "profile_logout", "no_jira");             
            if (FAIL) { return;}   
    }
}
