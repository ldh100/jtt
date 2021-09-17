package DL;

import java.util.ArrayList;
import java.util.List;

class DL_drilldown extends DL_GUI {

    protected DL_drilldown(DL_GUI a) {
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
            Thread.sleep(5000);
            SelectMember();
            List_L0("Get the tabs Count", "xpath", "//span[contains(@class, 'MuiTab-wrapper')]", ParentTest, "no_jira");
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Tabs name", L0.get(j), ParentTest, "no_jira");
            }
            Thread.sleep(2000);
            Element_By_Path_Click("Click on 'Drilldown' tab'", "xpath", "(//button[contains(@class, 'MuiButtonBase-root MuiTab-root')])[2]", ParentTest, "no_jira");
            List_L0("Get the drilldown tabs Count", "xpath", "((//div[contains(@class, 'MuiTabs-root')])[2])//button", ParentTest, "no_jira");
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Tabs name", L0.get(j), ParentTest, "no_jira");
                Thread.sleep(2000);
            }
            List_L2("Sections in tab1", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
                Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
            }
            Thread.sleep(20000);
            Element_By_Path_Click("Click on the Sector (Org level 1)", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[1]", ParentTest, "no_jira");
            Element_By_Path_Click("Select the Customer/Locations", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[6]", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Categories/Items' tab'", "xpath", "//span[contains(text(),'Categories/Items')]", ParentTest, "no_jira");
            List_L2("Sections in tab2", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
                Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
            }
            Thread.sleep(2000);
            Element_By_Path_Click("Click on the Category", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[1]", ParentTest, "no_jira");
            Thread.sleep(25000);
            Element_By_Path_Click("Select the Categories/Items", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[4]", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Manufacturer' tab'", "xpath", "//span[contains(text(),'Manufacturer')]", ParentTest, "no_jira");
            List_L2("Section in tab3", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
                Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
            }
            Thread.sleep(5000);

            Element_By_Path_Click("Select the Manufacturer", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[2]", ParentTest, "no_jira");
            Thread.sleep(20000);
            Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
            Element_By_Path_Click("Click on 'Distributors' tab'", "xpath", "//span[contains(text(),'Distributors')]", ParentTest, "no_jira");
            List_L2("Section in tab4", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
                Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
            }
            Thread.sleep(1000);
            Element_By_Path_Click("Select the Distributor", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[3]", ParentTest, "no_jira");
            Thread.sleep(20000);
            Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
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
