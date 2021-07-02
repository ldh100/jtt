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
import org.json.JSONObject;

class AP3_password extends AP3_GUI {
    protected AP3_password (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        New_ID = a.New_ID;
        app = a.app;
        SITE = a.SITE;
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        DH_MENU_ID = a.DH_MENU_ID;
        SECTOR = a.SECTOR;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }        
    private final String eMail = "ds_" + New_ID + "@mailinator.com";
    private final String passWord1="Dhruv891111111"; //At least 15 characters
    private final String passWord2="dhruvseth251215"; //An uppercase character
    private final String passWord3="DHRUVSETH251215"; //A lowercase character
    private final String passWord4="DhruvsethAutomation"; //A number or a special character
    private final String passWord5="DhruvsethAuto2!"; // Valid password
    private final String passWord6="DhruvsethAuto2!0"; // New Valid password
    private final String passWord7="DhruvQA7"; // At least 9 characters
    
    protected void run()  {
//<editor-fold defaultstate="collapsed" desc="comment">
//milo.a@mailsac.com Admin
//milo.d@mailsac.om Delivery Manager
//milo.sm@mailsac.com Site Manager
//Password is Test1234

//**AUT-845 After creating an Admin user, sign up to Ap3 with the new user and login to ap3 with the new user **

/*
clickNewUser();
//Selecting role as admin and creating a new admin user
createNewAdminUser();
logout();
//Entering mailinator and clicking on the email
enterMailnator();
// Click on email "You have received a invite to log into the Admin Panel!"
clickEmailInviteToLogin();
Thread.sleep(1000);
Set<String> windows = d1.getWindowHandles();
Iterator<String> it = windows.iterator();
String parentId = it.next();
String childId = it.next();
String childThreeId = it.next();
Thread.sleep(1000);
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
//Scenario 6: Admin: Setting Valid password with all requirements (Happy Path)
setValidPassword();
//Clicking on the Set Password button
clickSetPassword();
_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
ap3LoginPage();
//Admin User logging in with the registered email and new password
adminUserLogin();
logout();

// AUT-840 As an Admin, I can reset my password and login to Ap3 with the new password   **
forgotPassWord();
enterMailnator();
clickEmailResetPassword();
Thread.sleep(5000);
windows = d1.getWindowHandles();
it = windows.iterator();
parentId = it.next();
childId = it.next();
childThreeId = it.next();
Thread.sleep(1000);
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
Thread.sleep(5000);
_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
//Admin User logging in with the registered email and new password (After reset Password)
ap3LoginPage();
adminUserLoginOldPassword();
adminUserLoginAfterResetPassword();
logout();
ap3LoginPage();//can be deleted


Admin_IDLogin();
SearchUser();
String U_ID=getU_ID();
click_User_Inactive();
getUser_API(U_ID);
click_User_Active();
getUser_API(U_ID);
SearchUser();
deleteUser();
Refresh("Refresh, ParentTest, "no_jira");
verify_User_Deleted_API(U_ID);

//logout();
//ap3LoginPage();

*/

// AUT-847 After creating CDL delivery manager user, sign up to Ap3 with the new user and login to ap3 with the new user **

// Admin_IDLogin();

/*
clickNewUser();
createNewCDLDeliveryManager();
logout();
//Entering mailinator and clicking on the email
enterMailnator();
Thread.sleep(1000);
// Click on email "You have received a invite to log into the Admin Panel!"
clickEmailInviteToLogin();
Thread.sleep(1000);

Set<String> windows = d1.getWindowHandles();
Iterator<String> it = windows.iterator();
String parentId = it.next();
String childId = it.next();
String childThreeId = it.next();
Thread.sleep(1000);
d1.switchTo().window(childThreeId);

/*
windows = d1.getWindowHandles();
it = windows.iterator();
parentId = it.next();
childId = it.next();
childThreeId = it.next();

//d1.switchTo().window(childId).close();
//d1.switchTo().window(parentId).close();
d1.switchTo().window(childThreeId);
*/

/*
//Scenario 1: CDL Delivery Manager: At least 9 characters requirement is not fulfilled
nineCharacters();
//Scenario 2: CDL Delivery Manager: An uppercase character requirement is not fulfilled
upperCaseCharacter();
//Scenario 3: CDL Delivery Manager: An lowercase character requirement is not fulfilled
lowerCaseCharacter();
//Scenario 4: CDL Delivery Manager: A number or special character requirement is not fulfilled
numberOrSpecialCharacter();
//Scenario 5: CDL Delivery Manager: Passwords do not match
passwordsDontMatch();
//Scenario 6: CDL Delivery Manager: Setting Valid password with all requirements (Happy Path)
setValidPassword();
//Clicking on the Set Password button
clickSetPassword();
_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
ap3LoginPage();
//CDL Delivery Manager User logging in with the registered email and new password
cdlSiteUserLogin();
logout();

//** AUT-842 As a CDL Delivery Manager, I can reset my password and login to Ap3 with the new password
forgotPassWord();

enterMailnator();
clickEmailResetPassword();
Thread.sleep(5000);

windows = d1.getWindowHandles();
it = windows.iterator();
parentId = it.next();
childId = it.next();
childThreeId = it.next();
//d1.switchTo().window(childId).close();
//d1.switchTo().window(parentId).close();
d1.switchTo().window(childThreeId);

//Scenario 1: CDL Delivery Manager: At least 9 characters requirement is not fulfilled
nineCharacters();
//Scenario 2: CDL Delivery Manager: An uppercase character requirement is not fulfilled
upperCaseCharacter();
//Scenario 3: CDL Delivery Manager: An lowercase character requirement is not fulfilled
lowerCaseCharacter();
//Scenario 4: CDL Delivery Manager: A number or special character requirement is not fulfilled
numberOrSpecialCharacter();
//Scenario 5: CDL Delivery Manager: Passwords do not match
passwordsDontMatch();
//Scenario 6: CDL Delivery Manager: Setting Valid password with all requirements after Password reset (Happy Path)
setNewValidPassword();
//Clicking on the Set Password button
clickSetPassword();

Thread.sleep(5000);

_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
//Admin User logging in with the registered email and new password (After reset Password)
ap3LoginPage();
cdlSiteUserLoginOldPassword();
cdlSiteUserLoginAfterResetPassword();
logout();
ap3LoginPage();

Thread.sleep(1000);
Admin_IDLogin();
SearchUser();
String U_ID=getU_ID();
click_User_Inactive();
getUser_API(U_ID);
click_User_Active();
getUser_API(U_ID);
SearchUser();
deleteUser();

Refresh("Refresh, ParentTest, "no_jira");
verify_User_Deleted_API(U_ID);

logout();
*/
//AUT-846: After creating Site manager user, sign up to Ap3 with the new user and login to ap3 with the new user //**

//Admin_IDLogin();
/*
clickNewUser();
createNewSiteManager();
logout();
//Entering mailinator and clicking on the email
enterMailnator();
// Click on email "You have received a invite to log into the Admin Panel!"
//clickEmailInviteToLogin();

Wait_Element_Visible("Click on the email", "xpath","//td[contains(text(),'You have received an invite to log into the Admin ')]", ParentTest, "no_jira");
Refresh("Refresh, ParentTest, "no_jira");
Thread.sleep(10000);
//Refresh("Refresh, ParentTest, "no_jira");
//Element_By_Path_Text("Click on the email", "xpath","//td[contains(text(),'You have received an invite to log into the Admin ')]", ParentTest, "no_jira");
//if (FAIL) { return;}
Element_By_Path_Click("Click on the email", "xpath","//td[contains(text(),'You have received an invite to log into the Admin ')]", ParentTest, "no_jira");
if (FAIL) { return;}
Swith_to_Frame("Invite to log in Admin Panel", "xpath", "//iframe[@id='html_msg_body']", ParentTest, "no_jira");
if (FAIL) { return;}
Element_By_Path_Click("Click here to set your password", "xpath","//a[contains(text(),'here')]", ParentTest, "no_jira");
if (FAIL) { return;}

Thread.sleep(1000);

Set<String> windows = d1.getWindowHandles();
Iterator<String> it = windows.iterator();
String parentId = it.next();
String childId = it.next();
String childThreeId = it.next();
Thread.sleep(1000);
d1.switchTo().window(childThreeId);

/*
windows = d1.getWindowHandles();
it = windows.iterator();
parentId = it.next();
childId = it.next();
childThreeId = it.next();
//d1.switchTo().window(childId).close();
//d1.switchTo().window(parentId).close();
d1.switchTo().window(childThreeId);
*/

/*
//Scenario 1: Site Manager: At least 9 characters requirement is not fulfilled
nineCharacters();
//Scenario 2: Site Manager: An uppercase character requirement is not fulfilled
upperCaseCharacter();
//Scenario 3: Site Manager: An lowercase character requirement is not fulfilled
lowerCaseCharacter();
//Scenario 4: Site Manager: A number or special character requirement is not fulfilled
numberOrSpecialCharacter();
//Scenario 5: Site Manager: Passwords do not match
passwordsDontMatch();
//Scenario 6: Site Manager: Setting Valid password with all requirements (Happy Path)
setValidPassword();
//Clicking on the Set Password button
clickSetPassword();
Thread.sleep(1000);
_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
ap3LoginPage();
cdlSiteUserLogin();
logout();
/*
//** AUT-843 As a Site Manager, I can reset my password and login in to Ap3 with the new password
/*
forgotPassWord();

enterMailnator();
clickEmailResetPassword();

windows = d1.getWindowHandles();
it = windows.iterator();
parentId = it.next();
childId = it.next();
childThreeId = it.next();
//d1.switchTo().window(childId).close();
//d1.switchTo().window(parentId).close();
d1.switchTo().window(childThreeId);

//Scenario 1: CDL Delivery Manager: At least 9 characters requirement is not fulfilled
nineCharacters();
//Scenario 2: CDL Delivery Manager: An uppercase character requirement is not fulfilled
upperCaseCharacter();
//Scenario 3: CDL Delivery Manager: An lowercase character requirement is not fulfilled
lowerCaseCharacter();
//Scenario 4: CDL Delivery Manager: A number or special character requirement is not fulfilled
numberOrSpecialCharacter();
//Scenario 5: CDL Delivery Manager: Passwords do not match
passwordsDontMatch();
//Scenario 6: CDL Delivery Manager: Setting Valid password with all requirements after Password reset (Happy Path)
setNewValidPassword();
//Clicking on the Set Password button
clickSetPassword();

Thread.sleep(5000);

_t++; Thread.sleep((long)sleep);Close_Current_Tab_switch_To_1st("Close child window, ParentTest, "no_jira");
d1.switchTo().window(childId).close();
d1.switchTo().window(parentId);
//Admin User logging in with the registered email and new password (After reset Password)
ap3LoginPage();
cdlSiteUserLoginOldPassword();
cdlSiteUserLoginAfterResetPassword();
logout();

ap3LoginPage();
Thread.sleep(1000);
Admin_IDLogin();
SearchUser();
String U_ID=getU_ID();
click_User_Inactive();
getUser_API(U_ID);
click_User_Active();
getUser_API(U_ID);
SearchUser();
deleteUser();

Refresh("Refresh, ParentTest, "no_jira");
verify_User_Deleted_API(U_ID);
logout();
*/
//oldUsersLogin();

//AUT-844 As an existing user (admin or site manager or delivery manager), I can still use my old password (rules) to sign in
//oldUsersLogin();
/*
Admin_IDLogin();
SearchUser();
//String U_ID=getUsers_ID();
click_User_Inactive();
getUsers_API(U_ID);
click_User_Active();
getUsers_API(U_ID);

*/
//</editor-fold>
    } //Run time closing bracket so add all the methods before this..      
    
