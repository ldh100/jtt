/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
/**
 *
 * @author Oleg.Spozito
 */
class An_bolter_history extends An_GUI{
    protected An_bolter_history(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{                
        //<editor-fold defaultstate="collapsed" desc="History">
        EX += "\r\n" + " - " + "\t" + " === History ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Wait_For_Element_By_Path_Presence("Wait for 'Navigation' button", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click 'Open Navigation drawer' image", "xpath", "//android.widget.ImageButton[@content-desc='Open navigation drawer']", ParentTest, "no_jira");
        Element_E1_Find("Find 'nav_history' element", "id", "nav_history", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_history' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open History", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get Hitory 'Title'", "id", "txtTitle", ParentTest, "no_jira");    
        Element_By_Path_Text("Get Hitory 'Sub-Title'", "id", "txtSubTitle", ParentTest, "no_jira");            
        Element_By_Path_Text("Get 'Reload' button Text", "id", "emptyViewReloadBtn", ParentTest, "no_jira");            
        List_L0("Check 'Empty View' Image", "id", "emptyViewImg", ParentTest, "no_jira");
        if(!aL0.isEmpty()){
            Element_By_Path_Text("Get 'Empty Title'", "id", "emptyViewTitle", ParentTest, "no_jira");            
            Element_By_Path_Text("Get 'Empty Message'", "id", "emptyViewMsg", ParentTest, "no_jira");              
        }else{
            //
        }  
        EX += " - " + "\t" + " === History ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //</editor-fold>
    }
}
