/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_login {
    public static void run() throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url, "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Login page URL", "no_jira");             
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'LOGIN'", "id", "login-btn", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot your Password?')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Foodbuy Login page URL", "no_jira");        
        _t++; TWeb.Element_By_Path_Text("Button 'Sign in' Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'USERNAME' input", "id", "username", "no_jira"); 
            if (FAIL) { return;}  
            
        // TestCase 01 with Invalid Username/Valid Password by Prathyusha Deshpande
        Thread.sleep(5000);
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Invalid Username", "id", "username", "test.invalid@place.com", false, "no_jira"); 
            if (FAIL) { return;}            
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", "Compass1", true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true,"no_jira"); 
        if (FAIL) { return;}

        //TestCase 02  with Valid Username/Invalid Password by Prathyusha Deshpande
        Thread.sleep(5000);
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Username", "id", "username", "distilr.test9@place.com", false, "no_jira"); 
             if (FAIL) { return;}            
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Invalid  password", "id", "password", "Compass011", false, "no_jira"); 
             if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
             if (FAIL) { return;}  
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Invalid credentials'", "Invalid credentials.", true,"no_jira"); 
        Thread.sleep(5000);
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", DL_UserID, false, "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", DL_UserPW, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
             
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Login page URL", "no_jira");                     
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Check for Login Messages (count)", "xpath", "//h2[@class='message']", "no_jira");             
            if (FAIL) { return;}
        if(!L0.isEmpty()){
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Message text", L0.get(0), "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reset Password Now' button", "name", "resetPasswordNow", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reset Later' button", "name", "continue", "no_jira");
                if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Reset Later'", e1, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);  
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}               
        }
    }
}
