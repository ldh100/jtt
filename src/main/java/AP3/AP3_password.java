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
package AP3;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

class AP3_password extends AP3_GUI {
    protected AP3_password (AP3_GUI a) {
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;     
    }        
    private final String eMail = "_ds@mailinator.com";
    private final String passWord1 = "Dhruv891111111";      //At least 15 characters
    private final String passWord2 = "dhruvseth251215";     //An uppercase character
    private final String passWord3 = "DHRUVSETH251215";     //A lowercase character
    private final String passWord4 = "DhruvsethAutomation"; //A number or a special character
    private final String passWord5 = "DhruvsethAuto2!";     // Valid password
    private final String passWord6 = "DhruvsethAuto2!0";    // New Valid password
    
    protected void run() { 
    try{
        Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        Page_URL("Get AP3 Welcome page URL", ParentTest, "no_jira");
        Element_By_Path_Text("Get 'Welcome...' text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", ParentTest, "no_jira");
        Element_By_Path_Text("Get 'Login' text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", ParentTest, "no_jira");
        Find_Text("Get 'Forgot Password' text", "Forgot Password", true, ParentTest, "no_jira");

        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Email", "css", "[aria-label='E-mail']", eMail, false, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click on forgot password", "xpath","//div[@class='Subtitle-2-Primary-Left']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "//input[@aria-label='E-mail']", ParentTest, "no_jira"); 
            if (FAIL) { return;}          
        Element_By_Path_Text_Enter("Enter Unregistered Email", "xpath", "//input[@aria-label='E-mail']", "unregistered.user@mailinator.com" , false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Reset Password", "xpath", "//div[@class='v-btn__content']", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500); 
        //Element_By_Path_Text ("Unregistered email Error Message... Text", "xpath", "//*[contains(text(), 'Could not reset your password, contact support.')]", ParentTest, "no_jira"); 
        //Element_By_Path_Text ("Unregistered email Error Message... Text", "xpath", "//*[contains(text(), 'Something happened while')]", ParentTest, "no_jira"); 
        Element_By_Path_Text("Unregistered email Error Message... Text", "xpath","//div[@class='v-messages__message']", ParentTest, "no_jira");
        if(env.equals("PR")){
            return;
        }
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "//input[@aria-label='E-mail']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter registered Email", "xpath", "//input[@aria-label='E-mail']", eMail , false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Reset Password", "xpath", "//div[@class='v-btn__content']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("An email has been sent message...", "xpath","//div[@class='v-messages__message']", ParentTest, "no_jira");
            if (FAIL) { return;}     
        Thread.sleep(500);  

        Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter email address > " + eMail, "id", "search", eMail, FAIL, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Click on 'GO'", "xpath","//button[@value='Search for public inbox for free']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click on the latest email 'Reset Your Password'", "xpath","//td[normalize-space()='Reset Your Password']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Swith_to_Frame("Swith to 'password reset' iframe", "xpath", "//iframe[@id='html_msg_body']", ParentTest, "no_jira");
            if (FAIL) { return;}
        //Element_By_Path_Click("Click on the 'reset password' > 'here'", "xpath","//a[contains(text(),'here')]", ParentTest, "no_jira");
        Element_By_Path_Click("Click on the 'reset password'", "xpath","//a[contains(text(),'Reset your')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Set<String> tabs  = d1.getWindowHandles();
        Iterator<String> it = tabs.iterator();
        String parentId = it.next();
        String childId = it.next();
        String childThreeId = it.next();
        d1.switchTo().window(childThreeId);

        //Scenario 1: Admin: At least 15 characters requirement is not fulfilled
        fifteenCharacters();

        //Scenario 2: Admin: An uppercase character requirement is not fulfilled
        upperCaseCharacter();
        //Scenario 3: Admin: An lowercase character requirement is not fulfilled
        lowerCaseCharacter();
        //Scenario 4: Admin: A number or special character requirement is not fulfilled
        numberOrSpecialCharacter();
        //Scenario 5: Admin: Passwords do not match
        passwordsDontMatch();
        //Scenario 6: Admin: Setting Valid password with all requirements after Password reset (Happy Path)
        setNewValidPassword();
        //Clicking on the Set Password button
        clickSetPassword();
        //Admin User logging in with the registered email and new password
        adminUserLogin();

    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }   
    } 

    //Scenario 1: Admin: At least 15 characters requirement is not fulfilled
    private void fifteenCharacters() {  
    try {    
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password " + passWord1, "css", "[aria-label='Password']", passWord1, false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + passWord1, "css", "[aria-label='Confirm Password']", passWord1, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Get Error Message > expected: 'At least 15 character'", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    }  
    
    //Scenario 2: Admin: An uppercase character requirement is not fulfilled
    private void upperCaseCharacter() {  
    try {    
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password " + passWord2, "css", "[aria-label='Password']", passWord2, false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + passWord2, "css", "[aria-label='Confirm Password']", passWord2, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Get Error Message > expected: 'uppercase character'", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 3: Admin: A lowercase character requirement is not fulfilled
    private void lowerCaseCharacter() {     
    try {    
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password " + passWord3, "css", "[aria-label='Password']", passWord3, false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + passWord3, "css", "[aria-label='Confirm Password']", passWord3, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Get Error Message > expected: 'lowercase character'", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 4: Admin: A number or special character requirement is not fulfilled
    private void numberOrSpecialCharacter() {
    try {    
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password " + passWord4, "css", "[aria-label='Password']", passWord4, false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + passWord4, "css", "[aria-label='Confirm Password']", passWord4, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Get Error Message > expected: 'number or special character'", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 5: Admin: Passwords do not match 
    private void passwordsDontMatch() {   
    try {    

        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password " + "Password_12345_A", "css", "[aria-label='Password']", "Password_12345_A", false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + "Password_12345_B", "css", "[aria-label='Confirm Password']", "Password_12345_B", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Text("Get Error Message > expected: 'Passwords don't match'", "xpath", "//div[contains(@class, 'v-messages__message')]", ParentTest, "no_jira"); 
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario : Setting new Valid password with all requirements after password reset (Happy Path)
    private void setNewValidPassword() {  
    try {    
//Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter valid Password " + passWord6, "css", "[aria-label='Password']", passWord6, false, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password " + passWord6, "css", "[aria-label='Confirm Password']", passWord6, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='blue_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Confirm Password Password don't match Error Message is not displayed", "xpath", "//div[@class='v-messages theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Clicking on the Set Password button and entering Admin Panel Page
    private void clickSetPassword() {
    try {    
        Wait_For_Element_By_Path_Presence("Wait for set password button to enable", "xpath", "//div[contains(text(),'Set Password')]", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on Set Password", "xpath", "//div[contains(text(),'Set Password')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");      
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Admin User logging in with the registered email and new password
    private void adminUserLogin() {    
    try {    
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Email ", "css", "[aria-label='E-mail']", eMail, false, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord6, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest, "no_jira");             
    } catch (Exception ex){}   // =============================================  
    } 
 }   
    
    

