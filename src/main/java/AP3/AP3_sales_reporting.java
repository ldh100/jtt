/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
import java.io.File;
import java.time.LocalDateTime;

/**
 *
 * @author Oleg.Spozito
 */
public class AP3_sales_reporting {

    public static void run() throws InterruptedException {
         _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
            
//        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to 'Sales Reporting'", url + "/#/reports","no_jira");             
//            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Sales Reporting page URL", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light menuable__content__active
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}              
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
           if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
                  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Sortable Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                _t++; TWeb.Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", "no_jira");             
                if (FAIL) { return;}
            }   
//        _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");             
//            if (FAIL) { return;}  
//         Thread.sleep(500);  
        _t++; TWeb.Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", "no_jira");        
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
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}    
        Thread.sleep(500);                        
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            if (ALL_DATA)  {
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                _t++; TWeb.Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), "no_jira");             
                if (FAIL) { return;}        
            } 
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("EOD Report Click", "xpath", "//button[contains(@class, 'Subtitle-1-Primary-Left v-btn')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Unit' list", "xpath", "//div[contains(@class, 'px-2 py-2 v-card v-sheet theme--light')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Unit list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Unit Name (index " + i + ")", L1.get(i),  "no_jira");         
                if (FAIL) { return;}
        }                       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Download...", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Units/Cost...", "xpath", "//span[contains(@class, 'H6-Secondary-Left')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Select...", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", "no_jira"); 
            if (FAIL) { return;}     
        _t++; TWeb.Find_Text("Find 'Download' text", "DOWNLOAD", true,"no_jira");
            if (FAIL) { return; }
         _t++; TWeb.Find_Text("Find 'Cancel' text", "CANCEL", true,"no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'CANCEL')]", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);     
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;} 

        // ============== Default Date
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Default Report Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}     
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;}
            }           

        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", "no_jira");         
                    if (FAIL) { return;}
                _t++; TWeb.Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]","no_jira");         
                    if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    _t++; TWeb.List_TR_THs("Summary (index " + i + ") eod-table Headers", L1, j, "no_jira");         
                        if (FAIL) { return;}
                    _t++; TWeb.Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr","no_jira");         
                        if (FAIL) { return;}
                        for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k = 0 - th header
                            _t++; TWeb.List_TR_TDs("eod-table Data (index " + k + ") ", L2, k, "no_jira");         
                            if (FAIL) { return;} 
                        }
                    } 
                }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Export...", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Filters...", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant')]", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}    
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                _t++; Thread.sleep((long) sleep); TWeb.File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, "no_jira");
                    if (FAIL) { return;}                 
            }
            
        // ============== Date Range
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}     
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Month Back' chevron", "xpath", "//i[contains(@class,'v-icon mdi mdi-chevron-left theme--light')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Day 1", "xpath", "//div[text()='" + 1 + "']", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Selected Date Range", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;}                 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira"); 
            if (FAIL) { return;} 

        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;}
            }           

        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", "no_jira");         
                if (FAIL) { return;}
                _t++; TWeb.Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]","no_jira");         
                if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    _t++; TWeb.List_TR_THs("Summary (index " + i + ") eod-table Headers", L1, j, "no_jira");         
                    if (FAIL) { return;}
                    _t++; TWeb.Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr","no_jira");         
                    if (FAIL) { return;}
                    for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k =0 - th header
                        _t++; TWeb.List_TR_TDs("eod-table Data (index " + k + ") ", L2, k, "no_jira");         
                        if (FAIL) { return;} 
                    }
                } 
            }   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Filters'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant theme--light')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Filters' drawer", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]", "no_jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Filter drawer Title", "xpath", "//div[contains(@class, 'H5-Primary-Left pa-3')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Filter List Title", "xpath", "//span[contains(@class, 'Body-1-Secondary-Left')]", "no_jira"); 
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Filters Titles count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Unit Filter (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                    if (FAIL) { return;} 
            }    
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Filters Checks count", e1,"xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Unit (index " + i + ")", L1.get(i), "no_jira");
                if (FAIL) { return;} 
            }        
        _t++; Thread.sleep((long) sleep); TWeb.Click_out_of_Element_By_Path("Filter drawer Close", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]",  "Left",-100, 0, "no_jira");
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Selected Units count", e1,"xpath", "//span[contains(@class, 'v-chip__content')]", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Attribute("Selected Unit (index " + i + ")", L1.get(i), "textContent", "no_jira");         
                if (FAIL) { return;} 
            }
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira"); 
            if (FAIL) { return;}       
        Thread.sleep(500);       
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                _t++; Thread.sleep((long) sleep); TWeb.File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, "no_jira");
                    if (FAIL) { return;}                 
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Find 'Configuration' text", "xpath", "//button[contains(@type, 'submit')]", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Configuration'", "xpath", "//button[contains(@type, 'submit')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Sales Config URL", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Config Sections count", "xpath", "//span[contains(@class, 'H5-Primary-Left')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Section Title (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Search...' ", "Search Emails", true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            //if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Find 'Add E-mail' Text", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Add E-Mail'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Find 'Add recipient' Title", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Select 'Units...' note", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Search...' ", "Search Units", true, "no_jira");   
            if (FAIL) { return;}     
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", false, "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", "no_jira");
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Find 'Required' text", "xpath", "//div[contains(@class, 'v-messages__message')]", "no_jira"); 
            if (FAIL) { return;}

        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "sda", false, "no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Find 'Error'...' ", "xpath", "//div[contains(@class, 'v-messages__message')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", "no_jira");
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", false, "no_jira");
            if (FAIL) { return;}    

        _t++; TWeb.Element_By_Path_Click("Add... 'Save' click", "xpath", "//*[contains(text(), 'save')]","no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            int EMAILS_COUNT = L0.size();
            for (int i = 0; i < EMAILS_COUNT; i++) {
                _t++; TWeb.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            }       

        _t++; TWeb.Element_By_Path_Click("Configuration 'Save' click", "xpath", "//*[contains(text(), 'Save')]","no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500); 
            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}            
        _t++; TWeb.Refresh("Refresh after Add E-mail", "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}            
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            } 
        if(EMAILS_COUNT < L0.size()) {
            _t++;
            _f++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Not Saved" + "\t" + "FAIL" + "\t" + "Sales report - Add Recipient - not saved";  F += "Step: " + _t + " > " + "Sales report - Add Recipient - not saved";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }  else{
            _t++;
            _p++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Saved" + "\t" + "PASS" + "\t" + " - ";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";            
        }
        // Sales Distribusion entries:
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Sales Distribution' title", "Sales Distribution", true, "no_jira");   
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Meal Periods count", "xpath", "//span[contains(@class, 'Subtitle-2-Black-High-Emphasis-Left')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Meal Period (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                if (FAIL) { return;}      
            } // ^^^^ Defined in Site Private config    >>>> 
            //https://api.compassdigital.org/staging/config/E2KQEqpAwecJ7zD6aa7oCZLDEl9djMFDP  >>
            //  "meal_periods": [
            //    {
            //      "label": "Breakfast",
            //      "start": "00:00",
            //      "end": "10:59"
            //    },
            //    {
            //      "label": "Lunch",
            //      "start": "11:00",
            //      "end": "14:59"
            //    },
            //    {
            //      "label": "Dinner",
            //      "start": "15:00",
            //      "end": "23:59"
            //    }
            //  ]            
         _t++; Thread.sleep((long) sleep); TWeb.List_L0("Sales Distribution Rows count", "xpath", "//div[contains(@class, 'layout align-content-center')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Item (index " + i + ")", L0.get(i), "textContent", "no_jira");        
                    if (FAIL) { return;} 
                _t++; TWeb.Element_Child_Attribute("Input 'Start Time' state", L0.get(i), "css", "[aria-label='Start Time']", "disabled", "no_jira");   
                    if (FAIL) { return;}
                _t++; TWeb.Element_Child_Attribute("Input 'End Time' state", L0.get(i), "css", "[aria-label='End Time']", "disabled", "no_jira");   
                    if (FAIL) { return;}
            }       
        String storeBusinessUnit="";
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Click("Drawer > Sites Click", "xpath", "//div[contains(text(),'Sites')]", "no_jira");
        if (FAIL) {
            return;
        }
        _t++;
        Thread.sleep(200);
        TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, "no_jira");
        if (FAIL) {
            return;
        }
        _t++;
        TWeb.Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        System.err.println(t);
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open drop-down for On Site Product selection", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", " //div[@class='v-select-list v-card theme--light']/div[1]/div[1]/a[1]/div[1]/div[1] [contains(text(),'All')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
      }
        //This portion of code will exicute if On site product = "All"
        if (t.equals("All")) {
                _t++;

                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
                if (FAIL) {
                    return;
                }
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Get Site name after search result", "xpath", "/html[1]/body[1]/div[1]/div[33]/main[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]", "no_jira");
                if (FAIL) {
                    return;
                }

                if (t.isEmpty() && t.equals("")) {
                    System.err.println("Selected site from JTT not found in site list");
                } else if (t.equals(SITE)) {
                
               
                Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", "no_jira");
                TWeb.Element_By_Path_Text("Get Business Unit search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", "no_jira");
                System.err.println("ss"+t);
                storeBusinessUnit=t.toString();
                    
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']", "No Jira");
                 if (FAIL) {return;}
                }
                
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Validate selected site header", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", "no_jira");
                if (FAIL) {
                    return;
                }

                _t++;
                Thread.sleep((long) sleep);
                TWeb.List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", "no_jira");
               
                //Validate if all Stations are hidden in application
                for (int row = 1; row <= L0.size(); row++) {
                    _t++; Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Attribute("Visibility Status", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr["+row+"]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", "no_jira");
                    if (FAIL) {return;} System.err.println("Css class"+t);
                   if(t.trim().equals("v-icon mdi mdi-eye theme--light")){
                       System.out.println("Skipped");
                        _t++;Thread.sleep((long) sleep);
                        TWeb.Element_By_Path_Click("Hide in App", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr["+row+"]/td[6]//div[@class='v-input__control']", "no_jira");
                   }
                }     
              _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
             if (FAIL) { return;} 
              _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
             if (FAIL) { return;} 
            _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}                    
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
              if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}    
            }  
         _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        System.err.println(t);
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open drop-down for On Site Product selection", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list theme--light']//div[contains(text(),'All')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
      }
           if (t.equals("All")) {
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
                if (FAIL) {
                    return;
                }
                
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", "no_jira");
                      
               
                if(t.equals(SITE)) {
                    
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
                TWeb.Element_By_Path_Click("Click on selected site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
                if (FAIL) {
                    return;
                }       
                   
                
                
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-card v-card--flat v-sheet theme--light']//div[1][@class='H6-Selected-On-Surface-Medium-Emphasis-Center']", "no_jira");
                TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//body/div[@id='operator']/div[@class='application--wrap']/main[@class='v-content admin_content']/div[@class='v-content__wrap']/div[@class='container grid-list-xl']/div[@class='layout']/div[@class='flex xs12']/div[@class='v-tabs']/div[@class='v-window']/div[@class='v-window__container']/div[1]/div[1]/div[2]", "no_jira");
                    System.err.println("No da"+t);
                  if (FAIL) {
                    return;
                } 
                
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", "no_jira");
                TWeb.Element_By_Path_Click("Click on selected site", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", "no_jira");
                if (FAIL) {return;}   
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Filter drawer should visible", "xpath", "//*[@class='v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open v-navigation-drawer--right v-navigation-drawer--temporary theme--light']", "no_jira");
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
                TWeb.Element_By_Path_Text("Copy Business Unit number", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
                    System.err.println(t.replace("Unit ", ""));
                    
                if(storeBusinessUnit.equals(t.replace("Unit ", "")))
                {
                   
                 _t++; Thread.sleep(200);
                TWeb.Element_By_Path_Click("Select Business Unit", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
               Thread.sleep(200); 
                if (FAIL) { 
                 TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
                 TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
                }
                
                _t++; Thread.sleep(200); 
                TWeb.Element_By_Path_Click("Click outside drawer", "xpath", "//*[@class='v-overlay v-overlay--active']", "no_jira");
                if (FAIL) { return;}
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-card v-card--flat v-sheet theme--light']//div[1][@class='H6-Selected-On-Surface-Medium-Emphasis-Center']", "no_jira");
                TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//body/div[@id='operator']/div[@class='application--wrap']/main[@class='v-content admin_content']/div[@class='v-content__wrap']/div[@class='container grid-list-xl']/div[@class='layout']/div[@class='flex xs12']/div[@class='v-tabs']/div[@class='v-window']/div[@class='v-window__container']/div[1]/div[1]/div[2]", "no_jira");
                    System.err.println("No da"+t);
                if (FAIL) {   
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Check if report is available", "No reports available for selected units", true,"no_jira");
                }
                
                if(t.equals("No reports available for selected units"))
                {
                    
                }
                }
                
                if (FAIL) {return;}
                
                
                } else{
                   System.err.println("Selected site from JTT not found in site list");
                }
            
                   
                } else{
                   System.err.println("Site header don not matches with selected site");
                }
           

    }
}
