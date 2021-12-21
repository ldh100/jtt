package AP3;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

class AP3_brand extends AP3_GUI{
    protected AP3_brand (AP3_GUI a) {
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
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");             
            if (FAIL) { return;}
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}        
        Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");             
            if (FAIL) { return;}                    
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);     
        Page_URL("Sites page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
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
 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Site Search Field", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
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
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        Element_By_Path_Text("Site Address text", "xpath", "//div[contains(@class, 'timezone-address')][1]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_By_Path_Text("Site Timezone text", "xpath", "//div[contains(@class, 'timezone-address')][2]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
            if(!"empty".equals(t) && t.contains(" ")) {
                TZone = t.substring(t.indexOf(" ")).trim();// ===================================
            } else{
                TZone = "NotFound";
            }
            
        Element_By_Path_Text("Site 'Station List' text", "xpath", "//div[contains(@class, 'H6-Selected')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Text("Site Configuration", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        List_L0("Sites Unit(s) Count", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        int BRAND_TABLE_COL_COUNT = 0;    
        for (int i = 0; i < L0.size(); i++) {
            Element_Child_Attribute("Brand Name", L0.get(i), "xpath", ".//h3[contains(@class, 'brand-name')]", "textContent", ParentTest, "no_jira");   
                if (FAIL) { return;}
            Element_Child_Attribute("Brand Unit", L0.get(i), "xpath", ".//h4[contains(@class, 'Brand-Unit')]", "textContent", ParentTest, "no_jira");   
                if (FAIL) { return;}
            Element_Child_List_L1("Unit Stations Count", L0.get(i), "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            for (int j = 2; j < L1.size(); j++) {  
                List_TR_TDs("Station " + (j - 1), L1.get(j), ParentTest, "no_jira");      
                    if (FAIL) { continue;}
                if(t.trim().startsWith(BRAND)){
                    T_Index = j;
                    Element_Child_List_L2("Stations List Column Count", L1.get(j), "tagName", "td", ParentTest, "no_jira"); // remember Brand List wheere BRAND found
                    BRAND_TABLE_COL_COUNT = L2.size();
                    Element_Child_List_L2("Save Target Stations List", L0.get(i), "tagName", "tr", ParentTest, "no_jira"); // remember Brand List wheere BRAND found
                }
            }
        }     
//        Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND.replace("'", "\'") + "')]", ParentTest, "no_jira");        
//            if (FAIL) { return;} ///xPath doesn't work with "'" in find test
        Move_to_Element("Scroll to Brand data row", L2.get(T_Index), ParentTest, "no_jira");        
            if (FAIL) { return;} 
            
        if(BRAND_TABLE_COL_COUNT > 5){
            Brand_Status("Get Brand Status in App", L2.get(T_Index), ParentTest, "no_jira");        
                if (FAIL) { return;}  
            if(t.equals("Hidden in App")){ 
                Call_API("Call /location/group/ API", "", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true, ParentTest, "no_jira" );
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                API_Body_Contains("Location Group API - find Hidden Brand", API_Response_Body, BrandID, false, ParentTest, "no_jira");        
                    if (FAIL) { return;} 
                Brand_Status_Click("Status Click to 'Display'", L2.get(T_Index), ParentTest, "no_jira");  // was L1 ^^^
                    if (FAIL) { return;}
                Thread.sleep(500); 
                Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);     
                Call_API("Call /location/group/ API", "", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true, ParentTest, "no_jira");
                if(t.startsWith("{")){
                    API_Response_Body = t;  
                    API_Body_Contains("Location Group API - find Displayed Brand", API_Response_Body, BrandID, true, ParentTest, "no_jira");                         
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                }
            } else {
                Brand_Status_Click("Status Click to 'Hide'", L2.get(T_Index), ParentTest, "no_jira");  
                    if (FAIL) { return;} 
                Thread.sleep(500); 
                Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500); 
                Call_API("Call /location/group/ API", "", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true, ParentTest, "no_jira");     
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                    API_Body_Contains("Location Group API - find Hidden Brand", API_Response_Body, BrandID, false, ParentTest, "no_jira");        
                 }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                }

                Brand_Status_Click("Status Click to 'Display'", L2.get(T_Index), ParentTest, "no_jira");  
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Call_API("Call /location/group/ API", "", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true,  ParentTest, "no_jira" );
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                    API_Body_Contains("Location Group API - find Displayed Brand ID", API_Response_Body, BrandID,true, ParentTest, "no_jira"); 
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                }
            }
        }            
        Element_Child_List_L2("Stations List Column Count", L2.get(T_Index), "tagName", "td", ParentTest, "no_jira"); // remember Brand List wheere BRAND found
            if (FAIL) { return;} 
        Element_Click("Click Brand '" + BRAND + "' row", L2.get(0), ParentTest, Ver);
            if (FAIL) { return;}             
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);             
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);        
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}                                                              
        Thread.sleep(500); 
        List_L0("Brand Configuration Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");             
            if (FAIL) { return;}    
        List_L1("Brand Configuration Groups Count", "xpath", "//div[starts-with(@id, 'toc-')]", ParentTest, "no_jira");             
            if (FAIL) { return;}  
        if(L0.size() != L1.size()){
            //
        }
        
        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            Element_Attribute("Brand Configuration Navigation >>>>>>", L0.get(i), "textContent", ParentTest, "no_jira"); 
                if (FAIL) return;
            String CHOICE = t; 
            Element_Click("Click '" + CHOICE + "'", L0.get(i), ParentTest, "no_jira"); 
                if (FAIL) return;
            switch (CHOICE) { 
                case "Station Information":   
                    Element_By_Path_Attribute(" = Phone Preview Image", "tagName", "img", "src", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Element_By_Path_Attribute(" = Phone Preview Brand Name", "xpath", "//span[contains(@class,'H5-Black-High-Emphasis-Left')]", "textContent",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Element_By_Path_Attribute(" = Phone Preview Location", "xpath", "//span[contains(@class,'H6-Black-Medium-Emphasis-Left')]", "textContent",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    break;
                case "Fee Setup":       
                    Find_Text("Find 'Enable Fee' text", "Enable Fee", true,ParentTest, "no_jira"); 
                        if (FAIL) { return; }
                    Find_Text("Find 'Service Fee' text", "Service Fee", true,ParentTest, "no_jira"); 
                        if (FAIL) { return; }
                    Find_Text("Find 'Delivery Fee' text", "Delivery Fee", true,ParentTest, "no_jira"); 
                        if (FAIL) { return; }
                    break; 
                case "Pickup Details":   
                    Text_Found("Is Pickup Enabled?", "Pickup is not enabled", ParentTest, "no_jira"); 
                    if(t.equals("Not Found")){                    
                        Find_Text("Find 'Timeslot Length' text", "Timeslot Length", true,ParentTest, "no_jira");                      
                        Element_By_Path_Click("Click 'Timeslot Length' value", "css", "[aria-label='Timeslot Length']",ParentTest, "no_jira"); 
                        Element_By_Path_Text_Select_Copy("Get 'Timeslot Length' value", "css", "[aria-label='Timeslot Length']",ParentTest, "no_jira"); 
                        if (!FAIL && !t.equals("not found!")) { 
                            String Minutes = t;
                            Element_By_Path_Input_Select_Clear("Clear 'Timeslot Length'", "css", "[aria-label='Timeslot Length']",ParentTest, "no_jira");                            
                            //Element_By_Path_Text("Find 'Timeslot Length < 1 min' message ", "xpath", "//div[contains(text(), 'at least 1 minute')]", ParentTest, "no_jira");                            
                            Element_By_Path_Text_Enter("Enter 'Timeslot Length'", "css", "[aria-label='Timeslot Length']", Minutes, false,ParentTest, "no_jira"); 
                        } 
                        
                        Find_Text("Find 'Avg Prep time' text", "Average Prep Time", true,ParentTest, "no_jira"); 
                            if (FAIL) { return; } 
                        Element_By_Path_Click("Click 'Average Prep Time' value", "css", "[aria-label='Average Prep Time']",ParentTest, "no_jira"); 
                        Element_By_Path_Text_Select_Copy("Get 'Average Prep Time' value", "css", "[aria-label='Average Prep Time']",ParentTest, "no_jira"); 
 
                        Find_Text("Find 'Cust per Slot' text", "Customers Per Slot", true,ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Click("Click 'Cust per Slot' value", "css", "[aria-label='Customers Per Slot']",ParentTest, "no_jira");                            
                        Element_By_Path_Text_Select_Copy("Get 'Cust per Slot' value", "css", "[aria-label='Customers Per Slot']",ParentTest, "no_jira"); 
                            
                        Find_Text("Find 'ASAP pickup' text", "ASAP Pickup", true,ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Attribute("Find 'DISABLE' text", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", "textContent", ParentTest, "no_jira"); 
                            if (FAIL) { return; }                                                             
                        Element_By_Path_Click("Click 'DISABLE'", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Text("Find 'CANCEL'", "xpath", "//*[contains(text(), 'cancel')]", ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Text("Find 'Save..'", "xpath", "//*[contains(text(), 'save')]", ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'cancel')]",ParentTest, "no_jira"); 
                            if (FAIL) { return;}    
                    } else {
                        Call_API("Call '/location/brand/' API", "", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true, ParentTest, "no_jira" );
                        if(t.startsWith("{")){
                            API_Response_Body = t;               
                        }else{
                            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                            return;
                        }
                        Brand_API_Is("Brand API Pickup Supported",  API_Response_Body, "pickup_supported", false, ParentTest, "no_jira" );
                        Find_Text("Find '...enable Pickup' text", "to enable Pickup", true, ParentTest, "no_jira"); 
                    }
                    break;
                case "Delivery Details":      
                    Call_API("Call /location/group/'SiteID'/deliverydestination", "Bearer " + AP3_TKN, BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", true, ParentTest, "no_jira");
                    if(t.startsWith("{")){
                        API_Response_Body = t;               
                    }else{
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }        
                    JSONObject json = new JSONObject(API_Response_Body);
                    JSONArray delivery_destinations = json.getJSONArray("delivery_destinations"); 

                    if (delivery_destinations.isEmpty()) {
                        EX += " - " + "\t" + "Delivery Details - No Locations" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                    } else {
                        List_L2("Check if 'Delivery Details' is enabled", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'DISABLE')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        if (!L2.isEmpty()) {
                            Element_By_Path_Click("Click > 'DISABLE' on 'Delivery Details'", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'DISABLE')]", ParentTest, "no_jira");
                                if (FAIL) { return;}
                            Wait_For_Element_By_Path_Presence("Wait for 'Disable ...' to appear", "xpath", "//*[contains(text(),'Delivery Program')]", ParentTest, "no_jira");
                                if (FAIL) { return;}
                            Element_By_Path_Click("Click > 'Confirm Disabling' input field", "xpath", "//*[contains(text(),'Delivery Program')]/parent::div//*[contains(text(),'Confirm Disabling')]", ParentTest, "no_jira");
                                if (FAIL) { return;}
                            Element_By_Path_Text_Enter("Enter 'DISABLE' in 'Confirm Disabling' input field", "xpath", "//*[contains(text(),'Delivery Program')]/parent::div//*[@aria-label='Confirm Disabling']", "DISABLE", false, ParentTest, "no_jira");
                                if (FAIL) { return;}
                            Element_By_Path_Click("Click > 'SAVE' in dialog", "xpath", "//*[contains(text(),'Delivery Program')]/parent::div//*[text()='save']", ParentTest, "no_jira");
                                if (FAIL) { return;}
                        }
                        Wait_For_Element_By_Path_Presence("Check for 'Drop-off locations are added...' message", "xpath", "//span[contains(text(),'locations are added at the site level')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for '...setup details?' message", "xpath", "//span[contains(text(),'like to setup details')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Delivery Details' switch", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Set switch to 'Yes'", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Thread.sleep(500);
                    }                                                            
                    Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Timeslot Type' drop-down", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Type']/preceding-sibling::div", ParentTest, "np_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for dropdown to appear", "xpath", "(//div[contains(text(),'User Generated')])[1]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'User Generated' in drop-down", "xpath", "(//div[contains(text(),'User Generated')])[1]/ancestor::a", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_InVisibility("Wait for 'Choose Drop-off...' link to disappear", "xpath", "//a[contains(text(), 'Choose Drop-off')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check > 'Timeslot Table' to be present", "xpath", "//div[@class='timeslot-table']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check > '+ ADD TIMESLOT' button to be present", "xpath", "//div[contains(text(),'Add Timeslot')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > '+ ADD TIMESLOT' button", "xpath", "//div[contains(text(),'Add Timeslot')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Add New Timeslot' dialog to appear", "xpath", "//*[contains(text(),'Add New Timeslot')]", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                        
                    Element_By_Path_Click("Click > 'Start Time' input", "css", "[aria-label='Start Time']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_E1_Find("Get 'Start Time' drop-down", "xpath", "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
                        if (FAIL) { return;}                          
                    Element_Child_List_L2("Get list of shown 'Start Time(s)'", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_Text("Get Start Time [0]", L2.get(0), ParentTest, "no_jira");
                    Element_Click("Select/Enter Start Time [0]", L2.get(0), ParentTest, "no_jira");
                        if (FAIL) { return;} 

                    Element_By_Path_Click("Click > 'End Time' input", "css", "[aria-label='End Time']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_E1_Find("Get 'End Time' drop-down", "xpath", "//div[@class='v-menu__content theme--light v-menu__content--fixed menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
                        if (FAIL) { return;}                          
                    Element_Child_List_L2("Get list of shown 'End Time(s)'", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_Text("Get Start Time [5]", L2.get(5), ParentTest, "no_jira");
                    Element_Click("Select/Enter End Time [0]", L2.get(5), ParentTest, "no_jira");
                        if (FAIL) { return;}
                    
                    Element_E1_Find("Find 'Available Locations' container", "xpath", "//div[@class='v-list list-panel theme--light']", ParentTest, "no_jira");
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click > 'Search Locations' input", "css", "[aria-label='Search Locations']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Fill in Search 'Not Existing Location", "css", "[aria-label='Search Locations']", "Not Existing Location", false, ParentTest, "no_jira");
                        if (FAIL) { return;}                            
                    Element_Child_List_L1("Get list of available locations", e1, "xpath", ".//p[@class='list__tile']", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Path_Input_Select_Clear("Clear 'Search Locations'", "css", "[aria-label='Search Locations']", ParentTest, "no_jira");
                        if (FAIL) { return;}                            
                    Element_Child_List_L1("Get list of available locations", e1, "xpath", ".//p[@class='list__tile']", ParentTest, "no_jira");
                        if (FAIL) { return;}                          
                    if(L1.size() > 0) {
                        Element_By_Path_Click("Click > 'Choose Drop-off...' link", "xpath", "//p[contains(text(),'" + L1.get(0) + "')]/ancestor::div[contains(@class,'list-content')]/preceding-sibling::div", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Move_to_Element_By_Path("Move > 'Add' button", "xpath", "//div[contains(text(),'add')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Add' button", "xpath", "//div[contains(text(),'add')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for Timeslot table to be populated with new record ", "xpath", "//tr[@class='timeslot-row']/td[contains(text(),'" + L1.get(0) + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}                    
                    }else{
                        Move_to_Element_By_Path("Move > 'CANCEL' button", "xpath", "//div[contains(text(),'cancel')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'CANCEL' button", "xpath", "//div[contains(text(),'cancel')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}                        
                    }   

                    Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Timeslot Type' drop-down", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Type']/preceding-sibling::div", ParentTest, "np_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for drop-down to appear", "xpath", "(//div[contains(text(),'Automatic')])[1]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Automatic' in drop-down", "xpath", "(//div[contains(text(),'Automatic')])[1]/ancestor::a", ParentTest, "no_jira");
                        if (FAIL) { return;}     
                    Wait_For_Element_By_Path_Presence("Wait for 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Input_Select_Clear("Clear > 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Fill > 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", "1", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Average Prep Time' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Average Prep Time']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Customer Per Slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Customers per slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Input_Select_Clear("Clear > 'Customers per slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Fill > 'Customers per slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", "1", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Choose Drop-off...' to appear", "xpath", "//a[contains(text(), 'Choose Drop-off')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check for 'Selected Locations...' counter", "xpath", "//div[contains(text(), 'Selected Locations:')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check for 'Display timeslots...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'timeslots as one time')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check for 'Allow delivery...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'delivery instruction')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check for 'Enable Bolter...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'Enable Bolt')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Attribute("Get 'Display timeslots... switch state", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'timeslots as one time')]/following-sibling::div//div[contains(text(),'Yes')]/parent::div", "class", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    if (t.toLowerCase().contains("not-selected")) {
                        Wait_For_Element_By_Path_Presence("Check that swtich is set to 'No'", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'timeslots as one time')]/following-sibling::div//div[@class='Option-Right-Selected-Blue-White']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                    } else {
                        Wait_For_Element_By_Path_Presence("Check that swtich is set to 'Yes'", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'timeslots as one time')]/following-sibling::div//div[@class='Option-Left-Selected-Blue-White']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                    }               
                    break;
                case "Scan & Go Setup":   
                    Find_Text("Find 'Enable Scan ...'", "Enable Scan & Go?", true, ParentTest, "no_jira");                    
                    break;
                case "Assign Menus":  
                    // =============================================  ????
                    break;
                case "Integration Type": 
                    Find_Text("Find '...KDS Refunds'", "Allow for KDS Refunds", true, ParentTest, "no_jira");                    
                    break;
                case "Third Party Integration":
                    Find_Text("Find 'Request Phone...'", "Request Customer Phone Number at Checkout", true, ParentTest, "no_jira");                  
                    break;
                case "Menu Information":
                    Find_Text("Find 'Calorie Disclaimer'", "Calorie Disclaimer", true, ParentTest, "no_jira");
                    if (!FAIL) {
                        Find_Text("Find '...Requires Promo Exemptions...'", "Menu Requires Item Promo Exemptions:", true, ParentTest, "no_jira");
                        Find_Text("Find '...Requires Item PLU's...'", "Menu Requires Item PLU's:", true, ParentTest, "no_jira");
                        Find_Text("Find 'Showcase Items", "Showcase Items:", true, ParentTest, "no_jira");
                        Find_Text("Find '...Local Item Description Edits'", "Allow Local Item Description Edits:", true, ParentTest, "no_jira");
                        Find_Text("Find '...Local Menu Images'", "Allow Local Menu Images:", true, ParentTest, "no_jira");
                        Find_Text("Find '...Menu Calories Edits...'", "Allow Local Menu Calories Edits:", true, ParentTest, "no_jira");
                        Find_Text("Find '...App Item Naming'", "Allow In App Item Naming:", true, ParentTest, "no_jira");
                        Find_Text("Find '...Special Requests'", "Allow Special Requests:", true, ParentTest, "no_jira");
                    }                    
                    break;
                case "Payment ID":
                    // =============================================  ????
                    break;
                case "Meal Plan":
                    // =============================================  ????
                    break;
                case "Loyalty Program":  // Loyalty is not enabled for this brand
                    Find_Text("Find 'Loyalty is not enabled..'", "Loyalty is not enabled", true,ParentTest, "no_jira");                     
                    break;
                case "Payment Method Exclusion":  
                    Find_Text("Find 'Payment exclusions ..Credit card..'", "Credit Card", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Payment exclusions ..Apple Wallet..'", "Apple Wallet", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Payment exclusions ..Google Wallet..'", "Google Wallet", true, ParentTest, "no_jira"); 
//  Find_Text("Find 'Payment exclusions ..Meal Plans..'", "Meal Plans", true, ParentTest, "no_jira");          // DEBUG          
                    break;
                case "Web Ordering":  
                    Element_E1_Find("Find Web Ordering", "id", "web-order", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Element_Child_List_L1("Find 'Allow Web Ordering' options", e1,"xpath", ".//div[contains(@class, 'Option-Left')]", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Click 'Allow Web Ordering' - Yes", L1.get(0), ParentTest, "no_jira"); 
                        if (FAIL) { return;}                   
                    break;
                case "Frictionless":  
                    Element_E1_Find("Find 'Frictionless detail' section", "id", "frictionless-detail", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Element_Child_List_L1("Find 'Allow Frictionless' options", e1,"xpath", ".//div[contains(@class, 'Option-Left')]", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    Element_Click("Click 'Allow Frictionless' - Yes", L1.get(0), ParentTest, "no_jira"); 
                        if (FAIL) { return;} 
                    Element_E2_Find("Find 'Select Store' dialog", "xpath", "//div[@class='v-dialog__content v-dialog__content--active']", ParentTest, "no_jira"); 
                    Find_Text("Find 'Select store' Title", "Select store", true, ParentTest, "no_jira"); 
                    Element_Child_List_L1("Get 'Select Store' action buttons", e2, "xpath", ".//div[@class='v-btn__content']", ParentTest, "no_jira");
                        if (FAIL) { return; } 
                    Element_Text(" Find 'Select Store' > Cancel", L1.get(0), ParentTest, "no_jira"); 
                    Element_Text(" Find 'Select Store' > OK", L1.get(1), ParentTest, "no_jira"); 
                    Element_Click("Click 'Cancel'", L1.get(0), ParentTest, "no_jira"); 
                        if (FAIL) { return;}                                         
//                    Element_Child_Click("Open 'Store List' drop-down", e2, "xpath", ".//div[@class='v-select__selections']", ParentTest, "no_jira"); 
//                        if (FAIL) { return;}     
//                    List_L0("Get Store List", "xpath", "//table/tbody/tr/td[5]", ParentTest, "no_jira");
//                        if (FAIL) { return; }
                  
                    break;                    
                default:
                break;
            }
        }

        Navigate_Back("Navigate Back", "Brand Configuration","Brand", ParentTest, "no_jira"); 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);             
        Text_Found("Find 'Leave...' warning", "Leave without", ParentTest, "no_jira"); 
        if ("Found".equals(t)) {     
            Find_Text("Find 'Leave...' note", "Changes will be lost if you do not save.", true,ParentTest, "no_jira"); 
                if (FAIL) { return; }   
            Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira"); 
                if (FAIL) { return; }         
            Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }     
            Element_By_Path_Click(" 'LEAVE' Click", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
        } 
        List_L0("Brand Setup Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L0.size(); i++) {        
            Element_Text("Brand Setup Tab >>>>", L0.get(i), ParentTest, "no_jira"); 
            Tab_Name = t;
            if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                Page_URL("Schedules page URL", ParentTest, "no_jira"); 
                    if (FAIL) { return;}   
                if (platform.startsWith("DH")){
                    Find_Text("Menu > Unable.. for DH", "Unable", true,ParentTest, "no_jira"); 
                } else {
                    Find_Text("Find 'Schedule your...'", "Schedule Your Menus", true, ParentTest, "no_jira"); 
                    if(t.equals("Not Found")) { 
                        _t++;
                        _w++;
                        EX += _t + "\t" + " === " + platform + " Site: " + SITE + "\t" + "Brand: " + BRAND + "\t" + "Unable to schedule menus for " + platform + " locations" + "\t" + "WARN" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";                            
                        Log_Html_Result("WARN", "Unable to schedule menus for " + platform + " locations", false, ParentTest.createNode(_t + ". " + "Find 'Schedule your...'"), new Date());
                    } else{
                        Element_By_Path_Text("Find 'Schedule menu' button", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                            if (FAIL) return;   
                        Element_By_Path_Input_Select_Clear("Menu Search Clear", "xpath", "//input[contains(@repeatlabel, 'Search ')]",  ParentTest, "no_jira"); 
                            if (FAIL) { return;}            
                        Element_By_Path_Text_Enter("Enter Menu Name", "css", "[repeatlabel='Search Menus in " + BRAND + "']", "xxx_yyy", false, ParentTest, "no_jira"); 
                            if (FAIL) { return;}   
                        Element_By_Path_Text("Find 'Not Found' notification", "tagName", "td", ParentTest, "no_jira"); 
                            if (FAIL) { return; }
                        Element_By_Path_Click("Clear Search 'X' Click", "xpath", "//i[contains(@class, 'v-icon v-icon--link mdi mdi-close theme--light')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        List_L1("Menus Count", "tagName", "tr", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Menu Data Row Text", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}
                            }
                        To_Top("Move to page Top", ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }
                }
            } else if (Tab_Name.toLowerCase().contains("service")) { 
                Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Page_URL("Pickup page URL", ParentTest, "no_jira"); 
                    if (FAIL) { return;}   
                List_L1("Service Week Days count", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", ParentTest, "no_jira");             
                    if (FAIL) { return;} 
                if(L1.isEmpty()){ // Pickup is not enabled for this brand
                       Find_Text("Find 'not enabled...'", "Pickup is not enabled for this brand", true, ParentTest, "no_jira");                  
                }else{                     
                    for (int j = 0; j < L1.size(); j++) { 
                        Scroll_to_Day("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}                        
                        Element_Text("Service Week Day Labels", L1.get(j), ParentTest, "no_jira");             
                        Day_Schedule("Service Week Day Schedule", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }                    
                    To_Top("Move to page Top", ParentTest, "no_jira");             
                        if (FAIL) { return;}  

                    // Check Sunday 24 hours / Closed All Day > uncheck  
                    Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", ParentTest, "no_jira");   
                        if (FAIL) { return;}
                        if("true".equals(t)){
                            Element_By_Path_Click("UnCheck '24h Service'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                if (FAIL) { return; } 
                        } else {
                           Element_Child_Attribute("Sunday 'Closed All Day' state", L1.get(0), "css", "[aria-label='Closed All Day']", "aria-checked", ParentTest, "no_jira");   
                               if (FAIL) { return;}
                            if("true".equals(t)){  
                                Element_By_Path_Click("UnCheck 'Closed All Day'", "css", "[aria-label='Closed All Day']", ParentTest, "no_jira"); 
                                if (FAIL) { return; } 
                            } else {
                                Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                   if (FAIL) { return; } 
                                Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", ParentTest, "no_jira");   
                                    if (FAIL) { return;}
                                if("true".equals(t)){
                                    Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                       if (FAIL) { return; } 
                                }
                            }                  
                        }
                    String hR;
                    String mR;
                    hR = String.format("%02d",(int)(Math.random()*3 + 8));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_From = hR + ":" + mR + "AM";    
                    Time_Enter("Enter Sunday Opens Time", L1.get(0), "css", "[aria-label='Opens']", New_From, ParentTest, "no_jira");             
                        if (FAIL) { return;}                               // ^^^ Enter Text within 8:00-11:59 AM
                    hR = String.format("%02d",(int)(Math.random()*3 + 1));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_To = hR + ":" + mR + "PM";
                    Time_Enter("Enter Sunday Closes Time", L1.get(0), "css", "[aria-label^='Closes']", New_To, ParentTest, "no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 1:00-4:59 PM
                    Element_By_Path_Click("Click 'Sunday'  - activate 'Save'", "xpath", "//p[text()='Sunday']", ParentTest, "no_jira"); 
                        if (FAIL) { return;}    //  Save not visible after time enter/not selection    - DEBUG                                                                                       
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Call_API("Call '/location/brand/' API", "", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true, ParentTest, "no_jira" );
                    if(t.startsWith("{")){
                        API_Response_Body = t;               
                    }else{
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }          
                    Brand_API_Hours("Brand API - new Service Hours", API_Response_Body, "Pickup - day 0", New_From, New_To, true, ParentTest, "no_jira"); 
                        if (FAIL) { return;} // ^^ Check Brand API > Pickup / Delivery / others?                 ^^ "Delivery - day X
                    // =================   Refresh Page after Save and Select Service Tab
                    List_L0("Tabs Count - refresh after save", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    List_L1("Week Days - refresh after save", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}        
                    for (int j = 0; j < L1.size(); j++) { 
                        Scroll_to_Day("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}                        
                        Element_Text("Service Week Day Labels", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        Day_Schedule("Service Week Day Schedule", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }  
                    To_Top("Move to page Top", ParentTest, "no_jira");             
                        if (FAIL) { return;}
                }
            } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Page_URL("Delivery page URL", ParentTest, "no_jira"); 
                    if (FAIL) { return;}   
                List_L1("Delivery Week Days count", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", ParentTest, "no_jira");             
                    if (FAIL) { return;} 
                if(L1.isEmpty()){ // Delivery is not enabled for this station.
                       Find_Text("Find 'not enabled...'", "Delivery is not enabled for this station", true, ParentTest, "no_jira");                  
                }else{                   
                    for (int j = 0; j < L1.size(); j++) {
                        Scroll_to_Day("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                        Element_Text("Delivery Week Day Labels", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        Day_Schedule("Delivery Week Day Schedule", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}                           
                    }
                    // ===================================================================================================
                    To_Top("Move to page Top", ParentTest, "no_jira");             
                        if (FAIL) { return;}  

                    // Check Sunday 24 hours / Closed All Day > unchek  
                    Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", ParentTest, "no_jira");   
                        if (FAIL) { return;}
                        if("true".equals(t)){
                            Element_By_Path_Click("UnCheck '24h Service'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                if (FAIL) { return; } 
                        } else {
                           Element_Child_Attribute("Sunday 'Closed All Day' state", L1.get(0), "css", "[aria-label='Closed All Day']", "aria-checked", ParentTest, "no_jira");   
                               if (FAIL) { return;}
                            if("true".equals(t)){  
                                Element_By_Path_Click("UnCheck 'Closed All Day'", "css", "[aria-label='Closed All Day']", ParentTest, "no_jira"); 
                                if (FAIL) { return; } 
                            } else {
                                Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                   if (FAIL) { return; } 
                                Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", ParentTest, "no_jira");   
                                    if (FAIL) { return;}
                                if("true".equals(t)){
                                    Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", ParentTest, "no_jira"); 
                                       if (FAIL) { return; } 
                                }
                            }                  
                        }
                    String hR;
                    String mR;
                    hR = String.format("%02d",(int)(Math.random()*3 + 8));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_From = hR + ":" + mR + "AM";    
                    Time_Enter("Enter Sunday Delivery Opens Time", L1.get(0), "css", "[aria-label='Opens']", New_From, ParentTest, "no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 8:00-11:59 AM
                    hR = String.format("%02d",(int)(Math.random()*3 + 1));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_To = hR + ":" + mR + "PM";
                    Time_Enter("Enter Sunday Delivery Closes Time", L1.get(0), "css", "[aria-label^='Closes']", New_To, ParentTest, "no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 1:00-4:59 PM
                    Element_By_Path_Click("Click 'Sunday'  - activate 'Save'", "xpath", "//p[text()='Sunday']", ParentTest, "no_jira"); 
                        if (FAIL) { return;}    //  Save not visible after time enter/not selection    - DEBUG                                                                                       

                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}
                    Call_API("Call '/location/brand/' API", "", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true, ParentTest, "no_jira" );
                    if(t.startsWith("{")){
                        API_Response_Body = t;               
                    }else{
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "?nocache=1", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }                
                    Brand_API_Hours("Brand API - new Delivery Hours", API_Response_Body, "Delivery - day 0", New_From, New_To,true, ParentTest, "no_jira"); 
                        if (FAIL) { return;} // ^^ Check Brand API > Pickup / Delivery / others?                         ^^ "Delivery - day X"

                    // =================   Refresh Page after Save and Select Service Tab
                    List_L0("Tabs Count - refresh after save", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    List_L1("Week Days - refresh after save", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", ParentTest, "no_jira");             
                            if (FAIL) { return;} 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}        
                    for (int j = 0; j < L1.size(); j++) { 
                        Scroll_to_Day("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}                        
                        Element_Text("Delivery Week Day Labels", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                        Day_Schedule("Delivery Week Day Schedule", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }    
                } 
            } else if (Tab_Name.toLowerCase().contains("atation alosure")) {  
                Element_By_Path_Click("Click 'Station Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Page_URL("Station Closure page URL", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                 
            }
       }
    } catch (Exception ex){}   // =============================================  
    }  
}
