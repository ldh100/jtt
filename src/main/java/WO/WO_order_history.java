/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_order_history {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Order History']", "no_jira");                                     
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", "no_jira");
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}    
    }  
}
