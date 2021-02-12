/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_notifications {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Ap3 Notification' Click", "xpath", "//*[contains(text(), 'Notification')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
//            
//        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to 'Orders'", url + "/#/orders","no_jira");             
//            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Orders page URL", "no_jira"); 
            if (FAIL) { return;}          
    }  
}
