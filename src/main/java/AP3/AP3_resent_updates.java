package AP3;

import java.util.Date;

class AP3_resent_updates extends AP3_GUI{
    protected AP3_resent_updates(AP3_GUI a) {
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    } 
    protected void run() {   
    try {    
        Element_By_Path_Click("Recent Updates Icon Click", "xpath", "//button[contains(@class, 'bell-button')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for load...", "css", "[role='progressbar']", ParentTest, "no_jira"); 
        Thread.sleep(500); // without that next > not executed            
        List_L0("Resent Updates List Count", "xpath", "//div[contains(@class, 'flex card-text-box')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Notification " + i + " Text", L0.get(i), ParentTest,  "no_jira");             
            } 
        //Click_out_of_Element_By_Path("Resent Updates Close", "xpath", "//span[contains(text(), 'Recent Updates')]", "Left", -40, 10,  ParentTest, "no_jira");             
        //Click_out_of_Element_By_Path("Recent Updates Close > Click left of 'flex header-box;", "xpath", "//div[@class='flex header-box']", "Left", -420, 0,  ParentTest, "no_jira");             
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    } 
    } 
}
