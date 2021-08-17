package Mob_Android;

class An_bolter_support extends An_GUI{
    protected An_bolter_support(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{         
        //<editor-fold defaultstate="collapsed" desc="Support">
        EX += "\r\n" + " - " + "\t" + " === Support ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";        
//        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
//            if (FAIL) { return;}        
//        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");        
        Element_E1_Find("Find 'nav_support' element", "id", "nav_support", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_support' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open Support", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Go_Back_Key("Back from Support", ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}    
        EX += " - " + "\t" + " === Support ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";                   
        //</editor-fold>
    }
}
