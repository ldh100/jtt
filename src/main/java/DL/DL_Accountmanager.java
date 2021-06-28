/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import JIRA.JIRA;
import com.google.common.base.Stopwatch;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author prathyusha.deshpande
 */
 class DL_Accountmanager extends DL_GUI {
    protected DL_Accountmanager(DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
     protected void run() throws InterruptedException, Exception {
         List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
         if (FAIL) {
             return;
         }
        for (int j = 0; j < L2.size(); j++) {
             Element_Text("Members", L2.get(j), ParentTest, "no_jira");
             System.out.println(L2.get(j).getText());
         }
         Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
         Element_By_Path_Click("Click on Continue as a Member" , "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
           // Thread.sleep(5000);
                   Wait_For_Element_By_Path_Presence("Wait for Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
                  Element_By_Path_Click("Click on Chevron" , "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
         List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]", ParentTest, "no_jira");
         if (FAIL) {
             return;
         }
        for (int j = 0; j < L2.size(); j++) {
             Element_Text("Members", L2.get(j), ParentTest, "no_jira");
             System.out.println(L2.get(j).getText());
         }
         Element_Click("Members Selection List" + (0 + 1), L2.get(2), ParentTest, "no_jira");
         Element_By_Path_Click("Click on Continue as a Member" , "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
     }  
}
