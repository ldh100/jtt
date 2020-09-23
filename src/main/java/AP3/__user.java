/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import java.io.File;
/**
 *
 * @author Oleg.Spozito
 */
public class __user {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Users' Click", "xpath", "//*[contains(text(), 'Users')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Page_URL("Users page URL", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Button 'Add new...' Text ", "xpath", "//button[@class='add-user-button button-radius v-btn theme--light primary']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;}            
        // <editor-fold defaultstate="collapsed" desc="Users List > Sorts">    
        String TOT_USER = "0";
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}     
            TOT_USER = t.substring(t.lastIndexOf(" ")+ 1).trim();
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); T.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        // ============  Users Sorting
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Click("User Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("User Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }       
        _t++; Thread.sleep((long) sleep); T.Element_Click("Country Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");        
                if (FAIL) { return;}
            }
         _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Country Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");         
                if (FAIL) { return;}
            }
         _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }       
        _t++; Thread.sleep((long) sleep); T.Element_Click("City Sort Click", L1.get(2), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");           
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
     
        _t++; Thread.sleep((long) sleep); T.Element_Click("Platform Sort Click", L1.get(3), "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");            
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
       
        _t++; Thread.sleep((long) sleep); T.Element_Click("Type of KDS Sort Click", L1.get(4), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");           
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }      
                        
        // ============ All Users
        _t++; T.Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", "no_jira");        
                if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                    
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}               
            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Users Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                    if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_Click("User Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");          
                if (FAIL) { return;}
            } 
        // </editor-fold>    
        
        //<editor-fold defaultstate="collapsed" desc="Export">
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Button 'Export...' Text ", "xpath", "//button[@class='button-radius v-btn theme--light primary']", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Export'", "xpath", "//button[@class='button-radius v-btn theme--light primary']", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}         
        //Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.File_Find("Find User List File", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", "no_jira");
        if (FAIL) { return;}
        if(!"".equals(t)){
            _t++; Thread.sleep((long) sleep); T.File_Read("Read File - User Count", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", "User_Count", TOT_USER, "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.File_Delete("Delete User List File", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", "no_jira");
            if (FAIL) { return;}
        }
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="New Admin User">
        _t++; T.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Add New User Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); T.Page_URL("New User page URL","no_jira");
            if (FAIL) { return;}   

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", "no_jira");
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Role Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Admin")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'Admin'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create User' text", "Create User", true,"no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Error Message (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
    
            }     
        _t++; Thread.sleep((long) sleep); T.List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                _t++; T.Element_Attribute("Sub-Title >>>>>>", L2.get(i), "textContent", "no_jira");
                    if (FAIL) return;
                String CHOICE = t; 
                _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Card " + i, L2.get(i), "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Admin", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", "no_jira");
                            if (FAIL) { return;}            
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "A_" + New_ID + "@gmail", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", "no_jira");
                            if (FAIL) { return;}           
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Invalid email' Text", "Invalid Email",true,"no_jira");             
                            if (FAIL) { return;}
                        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "css", "[aria-label='E-mail']",  "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "A_" + New_ID + "@gmail.com", "no_jira");
                            if (FAIL) { return;} 

                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow refunds' text", "Allow Refunds", true,"no_jira"); 
                            if (FAIL) { return;}       
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", "no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Menu...' text", "Allow Menu Kick-Outs", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Menu Kick-Outs'", "css", "[aria-label='Allow Menu Kick-Outs']", "no_jira"); 
                            if (FAIL) { return;}                                
                        break;
                    case "Smart Analytics":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Has access to...' text", "Has access to Feature", true,"no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", "no_jira"); 
                            if (FAIL) { return;}  
                        break;
                    default:
                        break;
                }
            }                 
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back","Add New User page","App User page", "no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Text_Found("Find 'Leave...' question", "Leave without saving?", "no_jira"); 
        if ("Found".equals(t)) {       
            _t++; FAIL = false; T.Find_Text("Find 'Leave...' note", "Changes will be lost if you do not save.", true,"no_jira"); 
                if (FAIL) { return; }   
            _t++; FAIL = false; T.Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", "no_jira"); 
                if (FAIL) { return; }         
            _t++; FAIL = false; T.Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", "no_jira"); 
                if (FAIL) { return; }     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", "no_jira"); 
                if (FAIL) { return;}  
        }         

        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}             
        // </editor-fold>              
        // <editor-fold defaultstate="collapsed" desc="Admin User Search > Delete">
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "Not Existing User", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("User Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "A_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                _t++; T.Element_Text("Users Data Row Text", L0.get(j), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "a_" + New_ID + "@gmail.com" + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; FAIL = false; T.Element_By_Path_Text("Find 'Delete User' Text", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", "no_jira"); 
            if (FAIL) { return; } 
        _t++; FAIL = false; T.Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", "no_jira"); 
            if (FAIL) { return; }  
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;}    // Find fragment              
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;} 

            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "A_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Deleted Admin 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}             
        // </editor-fold>          

        // <editor-fold defaultstate="collapsed" desc="New Site Manager User">
        _t++; T.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Add New User Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); T.Page_URL("New User page URL","no_jira");
            if (FAIL) { return;}   

            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", "no_jira");
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Role Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Site Manager")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'Site Manager'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create User' text", "Create User", true,"no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Error Message (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
    
            }     
        _t++; Thread.sleep((long) sleep); T.List_L3("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                _t++; T.Element_Text("Sub-Title >>>>>>", L2.get(i), "no_jira");
                if (FAIL) return;
                String CHOICE = t; 
                _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Card " + i, L2.get(i), "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "SITE", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", "no_jira");
                            if (FAIL) { return;}            
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "S_" + New_ID + "@gmail.com", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", "no_jira");
                            if (FAIL) { return;}           

                        _t++; Thread.sleep((long) sleep); T.Scroll_XY("Scroll to Card " + i + " bottom", 0, 200, "no_jira");
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow refunds' text", "Allow Refunds", true,"no_jira"); 
                            if (FAIL) { return;}       
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", "no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Menu...' text", "Menu Access", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Menu Access'", "css", "[aria-label='Menu Access']", "no_jira"); 
                            if (FAIL) { return;}                                
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Renaming...' text", "Allow Renaming in Local Menus", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Renaming...'", "css", "[aria-label='Allow Renaming in Local Menus']", "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Local Descriptions...' text", "Allow Local Description Edits", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Local Descriptions...'", "css", "[aria-label='Allow Local Description Edits']", "no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Local Menu Calories...' text", "Allow Local Menu Calories Edits", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Local Menu Calories...'", "css", "[aria-label='Allow Local Menu Calories Edits']", "no_jira"); 
                            if (FAIL) { return;} 
                            
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Station visibility status' text", "Station visibility status", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find Status 'Read' text", "Read", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find Status 'Write' text", "Write", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check Access 'Write'", "css", "[aria-label='Write']", "no_jira"); 
                            if (FAIL) { return;} 
                            
                        break;
//                    case "Smart Analytics":  
//                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Has access to...' text", "Has access to Feature", true,"no_jira"); 
//                            if (FAIL) { return;}             
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", "no_jira"); 
//                            if (FAIL) { return;}  
//                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Choose Sites' text", "Choose Sites", true,"no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                            if (!FAIL) { 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", "no_jira"); 
                                if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
                                    if (FAIL) { return;}                                    

                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'All Sites' text", "All Sites", true,"no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select All' text", "Select All", true,"no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Remove All' text", "Remove All", true,"no_jira"); 
                                    if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", "no_jira"); 
                                    if (FAIL) { return;}   

                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Select All'", "xpath", ".//*[text()='Select All']", "no_jira"); 
                                    if (FAIL) { return;}  
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                    if (FAIL) { return;} 
                                if(!ALL_DATA){
                                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Remove All'", "xpath", ".//*[text()='Remove All']", "no_jira"); 
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                        if (FAIL) { return;} 
                                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");             
                                        if (FAIL) { return;}
                                    for (int j = 0; j < L1.size(); j++) {  
                                        _t++; Thread.sleep((long) sleep); T.Element_Click("Check Site " + j, L1.get(j),"no_jira"); 
                                            if (FAIL) { return;}                                         
                                    }
                                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                        if (FAIL) { return;}   
                                }                                  
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Sites count", L3.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", "no_jira");             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        _t++; Thread.sleep((long) sleep); T.Move_to_Element("Scroll to Site " + j, L1.get(j), "no_jira");
                                            if (FAIL) { return;} 
                                        _t++; T.Element_Text("Site " + j + " brands", L1.get(j),"no_jira");             
                                        if (t.contains("0/0")){
                                            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", "no_jira"); 
                                                //if (FAIL) { return;} 
                                            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", "no_jira"); 
                                                if (FAIL) { return;} 
                                            Count_Down--;
                                            j--;
                                        }
                                    } 
                            }
                        break;
                    case "Menu Scheduler":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Turn Menus On/Off' text", "Turn Menus On/Off", true,"no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Menu Scheduling' text", "Menu Scheduling", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Checks 'Read' count", L3.get(i), "xpath", ".//input[@aria-label='Read']", "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; Thread.sleep((long) sleep); T.Element_Click("Check all 'Read'", L1.get(j),"no_jira");             
                                    if (FAIL) { return;}  
                            }  
                        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Checks 'Write' count", L3.get(i), "xpath", ".//input[@aria-label='Write']", "no_jira");             
                            if (FAIL) { return;}                             
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; Thread.sleep((long) sleep); T.Element_Click("Check all 'Write'", L1.get(j),"no_jira");             
                                    if (FAIL) { return;}  
                            } 
                        break;
                    default:
                        break;
                }
            }                     
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(500);
        // </editor-fold>              
        // <editor-fold defaultstate="collapsed" desc="Site User Search > Delete">
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "S_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                _t++; T.Element_Text("Users Data Row Text", L0.get(j), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "s_" + New_ID + "@gmail.com" + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; FAIL = false; T.Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", "no_jira"); 
                if (FAIL) { return; }  
                
         _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;}    // Find fragment              
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;} 

            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}                 
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
//        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
//            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", "no_jira"); 
            if (FAIL) { return;}            
 
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "s_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>     

        // <editor-fold defaultstate="collapsed" desc="New CDL Delivery Manager User">
        _t++; T.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Add New User Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); T.Page_URL("New User page URL","no_jira");
            if (FAIL) { return;}   

            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", "no_jira");
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Role Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("CDL Delivery Manager")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'CDL Delivery Manager'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create User' text", "Create User", true,"no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Error Message (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }     
        _t++; Thread.sleep((long) sleep); T.List_L3("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                _t++; T.Element_Text("Sub-Title >>>>>>", L2.get(i), "no_jira");
                if (FAIL) return;
                String CHOICE = t; 
                _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Card " + i, L2.get(i), "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Delivery", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", "no_jira");
                            if (FAIL) { return;}            
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "D_" + New_ID + "@gmail.com", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", "no_jira");
                            if (FAIL) { return;}           

                        _t++; Thread.sleep((long) sleep); T.Scroll_XY("Scroll to Card " + i + " bottom", 0, 200, "no_jira");
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow refunds' text", "Allow Refunds", true,"no_jira"); 
                            if (FAIL) { return;}       
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", "no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Menu...' text", "Menu Access", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Menu Access'", "css", "[aria-label='Menu Access']", "no_jira"); 
                            if (FAIL) { return;}                                
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Renaming...' text", "Allow Renaming in Local Menus", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Renaming...'", "css", "[aria-label='Allow Renaming in Local Menus']", "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Local Descriptions...' text", "Allow Local Description Edits", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Local Descriptions...'", "css", "[aria-label='Allow Local Description Edits']", "no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Overwrite ... PLU' text", "Overwrite Local Menu PLU", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Overwrite Local Menu PLU'", "css", "[aria-label='Overwrite Local Menu PLU']", "no_jira"); 
                            if (FAIL) { return;} 
                            
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Station visibility status' text", "Station visibility status", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find Status 'Read' text", "Read", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find Status 'Write' text", "Write", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check Access 'Write'", "css", "[aria-label='Write']", "no_jira"); 
                            if (FAIL) { return;} 
                            
                        break;
