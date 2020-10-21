/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import static A.A.*;
import A.T;
/**
 *
 * @author Oleg.Spozito
 */
public class __user_permission {
    // cdl.test.xtt+an@gmail.com - Admin no Allow refunds, no Allow Menu Kick-Outs
    // cdl.test.xtt+rn@gmail.com - Runner
    // cdl.test.xtt+sy@gmail.com - SM All Optins
    // cdl.test.xtt+sn@gmail.com - SM No Options
    // cdl.test.xtt+dy@gmail.com - DM All Optins
    // cdl.test.xtt+dn@gmail.com - DM No Optins
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("AP3 Login page", "no_jira");             
            if (FAIL) { return;}

        // <editor-fold defaultstate="collapsed" desc="Runner Login" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      

        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== Rnner Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+rn@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'Cannot login...' text", "xpath", "//*[contains(text(), 'Cannot log into')]", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cannot login...' Text", "Cannot log into Admin Panel as a Runner",true,"no_jira");             
            if (FAIL) { return;}           
        // </editor-fold>     

        // <editor-fold defaultstate="collapsed" desc="Admin N" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== Admin N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+an@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", "no_jira");             
        if (!FAIL) {  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
        if (!FAIL) {   
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Dashboard'", "Dashboard", true,"no_jira");  
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Sites'", "Sites", true,"no_jira");   
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Group Management'", "Group Management", true,"no_jira");                               
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Menu Manager'", "Menu Manager", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Orders'", "Orders", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Sales Reporting'", "Sales Reporting", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Sales Analytics'", "Sales Analytics", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Users'", "Users", true,"no_jira");     
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Announcements'", "Announcements", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Promo Management'", "Promo Management", true,"no_jira");              
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }  
        }
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="SM Y" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== SM Y Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+sy@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]", "no_jira");             
        if (!FAIL) {  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
        if (!FAIL) {       
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Dashboard'", "Dashboard", true,"no_jira");  
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Sites'", "Sites", true,"no_jira");   
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Group Management'", "Group Management", false,"no_jira");                               
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Menu Manager'", "Menu Manager", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Orders'", "Orders", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Sales Reporting'", "Sales Reporting", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Sales Analytics'", "Sales Analytics", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Users'", "Users", false,"no_jira");     
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Announcements'", "Announcements", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Promo Management'", "Promo Management", false,"no_jira");              
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }  
        }
        // </editor-fold>   

        // <editor-fold defaultstate="collapsed" desc="SM N" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== SM N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+sn@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]", "no_jira");             
        if (!FAIL) {  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
        if (!FAIL) {     
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Dashboard'", "Dashboard", true,"no_jira");  
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Sites'", "Sites", true,"no_jira");   
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Group Management'", "Group Management", false,"no_jira");                               
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Menu Manager'", "Menu Manager", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Orders'", "Orders", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Sales Reporting'", "Sales Reporting", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Sales Analytics'", "Sales Analytics", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Users'", "Users", false,"no_jira");     
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Announcements'", "Announcements", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Promo Management'", "Promo Management", false,"no_jira");                    
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }  
        }
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="DM Y" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== DM Y Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+dy@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]", "no_jira");             
        if (!FAIL) {  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
        if (!FAIL) {     
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");                        
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Dashboard'", "Dashboard", true,"no_jira");  
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Sites'", "Sites", true,"no_jira");   
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Group Management'", "Group Management", false,"no_jira");                               
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Menu Manager'", "Menu Manager", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Orders'", "Orders", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Sales Reporting'", "Sales Reporting", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Sales Analytics'", "Sales Analytics", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Users'", "Users", true,"no_jira");     
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Announcements'", "Announcements", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Promo Management'", "Promo Management", false,"no_jira");                     
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }
        }
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="DM N" >
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); 
            if (FAIL) { return;}      
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== DM N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+dn@gmail.com", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'Hey There..' text", "xpath", "//*[contains(text(), 'Hey There ')]", "no_jira");             
        if (!FAIL) {  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
        if (!FAIL) {    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");                        
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Dashboard'", "Dashboard", true,"no_jira");  
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Sites'", "Sites", true,"no_jira");   
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Group Management'", "Group Management", false,"no_jira");                               
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Menu Manager'", "Menu Manager", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Orders'", "Orders", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Sales Reporting'", "Sales Reporting", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Sales Analytics'", "Sales Analytics", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Users'", "Users", true,"no_jira");     
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Announcements'", "Announcements", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Promo Management'", "Promo Management", false,"no_jira");                     
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
                        
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             

            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }
        }
        // </editor-fold>    
    }   
}
