/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_promo {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Promo Management' Click", "xpath", "//*[contains(text(), 'Promo Management')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("Sites page URL", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
            if (FAIL) { return;}   
//        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for data...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}          
    } 
}
