/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import A.T;
import static A.A.*;
import static FW.FW.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_units {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click Drawer menu 'Units'", "xpath", "//a[@href='/units/']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; T.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);            
        _t++; T.Element_By_Path_Text_Enter("Enter '" + UNIT + "' in Search", "xpath", "//input[@placeholder='Search']", UNIT, false, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress-circular')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.List_L0("Units(s) Data row Count", "tagName", "tr", "no_jira");                                     
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Unit Data Row Text", L0.get(i), "no_jira"); 
                if(t.contains(UNIT) && t.contains(UnitMarket)){
                    T_Index = i;
                } 
            }
        if(T_Index == -1) {
           _t++; _f++;
           EX += " - " + "\t" + "Find Unit" + "\t" + UNIT + "/" + UnitMarket + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
           return;
        }             
        _t++; Thread.sleep((long) sleep); T.Element_Click("Click target Unit/Market", L0.get(T_Index), "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[@role='progressbar']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find '" + UNIT + "' Title Name", UNIT, true,"no_jira");
    }  
}
