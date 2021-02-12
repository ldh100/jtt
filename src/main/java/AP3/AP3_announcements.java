/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_announcements {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Announcements' Click", "xpath", "//*[contains(text(), 'Announcements')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Announcements page URL", "no_jira"); 
            if (FAIL) { return;}  
            
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
                  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Announcements Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }       
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                _t++; TWeb.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        // ============  Announcements Sorting
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Announcement App Sort Click", L1.get(2), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Announcements Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Announcement Status Click", L1.get(5), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Announcements Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }       
 
        // ============ All Announcements               
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}               
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Announcements Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Text("Announcement Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; TWeb.Element_Text("Announcement Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}       
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("App Sort Click", L1.get(2), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");          
                if (FAIL) { return;}
            }    
            
        //   New  / Edit / Delete
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'New..' Text", "NEW ANNOUNCEMENT",true,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Button 'New Announcement' click", "css", "[type='submit']", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); TWeb.Page_URL("New Announcement page URL","no_jira");
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.List_L2("v-cards Count", "xpath", "//div[@class='v-card-content']", "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                switch (i) { 
                    case 0: 
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Card " + i, L2.get(0), "no_jira");
                            if (FAIL) { return;}
                        _t++; TWeb.Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", "no_jira");         
                            if (FAIL) { return;}                        
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Announcement Name", "css", "[aria-label='Announcement Name']", "Auto Announcement " + New_ID, false, "no_jira");
                            if (FAIL) { return;} 
                            
                        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Create Announcement' text", "Create Announcement", true,"no_jira"); 
                            if (FAIL) { return;}                            
                            
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement Type Dropdown Open", "css", "[aria-label='Announcement Type']", "no_jira");
                             if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Announcement Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                            if (FAIL) { return;}                          
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Announcement Types' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Available Announcement Type:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}                            
                            }
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 'Other' Type", "xpath", "//*[contains(text(), '" + "Other" + "')]", "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Announcement Other Type Text", "css", "[aria-label='Type']", "placeholder", "no_jira");
                             if (FAIL) { return;}                           
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Other Type text input Click", "css", "[aria-label='Type']", "no_jira");
                             if (FAIL) { return;}                             
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Other Type", "css", "[aria-label='Type']", "Auto_Other_Type", false, "no_jira");
                            if (FAIL) { return;}
                            
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Announcement App Prompt", "css", "[aria-label='Select App']", "placeholder", "no_jira");
//                             if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement App Dropdown Open", "css", "[aria-label='Select App']", "no_jira");
                             if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Announcement App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                            if (FAIL) { return;}                          
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Announcement App' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Available Application:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}                            
                            }
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select '" + app + "' App", "xpath", "//*[contains(text(), '" + app + "')]", "no_jira");
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create Announcement Click", "xpath", "//*[contains(text(), 'Create Announcement')]", "no_jira"); 
                            //if (FAIL) { return;}     >>>>>>>>>> Toast >>>>>
                        
                        String s = "Search Sites (" + app + ")";
                        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Search..' text", s, true,"no_jira"); 
                            if (FAIL) { return;}                            
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Search Sites...'", "css", "[aria-label='" + s + "']", "no_jira");
                             if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter 'Search Sites...'", "css", "[aria-label='" + s + "']", SITE, false, "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find 'Sites...' list", L2, i, "xpath", ".//div[@class='v-list list-panel theme--light']", "no_jira");
                            if (FAIL) { return;}                           
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Sites' Count", e1, "xpath", ".//label[@class='v-label theme--light']", "no_jira");              
                           T_Index = -1;
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Selection " + (j+1) + " Name", L1.get(j), "no_jira");             
                                    if (FAIL) { return;}   
                                if(t.trim().equals(SITE)){
                                    T_Index = j;
                                }
                            }         
                        if(T_Index > -1){
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check '" + SITE + "'", L1.get(T_Index), "no_jira");
                                if (FAIL) { return;}                                
                        } else{
                           // EX = no BRAND
                        }   
                        
                        _t++; TWeb.Text_Found("Enable this announcement...", "Enable this announcement to see", "no_jira");
                        if(t.equals("Not Found")){  
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", "no_jira");
                                if (FAIL) { return; }
                                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                    if (FAIL) { return;}                          
                                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Positions' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                                    for (int j = 0; j < L1.size(); j++) {
                                        _t++; TWeb.Element_Text("Available Position:", L1.get(j), "no_jira");             
                                        if (FAIL) { return;}                            
                                    }
                                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Available Position", L1.get(0),"no_jira");
                                    if (FAIL) { return;} 
                         }else{
                            _t++; TWeb.Find_Text("Find Notification text", "Enable this announcement to see", true,"no_jira");
                                if (FAIL) { return; }
//                            _t++; TWeb.Find_Text("Find 'Status' text", "Status", true,"no_jira");
//                                if (FAIL) { return; }
//                            _t++; TWeb.Element_By_Path_Text("Find 'Status'", "xpath", "//input[@aria-label='Status']/parent::div", "no_jira"); 
//                                if (FAIL) { return; }
                         }
                        break;
                    case 1:  
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create Announcement Click", "xpath", "//*[contains(text(), 'Create Announcement')]", "no_jira"); 
                            //if (FAIL) { return;}     >>>>>>>>>> Toast >>>>>                       
                        _t++; TWeb.Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", "no_jira");         
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Card " + i, L2.get(1), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find EN Title", L2, i, "css", "[aria-label='Title']", "no_jira"); 
                            if (FAIL) { return;}                        
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click EN Title", e1, "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter EN Title", e1, "EN Title " + New_ID, "no_jira");
                            if (FAIL) { return;}                         
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("textarea Count", L2.get(1), "tagName", "textarea", "no_jira");             
                            //if (FAIL) { return;}                          
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click EN Description", L1.get(0),"no_jira");
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter EN Description", L1.get(0), "EN Description " + New_ID, "no_jira");
                                if (FAIL) { return;}                                                  
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click EN Sub Text", L1.get(1), "no_jira");
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Sub Text", L1.get(1), "EN Sub Text " + New_ID, "no_jira");
                                if (FAIL) { return;} 
                            break;
                    case 2:  
                        _t++; TWeb.Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", "no_jira");         
                            if (FAIL) { return;}  
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Card " + i, L2.get(2), "no_jira");
                        _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find EN Title", L2, i, "css", "[aria-label='Title']", "no_jira"); 
                            if (FAIL) { return;}                        
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click FR Title", e1, "no_jira");
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter FR Title", e1, "FR Titre " + New_ID, "no_jira");
                            if (FAIL) { return;}                         
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("textarea Count", L2.get(2), "tagName", "textarea", "no_jira");             
                            //if (FAIL) { return;}                          
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click FR Description", L1.get(0),"no_jira");
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter FR Description", L1.get(0), "FR la Description " + New_ID, "no_jira");
                                if (FAIL) { return;}                                                  
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click FR Sub Text", L1.get(1), "no_jira");
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Sub Text", L1.get(1), "FR la SubText " + New_ID, "no_jira");
                                if (FAIL) { return;}                 
                        break;
                    default:
                        break;
                }
            }     
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create Announcement Click", "xpath", "//*[contains(text(), 'Create Announcement')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);           
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
            
        // ============ All Announcements   
        _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}

            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);              
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Announcements Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            T_Index = -1; 
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Announcement Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                if(t.startsWith("Auto Announcement " + New_ID)){
                    T_Index = i;
                }
            } 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element("Scroll to Created Announcement", L0.get(T_Index), "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_XY("Scroll up to make ^ 'clickable'", 0, -100, "no_jira");
            if (FAIL) { return;} 
        _t++; TWeb.Element_Child_List_L2("Data fields Count", L0.get(T_Index), "tagName", "td", "no_jira");             
            if (FAIL) { return;}    
            
        _t++; TWeb.Element_Text("Announcement Sites text", L2.get(4), "no_jira");   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Sites'", L2.get(4), "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active v-dialog--persistent']", "no_jira");
            if (!FAIL) {  // Find fragment     
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Sites' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center']", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Find 'Sites' dialog Title text", e2, "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find target Site", SITE, true, "no_jira"); 
                    if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='Edit']", "no_jira");
                    //if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='Cancel']", "no_jira");
                    if (FAIL) { return;}    
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click dialog 'Cancel' ", e2, "no_jira");
                    if (FAIL) { return;} 
            }
        _t++; TWeb.Element_Text("Announcement Image text", L2.get(5), "no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'View Image'", L2.get(5), "no_jira");
            if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Sites' dialog", "xpath", ".//div[@class='v-dialog v-dialog--active v-dialog--persistent']", "no_jira");
                    if (!FAIL) {    // Find fragment 
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Image(s)' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center']", "no_jira");
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Find 'Image(s)' dialog Title text", e2, "no_jira");
                    if (FAIL) { return;}      
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'En...' version text", "English Version", true, "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Fr...' version text", "French Version", true, "no_jira"); 
                    if (FAIL) { return;}
                    
                _t++; TWeb.Element_Child_List_L1("Images Count", e1, "tagName", "img", "no_jira");              
                    for (int j = 0; j < L1.size(); j++) {        
                        _t++; TWeb.Element_Attribute("Image " + j + " src", L1.get(j), "src", "no_jira");             
                        if (FAIL) { return;}  
                    }          
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='EDIT']", "no_jira");
                    if (FAIL) { return;} 
                _t++; TWeb.Element_Text("Botton 'Edit' text", e2, "no_jira");      
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='Cancel']", "no_jira");
                    if (FAIL) { return;}  
                _t++; TWeb.Element_Text("Botton 'Cancel' text", e2, "no_jira");
                _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to 'Cancel' button", e2, "no_jira");
                    if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click dialog 'Cancel' ", e2, "no_jira");
                    if (FAIL) { return;}                    
            }        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Created Announcement", L2.get(1), "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);              
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", "no_jira"); 
            if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Created Announcements page URL", "no_jira"); 
            String A_ID = "";
            if(t.contains("/")){
                A_ID = t.substring(t.lastIndexOf("/") + 1);
                _t++; Thread.sleep((long) sleep); TWeb.Call_API("Call /announcemen/ API", BaseAPI + "/announcement/" + A_ID, true,"no_jira" );
                _t++; TWeb.API_Body_Contains("Announcemen API - find Site ID", SiteID,true, "no_jira");    
                _t++; TWeb.API_Body_Contains("Announcemen API - find App", app,true, "no_jira"); 
                _t++; TWeb.API_Body_Contains("Announcemen API - find Name", "Auto Announcement " + New_ID,true, "no_jira");
                _t++; TWeb.API_Body_Contains("Announcemen API - find EN Title", "EN Title " + New_ID,true, "no_jira");    
                _t++; TWeb.API_Body_Contains("Announcemen API - find EN Description", "EN Description " + New_ID,true, "no_jira");
                _t++; TWeb.API_Body_Contains("Announcemen API - find EN Sub Text", "EN Sub Text " + New_ID,true, "no_jira");  
                _t++; TWeb.API_Body_Contains("Announcemen API - find EN Button Text ", "Dismiss",true, "no_jira"); 
                _t++; TWeb.API_Body_Contains("Announcemen API - find Fr Description", "FR la Description " + New_ID,true, "no_jira"); 
                _t++; TWeb.API_Body_Contains("Announcemen API - find Type", "Auto_Other_Type",true, "no_jira");  
            }            

