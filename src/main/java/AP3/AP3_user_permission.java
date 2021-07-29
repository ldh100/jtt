package AP3;

class AP3_user_permission extends AP3_GUI{
    protected AP3_user_permission(AP3_GUI a) {
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
        GL_MENU = a.GL_MENU;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    // in each Env:
    // cdl.test.xtt+rn@gmail.com - Runner // https://api.compassdigital.org/dev/user/auth?realm=bolter  
    // cdl.test.xtt+an@gmail.com - Admin no Allow refunds, no Allow Menu Kick-Outs
    // cdl.test.xtt+sy@gmail.com - SM All Optins
    // cdl.test.xtt+sn@gmail.com - SM No Options
    // cdl.test.xtt+dy@gmail.com - DM All Optins
    // cdl.test.xtt+dn@gmail.com - DM No Optins
    
    
    //Pre-requisite for this scope: The Brand should not have any existing Station Closure added
    protected void run() { 
    try {    
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);
        Page_URL("AP3 Login page", ParentTest, "no_jira");             
            if (FAIL) { return;}
            
        // logout >>>>>>>>>>>    
//        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
//            if (FAIL) { return;}
//        Thread.sleep(500);          
//        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
//            if (FAIL) { return;} 
//        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
//        Thread.sleep(500);
//        Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
//            if (FAIL) { return;}
        Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(),'Logout')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}  
       

        // @ST - Hiding this "Runner Login" code for me to run unit test   
        /*    
        // <editor-fold defaultstate="collapsed" desc="Runner Login" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      

        Element_By_Path_Text_Enter("Enter ==== Runner Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+rn@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Wait_For_Element_By_Path_Visibility("Wait for 'Cannot login...' text", "xpath", "//*[contains(text(), 'Cannot log into')]",  ParentTest, "no_jira");             
            if (FAIL) { return;}            
        Find_Text("Find 'Cannot login...' Text", "Cannot log into Admin Panel as a Runner",true, ParentTest, "no_jira");             
            if (FAIL) { return;}           
        // </editor-fold>     
        */
        
