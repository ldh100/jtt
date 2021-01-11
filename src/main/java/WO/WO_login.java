/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_login {
    public static void run() throws InterruptedException {     
        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("Login page", "no_jira");             
            if (FAIL) { return;}
        _t++; T.Element_By_Path_Attribute("Thrive Image URL", "xpath", "//div[@class='v-image__image v-image__image--cover']", "style", "no_jira");
            //if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'card-header' text", "xpath", "//p[@class='card-header']", "no_jira"); 
            //if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Enter Location' text", "Enter Your Thrive Location", true,"no_jira"); 
            //if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Login' text", "Login", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Login'", "xpath", "//*[text()='Login']", "no_jira"); 
            if (FAIL) { return;}             
        Thread.sleep(500);   
        _t++; T.Element_E1_Find("Find 'Login' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
            if (FAIL) { return;} 
        _t++; T.Element_Child_Text("Find 'Login' dialog Title", e1, "xpath", ".//div[@class='v-card__title form-title']", "no_jira");               
        _t++; T.Element_Child_Text("Find 'Login' dialog Text", e1, "xpath", ".//div[@class='v-card__text']", "no_jira"); 
        _t++; T.Find_Text("Find 'Need ..?' text", "Need an account?", true,"no_jira");                
        _t++; T.Element_By_Path_Text("Find 'switch-form-text > Sign-in' text", "xpath", "//p[@class='switch-form-text']", "no_jira"); 
        _t++; T.Find_Text("Find 'Forgot password..' text", "Forgot you password?", true, "no_jira"); 

        _t++; T.Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", "no_jira");             
            if (FAIL) { return;}          
        _t++; T.Element_Child_Text("Input 'Email' label", L1.get(0), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}
        _t++; T.Element_Child_Text("Input 'Pssword' label", L1.get(1), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}

        if(NEW_USER) {
            
            // Larry's code goes here
            
        }else{
            _t++; T.Element_Child_Click("Click 'Email' input", L1.get(0), "tagName" , "input", "no_jira"); 
                if (FAIL) { return;}  
            // Add Invalid Email/PW testing flow   // =================================
            _t++; T.Element_Child_Text_Enter("Enter Valid Email", L1.get(0), "tagName" , "input", USER_ID, false, "no_jira"); 
                if (FAIL) { return;}            
            _t++; T.Element_Child_Click("Click 'Pssword' input", L1.get(1), "tagName" , "input", "no_jira"); 
                if (FAIL) { return;}  
            _t++; T.Element_Child_Text_Enter("Enter Valid Pssword", L1.get(1), "tagName" , "input",USER_PW, true,"no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Un-hide Password'", "css", "[aria-label='append icon']", "no_jira"); 
                if (FAIL) { return;}        

    //        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click LOGIN", e1,"xpath", ".//button[@class='v-btn v-btn--contained theme--light v-size--default turquoise']", "no_jira");             
    //            if (FAIL) { return;} // =========================    Staging Blue ^^^^^
            _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'LOGIN'", e1,"xpath", ".//button[contains(@class, 'v-btn v-btn--contained theme--light v-size--default')]", "no_jira");             
                if (FAIL) { return;} // =========================    Development Red ^^^^^
        }
            
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");                                                                                     
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Account Settings']", "no_jira");                                     
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", "no_jira");
            if (FAIL) { return;}  
        //try to get User Email    
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}              
            
    }
}