//                    case "Smart Analytics":  
//                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Has access to...' text", "Has access to Feature", true,"no_jira"); 
//                            if (FAIL) { return;}             
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", "no_jira"); 
//                            if (FAIL) { return;}  
//                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Choose Sites' text", "Choose Sites", true,"no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                            if (!FAIL) { 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", "no_jira"); 
                                if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
                                    if (FAIL) { return;}                                                                    
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'All Sites' text", "All Sites", true,"no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select All' text", "Select All", true,"no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Remove All' text", "Remove All", true,"no_jira"); 
                                    if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", "no_jira"); 
                                    if (FAIL) { return;}   

                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Select All'", "xpath", ".//*[text()='Select All']", "no_jira"); 
                                    if (FAIL) { return;}  
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                    if (FAIL) { return;} 
//                              if(!ALL_DATA){
                                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Remove All'", "xpath", ".//*[text()='Remove All']", "no_jira"); 
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                        if (FAIL) { return;} 
                                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");             
                                        if (FAIL) { return;}
                                    for (int j = 0; j < L1.size(); j++) {  
                                        _t++; Thread.sleep((long) sleep); T.Element_Click("Check Site " + j, L1.get(j),"no_jira"); 
                                            if (FAIL) { return;}                                         
                                    }
                                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
                                        if (FAIL) { return;}   