        // <editor-fold defaultstate="collapsed" desc="Admin N" >  
            // <editor-fold defaultstate="collapsed" desc="Admin N - Login, Dashboard, Sites" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      
        Element_By_Path_Text_Enter("Enter ==== Admin N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+an@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]",  ParentTest, "no_jira");             
            if (!FAIL) {  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
        if (!FAIL) {   
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
            Thread.sleep(500);          
            Find_Text("Admin N Dashboard 'Dashboard'", "Dashboard", true, ParentTest, "no_jira");  
            Find_Text("Admin N Dashboard 'Sites'", "Sites", true, ParentTest, "no_jira");   
            Find_Text("Admin N Dashboard 'Group Management'", "Group Management", true, ParentTest, "no_jira");                               
            Find_Text("Admin N Dashboard 'Menu Manager'", "Menu Manager", true, ParentTest, "no_jira"); 
            Find_Text("Admin N Dashboard 'Orders'", "Orders", true, ParentTest, "no_jira"); 
            Find_Text("Admin N Dashboard 'Sales Reporting'", "Sales Reporting", true, ParentTest, "no_jira"); 
            Find_Text("Admin N Dashboard 'Sales Analytics'", "Sales Analytics", true, ParentTest, "no_jira"); 
            Find_Text("Admin N Dashboard 'Users'", "Users", true, ParentTest, "no_jira");     
            Find_Text("Admin N Dashboard 'Announcements'", "Announcements", true, ParentTest, "no_jira"); 
            Find_Text("Admin N Dashboard 'Promo Management'", "Promo Management", true, ParentTest, "no_jira");
            Find_Text("Admin N Dashboard 'Smart Analytics'", "Smart Analytics", false, ParentTest, "no_jira");
            Find_Text("Admin N Dashboard 'Ap3 Notification'", "Ap3 Notification", true, ParentTest, "no_jira");             

            // Admin N Sites permissions
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Open App combobox", "css", "[role='combobox']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}     
            Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                     
            Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']",  ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Application Name (index " + i + ")", L1.get(i),   ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            Element_Click("Select 'All'", L1.get(T_Index),  ParentTest, "no_jira");
                if (FAIL) { return;}  
Thread.sleep(1000);
            Element_By_Path_Text("Admin N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 

            Find_Text("Admin N 'ADD NEW SITE'", "ADD NEW SITE", true, ParentTest, "no_jira"); 

            Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false,  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);     
            Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
               if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("Admin N Site 'Configuration'", "Configuration", true, ParentTest, "no_jira"); 
            Find_Text("Admin N 'Add Business Unit'", "Add Business Unit", true, ParentTest, "no_jira"); 
            Find_Text("Admin N 'Add Station'", "ADD STATION", true, ParentTest, "no_jira"); 

            List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                if (FAIL) { return;}
            List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === Admin No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("Admin No Options-Station visibility status (hide/unhide)"));
            }else{
                _f++;
                EX += _t + "\t" + " === Admin No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";
                Log_Html_Result("FAIL", "Disabled for "+ L1.size()  , true, ParentTest.createNode("Admin No Options-Station visibility status (hide/unhide)"));
            }            
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Admin N Brand Permissions" >               
            Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]",  ParentTest, "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                Element_Text("Brand Setup Tab >>>>", L3.get(i),  ParentTest, "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler 
                    Find_Text("Admin N 'Schedule menu'", "Schedule menu", true, ParentTest, "no_jira");  
                    List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                        if (FAIL) { return;}
                    List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L1.isEmpty()){
                        _p++;
                        EX += _t + "\t" + " === Admin No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("Admin No Options-Menu visibility status (hide/unhide)"));
                    }else{
                        _f++;
                        EX += _t + "\t" + " === Admin No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";
                        Log_Html_Result("FAIL", "Disabled for "+ L1.size()  , true, ParentTest.createNode("Admin No Options-Menu visibility status (hide/unhide)"));        
                    }                    
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}    
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);    
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;} 
                        
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);  
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;}   
                       
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }                         
                    Find_Text("Find 'Save' text", "Save", true, ParentTest, "no_jira"); 
                        if (FAIL) { return; }    
                    Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(1000);    
                }
            }   
            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(1000);   
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'Station Name'", "css", "[aria-label='Station Name']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}                    
            Element_By_Path_Text_Enter("Edit 'Station Name'", "css", "[aria-label='Station Name']", "Edit", false,  ParentTest, "no_jira"); 
                if (!FAIL) {
                    Find_Text("Find 'Save Changes' text", "Save Changes", true, ParentTest, "no_jira"); 
                    Element_By_Path_Click("Click 'CANCEL'", "xpath", "//*[text()='Cancel']", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                } else {
                    _t++; 
                    _f++;
                    EX += _t + "\t" + " === Adnim No Options " + "\t" + "Station Configuration" + "\t" + "Unable to Edit 'Station Name'" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";                        
                    Log_Html_Result("FAIL", "Unable to Edit 'Station Name'"  , true, ParentTest.createNode("Admin No Options-Station Configuration"));
                }      
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Admin N Group Management" >   
             Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Click Group Management", "xpath", "//*[contains(text(), 'Group Management')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);  
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Admin N 'Add New Group'", "add new group", true, ParentTest, "no_jira");     
            Element_By_Path_Click("Click 'Add New Group'", "xpath", "//*[contains(text(), 'add new group')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Admin N 'Create New Group'", "Create New Group", true, ParentTest, "no_jira");   
            Element_By_Path_Click("Click 'Add New Group' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Text("Admin N Groups (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Element_By_Path_Click("Select/Click 1st Group", "tagName", "td",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                

            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Admin N 'Edit Group' text", "Edit Group", true, ParentTest, "no_jira");   
            Element_By_Path_Click("Click 'Edit Group' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
             Element_By_Path_Click("Click '+ ADD GLOBAL MENU'", "xpath", "//button[@class='v-btn theme--light primary']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            // ST 
            //Element_By_Path_Click("Click '+ GLOBAL MENU'", "xpath", "//*[@id='operator']/div[126]/main[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]/div[1]",  ParentTest, "no_jira"); 
            //Element_By_Path_Click("Click '+ GLOBAL MENU'", "xpath", "//button[@type=‘submit’]//div[contains(text(),‘Global Menu’)]",  ParentTest, "no_jira"); 
            //Element_By_Path_Click("Click '+ GLOBAL MENU'", "xpath", "//button[@class=‘v-btn theme--light primary’]",  ParentTest, "no_jira"); ///button[@class=‘v-btn theme--light primary’]
            // end ST

            Find_Text("Admin N 'Enter Menu ... Name'", "Enter Global Menu Brand Name", true, ParentTest, "no_jira");   
            Element_By_Path_Click("Click 'New Global Menu' > Cancel", "xpath", "//div[@class='v-dialog__content v-dialog__content--active']//button[1]",  ParentTest, "no_jira"); 
            //Element_By_Path_Click("Click 'New Global Menu' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Click 1st Group 'Edit' icon", "xpath", "//button[contains(@class, 'v-btn v-btn--flat v-btn--icon theme--light grey--text')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Admin N 'Edit Menu ... Name'", "Edit Global Menu Brand Name", true, ParentTest, "no_jira");   
            _t++; 
            //Element_By_Path_Click("Click 'Edit Menu ... Name' > Cancel", "xpath", "//*[contains(text(), 'Cancel')]",  ParentTest, "no_jira"); 
            Element_By_Path_Click("Click 'Edit Menu ... Name' > Cancel", "xpath", "//*[@id='operator']/div[4]/div[1]/div[1]/div[3]/button[1]/div[1]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Admin N Menu Management" >   
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Click Menu Manager", "xpath", "//*[contains(text(), 'Menu Manager')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}


            Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']",  ParentTest, "no_jira");
                if (FAIL) return;   
            Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false,  ParentTest, "no_jira");
                    if (FAIL) { return;}    
            Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}                  
            Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);                
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']",  ParentTest, "no_jira"); 
                    if (FAIL) { return;}
            Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true, ParentTest, "no_jira");   
                if (FAIL) { return;} 
            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Global Menus')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Global Menus']", GL_MENU, false,  ParentTest, "no_jira");
                if (FAIL) { return;} 


            // logout >>>>>>>>>>>    
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(),'Logout')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            }  
        }
        // </editor-fold>
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="SM Y" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      
        Element_By_Path_Text_Enter("Enter ==== SM Y Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+sy@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]",  ParentTest, "no_jira");             
        if (!FAIL) {  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
        if (!FAIL) {       
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
            Thread.sleep(500);          
            Find_Text("SM Y Dashboard 'Dashboard'", "Dashboard", true, ParentTest, "no_jira");  
            Find_Text("SM Y Dashboard 'Sites'", "Sites", true, ParentTest, "no_jira");   
            Find_Text("SM Y Dashboard 'Group Management'", "Group Management", false, ParentTest, "no_jira");                               
            Find_Text("SM Y Dashboard 'Menu Manager'", "Menu Manager", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Orders'", "Orders", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Sales Reporting'", "Sales Reporting", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Sales Analytics'", "Sales Analytics", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Users'", "Users", false, ParentTest, "no_jira");     
            Find_Text("SM Y Dashboard 'Announcements'", "Announcements", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Promo Management'", "Promo Management", false, ParentTest, "no_jira");              
            Find_Text("SM Y Dashboard 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira"); 
            Find_Text("SM Y Dashboard 'Ap3 Notification'", "AP3 Notification", false, ParentTest, "no_jira"); 
            
             //SM Y Sites permissions
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Open App combobox", "css", "[role='combobox']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}     
            Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                     
            Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']",  ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Application Name (index " + i + ")", L1.get(i),   ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            Element_Click("Select 'All'", L1.get(T_Index),  ParentTest, "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            Element_By_Path_Text("SM Y Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}            
            Find_Text("SM Y 'ADD NEW SITE'", "ADD NEW SITE", false, ParentTest, "no_jira"); 
            
            Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false,  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
               if (FAIL) { return;} 

            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("SM Y Site 'Configuration'", "Configuration", false, ParentTest, "no_jira"); 
            Find_Text("SM Y 'Add Business Unit'", "Add Business Unit", false, ParentTest, "no_jira"); 
            Find_Text("SM Y 'Add Station'", "ADD STATION", false, ParentTest, "no_jira"); 
            
            List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                if (FAIL) { return;}
            List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === SM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("SM All Options-Station visibility status (hide/unhide)"));
     }else{
                _f++;
                EX += _t + "\t" + " === SM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
               Log_Html_Result("FAIL", "Disabled for "+ L1.size()  , true, ParentTest.createNode("SM All Options-Station visibility status (hide/unhide)"));
            } 
            // <editor-fold defaultstate="collapsed" desc="SN Y Brand Permissions" >               
            Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]",  ParentTest, "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                Element_Text("Brand Setup Tab >>>>", L3.get(i),  ParentTest, "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler    
                    Find_Text("SM Y 'Schedule menu'", "Schedule menu", true, ParentTest, "no_jira");                     
                    List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                        if (FAIL) { return;}
                    List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L1.isEmpty()){
                        _p++;
                        EX += _t + "\t" + " === SM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("SM All Options-Menu visibility status (hide/unhide)"));
 
                    }else{
                        _f++;
                        EX += _t + "\t" + " === SM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
                        Log_Html_Result("FAIL", "Disabled for "+ L1.size()  , true, ParentTest.createNode("SM All Options-Menu visibility status (hide/unhide)"));
                    }                                      
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}    
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);  
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;} 
                       
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(500);  
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;}   
                        
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }                         
                    Find_Text("Find 'Save' text", "Save", true, ParentTest, "no_jira"); 
                        if (FAIL) { return; }    
                    Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }
            }   
            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
               Log_Html_Result("PASS", "Edit 'Station Name' disabled" , false, ParentTest.createNode("SM All Options-Station Configuration"));

                } else {
                    _f++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                  Log_Html_Result("FAIL", "Edit 'Station Name' enabled - Expected disabled"  , true, ParentTest.createNode("SM All Options-Station Configuration"));

                }                    
            Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _f++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("FAIL", "Edit 'ASAP Pick-up' disabled"  , true, ParentTest.createNode("SM All Options-Station Configuration"));
                } else {
                    _p++;
                    EX += _t + "\t" + " === SM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'ASAP Pick-up' enabled" , false, ParentTest.createNode("SM All Options-Station Configuration"));
                }            
            //</editor-fold>   

            // <editor-fold defaultstate="collapsed" desc="SN Y Menu Management" >   
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Click Menu Manager", "xpath", "//*[contains(text(), 'Menu Manager')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
           //Site Manager has no permission to Global menus 
        
            // logout >>>>>>>>>>>    
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
        }  
        }
        //</editor-fold>   
        // </editor-fold>
       
        // <editor-fold defaultstate="collapsed" desc="SM N" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      
        Element_By_Path_Text_Enter("Enter ==== SM N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+sn@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]",  ParentTest, "no_jira");             
        if (!FAIL) {  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
        if (!FAIL) {     
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
            Thread.sleep(500);          
            Find_Text("SM N Dashboard 'Dashboard'", "Dashboard", true, ParentTest, "no_jira");  
            Find_Text("SM N Dashboard 'Sites'", "Sites", true, ParentTest, "no_jira");   
            Find_Text("SM N Dashboard 'Group Management'", "Group Management", false, ParentTest, "no_jira");                               
            Find_Text("SM N Dashboard 'Orders'", "Orders", true, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Sales Reporting'", "Sales Reporting", true, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Sales Analytics'", "Sales Analytics", true, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Users'", "Users", false, ParentTest, "no_jira");     
           // (Returning false error) Find_Text("SM N Dashboard 'Menu Manager'", "Menu Manager", false, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Announcements'", "Announcements", false, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Promo Management'", "Promo Management", false, ParentTest, "no_jira"); 
            Find_Text("SM N Dashboard 'Smart Analytics'", "Smart Analytics", false, ParentTest, "no_jira");
            Find_Text("SM N Dashboard 'Ap3 Notification'", "AP3 Notification", false, ParentTest, "no_jira"); 

            //SM N Sites permissions
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Open App combobox", "css", "[role='combobox']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}     
            Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                     
            Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']",  ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Application Name (index " + i + ")", L1.get(i),   ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            Element_Click("Select 'All'", L1.get(T_Index),  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(1000);
            Element_By_Path_Text("SM N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Find_Text("SM N 'ADD NEW SITE'", "ADD NEW SITE", false, ParentTest, "no_jira"); 
            Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false,  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
               if (FAIL) { return;}                 
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("SM N Site 'Configuration'", "Configuration", false, ParentTest, "no_jira"); 
            Find_Text("SM N 'Add Business Unit'", "Add Business Unit", false, ParentTest, "no_jira"); 
            Find_Text("SM N 'Add Station'", "ADD STATION", false, ParentTest, "no_jira"); 
            
            List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                if (FAIL) { return;}
            List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L0.size() == L1.size()){
                _p++;
                EX += _t + "\t" + " === SM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("PASS", "Disabled for all Stations" , false, ParentTest.createNode("SM No Options-Station visibility status (hide/unhide)"));

            }else{
                _f++;
                EX += _t + "\t" + " === SM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                Log_Html_Result("FAIL", "Enabled for " + L1.size() + " Stations" , true, ParentTest.createNode("SM No Options-Station visibility status (hide/unhide)"));
            } 
            // <editor-fold defaultstate="collapsed" desc="SM N Brand Permissions" >               
            Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
                if (FAIL) { return;}              
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]",  ParentTest, "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                Element_Text("Brand Setup Tab >>>>", L3.get(i),  ParentTest, "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    Find_Text("SM N 'Schedule menu'", "Schedule menu", false, ParentTest, "no_jira"); 
                    List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                        if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
                    List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L0.size() == L1.size()){
                        _p++;
                        EX += _t + "\t" + " === SM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("PASS", "Disabled for all Stations" , false, ParentTest.createNode("SM No Options-Menu visibility status (hide/unhide)"));
                    }else{
                        _f++;
                        EX += _t + "\t" + " === SM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                        Log_Html_Result("FAIL", "Enabled for " + L1.size()+ " Stations"  , true, ParentTest.createNode("SM No Options-Menu visibility status (hide/unhide)"));
                    }                    
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}    
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(500);     
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);     
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;}   
                    
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }                         
                    Find_Text("Find 'Save' text", "Save", true, ParentTest, "no_jira"); 
                        if (FAIL) { return; }    
                    Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }

            }   
            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                 
            Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'Station Name' disabled" , false, ParentTest.createNode("SM No Options-Station Configuration"));
                } else {
                    _f++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("FAIL", "Edit 'Station Name' enabled - Expected disabled"  , true, ParentTest.createNode("SM No Options-Station Configuration"));
                }                    
            Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                   Log_Html_Result("PASS", "Edit 'ASAP Pick-up' disabled" , false, ParentTest.createNode("SM No Options-Station Configuration"));
                 } else {
                    _f++;
                    EX += _t + "\t" + " === SM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                   Log_Html_Result("FAIL", "Edit 'ASAP Pick-up' enabled - Expected disabled"  , true, ParentTest.createNode("SM No Options-Station Configuration")); 
                }            
            // </editor-fold> 
