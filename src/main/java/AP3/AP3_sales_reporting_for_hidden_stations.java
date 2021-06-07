/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
import java.util.ArrayList;

/**
 *
 * @author Keyur.Patel
 */
public class AP3_sales_reporting_for_hidden_stations {

    public static String storeBusinessUnit = "";
    public static String storeSearchedSite = "";
    public static String storeSearchedCountry = "";
    public static String storeStationName = "";
    public static ArrayList<String> storeVisibilityOfStation = new ArrayList<String>();
    public static ArrayList<String> storePresentVisibilityOfStation = new ArrayList<String>();

    public static void run() throws InterruptedException {
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

    public static void openDashboardDrawer() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);

    }

    //This method will navigate to Site Index page
    public static void navigateToSiteIndexPage() throws InterruptedException {

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Click("Drawer > Sites Click", "xpath", "//div[contains(text(),'Sites')]", "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(200);

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(200);

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]", "no_jira");
        if (FAIL) {
            return;
        }

    }

    //This method validates if "Site Production" has All selected in dropdown.
    public static void validateOnSiteProductApplication() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Get default selected Production app", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open Production app drop-down", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[contains(text(),'All')][contains(@class,'v-list__tile__title')]", "no_jira");
            if (FAIL) {
                return;
            }

        }

    }

    //This method validates if "Site Production" has All selected in dropdown
    public static void validateOnSiteProductApplicationSalesReport() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Get default selected Production app", "xpath", "//*[@class='layout row wrap']//*[@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        System.err.println(t);
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open drop-down of 'On Site Product'", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list theme--light']//div[contains(text(),'All')]", "no_jira");
            if (FAIL) {
                return;
            }

        }
    }

    //This method will search for selected site from Ap3
    public static void searchBySelectedSiteAp3() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Get default selected Production app on Site page", "xpath", "//*[@class='flex']//*[@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }

        if (t.equals("All")) {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text_Enter("Enter Site name in search box", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Presence("Waiting for Site name to load...after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Get Site name from table list after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", "no_jira");
            if (FAIL) {
                return;
            }
            storeSearchedSite = t;

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Presence("Waiting for Country element to load....after search", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Get Country values from table list after Site search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[3]", "no_jira");
            if (FAIL) {
                return;
            }
            storeSearchedCountry = t;

            // Check if both Site and Country matches to data selected from AP3
            if (storeSearchedSite.equalsIgnoreCase(SITE) && storeSearchedCountry.equalsIgnoreCase(COUNTRY)) {

                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Get Business Unit for selected Site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", "no_jira");
                if (FAIL) {
                    return;
                }
                storeBusinessUnit = t;

                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']", "No Jira");
                if (FAIL) {
                    return;
                }
            } else if (t.isEmpty() && t.equals("")) {
                if (FAIL) {
                    return;
                }
                System.err.println("Selected site from Ap3 not found in site list");
            }

        } else {
            validateOnSiteProductApplication();
        }
    }

    //This method will search by selcted Site from AP3 on Sales report Index page
    public static void searchBySelectedSitedSiteReport() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Get default selected Production app on Sales Report page", "xpath", "//*[@class='layout row wrap']//*[@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        if (t.equals("All")) {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text_Enter("Enter Site name in search box", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Visibility("Wait for Site name to show up after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", "no_jira");

            if (t.equals(SITE)) {

                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click on searched site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
                if (FAIL) {
                    return;
                }
            } else {
                System.err.println("Selected site from JTT not found in site list");
            }

        } else {
            validateOnSiteProductApplicationSalesReport();
        }
    }

    // Store initial visibility of station before any change
    public static void storeVisibilityOfStation() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", "no_jira");

        for (int row = 1; row <= L0.size(); row++) {
            _t++;
            TWeb.List_TR_TDs("Get Station name", L0, (row - 1), "no_jira");
            storeStationName = t.substring(0, t.indexOf("  >"));

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Attribute("Original visibility Status for : " + storeStationName + "", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", "no_jira");
            storeVisibilityOfStation.add(t);
            if (FAIL) {
                return;
            }

        }

    }

    // Check if header maches to Selected Site
    public static void checkHeaderForSiteIndex() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate header for selected site ", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", "no_jira");
        if (FAIL) {
            return;
        }
        if (t.equalsIgnoreCase(SITE)) {
            hideVisibilityOfAllStation();
        }
    }

    //Validate if all stations are hidden for selected Site
    public static void hideVisibilityOfAllStation() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", "no_jira");

        for (int row = 1; row <= L0.size(); row++) {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Attribute("Get visibility Status,To make it hide if it's visible", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", "no_jira");
            if (FAIL) {
                return;
            }
            if (t.trim().equalsIgnoreCase("v-icon mdi mdi-eye theme--light")) {
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click on Hide in App if station visible", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']", "no_jira");
                if (FAIL) {

                    return;
                }
            }
        }

    }

    //This method will navigate page to "Site Reporting" index page
    public static void navigateToSiteReportIndexPage() throws InterruptedException {
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Wait_For_All_Elements_InVisibility("Drawer > 'Sales Reporting' visibility", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep(200);
        TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira");
        if (FAIL) {
            return;
        }
        validateOnSiteProductApplicationSalesReport();

    }

    //This method will open "Filters" for selected site from  "Sales Reporting"
    public static void openReportFilters() throws InterruptedException {

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Wait_For_All_Elements_InVisibility("Filter element should be visible on Site report", "xpath", "//*[@class='flex shrink']/button[1][@class='v-btn v-btn--flat theme--light']", "no_jira");
        if (FAIL) {

            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Click("Click on Filter button", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", "no_jira");
        if (FAIL) {

            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Wait_For_Element_By_Path_Visibility("Filter drawer should visible", "xpath", "//*[@class='v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open v-navigation-drawer--right v-navigation-drawer--temporary theme--light']", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_DisplayCheck("Business Unit element should visible", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Copy Business Unit number", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
        if (FAIL) {
            return;
        }

        if (storeBusinessUnit.equals(t.replace("Unit ", ""))) {

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Visibility("Check if Business Unit is visible", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Checked/CLick on Business Unit", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
            Thread.sleep(300);
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Click outside of Business unit drawer", "xpath", "//*[@class='v-overlay v-overlay--active']", "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Get Business Unit after applied from Filter", "xpath", "//*[@class='flex']//span[1][@class='v-chip v-chip--label v-chip--removable theme--light']//span[1]", "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(200);

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Presence("Reporting Dates should visible under Filters", "xpath", "//div[contains(text(),'Reporting Dates')]", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Presence("Beginning Reading should visible under Filters", "xpath", "//div[contains(text(),'Beginning Reading')]", "no_jira");
            if (FAIL) {
                return;
            }

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Wait_For_Element_By_Path_Presence("Ending Reading should visible under Filters", "xpath", "//div[contains(text(),'Ending Reading')]", "no_jira");
            Thread.sleep(200);
            if (FAIL) {
                return;
            }

        }
        EX += " - " + "\t" + " === ^ Sales Report for hidden stations" + "\t" + " ===== " + "\t" + " == ^ Sales Reporting for hidden stations End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

    }

    // Revert all sites back to original aria-Checked
    public static void revertVisibilityOfStation() throws InterruptedException {

        EX += "\n - " + "\t" + " ===Begin====" + "\t" + " ===== " + "\t" + " == Verify if Visibility for all Station Revert it back to Original mode ==" + "\t" + "-" + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        openDashboardDrawer();
        navigateToSiteIndexPage();
        validateOnSiteProductApplication();
        searchBySelectedSiteAp3();

        _t++;
        Thread.sleep((long) sleep);
        TWeb.List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", "no_jira");
        int row;

        // This loop will compare storePresentVisibility of station
        for (row = 1; row <= L0.size(); row++) {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Attribute("Get attribute value  for aria-Checked class ", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + row + "]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", "no_jira");
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
                    _t++;
                    Thread.sleep((long) sleep);
                    // System.err.println(storeRow1);
                    //System.err.println("Found diffrent -->>" + storePresentVisibilityOfStation.get(storeRow1) + "-->" + storeVisibilityOfStation.get(storeRow1) + "");
                    TWeb.Element_By_Path_Click("Revert station visibility back to original mode", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr[" + clickRow + "]/td[6]//div[@class='v-input__control']", "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
            }
            row1 = storeRow1;
        }
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate header for selected site ", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", "no_jira");
        if (FAIL) {
            return;
        }
        storePresentVisibilityOfStation.clear();
        storeVisibilityOfStation.clear();
    }
}
