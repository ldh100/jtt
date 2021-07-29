package AP3;

import java.time.LocalDateTime;
import net.bytebuddy.utility.RandomString;
import org.json.JSONArray;
import org.json.JSONObject;

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
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    protected void run() { 
    try {    
        String API_Response_Body = "";  
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Sites Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");             
                if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Sites Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                    if (FAIL) { return;}        
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
//        Swith_to_Frame("Switch to Video Player", "tagName", "iframe", ParentTest, "no_jira");// iframe src="https://player.vimeo.com/video/412472158"
//            if (FAIL) { return;} 
//        Wait_For_Element_By_Path_Presence("Wait for Player load", "className", "play-icon", ParentTest, "no_jira"); 
//            if (FAIL) { return;}  
//        Element_By_Path_Attribute("Video Title", "xpath", "//header[contains(@class, 'vp-title-header')]", "textContent", ParentTest, "no_jira");
//            if (FAIL) { return;} 
//        Element_By_Path_Click("Play Click", "className", "play-icon", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
//            Thread.sleep(1000);
//        Swith_to_Frame("Back to default frame", "defaultContent", "N/A", ParentTest, "no_jira");
//            if (FAIL) { return;}      
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
                    Element_Text("Definition section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Location Details Click", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Location Details' text", "Location Details", true, ParentTest, "no_jira"); 
                    //Element_By_Path_Text("Find 'Timezone' text", "className", "timezone", ParentTest, "no_jira"); 
                        if (FAIL) { return;}                        
                    Find_Text("Find 'Location Name' text", "Location Name", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Address' text", "Address", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Country' text", "Country", true, ParentTest, "no_jira"); 

                    Find_Text("Find 'State' text", "State", true, ParentTest, "no_jira");                       
                    if(COUNTRY.toLowerCase().contains("ca")){
//                        Find_Text("Find 'Province' text", "Province", true,"no_jira"); 
                        Find_Text("Find 'Postal Code' text", "Postal Code", true, ParentTest, "no_jira"); 
                    } else {
                        Find_Text("Find 'Zip Code' text", "Zip Code", true, ParentTest, "no_jira"); 
                        }  
                    Find_Text("Find 'City' text", "City", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true, ParentTest, "no_jira"); 
                    break;
                case 1:
                    Element_Text("Payment section", L0.get(i), ParentTest, "no_jira");             
                        if (FAIL) { return;} 
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
                        if (FAIL) { return;} 
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
                        if (FAIL) { return;} 
                    Element_Click("Click 'Promotion Info'", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Find_Text("Find 'Promotions' text", "Promotions", true, ParentTest, "no_jira"); 
                    List_L1("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        }
                default:
                    break;
            }
        } 
        // </editor-fold> 
        
        /*
        *   test delivery drop-off locations in dev only
        *   AUT-1066  
        */    
        if (env.equals("DE")) {
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Delivery Drop-off Locations Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
            //get delivery destinations from API 
            Call_API("Call /location/group/'SiteID'/deliverydestination", "Bearer " + AP3_TKN, BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", true, ParentTest, "no_jira");
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
                return;
            }
            
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray delivery_destinations = json.getJSONArray("delivery_destinations");
            
            Wait_For_Element_By_Path_Presence("Check 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Click 'Delivery Drop-off Locations' in list of sections", "xpath", "//div[@class='v-list__tile__content']/*[contains(text(),'Delivery Drop-off')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for presence of 'Delivery Drop-off Locations' sections", "xpath", "//*[@class='H5-Primary-Left' and text()='Delivery Drop-off Locations']", ParentTest, "no_jira");
            if (FAIL) { return;}
            if (delivery_destinations.isEmpty()) {
                Wait_For_Element_By_Path_Presence("Check > List of Locations is empty", "xpath", "//*[text()='No locations found']", ParentTest, "no_jira");
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
                Wait_For_Element_By_Path_Presence("Wait for '80 characters max' validation message", "xpath", "//*[contains(text(),'80 characters max, this name will appear on Bolter and Core apps')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > out of 'Location Name'", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'Location name is required' message", "xpath", "//*[contains(text(),'Drop-off Location name is required')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//input[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 1; i < 82; i++) {
                    Element_By_Path_Text_Enter("Try entering a Location Name with greater than 80 characters", "xpath","(//input[@aria-label='Location Name'])[1]", "a",false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Element_By_Path_Attribute("Get value in 'Location Name' field", "xpath", "(//input[@aria-label='Location Name'])[1]", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (t.length() == 80) {
                    _t++;
                    _p++; EX += _t + "\t" + "Check value is not longer than 80 characters" + "\t" + "-" + "\t" + "value length = " + t.length() + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "value length = " + t.length(), false, ParentTest.createNode("Check value is not longer than 80 characters"));
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Check value is not longer than 80 characters" + "\t" + "-" + "\t" + "value length = " + t.length() + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "value length = " + t.length(), true, ParentTest.createNode("Check value is not longer than 80 characters"));
                }
                // test Location Name Field - End
                // </editor-fold>
            } else {
                int locations = delivery_destinations.length();
                for (int i = 0; i < locations; i++) {
                    Move_to_Element_By_Path("Move > Location" + (i+1), "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_By_Path_Click("Delete > Location " + (i+1), "xpath", "(//div[@id='drop-off-locations']//tbody/tr)[1]//i[contains(@class,'mdi-delete')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for Remove Location dialog", "xpath", "//div[contains(text(),'Remove Location?')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Remove' in dialog", "xpath", "//div[contains(text(),'REMOVE')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    
                } 
            }

            
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Delivery Drop-off Locations End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        } else {
            //continue the test as expected for non-dev env
            Navigate_Back("Navigate Back", SITE + "Site Configuration","Station List", ParentTest, "no_jira");
            //if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}               
            Navigate_Back("Navigate Back", SITE + "Station List","App Sites page", ParentTest, "no_jira");
                //if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}               
            
            // <editor-fold defaultstate="collapsed" desc="New Sites > Cancel">
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
            Element_By_Path_Text_Enter("Enter new Site Name", "css", "[aria-label='Location Name']", "New Auto Site " + New_ID, false, ParentTest, "no_jira");
                if (FAIL) { return;} // ^^^ enter name to show buttons
            Find_Text("Find 'Cancel' text", "Cancel", true, ParentTest, "no_jira"); 
            Find_Text("Find 'Create Site' text", "Create Site", true, ParentTest, "no_jira"); 
            List_L0("Site Info Navigationd Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");             
                if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                switch (i) {
                    case 0:
                        Element_Text("Definition section", L0.get(i), ParentTest, "no_jira");             
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
                         Element_By_Path_Text_Enter("Enter new Site Address", "css", "[aria-label='Address']", "87 Bordeaux Drive, Logan Township", false, ParentTest, "no_jira");
                            if (FAIL) { return;}  
                            Thread.sleep(1000); 
                         Element_By_Path_Click("Select new Site Address", "xpath", "//*[contains(text(), '" + "Bordeaux Drive" + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                            Thread.sleep(1000); 
                        Element_By_Path_Text_Select_Copy("New Site Address", "xpath", "//input[@aria-label='Address']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        Element_By_Path_Text("New Site Country", "xpath", "//input[@aria-label='Country']/parent::div", ParentTest, "no_jira"); 
                            if (FAIL) { return;} // OK
                        Element_By_Path_Text("New Site State", "xpath", "//input[@aria-label='State']/parent::div", ParentTest, "no_jira"); 
                            if (FAIL) { return;} // OK
                        Element_By_Path_Text_Select_Copy("New Site City", "xpath", "//input[@aria-label='City']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        Element_By_Path_Text_Select_Copy("New Site Zip Code", "xpath", "//input[@aria-label='Zip Code']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        Element_By_Path_Text_Select_Copy("New Site Latitude, Longitude", "xpath", "//input[@aria-label='Latitude, Longitude']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}

                        List_L1("Available Products Count", "className", "App-Container", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Product Name", L1.get(j), ParentTest, "no_jira");
                                if (FAIL) { return;} 
                                if(t == null ? app == null : t.equals(app)){
                                    Element_Click("New Site Select Product " + app, L1.get(j), ParentTest, "no_jira"); 
                                       if (FAIL) { return;}                                    
                                }
                                Element_Child_Attribute("Product Image", L1.get(j), "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", ParentTest, "no_jira");             
                                if (FAIL) { return;}
                                // Element_Child_Attribute("Product Selected", L0, "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", j, ParentTest, "no_jira");             
                                // if (FAIL) { return;}            // //_t++; Thread.Sleep(sleep); App_Enabled(DT[i], ParentTest, "no_jira"); if (FAIL) return;
                            }
    //                        List_L1("Selected Apps Count", "xpath", ".//div[contains(@class,'v-messages__message')]", ParentTest, "no_jira");             
    //                            if (FAIL) { return;}     
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

    //                    Element_By_Path_Click("Payment Type Dropdown Open", "css", "[aria-label='Payment Type']", ParentTest, "no_jira");
    //                    if (FAIL) { return;}                  
                        Element_By_Path_Click("Payment Type Dropdown Open", "xpath", "//input[@placeholder='Select Payment Type']/parent::div[@class='v-select__selections']/following-sibling::div", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                        Thread.sleep(500);
                        List_L1("Find 'Payment Types' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@class='v-list__tile__title']", ParentTest, "no_jira");             
                            if (FAIL) { return;} 

                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Payment Type:", L1.get(j), ParentTest, "no_jira");             
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
                        Thread.sleep(500);// 
                        Element_Child_List_L1("Plan Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");     
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Meal Plan:", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}
                            }   
                        Element_By_Path_Click("Select Meal Plan", "xpath", "//*[contains(text(), '" + "Blackboard" + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}  
    //                    Element_By_Path_Text_Enter("Enter Plan Name", "css", "[aria-label='Plan Name']", "BLACKBOARD", false, ParentTest, "no_jira");
    //                        if (FAIL) { return;}
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
                                if (FAIL) { return;}
                                if(t.trim().equals("3600"))
                                    T_Index = j;
                           }   
                        if(T_Index!= -1)
                        {
                            Element_Click("Select vendor", L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return;}  
                        }

                        Element_By_Path_Text_Enter("Enter Addtional Instructions", "css", "input[aria-label='Additional Instructions (en)']", "Do not use - test auto generated", false, ParentTest, "no_jira");
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
                        Element_By_Path_Text_Enter("Enter Tender ID", "css", "input[aria-label='Tender ID']", "1", false, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Open Tax Exempt Dropdown", "xpath", "//input[@aria-label='Tax Exempt']/parent::div[@class='v-select__selections']/following-sibling::div//i", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_E1_Find("Find 'Tax exempt' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}    
                        Thread.sleep(500);
                        Element_Child_List_L1("Tax exempt options", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");     
                        T_Index = -1;
                        for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Tax exempt options :", L1.get(j), ParentTest, "no_jira");
                                if (FAIL) { return;}
                                if(t.trim().equals("Yes"))
                                    T_Index = j;
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
                                if (FAIL) { return;}
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
                                    if (FAIL) { return;}
                            }
                        Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo%%" , false, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", ParentTest, "no_jira");
                            if (FAIL) { return;}    
                        Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}                                         
                        Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                            
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Promo Type:", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}
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
    //                    List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", ParentTest, "no_jira");             
    //                        if (FAIL) { return;} 
                                for (int j = 0; j < L1.size(); j++) {
                                    Element_Text("Promo State:", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}
                                }    
                        Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}  


                        Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}  
    //                        Element_By_Path_Click("Create promo 'Cancel' Click", "xpath", "//*[contains(text(), 'cancel')]", ParentTest, "no_jira"); 
    //                            if (FAIL) { return;}
                        List_L1("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}
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
    //                    List_L1("Promo Types Count", "xpath", "/html/body/div/div[4]/div/div/div", ParentTest, "no_jira");             
    //                        if (FAIL) { return;} 
                                for (int j = 0; j < L1.size(); j++) {
                                    Element_Text("Promo Type:", L1.get(j), ParentTest, "no_jira");             
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
    //                    List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", ParentTest, "no_jira");             
    //                        if (FAIL) { return;} 
                                for (int j = 0; j < L1.size(); j++) {
                                    Element_Text("Promo State:", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}
                                }   
                        Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}  


                        Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}  
    //                        Element_By_Path_Click("Create promo 'Cancel' Click", "xpath", "//*[contains(text(), 'cancel')]", ParentTest, "no_jira"); 
    //                            if (FAIL) { return;}
                        List_L1("Promo Count - Only 1 Active", "tagName", "tr", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Promotion Data Row", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}
                            }                              
                            break;          
                    default:
                            break;
                    }
                }   
            Element_By_Path_Click("New Site 'Cancel' Click", "xpath", "//*[contains(text(), 'Cancel')]", ParentTest, "no_jira");             
                if (FAIL) { return;}         
            Navigate_Back("Navigate Back","Add New Site page", "App Site page", ParentTest, "no_jira"); 
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                //if (FAIL) { return;}           
            // </editor-fold> 
        }
        
        
    } catch (Exception ex){}   // =============================================  
    } 
}
