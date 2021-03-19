/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
//import static Android.An_Mob.*;
/**
 *
 * @author Oleg.Spozito
 */
public class An_bolter extends Android.An_Mob {
    protected void run() throws InterruptedException {   
//        Thread.sleep(500);
//        _t++; Thread.sleep((long) sleep); Element_E1_Find("Is it Splash Screen/Logo?", "id", "splashScreenLogo", "no_jira");             
//            //if (FAIL) { return;}        // "id", "packagename:id/splashScreenLogo",          
//            
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_InVisibility("Wait for Splash screen", "id", "splashScreenLogo", "no_jira");             
            if (FAIL) { return;} 
        
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Sign In' screen", "id", "button_login", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Sign In' button text", "id", "button_login", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", "no_jira");             
            if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text_Enter("Enter 'Email'", "id", "textInputEditText_login_email_address", Bolter_ID, false,"no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text_Enter("Enter 'Password' input", "id", "textInputEditText_login_password", Bolter_PW, true,"no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Undide Password' icon", "id", "text_input_end_icon", "no_jira");             
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); HideKeyboard("Hide Keyboard", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Log In' button", "id", "button_login", "no_jira");             
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "android:id/progress", "no_jira");             
            if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); Wait_For_Element_By_Path_Presence("Wait for 'Dashboard' screen", "id", "delivery_dashboard_title", "no_jira");             
            if (FAIL) { return;} 

        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); Element_By_Path_Text("Get 'About' > Version", "id", "appVersion","no_jira");             
            if (FAIL) { return;}  
            appVersion = t;
            
        _t++; Thread.sleep((long) sleep); Element_By_Path_Click("Click 'Log out'", "id", "nav_logout", "no_jira");             
            if (FAIL) { return;} 
    }
}
