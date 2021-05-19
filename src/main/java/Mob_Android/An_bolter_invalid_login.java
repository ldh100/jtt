/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mob_Android;
/**
 *
 * @author Oleg.Spozito
 */
class An_bolter_invalid_login extends An_GUI{
    protected An_bolter_invalid_login(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{         
        //<editor-fold defaultstate="collapsed" desc="Invalid Logins">
        EX += "\r\n" + " - " + "\t" + " === Invalid Logins ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Element_By_Path_Text("Get 'Sign In' button text", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        // Invalid Email    
        Element_By_Path_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter InValid 'Email'", "id", "textInputEditText_login_email_address", "X_" + Bolter_ID, false,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter valid 'Password'", "id", "textInputEditText_login_password", Bolter_PW, true,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Unhide  Password' icon", "id", "text_input_end_icon", ParentTest, "no_jira");
            if (FAIL) { return;}            
        HideKeyboard("Hide Keyboard", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Log In' button", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Alert' screen", "id", "alertTitle", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Alert Title'", "id", "alertTitle", ParentTest, "no_jira");   
        Element_By_Path_Text("Get 'Alert Message'", "id", "android:id/message", ParentTest, "no_jira");
        Element_By_Path_Click("Click Alert 'OK' button", "id", "android:id/button1", ParentTest, "no_jira");            
            if (FAIL) { return;}
            
        // Invalid Password        
        Element_By_Path_Click("Click 'Email' input", "id", "textInputEditText_login_email_address", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid 'Email'", "id", "textInputEditText_login_email_address", Bolter_ID, false,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter InValid 'Password'", "id", "textInputEditText_login_password", "X_Invalid_PW", false,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Unhide  Password' icon", "id", "text_input_end_icon", ParentTest, "no_jira");
            if (FAIL) { return;}            
        HideKeyboard("Hide Keyboard", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Log In' button", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Alert' screen", "id", "alertTitle", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Alert Title'", "id", "alertTitle", ParentTest, "no_jira");   
        Element_By_Path_Text("Get 'Alert Message'", "id", "android:id/message", ParentTest, "no_jira");
        Element_By_Path_Click("Click Alert 'OK' button", "id", "android:id/button1", ParentTest, "no_jira");            
            if (FAIL) { return;}  
                  
        // AP3 Admin Email and Password    
        Element_By_Path_Text_Enter("Enter AP3 Admin 'Email'", "id", "textInputEditText_login_email_address", "oleg.spozito@compassdigital.io", false,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Password' input", "id", "textInputEditText_login_password", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter valid 'Password'", "id", "textInputEditText_login_password", "Password1", true,"no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Unhide  Password' icon", "id", "text_input_end_icon", ParentTest, "no_jira");
            if (FAIL) { return;}
        HideKeyboard("Hide Keyboard", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Log In' button", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Alert' screen", "id", "alertTitle", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Alert Title'", "id", "alertTitle", ParentTest, "no_jira");   
        Element_By_Path_Text("Get 'Alert Message'", "id", "android:id/message", ParentTest, "no_jira");
        Element_By_Path_Click("Click Alert 'OK' button", "id", "android:id/button1", ParentTest, "no_jira"); 
        EX += " - " + "\t" + " === Invalid Login) ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
        //</editor-fold>
    }
}
