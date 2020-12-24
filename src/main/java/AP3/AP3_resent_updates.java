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
public class AP3_resent_updates {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Resent Updates Icon Click", "xpath", "//button[contains(@class, 'bell-button ')]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for load...", "css", "[role='progressbar']", "no_jira"); 
        Thread.sleep(500); // without that next > not executed"
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Resent Updates List Count", "xpath", "//div[contains(@class, 'flex card-text-box')]", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Notification Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.Click_out_of_Visible_Element("Resent Updates Close", "xpath", "//span[contains(text(), 'Recent Updates')]", "Left", -40, 10, "no_jira");             
    }
}
