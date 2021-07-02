package DL;
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
        Thread.sleep(3000);

        List_L0("Get the tabs Count", "xpath", "//span[contains(@class, 'MuiTab-wrapper')]", ParentTest, "no_jira");
        for (int j = 0; j < L0.size(); j++) {
            Element_Text("Tabs name", L0.get(j), ParentTest, "no_jira");
        }
        Element_By_Path_Click("Click on 'Drilldown' tab'", "xpath", "(//button[contains(@class, 'MuiButtonBase-root MuiTab-root')])[2]", ParentTest, "no_jira");
        List_L0("Get the drilldown tabs Count", "xpath", "((//div[contains(@class, 'MuiTabs-root')])[2])//button", ParentTest, "no_jira");
        for (int j = 0; j < L0.size(); j++) {
            Element_Text("Tabs name", L0.get(j), ParentTest, "no_jira");
            Thread.sleep(5000);
        }
        List_L2("Sections in tab1", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
            Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
        }
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        Element_By_Path_Click("Select the Categories/Items", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[4]", ParentTest, "no_jira");
        Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
        Element_By_Path_Click("Click on 'Manufacturer' tab'", "xpath", "//span[contains(text(),'Manufacturer')]", ParentTest, "no_jira");
        List_L2("Section in tab3", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
            Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
        }
        Thread.sleep(3000);

        Element_By_Path_Click("Select the Manufacturer", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[2]", ParentTest, "no_jira");
        Thread.sleep(2000);
        Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
        Element_By_Path_Click("Click on 'Distributors' tab'", "xpath", "//span[contains(text(),'Distributors')]", ParentTest, "no_jira");
        List_L2("Section in tab4", "xpath", "(//div[contains(@class,'MuiGrid-root jss')])[7]//button", ParentTest, "no_jira");
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Section name", L2.get(i), ParentTest, "no_jira");
            Element_Click("Select the Section", L2.get(i), ParentTest, "no_jira");
        }
        Thread.sleep(2000);
        Element_By_Path_Click("Select the Distributor", "xpath", "(//button[contains(@class,'MuiTypography-root MuiLink-root MuiLink-underlineNone')])[3]", ParentTest, "no_jira");
        Thread.sleep(2000);
        Element_By_Path_Click("Click on 'Export to CSV' button", "xpath", "(//span[contains(text(),'Export CSV')])/..", ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    }
}
