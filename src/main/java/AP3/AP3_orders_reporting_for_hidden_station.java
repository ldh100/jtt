/**
 *
 * @author Keyur.Patel
 */

package AP3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

class AP3_orders_reporting_for_hidden_station extends AP3_GUI{
    protected AP3_orders_reporting_for_hidden_station (AP3_GUI a) {
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
        COUNTRY = a.COUNTRY;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    

    private String storeSearchedSite = "";
    private String storeSearchedCountry = "";
    private String storeStationName = "";
    private String storeInitialVisibilityOfStation = "";
    private Boolean flagStationVisibility = false;
    private ArrayList<String> storePresentVisibilityOfStation = new ArrayList<>();

    protected void run(){
        openDashboardDrawer();
        navigateToSiteIndexPage();
        validateOnSiteProductApplication();
        searchBySelectedSiteAp3();
        checkSelectedSite();
        checkOrdersForStation();
        checkDateRangeFunctionality();
        revertVisibilityOfStation();
    }

    protected void openDashboardDrawer()  {
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
    } catch (Exception ex){}   // =============================================  
    } 

    //This method will navigate to Site Index page
    protected void navigateToSiteIndexPage() {
    try {
        Element_By_Path_Click("Drawer > Sites Click", "xpath", "//div[contains(text(),'Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Thread.sleep(500);    
        Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
    } catch (Exception ex){}   // =============================================  
    } 

    //This method validates if "Site Production" has All selected in dropdown.
    protected void validateOnSiteProductApplication() {
    try {    
        Element_By_Path_Text("Get default selected Production app on Site page", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        if (t != "All") {
            Element_By_Path_Click("Open Production app drop-down", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[contains(text(),'All')][contains(@class,'v-list__tile__title')]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
        }
    } catch (Exception ex){}   // =============================================  
    } 
    //This method validates if "Site Production" has All selected in dropdown.

    protected void validateOnSiteProductApplicationOrders(){
    try{    
        Element_By_Path_Text("Get default selected Production app", "xpath", "//*[@aria-label='Select App']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
      
        if (t != "All") {
            Element_By_Path_Click("Open drop-down for On Site Product selection", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--solo-flat v-text-field--enclosed v-select v-autocomplete v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__slot']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']/div[1]/div[1]/div[1]/a[@class='v-list__tile v-list__tile--link theme--light']/div/div[@class='v-list__tile__title'][contains(text(),'All')]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            searchBySelectedSiteOrdersIndex();
        }
    } catch (Exception ex){}   // =============================================  
    } 

    //This method will search for selected site from Ap3
    protected void searchBySelectedSiteAp3() {
    try {    
        Element_By_Path_Text("Get default selected Production app", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira"); 
            if (FAIL) { return; }

        if (t.equals("All")) {
            Element_By_Path_Text_Enter("Enter Site name in Search bar", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Wait_For_Element_By_Path_Presence("Waiting for Site name to load..after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Text("Get Site name from table list after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            storeSearchedSite = t;
            Wait_For_Element_By_Path_Presence("Waiting for Country to load...after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Text("Get Country values after Site table list after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            storeSearchedCountry = t;

            // Check of both Site and Country matches to data selected from AP3
            if (storeSearchedSite.equalsIgnoreCase(SITE) && storeSearchedCountry.equalsIgnoreCase(COUNTRY)) {
                Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']", ParentTest, "No Jira");
                    if (FAIL) { return; }
                Wait_For_All_Elements_InVisibility("Wait for all elements to load on Site Detail page", "xpath", "//div[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return; }
            } else if (t.isEmpty() && t.equals("")) {
                if (FAIL) { return; }
                System.err.println("Selected site from Ap3 not found in site list");
            }
        } else {
            if (FAIL) { return; } //  ?????
        }
    } catch (Exception ex){}   // =============================================  
    } 

    protected void searchBySelectedSiteOrdersIndex()  {
    try {    
        Element_By_Path_Text_Enter("Enter Site name in Search box", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Presence("Wait for Site name to load.. after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Text("Get Site name from table list after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        storeSearchedSite = t;
        Wait_For_Element_By_Path_Presence("Wait for Country to load...after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Text("Get Country values from table list after Site search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        storeSearchedCountry = t;

        // Check of both Site and Country matches to data selected from AP3
        if (storeSearchedSite.equalsIgnoreCase(SITE) && storeSearchedCountry.equalsIgnoreCase(COUNTRY)) {
            Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']",  ParentTest, "No Jira");
                if (FAIL) { return; }
        } else if (t.isEmpty() && t.equals("")) {
            //    ?????
            System.err.println("Selected site from Ap3 not found in site list");
        }
    } catch (Exception ex){}   // =============================================  
    } 

    //This method will search by selcted Site from AP3 on Order report Index page
    protected void searchBySelectedSitedSiteOrderReport() {
    try {    
        Element_By_Path_Text("Get default selected Production app on Orders Index", "xpath", "//*[@class='layout row wrap']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        if (t.equals("All")) {
            Element_By_Path_Text_Enter("Enter Site name in Search box", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Wait_For_Element_By_Path_Visibility("Wait for Site name to load.. after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Text("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            if (t.equals(SITE)) {
                Element_By_Path_Click("Click on searched site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", ParentTest, "no_jira"); 
                    if (FAIL) { return; }
            } else {
                System.err.println("Selected site from JTT not found in site list");
            }
        }
    } catch (Exception ex){}   // =============================================  
    } 

    // Store initial visibility of station before any change
    protected void hideVisibilityOfStation() {
    try {    
        Find_Text("Get Station name from list after search result", BRAND, true, ParentTest, "no_jira"); 
            if (FAIL) { return; }
        storeStationName = t;
        List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", ParentTest, "no_jira"); 

        for (int row = 1; row <= L0.size(); row++) {
            List_TR_TDs("Check Station list to matches with selected station from 'AP3' ", L0.get((row - 1)), ParentTest, "no_jira"); 

            if (t.substring(0, t.indexOf("  >")).trim().equalsIgnoreCase(BRAND)) {

                Element_By_Path_Attribute("Found match & Initial visibility Status for : " + storeStationName + " is..", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", ParentTest, "no_jira"); 
                storeInitialVisibilityOfStation = t;
                    if (FAIL) { return; }
                if (storeInitialVisibilityOfStation.trim().equalsIgnoreCase("v-icon mdi mdi-eye theme--light")) {
                    Element_By_Path_Click("Click hide in App for " + BRAND + "", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']", ParentTest, "no_jira"); 
                        if (FAIL) { return; }
                }
                flagStationVisibility = true;
            }
        }
        if (flagStationVisibility.equals(true)) {
            navigateToOrdersIndexPage();
        }
    } catch (Exception ex){}   // =============================================  
    } 

    //Validate if selected Site header match
    protected void checkSelectedSite() {
    try {    
        Element_By_Path_Text("Validate header for selected site", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        if (t.equalsIgnoreCase(SITE)) {
            hideVisibilityOfStation();
        }
    } catch (Exception ex){}   // =============================================  
    } 

    //This method will navigate page to /"Order Reporting" index page
    protected void navigateToOrdersIndexPage() {
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Thread.sleep(500);

        Element_By_Path_Click("Drawer > 'Orders' Click", "xpath", "//*[contains(text(), 'Orders')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Thread.sleep(200);
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Page_URL("Orders page URL", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        validateOnSiteProductApplicationOrders();
    } catch (Exception ex){}   // =============================================  
    } 

    //This method will check order for selected station
    protected void checkOrdersForStation() {
    try {    
        Element_By_Path_Text("Validate header for selected site", "xpath", "//div[@class='flex xs8']//div[@class='H3-Primary-Left']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        System.err.println("Header" + t);
        if (t.equalsIgnoreCase("Orders")) {
            //Find stations 
            Find_Text("Find 'All Stations'", "All Stations", true, ParentTest, "no_jira"); 
            Element_By_Path_Click("Open Brand combobox", "css", "[aria-label='Brand']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            List_L1("Brands/Station Count in drop-down", "xpath", "//div[contains(@class,'menuable__content__active')]/descendant::div[@class='v-list__tile__title']", ParentTest, "no_jira"); 
            if (FAIL) {
                return;
            }
            for (int i = 0; i < L1.size(); i++) {
                Element_Attribute("Brand/Station name ", L1.get(i), "textContent", ParentTest, "no_jira"); 
                    if (FAIL) { return; }
                if (t.equalsIgnoreCase(BRAND)) {
                    T_Index = i;
                }
            }
            Element_Click("Select Station with hide property", L1.get(T_Index), ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Text("Orders page dosen't have filters", "xpath", "//div[@class='layout wrap justify-space-between']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
            Element_By_Path_Text("Order table should available for hidden station", "xpath", "//table[@class='v-datatable v-table theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
        }
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Verify if Orders available for hidden Station ====END==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
    } catch (Exception ex){}   // =============================================  
    } 

    // This methid will validate Date range funationality for AUT-870
    protected void checkDateRangeFunctionality() {
    try {    
        EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Upon selecting the date range, the selection must remain the same ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //Select a specific date from the calendar to view the orders for that date
        LocalDate date = LocalDate.now();
        LocalDate prev_date = date.minusDays(1);
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        if (prev_date.getMonthValue() != date.getMonthValue()) {
            Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return; }
        }

        Wait_For_Element_By_Path_Visibility("Wait until previous day element visible", "xpath", "//tr/td[contains(number()," + prev_date.getDayOfMonth() + ")]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Click previous day", "xpath", "//tr/td[contains(number()," + prev_date.getDayOfMonth() + ")]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(3000);

        Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(5000);

        Wait_For_Element_By_Path_Visibility("Wait until Button Attribute visible", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Attribute("Button Attribute", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", "dates", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        String button_date_attribute = t;  //2021-06-02
        Page_URL("Current URL", ParentTest, "no_jira"); 
        String date_URL = t.substring(t.length() - 10);
        if (date_URL.equals(button_date_attribute)) { // Pass order date is equal to displayed order date
            _t++;
            _p++;
            EX += _t + "\t" + "URL Order date is equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("PASS", "URL Order date is equal to button date attribute" , false, ParentTest.createNode("URL Order date do no match to expected result"));
        } else {
            _t++;
            _f++;
            EX += _t + "\t" + "URL Order date is not equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
              Log_Html_Result("FAIL", "URL Order date is not equal to button date attribute" , false, ParentTest.createNode("URL Order date do no match to expected result"));
        }

        //Select a 7 day range from the calendar to view the orders for that period
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        //Click previous month
        Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        //Error toast message since more than 7 days
        Wait_For_Element_By_Path_Visibility("Wait unti day 10 visible", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Click day 10", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Visibility("Wait until day 17 visible", "xpath", "//tr/td[contains(number(),17)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Click day 17", "xpath", "//tr/td[contains(number(),17)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(3000);

        Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }

        //Select 6 days range for next month
        Wait_For_Element_By_Path_Visibility("Wait until Open Date picker available", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Visibility("Wait until next button is available on calander", "xpath", "//button[@class='v-btn v-btn--icon theme--light']//i[@class='v-icon mdi mdi-chevron-right theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Click next month", "xpath", "//button[@class='v-btn v-btn--icon theme--light']//i[@class='v-icon mdi mdi-chevron-right theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(1000);

        Wait_For_Element_By_Path_Visibility("Wait until day 10 is visible", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(1000);
        Element_By_Path_Text_DblClick("Click day 10", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Visibility("Wait until day 16 available", "xpath", "//tr/td//div[contains(number(),16)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Click("Click day 16", "xpath", "//tr/td//div[contains(number(),16)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        //Can use Close Date picker too instead of Escape Key  
        d1.findElement(By.cssSelector("[aria-label='Date(s)']")).sendKeys(Keys.ESCAPE);
        Wait_For_Element_By_Path_Presence("Wait for Button Attribute to be visible", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Element_By_Path_Attribute("Button Attribute", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", "dates", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        button_date_attribute = t.replace(" to ", "_");  //2021-06-10 to 2021-06-16
        
        //URL to verify the date picker has selected 7 day range
        Page_URL("Current URL", ParentTest, "no_jira"); 
        date_URL = t.substring(t.length() - 10); // was 21

        if (date_URL.equals(button_date_attribute)) { // Pass order date is equal to displayed order date
            _t++;
            _p++;
            EX += _t + "\t" + "URL Order date for 7 days range is equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           Log_Html_Result("PASS", "URL Order date for 7 days range is equal to button date attribute" , false, ParentTest.createNode("Not able to find 7 days range"));
        } else {
            System.err.println("Going Fail");
            _t++;
            _f++;
            EX += _t + "\t" + "URL Order date for 7 days range is not equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "URL Order date for 7 days range is not equal to button date attribute" , false, ParentTest.createNode("Not able to find 7 days range"));
        }

        //Select a 2 days range -  June 1st to June 2nd (2021-06-01 to 2021-06-02)
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        Wait_For_Element_By_Path_Visibility("Wait untit day 1 is visible", "xpath", "//tr/td[contains(number(),1)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }

        Element_By_Path_Text_DblClick("Click day 1", "xpath", "//tr/td[contains(number(),1)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(1000);

        Wait_For_Element_By_Path_Visibility("Wait until day 2 is visible", "xpath", "//tr/td[contains(number(),2)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }

        Element_By_Path_Click("Click day 2", "xpath", "//tr/td[contains(number(),2)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(1000);

        //Can use Close Date picker too instead of Escape Key   
        d1.findElement(By.cssSelector("[aria-label='Date(s)']")).sendKeys(Keys.ESCAPE);
Thread.sleep(1000);

        //URL to verify the date picker has selected 2 day range

        Element_By_Path_Attribute("Button Attribute", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", "dates", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        button_date_attribute = t.replace(" to ", "_");  //2021-06-01 to 2021-06-02


        Page_URL("Current URL", ParentTest, "no_jira"); 
        date_URL = t.substring(t.length() - 10); // was 21
        if (date_URL.equals(button_date_attribute)) { // Pass order date is equal to displayed order date
            _t++;
            _p++;
            EX += _t + "\t" + "URL Order date for 2 days range is equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
             Log_Html_Result("PASS", "URL Order date for 2 days range is equal to button date attribute" , false, ParentTest.createNode("Not able to find 2 days range"));
        } else {
            _t++;
            _f++;
            EX += _t + "\t" + "URL Order date for 2 days range is not equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
             Log_Html_Result("FAIL", "URL Order date for 2 days range is not equal to button date attribute" , false, ParentTest.createNode("Not able to find 2 days range"));
        }
    } catch (Exception ex){}   // =============================================  
    } 

    // Revert all sites back to original aria-Checked
    protected void revertVisibilityOfStation() {
    try {    
        EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Verify if Visibility of selected Station Revert it back to original mode ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        openDashboardDrawer();
        navigateToSiteIndexPage();
        validateOnSiteProductApplication();
        searchBySelectedSiteAp3();

        // This loop will compare storePresentVisibility of station
        List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", ParentTest, "no_jira"); 

        for (int row = 1; row <= L0.size(); row++) {
            _t++;
            List_TR_TDs("Checking from Station list for previously hidden", L0.get((row - 1)), ParentTest, "no_jira"); 

            if (t.contains(BRAND)) {
                Element_By_Path_Attribute("Present visibility Status for : " + storeStationName + "", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", ParentTest, "no_jira"); 
                    if (FAIL) { return; }

                // This condition will compare stationPresentVisibilityOfStation with stationPresentVisibilityOfStation and make it revert
                if (storeInitialVisibilityOfStation.trim().equalsIgnoreCase(t)) {

                } else {
                    Element_By_Path_Click("Revert visibility back to original state " + BRAND + "", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']", ParentTest, "no_jira"); 
                        if (FAIL) { return; }
                }
            }
        }
    } catch (Exception ex){}   // =============================================  
    } 
}
