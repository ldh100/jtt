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
public class WO_logout {
    public static void run() throws InterruptedException {   
         // the is no LouOut >>> ============= in development or Bug?
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Logout'", "xpath", ".//*[text()='Logout']", "no_jira");                                     
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Login' after logout", "Login", true, "no_jira");
            if (FAIL) { return;}  
    }
}