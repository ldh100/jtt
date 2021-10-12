package AP3;

import java.time.LocalDateTime;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/*
Ap3 Group Management


The below test is only run in Staging since it involves creation of Global menus.
AUT - 999 - Group Management-As an Admin, I can assign 'Default JDE Category" to a global menu under Group Management 
AUT - 1000 - Group Management-Default JDE Category option will be available only for "Canada" groups and will not be available for "United States" Group
AUT - 1001 - Group Management-As an Admin, I can update the Default JDE Category assigned to Global menu in Group management
AUT - 1002 - Group Management- Default JDE Category is an optional field and not mandatory
- Also included API call verification
*/


class AP3_group_management extends AP3_GUI{
    protected AP3_group_management (AP3_GUI a){
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
        appId = a.appId;
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
    String API_Response_Body = "";
    protected void run() {
    try {    
        String US_group = "";
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
 
        // ============ All               
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
        //Find a US Sector to use it for JDE test 
        List_L1("List of countries", "xpath", "//tr//td[2]", ParentTest, "no_jira");
        for(int i = 0; i < L1.size(); i++) {
            if(L1.get(i).getText().equals("United States")) {
                i = i + 1;
                Element_By_Path_Text("Name of US group", "xpath", "//tr["+i+"]//td[1]", ParentTest, "no_jira");
                US_group = t;
                break;
            }
        }
        List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");              
            if (FAIL) { return;}
            if (_All_data)  {
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text("Group Row Text", L0.get(i), ParentTest, "no_jira");              
                } 
            } else {
                Element_Text("Group Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");                      
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
                if(t.contains("United States")){ 
                    T_Index = i; 
                }
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
                if(t.equals(GL_MENU)) { 
                    T_Index = i;
                }
            }
            
        // <editor-fold defaultstate="collapsed" desc="JDE">      
        //July 6 2021, Only will be run on Dev since JDE hasnt been pushed to Staging/Prod          
        if(env.equals("DE")) {
            if(C.equals("CA"))  {
                String JDE_Category; 
                String JDE_id;
    Thread.sleep(3000);
                Element_By_Path_Click("Click: + Global Menu", "xpath", "//div[@class='v-btn__content'][normalize-space()='Global Menu']", ParentTest, "no_jira");
                Find_Text("Find Header", "Enter Global Menu Brand Name", true,ParentTest, "no_jira");
                Find_Text("Find Allow images", "Allow Images in Global Menu", true,ParentTest, "no_jira");
                Element_By_Path_Text("Option 1 : ", "xpath", "//div[contains(@class,'Option-Left')]", ParentTest, "no_jira");
                Element_By_Path_Text("Option 2 : ", "xpath", "//div[contains(@class,'Option-Right')]", ParentTest, "no_jira");
                Text_Found("Find ..Allow Images", "Allow Images in Global Menu", ParentTest, "no_jira");
                Text_Found("Find ..Option Yes", "Yes", ParentTest, "no_jira");
                Text_Found("Find ..Option No", "No", ParentTest, "no_jira");
                Text_Found("Find ..Default JDE Category", "Default JDE Category", ParentTest, "no_jira");
                Element_By_Path_Text_Enter("Enter Brand Name", "xpath", "//input[@aria-label='Brand Name']", "Automation GM "+New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click JDE dropdown", "xpath", "(//div[@role='combobox']//div[@class='v-input__append-inner'])[2]", ParentTest, "no_jira");
                    if (FAIL) { return;}
   Thread.sleep(5000);
//                 Wait_For_Element_By_Path_Presence("Wait for 'JDE' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
//                 if (FAIL) { return;} 
                T_Index = -1;
                List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                   if (FAIL) { return;}
                Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                   if(FAIL) {return;}
                do {
                    T_Index = L1.size();
                    List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                    if(FAIL) {return;}
                } while(T_Index<L1.size());
                int JDE_count = L1.size();
                for(int i=0;i<L1.size();i++) {
                    Element_Text("JDE Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira"); 
                    if(t.equalsIgnoreCase("Artisan Deli")){
                       T_Index = i; 
                       JDE_Category = t; 
                    }
                }
                if(T_Index > -1){
                    Scroll_to_Element("Scroll to Artisan Deli", L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                    Element_Click("Select Artisan Deli", L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;} 
                } else{
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "\t" + " JDE Category " + "\t" + "Artisan Deli" + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + "Artisan Deli Not found";
                    EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
                } 
                 
                Element_By_Path_Click("Click Save", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='Save']", ParentTest, "no_jira");
                    if (FAIL) { return;} 

                Page_URL("Sector Page URL", ParentTest, "no_jira");
                String G_ID = t.substring(t.lastIndexOf("/") + 1);
                // API Call to verify JDE     
                Verify_JDE_Count(JDE_count);
                JDE_id = Verify_JDE_API("Artisan Deli");
                Verify_Sector_JDE_API(G_ID,JDE_id);

                Wait_For_Element_By_Path_Visibility("Wait for global menu button", "xpath", "//div[@class='v-btn__content'][normalize-space()='Global Menu']", ParentTest, "no_jira");
                //Create global menu without assigning JDE category
                Element_By_Path_Click("Click: + Global Menu", "xpath", "//div[@class='v-btn__content'][normalize-space()='Global Menu']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter Brand Name", "xpath", "//input[@aria-label='Brand Name']", "Automation GM 2 "+New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click Save", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='Save']", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                JDE_id = "second";
                Verify_Sector_JDE_API(G_ID,JDE_id);

                Wait_For_Element_By_Path_Visibility("Wait for search button", "xpath", "//input[@aria-label='Search all Brands']", ParentTest, "no_jira");
                Element_By_Path_Input_Select_Clear("Clear Search", "xpath", "//input[@aria-label='Search all Brands']", ParentTest, Ver);
                Element_By_Path_Text_Enter("Search for created global menu", "xpath", "//input[@aria-label='Search all Brands']","Automation GM "+New_ID , false, ParentTest, "no_jira");
                Element_By_Path_Click("Click Edit Global menu", "xpath", "//tr[1]//td[3]//i[@class='v-icon mdi mdi-pencil theme--light']", ParentTest, "no_jira");
                Wait_For_Element_By_Path_Visibility("Wait for Add global menu", "xpath", "//span[normalize-space()='Default JDE Category']", ParentTest, "no_jira");
                Element_By_Path_Click("Click JDE dropdown", "xpath", "(//div[@role='combobox']//div[@class='v-input__append-inner'])[2]", ParentTest, "no_jira");
                    if (FAIL) { return;}
    Thread.sleep(5000);
                //Wait_For_Element_By_Path_Presence("Wait for 'JDE' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;} 
                T_Index = -1;
                List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                if(FAIL) {return;}
                do {
                    T_Index = L1.size();
                    List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                    if(FAIL) {return;}
                } while(T_Index<L1.size());
                for(int i=0;i<L1.size();i++) {
                    Element_Text("JDE Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira"); 
                    if(t.equalsIgnoreCase("Bento Nouveau Sales")){
                        T_Index = i; 
                        JDE_Category = t; 
                    }
                }
                if(T_Index > -1){
                    Scroll_to_Element("Scroll to Bento Nouveau Sales", L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                    Element_Click("Select Bento Nouveau Sales", L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;} 
                } else{
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "\t" + " JDE Category " + "\t" + "Bento Nouveau Sales" + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + "Bento Nouveau Sales Not found";
                    EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    Log_Html_Result("FAIL", "Bento Nouveau Sales Not found"  , true, ParentTest.createNode(_t + ". " + "JDE Category - Bento Nouveau Sales"), new Date());
                    return;
                } 

                Element_By_Path_Click("Click Save", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='Save']", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                JDE_id = Verify_JDE_API("Bento Nouveau Sales");
                Verify_Sector_JDE_API(G_ID,JDE_id);
                Wait_For_Element_By_Path_Presence("Wait for Group management", "xpath", "//div[@class='flex']//div//a[@class='v-breadcrumbs__item'][normalize-space()='Group Management']", ParentTest, "no_jira");
                Element_By_Path_Click("Click Group Mgmt", "xpath", "//div[@class='flex']//div//a[@class='v-breadcrumbs__item'][normalize-space()='Group Management']", ParentTest, "no_jira");
                    if (FAIL) { return;}  
                Wait_For_Element_By_Path_Presence("Wait for Add new group button", "xpath", "//div[contains(text(),'add new group')]", ParentTest, "no_jira");
                Element_By_Path_Click("Search Group Click", "xpath", "//label[contains(text(), 'Search all Groups')]", ParentTest, "no_jira");  
                    if (FAIL) { return;}            
                Element_By_Path_Text_Enter("Enter Group Search", "css", "[aria-label='Search all Groups']", US_group, false, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Click("Click on US Brand", "xpath", "//tr//td[1]", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                    if (FAIL) { return;} 
                Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");  
                    if (FAIL) { return;}        
                Text_Found("Find Group text", US_group+" (United States)", ParentTest, "no_jira");
                Element_By_Path_Click("Click: + Global Menu", "xpath", "//div[@class='v-btn__content'][normalize-space()='Global Menu']", ParentTest, "no_jira");
                    if (FAIL) { return;}        
                Find_Text("Find Header", "Enter Global Menu Brand Name", true,ParentTest, "no_jira");
                Find_Text("Find Allow images", "Allow Images in Global Menu", true,ParentTest, "no_jira");
                Element_By_Path_Text("Option 1 : ", "xpath", "//div[contains(@class,'Option-Left')]", ParentTest, "no_jira");
                Element_By_Path_Text("Option 2 : ", "xpath", "//div[contains(@class,'Option-Right')]", ParentTest, "no_jira");
                Text_Found("Find ..Allow Images", "Allow Images in Global Menu", ParentTest, "no_jira");
                Text_Found("Find ..Option Yes", "Yes", ParentTest, "no_jira");
                Text_Found("Find ..Option No", "No", ParentTest, "no_jira");
                Find_Text("Find ..Default JDE Category", "Default JDE Category", false, ParentTest, "no_jira");
                Element_By_Path_Click("Click Cancel", "xpath", "//div[@class='v-dialog__content v-dialog__content--active']//button[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}  

                //AUT 1005 - JDE Category-Station level- As an Admin, I can update the JDE category in the station configuration
                Element_By_Path_Click("Click on Group mgmt", "xpath", "//div[@class='flex']//div//a[@class='v-breadcrumbs__item'][normalize-space()='Group Management']", ParentTest, "no_jira");
                    if (FAIL) { return;}  
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                    if (FAIL) { return;}     
                Find_Text("Fund 'Search...' text", "Search all Groups", true, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Click("Search Groups Click", "xpath", "//label[contains(text(), 'Search all Groups')]", ParentTest, "no_jira");  
                    if (FAIL) { return;}            
                Element_By_Path_Text_Enter("Enter Group Search", "css", "[aria-label='Search all Groups']", G, false, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 

                List_L0("Filtered Groups Count", "tagName", "tr", ParentTest, "no_jira");              
                    if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L0.size(); i++) {
                   Element_Text("Group Row Text", L0.get(i), ParentTest, "no_jira");              
                   if("CA".equals(C) && t.contains("Canada") && t.contains(G)) { T_Index = i;}
                   if("US".equals(C) && t.contains("United States") && t.contains(G)) { T_Index = i;}
                } 
                Element_Click("Click " + SECTOR , L0.get(T_Index), ParentTest, "no_jira"); 
                   if (FAIL) { return;}  
                Thread.sleep(500);          
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                   if (FAIL) { return;} 
                Find_Text("Find 'Search...' text", "Search all Brands", true, ParentTest, "no_jira");  
                   if (FAIL) { return;} 
                Element_By_Path_Click("Search Brands Click", "xpath", "//label[contains(text(), 'Search all Brands')]", ParentTest, "no_jira");  
                   if (FAIL) { return;}            
                Element_By_Path_Text_Enter("Enter Brand Menu Search", "css", "[aria-label='Search all Brands']", GL_MENU, false, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Click("Click Edit Global menu", "xpath", "//tr[1]//td[3]//i[@class='v-icon mdi mdi-pencil theme--light']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Visibility("Wait for Add global menu", "xpath", "//span[normalize-space()='Default JDE Category']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Attribute("Read JDE category assigned", "xpath", "(//div[@class='v-select__selection v-select__selection--comma'])[2]", "innerHTML", ParentTest, "no_jira");
                // 1 - No category assigned
                //2 - X category assigned
                //3 - y category assigned.
                JDE_Category = "";
                if(t.equals("") || !(t.equals("Bento Nouveau Sales"))) {
                  JDE_Category = "Bento Nouveau Sales";
                } else  {
                  JDE_Category = "Artisan Deli";
                }
                Element_By_Path_Click("Click JDE dropdown", "xpath", "(//div[@role='combobox']//div[@class='v-input__append-inner'])[2]", ParentTest, "no_jira");
                   if (FAIL) { return;}
    Thread.sleep(5000);
                //Wait_For_Element_By_Path_Presence("Wait for 'JDE' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;} 
                T_Index = -1;
                List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                if(FAIL) {return;}
                do {
                    T_Index = L1.size();
                    List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                        if(FAIL) {return;}
                }while(T_Index<L1.size());
                for(int i = 0; i < L1.size(); i++) {
                    Element_Text("JDE Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira"); 
                    if(t.equalsIgnoreCase(JDE_Category))  {
                        T_Index = i;
                    }
                }
                if(T_Index > -1){
                    Scroll_to_Element("Scroll to "+JDE_Category, L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                    Element_Click("Select "+JDE_Category, L1.get(T_Index), ParentTest, "no_jira");   
                        if (FAIL) { return;} 
                } else{
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "\t" + " JDE Category " + "\t" + JDE_Category + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + "Not found -"+JDE_Category;
                    EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    Log_Html_Result("FAIL", "Not found : "+JDE_Category  , true, ParentTest.createNode(_t + ". " + "JDE Category - "+JDE_Category), new Date());
                    return;
                } 

                Element_By_Path_Click("Click Save", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='Save']", ParentTest, "no_jira");
                 if (FAIL) { return;} 
                JDE_id = Verify_JDE_API(JDE_Category);
                Verify_Sector_JDE_API(G_ID,JDE_id);
                Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Attribute("Get assigned JDE Category", "xpath", "(//div[@class='v-select__selections'])[4]//div[@class='v-select__selection v-select__selection--comma']", "innerHTML", ParentTest, "no_jira");
                    if(FAIL){return;}
                if(!(JDE_Category.equals(t)))  {
                    //Print JDE category not updated
                    //Assign JDE category
                    Element_By_Path_Click("Click on JDE dropdown", "xpath", "//label[normalize-space()='JDE Category']/parent::div/descendant::i", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(5000);
                    //Wait_For_Element_By_Path_Presence("Wait for 'JDE' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");

                    T_Index = -1;
                    List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                       if (FAIL) { return;}
                    Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                       if(FAIL) {return;}
                    do {
                        T_Index = L1.size();
                        List_L1("List all JDE categories", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@role='listitem']//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                           if (FAIL) { return;}
                        Scroll_to_Element("Scroll to last element", L1.get(L1.size()- 1), ParentTest, "no_jira");
                           if(FAIL) {return;}
                    }while(T_Index<L1.size());

                    for(int i = 0; i < L1.size(); i++) {
                       Element_Text("JDE Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira"); 
                       if(t.equalsIgnoreCase(JDE_Category))   {T_Index = i; }
                    }
                    if(T_Index > -1){
                        Scroll_to_Element("Scroll to "+JDE_Category, L1.get(T_Index), ParentTest, "no_jira");   
                            if (FAIL) { return;}
                        Element_Click("Select "+JDE_Category, L1.get(T_Index), ParentTest, "no_jira");   
                            if (FAIL) { return;} 
                    } else{
                        _t++;
                        _f++;
                        EX += " - " + "\t" + "\t" + " JDE Category " + "\t" + JDE_Category + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + "Not found -"+JDE_Category;
                        EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                        Log_Html_Result("FAIL", "Not found : "+JDE_Category  , true, ParentTest.createNode(_t + ". " + "JDE Category - "+JDE_Category), new Date());
                        return;
                    } 
                    Element_By_Path_Click("Save Brand changes", "xpath", "//button//div[contains(text(),'Save Changes')]", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Verify_Location_API(JDE_Category); 
                }
            } 
        }
        // </editor-fold>  
        
    } catch (Exception ex){}   // =============================================  
    }//End of run
    
    private void Verify_Location_API(String JDE_Category) throws Exception {
    try{
        EX += "\n - " + "\t" + " === START ====" + "\t" + " ===== " + "\t" + " == Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        Call_API("Call /Sector/ API ", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" +BrandID+"?nocache=1", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        } else {
            EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/location/brand/" +BrandID+ "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "location/brand/" +BrandID, false, ParentTest.createNode(_t + ". " + "API Response Error"), new Date());
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        String Brand_JDE_id = json.getJSONObject("meta").getString("jde_category");
        String Brand_JDE_name = "";
        Call_API("Call /JDE/ API ", "Bearer " + AP3_TKN, BaseAPI + "/config/jde-configuration", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        } else {
            EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/config/jde-configuration" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/config/jde-configuration", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
        }
        
        json = new JSONObject(API_Response_Body);
        JSONArray JDE_categories = new JSONArray();
        JDE_categories = json.getJSONArray("jde_categories");
        for(int i = 0; i < JDE_categories.length(); i++) {
            if(JDE_categories.getJSONObject(i).getString("id").equals(Brand_JDE_id)) {
                Brand_JDE_name = JDE_categories.getJSONObject(i).getString("name");
                if(Brand_JDE_name.equals(JDE_Category)) {
                    _t++; _p++;
                    EX += _t + "\t" + "Same JDE Category assigned to Brand and GM" + "\t" + "JDE Category in GM: " + JDE_Category + "\t" + "JDE Category assigned to Brand : "+Brand_JDE_name+"\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "JDE Category in GM : " + JDE_Category +"  - JDE Category assigned to Brand : " + Brand_JDE_name, false, ParentTest.createNode(_t + ". " + "Same JDE Category assigned to Brand and GM"), new Date());
                } else {
                    _t++; _f++;
                    EX += _t + "\t" + "Different JDE Category assigned to Brand and GM" + "\t" + "JDE Category in GM: "+JDE_Category+ "\t" + "JDE Category assigned to Brand : "+Brand_JDE_name+"\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "JDE Category in GM : " + JDE_Category + " - JDE Category assigned to Brand : " + Brand_JDE_name, false, ParentTest.createNode(_t + ". " + "Different JDE Category assigned to Brand and GM"), new Date());
                }
                break;
            }
        }
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
    }catch (Exception ex){}   // =============================================
    }//End of Verify_Location_API
    
    private void Verify_JDE_Count(int JDE_count) throws Exception {
    try{
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == JDE Count Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        Call_API("Call /JDE/ API ", "Bearer " + AP3_TKN, BaseAPI + "/config/jde-configuration", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/config/jde-configuration" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/config/jde-configuration", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray JDE_categories = new JSONArray();
        JDE_categories = json.getJSONArray("jde_categories");
        if(JDE_categories.length()== JDE_count) {
            _t++;
            _p++; 
            EX += _t + "\t" + "JDE Category count equal in UI dropdown and API" + "\t" + "JDE count API: "+JDE_categories.length() + "\t" + "JDE count UI: "+JDE_count+ "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("PASS", "JDE Category count equal in UI dropdown and API : "+JDE_categories.length() , false, ParentTest.createNode(_t + ". " + "JDE Category count verfication"), new Date());
        } else {
            _t++;
            _f++; 
            EX += _t + "\t" + "JDE Category count not equal in UI dropdown and API" + "\t" + "JDE count API: "+JDE_categories.length() + "\t" + "JDE count UI: "+JDE_count+ "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "JDE Category count not equal in UI dropdown and API : "+JDE_categories.length() , false, ParentTest.createNode(_t + ". " + "JDE Category count verfication"), new Date());
        }
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == JDE Count Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
    }catch (Exception ex){}   // =============================================   
    }//End of Verify_JDE_Count
     
    private String Verify_JDE_API(String JDE_category) throws Exception {
    String JDE_id = "";    
        try{
            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            Call_API("Call /JDE/ API ", "Bearer " + AP3_TKN, BaseAPI + "/config/jde-configuration", true, ParentTest, "no_jira" );
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/config/jde-configuration" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/config/jde-configuration", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            }

            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray JDE_categories = new JSONArray();
            JDE_categories = json.getJSONArray("jde_categories");
            for(int i = 0; i < JDE_categories.length(); i++) {
                if(JDE_categories.getJSONObject(i).getString("name").equals(JDE_category)) {
                    JDE_id = JDE_categories.getJSONObject(i).getString("id");
                    _t++;
                    _p++;
                    EX += _t + "\t" + "JDE Category UI : "+JDE_category + "\t" + "JDE ID: "+JDE_id  + "\t" + "JDE Category API: " +JDE_category+ "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "JDE Category and ID : " +JDE_id, false, ParentTest.createNode(_t + ". " + "JDE Category & ID"), new Date());
                 }
            }
            EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        } catch (Exception ex){}   // =============================================
        return JDE_id;
    }//End of JDE_API
    
    private void Verify_Sector_JDE_API(String G_ID,String JDE_id) throws Exception {
       try{
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
       
        Call_API("Call /Sector/ API ", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" +G_ID+"?nocache=1", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        } else {
            EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/location/sector/" +G_ID  + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/sector/"+G_ID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray JDE_companies = new JSONArray();
        JDE_companies = json.getJSONArray("companies");
        JSONObject company = new JSONObject();
        for(int i = 0; i < JDE_companies.length(); i++) {
            company = JDE_companies.getJSONObject(i);
            if(company.getString("name").equals("Automation GM "+New_ID) && !(JDE_id.equals("second"))) {
                if(company.getJSONObject("meta").getString("jde_category").equals(JDE_id)) {
                 //Print Pass new created group has JDE category assigned
                    _t++; _p++;
                    EX += _t + "\t" + "JDE Category assigned to global menu" + "\t" + "JDE ID: " + JDE_id + "\t" + "JDE API ID: " +company.getJSONObject("meta").getString("jde_category")  + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "JDE Category assigned to global menu : " + JDE_id, false, ParentTest.createNode(_t + ". " + "JDE Category assigned correctly"), new Date());
                } else {
                    _t++; 
                    _f++;
                    EX += _t + "\t" + "JDE Category not assigned to Global menu" + "\t" + "JDE ID: " + JDE_id + "\t" + "JDE API ID: " +company.getJSONObject("meta").getString("jde_category")  + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "JDE Category assigned to global menu incorrectly: "+company.getJSONObject("meta").getString("jde_category") , false, ParentTest.createNode(_t + ". " + "JDE Category assigned incorrectly"), new Date());
                }
            }
          
            if(company.getString("name").equals("Automation GM 2 "+New_ID) && JDE_id.equals("second"))  {
                if(!(company.getJSONObject("meta").has("jde_category")) && (company.has("meta"))) {
                    _t++; 
                    _p++;
                    EX += _t + "\t" + "Global Menu created without JDE Category" + "\t" + "GM name: Automation GM 2 "+New_ID + "\t" + "-"  + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("PASS", "Global Menu created without JDE Category ", false, ParentTest.createNode(_t + ". " + "JDE Category optional when Global menu created"), new Date());
                } 
            }
        } 
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
       }catch (Exception ex){}   // =============================================
    }//End of Sector_JDE_API
        
}
