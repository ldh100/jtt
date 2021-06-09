/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

/**
 *
 * @author Oleg.Spozito
 */
class DL_sanity extends DL_GUI {
    protected DL_sanity(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run(String ID, String PW) throws InterruptedException, Exception {   
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");                                 
        Wait_For_Element_By_Path_Presence("Wait 'USERNAME' input", "id", "username", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Button 'Sign in' Text", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira");   
        Element_By_Path_Click("Click 'USERNAME' input", "id", "username", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        // ==== Valid Login
        Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", ID, false, ParentTest, "no_jira");  
            if (FAIL) { return;}            
        Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", PW, true, ParentTest, "no_jira");  
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Sign In'", "name", "login", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);
        Page_URL("Login page URL", ParentTest, "no_jira");  
        
        List_L3("Check for Login Messages (count)", "xpath", "//*[@class = 'message' or @class = 'note note-danger']", ParentTest, "no_jira");              
            if (FAIL) { return;}
        if(L3.isEmpty()){ // L3 specific for Login Messages - if No "will expire" or "Locked" - PASS, otherwise - WARN > procees to FAIl in Execution
            Login_OK = true;
        }else{
            Element_Text("Message text", L3.get(0), ParentTest, "no_jira"); 
            if(t.contains("locked")){   // This account has been locked.  
                Login_OK = false;
                return;
            } else {                      // ...will expire
                Element_E1_Find("Find 'Reset Password Now' button", "name", "resetPasswordNow", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_E1_Find("Find 'Reset Later' button", "name", "continue", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_Click("Click 'Reset Later'", e1, ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Thread.sleep(500);  
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                    if (FAIL) { return;}  
                Thread.sleep(500);  
                Login_OK = false;
                return;
            }
        }
        Find_Text("Find 'Invalid credentials'", "Invalid credentials.", false, ParentTest, "no_jira"); 
        if (t.toLowerCase().contains("invalid")) { 
            EX += _t + "\t" + "Find 'Invalid credentials'" + "\t" + ID + "\t" + "Invalid credentials." + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
            F += "Step: " + _t + " > " + ID + " > " + "Invalid credentials." + "\r\n";
            Login_OK = false;
            return;  // Login Failed FATAL for this User ===================================================
        }            
    }
}