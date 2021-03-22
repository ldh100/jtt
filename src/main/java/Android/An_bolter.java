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
class An_bolter extends An_Mob{//
//    public An_bolter() {
//        // default constructor
//    }
//    public An_bolter(An_GUI a) {
//        // copy constructor -- initialize some fields from values in original, others with default values 
//        _t = a._t;
//        FAIL = a.FAIL;
//    }

    protected void Run() throws InterruptedException { 
//        Thread.sleep(500);
//        _t++; Element_E1_Find("Is it Splash Screen/Logo?", "id", "splashScreenLogo", "no_jira");             
////            //if (FAIL) { return;}        // "id", "packagename:id/splashScreenLogo",          
        _t++; Test_EX_Update("Bolter Test EX Update 1", "no_jira");             
            if (FAIL) { return; }   
        
        _t++; Wait_For_Element_By_Path_Presence("Wait for 'Sign In' screen", "id", "button_login", "no_jira");             
            if (FAIL) { return;} 
        _t++; Element_By_Path_Text("Get 'Sign In' button text", "id", "button_login", "no_jira");             
            if (FAIL) { return;} 
        _t++; Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", "no_jira");             
            if (FAIL) { return;}      
        _t++; Element_By_Path_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", "no_jira");             
            if (FAIL) { return;}            
//        _t++; Element_By_Path_Text_Enter("Enter 'Email'", "id", "textInputEditText_login_email_address", Bolter_ID, false,"no_jira");             
//            if (FAIL) { return;} 
//        _t++; Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", "no_jira");             
//            if (FAIL) { return;}            
//        _t++; Element_By_Path_Text_Enter("Enter 'Password' input", "id", "textInputEditText_login_password", Bolter_PW, true,"no_jira");             
//            if (FAIL) { return;} 
//        _t++; Element_By_Path_Click("Click 'Undide Password' icon", "id", "text_input_end_icon", "no_jira");             
//            if (FAIL) { return;}              
//        _t++; HideKeyboard("Hide Keyboard", "no_jira");             
//            if (FAIL) { return;}
//        _t++; Element_By_Path_Click("Click 'Log In' button", "id", "button_login", "no_jira");             
//            if (FAIL) { return;}  
//        _t++; Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "android:id/progress", "no_jira");             
//            if (FAIL) { return;}          
//        _t++; Wait_For_Element_By_Path_Presence("Wait for 'Dashboard' screen", "id", "delivery_dashboard_title", "no_jira");             
//            if (FAIL) { return;} 
//
//        _t++; Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", "no_jira");             
//            if (FAIL) { return;} 
//        _t++; Element_By_Path_Text("Get 'About' > Version", "id", "appVersion","no_jira");             
//            if (FAIL) { return;}  
//            appVersion = t;
//            
//        _t++; Element_By_Path_Click("Click 'Log out'", "id", "nav_logout", "no_jira");             
//            if (FAIL) { return;} 
    }
}
