/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import A.TWeb;
import static A.A.*;
import static FW.FW.*;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_login {
    public static void run() throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Login page", "no_jira");             
            if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Sign-in Prompt", "xpath", "//h3[@class='text-center']", "no_jira"); 
            if (FAIL) { return;}

        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Password Text", "xpath", "//*[contains(text(), 'Password')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Button 'Sign In' Text", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Click("Click 'Email' input", "xpath", "//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "xpath", "//input[@type='text']", ADMIN_ID, false, "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Click("Click 'Password' input", "xpath", "//input[@type='password']",  "no_jira"); 
            if (FAIL) { return;}
//        _t++; TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "xpath", "//input[@type='password']", ADMIN_PW + "_X", false, "no_jira"); 
//            if (FAIL) { return;}
//       _t++; TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
//            if (FAIL) { return;} 
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//*[@class='v-messages__message']", "no_jira"); 
//            if (FAIL) { return;}   
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Inavalid Credentials Message", "xpath", "//div[@class='v-messages__message']", "no_jira"); 
//            if (FAIL) { return;}
//        _t++; TWeb.Element_By_Path_Click("Click 'Password' input", "xpath", "//span[contains(text()," + ADMIN_PW + "_X)]",  "no_jira"); 
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Password Clear", "xpath", "//input[@type='password']", "no_jira"); // .//input
//            if (FAIL) { return;}                                                                            
  
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "xpath", "//input[@type='password']", ADMIN_PW, true, "no_jira"); 
            if (FAIL) { return;}
       // _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Unmask Password Click", "css", "[aria-label='append icon']", "no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
            if (FAIL) { return;} 
        // loading="true"    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the ')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Find 'Version'", "xpath", "//div[@class='version']", "no_jira");
            if (FAIL) { return;}             
            Ver = t.trim().replace("v ", ""); // '  v 4.0.8 ' 
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Drawer Menu Count", "xpath", "//div[@class='menu-name']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Attribute("Drawer Menu (" + i + ") Text", L0.get(i), "textContent", "no_jira");   
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Notifications' Text", "Notifications", true,"no_jira");  
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find User Avatar", "xpath", "//div[@class='nav-avatar v-list-item theme--light']", "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Find User Avatar Name", e1, "xpath", ".//div[@class='v-list-item__title text-capitalize']", "no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Find User Avatar Role", e1, "xpath", ".//div[@class='v-list-item__subtitle']", "no_jira");        
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Logout'", "xpath", "//div[@class='nav-logout']", "no_jira");    

        _t++; TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");        
    }                    
}

