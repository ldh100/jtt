package DL;

import java.util.ArrayList;
import java.util.List;

class DL_metrics_selection extends DL_GUI {

    protected DL_metrics_selection(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }

    protected void run() {
        try {
            Thread.sleep(500);
            SelectMember();
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//*[text()='Filters']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Find_Text("Find 'Filters' label", "Filters", true, ParentTest, "no_jira");
            Find_Text("Find 'Create a Filter' button label", "Create a Filter", true, ParentTest, "no_jira");
            Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", ParentTest, "no_jira");
            if (!FAIL) {
                Element_Child_List_L1("Date Items count", e1, "xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Date Items", L1.get(i), ParentTest, "no_jira");
                }
            }
            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            if (t.equalsIgnoreCase("arrow_right")) {
                Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
            }

            List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int i = 0; i < L0.size(); i++) {
                Element_Child_Text("Metrics Subheader Title", L0.get(i), "xpath", ".//p[contains(@class, 'MuiTypography-body1')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
                Element_Child_List_L1(t + " > Metrics count", L0.get(i), "xpath", ".//span[contains(@class, 'MuiTypography-displayBlock')]", ParentTest, "no_jira");
                    if (FAIL) { return; }

                for (int j = 0; j < L1.size(); j++) {
                    Element_Text("Metrics " + j + " name", L1.get(j), ParentTest, "no_jira");
                }
            }
            List_L0("All Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int j = 0; j < L0.size(); j++) {
                if (j < 8) {
                    Element_Click("Select Metrics " + (j + 1), L0.get(j), ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_By_Path_Text("Selected Metrics count label", "xpath", ".//div[contains(@class, 'MuiAccordionSummary-content')]", ParentTest, "no_jira");
                        if (FAIL) { return; }

                    Thread.sleep(500);
                    Wait_For_All_Elements_InVisibility("Wait for Selected Metric " + (j + 1) + " load...", "xpath", "//div[@role='progressbar']", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Thread.sleep(500);
                    List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    Element_Child_List_L2("Loaded Metric Card '-body1' Count", L1.get(L1.size() - 1), "xpath", ".//p[contains(@class,'-body1')]", ParentTest, "no_jira");
                        if (FAIL) { return; }
                    if (L2.size() > 0) {
                        Element_Text("Loaded Metric Card name", L2.get(0), ParentTest, "no_jira");
                        if (L2.size() > 1) {
                            Element_Text("Loaded Metric Card Value 1", L2.get(1), ParentTest, "no_jira");
                            if (L2.size() > 2) {
                                Element_Text("Loaded Metric Card Value 2", L2.get(2), ParentTest, "no_jira");
                            }
                        }
                    }
                } else {
                    Element_Child_Attribute("Metrics " + (j + 1) + " checkbox disabled", L0.get(j), "tagName", "span", "aria-disabled", ParentTest, "no_jira");
                        if (FAIL) { return; }
                }
            }

            Refresh("Refresh Curent page", ParentTest, "no_jira");
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
            Page_URL("Foodbuy Login page URL", ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            if (t.equalsIgnoreCase("arrow_right")) {
                Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            for (int i = 0; i < L0.size(); i++) {
                Element_Child_Text("Metric " + (i + 1) + " Subheader Title", L0.get(i), "xpath", ".//p[contains(@class, 'MuiTypography-body1')]", ParentTest, "no_jira");
            }
            Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                if (FAIL) { return; }

            List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");
                if (FAIL) { return; }
        }
        catch (Exception ex) {
            // =============================================  
        }   
    }

    public void SelectMember() {
        try {
            Text_Found("Check member is Displayed ", "My Members", ParentTest, "no_jira");
            if (t.equalsIgnoreCase("Not Found")) {
                return;
            }
            List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
                if (FAIL) { return; }

            if (L2 == null || L2.size() == 0) {
                List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            List<String> Memberlist = new ArrayList<>();

//        for (int j = 0; j < L2.size(); j++) {
//            Element_Text("Members", L2.get(j), ParentTest, "no_jira");
//            System.out.println(L2.get(j).getText());
//            Memberlist.add(L2.get(j).getText());
//        }
            Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return; }
            Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(500);
        } catch (Exception ex) {
            // ==============
        }
    }
}
