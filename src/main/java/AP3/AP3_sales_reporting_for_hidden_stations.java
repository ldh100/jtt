package AP3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Keyur.Patel
 */
class AP3_sales_reporting_for_hidden_stations extends AP3_GUI {

    protected AP3_sales_reporting_for_hidden_stations(AP3_GUI a) {
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

        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }
    String API_Response_Body = "";
    private String storeBusinessUnit = "";
    private String storeSearchedSite = "";
    private String storeSearchedCountry = "";
    private String storeStationName = "";
    private ArrayList<String> storeVisibilityOfStation = new ArrayList<>();
    private ArrayList<String> storePresentVisibilityOfStation = new ArrayList<>();

    protected void run() {

        openDashboardDrawer();
        navigateToSiteIndexPage();
        validateOnSiteProductApplication();
        searchBySelectedSiteAp3();
        storeVisibilityOfStation();
        checkHeaderForSiteIndex();
        navigateToSiteReportIndexPage();
        searchBySelectedSitedSiteReport();
        openReportFilters();
        revertVisibilityOfStation();

    }

    //This method will open & closed dashboard
    protected void openDashboardDrawer() {
        try {
            Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method will navigate to Site Index page
    protected void navigateToSiteIndexPage() {
        try {
            Element_By_Path_Click("Drawer > Sites Click", "xpath", "//div[contains(text(),'Sites')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method validates if "Site Production" has All selected in dropdown.
    protected void validateOnSiteProductApplication() {
        try {
            Element_By_Path_Text("Get default selected Production app on Site page", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t != "All") {
 Thread.sleep(1000);
                Element_By_Path_Click("Open Production app drop-down", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
           Thread.sleep(1000);
                Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[contains(text(),'All')][contains(@class,'v-list__tile__title')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method validates if "Site Production" has All selected in dropdown
    protected void validateOnSiteProductApplicationSalesReport() {
        try {
            Element_By_Path_Text("Get default selected Production app", "xpath", "//*[@class='layout row wrap']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t != "All") {
                Element_By_Path_Click("Open drop-down of 'On Site Product'", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list theme--light']//div[contains(text(),'All')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method will search for selected site from Ap3
    protected void searchBySelectedSiteAp3() {
        try {
            Element_By_Path_Text("Get default selected Production app on Site page", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.equals("All")) {
                Element_By_Path_Text_Enter("Enter Site name in search box", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Wait_For_Element_By_Path_Presence("Waiting for Site name to load...after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Text("Get Site name from table list after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                storeSearchedSite = t;
                Wait_For_Element_By_Path_Presence("Waiting for Country element to load....after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Text("Get Country values from table list after Site search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                storeSearchedCountry = t;

                // Check if both Site and Country matches to data selected from AP3
                if (storeSearchedSite.equalsIgnoreCase(SITE)) {
                    Element_By_Path_Text("Get Business Unit for selected Site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    storeBusinessUnit = t;
                    Thread.sleep(1000);
                    Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']", ParentTest, "No Jira");
                    if (FAIL) {
                        return;
                    }
                } else if (t.isEmpty() && t.equals("")) {
                    if (FAIL) {
                        return;
                    } // =============================== ????
                    System.err.println("Selected site from Ap3 not found in site list");
                }
            } else {
                validateOnSiteProductApplication();
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method will search by selcted Site from AP3 on Sales report Index page
    protected void searchBySelectedSitedSiteReport() {
        try {
            Element_By_Path_Text("Get default selected Production app on Sales Report page", "xpath", "//*[@class='layout row wrap']//*[@class='v-select__selection v-select__selection--comma']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.equals("All")) {
                Element_By_Path_Text_Enter("Enter Site name in search box", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Wait_For_Element_By_Path_Visibility("Wait for Site name to show up after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Text("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                if (t.equals(SITE)) {
                    Element_By_Path_Click("Click on searched site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                } else {
                    System.err.println("Selected site from JTT not found in site list"); // ====================== ????
                }
            } else {
                validateOnSiteProductApplicationSalesReport();
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    // Store initial visibility of station before any change
    protected void storeVisibilityOfStation() {
        try {
            List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", ParentTest, "no_jira");
            for (int row = 1; row < L0.size(); row++) {
                _t++;
                List_TR_TDs("Get Station name", L0.get((row - 1)), ParentTest, "no_jira");
                storeStationName = t.substring(0, t.indexOf("  >"));
 Thread.sleep(1000);
                Element_By_Path_Attribute("Original visibility Status for : " + storeStationName + "", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", ParentTest, "no_jira");
                storeVisibilityOfStation.add(t);
                if (FAIL) {
                    return;
                }
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    // Check if header maches to Selected Site
    protected void checkHeaderForSiteIndex() {
        try {
Thread.sleep(1000);
            Element_By_Path_Text("Validate header for selected site ", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.equalsIgnoreCase(SITE)) {
                hideVisibilityOfAllStation();
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //Validate if all stations are hidden for selected Site
    protected void hideVisibilityOfAllStation() {
        try {
            List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", ParentTest, "no_jira");
            for (int row = 1; row <= L0.size(); row++) {
    Thread.sleep(1000);
                Element_By_Path_Attribute("Get visibility Status,To make it hide if it's visible", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                if (t.trim().equalsIgnoreCase("v-icon mdi mdi-eye theme--light")) {
                    Element_By_Path_Click("Click on Hide in App if station visible", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
            }
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method will navigate page to "Site Reporting" index page
    protected void navigateToSiteReportIndexPage() {
        try {
            Wait_For_All_Elements_InVisibility("Drawer > 'Sales Reporting' visibility", "xpath", "//*[contains(text(), 'Sales Reporting')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira");

            Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            validateOnSiteProductApplicationSalesReport();
        } catch (Exception ex) {
        }   // =============================================  
    }

    //This method will open "Filters" for selected site from  "Sales Reporting"
    protected void openReportFilters() {
        try {
            Wait_For_All_Elements_InVisibility("Filter element should be visible on Site report", "xpath", "//*[@class='flex shrink']/button[1][@class='v-btn v-btn--flat theme--light']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Click on Filter button", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Wait_For_Element_By_Path_Visibility("Filter drawer should visible", "xpath", "//*[@class='v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open v-navigation-drawer--right v-navigation-drawer--temporary theme--light']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_DisplayCheck("Business Unit element should visible", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Text("Copy Business Unit number", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }

            if (storeBusinessUnit.equals(t.replace("Unit ", ""))) {
                Wait_For_Element_By_Path_Visibility("Check if Business Unit is visible", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(1000);
                Element_By_Path_Click("Checked/CLick on Business Unit", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Click("Click outside of Business unit drawer", "xpath", "//*[@class='v-overlay v-overlay--active']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(1000);
                Element_By_Path_Text("Get Business Unit after applied from Filter", "xpath", "//*[@class='flex']//span[1][@class='v-chip v-chip--label v-chip--removable theme--light']//span[1]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Wait_For_Element_By_Path_Presence("Reporting Dates should visible under Filters", "xpath", "//div[contains(text(),'Reporting Dates')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(1000);
                Wait_For_Element_By_Path_Presence("Beginning Reading should visible under Filters", "xpath", "//div[contains(text(),'Beginning Reading')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(1000);
                Wait_For_Element_By_Path_Presence("Ending Reading should visible under Filters", "xpath", "//div[contains(text(),'Ending Reading')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                _t++;
                _p++;
                EX += _t + "\t" + "Genrerate Sales Report for hidden stations" + "\t" + "\t" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "Generate Sales Report for hidden stations", false, ParentTest.createNode(_t + ". " + "Not able find report for hidden stations"), new Date());
            } else {
                _t++;
                _f++;
                EX += _t + "\t" + "No Sales Report found for hidden stations" + "\t" + "\t" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "No Sales Report found for hidden stations", false, ParentTest.createNode(_t + ". " + "Not able find report for hidden stations"), new Date());
            }
            EX += " END " + "\t" + " === ^ Sales Report for hidden stations" + "\t" + " ===== " + "\t" + " == ^ Sales Reporting for hidden stations End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        } catch (Exception ex) {
        }   // =============================================  
    }

    // Revert all sites back to original aria-Checked
    protected void revertVisibilityOfStation() {
        try {
            EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Verify if Visibility for all Station Revert it back to Original mode ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            openDashboardDrawer();
            navigateToSiteIndexPage();
            validateOnSiteProductApplication();
            searchBySelectedSiteAp3();

            List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", ParentTest, "no_jira");
            int row;
            // This loop will compare storePresentVisibility of station
            for (row = 1; row <= L0.size(); row++) {
Thread.sleep(1000);
                Element_By_Path_Attribute("Get attribute value  for aria-Checked class ", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", ParentTest, "no_jira");
                storePresentVisibilityOfStation.add(t);
                if (FAIL) {
                    return;
                }
            }
            // This loop will compare stationPresentVisibilityOfStation with stationPresentVisibilityOfStation and make it revert
            for (int row1 = 0; row1 <= L0.size(); row1++) {
                int storeRow1 = row1;
                int clickRow = ++row1;
                if (storeVisibilityOfStation.get(storeRow1) != null && storePresentVisibilityOfStation.get(storeRow1) != null) {
                    if (!storeVisibilityOfStation.get(storeRow1).contentEquals(storePresentVisibilityOfStation.get(storeRow1))) {
                        //System.err.println(storeRow1);
                        //System.err.println("Found diffirent -->>" + storePresentVisibilityOfStation.get(storeRow1) + "-->" + storeVisibilityOfStation.get(storeRow1) + "");
                        Thread.sleep(1000);
                        Element_By_Path_Click("Revert station visibility back to original mode", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + clickRow + "]/td[6]//div[@class='v-input__control']", ParentTest, "no_jira");
                        if (FAIL) {
                            return;
                        }
                    }
                }
                row1 = storeRow1;
            }
            Element_By_Path_Text("Validate header for selected site ", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            storePresentVisibilityOfStation.clear();
            storeVisibilityOfStation.clear();
        } catch (Exception ex) {
        }   // =============================================  
    }
}