////
            // <editor-fold defaultstate="collapsed" desc="SN N Menu Management" >   
             /// Limited Site Manager has no permission to Menu management
 
            // logout >>>>>>>>>>>    
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                
            Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        }  
        }
        // </editor-fold> 
// </editor-fold>
       
        // <editor-fold defaultstate="collapsed" desc="DM Y" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      
        Element_By_Path_Text_Enter("Enter ==== DM Y Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+dy@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500); 
        Wait_For_Element_By_Path_Visibility("Wait for 'Hey There...' text", "xpath", "//*[contains(text(), 'Hey There ')]",  ParentTest, "no_jira");             
        if (!FAIL) {  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
        if (!FAIL) {     
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");                        
            Thread.sleep(500);          
            Find_Text("DM Y Dashboard 'Dashboard'", "Dashboard", true, ParentTest, "no_jira");  
            Find_Text("DM Y Dashboard 'Sites'", "Sites", true, ParentTest, "no_jira");   
            Find_Text("DM Y Dashboard 'Group Management'", "Group Management", false, ParentTest, "no_jira");                               
            Find_Text("DM Y Dashboard 'Menu Manager'", "Menu Manager", true, ParentTest, "no_jira"); 
            Find_Text("DM Y Dashboard 'Orders'", "Orders", true, ParentTest, "no_jira"); 
            Find_Text("DM Y Dashboard 'Sales Reporting'", "Sales Reporting", true, ParentTest, "no_jira"); 
            Find_Text("DM Y Dashboard 'Sales Analytics'", "Sales Analytics", true, ParentTest, "no_jira"); 
            Find_Text("DM Y Dashboard 'Users'", "Users", true, ParentTest, "no_jira");     
            Find_Text("DM Y Dashboard 'Announcements'", "Announcements", true, ParentTest, "no_jira"); 
            Find_Text("DM Y Dashboard 'Promo Management'", "Promo Management", false, ParentTest, "no_jira");                     
            Find_Text("DM Y Dashboard 'Smart Analytics'", "Smart Analytics", true, ParentTest, "no_jira");
            Find_Text("DM Y Dashboard 'Ap3 Notification'", "AP3 Notification", false, ParentTest, "no_jira"); 
            
            // DM Y Sites permissions
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Open App combobox", "css", "[role='combobox']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}     
            Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                     
            Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']",  ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Application Name (index " + i + ")", L1.get(i),   ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            Element_Click("Select 'All'", L1.get(T_Index),  ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);                
            Element_By_Path_Text("DM Y Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}            
            Find_Text("DM Y 'ADD NEW SITE'", "ADD NEW SITE", false, ParentTest, "no_jira"); 
            
            Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false,  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                 
            Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
               if (FAIL) { return;} 
              
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("DM Y Site 'Configuration'", "Configuration", false, ParentTest, "no_jira"); 
            Find_Text("DM Y 'Add Business Unit'", "Add Business Unit", false, ParentTest, "no_jira"); 
            Find_Text("DM Y 'Add Station'", "ADD STATION", false, ParentTest, "no_jira"); 
            
            List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                if (FAIL) { return;}
            List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L1.isEmpty()){
                _p++;
                EX += _t + "\t" + " === DM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
               Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("DM All Options-Station visibility status (hide/unhide)"));
            }else{
                _f++;
                EX += _t + "\t" + " === DM All Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
                Log_Html_Result("FAIL", "Disabled for " + L1.size() + " Stations - Expected enabled"  , true, ParentTest.createNode("DM All Options - Station visibility status (hide/unhide)"));
            }
            // <editor-fold defaultstate="collapsed" desc="DM Y Brand Permissions" >               
            Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
                if (FAIL) { return;}               
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]",  ParentTest, "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                Element_Text("Brand Setup Tab >>>>", L3.get(i),  ParentTest, "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    Find_Text("DM Y 'Schedule menu'", "Schedule menu", true, ParentTest, "no_jira");                     
                    List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                        if (FAIL) { return;}
                    List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L1.isEmpty()){
                        _p++;
                        EX += _t + "\t" + " === DM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("PASS", "Enabled for all Stations" , false, ParentTest.createNode("DM All Options-Menu visibility status (hide/unhide)"));
           
                    }else{
                        _f++;
                        EX += _t + "\t" + " === DM All Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";
                   Log_Html_Result("FAIL", "Disabled for " + L1.size() + " Stations - Expected enabled"  , true, ParentTest.createNode("DM All Options - Menu visibility status (hide/unhide)"));
                    }                     
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}    
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(500);    
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;} 
                      
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);    
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;}   
                     
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }                         
                    Find_Text("Find 'Save' text", "Save", true, ParentTest, "no_jira"); 
                        if (FAIL) { return; }    
                    Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }             
            }   
            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}             
            Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'Station Name' disabled" , false, ParentTest.createNode("DM All Options-Station Configuration"));
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("FAIL", "Edit 'Station Name' enabled-Expected disabled"  , true, ParentTest.createNode("DM All Options - Station Configuration"));
                }                    
            Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _f++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "FAIL" + "\t" + "Expected enabled" + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("FAIL", "Disabled for " + L1.size() + " Stations - Expected enabled"  , true, ParentTest.createNode("DM All Options - Station Configuration"));
                } else {
                    _p++;
                    EX += _t + "\t" + " === DM All Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'ASAP Pick-up' enabled" , false, ParentTest.createNode("DM All Options-Station Configuration"));
                }           
            // </editor-fold>   
            
