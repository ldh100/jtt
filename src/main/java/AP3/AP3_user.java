package AP3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 *
 * @author Oleg.Spozito
 */
class AP3_user extends AP3_GUI{
    protected AP3_user(AP3_GUI a){
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        SITE = a.SITE;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        _All_data = a._All_data;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    protected void run() { 
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira" );             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Users' Click", "xpath", "//*[contains(text(), 'Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}             
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}  
        Page_URL("Users page URL", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira" );
            if (FAIL) { return;}          
        Element_By_Path_Text("Button 'Add new...' Text ", "xpath", "//button[@class='add-user-button button-radius v-btn theme--light primary']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}  
            
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}  
            
        // <editor-fold defaultstate="collapsed" desc="Users List > Sorts">    
        String TOT_USER = "0";
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}     
            TOT_USER = t.substring(t.lastIndexOf(" ") + 1).trim().replace(",", "");
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                if (FAIL) { return;}
            }        
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );             
                if (FAIL) { return;}
            }        
        To_Bottom("Scroll to Bottom", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira" );
            if (FAIL) { return;} 
            
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira" );
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira" );
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}         
            }            
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira" );
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira" );
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}         
            }
        // ============  Users Sorting
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Click("User Name Sort Click", L1.get(0), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );
                if (FAIL) { return;}
            }
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }
        Element_Click("User Name Sort Click", L1.get(0), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );
                if (FAIL) { return;}
            }
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }       
        Element_Click("Country Sort Click", L1.get(1), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );        
                if (FAIL) { return;}
            }
         List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }
        Element_Click("Country Sort Click", L1.get(1), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );         
                if (FAIL) { return;}
            }
         List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }       
        Element_Click("City Sort Click", L1.get(2), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );           
                if (FAIL) { return;}
            }
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }
     
        Element_Click("Platform Sort Click", L1.get(3), ParentTest, "no_jira" ); 
                if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );            
                if (FAIL) { return;}
            }
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            }
       
        Element_Click("Type of KDS Sort Click", L1.get(4), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );           
                if (FAIL) { return;}
            }
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Users Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira" );             
                if (FAIL) { return;}        
            }      
                        
        // ============ All Users
        Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira" );        
                if (FAIL) { return;}        
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}         
        Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}  
            
        Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                                                                                    
        Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
        Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Thread.sleep(500);             
            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}   
            
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Users Data Row Text", L0.get(i), ParentTest, "no_jira" );             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Users Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira" );             
                    if (FAIL) { return;}        
            } 
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;}   
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira" );             
            if (FAIL) { return;}
        Element_Click("User Name Sort Click", L1.get(0), ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira" );          
                if (FAIL) { return;}
            } 
        // </editor-fold>    
        
        //<editor-fold defaultstate="collapsed" desc="Export">
        Element_By_Path_Text("Button 'Export...' Text ", "xpath", "//button[@class='button-radius v-btn theme--light primary']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Export'", "xpath", "//button[@class='button-radius v-btn theme--light primary']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}   
        Thread.sleep(500);           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Path path = Paths.get(System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv");
        for(int i = 0; i < 20; i++){
            if(Files.exists(path)){
                break;
            }else{
                Thread.sleep(500);
            }
        }        
        File_Find("Find 'Site Operators' CSV File", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", ParentTest, "no_jira" );
        if (!FAIL && !"".equals(t)) { 
            File_Read("Read File - User Count", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", "User_Count", TOT_USER, ParentTest, "no_jira" );
            //if (FAIL) { return;}
            File_Delete("Delete 'Site Operators' CSV File", System.getProperty("user.home") + File.separator + "Downloads", "site-operators.csv", ParentTest, "no_jira" );
            //if (FAIL) { return;}
        }
        //</editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="New Admin Y User">
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Page_URL("New User page URL", ParentTest, "no_jira");
            if (FAIL) { return;}   

        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira" );
             if (FAIL) { return;}        
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if (FAIL) { return;}
                if(t.contains("Admin")){ T_Index = i; }
            }
        Element_Click("Select 'Admin'", L1.get(T_Index), ParentTest, "no_jira" );
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);
        Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Create User' text", "Create User", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}     
        List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Error Message (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if (FAIL) { return;}
    
            }     
        List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", ParentTest, "no_jira" );             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                Element_Attribute("Sub-Title >>>>>>", L2.get(i), "textContent", ParentTest, "no_jira" );
                    if (FAIL) return;
                String CHOICE = t; 
                Scroll_to_Element("Scroll to Card " + i, L2.get(i), ParentTest, "no_jira" );
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Admin", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}            
                        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "a_" + New_ID + "@gmail", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}           
                        Find_Text("Find 'Invalid email' Text", "Invalid Email",true, ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        Element_By_Path_Input_Select_Clear("Email Clear", "css", "[aria-label='E-mail']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "a_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 

                        Find_Text("Find 'Allow refunds' text", "Allow Refunds", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}       
                        Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}             
                        Find_Text("Find 'Allow Menu...' text", "Allow Menu Kick-Outs", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check 'Allow Menu Kick-Outs'", "css", "[aria-label='Allow Menu Kick-Outs']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}                                
                        break;
                    case "Smart Analytics":  
                        Find_Text("Find 'Has access to...' text", "Has access to Feature", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}             
                        Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        break;
                    default:
                        break;
                }
            }                 
        Navigate_Back("Navigate Back","Add New User page", "App User page", ParentTest, "no_jira" ); 
        Text_Found("Find 'Leave...' question", "Leave without saving?", ParentTest, "no_jira" ); 
        if ("Found".equals(t)) {       
            Find_Text("Find 'Leave...' note", "Changes will be lost if you do not save.", true, ParentTest, "no_jira"); 
                if (FAIL) { return; }   
            Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira" ); 
                if (FAIL) { return; }         
            Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira" ); 
                if (FAIL) { return; }     
            Element_By_Path_Click("Click 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira" ); 
                if (FAIL) { return;}  
        }         
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}   
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}             
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Admin User Search > Delete">
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
            Thread.sleep(500);
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}         
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "Not Existing User", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("User Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira" ); 
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "a_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira" );             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "a_" + New_ID + "@gmail.com" + "']", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira" );
            if (FAIL) { return;} 
        Element_By_Path_Text("Find 'Delete User' Text", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira" ); 
            if (FAIL) { return; } 
               
        Find_Text("Admin 'Allow refunds'", "Allow Refunds", true, ParentTest, "no_jira");  
        Find_Text("Admin 'Menu Access'", "Menu Access", false, ParentTest, "no_jira");  
        Find_Text("Admin 'Allow Menu Kick-Outs'", "Allow Menu Kick-Outs", true, ParentTest, "no_jira");                               
        Find_Text("Admin 'Allow Renaming...'", "Allow Renaming in Local Menus", false, ParentTest, "no_jira");
        Find_Text("Admin 'Allow Local Descriptions...'", "Allow Local Description Edits", false, ParentTest, "no_jira");
        Find_Text("Admin 'Overwrite ... PLU'", "Overwrite Local Menu PLU", false, ParentTest, "no_jira");
        Find_Text("Admin 'Allow Local Menu Calories Edits'", "Allow Local Menu Calories Edits", false, ParentTest, "no_jira");
        Find_Text("Admin 'Station visibility status'", "Station visibility status", false, ParentTest, "no_jira");    

        Find_Text("Admin 'Site Permissions'", "Site Permissions", false, ParentTest, "no_jira"); 
        Find_Text("Admin 'Menu Scheduler'", "Menu Scheduler", false, ParentTest, "no_jira"); 
        Find_Text("Admin 'Brand Config'", "Brand Config", false, ParentTest, "no_jira"); 
        Find_Text("Admin 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira");
        
        Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira" ); 
            if (FAIL) { return; }  
        Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira" );
            if (FAIL) { return;}          
        Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
        Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", ParentTest, "no_jira" ); 
        Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira" );
        Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" ); 
        Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
            if (FAIL) { return;}    
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "a_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
        Find_Text("Deleted Admin 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}             
        // </editor-fold>          

        // <editor-fold defaultstate="collapsed" desc="New Site Manager Y User">
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Thread.sleep(500); 
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira" );
             if (FAIL) { return;}        
        Page_URL("New User page URL", ParentTest, "no_jira");
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if(t.contains("Site Manager")){ 
                    T_Index = i; 
                }
            }
        Element_Click("Select 'Site Manager'", L1.get(T_Index), ParentTest, "no_jira" );
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);    
        Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Create User' text", "Create User", true, ParentTest, "no_jira"); 
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}     
        List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Error Message (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
            }     
        List_L0("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", ParentTest, "no_jira" );             
            if (FAIL) { return;}
        List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", ParentTest, "no_jira" );             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Sub-Title >>>>>>", L2.get(i), ParentTest, "no_jira" );
                if (FAIL) return;
                String CHOICE = t; 
                Scroll_to_Element("Scroll to Card " + i, L2.get(i), ParentTest, "no_jira" );
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "SITE", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}            
                        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "s_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}           

                        Scroll_XY("Scroll to Card " + i + " bottom", 0, 200, ParentTest, "no_jira" );
                        Find_Text("Find 'Allow refunds' text", "Allow Refunds", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}       
                        Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}             
                        Find_Text("Find 'Allow Menu...' text", "Menu Access", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Check 'Menu Access'", "css", "[aria-label='Menu Access']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}                                
                        Find_Text("Find 'Allow Renaming...' text", "Allow Renaming in Local Menus", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Check 'Allow Renaming...'", "css", "[aria-label='Allow Renaming in Local Menus']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Find_Text("Find 'Allow Local Descriptions...' text", "Allow Local Description Edits", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Check 'Allow Local Descriptions...'", "css", "[aria-label='Allow Local Description Edits']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                        Find_Text("Find 'Allow Local Menu Calories...' text", "Allow Local Menu Calories Edits", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Check 'Allow Local Menu Calories...'", "css", "[aria-label='Allow Local Menu Calories Edits']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}                      
                        Find_Text("Find 'Station visibility status' text", "Station visibility status", true, ParentTest, "no_jira"); 
                        Find_Text("Find Status 'Read' text", "Read", true, ParentTest, "no_jira"); 
                        Find_Text("Find Status 'Write' text", "Write", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Check Access 'Write'", "css", "[aria-label='Write']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}              
                        break;
                    case "Smart Analytics":  
                        Find_Text("Find 'Has access to...' text", "Has access to Feature", true, ParentTest, "no_jira");          
                        Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        Find_Text("Find 'Choose Sites' text", "Choose Sites", true, ParentTest, "no_jira"); 
                        Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira" );
                            if (!FAIL) { 
                                Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
                                Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", ParentTest, "no_jira" ); 
                                Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira" ); 
                                Find_Text("Find 'All Sites' text", "All Sites", true, ParentTest, "no_jira");                            
                                Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                Find_Text("Find 'Select All' text", "Select All", true, ParentTest, "no_jira");                              
                                Find_Text("Find 'Remove All' text", "Remove All", true, ParentTest, "no_jira"); 
                                Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" );                           
                                Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", ParentTest, "no_jira" ); 
                                Element_By_Path_Click("Click 'Select All'", "xpath", ".//*[text()='Select All']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}  
                                Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                if(!_All_data){
                                    Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira" );
                                        if (FAIL) { return;}
                                    Element_By_Path_Click("Click 'Remove All'", "xpath", ".//*[text()='Remove All']", ParentTest, "no_jira" ); 
                                        if (FAIL) { return;}
                                    Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                        if (FAIL) { return;} 
                                    Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira" );             
                                        if (FAIL) { return;}
                                        for (int j = 0; j < L1.size(); j++) {  
                                            Element_Click("Check Site " + j, L1.get(j), ParentTest, "no_jira"); 
                                                if (FAIL) { return;}                                         
                                        }
                                    Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                        if (FAIL) { return;}   
                                }                                  
                                Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;} 
                                Element_Child_List_L1("Sites count", L0.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", ParentTest, "no_jira" );             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        Move_to_Element("Scroll to Site " + j, L1.get(j), ParentTest, "no_jira" );
                                            if (FAIL) { return;} 
                                        Element_Text("Site " + j + " brands", L1.get(j), ParentTest, "no_jira");             
                                        if (t.contains("0/0")){
                                            Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", ParentTest, "no_jira" ); 
                                                if (FAIL) { return;} 
                                            Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", ParentTest, "no_jira" ); 
                                                if (FAIL) { return;} 
                                            Count_Down--;
                                            j--;
                                        }
                                    } 
                            }
                        break;
                    case "Menu Scheduler":  
                        Find_Text("Find 'Turn Menus On/Off' text", "Turn Menus On/Off", true, ParentTest, "no_jira");           
                        Find_Text("Find 'Menu Scheduling' text", "Menu Scheduling", true, ParentTest, "no_jira"); 
                        Element_Child_List_L1("Checks 'Read' count", L0.get(i), "xpath", ".//input[@aria-label='Read']", ParentTest, "no_jira" );             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Click("Check all 'Read'", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}  
                            }  
                        Element_Child_List_L1("Checks 'Write' count", L0.get(i), "xpath", ".//input[@aria-label='Write']", ParentTest, "no_jira" );             
                            if (FAIL) { return;}                             
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Click("Check all 'Write'", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}  
                            } 
                        break;
                    default:
                        break;
                }
            }                
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Thread.sleep(500);   
        // </editor-fold>    
        
        // <editor-fold defaultstate="collapsed" desc="Site User Search > Delete">
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}         
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "s_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira" );             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "s_" + New_ID + "@gmail.com" + "']", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                
        Find_Text("SM 'Allow refunds'", "Allow Refunds", true, ParentTest, "no_jira");  
        Find_Text("SM 'Menu Access'", "Menu Access", true, ParentTest, "no_jira");   
        Find_Text("SM 'Allow Menu Kick-Outs'", "Allow Menu Kick-Outs", false, ParentTest, "no_jira");                               
        Find_Text("SM 'Allow Renaming...'", "Allow Renaming in Local Menus", true, ParentTest, "no_jira"); 
        Find_Text("SM 'Allow Local Descriptions...'", "Allow Local Description Edits", true, ParentTest, "no_jira"); 
        Find_Text("SM 'Overwrite ... PLU'", "Overwrite Local Menu PLU", false, ParentTest, "no_jira"); 
        Find_Text("SM 'Allow Local Menu Calories Edits'", "Allow Local Menu Calories Edits", true, ParentTest, "no_jira"); 
        Find_Text("SM 'Station visibility status'", "Station visibility status", true, ParentTest, "no_jira");     

        Find_Text("SM 'Site Permissions'", "Site Permissions", true, ParentTest, "no_jira");  
        Find_Text("SM Assigned Site", SITE, true, ParentTest, "no_jira"); 
        Find_Text("SM 'Menu Scheduler'", "Menu Scheduler", true, ParentTest, "no_jira");  
        Find_Text("SM 'Brand Config'", "Brand Config", true, ParentTest, "no_jira");  
        Find_Text("SM 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira"); 
        
        Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira" ); 
            if (FAIL) { return; }  
        Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira" );
            if (FAIL) { return;}             
        Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
        Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", ParentTest, "no_jira" ); 

        Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira" );
        Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );  
        Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
            if (FAIL) { return;}                 

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", ParentTest, "no_jira" ); 
        if (FAIL) { return;}            

        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "s_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
        Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>     

        // <editor-fold defaultstate="collapsed" desc="New CDL Delivery Manager Y User">
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira" );
             if (FAIL) { return;}        
        Page_URL("New User page URL", ParentTest, "no_jira");
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if (FAIL) { return;}
                if(t.contains("CDL Delivery Manager")){ T_Index = i; }
            }
        Element_Click("Select 'CDL Delivery Manager'", L1.get(T_Index), ParentTest, "no_jira" );
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);              
        Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Create User' text", "Create User", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}     
        List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Error Message (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if (FAIL) { return;}
            }     
        List_L0("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", ParentTest, "no_jira" );             
            if (FAIL) { return;}
        List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", ParentTest, "no_jira" );             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Sub-Title >>>>>>", L2.get(i), ParentTest, "no_jira" );
                if (FAIL) return;
                String CHOICE = t; 
                Scroll_to_Element("Scroll to Card " + i, L2.get(i), ParentTest, "no_jira" );
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Delivery", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}            
                        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "d_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}           

                        Scroll_XY("Scroll to Card " + i + " bottom", 0, 200, ParentTest, "no_jira" );
                        Find_Text("Find 'Allow refunds' text", "Allow Refunds", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}       
                        Element_By_Path_Click("Check 'Allow refunds'", "css", "[aria-label='Allow Refunds']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}             
                        Find_Text("Find 'Allow Menu...' text", "Menu Access", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check 'Menu Access'", "css", "[aria-label='Menu Access']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}                                
                        Find_Text("Find 'Allow Renaming...' text", "Allow Renaming in Local Menus", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check 'Allow Renaming...'", "css", "[aria-label='Allow Renaming in Local Menus']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Find_Text("Find 'Allow Local Descriptions...' text", "Allow Local Description Edits", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check 'Allow Local Descriptions...'", "css", "[aria-label='Allow Local Description Edits']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                        Find_Text("Find 'Overwrite ... PLU' text", "Overwrite Local Menu PLU", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check 'Overwrite Local Menu PLU'", "css", "[aria-label='Overwrite Local Menu PLU']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                            
                        Find_Text("Find 'Station visibility status' text", "Station visibility status", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Find_Text("Find Status 'Read' text", "Read", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Find_Text("Find Status 'Write' text", "Write", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Check Access 'Write'", "css", "[aria-label='Write']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                            
                        break;
                    case "Smart Analytics":  
                        Find_Text("Find 'Has access to...' text", "Has access to Feature", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}             
                        Element_By_Path_Click("Check 'Has access to...'", "css", "[aria-label='Has access to Feature']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        Find_Text("Find 'Choose Sites' text", "Choose Sites", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}  
                        Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira" );
                            if (!FAIL) { 
                                Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
                                if (FAIL) { return;}
                                Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;} 
                                Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}                                                                    
                                Find_Text("Find 'All Sites' text", "All Sites", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;}                              
                                Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;} 
                                Find_Text("Find 'Select All' text", "Select All", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;}                              
                                Find_Text("Find 'Remove All' text", "Remove All", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;}
                                Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}                              
                                Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}   

                                Element_By_Path_Click("Click 'Select All'", "xpath", ".//*[text()='Select All']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}  
                                Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;} 
//                              if(!_All_data){
                                    Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira" );
                                        if (FAIL) { return;}
                                    Element_By_Path_Click("Click 'Remove All'", "xpath", ".//*[text()='Remove All']", ParentTest, "no_jira" ); 
                                        if (FAIL) { return;}
                                    Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                        if (FAIL) { return;} 
                                    Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira" );             
                                        if (FAIL) { return;}
                                        for (int j = 0; j < L1.size(); j++) {  
                                            Element_Click("Check Site " + j, L1.get(j), ParentTest, "no_jira"); 
                                                if (FAIL) { return;}                                         
                                        }
                                    Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
                                        if (FAIL) { return;}   
//                              }                                  
                                Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;} 
                                Element_Child_List_L1("Sites count", L0.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", ParentTest, "no_jira" );             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        Move_to_Element("Scroll to Site " + j, L1.get(j), ParentTest, "no_jira" );
                                            if (FAIL) { return;} 
                                        Element_Text("Site " + j + " brands", L1.get(j), ParentTest, "no_jira");             
                                        if (t.contains("0/0")){
                                            Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", ParentTest, "no_jira" ); 
                                                //if (FAIL) { return;} 
                                            Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", ParentTest, "no_jira" ); 
                                                if (FAIL) { return;} 
                                            Count_Down--;
                                            j--;
                                        }
                                    } 
                            }
                        break;
                    case "Menu Scheduler":  
                        Find_Text("Find 'Turn Menus On/Off' text", "Turn Menus On/Off", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}             
                        Find_Text("Find 'Menu Scheduling' text", "Menu Scheduling", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;} 
                        Element_Child_List_L1("Checks 'Read' count", L0.get(i), "xpath", ".//input[@aria-label='Read']", ParentTest, "no_jira" );             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Click("Check all 'Read'", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}  
                            }  
                        Element_Child_List_L1("Checks 'Write' count", L0.get(i), "xpath", ".//input[@aria-label='Write']", ParentTest, "no_jira" );             
                            if (FAIL) { return;}                             
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Click("Check all 'Write'", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}  
                            } 
                        break;
                    case "Brand Config":  
                        Find_Text("Find 'Allow Menu Assignation' text", "Allow Menu Assignation", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}             
                        Element_By_Path_Click("Check 'Allow Menu Assignation'", "xpath", ".//input[@aria-label='Allow Menu Assignation']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                        Find_Text("Find 'Allow Timeslot Modification' text", "Allow Timeslot Modification", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        Element_By_Path_Click("Check 'Allow Timeslot Modification''", "xpath", ".//input[@aria-label='Allow Timeslot Modification']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;} 
                        break;
                    default:
                        break;
                }
            }      
        Thread.sleep(500);              
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}    
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        // </editor-fold>              

        // <editor-fold defaultstate="collapsed" desc="CDL Delivery Manager Search > Delete">
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}         
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "d_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira" );             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "d_" + New_ID + "@gmail.com" + "']", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira" );
            if (FAIL) { return;} 
                
        Find_Text("DM 'Allow refunds'", "Allow Refunds", true, ParentTest, "no_jira");  
        Find_Text("DM 'Menu Access'", "Menu Access", true, ParentTest, "no_jira");   
        Find_Text("DM 'Allow Menu Kick-Outs'", "Allow Menu Kick-Outs", false, ParentTest, "no_jira");                               
        Find_Text("DM 'Allow Renaming...'", "Allow Renaming in Local Menus", true, ParentTest, "no_jira"); 
        Find_Text("DM 'Allow Local Descriptions...'", "Allow Local Description Edits", true, ParentTest, "no_jira"); 
        Find_Text("DM 'Overwrite ... PLU'", "Overwrite Local Menu PLU", true, ParentTest, "no_jira"); 
        Find_Text("DM 'Allow Local Menu Calories Edits'", "Allow Local Menu Calories Edits", true, ParentTest, "no_jira"); 
        Find_Text("DM 'Station visibility status'", "Station visibility status", true, ParentTest, "no_jira");     

        Find_Text("DM 'Site Permissions'", "Site Permissions", true, ParentTest, "no_jira"); 
        Find_Text("DM Assigned Site", SITE, true, ParentTest, "no_jira");         
        Find_Text("DM 'Menu Scheduler'", "Menu Scheduler", true, ParentTest, "no_jira");  
        Find_Text("DM 'Brand Config'", "Brand Config", true, ParentTest, "no_jira");  
        Find_Text("DM 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira"); 
        
        Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira" ); 
                if (FAIL) { return; }    
         Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira" );
            if (FAIL) { return;}    // Find fragment              
        Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 

        Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira" );
            if (FAIL) { return;} 
        Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
            if (FAIL) { return;}    
        Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
            if (FAIL) { return;}                 
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}            
 
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "d_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
        Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>  

        if(!env.equals("PR")){
        // <editor-fold defaultstate="collapsed" desc="New Runner User">
        To_Top("Scroll to Top", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira" );
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira" );
             if (FAIL) { return;}        
        Page_URL("New User page URL", ParentTest, "no_jira");
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira" );
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
                if (FAIL) { return;}
                if(t.contains("Runner")){ T_Index = i; }
            }
        Element_Click("Select 'Runner'", L1.get(T_Index), ParentTest, "no_jira" );
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);              
        Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Create User' text", "Create User", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}     
        List_L1("Error Message Count", "xpath", ".//div[@class='v-messages__message']", ParentTest, "no_jira" );                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Error Message (index " + i + ")", L1.get(i),  ParentTest, "no_jira" );             
            }     
        List_L0("v-cards Count", "xpath", "//div[@class='v-card__title v-card__title--primary']/parent::div", ParentTest, "no_jira" );             
            if (FAIL) { return;}
        List_L2("v-cards Titles Count", "xpath", "//div[@class='v-card__title v-card__title--primary']", ParentTest, "no_jira" );             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Sub-Title >>>>>>", L2.get(i), ParentTest, "no_jira" );
                if (FAIL) return;
                String CHOICE = t; 
                Scroll_to_Element("Scroll to Card " + i, L2.get(i), ParentTest, "no_jira" );
                    if (FAIL) { return;} 
                    Thread.sleep(500); 
                switch (CHOICE) { 
                    case "User Details": 
                        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "Runner", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "Automation", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}            
                        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", "r_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
                            if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165554321", false, ParentTest, "no_jira" );
                            if (FAIL) { return;}           
                        break;
                    case "Site Permissions Please select at least 1 brand":  
                        Find_Text("Find 'Choose Sites' text", "Choose Sites", true, ParentTest, "no_jira"); 
                            if (FAIL) { return;}  
                        Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", ParentTest, "no_jira" ); 
                            if (FAIL) { return;}  
                        Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira" );
                            if (!FAIL) { 
                                Element_Child_Text("Find 'Dialog..' Title", e1, "xpath", "//div[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
                                if (FAIL) { return;}
                                Element_Child_Text("Find 'Dialog..' prompt", e1, "xpath", "//div[@class='Body-2-Selected-On-Surface-Medium-Emphasis-Left']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;} 
                                Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}                                                                    
                                Find_Text("Find 'All Sites' text", "All Sites", true, ParentTest, "no_jira"); 
                                    if (FAIL) { return;}                              
                                Element_Child_Text("Find 'Continue' text", e1, "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}                              
                                Element_Child_Text("Find 'Cancel' text", e1, "xpath", ".//*[text()='Cancel']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;}   

                                Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira" );
                                    if (FAIL) { return;}
                                Element_Child_List_L1("Found Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-radiobox-blank theme--light']", ParentTest, "no_jira" );             
                                    if (FAIL) { return;}
                                Element_Click("Check 1st Site", L1.get(0), ParentTest, "no_jira"); 
                                    if (FAIL) { return;}                                          
                                        
                                Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", ParentTest, "no_jira" ); 
                                    if (FAIL) { return;} 
                                Element_Child_List_L1("Sites count", L0.get(i), "xpath", ".//div[contains(@class, 'layout Site-Permissions-Container px-3 mt-2 mb-2 noselect')]", ParentTest, "no_jira" );             
                                    if (FAIL) { return;}    
                                    int Count_Down = L1.size();
                                    for (int j = 0; j < Count_Down; j++) {                                       
                                        Move_to_Element("Scroll to Site " + j, L1.get(j), ParentTest, "no_jira" );
                                            if (FAIL) { return;} 
                                        Element_Text("Site " + j + " brands", L1.get(j), ParentTest, "no_jira");             
                                        if (t.contains("0/0")){
                                            Element_Child_Click("Click 'Remove' Site with 0 Brands", L1.get(j),"xpath", ".//button[@class='v-btn v-btn--flat theme--light']", ParentTest, "no_jira" ); 
                                                if (FAIL) { return;} 
                                            Element_By_Path_Click("Click confirm 'Remove'", "xpath", ".//div[text()='REMOVE']", ParentTest, "no_jira" ); 
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
        Thread.sleep(500);              
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest, "no_jira");             
            if (FAIL) { return;}    
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}
        // </editor-fold>   
             
        // <editor-fold defaultstate="collapsed" desc="Runner Search > Delete">
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira" ); 
            if (FAIL) { return;}         
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "r_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira" ); 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira" );             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira" );             
            } 
        Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + "r_" + New_ID + "@gmail.com" + "']", ParentTest, "no_jira" ); 
            if (FAIL) { return;} 
        Thread.sleep(500);           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira" );
            if (FAIL) { return;} 

        Find_Text("Runner 'Allow refunds'", "Allow Refunds", false, ParentTest, "no_jira");  
        Find_Text("Runner 'Menu Access'", "Menu Access", false, ParentTest, "no_jira");   
        Find_Text("Runner 'Allow Menu Kick-Outs'", "Allow Menu Kick-Outs", false, ParentTest, "no_jira");                               
        Find_Text("Runner 'Allow Renaming...'", "Allow Renaming in Local Menus", false, ParentTest, "no_jira"); 
        Find_Text("Runner 'Allow Local Descriptions...'", "Allow Local Description Edits", false, ParentTest, "no_jira"); 
        Find_Text("Runner 'Overwrite ... PLU'", "Overwrite Local Menu PLU", false, ParentTest, "no_jira"); 
        Find_Text("Runner 'Allow Local Menu Calories Edits'", "Allow Local Menu Calories Edits", false, ParentTest, "no_jira"); 
        Find_Text("Runner 'Station visibility status'", "Station visibility status", false, ParentTest, "no_jira");     

        Find_Text("Runner 'Site Permissions'", "Site Permissions", true, ParentTest, "no_jira");  
        Find_Text("Runner Assigned Site", SITE, true, ParentTest, "no_jira"); 
        Find_Text("Runner 'Menu Scheduler'", "Menu Scheduler", false, ParentTest, "no_jira");  
        Find_Text("Runner 'Brand Config'", "Brand Config", false, ParentTest, "no_jira");  
        Find_Text("Runner 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira");
        
        Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira" ); 
            if (FAIL) { return; }  
            Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira" );
            if (FAIL) { return;}    // Find fragment              
            Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira" ); 
                if (FAIL) { return;}
            Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", ParentTest, "no_jira" ); 
                if (FAIL) { return;} 

            Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira" );
                if (FAIL) { return;} 
            Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
                if (FAIL) { return;}    
            Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira" );
                if (FAIL) { return;}                 
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira" );
                if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", ParentTest, "no_jira" ); 
            if (FAIL) { return;}            
 
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "r_" + New_ID + "@gmail.com", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
        Find_Text("Deleted Site Manager 'Not Found' notification", "No matching records found", true,ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold>  
        }
    } catch (Exception ex){  
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }
    }
}
