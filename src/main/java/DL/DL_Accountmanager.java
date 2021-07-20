/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import java.util.ArrayList;
import java.util.List;

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

    protected void run() {
        try {
            Boolean p = false;

            List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L2 == null || L2.size() == 0) {
                p = true;
                List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                L2.remove(0);
            }
           
             else{
               
                Element_E1_Find("Find Search bar", "xpath", "//input[contains(@class, 'MuiInputBase-input MuiOutlinedInput-input')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
           
            List<String> Memberlist = new ArrayList<>();

            for (int j = 0; j < L2.size(); j++) {
                Element_Text("Members", L2.get(j), ParentTest, "no_jira");
                         
                System.out.println(L2.get(j).getText());
                Memberlist.add(L2.get(j).getText());
            }
            Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
            Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(5000);

            for (int j = 1; j < Memberlist.size(); j++) {
                Thread.sleep(5000);

                Wait_For_Element_By_Path_Presence("Wait for Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Click("Click on Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                Thread.sleep(5000);
                if (p) {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//p[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//p[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                } else {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//div[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//div[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
                System.out.println(Memberlist.get(j));

                Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
                if (FAIL) {
                    return;

                }
                Wait_For_Element_By_Path_Presence("Wait for Metric card", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(5000);
                List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]//p", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                for (int k = 0; k < L1.size(); k++) {
                    System.out.println(L1.get(k).getText());
                    Element_Text("Metric Values", L1.get(k), ParentTest, "no_jira");
                }

            }

        }
        catch (Exception ex) {
        }
    }

}
