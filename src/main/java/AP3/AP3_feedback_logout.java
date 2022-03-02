package AP3;

import java.util.Date;

class AP3_feedback_logout extends AP3_GUI{
    protected AP3_feedback_logout (AP3_GUI a) {
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
        if (!env.equals("PR")) {
            for (int i = 0; i < 3; i++) {
                Element_By_Path_Click("Click 'Feedback'", "xpath", "//div[contains(@id,'appzi-launch-button')]", ParentTest, "no_jira");
                if (FAIL) {return;}                                            
                Swith_to_Frame("Switching to Feedback frame", "xpath", "//iframe[contains(@src,'https://w.appzi.io/w-')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                List_L0("Feedback Frame elements", "css", "main[class='no-select']", ParentTest, "no_jira");
                    if (FAIL) { return; }
                for (int j = 0; j < L0.size(); j++) {
                    Element_Text("Feedback frame elements " + j + " Text", L0.get(j), ParentTest, "no_jira");
                }
                if (i == 0) {
                    Element_By_Path_Click("Click 'I like something'", "xpath", "//li[contains(@class, '_3wnKwSe20Sm3u906jQvuAb')]", ParentTest, "no_jira");
                } else if (i == 1) {
                    Element_By_Path_Click("Click 'I don't like something'", "xpath", "//li[contains(@class, '_3Y8W2qMaYxcAFzSu2E4sFt')]", ParentTest, "no_jira");
                } else if (i == 2) {
                    Element_By_Path_Click("Click 'I have an idea'", "xpath", "//li[contains(@class, '_23vBriWSFOV5VCo-SvibiZ')]", ParentTest, "no_jira");
                }
                if (FAIL) {return;}


                Element_By_Path_Click("Click on Feedback text box", "css", ".nw8mJWf1EFE69gYiOR6RX", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Input_Select_Clear("Clear Comments textbox", "css", ".nw8mJWf1EFE69gYiOR6RX", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter Text in Feedback", "css", ".nw8mJWf1EFE69gYiOR6RX", "Automation test feedback", false, ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Click("Click on Next button", "css", "._3qQNvjn_6YEcXTu3PLPl77", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Click("Click on Email text box", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Input_Select_Clear("Clear Email textbox", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter Email in Feedback", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", ADMIN_ID, false, ParentTest, "no_jira");
                    if (FAIL) {return;}

                Element_By_Path_Click("Click on SEND button", "xpath", "//div[text()='SEND']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Click("Click on DONE button", "css", ".color-accent-background", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Swith_to_Frame("Switching to Main Page", "defaultContent", "", ParentTest, "no_jira");
                    if (FAIL) {return;}
            }
        } // End of if (!="PR")

        // Logout tests
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", ParentTest, "no_jira");
            if (FAIL) {return;}

        Element_By_Path_Text("Welcome... Text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", ParentTest, "no_jira");
        if (FAIL) { return; }

        Element_By_Path_Text("Welcome to...", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", ParentTest, "no_jira");
            if (FAIL) { return; }
        Find_Text("Forgot Password Text", "Forgot Password", true, ParentTest, "no_jira");
            if (FAIL) {return;}
        Page_URL("AP3 Welcome page URL", ParentTest, "no_jira");
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }  
    } 
}
