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
public class __logout {
    public static void run() throws InterruptedException {   
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("User Click", "xpath", "//button[@type='button'][2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Logout Click", "xpath", "//*[contains(text(), 'Logout')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Welcome... Text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Welcome to...", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Forgot Password Text", "Forgot Password", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("AP3 Welcome page URL", "no_jira");          
    }
}