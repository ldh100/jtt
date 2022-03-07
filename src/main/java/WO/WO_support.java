package WO;

import java.util.Date;

class WO_support extends WO_GUI {
    protected WO_support(WO_GUI a) {
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
        Element_By_Selector_Click("Click 'Support Desk'", "id", "to-support-desk", ParentTest, "no_jira");
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
