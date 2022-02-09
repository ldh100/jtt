package WO;

class WO_order_status extends WO_GUI {
    protected WO_order_status(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(){   
    try{
         // the is no 'Pending Orders' Button" >>> ============= in development or Bug?
        Element_E1_Find("Find Toolbar", "xpath", "//div[@class='v-toolbar__content']", ParentTest, "no_jira");
            if (FAIL) { return;}           
        Element_Child_Click("Click 'Pending Orders' Button", e1,"xpath", ".//i[@class='v-icon notranslate mdi mdi-text-box-check-outline theme--light']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}   
        Element_E1_Find("Find 'order-status-dialog'", "xpath", "//div[@class='v-dialog order-status-dialog v-dialog--active']", ParentTest, "no_jira");                                     
            if (FAIL) { return;} 
        //_t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Order Status message", e1, "xpath", ".//h2[@class='text-center']", "no_jira");                                     
        Element_Child_Text("Order Status message", e1, "tagName", "h2", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        if(t.contains("no orders")){
            //
        }else{
            //
        }  
        Click_out_of_Element("Leave 'order-status-dialog'", e1, "Top", 4, 4, ParentTest, "no_jira");                                     
            if (FAIL) { return;}
    } catch (Exception ex){}
    }  
}
