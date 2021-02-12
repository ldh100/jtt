/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;

/**
 *
 * @author Oleg.Spozito
 */
public class AP3_logout {

    public static void run() throws InterruptedException {

        if (!env.equals("PR")) {

            for (int i = 0; i < 3; i++) {
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click 'Feedback'", "xpath", "//div[contains(@id,'appzi-launch-button')]", "no_jira");
                if (FAIL) {
                    return;
                }

                _t++;
                Thread.sleep((long) sleep);                                                              
                TWeb.Swith_to_Frame("Switching to Feedback frame", "xpath", "//iframe[contains(@src,'https://w.appzi.io/w-')]", "no_jira");
                if (FAIL) {
                    return;
                }

                _t++;
                Thread.sleep((long) sleep);
                TWeb.List_L0("Feedback Frame elements", "css", "main[class='no-select']", "no_jira");
                if (FAIL) {
                    return;
                }

                for (int j = 0; j < L0.size(); j++) {
                    _t++;
                    TWeb.Element_Text("Feedback frame elements " + j + " Text", L0.get(j), "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
                    _t++;
                    Thread.sleep((long) sleep);
                    Thread.sleep((long) sleep);
                    if (i == 0) {
                        TWeb.Element_By_Path_Click("Click 'I like something'", "xpath", "//li[contains(@class, '_3wnKwSe20Sm3u906jQvuAb')]", "no_jira");
                    } else if (i == 1) {
                        TWeb.Element_By_Path_Click("Click 'I don't like something'", "xpath", "//li[contains(@class, '_3Y8W2qMaYxcAFzSu2E4sFt')]", "no_jira");
                    } else if (i == 2) {
                        TWeb.Element_By_Path_Click("Click 'I have an idea'", "xpath", "//li[contains(@class, '_23vBriWSFOV5VCo-SvibiZ')]", "no_jira");
                    }
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Click("Click on Feedback text box", "css", ".nw8mJWf1EFE69gYiOR6RX", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Input_Select_Clear("Clear Comments textbox", "css", ".nw8mJWf1EFE69gYiOR6RX", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Text_Enter("Enter Text in Feedback", "css", ".nw8mJWf1EFE69gYiOR6RX", "Automation test feedback", false, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Click("Click on Next button", "css", "._3qQNvjn_6YEcXTu3PLPl77", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Click("Click on Email text box", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Input_Select_Clear("Clear Email textbox", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Text_Enter("Enter Email in Feedback", "css", "input[class='_1o19MEJFmyDwNY8XQVOILe']", ADMIN_ID, false, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Click("Click on SEND button", "xpath", "//div[text()='SEND']", "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep((long)sleep);
                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Click("Click on DONE button", "css", ".color-accent-background", "no_jira");
                    if (FAIL) {
                        return;
                    }

                    _t++;
                    Thread.sleep((long) sleep);
                    TWeb.Swith_to_Frame("Switching to Main Page", "defaultContent", "", "no_jira");
                    if (FAIL) {
                        return;
                    }
                }//End of for
            } // End of if (!="PR")

//        Logout tests
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep(200);
            TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, "no_jira");

            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Click 'User Name'", "xpath", "//button[@type='button'][2]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Welcome... Text", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Welcome to...", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Find_Text("Forgot Password Text", "Forgot Password", true, "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Page_URL("AP3 Welcome page URL", "no_jira");
        
    }
}
