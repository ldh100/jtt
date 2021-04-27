/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_config {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Configuration'", "Configuration", true,"no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'configuration'", "xpath",  "//a[@href='/configuration']", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Move_out_of_Element_By_Path("Close the Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 0, 5, "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("FW manager's  Dashboard 'Configuration'", "Configuration", true,"no_jira");
        
        // <editor-fold defaultstate="collapsed" desc=" Sector ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[1] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Add'", "xpath", "//div[contains(@class,'add-button')]/button", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Add'", "xpath", "//div[contains(@class,'footer-button')]/button[2]", "no_jira");

        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[1] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
        
        // </editor-fold> 
        
        
        
        // <editor-fold defaultstate="collapsed" desc=" Market ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Market 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[2] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Market 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[2] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Cusines ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[3] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[3] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Active Events ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Active Events 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[4] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Active Events 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[4] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
    
        // </editor-fold> 
    }  
}
