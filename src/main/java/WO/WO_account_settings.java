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
public class WO_account_settings {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Account Settings']", "no_jira");                                     
            if (FAIL) { return;}  
        Thread.sleep((long) sleep);
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", "no_jira");
            if (FAIL) { return;}   
          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Payment tab  text", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
          if (FAIL) { return;} 
          Thread.sleep(5000);        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Detect First row of list ", "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");
         
        int n=1;
        while(t.toLowerCase().contains("card ending"))
                {
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click First row of list "+ n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");               
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("delete first row  "+ n, "xpath", "//span[text()=' Delete ']" , "no_jira");
                Thread.sleep(1000);
                //System.out.println ("delete line  " + n);
                 if (FAIL) { return;} 
                n++;
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'My Account' Tab", "xpath", "//a[@href='/account-settings/my-account']", "no_jira");
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                if (FAIL) { return;} 
                Thread.sleep(5000);
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Detect First row of list " + n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");
                }
          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira"); 
          if (FAIL) { return;}  
          
        
                     
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}       
    }  
}
