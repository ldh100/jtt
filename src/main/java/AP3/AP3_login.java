package AP3;

/**
 *
 * @author Oleg.Spozito
 */
class AP3_login extends AP3_GUI{
    protected AP3_login(AP3_GUI a) {
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }    
    protected void run(boolean users) {   
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
//        if(users) {    
//            Element_By_Path_Text_Enter("Enter Invalid Email", "css", "[aria-label='E-mail']", "x.y@compassdigitalio", false, ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            Element_By_Path_Text("Invalid Email Message", "xpath", "//*[contains(text(), 'Please enter a valid email')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//        }
        Element_By_Path_Text_Enter("Enter Valid Email", "css", "[aria-label='E-mail']", ADMIN_ID, false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
//        if(users) {   
//            Element_By_Path_Text_Enter("Enter Invalid Password", "css", "[aria-label='Password']", ADMIN_PW + "_X", false, ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            Element_By_Path_Click("Unmask Password Click", "xpath", "/html/body/div[1]/div/main/div/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div[2]/div/i", ParentTest, "no_jira"); 
//            Element_By_Path_Click("Sign In Click", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;} 
//            Wait_For_Element_By_Path_Presence("WaitForElement for Error...", "xpath", "//*[contains(@class, 'v-messages theme--light error--text')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}   
//            Element_By_Path_Text("Inavalid Credentials Message", "xpath", "//*[contains(text(), 'Your username or credentials')]", ParentTest, "no_jira"); 
//                if (FAIL) { return;}
//            Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type='password']", ParentTest, "no_jira"); 
//                if (FAIL) { return;}   
//            Element_By_Path_Input_Select_Clear("Entered Password Clear", "xpath", "//input[@area-label='Password']", ParentTest, "no_jira"); 
//                if (FAIL) { return;}  
//        }    
        Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", ADMIN_PW, true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("AP3 Dashboard URL", ParentTest, "no_jira");             
            if (FAIL) { return;}
        List_L0("Home screen Buttons Count", "xpath", "//button[@type='button']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Home screen Button " + i + " Text", L0.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        List_L0("Drawer Items Count", "css", "[role='listitem']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Drawer Item " + (i+1) + " Text", L0.get(i), "textContent", ParentTest, "no_jira");   
                if (FAIL) { return;}
                if(i == (L0.size()-1)){
                    Ver = t;
                }
            } 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");                    
    } catch (Exception ex){}   // =============================================  
    } 
}
