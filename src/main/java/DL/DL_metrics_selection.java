/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import A.TWeb;
import static A.A.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metrics_selection {
    public static void run() throws InterruptedException { 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);
          _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "//*[text()='Filters']", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Filters' label", "Filters", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Configure Filters' button label", " Configure Filters", true,"no_jira");        
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
         if (!FAIL) {         
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
                 if (FAIL) { return;}                              
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Date Items", L1.get(i), "no_jira");                          
            }
        }  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
            if (FAIL) { return;} 
        }
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", "no_jira");             
            if (FAIL) { return;}  
        for (int i = 0; i < L0.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Metrics Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1(t + " > Metrics count", L0.get(i),"xpath", ".//span[contains(@class, 'MuiTypography-displayBlock')]", "no_jira");                          
                if (FAIL) { return;}
            for (int j = 0; j < L1.size(); j++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Metrics " + j + " name", L1.get(j),"no_jira");                          
                    if (FAIL) { return;}
            }            
        } 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("All Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", "no_jira");             
            if (FAIL) { return;}        
            for (int j = 0; j < L0.size(); j++) {
                if(j < 8){
                    _t++; TWeb.Element_Click("Select Metrics " + (j+1), L0.get(j), "no_jira");
                        if (FAIL) { return;} 
                    _t++; TWeb.Element_By_Path_Text("Selected Metrics count label", "xpath", ".//div[contains(@class, 'MuiAccordionSummary-content')]", "no_jira");    
                        if (FAIL) { return;} 
                    Thread.sleep(500);  
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for Selected Metric " + (j+1) + " load...", "xpath", "//div[@role='progressbar']", "no_jira"); 
                        if (FAIL) { return;}  
                    Thread.sleep(500);     
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L2("Loaded Metric Card '-body1' Count", L1.get(L1.size() - 1), "xpath", ".//p[contains(@class,'-body1')]", "no_jira");             
                        if (FAIL) { return;} 
                        if(L2.size() > 0) {    
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card name", L2.get(0), "no_jira"); 
                            if(L2.size() > 1) {  
                                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card Value 1", L2.get(1), "no_jira");
                                if(L2.size() > 2) {     
                                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card Value 2", L2.get(2), "no_jira");        
                                }   
                            }
                        }
                }else{
                    _t++; TWeb.Element_Child_Attribute("Metrics " + (j + 1) + " checkbox disabled", L0.get(j),"tagName", "span", "aria-disabled", "no_jira");
                        if (FAIL) { return;}                        
                } 
            }   

        _t++; Thread.sleep((long) sleep); TWeb.Refresh("Refresh Curent page","no_jira"); 
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}                             
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Foodbuy Login page URL", "no_jira");    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
            if (FAIL) { return;} 
        } 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", "no_jira");             
            if (FAIL) { return;}  
        for (int i = 0; i < L0.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Metric " + (i+1) + " Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
                if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", "no_jira");             
            if (FAIL) { return;}     
    }
}