////
            // <editor-fold defaultstate="collapsed" desc=“DM Y Menu Management" >   
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Click Menu Manager", "xpath", "//*[contains(text(), 'Menu Manager')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
            // CDL delivery Manager has no permission to Global menus 

            // logout >>>>>>>>>>>    
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500);  
            Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
               
            Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        }
        }
        // </editor-fold>  
   
        // <editor-fold defaultstate="collapsed" desc="DM N" >
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",   ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}      
        Element_By_Path_Text_Enter("Enter ==== DM N Email", "css", "[aria-label='E-mail']", "cdl.test.xtt+dn@gmail.com", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", "Password1", false,  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500); 
        Wait_For_Element_By_Path_Visibility("Wait for 'Hey There..' text", "xpath", "//*[contains(text(), 'Hey There ')]",  ParentTest, "no_jira");             
        if (!FAIL) {  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira"); 
        if (!FAIL) {    
            Thread.sleep(500);                 
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");                        
            Thread.sleep(500);          
            Find_Text("DM N Dashboard 'Dashboard'", "Dashboard", true, ParentTest, "no_jira");  
            Find_Text("DM N Dashboard 'Sites'", "Sites", true, ParentTest, "no_jira");   
            Find_Text("DM N Dashboard 'Group Management'", "Group Management", false, ParentTest, "no_jira");                               
            Find_Text("DM N Dashboard 'Orders'", "Orders", true, ParentTest, "no_jira"); 
            Find_Text("DM N Dashboard 'Sales Reporting'", "Sales Reporting", true, ParentTest, "no_jira"); 
            Find_Text("DM N Dashboard 'Sales Analytics'", "Sales Analytics", true, ParentTest, "no_jira"); 
            Find_Text("DM N Dashboard 'Users'", "Users", true, ParentTest, "no_jira");     
            Find_Text("DM N Dashboard 'Announcements'", "Announcements", false, ParentTest, "no_jira"); 
            //(returning false error )Find_Text("DM N Dashboard 'Menu Manager'", "Menu Manager", false, ParentTest, "no_jira"); 
            Find_Text("DM N Dashboard 'Promo Management'", "Promo Management", false, ParentTest, "no_jira"); 
            Find_Text("DM N Dashboard 'Smart Analytics'", "Smart Analytics", false, ParentTest, "no_jira");
            Find_Text("DM N Dashboard 'Ap3 Notification'", "AP3 Notification", false, ParentTest, "no_jira"); 
            
            // DM N Sites permissions
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Element_By_Path_Click("Open App combobox", "css", "[role='combobox']",  ParentTest, "no_jira"); 
                if (FAIL) { return;}     
            Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                     
            Element_Child_List_L1("Application list Count", e1, "xpath", ".//div[@class='v-list__tile__title']",  ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Application Name (index " + i + ")", L1.get(i),   ParentTest, "no_jira");             
                    if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
            }
            Element_Click("Select 'All'", L1.get(T_Index),  ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(1000);
            Element_By_Path_Text("DM N Sites (Pagination)", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}            
            Find_Text("DM N 'ADD NEW SITE'", "ADD NEW SITE", false, ParentTest, "no_jira"); 
            
            Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false,  ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);                 
            Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']",  ParentTest, "no_jira"); 
               if (FAIL) { return;} 
            Thread.sleep(500);     
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
               if (FAIL) { return;} 
              
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]",  ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("DM N Site 'Configuration'", "Configuration", false, ParentTest, "no_jira"); 
            Find_Text("DM N 'Add Business Unit'", "Add Business Unit", false, ParentTest, "no_jira"); 
            Find_Text("DM N 'Add Station'", "ADD STATION", false, ParentTest, "no_jira"); 
            
     
            List_L0("Station Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
            List_L1("Station Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            _t++;
            if(L0.size() == L1.size()){
                _p++;
                EX += _t + "\t" + " === DM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("PASS", "Disabled for all Stations" , false, ParentTest.createNode("DM No Options-Station visibility status (hide/unhide)"));
            }else{
                _f++;
                EX += _t + "\t" + " === DM No Options " + "\t" + "Station visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                Log_Html_Result("FAIL", "Enabled for " + L1.size() + " Stations - Expected disabled"  , true, ParentTest.createNode("DM No Options-Station visibility status (hide/unhide)"));
            }
            // <editor-fold defaultstate="collapsed" desc="DM N Brand Permissions" >               
            Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",  ParentTest, "no_jira");
                if (FAIL) { return;}              
            Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
  
            List_L3("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]",  ParentTest, "no_jira");             
                if (FAIL) { return;} 
            for (int i = 0; i < L3.size(); i++) {        
                Element_Text("Brand Setup Tab >>>>", L3.get(i),  ParentTest, "no_jira");
                Tab_Name = t;  
                if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                    Find_Text("DM N 'Schedule menu'", "Schedule menu", false, ParentTest, "no_jira");  
                    List_L0("Menu Status icons Count", "xpath", "//i[contains(@class, 'v-icon mdi mdi-eye')]",  ParentTest, "no_jira");                       
                        if (FAIL) { return;}          // v-input v-input--selection-controls v-input--checkbox v-input--hide-details v-input--is-disabled theme--light
                    List_L1("Menu Status Disabled Count", "xpath", "//div[contains(@class, 'v-input--is-disabled theme--light')]",  ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    _t++;
                    if(L0.size() == L1.size()){
                        _p++;
                        EX += _t + "\t" + " === DM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Disabled for all Stations" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("PASS", "Disabled for all Stations" , false, ParentTest.createNode("DM No Options-Menu visibility status (hide/unhide)"));
                    }else{
                        _f++;
                        EX += _t + "\t" + " === DM No Options " + "\t" + "Menu visibility status (hide/unhide)" + "\t" + "Enabled for " + L1.size() + " Stations" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                
                        Log_Html_Result("FAIL", "Enabled for " + L1.size() + " Stations - Expected disabled"  , true, ParentTest.createNode("DM No Options - Menu visibility status (hide/unhide)"));
                    }                    
                } else if (Tab_Name.toLowerCase().contains("service")) { 
                    Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}    
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);    
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;} 
                     
                } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                    Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 1st '24h Service'", "css", "[aria-label='24 Hour Service']",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }  
                    Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; } // Save
                    Thread.sleep(1000);   
                    Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                        if (FAIL) { return;}   
                      
                } else if (Tab_Name.toLowerCase().contains("closure")) {    
                    Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]",  ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }                         
                    Find_Text("Find 'Save' text", "Save", true, ParentTest, "no_jira"); 
                        if (FAIL) { return; }    
                    Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]",  ParentTest, "no_jira"); 
                        if (FAIL) { return; }   
                    Thread.sleep(500);    
                }                                    
            }   
            Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}             
            Element_By_Path_Attribute("Edit 'Station Name'?", "css", "[aria-label='Station Name']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'Station Name' disabled" , false, ParentTest.createNode("DM No Options-Station Configuration"));
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'Station Name' enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + "Expected disabled" + "\r\n";                        
                    Log_Html_Result("FAIL", " Edit 'Station Name' enabled - Expected disabled"  , true, ParentTest.createNode("DM No Options-Station Configuration"));
                }                    
            Element_By_Path_Attribute("Enable 'ASAP Pick-up'?", "css", "[aria-label='ASAP Pickup']", "disabled", ParentTest, "no_jira"); 
                if (FAIL) { return;}                     
                _t++;
                if (t.equals("true")) {
                    _p++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("PASS", "Edit 'ASAP Pick-up' disabled" , false, ParentTest.createNode("DM No Options-Station Configuration"));
                } else {
                    _f++;
                    EX += _t + "\t" + " === DM No Options " + "\t" + "Station Configuration" + "\t" + "Edit 'ASAP Pick-up' enabled" + "\t" + "FAIL" + "\t" + "Expected disabled" + "\t" + " - " + "\r\n";                        
                    Log_Html_Result("FAIL", "Edit 'ASAP Pick-up' enabled - Expected disabled"  , true, ParentTest.createNode("DM No Options-Station Configuration"));
                }
            // </editor-fold> 
  

            // <editor-fold defaultstate="collapsed" desc=“DM N Menu Management" >   
            /// Limited CDL Delivery Manager has no permission to Menu management

            // logout >>>>>>>>>>>    
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            Thread.sleep(500);          
            Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            Thread.sleep(500);  
            Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]",  ParentTest, "no_jira");
                if (FAIL) { return;}
                
            Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]",  ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]",  ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        }
        }
        // </editor-fold>    
        
    } catch (Exception ex){}   // =============================================  
    }  
}
