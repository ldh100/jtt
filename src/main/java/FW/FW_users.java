/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_users {
    public static void run() throws InterruptedException { 
    
    String adminEmail = "testadx110@mailinator.com";
    String fwEmail = "testfwx110@mailinator.com";
    String partnerEmail = "testpx110@mailinator.com";
    String umEmail = "testux110@mailinator.com";
    
    String passWord = "Test123*";
    String user = "Delete";  
    
    _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
        if (FAIL) { return;} 
     
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//a[@href='/users/']", "no_jira");
    if (FAIL) { return;} 
    
    _t++; Thread.sleep((long)sleep); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
        Thread.sleep(500);
        
//         
//    //*************************************************************** Create FW manager *************************************************************   
//    // <editor-fold defaultstate="collapsed" desc="User - fw manager ">   
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on create user button", "xpath", "//span[contains(text(),'Create User')]", "no_jira");
//    if (FAIL) { return;} 
//
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("User information", "xpath", "//h3[contains(text(), 'User Information')]", "no_jira");
//    if (FAIL) { return;}  
//
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//div[@class='v-select__selections']", "no_jira");
//   if (FAIL) { return;} 
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//div[@role='listbox']/div[3]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(500);
//            
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("First name", "xpath", "//div[@label='*First Name'] //input[@type='text']", "FW FirstName", FAIL, "no_jira");
//    if (FAIL) { return;}           
//            
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Last name", "xpath", "//div[@label='*Last Name'] //input[@type='text']", "FW LastName", FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Email", "xpath", "//div[@label='*E-mail'] //input[@type='text']", fwEmail, FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Contact Number", "xpath", "//div[@label='*Contact Number'] //input[@type='text']", "1234567890", FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on approve checkbox ", "xpath", "//input[@aria-checked='false']", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(500);
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on create user", "xpath", "//span[contains(text(), ' Create User ')]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(5000);
//    // </editor-fold> 
//
//    
//    // ************************************************************** Create a restaurant partner ***************************************************
//    // <editor-fold defaultstate="collapsed" desc="User - RP ">  
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//span[contains(text(),'Create User')]", "no_jira");
//    if (FAIL) { return;} 
//
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("User information", "xpath", "//h3[contains(text(), 'User Information')]", "no_jira");
//    if (FAIL) { return;}  
//    
//    
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on Role", "xpath", "//div[@class='v-select__selections']", "no_jira");
//   if (FAIL) { return;} 
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on a Role partner", "xpath", "//div[@role='listbox']/div[1]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(500);
//            
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("First name", "xpath", "//div[@label='*First Name'] //input[@type='text']", "RP FirstName", FAIL, "no_jira");
//    if (FAIL) { return;}           
//            
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Last name", "xpath", "//div[@label='*Last Name'] //input[@type='text']", "RP LastName", FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Email", "xpath", "//div[@label='*E-mail'] //input[@type='text']", partnerEmail, FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Contact Number", "xpath", "//div[@label='*Contact Number'] //input[@type='text']", "1234567890", FAIL, "no_jira");
//    if (FAIL) { return;}
//
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on create user", "xpath", "//span[contains(text(), ' Create User ')]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(2000);
//    // </editor-fold> 
//    
//    
//    // ************************************************************** Create a Unit Manager  ********************************************************
//    // <editor-fold defaultstate="collapsed" desc="User - UM ">  
//       _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//span[contains(text(),'Create User')]", "no_jira");
//    if (FAIL) { return;} 
//
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("User information", "xpath", "//h3[contains(text(), 'User Information')]", "no_jira");
//    if (FAIL) { return;}  
//    
//    
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on Role", "xpath", "//div[@class='v-select__selections']", "no_jira");
//   if (FAIL) { return;} 
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on a Role unit Manager", "xpath", "//div[@role='listbox']/div[2]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(500);
//            
//     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("First name", "xpath", "//div[@label='*First Name'] //input[@type='text']", "UM FirstName", FAIL, "no_jira");
//    if (FAIL) { return;}           
//            
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Last name", "xpath", "//div[@label='*Last Name'] //input[@type='text']", "UM LastName", FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Email", "xpath", "//div[@label='*E-mail'] //input[@type='text']", umEmail, FAIL, "no_jira");
//    if (FAIL) { return;}
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Contact Number", "xpath", "//div[@label='*Contact Number'] //input[@type='text']", "1234567890", FAIL, "no_jira");
//    if (FAIL) { return;}
//
//    
//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on create user", "xpath", "//span[contains(text(), ' Create User ')]", "no_jira");
//    if (FAIL) { return;}  
//    Thread.sleep(3000);
//    // </editor-fold> 
//
//    
//    // ************************************************************** Create an admin user  *********************************************************
    // <editor-fold defaultstate="collapsed" desc="User - admin ">   
    
    
  
       _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//span[contains(text(),'Create User')]", "no_jira");
    if (FAIL) { return;} 

    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("User information", "xpath", "//h3[contains(text(), 'User Information')]", "no_jira");
    if (FAIL) { return;}  
    
    
     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on Role", "xpath", "//div[@class='v-select__selections']", "no_jira");
   if (FAIL) { return;} 
    
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on a Role partner", "xpath", "//div[@role='listbox']/div[4]", "no_jira");
    if (FAIL) { return;}  
    Thread.sleep(500);
            
     _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("First name", "xpath", "//div[@label='*First Name'] //input[@type='text']", "Admin FirstName", FAIL, "no_jira");
    if (FAIL) { return;}           
            
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Last name", "xpath", "//div[@label='*Last Name'] //input[@type='text']", "Admin LastName", FAIL, "no_jira");
    if (FAIL) { return;}
    
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Email", "xpath", "//div[@label='*E-mail'] //input[@type='text']", adminEmail, FAIL, "no_jira");
    if (FAIL) { return;}
    
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Contact Number", "xpath", "//div[@label='*Contact Number'] //input[@type='text']", "1234567890", FAIL, "no_jira");
    if (FAIL) { return;}

    
    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on create user", "xpath", "//span[contains(text(), ' Create User ')]", "no_jira");
    if (FAIL) { return;}  
    Thread.sleep(3000);

    // </editor-fold> 
    
    
    //*************************************************************** Setting the password **********************************************************
    // <editor-fold defaultstate="collapsed" desc="Set password ">   
       _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", " no_jira");
        Thread.sleep(500);
        if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@id='addOverlay']", adminEmail, FAIL, "no_jira");
        Thread.sleep(500);
        if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on go", "xpath","//button[@id='go-to-public']", "no_jira");
         Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the email", "xpath","(//td[contains(text(), 'Welcome to Foodworks!')])", "no_jira");
         Thread.sleep(1000);

        _t++; Thread.sleep((long) sleep);TWeb.Swith_to_Frame("click on password reset", "xpath", "//iframe[@id='html_msg_body']", "no_jira");
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the reset password", "xpath","//a[contains(text(),'Sign-in')]", "no_jira");
        Thread.sleep(1000);
        
        Set<String> windows = d1.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        String childThreeId = it.next();
        d1.switchTo().window(childThreeId);
 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-24']", passWord, false, "no_jira");
         Thread.sleep(500);
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Show password", "xpath", "//div[@label='New Password'] //button[@aria-label='append icon']", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-34']", passWord, false, "no_jira");
         Thread.sleep(500);
           _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Show password", "xpath", "//div[@label='Confirm New Password'] //button[@aria-label='append icon']", "no_jira"); 
            if (FAIL) { return;}    

        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on reset password button", "xpath","//button[@type='button']", "no_jira");
        Thread.sleep(1000);
        _t++; Thread.sleep((long)sleep);TWeb.Close_Current_Tab_switch_To_1st("Close child window", "no_jira");
      if (FAIL) { return;}   
        d1.switchTo().window(childId).close();
        d1.switchTo().window(parentId);    
        // </editor-fold> 
        
        
    // ************************************************************** Search field ******************************************************************
    // <editor-fold defaultstate="collapsed" desc="Search User ">   
      
        _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Search for a user", "xpath", "//input[@placeholder = 'Search']", "Rp", FAIL, url);
        if (FAIL) { return;}Thread.sleep(1000);
        _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear", "xpath", "//input[@placeholder = 'Search']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Search for a user", "xpath", "//input[@placeholder = 'Search']", "Foodworks manager", FAIL, url);
        if (FAIL) { return;}Thread.sleep(1000);
          _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear", "xpath", "//input[@placeholder = 'Search']", "no_jira");
          if (FAIL) { return;}
          _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Search for a user", "xpath", "//input[@placeholder = 'Search']", "Deactivated", FAIL, url);
        if (FAIL) { return;}Thread.sleep(1000);
         _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear", "xpath", "//input[@placeholder = 'Search']", "no_jira");
         if (FAIL) { return;}
         // </editor-fold> 
         
         
    // ************************************************************** Filtering Role ****************************************************************
    // <editor-fold defaultstate="collapsed" desc="Filter Role ">   
        
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the Role ", "xpath", "//div[@class='role-dropdown']", "no_jira");
         if (FAIL) { return;}Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the RP", "xpath", "//div[@role='listbox']/div[1]", "no_jira");
        if (FAIL) { return;}Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the UM", "xpath", "//div[@role='listbox']/div[2]", "no_jira");
         if (FAIL) { return;}Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the FM", "xpath", "//div[@role='listbox']/div[3]", "no_jira");
        if (FAIL) { return;} Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the admin", "xpath", "//div[@role='listbox']/div[4]", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the admin", "xpath", "//div[@role='listbox']/div[4]", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the FM", "xpath", "//div[@role='listbox']/div[3]", "no_jira");
        if (FAIL) { return;} Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the UM", "xpath", "//div[@role='listbox']/div[2]", "no_jira");
         if (FAIL) { return;}Thread.sleep(500);
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the RP", "xpath", "//div[@role='listbox']/div[1]", "no_jira");
        if (FAIL) { return;}Thread.sleep(500);
//         _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the Role dropdown", "xpath", "//div[@class='role-dropdown'] //div[@aria-expanded='true']", "no_jira");
//        if (FAIL) { return;}Thread.sleep(1000);
        
        _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the Role ", "xpath", "//div[@class='role-dropdown']", "no_jira");
        if (FAIL) { return;}Thread.sleep(500);
         // </editor-fold> 
         
         
    // ************************************************************** Filtering User Status *********************************************************
    // <editor-fold defaultstate="collapsed" desc="Filter User Status ">  
    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on user status", "xpath", "//div[@class='status-dropdown']", "no_jira");
    if(FAIL){return;}
    
    _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the Active", "xpath", "//div[contains(@class, 'menuable__content__active')]/div/div[1]", "no_jira");
    if (FAIL) { return;}Thread.sleep(500);
    _t++;Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on the Active", "xpath", "//div[contains(@class, 'menuable__content__active')]/div/div[2]", "no_jira");
    if (FAIL) { return;}Thread.sleep(500);
         
         
    // </editor-fold> 	
    
    
    //*************************************************************** Deactivate User *************************************************************
    // <editor-fold defaultstate="collapsed" desc="Deactivate user ">
//    _t++;Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Search for a user", "xpath", "//input[@placeholder = 'Search']", "delete", FAIL, url);
//    if (FAIL) { return;}Thread.sleep(1000);
//    
//    _t++; Thread.sleep((long) sleep); TWeb.List_L0("Users Data row Count", "tagName", "tr", "no_jira");  
//    
//    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click target Restaurant/Market", L0.get(2), "no_jira");
//            if (FAIL) { return;}    
//    Thread.sleep(1000);

//    _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click on users tab", "xpath", "//span[@class='dropdown']", "no_jira");
//    if (FAIL) { return;} 
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("Deactivate", "xpath", "//div[contains(text(),'Deactivate')]", "no_jira");
//    if (FAIL) { return;} 
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on deactivate", "xpath", "//div[contains(text(),'Deactivate')]", "no_jira");
//    if (FAIL) { return;} 
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("Deactivate", "xpath", "//h5[contains(text(),'Deactivate User?')]", "no_jira");
//    if (FAIL) { return;} 
//     
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text_Enter("Enter deactivate", "xpath", " //div[contains(@class, 'deactive')] //input[@type='text']", "Deactivate", FAIL, "no_jira");
//   
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Click("Click on deactivate", "xpath", "//div[@class='footer-button']/button[2]", "no_jira");
//    if (FAIL) { return;} 
//     Thread.sleep(1000);
//     
//    //look for the toast message
//    _t++; Thread.sleep((long)sleep);TWeb.Element_By_Path_Text("This account has been deactivated on ", "xpath", "//div[@role='alert']", "no_jira");
//     if (FAIL) { return;} 
     
     
    // </editor-fold> 
   
    
    
    }  
}
