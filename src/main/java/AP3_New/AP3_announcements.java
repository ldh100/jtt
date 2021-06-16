package AP3_New;
class AP3_announcements extends AP3_GUI{
    protected AP3_announcements (AP3_GUI a) throws InterruptedException, Exception {
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        
        BaseAPI = a.BaseAPI;
        
        New_ID = a.New_ID;
        app = a.app;
        SITE = a.SITE;
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        _All_data = a._All_data;
    }    
    protected void run() throws InterruptedException, Exception   { 
        String API_Response_Body = "";
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Announcements' Click", "xpath", "//*[contains(text(), 'Announcements')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}        
        Page_URL("Announcements page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
           if (FAIL) { return;}          
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
                  
        List_L0("Announcements Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Announcement Data Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                if (FAIL) { return;}        
            }       
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");             
                if (FAIL) { return;}
            }        
        To_Bottom("Move to page Bottom", ParentTest, "no_jira");
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
        // ============  Announcements Sorting
        To_Top("Move to page Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Click("Announcement App Sort Click", L1.get(2), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
        List_L0("Announcements Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Announcement Data Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                if (FAIL) { return;}        
            }
        Element_Click("Announcement Status Click", L1.get(5), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
        List_L0("Announcements Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Announcement Data Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Announcement Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
                if (FAIL) { return;}        
            }       
 
        // ============ All Announcements               
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
            
        List_L0("Announcements Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Announcement Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Announcement Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");             
                if (FAIL) { return;}        
            } 
        To_Top("Move to page Top", ParentTest, "no_jira");
            if (FAIL) { return;}   
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");             
            if (FAIL) { return;}       
        Element_Click("App Sort Click", L1.get(2), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");          
                if (FAIL) { return;}
            }    
            
        //   New  / Edit / Delete
        Find_Text("Find 'New..' Text", "NEW ANNOUNCEMENT",true,ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Click("Button 'New Announcement' click", "css", "[type='submit']", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);             
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);       
        Page_URL("New Announcement page URL", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
           if (FAIL) { return;} 
        List_L2("v-cards Count", "xpath", "//div[@class='v-card-content']", ParentTest, "no_jira");             
            if (FAIL) { return;} 
            for (int i = 0; i < L2.size(); i++) {
                switch (i) { 
                    case 0: 
                        Scroll_to_Element("Scroll to Card " + i, L2.get(0), ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", ParentTest, "no_jira");         
                            if (FAIL) { return;}                        
                        Element_By_Path_Text_Enter("Enter new Announcement Name", "css", "[aria-label='Announcement Name']", "Auto Announcement " + New_ID, false, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                            
                        Find_Text("Find 'Cancel' text", "Cancel", true,ParentTest, "no_jira"); 
                            if (FAIL) { return;}
                        Find_Text("Find 'Create Announcement' text", "Create Announcement", true,ParentTest, "no_jira"); 
                            if (FAIL) { return;}                            
                            
                        Element_By_Path_Click("Announcement Type Dropdown Open", "css", "[aria-label='Announcement Type']", ParentTest, "no_jira");
                             if (FAIL) { return;} 
                        Element_E1_Find("Find 'Announcement Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}                          
                        Element_Child_List_L1("Announcement Types' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Announcement Type:", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}                            
                            }
                        Element_By_Path_Click("Select 'Other' Type", "xpath", "//*[contains(text(), '" + "Other" + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_By_Path_Attribute("Announcement Other Type Text", "css", "[aria-label='Type']", "placeholder", ParentTest, "no_jira");
                             if (FAIL) { return;}                           
                        Element_By_Path_Click("Other Type text input Click", "css", "[aria-label='Type']", ParentTest, "no_jira");
                             if (FAIL) { return;}                             
                        Element_By_Path_Text_Enter("Enter Other Type", "css", "[aria-label='Type']", "Auto_Other_Type", false, ParentTest, "no_jira");
                            if (FAIL) { return;}
                            
//                        Element_By_Path_Attribute("Announcement App Prompt", "css", "[aria-label='Select App']", "placeholder", ParentTest, "no_jira");
//                             if (FAIL) { return;}
                        Element_By_Path_Click("Announcement App Dropdown Open", "css", "[aria-label='Select App']", ParentTest, "no_jira");
                             if (FAIL) { return;} 
                        Element_E1_Find("Find 'Announcement App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}                          
                        Element_Child_List_L1("Announcement App' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Application:", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}                            
                            }
                        Element_By_Path_Click("Select '" + app + "' App", "xpath", "//*[contains(text(), '" + app + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}  
                        Element_By_Path_Click("Click 'Create Announcement'", "xpath", "//*[contains(text(), 'Create Announcement')]", ParentTest, "no_jira"); 
                            //if (FAIL) { return;}     >>>>>>>>>> Toast >>>>>
                        
                        String s = "Search Sites (" + app + ")";
                        Find_Text("Find 'Search..' text", s, true,ParentTest, "no_jira"); 
                            if (FAIL) { return;}                            
                        Element_By_Path_Click("Click 'Search Sites...'", "css", "[aria-label='" + s + "']", ParentTest, "no_jira");
                             if (FAIL) { return;} 
                        Element_By_Path_Text_Enter("Enter 'Search Sites...'", "css", "[aria-label='" + s + "']", SITE, false, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        List_Child_E1_By_Path("Find 'Sites...' list", L2.get(i), "xpath", ".//div[@class='v-list list-panel theme--light']", ParentTest, "no_jira");
                            if (FAIL) { return;}                           
                        Element_Child_List_L1("Sites' Count", e1, "xpath", ".//label[@class='v-label theme--light']", ParentTest, "no_jira");              
                           T_Index = -1;
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Selection " + (j+1) + " Name", L1.get(j), ParentTest, "no_jira");             
                                    if (FAIL) { return;}   
                                if(t.trim().equals(SITE)){
                                    T_Index = j;
                                }
                            }         
                        if(T_Index > -1){
                            Element_Click("Check '" + SITE + "'", L1.get(T_Index), ParentTest, "no_jira");
                                if (FAIL) { return;}                                
                        } else{
                           // EX = no SITE
                        }   
                        
                        Text_Found("Enable this announcement...", "Enable this announcement to see", ParentTest, "no_jira");
                        if(t.equals("Not Found")){  
                            Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", ParentTest, "no_jira");
                                if (FAIL) { return; }
                                Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                                    if (FAIL) { return;}                          
                                Element_Child_List_L1("Positions' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                                    for (int j = 0; j < L1.size(); j++) {
                                        Element_Text("Available Position:", L1.get(j), ParentTest, "no_jira");             
                                        if (FAIL) { return;}                            
                                    }
                                Element_Click("Select 1st Available Position", L1.get(0),ParentTest, "no_jira");
                                    if (FAIL) { return;} 
                         }else{
                            Find_Text("Find Notification text", "Enable this announcement to see", true,ParentTest, "no_jira");
                                if (FAIL) { return; }
//                            Find_Text("Find 'Status' text", "Status", true,ParentTest, "no_jira");
//                                if (FAIL) { return; }
//                            Element_By_Path_Text("Find 'Status'", "xpath", "//input[@aria-label='Status']/parent::div", ParentTest, "no_jira"); 
//                                if (FAIL) { return; }
                         }
                        break;
                    case 1:  
                        Element_By_Path_Click("Click 'Create Announcement'", "xpath", "//*[contains(text(), 'Create Announcement')]", ParentTest, "no_jira"); 
                            //if (FAIL) { return;}     >>>>>>>>>> Toast >>>>>                       
                        Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", ParentTest, "no_jira");         
                            if (FAIL) { return;}  
                        Scroll_to_Element("Scroll to Card " + i, L2.get(1), ParentTest, "no_jira");
                            if (FAIL) { return;}
                        List_Child_E1_By_Path("Find EN Title", L2.get(i), "css", "[aria-label='Title']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}                        
                        Element_Click("Click EN Title", e1, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_Text_Enter("Enter EN Title", e1, "EN Title " + New_ID, ParentTest, "no_jira");
                            if (FAIL) { return;}                         
                        Element_Child_List_L1("textarea Count", L2.get(1), "tagName", "textarea", ParentTest, "no_jira");             
                            //if (FAIL) { return;}                          
                            Element_Click("Click EN Description", L1.get(0),ParentTest, "no_jira");
                                if (FAIL) { return;} 
                            Element_Text_Enter("Enter EN Description", L1.get(0), "EN Description " + New_ID, ParentTest, "no_jira");
                                if (FAIL) { return;}                                                  
                            Element_Click("Click EN Sub Text", L1.get(1), ParentTest, "no_jira");
                                if (FAIL) { return;} 
                            Element_Text_Enter("Enter Sub Text", L1.get(1), "EN Sub Text " + New_ID, ParentTest, "no_jira");
                                if (FAIL) { return;} 
                            break;
                    case 2:  
                        Element_Child_Attribute("Sub-title " + i, L2.get(i), "xpath", ".//div[@class='H5-Primary-Left']", "textContent", ParentTest, "no_jira");         
                            if (FAIL) { return;}  
                        Scroll_to_Element("Scroll to Card " + i, L2.get(2), ParentTest, "no_jira");
                        List_Child_E1_By_Path("Find EN Title", L2.get(i), "css", "[aria-label='Title']", ParentTest, "no_jira"); 
                            if (FAIL) { return;}                        
                        Element_Click("Click FR Title", e1, ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_Text_Enter("Enter FR Title", e1, "FR Titre " + New_ID, ParentTest, "no_jira");
                            if (FAIL) { return;}                         
                        Element_Child_List_L1("textarea Count", L2.get(2), "tagName", "textarea", ParentTest, "no_jira");             
                            //if (FAIL) { return;}                          
                            Element_Click("Click FR Description", L1.get(0),ParentTest, "no_jira");
                                if (FAIL) { return;} 
                            Element_Text_Enter("Enter FR Description", L1.get(0), "FR la Description " + New_ID, ParentTest, "no_jira");
                                if (FAIL) { return;}                                                  
                            Element_Click("Click FR Sub Text", L1.get(1), ParentTest, "no_jira");
                                if (FAIL) { return;} 
                            Element_Text_Enter("Enter Sub Text", L1.get(1), "FR la SubText " + New_ID, ParentTest, "no_jira");
                                if (FAIL) { return;}                 
                        break;
                    default:
                        break;
                }
            }     
        Element_By_Path_Click("Click 'Create Announcement'", "xpath", "//*[contains(text(), 'Create Announcement')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);           
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
            
        // ============ All Announcements   
        To_Bottom("Move to page Bottom", ParentTest, "no_jira");
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
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
            }
        Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);              
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        To_Bottom("Move to page Bottom", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
            
        List_L0("Announcements Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            T_Index = -1; 
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Announcement Row Text", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.startsWith("Auto Announcement " + New_ID)){
                    T_Index = i;
                }
            } 
        Move_to_Element("Scroll to Created Announcement", L0.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_XY("Scroll up to make ^ 'clickable'", 0, -100, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Child_List_L2("Data fields Count", L0.get(T_Index), "tagName", "td", ParentTest, "no_jira");             
            if (FAIL) { return;}    
            
        Element_Text("Announcement Sites text", L2.get(4), ParentTest, "no_jira");   
        Element_Click("Click 'Sites'", L2.get(4), ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_E1_Find("Find 'Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active v-dialog--persistent']", ParentTest, "no_jira");
            if (!FAIL) {  // Find fragment     
                Element_Child_E2("Find 'Sites' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_Text("Find 'Sites' dialog Title text", e2, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Find_Text("Find target Site", SITE, true, ParentTest, "no_jira"); 
                    if (FAIL) { return;}  
                Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='Edit']", ParentTest, "no_jira");
                    //if (FAIL) { return;} 
                Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='Cancel']", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_Click("Click dialog 'Cancel' ", e2, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            }
        Element_Text("Announcement Image text", L2.get(5), ParentTest, "no_jira"); 
        Element_Click("Click 'View Image'", L2.get(5), ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_E1_Find("Find 'Sites' dialog", "xpath", ".//div[@class='v-dialog v-dialog--active v-dialog--persistent']", ParentTest, "no_jira");
            if (!FAIL) {    // Find fragment 
        Element_Child_E2("Find 'Image(s)' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center']", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_Text("Find 'Image(s)' dialog Title text", e2, ParentTest, "no_jira");
            if (FAIL) { return;}      
        Find_Text("Find 'En...' version text", "English Version", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Fr...' version text", "French Version", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}

        Element_Child_List_L1("Images Count", e1, "tagName", "img", ParentTest, "no_jira");              
            for (int j = 0; j < L1.size(); j++) {        
                Element_Attribute("Image " + j + " src", L1.get(j), "src", ParentTest, "no_jira");             
                if (FAIL) { return;}  
            }          
        Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='EDIT']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Text("Botton 'Edit' text", e2, ParentTest, "no_jira");      
        Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='Cancel']", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_Text("Botton 'Cancel' text", e2, ParentTest, "no_jira");
        Scroll_to_Element("Scroll to 'Cancel' button", e2, ParentTest, "no_jira");
            if (FAIL) { return;}                    
        Element_Click("Click dialog 'Cancel' ", e2, ParentTest, "no_jira");
            if (FAIL) { return;}                    
    }        
    Element_Click("Select Created Announcement", L2.get(1), ParentTest, "no_jira");
        if (FAIL) { return;}
    Thread.sleep(500);              
    Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) { return;} 
    Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", ParentTest, "no_jira"); 
        if (FAIL) { return;} 
     Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
       if (FAIL) { return;} 
    Page_URL("Created Announcements page URL", ParentTest, "no_jira"); 
        String A_ID = "";           
        if(t.contains("/")){
            A_ID = t.substring(t.lastIndexOf("/") + 1);
            Call_API("Call /announcement/ API", BaseAPI + "/announcement/" + A_ID, true, ParentTest, "no_jira" );
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/announcement/" + A_ID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/announcement/" + A_ID, false, ParentTest.createNode("API Responce Error"));
                return;
            }

            
            API_Body_Contains("Announcement API - find Site ID", API_Response_Body, SiteID, true, ParentTest, "no_jira");    
            API_Body_Contains("Announcement API - find App", API_Response_Body, app, true, ParentTest, "no_jira"); 
            API_Body_Contains("Announcement API - find Name", API_Response_Body, "Auto Announcement " + New_ID, true, ParentTest, "no_jira");
            API_Body_Contains("Announcement API - find EN Title", API_Response_Body, "EN Title " + New_ID,  true, ParentTest, "no_jira");    
            API_Body_Contains("Announcement API - find EN Description", API_Response_Body, "EN Description " + New_ID, true, ParentTest, "no_jira");
            API_Body_Contains("Announcement API - find EN Sub Text", API_Response_Body, "EN Sub Text " + New_ID, true, ParentTest, "no_jira");  
            API_Body_Contains("Announcement API - find EN Button Text ", API_Response_Body, "Dismiss",true, ParentTest, "no_jira"); 
            API_Body_Contains("Announcement API - find Fr Description", API_Response_Body, "FR la Description " + New_ID,true, ParentTest, "no_jira"); 
            API_Body_Contains("Announcement API - find Type", API_Response_Body, "Auto_Other_Type",true, ParentTest, "no_jira");  
        }            

//            Move_to_Element_By_Path("Scroll up to Sites", "xpath", "//div[@class='v-list list-panel theme--light']", ParentTest, "no_jira");
//                if (FAIL) { return;}  // English Version
        Move_to_Element_By_Path("Scroll up to Position/Status", "xpath", "//div[text()='English Version']", ParentTest, "no_jira");
            if (FAIL) { return;}  // English Version
        Text_Found("Enable this announcement...", "Enable this announcement to see", ParentTest, "no_jira");
        if(t.equals("Not Found")){  
            Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}                          
            Element_Child_List_L1("Positions' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                for (int j = 0; j < L1.size(); j++) {
                    Element_Text("Available Position:", L1.get(j), ParentTest, "no_jira");             
                    if (FAIL) { return;}                            
                }
            Element_Click("Select 1st Available Position", L1.get(0),ParentTest, "no_jira");
                if (FAIL) { return;}         
        }else{
            Find_Text("Find 'Enable this announcement' Text", "Enable this announcement",true,ParentTest, "no_jira");             
                if (FAIL) { return;}
            if(t.contains("If not possible, disable another one")){  
                _t++; 
                _w++;
                EX += _t + "\t" + "Enable Announcement - not possible" + "\t" + "No Position available" + "\t" + t + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\r\n";    
                Log_Html_Result("WARN", "No Position available", true, ParentTest.createNode("Enable Announcement - not possible"));
            }else{
                Element_By_Path_Click("Announcement Status Dropdown Open", "css", "[aria-label='Status']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_E1_Find("Find 'Status' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) { return;}                          
                Element_Child_List_L1("Announcement Status' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Available Status:", L1.get(j), ParentTest, "no_jira");             
                        if (FAIL) { return;}  
                        if(t.trim().equals("Active")){
                            T_Index = j;
                        }
                    }
                    if(T_Index > -1){
                        Element_Click("Check '" + "Active" + "'", L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return;}   
                        Element_By_Path_Click("Announcement Position Dropdown Open", "css", "[aria-label='Position']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_E1_Find("Find 'Position' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}                          
                        Element_Child_List_L1("Announcement App' Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                            for (int j = 0; j < L1.size(); j++) {
                                Element_Text("Available Position:", L1.get(j), ParentTest, "no_jira");             
                                if (FAIL) { return;}                            
                            }
                        Element_Click("Select 1st Available Position", L1.get(0),ParentTest, "no_jira");
                            if (FAIL) { return;}                                
                    } else{
                       // EX += no BRAND
                    } 
            }
        }           
        To_Top("Move to page Top", ParentTest, "no_jira"); 
        Thread.sleep(1000);            
        Element_By_Path_Click("Delete Announcement Click", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
            if (FAIL) {    
                Thread.sleep(2000); // DEBUG - fluentWait for page reload bug
                Element_By_Path_Click("Delete Announcement Click again", "xpath", "//*[contains(text(), 'DELETE ANNOUNCEMENT')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}  
                Thread.sleep(500); 
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_E1_Find("Find 'Delete' dialog again", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
                    if (FAIL) { return;} 
            }            
        Find_Text("Find 'Delete..' Title", "Delete Announcement", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Delete..' warning", "Are you sure", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_Child_E2("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_Click("Click dialog 'Delete' ", e2, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);                  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Confirm Deleted", "Auto Announcement " + New_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Call_API("Call /announcemen/ API", BaseAPI + "/announcement/" + A_ID, false, ParentTest, "no_jira");    // A_ID or Site ID
//      Line 70:         "/announcement/{id}": {
//	Line 72:                 "summary": "Get Announcement",
//	Line 76:                         "schema": {"$ref": "#/definitions/Announcement"},
//	Line 93:                         "description": "announcement Not Found"
//	Line 104:                     "description": "Id of the entity to which announcement is specifically related.",
//	Line 110:                 "summary": "Delete announcement item",
//	Line 150:                     "description": "Id of the announcement",            
    }
}
