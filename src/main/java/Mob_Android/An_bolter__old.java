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
class An_bolter__old extends An_GUI{
    protected An_bolter__old(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{         
        Wait_For_Element_By_Path_Presence("Wait for 'Sign In' screen", "id", "button_login", ParentTest, "no_jira");
            if (FAIL) { return;}
            
//        Test_EX_Update("Test_EX_Update_Log_01", ParentTest, "no_jira");
//        Test_EX_Update("Test_EX_Update_Log_02", ParentTest, "no_jira");     
        
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
            
        //<editor-fold defaultstate="collapsed" desc="Login, Invalid > Valid ID/PW, User Name, Version">
        EX += "\r\n" + " - " + "\t" + " === Login(s) ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
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
            if (FAIL) { return;} 
            
        // Valid Runner Email and Password    
        Element_By_Path_Text_Enter("Enter valid Runner 'Email'", "id", "textInputEditText_login_email_address", Bolter_ID, false,"no_jira");
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
            
        // Successful Login > Dashboard > Version     
        Wait_For_Element_By_Path_Presence("Wait for 'Dashboard' screen", "id", "delivery_dashboard_title", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'User Name' Text", "id", "tvUserName", ParentTest, "no_jira");
        Element_By_Path_Text("Get 'About' > Version", "id", "appVersion", ParentTest, "no_jira");
        if (FAIL) {
            appVersion = "Not Found";
        } else{
            appVersion = t;
        }
        EX += " - " + "\t" + " === Login(s) ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Profile">
        EX += "\r\n" + " - " + "\t" + " === Profile ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        Element_E1_Find("Find 'nav_profile' element", "id", "nav_profile", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_profile' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open Profile", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text("Get Profile 'User Name'", "id", "user_contact_detail_name", ParentTest, "no_jira");    
        Element_By_Path_Text("Get Profile 'Email Address'", "id", "textInputEditText_email_address", ParentTest, "no_jira");
        Element_By_Path_Text("Get Profile 'Phone Number'", "id", "textInputEditText_phone_number", ParentTest, "no_jira");        
        Element_By_Path_Text("Get 'Assigned Location' - Site", "id", "txtAssignedPickupLocations", ParentTest, "no_jira");  
        Element_By_Path_Text("Get 'Assigned Location' - Description", "id", "txtAssignedPickupLocationsDesc", ParentTest, "no_jira");  
        Swipe_From_Screen_Center("Swipe up to see brands", "UP", 100, ParentTest, "no_jira");
        List_L0("Visible Brand(s) Count", "id", "txtBrandName", ParentTest, "no_jira");
        List_L1("Delivery Hours Count", "id", "txtDeliveryHours", ParentTest, "no_jira");
            for (int i = 0; i < aL1.size(); i++) {
                Element_Text("Brand Name (index " + i + ")", aL0.get(i),  ParentTest, "no_jira");         
                Element_Text("Brand Delivery Hours (index " + i + ")", aL1.get(i),  ParentTest, "no_jira");         
            }   
        Go_Back_Key("Back from Profile", ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}   
        EX += " - " + "\t" + " === Profile ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="History">
        EX += "\r\n" + " - " + "\t" + " === History ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
        Element_E1_Find("Find 'nav_history' element", "id", "nav_history", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_history' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open History", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get Hitory 'Title'", "id", "txtTitle", ParentTest, "no_jira");    
        Element_By_Path_Text("Get Hitory 'Sub-Title'", "id", "txtSubTitle", ParentTest, "no_jira");            
        Element_By_Path_Text("Get 'Reload' button Text", "id", "emptyViewReloadBtn", ParentTest, "no_jira");            
        List_L0("Check 'Empty View' Image", "id", "emptyViewImg", ParentTest, "no_jira");
        if(!aL0.isEmpty()){
            Element_By_Path_Text("Get 'Empty Title'", "id", "emptyViewTitle", ParentTest, "no_jira");            
            Element_By_Path_Text("Get 'Empty Message'", "id", "emptyViewMsg", ParentTest, "no_jira");              
        }else{
            //
        }  
        EX += " - " + "\t" + " === History ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Support">
        EX += "\r\n" + " - " + "\t" + " === Support ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");        
        Element_E1_Find("Find 'nav_support' element", "id", "nav_support", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_support' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open Support", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Go_Back_Key("Back from Support", ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}    
        EX += " - " + "\t" + " === Support ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                   
        //</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="Delievery Dashboard">
        EX += "\r\n" + " - " + "\t" + " === Delievery Dashboard ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                
        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
        Element_E1_Find("Find 'nav_deliveries' element", "id", "nav_deliveries", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_deliveries' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open Delivery Dashboard", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text("Get Dashboard 'Title'", "id", "delivery_dashboard_title", ParentTest, "no_jira");    
        Element_By_Path_Text("Get 'Last Update'", "id", "last_updated", ParentTest, "no_jira");            
        Element_By_Path_Text("Get 'Reload' button Text", "id", "emptyViewReloadBtn", ParentTest, "no_jira");            
        List_L0("Check 'Empty View' Image", "id", "emptyViewImg", ParentTest, "no_jira");
        if(!aL0.isEmpty()){
            Element_By_Path_Text("Get 'Empty Title'", "id", "emptyViewTitle", ParentTest, "no_jira");            
            Element_By_Path_Text("Get 'Empty Message'", "id", "emptyViewMsg", ParentTest, "no_jira");              
        }else{
            //
        }
        EX += " - " + "\t" + " === Delievery Dashboard ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                       
        //</editor-fold>
                
        //<editor-fold defaultstate="collapsed" desc="Logout">
        EX += "\r\n" + " - " + "\t" + " === Logout ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                             
        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");    
        Element_By_Path_Click("Click 'Log out'", "id", "nav_logout", ParentTest, "no_jira");
        EX += " - " + "\t" + " === Logout ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                               
        //</editor-fold>
    }
}

