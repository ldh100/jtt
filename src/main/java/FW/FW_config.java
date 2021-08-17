/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import A.TWeb;
import static A.A.*;

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
       
        //Read the table
       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Add'", "xpath", "//div[contains(@class,'add-button')]/button", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Add sector 'abc sector'", "xpath", "//input[@type='text']", "abc Sector", FAIL, "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Add'", "xpath", "//div[contains(@class,'footer-button')]/button[2]", "no_jira");
        Thread.sleep(1000);
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Sector List", "xpath", "//div[@class='config-item']/span[1]", "no_jira");
        if(FAIL){return;}
        for (int i = 0; i<L1.size(); i++)
        {
              _t++; TWeb.Element_Attribute("Read sector list("+ i +")Text", L1.get(i), "textContent", "no_jira");
              //Thread.sleep(300);
              if(t.contains("abc Sector"))
              {
                  
                  System.out.println("Found the sector");
                  
                  // <editor-fold defaultstate="collapsed" desc="Delete Sector ">  
                  TWeb.Element_Click("Click on the sector ", L1.get(i), "no_jira");
                  
                  TWeb.Element_By_Path_Click("Click on the ...", "xpath", "//div[@class='config-item']/span[2]", "no_jira");
               
                  TWeb.Element_By_Path_Click("Click on the Delete ", "xpath", "//span[@class='dropdown']/div/div/div[2]", "no_jira");
                
                  TWeb.Element_By_Path_Click("Delete sector pop up'", "xpath", "//div[@class='config-delete-button']/button[2]", "no_jira");
               //   Thread.sleep(300);
                  
                  // </editor-fold> 
                  
                
              }
              //if(FAIL){return;}
        }
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[1] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
        Thread.sleep(1000);
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc=" Market ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Market 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[2] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Market== 'Add'", "xpath", "//div[contains(@class,'add-button')]/button", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Add Market 'abc market'", "xpath", "//input[@type='text']", "abc market", FAIL, "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Sector 'Add'", "xpath", "//div[contains(@class,'footer-button')]/button[2]", "no_jira");
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Market List", "xpath", "//div[@class='config-item']/span[1]", "no_jira");
        
        for (int j=0; j<L0.size(); j++)
        {
            TWeb.Element_Attribute("Market List ("+ j+ ") text", L0.get(j), "textContent", "no_jira");
            if (t.contains("abc market")){
                System.out.println("Found the Market");
                 TWeb.Element_Click("Click on the sector ", L0.get(j), "no_jira");
                  
                   TWeb.Element_By_Path_Click("Click on the ...", "xpath", "//div[@class='config-item']/span[2]", "no_jira");
                   TWeb.Element_By_Path_Click("Click on the Delete ", "xpath", "//span[@class='dropdown']/div/div/div[2]", "no_jira");
                   TWeb.Element_By_Path_Click("Delete market pop up'", "xpath", "//div[@class='config-delete-button']/button[2]", "no_jira");
                  //_t++; Thread.sleep((long) sleep); 
                  Thread.sleep(300);
        
            }
         
        }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Market 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[2] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
           Thread.sleep(300);
        
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Cusines ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[3] //button[contains(@class, 'text-button')]", "no_jira");
        
        //Read the table
       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Add'", "xpath", "//div[contains(@class,'add-button')]/button", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Add Cuisines 'abc Cuisines'", "xpath", "//input[@type='text']", "abc Cuisines", FAIL, "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Add'", "xpath", "//div[contains(@class,'footer-button')]/button[2]", "no_jira");
        Thread.sleep(1000);
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Cuisines List", "xpath", "//div[@class='config-item']/span[1]", "no_jira");
        if(FAIL){return;}
        for (int i = 0; i<L1.size(); i++)
        {
              _t++; TWeb.Element_Attribute("Read Cuisines list("+ i +")Text", L1.get(i), "textContent", "no_jira");
             // Thread.sleep(300);
              if(t.contains("abc Cuisines"))
              {
                  
                  System.out.println("Found the Cuisines");
                  
                  // <editor-fold defaultstate="collapsed" desc="Delete Cuisines ">  
                  _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click on the Cuisines ", L1.get(i), "no_jira");
                  
                  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the ...", "xpath", "//div[@class='config-item']/span[2]", "no_jira");
               
                  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Delete ", "xpath", "//span[@class='dropdown']/div/div/div[2]", "no_jira");
                 // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Delete ", "xpath", "//span[@class='dropdown']/div/div/div[2]", "no_jira");
                  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete sector pop up'", "xpath", "//div[@class='config-delete-button']/button[2]", "no_jira");
                  Thread.sleep(300);
                  
                  // </editor-fold> 
                  
                  // <editor-fold defaultstate="collapsed" desc="Edit Cuisines ">  
                   //  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Edit button ", "xpath", "//span[@class='dropdown']/div/div/div[1]", "no_jira");
                 // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear text box", "xpath", "//div[contains(@class,'addfield')] //input[@type='text']", "no_jira");
                  
                 // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Edit Sector config", "xpath", "//div[contains(@class,'addfield')] //input[@type='text']", "Abc Sector", FAIL, "no_jira");
                //_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Add button ", "xpath", "//div[@class='footer-button']/button[2]", "no_jira");
                //    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the ...", "xpath", "//div[@class='config-item']/span[2]", "no_jira");
                  
                // </editor-fold> 
              }
              //if(FAIL){return;}
        }
        Thread.sleep(800);
        
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Cuisines 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[3] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Active Events ">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Active Events 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[4] //button[contains(@class, 'text-button')]", "no_jira");
        
      //  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Active Events 'Edit'", "xpath", "//div[@class='col-md-10 col-12']/div[1] //button[contains(@class, 'text-button')]", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Active Events dropd down", "xpath", "//div[@role='button']", "no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("pick a day", "xpath", "//div[@role='listbox']/div[2]", "no_jira");
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Active Events 'Done'", "xpath", "//div[@class='col-md-10 col-12']/div[4] //div[@class='done-button col-md-12 col-12']/button", "no_jira");
    
        // </editor-fold> 
        
        
        
        
        // <editor-fold defaultstate="collapsed" desc="Edit Sector ">  
                   //  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Edit button ", "xpath", "//span[@class='dropdown']/div/div/div[1]", "no_jira");
                 // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear text box", "xpath", "//div[contains(@class,'addfield')] //input[@type='text']", "no_jira");
                  
                 // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Edit Sector config", "xpath", "//div[contains(@class,'addfield')] //input[@type='text']", "Abc Sector", FAIL, "no_jira");
                //_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Add button ", "xpath", "//div[@class='footer-button']/button[2]", "no_jira");
                //    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the ...", "xpath", "//div[@class='config-item']/span[2]", "no_jira");
                  
                // </editor-fold> 
    }  
}
