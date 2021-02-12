/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_resent_updates {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Resent Updates Icon Click", "xpath", "//button[contains(@class, 'bell-button ')]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for load...", "css", "[role='progressbar']", "no_jira"); 
        Thread.sleep(500); // without that next > not executed"            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Resent Updates List Count", "xpath", "//div[contains(@class, 'flex card-text-box')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Notification Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); TWeb.Click_out_of_Element_By_Path("Resent Updates Close", "xpath", "//span[contains(text(), 'Recent Updates')]", "Left", -40, 10, "no_jira");             
    }
}
