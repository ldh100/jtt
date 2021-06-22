package AP3_New;

import java.io.File;
import java.time.LocalDateTime;

/**
 *
 * @author Oleg.Spozito
 */

class AP3_sales_reporting extends AP3_GUI{
    protected AP3_sales_reporting (AP3_GUI a) throws Exception {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        New_ID = a.New_ID;
        app = a.app;
        appId = a.appId;
        SITE = a.SITE;
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        DH_MENU_ID = a.DH_MENU_ID;
        SECTOR = a.SECTOR;
        CompanyID = a.CompanyID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    String API_Response_Body = "";
    protected void run() throws Exception {

        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");            
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,  ParentTest,"no_jira");             
            if (FAIL) { return;}
            
//        Navigate_to_URL("Navigate to 'Sales Reporting'", url + "/#/reports","no_jira");             
//            if (FAIL) { return;}                    
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Thread.sleep(500); 
        Page_URL("Sales Reporting page URL", ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}                    
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira");
            if (FAIL) { return;}         
        Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light menuable__content__active
        Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                    
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Application Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");            
                if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
        Element_Click("Select 'All'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);             
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}              
         Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
           if (FAIL) { return;}          
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}         
                  
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");            
                if (FAIL) { return;}
            }        
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");            
                if (FAIL) { return;}
            }   
