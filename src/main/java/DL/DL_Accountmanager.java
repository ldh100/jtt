/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
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
            Thread.sleep(2000);
            T_Index = -1;
            Set<String> Memberlist1 = new LinkedHashSet<>();
            List<String> Memberlist = new ArrayList<>();
            Thread.sleep(5000);
            List_L2("List all Members", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
//                 Scroll_to_Element("Scroll to last element", L2.get(L2.size()- 1), ParentTest, "no_jira");
//                 if(FAIL) {return;}

            if (L2 == null || L2.isEmpty()) {
                Thread.sleep(2000);
                p = true;
                List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                L2.remove(0);
                for (int j = 0; j < L2.size(); j++) {
                    Element_Text("Members", L2.get(j), ParentTest, "no_jira");
                    System.out.println(L2.size());
                    System.out.println(L2.get(j).getText());

                    Memberlist1.add(L2.get(j).getText());

                }

                Memberlist.addAll(Memberlist1);
                Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
            } else {

                Element_E1_Find("Find Search bar", "xpath", "//input[contains(@class, 'MuiInputBase-input MuiOutlinedInput-input')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                L3 = new ArrayList<>();
//                 L3.addAll(L2);
                do {

                    T_Index += 1;
                    List_L2("List all Members", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                    L3.addAll(L2);
                    for (int j = 0; j < L2.size(); j++) {
                        Element_Text("Members", L2.get(j), ParentTest, "no_jira");
                        System.out.println(L2.size());
                        System.out.println(L2.get(j).getText());

                        Memberlist1.add(L2.get(j).getText());

                    }
                    Scroll_to_Element("Scroll to last element", L2.get(L2.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                } while (T_Index < 10);

//            List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
//            if (FAIL) {
//                return;
//            }
                T_Index = -1;
                do {

                    T_Index += 1;
                    List_L2("List all Members", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Scroll_to_Element("Scroll to last element", L2.get(0), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                } while (T_Index < 110);

                L2 = new ArrayList<>();
                L2.addAll(new HashSet(L3));
                Memberlist.addAll(Memberlist1);
                Thread.sleep(2000);

                Element_By_Path_Click("Members Selection List" + (0 + 1), "xpath", "//div[text()=\"" + Memberlist.get(0).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
            }
            Thread.sleep(2000);
            Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(5000);
            String Oldfilter = "";
            String Newfilter = Memberlist.get(0).replaceAll("'", "");
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//p[text()='Loading your info…']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Wait_For_Element_By_Path_Presence("Wait for Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            for (int j = 1; j < Memberlist.size(); j++) {
                Thread.sleep(5000);
                CreateNewFilter(Oldfilter, Newfilter);
                
                Thread.sleep(5000);
                
                Wait_For_Element_By_Path_Presence("Wait for Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(5000);
                Element_By_Path_Click("Click on Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(5000);
                
                if (p) {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//p[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//p[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                } else {
                    
                   Thread.sleep(2000);
                   T_Index = 0;
               
                do {

                    Move_to_Element_By_Path("Scroll to Member", "xpath", "//div[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    T_Index += 1;
                    Element_By_Path_Click("Select the  Member", "xpath", "//div[text()=\"" + Memberlist.get(j).replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (!FAIL) {
                        break;
                    }
                    List_L2("List all Members", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Scroll_to_Element("Scroll to last element", L2.get(L2.size() - 1), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                } while (T_Index < 110);

                }
//                System.out.println(Memberlist.get(j));

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
                Oldfilter = Newfilter;
                Newfilter = Memberlist.get(j).replaceAll("[',./()&]+", "");
                
            }

        }

        catch (Exception ex) {
        }
    }
    
    public void CreateNewFilter(String OldFilterName, String NewFilterName) throws Exception {
        try {
            Thread.sleep(5000);
            Boolean Isemptyfilter = false;
            Element_E1_Find("Check whether Saved Filter dropdown is displayed or not", "xpath", "//div[@class=' css-1uxlrog-indicatorContainer']", ParentTest, "no_jira");
            
                

                //System.out.println(e1.isDisplayed());
                System.out.println(FAIL);

                if (!FAIL) {
                    Isemptyfilter = true;
                    Find_Text("Find 'Saved Filters' button", "Saved Filters", true, ParentTest, "no_jira");
                    if (t.equalsIgnoreCase("Saved Filters")) {
                        Element_By_Path_Click("Open 'Filters Modal Popup'", "xpath", "//div[@class=' css-1uxlrog-indicatorContainer']", ParentTest, "no_jira");
                    } else {
                        Element_By_Path_Click("Open 'Filters Modal Popup'", "xpath", "(//div[@class=' css-1uxlrog-indicatorContainer'])[2]", ParentTest, "no_jira");
                    }
                    Element_E1_Find("Verifying the old filter", "xpath", "//div[contains(text(), '" + OldFilterName + "')]", ParentTest, "no_jira");
                    Element_By_Path_Click("Select the dropdown value", "xpath", "//div[contains(text(), '" + NewFilterName + "')]", ParentTest, "no_jira");
                    Thread.sleep(1000);
                }
             
                Find_Text("Find 'Create a Filter' button", "Create a Filter", true, ParentTest, "no_jira");
                System.out.println(t);
                Boolean IsFilterNew = false;
                if (!t.equalsIgnoreCase("Not Found")) {
                    IsFilterNew = true;
                    Element_By_Path_Click("Click on 'Create a Filter' button", "xpath", "//button[contains(.,'Create a Filter')]", ParentTest, "no_jira");
                    System.out.println(FAIL);
                    if (FAIL) {
                        return;
                    }
                    
                } else {
                    IsFilterNew = false;
                    Element_By_Path_Click("Click on 'Edit Filter' button", "xpath", "//button[contains(.,'Edit Filter')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }

                }
                Thread.sleep(2000);
                Find_Text("Find No Customers or Locations.", "No Customers or Locations.", true, ParentTest, "no_jira");
                if (!t.equalsIgnoreCase("Not Found")) {
                 Element_By_Path_Click("Click on 'Cancel' button", "xpath","//span[text()='Cancel']", ParentTest, "no_jira"); 
                 if (FAIL) {
                        return;
                    }
                 return;
                }
                if (IsFilterNew) {
                    Element_By_Path_Click("Select the dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])" + (Isemptyfilter ? "[position()=2]" : ""), ParentTest, "no_jira");
                } else {
                    Element_By_Path_Click("Select the dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", ParentTest, "no_jira");
                }
                if (FAIL) {
                    return;
                }
                Element_By_Path_Click("Choose Location Key 'Org Level 1 '", "xpath", "//div[@role='dialog']//*[contains(text(), 'Org Level 1')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_E1_Find("Find Select All Checkbox", "xpath", "(//input[contains(@class, 'jss')])[14]", ParentTest, "no_jira");
                boolean checkboxstatus;
                checkboxstatus= e1.isSelected();
                if(checkboxstatus==true)
                {
                  System.out.println("Select All Checkbox is already Selected");
                }
                else
                {
                    Element_By_Path_Click("Click on Select All Checkbox", "xpath", "//span[contains(.,'Select All')]", ParentTest, "no_jira");
                }
                if (IsFilterNew) {
                Element_By_Path_Text_Enter("Enter Save Selection", "id", "name", "" + NewFilterName + "", false, ParentTest, "no_jira");
                }
                Find_Text("Find 'Save as New Filter' button", "Save as New Filter", true, ParentTest, "no_jira");
                if (!t.equalsIgnoreCase("Not Found")) {
                    Element_By_Path_Click("Click on 'Save as New Filter' button", "xpath", "//button/span[contains(.,'Save as New Filter')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
       
                } else {
                    Element_By_Path_Click("Click on 'Update Filter' button", "xpath", "//button/span[contains(.,'Update Filter')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
            
                  
        }
        catch (Exception ex) {
        ex.printStackTrace();
        }
    }
}
