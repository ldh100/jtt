/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import A.T;
import static A.A.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metrics_selection {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Filters' label", "Filters", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Configure Filters' button label", " Configure Filters", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Add metrics...'", "tagName", "img", "alt", "no_jira"); 
            //if (FAIL) { return;}           

        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
             if (FAIL) { return;}                              
        for (int i = 0; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); T.Element_Text("Date Items", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
//                 _t++; Thread.sleep((long) sleep); T.Element_Click(t + " > DateItem " + i + " name", L1.get(i) , "no_jira" );
//                     if (FAIL) { return;}
        }        
        
        _t++; Thread.sleep((long) sleep); T.List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", "no_jira");             
            if (FAIL) { return;}  
        for (int i = 0; i < L0.size(); i++) {
            _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Metrics Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1(t + " > Metrics count", L0.get(i),"xpath", ".//span[contains(@class, 'MuiTypography-displayBlock')]", "no_jira");                          
                if (FAIL) { return;}
            for (int j = 0; j < L1.size(); j++) {
                _t++; Thread.sleep((long) sleep); T.Element_Text("Metrics " + j + " name", L1.get(j),"no_jira");                          
                    if (FAIL) { return;}
            }            
        } 
        _t++; Thread.sleep((long) sleep); T.List_L0("All Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", "no_jira");             
            if (FAIL) { return;}        
            for (int j = 0; j < L0.size(); j++) {
                if(j < 8){
                    _t++; T.Element_Click("Select Metrics " + (j+1), L0.get(j), "no_jira");
                        if (FAIL) { return;} 
                    _t++; T.Element_By_Path_Text("Selected Metrics count label", "xpath", ".//div[contains(@class, 'MuiAccordionSummary-content')]", "no_jira");    
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for Selected Metric " + (j+1) + " load...", "xpath", "//div[@role='progressbar']", "no_jira"); 
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); T.List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", "no_jira");             
                        if (FAIL) { return;} 
                    Thread.sleep(500);     
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L2("Loaded Metric Card '-body1' Count", L1.get(j), "xpath", ".//p[contains(@class,'-body1')]", "no_jira");             
                        if (FAIL) { return;} 
                    if(L2.size() > 0) {   
                        _t++; Thread.sleep((long) sleep); T.Element_Text("Last loaded Metric Card " + (j+1) + " name", L2.get(0), "no_jira");                          
                        if(L2.size() > 1) {     
                            _t++; Thread.sleep((long) sleep); T.Element_Text("Last loaded Metric Card " + (j+1) + " Value 1", L2.get(1), "no_jira");                          
                            if(L2.size() > 2) { 
                                _t++;Thread.sleep((long) sleep); T.Element_Text("Last loaded Metric Card " + (j+1) + " Value 2", L2.get(2), "no_jira");        
                            }
                        }
                    }
                }else{
                    _t++; T.Element_Child_Attribute("Metrics " + (j + 1) + " checkbox disabled", L0.get(j),"tagName", "span", "aria-disabled", "no_jira");
                        if (FAIL) { return;}                        
                } 
            }       
           // _t++; Thread.sleep((long) sleep); T.Refresh("Refresh/Reload Metrics","no_jira"); 
            
//            // Refresh returns to Login ??? ===========================
//            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'LOGIN'", "id", "login-btn", "no_jira"); 
//                if (FAIL) { return;}  
//            Thread.sleep(500);  
//            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//                if (FAIL) { return;}                 
//            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Add metrics...'", "tagName", "img", "alt", "no_jira");  
//            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Close Metrics Drawer - click 'arrow_left'", "xpath", ".//span[text()='arrow_left']", "no_jira"); 
//                if (FAIL) { return;}              
//            Thread.sleep(500);
//            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Metrics Drawer - click 'arrow_right'", "xpath", ".//span[text()='arrow_right']", "no_jira"); 
//                if (FAIL) { return;}
//            Thread.sleep(500);                
//        _t++; Thread.sleep((long) sleep); T.List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", "no_jira");             
//            if (FAIL) { return;}  
//            for (int i = 0; i < L0.size(); i++) {
//                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Metrics Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
//                    if (FAIL) { return;}
//            }

//To  Verify whether the Preset buttons are displayed and Clicking on them by Prathyusha Deshpande	
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
             if (FAIL) { return;}                              
             for (int i = 0; i < L1.size(); i++) {
                 _t++; Thread.sleep((long) sleep); T.Element_Text("Date Items", L1.get(i), "no_jira");                          
                     if (FAIL) { return;}
                 _t++; Thread.sleep((long) sleep); T.Element_Click(t + " > DateItem " + i + " name",L1.get(i) , "no_jira" );
                     if (FAIL) { return;}

// To Uncheck the checkboxes 
for (int k = 1; k < 9; k++) {
            	_t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck the checkbox whose index is set to - "+k, "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+k+"]", "no_jira"); 
            if (FAIL) { return;} 
            }

 
             }      

}
}
