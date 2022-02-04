package AP3;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

class AP3_brand_new extends AP3_GUI {

    private String stationName = "";
    protected AP3_brand_new(AP3_GUI a) {
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
        appId=a.appId;
        COUNTRY = a.COUNTRY;
        Location = a.Location;

        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }
    private String API_Response_Body = "";
    private String JDE_id = "";
    private String JDE_category = ""; 
    private String MenuName = "";
    private boolean flag = false;
    protected void run(boolean NEW_SITE) {
    try{    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) { return; }
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }

        Page_URL("Sites page URL", ParentTest, "no_jira");
            if (FAIL) { return; }


        // <editor-fold defaultstate="collapsed" desc="Existing Site and Unit > Select"> 
        // Select "New Auto Site XXXXXX" for Add Station
        String ADD_TO_SITE = SITE;
        if(NEW_SITE){
            ADD_TO_SITE = "New Auto Site " + New_ID;
        }
        
        Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_Child_List_L1("Application list Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return; }
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Application Name (index " + i + ")", L1.get(i), ParentTest, "no_jira");
            if (t.contains("All")) {
                T_Index = i;
            }
        }
        Element_Click("Select 'All'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", ADD_TO_SITE, false, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + ADD_TO_SITE + "']", ParentTest, "no_jira");
            if (FAIL) { return; }

        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Add Station">   
        Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'ADD STATION')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Button 'Add Station' click", "xpath", "//*[contains(text(), 'ADD STATION')]", ParentTest, "no_jira");
            if (FAIL) { return; }
            
        //edit brand to test Locations Drop-off
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
            //check empty state
            EX += " - " + "\t" + "-" + "\t" + "-" + "\t" + "-" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
            EX += " - " + "\t" + "Delivery Details - No Locations" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                if (FAIL) { return;}
                
            Wait_For_Element_By_Path_Presence("Check for '...no drop-off locations set up' message", "xpath", "//span[contains(text(),'no drop-off locations set up')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Check for 'Please go to Site Configuration...' message", "xpath", "//span[contains(text(),'go to Site Configuration')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Move_to_Element_By_Path("Move > 'SITE CONFIGURATION' button", "xpath", "//*[contains(text(),'SITE CONFIGURATION')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            EX += " - " + "\t" + "-" + "\t" + "-" + "\t" + "-" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
            
            EX += " - " + "\t" + "Delivery Details - Add a Location in Site Config" + "\t" + "Delivery Details - Add a Location in Site Config" + "\t" + "Delivery Details - Add a Location in Site Config" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
            Element_By_Path_Click("Click > 'SITE CONFIGURATION' button", "xpath", "//*[contains(text(),'SITE CONFIGURATION')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Configuration' page to load", "xpath", "//form[@class='v-form settings']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Scroll_to_WebElement("Scroll > 'Drop-off Locations' section", "xpath", "//div[@id='drop-off-locations']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(WaitForElement);
            Move_to_Element_By_Path("Move > 'Create Drop-off Location' button", "xpath", "//*[contains(text(),'CREATE DROP-OFF LOCATION')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Create Drop-off Location' button", "xpath", "//*[contains(text(),'CREATE DROP-OFF LOCATION')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Create Drop-off Location' dialog", "xpath", "//*[@class='v-dialog v-dialog--active']//*[contains(text(),'Create Drop-off Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (COUNTRY.equals("CA")) {
                Element_By_Path_Input_Select_Clear("Clear > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "3 dund", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "a", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "s", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                List_L2("Get list of suggestions", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            } else {
                Element_By_Path_Input_Select_Clear("Clear > 'Address' field", "xpath", "(//*[@aria-label='Address'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "1", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "2", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                Element_By_Path_Text_Enter("Type > Partial address", "xpath", "(//*[@aria-label='Address'])[1]", "3", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                List_L2("Get list of suggestions", "xpath", "//div[contains(@class,'menuable__content__active')]//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (FAIL) { return;}
            }

            Element_Click("Click > First suggestion for 'Address auto-fill'", L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);
            Move_to_Element_By_Path("Move > 'Location Name' field", "xpath", "(//*[contains(text(),'Location Name')])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Input_Select_Clear("Clear > 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter > value in 'Location Name' field", "xpath", "(//*[@aria-label='Location Name'])[1]", "location " + New_ID, false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Move_to_Element_By_Path("Move > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Create Location' button", "xpath", "//*[contains(text(),'Create Location')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_InVisibility("Wait for 'Create Drop-off Location' dialog to disappear", "xpath", "//*[@class='v-dialog__content']//*[contains(text(),'Create Drop-off Location')]", ParentTest, Ver);
                if (FAIL) { return;}
                
            Move_to_Element_By_Path("Move > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > 'Save Changes' button", "xpath", "//footer//*[contains(text(),'Save Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(),'Configuration')]/parent::button", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Button 'Add Station' click", "xpath", "//*[contains(text(), 'ADD STATION')]", ParentTest, "no_jira");
                if (FAIL) {return;}       
        }
        
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Add Station setup Groups", "xpath", "//div[starts-with(@id, 'toc-')]", ParentTest, "no_jira");
            if (FAIL) {  return; }
        List_L0("Add Station setup Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        List_L2("Add Station setup Group Count", "xpath", "//div[starts-with(@id, 'toc-')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        if(L0.size() != L2.size()){
            //
        }       
        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            Element_Attribute(" === Station setup Navigation >>>", L0.get(i), "textContent", ParentTest, "no_jira");
                if (FAIL) { return; }
            String CHOICE = t;
            Element_Click("Click '" + CHOICE + "'", L0.get(i), ParentTest, "no_jira");
                if (FAIL) { return; }

            switch (CHOICE) {
                case "Station Information":
                    // =========================================== Group Selection
                    Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'Group' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        Element_By_Path_Click("Open 'Group' dropdown (re-try)", "css", "[aria-label='Group']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_E1_Find("Find 'Group' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return; }
                    }
                    Element_Child_List_L1("Groups Count #1", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    T_Index = L1.size();
                    Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Groups Count #2", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                     if (FAIL) { return; }

                    int SC = 2;
                    while (T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Child_List_L1("Groups Count #" + SC, e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                    }
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        //if (_All_data)  {
                        Element_Text("Group Name " + j, L1.get(j), ParentTest, "no_jira");
                        //}
                        if (L1.get(j).getText().trim().equals(SECTOR)) {
                            T_Index = j;
                        }
                    }
                    if (T_Index > -1) {
                        Scroll_to_Element("Scroll to Group " + SECTOR, L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Select Group " + SECTOR, L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return; }
                    } else {
                        return;
                    }
                    Element_Click("Click '" + t + "'", L0.get(i), ParentTest, "no_jira");    
                        if (FAIL) { return; }
                    // ========================================= Group Selection ^^^^

                    // =========================================== Menu Assignation >>>>>>
                    Element_By_Path_Click("Open 'Menu Assignation' dropdown", "css", "[aria-label='Global Menu Assignation']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'Global Menu' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                    if (FAIL) {
                        Element_By_Path_Click("Open 'Menu Assignation' dropdown (re-try)", "css", "[aria-label='Group']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_E1_Find("Find 'Global Menu' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return; }
                    }

                    Element_Child_List_L1("Global Menus Count #1", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    T_Index = L1.size();
                    Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Global Menus #2", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return; }

                    SC = 2;
                    while (T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Child_List_L1("Global Menu #" + SC, e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                    }
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Global Menu Name", L1.get(j), ParentTest, "no_jira");
                        if (L1.get(j).getText().trim().equals(GL_MENU)) {
                            T_Index = j;
                        }
                    }
                    if (T_Index > -1) {
                        Scroll_to_Element("Scroll to " + GL_MENU, L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Select " + GL_MENU, L1.get(T_Index), ParentTest, "no_jira");
                            if (FAIL) { return; }
                    } else {
                        _t++;
                        _f++;
                        EX += " - " + "\t" + SECTOR + " Global Menu List" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + GL_MENU + " Not found";
                        Log_Html_Result("FAIL", SECTOR + " Global Menu " + " > " + GL_MENU, 
                                false, ParentTest.createNode(_t + ". " + "Not Found"), new Date());

                        EX += "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                        return;
                    }
                    Element_Click("Click '" + t + "'", L0.get(i), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Thread.sleep(1000);
                    // ============================== ^^^ Menu Assignation

                    Element_By_Path_Click("Click 'Station Name'", "xpath", "//input[@aria-label='Station Name']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Station Name", "css", "[aria-label='Station Name']", "Add Station " + New_ID, false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    stationName = "Add Station " + New_ID;
                    Element_By_Path_Click("Station Location Description Click", "xpath", "//label[contains(text(), 'Location Description')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Station Location Description", "css", "[aria-label='Station Location Description']", "Penthouse " + New_ID, false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Click("Location [Cost Centre] Click", "xpath", "//*[contains(text(), 'Location [Cost Centre]')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'Cost Centre' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Cost Centre Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Scroll_to_Element("Scroll to last Cost Centre", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Select last Cost Centre in the List", L1.get(L1.size() - 1), ParentTest, "no_jira");
                        if (FAIL) { return; }
 /* Date : July 6th 2021
    Commenting until JDE ticket get released to staging and production. AUT 1004
    Tested on DEV - works fine                
                    //Verify if JDE category is auto assigned based on the global menu.
                    Verify_Sector_JDE_API();  //Verify is global menu has JDE category assigned to it.
                    if(flag)
                    {
                        Element_By_Path_Attribute("Get Auto assigned JDE Category", "xpath", "(//div[@class='v-select__selections'])[4]//div[@class='v-select__selection v-select__selection--comma']", "innerHTML", ParentTest, "no_jira");
                        if(FAIL){return;}
                        Verify_JDE_API(t);
                    }
*/
                    Element_By_Path_Click("Timeslot Length Click", "css", "[aria-label='Tax Rate']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Tax Rate']", "12", false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    break;
                case "Fee Setup":
                    Element_Child_List_L1("Fee Setup types count", L2.get(i), "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");    // 1st
                        if (FAIL) { return; }
                    Element_Click("Enable Fee - Service Check", L1.get(0), ParentTest, "no_jira");    // 1st
                        if (FAIL) { return; }
                    Element_Click("Enable Fee - Delivery Check", L1.get(1), ParentTest, "no_jira");    // 2nd
                        if (FAIL) { return; }
                    List_L1("Input 'Flat Fee' Count", "css", "[aria-label='Flat Fee']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Service Flat Fee - click", L1.get(0), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text_Enter("Enter Service Fee", L1.get(0), "0.51", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Delivery Flat Fee - click", L1.get(1), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text_Enter("Enter Delivery Fee", L1.get(1), "0.71", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    break;
                case "Pickup Details":
                    Element_By_Path_Click("Pickup 'DISABLE' Click", "xpath", "//div[contains(text(), 'DISABLE')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'DISABLE' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_E2("Find 'DISABLE' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center dropoff-title']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text(" 'DISABLE' dialog Title", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_E2("Find 'DISABLE' dialog Save", e1, "xpath", ".//div[text()='save']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text(" 'DISABLE' Save Text", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_E2("Find 'DISABLE' confirm input", e1, "xpath", ".//input[@aria-label='Confirm Disabling']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Click 'DISABLE' confirm input", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text_Enter("Enter 'DISABLX' > typo", e2, "DISABLX", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Find_Text("Find 'typo' error message", "Must input the word", true, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text_Clear("Clear 'DISABLE' input", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Find_Text("Find 'cannot be empty' error message", "Confirmation cannot be", true, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text_Enter("Enter 'DISABLE'", e2, "DISABLE", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Find_Text("Find 'Cannot' error message", "Cannot disable both", true, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_E2("Find 'DISABLE' dialog Cancel", e1, "xpath", ".//div[text()='cancel']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Text("Cancel 'DISABLE' text", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Click 'DISABLE' Cancel", e2, ParentTest, "no_jira");
                        if (FAIL) { return; }

                    Element_By_Path_Click("Timeslot Length Click", "css", "[aria-label='Timeslot Length (minutes)']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Timeslot Length (minutes)']", "12", false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Click("Average Prep Length Click", "css", "[aria-label='Average Prep Length (minutes)']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Average Prep Length", "css", "[aria-label='Average Prep Length (minutes)']", "14", false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Click("Customers Per Slot Click", "css", "[aria-label='Customers Per Slot']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter Customers Per Slot", "css", "[aria-label='Customers Per Slot']", "2", false, ParentTest, "no_jira");
                        if (FAIL) { return; }

                    List_Child_E1_By_Path("Find 'ASAP Pickup' checkbox", L2.get(i), "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("ASAP Pickup checkbox Click", e1, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Click("Input 'ASAP Pickup theshold' Click", "css", "[aria-label='ASAP time threshold']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Enter ASAP time threshold", "css", "[aria-label='ASAP time threshold']", "2", false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    break;
                case "Delivery Details":
                    EX += " - " + "\t" + "--" + "\t" + "--" + "\t" + "--" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                    EX += " - " + "\t" + "--" + "\t" + "Delivery Details" + "\t" + "Delivery Details" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                    Call_API("Call /location/group/'SiteID'/deliverydestination", "Bearer " + AP3_TKN, BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", true, ParentTest, "no_jira");
                    if(t.startsWith("{")){
                        API_Response_Body = t;               
                    }else{
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }        
                    json = new JSONObject(API_Response_Body);
                    delivery_destinations = json.getJSONArray("delivery_destinations");  
                    Wait_For_Element_By_Path_Presence("Check > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                        if (FAIL) { return;}

                    if (delivery_destinations.isEmpty()) {
                        //check empty state
                        EX += " - " + "\t" + "Delivery Details - No Locations" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "Delivery Details - No Locations in Site" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Wait_For_Element_By_Path_Presence("Check for '...no drop-off locations set up' message", "xpath", "//span[contains(text(),'no drop-off locations set up')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Please go to Site Configuration...' message", "xpath", "//span[contains(text(),'go to Site Configuration')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Move_to_Element_By_Path("Move > 'SITE CONFIGURATION' button", "xpath", "//*[contains(text(),'SITE CONFIGURATION')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                    } else {
                        EX += " - " + "\t" + "Delivery Details - With Locations in Site" + "\t" + "Delivery Details - With Locations in Site" + "\t" + "Delivery Details - With Locations in Site" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Wait_For_Element_By_Path_Presence("Check for 'Drop-off locations are added...' message", "xpath", "//span[contains(text(),'locations are added at the site level')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for '...setup details?' message", "xpath", "//span[contains(text(),'like to setup details')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Delivery Details' switch", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Set switch to 'Yes'", "xpath", "//*[@id='toc-delivery']//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);
                        EX += " - " + "\t" + "--" + "\t" + "--" + "\t" + "--" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        EX += " - " + "\t" + "--" + "\t" + "Timeslot Type - User Generated" + "\t" + "Timeslot Type - User Generated" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Timeslot Type' dd", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Type']/preceding-sibling::div", ParentTest, "np_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for dropdown to appear", "xpath", "(//div[contains(text(),'User Generated')])[1]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'User Generated' in dd", "xpath", "(//div[contains(text(),'User Generated')])[1]/ancestor::a", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_InVisibility("Wait for 'Choose Drop-off...' link to disappear", "xpath", "//a[contains(text(), 'Choose Drop-off')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check > 'Timeslot Table' to be present", "xpath", "//div[@class='timeslot-table']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check > '+ADD TIMESLOT' button to be present", "xpath", "//div[contains(text(),'Add Timeslot')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        EX += " - " + "\t" + "--" + "\t" + "--" + "\t" + "--" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        EX += " - " + "\t" + "--" + "\t" + "Timeslot Type - Automatic" + "\t" + "Timeslot Type - Automatic" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                        Element_By_Path_Click("Click > 'Delivery Details' in list of sections", "xpath", "//*[@class='v-list tocStyle theme--light']//*[contains(text(),'Delivery Details')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Delivery Details' section to be present", "xpath", "//*[@id='toc-delivery']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Timeslot Type' dd", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Type']/preceding-sibling::div", ParentTest, "np_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for dropdown to appear", "xpath", "(//div[contains(text(),'Automatic')])[1]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Automatic' in dd", "xpath", "(//div[contains(text(),'Automatic')])[1]/ancestor::a", ParentTest, "no_jira");
                            if (FAIL) { return;}     
                        Wait_For_Element_By_Path_Presence("Wait for 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Text_Enter("Fill > 'Timeslot Length' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Timeslot Length']", "1", false, ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Average Prep Time' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Average Prep Time']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Customer Per Slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Customers per slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Text_Enter("Fill > 'Customers per slot' field", "xpath", "//*[@id='toc-delivery']//input[@aria-label='Customers Per Slot']", "1", false, ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Choose Drop-off...' to appear", "xpath", "//a[contains(text(), 'Choose Drop-off')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Slected Locations...' counter", "xpath", "//div[contains(text(), 'Selected Locations: 0')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Display timeslots...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'timeslots as one time')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Allow delivery...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'delivery instruction')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Enable Bolter...' switch is present", "xpath", "//*[@id='toc-delivery']//p[contains(text(),'Enable Bolter')]/following-sibling::div//div[contains(text(),'Yes')]", ParentTest, "no_jira");
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

                        Element_By_Path_Click("Click > 'Choose Drop-off...' link", "xpath", "//a[contains(text(), 'Choose Drop-off')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Choose Drop-off...' dialog box", "xpath", "//div[contains(text(),'Choose Drop-off')]/ancestor::*[contains(@class,'v-dialog--active')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check for 'Search Locations' field", "xpath", "//input[@aria-label='Search Locations']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        List_L1("Get list of available locations", "xpath", "(//div[contains(@class,'v-list__tile')])[15]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_Child_Text("Get name of first location in list", L1.get(0), "xpath", "//div[contains(@class,'list-item')]//p", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        String loc_name = t.trim();
                        Element_By_Path_Click("Click > 'Choose Drop-off...' link", "xpath", "//p[contains(text(),'" +loc_name+ "')]/ancestor::div[contains(@class,'list-content')]/preceding-sibling::div", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check 'Locations Selected' List", "xpath", "//p[text()='Locations Selected (1)']/parent::div//p[contains(text(),'" + loc_name + "')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Move_to_Element_By_Path("Move > 'Continue' button", "xpath", "//div[contains(text(),'continue')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click > 'Continue' button", "xpath", "//div[contains(text(),'continue')]/parent::button", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Wait for 'Slected Locations...' counter", "xpath", "//div[contains(text(), 'Selected Locations: 1')]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                    }   
                    EX += " - " + "\t" + "--" + "\t" + "--" + "\t" + "--" + "\t" + "" + "\t" + " - " + "\t" + " - " + "\r\n";
                    break;
                case "Scan & Go Setup":
                    Find_Text("Find 'Enable Scan & ...'", "Enable Scan & Go?", true, ParentTest, "no_jira");
                    break;
                case "Assign Menus":
                    List_L3("Menu 'Button' Count", "xpath", "//button[@class='ml-0 pl-0 v-btn v-btn--flat theme--light']", ParentTest, "no_jira");
                        if (FAIL) { return; }

                    Element_Click("Click 'IMPORT MENU'", L3.get(1), ParentTest, "no_jira");    // index 1 > 2nd button - Import
                        if (FAIL) { return; }
                    Wait_For_Element_By_Path_Presence("Wait for Import options...", "css", "[aria-label='Location Stations']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Click("Open 'Location Station' drop-down", L1.get(0), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'Location Station' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Location Station Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                    if (L1.size() > 0) {
                        Element_Attribute("Last Location Station", L1.get(L1.size() - 1), "textContent", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Select Location Station", L1.get(L1.size() - 1), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Thread.sleep(500);
//                            Element_By_Path_Click("Open Menus drop-down", "css", "[aria-label='Menus']", ParentTest, "no_jira");    
                        Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Open 'Menus' drop-down", L1.get(1), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_E1_Find("Find 'Menus' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Child_List_L1("Menus Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Attribute("Last Menu", L1.get(L1.size() - 1), "textContent", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Select Last Menu", L1.get(L1.size() - 1), ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Thread.sleep(500);
                    } else {
                        _t++;
                        _f++;
                        F += "Step: " + _t + " > " + "Add Station > Assign Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                        EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Import" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }

                    Element_Click("ADD MENU Click", L3.get(0), ParentTest, "no_jira");    // index 0 > 1st button - Add
                        if (FAIL) { return; }
//                    Element_By_Path_Click("Open Menu Name drop-down", "css", "[aria-label='Menu Name']", ParentTest, "no_jira");    
//                        if (FAIL) { return;} 
                    Element_Child_List_L1("Add Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                        if (FAIL) { return; }            
                    Element_Click("Open 'Menu Name' drop-down", L1.get(0), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_E1_Find("Find 'Menu Names' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L1("Menu Names Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    
                    if (L1.size() > 0) {
                        Element_Attribute("1st Menu Name", L1.get(0), "textContent", ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Element_Click("Select 1st Menu", L1.get(0), ParentTest, "no_jira");
                            if (FAIL) { return; }                 
                        Thread.sleep(500);                                
                    }else {
                        _f++;
                        F += "Step: " + _t + " > " + "Add Station > Assing Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                        EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    }
                    break;                    
                    
                case "Integration Type":
                    List_Child_E1_By_Path("Find Setup KDS > Yes", L2.get(i), "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", ParentTest, "no_jira");
                    if (!FAIL) {
                        Element_Click("Setup KDS > Yes Click", e1, ParentTest, "no_jira");
                            if (FAIL) { return; }
                        Thread.sleep(1000);
                        //Element_By_Path_Click("Click 'KDS Device Email'", "xpath", "//*[contains(text(), 'KDS Device Email')]", ParentTest, "no_jira");    
                        Element_By_Path_Click("Click 'KDS Device Email'", "css", "[aria-label='KDS Device Email']", ParentTest, "no_jira");
                        if (!FAIL) {
                            Element_By_Path_Text_Enter("Enter KDS Device Email", "css", "[aria-label='KDS Device Email']", ADMIN_ID, false, ParentTest, "no_jira");
                                if (FAIL) { return; }   
                            Element_By_Path_Click("Click 'KDS Admin Passcode", "css", "[aria-label='KDS Admin Passcode']", ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Element_By_Path_Text_Enter("Enter KDS Admin Passcode", "css", "[aria-label='KDS Admin Passcode']", "1459", false, ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Element_By_Path_Click("Click 'Station Phone Number'", "css", "[aria-label='Station Phone Number']", ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Element_By_Path_Text_Enter("Enter Station Phone Number", "css", "[aria-label='Station Phone Number']", "9025550321", false, ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Element_By_Path_Click("Click 'Message On...'", "css", "[aria-label='Message On Receipt (Thanks for Ordering) ']", ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Element_By_Path_Text_Enter("Enter Message On Receipt", "css", "[aria-label='Message On Receipt (Thanks for Ordering) ']", "Thanks for Auto Ordering", false, ParentTest, "no_jira");
                                if (FAIL) { return; }  
                            Find_Text("Find 'Allow ... Refunds'", "Allow for KDS Refunds", true, ParentTest, "no_jira");
                        }
                    }
                    break;
                case "Third Party Integration":
                    Find_Text("Find 'Request Phone...'", "Request Customer Phone Number at Checkout", true, ParentTest, "no_jira");

                    break;
                case "Menu Information":
                    Find_Text("Find 'Calorie Disclaimer'", "Calorie Disclaimer", true, ParentTest, "no_jira");
                    if (!FAIL) {
                        Element_By_Path_Click("Check 'Display Calories", "css", "[aria-label='Display Calories']", ParentTest, "no_jira");
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

                    break;
                case "Meal Plan":

                    break;
                case "Loyalty Program":
                    Find_Text("Find 'Loyalty is not enabled..'", "Loyalty is not enabled", true,ParentTest, "no_jira");
                    break;
                case "Payment Method Exclusion":
                    Element_E1_Find("Find Method Exclusion section", "id", "toc-payment-exclusions", ParentTest, "no_jira");
                        if (FAIL) { return; }  
                    Element_Child_List_L1("Find 'Payment Methods' options", e1, "xpath", ".//div[@class='v-input--selection-controls__input']", ParentTest, "no_jira");
                    Find_Text("Find 'Credit Card'", "Credit Card", true, ParentTest, "no_jira");
                    Find_Text("Find 'Apple Wallet'", "Apple Wallet", true, ParentTest, "no_jira");
                    Find_Text("Find 'Google Wallet'", "Google Wallet", true, ParentTest, "no_jira"); 
                    Find_Text("Find 'Meal Plans'", "Meal Plans", false, ParentTest, "no_jira");
                    Find_Text("Find 'Excluded tenders'", "Excluded tenders", false, ParentTest, "no_jira");
                    if (L1.size() > 0) {
                        Element_Click("Check/Exclude last method", L1.get(L1.size() - 1), ParentTest, "no_jira");
                            if (FAIL) { return; }  
                    }
                    break;
                case "Web Ordering":
                    Element_E1_Find("Find Web Ordering section", "id", "web-order", ParentTest, "no_jira");
                        if (FAIL) { return; }  
                    Element_Child_List_L1("Find 'Allow Web Ordering' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", ParentTest, "no_jira");
                        if (FAIL) { return; }  
                    Element_Click("Click 'Allow Web Ordering' - Yes", L1.get(0), ParentTest, "no_jira");
                        if (FAIL) { return; }  
                    break;
                case "Frictionless":
                    Element_E1_Find("Find Find 'Frictionless detail' section", "id", "frictionless-detail", ParentTest, "no_jira");
                        if (FAIL) { return; }  
                    Element_Child_List_L1("Find 'Allow Frictionless' options", e1,"xpath", ".//div[contains(@class, 'Option-Left')]", ParentTest, "no_jira");             
                        if (FAIL) { return;} 
                    //Select Store > dropdown > CANCEl, OK 
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
//                    
//                    Element_Child_Click("Open 'Store List' drop-down", e2, "xpath", ".//div[@class='v-select__selections']", ParentTest, "no_jira"); 
//                        if (FAIL) { return;}     
//                    List_L0("Get Store List", "xpath", "//table/tbody/tr/td[5]", ParentTest, "no_jira");
//                        if (FAIL) { return; }

                    break; 
                default:
                    break;
            }
        }

        Element_By_Path_Click("Click 'Create Brand'", "xpath", "//*[contains(text(), 'Create Brand')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'Create Brand'", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        
        removeGlobalMenu();
        // </editor-fold>     

        // <editor-fold defaultstate="collapsed" desc="Add Station > Hours">   
        Move_to_Element_By_Path("Scroll to New Brand data row", "xpath", "//td[contains(text(), '" + "Add Station " + New_ID + "')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'New Brand' Name", "xpath", "//*[contains(text(), 'Add Station " + New_ID + "')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Presence("Wait 'Add a new Station' page", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        List_L0("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", ParentTest, "no_jira");
            if (FAIL) { return; }  
        // ====================== L0 ^^^ =============================================================================  
        for (int i = 0; i < L0.size(); i++) {
            Element_Text("New Brand Setup Tab >>>>", L0.get(i), ParentTest, "no_jira");
        }
        Element_Click("Click 'Menu' Tab", L0.get(0), ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Find_Text("Find 'Please assign...'", "Please assign Service or Delivery hours", true, ParentTest, "no_jira");
            if (FAIL) { return; }
        Find_Text("Find 'Go to...'", "Go to operation hours", true, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Go to...'", "xpath", "//div[text()='Go to operation hours']", ParentTest, "no_jira");
            if (FAIL) { return; }

        Element_By_Path_Click("Tab 'Service Hours' Click", "xpath", "//*[text()='Service Hours']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Page_URL("Pickup page URL", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_E1_Find("Service Days container", "xpath", "//div[@class='layout row wrap align-baseline']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Element_Child_List_L1("24 Hour Service Count", e1, "xpath", ".//input[@aria-label='24 Hour Service']", ParentTest, "no_jira");
            if (FAIL) { return; }
        for (int j = 0; j < L1.size(); j++) {
            if (j > 3) {
                Scroll_to_Element("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
            Thread.sleep(500);
            Element_Click("Check '24 Hour Service' " + j, L1.get(j), ParentTest, "no_jira");
            if (FAIL) { return; }
        }
        Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira");
            if (FAIL) { return; }

        To_Top("Move to Top", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Element_By_Path_Click("Tab 'Delivery Hours' Click", "xpath", "//*[text()='Delivery Hours']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Page_URL("Delivery page URL", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_E1_Find("Delivery Days container", "xpath", "//div[@class='layout mt-4 row wrap']", ParentTest, "no_jira");          // layout row wrap align-baseline       
            if (FAIL) { return; }
        Element_Child_List_L1("24 Hour Service Count", e1, "xpath", ".//input[@aria-label='24 Hour Service']", ParentTest, "no_jira");
            if (FAIL) { return; }
        for (int j = 0; j < L1.size(); j++) {
            if (j > 3) {
                Scroll_to_Element("Scroll to Day " + j, L1.get(j), ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            Thread.sleep(500);
            Element_Click("Check '24 Hour Service' " + j, L1.get(j), ParentTest, "no_jira");
                if (FAIL) { return; }
        }
        Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        // </editor-fold>   

        // <editor-fold defaultstate="collapsed" desc="MM - Activate/Set Visible in App New Local Menu">
        Open_Switch_to_2nd_Tab("Open Menu Manager in New Tab", url + "#/menu", ParentTest, "no_jira");
        EX += " - " + "\t" + " === MM New Local Menu " + "\t" + " ===== " + "\t" + " == Activate New Local Menu Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Page_URL("Menu Manager page URL", ParentTest, "no_jira");
            if (FAIL) { return; }

        Find_Text("Button 'Go to Menu' text", "Go to menus", true, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled", ParentTest, "no_jira");
            if (FAIL) { return; }

        Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        // ========================================= Group Selection ^^^^

        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        List_L2("Menus Count", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira");
            if (FAIL) { return; }
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
            Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira");
            if (t.trim().startsWith(GL_MENU)) {
                T_Index = i;
            }
        }
        if (T_Index > -1) {
//            Scroll_to_Element("Scroll to Menu " + GL_MENU, L2.get(T_Index), ParentTest, "no_jira");   
//                if (FAIL) { return;} 

            Find_Text("Fund 'Search...' text", "Search Global Menus", true, ParentTest, "no_jira");   
                if (FAIL) { return;}             
            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Global Menus')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Global Menus']", GL_MENU, false, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);
            Element_By_Path_Click("Search Menu Click", "xpath", "//*[contains(text(),'" +GL_MENU+ "')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}

            Find_Text("Fund 'Search...' text", "Search Local Menus", true, ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Local Menus')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Local Menus']", Location, false, ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Element_By_Path_Click("Search Menus Click", "xpath", "//*[contains(text(), '" +Location+ "')]", ParentTest, "no_jira");
                if (FAIL) { return; }

            Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            List_L1("Menu Sets Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Menu Set (Index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");
            }

            Element_Click("Click 1st Menu Set", L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            Element_By_Path_Text("Find 'Edit Menu Set Name' dialog", "xpath", "//div[@class='v-card__title H4-Secondary-Center v-card__title--primary']", ParentTest, "no_jira");
            if (t.contains("Edit")) {
                Element_E1_Find("Find 'Edit Menu Set name' container", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
                    if (FAIL) { return; }   
                Element_Child_E2("Find 'Edit...' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center v-card__title--primary']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Text("Dialog 'Edit..' Title text", e2, ParentTest, "no_jira");
                    if (FAIL) { return; }
                Find_Text("Find 'Use original..' Text", "Use original name", true, ParentTest, "no_jira");
                Element_Child_E2("Find 'Use original' check-box", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-marked theme--light secondary--text']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Click("Uncheck 'Use original' check-box", e2, ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Child_E2("Find 'Menu Set Name' text input", e1, "xpath", ".//input[@aria-label='Menu Set Name']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Text_Clear("Clear 'Menu Set Name' input", e2, ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Text_Enter("Enter new Menu Set Name", e2, "New Auto Menu " + New_ID, ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//div[text()='Cancel']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Text("Button 'Cancel' Text", e2, ParentTest, "no_jira");
                Element_Child_E2("Find dialog 'Save' button", e1, "xpath", ".//div[text()='Save']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Text("Button 'Save' Text", e2, ParentTest, "no_jira");
                Element_Click("Click 'Save'", e2, ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Click("Click 1st Menu Set/expand", L1.get(0), ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                List_L1("Updated Menu Sets Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                for (int i = 0; i < L1.size(); i++) {
                    Element_Attribute("Menu Set (Index " + i + ")", L1.get(i), "textContent", ParentTest, "no_jira");
                }
                Element_Click("Click 1st Menu Set", L1.get(0), ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
            }

            Element_Child_List_L2("Categories Count", L1.get(0), "xpath", ".//div[@class='layout align-center']", ParentTest, "no_jira");
            for (int i = 0; i < L1.size(); i++) {
                List_TR_TDs("Categories Row Data", L2.get(i), ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            List_L3("Item Rows Count", "tagName", "tr", ParentTest, "no_jira");
            List_TR_THs("Item Table Header", L3.get(0), ParentTest, "no_jira");
            for (int i = 2; i < L3.size(); i++) {
                List_TR_TDs("Item Row Data", L3.get(i), ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            Element_E1_Find("Find 'Bulk' container", "xpath", "//div[@class='layout justify-left align-center']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Child_Text("Find 'Bulk' default prompt", e1, "xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
            //if (FAIL) { return;} 

//            Element_Child_Click("Check 'Bulk' select All", e1,"xpath", ".//input[@role='checkbox']",  ParentTest, "no_jira");                    
//                if (FAIL) { return;} // element not visible ^^^
            Element_Child_E2("Find 'Bulk' select All checkbox", e1, "xpath", ".//input[@role='checkbox']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Click("Check 'Bulk' select All", e2, ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Child_E2("Find 'Bulk' updated prompt", e1, "xpath", ".//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_Text("Find 'Bulk' updated prompt text", e2, ParentTest, "no_jira");
            Element_Click("Click 'Update X Items' prompt", e2, ParentTest, "no_jira");
                if (FAIL) { return; }

            Element_By_Path_Click("Click 'In Stock'", "css", "[aria-label='In Stock']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Click 'Visible In App'", "css", "[aria-label='Visible In App']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//div[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return; }

            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) { return; }
        } else {
            _f++;
            EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        }
        EX += " - " + "\t" + " === MM New Local Menu " + "\t" + " ===== " + "\t" + " == Activate Local Menu End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

        Close_Current_Tab_switch_To_1st("Close Menu Managar tab", ParentTest, "no_jira");
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Add Station > Schedule Menu">               
        To_Top("Acroll to page Top", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Element_By_Path_Click("Tab 'Menu' Click", "xpath", "//*[text()='Menu']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);

        List_L1("Menu Rows Count", "tagName", "tr", ParentTest, "no_jira");
            if (FAIL) { return; }
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Menu Data Row Text", L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return; }
        }
        Find_Text("Find 'Schedule Your ...'", "Schedule Your Menus", true, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Presence("Wait 'Schedule menu' page", "css", "[aria-label='Menu']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Page Note", "xpath", "//div[contains(@class, 'H6-Selected-On-Surface')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Attribute("Menu container Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Menu dropdown Click Open", "css", "[aria-label='Menu']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_E1_Find("Find Menu list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_Child_List_L1("Menu list Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Menu (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return; }
        }
        if (L1.size() > 0 && !"No data available".equals(t)) {
            Element_Click("Select 1st Menu", L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return; }
            List_L2("Checkboxes Count", "css", "[role='checkbox']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Find_Text("Find 'Menu Duration' text", "Menu Duration", true, ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Click("Check 'All Day'", L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return; }

            To_Bottom("Scroll to page Bottom", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Repeat dropdown Click Open", "css", "[aria-label='Repeat']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_E1_Find("Find Repeat Options list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Child_List_L1("Repeat Options Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Repeat Option (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if ("Custom".equals(t.trim())) {
                    T_Index = i;
                }
            }
            Element_Click("Click 'Custom'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return; }
            Find_Text("Dialog Title", "Custom Recurrence", true, ParentTest, "no_jira"); // v-card__title H4-Secondary-Center
                if (FAIL) { return; }
            Find_Text("Repeat every Text", "Repeat every", true, ParentTest, "no_jira"); // layout mt-4 H6-Selected-On-Surface-High-Emphasis-Left
                if (FAIL) { return; }
            Find_Text("Repeat on Text", "Repeat on", true, ParentTest, "no_jira"); // layout mt-4 H6-Selected-On-Surface-High-Emphasis-Left
                if (FAIL) { return; }
            List_L1("WeekDays Count", "xpath", "//div[contains(@class, 'Weekday')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int i = 1; i < (L1.size() - 1); i++) {
                Element_Click("Select Weekday (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            Element_By_Path_Click("Click  'CONTINUE'", "xpath", "//*[contains(text(), 'CONTINUE')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Click("Check 'No End'", L2.get(1), ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Start Date Open", "css", "[aria-label='Start Date']", ParentTest, "no_jira");
                if (FAIL) { return; }
            int d = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
            Element_By_Path_Click("Click Current Date", "xpath", "//div[text()='" + d + "']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Find_Text("Find 'Service Types' text", "Service Types", true, ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Click("Check 'Pickup'", L2.get(2), ParentTest, "no_jira");
                if (FAIL) { return;}                      
            Element_Click("Check 'Devilery'", L2.get(3), ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Attribute("Schedule Summary", "xpath", "//div[@class='Menu-Schedule-Verbiage pa-3 Body-1-Black-High-Emphasis-Left pb-3 noselect']", "textContent", ParentTest, "no_jira");
            //if (FAIL) { return;}                      
            Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[@class='v-btn theme--light primary rounded m-2']", ParentTest, "no_jira");
                if (FAIL) { return; }

            Wait_For_Element_By_Path_Presence("Wait for 'Brand/Menus' table", "css", "[role='columnheader']", ParentTest, "no_jira");
                if (FAIL) { return; }
            List_L0("Menu Count after Schedule", "tagName", "tr", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_Text("Menu Row Header", L0.get(0), ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int i = 2; i < L0.size(); i++) {
                List_TR_TDs("Menu Row Data", L0.get(i), ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
        } else {
            _f++;
            F += "Step: " + _t + " > " + "Add Station > Schedule Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
            EX += " - " + "\t" + "Add Station > Schedule Menu" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            return;
        }
        // </editor-fold>   

        // <editor-fold defaultstate="collapsed" desc="Menu Assigned/Not assigned"> 
        Navigate_to_URL("Navigate to Brands List", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) { return; }
        List_L0("Get Menu Column", "xpath", "//table/tbody/tr/td[5]", ParentTest, "no_jira");
            if (FAIL) { return; }
        for (int i = 0; i < L0.size(); i++) {
            Element_Child_Text("Check Menu Availability", L0.get(i), "xpath", "//a/div", ParentTest, "no_jira");
                if (FAIL) { return; }
            if (t.contains("UNAVAILABLE")) {
                Wait_For_Element_By_Path_Presence("Check Menu is Unavailable", "xpath", "//table/tbody/tr[" + String.valueOf(i + 1) + "]/td[5]/a[@disabled='disabled']", ParentTest, "no_jira");
                    if (FAIL) { return; }
            } else {
                Element_By_Path_Click("Click > 'VIEW MENU'", "xpath", "//table/tbody/tr[" + String.valueOf(i + 1) + "]/td[5]/a/div[contains(text(),'VIEW MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(5000);
                Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(500);
                Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(2000);
                Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Thread.sleep(500);
                Move_to_Element_By_Path("Move to Item Name in Side Panel", "xpath", "//input[@aria-label='Item Name']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                String OIN = e.getAttribute("value");
                if (OIN.contains("1")) {
                    Element_By_Path_Click("Click > Item Name in Side Panel", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Input_Select_Clear("Clear > Item Name", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text_Enter("Update > Item Name", "css", "[aria-label='Item Name']", OIN.substring(0, OIN.length() - 1), false, ParentTest, "no_jira");
                        if (FAIL) { return; }
                    if (d1.findElement(By.xpath("//div[contains(text(),'Apply Changes')]/parent::button")).isEnabled()) {
                        _p++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu was Edited Successfully" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _f++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu Edit Failed" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                } else {
                    Element_By_Path_Click("Click > Item Name in Side Panel", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Input_Select_Clear("Clear > Item Name", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Text_Enter("Update > Item Name", "css", "[aria-label='Item Name']", OIN + "1", false, ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    if (d1.findElement(By.xpath("//div[contains(text(),'Apply Changes')]/parent::button")).isEnabled()) {
                        _p++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu was Edited Successfully" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _f++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu Edit Failed" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                }
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]/parent::button", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(500);
                Element_By_Path_Click("Click > Publish", "xpath", "//div[contains(text(),'publish')]/parent::button", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                // =================== "Leave without publishing?" Dialog even PUBLISH OK ============ DEBUG    
                Text_Found("Find 'Leave...' question", "Leave without publishing?", ParentTest, "no_jira");
                if ("Found".equals(t)) {
                    _f++;
                    EX += _t + "\t" + "Navigate Back after Publish OK" + "\t" + "MM 'Sector' page" + "\t" + "Dialog 'Leave without publishing?'" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";

                    F += "Step: " + _t + " > " + "Dialog 'Leave without publishing?' after Published OK" + "\r\n";
                    Find_Text("Find 'Leave...' note", "Changes will be lost if you do not publish.", true, ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Click("Click 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                }
                break;
            }
        }
        Navigate_to_URL("Navigate Back to Brands List", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) { return;  }
        List_L0("Get Menu Column", "xpath", "//table/tbody/tr/td[5]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        for (int i = 0; i < L0.size(); i++) {
            if (!t.toUpperCase().contains("UNAVAILABLE")) {
                Actions actions = new Actions(d1);
                actions.contextClick(L0.get(i)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
                Close_Current_Tab_switch_To_1st("Switch to new tab", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(2000);
                Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(500);
                Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(2000);
                Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(500);
                Move_to_Element_By_Path("Move to Item Name in Side Panel", "xpath", "//input[@aria-label='Item Name']", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                String OIN = e.getAttribute("value");
                if (e.getAttribute("value").contains("1")) {
                    Element_By_Path_Click("Click > Item Name in Side Panel", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Input_Select_Clear("Clear > Item Name", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Text_Enter("Update > Item Name", "css", "[aria-label='Item Name']", OIN.substring(0, OIN.length() - 1), false, ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    if (d1.findElement(By.xpath("//div[contains(text(),'Apply Changes')]/parent::button")).isEnabled()) {
                        _p++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu was Edited Successfully" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _f++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu Edit Failed" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                } else {
                    Element_By_Path_Click("Click > Item Name in Side Panel", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Input_Select_Clear("Clear > Item Name", "css", "[aria-label='Item Name']", ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    Element_By_Path_Text_Enter("Update > Item Name", "css", "[aria-label='Item Name']", OIN + "1", false, ParentTest, "no_jira");
                        if (FAIL) { return;  }
                    if (d1.findElement(By.xpath("//div[contains(text(),'Apply Changes')]/parent::button")).isEnabled()) {
                        _p++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu was Edited Successfully" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    } else {
                        _f++;
                        EX += _t + "\t" + "Menu Edit" + "\t" + e + "\t" + "Menu Edit Failed" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                }
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]/parent::button", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(500);
                Element_By_Path_Click("Click > Publish", "xpath", "//div[contains(text(),'publish')]/parent::button", ParentTest, "no_jira");
                    if (FAIL) { return;  }
                Thread.sleep(500);
                break;
            }
        }
        // </editor-fold> 
    } catch (Exception ex){
        // =============================================  
    }   
    } 

    // <editor-fold defaultstate="collapsed" desc="Removing and re-adding the global menus in the brand configuration AUT-293">
    protected void removeGlobalMenu(){
    try {
        EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Removing and re-adding the global menus in the brand configuration ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";

        Wait_For_Element_By_Path_Presence("Wait for brand name to load..", "xpath", "//td[contains(text(), '" + stationName + "')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + stationName + "')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(500);

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(500);

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        // Assign and remove GLobal menu
        Element_By_Path_Click("Click of Assign menus from left corner", "xpath", "//div[6]//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(1000);

        Wait_For_Element_By_Path_Presence("Wait for brand name to load..","xpath", "//div[@class='layout row nowrap']//div[@class='flex shrink xs2']//button[@class='v-btn v-btn--icon theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;  }
        List_L0("Count total assigned menus", "xpath", "//div[@class='layout row nowrap']//div[@class='flex shrink xs2']//button[@class='v-btn v-btn--icon theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;  }
        int countAssignedMenuBeforeRemove = L0.size();
        
        if (L0.isEmpty()) {
            Element_By_Path_Click("Click 'Save Changes Brand'", "xpath", "//*[contains(text(), 'Save Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;  }
            _f++;
            EX += " - " + "\t" + " === ^ No assigned menu found...after asigning menu from code-> case : Assign Menus" + "\t" + " ===== " + "\t" + " == ^ Sales Reporting for hidden stations End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        } else {
            Element_By_Path_Click("Click on remove assigned menu", "xpath", "//div[1][@class='layout row nowrap']//div[@class='flex shrink xs2']//button[@class='v-btn v-btn--icon theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;  }
            Element_By_Path_Click("Click 'Save Chnages Brand'", "xpath", "//*[contains(text(), 'Save Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;  }
        }
        //Check if assigned menu has removed
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Element_By_Path_Click("Click of Assign menus from left corner", "xpath", "//div[6]//div[contains(@class, 'SelectedLeft')]", ParentTest, "no_jira");
            if (FAIL) { return;  }
        Thread.sleep(1000);
        List_L1("Count total assigned menus", "xpath", "//div[@class='layout row nowrap']//div[@class='flex shrink xs2']//button[@class='v-btn v-btn--icon theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;  }
        int countAssignedMenuAfterRemove = L1.size();
        if (countAssignedMenuBeforeRemove == (countAssignedMenuAfterRemove - 1)) {
            Wait_For_Element_By_Path_Presence("Wait for breadscrumbs to be visible ", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
                if (FAIL) { return;  }
            Element_By_Path_Click("Click navigate back to Station Index page", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
                if (FAIL) { return;  }
            _p++;
            EX += _t + "\t" + "Removing and re-adding the global menus in the brand configuration" + "\t" + "Original Assigned menus" + countAssignedMenuBeforeRemove + "\t" + "After removing Assigned menu: " + countAssignedMenuAfterRemove + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\"\t" + "no_jira" + "\r\n";
        } else {
            Wait_For_Element_By_Path_Presence("Wait for breadscrumbs to be visible ", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
                if (FAIL) { return;  }
            Element_By_Path_Click("Click navigate back to Station Index page", "xpath", "//form[@class='v-form settings']//div//a[@class='v-breadcrumbs__item'][normalize-space()='" + SITE + "']", ParentTest, "no_jira");
                if (FAIL) { return;  }
            _f++;
            EX += _t + "\t" + "Removing and re-adding the global menus in the brand configuration" + "\t" + "Original Assigned menus" + countAssignedMenuBeforeRemove + "\t" + "After removing Assigned menu: " + countAssignedMenuAfterRemove + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\"\t" + "no_jira" + "\r\n";
        }
    } catch (Exception ex){
        // =============================================  
    }   
    } 
    // </editor-fold> 

    private void Verify_Sector_JDE_API() throws Exception {
        try{
            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";

            Call_API("Call /Sector/ API ", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" + SectorID + "?nocache=1", true, ParentTest, "no_jira" );
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/location/sector/" + SectorID  + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/sector/" + SectorID, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }

            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray JDE_companies = new JSONArray();
            JDE_companies = json.getJSONArray("companies");
            JSONObject company = new JSONObject();
            for(int i = 0;i<JDE_companies.length();i++) {
                company = JDE_companies.getJSONObject(i);
                if(company.getString("name").equals(GL_MENU)) {
                    if(company.getJSONObject("meta").has("jde_category")) {
                     //Print Pass new created brand has JDE category auto assigned
                        JDE_id = company.getJSONObject("meta").getString("jde_category");
                        _t++; _p++;
                        EX += _t + "\t" + "JDE Category auto assigned to global menu" + "\t" + "-" + "\t" + "JDE API ID: " + company.getJSONObject("meta").getString("jde_category")  + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "JDE Category auto assigned to global menu : " + JDE_id, false, ParentTest.createNode(_t + ". " + "JDE Category assigned correctly"), new Date());
                        flag = true;
                        break;
                    } else {     //Print fail
                        _t++; _f++;
                        EX += _t + "\t" + "JDE Category  assigned to Global menu incorrectly" + "\t" + "JDE ID: " + JDE_id + "\t" + "JDE API ID: " + company.getJSONObject("meta").getString("jde_category")  + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "JDE Category assigned to global menu incorrectly: " +company.getJSONObject("meta").getString("jde_category") , false, ParentTest.createNode(_t + ". " + "JDE Category assigned incorrectly"), new Date());
                        flag = false;
                    }
                }
            }   EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            }catch (Exception ex){}   // =============================================
    }

    private void Verify_JDE_API(String JDE_category) throws Exception {
        try {
            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            Call_API("Call /JDE/ API ", "Bearer " + AP3_TKN, BaseAPI + "/config/jde-configuration", true, ParentTest, "no_jira" );
            if(t.startsWith("{")){
                API_Response_Body = t;               
            } else {
                EX += _t + "\t == " + "API Response Error" + "\t" + BaseAPI + "/config/jde-configuration" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/config/jde-configuration", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }

            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray JDE_categories = new JSONArray();
            JDE_categories = json.getJSONArray("jde_categories");
            for(int i = 0; i < JDE_categories.length(); i++) {
                if(JDE_categories.getJSONObject(i).getString("name").equals(JDE_category))  {
                    if(JDE_id.equals(JDE_categories.getJSONObject(i).getString("id")))  {
                      _t++; _p++;
                      EX += _t + "\t" + "JDE Category UI : " +JDE_category + "\t" + "JDE UI ID: " +JDE_id  + "\t" + "JDE Category API: " +JDE_category+ "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                      Log_Html_Result("PASS", "JDE Category and ID : " +JDE_id, false, ParentTest.createNode(_t + ". " + "JDE Category & ID"), new Date());
                    }
                }
            }
            EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == JDE API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        } catch (Exception ex){
            // =============================================  
        }    
    }            
} 

