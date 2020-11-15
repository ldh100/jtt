/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import static A.A.*;
import static AP3.AP3.*;
import A.T;
/**
 *
 * @author Oleg.Spozito
 */
public class __user_permission {
    // in each Env:
    // cdl.test.xtt+rn@gmail.com - Runner
    // cdl.test.xtt+an@gmail.com - Admin no Allow refunds, no Allow Menu Kick-Outs
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

        _t++; T.Visible_Element_By_Path_Text_Enter("Enter ==== Runner Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+rn@gmail.com", "no_jira"); 
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
        // <editor-fold defaultstate="collapsed" desc="Admin N - Login, Dashboard, Sites" >
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
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Dashboard 'Smart Analytics'", "Smart Analytics", false,"no_jira");            

            // Admin N Sites permissions
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;}  
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Admin N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
               if (FAIL) { return;} 

            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'ADD NEW SITE'", "ADD NEW SITE", true,"no_jira"); 

            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
               if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Site 'Configuration'", "Configuration", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Add Business Unit'", "Add Business Unit", true,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Add Station'", "ADD STATION", true,"no_jira"); 

            _t++; Thread.sleep((long) sleep); T.List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === Admin No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
            }else{
                _f++;
                EX += _t + "\t" + " === Admin No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";
            }            
            // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Admin N Brand Permissions" >               
        _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L3.size(); i++) {        
            _t++; T.Element_Text("Brand Setup Tab >>>>", L3.get(i), "no_jira");
            Tab_Name = t;  
            if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler 
                _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Schedule menu'", "Schedule menu", false,"no_jira");  
                _t++; Thread.sleep((long) sleep); T.List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                    if (FAIL) { return;}
                _t++;
                if(L1.isEmpty()){
                    _p++;
                    EX += _t + "\t" + " === Admin No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                }else{
                    _f++;
                    EX += _t + "\t" + " === Admin No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";
                }                    
            } else if (Tab_Name.toLowerCase().contains("service")) { 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                    if (FAIL) { return; }  
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                    if (FAIL) { return; } // Save
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                    if (FAIL) { return;} 
                Thread.sleep(500);                         
            } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                    if (FAIL) { return; }  
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                    if (FAIL) { return; } // Save
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                    if (FAIL) { return;}   
                Thread.sleep(500);                        
            } else if (Tab_Name.toLowerCase().contains("closure")) {    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                    if (FAIL) { return; }                         
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                    if (FAIL) { return; }    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                    if (FAIL) { return; }   
                Thread.sleep(500);    
            }
        }   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);   
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Station Name'", "css", "[aria-label='Station Name']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Edit 'Station Name'", "css", "[aria-label='Station Name']", "Edit", "no_jira"); 
            if (!FAIL) {
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save Changes' text", "Save Changes", true,"no_jira"); 
                _t++; T.Element_By_Path_Click("Click 'CANCEL'", "xpath", "//*[text()='Cancel']","no_jira");
                    if (FAIL) { return;} 
            } else {
                _t++; 
                _f++;
                EX += _t + "\t" + " === Adnim No Options " + "\t" + "Station Configuration" + "\t" + "Unable to Edit 'Station Name'" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";                        
            }      
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Admin N Group Management" >   
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Click Group Management", "xpath", "//*[contains(text(), 'Group Management')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;}

        _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Add New Group'", "add new group", true,"no_jira");     
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Group'", "xpath", "//*[contains(text(), 'add new group')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Create New Group'", "Create New Group", true,"no_jira");   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Group' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Admin N Groups (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
           if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select/Click 1st Group", "tagName", "td", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;}                
