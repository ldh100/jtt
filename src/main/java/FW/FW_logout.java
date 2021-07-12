/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.TWeb;
import static A.A.*;
import static WO.WO_GUI.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_logout {
    public static void run() throws InterruptedException {   
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Log out'", "Log out", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on Log out", "xpath","//*[@class='Caption-bold']", "no_jira");
         
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Sign into FOODWORKS Portal", "xpath", "//h3[contains(text(),'Sign into FOODWORKS Portal')]", "no_jira");
   
        
    }
}