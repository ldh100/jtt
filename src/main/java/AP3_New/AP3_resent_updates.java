package AP3_New;

class AP3_resent_updates extends AP3_GUI{
    protected AP3_resent_updates(AP3_GUI a) throws Exception{ // InterruptedException, 
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    } 
    protected void run() throws Exception  {   
        Element_By_Path_Click("Resent Updates Icon Click", "xpath", "//button[contains(@class, 'bell-button')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for load...", "css", "[role='progressbar']", ParentTest, "no_jira"); 
        Thread.sleep(500); // without that next > not executed"            
        List_L0("Resent Updates List Count", "xpath", "//div[contains(@class, 'flex card-text-box')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Notification Text", L0.get(i), ParentTest,  "no_jira");             
                if (FAIL) { return;}
            }
        Click_out_of_Element_By_Path("Resent Updates Close", "xpath", "//span[contains(text(), 'Recent Updates')]", "Left", -40, 10,  ParentTest, "no_jira");             
    }
}