//             _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N Group 'Configuration'", "Configuration", true,"no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Edit Group' text", "Edit Group", true,"no_jira");   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Edit Group' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]", "no_jira"); 
            if (FAIL) { return;}    
         _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click '+ GLOBAL MENU'", "xpath", "//*[contains(text(), 'Global Menu')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Enter Menu ... Name'", "Enter Global Menu Brand Name", true,"no_jira");   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'New Global Menu' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st Group 'Edit' icon", "xpath", "//button[contains(@class, 'v-btn v-btn--flat v-btn--icon theme--light grey--text')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Admin N 'Edit Menu ... Name'", "Edit Global Menu Brand Name", true,"no_jira");   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Edit Menu ... Name' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]", "no_jira"); 
            if (FAIL) { return;}                 
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Admin N Menu Management" >   
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Click Menu Manager", "xpath", "//*[contains(text(), 'Menu Manager')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;}

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", "no_jira");
            if (FAIL) return;   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", GROUP, "no_jira");
                if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + GROUP + "')]", "no_jira"); 
            if (FAIL) { return;}                  
        _t++; T.Clickable_Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
            //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "no_jira"); 
                if (FAIL) { return;}

        _t++; T.Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,"no_jira");   
            if (FAIL) { return;} 

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, "no_jira");
            if (FAIL) { return;} 


        // logout >>>>>>>>>>>    
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
            if (FAIL) { return;}  
    }  
    }
    // </editor-fold>
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
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Dashboard 'Smart Analytics'", "Smart Analytics", true,"no_jira"); 
            
             //SM Y Sites permissions
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("SM Y Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
               if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y 'ADD NEW SITE'", "ADD NEW SITE", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
               if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y Site 'Configuration'", "Configuration", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y 'Add Business Unit'", "Add Business Unit", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y 'Add Station'", "ADD STATION", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === SM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
            }else{
                _f++;
                EX += _t + "\t" + " === SM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
            } 
            // <editor-fold defaultstate="collapsed" desc="SN Y Brand Permissions" >               
            _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                _t++; T.Element_Text("Brand Setup Tab >>>>", L3.get(i), "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler    
                    _t++; Thread.sleep((long) sleep); T.Find_Text("SM Y 'Schedule menu'", "Schedule menu", false,"no_jira");                     
                    _t++; Thread.sleep((long) sleep); T.List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L1.isEmpty()){
                        _p++;
                        EX += _t + "\t" + " === SM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }else{
                        _f++;
                        EX += _t + "\t" + " === SM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
                    }                                      
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(500);                         
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}   
                    Thread.sleep(500);                        
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                        if (FAIL) { return; }                         
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                        if (FAIL) { return; }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }
            }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled","no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                }                    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled","no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _f++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";                        
                } else {
                    _p++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                }            
            //</editor-fold>   
            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;}  
        }  
        }
        //</editor-fold>   

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
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Dashboard 'Smart Analytics'", "Smart Analytics", false,"no_jira");

            //SM N Sites permissions
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("SM N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
               if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N 'ADD NEW SITE'", "ADD NEW SITE", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
               if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N Site 'Configuration'", "Configuration", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N 'Add Business Unit'", "Add Business Unit", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("SM N 'Add Station'", "ADD STATION", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L0.size() == L1.size()){
                _p++;
                EX += _t + "\t" + " === SM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
            }else{
                _f++;
                EX += _t + "\t" + " === SM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
            } 
            // <editor-fold defaultstate="collapsed" desc="SM N Brand Permissions" >               
            _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                _t++; T.Element_Text("Brand Setup Tab >>>>", L3.get(i), "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    _t++; Thread.sleep((long) sleep); T.Find_Text("SM N 'Schedule menu'", "Schedule menu", false,"no_jira"); 
                    _t++; Thread.sleep((long) sleep); T.List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                        if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
                    _t++; Thread.sleep((long) sleep); T.List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L0.size() == L1.size()){
                        _p++;
                        EX += _t + "\t" + " === SM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }else{
                        _f++;
                        EX += _t + "\t" + " === SM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                    }                    
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(500);                         
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}   
                    Thread.sleep(500);                        
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                        if (FAIL) { return; }                         
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                        if (FAIL) { return; }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }

            }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled","no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                }                    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled","no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                    }            
            // </editor-fold> 

            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
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
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Dashboard 'Smart Analytics'", "Smart Analytics", true,"no_jira");
            
            // DM Y Sites permissions
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("DM Y Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
               if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y 'ADD NEW SITE'", "ADD NEW SITE", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
               if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y Site 'Configuration'", "Configuration", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y 'Add Business Unit'", "Add Business Unit", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y 'Add Station'", "ADD STATION", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === DM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
            }else{
                _f++;
                EX += _t + "\t" + " === DM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
            }
            // <editor-fold defaultstate="collapsed" desc="DM Y Brand Permissions" >               
            _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                _t++; T.Element_Text("Brand Setup Tab >>>>", L3.get(i), "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    _t++; Thread.sleep((long) sleep); T.Find_Text("DM Y 'Schedule menu'", "Schedule menu", false,"no_jira");                     
                    _t++; Thread.sleep((long) sleep); T.List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L1.isEmpty()){
                        _p++;
                        EX += _t + "\t" + " === DM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }else{
                        _f++;
                        EX += _t + "\t" + " === DM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
                    }                     
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(500);                         
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}   
                    Thread.sleep(500);                        
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                        if (FAIL) { return; }                         
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                        if (FAIL) { return; }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }             
            }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled","no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                }                    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled","no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _f++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";                        
                } else {
                    _p++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                }           
            // </editor-fold>   
            
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
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
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Dashboard 'Smart Analytics'", "Smart Analytics", false,"no_jira");
            
            // DM N Sites permissions
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("DM N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
               if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N 'ADD NEW SITE'", "ADD NEW SITE", false,"no_jira"); 
            
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);                 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
               if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
               if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N Site 'Configuration'", "Configuration", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N 'Add Business Unit'", "Add Business Unit", false,"no_jira"); 
            _t++; Thread.sleep((long) sleep); T.Find_Text("DM N 'Add Station'", "ADD STATION", false,"no_jira"); 
            
     
            _t++; Thread.sleep((long) sleep); T.List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
            _t++; Thread.sleep((long) sleep); T.List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L0.size() == L1.size()){
                _p++;
                EX += _t + "\t" + " === DM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
            }else{
                _f++;
                EX += _t + "\t" + " === DM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
            }
            // <editor-fold defaultstate="collapsed" desc="DM N Brand Permissions" >               
            _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;} 
  
            _t++; Thread.sleep((long) sleep); T.List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                _t++; T.Element_Text("Brand Setup Tab >>>>", L3.get(i), "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    _t++; Thread.sleep((long) sleep); T.Find_Text("DM N 'Schedule menu'", "Schedule menu", false,"no_jira");  
                    _t++; Thread.sleep((long) sleep); T.List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]", "no_jira");                       
                        if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
                    _t++; Thread.sleep((long) sleep); T.List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]", "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L0.size() == L1.size()){
                        _p++;
                        EX += _t + "\t" + " === DM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }else{
                        _f++;
                        EX += _t + "\t" + " === DM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                    }                    
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(500);                         
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                        if (FAIL) { return; }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}   
                    Thread.sleep(500);                        
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                        if (FAIL) { return; }                         
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                        if (FAIL) { return; }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }                                    
            }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled","no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected disabled" + "\r\n";                        
                }                    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled","no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                }
            // </editor-fold> 
  
            // logout >>>>>>>>>>>    
            _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep(500); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
                if (FAIL) { return;} 
        }
        }
        // </editor-fold>    
    }   
}
