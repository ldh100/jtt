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
public class __notifications {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Ap3 Notification' Click", "xpath", "//*[contains(text(), 'Notification')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
//            
//        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to 'Orders'", url + "/#/orders","no_jira");             
//            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Page_URL("Orders page URL", "no_jira"); 
            if (FAIL) { return;}          
    }  
}
