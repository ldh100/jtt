package AP3;

import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;
 /*
 * For 'Manipulate Global Modifiers' test cases use Site: Ap3 Automation, Brand: Starbucks (App: Thrive)
 * Manually check that the Global Modifier group 'Modifier Manipulation Test Group' with Label in App set to 'MMTG' exists
 * If it doesn't exist, create it manually and add one modifier with Name: existing1, Price: $1, Calories: 100, PLU:111
 * and set any required Chit # to 1, save and publish
 * Then go to Global Menu and add this Modifier Group to second item in 'Lunch' -> 'Beverages Lunch' menu set,
 * save and publish
 */
class AP3_menu_manager extends AP3_GUI{
    protected AP3_menu_manager (AP3_GUI a) {
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
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }  
    
    protected void run() { 
    try {
    //        DH menu IDs; see https://teamideaworks.atlassian.net/browse/AUT-253
    //        A3lvmE18ORC7zv1GkPG - Brand: PIZZA PIZZA, Site: Sheridan College Davis B & C Wing, Unit: Sheridan College Davis C-Wing
    //        z03ykAm5JNszPA7Ne3X - Brand: Tim Hortons, Site: Sheridan College Davis B & C Wing, Unit: Sheridan College Davis C-Wing
    //        NWEJgN87Q3Sw46JaQ1Q - Brand: PARAMOUNT,   Site: Fennel, Unit: Mohawk College

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

        // <editor-fold defaultstate="collapsed" desc="Training Video">
        Element_By_Path_Click("Trainig Video Icon Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-help-circle')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Swith_to_Frame("Swith to Video Player", "tagName", "iframe", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);               
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

        // <editor-fold defaultstate="collapsed" desc="Global Modifiers">  
        EX += " - " + "\t" + " === MM Global Modifiers " + "\t" + " ===== " + "\t" + " == Global Modifiers Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        List_L3("Menus Pages Count", "xpath", "//button[contains(@class, 'v-pagination__item')]", ParentTest, "no_jira"); 
        PAGES = L3.size();
        
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
                Scroll_to_Element("Scroll to Pagination", L3.get(1), ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_Click("Click Navigation Page 2", L3.get(1), ParentTest, "no_jira");
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
                    Scroll_to_Element("Scroll to Pagination", L3.get(2), ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_Click("Click Navigation Page 3", L3.get(2), ParentTest, "no_jira");
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
        if(T_Index > -1){
            Find_Text("Fund 'Search...' text", "Search Global Menus", true, ParentTest, "no_jira");   
                if (FAIL) { return;}             
            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Global Menus')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Global Menus']", GL_MENU, false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);                
            Element_Click("Click Menu " + GL_MENU, L2.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}  
//            List_L1("Local Menus count", "xpath", "//div[@class='layout hover indent align-center row wrap']", ParentTest, "no_jira");         
//                if (FAIL) { return;}       
//                for (int j = 0; j < L1.size(); j++) {    
//                   Element_Attribute("Local Menu (Index " + j + ") Name", L1.get(j), "textContent", ParentTest, "no_jira"); 
//                }                  
            
            Find_Text("Find Global Menu", "Global Menu", true, ParentTest, "no_jira");   
                if (FAIL) { return;}  
            Find_Text("Find Local Menus", "Local Menus", true, ParentTest, "no_jira");   
                if (FAIL) { return;}  
            Find_Text("Find Global Modifier groups", "Global Modifier Groups", true, ParentTest, "no_jira");   
                if (FAIL) { return;}  
            Find_Text("Find Local Menus", "Local Menus", true, ParentTest, "no_jira");   
                if (FAIL) { return;}  
            Text_Found("Find : No local menus matching your search criteria found", "No local menus matching your search criteria found", ParentTest, "no_jira");
                if (FAIL) { return;}
            
            Element_By_Path_Click("Click on Global Modifiers", "xpath", "//span[@id='global-mod-label']", ParentTest, "no_jira");
                if (FAIL) { return;}
//            List_Child_E1_By_Path("Find " + GL_MENU + " 'View Global Modifiers Groups' button", L2.get(T_Index), "xpath", ".//button[@type='button'][2]", ParentTest, "no_jira"); 
//                if (FAIL) { return;} 
//            Element_Click("Click 'View Global Modifiers Groups'", e1, ParentTest, "no_jira"); 
//                if (FAIL) { return;} 
            Thread.sleep(500);   
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            To_Top("Scroll to page Top", ParentTest, "no_jira"); // Temp fix for BUG
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_Presence("Wait for page load", "tagName", "table", ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(500);       
            Page_URL("Current page URL", ParentTest, "no_jira");
            Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
                if (FAIL) { return;}              

            //<editor-fold defaultstate="collapsed" desc="Pagination">   
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
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
            Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500); 

            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
//                if (FAIL) { return;}
            Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if(t.equals("–")){
                    NO_DATA = true;
                }
            To_Top("Scroll to page Top", ParentTest, "no_jira");
                if (FAIL) { return;}
            //</editor-fold>
            
            List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}  
                }                          

            // ================ New Group
            Element_By_Path_Click("Click 'NEW GROUP'", "xpath", "//*[contains(text(), 'new group')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(500);     
            Element_By_Path_Text_Enter("Enter Group Name", "css", "[aria-label='Modifier Group Name']", "New Group " + New_ID, false, ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Text_Enter("Enter Label In App", "css", "[aria-label='Label In App']", "Label " + New_ID , false, ParentTest, "no_jira");
                if (FAIL) { return;}  
                
            Element_E1_Find("Find Rules fragment", "xpath", "//div[@class='layout size-line row wrap align-baseline']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Child_E2("Find 'Rules' drop-down", e1, "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                if (FAIL) { return;}                
            Element_Click("Combo-box 'Rules' open Click", e2, ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_E2_Find("Find Rules list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                             
            Element_Child_List_L1("Rules Count", e2,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Tax Tag (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    if(t.contains("Maximum")){ 
                        T_Index = i; 
                    }
                } 
                if(T_Index > -1){
                    Element_Click("Click 'Maximum'", L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_Child_E2("Find 'number' input", e1, "xpath", ".//input[@type='number']", ParentTest, "no_jira");
                        if (FAIL) { return;}   
                    Element_Text_Enter("Enter 'Max' 12", e2, "12", ParentTest, "no_jira"); 
                        if (FAIL) { return;} 
                    Find_Text("Fund 'Error...' text", "There must be at least 12 modifiers", true, ParentTest, "no_jira");   
                        if (FAIL) { return;} 
                    Element_Text_Clear(" 'Max' 12 Clear", e2, ParentTest, "no_jira"); 
                        if (FAIL) { return;}   
                    Element_Text_Enter("Enter 'Max' 1", e2, "1", ParentTest, "no_jira"); 
                        if (FAIL) { return;} 
                } 

            // ================ Add New Modifier(s) 
            Element_By_Path_Click("Click  'Add MODIFIER'", "xpath", "//*[contains(text(), 'Add MODIFIER')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            To_Bottom("Scroll to page Bottom", ParentTest, "no_jira");
                if (FAIL) { return;}   
                
            List_L0("Modifier Name Count", "css", "[aria-label='Item Name']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text_Enter("Modifier Name (" + i + ") Enter", L0.get(i), "Mod " + i + " " + New_ID, ParentTest, "no_jira");             
                    if (FAIL) { return;}
                } 
            List_L0("Price Count", "css", "[aria-label='Price']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text_Enter("Price (" + i + ") Enter", L0.get(i), Integer.toString(i+2) + ".25", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                }            
            List_L0("Calories Count", "css", "[aria-label='Calories']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text_Enter("Calories (" + i + ") Enter", L0.get(i), "10" + Integer.toString(i*2), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                }               
            List_L0("PLU: Count", "css", "[aria-label='PLU:']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Element_Text_Enter("PLU: (" + i + ") Enter", L0.get(i), "60010" + Integer.toString(i*2), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                }  
            List_L0("Chit # Count", "css", "[min='0']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Element_Click("Chit # (" + i + ") Click", L0.get(i), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    Element_Text_Enter("Chit # (" + i + ") Enter", L0.get(i), Integer.toString(i+1), ParentTest, "no_jira");             
                    if (FAIL) { return;}
                }   
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
//            Click_out_of_Element_By_Path("Tax Tags dropdown Close", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  "Top",4, 4, ParentTest, "no_jira");
//                if (FAIL) { return;}
                    
            Element_By_Path_Click("Click on Modifier label", "xpath", "//div[normalize-space()='Modifiers']", ParentTest, "no_jira");
             if (FAIL) { return;}
            
             //Clone the last modifier and verify API calls for unique ids
            //<editor-fold defaultstate="collapsed" desc="Clone modifier">   
            List_L2("Modifiers Count", "xpath", "//div[@class='layout modifier row wrap align-center']", ParentTest, "no_jira");             
                if (FAIL) { return;}                
            Move_to_Element("Last Modifier Hover", L2.get(L2.size() - 1), ParentTest, "no_jira"); 
                if (FAIL) { return;}    
                
            List_Child_E1_By_Path("Find 'Clone' Modifier icon", L2.get(L2.size() - 1), "xpath", ".//i[@class='v-icon mdi mdi-content-copy theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return;}      
            Element_Click("'Clone' Last Modifier Click", e1, ParentTest, "no_jira"); 
                if (FAIL) { return;}     
             To_Bottom("Scroll to page Bottom", ParentTest, "no_jira");
                if (FAIL) { return;}          

            Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira"); 
              if (FAIL) { return;}     
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                                                                           
            Thread.sleep(500);
               Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Refresh("Refresh after PUBLISH", ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            
            //To find Modifier group ID    
            String Mod_grp_id ="";    
            Call_API("Call /Menu/Company / API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/modifier/group/company/" + CompanyID, true, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            JSONObject json = new JSONObject(t);
            JSONArray mod_items = new JSONArray();
            mod_items = json.getJSONArray("modifier_groups");
            if(mod_items.isEmpty()) {
               _t++;
               _p++; EX += _t + "\t" + "No Modifier items exists" + "\t" + "-" + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                for (int i = 0; i < mod_items.length(); i++) {
                    JSONObject mod_item = mod_items.getJSONObject(i);
                    if(mod_item.getString("unique_name").equalsIgnoreCase("New Group " + New_ID))
                    {
                      Mod_grp_id = mod_item.getString("id");
                    }//End of if
                }//End of for     
            } //End of else
            
            //To verify cloned id is different from original in Menu modifier group.
            String Original_Mod_ID_Name = "";
            String Copy_Mod_ID = "";
            String Copy_Mod_ID_Name = "";
         
            Call_API("Call /Menu/Modifier / API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/modifier/group/"+Mod_grp_id, true, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            JSONObject json1 = new JSONObject(t);
            JSONArray modifier_items = new JSONArray();
            modifier_items = json1.getJSONArray("items");
            for (int i=0;i<modifier_items.length();i++) {
               JSONObject modifier_item = modifier_items.getJSONObject(i) ;
               if(modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en").contains("copy")) {
                   Copy_Mod_ID = modifier_item.getString("id");
                   Copy_Mod_ID_Name = modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en");
                   Original_Mod_ID_Name = Copy_Mod_ID_Name.substring(0, Copy_Mod_ID_Name.length()-5);
                   break;
               }
            }//End of for
            boolean flag = true;
            for (int i=0;i<modifier_items.length();i++) {
                JSONObject modifier_item = modifier_items.getJSONObject(i) ;
                if(modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en").equals(Original_Mod_ID_Name))   {
                    if(!(modifier_item.getString("id").equals(Copy_Mod_ID))) { //print pass unique id message 
                      _t++;
                      _p++; EX += _t + "\t" + "Unique ids for copied modifiers" + "\t" + modifier_item.getString("id") + "\t" + Copy_Mod_ID + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                      flag = false;
                    } else {   _t++;
                       _f++; EX += _t + "\t" + "Same ids for copied modifiers" + "\t" + modifier_item.getString("id") + "\t" + Copy_Mod_ID + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                }
            }//End of for
            if(flag) {  //Print error message could not find original modifier.
                _t++;
                _f++; EX += _t + "\t" + "Original Modifier does not exist" + "\t" + "-" + "\t" + "" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            //</editor-fold> 
                
            //<editor-fold defaultstate="collapsed" desc="Verify modifier API call">  
            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Validating modifiers in global menu==" + "\t" + "-" +"\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            //API Response is from the previous test of cloned id's

            if(json1.has("unique_name")) {
                if(json1.getString("unique_name").equals("New Group " + New_ID)) {
                 _t++;
                 _p++; EX += _t + "\t" + "Mod Group Name's are same" + "\t" + json1.getString("unique_name") + "\t" + "New Group " + New_ID + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                  _t++;
                  _f++; EX += _t + "\t" + "Mod Group Name's are different" + "\t" + json1.getString("unique_name") + "\t" + "New Group " + New_ID + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            }
            String label = json1.getJSONObject("meta").getJSONObject("original_label").getString("en");
            if(label.equals("Label "+New_ID)) {    _t++;
                _p++; EX += _t + "\t" + "In-App Label Name's are same" + "\t" + label + "\t" + "Label " + New_ID + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {  _t++;
               _f++; EX += _t + "\t" + "In-App Label Name's are different" + "\t" + label + "\t" + "Label  "+ New_ID + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }

            if(json1.has("max") && !json1.has("min")) {
                if(json1.getInt("max") == 1) { _t++;
                    _p++; EX += _t + "\t" + "Modifier rules are same" + "\t" + "Maximum: "+json1.getInt("max") + "\t" + "Maximum: 1" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Modifier rules are different" + "\t" + "Maximum: "+json1.getInt("max") + "\t" + "Maximum: 1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }    
            }
            flag = true;
            for (int i=0; i<modifier_items.length(); i++) {
                JSONObject modifier_item = modifier_items.getJSONObject(i) ;
                if(modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en").contains("Mod 0 " + New_ID)) {
                    _t++;
                    _p++; EX += _t + "\t" + "Modifier Name same" + "\t" + "Mod 0 "+ New_ID + "\t" + "Mod 0 "+ New_ID + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";

                    if(modifier_item.getJSONObject("meta").getInt("sort_number")==2) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Sort number (Chit#) same" + "\t" + "Chit#: 2" + "\t" + "Chit#: 2" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier Sort number (Chit#) different" + "\t" + "Chit#: "+modifier_item.getJSONObject("meta").getInt("sort_number") + "\t" + "Chit#: 2" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("meta").getJSONArray("taxes").getString(0).equals("Prepared")) {
                      _t++;//Print Pass
                     _p++; EX += _t + "\t" + "Tax Tags are same" + "\t" + "Tax Tag : Prepared" + "\t" + "Tax Tag : Prepared" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _t++;//Print Fail
                        _f++; EX += _t + "\t" + "Tax Tags are different" + "\t" + "Tax Tag : "+modifier_item.getJSONObject("meta").getJSONArray("taxes").getString(0) + "\t" + "Tax Tag : Prepared" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("price").getDouble("amount")== 2.25)  {
                        _t++;//Print pass
                        _p++; EX += _t + "\t" + "Modifier price are same" + "\t" + "Price : 2.25" + "\t" + "Price : 2.25" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier price are different" + "\t" + "Price : "+modifier_item.getJSONObject("price").getDouble("amount") + "\t" + "Price : 2.25" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("nutrition").getJSONObject("calories").getInt("amount") == 100) {
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Calories are same" + "\t" + "Calories : 100" + "\t" + "Calories : 100" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier Calories are different" + "\t" + "Calories : "+modifier_item.getJSONObject("nutrition").getJSONObject("calories").getInt("amount") + "\t" + "Calories : 100" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("meta").getString("plu").equals("600100")) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "PLU's are same" + "\t" + "PLU : 600100" + "\t" + "PLU : 600100" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else  {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "PLU's are different" + "\t" + "PLU : "+modifier_item.getJSONObject("meta").getString("plu") + "\t" + "PLU : 600100" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                    flag = false;
                }
                else if(modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en").contains("Mod 1 "+New_ID)) {//For both Mod 1 and Mod 1 copy
                    if(modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en").contains("Mod 1 "+New_ID+" copy")){
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Name same" + "\t" + "Mod 1 "+New_ID+" copy" + "\t" + "Mod 1 "+New_ID+" copy" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Name same" + "\t" + "Mod 1 "+New_ID + "\t" + "Mod 1 "+New_ID + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("meta").getInt("sort_number")==3) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Sort number (Chit#) same" + "\t" + "Chit#: 3" + "\t" + "Chit#: 3" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier Sort number (Chit#) different" + "\t" + "Chit#: "+modifier_item.getJSONObject("meta").getInt("sort_number") + "\t" + "Chit#: 3" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("price").getDouble("amount")== 3.25) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier price are same" + "\t" + "Price : 3.25" + "\t" + "Price : 3.25" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier price are different" + "\t" + "Price : "+modifier_item.getJSONObject("price").getDouble("amount") + "\t" + "Price : 3.25" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("nutrition").getJSONObject("calories").getInt("amount") == 102) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "Modifier Calories are same" + "\t" + "Calories : 102" + "\t" + "Calories : 102" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "Modifier Calories are different" + "\t" + "Calories : "+modifier_item.getJSONObject("nutrition").getJSONObject("calories").getInt("amount") + "\t" + "Calories : 102" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }

                    if(modifier_item.getJSONObject("meta").getString("plu").equals("600102")) {//Print pass
                        _t++;
                        _p++; EX += _t + "\t" + "PLU's are same" + "\t" + "PLU : 600102" + "\t" + "PLU : 600102" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {//Print Fail
                        _t++;
                        _f++; EX += _t + "\t" + "PLU's are different" + "\t" + "PLU : "+modifier_item.getJSONObject("meta").getString("plu") + "\t" + "PLU : 600102" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                    flag = false;
                } else if(flag) { // Print fail unidentifed modifier
                    _t++;
                    _f++; EX += _t + "\t" + "Unidentified Modifier " + "\t" + modifier_item.getJSONObject("meta").getJSONObject("original_label").getString("en") + "\t" + "No new modifiers" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Validating modifiers in global menu==" + "\t" + "-" +"\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            }//End of for
            //</editor-fold> 
           

            //<editor-fold defaultstate="collapsed" desc="Pagination">   
            Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                      //  v-menu__content theme--light v-menu__content--auto menuable__content__active
            Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i), ParentTest, "no_jira");
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
           //</editor-fold>  
   
            List_L0("Groups Count after Add Group", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                T_Index = -1;  
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                    for (int i = 2; i < L0.size(); i++) {
                        List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                            if(t.trim().contains("New Group " + New_ID)){
                                T_Index = i;
                        }
                    } 
            Element_Click("Select New Group", L0.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);
//            Wait_For_Element_By_Path_Presence("WaitForElement Selected Group page", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Cancel'", "xpath", "//div[contains(text(), 'Cancel')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
                  
          //<editor-fold defaultstate="collapsed" desc="Deleting Modifier & API Verification">  
            Element_Click("Select New Group Again", L0.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}   
            List_L2("Mofifiers Count", "xpath", "//div[@class='layout modifier row wrap align-center']", ParentTest, "no_jira");             
                if (FAIL) { return;}                
            Move_to_Element("Last Mofifier Hover", L2.get(L2.size() - 1), ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            List_Child_E1_By_Path("Find 'Delete' Mofifier icon", L2.get((L2.size() - 1)), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}      
            Element_Click(" 'Delete' Last Mofifier Click", e1, ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Element_By_Path_Click("Click  'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira"); 
              if (FAIL) { return;}
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                                                                            
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);
            Call_API("Call /Menu/Modifier / API", "Bearer " + AP3_TKN, BaseAPI + "/menu/modifier/group/" + Mod_grp_id, true, ParentTest, "no_jira" );
                if (FAIL) { return;} 
            json1 = new JSONObject(t);
            modifier_items = new JSONArray();
            modifier_items = json1.getJSONArray("items");
            flag = true;
            for (int i=0;i<modifier_items.length();i++)
            {
               JSONObject modifier_item = modifier_items.getJSONObject(i) ;
               if(modifier_item.getString("id").equals(Copy_Mod_ID))            
               {  
                 _t++;
                 _f++; EX += _t + "\t" + "Modifier has not been deleted: " + Copy_Mod_ID_Name + "\t" + "-" + "\t" + "" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                 flag = false;
               }
            }//End of for  
            if(flag)
            {
              _t++;
              _p++; EX += _t + "\t" + "Modifier is deleted: " + Copy_Mod_ID_Name + "\t" + "-" + "\t" + "-" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
             //</editor-fold>  
             
            // Delete New Group
            if(!NO_DATA && T_Index > -1){
                List_Child_E1_By_Path("Find 'Delete' New Group " + New_ID, L0.get(T_Index), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_Click("New Group " + New_ID + " 'Delete' Click", e1, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                    if (FAIL) { return;} 
                Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                                                                            
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                List_L0("Groups Count after Delete - Publish", "tagName", "tr", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                }                     
            } else{   
                Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                    if (FAIL) { return;} 
                Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                                                                           
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
//                Wait_For_Element_By_Path_Presence("WaitForElement for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", ParentTest, "no_jira"); 
//                        if (FAIL) { return;}                    
            }
                
            // ======================== Group Copy >>>> 
            //<editor-fold defaultstate="collapsed" desc="Pagination">   
            Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira");
            if (FAIL) { return;}

            Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light v-menu__content--auto menuable__content__active
            Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i), ParentTest, "no_jira");
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
            //</editor-fold>
             
            List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                }             
            List_Child_E1_By_Path("Find 'Copy' Last Group", L0.get((L0.size() - 1)), "xpath", ".//i[@class='v-icon mdi mdi-content-copy theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_Click("Click 'Copy' Last Group", e1, ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(1000);
            List_L0("Groups Count after Copy", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}   
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                }    
            int S = L0.size(); 
            Element_Click("Select Copied Group", L0.get(S-1), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_By_Path_Input_Select_Clear("Copied Group Name Clear", "css", "[aria-label='Modifier Group Name']", ParentTest, "no_jira");
                if (FAIL) { return;}    
            Element_By_Path_Text_Enter("Enter New Copied Group Name", "css", "[aria-label='Modifier Group Name']", "Copied Group " + New_ID, false, ParentTest, "no_jira");
                if (FAIL) { return;}    
                
            Element_By_Path_Click("Click  'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}            
              
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                if (FAIL) { return;} 
            Thread.sleep(500);
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            List_L0("Groups Count after Copy - Publish", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                }  
            if(S == L0.size()){
                // ======================== Copied  Group Delete >>>> 
                List_Child_E1_By_Path("Find 'Delete' Copied Group", L0.get((S - 1)), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_Click(" 'Delete' Copied Group Click", e1, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                                                                            
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                List_L0("Groups Count after Copied Delete - Publish", "tagName", "tr", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}
                }                   
            }else{
                _t++; _f++;
                EX += " - " + "\t" + "Copy Modifier Group" + "\t" + "Copied after Publish"+ "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            }
            // ======================== New Group Copy ^^^^ End

            // ======================== Modify Group / Modifiers
            Element_Click("Select 1st Group to modify", L0.get(2), ParentTest, "no_jira"); // 1st > index 2
                if (FAIL) { return;} 
            Thread.sleep(500); 
            Element_By_Path_Text_Select_Copy("Label In App", "css", "[aria-label='Label In App']", ParentTest, "no_jira"); 
                if (FAIL) { return;}          
            Element_By_Path_Text_Select_Copy("Group Chit #", "css", "[min='0']", ParentTest, "no_jira"); 
                if (FAIL) { return;}  
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
            Element_By_Path_Text_DblClick_Copy("1st Mod Price", "css", "[aria-label='Price']", ParentTest, "no_jira"); 
                if (FAIL) { return;}                  
            Element_By_Path_Text_DblClick_Copy("1st Mod Calories", "css", "[aria-label='Calories']", ParentTest, "no_jira"); 
                if (FAIL) { return;}       
            Element_By_Path_Text_DblClick_Copy("1st Mod PLU", "css", "[aria-label='PLU:']", ParentTest, "no_jira"); 
                if (FAIL) { return;}   
                
            Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'Cancel')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                
            // ===============================================================================================================================  
            Navigate_Back("Navigate Back"," 'globalmods' page"," 'menu' page", ParentTest, "no_jira"); 
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}               
            Wait_For_Element_By_Path_Presence("Wait for Menu page load", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                
        } else {
           _t++; 
           _f++;
           EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
           return;
        }
        EX += " - " + "\t" + " === MM Global Modifiers " + "\t" + " ===== " + "\t" + " == Global Modifiers End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>       


        // <editor-fold defaultstate="collapsed" desc="Local Brands">  
        EX += " - " + "\t" + " === MM Local Brands" + "\t" + " ===== " + "\t" + " == Local Brands Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        List_L3("Menus Pages Count", "xpath", "//button[contains(@class, 'v-pagination__item')]", ParentTest, "no_jira"); 
        PAGES = L3.size();
        
        List_L2("Menus Count on the Page 1", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
            if (FAIL) { return;}
//            T_Index = -1;
            for (int i = 2; i < L2.size(); i++) { 
                Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
//                if(t.trim().startsWith(GL_MENU)){
                    T_Index = 1;
//                } 
            }
            if(PAGES > 1){
                Scroll_to_Element("Scroll to Pagination", L3.get(1), ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_Click("Click Navigation Page 2", L3.get(1), ParentTest, "no_jira");
                    if (FAIL) { return;}                
                List_L2("Menus Count on the Page 2", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                T_Index = 1;
                for (int i = 0; i < L2.size(); i++) { 
                    Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
//                    if(t.trim().startsWith(GL_MENU)){
//                        T_Index = i;
//                    } 
                } 
                if( PAGES > 2){
                    Scroll_to_Element("Scroll to Pagination", L3.get(2), ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    Element_Click("Click Navigation Page 3", L3.get(2), ParentTest, "no_jira");
                        if (FAIL) { return;}                
                    List_L2("Menus Count on the Page 3", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    T_Index = 1;
                    for (int i = 0; i < L2.size(); i++) { 
                        Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira"); 
//                        if(t.trim().startsWith(GL_MENU)){
//                            T_Index = i;
//                        } 
                    } 
                }            
            }
        if(T_Index > -1){ 
//            Find_Text("Fund 'Search...' text", "Search Menus", true, ParentTest, "no_jira");   
//                if (FAIL) { return;}             
//            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
//                if (FAIL) { return;} 
//             Thread.sleep(500);
//             
//            List_Child_E1_By_Path("Find 'View Local Brands' button", L2.get(T_Index), "xpath", ".//button[@type='button'][3]", ParentTest, "no_jira"); 
//                if (FAIL) { return;} 
//            Element_Click("Click 'View Local Brands'", e1, ParentTest, "no_jira"); 
//                if (FAIL) { return;}  
//            Thread.sleep(500);  
//            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}  
//            Thread.sleep(500);  
//            Page_URL("Current page URL", ParentTest, "no_jira");             
//            Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
//                if (FAIL) { return;}                  
//            Find_Text("Fund 'Search...' text", "Search Menus", true, ParentTest, "no_jira");   
//                if (FAIL) { return;}             
//            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            if(Location.isEmpty()){
//                _t++; 
//                _f++;
//                EX += " - " + "\t" + "Find Local Menu by Brand Location" + "\t" + BRAND + "\t" + "Location is Blank - Cannot locate Local Menu" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
//                return;
//            }
            Element_By_Path_Text_Enter("Enter Local Menu Search", "css", "input[aria-label='Search Local Menus']", Location, false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(1000);  
            Element_By_Path_Click("Click 'VIEW LOCAL MENUS'", "xpath", "//span[@id='local-menu-label-0']", ParentTest, "no_jira");
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);        
            To_Top("Scroll to page Top", ParentTest, "no_jira");        
            Thread.sleep(500);
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(500); 
            List_L1("Menu Sets Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Attribute("Menu Set (Index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");  
                }               

            Element_Click("Click 1st Menu Set", L1.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(500);                 
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                         
          
            // Bulk update  DEBUG, Hide inactive test steps 
            Element_E1_Find("Find 'Bulk' container", "xpath", "//div[@class='layout justify-left align-center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_Text("Find 'Bulk' default prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
            Element_Child_E2("Find 'Bulk' select All checkbox", e1,"xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                if (FAIL) { return;}           
            Element_Click("Check 'Bulk' select All", e2, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_E2("Find 'Bulk' updated prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Text("Find 'Bulk' updated prompt text", e2, ParentTest, "no_jira");
            Element_Click("Click 'Update X Items' prompt", e2, ParentTest, "no_jira");
                if (FAIL) { return;}
            
            Element_By_Path_Click("Click 'Hide In App'", "css", "[aria-label='Hide In App']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//div[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            
            Element_E1_Find("Find 'Hide Inactive' container", "xpath", "//div[@class='flex offset-xs10']", ParentTest, "no_jira");
                if (FAIL) { return;}             
            Element_Child_E2("Find 'Hide Inactive' checkbox", e1, "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_Click("Check 'Hide Inactive'", e2, ParentTest, "no_jira");
                if (FAIL) { return;}  // =============================               
            List_L1("Hidden Items Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            Element_Text("Items Row Header", L1.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                for (int i = 2; i < L1.size(); i++) {
                    List_TR_TDs("Items Row Data", L1.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}  
                }  
            Element_Click("UnCheck 'Hide Inactive'", e2, ParentTest, "no_jira");
                if (FAIL) { return;}  // =============================        
            List_L1("Visible Items Rows Count", "tagName", "tr", ParentTest, "no_jira"); 
            Element_Text("Items Row Header", L1.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
                for (int i = 2; i < L1.size(); i++) {
                    List_TR_TDs("Items Row Data", L1.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}  
                }             
            Element_E1_Find("Find 'Bulk' container", "xpath", "//div[@class='layout justify-left align-center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_Text("Find 'Bulk' default prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
            Element_Child_E2("Find 'Bulk' select All checkbox", e1,"xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Click("Check 'Bulk' select All", e2, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_E2("Find 'Bulk' updated prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Text("Find 'Bulk' updated prompt text", e2, ParentTest, "no_jira");
            Element_Click("Click 'Update X Items' prompt", e2, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'In Stock'", "css", "[aria-label='In Stock']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Visible In App'", "css", "[aria-label='Visible In App']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//div[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            List_L1("Visible Item Rows Count", "tagName", "tr", ParentTest, "no_jira");                     
            
        } else {
            _t++; 
            _f++;
            EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            return;
        } 
        Navigate_Back("Navigate Back","MM 'Local Brands' page","MM 'Sector' page", ParentTest, "no_jira"); 
//        Find_Text("Find 'Leave...' note", "Changes will be lost if you do not publish.", true, ParentTest, "no_jira"); 
//            if (FAIL) { return; }   
//        Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira"); 
//            if (FAIL) { return; }         
//        Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
//            if (FAIL) { return; }     
//        Element_By_Path_Click("Click 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira"); 
//            if (FAIL) { return;}          
        
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}               
        //Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for 'Local Brands' page", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira"); 
            if (FAIL) { return;}      
            
        EX += " - " + "\t" + " === MM Local Brands" + "\t" + " ===== " + "\t" + " == Local Brands End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
       
    } catch (Exception ex){}   // =============================================  
    }
}