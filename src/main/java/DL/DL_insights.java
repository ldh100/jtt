package DL;

import java.util.ArrayList;
import java.util.List;

public class DL_insights extends DL_GUI {

    protected DL_insights(DL_GUI a) {
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
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            SelectMember();
            Find_Text("Find 'Insights' label", "Insights", true, ParentTest, "no_jira");
            Move_to_Element_By_Path("User is able to find 'Insights' label", "xpath", "//p[contains(text(),'Insights')]", ParentTest, "no_jira");
            List_L0("Get the tabs Count", "xpath", "//span[contains(@class, 'MuiTab-wrapper')]", ParentTest, "no_jira");
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Tabs name", L0.get(j), ParentTest, "no_jira");
            }
            Element_By_Path_Click("Click on 'Settings' icon", "xpath", "//button[@class='MuiButtonBase-root MuiIconButton-root']", ParentTest, "no_jira");
            Thread.sleep(4000);
            Element_By_Path_Click("Click on 'Cancel' button", "xpath", "//span[contains(text(),'Cancel')]/..", ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for Show More Chevron", "xpath", "//*[contains(text(),'Show ')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Click on 'Show More' Chevron", "xpath", "//*[contains(text(),'Show ')]", ParentTest, "no_jira");
            Element_E1_Find("Verify whether the Graph is displayed or not", "xpath", "(//*[@class='MuiCollapse-container MuiCollapse-entered'])[2]", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Show Less' Chevron", "xpath", "//*[contains(text(),'Show ')]", ParentTest, "no_jira");
            Element_E1_Find("Verify whether the Graph is displayed or not", "xpath", "//*[@class='MuiCollapse-container MuiCollapse-hidden']", ParentTest, "no_jira");
            e1.isEnabled();
            Element_E1_Find("Verify whether the Back button is disabled or not", "xpath", "//span[contains(text(),'Back')]/..", ParentTest, "no_jira");
            System.out.println(e1.isEnabled());
            //System.out.println();
            List_L2("Get the number of Insights Count", "xpath", "//div[contains(@class, 'MuiMobileStepper-dot')]", ParentTest, "no_jira");
            for (int j = 0; j < L2.size(); j++) {
                if (!L2.get(j).isEnabled()) {
                } else {
                    Element_By_Path_Click("Click on 'Next' button", "xpath", "//span[contains(text(),'Next')]/..", ParentTest, "no_jira");
                }

            }
            Element_By_Path_Click("Click on 'Not interested in this insight' link", "xpath", "//span[contains(text(),'Not interested in this insight')]/..", ParentTest, "no_jira");
            Element_E1_Find("Verify whether the Reasons for Insights prompt is displayed or not", "xpath", "(//div[@class='MuiCollapse-wrapperInner'])[3]", ParentTest, "no_jira");
            List_L2("Get the number of Reasons for Not interested in the insight ", "xpath", "//*[@class='MuiFormControlLabel-root']", ParentTest, "no_jira");
            for (int j = 0; j < L2.size(); j++) {
                Element_Click("Select the reasons for Not interested in the insight " + j, L2.get(j), ParentTest, "no_jira");
            }
            Element_E1_Find("Verify whether the Cancel button is disabled or not", "xpath", "//span[contains(text(),'Cancel')]/..", ParentTest, "no_jira");
            {
                System.out.println(e1.isEnabled());
            }
            Element_E1_Find("Verify whether the Submit button is disabled or not", "xpath", "//span[contains(text(),'Submit')]/..", ParentTest, "no_jira");
            {
                System.out.println(e1.isEnabled());

            }
            Element_By_Path_Click("Click on 'Cancel' button", "xpath", "//span[contains(text(),'Cancel')]/..", ParentTest, "no_jira");

            Wait_For_Element_By_Path_Presence("Wait for Insight", "xpath", "(//div[contains(@class, 'MuiGrid-root jss')]/div/button)[2]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Text("Get the status of Insight", "xpath", "(//div[contains(@class, 'MuiGrid-root jss')]/div/button)[2]", ParentTest, "no_jira");
            System.out.println(t);
            if (t.equalsIgnoreCase("Save")) {
                Thread.sleep(5000);
                Element_By_Path_Click("Click on 'Save' button", "xpath", "(//div[contains(@class, 'MuiGrid-root jss')]/div/button)[2]", ParentTest, "no_jira");
                Thread.sleep(5000);
                Element_By_Path_Text("Get the confirmation of Insight", "css", "[role='alert']", ParentTest, "no_jira");
                System.out.println(t);
            } else {
                Thread.sleep(5000);
                Element_By_Path_Click("Navigate to 'Saved Insights' tab", "xpath", "//span[contains(text(),'Saved Insights')]/..", ParentTest, "no_jira");
                Element_By_Path_Click("Click on 'Unsave' button", "xpath", "(//div[contains(@class, 'MuiGrid-root jss')]/div/button)[2]", ParentTest, "no_jira");
                Thread.sleep(5000);
                Element_By_Path_Text("Get the confirmation of Insight", "css", "[role='alert']", ParentTest, "no_jira");
                System.out.println(t);

            }
        }
        catch (Exception ex) {
        }
    }

    public void SelectMember() throws Exception {
        try {
            Text_Found("Check member is Displayed ", "My Members", ParentTest, "no_jira");
            if (t.equalsIgnoreCase("Not Found")) {
                return;
            }
            List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L2 == null || L2.size() == 0) {

                List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
            List<String> Memberlist = new ArrayList<>();

//        for (int j = 0; j < L2.size(); j++) {
//            Element_Text("Members", L2.get(j), ParentTest, "no_jira");
//            System.out.println(L2.get(j).getText());
//            Memberlist.add(L2.get(j).getText());
//        }
            Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
            Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(5000);
        }
        catch (Exception ex) {

        }
    }
}