//            _t++; TWeb.Move_to_Element_By_Path("Scroll up to Sites", "xpath", "//div[@class='v-list list-panel theme--light']", "no_jira");
//                if (FAIL) { return;}  // English Version
            _t++; TWeb.Move_to_Element_By_Path("Scroll up to Position/Status", "xpath", "//div[text()='English Version']", "no_jira");
                if (FAIL) { return;}  // English Version
            _t++; TWeb.Text_Found("Enable this announcement...", "Enable this announcement to see", "no_jira");
            if(t.equals("Not Found")){  
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", "no_jira");
                    if (FAIL) { return; }
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                    if (FAIL) { return;}                          
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Positions' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; TWeb.Element_Text("Available Position:", L1.get(j), "no_jira");             
                        if (FAIL) { return;}                            
                    }
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Available Position", L1.get(0),"no_jira");
                    if (FAIL) { return;}         
            }else{
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Enable this announcement' Text", "Enable this announcement",true,"no_jira");             
                    if (FAIL) { return;}
                if(t.contains("If not possible, disable another one")){  
                    _t++; _w++;
                    EX += _t + "\t" + "Enable Announcement - not possible" + "\t" + "No Position available" + "\t" + t + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\r\n";    
                }
                else{
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement Status Dropdown Open", "css", "[aria-label='Status']", "no_jira");
                        if (FAIL) { return; }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Status' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                          
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Announcement Status' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                        T_Index = -1;
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Available Status:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}  
                            if(t.trim().equals("Active")){
                                T_Index = j;
                            }
                        }
                        if(T_Index > -1){
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check '" + "Active" + "'", L1.get(T_Index), "no_jira");
                                if (FAIL) { return;}   
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", "no_jira");
                                if (FAIL) { return; }
                            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                if (FAIL) { return;}                          
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Announcement App' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                                for (int j = 0; j < L1.size(); j++) {
                                    _t++; TWeb.Element_Text("Available Position:", L1.get(j), "no_jira");             
                                    if (FAIL) { return;}                            
                                }
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Available Position", L1.get(0),"no_jira");
                                if (FAIL) { return;}                                
                        } else{
                           // EX += no BRAND
                        } 
                }
             }           
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira"); 
        Thread.sleep(1000);            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete Announcement Click", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
            if (FAIL) {    
                Thread.sleep(2000); // DEBUG - fluentWait for page reload bug
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete Announcement Click again", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", "no_jira"); 
                    if (FAIL) { return;}  
                Thread.sleep(500); 
                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Delete' dialog again", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                    if (FAIL) { return;} 
            }            
            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Delete..' Title", "Delete Announcement", true, "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Delete..' warning", "Are you sure", true, "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click dialog 'Delete' ", e2, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);                  
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Confirm Deleted", "Auto Announcement " + New_ID, false, "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Call_API("Call /announcemen/ API", BaseAPI + "/announcement/" + A_ID, false,"no_jira" );    
    }
}
