package DL;

import java.util.ArrayList;
import java.util.List;

class DL_qa_user extends DL_GUI {

    protected DL_qa_user(DL_GUI a) {
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }

    // Error: User Initialization Fail. Please Try Again    <<<< How to deal with That??   DEBUG
    protected void run(String User_ID, String Metric, String Restricted, String Period, String Val, String Location_Filters, String Item_Filters, String Kpi, String Source, Boolean IsMember) {
        try {
            Thread.sleep(5000);
//      for (int i = 1810; i < 1815; i++)
//      {
//        
//        System.out.println(Val);
//        System.out.println(Location_Filters);
//        System.out.println(Item_Filters);
//        System.out.println(Kpi);

            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
            if (FAIL) {
                //return;
            }
            Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (t.equalsIgnoreCase("arrow_right")) {
                Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
//        }

                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

            }
            Thread.sleep(2000);
            List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L0.isEmpty()) {
                EX += _t + "\t" + "User Metrics > " + "\t" + User_ID + "\t" + "No Metrics" + "\t" + "FAIL" + "\t" + "L0.isEmpty()"
                        + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                return;  // No User Metrics Found FATAL  for this User ===================================================
            }

            List_L2("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(2000);
            for (int j = 0; j < L2.size(); j++) {
                Element_Click("Un-Check Selected Metrics " + (j + 1), L2.get(j), ParentTest, "no_jira");
            }

            //KPI_Validation(Kpi);
            String[] KPIList = Kpi.split("\\|");
            for (String KPI : KPIList) {
                if (KPI.contains(":")) {
                    String KPI_FilterKey = KPI.substring(0, KPI.indexOf(":"));
                    Text_Found("Check '" + KPI_FilterKey + "' is Displayed ", KPI_FilterKey, ParentTest, "no_jira");
                }
            }
            // Find / Select Target dMetric >>>>   Add code to Pass/Fail if the Target Metric Allowed/Disallowed in S3 Qa file
            //                Restricted;

            if (Restricted.equalsIgnoreCase("Yes")) {
                Find_Text("Find Metric '" + Metric + "'", Metric, true, ParentTest, "no_jira");
                if (t.equals("Not Found")) {
                    Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(500);
                    return;  // Metric Not Found FATAL for this Test# ===================================================
                } else {
                    _f++;
                    FAIL = true;
                    err = "Restricted Metric is displayed in FE";
                    EX += _t + "\t" + "User Metrics > " + "\t" + User_ID + "\t" + Metric + " is displayed" + "\t" + "FAIL" + "\t" + "Restricted Metric is displayed in FE"
                            + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                    F += "Step: " + _t + " > " + err + "\r\n";
                    Log_Html_Result("FAIL", "Error: " + err + "Restricted Metric is displayed in FE" + " > ", true, ParentTest);
                    Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(500);
                    return;
                }
            }
            Wait_For_Element_By_Path_Presence("Wait for Metric", "xpath", "//span[text()='" + Metric + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Find_Text("Find Metric '" + Metric + "'", Metric, true, ParentTest, "no_jira");
            if (t.equals("Not Found")) {
                return;  // Metric Not Found FATAL for this Test# ===================================================
            }
            Wait_For_Element_By_Path_Presence("Wait for Metric", "xpath", "//span[text()='" + Metric + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Select Metric '" + Metric + "'", "xpath", "//span[text()='" + Metric + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Metric Card", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);

            // Select Time Period 
            Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", ParentTest, "no_jira");
            Element_By_Path_Click("Select Date Range " + Period, "xpath", "//span[text()='" + Period + "']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (!Location_Filters.isEmpty() || !Item_Filters.isEmpty()) {

                // Find_Text("Find 'Filters' label", "Filters", true, ParentTest, "no_jira");
                // Find_Text("Find 'Create a Filter' button label", "Create a Filter", true, ParentTest, "no_jira");
            //    e1=null;
                Element_E1_Find("Check whether Saved Filter dropdown is displayed or not", "xpath", "//div[@class=' css-1uxlrog-indicatorContainer']", ParentTest, "no_jira");
                System.out.println(e1.isDisplayed());
                System.out.println(FAIL);
                Boolean Isemptyfilter=false;
                if (!FAIL)  { 
                    Isemptyfilter=true;
                    Find_Text("Find 'Saved Filters' button", "Saved Filters", true, ParentTest, "no_jira");
                    if (t.equalsIgnoreCase("Saved Filters")) {
                        Element_By_Path_Click("Open 'Filters Modal Popup'", "xpath", "//div[@class=' css-1uxlrog-indicatorContainer']", ParentTest, "no_jira");
                    } else {
                        Element_By_Path_Click("Open 'Filters Modal Popup'", "xpath", "(//div[@class=' css-1uxlrog-indicatorContainer'])[2]", ParentTest, "no_jira");
                    }
//            Thread.sleep(500);
                    Element_By_Path_Click("Select the dropdown value", "xpath", "//div[contains(text(), 'Automation1')]", ParentTest, "no_jira");
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
                // ==================================== Customer/Location Filters - Clear > Apply new ones if Required ====================================================
                Element_By_Path_Click("Click on Customers/Location tab", "xpath", "//span[contains(text(), 'Customers/Locations')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Thread.sleep(2000);
                List_L2("Exiting Customers/Locations Filters", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", ParentTest, "no_jira");
                for (int j = 0; j < L2.size(); j++) {
                    Thread.sleep(1000);
                    Element_Click("Delete Customer/Location Filter " + j, L2.get(j), ParentTest, "no_jira");
                    if (FAIL) {
//                return;
                    }
                }
                Thread.sleep(2000);
                if (!Location_Filters.isEmpty()) {// ========  Apply Location Filter Key / Value ===============
                    for (String L : Location_Filters.split("\r\n")) {
                        if (L.contains(":")) {
                            String L_FilterKey = L.substring(0, L.indexOf(":")).trim();
                            String L_FilterValue = L.substring(L.indexOf(":") + 1).trim().replaceAll(",", "");
                            if (L_FilterKey.contains("Dropdown")) {
//                        Element_By_Path_Click("Open Location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", ParentTest, "no_jira");
//                        if (FAIL) {
//                            return;
//                        }
//                        Scroll_to_WebElement("Scroll to '" + L_FilterValue + "'", "xpath", "//*[contains(text(), '" + L_FilterValue + "')]", ParentTest, "no_jira");
//                        if (FAIL) {
//                            return;
//                        }
//                        Element_By_Path_Click("Choose dropdown Location Value'" + L_FilterValue + "'", "xpath", "//*[contains(text(), '" + L_FilterValue + "')]", ParentTest, "no_jira");
//                        if (FAIL) {
//                            return;
//                        }
                            } else {
                                if (IsFilterNew) {
                                    Element_By_Path_Click("Select the dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])"+(Isemptyfilter?"[position()=2]":""), ParentTest, "no_jira");
                                } else {
                                    Element_By_Path_Click("Select the dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", ParentTest, "no_jira");
                                }
                                if (FAIL) {
                                    return;
                                }
                                Element_By_Path_Click("Choose Location Key '" + L_FilterKey + "'", "xpath", "//div[@role='dialog']//*[contains(text(), '" + L_FilterKey + "')]", ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }
                                Element_By_Path_Text_Enter("Enter/Search Location Value '" + L_FilterValue + "'", "id", "filter-group-search", L_FilterValue, false, ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }
                                Element_By_Path_Click("Select Location '" + L_FilterValue + "'", "xpath", "//input[@type='checkbox'][@name='checked-" + L_FilterValue + "']", ParentTest, "no_jira");
                                //if (FAIL) { return;} // do not return, juat log an error Search value not Found    

                                //div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'" + L_FilterValue + "')]/..
                            }
                        }
                    }
                }

                // ==================================== Products/Item Categories Filters - Clear > Apply new ones if Required ====================================================
                Element_By_Path_Click("Click on Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Wait_For_Element_By_Path_Presence("Wait for drop-down 'Category Name'", "xpath", "//div[text()='Category Name']", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                List_L2("Existing Products/Item Categories Filters", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", ParentTest, "no_jira");
                for (int j = 0; j < L2.size(); j++) {
                    Element_Click("Delete Products/Item Categories Filter " + j, L2.get(j), ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
                Thread.sleep(1000);
                if (!Item_Filters.isEmpty()) {// ========  Apply Item Filter Key / FilterValue ===============
                    for (String I : Item_Filters.split("\r\n")) {
                        if (I.contains(":")) {
                            String I_FilterKey = I.substring(0, I.indexOf(":")).trim();
                            String I_FilterValue = I.substring(I.indexOf(":") + 1).trim().replaceAll(",", "");

                            if (I_FilterKey.contains("Dropdown")) {
                                if (IsFilterNew) {
                                    Element_By_Path_Click("Click on Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()="+(Isemptyfilter?"2":"1")+"]", ParentTest, "no_jira");
                                } else {
                                    Element_By_Path_Click("Click on Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", ParentTest, "no_jira");
                                }

                                if (FAIL) {
                                    return;
                                }

                                Scroll_to_WebElement("Scroll to '" + I_FilterValue + "'", "xpath", "//*[contains(text(), '" + I_FilterValue + "')]", ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }

                                Element_By_Path_Click("Select Item Value '" + I_FilterValue + "'", "xpath", "//*[contains(text(), '" + I_FilterValue + "')]", ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }
                            } else {
                                if (IsFilterNew) {
                                    Wait_For_Element_By_Path_Presence("Wait for dropdown to display", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()="+(Isemptyfilter?"3":"2")+"]", ParentTest, "no_jira");
                                    if (FAIL) {
                                        return;
                                    }

                                    Element_By_Path_Click("Open Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()="+(Isemptyfilter?"3":"2")+"]", ParentTest, "no_jira");
                                    if (FAIL) {
                                        return;
                                    }
                                } else {
                                    Wait_For_Element_By_Path_Presence("Wait for dropdown to display", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=4]", ParentTest, "no_jira");
                                    if (FAIL) {
                                        return;
                                    }

                                    Element_By_Path_Click("Open Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=4]", ParentTest, "no_jira");
                                    if (FAIL) {
                                        return;
                                    }
                                }

//     
//                        Wait_For_Element_By_Path_Presence("Wait for Item to be Selected", "xpath", "//*[contains(text(), '" + I_FilterKey + "')]", ParentTest, "no_jira");
//                        if (FAIL) {
//                            return;
//                        }
                                Thread.sleep(5000);

                                Element_By_Path_Click("Choose Item Key '" + I_FilterKey + "'", "xpath", "//*[contains(text(), '" + (I_FilterKey.equalsIgnoreCase("Category") ? I_FilterKey + " Name" : I_FilterKey) + "')]", ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }

                                //Thread.sleep(5000);
                                Element_By_Path_Text_Enter("Enter/Search Item '" + I_FilterValue + "'", "id", "filter-group-search", I_FilterValue, false, ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }
                                Wait_For_Element_By_Path_Presence("Wait for Item to be Selected", "xpath", "//input[@type='checkbox'][@name='checked-" + I_FilterValue + "']", ParentTest, "no_jira");
                                if (FAIL) {
                                    return;
                                }

                                Element_By_Path_Click("Select Item Value '" + I_FilterValue + "'", "xpath", "//input[@type='checkbox'][@name='checked-" + I_FilterValue + "']", ParentTest, "no_jira");
                            }
                        }
                    }
                }

                // ====  Apply cleared / new Selected filters
                Thread.sleep(1000);
                if (IsFilterNew) {
                    Element_By_Path_Text_Enter("Enter Save Selection", "id", "name", "Automation1", false, ParentTest, "no_jira");
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
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for Metric data load...", "xpath", "//div[@role='progressbar']", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            Thread.sleep(500);
            List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L1.isEmpty()) {
                return;  // Loaded Metric Not Found FATAL for this Test# ===================================================
            }

            //  Validate Metric QA vs, FE $ Value  
            float QA_Value = Float.parseFloat(Val);
            float FE_Value = (float) 0.00001;

            //Thread.sleep(5000); // Wait for the Cards Data > $ Value Present >>>  Wait for $ ???
            // "xpath", "//*[@class = 'message' or @class = 'note note-danger']
            Wait_For_Element_By_Path_Presence("Wait for 'Dollar' amount", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(text(),'$')]", ParentTest, "no_jira");

            Element_Child_List_L2("Loaded Metric Card Values '-body1' Count", L1.get(L1.size() - 1), "xpath", ".//p[contains(@class,'-body1')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L2.size() > 0) {
                Element_Text("Loaded Metric Card name", L2.get(0), ParentTest, "no_jira");
                if (L2.size() > 1) {
                    Element_Text("Loaded Metric Card Value 1", L2.get(1), ParentTest, "no_jira");
                    if (t.startsWith("$")) {
                        t = t.replace("$", "").replace(",", "").trim();
                        FE_Value = Float.parseFloat(t);

                        if (Math.abs(QA_Value - FE_Value) <= (QA_Value * 0.01)) { // ========= 1% precision =============
                            Log_Html_Result("PASS", "QA Value: " + QA_Value + " > FE $Value: " + FE_Value, false, ParentTest.createNode("Compare QA_Value and FE_Value"));
                            EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + FE_Value + "\t" + "PASS" + "\t" + " - "
                                    + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                            _p++;
                        } else {
                            Log_Html_Result("FAIL", "QA Value: " + QA_Value + " > FE $Value: " + FE_Value, true, ParentTest.createNode("Compare QA_Value and FE_Value"));
                            EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + FE_Value + "\t" + "FAIL" + "\t" + " - "
                                    + "\t" + " -" + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                            _f++;
                        }
                    } else {
                        Log_Html_Result("FAIL", "QA Value: " + QA_Value + " > FE $Value: " + " Not Found ", true, ParentTest.createNode("Compare QA_Value and FE_Value"));
                        EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + " Not Found " + "\t" + "FAIL" + "\t" + " - "
                                + "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                        _f++;
                    }
                    if (L2.size() > 2) {
                        Element_Text("Loaded Metric Card Value 2", L2.get(2), ParentTest, "no_jira");
                    }
                }
            }
        }
        catch (Exception ex) {
        }   // =============================================  
    }
}
