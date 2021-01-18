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
public class DL_login {
    public static void run() throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("Login page URL", "no_jira");             
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'LOGIN'", "id", "login-btn", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; T.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot your Password?')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Page_URL("Foodbuy Login page URL", "no_jira");        
        _t++; T.Element_By_Path_Text("Button 'Sign in' Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'USERNAME' input", "id", "username", "no_jira"); 
            if (FAIL) { return;}  
            
        // TestCase 01 with Invalid Username/Valid Password by Prathyusha Deshpande
          _t++; T.Visible_Element_By_Path_Text_Enter("Enter Invalid Username", "id", "username", "test.invalid@place.com", false, "no_jira"); 
            if (FAIL) { return;}            
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", "Compass1", true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true,"no_jira"); 
        if (FAIL) { return;}


        //TestCase 02  with Valid Username/Invalid Password by Prathyusha Deshpande     
         _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Username", "id", "username", "distilr.test@place.com", false, "no_jira"); 
             if (FAIL) { return;}            
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Invalid  password", "id", "password", "Compass011", true, "no_jira"); 
             if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
             if (FAIL) { return;}  
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true,"no_jira"); 
 
        
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", DL_UserID, false, "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", DL_UserPW, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        
             
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
            if(k==1) {
            	_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'CS' metric", "CS", true,"no_jira");
            }else if (k==2) {
            	_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'CUR' metric", "CUR", true,"no_jira");
			}else if (k==3) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'TS' metric", "TS", true,"no_jira");
			}else if (k==4) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'CER' metric", "CER", true,"no_jira");
			}else if (k==5) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'CROR' metric", "CROR", true,"no_jira");
			}else if (k==6) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'CSOP' metric", "CSOP", true,"no_jira");
			}else if (k==7) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'MER' metric", "MER", true,"no_jira");
			}else if (k==8) {
				_t++; Thread.sleep((long) sleep); T.Find_Text("Find 'MROR' metric", "MROR", true,"no_jira");
			}
			
			
		}
        
        //Verify whether 9th Check box is disabled or not by Prathyusha Deshpande
        _t++; T.Element_By_Path_Attribute("Checkbox should be disabled when metric exceeds 8", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "disabled","no_jira");
        	if (FAIL) { return;}
        	
        
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
             }      
            
    }
}