//        To_Bottom("no_jira");             
//            if (FAIL) { return;}  
//         Thread.sleep(500);  
        Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira");       
                if (FAIL) { return;}        
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}         
        Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira");
            if (FAIL) { return;}  
            
        Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                      
        Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                    
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  ParentTest, "no_jira");             
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
        Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}    
        Thread.sleep(500);                        
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
            
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");            
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");            
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");            
                if (FAIL) { return;}        
            } 
        To_Top("Scroll to Page Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");            
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("EOD Report Click", "xpath", "//button[contains(@class, 'Subtitle-1-Primary-Left v-btn')]", ParentTest, "no_jira");
            if (FAIL) { return;}             
        Element_E1_Find("Find 'Unit' list", "xpath", "//div[contains(@class, 'px-2 py-2 v-card v-sheet theme--light')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Unit list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                    
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Unit Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");        
                if (FAIL) { return;}
        }                       
        Element_By_Path_Text("Download...", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Units/Cost...", "xpath", "//span[contains(@class, 'H6-Secondary-Left')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Select...", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Find_Text("Find 'Download' text", "DOWNLOAD", true, ParentTest, "no_jira");
            if (FAIL) { return; }
         Find_Text("Find 'Cancel' text", "CANCEL", true, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'CANCEL')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);     
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", ParentTest, "no_jira");
            if (FAIL) { return;} 

        // ============== Default Date
        Element_By_Path_Text("Default Report Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Thread.sleep(500);          
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;} 
         Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", ParentTest, "no_jira");                                    
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");        
                if (FAIL) { return;}
            }           

        List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", ParentTest, "no_jira");        
                    if (FAIL) { return;}
                Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]", ParentTest, "no_jira");         
                    if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    List_TR_THs("Summary (index " + i + ") eod-table Headers", L1.get(j), ParentTest, "no_jira");        
                        if (FAIL) { return;}
                    Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr", ParentTest, "no_jira");         
                        if (FAIL) { return;}
                        for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k = 0 - th header
                            List_TR_TDs("eod-table Data (index " + k + ") ", L2.get(k), ParentTest, "no_jira");        
                            if (FAIL) { return;} 
                        }
                    } 
                }
        Element_By_Path_Text("Export...", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Filters...", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant')]", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Thread.sleep(500);          
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}         
        File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, ParentTest, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, ParentTest, "no_jira");
                    if (FAIL) { return;}                 
            }
            
        // ============== Date Range
        Element_By_Path_Click("Click 'Report Date' open", "xpath", "//input[@aria-label='Report Date']", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Thread.sleep(500);    
        Element_By_Path_Click("Click 'Month Back' chevron", "xpath", "//i[contains(@class,'v-icon mdi mdi-chevron-left theme--light')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);    
        Element_By_Path_Click("Click Day 1", "xpath", "//div[text()='" + 1 + "']", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);    
        Element_By_Path_Text("Selected Date Range", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                 
        Element_By_Path_Click("Click 'Report Date' close", "xpath", "//input[@aria-label='Report Date']", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Wait_For_Element_By_Path_Presence("Wait for Date(s) update..", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Attribute("Tab 1 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Tab 2 Text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;} 

        Element_E1_Find("Find 'Reading' card", "xpath", "//div[contains(@class, 'layout wrap justify-space-between px-4')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Readings elements", e1,"xpath", ".//div[contains(@class,'flex shrink')]", ParentTest, "no_jira");                                    
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Reaging (index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");        
                if (FAIL) { return;}
            }           

        List_L0("Summary cards count", "xpath", "//div[contains(@class,'pt-4 pb-4')]", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Child_Attribute("Summary (index " + i + ") Title >>>>", L0.get(i), "xpath", ".//div[contains(@class,'H6-Secondary')]", "textContent", ParentTest, "no_jira");        
                if (FAIL) { return;}
                Element_Child_List_L1("Find Summary (index " + i + ") eod-table", L0.get(i), "xpath", ".//table[contains(@class,'eod-table')]", ParentTest, "no_jira");         
                if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {
                    List_TR_THs("Summary (index " + i + ") eod-table Headers", L1.get(j), ParentTest, "no_jira");        
                    if (FAIL) { return;}
                    Element_Child_List_L2("Summary (index " + i + ") data rows count", L1.get(j), "tagName", "tr", ParentTest, "no_jira");         
                    if (FAIL) { return;}
                    for (int k = 1; k < L2.size(); k++) { // =========   k = 1 >>> skip k =0 - th header
                        List_TR_TDs("eod-table Data (index " + k + ") ", L2.get(k), ParentTest, "no_jira");        
                        if (FAIL) { return;} 
                    }
                } 
            }   
        Element_By_Path_Click("Click 'Filters'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-filter-variant theme--light')]", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_E1_Find("Find 'Filters' drawer", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        Element_By_Path_Text("Filter drawer Title", "xpath", "//div[contains(@class, 'H5-Primary-Left pa-3')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text("Filter List Title", "xpath", "//span[contains(@class, 'Body-1-Secondary-Left')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Element_Child_List_L1("Filters Titles count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                    
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Unit Filter (index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");        
                    if (FAIL) { return;} 
            }    
        Element_Child_List_L1("Filters Checks count", e1,"xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira");                                    
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Click("Select Unit (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return;} 
            }        
        Click_out_of_Element_By_Path("Filter drawer Close", "xpath", "//aside[contains(@class, 'v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open')]",  "Left",-100, 0, ParentTest, "no_jira");
        if (FAIL) { return;} 
        Element_Child_List_L1("Selected Units count", e1,"xpath", "//span[contains(@class, 'v-chip__content')]", ParentTest, "no_jira");                                    
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Selected Unit (index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");        
                if (FAIL) { return;} 
            }
            
        Element_By_Path_Click("Click 'Export'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}       
        Thread.sleep(500);       
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}         
        File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", SITE, ParentTest, "no_jira");
            if (FAIL) { return;} 
            if(!"".equals(t)){
                File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", t, ParentTest, "no_jira");
                    if (FAIL) { return;}                 
            }
        Element_By_Path_Attribute("Find 'Configuration' text", "xpath", "//button[contains(@type, 'submit')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Configuration'", "xpath", "//button[contains(@type, 'submit')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Page_URL("Sales Config URL", ParentTest, "no_jira");
            if (FAIL) { return;}              
        List_L0("Config Sections count", "xpath", "//span[contains(@class, 'H5-Primary-Left')]", ParentTest, "no_jira");            
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Section Title (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
                if (FAIL) { return;}      
            }
        Find_Text("Find 'Search...' ", "Search Emails", true, ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", ParentTest, "no_jira");            
            //if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
                if (FAIL) { return;}      
            }            
        Element_By_Path_Attribute("Find 'Add E-mail' Text", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Add E-Mail'", "xpath", "//i[contains(@class, 'v-icon mdi mdi-plus theme--light')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text("Find 'Add recipient' Title", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Select 'Units...' note", "xpath", "//div[contains(@class, 'Body-1-Black-High-Emphasis-Left')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' ", "Search Units", true, ParentTest, "no_jira");  
            if (FAIL) { return;}     
            
        Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", ParentTest, "no_jira");
            if (FAIL) { return;}             
        Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", ParentTest, "no_jira");
            if (FAIL) { return;}              
        Element_By_Path_Text("Find 'Required' text", "xpath", "//div[contains(@class, 'v-messages__message')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Input 'E-mail' Click", "xpath", "//input[@aria-label='E-mail']", ParentTest, "no_jira");
            if (FAIL) { return;}              
        Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "sda", false, ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text("Find 'Error'...' ", "xpath", "//div[contains(@class, 'v-messages__message')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear 'E-mail", "css", "[aria-label='E-mail']", ParentTest, "no_jira");
            if (FAIL) { return;}              
        Element_By_Path_Text_Enter("Enter 'E-mail", "css", "[aria-label='E-mail']", "ax@ad.com", false, ParentTest, "no_jira");
            if (FAIL) { return;}    

        Element_By_Path_Click("Add... 'Save' click", "xpath", "//*[contains(text(), 'save')]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", ParentTest, "no_jira");            
            int EMAILS_COUNT = L0.size();
            for (int i = 0; i < EMAILS_COUNT; i++) {
                Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
                if (FAIL) { return;}      
            }       

        Element_By_Path_Click("Configuration 'Save' click", "xpath", "//*[contains(text(), 'Save')]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500); 
            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Refresh("Refresh after Add E-mail", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Thread.sleep(500); 
        List_L0("Recipients count", "xpath", "//div[contains(@class, 'layout pa-1 justify-space-between')]", ParentTest, "no_jira");            
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Recipient (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
                if (FAIL) { return;}      
            } 
        if(EMAILS_COUNT < L0.size()) {
            _t++;
            _f++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Not Saved" + "\t" + "FAIL" + "\t" + "Sales report - Add Recipient - not saved";  F += "Step: " + _t + " > " + "Sales report - Add Recipient - not saved";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }  else{
            _t++;
            _p++;
            EX += _t + "\t" + "Sales report" + "\t" + "Add Recipient" + "\t" + "Saved" + "\t" + "PASS" + "\t" + " - ";
            EX += "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";            
        }
        // Sales Distribusion entries:
        Find_Text("Find 'Sales Distribution' title", "Sales Distribution", true, ParentTest, "no_jira");  
            if (FAIL) { return;}  
        List_L0("Meal Periods count", "xpath", "//span[contains(@class, 'Subtitle-2-Black-High-Emphasis-Left')]", ParentTest, "no_jira");            
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Meal Period (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
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
         List_L0("Sales Distribution Rows count", "xpath", "//div[contains(@class, 'layout align-content-center')]", ParentTest, "no_jira");            
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Item (index " + i + ")", L0.get(i), "textContent", ParentTest, "no_jira");       
                    if (FAIL) { return;} 
                Element_Child_Attribute("Input 'Start Time' state", L0.get(i), "css", "[aria-label='Start Time']", "disabled", ParentTest, "no_jira");  
                    if (FAIL) { return;}
                Element_Child_Attribute("Input 'End Time' state", L0.get(i), "css", "[aria-label='End Time']", "disabled", ParentTest, "no_jira");  
                    if (FAIL) { return;}
            }   
    }
}
