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
public class __site {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Page_URL("Sites page URL", "no_jira"); 
            if (FAIL) { return;}      
            
        // <editor-fold defaultstate="collapsed" desc="SITEs List > Sorts">    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Button 'Add new...' Text ", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
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
        Thread.sleep(500);           

        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}              
         _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
                  
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
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
        // ============  Sites Sorting
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Click("Site Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Site Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }       
        _t++; Thread.sleep((long) sleep); T.Element_Click("Country Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");        
                if (FAIL) { return;}
            }
         _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                if (FAIL) { return;}        
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Country Sort Click", L1.get(1), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");         
                if (FAIL) { return;}
            }
         _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }       
        _t++; Thread.sleep((long) sleep); T.Element_Click("City Sort Click", L1.get(2), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");           
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
     
        _t++; Thread.sleep((long) sleep); T.Element_Click("Platform Sort Click", L1.get(3), "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");            
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }
       
        _t++; Thread.sleep((long) sleep); T.Element_Click("Type of KDS Sort Click", L1.get(4), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");           
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }      
            
        _t++; Thread.sleep((long) sleep); T.Element_Click("Unit # Click", L1.get(5), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");           
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), "no_jira");             
                    if (FAIL) { return;}        
            }              
        // ============ All Sites
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
        Thread.sleep(500);       
            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    _t++; T.Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                    if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_Click("Site Name Sort Click", L1.get(0), "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");          
                if (FAIL) { return;}
            } 
        // </editor-fold>        
        
        // <editor-fold defaultstate="collapsed" desc="SITE Search > Brand List">
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                //if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Address text", "xpath", "//div[contains(@class, 'timezone-address')][1]", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Timezone text", "xpath", "//div[contains(@class, 'timezone-address')][2]", "no_jira"); 
            if (FAIL) { return;}    
            if(!"empty".equals(t) && t.contains(" ")) {
                TZone = t.substring(t.indexOf(" ")).trim();// ===================================
            } else{
                TZone = "NotFound";
            }
        
        _t++; Thread.sleep((long) sleep);  T.Element_By_Path_Text("Site Station List text", "xpath", "//div[contains(@class, 'H6-Selected')]", "no_jira");
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Configuration text", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;}                                                                                         
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Unit(s) Count", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Child_Attribute("Brand Name", L0.get(i), "xpath", ".//h3[contains(@class, 'brand-name')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; T.Element_Child_Attribute("Brand Unit", L0.get(i), "xpath", ".//h4[contains(@class, 'Brand-Unit')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; T.Element_Child_List_L1("Unit Stations Count", L0.get(i), "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}
                    for (int j = 2; j < L1.size(); j++) {  // L1 > L0 inner table >>>>>>>>>>>>   0 > 2 skip empty rows
                        _t++; T.List_TR_TDs("Station " + (j -1), L1, j, "no_jira");      
                    }
            } 
        // </editor-fold> 
            
        // <editor-fold defaultstate="collapsed" desc="Training Video">
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Trainig Video Icon Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-help-circle')]", "no_jira"); 
            if (FAIL) { return;}     
        Thread.sleep(500);               
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("Swith to Video Player", "tagName", "iframe", "no_jira");// iframe src="https://player.vimeo.com/video/412472158"
            if (FAIL) { return;} 
        Thread.sleep(1000);   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Player load", "className", "play-icon", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Video Title", "xpath", "//header[contains(@class, 'vp-title-header')]", "textContent","no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Play Click", "className", "play-icon", "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("Back to default frame", "defaultContent", "N/A", "no_jira");
            if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Video Player Close Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-close')]", "no_jira"); 
            if (FAIL) { return;} 
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Site Congiguration">
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.List_L0("Site Configuration sections Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L0.size(); i++) {
            switch (i) {
                case 0:
                    _t++; T.Element_Text("Definition section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Location Details Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Location Details' text", "Location Details", true,"no_jira"); 
                       if (FAIL) { return;}
                    _t++; T.Element_By_Path_Text("Find 'Timezone' text", "className", "timezone", "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; T.Find_Text("Find 'Location Name' text", "Location Name", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Address' text", "Address", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Country' text", "Country", true,"no_jira"); 
                        if (FAIL) { return;}
                    if(CAN.toLowerCase().contains("can")){
                        _t++; T.Find_Text("Find 'Province' text", "Province", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; T.Find_Text("Find 'Postal Code' text", "Postal Code", true,"no_jira"); 
                            if (FAIL) { return;} 
                    } else {
                        _t++; T.Find_Text("Find 'State' text", "State", true,"no_jira"); 
                            if (FAIL) { return;} 
                        _t++; T.Find_Text("Find 'Zip Code' text", "Zip Code", true,"no_jira"); 
                            if (FAIL) { return;} 
                        }  
                    _t++; T.Find_Text("Find 'City' text", "City", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true,"no_jira"); 
                        if (FAIL) { return;}
                    break;
                case 1:
                    _t++; T.Element_Text("Payment section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Payment Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Payment ID' text", "Payment ID", true,"no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Payment Type' text", "Payment Type", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Refunds Accepted' text", "Refunds Accepted?", true,"no_jira"); 
                        if (FAIL) { return;}
                    break;
                case 2:
                    _t++; T.Element_Text("Mealplan section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Mealplan Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Meal Plan' text", "Meal Plan", true,"no_jira"); 
                        if (FAIL) { return;}
                      break;
                case 3:
                     _t++; T.Element_Text("Loyalty section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Loyalty Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Loyalty Program' text", "Loyalty Program", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'not enabled' text", "Loyalty is not enabled for this brand", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'to enable' text", "Would you like to enable Loyalty?", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Yes' text", "Yes", true,"no_jira"); 
                        if (FAIL) { return;}
//                  _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'No' text", "No", "no_jira"); 
//                      if (FAIL) { return;}
                   break;
                case 4:
                    _t++; T.Element_Text("Promotion section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Promotion Info'", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotions' text", "Promotions", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.List_L1("Promotions Count", "tagName", "tr", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }
                default:
                    break;
            }
        }  
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Site Configuration","Station List", "no_jira");
            //if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}               
            Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Station List","App Sites page", "no_jira");
            //if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}               
            Thread.sleep(1000);
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="New Sites > Cancel">
        _t++; T.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Add New Site Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);    
         _t++; Thread.sleep((long) sleep); T.Page_URL("New Site page URL","no_jira");
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter new Site Name", "css", "[aria-label='Location Name']", "New Auto Site " + New_ID, "no_jira");
            if (FAIL) { return;} // ^^^ enter name to show buttons
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create Site' text", "Create Site", true,"no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Site Info Navigationd Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            switch (i) {
                case 0:
                    _t++; T.Element_Text("Definition section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Location Details Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Location Details' text", "Location Details", true,"no_jira"); 
                       if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Location Name' text", "Location Name", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Address' text", "Address", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Country' text", "Country", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'City' text", "City", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Postal Code' text", "Postal Code", true,"no_jira"); 
                        if (FAIL) { return;} 
                    _t++; T.Find_Text("Products Title", "On Site Product", true,"no_jira"); 
                        if (FAIL) { return;}

                    _t++; T.Clickable_Element_By_Path_Click("Create Site", "xpath", "//*[contains(text(), 'Create Site')]", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Required:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }  
                    //String ADDR = "87 Bordeaux Drive, Logan Township, NJ, USA";
                    //String ADDR_Short = "87 Bordeaux Dr"; 
                     _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter new Site Address", "css", "[aria-label='Address']", "87 Bordeaux Drive, Logan Township", "no_jira");
                        if (FAIL) { return;}  
                        Thread.sleep(1000); 
                     _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select new Site Address", "xpath", "//*[contains(text(), '" + "Bordeaux Drive" + "')]", "no_jira");
                        if (FAIL) { return;} 
                        Thread.sleep(1000); 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Select_Copy("New Site Address", "xpath", "//input[@aria-label='Address']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Element_By_Path_Text("New Site Country", "xpath", "//input[@aria-label='Country']/parent::div", "no_jira"); 
                        if (FAIL) { return;} // OK
                    _t++; T.Element_By_Path_Text("New Site State", "xpath", "//input[@aria-label='State']/parent::div", "no_jira"); 
                        if (FAIL) { return;} // OK
                    _t++; T.Element_By_Path_Text_Select_Copy("New Site City", "xpath", "//input[@aria-label='City']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Element_By_Path_Text_Select_Copy("New Site Zip Code", "xpath", "//input[@aria-label='Zip Code']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Element_By_Path_Text_Select_Copy("New Site Latitude, Longitude", "xpath", "//input[@aria-label='Latitude, Longitude']", "no_jira"); 
                        if (FAIL) { return;}

                    _t++; T.List_L1("Available Products Count", "className", "App-Container", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Product Name", L1.get(j), "no_jira");
                            if (FAIL) { return;} 
                            if(t == null ? app == null : t.equals(app)){
                                _t++; Thread.sleep((long) sleep); T.Element_Click("New Site Select Product " + app, L1.get(j), "no_jira"); 
                                   if (FAIL) { return;}                                    
                            }
                            _t++; T.Element_Child_Attribute("Product Image", L1.get(j), "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", "no_jira");             
                            if (FAIL) { return;}
                            // _t++; T.Element_Child_Attribute("Product Selected", L0, "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", j, "no_jira");             
                            // if (FAIL) { return;}            // //_t++; Thread.Sleep(sleep); App_Enabled(DT[i], "no_jira"); if (FAIL) return;
                        }
//                        _t++; Thread.sleep((long) sleep); T.List_L1("Selected Apps Count", "xpath", ".//div[contains(@class,'v-messages__message')]", "no_jira");             
//                            if (FAIL) { return;}     
                    break;
                case 1:
                    _t++; T.Element_Text("Payment section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Payment Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Payment ID' text", "Payment ID", true,"no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Payment Type' text", "Payment Type", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Payment Type Prompt", "css", "[aria-label='Payment Type']", "placeholder", "no_jira");
                         if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Payment Type Dropdown Open", "css", "[aria-label='Payment Type']", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.List_L1("Payment Types Count", "xpath", "/html/body/div/div[9]/div/div/div", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Available Payment Type:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }  
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Payment Type", "xpath", "//*[contains(text(), '" + "FreedomPay" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter FP Store ID", "css", "[aria-label='Freedom Pay Store ID']", "1471190011", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter FP Terminal ID", "css", "[aria-label='Freedom Pay Terminal ID']", "2479168011", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Refunds Accepted?' text", "Refunds Accepted?", true,"no_jira"); 
                        if (FAIL) { return;}
                    break;
                case 2:
                    _t++; T.Element_Text("Mealplan section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Mealplan Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Meal Plan' text", "Meal Plan", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Choose Prompt", "css", "[aria-label='Plan Type']", "placeholder", "no_jira");
                         if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Meal Plan Dropdown", "css", "[aria-label='Plan Type']", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Plan Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);// 
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Plan Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");     
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Available Meal Plan:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }   
                     _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Meal Plan", "xpath", "//*[contains(text(), '" + "Blackboard" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Plan Name", "css", "[aria-label='Plan Name']", "BLACKBOARD", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Plan ID", "css", "[aria-label='Plan ID']", "O4wNDAle2lFdWRLpOwWRTZwBmMljADh97Lk2G2qXUy9pOvJlMoFEgQDOYmX2tA8Q", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Additional Instructions", "css", "[aria-label='Additional Instructions (en)']", "Do not use - test auto generated", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Terminal ID", "css", "[aria-label='Meal Plan Terminal ID']", "401001", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Tender type", "css", "[aria-label='Tender Type']", "401", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Tax Exempt?' text", "Is this plan Tax Exempt?", true,"no_jira"); 
                        if (FAIL) { return;}

                      break;
                case 3:
                     _t++; T.Element_Text("Loyalty section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Loyalty Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Loyalty Program' text", "Loyalty Program", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'not enabled' text", "Loyalty is not enabled for this brand", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'to enable' text", "Would you like to enable Loyalty?", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.Find_Text("Find 'Yes' text", "Yes", true,"no_jira"); 
                        if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'No' text", "No", "no_jira"); 
//                            if (FAIL) { return;}
                   break;
                case 4:
                    _t++; T.Element_Text("Promotion section", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Promotion Info'", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotions' text", "Promotions", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; T.List_L1("Promotions Count", "tagName", "tr", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Create...' text", "CREATE PROMO", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", "no_jira"); 
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Save promo Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;}   
                     _t++; Thread.sleep((long) sleep); T.List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Required:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }

                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo%%" , "no_jira");
                        if (FAIL) { return;} 

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", "no_jira");
                         if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                                         
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); T.List_L1("Promo Types Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; T.Element_Text("Promo Type:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Promo Type %%", "xpath", "//*[contains(text(), '" + "Percentage off" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Percentage off 50%", "css", "[aria-label='Value ($ or %)']", "50", "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); T.List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; T.Element_Text("Promo State:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            }    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", "no_jira");
                        if (FAIL) { return;}  


                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;}  
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo 'Cancel' Click", "xpath", "//*[contains(text(), 'cancel')]", "no_jira"); 
//                            if (FAIL) { return;}
                    _t++; T.List_L1("Promotions Count", "tagName", "tr", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }     

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", "no_jira"); 
                        if (FAIL) { return;}                                                     
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo$$" , "no_jira");
                        if (FAIL) { return;} 

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", "no_jira");
                         if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                                         
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); T.List_L1("Promo Types Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; T.Element_Text("Promo Type:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            } 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Promo Type $$", "xpath", "//*[contains(text(), '" + "Amount off" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Ammount off 2$", "css", "[aria-label='Value ($ or %)']", "2", "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", "no_jira");
                         if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); T.List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; T.Element_Text("Promo State:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            }   
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", "no_jira");
                        if (FAIL) { return;}  


                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;}  
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Create promo 'Cancel' Click", "xpath", "//*[contains(text(), 'cancel')]", "no_jira"); 
//                            if (FAIL) { return;}
                    _t++; T.List_L1("Promo Count - Only 1 Active", "tagName", "tr", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; T.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }                              
                        break;
                    default:
                        break;
                }
            }   
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("New Site 'Cancel' Click", "xpath", "//*[contains(text(), 'Cancel')]","no_jira");             
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back","Add New Site page","App Site page", "no_jira"); 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}           
        Thread.sleep(1000);
        // </editor-fold> 
    }
}
