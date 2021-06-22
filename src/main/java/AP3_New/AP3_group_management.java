package AP3_New;

class AP3_group_management extends AP3_GUI{
    protected AP3_group_management (AP3_GUI a) throws InterruptedException, Exception {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
 
        app = a.app;
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        SECTOR = a.SECTOR;
        SectorID = a.SectorID;
        GL_MENU = a.GL_MENU;
        CompanyID = a.CompanyID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    } 
    protected void run() throws InterruptedException, Exception {
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");              
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Group Management' Click", "xpath", "//*[contains(text(), 'Group Management')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");           
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}         
        Page_URL("Group Management page URL", ParentTest, "no_jira");  
            if (FAIL) { return;} 
            
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");  
           if (FAIL) { return;}          
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");  
            if (FAIL) { return;}         
                  
        List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Group Data Row Text", L0.get(i), ParentTest, "no_jira");              
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
        // ============  Groups Sorting
        To_Top("Scroll to Page Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Click("Group Sort Click", L1.get(0), ParentTest, "no_jira");  
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            }
        List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Group Data Row Text", L0.get(i), ParentTest, "no_jira");              
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Group Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");              
                if (FAIL) { return;}        
            }        
        To_Top("Scroll to Page Top", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Click("Group Country Sort Click", L1.get(1), ParentTest, "no_jira");  
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            }
        List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Group Data Row Text", L0.get(i), ParentTest, "no_jira");              
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Group Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");              
                if (FAIL) { return;}        
            }
//            if(L1.size() > 2) { // No of Brands >>>>>>>>>>>>>>>>>>>>>>> Deleted as Performans improvement Ticket
//                Element_Click("Group No of Brands Click", L1.get(2), ParentTest, "no_jira");  // no more CM-2621
//                    if (FAIL) { return;} 
//                    for (int i = 0; i < L1.size(); i++) {
//                        Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira"); 
//                        if (FAIL) { return;}
//                    }
//                List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
//                    if (FAIL) { return;}
//                    if (_All_data)  {
//                        for (int i = 0; i < L0.size(); i++) {
//                            Element_Text("Group Data Row Text", L0.get(i), ParentTest, "no_jira");              
//                            if (FAIL) { return;}
//                        } 
//                    } else {
//                        Element_Text("Group Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");              
//                        if (FAIL) { return;}        
//                    }    
//            } else{
//                _t++;
//                _f++;
//                EX += " - " + "\t" + "Group Data Row" + "\t" + "Column 'No of Brands'" + "\t" + " << Missing"+ "\t" + "FAIL" + "\t" + "CM-2621" + "\t" + " - " + "\r\n";
//            }
 
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
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
        Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);                         
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
            
        List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Group Row Text", L0.get(i), ParentTest, "no_jira");              
                    if (FAIL) { return;}
                } 
            } else {
                Element_Text("Group Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");              
                if (FAIL) { return;}        
            } 
        To_Top("Scroll to Page Top", ParentTest, "no_jira");
            if (FAIL) { return;}   
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");              
            if (FAIL) { return;}
        Element_Click("Groups Sort Click", L1.get(0), ParentTest, "no_jira");  
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");           
                if (FAIL) { return;}
            }  
            
        // new
        Find_Text("Find 'Add Group..' Text", "add new group", true, ParentTest, "no_jira");         
            if (FAIL) { return;}
        Element_By_Path_Click("Button 'Add New..' click", "css", "[type='submit']", ParentTest, "no_jira");              
            if (FAIL) { return;}
        Element_By_Path_Click("Input 'Group Name' click", "css", "[aria-label='Group Name']", ParentTest, "no_jira");              
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter new Group Name", "css", "[aria-label='Group Name']", "New Group " + New_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Open Country combobox", "css", "[role='combobox']", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_E1_Find("Find 'Country' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}                                         
        Element_Child_List_L1("Country list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                      
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Country Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");          
                if (FAIL) { return;}
                if(t.contains("United States")){ T_Index = i; }
        }
        Element_Click("Select 'United States'", L1.get(T_Index), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Button 'Cancel' Click", "xpath", "//*[contains(text(), 'Cancel')]", ParentTest, "no_jira");            
            if (FAIL) { return;} 
            
        // Search >>>
        String G = SECTOR.substring(0, SECTOR.indexOf("/"));
        String C = SECTOR.substring(SECTOR.indexOf("/") + 1);
        Find_Text("Fund 'Search...' text", "Search all Groups", true, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Search Groups Click", "xpath", "//label[contains(text(), 'Search all Groups')]", ParentTest, "no_jira");  
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Group Search", "css", "[aria-label='Search all Groups']", G, false, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
        List_L0("Filteres Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Group Row Text", L0.get(i), ParentTest, "no_jira");              
                if (FAIL) { return;}
                if("CA".equals(C) && t.contains("Canada") && t.contains(G)) { T_Index = i;}
                if("US".equals(C) && t.contains("United States") && t.contains(G)) { T_Index = i;}
            } 
        Element_Click("Click " + SECTOR , L0.get(T_Index), ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);          
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
            
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");  
           if (FAIL) { return;}             
        List_L0("Submits Count", "css", "[type='submit']", ParentTest, "no_jira");              
            if (FAIL) { return;}
        Element_Attribute("Submit 1 Name", L0.get(0), "textContent", ParentTest, "no_jira");              
        Element_Attribute("Submit 2 Name", L0.get(1), "textContent", ParentTest, "no_jira");  
        
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
            
        List_L0("Brand Global Menus Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Menu Row Text", L0.get(i), ParentTest, "no_jira");              
                    if (FAIL) { return;}
                } 
            } else {
                    Element_Text("Menu Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");              
                    if (FAIL) { return;}        
            } 
        To_Top("Scroll to Page Top", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        List_L1("Sortable Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");              
            if (FAIL) { return;}
        Element_Click("Site Count Sort Click", L1.get(1), ParentTest, "no_jira");  
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Sortable Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");           
                if (FAIL) { return;}
            }   
            
        Find_Text("Fund 'Search...' text", "Search all Brands", true, ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Search Brands Click", "xpath", "//label[contains(text(), 'Search all Brands')]", ParentTest, "no_jira");  
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Brand Menu Search", "css", "[aria-label='Search all Brands']", GL_MENU, false, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
        List_L0("Search Brands Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Menu Row Text", L0.get(i), ParentTest, "no_jira");              
                if (FAIL) { return;}
                if(t.equals(GL_MENU)) { 
                    T_Index = i;
                }
            }            
    } 
}
