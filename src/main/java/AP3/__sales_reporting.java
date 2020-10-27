/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import java.io.File;
import java.time.LocalDateTime;
/**
 *
 * @author Oleg.Spozito
 */
public class __sales_reporting {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
            
//        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to 'Sales Reporting'", url + "/#/reports","no_jira");             
//            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Page_URL("Sales Reporting page URL", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light menuable__content__active
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}             

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
//        _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira");             
//            if (FAIL) { return;}  
//         Thread.sleep(500);  
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
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("EOD Report Click", "xpath", "//button[contains(@class, 'Subtitle-1-Primary-Left v-btn')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Unit' list", "xpath", "//div[contains(@class, 'px-2 py-2 v-card v-sheet theme--light')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Unit list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Unit Name (index " + i + ")", L1.get(i),  "no_jira");         
                if (FAIL) { return;}
        }                       
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Download...", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Units/Cost...", "xpath", "//span[contains(@class, 'H6-Secondary-Left')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Select...", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", "no_jira"); 
            if (FAIL) { return;}     
        _t++; T.Find_Text("Find 'Download' text", "DOWNLOAD", true,"no_jira");
            if (FAIL) { return; }
         _t++; T.Find_Text("Find 'Cancel' text", "CANCEL", true,"no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'CANCEL')]", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;} 

        // ============== Default Date
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Default Report Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;}
            }           

        _t++; Thread.sleep((long) sleep); T.List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", "no_jira");         
                    if (FAIL) { return;}
                _t++; T.Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]","no_jira");         
                    if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    _t++; T.List_TR_THs("Summary (index " + i + ") eod-table Headers", L1, j, "no_jira");         
                        if (FAIL) { return;}
                    _t++; T.Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr","no_jira");         
                        if (FAIL) { return;}
                        for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k = 0 - th header
                            _t++; T.List_TR_TDs("eod-table Data (index " + k + ") ", L2, k, "no_jira");         
                            if (FAIL) { return;} 
                        }
                    } 
                }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Export...", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Filters...", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant')]", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}         
        //Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                _t++; Thread.sleep((long) sleep); T.File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, "no_jira");
                    if (FAIL) { return;}                 
            }
            
        // ============== Date Range
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}     
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Month Back' chevron", "xpath", "//i[contains(@class,'v-icon mdi mdi-chevron-left theme--light')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click Day 1", "xpath", "//div[text()='" + 1 + "']", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Selected Date Range", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;}                 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}  
//            _t++; Thread.sleep((long) sleep); T.Move_out_of_Visible_Element("Close Date Picker", "xpath", "//div[contains(@class, 'v-picker v-card v-picker--date theme--light')]", "Right", 2, 0,"no_jira");             
//                if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira"); 
            if (FAIL) { return;} 

        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;}
            }           

        _t++; Thread.sleep((long) sleep); T.List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", "no_jira");         
                if (FAIL) { return;}
                _t++; T.Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]","no_jira");         
                if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    _t++; T.List_TR_THs("Summary (index " + i + ") eod-table Headers", L1, j, "no_jira");         
                    if (FAIL) { return;}
                    _t++; T.Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr","no_jira");         
                    if (FAIL) { return;}
                    for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k =0 - th header
                        _t++; T.List_TR_TDs("eod-table Data (index " + k + ") ", L2, k, "no_jira");         
                        if (FAIL) { return;} 
                    }
                } 
            }   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Filters'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant theme--light')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Filters' drawer", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]", "no_jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Filter drawer Title", "xpath", "//div[contains(@class, 'H5-Primary-Left pa-3')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Filter List Title", "xpath", "//span[contains(@class, 'Body-1-Secondary-Left')]", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Filters Titles count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Unit Filter (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                    if (FAIL) { return;} 
            }    
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Filters Checks count", e1,"xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); T.Element_Click("Select Unit (index " + i + ")", L1.get(i), "no_jira");
                if (FAIL) { return;} 
            }        
        _t++; Thread.sleep((long) sleep); T.Click_out_of_Visible_Element("Filter drawer Close", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]",  "Left",-100, 0, "no_jira");
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Selected Units count", e1,"xpath", "//span[contains(@class, 'v-chip__content')]", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Attribute("Selected Unit (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;} 
            }
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}         
        //Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                _t++; Thread.sleep((long) sleep); T.File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, "no_jira");
                    if (FAIL) { return;}                 
            }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Configuration' text", "xpath", "//button[contains(@type, 'submit')]", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//button[contains(@type, 'submit')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Page_URL("Sales Config URL", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.List_L0("Config Sections count", "xpath", "//span[contains(@class, 'H5-Primary-Left')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Section Title (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Search...' ", "Search Emails", true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            //if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Add recipient' Text", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add recipient'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Add recipient' Title", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Select 'Units...' note", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Search...' ", "Search Units", true, "no_jira");   
            if (FAIL) { return;}     
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", "no_jira");
            if (FAIL) { return;}              
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'E-mail' text", "xpath", "//label[contains(@class, 'v-label theme--light error--text')]", "no_jira"); 
//            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Required' text", "xpath", "//div[contains(@class, 'v-messages__message')]", "no_jira"); 
            if (FAIL) { return;}

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "sda", "no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Error'...' ", "xpath", "//div[contains(@class, 'v-messages__message')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", "no_jira");
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", "no_jira");
            if (FAIL) { return;}    

        _t++; T.Clickable_Element_By_Path_Click("Add... 'Save' click", "xpath", "//*[contains(text(), 'save')]","no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            //if (FAIL) { return;}
            int EMAILS_COUNT = L0.size();
            for (int i = 0; i < EMAILS_COUNT; i++) {
                _t++; T.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }            

        _t++; T.Clickable_Element_By_Path_Click("Configuration 'Save' click", "xpath", "//*[contains(text(), 'Save')]","no_jira");
            if (FAIL) { return;}  // ========== Save All
            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}            
        _t++; T.Refresh("Refresh after Add E-mail", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}            

        _t++; Thread.sleep((long) sleep); T.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            } 
        if(EMAILS_COUNT < L0.size()) {
            _t++;
            _f++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Not Saved" + "\t" + "FAIL" + "\t" + "Sales report - Add Recipient - not saved";  F += _t + " > " + "Sales report - Add Recipient - not saved";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }  else{
            _t++;
            _p++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Saved" + "\t" + "PASS" + "\t" + " - ";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";            
        }
        // Sales Distribusion entries:
         _t++; Thread.sleep((long) sleep); T.List_L0("Sales Distribution Items count", "xpath", "//div[contains(@class, 'layout align-content-center')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Item (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                    if (FAIL) { return;} 
                _t++; T.Element_Child_Attribute("Input 'Start Time' state", L0.get(i), "css", "[aria-label='Start Time']", "disabled", "no_jira");   
                    if (FAIL) { return;}
                _t++; T.Element_Child_Attribute("Input 'End Time' state", L0.get(i), "css", "[aria-label='End Time']", "disabled", "no_jira");   
                    if (FAIL) { return;}
            }       
    }   
} 
