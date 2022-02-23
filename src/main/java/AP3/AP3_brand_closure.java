package AP3;

import java.util.Date;

class AP3_brand_closure extends AP3_GUI{
    protected AP3_brand_closure (AP3_GUI a) {
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
//                Element_Text("Application Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");         
//                if (FAIL) { return;}
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
        Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);     
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
           
        Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 

        List_L0("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L0.size(); i++) {        
            Element_Text("Brand Setup Tab >>>>", L0.get(i), ParentTest, "no_jira"); 
            Tab_Name = t;
            if (Tab_Name.toLowerCase().contains("closure")) {
                Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Page_URL("Closure page URL", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                     
                Find_Text("Find 'Add closure' text", "Add Station Closure", true,ParentTest, "no_jira"); 
                    if (FAIL) { return; }     
                // ======= Default Date / Time - today    
                Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                    if (FAIL) { return;}   
                Thread.sleep(500); 
                List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", ParentTest, "no_jira");             
                    if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Closure Data Row Text", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }
                Find_Text("Find '..Reason' text", "Closure Reason", true,ParentTest, "no_jira"); 
                    if (FAIL) { return; }
                Find_Text("Find 'Remove' text", "REMOVE", true,ParentTest, "no_jira"); 
                    if (FAIL) { return; }
                Find_Text("Find 'Save' text", "Save", true,ParentTest, "no_jira"); 
                    if (FAIL) { return; }
                Element_By_Path_Click(" 'SAVE' Click", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Element_By_Path_Text("Find 'required' text", "xpath", "//div[contains(@class,'v-messages__message')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; }                    
                Element_By_Path_Input_Select_Clear("Clear Closure Reason", "css", "[aria-label='Closure Reason']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}

 
                Element_By_Path_Text_Enter("Enter Closure Reason", "css", "[aria-label='Closure Reason']", "Auto Default Date Closure " + New_ID, false, ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Thread.sleep(500); 
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", ParentTest, "no_jira");             
                    if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Closure Data Row Text", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }
//                Element_By_Path_Text_Select_Copy("Saved Closure Reason", "xpath", "//input[@aria-label='Closure Reason']",ParentTest, "no_jira"); 
//                    if (FAIL) { return; }                    
                Element_By_Path_Text("Find 'closure under effect...'", "className", "Temporarily-closed-text", ParentTest, "no_jira"); 
                    if (FAIL) { return; }   
 Thread.sleep(60000); // Wait for data propagation  - takes too long !!!!               
                Call_API("Call 'calendar' API", "", BaseAPI + "/calendar/" + BrandID, true, ParentTest, "no_jira" );
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID+ "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                Calendar_API_Closure("Validate New Default Closure in 'calendar' API", API_Response_Body, "Auto Default Date Closure " + New_ID, true, ParentTest, "no_jira" );

                Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Thread.sleep(500);                    
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);      
 Thread.sleep(60000); // Wait for data propagation  - takes too long !!!!
                Call_API("Call 'calendar' API", "", BaseAPI + "/calendar/" + BrandID, true, ParentTest, "no_jira" );
                API_Response_Body = t;
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID+ "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }                
                Calendar_API_Closure("Validate Default Closure Removed in 'calendar' API", API_Response_Body, "Auto Default Date Closure " + New_ID, false, ParentTest, "no_jira" );          
               
                // ======= Future Date / Time - Next Month 1st day   
                Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", ParentTest, "no_jira"); 
                if (FAIL) { return; } 
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                    if (FAIL) { return;}   
                    Thread.sleep(500); 
                Element_By_Path_Click("Open 'Close' Calendar", "xpath", "//i[contains(@class, 'mdi-calendar-blank')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; }     
                Element_By_Path_Click("Click '>' to Next Month", "xpath", "//i[contains(@class, 'v-icon mdi mdi-chevron-right theme--light')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Element_By_Path_Click("Click day 2", "xpath", "//tr/td[contains(number(), 2)]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}  
                    
                String hR;
                String mR;
                hR = String.format("%02d",(int)(Math.random()*3 + 8));
                mR = String.format("%02d",(int)(Math.random()*59));
                New_From = hR + ":" + mR + "AM"; 
                
                Element_By_Path_Text_Enter("Enter '...will close' time", "xpath", "//input[@type='time'][1]", New_From, false, ParentTest, "no_jira");             
                    //if (FAIL) { return;}  // ^^^ Enter Text within 8:00-11:59 AM
                    
//                hR = String.format("%02d",(int)(Math.random()*3 + 1));
//                mR = String.format("%02d",(int)(Math.random()*59));
//                New_To = hR + ":" + mR + "PM"; // 12:45 AM
//                Element_By_Path_Text_Enter("Enter '...will re-open' time", "xpath", "//input[@type='time'][2]", New_To, false, ParentTest, "no_jira");             
//                    //if (FAIL) { return;}     // ^^^ Enter Text within 1:00-4:59 PM      ==============   Doesn't work ?????              

                Element_By_Path_Text_Enter("Enter Closure Reason", "css", "[aria-label='Closure Reason']", "Auto Future Closure " + New_ID, false, ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);     
                List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", ParentTest, "no_jira");             
                    if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Closure Data Row Text", L1.get(j), ParentTest, "no_jira");             
                            if (FAIL) { return;}
                    }
 Thread.sleep(60000); // Wait for data propagation - takes too long !!!!
                Call_API("Call 'calendar' API", "", BaseAPI + "/calendar/" + BrandID, true, ParentTest, "no_jira" );
                API_Response_Body = t;
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }                
                Calendar_API_Closure("Validate New Future Closure in 'calendar' API", API_Response_Body, "Auto Future Closure " + New_ID, true, ParentTest, "no_jira" );

                Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                Thread.sleep(500);                    
                Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);       
 Thread.sleep(60000); // Wait for data propagation - takes too long !!!!
                Call_API("Call 'calendar' API", "", BaseAPI + "/calendar/" + BrandID, true, ParentTest, "no_jira" );
                API_Response_Body = t;
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }                
                Calendar_API_Closure("Validate Future Closure Removed in 'calendar' API", API_Response_Body, "Auto Future Closure " + New_ID, false, ParentTest, "no_jira" );              
            }
        }
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    } 
    } 
}