    //AUT-840 : As an Admin, I can reset my password and login to Ap3 with the new password    
    protected void ap3LoginPage() {
    try {    
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("AP3 Login page", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Welcome to >", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Sign In Text", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
    } catch (Exception ex){}   // =============================================  
    } 
    
    /**
     * 1) Go to the Ap3 login screen as ADMIN
     * 2) Click on Forgot password 
     * 3) Enter a non-registered email and click on reset password
     * Expected: Could not reset your password, contact support.
     * Enter a registered email
     * Click on Reset password
    */
    //AUT-840

    private void forgotPassWord() {      
    try {    
        String eMail1="testautomation598@mailinator.com";
        //String eMail2="testautomation895@mailinator.com";
        Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Click on forgot password", "xpath","//div[@class='Subtitle-2-Primary-Left']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click on forgot password", "xpath","//div[@class='Subtitle-2-Primary-Left']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        //Find_Text("'Forgot Your Password'", "    Forgot Password?", true, ParentTest, "no_jira");     
            //if (FAIL) { return;} 
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "//input[@aria-label='E-mail']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}          
        Element_By_Path_Text_Enter("Enter Unregistered Email", "xpath", "//input[@aria-label='E-mail']", eMail1 , true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Reset Password", "xpath", "//div[@class='v-btn__content']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for error message", "xpath","//*[contains(text(), 'Could not reset your password, contact support.')]", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_By_Path_Text ("Unregistered email Error Message... Text", "xpath", "//*[contains(text(), 'Could not reset your password, contact support.')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            Thread.sleep(500);
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", "//input[@aria-label='E-mail']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter registered Email", "xpath", "//input[@aria-label='E-mail']", eMail , true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Reset Password", "xpath", "//div[@class='v-btn__content']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("An email has been sent message...", "xpath","//div[@class='v-messages__message']", ParentTest, "no_jira");
            if (FAIL) { return;}     
         Thread.sleep(500);   
    } catch (Exception ex){}   // =============================================  
    } 
                
    //User logout
    private void logout() {
    try {   
        Element_By_Path_Click("Click 'User Name'", "css", "div[class='v-btn__content'] div[class='flex xs12']", ParentTest, "no_jira");
            if (FAIL) {return;}
        Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", ParentTest, "no_jira");
            if (FAIL) {return;}   
        Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Enter Mailinator > email > click on go
    private void enterMailnator() {
    try {    
        //String eMail = "testautomation895@mailinator.com";
        Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", ParentTest, "no_jira");
            if (FAIL) { return;}
        //Thread.sleep(500);
        Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@id='addOverlay']",eMail, FAIL, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Click("Click on go", "xpath","//button[@id='go-to-public']", ParentTest, "no_jira");
         Thread.sleep(1000);
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    // Click on email "You have received a invite to log into the Admin Panel!"
    private void clickEmailInviteToLogin() {
    try {    
        //Refresh("Refresh", ParentTest, "no_jira");   
        Wait_For_Element_By_Path_Presence("Click on the email", "xpath","(//*[contains(text(), 'You have received a invite to log into the Admin Panel!')])[1]", ParentTest, "no_jira");            
        Refresh("Refresh", ParentTest, "no_jira"); 
Thread.sleep(30000);
        //Refresh("Refresh, ParentTest, "no_jira");
        Element_By_Path_Click("Click on the email", "xpath","(//*[contains(text(), 'You have received a invite to log into the Admin Panel!')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Swith_to_Frame("Invite to log in Admin Panel", "xpath", "//iframe[@id='html_msg_body']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click here to set your password", "xpath","//a[contains(text(),'here')]", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    // Click on email "Reset Your Password"
    private void clickEmailResetPassword() {
    try {    
        Wait_For_Element_By_Path_Presence("Click on the email", "xpath", "//td[normalize-space()='Reset Your Password']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Refresh("Refresh", ParentTest, "no_jira");
        Thread.sleep(30000);  
        //Refresh("Refresh, ParentTest, "no_jira");
        Element_By_Path_Click("Click on the email", "xpath","//td[normalize-space()='Reset Your Password']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Swith_to_Frame("Click on password reset", "xpath", "//iframe[@id='html_msg_body']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click on the reset password", "xpath","//a[contains(text(),'here')]", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 1: Admin: At least 15 characters requirement is not fulfilled
    private void fifteenCharacters() {  
    try {    
        Thread.sleep(1000);
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord1, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord1, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
            Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    }  
    
    //Scenario 2: Admin: An uppercase character requirement is not fulfilled
    private void upperCaseCharacter() {  
    try {    
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord2, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord2, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 3: Admin: An lowercase character requirement is not fulfilled
    private void lowerCaseCharacter() {     
    try {    
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord3, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord3, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
                Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 4: Admin: A number or special character requirement is not fulfilled
    private void numberOrSpecialCharacter() {
    try {    
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord4, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord4, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 5: Admin: Passwords do not match 
    private void passwordsDontMatch() {   
    try {    
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord4, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Confirm Password Error Message", "xpath", "//div[@class='v-messages__message']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 6: Setting Valid password with all requirements (Happy Path)
    private void setValidPassword() {      
    try {   
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter valid Password", "css", "[aria-label='Password']", passWord5, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='blue_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Verify Password don't match Error Message is not displayed", "xpath", "//div[@class='v-messages theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario : Setting new Valid password with all requirements after password reset (Happy Path)
    private void setNewValidPassword() {  
    try {    
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear Password Field", "css", "[aria-label='Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter valid Password", "css", "[aria-label='Password']", passWord6, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear Confirm Password Field", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord6, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='blue_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Confirm Password Password don't match Error Message is not displayed", "xpath", "//div[@class='v-messages theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Scenario 7: At least 9 characters requirement is not fulfilled
    private void nineCharacters() {  
    try {    
        Thread.sleep(1000);
        Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", passWord7, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Confirm Password", "css", "[aria-label='Confirm Password']", passWord7, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//ul[@class='list_style']", ParentTest, "no_jira");                 
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click on Confirm Password", "css", "[aria-label='Confirm Password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                    
        Element_By_Path_Text("Error Message:", "xpath", "//*[@class='error_state']", ParentTest, "no_jira");
            if (FAIL) { return;}
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
            if (FAIL) { return;}      
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Admin User logging in with the registered email and new password
    private void adminUserLogin() {    
    try {    
        //Page_URL("AP3 Login page", ParentTest, "no_jira");             
            //if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter Registered Admin Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest, "no_jira");             
            if (FAIL) { return;}   
        //Element_By_Path_Text("Wait for 'Hi Username...' text", "xpath", "//*[contains(text(),'Hi DS TestAutomation')]", ParentTest, "no_jira");             
            //if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Admin User logging in with the registered email and password reset
    private void adminUserLoginAfterResetPassword() {    
    try {    
       Page_URL("AP3 Login page", ParentTest, "no_jira");             
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Registered Admin Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord6, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest, "no_jira");             
            if (FAIL) { return;}   
        Element_By_Path_Text("Wait for 'Hi Username...' text", "xpath", "//*[contains(text(),'Hi DS_Admin TestQA')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Admin User logging in with the registered email and old password after password reset
    private void adminUserLoginOldPassword() { 
    try {    
        //Page_URL("AP3 Login page", ParentTest, "no_jira");             
            //if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter Registered Admin Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Error Message:", "xpath", "//div[@class='v-messages__message']", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
Thread.sleep(1000);
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Me: my login
    private void Admin_IDLogin() {
    try  {    
        Element_By_Path_Text_Enter("Enter Valid Email", "css", "[aria-label='E-mail']", ADMIN_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", ADMIN_PW, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}                       
    } catch (Exception ex){}   // =============================================  
    } 
    
    private void cdlSiteUserLogin() {     
    try {    
        //Page_URL("AP3 Login page", ParentTest, "no_jira");             
            //if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter Registered Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(10000);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_By_Path_Text("Wait for Welcome...' text", "xpath", "//div[@class='H4-Primary-Left']", ParentTest, "no_jira");             
            if (FAIL) { return;}   
        //Element_By_Path_Text("Wait for 'Hi Username...' text", "xpath", "//*[contains(text(),'Hi DS TestAutomation')]", ParentTest, "no_jira");             
            //if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } 
    
    //CDL Delivery Manager User logging in with the registered email and old password after password reset
    private void cdlSiteUserLoginOldPassword() {   
    try {    
        //Page_URL("AP3 Login page", ParentTest, "no_jira");             
            //if (FAIL) { return;}   
        Element_By_Path_Text_Enter("Enter Registered Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord5, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Error Message:", "xpath", "//div[@class='v-messages__message']", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
Thread.sleep(10000);
    } catch (Exception ex){}   // =============================================  
    } 
    
    //CDL Delivery Manager User logging in with the registered email and password reset
    private void cdlSiteUserLoginAfterResetPassword() {    
    try {    
       Page_URL("AP3 Login page", ParentTest, "no_jira");             
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Registered Email", "css", "[aria-label='E-mail']", eMail, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWord6, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(10000); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
Thread.sleep(1000);
        Element_By_Path_Text("Wait for Welcome...' text", "xpath", "//div[@class='H4-Primary-Left']", ParentTest, "no_jira");             
            if (FAIL) { return;}   
Thread.sleep(1000);    
    } catch (Exception ex){}   // =============================================  
    } 
    
    // searching user with email address
    private void SearchUser() {  
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Users' Click", "xpath", "//*[contains(text(), 'Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        To_Top("Scroll to page Top",  ParentTest,"no_jira");
            if (FAIL) { return;} 
            
        Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", "Not Existing User", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("User Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", eMail, false, ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira");             
                    if (FAIL) { return;}
            } 
        Element_By_Path_Click("User Email Click", "xpath", "//div[text()='" + eMail + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'v-progress-circular')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Delete the user 
    private void deleteUser() {       
    try {    
        Element_By_Path_Text("Find 'Delete User' Text", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }             
        Element_By_Path_Click("Click 'Delete User'", "xpath", "//div[contains(@class, 'Remove-User-Btn mt-4')]", ParentTest, "no_jira"); 
            if (FAIL) { return; }  
        Element_E1_Find("Find 'Delete' dialog", "xpath", "//div[@class='confirm-dialog v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}    // Find fragment              
        Element_Child_Text("Find 'Delete..' Title", e1, "xpath", "//*[@class='H4-Secondary-Center']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_Child_Text("Find 'Delete..' message", e1, "xpath", "//*[@class='Body-1-Black-High-Emphasis-Left']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 

        Element_Child_Text("Find dialog 'Edit' button", e1, "xpath", ".//*[text()='CANCEL']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_Child_Text("Find dialog 'Cancel' button", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_Child_Click("Click dialog 'Delete'", e1, "xpath", ".//*[text()='DELETE']", ParentTest, "no_jira");
            if (FAIL) { return;}    
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page load...", "css", "[aria-label='Search Users']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", eMail, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Deleted Admin 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}     
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Making the user Inactive after search
    private void click_User_Inactive() {  
    try {    
        Element_By_Path_Click("Click 'User LinkText'", "linkText", "Users", ParentTest, "no_jira"); 
            if (FAIL) { return; } 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        //Element_By_Path_Input_Select_Clear("User Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
            //if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", eMail, false, ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("Click 'Inactive'", "xpath", "//div[@class='Option-Right-Not-Selected-Blue-Red']", ParentTest, "no_jira"); 
            if (FAIL) { return; }  
         Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text("Inactive Highlighted in Red", "xpath", "//div[@class='Subtitle-2-White-High-Emphasis-Center']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Refresh("Refresh", ParentTest, "no_jira");
Thread.sleep(5000);     
    } catch (Exception ex){}   // =============================================  
    } 
     
    //Making the user active after search
    private void click_User_Active() {  
    try {    
       // Element_By_Path_Click("Click 'User LinkText'", "linkText", "Users", ParentTest, "no_jira"); 
         //   if (FAIL) { return; } 
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        //Element_By_Path_Input_Select_Clear("User Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
            //if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search User Name", "css", "[aria-label='Search Users']", eMail, false, ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        List_L0("Users Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L0.size(); j++) {
                Element_Text("Users Data Row Text", L0.get(j), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("Click 'active'", "xpath", "//div[@class='Option-Left-Not-Selected-Blue-Red']", ParentTest, "no_jira"); 
            if (FAIL) { return; } 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Active Highlighted in Blue", "xpath", "//div[@class='Subtitle-2-White-High-Emphasis-Center']", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(5000);
        Refresh("Refresh", ParentTest, "no_jira");
Thread.sleep(5000);         
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Click on new user after logging in
    private void clickNewUser() { 
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Users' Click", "xpath", "//*[contains(text(), 'Users')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        To_Top("Scroll to page Top",  ParentTest,"no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Click("Add New Click 'User Name'", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Page_URL("New User page URL",  ParentTest,"no_jira");
            if (FAIL) { return;}              
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Selecting role as admin and creating a new admin user
    private void createNewAdminUser() { 
    try {    
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest,"no_jira");
             if (FAIL) { return;}        
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Admin")){ T_Index = i; }
            }                               
        Element_Click("Select 'Admin'", L1.get(T_Index),  ParentTest,"no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);
        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "DS_Admin", false,  ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "TestQA", false,  ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']",eMail , false,  ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "1111111111", false,  ParentTest,"no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]",  ParentTest, "no_jira");             
            if (FAIL) { return;}   
        //Thread.sleep(5000);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(5000);
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Selecting role as CDL Delivery Manager and creating a new CDL Delivery Manager user
    protected void createNewCDLDeliveryManager() { 
    try {    
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira");
             if (FAIL) { return;}        
        Page_URL("New User page URL", ParentTest, "no_jira");
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");             
                if (FAIL) { return;}
                if(t.contains("CDL Delivery Manager")){ T_Index = i; }
            }
        Element_Click("Select 'CDL Delivery Manager'", L1.get(T_Index),  ParentTest,"no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500); 
        
        //Enter user details         
        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "DS_CDL", false,  ParentTest,"no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "TestQA", false,  ParentTest,"no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", eMail, false,  ParentTest,"no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4165551234", false, ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Scroll_XY("Scroll to Site ", 0, 750, ParentTest, "no_jira");  
        Find_Text("Find 'Choose Sites' text", "Choose Sites", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Search Site Name", "xpath", "//input[@aria-label='Search Sites']",SITE, false, ParentTest,"no_jira");
            if (FAIL) { return;}    
        
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest,"no_jira"); 
            if (FAIL) { return;} 
        Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L1.size(); j++) {  
        Element_Click("Check Site " + j, L1.get(j), ParentTest,"no_jira"); 
            if (FAIL) { return;}                                         
            }
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest,"no_jira"); 
            if (FAIL) { return;}
         
        Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        
            Thread.sleep(5000);              
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest,"no_jira");             
            if (FAIL) { return;}    
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(5000);
    } catch (Exception ex){}   // =============================================  
    }  
    
    //Selecting role as CDL Delivery Manager and creating a new CDL Delivery Manager user
    protected void createNewSiteManager() { 
    try {    
        Element_By_Path_Attribute("Role selection Prompt", "css", "[aria-label='Role']", "placeholder", ParentTest, "no_jira");
             if (FAIL) { return;}        
        Page_URL("New User page URL", ParentTest, "no_jira");
        Element_By_Path_Click("Open Role combobox", "css", "[role='combobox']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'Role' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                     
        Element_Child_List_L1("Role list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Role Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");             
                if (FAIL) { return;}
                if(t.contains("Site Manager")){ T_Index = i; }
            }
        Element_Click("Select 'Site Manager'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}  // ^^^ select Role to show buttons and Definitioms sectoions update 
        Thread.sleep(500);
        
        //Enter user details         
        Element_By_Path_Text_Enter("Enter Eirst Name", "css", "[aria-label='First Name']", "DS_Site", false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Last Name", "css", "[aria-label='Last Name']", "TestQA", false, ParentTest, "no_jira");
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Email", "css", "[aria-label='E-mail']", eMail, false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Phone", "css", "[aria-label='Phone Number']", "4160000000", false, ParentTest, "no_jira");
            if (FAIL) { return;} 
            
        Scroll_XY("Scroll to Site ", 0, 750, ParentTest, "no_jira");  
        Find_Text("Find 'Choose Sites' text", "Choose Sites", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Click 'Choose Sites'", "xpath", "//div[@class='Body-1-Primary-Left Permissions-Link']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_E1_Find("Find 'Choose Sites' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");    
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Search Site Name", "xpath", "//input[@aria-label='Search Sites']", SITE, false, ParentTest,"no_jira");
            if (FAIL) { return;}    
        
                                    
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest,"no_jira"); 
            if (FAIL) { return;} 
        Element_Child_List_L1("Found/Select Sites count", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int j = 0; j < L1.size(); j++) {  
        Element_Click("Check Site " + j, L1.get(j), ParentTest,"no_jira"); 
            if (FAIL) { return;}                                         
            }
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest,"no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Continue'", "xpath", ".//*[text()='Continue']", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        
            Thread.sleep(5000);              
        Element_By_Path_Click("Click 'Create User'", "xpath", "//*[contains(text(), 'Create User')]", ParentTest,"no_jira");             
            if (FAIL) { return;}    
        Thread.sleep(5000); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(5000);
    } catch (Exception ex){}   // =============================================  
    } 
    
    //AUT-844 As an existing user (admin or site manager or delivery manager), I can still use my old password (rules) to sign in
    private void oldUsersLogin() { 
        ap3LoginPage();
        
        String passWordOld="Test1234";
        String oldUsers[]=new String[3];
        oldUsers[0]="milo.a@mailsac.com"; //Admin
        oldUsers[1]="milo.d@mailsac.com"; //Delivery Manager
        oldUsers[2]="milo.sm@mailsac.com"; //Site Manger       
    try {    
        for (String emails:oldUsers) {
        Element_By_Path_Text_Enter("Enter Registered Admin Email", "css", "[aria-label='E-mail']", emails, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Text_Enter("Enter Valid Password with new requirements", "css", "[aria-label='Password']", passWordOld, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(1000);
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}        
        logout();    
            }                             
    } catch (Exception ex){}   // =============================================  
    } 
    
    //Getting the User ID from URL
    private String getU_ID() throws Exception {
         //EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == User API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        String U_ID = "";                             
         Page_URL("User details URL", ParentTest, "no_jira"); 
          if(t.contains("/")){
            U_ID = t.substring(t.lastIndexOf("/") + 1);
            
            //getUsers_API(U_ID);            
          }
            return U_ID;
     }
    
    //Getting the user api and validating if its active or not
    private void getUser_API(String U_ID) {
    try {    
        Call_API("Call /User/ API", "Bearer " + AP3_TKN, BaseAPI + "/user/" + U_ID, true, ParentTest, "no_jira" );
            JSONObject json = new JSONObject(t); 
            JSONObject meta = json.getJSONObject("meta");   
          
        boolean checkdisabled=false;
          if(json.has("is")){
          JSONObject isObject = json.getJSONObject("is");  
           checkdisabled= isObject.getBoolean("disabled");
          }                             /* Verify if user is active */
       //meta = json.getJSONObject("is");   
       
    
       
       System.err.println("Value "+checkdisabled);
       
       if(checkdisabled==false)                
       { 
           //System.err.println("Pass");           
             _t++;
              _p++; EX += _t + "\t" + "User is active" + "\t" + "-" + "\t" + "-" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
       }else if(checkdisabled==true)      
       { // Print Brand is visible.
           //System.err.println("Fail");
          _t++;
          _p++; EX += _t + "\t" + "User is inactive" + "\t" + "-" + "\t" + "User is Inactive" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
    } catch (Exception ex){}   // =============================================  
    } 
            
    private void verify_User_Deleted_API(String U_ID) {
    try {    
          Call_API("Call /User/ API", "Bearer " + AP3_TKN, BaseAPI + "/user/" + U_ID, true, ParentTest, "no_jira");
             JSONObject json = new JSONObject(t); 
             
         String Uemail=json.getString("email");
         System.out.println(Uemail);
         if(Uemail.contains("deleted")){
            _t++;
            _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "User is deleted" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         }
         else {
             _t++;
          _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "User is not deleted yet" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         }
    } catch (Exception ex){}   // =============================================  
    } 
}

