package WO;

import java.util.Date;

class WO_order_history extends WO_GUI {
    protected WO_order_history(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(){   
    try{
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}       
        Element_By_Selector_Click("Click 'My Orders'", "id", "to-order-history", ParentTest, "no_jira");
          if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}   

        List_L0("Get Order History tabs > default 'Active Orders", "css", "[role='tab']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L1("Get 'Active orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
        // Last order details  > Delivery time: 2:40 p.m.

        Element_Click("Click 'Past orders' tab", L0.get(1), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;} 
        Thread.sleep(500);
        List_L1("Get 'Past orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}           
  
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }  
}
