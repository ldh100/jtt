/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_order_status {
    public static void run() throws InterruptedException { 
         // the is no 'Pending Orders' Button" >>> ============= in development or Bug?
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Pending Orders' Button", e1,"xpath", ".//i[@class='v-icon notranslate mdi mdi-text-box-check-outline theme--light']", "no_jira");                                     
            if (FAIL) { return;}  
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'order-status-dialog'", "xpath", "//div[@class='v-dialog order-status-dialog v-dialog--active']", "no_jira");                                     
            if (FAIL) { return;} 
        //_t++; Thread.sleep((long) sleep); T.Element_Child_Text("Order Status message", e1, "xpath", ".//h2[@class='text-center']", "no_jira");                                     
        _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Order Status message", e1, "tagName", "h2", "no_jira"); 
            if (FAIL) { return;} 
        if(t.contains("no orders")){
            //
        }else{
            //
        }  
        _t++; Thread.sleep((long) sleep); T.Click_out_of_Element("Leave 'order-status-dialog'", e1, "Top", 4, 4, "no_jira");                                     
            if (FAIL) { return;}
    }  
}
