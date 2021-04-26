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
class An_bolter_forgot_pw extends An_GUI{
    protected An_bolter_forgot_pw(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{              
        //<editor-fold defaultstate="collapsed" desc="Forgot Password">
        EX += "\r\n" + " - " + "\t" + " === Forgot Password ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Element_By_Path_Text("Get 'Forgot PW?' button text", "id", "btn_forgotPassword", ParentTest, "no_jira");
        Element_By_Path_Click("Click 'Forgot PW?' button", "id", "btn_forgotPassword", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Thread.sleep(500);
        Element_By_Path_Text("Title 'Forgot PW?'", "id", "forgot_password_title", ParentTest, "no_jira");
        Element_By_Path_Text("Sub-Title 'Forgot PW?'", "id", "forgot_password_sub_title", ParentTest, "no_jira");
        Element_By_Path_Text_Enter("Enter Email", "id", "textInputEditText_login_email_address", Bolter_ID, false,"no_jira");
        Element_By_Path_Text("Button 'Send...' text", "id", "btnRequestResetLink", ParentTest, "no_jira"); 
        Element_By_Path_Click("Click 'SEND...' button", "id", "btnRequestResetLink", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);

        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Text("Alert title", "id", "alertTitle", ParentTest, "no_jira");        
        Element_By_Path_Text("Alert message", "id", "android:id/message", ParentTest, "no_jira");   
        Element_By_Path_Click("Click Alert 'OK' button", "id", "android:id/button1", ParentTest, "no_jira");         
        Thread.sleep(500); 
        EX += " - " + "\t" + " === Forgot Password ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
        //</editor-fold>       
    }
}
