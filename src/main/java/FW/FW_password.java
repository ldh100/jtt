/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import WO.*;
import A.TWeb;
import static A.A.*;
import static FW.FW.ADMIN_ID;
import static FW.FW.ADMIN_PW;
import static WO.WO.*;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_password {
    public static void run() throws InterruptedException { 
        //*******forgot password************//
        
        String passWord = "Test123*";
        String eMail = "test.testadc@mailinator.com";
        
        FW_logout.run();
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on forgot password", "xpath","//a[@href='/login/forgot_password']", "no_jira");
        _t++; Thread.sleep((long) sleep);TWeb.Find_Text("'Forgot Your Password'", "Forgot Your Password", true, "no_jira");
      
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@type='text']", eMail, FAIL, "no_jira");
       
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on forgot password", "xpath","//span[contains(text(),'Send Resend Link')]", "no_jira");
       
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", " no_jira");
      //  Thread.sleep(500);
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@id='addOverlay']", eMail, FAIL, "no_jira");
    
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on go", "xpath","//button[@id='go-to-public']", "no_jira");
         Thread.sleep(1000);
         
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the email", "xpath","(//*[contains(text(), 'Reset your password')])[1]", "no_jira");
 
        _t++; Thread.sleep((long) sleep);TWeb.Swith_to_Frame("click on password reset", "xpath", "//iframe[@id='html_msg_body']", "no_jira");
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the reset password", "xpath","//a[contains(text(),'Reset password')]", "no_jira");
        Thread.sleep(1000);
        
        Set<String> windows = d1.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        String childThreeId = it.next();
        d1.switchTo().window(childThreeId);
 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-24']", passWord, false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Show password", "xpath", "//div[@label='New Password'] //button[@aria-label='append icon']", "no_jira"); 
      
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-34']", passWord, false, "no_jira");
       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Show password", "xpath", "//div[@label='Confirm New Password'] //button[@aria-label='append icon']", "no_jira");   

        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on reset password button", "xpath","//button[@type='button']", "no_jira");
      
        _t++; Thread.sleep((long)sleep);TWeb.Close_Current_Tab_switch_To_1st("Close child window", "no_jira");
   
        d1.switchTo().window(childId).close();
        d1.switchTo().window(parentId);
        
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "xpath", "//input[@type='text']",eMail, false, "no_jira"); 
      
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "xpath", "//input[@type='password']", passWord, false, "no_jira"); 
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Show password", "xpath", "//div[@label='Password'] //button[@aria-label='append icon']", "no_jira");   
          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In' button", "xpath", "//span[contains(text(), 'Sign In')]", "no_jira"); 
  
        
        //Generate automate password
        //giving password  creteria 
        //saving password
        
        
    
    }  
}
