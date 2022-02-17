package AP3;

import java.time.LocalDateTime;
import java.util.Date;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

class AP3_site extends AP3_GUI{
    protected AP3_site (AP3_GUI a) {
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
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        COUNTRY = a.COUNTRY;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    protected void run() { 
    String API_Response_Body = "";
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}          
        Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}    
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Page_URL("Sites page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;}      
          
        // <editor-fold defaultstate="collapsed" desc="SITEs List > Sorts">    
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}          
        Element_By_Path_Text("Button 'Add new...' Text ", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Application Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");             
                if(t.contains("All")){ 
                    T_Index = i; 
                }
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
        }        
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");             
                if (FAIL) { return;}
            }        
        To_Bottom("Scroll to page Bottom", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }            
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
        // ============  Sites Sorting
        To_Top("Scroll to page Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Click("Site Name Sort Click", L1.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");                   
            }
        Element_Click("Site Name Sort Click", L1.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");                   
            }       
        Element_Click("Country Sort Click", L1.get(1), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");        
                if (FAIL) { return;}
            }
         List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");                  
            }
        Element_Click("Country Sort Click", L1.get(1), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");         
                if (FAIL) { return;}
            }
         List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");              
            }       
        Element_Click("City Sort Click", L1.get(2), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");           
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
            }
     
        Element_Click("Platform Sort Click", L1.get(3), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");            
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");                 
            }
       
        Element_Click("Type of KDS Sort Click", L1.get(4), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");           
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");                  
            }      
            
        Element_Click("Unit # Click", L1.get(5), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");           
                if (FAIL) { return;}
            }
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");                   
            }                          
         // ============ All Sites
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
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
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
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");                  
            } 
        To_Top("Scroll to page Top", ParentTest, "no_jira");
            if (FAIL) { return;}   
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_Click("Site Name Sort Click", L1.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");          
                if (FAIL) { return;}
            } 
        // </editor-fold>        
         
        // <editor-fold defaultstate="collapsed" desc="SITE Search > Brand List">
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
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
                //if (FAIL) { return;}
            } 
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Site Address text", "xpath", "//div[contains(@class, 'timezone-address')][1]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
//        Element_By_Path_Text("Site Timezone text", "xpath", "//div[contains(@class, 'timezone-address')][2]", ParentTest, "no_jira"); 
//            if (FAIL) { return;}    
            if(!"empty".equals(t) && t.contains(" ")) {
                TZone = t.substring(t.indexOf(" ")).trim();// ===================================
            } else{
                TZone = "NotFound";
            }
        Element_By_Path_Text("Site Station List text", "xpath", "//div[contains(@class, 'H6-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Element_By_Path_Text("Site Configuration text", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}                                                                                         
        List_L0("Sites Unit(s) Count", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Child_Attribute("Brand Name", L0.get(i), "xpath", ".//h3[contains(@class, 'brand-name')]", "textContent", ParentTest, "no_jira");   
                    if (FAIL) { return;}
                Element_Child_Attribute("Brand Unit", L0.get(i), "xpath", ".//h4[contains(@class, 'Brand-Unit')]", "textContent", ParentTest, "no_jira");   
                    if (FAIL) { return;}
                Element_Child_List_L1("Unit Stations Count", L0.get(i), "tagName", "tr", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    for (int j = 2; j < L1.size(); j++) {  // L1 > L0 inner table >>>>>>>>>>>>   0 > 2 skip empty rows
                        List_TR_TDs("Station " + (j -1), L1.get(j), ParentTest, "no_jira");      
                    }
            } 
        // </editor-fold> 
          
        // <editor-fold defaultstate="collapsed" desc="Training Video">
        Element_By_Path_Click("Training Video Icon Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-help-circle')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Thread.sleep(500);               
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Swith_to_Frame("Switch to Video Player", "tagName", "iframe", ParentTest, "no_jira");// iframe src="https://player.vimeo.com/video/412472158"
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for Player load", "className", "play-icon", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Attribute("Video Title", "xpath", "//header[contains(@class, 'vp-title-header')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Play Click", "className", "play-icon", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(1000);
        Swith_to_Frame("Back to default frame", "defaultContent", "N/A", ParentTest, "no_jira");
            if (FAIL) { return;}      
        Element_By_Path_Click("Video Player Close Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-close')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Site Congiguration">
        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        List_L0("Site Configuration sections Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L0.size(); i++) {
            switch (i) {
                case 0:
                    Element_Text("Location Details section Name", L0.get(i), ParentTest, "no_jira");             
                    Element_Click("Location Details Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Location Details' text", "Location Details", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Location Name' text", "Location Name", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Address' text", "Address", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Country' text", "Country", true, ParentTest, "no_jira"); 

                    Find_Text("Find 'State' text", "State", true, ParentTest, "no_jira");                       
                    if(COUNTRY.toLowerCase().contains("ca")){
                        Find_Text("Find 'Postal Code' text", "Postal Code", true, ParentTest, "no_jira"); 
                    } else {
                        Find_Text("Find 'Zip Code' text", "Zip Code", true, ParentTest, "no_jira"); 
                    }  
                    Find_Text("Find 'City' text", "City", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true, ParentTest, "no_jira"); 
                    break;
                case 1:
                    Element_Text("Payment section", L0.get(i), ParentTest, "no_jira");             
                    Element_Click("Payment Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Payment ID' text", "Payment ID", true, ParentTest, "no_jira");                       
                    Find_Text("Find 'Payment Type' text", "Payment Type", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Refunds Accepted' text", "Refunds Accepted?", true, ParentTest, "no_jira"); 
                    break;
                case 2:
                    Element_Text("Mealplan section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Mealplan Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Meal Plan' text", "Meal Plan", true, ParentTest, "no_jira"); 
                      break;
                case 3:
                    Element_Text("Loyalty section", L0.get(i), ParentTest, "no_jira");             
                    Element_Click("Loyalty Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Loyalty Program' text", "Loyalty Program", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'not enabled' text", "Loyalty is not enabled for this brand", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'to enable' text", "Would you like to enable Loyalty?", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Yes' text", "Yes", true, ParentTest, "no_jira"); 
//                  Find_Text("Find 'No' text", "No", ParentTest, "no_jira"); 
//                      if (FAIL) { return;}
                   break;
                case 4:
                    Element_Text("Promotion section", L0.get(i), ParentTest, "no_jira");             
                    Element_Click("Click 'Promotion Info'", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Promotions' text", "Promotions", true, ParentTest, "no_jira"); 
                    List_L1("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                        }
                case 5:
                    Element_Text("KDS section", L0.get(i), ParentTest, "no_jira"); 
                    Find_Text("Find 'KDS Configuration' text", "KDS Configuration", true, ParentTest, "no_jira");             

                    break;
                case 6:
                    Element_Text("Delievery Drop-off section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break;
                case 7:
                    Element_Text("APEX section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break;
                case 8:
                    Element_Text("Frictionless section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break; 
               default:
                    break;
            }
        } 
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Dropp-Off Locations - ALL">

        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Delivery Drop-off Locations Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        

        Wait_For_Element_By_Path_Presence("Check 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move to 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        // <editor-fold defaultstate="collapsed" desc="Create Drop-off Modal">
        Move_to_Element_By_Path("Move > 'Create Drop-off Location' button", "xpath", "//*[contains(text(),'CREATE DROP-OFF LOCATION')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Create Drop-off Location' button", "xpath", "//*[contains(text(),'CREATE DROP-OFF LOCATION')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Create Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // test Location Name Field - Begin
        Move_to_Element_By_Path("Move > 'Location Name' field", "xpath", "(//*[contains(text(),'Location Name')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[contains(text(),'Location Name')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for '80 characters max' validation message", "xpath", "//*[contains(text(),'80 characters max')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > out of 'Location Name'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Location name is required' message", "xpath", "//*[contains(text(),'Location name is required')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//input[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        for (int i = 1; i < 82; i++) {
            Element_By_Path_Text_Enter("Try entering a Location Name with greater than 80 characters", "xpath","(//input[@aria-label='Location Name'])[1]", "a", false, ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        Element_By_Path_Attribute("Get value in 'Location Name' field", "xpath", "(//input[@aria-label='Location Name'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (t.length() == 80) {
            _t++;
            _p++; EX += _t + "\t" + "Check value is not longer than 80 characters" + "\t" + "-" + "\t" + "value length = " + t.length() + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", "value length = " + t.length(), false, ParentTest.createNode(_t + ". " + "Check value is not longer than 80 characters"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check value is not longer than 80 characters" + "\t" + "-" + "\t" + "value length = " + t.length() + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "value length = " + t.length(), true, ParentTest.createNode(_t + ". " + "Check value is not longer than 80 characters"), new Date());
        }
        // test Location Name Field - End
        
        // test Foodlocker toggle - Begin
        Move_to_Element_By_Path("Move > 'APEX Foodlocker' toggle", "xpath", "//*[contains(text(),'Is this an APEX Foodlocker')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Foodlocker' toggle is set to 'No' by default", "xpath", "(//*[@class='Option-Right-Selected-Blue-White'])[1]/div[contains(text(),'No')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Set > 'Foodlocker' toggle to 'Yes'", "xpath", "(//*[@class='Option-Left-Not-Selected-Blue-White'])[1]/div[contains(text(),'Yes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Foodlocker' toggle is set to 'Yes'", "xpath", "(//*[@class='Option-Left-Selected-Blue-White'])[1]/div[contains(text(),'Yes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // test Foodlocker toggle - End
        
        // test Address/Country/State/Zip code Fields - Begin
        Move_to_Element_By_Path("Move > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Address' field is in focus", "xpath", "(//*[@aria-label='Address'])[1]/ancestor::div[contains(@class,'--is-focused')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > out of 'Address'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Location address is required' message", "xpath", "//*[contains(text(),'Address is required')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Country' field", "xpath", "(//input[@aria-label='Country'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for dd list of 'countries'", "xpath", "(//div[contains(text(),'United States')]//ancestor::div[contains(@class,'v-menu__content')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L0("List of countries", "xpath", "(//div[contains(text(),'United States')]//ancestor::div[contains(@class,'v-menu__content')])[1]//a", ParentTest, "no_jira");
            if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            if (i == 0) {
                Element_Child_Text("Get country value " + (i+1), e, "xpath", "//div[contains(text(),'Canada')]", ParentTest, "no_jira");
            } else if (i == 1) {
                Element_Child_Text("Get country value " + (i+1), e, "xpath", "//div[contains(text(),'United States')]", ParentTest, "no_jira");
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Country list field to load as expected" + "\t" + "-" + "\t" + "Country list size = " + L0.size() + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", "Country list size = " + L0.size(), true, ParentTest.createNode(_t + ". " + "Country list field to load as expected"), new Date());
            }
        }

        Element_By_Path_Click("Click > 'City' field", "xpath", "(//input[@aria-label='City'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'City' field is focused", "xpath", "(//input[@aria-label='City'])[1]/ancestor::div[contains(@class,'v-input--is-focused')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > out of 'City'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'City is required' message", "xpath", "//*[contains(text(),'City is required')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        if (COUNTRY.toUpperCase().startsWith("US")) {
            Element_By_Path_Click("Click > 'Zip Code' field", "xpath", "(//input[@aria-label='Zip Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Check > 'Zip Code' field is focused", "xpath", "(//input[@aria-label='Zip Code'])[1]/ancestor::div[contains(@class,'v-input--is-focused')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > out of 'Zip Code'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Zip Code is required' message", "xpath", "//*[contains(text(),'Zip Code is required')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'State' field", "xpath", "(//input[@aria-label='State'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Check > 'State' field is focused", "xpath", "(//input[@aria-label='State'])[1]/ancestor::div[contains(@class,'v-input--is-focused')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > out of 'State'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'State is required' message", "xpath", "//*[contains(text(),'State is required')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'State' field", "xpath", "(//input[@aria-label='State'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'State' dd list", "xpath", "//div[contains(@class,'menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L1("Get list of States", "xpath", "//div[contains(@class,'menuable__content__active')]//a", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
        } else {
            Element_By_Path_Click("Click > 'Postal Code' field", "xpath", "(//input[@aria-label='Postal Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Check > 'Zip Code' field is focused", "xpath", "(//input[@aria-label='Postal Code'])[1]/ancestor::div[contains(@class,'v-input--is-focused')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > out of 'Postal Code'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Postal Code is required' message", "xpath", "//*[contains(text(),'Postal Code is required')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Province' field", "xpath", "(//input[@aria-label='Province'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Check > 'Province' field is focused", "xpath", "(//input[@aria-label='Province'])[1]/ancestor::div[contains(@class,'v-input--is-focused')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > out of 'Province'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Province is required' message", "xpath", "//*[contains(text(),'Province is required')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Province' field", "xpath", "(//input[@aria-label='Province'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Province' dd list", "xpath", "//div[contains(@class,'menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L1("Get list of Province", "xpath", "//div[contains(@class,'menuable__content__active')]//a", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
        }

        if (L1.size() >= 13) { //The list size for Canada should be 13, and for the US it should be greater// US states = 57
            for (int i = 0; i < L1.size(); i++) {
                Actions action = new Actions(d1);
                action.sendKeys(Keys.ARROW_DOWN).perform();                    
                Element_Attribute("Get class value of state in list position " + (i+1) , L1.get(i), "class", ParentTest, "no_jira");
                    if (FAIL) { return;}
                if (t.contains("highlighted")) {
                    _t++;
                    _p++; EX += _t + "\t" + "Check state or province " + (i+1) + " is higlighted" + "\t" + "-" + "\t" + t.contains("highlighted") + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("PASS", String.valueOf(t.contains("highlighted")), false, ParentTest.createNode(_t + ". " + "Check state or province " + (i+1) + " is higlighted"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Check state or province " + (i+1) + " is higlighted" + "\t" + "-" + "\t" + t.contains("highlighted") + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", String.valueOf(t.contains("highlighted")), true, ParentTest.createNode(_t + ". " + "Check state or province " + (i+1) + " is higlighted"), new Date());
                } 
            }
            Thread.sleep(500);
        } else {
            _t++;
            _f++; EX += _t + "\t" + "List of states or provinces failed to load properly" + "\t" + "-" + "\t" + "List size = " + L1.size() + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "List size = " + L1.size(), true, ParentTest.createNode(_t + ". " + "List of states or provinces failed to load properly"), new Date());
        }
        // test Address/Country/State/Zip code Fields - End

        // test Location Information Textarea field - Begin
        Wait_For_Element_By_Path_Presence("Check > 'Location Information (optional)' textarea field", "xpath", "//*[@name='dropOffLocationInformation']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Location Information' max length counter", "xpath", "//*[contains(text(),'0/100')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'This message will appear...' message for 'Location Information'", "xpath", "//p[contains(text(),'This message will appear at checkout and in the order confirmation notification')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        String longerThanMaxString = "ombzzvvtnyjeybojfuxynmfweocmrvypxkkfgyjcvsoetnaraflncloycqcgbppgoeydqwdeosvfqbnprazwrksnaflnbqknnkcnzxohdgmbvygfgremzclp";
        Element_By_Path_Click("Click > 'Location Information (optional)' textarea field", "xpath", "//*[@name='dropOffLocationInformation']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter longer than 100 chracters in 'Location Information' field", "xpath", "//*[@name='dropOffLocationInformation']", longerThanMaxString, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Location Information' max length counter", "xpath", "//*[contains(text(),'100/100')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value in 'Location Information' textarea", "xpath", "//*[@name='dropOffLocationInformation']", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (t.length() == 100) {
            _t++;
            _p++; EX += _t + "\t" + "Check value in 'Location Information' is 100" + "\t" + "-" + "\t" + String.valueOf(t.length()) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(t.length()), false, ParentTest.createNode(_t + ". " + "Check value in 'Location Information' is 100"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check value in 'Location Information' is 100" + "\t" + "-" + "\t" + String.valueOf(t.length()) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(t.length()), false, ParentTest.createNode(_t + ". " + "Check value in 'Location Information' is 100"), new Date());
        }
        // test Location Information Text-area field - End

        // test Address auto-fill - Begin
        Element_By_Path_Click("Click > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "1", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "2", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "3", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for 'Auto-fill' suggestions drop-down", "xpath", "//div[contains(@class,'menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get list of suggestions", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Get value of suggestion " + (i+1), L2.get(i), ParentTest, "no_jira");
            if (t.toLowerCase().contains("123")) {
                _t++;
                _p++; EX += _t + "\t" + "Check value of suggestion contains partial address" + "\t" + " - " + "\t" + String.valueOf(t.toLowerCase().contains("123")) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(t.toLowerCase().contains("123")), false, ParentTest.createNode(_t + ". " + "Check value of suggestion contains partial address"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check value of suggestion contains partial address" + "\t" + "-" + "\t" + String.valueOf(t.toLowerCase().contains("123")) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(t.toLowerCase().contains("123")), true, ParentTest.createNode(_t + ". " + "Check value of suggestion contains partial address"), new Date());
            }
        }
        if (COUNTRY.toUpperCase().startsWith("CA")) {
            Element_By_Path_Input_Select_Clear("Clear > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "3 dund", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "a", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "s", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            List_L2("Get list of suggestions", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        Element_Click("Click > First suggestion for 'Address auto-fill'", L2.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click > 'City'","xpath", "(//input[@aria-label='City'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get auto-filled value of 'City'", "xpath", "(//input[@aria-label='City'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (!t.equals("")) {
            _t++;
            _p++; EX += _t + "\t" + "Check 'City' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.contains("")) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(!t.contains("")), false, ParentTest.createNode(_t + ". " + "Check 'City' was auto-filled"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check 'City' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.contains("")) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(!t.contains("")), true, ParentTest.createNode(_t + ". " + "Check 'City' was auto-filled"), new Date());
        }
        if (COUNTRY.toUpperCase().startsWith("US")) {
            Element_By_Path_Attribute("Get auto-filled value of 'Zip Code'", "xpath", "(//input[@aria-label='Zip Code'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
            if (!t.equals("")) {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Zip Code' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(!t.equals("")), false, ParentTest.createNode(_t + ". " + "Check 'Zip Code' was auto-filled"), new Date());
            } else {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Zip Code' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(!t.equals("")), true, ParentTest.createNode(_t + ". " + "Check 'Zip Code' was auto-filled"), new Date());
            }
            Element_By_Path_Attribute("Get auto-filled value of 'State'", "xpath", "(//input[@aria-label='State'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
            if (!t.equals("")) {
                _t++;
                _p++; EX += _t + "\t" + "Check 'State' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(!t.equals("")), false, ParentTest.createNode(_t + ". " + "Check 'State' was auto-filled"), new Date());
            } else {
                _t++;
                _p++; EX += _t + "\t" + "Check 'State' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(!t.equals("")), true, ParentTest.createNode(_t + ". " + "Check 'State' was auto-filled"), new Date());
            }
        } else {
            Element_By_Path_Attribute("Get auto-filled value of 'Postal Code'", "xpath", "(//input[@aria-label='Postal Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!t.equals("")) {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Postal Code' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(!t.equals("")), false, ParentTest.createNode(_t + ". " + "Check 'Postal Code' was auto-filled"), new Date());
            } else {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Postal Code' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(!t.equals("")), true, ParentTest.createNode(_t + ". " + "Check 'Postal Code' was auto-filled"), new Date());
            }
            Element_By_Path_Attribute("Get auto-filled value of 'Province'", "xpath", "(//input[@aria-label='Province'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!t.equals("")) {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Province' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(!t.equals("")), false, ParentTest.createNode(_t + ". " + "Check 'Province' was auto-filled"), new Date());
            } else {
                _t++;
                _p++; EX += _t + "\t" + "Check 'Province' was auto-filled" + "\t" + "-" + "\t" + String.valueOf(!t.equals("")) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(!t.equals("")), true, ParentTest.createNode(_t + ". " + "Check 'Province' was auto-filled"), new Date());
            }
        }
        // create a Location drop-off with 'Auto-filled' Address
        Move_to_Element_By_Path("Move > 'Location Name' field", "xpath", "(//*[contains(text(),'Location Name')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", "loc auto-filled " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Create Location' button", "xpath", "//*[contains(text(), 'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Create Location' button", "xpath", "//*[contains(text(), 'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for 'Create Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Create Drop-off Location')]", ParentTest, Ver);
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}             
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Delivery Drop-off Locations' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Drop-off Locations')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get List of Locations", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Duplicate/Edit Location">
        // test duplicate/edit location - Begin
        // 1. open edit mode of location
        // 2. store initial values in all fields
        // 3. cancel, then duplicate location
        // 4. verify field values in cloned location
        // 5. edit location
        // 6. verify location was edited
        Wait_For_Element_By_Path_Presence("Wait for presence of Location in table", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
//        Scroll_to_WebElement("Scroll > 'Drop-off Locations' section", "xpath", "//div[@id='drop-off-locations']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//        Thread.sleep(500);
        Move_to_Element_By_Path("Move > Location in table", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Edit > Location ", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]//i[contains(@class,'mdi-pencil')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Edit Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Edit Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Location Name'", "xpath", "(//input[@aria-label='Location Name'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_name_before_clone = t;
        Element_By_Path_Attribute("Get value of 'Address'", "xpath", "(//input[@aria-label='Address'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String addr_before_clone = t;
        Element_By_Path_Attribute("Get value of 'City'", "xpath", "(//input[@aria-label='City'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String city_before_clone = t;
        String stateprovince_before_clone = "";
        String postalzip_before_clone = "";
        if (COUNTRY.toUpperCase().startsWith("US")) {
            Element_By_Path_Attribute("Get value of 'State'", "xpath", "(//input[@aria-label='State'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_before_clone = t;
            Element_By_Path_Attribute("Get value of 'Zip Code'", "xpath", "(//input[@aria-label='Zip Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            postalzip_before_clone = t;
        } else {
            Element_By_Path_Attribute("Get value of 'Province'", "xpath", "(//input[@aria-label='Province'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_before_clone = t;
            Element_By_Path_Attribute("Get value of 'Postal Code'", "xpath", "(//input[@aria-label='Postal Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            postalzip_before_clone = t;
        }
        Element_By_Path_Click("Click > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Location Information'", "xpath", "//*[@name='dropOffLocationInformation']", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_info_before_clone = t;
        Move_to_Element_By_Path("Move > 'Cancel' button", "xpath", "(//*[contains(text(),'cancel')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Cancel' button", "xpath", "(//*[contains(text(),'cancel')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for 'Edit Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Edit Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > Location in table", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Clone > Location ", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]//i[contains(@class,'mdi-content-copy')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Duplicate Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Location name is already used' message", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Location name is already used')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (!loc_name_before_clone.contains(New_ID)) {
            loc_name_before_clone = loc_name_before_clone + New_ID;
        } else if (loc_name_before_clone.contains(New_ID)) {
            loc_name_before_clone = loc_name_before_clone + "-X";
        }
        Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", loc_name_before_clone + "-copy", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for 'Duplicate Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, Ver);
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click > 'Delivery Drop-off Locations' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Drop-off Locations')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get List of Locations", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
//        Scroll_to_WebElement("Scroll > 'Drop-off Locations' section", "xpath", "//div[@id='drop-off-locations']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//        Thread.sleep(500);
        Move_to_Element_By_Path("Move > Location in table", "xpath", "(//td[contains(text(),'" + New_ID + "') and contains(text(),'-copy')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Edit > Location ", "xpath", "(//td[contains(text(),'" + New_ID + "') and contains(text(),'-copy')])[1]/parent::tr//i[contains(@class,'mdi-pencil')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Edit Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Edit Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Attribute("Get value of 'Location Name'", "xpath", "(//input[@aria-label='Location Name'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_name_before_edit = t;
        if (loc_name_before_edit.equals(loc_name_before_clone + "-copy")) {
            _t++;
            _p++; EX += _t + "\t" + "Check > 'Location Name' of cloned location" + "\t" + "-" + "\t" + String.valueOf(loc_name_before_edit.equals(loc_name_before_clone + "-copy")) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(loc_name_before_edit.equals(loc_name_before_clone + "-copy")), false, ParentTest.createNode(_t + ". " + "Check > 'Location Name' of cloned location"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check > 'Location Name' of cloned location" + "\t" + "-" + "\t" + String.valueOf(loc_name_before_edit.equals(loc_name_before_clone + "-copy")) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(loc_name_before_edit.equals(loc_name_before_clone + "-copy")), true, ParentTest.createNode(_t + ". " + "Check > 'Location Name' of cloned location"), new Date());
        }

        Element_By_Path_Attribute("Get value of 'Address'", "xpath", "(//input[@aria-label='Address'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String addr_before_edit = t;
        if (addr_before_edit.equals(addr_before_clone)) {
            _t++;
            _p++; EX += _t + "\t" + "Check > 'Address' of cloned location" + "\t" + "-" + "\t" + String.valueOf(addr_before_edit.equals(addr_before_clone)) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(addr_before_edit.equals(addr_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'Address' of cloned location"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check > 'Address' of cloned location" + "\t" + "-" + "\t" + String.valueOf(addr_before_edit.equals(addr_before_clone)) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(addr_before_edit.equals(addr_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'Address' of cloned location"), new Date());
        }

        Element_By_Path_Attribute("Get value of 'City'", "xpath", "(//input[@aria-label='City'])[1]", "value", ParentTest, "no_jira");
        if (FAIL) { return;}
        String city_before_edit = t;
        if (city_before_edit.equals(city_before_clone)) {
            _t++;
            _p++; EX += _t + "\t" + "Check > 'City' of cloned location" + "\t" + "-" + "\t" + String.valueOf(city_before_edit.equals(city_before_clone)) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(city_before_edit.equals(city_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'City' of cloned location"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check > 'City' of cloned location" + "\t" + "-" + "\t" + String.valueOf(city_before_edit.equals(city_before_clone)) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(city_before_edit.equals(city_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'City' of cloned location"), new Date());
        }
        String city_after_edit = "";
        String stateprovince_before_edit = "";
        String stateprovince_after_edit = "";
        String postalzip_before_edit = "";
        String postalzip_after_edit = "";
        if (COUNTRY.toUpperCase().startsWith("US")) {
            Element_By_Path_Attribute("Get value of 'State'", "xpath", "(//input[@aria-label='State'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_before_edit = t;
            if (stateprovince_before_edit.equals(stateprovince_before_clone)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > 'State' of cloned location" + "\t" + "-" + "\t" + String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'State' of cloned location"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > 'State' of cloned location" + "\t" + "-" + "\t" + String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'State' of cloned location"), new Date());
            }

            Element_By_Path_Attribute("Get value of 'Zip Code'", "xpath", "(//input[@aria-label='Zip Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            postalzip_before_edit = t;
            if (postalzip_before_edit.equals(postalzip_before_clone)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > 'Zip' of cloned location" + "\t" + "-" + "\t" + String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'Zip' of cloned location"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > 'Zip' of cloned location" + "\t" + "-" + "\t" + String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'Zip' of cloned location"), new Date());
            }
            Move_to_Element_By_Path("Move > 'City' field", "xpath", "(//*[contains(text(),'City')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'City' field", "xpath", "(//*[@aria-label='City'])[1]", "Chicago", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'City'", "xpath", "(//input[@aria-label='City'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            city_after_edit = t;
            Move_to_Element_By_Path("Move > 'State' field", "xpath", "(//*[contains(text(),'State')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'State' field", "xpath", "(//*[@aria-label='State'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'State' field", "xpath", "(//*[@aria-label='State'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'State' field", "xpath", "(//*[@aria-label='State'])[1]", "Illinois", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Click("Select > 'State'", "xpath", "//div[contains(@class,'menuable__content__active')]//a", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'State'", "xpath", "(//input[@aria-label='State'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_after_edit = t;
            Move_to_Element_By_Path("Move > 'Zip Code' field", "xpath", "(//*[contains(text(),'Zip Code')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Zip Code' field", "xpath", "(//*[@aria-label='Zip Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'Zip Code' field", "xpath", "(//*[@aria-label='Zip Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'Zip Code' field", "xpath", "(//*[@aria-label='Zip Code'])[1]", "84112", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Zip Code' field", "xpath", "(//*[@aria-label='Zip Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'Zip Code'", "xpath", "(//input[@aria-label='Zip Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            postalzip_after_edit = t;
        } else {
            Element_By_Path_Attribute("Get value of 'Province'", "xpath", "(//input[@aria-label='Province'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_before_edit = t;
            if (stateprovince_before_edit.equals(stateprovince_before_clone)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > 'Province' of cloned location" + "\t" + "-" + "\t" + String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'Province' of cloned location"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > 'Province' of cloned location" + "\t" + "-" + "\t" + String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(stateprovince_before_edit.equals(stateprovince_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'Province' of cloned location"), new Date());
            }
            Element_By_Path_Attribute("Get value of 'Postal Code'", "xpath", "(//input[@aria-label='Postal Code'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
            postalzip_before_edit = t;
            if (postalzip_before_edit.equals(postalzip_before_clone)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > 'Postal' of cloned location" + "\t" + "-" + "\t" + String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)) + "\t" + "PASS" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("PASS", String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'Postal' of cloned location"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > 'Postal' of cloned location" + "\t" + "-" + "\t" + String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)) + "\t" + "FAIL" + "\t" 
                            + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                Log_Html_Result("FAIL", String.valueOf(postalzip_before_edit.equals(postalzip_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'Postal' of cloned location"), new Date());
            }
            Move_to_Element_By_Path("Move > 'City' field", "xpath", "(//*[contains(text(),'City')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'City' field", "xpath", "(//*[@aria-label='City'])[1]", "Calgary", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'City' field", "xpath", "(//*[@aria-label='City'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'City'", "xpath", "(//input[@aria-label='City'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            city_after_edit = t;
            Move_to_Element_By_Path("Move > 'Province' field", "xpath", "(//*[contains(text(),'Province')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Province' field", "xpath", "(//*[@aria-label='Province'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'Province' field", "xpath", "(//*[@aria-label='Province'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'Province' field", "xpath", "(//*[@aria-label='Province'])[1]", "Alb", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'Province' field", "xpath", "(//*[@aria-label='Province'])[1]", "erta", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Click("Select > 'Province'", "xpath", "//div[contains(@class,'menuable__content__active')]//a", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'Province'", "xpath", "(//input[@aria-label='Province'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            stateprovince_after_edit = t;
            Move_to_Element_By_Path("Move > 'Postal Code' field", "xpath", "(//*[contains(text(),'Postal Code')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Postal Code' field", "xpath", "(//*[@aria-label='Postal Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'Postal Code' field", "xpath", "(//*[@aria-label='Postal Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'Postal Code' field", "xpath", "(//*[@aria-label='Postal Code'])[1]", "J7V9N1", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Postal Code' field", "xpath", "(//*[@aria-label='Postal Code'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Attribute("Get value of 'Postal Code'", "xpath", "(//input[@aria-label='Postal Code'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            postalzip_after_edit = t;   
        }
        Element_By_Path_Click("Click > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Location Information'", "xpath", "//*[@name='dropOffLocationInformation']", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_info_before_edit = t;
        if (loc_info_before_edit.equals(loc_info_before_clone)) {
            _t++;
            _p++; EX += _t + "\t" + "Check > 'Location Information' of cloned location" + "\t" + "-" + "\t" + String.valueOf(loc_info_before_edit.equals(loc_info_before_clone)) + "\t" + "PASS" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(loc_info_before_edit.equals(loc_info_before_clone)), false, ParentTest.createNode(_t + ". " + "Check > 'Location Information' of cloned location"), new Date());
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check > 'Location Information' of cloned location" + "\t" + "-" + "\t" + String.valueOf(loc_info_before_edit.equals(loc_info_before_clone)) + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", String.valueOf(loc_info_before_edit.equals(loc_info_before_clone)), true, ParentTest.createNode(_t + ". " + "Check > 'Location Information' of cloned location"), new Date());
        }
        Move_to_Element_By_Path("Move > 'Location Name' field", "xpath", "(//*[contains(text(),'Location Name')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", loc_name_before_edit + "-edited", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Location Name'", "xpath", "(//input[@aria-label='Location Name'])[1]", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_name_after_edit = t;
        Move_to_Element_By_Path("Move > 'Address' field", "xpath", "(//*[contains(text(),'Address')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", "456 Somewher Rd", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Address'", "xpath", "(//input[@aria-label='Address'])[1]", "value", ParentTest, "no_jira");
        if (FAIL) { return;}
        String addr_after_edit = t;
        Move_to_Element_By_Path("Move > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", "new info edited", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Information' field", "xpath", "//*[contains(@aria-label,'Location Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Get value of 'Location Information'", "xpath", "//*[@name='dropOffLocationInformation']", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
        String loc_info_after_edit = t;
        Element_By_Path_Click("Set > 'Foodlocker' toggle to 'No'", "xpath", "//p[contains(text(),'APEX Foodlocker')]/parent::div//*[contains(text(),'No')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Foodlocker' toggle is set to 'No'", "xpath", "(//*[@class='Option-Right-Selected-Blue-White'])[1]/div[contains(text(),'No')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "(//*[contains(text(),'Save Changes')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "(//*[contains(text(),'Save Changes')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_InVisibility("Wait for 'Edit Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Edit Drop-off Location')]", ParentTest, Ver);
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click > 'Delivery Drop-off Locations' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Drop-off Locations')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get List of Locations", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}

        // </editor-fold>   
            
        // <editor-fold defaultstate="collapsed" desc="Sort/Filter Locations">
        // 1. add 2 more locations with unique name; 1 with foodlocker, 1 without
        // 2. Sort by Location name
        // 3. Sort by Location type
        // 4. Filter (currently only works by Location name)
//        Scroll_to_WebElement("Scroll > 'Drop-off Locations' section", "xpath", "//div[@id='drop-off-locations']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//        Thread.sleep(500);
        Move_to_Element_By_Path("Move > Location in table", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Clone > Location ", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]//i[contains(@class,'mdi-content-copy')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Duplicate Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Location name is already used' message", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Location name is already used')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", "Sort-filter Loc " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for 'Duplicate Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, Ver);
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}       
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click > 'Delivery Drop-off Locations' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Drop-off Locations')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > Location in table", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[3]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // paginagion > ALL    
        Element_By_Path_Click("Clone > Location ", "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[3]//i[contains(@class,'mdi-content-copy')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Duplicate Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Location name is already used' message", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Location name is already used')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", "Sort-filter Loc " + New_ID + "-2", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for 'Duplicate Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Duplicate Drop-off Location')]", ParentTest, Ver);
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Delivery Drop-off Locations' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Drop-off Locations')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        // paginagion > ALL    
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L1("Get List of Locations - All", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        //Click on Location Name column label to sort in decending order
        Element_By_Path_Click("Click > 'Location Name' column header - Sort Descending", "xpath", "(//*[@id='drop-off-locations']//*[contains(@class, 'column sortable')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        //Click on Location Name column label to sort in ascending order
        Element_By_Path_Click("Click > 'Location Name' column header - Sort Ascending", "xpath", "(//*[@id='drop-off-locations']//*[contains(@class,'column sortable')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);   
        //filter locations (only by name)
        Move_to_Element_By_Path("Move to 'Search Locations' field", "xpath", "//*[@aria-label='Search Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Search Locations' field", "xpath", "//*[@aria-label='Search Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Search for '" + New_ID + "' in Location name", "xpath", "//*[@aria-label='Search Locations']", New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        List_L2("Get List of Locations - Filtered", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (L2.size() < L1.size()) {
            for (int i = 0; i < L2.size(); i++) {
                Element_By_Path_Text("Get > 'location name' " + (i+1), "xpath", "((//tbody)[3]//tr)[" + (i+1) + "]//td", ParentTest, "no_jira");
                    if (FAIL) { return;}
                if (t.contains(New_ID)) {
                    _t++;
                    _p++; EX += _t + "\t" + "Check > Filtered correctly" + "\t" + "-" + "\t" + "location " + (i+1) + " was filtered correctly" + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "location " + (i+1) + " was filtered correctly", false, ParentTest.createNode(_t + ". " + "Check > Edited location"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Check > Filtered correctly" + "\t" + "-" + "\t" + "location " +(i+1) + " was not filtered correctly" + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "location " + (i+1) + " was not filtered correctly", true, ParentTest.createNode(_t + ". " + "Check > Filtered crrectly"), new Date());
                }
            }
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Check List was Filtered" + "\t" + "-" + "\t" + "locations failed to filter" + "\t" + "FAIL" + "\t" 
                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "locations failed to filter", true, ParentTest.createNode(_t + ". " + "Check List was Filtered"), new Date());
        }
        // </editor-fold>  
        
        // <editor-fold defaultstate="collapsed" desc="Delete New_ID Locations">
        List_L1("Get List of Locations - after filtering", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}        
        for (int i = (L1.size() - 1); i >= 0; i--) {
            Element_Text("Get Location " + i, L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!t.contains("No locations found") && t.contains(New_ID)) {
                Move_to_Element("Move to Location " + i, L1.get(i), ParentTest, "no_jira"); 
                //Scroll_to_Element("Scroll to Location " + i, L1.get(i), ParentTest, "no_jira");
                //Move_to_Element_By_Path("Move to Location " + i, "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[" + i + "]", ParentTest, "no_jira");            
                //Element_Click("Move to Location " + i, L1.get(i), ParentTest, "no_jira");
                    //if (FAIL) { return;}
                Element_Child_Click("Click > 'delete icon'", L1.get(i), "xpath", ".//i[contains(@class,'mdi-delete')]", ParentTest, "np_jira");
                    //if (FAIL) { return;}
                Element_E1_Find("Find 'Revome Location?' confirmation dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
                    //if (FAIL) { return;}
                Element_Child_Click("Click > 'Remove'", e1, "xpath", ".//*[contains(text(),'REMOVE')]", ParentTest, "np_jira");
                    //if (FAIL) { return;}
//                Wait_For_Element_By_Path_InVisibility("Wait for 'Revome Location?' confirmation dialog to disappear", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
//                    if (FAIL) { return;}
            }   
        } 
  
        Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_to_Element_By_Path("Move > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Configuration' button", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Wait_For_Element_By_Path_Presence("Check 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        List_L1("Get List of Locations - All", "xpath", "(//tbody)[3]//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>       

        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Delivery Drop-off Locations End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        // </editor-fold>


        Navigate_to_URL("Navigate back to Station List", url + "#/sites/all", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}               
    
            
        // <editor-fold defaultstate="collapsed" desc="New Site > Cancel">
        To_Top("Scroll to page Top", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Site Click", "xpath", "//div[@class='v-btn__content' and contains(text(),'ADD NEW SITE')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);    
        Page_URL("New Site page URL", ParentTest, "no_jira");
            if (FAIL) { return;}  

        Element_E1_Find("Find 'Site detail' card", "id", "site-detail", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_Child_E2("Find 'Site detail' > 'Location Name' field", e1, "css", "[aria-label='Location Name']", ParentTest, "no_jira");    
            if (FAIL) { return;}              
        Element_Text_Enter("Enter new Site Name", e2, "New Auto Site " + New_ID, ParentTest, "no_jira");
        //Element_By_Path_Text_Enter("Enter new Site Name", "css", "[aria-label='Location Name']", "New Auto Site " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;} // ^^^ enter name to show buttons

        Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Create Site' text", "Create Site", true, ParentTest, "no_jira"); 
        
        List_L0("Site Info Navigationd Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            switch (i) {
                case 0:
                    Element_Text("Location Details section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Location Details Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Location Details' text", "Location Details", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Location Name' text", "Location Name", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Address' text", "Address", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Country' text", "Country", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'City' text", "City", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Postal Code' text", "Postal Code", true, ParentTest, "no_jira"); 
                    Find_Text("Products Title", "On Site Product", true, ParentTest, "no_jira"); 
                    Element_By_Path_Click("Create Site", "xpath", "//*[contains(text(), 'Create Site')]", ParentTest, "no_jira");
                         if (FAIL) { return;} 
                    List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Required:", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        }  
                    //String ADDR = "87 Bordeaux Drive, Logan Township, NJ, USA";
                    //String ADDR_Short = "87 Bordeaux Dr"; 
                    Element_Child_E2("Find 'Site detail' > 'Address' field", e1, "css", "[aria-label='Address']", ParentTest, "no_jira");    
                        if (FAIL) { return;}              
                    Element_Text_Enter("Enter new Site Name", e2, "87 Bordeaux Drive, Logan Township", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Thread.sleep(1000); 
                    Element_By_Path_Click("Select new Site Address", "xpath", "//*[contains(text(), '" + "Bordeaux Drive" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(1000); 
                    Element_By_Path_Text("New Site Address", "xpath", "//*[@id='site-detail']//input[@aria-label='Address']", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Element_By_Path_Text("New Site Country", "xpath", "//input[@aria-label='Country']/parent::div", ParentTest, "no_jira"); 
                        //if (FAIL) { return;} // OK
                    Element_By_Path_Text("New Site State", "xpath", "//input[@aria-label='State']/parent::div", ParentTest, "no_jira"); 
                        //if (FAIL) { return;} // OK
                    Element_By_Path_Text("New Site City", "xpath", "//*[@id='site-detail']//input[@aria-label='City']", ParentTest, "no_jira"); 
                        //if (FAIL) { return;}
                    Element_By_Path_Text("New Site Zip Code", "xpath", "//*[@id='site-detail']//input[@aria-label='Zip Code' or @aria-label='Postal Code']", ParentTest, "no_jira"); 
                        //if (FAIL) { return;}
                    Element_By_Path_Text("New Site Latitude, Longitude", "xpath", "//input[@aria-label='Latitude, Longitude']", ParentTest, "no_jira"); 
                        //if (FAIL) { return;}

                    List_L1("Available Products Count", "className", "App-Container", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Product Name", L1.get(j), ParentTest, "no_jira");
                            if(t == null ? app == null : t.equals(app)){
                                Element_Click("New Site Select Product " + app, L1.get(j), ParentTest, "no_jira"); 
                                   if (FAIL) { return;}                                    
                            }
                            Element_Child_Attribute("Product Image", L1.get(j), "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", ParentTest, "no_jira");             
                                if (FAIL) { return;}
                        }    
                    break;
                case 1:
                   Element_Text("Payment section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Payment Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Payment ID' text", "Payment ID", true, ParentTest, "no_jira");                       
                    Find_Text("Find 'Payment Type' text", "Payment Type", true, ParentTest, "no_jira"); 
                    Element_By_Path_Attribute("Payment Type Prompt", "css", "[aria-label='Payment Type']", "placeholder", ParentTest, "no_jira");
                         if (FAIL) { return;}                 
                    Element_By_Path_Click("Payment Type Dropdown Open", "xpath", "//input[@placeholder='Select Payment Type']/parent::div[@class='v-select__selections']/following-sibling::div", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Thread.sleep(500);
                    List_L1("Find 'Payment Types' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@class='v-list__tile__title']", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Available Payment Type " + j, L1.get(j), ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    }  
                    Element_By_Path_Click("Select Payment Type", "xpath", "//*[contains(text(), '" + "FreedomPay" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Text_Enter("Enter FP Store ID", "css", "[aria-label='Freedom Pay Store ID']", "1471190011", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Enter FP Terminal ID", "css", "[aria-label='Freedom Pay Terminal ID']", "2479168011", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Find_Text("Find 'Refunds Accepted?' text", "Refunds Accepted?", true, ParentTest, "no_jira"); 
                    break;
                case 2:     
                    Element_Text("Mealplan section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Mealplan Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Meal Plan' text", "Meal Plan", true, ParentTest, "no_jira"); 
                    Element_By_Path_Attribute("Choose Prompt", "css", "[aria-label='Plan Type']", "placeholder", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Open Meal Plan Dropdown", "xpath", "//div[@id='mealplan-detail']//i[@class='v-icon mdi mdi-menu-down theme--light']", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_E1_Find("Find 'Plan Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500); 
                    Element_Child_List_L1("Plan Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");     
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Available Meal Plan " + j, L1.get(j), ParentTest, "no_jira");             
                        }   
                    Element_By_Path_Click("Select Meal Plan", "xpath", "//*[contains(text(), '" + "Transact Premise" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Text("Meal Plan Name", "css", "[aria-label='Plan Name']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Enter Host", "css", "input[aria-label='Host']", "20.62.183.69", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Enter Port", "css", "input[aria-label='Port']", "9003", false, ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_By_Path_Text_Enter("Enter AES", "css", "input[aria-label='AES key']", "294A404E635266556A586E3272357537", false, ParentTest, "no_jira");
                        if (FAIL) { return;}

                    Element_By_Path_Click("Open Vendor Dropdown", "xpath", "//input[@aria-label='Vendor number']/parent::div[@class='v-select__selections']/following-sibling::div//i", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_E1_Find("Find 'Vendor number' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);
                    T_Index = -1;
                    Element_Child_List_L1("Vendor number Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");     
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Available Vendor Number:", L1.get(j), ParentTest, "no_jira");
                        if(t.trim().equals("3600"))
                            T_Index = j;
                    }   
                    if(T_Index!= -1) {
                        Element_Click("Select vendor", L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    }

                    Element_By_Path_Text_Enter("Enter Additional Instructions", "css", "input[aria-label='Additional Instructions (en)']", "Do not use - test auto generated", false, ParentTest, "no_jira");
                        if (FAIL) { return;}     
                    Find_Text("Find 'EN'", "EN" , true, ParentTest, "no_jira");
                    Scroll_to_Element("Scroll to Meal plan ID", e, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Enter Meal Plan Terminal ID", "css", "[aria-label='Meal Plan Terminal ID']", "401001", false, ParentTest, "no_jira");
                        if (FAIL) { return;}   
                    Element_By_Path_Text("Tender Type", "xpath", "//input[@placeholder='Please select Tender Type']/preceding-sibling::div", ParentTest, "no_jira");
                        if (FAIL) { return;}     
                    Element_By_Path_Text_Enter("Enter Name of tender", "css", "input[aria-label='Name of Tender']", "Flex Fund", false, ParentTest, "no_jira");
                        if (FAIL) { return;}   
                    Element_By_Path_Text_Enter("Enter Tender ID", "xpath", "//*[@id='mealplan-detail']//input[@aria-label='Tender ID']", "1", false, ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_By_Path_Click("Open Tax Exempt Dropdown", "xpath", "//*[@id='mealplan-detail']//input[@aria-label='Tax Exempt']/parent::div[@class='v-select__selections']/following-sibling::div//i", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_E1_Find("Find 'Tax exempt' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);
                    Element_Child_List_L1("Tax exempt options", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");     
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Available Tax exempt options :", L1.get(j), ParentTest, "no_jira");
                            if(t.trim().equals("Yes")){
                                T_Index = j;
                            }
                       }   
                    if(T_Index!= -1) {
                        Element_Click("Select 'Tax exempt'", L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return;}  
                    }       
                    Find_Text("Find 'Add another tender type' text", "add another tender type", true, ParentTest, "no_jira");  
                    Element_Click("Click 'Add another tender type'", e, ParentTest, "no_url");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Cancel  another tender type", "xpath", "(//div[@class='flex display-flex align-center']//div[@class='flex xs1']//i[contains(@class,'close')])[2]", ParentTest, "no_jira");
                        if (FAIL) { return;}                                                                                         

                    Find_Text("Find 'Manage Meal Plan Domains' text", "Manage Meal Plan Domains", true, ParentTest, "no_jira");    
                    Element_By_Path_Click("Click 'Manage Meal Plan Domains'", "xpath", "//div[contains(@class,'Primary-Left Domain') and contains(text(),'Manage Meal Plan Domains')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);    
                    Element_By_Path_Click("Cancel  Manage Meal Plan Dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='cancel']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                     break;
                case 3:
                    Element_Text("Loyalty section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Loyalty Info Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Loyalty Program' text", "Loyalty Program", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'not enabled' text", "Loyalty is not enabled for this brand", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'to enable' text", "Would you like to enable Loyalty?", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Yes' text", "Yes", true, ParentTest, "no_jira"); 
                    break;
                case 4:
                    Element_Text("Promotion section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Click 'Promotion Info'", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Promotions' text", "Promotions", true, ParentTest, "no_jira"); 
                    List_L1("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                    }
                    Find_Text("Find 'Create...' text", "CREATE PROMO", true, ParentTest, "no_jira"); 
                    Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}                           
                    Element_By_Path_Click("Save promo Click", "xpath", "//*[contains(text(), 'save changes')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                     List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Required: ", L1.get(j), ParentTest, "no_jira");             
                        }
                    Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo%%" , false, ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}                                         
                    Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                            
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promo Type " + j, L1.get(j), ParentTest, "no_jira");             
                        }    
                    Element_By_Path_Click("Select Promo Type %%", "xpath", "//*[contains(text(), '" + "Percentage off" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Text_Enter("Enter Percentage off 50%", "css", "[aria-label='Value ($ or %)']", "50", false, ParentTest, "no_jira");
                        if (FAIL) { return;}  

                    Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}                           
                    Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                             
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promo State:", L1.get(j), ParentTest, "no_jira");             
                        }    
                    Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}  
                    List_L1("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                        }     
                    Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}                                                     
                    Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo$$" , false, ParentTest, "no_jira");
                        if (FAIL) { return;} 

                    Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}                                         
                    Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                            
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promo Type " + j, L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        } 
                    Element_By_Path_Click("Select Promo Type $$", "xpath", "//*[contains(text(), '" + "Amount off" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Text_Enter("Enter Ammount off 2$", "css", "[aria-label='Value ($ or %)']", "2", false, ParentTest, "no_jira");
                        if (FAIL) { return;}  

                    Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", ParentTest, "no_jira");
                         if (FAIL) { return;}    
                    Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return;}                           
                    Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                            
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promo State:", L1.get(j), ParentTest, "no_jira");             
                        }   
                    Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}  
                    List_L1("Promo Count - Only 1 Active", "tagName", "tr", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                        }                              
                    break;  
                case 5:
                    Element_Text("KDS section", L0.get(i), ParentTest, "no_jira"); 
                    Find_Text("Find 'KDS Configuration' text", "KDS Configuration", true, ParentTest, "no_jira");             

                    break;
                case 6:
                    Element_Text("Delievery Drop-off section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break;
                case 7:
                    Element_Text("APEX section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break;
                case 8:
                    Element_Text("Frictionless section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    break;         
                default:
                    break;
                }
            }   

        Move_to_Element_By_Path("Move > New Site > 'Cancel' button", "xpath", "//footer//*[contains(text(),'Cancel')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > New Site > 'Cancel' button", "xpath", "//footer//*[contains(text(),'Cancel')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("New Site 'Cancel' Click", "xpath", "//*[contains(text(), 'Cancel')]", ParentTest, "no_jira");             
            if (FAIL) { return;}         
        Navigate_Back("Navigate Back","Add New Site page", "App Site page", ParentTest, "no_jira"); 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");          
        // </editor-fold> 
   
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    } 
    } 
}