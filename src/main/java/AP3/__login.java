/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class __login {
    public static void run(boolean users) throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("AP3 Login page", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Element_By_Path_Text("Welcome to >", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Element_By_Path_Text("Sign In Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; T.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", "no_jira"); 
            if (FAIL) { return;}      
        if(users) {    
            _t++; T.Visible_Element_By_Path_Text_Enter("Enter Invalid Email", "css", "[aria-label='E-mail']", "x.y@compassdigitalio", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Inavalid Email Message", "xpath", "//*[contains(text(), 'Please enter a valid email')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']", "no_jira"); 
                if (FAIL) { return;}
        }
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Email", "css", "[aria-label='E-mail']", ADMIN_ID, "no_jira"); 
            if (FAIL) { return;}
//        if(users) {   
//            _t++; T.Visible_Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", ADMIN_PW + "_X", "no_jira"); 
//                if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Unmask Password Click", "xpath", "/html/body/div[1]/div/main/div/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div[2]/div/i", "no_jira"); 
//            _t++; T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
//                if (FAIL) { return;} 
//            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Error...", "xpath", "//*[contains(@class, 'v-messages theme--light error--text')]", "no_jira"); 
//                if (FAIL) { return;}   
//            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Inavalid Credentials Message", "xpath", "//*[contains(text(), 'Your username or credentials')]", "no_jira"); 
//                if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", "no_jira"); // .//input
//                if (FAIL) { return;}                                                                             //   "xpath", ".//input[@type='password']" ".//input[@area-label='Password']"
//        }    
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", ADMIN_PW, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("AP3 Dashboard URL", "no_jira");             
            if (FAIL) { return;}
        _t++; T.List_L0("Home screen Buttons Count", "xpath", "//button[@type='button']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Home screen Button " + i + " Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.List_L0("Drawer Items Count", "css", "[role='listitem']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Attribute("Drawer Items Text", L0.get(i), "textContent", "no_jira");   
                if (FAIL) { return;}
                if(i==(L0.size()-1)){
                    Ver = t;
                }
            } 
        _t++; T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");                    
    }
}
