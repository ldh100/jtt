package DL;


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
    protected void run() throws InterruptedException, Exception { 
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        Find_Text("Find 'Insights' label", "Insights", true, ParentTest, "no_jira");
        Move_to_Element_By_Path("User is able to find 'Insights' label", "xpath", "//p[contains(text(),'Insights')]", ParentTest, "no_jira");
        List_L0("Get Insights tab Count", "xpath", "//span[contains(@class, 'MuiTab-wrapper')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
    }  
}
