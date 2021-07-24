package AP3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 *
 * @author dhruv.seth
 */
        //AUT-296: Validating only those menus that exist in the global menu are available to be assigned in the brand configuration
        //AUT-293: Removing and re-adding the global menus in the brand configuration
        //AUT-294: Removing a category and re-adding it in brand configuration
        //AUT-295: Validating all categories return that exist in the global menu
        //AUT-: 

class AP3_brand_config extends AP3_GUI {

    private String stationName = "";
    protected AP3_brand_config(AP3_GUI a) {
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
        CompanyID=a.CompanyID;

        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }
    private String API_Response_Body = "";    
    private String MenuName="";      
    private String Menu_ID="";
    private String MenuSetName="";
    private String Categories_Enabled="";
    private String Categories_Disabled="";
    private String Categories="";
    private List<String> Categories_DisabledList= new ArrayList<>(); 
    private List<String> Categories_EnabledList= new ArrayList<>();

    private boolean flag = false;
    protected void run() {
    try{ 
        
        
        selectingGlobalMenu();
        
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent",ParentTest ,"no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]",ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);        
        
        //Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent",ParentTest, "no_jira"); 
        // ^^^ fails
        List_L2("Published Menus ID Count", "css", "[menu-id]", ParentTest, "no_jira");
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL || L0.isEmpty()) { 
                return;
            }            
            List<String> MenuNamesGlobal=new ArrayList<>();
            if(L0.size() == L2.size())
            for (int i = 0; i < L0.size(); i++) {                
                Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}
                Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira");
                if (FAIL) { return;}
                 //String myList= L0.get(i).getAttribute("textContent").trim(); 
                 //System.out.println(myList);
                  MenuNamesGlobal.add(L0.get(i).getAttribute("textContent").trim());                  
                  System.out.println("ds: "+MenuNamesGlobal.get(i));                                                      
                                        
