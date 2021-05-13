package Mob_Android;



/**
 *
 * @author Oleg.Spozito
 */
class Chrome_WO extends An_GUI{
    protected Chrome_WO(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       app_url = a.app_url;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{   
        Go_To_URL("Go to " + app_url, app_url, ParentTest, "no_lira");
            if (FAIL) { return;} 
        Get_Current_URL("Get_Current_URL", ParentTest, "no_lira");
        Find_Text("Find 'WebView' text", "Download the ", true, ParentTest,"no_lira");
//        input[contains(@id,’search-keywords’)]
//        Element_By_Path_Text("Find 'WebView' text", "xpath", "//*[@class='android.webkit.WebView']", ParentTest,"no_lira");
//        Element_By_Path_Text("Find 'Download' message text", "xpath", "//*[@class='android.webkit.WebView'][1]", ParentTest,"no_lira");
        Thread.sleep(2000);
//        Find_Text("Find 'Add ... to Home Screen' prompt", "to Home screen", true, ParentTest,"no_lira");
//        Element_By_Path_Click("Close 'Add ... to Home Screen'", "id", "com.android.chrome:id/infobar_close_button", ParentTest, SITE);
//        Element_By_Path_Text("Find 'Support' spinner", "Support", true, ParentTest,"no_lira");
//        Element_By_Path_Click("Click 'Download'", "xpath", "@class='android.widget.Button'", ParentTest, SITE);
//        Element_By_Path_Text("Find 'Google Play' text", "Google Play", true, ParentTest,"no_lira");
//        Element_By_Path_Text("Find Title text", "Google Play", true, ParentTest,"no_lira");
//        Element_By_Path_Text("Find 'Open in Store' text", "OPEN IN PLAY STORE APP", true, ParentTest,"no_lira");
//        Element_By_Path_Text("Find 'Install' button", "Install", true, ParentTest,"no_lira");
        Thread.sleep(500);
    }
}

