package WO;

class WO_order_history extends WO_GUI {
    protected WO_order_history(WO_GUI a) {
        url = a.url;
        d1 = a.d1;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(){   
    try{
        Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", ParentTest, "no_jira");
            if (FAIL) { return;}           
        Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", ParentTest, "no_jira");                                     
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Order History']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}   
        Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", ParentTest, "no_jira");
            if (FAIL) { return;}              
        Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", ParentTest, "no_jira");
            if (FAIL) { return;}    
    } catch (Exception ex){}
    }  
}