            Thread.sleep(500);
            }
            
            
            Element_Attribute("Menu setName", L0.get(0), "textContent",ParentTest, "no_jira");                       
             MenuSetName= t.trim();
            System.out.println("ds: "+MenuSetName);
            Element_Attribute("Menu ID", L2.get(0), "menu-id", ParentTest, "no_jira");
             Menu_ID=t.trim();
             
             System.out.println("ds: "+Menu_ID);
        //Brand_config starts here
           
        
           Call_GlobalMenuSet_API( Menu_ID, MenuSetName);
       
            
        
        
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Page_URL("Sites page URL", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        // <editor-fold defaultstate="collapsed" desc="Existing Site and Unit > Select"> 
        // Select "New Auto Site XXXXXX" for Add Station
        String ADD_TO_SITE = SITE;
//        if(NEW_SITE){
//            ADD_TO_SITE = "New Auto Site " + New_ID;
//        }
        Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Element_Child_List_L1("Application list Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Application Name (index " + i + ")", L1.get(i), ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.contains("All")) {
                T_Index = i;
            }
        }
        Element_Click("Select 'All'", L1.get(T_Index), ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", ADD_TO_SITE, false, ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + ADD_TO_SITE + "']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        // </editor-fold> 

        
        // <editor-fold defaultstate="collapsed" desc="Add Station">    
//Thread.sleep(500); 
        Element_By_Path_Click("Button 'Add Station' click", "xpath", "//*[contains(text(), 'ADD STATION')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Add Station setup Groups", "xpath", "//div[starts-with(@id, 'toc-')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        List_L0("Add Station setup Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        List_L2("Add Station setup Group Count", "xpath", "//div[starts-with(@id, 'toc-')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            Element_Attribute(" === Station setup Navigation >>>", L0.get(i), "textContent", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            String CHOICE = t;
            Element_Click("Click '" + CHOICE + "'", L0.get(i), ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
//Thread.sleep(1000);
            switch (CHOICE) {
                case "Station Information":
                    // =========================================== Group Selection
                    Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_E1_Find("Find 'Group' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        Element_By_Path_Click("Open 'Group' dropdown (re-try)", "css", "[aria-label='Group']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_E1_Find("Find 'Group' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }
                    Element_Child_List_L1("Groups Count #1", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    T_Index = L1.size();
                    Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_List_L1("Groups Count #2", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    int SC = 2;
                    while (T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Child_List_L1("Groups Count #" + SC, e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        //if (_All_data)  {
                        Element_Text("Group Name", L1.get(j), ParentTest, "no_jira");
                        //}
                        if (L1.get(j).getText().trim().equals(SECTOR)) {
                            T_Index = j;
                        }
                    }
                    if (T_Index > -1) {
                        Scroll_to_Element("Scroll to Group " + SECTOR, L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Select Group " + SECTOR, L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    } else {
                        return;
                    }
                    Element_Click("Click '" + t + "'", L0.get(i), ParentTest, "no_jira");    // === invisible DEBUG
                    if (FAIL) {
                        return;
                    }
                    //Thread.sleep(1000);
                    // ========================================= Group Selection ^^^^

                    // =========================================== Menu Assignation >>>>>>
                    Element_By_Path_Click("Open 'Menu Assignation' dropdown", "css", "[aria-label='Global Menu Assignation']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_E1_Find("Find 'Global Menu' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        Element_By_Path_Click("Open 'Menu Assignation' dropdown (re-try)", "css", "[aria-label='Group']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_E1_Find("Find 'Global Menu' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }

                    Element_Child_List_L1("Global Menus Count #1", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    T_Index = L1.size();
                    Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_List_L1("Global Menus #2", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    SC = 2;
                    while (T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Child_List_L1("Global Menu #" + SC, e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Global Menu Name", L1.get(j), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        if (L1.get(j).getText().trim().equals(GL_MENU)) {
                            T_Index = j;
                        }
                    }
                    if (T_Index > -1) {
                        Scroll_to_Element("Scroll to " + GL_MENU, L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Select " + GL_MENU, L1.get(T_Index), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    } else {

                        _f++;
                        EX += " - " + "\t" + SECTOR + " Global Menu List" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + GL_MENU + " Not found";
                        EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                        return;
                    }
                    Element_Click("Click '" + t + "'", L0.get(i), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(1000);
                    // ============================== ^^^ Menu Assignation

                    Element_By_Path_Click("Click 'Station Name'", "xpath", "//input[@aria-label='Station Name']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Station Name", "css", "[aria-label='Station Name']", "Add Station " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    stationName = "Add Station " + New_ID;
                    Element_By_Path_Click("Station Location Description Click", "xpath", "//label[contains(text(), 'Location Description')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Station Location Description", "css", "[aria-label='Station Location Description']", "Penthouse " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Location [Cost Centre] Click", "xpath", "//*[contains(text(), 'Location [Cost Centre]')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    Element_E1_Find("Find 'Cost Centre' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    Element_Child_List_L1("Cost Centre Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Scroll_to_Element("Scroll to last Cost Centre", L1.get(L1.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    Element_Click("Select last Cost Centre in the List", L1.get(L1.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
 
                    Element_By_Path_Click("Timeslot Length Click", "css", "[aria-label='Tax Rate']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Tax Rate']", "12", false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    break;
                case "Fee Setup":
                    Element_Child_List_L1("Fee Setup types count", L2.get(i), "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");    // 1st
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Enable Fee - Service Check", L1.get(0), ParentTest, "no_jira");    // 1st
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Enable Fee - Delivery Check", L1.get(1), ParentTest, "no_jira");    // 2nd
                    if (FAIL) {
                        return;
                    }

                    List_L1("Input 'Flat Fee' Count", "css", "[aria-label='Flat Fee']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Service Flat Fee - click", L1.get(0), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text_Enter("Enter Service Fee", L1.get(0), "0.51", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Delivery Flat Fee - click", L1.get(1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text_Enter("Enter Delivery Fee", L1.get(1), "0.71", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    break;
                case "Pickup Details":
                    Element_By_Path_Click("Pickup 'DISABLE' Click", "xpath", "//div[contains(text(), 'DISABLE')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_E1_Find("Find 'DISABLE' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_E2("Find 'DISABLE' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center dropoff-title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text(" 'DISABLE' dialog Title", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_E2("Find 'DISABLE' dialog Save", e1, "xpath", ".//div[text()='save']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text(" 'DISABLE' Save Text", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_E2("Find 'DISABLE' confirm input", e1, "xpath", ".//input[@aria-label='Confirm Disabling']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Click 'DISABLE' confirm input", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text_Enter("Enter 'DISABLX' > typo", e2, "DISABLX", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Find_Text("Find 'typo' error message", "Must input the word", true, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text_Clear("Clear 'DISABLE' input", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Find_Text("Find 'cannot be empty' error message", "Confirmation cannot be", true, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text_Enter("Enter 'DISABLE'", e2, "DISABLE", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Find_Text("Find 'Cannot' error message", "Cannot disable both", true, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_E2("Find 'DISABLE' dialog Cancel", e1, "xpath", ".//div[text()='cancel']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Text("Cancel 'DISABLE' text", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Click 'DISABLE' Cancel", e2, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    Element_By_Path_Click("Timeslot Length Click", "css", "[aria-label='Timeslot Length (minutes)']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Timeslot Length (minutes)']", "12", false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Average Prep Length Click", "css", "[aria-label='Average Prep Length (minutes)']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Average Prep Length", "css", "[aria-label='Average Prep Length (minutes)']", "14", false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Customers Per Slot Click", "css", "[aria-label='Customers Per Slot']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter Customers Per Slot", "css", "[aria-label='Customers Per Slot']", "2", false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    List_Child_E1_By_Path("Find 'ASAP Pickup' checkbox", L2.get(i), "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("ASAP Pickup checkbox Click", e1, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Input 'ASAP Pickup theshold' Click", "css", "[aria-label='ASAP time threshold']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Text_Enter("Enter ASAP time threshold", "css", "[aria-label='ASAP time threshold']", "2", false, ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    break;
                case "Delivery Details":                   
                      break;
                case "Scan & Go Setup":
                    break;
                case "Assign Menus":
                    List_L3("Menu 'Button' Count", "xpath", "//button[@class='ml-0 pl-0 v-btn v-btn--flat theme--light']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    
                    /*
                    Element_Click("Click 'IMPORT MENU'", L3.get(1), ParentTest, "no_jira");    // index 1 > 2nd button - Import
                    if (FAIL) {
                        return;
                    }
                    Wait_For_Element_By_Path_Presence("Wait for Import options...", "css", "[aria-label='Location Stations']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
//                    Element_By_Path_Click("Open Location Station drop-down", "css", "[aria-label='Location Stations']", ParentTest, "no_jira");    
                    Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Open 'Location Station' drop-down", L1.get(0), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_E1_Find("Find 'Location Station' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_List_L1("Location Station Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (L1.size() > 0) {
                        Element_Attribute("Last Location Station", L1.get(L1.size() - 1), "textContent", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Select Location Station", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Thread.sleep(500);
//                            Element_By_Path_Click("Open Menus drop-down", "css", "[aria-label='Menus']", ParentTest, "no_jira");    
                        Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Open 'Menus' drop-down", L1.get(1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_E1_Find("Find 'Menus' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Child_List_L1("Menus Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Attribute("Last Menu", L1.get(L1.size() - 1), "textContent", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Select Last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Thread.sleep(500);
                    } else {

                        _f++;
                        F += "Step: " + _t + " > " + "Add Station > Assign Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                        EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Import" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }
                    */
                    
        
        
//                  Element_By_Path_Click("Open Menus drop-down", "css", "[aria-label='Menus']", ParentTest, "no_jira");                            
                    Element_Click("ADD MENU Click", L3.get(0), ParentTest, "no_jira");    // index 0 > 1st button - Add
                    if (FAIL) {
                        return;
                    }
//                    Element_By_Path_Click("Open Menu Name drop-down", "css", "[aria-label='Menu Name']", ParentTest, "no_jira");    
//                        if (FAIL) { return;} 
                    Element_Child_List_L1("Add Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Click("Open 'Menu Name' drop-down", L1.get(0), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    Element_E1_Find("Find 'Menu Names' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_Child_List_L1("Menu Names Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    if (L1.size() > 0) {
                        Element_Attribute("Select Last Menu Name", L1.get(1), "textContent", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                        Element_Click("Select Last Menu Name", L1.get(1), ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }
                        
                    if (L1.size() > 0) {                        
                    for( int k=0; k<L1.size();k++){                                                   
                       Element_Attribute("Get Menu Name", L1.get(k), "textContent", ParentTest, "no_jira");
                       MenuName=t.trim();
                        //System.out.println(MenuName);
                        //System.out.println("ds: "+all_elements_text.get(m));
                        //List_TR_TDs("Check Station list to matches with selected station from 'AP3' ", L1.get(i), ParentTest, "no_jira"); 
                        //if (FAIL) {
                           // return;
                       // }
                        //System.out.println("ds: "+all_elements_text.get(m));
                       
                        
                        if(MenuNamesGlobal.contains(MenuName)){
                        _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + "MenuName" + "\t" + "Menus match with Global Menu" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass as only Menus that exist in global menu are available to be assigned in brand configuration                  
                        } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found incorrect Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        //print fail if found incorrect menus that are'nt from global menu
                        Log_Html_Result("FAIL", "Error: " + err + "Incorrect MenuName  > " + MenuName, true, ParentTest.createNode("Menus don't match Global Menu"));                        
                        }                             
                        }
                    }
                    
                    //System.out.println(Categories_EnabledList.);                  
                    List_L2("List of Category that are enabled","xpath", "(.//div[@class='layout row wrap justify-end']//div[@class='v-select__selection v-select__selection--comma'])", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }    
                    System.out.println(L2.size());
                    if(L2.size()>0){
                    for ( int k = 0; k < L2.size(); k++){                 
                    Element_Attribute("Menu Category (Index " + k + ") Name", L2.get(k), "textContent", ParentTest, "no_jira");                                                    
                    if(L2.get(k).getAttribute("textContent").equals(Categories_EnabledList.get(k))){
                        _t++;
                         _p++; EX += _t + "\t" + "Test Passed: Menu Categories Match" + "\t" + L2.get(k).getAttribute("textContent") + "\t" + Categories_EnabledList.get(k) + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass as only Menus Categories that exist in global menu are available to be assigned in brand configuration                  
                        } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found incorrect Menus Categories" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        //print fail if found incorrect menus categories that are'nt from global menu
                        Log_Html_Result("FAIL", "Error: " + err + "Incorrect MenuCategory  > " + L2.get(k).getAttribute("textContent"), true, ParentTest.createNode("Menus don't match Global Menu"));                        
                        }
                    
                    System.out.println(L2.get(k).getAttribute("textContent") +" : " + (Categories_EnabledList.get(k)));                                                                               
                    //Thread.sleep(500);
                    }                                                                
                    }else {

                        _f++;
                        F += "Step: " + _t + " > " + "Add Station > Assing Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                        EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }
                    
                    /*
                    List_L2("List of Category that are enabled","xpath", "(.//div[@id='toc-assignMenus']//div[@class='v-select__selection v-select__selection--comma'])", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }    
                    System.out.println(L2.size());
                    if(L2.size()>0){
                    for ( int k = 0; k < L2.size()-1; k++){                 
                    Element_Attribute("Menu Category (Index " + k+1 + ") Name", L2.get(k+1), "textContent", ParentTest, "no_jira");            
                    //if (FAIL) { 
                        //return;
                    //}                    
                    //String myList= L0.get(i).getAttribute("textContent").trim();
                    
                    if(L2.get(k+1).getAttribute("textContent").equals(Categories_EnabledList.get(k))){
                        _t++;
                         _p++; EX += _t + "\t" + "Test Passed: Menu Categories Match" + "\t" + L2.get(k+1).getAttribute("textContent") + "\t" + Categories_EnabledList.get(k) + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass as only Menus Categories that exist in global menu are available to be assigned in brand configuration                  
                        } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found incorrect Menus Categories" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        //print fail if found incorrect menus categories that are'nt from global menu
                        Log_Html_Result("FAIL", "Error: " + err + "Incorrect MenuCategory  > " + L2.get(k).getAttribute("textContent"), true, ParentTest.createNode("Menus don't match Global Menu"));                        
                        }
                    
                    System.out.println(L2.get(k+1).getAttribute("textContent") +" : " + (Categories_EnabledList.get(k)));                                                                               
                    //Thread.sleep(500);
                    }                                                                
                    }else {

                        _f++;
                        F += "Step: " + _t + " > " + "Add Station > Assing Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                        EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }
*/
                    break;
                    
                case "Integration Type":
                    
                    break;
                case "Third Party Integration":                    
                    break;
                case "Menu Information":                                        
                    break;
                case "Payment ID":
                    break;
                case "Meal Plan":
                    break;
                case "Loyalty Program":
                    break;
                case "Payment Method Exclusion":                    
                    break;
                case "Web Ordering":                   
                    break;
                default:
                    break;
            }
        }

        Element_By_Path_Click("Click 'Create Brand'", "xpath", "//*[contains(text(), 'Create Brand')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'Create Brand'", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }    
                                   
 // AUT-294: Removing a category and re-adding it in brand configuration                                    
      removeGlobalMenuCategory();
    
        
    } catch (Exception ex){}   // =============================================             
    }//run time  

       
    private void Call_Company_API(String MenuName) {
    try {    

        Call_API("Call Global menu API", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID, true, ParentTest, "no_jira" );        
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode("API Responce Error"));
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray menus = json.getJSONArray("menus");
         
        for(int k = 0; k < menus.length(); k++) {
           JSONObject menu = menus.getJSONObject(k);
           if(menu.has("location_brand")){                                  
               if(menu.getString("location_brand").equals(BrandID)) {
                   System.out.println(menu.getJSONObject("label").getString("en"));
                   
                   if(menu.getJSONObject("label").getString("en").equals(MenuName)) {                       
                            _t++;
                            _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuNames are from Global Menu" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                           //print pass menu set is disabled
                       
                        } else {
                           _t++;
                           _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found Incorrect MenuNames" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                           //print fail menuset is eneabled
                        }
                    }
                }
            }
        } catch (Exception ex){}   // =============================================  
    } 
    //</editor-fold>      
       
    public void selectingGlobalMenu() {
    try {    
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
    } catch (Exception ex){}   // =============================================  
    }
 
    public  void Call_GlobalMenuSet_API(String Menu_ID, String MenuSetName) {
    try {    

        Call_API("Call GlobalMenuSet API", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + Menu_ID, true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + Menu_ID  + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/"+ Menu_ID , false, ParentTest.createNode("API Responce Error"));
            return;
        } 
         //List<String> Categories_DisabledList= new ArrayList<>(); 
         //List<String> Categories_EnabledList= new ArrayList<>();
        JSONObject json = new JSONObject(API_Response_Body);
        if(json.getString("id").equals(Menu_ID)){          
                System.out.println(json.getString("id"));  
        JSONArray groups = new JSONArray();
        groups = json.getJSONArray("groups");        
        JSONObject Category= new JSONObject();
        for(int i=0; i<groups.length(); i++){
            Category = groups.getJSONObject(i);
            
                      
                if(Category.getJSONObject("label").has("en")){
                    Categories=( Category.getJSONObject("label").getString("en") + " " +Category.getString("id")) ;
                    System.out.println(Categories);                    
                                       
                    if(Category.getJSONObject("is").getBoolean("disabled")) {
                                             
                        Categories_DisabledList.add( Category.getJSONObject("label").getString("en")); //+ " " +Category.getString("id")) ;
                        
                       
                         _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + Categories_DisabledList.get(i) + "\t" + "Category is Disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass menu set is disabled
                        
                    } 
                    /*else if (!(Category.getJSONObject("is").getBoolean("disabled"))) { 
                        
                        Categories_EnabledList.add( Category.getJSONObject("label").getString("en")); // + " " +Category.getString("id"));
                         
                        //Categories_Enabled=( Category.getJSONObject("label").getString("en") + " " +Category.getString("id")) ;
                         _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + Categories_EnabledList.get(i) + "\t" + "Category is Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass menu set is enabled                                            
                     }
                    */
                    else if (!(Category.getJSONObject("is").getBoolean("disabled"))) { 
                        
                        Categories_EnabledList.add( Category.getJSONObject("label").getString("en")); // + " " +Category.getString("id"));
                         
                        //Categories_Enabled=( Category.getJSONObject("label").getString("en") + " " +Category.getString("id")) ;
                         _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + Categories_EnabledList.get(i) + "\t" + "Category is Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass menu set is enabled                                            
                     }
                    
                    else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found opposite values" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        //print fail if found contradicting values
                    }                   
                }                                      
            }
        for(int i=0; i<Categories_EnabledList.size(); i++){
            
        System.out.println(Categories_EnabledList.get(i));        
        }
        for(int i=0; i<Categories_DisabledList.size(); i++){
            
        System.out.println(Categories_DisabledList.get(i));        
        }
        
        } 
        Thread.sleep(1000);

    } catch (Exception ex){}   // =============================================  
    } 
   
     // <editor-fold defaultstate="collapsed" desc="AUT-294: Removing a category and re-adding it in brand configuration AUT-294">
    public void removeGlobalMenuCategory(){
    try {
        EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Removing a category and re-adding it in brand configuration ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";

        
        Wait_For_Element_By_Path_Presence("Wait for brand name to load..", "xpath", "//td[contains(text(), '" + stationName + "')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
 
        Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + stationName + "')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        // Assign and remove GLobal menu category
        Element_By_Path_Click("Click of Assign menus from left corner", "xpath", "//div[6]//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(1000);
       
        List_L0("Count of total Assigned Categories","xpath", "(.//div[@class='layout row wrap justify-end']//div[@class='v-select__selection v-select__selection--comma'])", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        int countAssignedMenuCategoriesBeforeRemove = L0.size();

        if (L0.isEmpty()) {
            Element_By_Path_Click("Click 'Save Changes Brand'", "xpath", "//*[contains(text(), 'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) {
                return;

            }
             _f++;
              EX += " - " + "\t" + " === ^ No assigned menu found...after asigning menu from code-> case : Assign Menus" + "\t" + " ===== " + "\t" + " == ^ Sales Reporting for hidden stations End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        } else {
            Element_By_Path_Click("Click on remove assigned menu Category", "xpath", "(.//div[@class='layout row wrap justify-end']//button[@class='v-btn v-btn--icon theme--light'])[1]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Click 'Save Chnages Brand'", "xpath", "//*[contains(text(), 'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) {
                return;

            }
        }
        
        //Check if assigned menu category is removed

        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }

        Element_By_Path_Click("Click of Assign menus from left corner", "xpath", "//div[6]//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(1000);

        List_L1("Count of total Assigned Categories","xpath", "(.//div[@class='layout row wrap justify-end']//div[@class='v-select__selection v-select__selection--comma'])", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        int countAssignedMenuCategoriesAfterRemove = L1.size();
        if (countAssignedMenuCategoriesAfterRemove == (countAssignedMenuCategoriesBeforeRemove - 1)) {

            Wait_For_Element_By_Path_Presence("Wait for breadscrumbs to be visible ", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }

            Element_By_Path_Click("Click navigate back to Station Index page", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }

            _p++;
            EX += _t + "\t" + "Removing a category and re-adding it in brand configuration" + "\t" + "Original Count of Assigned menu categories= " + countAssignedMenuCategoriesBeforeRemove + "\t" + "Count After removing 1 menu category= " + countAssignedMenuCategoriesAfterRemove + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\"\t" + "no_jira" + "\r\n";

        } else {

            Wait_For_Element_By_Path_Presence("Wait for breadscrumbs to be visible ", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }

            Element_By_Path_Click("Click navigate back to Station Index page", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }

            _f++;
            EX += _t + "\t" + "Removing a category and re-adding it in brand configuration" + "\t" + "Original Assigned menus" + countAssignedMenuCategoriesBeforeRemove + "\t" + "After removing Assigned menu: " + countAssignedMenuCategoriesAfterRemove + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\"\t" + "no_jira" + "\r\n";
        }                
    } catch (Exception ex){}   // =============================================  
    } 
    // </editor-fold> 

    
} 
// End of AP3_Brand_New
