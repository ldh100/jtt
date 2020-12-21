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
public class __login {
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
            //if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Login'", "xpath", "//*[text()='Login']", "no_jira"); 
            if (FAIL) { return;}             
        _t++; T.Element_E1_Find("Find 'Login' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);             
        _t++;  T.Element_Child_Text("Find 'Login' dialog Title", e1, "xpath", "//div[@class='v-card__title form-title']", "no_jira"); 
            //if (FAIL) { return;}                
        _t++; T.Element_Child_Text("Find 'Login' dialog Text", e1, "xpath", "//div[@class='v-card__text']", "no_jira"); 
            //if (FAIL) { return;}  
        _t++; T.Find_Text("Find 'Need ..?' text", "Need an account?", true,"no_jira"); 
            //if (FAIL) { return;}                
        _t++; T.Element_By_Path_Text("Find 'switch-form-text' text", "xpath", "//p[@class='switch-form-text']", "no_jira"); 
            //if (FAIL) { return;} 
        /*   ========= using 'input-XXX' Doesn't work, like - Unable to locate element: {"method":"id","selector":"input-803"} ????
        _t++; T.Element_By_Path_Text("Find 'Email' label", "xpath", ".//label[@for='input-803']", "no_jira");
        //if (FAIL) { return;}
        _t++; T.Element_By_Path_Text("Find 'Password' label", "xpath", ".//label[@for='input-806']", "no_jira");
        //if (FAIL) { return;}
        _t++; T.Element_By_Path_Click("Click 'Email' input", "id", "input-803", "no_jira");
        if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Text_Enter("Enter Valid Email", "id", "input-803", USER_ID, "no_jira");
        if (FAIL) { return;}
        */
        _t++; T.Element_Child_List_L1("Login Text Slot(s) Count", e1,"xpath", ".//div[@class='v-text-field__slot']", "no_jira");             
            if (FAIL) { return;}          
        _t++; T.Element_Child_Text("Input 'Email' label", L1.get(0), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}
        _t++; T.Element_Child_Text("Input 'Pssword' label", L1.get(1), "tagName" , "label", "no_jira"); 
            //if (FAIL) { return;}
        _t++; T.Element_Child_Click("Click 'Email' input", L1.get(0), "tagName" , "input", "no_jira"); 
            if (FAIL) { return;}  
        _t++; T.Element_Child_Text_Enter("Enter Valid Email", L1.get(0), "tagName" , "input",USER_ID, "no_jira"); 
            if (FAIL) { return;}            

        _t++; T.Element_Child_Click("Click 'Pssword' input", L1.get(1), "tagName" , "input", "no_jira"); 
            if (FAIL) { return;}  
        _t++; T.Element_Child_Text_Enter("Enter Valid Pssword", L1.get(1), "tagName" , "input",USER_PW, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click LOGIN", e1,"xpath", ".//button[@class='v-btn v-btn--contained theme--light v-size--default turquoise']", "no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");                                                                                     
            if (FAIL) { return;}
        Thread.sleep(500);         
            
            
    }
}