//                              }                                  
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Sites count", L3.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", "no_jira");             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        _t++; Thread.sleep((long) sleep); T.Move_to_Element("Scroll to Site " + j, L1.get(j), "no_jira");
                                            if (FAIL) { return;} 
                                        _t++; T.Element_Text("Site " + j + " brands", L1.get(j),"no_jira");             
                                        if (t.contains("0/0")){
                                            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", "no_jira"); 
                                                //if (FAIL) { return;} 
                                            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", "no_jira"); 
                                                if (FAIL) { return;} 
                                            Count_Down--;
                                            j--;
                                        }
                                    } 
                            }
                        break;
                    case "Menu Scheduler":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Turn Menus On/Off' text", "Turn Menus On/Off", true,"no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Menu Scheduling' text", "Menu Scheduling", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Checks 'Read' count", L3.get(i), "xpath", ".//input[@aria-label='Read']", "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; Thread.sleep((long) sleep); T.Element_Click("Check all 'Read'", L1.get(j),"no_jira");             
                                    if (FAIL) { return;}  
                            }  
                        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Checks 'Write' count", L3.get(i), "xpath", ".//input[@aria-label='Write']", "no_jira");             
                            if (FAIL) { return;}                             
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; Thread.sleep((long) sleep); T.Element_Click("Check all 'Write'", L1.get(j),"no_jira");             
                                    if (FAIL) { return;}  
                            } 
                        break;
                    case "Brand Config":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Menu Assignation' text", "Allow Menu Assignation", true,"no_jira"); 
                            if (FAIL) { return;}             
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Menu Assignation'", "xpath", ".//input[@aria-label='Allow Menu Assignation']", "no_jira"); 
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Timeslot Modification' text", "Allow Timeslot Modification", true,"no_jira"); 
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Allow Timeslot Modification''", "xpath", ".//input[@aria-label='Allow Timeslot Modification']", "no_jira"); 
                            if (FAIL) { return;} 
                        break;
                    default:
                        break;
                }
            }                     
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(500);
        // </editor-fold>              
        // <editor-fold defaultstate="collapsed" desc="CDL Delivery Manager Search > Delete">
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "D_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                _t++; T.Element_Text("Users Data Row Text", L0.get(j), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "d_" + New_ID + "@gmail.com" + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; FAIL = false; T.Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", "no_jira"); 
                if (FAIL) { return; }  
                
         _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;}    // Find fragment              
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;} 

            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}                 
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
//        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
//            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", "no_jira"); 
            if (FAIL) { return;}            
 
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "d_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>  

        if(!env.equals("PR")){
        // <editor-fold defaultstate="collapsed" desc="New Runner User">
        _t++; T.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Add New User Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); T.Page_URL("New User page URL","no_jira");
            if (FAIL) { return;}   

            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", "no_jira");
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Role Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Runner")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'Runner'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create User' text", "Create User", true,"no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Error Message (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }     
        _t++; Thread.sleep((long) sleep); T.List_L3("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                _t++; T.Element_Text("Sub-Title >>>>>>", L2.get(i), "no_jira");
                if (FAIL) return;
                String CHOICE = t; 
                _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Card " + i, L2.get(i), "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Runner", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", "no_jira");
                            if (FAIL) { return;}            
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "R_" + New_ID + "@gmail.com", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", "no_jira");
                            if (FAIL) { return;}           
                        _t++; Thread.sleep((long) sleep); T.Scroll_XY("Scroll to Card " + i + " bottom", 0, 200, "no_jira");
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow refunds' text", "Allow Refunds", false,"no_jira");            
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Menu...' text", "Menu Access", false,"no_jira");                               
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Renaming...' text", "Allow Renaming in Local Menus", false,"no_jira"); 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Allow Local Descriptions...' text", "Allow Local Description Edits", false,"no_jira"); 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Overwrite ... PLU' text", "Overwrite Local Menu PLU", false,"no_jira"); 
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Station visibility status' text", "Station visibility status", false,"no_jira"); 
                            
                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Choose Sites' text", "Choose Sites", true,"no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", "no_jira"); 
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                            if (!FAIL) { 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", "no_jira"); 
                                if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
                                    if (FAIL) { return;}                                                                    
                                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'All Sites' text", "All Sites", true,"no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;}                              
                                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", "no_jira"); 
                                    if (FAIL) { return;}   

                                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Found Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-radiobox-blank theme--light']", "no_jira");             
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); T.Element_Click("Check 1st Site", L1.get(0),"no_jira"); 
                                        if (FAIL) { return;}                                          
                                        
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", "no_jira"); 
                                    if (FAIL) { return;} 
                                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Sites count", L3.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", "no_jira");             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        _t++; Thread.sleep((long) sleep); T.Move_to_Element("Scroll to Site " + j, L1.get(j), "no_jira");
                                            if (FAIL) { return;} 
                                        _t++; T.Element_Text("Site " + j + " brands", L1.get(j),"no_jira");             
                                        if (t.contains("0/0")){
                                            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", "no_jira"); 
                                                //if (FAIL) { return;} 
                                            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", "no_jira"); 
                                                if (FAIL) { return;} 
                                            Count_Down--;
                                            j--;
                                        }
                                    } 
                            }
                        break;
                    default:
                        break;
                }
            }                     
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(500);
        // </editor-fold>              
        // <editor-fold defaultstate="collapsed" desc="Runner Search > Delete">
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "R_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Users Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                _t++; T.Element_Text("Users Data Row Text", L0.get(j), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "r_" + New_ID + "@gmail.com" + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; FAIL = false; T.Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", "no_jira"); 
                if (FAIL) { return; }  
                
         _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;}    // Find fragment              
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;} 

            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}                 
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
//        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", "no_jira"); 
//            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", "no_jira"); 
            if (FAIL) { return;}            
 
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "r_" + New_ID + "@gmail.com", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>  
        }
    }   
}
