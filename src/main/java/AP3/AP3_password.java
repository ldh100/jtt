/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * This ticket is to sign up with those users and login with the new users
 *  1)Create a User
 *  2)Go to the user’s inbox (use Mailinator  emails)
 *  3)Click on the URL in the inbox
 * Expected: User will be directed to Ap3-to the signup page
 * 4. Enter the password information
 * Expected: The user will be able to set up a password
 * 5. Now, enter the user’s email and password to sign in
 * Expected: User will be able to login to Ap3
 * 
 * @author Dhruv.Seth
 * 
 */
public class AP3_password {
    
        String eMail = "ds.testautomation89@mailinator.com";
        String passWord1="Dhruv891111111"; //At least 15 characters
        String passWord2="dhruvseth251215"; //An uppercase character
        String passWord3="DHRUVSETH251215"; //A lowercase character
        String passWord4="DhruvsethAutomation"; //A number or a special character
        String passWord5="DhruvsethAuto2!"; // Valid password
        
        
    
    public static void run() throws InterruptedException { 
        
        AP3_password DS = new AP3_password(); //Object creation
        
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Users' Click", "xpath", "//*[contains(text(), 'Users')]", "no_jira"); 
            if (FAIL) { return;} 
          
        
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; TWeb.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); TWeb.Page_URL("New User page URL","no_jira");
            if (FAIL) { return;}   
            

        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", "no_jira");
             if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                     
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Role Name (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Admin")){ T_Index = i; }
            }
            
        //Creating a new admin user
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'Admin'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "DS", false, "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "TestAutomation", false, "no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", DS.eMail, false, "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "1111111111", false, "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]","no_jira");             
            if (FAIL) { return;}   
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
            
        //Entering mailinator and clicking on the email
            
        DS.enterMailnator();
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the email", "xpath","(//*[contains(text(), 'You have received a invite to log into the Admin Panel!')])[1]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Swith_to_Frame("Invite to log in Admin Panel", "xpath", "//iframe[@id='html_msg_body']", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click here to set your password", "xpath","//a[contains(text(),'here')]", "no_jira");
            if (FAIL) { return;}

        Thread.sleep(1000);
        
        Set<String> windows = d1.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        String childThreeId = it.next();
        d1.switchTo().window(childThreeId);
        
        
        
        //Setting the Password after invite to Admin Panel
             
        //Scenario 1: Admin: At least 15 characters requirement is not fulfilled
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord1, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord1, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
            
        /**
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Errors", "xpath", "//ul[@class='list_style']", "no_jira");             
        if (FAIL) { return;}
         System.err.println(t);
        for (int i = 0; i < L0.size(); i++) {
        _t++; TWeb.Element_Attribute("Error Messages", L0.get(i), "textContent", "no_jira");   
        if (FAIL) { return;}
        */
                
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", "no_jira");
            if (FAIL) { return;}
          
        //Scenario 2: Admin: An uppercase character requirement is not fulfilled
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord2, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord2, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", "no_jira");
            if (FAIL) { return;}
        
        //Scenario 3: Admin: An lowercase character requirement is not fulfilled
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord3, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord3, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", "no_jira");
            if (FAIL) { return;}
        
        
        //Scenario 4: Admin: A number or special character requirement is not fulfilled
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord4, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord4, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", "no_jira");
            if (FAIL) { return;}
                
            
        //Scenario 5: Admin: Passwords do not match
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord4, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord5, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Confirm Password Error Message", "xpath", "//div[@class='v-messages__message']", "no_jira"); 
            if (FAIL) { return;}
            
        //Scenario 6: Admin: Setting Valid password with all requirements (Happy Path)
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", DS.passWord5, true, "no_jira");  
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", DS.passWord5, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", "no_jira"); 
            if (FAIL) { return;}                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Error Message:", "xpath", "//*[@class='blue_state']", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Confirm Password Password don't match Error Message is not displayed", "xpath", "//div[@class='v-messages theme--light']", "no_jira"); 
            if (FAIL) { return;}
            
        //Clicking on the Set Password button
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for set password button to enable", "xpath", "//div[contains(text(),'Set Password')]", "no_jira");                 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Set Password", "xpath", "//div[contains(text(),'Set Password')]", "no_jira"); 
            if (FAIL) { return;}
    
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Admin Panel","no_jira");
            if (FAIL) { return;} 
        
        //User logging out
        
        DS.logout();
            
        //Admin User logging in with the registered email and new password 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("AP3 Login page", "no_jira");             
            if (FAIL) { return;}   
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Registered Admin Email", "css", "[aria-label='E-mail']", DS.eMail, true, "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", DS.passWord5, true, "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;} 
        //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", "no_jira");             
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Wait for 'Hi Username...' text", "xpath", "//*[contains(text(),'Hi DS TestAutomation')]", "no_jira");             
            if (FAIL) { return;}
            
        DS.logout();
        DS.ap3LoginPage();
        DS.forgotPassWord();
            } //Run time closing bracket so add all the methods before this..      
    
    //AUT-840 : As an Admin, I can reset my password and login to Ap3 with the new password    
    public static void ap3LoginPage() throws InterruptedException{
        //_t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url,"no_jira");             
            //if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("AP3 Login page", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Welcome to >", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Sign In Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", "no_jira"); 
            if (FAIL) { return;}     
     }
    
    /**
     * 1) Go to the Ap3 login screen as ADMIN
     * 2) Click on Forgot password 
     * 3) Enter a non-registered email and click on reset password
     * Expected: Could not reset your password, contact support.
    */
    public static void forgotPassWord() throws InterruptedException{
        
        String eMail="ds.testautomation598@mailinator.com";
        _t++; TWeb.Element_By_Path_Click("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "//input[@aria-label='E-mail']",  "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Unregistered Email", "xpath", "//input[@aria-label='E-mail']", eMail , true, "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Click("Click Reset Password", "xpath", "//div[@class='v-btn__content']", "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Text("Unregistered email Error Message... Text", "xpath", "//div[@class='v-messages__message']", "no_jira"); 
            if (FAIL) { return;}         
    }
    
    //User logout
    public static void logout() throws InterruptedException{
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira");
            if (FAIL) {return;}      
    }
    
    public static void enterMailnator() throws InterruptedException{
        String eMail = "ds.testautomation89@mailinator.com";
        _t++; Thread.sleep((long) sleep);TWeb.Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", " no_jira");
            if (FAIL) { return;}
        //Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@id='addOverlay']",eMail, FAIL, "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on go", "xpath","//button[@id='go-to-public']", "no_jira");
         Thread.sleep(1000);
            if (FAIL) { return;}
    }
    
    }  

