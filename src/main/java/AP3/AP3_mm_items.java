package AP3;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
 /*
 * For 'Manipulate Global Modifiers' test cases use Site: Ap3 Automation, Brand: Starbucks (App: Thrive)
 * Manually check that the Global Modifier group 'Modifier Manipulation Test Group' with Label in App set to 'MMTG' exists
 * If it doesn't exist, create it manually and add one modifier with Name: existing1, Price: $1, Calories: 100, PLU:111
 * and set any required Sequence On Ticket to 1, save and publish
 * Then go to Global Menu and add this Modifier Group to second item in 'Lunch' -> 'Beverages Lunch' menu set,
 * save and publish
 */
class AP3_mm_items extends AP3_GUI{
    protected AP3_mm_items (AP3_GUI a) {
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
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        DH_MENU_ID = a.DH_MENU_ID;
        SECTOR = a.SECTOR;
        CompanyID = a.CompanyID;
        GL_MENU =a.GL_MENU;
        SectorID=a.SectorID;
        BrandID=a.BrandID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }  
    
    protected void run() { 
    try {
        String API_Respoce_Body = "";      
        String MENU_ID = "";      
        int PAGES;
        boolean NO_DATA = false;

        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Menu Manager' Click", "xpath", "//*[contains(text(), 'Menu Manager')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}
      
        // <editor-fold defaultstate="collapsed" desc="Group Selection">  
        EX += " - " + "\t" + " === MM Sector Selection " + "\t" + " ===== " + "\t" + " == Sector Selection Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}              
        Page_URL("Menu Manager page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Find_Text("Button 'Go to Menu' text", "Go to menus", true, ParentTest, "no_jira");   
            if (FAIL) { return;}
        Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        // =========================================== Group Selection
        Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) return;   
        Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, ParentTest, "no_jira");
                if (FAIL) { return;}    
            Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}             
//        Element_E1_Find("Find 'Group' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", ParentTest, "no_jira");
//            if (FAIL) { return;} 
//        Element_Child_List_L1("Groups Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");             
//            if (FAIL) { return;} 
//            T_Index = L1.size();
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(L1.size() - 1));
//            Scroll_to_Element("Scroll to Last Group", L1.get(L1.size() - 1), ParentTest, "no_jira");
//                if (FAIL) { return;}
//        Element_Child_List_L1("Groups Count #2", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");             
//            if (FAIL) { return;} 
//
//        int SC = 2;    
//        while(T_Index < L1.size()) {
//            T_Index = L1.size();
//            SC++;
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(L1.size() - 1));
//            Scroll_to_Element("Scroll to last Group, L1.get(L1.size() - 1), ParentTest, "no_jira");
//                if (FAIL) { return;}
//            Element_Child_List_L1("Groups Count #" + SC, e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");             
//                if (FAIL) { return;} 
//        }   
//        T_Index = -1;
//        for (int j = 0; j < L1.size(); j++) {
//            if(ALL_DATA){
//                Element_Text("Group Name", L1, "L1", j, ParentTest, "no_jira");  
//            }
//            if(L1.get(j).getText().trim().equals(SECTOR)){
//                T_Index = j;
//            }
//        }
//        if(T_Index > -1){
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(T_Index));  
//            Scroll_to_Element("Scroll to Group " + SECTOR, L1.get(T_Index), ParentTest, "no_jira");
//                if (FAIL) { return;}
////            Element_Click("Select Group " + SECTOR, L1, "L1", T_Index, ParentTest, "no_jira");
//                if (FAIL) { return;} 
//        } else{
//            return;
//        } 
        Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return;}
        // ========================================= Group Selection ^^^^
        
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true, ParentTest, "no_jira");   
            if (FAIL) { return;} 
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Fund 'Search...' text", "Search Global Menus", true, ParentTest, "no_jira");   
            if (FAIL) { return;}  
        EX += " - " + "\t" + " === MM Sector Selection " + "\t" + " ===== " + "\t" + " == Sector Selection End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>           

        // <editor-fold defaultstate="collapsed" desc="Global Menus Add Menu Set">  
        EX += " - " + "\t" + " === MM Global Menus Add Menu Set" + "\t" + " ===== " + "\t" + " == Add Menu Sets Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        List_L1("Menus Pages Count", "xpath", "//button[contains(@class, 'v-pagination__item')]", ParentTest, "no_jira"); 
        PAGES = L1.size();
        
        List_L2("Menus Count on the Page 1", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) { 
                Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
                if(t.trim().startsWith(GL_MENU)){
                    T_Index = i;
                } 
            }
            if(T_Index == -1 && PAGES > 1){
                Scroll_to_Element("Scroll to Pagination", L1.get(1), ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_Click("Click Navigation Page 2", L1.get(1), ParentTest, "no_jira");
                    if (FAIL) { return;}                
                List_L2("Menus Count on the Page 2", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L2.size(); i++) { 
                    Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
                    if(t.trim().startsWith(GL_MENU)){
                        T_Index = i;
                    } 
                } 
                if(T_Index == -1 && PAGES > 2){
                    Scroll_to_Element("Scroll to Pagination", L1.get(2), ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_Click("Click Navigation Page 3", L1.get(2), ParentTest, "no_jira");
                        if (FAIL) { return;}                
                    List_L2("Menus Count on the Page 3", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
                        if (FAIL) { return;}
                    T_Index = -1;
                    for (int i = 0; i < L2.size(); i++) { 
                        Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
                        if(t.trim().startsWith(GL_MENU)){
                            T_Index = i;
                        } 
                    } 
                }            
            }
        if(T_Index == -1){
            _t++; 
            _f++;
            EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("FAIL", "Find Menu:" + GL_MENU, false, ParentTest.createNode(_t + ". " + "Menu '" + GL_MENU + "' not found"), new Date());
            return;
        }  
        
        Find_Text("Fund 'Search...' text", "Search Global Menus", true, ParentTest, "no_jira");   
            if (FAIL) { return;}             
        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Global Menus')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Global Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);

        Element_Click("Click Menu " + GL_MENU, L2.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);
 
        Element_By_Path_Click("Click Global Menu", "xpath", "//span[@id='global-menu-label']", ParentTest, "no_jira");
        Thread.sleep(500);                  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);                   
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");        
            if (FAIL) { return;}   
        Thread.sleep(500);
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}          
        Element_By_Path_Click("Click 'ADD MENU SET'", "xpath", "//*[contains(text(), 'add menu set')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(2000); 
        List_L0("Menus + 1 Added Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL) { return;} 
        List_Child_E1_By_Path("Find New Menu Set Name input", L0.get((L0.size() - 1)), "xpath", ".//input[@type='text']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_Text_Enter("Enter Added Menu Set Name", e1, "Added " + New_ID, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
            if (FAIL) { return;} 
        Thread.sleep(500);
        Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}                       
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(1000);
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Added Menu Set Name Click", "xpath", "//*[contains(text(), 'Added " + New_ID + "')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);                
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(1000);
        Element_By_Path_Attribute("Find 'No Categories...'", "xpath", "//*[contains(text(), 'No categories found')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");        
            if (FAIL) { return;}   
        Thread.sleep(500);
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'EDIT'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        //Thread.sleep(2000);
        Wait_For_Element_By_Path_Presence("Wait for Menu List page", "css", "[menu-id]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
        List_L2("Published Menus ID Count", "css", "[menu-id]", ParentTest, "no_jira");             
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            T_Index = -1;
            MENU_ID = "not_found";
            if(L0.size() == L2.size()){
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");  
                    if(t.equals("Added " + New_ID)){ 
                        T_Index = i; 
                    }
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira"); 
                    if(T_Index != i){ 
                        MENU_ID = t; 
                    } 
                }  
            }else{
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");  
                    if(t.equals("Added " + New_ID)){ 
                        T_Index = i; 
                    }
                }                
                for (int i = 0; i < L2.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira"); 
                    if(T_Index != i){ 
                        MENU_ID = t; 
                    }
                } 
                _t++;
                _f++;
                EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                EX += "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n"; 
            }                  
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        List_Child_E1_By_Path("Find last 'Added...' > '+'", L0.get((L0.size() - 1)), "xpath", ".//i[@class='v-icon mdi mdi-plus theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500); 
        Element_Click("Click Last Added Set > '+'", e1, ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);   
        Wait_For_All_Elements_InVisibility("Wait for Category Name field", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Thread.sleep(500); 
        To_Bottom("Scroll to page Bottom", ParentTest, "no_jira"); 
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for 'Category Sequence On Ticket' Presence", "css", "[aria-label='Sequence On Ticket']", ParentTest, Ver);
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'New Category Sequence On Ticket'", "css", "[aria-label='Sequence On Ticket']", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Category Sequence On Ticket", "css", "[aria-label='Sequence On Ticket']", "3", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'New Category Name'", "css", "[aria-label='Enter Category Name']", ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Category Name", "css", "[aria-label='Enter Category Name']", "Category " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}          
        Thread.sleep(500); 
        
        // ======== New Item
        To_Top("Scroll to page Top", ParentTest, "no_jira");
        Thread.sleep(500);            
        Element_By_Path_Click("Click 'NEW ITEM'", "xpath", "//*[contains(text(), 'new item')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for 'Item Image' tab", "xpath", "//div[contains(text(), 'Item Image')]", ParentTest, Ver);
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'New Item Name'", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
            if (FAIL) { return;}             
        Element_By_Path_Text_Enter("Enter Item Name", "css", "[aria-label='Item Name']", "Item " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Price'", "css", "[aria-label='Price']", ParentTest, "no_jira");
            if (FAIL) { return;}                 
        Element_By_Path_Text_Enter("Enter 'Price'", "css", "[aria-label='Price']", "1.05", false, ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Calories'", "css", "[aria-label='Calories']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Calories", "css", "[aria-label='Calories']", "280", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Units'", "css", "[aria-label='Units']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Units", "css", "[aria-label='Units']", "8", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'PLU'", "css", "[aria-label='PLU ID']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter PLU ID", "css", "[aria-label='PLU ID']", "900019", false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'Barcode'", "css", "[aria-label='Barcode']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Barcode", "css", "[aria-label='Barcode']", "BC900019", false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'Description'", "css", "[aria-label='Description']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Description", "css", "[aria-label='Description']", "Description " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}                
        Element_By_Path_Click("Tax Tags dropdown Click Open", "css", "[aria-label='Tax Tags']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_E1_Find("Find Tax Tags list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                             
        Element_Child_List_L1("Tax Tags list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Tax Tag (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Prepared")){ 
                    T_Index = i; 
                }
            } 
            if(T_Index > -1){
                Element_Click("Click 'Prepared'", L1.get(T_Index), ParentTest, "no_jira");
                    if (FAIL) { return;}   
            } 
        Element_By_Path_Click("Click 'Item Name' to close tax tags", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
            if (FAIL) { return;}          

        // ======= Add Modifier >>>
        Scroll_to_WebElement("Scroll to 'Add Modifier Group' button",  "xpath", "//*[contains(text(), 'Add modifier group')]", ParentTest, Ver);
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Add Modifier Group'", "xpath", "//*[contains(text(), 'Add modifier group')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Modifier Name' Input", "xpath", "//div[@class='v-input v-text-field v-select v-input--is-focused theme--light primary--text']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                                                                                                     
        Element_E1_Find("Find 'Modifier Groups' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}             
        Element_Child_List_L1("Available Modifier Groups Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Modifier Group (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            }
        Element_Click("Select 1st Group", L1.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}   
        Thread.sleep(500);           
        List_L0("Updated Modifier Group Count", "xpath", "//div[@class='modifier-group']", ParentTest, "no_jira");             
            if (FAIL) { return;}   
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Modifier Group (Index " + i + ") Text Content", L0.get(i), "textContent", ParentTest, "no_jira");            
            }
        // ======= Add Modifier End ^^^ 

        // Images >>>>
        Scroll_to_WebElement("Scroll to 'Item Image' tab", "xpath", "//div[contains(text(), 'Item Image')]", ParentTest, Ver);
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Item Image' tab", "xpath", "//div[contains(text(), 'Item Image')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Find_Text("Find 'Add Image' text", "Add Image", true, ParentTest, "no_jira");
        Find_Text("Find 'Preview Image' text", "Preview Image", true, ParentTest, "no_jira");

        File tmp;
        tmp = new File(System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "Ap3_image1-jpg.jpg");
        if(tmp.exists()) {
            Element_By_Path_Text_Enter("Upload Menu Image file 1", "xpath", "//input[@type='file' and @accept='.png,.jpg,.jpeg']", System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "Ap3_image1-jpg.jpg", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
        } else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png" + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png", false, ParentTest.createNode(_t + ". " + "File to upload does not exist"), new Date());
        }
        Find_Text("Find 'Remove Image' text", "REMOVE IMAGE", true, ParentTest, "no_jira"); 
        Element_By_Path_Click("Click 'REMOVE IMAGE' button", "xpath", "//div[contains(text(), 'Item Image')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
  
        tmp = new File(System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "Ap3_image1-jpg.jpg");
        if(tmp.exists()) {
            Element_By_Path_Text_Enter("Upload Menu Image file 2", "xpath", "//input[@type='file' and @accept='.png,.jpg,.jpeg']", System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "Ap3_image1-jpg.jpg", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
        } else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png" + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png", false, ParentTest.createNode(_t + ". " + "File to upload does not exist"), new Date());
        }    
  
        tmp = new File(System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png");
        if(tmp.exists()) {
            Element_By_Path_Text_Enter("Upload Menu Image file - override existing", "xpath", "//input[@type='file' and @accept='.png,.jpg,.jpeg']", System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
        } else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png" + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "File: " + System.getProperty("user.dir") + File.separator + "FilesToUpload" + File.separator + "AP3_kds_image.png", false, ParentTest.createNode(_t + ". " + "File to upload does not exist"), new Date());
        }

        
        Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}              
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        //Cloning item 
        Element_By_Path_Click("Click Item clone", "xpath", "//div[@class='menutable']//tbody//tr[1]//td[9]//i[contains(@class,'copy')]", ParentTest, "no_jira"); 
            if (FAIL) {return;}

        Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
            if (FAIL) { return;} 
            Thread.sleep(500);
        Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        // </editor-fold> 
        
        //<editor-fold defaultstate="collapsed" desc="Clone MenuSet">
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        //Cloning Menu set
        Move_to_Element_By_Path("Added Menu Set Hover", "xpath", "//*[contains(text(), 'Added " + New_ID + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        }
        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 1), "tagName", "button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Menu Edit Option (index " + i + ")", L1.get(i), ParentTest, "no_jira");
            if(t.contains("Duplicate")){ T_Index = i; }
        }
        Element_Click("Click 'Duplicate'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for Menu list", "css", "[menu-id]", ParentTest, "no_jira");
            if (FAIL) { return;}

        //Verify API if ID's are unique
        EX += "\n - " + "\t" + " ===START===" + "\t" + " ===== " + "\t" + " == Verify_menu_category_API Start ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        String[] Menu_ID = new String[2];
        int lmenu_cnt = 0;
        Call_API("Call Global menu API", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID, true, ParentTest, "no_jira" );
        JSONObject json = new JSONObject(t);
        JSONArray menus = json.getJSONArray("menus");

        for(int k = 0; k < menus.length(); k++) {
            JSONObject menu = menus.getJSONObject(k);
            if(menu.getJSONObject("label").getString("en").contains("Added " + New_ID))  {
                Menu_ID[lmenu_cnt] = menu.getString("id");
                lmenu_cnt++;
            }
        }
        if(lmenu_cnt == 2) {
            if(Menu_ID[0].equals(Menu_ID[1])) {//Print Fail the ids are not unique
                _t++;
                _f++; EX += _t + "\t" + "Same ids for cloned Menu set" + "\t" + Menu_ID[0] + "\t" + Menu_ID[1] + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {//Print Pass the ids are unique
                _t++;
                _p++; EX += _t + "\t" + "Unique ids for cloned Menu set" + "\t" + Menu_ID[0] + "\t" + Menu_ID[1] + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }

        //Verify if cloned menu items are unique
        Call_API("Call menu API", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + Menu_ID[0], true, ParentTest, "no_jira" );
        json = new JSONObject(t);
        JSONArray items = json.getJSONArray("groups").getJSONObject(0).getJSONArray("items");
        String[] Item_ID = new String[2];
        int Item_ID_cnt = 0;
        for(int k = 0; k < items.length(); k++)  {
            JSONObject item = items.getJSONObject(k);
            if(item.getJSONObject("meta").getJSONObject("original_label").getString("en").contains("Item " + New_ID)) {
                Item_ID[Item_ID_cnt] = item.getString("id");
                Item_ID_cnt++;
            }
        }
        if(Item_ID_cnt == 2)  {
            if(Item_ID[0].equals(Item_ID[1])) {//Print Fail the ids are not unique
                _t++;
                _f++; EX += _t + "\t" + "Same ids for cloned items" + "\t" + Item_ID[0] + "\t" + Item_ID[1] + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            else {//Print Pass the ids are unique
                _t++;
                _p++; EX += _t + "\t" + "Unique ids for cloned Items" + "\t" + Item_ID[0] + "\t" + Item_ID[1] + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }
        EX += " - " + "\t" + " ===END===" + "\t" + " ===== " + "\t" + " == Verify_menu_category_API END==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Delete Last Added Cloned Menu and Original Menu Set"> 
        for(int k = 0; k < 2; k++) {
            // ======== Delete Last Added
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);  
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(500);
            Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Move_to_Element_By_Path("Added Menu Set Hover", "xpath", "//*[contains(text(), 'Added " + New_ID + "')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);                
            List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
                if (FAIL) { return;} 
                T_Index = -1;
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                        if (FAIL) { return;}
                    if(t.contains("Added " + New_ID)) { 
                        T_Index=i; 
                    }
                }              
           Element_Child_List_L2("Find Added Menu Set - dots", L0.get(T_Index), "tagName", "button", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            //Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 1), "tagName", "button", ParentTest, "no_jira"); 
            //    if (FAIL) { return;}
            Thread.sleep(500);
            Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                
            Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Menu Edit Option (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                    if(t.contains("Delete")){ T_Index = i; }
                }
            Element_Click("Click 'Delete'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                if (FAIL) { return;}  
            Thread.sleep(500);
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Menu list", "css", "[menu-id]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Refresh("Refresh the page", ParentTest, "no_jira");
            Thread.sleep(3000);
        }
        List_L2("Published Menus ID Count", "css", "[menu-id]", ParentTest, "no_jira");        
        List_L0("Re-Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL) { return;}    
            if(L0.size() == L2.size()){
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");  
                    if(t.equals("Added " + New_ID)){ 
                        T_Index = i; 
                    }
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira"); 
                    if(T_Index != i){ 
                        MENU_ID = t; 
                    } 
                }  
            }else{
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");  
                    if(t.equals("Added " + New_ID)){ 
                        T_Index = i; 
                    }
                }                
                for (int i = 0; i < L2.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira"); 
                    if(T_Index != i){ 
                        MENU_ID = t; 
                    }
                } 
                _t++;
                _f++;
                EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                EX += "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n"; 
            }     
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;} 

        Navigate_Back("Navigate Back","MM 'Menu' page","MM 'Sector' page", ParentTest, "no_jira"); 
            //if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            
        // =================== "Leave without publishing?" Dialog even PUBLISH OK ============ DEBUG    
        Text_Found("Find 'Leave...' question", "Leave without publishing?", ParentTest, "no_jira"); 
        if ("Found".equals(t)) {     
            _t++; _f++;
            EX += _t + "\t" + "Navigate Back after Publish OK" + "\t" + "MM 'Sector' page" + "\t" + "Dialog 'Leave without publishing?'" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            F += "Step: " + _t + " > " + "Dialog 'Leave without publishing?' after Published OK" + "\r\n";
            Find_Text("Find 'Leave...' note", "Changes will be lost if you do not publish.", true, ParentTest, "no_jira"); 
                if (FAIL) { return; }   
            Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira"); 
                if (FAIL) { return; }         
            Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }     
            Element_By_Path_Click("Click 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
        }            
        //Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for MM 'Sector' page", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === MM Global Menus Add Menu Set" + "\t" + " ===== " + "\t" + " == Add Menu Sets End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>  
               
        if (!env.equals("PR")) {
            
            // <editor-fold defaultstate="collapsed" desc="Changes in Global Menu Item Reflect on Local Menu Item">  
            EX += " - " + "\t" + " === Changes in Global Menu Item Reflect on Local Menu Item" + "\t" + " ===== " + "\t" + " == Changes in Global Menu Item Reflect on Local Menu Item Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
            EX += " - " + "\t" + " === Navigate to Global Menu and Make Changes" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click on Menu set", "xpath","(//div[@class='layout align-center'])[1]", ParentTest, "no_jira");
                if (FAIL) {return;}
            Element_By_Path_Text("Get First Category", "xpath", "(//*[@class='listspan'])[1]/div", ParentTest, "no_jira");
                if (FAIL) { return;}
            String Category = t;

            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" + Category + "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}

            Wait_For_Element_By_Path_Presence("Wait for Items table", "xpath", "//*[text()='Menu Version: 2']", ParentTest,"no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(),'EDIT MENU')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Edit mode", "xpath", "//*[text()='You are editing this menu']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 

                Thread.sleep(1000); 

            Wait_For_Element_By_Path_Presence("Wait for Edit Item side panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[3]", ParentTest,"no_jira");
                if (FAIL) { return;}
            // get item name
            Element_By_Path_Attribute("Get Current Item Name Value", "css", "[aria-label='Item Name']", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            // NBC = Name Before Change
            String NBC = t;
            if (!NBC.contains("1")) {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Item Name']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Item Name']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Text_Enter("Enter New Item Name", "css", "[aria-label='Item Name']", NBC + "1", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            } else {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Item Name']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Item Name']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Item Name", "css", "[aria-label='Item Name']", NBC.substring(0, NBC.length()-1), false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            }
            Thread.sleep(500); 
            // get price
            Element_By_Path_Attribute("Get Current Price Value", "css", "[aria-label='Price']", "value", ParentTest, "no_jira");
            if (FAIL) { return;}
            // PBC = Price Before Change
            String PBC = t;
            if (PBC.contains("1")) {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Price']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "xpath", "//input[contains(@aria-label, 'Price')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Price", "xpath", "//input[contains(@aria-label, 'Price')]", "200", false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            } else {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Price']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Price']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Price", "css", "[aria-label='Price']", "159", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            }
            // get calories
            Element_By_Path_Attribute("Get Current Calories Value", "css", "[aria-label='Calories']", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            // PBC = Calories Before Change
            String CBC = t;
            if (!CBC.contains("0")) {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Calories']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Calories']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Calories", "css", "[aria-label='Calories']", "200", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            } else {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Calories']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Calories']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Calories", "css", "[aria-label='Calories']", "159", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            }
            // get units
            Element_By_Path_Attribute("Get Current Units Value", "css", "[aria-label='Units']", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            String UBC = t;
            if (UBC.contains("1")) {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Units']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Units']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Calories", "css", "[aria-label='Units']", "2", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            } else {
                Element_By_Path_Click("Click Input", "css", "[aria-label='Units']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Input_Select_Clear("Clear Input", "css", "[aria-label='Units']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter New Calories", "css", "[aria-label='Units']", "1", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(1000);
            Element_By_Path_Click("Click > 'PUBLISH'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'Last Published: ')]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            EX += " - " + "\t" + " === Navigate to Local Menu and Check for Changes" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
                if (FAIL) { return;}

            Thread.sleep(1000); 
            Refresh("Refresh", ParentTest, "no_jira"); 

            Wait_For_Element_By_Path_Presence("Wait for Local Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" + Category + "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(1000);


            Element_By_Path_Text("Get Item Name in Local Menu", "xpath", "//tr[1]/td[3]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!NBC.equals(t)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > Item Name was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Item Name Updated" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "Local Menu Item Name Updated to " + t, false, ParentTest.createNode(_t + ". " + "Check > Item Name was Updated in Local Menu"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > Item Name was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Item Name Updated" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";   
                Log_Html_Result("FAIL", "Local Menu Item Name Not Updated to " + t, true, ParentTest.createNode(_t + ". " + "Check > Item Name was Updated in Local Menu"), new Date());
            }
            // get price and check if it changed
            Element_By_Path_Text("Get Price in Local Menu", "xpath", "//tr[1]/td[5]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!PBC.equals(t)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > Price was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Price Updated" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";          
                Log_Html_Result("PASS", "Local Menu Price Updated to " + t, false, ParentTest.createNode(_t + ". " + "Check > Price was Updated in Local Menu"), new Date());
            } else {
                 _t++;
                 _f++; EX += _t + "\t" + "Check > Price was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Price Updated" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";         
                 Log_Html_Result("FAIL", "Local Menu Price Not Updated to " + t, true, ParentTest.createNode(_t + ". " + "Check > Price was Updated in Local Menu"), new Date());
            }
            // get calories and check if it changed
            Element_By_Path_Text("Get Calories in Local Menu", "xpath", "//tr[1]/td[8]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!CBC.equals(t)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > Calories was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Calories Updated" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";          
                Log_Html_Result("PASS", "Local Menu Calories Updated to " + t, false, ParentTest.createNode(_t + ". " + "Check > Calories was Updated in Local Menu"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > Calories was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Calories Updated" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";    
                Log_Html_Result("FAIL", "Local Menu Calories Not Updated to " + t, true, ParentTest.createNode(_t + ". " + "Check > Calories was Updated in Local Menu"), new Date());
            }
            // get units and check if it changed
            Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_By_Path_Attribute("Get Units Value in Local Menu", "css", "[aria-label='Units']", "value", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!UBC.equals(t)) {
                _t++;
                _p++; EX += _t + "\t" + "Check > Units was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Units Updated" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "Local Menu Units Updated to " + t, false, ParentTest.createNode(_t + ". " + "Check > Units was Updated in Local Menu"), new Date());
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check > Units was Updated in Local Menu" + "\t" + "-" + "\t" + "Local Menu Units Updated" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";    
                Log_Html_Result("FAIL", "Local Menu Units Not Updated to " + t, true, ParentTest.createNode(_t + ". " + "Check > Units was Updated in Local Menu"), new Date());
            }
            EX += " - " + "\t" + " === Changes in Global Menu Item Reflect on Local Menu Item" + "\t" + " ===== " + "\t" + " == Changes in Global Menu Item Reflect on Local Menu Item End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Manipulate Global Modifiers">  
            EX += " - " + "\t" + " === Manipulate Global Modifiers" + "\t" + " ===== " + "\t" + " == Manipulate Global Modifiers Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
            Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
                if (FAIL) { return;}
            Refresh("Refresh the page", ParentTest, "no_jira");    
            Wait_For_Element_By_Path_Presence("Wait for Modifier Group", "xpath", "//*[contains(text(),'MMTG')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'MMTG')]", ParentTest, "no_jira");
                if (FAIL) { return;}      
            EX += " - " + "\t" + " === Update existing modifier" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Wait_For_Element_By_Path_Presence("Wait for Modifier side panel", "xpath", "//div[contains(@class,'layout modifier')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);

            //DS Code Changes
            List_L2("Modifiers Count", "xpath", "//*[@class='layout modifier row wrap align-center']", ParentTest, "no_jira");             
                if (FAIL) { return;}   
            Move_to_Element("1st Mofifier Hover", L2.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            List_Child_E1_By_Path("Find 1st Mofifier Name input", L2.get(0), "xpath", ".//span[@class='Body-1-Black-Medium-Emphasis-Left']", ParentTest, "no_jira"); 
                if (FAIL) { return;}      
            Element_Click("1st Mofifier Name Click", e1, ParentTest, "no_jira"); 
                if (FAIL) { return;} 

            Element_By_Path_Text_DblClick_Copy("1st Mod Name", "css", "[aria-label='Item Name']", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            NBC = e.getAttribute("value");

            if (!NBC.contains("-upd")) {
                Element_By_Path_Input_Select_Clear("Clear > Item Name Field on Existing Modifier", "xpath", "(//*[@aria-label='Item Name'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Name for Existing Modifier", "xpath", "(//*[@aria-label='Item Name'])[1]", NBC + "-upd", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            } else {
                Element_By_Path_Input_Select_Clear("Clear > Item Name Field on Existing Modifier", "xpath", "(//*[@aria-label='Item Name'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Name for Existing Modifier", "xpath", "(//*[@aria-label='Item Name'])[1]", "existing1", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            }    
            Element_By_Path_Click("Click > Price Field on Existing Modifier", "xpath", "(//*[@aria-label='Price'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            // Price Before Change
            PBC = e.getAttribute("value");
            if (PBC.contains("1")) {
                Element_By_Path_Input_Select_Clear("Clear > Price Field on Existing Modifier", "xpath", "(//*[@aria-label='Price'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Price for Existing Modifier", "xpath", "(//*[@aria-label='Price'])[1]","2", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            } else {
                Element_By_Path_Input_Select_Clear("Clear > Price Field on Existing Modifier", "xpath", "(//*[@aria-label='Price'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Price for Existing Modifier", "xpath", "(//*[@aria-label='Price'])[1]","1", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            }
            Element_By_Path_Click("Click > Calories Field on Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            // Calories Before Change
            CBC = e.getAttribute("value");
            if (CBC.contains("1")) {
                Element_By_Path_Input_Select_Clear("Clear > Calories Field on Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Calories for Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]","200", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            } else {
                Element_By_Path_Input_Select_Clear("Clear > Calories Field on Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a Calories for Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]","100", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            }
            Element_By_Path_Click("Click > PLU Field on Existing Modifier", "xpath", "(//*[@aria-label='PLU:'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            //PLU Before Change
            String PLU = e.getAttribute("value");
            if (PLU.contains("1")) {
                Element_By_Path_Input_Select_Clear("Clear > PLU Field on Existing Modifier", "xpath", "(//*[@aria-label='PLU:'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a PLU for Existing Modifier", "xpath", "(//*[@aria-label='PLU:'])[1]","222", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            } else {
                Element_By_Path_Input_Select_Clear("Clear > PLU Field on Existing Modifier", "xpath", "(//*[@aria-label='PLU:'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Enter a PLU for Existing Modifier", "xpath", "(//*[@aria-label='PLU:'])[1]","111", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
            }
            EX += " - " + "\t" + " === Add new modifier to a group" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Scroll_to_WebElement("Scroll to 'ADD MODIFIER' button",  "xpath", "//*[contains(text(), 'Add MODIFIER')]", ParentTest, Ver);
                if (FAIL) { return;} 
            Element_By_Path_Click("Click > ADD MODIFIER", "xpath", "//*[contains(text(),'Add MODIFIER')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L1("Modifiers (+new) Count", "xpath", "//div[@class='layout modifier row wrap align-center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Scroll_to_Element("Scroll to new Mofified row", L1.get(L1.size() - 1), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_Text_Enter("Enter a Name for New Modifier", L1.get(L1.size() - 1), "css", "[aria-label='Item Name']", "add-delete-mod", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_Text_Enter("Enter a Price for New Modifier", L1.get(L1.size() - 1), "css", "[aria-label='Price']", "3", false, ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);

            EX += " - " + "\t" + " === Check modifier changes in Global Menu item" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

            Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" + Category + "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Items table", "xpath", "//*[text()='Menu Version: 2']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Second Item", "xpath", "//table/tbody/tr[2]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for Item side panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[3]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'Modifier Manipulation')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!NBC.contains("-upd")) {
                Find_Text("Check > Existing Modifier Name Changed", "existing1-upd", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Name Changed", "existing1", true, ParentTest, "no_jira");
            }
            if (PBC.contains("1")) {
                Find_Text("Check > Existing Modifier Price Changed", "$2.00", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Price Changed", "$1.00", true, ParentTest, "no_jira");
            }
            if (CBC.contains("1")) {
                Find_Text("Check > Existing Modifier Calories Changed", "Calories:200", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Calories Changed", "Calories:100", true, ParentTest, "no_jira");  
            }
            if (PLU.contains("1")) {
                Find_Text("Check > Existing Modifier PLU Changed", "PLU:222", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier PLU Changed", "PLU:111", true, ParentTest, "no_jira");
            } 

    /* Commenting because of changes in auto assigning of newly added modifier. To remove once Ram confirms*/
    //        Wait_For_Element_By_Path_Presence("Check > New Modifier Exists", "xpath", "//*[contains(text(),'add-delet-emod')]", ParentTest, "no_jira");
    //        if (FAIL) { return;}

            EX += " - " + "\t" + " === Check modifier changes in Local Menu item" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
            Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
                if (FAIL) { return;}            
            Thread.sleep(1000); 
            Refresh("Refresh", ParentTest, "no_jira");  

            Wait_For_Element_By_Path_Presence("Wait for Local Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" + Category + "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Items table", "xpath", "//*[text()='Menu Version: 2']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Second Item", "xpath", "//table/tbody/tr[2]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Item side panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[3]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'Modifier Manipulation')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!NBC.contains("-upd")) {
                Find_Text("Check > Existing Modifier Name Changed", "existing1-upd", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Name Changed", "existing1", true, ParentTest, "no_jira");
            }
            if (PBC.contains("1")) {
                Find_Text("Check > Existing Modifier Price Changed", "$2.00", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Price Changed", "$1.00", true, ParentTest, "no_jira");
            }
            if (CBC.contains("1")) {
                Find_Text("Check > Existing Modifier Calories Changed", "Calories:200", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier Calories Changed", "Calories:100", true, ParentTest, "no_jira"); 
            }
            if (PLU.contains("1")) {
                Find_Text("Check > Existing Modifier PLU Changed", "PLU:222", true, ParentTest, "no_jira");
            } else {
                Find_Text("Check > Existing Modifier PLU Changed", "PLU:111", true, ParentTest, "no_jira");
            }      


            EX += " - " + "\t" + " === Delete new modifier from the group" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
                if (FAIL) { return;}
            Refresh("Refresh the page", ParentTest, "no_jira");        
            Wait_For_Element_By_Path_Presence("Wait for Modifier Group", "xpath", "//*[contains(text(),'MMTG')]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'MMTG')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Move_to_Element_By_Path("Move > New Modifier", "xpath", "(//*[contains(@class,'layout modifier')])[2]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Delete on New Modifier", "xpath", "(//*[contains(@class,'layout modifier')])[2]//i[contains(@class,'mdi-delete')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);

            EX += " - " + "\t" + " === Check new modifier no longer exists in Global Menu item" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Refresh("Refresh the page", ParentTest, "no_jira");     
            Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" + Category + "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;}          
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Wait_For_Element_By_Path_Presence("Wait for Items table", "xpath", "//*[text()='Menu Version: 2']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Second Item", "xpath", "//table/tbody/tr[2]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Item side panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[3]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'Modifier Manipulation')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_InVisibility("Check > New Modifier no longer exists", "xpath", "//*[contains(text(),'add-delete-mod')]", ParentTest, "no_jira");
                if (FAIL) { return;}

            // Verifying if modifier item Name/ price/calories /PLU / chit is not editable
            List_L0("Find Disabled elements", "xpath", "//div[@class='pa-0']/descendant::div[contains(@class,'disabled')]", ParentTest, "no_jira");
            if(L0.size() == 6 || (L0.size()%6 == 0)) {
                _t++;
                _p++; EX += _t + "\t" + "Price,Calories,PLU,Item Enabled,Chit,Tax tags" + "\t" + "Disabled" + "\t" + " - " + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "Disabled", false, ParentTest.createNode(_t + ". " + "Price,Calories,PLU,Item Enabled,Chit,Tax tags are disabled"), new Date());
            }

            EX += " - " + "\t" + " === Check new modifier no longer exists in Local Menu item" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Refresh("Refresh the page", ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for Local Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > '" + Category + "' Category", "xpath", "//*[contains(text(),'" +Category+ "')][1]/parent::span", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Wait_For_Element_By_Path_Presence("Wait for Items table", "xpath", "//*[text()='Menu Version: 2']", ParentTest,"no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Second Item", "xpath", "//table/tbody/tr[2]/td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for Item side panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[3]", ParentTest,"no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Click > Modifier Group", "xpath", "//*[contains(text(),'Modifier Manipulation')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_InVisibility("Check > New Modifier no longer exists", "xpath", "//*[contains(text(),'add-delete-mod')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            EX += " - " + "\t" + " === Manipulate Global Modifiers" + "\t" + " ===== " + "\t" + " == Manipulate Global Modifiers End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            // </editor-fold> 
        } 
    } catch (Exception ex){    
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }  

    }
}