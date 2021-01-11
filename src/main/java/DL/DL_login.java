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
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); T.Page_URL("Foodbuy Login page URL", "no_jira");        
        _t++; T.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot your Password?')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; T.Element_By_Path_Text("Button 'Sign in' Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'USERNAME' input", "id", "username", "no_jira"); 
            if (FAIL) { return;}  
            
        // insert Invalid Email / invalid PW cases/steps    
            
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
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
            if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
            if (FAIL) { return;}                              
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); T.Element_Text("Date Items", L1.get(i), "no_jira");                          
                    if (FAIL) { return;}
            }         

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
        _t++; Thread.sleep((long) sleep); T.Element_Child_Text("Metrics Subheader Title", L0.get(0),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", "no_jira");                          
             
        // continue - 
        // current issues:
        // do data returned yet
        // data restriction by user ?
        // drower empty after hide > open
        // no logout ????
    }
}
