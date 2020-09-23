/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
/**
 *
 * @author Oleg.Spozito
 */
public class __resent_updates {
    public static void run() throws InterruptedException { 
//        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
//            if (FAIL) { return;} 
//        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
//         

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Resent Updates Icon Click", "xpath", "//button[contains(@class, 'bell-button ')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "css", "[role='progressbar']", "no_jira"); 
        //Thread.sleep(500); // without that next > not executed"
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Resent Updates List Count", "xpath", "//div[contains(@class, 'flex card-text-box')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Notification Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            }
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("New Notification Count", "xpath", "//span[contains(@class, 'count')]", "no_jira"); 
//            if (!t.equals("empty")) { 
//                _t++; T.List_Item_Click("Click 'Mark as Read'", L0, "L0", 0, "no_jira");             
//                if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Count after 'Mark as Read'", "xpath", "//span[contains(@class, 'count')]", "no_jira"); 
//                //if (FAIL) { return;}         
//            }
        _t++; Thread.sleep((long) sleep); T.Click_out_of_Visible_Element("Resent Updates Close", "xpath", "//span[contains(text(), 'Recent Updates')]", "Left", -40, 10, "no_jira");             
    }
}
