package WO;

import java.util.Date;

class WO_logout extends WO_GUI {
    protected WO_logout(WO_GUI a) {
        url = a.url;
        d1 = a.d1;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(){   
    try{
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}        
        Element_By_Selector_Click("Click 'Logout'", "id", "nav-log-out-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}    
        Thread.sleep(500);    
        Find_Text("Verify 'Login' page present after logout", "Log in", true, ParentTest, "no_jira"); // button id qa-nav-log-in-btn
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