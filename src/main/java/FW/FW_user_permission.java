/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.TWeb;
import static A.A.*;
import static FW.FW.ADMIN_PW;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_user_permission {
    public static void run() throws InterruptedException { 
        
        
        
        //******************************************************** FWM Login ****************************************************
        // <editor-fold defaultstate="collapsed" desc="FW Manager User "> 
        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira");    
        _t++; TWeb.Element_By_Path_Text("Password Text", "xpath", "//*[contains(text(), 'Password')]", "no_jira");     
        _t++; TWeb.Element_By_Path_Text("Button 'Sign In' Text", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira");   
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira");   
        _t++; TWeb.Element_By_Path_Click("Click 'Email' input", "xpath", "//input[@type='text']",  "no_jira");          
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "xpath", "//input[@type='text']", FW.FM_ID, false, "no_jira");           
        _t++; TWeb.Element_By_Path_Click("Click 'Password' input", "xpath", "//input[@type='password']",  "no_jira");        
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "xpath", "//input[@type='password']", FW.FM_PW, true, "no_jira");       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the ')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Home'", "Home", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Restaurants'", "Restaurants", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Users'", "Users", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Units'", "Units", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Calendar'", "Calendar", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Statistics'", "Statistics", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Configuration'", "Configuration", false,"no_jira");  
        
        FW_logout.run();
        
        // </editor-fold> 
        
        //******************************************************** Partner Login *******************************************************
        // <editor-fold defaultstate="collapsed" desc="Partner User "> 
        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
        _t++; TWeb.Element_By_Path_Text("Password Text", "xpath", "//*[contains(text(), 'Password')]", "no_jira"); 
        _t++; TWeb.Element_By_Path_Text("Button 'Sign In' Text", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira");    
        _t++; TWeb.Element_By_Path_Click("Click 'Email' input", "xpath", "//input[@type='text']",  "no_jira"); 
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "xpath", "//input[@type='text']", FW.PARTNER_ID, false, "no_jira"); 
        _t++; TWeb.Element_By_Path_Click("Click 'Password' input", "xpath", "//input[@type='password']",  "no_jira"); 
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "xpath", "//input[@type='password']", FW.PARTNER_PW, true, "no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
        // loading="true"    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the ')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);    
        
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Home'", "Home", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Restaurants'", "Restaurants", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Users'", "Users", false,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Units'", "Units", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Calendar'", "Calendar", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Statistics'", "Statistics", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Configuration'", "Configuration", false,"no_jira");  
        
        
        FW_logout.run();
        
        
        // </editor-fold> 
        
        //******************************************************** UM Login **************************************************
        // <editor-fold defaultstate="collapsed" desc="Unit Manager User "> 
        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
        _t++; TWeb.Element_By_Path_Text("Password Text", "xpath", "//*[contains(text(), 'Password')]", "no_jira"); 
        _t++; TWeb.Element_By_Path_Text("Button 'Sign In' Text", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira");   
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira");    
        _t++; TWeb.Element_By_Path_Click("Click 'Email' input", "xpath", "//input[@type='text']",  "no_jira"); 
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "xpath", "//input[@type='text']", FW.UM_ID, false, "no_jira"); 
        _t++; TWeb.Element_By_Path_Click("Click 'Password' input", "xpath", "//input[@type='password']",  "no_jira"); 
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "xpath", "//input[@type='password']", FW.UM_PW, true, "no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
            if (FAIL) { return;} 
        // loading="true"    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the ')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);  
        
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Home'", "Home", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Restaurants'", "Restaurants", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Users'", "Users", false,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Units'", "Units", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Calendar'", "Calendar", true,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Statistics'", "Statistics", false,"no_jira"); 
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Configuration'", "Configuration", false,"no_jira");  
        
        
          FW_logout.run();
        
        // </editor-fold> 
        
        
    }  
}

