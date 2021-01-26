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
public class FW_restaurants {
    public static void run() throws InterruptedException { 
    _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
    Thread.sleep(500);
/*
       _t++; Thread.sleep((long) sleep); T.List_L0("Drawer Menu Count", "xpath", "//div[@class='menu-name']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Drawer Menu (" + i + ") Text", L0.get(i), "textContent", "no_jira");   
                if (FAIL) { return;}
                _t++; T.Element_Click("Click Element (" + i + ") Text", L0.get(i), "no_jira");   
                if (FAIL) { return;}
*/
     _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click on Restaurants", "xpath", "//a[@href='/partners/']", "no_jira"); 
            if (FAIL) { return;}
     Thread.sleep(2000);
     _t++; T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
      
      _t++; T.Visible_Element_By_Path_Text_Enter("Enter the Restaurant in the search  bar", "xpath", "//*[@id='input-94']", FW.Restaurants, false, "no_jira");
      if (FAIL) { return;}
     
      Thread.sleep(8000);
     
      _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select the Restaurant", "xpath", " //div[@class='partner-name']", "no_jira");
      if (FAIL) { return;}
    
      Thread.sleep(12000);
     
      _t++; Thread.sleep((long) sleep); T.Find_Text("Find '"+FW.Restaurants+"' Restaurant", FW.Restaurants, true,"no_jira");

}  

    
        
    }  
