package AP3;

import java.io.File;
import java.time.LocalDate;

/**
 *
 * @author dhruv.seth
 */
//Export Automation tickets AUT-876

class AP3_export_menuset extends AP3_GUI{
    protected AP3_export_menuset (AP3_GUI a) throws InterruptedException, Exception {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;        
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
        AP3_TKN = a.AP3_TKN;
        
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
    
        String MenuSetName = "";
        String MenuSetFile = "";
        
        //<editor-fold defaultstate="collapsed" desc="Select Global Menu">
        //This block clicks Menu Manager, selects group that was selected in GUI, searches and clicks on the global menu that was selected in jtt
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > 'Menu Manager' Click", "xpath", "//*[contains(text(), 'Menu Manager')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");
            if (FAIL) { return;}

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu Manager page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Go to Menu' text", "Go to menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled",ParentTest, "no_jira");
            if (FAIL) { return;}

        // =========================================== Group Selection
        Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) return;
        Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}
        // ========================================= Group Selection ^^^^

        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);

        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}            
        //</editor-fold>
        

        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
        //Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent",ParentTest, "no_jira"); 
        // ^^^ fails
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL || L0.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            } 
        Element_Attribute("Menu setName", L0.get(0), "textContent", ParentTest, "no_jira");      
        MenuSetName = t; // ==========================

//        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 2), "tagName", "button", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(0), "tagName", "button", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Thread.sleep(500);
        Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
            if (FAIL) { return;}   
//Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}                
        Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  ParentTest, "no_jira");                      
                if(t.contains("Export")){ 
                    T_Index = i; 
                }                    
            } 
//        Element_By_Path_Text("Get 'Export' button text", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Export']", ParentTest, "no_jira");                
//            if (FAIL) { return;}    
        Element_By_Path_Attribute("Check 'rename' is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Click("Click Category 'Export'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(5000);  // ============ give time to load file
        String destinationDir = System.getProperty("user.home") + File.separator + "Downloads"; 
        MenuSetFile = MenuSetName.trim() + " - " + LocalDate.now() +".zip";    // Lunch - 2021-06-15.zip

        File_Find("Find Report Zip File", destinationDir, MenuSetFile, ParentTest, "no_jira");
            if (FAIL) { return;}    
        File_UnZip("Unzip Report File", destinationDir, MenuSetFile, ParentTest, "no_jira");
            if (FAIL) { return;}            
        File_Delete("Delete Report Zip File", destinationDir,MenuSetFile , ParentTest, "no_jira");
            if (FAIL) { return;}      
        File_Read("Check Report File", destinationDir, MenuSetName.trim() + ".xlsx", "Record Type", "Value to Check", ParentTest, "no_jira");
            if (FAIL) { return;}  
        File_Delete("Delete Report Unzipped File", destinationDir, MenuSetName.trim() + ".xlsx" , ParentTest, "no_jira");
            if (FAIL) { return;}              
    } 
}
