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
/**
 *
 * @author Oleg.Spozito
 */
public class FW_password {
    public static void run() throws InterruptedException { 
        //*******forgot password************//
         _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click signout", "xpath","//*[@class='Caption-bold']", "no_jira");
        
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on forgot password", "xpath","//a[@href='/login/forgot_password']", "no_jira");
         Thread.sleep(500);
        
         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("'Forgot Your Password'", "Forgot Your Password", true, "no_jira");
         if (FAIL) { return;}
         
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@type='text']", "test.testadc@mailinator.com", FAIL, "no_jira");
        
         if (FAIL) { return;}
         Thread.sleep(500);
          _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on forgot password", "xpath","//span[contains(text(),'Send Resend Link')]", "no_jira");
         Thread.sleep(1000);
         if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Sign-in Prompt", "xpath", "//div[contains(text(),'A password reset link')]", "no_jira"); 
        if (FAIL) { return;}
         
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Go to mailinator", "https://www.mailinator.com", " no_jira");
        Thread.sleep(500);
        if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter email address", "xpath", "//input[@id='addOverlay']", "test.testadc@mailinator.com", FAIL, "no_jira");
        Thread.sleep(500);
        if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on go", "xpath","//button[@id='go-to-public']", "no_jira");
         Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the email", "xpath","(//*[contains(text(), 'Reset your password')])[1]", "no_jira");
         Thread.sleep(1000);
      //  _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the reset password", "xpath","//a[@class='signin-button']", "no_jira");
       //  Thread.sleep(1000); 
        _t++; Thread.sleep((long) sleep);TWeb.Swith_to_Frame("click on password reset", "xpath", "//iframe[@id='html_msg_body']", "no_jira");
          _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click on the reset password", "xpath","//a[contains(text(),'Reset password')]", "no_jira");
         Thread.sleep(1000);
        
     
     String a = d1.getWindowHandle();
     d1.switchTo().window(a);
     
       _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-24']", "Test123*", FAIL, "no_jira");
         Thread.sleep(500);
          _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("new password", "xpath", "//input[@id='input-34']", "Test123*", FAIL, "no_jira");
         Thread.sleep(500);

        
    }  
}
