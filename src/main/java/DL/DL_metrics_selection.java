/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import A.T;
import static A.A.*;
import static DL.DL.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metrics_selection {
    public static void run() throws InterruptedException {   
         
        Thread.sleep(8000);
            
         _t++; Thread.sleep((long) sleep); T.List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", "no_jira");             
            if (FAIL) { return;}  
            for (int i = 0; i < L0.size(); i++) {
                _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Metrics Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1(t + " > Metrics count", L0.get(i),"xpath", ".//span[contains(@class, 'MuiTypography-displayBlock')]", "no_jira");                          
                    if (FAIL) { return;}
                for (int j = 0; j < L1.size(); j++) {
                    _t++; Thread.sleep((long) sleep); T.Element_Text(t + " > Metrics " + j + " name", L1.get(j),"no_jira");                          
                    if (FAIL) { return;}
                
                }
            } 
    //To Select 8 Check boxes & Verify Metric Card values by Prathyusha Deshpande
            for (int k = 1; k < 9; k++) {
            	_t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Select checkbox whose index is set to - "+k, "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+k+"]", "no_jira"); 
            if (FAIL) { return;} 
          
           
            
            Thread.sleep(4000);
    Thread.sleep(4000);
            if(k==1) {
            _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Total Spend' metric", "Total Spend", true,"no_jira");
            Thread.sleep(5000);
            _t++; T.Element_By_Path_Text("Total Spend Dollar Amount", "xpath", "(//p[@class='MuiTypography-root MuiTypography-body1'])[2]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(10000);
            _t++; T.Element_By_Path_Text("Total Spend Absolute %", "xpath", "//p[@class='MuiTypography-root jss67 jss71 MuiTypography-body1']", "no_jira"); 
            if (FAIL) { return;} 
            
            }else if (k==2) {
            _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Contracted Spend' metric", "Contracted Spend", true,"no_jira");
            Thread.sleep(5000);
            _t++; T.Element_By_Path_Text("Total Contracted Spend Dollar Amount", "xpath", "(//p[@class='MuiTypography-root MuiTypography-body1'])[4]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(10000);
                _t++; T.Element_By_Path_Text("Total Contracted Spend Absolute %", "xpath", "//p[@class='MuiTypography-root jss67 jss90 MuiTypography-body1']", "no_jira"); 
            if (FAIL) { return;} 
			}else if (k==3) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Contracted Utilization Rate' metric", "Contracted Utilization Rate", true,"no_jira");
			}else if (k==4) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Member Earned Revenue' metric", "Member Earned Revenue", true,"no_jira");
			}else if (k==5) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Member Rate of Return' metric", "Member Rate of Return", true,"no_jira");
			}else if (k==6) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Member Strength of Program' metric", "Member Strength of Program", true,"no_jira");
			}else if (k==7) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Customer Earned Revenue' metric", "Customer Earned Revenue", true,"no_jira");
			}else if (k==8) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Customer Rate of Return' metric", "Customer Rate of Return", true,"no_jira");
			}
			
			
		}
        
        //Verify whether 9th Check box is disabled or not by Prathyusha Deshpande
        _t++; T.Element_By_Path_Attribute("Checkbox should be disabled when metric exceeds 8", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "disabled","no_jira");
        	if (FAIL) { return;}
        	
        
       //To  Verify whether the Preset buttons are displayed and Clicking on them by Prathyusha Deshpande	
//        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
//             if (FAIL) { return;}        
//        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
//             if (FAIL) { return;}                              
//             for (int i = 0; i < L1.size(); i++) {
//                 _t++; Thread.sleep((long) sleep); T.Element_Text("Date Items", L1.get(i), "no_jira");                          
//                     if (FAIL) { return;}
//                 _t++; Thread.sleep((long) sleep); T.Element_Click(t + " > DateItem " + i + " name",L1.get(i) , "no_jira" );
//                     if (FAIL) { return;}
//             }      
            
    }
}
    
 