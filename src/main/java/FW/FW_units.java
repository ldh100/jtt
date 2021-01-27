/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.T;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_units {
    public static void run() throws InterruptedException { 
     Thread.sleep(500);
    _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
    Thread.sleep(500);
    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click on Units", "xpath", "//a[@href='/units/']", "no_jira"); 
            if (FAIL) { return;} 
    Thread.sleep(2000);
     _t++; T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
      
      _t++; T.Visible_Element_By_Path_Text_Enter("Enter the Unit in the search  bar", "xpath", "//*/div[2]/input", FW.UNIT, false, "no_jira");
      if (FAIL) { return;}
     
      Thread.sleep(8000);
     
      _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select the Unit", "xpath", " //*/tr/td[2]/div", "no_jira");
      if (FAIL) { return;}
    
      Thread.sleep(12000);
     
      _t++; Thread.sleep((long) sleep); T.Find_Text("Find '"+FW.UNIT+"' Unit", FW.UNIT, false,"no_jira");
    }  
}
