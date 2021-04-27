/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mob_Android;
/**
 *
 * @author Oleg.Spozito
 */
class An_bolter_profile extends An_GUI{
    protected An_bolter_profile(An_GUI a) {
       Bolter_ID = a.Bolter_ID;
       Bolter_PW = a.Bolter_PW;
       ad = a.ad;
       loadTimeout = a.loadTimeout;
       LoadTimeOut = a.LoadTimeOut;
       ParentTest = a.ParentTest;
    }

    protected void Run() throws InterruptedException, Exception{                
        //<editor-fold defaultstate="collapsed" desc="Profile">
        EX += "\r\n" + " - " + "\t" + " === Profile ====" + "\t" + "==== " + "\t" + " == Begin > ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        Element_E1_Find("Find 'nav_profile' element", "id", "nav_profile", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_Text("Get 'nav_profile' text", ae1, "id", "design_menu_item_text", ParentTest, "no_jira");
        Element_Click("Open Profile", ae1, ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text("Get Profile 'User Name'", "id", "user_contact_detail_name", ParentTest, "no_jira");    
        Element_By_Path_Text("Get Profile 'Email Address'", "id", "textInputEditText_email_address", ParentTest, "no_jira");
        Element_By_Path_Text("Get Profile 'Phone Number'", "id", "textInputEditText_phone_number", ParentTest, "no_jira");        
        Element_By_Path_Text("Get 'Assigned Location' - Site", "id", "txtAssignedPickupLocations", ParentTest, "no_jira");  
        Element_By_Path_Text("Get 'Assigned Location' - Description", "id", "txtAssignedPickupLocationsDesc", ParentTest, "no_jira");  
        Swipe_From_Screen_Center("Swipe up to see brands", "UP", 100, ParentTest, "no_jira");
        List_L0("Visible Brand(s) Count", "id", "txtBrandName", ParentTest, "no_jira");
        List_L1("Delivery Hours Count", "id", "txtDeliveryHours", ParentTest, "no_jira");
            for (int i = 0; i < aL1.size(); i++) {
                Element_Text("Brand Name (index " + i + ")", aL0.get(i),  ParentTest, "no_jira");         
                Element_Text("Brand Delivery Hours (index " + i + ")", aL1.get(i),  ParentTest, "no_jira");         
            }   
        Go_Back_Key("Back from Profile", ParentTest, "no_jira");
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Wait for load", "id", "progress_bar", ParentTest, "no_jira");
            if (FAIL) { return;}   
        EX += " - " + "\t" + " === Profile ====" + "\t" + "==== " + "\t" + " == End ^ ==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        //</editor-fold>
    }
}
