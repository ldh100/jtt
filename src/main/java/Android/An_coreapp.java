/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
import static Android.An_Mob.*;
/**
 *
 * @author Oleg.Spozito
 */
public class An_coreapp {
    public static void run() throws InterruptedException {     
//        _t++; Thread.sleep((long) sleep); ResetApp("Reset App", "no_jira");             
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_InVisibility("Wait for Splash screen", "id", "splashScreenLogo", "no_jira");             
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Join/Login' screen", "id", "join_button", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Join <App>' button text", "id", "join_button", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Alreay have an account'", "id", "already_have_account_text_view", "no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); Element_By_Path_Attribute("Get 'Explore' Content Description", "id", "explore_button_container", "contentDescription","no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Explore <App>' text", "id", "explore_button", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Log in' text", "id", "login_text", "no_jira");             
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Log in'", "id", "login_text", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Welcome...' text", "id", "toolbar_title", "no_jira");             
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Welcome...' subtext", "id", "subtext", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", "no_jira");             
            if (FAIL) { return;} 
             
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text_Enter("Enter 'Email'", "id", "textInputEditText_login_email_address", Mobile_ID, false,"no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text_Enter("Enter 'Password' input", "id", "textInputEditText_login_password", Mobile_PW, true,"no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Undide Password' icon", "id", "text_input_end_icon", "no_jira");             
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); HideKeyboard("Hide Keyboard", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Log In' button", "id", "button_login", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "android:id/progress", "no_jira");             
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Find Food' title", "id", "title", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Title' text", "id", "title", "no_jira");             
            //if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Decription' text", "id", "description", "no_jira");             
            //if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Enable..' button text", "id", "btnEnableLocation", "no_jira");             
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'No..' button text", "id", "btnNoThanks", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Enable..' button ", "id", "btnEnableLocation", "no_jira");             
            if (FAIL) { return;}             
//        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'No..' button ", "id", "btnNoThanks", "no_jira");             
//            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Allow..' button ", "id", "com.android.packageinstaller:id/permission_allow_button", "no_jira");             
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Home' screen", "id", "home", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Attribute("Get 'Home' Content Description", "id", "home", "contentDescription","no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Attribute("Get 'Orders' Content Description", "id", "order", "contentDescription","no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Attribute("Get 'Account' Content Description", "id", "account", "contentDescription","no_jira");             
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Account'", "id", "account", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Swipe_From_Screen_Center("Swipe Up to show 'Logout'", "UP", 500, "no_jira");             
            if (FAIL) { return;}              
            
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Account' screen", "id", "appVersion", "no_jira");             
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'About' > Version", "id", "appVersion","no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Log out'", "id", "profile_logout", "no_jira");             
            if (FAIL) { return;}              
    }
}
