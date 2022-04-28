package AP3;

import java.util.Date;

class AP3_logout_feedback extends AP3_GUI{
    protected AP3_logout_feedback (AP3_GUI a) {
        d1 = a.d1; 
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;
    } 
    protected void run()  {
    try {    
        // Logout tests
//        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
//            if (FAIL) { return; }
//        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira");
//            if (FAIL) { return; }
//        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
//            if (FAIL) { return; }
        Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", ParentTest, "no_jira");
            if (FAIL) {return;}

        Element_By_Path_Text("Welcome... Text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", ParentTest, "no_jira");
        Element_By_Path_Text("Welcome to...", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Find_Text("Forgot Password Text", "Forgot Password", true, ParentTest, "no_jira");
            if (FAIL) {return;}
        Page_URL("AP3 Welcome page URL", ParentTest, "no_jira");

        Element_By_Path_Click("Click 'Feedback'", "xpath", "//div[contains(@id,'appzi-sli')]", ParentTest, "no_jira");
            //if (FAIL) {return;}                                            
        Swith_to_Frame("Switching to Feedback frame", "xpath", "//iframe[contains(@title,'Feedback Widget')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        List_L0("Feedback Options list", "className", "outer", ParentTest, "no_jira");
             if (FAIL) { return; }
         for (int j = 0; j < L0.size(); j++) {
             Element_Text("Feedback frame elements " + j + " Text", L0.get(j), ParentTest, "no_jira");
         } 
//       for (int i = 0; i < 3; i++) { 
//            if (i == 0) {
//                Element_Click("Click 'I like something'", L0.get(i), ParentTest, "no_jira");
//            } else if (i == 1) {
//                Element_Click("Click 'I don't like something'", L0.get(i), ParentTest, "no_jira");
//            } else if (i == 2) {
//                Element_Click("Click 'I have an idea'", L0.get(i), ParentTest, "no_jira");
//            }
            Element_Click("Click 'I like something'", L0.get(0), ParentTest, "no_jira");
                if (FAIL) {return;}

            Element_By_Path_Text_Enter("Enter Text in Feedback", "css", "[placeholder='Type here']", "Automation test feedback", false, ParentTest, "no_jira");
                if (FAIL) {return;}
            Element_By_Path_Click("Click on Next button", "id", "btn-next", ParentTest, "no_jira");
                if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Text in Feedback", "css", "[placeholder='Please enter your email here']", ADMIN_ID, false, ParentTest, "no_jira");
                if (FAIL) {return;}
//        }
        if (!env.equals("PR")) {
            Element_By_Path_Click("Click on SEND button", "id", "btn-submit", ParentTest, "no_jira");
                if (FAIL) {return;}
            Element_By_Path_Text("Get Feedback Confirmation Text","id", "c12", ParentTest, "no_jira");
            Element_By_Path_Text("Get Feedback Confirmation Sub-Text","id", "c14", ParentTest, "no_jira");
            Element_By_Path_Click("Click on DONE button", "id", "btn-dismiss", ParentTest, "no_jira");
                if (FAIL) {return;}
        }
        Swith_to_Frame("Switching to Main Page", "defaultContent", "", ParentTest, "no_jira");
            if (FAIL) {return;} 
 
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }  
    } 
}
