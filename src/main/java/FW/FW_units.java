/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import A.A;
import A.TWeb;
import static A.A.*;
import static FW.FW.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_units {
    public static void run() throws InterruptedException {
        
        String unit = "xyUnit";
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Drawer menu 'Units'", "xpath", "//a[@href='/units/']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);            
        _t++; TWeb.Element_By_Path_Text_Enter("Enter '" + UNIT + "' in Search", "xpath", "//input[@placeholder='Search']", UNIT, false, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress-circular')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Units(s) Data row Count", "tagName", "tr", "no_jira");                                     
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Unit Data Row Text", L0.get(i), "no_jira"); 
                if(t.contains(UNIT) && t.contains(UnitMarket)){
                    T_Index = i;
                } 
            }
        if(T_Index == -1) {
           _t++; _f++;
           EX += " - " + "\t" + "Find Unit" + "\t" + UNIT + "/" + UnitMarket + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";            return;
        }             
        
    //************************************************** Add Unit Testcases ************************************** 
    // <editor-fold defaultstate="collapsed" desc="Add unit ">  
     Thread.sleep(500);
    _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
    	if (FAIL) { return;}
    	
    Thread.sleep(500);
    
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Units", "xpath", "//a[@href='/units/']", "no_jira"); 
    	if (FAIL) { return;} 
    	
    _t++; TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");
   		if (FAIL) { return;} 
   		
   		
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'Add Unit' button", "xpath", "//div[contains(@class,'add-units-btn')]/button/span", "no_jira"); 
		if (FAIL) { return;}
		Thread.sleep(6000);
   		
    _t++; TWeb.Element_By_Path_Text_Enter("Enter unit id", "xpath", "//div[@class='v-text-field__slot']/input[@id='unit_id']", "1", false, "no_jira"); 
    	if (FAIL) { return;}

    _t++; TWeb.Element_By_Path_Text_Enter("Enter unit name", "xpath", "//div[@class='v-text-field__slot']/input[@id='unit_name']", unit, false, "no_jira"); 
        if (FAIL) { return;}
    	
    _t++; TWeb.Element_By_Path_Text_Enter("Enter Street Address", "xpath", "//div[@class='v-text-field__slot']/input[@id='street_address']", "1 prologis st", false, "no_jira"); 
    	if (FAIL) { return;}
    
    _t++; TWeb.Element_By_Path_Text_Enter("Enter city name", "xpath", "//div[@class='v-text-field__slot']/input[@id='city']", "New York", false, "no_jira"); 
    	if (FAIL) { return;}

    _t++; TWeb.Element_By_Path_Text_Enter("Enter State name", "xpath", "//div[@class='v-select__slot']/input[@id='state']", "NY (New York)", false, "no_jira"); 
   	if (FAIL) { return;}    

    _t++; Thread.sleep((long) sleep); TWeb.Element_SendKey_Enter("Press 'Enter' Key", A.e, "no_jira");
        if (FAIL) { return;}  

    _t++; TWeb.Element_By_Path_Text_Enter("Enter zip code", "xpath", "//div[@class='v-text-field__slot']/input[@id='zip']", "23433", false, "no_jira"); 
        if (FAIL) { return;}

    _t++; TWeb.Element_By_Path_Text_Enter("Enter work number contact", "xpath", "//div[@class='v-text-field__slot']/input[@id='work_number_contact']", "123 456 7890", false, "no_jira"); 
        if (FAIL) { return;}

    _t++; TWeb.Element_By_Path_Text_Enter("Enter extension", "xpath", "//div[@class='v-text-field__slot']/input[@id='extension']", "3", false, "no_jira"); 
        if (FAIL) { return;}

        Thread.sleep(8000);


   _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to sector dropdown", 0, 500, "no_jira");
    if (FAIL) { return;}	    
   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on sector dropdown", "xpath", "(//div[@class='v-select__slot'])[position()=2]/div[2]", "no_jira"); 
	     	if (FAIL) { return;}
	     	Thread.sleep(2000);
	     	
    _t++; Thread.sleep((long) sleep); TWeb.List_L0("List sector type ", "xpath", "//div[@role='listbox']/div/div/div", "no_jira");  
    	if (FAIL) { return;}
    
        for (int i = 0; i < L0.size(); i++) {
            _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L0.get(i),  "no_jira"); 
            if (FAIL) { return;}
            if(t.trim().equals("Charwells")){ 
                L0.get(i).click();
            }
        }

     Thread.sleep(12000);


    _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to market dropdown", 0, 500, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on market dropdown", "xpath", "(//div[@class='v-select__slot'])[position()=3]/div[2]", "no_jira"); 
     	if (FAIL) { return;}
     	Thread.sleep(2000);
     	
    _t++; Thread.sleep((long) sleep); TWeb.List_L0("List market type ", "xpath", "//div[@role='listbox']/div/div/div", "no_jira");  
    	if (FAIL) { return;}
    
        for (int i = 0; i < L0.size(); i++) {
            _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L0.get(i),  "no_jira"); 
            if (FAIL) { return;}
            if(t.trim().equals("Cdl test 1")){ 
                L0.get(i).click();
            }
        }
        

      _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to unit manager dropdown ", 0, 500, "no_jira");
       if (FAIL) { return;}	 	
      _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on unit manager dropdown", "xpath", "//div[@class='v-select__slot']/input[@id='unit_manager']", "no_jira"); 
     	if (FAIL) { return;}
     	Thread.sleep(2000);
      _t++; TWeb.Element_By_Path_Text_Enter("Enter Unit Manager", "xpath", "//div[@class='v-select__slot']/input[@id='unit_manager']", "Fw Gmail Unit Manager", false, "no_jira"); 
   		if (FAIL) { return;}
   		
      _t++; Thread.sleep((long) sleep); TWeb.Element_SendKey_Enter("Press 'Enter' Key", A.e, "no_jira");
   		if (FAIL) { return;} 
   	Thread.sleep(6000);		
   	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Add Unit button", "xpath", "//button/span[contains(.,'Add Unit')]", "no_jira"); 
   	     if (FAIL) { return;}		
    // </editor-fold> 	
    
    //************************************************** Search for Unit *****************************************
    // <editor-fold defaultstate="collapsed" desc="Search for unit "> 
     
    // </editor-fold>
       
    }  
}
    
      
      

