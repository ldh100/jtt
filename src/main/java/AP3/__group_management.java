/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class __group_management {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Group Management' Click", "xpath", "//*[contains(text(), 'Group Management')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Page_URL("Group Management page URL", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
                  
        _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Group Data Row Text", L0.get(i), "no_jira");             
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
        // ============  Groups Sorting
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Click("Group Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Group Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; T.Element_Text("Group Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }        
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Click("Group Country Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Group Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; T.Element_Text("Group Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                if (FAIL) { return;}        
            }
//            if(L1.size() > 2) { // No of Brands >>>>>>>>>>>>>>>>>>>>>>> Deleted as Performans improvement Ticket
//                _t++; Thread.sleep((long) sleep); T.Element_Click("Group No of Brands Click", L1.get(2), "no_jira"); // no more CM-2621
//                    if (FAIL) { return;} 
//                    for (int i = 0; i < L1.size(); i++) {
//                        _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
//                        if (FAIL) { return;}
//                    }
//                _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
//                    if (FAIL) { return;}
//                    if (ALL_DATA)  {
//                        for (int i = 0; i < L0.size(); i++) {
//                            _t++; T.Element_Text("Group Data Row Text", L0.get(i), "no_jira");             
//                            if (FAIL) { return;}
//                        } 
//                    } else {
//                        _t++; T.Element_Text("Group Data Row Text", L0.get(L0.size()- 1), "no_jira");             
//                        if (FAIL) { return;}        
//                    }    
//            } else{
//                _t++;
//                _f++;
//                EX += " - " + "\t" + "Group Data Row" + "\t" + "Column 'No of Brands'" + "\t" + " << Missing"+ "\t" + "FAIL" + "\t" + "CM-2621" + "\t" + " - " + "\r\n";
//            }
 
        // ============ All Announcements               
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
        Thread.sleep(500);              
            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Group Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; T.Element_Text("Group Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_Click("Groups Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");          
                if (FAIL) { return;}
            }  
            
        // new
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Add Group..' Text", "add new group",true,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Button 'Add New..' click", "css", "[type='submit']", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Input 'Group Name' click", "css", "[aria-label='Group Name']", "no_jira");             
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter new Group Name", "css", "[aria-label='Group Name']", "New Group " + New_ID, "no_jira");
            if (FAIL) { return;} 
        _t++;  T.Element_By_Path_Click("Open Country combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Country' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                         
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Country list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Country Name (index " + i + ")", L1.get(i),  "no_jira");         
                if (FAIL) { return;}
                if(t.contains("United States")){ T_Index = i; }
        }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'United States'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Button 'Cancel' Click", "xpath", "//*[contains(text(), 'Cancel')]","no_jira");             
            if (FAIL) { return;} 
            
        // Search >>>
        String G = GROUP.substring(0, GROUP.indexOf("/"));
        String C = GROUP.substring(GROUP.indexOf("/") + 1);
        _t++; Thread.sleep((long) sleep); T.Find_Text("Fund 'Search...' text", "Search all Groups", true,"no_jira");   
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Search Groups Click", "xpath", "//label[contains(text(), 'Search all Groups')]", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Group Search", "css", "[aria-label='Search all Groups']", G, "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Filteres Groups Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Group Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
                if("CA".equals(C) && t.contains("Canada") && t.contains(G)) { T_Index = i;}
                if("US".equals(C) && t.contains("United States") && t.contains(G)) { T_Index = i;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_Click("Click " + GROUP , L0.get(T_Index), "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.List_L0("Submits Count", "css", "[type='submit']", "no_jira");             
            if (FAIL) { return;}
        _t++; T.Element_Attribute("Submit 1 Name", L0.get(0), "textContent", "no_jira");             
        _t++; T.Element_Attribute("Submit 2 Name", L0.get(1), "textContent", "no_jira"); 
        
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
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Brand Global Menus Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Menu Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Menu Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                    if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_Click("Site Count Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");          
                if (FAIL) { return;}
            }   
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Fund 'Search...' text", "Search all Brands", true,"no_jira");   
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Search Brands Click", "xpath", "//label[contains(text(), 'Search all Brands')]", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Brand Menu Search", "css", "[aria-label='Search all Brands']", GL_MENU, "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Search Brands Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Menu Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
                if(t.equals(GL_MENU)) { 
                    T_Index = i;
                }
            } 
//        _t++; Thread.sleep((long) sleep); T.Element_Click("Click " + GL_MENU , L0, "L1", T_Index, "no_jira");
//            if (FAIL) { return;}           
//        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}             
    } 
}
