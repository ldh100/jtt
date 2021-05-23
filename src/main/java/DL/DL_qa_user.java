package DL;

public class DL_qa_user extends DL_GUI {
    protected DL_qa_user(DL_GUI a) {
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    // Error: User Initilization Fail. Please Try Again    <<<< How to deal with That??   DEBUG
    protected void run(String User_ID, String Metric, String Period, String Val, String Location_Filters, String Item_Filters, String Kpi, String Source) throws InterruptedException, Exception { 

        Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
                if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira");  
                    if (FAIL) { return;}  
        }

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}         
        List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");              
            if (FAIL) { return;}            
            if (L0.isEmpty()) { 
                EX += _t + "\t" + "User Metrics > " + "\t" + User_ID + "\t" + "No Metrics" + "\t" + "FAIL" + "\t" + "L0.isEmpty()" +
                "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
                return;  // No User Metrics Found FATAL  for this User ===================================================
            }         
        
       List_L2("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", ParentTest, "no_jira");              
          if (FAIL) { return;}            
            for (int j = 0; j < L2.size(); j++) {  
                Element_Click("Un-Check Selected Metrics " + (j + 1), L2.get(j), ParentTest, "no_jira"); 
            } 
            
        // Find / Select Target dMetric >>>>   Add code to Pass/Fail if the Target Metric Allowed/Disallowed in S3 Qa file
         Find_Text("Find Metric '" + Metric + "'", Metric, true, ParentTest, "no_jira");  
            if (t.equals("Not Found")) { 
                return;  // Metric Not Found FATAL for this Test# ===================================================
            } 
            
        Element_By_Path_Click("Select Metric '" + Metric + "'", "xpath", "//span[text()='" + Metric + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        Thread.sleep(500); 
        Wait_For_Element_By_Path_Presence("Wait for Metric Card", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 

        // Select Time Period 
        Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", ParentTest, "no_jira");          
        Element_By_Path_Click("Select Date Range " + Period, "xpath", "//span[text()='" + Period + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        
        Find_Text("Find 'Filters' label", "Filters", true, ParentTest, "no_jira");
        Find_Text("Find 'Configure Filters' button label", " Configure Filters", true, ParentTest, "no_jira");  
        Element_By_Path_Click("Open 'Configure Filters'", "xpath", "//button[contains(.,' Configure Filters')]", ParentTest, "no_jira"); 
        
        // ==================================== Customer/Location Filters - Clear > Apply new ones if Required ====================================================
        Element_By_Path_Click("Click on Customers/Location tab", "xpath", "//span[contains(text(), 'Customers/Locations')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Thread.sleep(500);
        List_L2("Exiting Customers/Locations Filters", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", ParentTest, "no_jira");                                      
            for (int j = 0; j < L2.size(); j++) {
                Element_Click("Delete Customer/Location Filter " + j, L2.get(j), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            } 
                
        if(!Location_Filters.isEmpty()){// ========  Apply Location Filter Key / Value ===============
            for (String L : Location_Filters.split("\r\n")) {
                if(L.contains(":")){
                    String L_FilterKey = L.substring(0,L.indexOf(":")).trim();
                    String L_FilterValue = L.substring(L.indexOf(":") + 1).trim().replaceAll(",", ""); 
                    if(L_FilterKey.contains("Dropdown")) {
                        Element_By_Path_Click("Open Location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                        Scroll_to_WebElement("Scroll to '" + L_FilterValue + "'", "xpath", "//*[contains(text(), '" + L_FilterValue + "')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}  
                        Element_By_Path_Click("Choose dropdown Location Value'" + L_FilterValue + "'", "xpath", "//*[contains(text(), '" + L_FilterValue + "')]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                    }else{
                        Element_By_Path_Click("Open location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                        Element_By_Path_Click("Choose Location Key '" + L_FilterKey + "'", "xpath", "//div[@role='dialog']//*[contains(text(), '" + L_FilterKey + "')]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                        Element_By_Path_Text_Enter("Enter/Search Location Value '" + L_FilterValue + "'", "id", "filter-group-search",L_FilterValue , false, ParentTest, "no_jira");  
                            if (FAIL) { return;}                                                            
                        Element_By_Path_Click("Select Location '" + L_FilterValue + "'", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'" + L_FilterValue + "')]/..", ParentTest, "no_jira"); 
                            //if (FAIL) { return;} // do not return, juat log an error Search value not Found                       
                    }
                }  
            }            
        }
 
        // ==================================== Products/Item Categories Filters - Clear > Apply new ones if Required ====================================================
        Element_By_Path_Click("Click on Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for drop-down 'Category Name'", "xpath", "//div[text()='Category Name']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        List_L2("Existing Products/Item Categories Filters", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", ParentTest, "no_jira");                                      
            for (int j = 0; j < L2.size(); j++) {
                Element_Click("Delete Products/Item Categories Filter " + j, L2.get(j), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            } 
         if(!Item_Filters.isEmpty()){// ========  Apply Item Filter Key / FilterValue ===============
            for (String I : Item_Filters.split("\r\n")) {
                if(I.contains(":")){
                    String I_FilterKey = I.substring(0,I.indexOf(":")).trim();
                    String I_FilterValue = I.substring(I.indexOf(":") + 1).trim().replaceAll(",", ""); 
                    
                    if(I_FilterKey.contains("Dropdown")) {
                        Element_By_Path_Click("Click on Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", ParentTest, "no_jira");  
                            if (FAIL) { return;}                            
                        Scroll_to_WebElement("Scroll to '" + I_FilterValue + "'", "xpath", "//*[contains(text(), '" + I_FilterValue + "')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}    
                        Element_By_Path_Click("Select Item Value '" + I_FilterValue + "'", "xpath", "//*[contains(text(), '" + I_FilterValue + "')]", ParentTest, "no_jira"); 
                            if (FAIL) { return;}                 
                    }else{
                        Element_By_Path_Click("Open Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                        Element_By_Path_Click("Choose Item Key '" + I_FilterKey + "'", "xpath", "//*[contains(text(), '" + I_FilterKey + "')]", ParentTest, "no_jira");  
                            if (FAIL) { return;}
                        Element_By_Path_Text_Enter("Enter/Search Item '" + I_FilterValue + "'", "id", "filter-group-search",I_FilterValue , false, ParentTest, "no_jira");  
                            if (FAIL) { return;}                                                            
                        Element_By_Path_Click("Select Item Value '" + I_FilterValue + "'", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'" + I_FilterValue + "')]/..", ParentTest, "no_jira"); 
                            //if (FAIL) { return;} // do not return, juat log an error Search value not Found
                    }
                }
            }                
        }
            
        // ====  Apply cleared / new Selected filters
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "(//button/span[contains(.,'Apply')])[2]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for Metric data load...", "xpath", "//div[@role='progressbar']", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500); 
        List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");              
            if (FAIL) { return;} 
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
            if (FAIL) { return;} 
        if(L2.size() > 0) {    
            Element_Text("Loaded Metric Card name", L2.get(0), ParentTest, "no_jira");  
            if(L2.size() > 1) {  
                Element_Text("Loaded Metric Card Value 1", L2.get(1), ParentTest, "no_jira"); 
                if(t.startsWith("$")){
                    t = t.replace("$", "").replace(",", "").trim();
                    FE_Value = Float.parseFloat(t);
                    
                    if(Math.abs(QA_Value - FE_Value) <= (QA_Value * 0.01)) { // ========= 1% precision =============
                        Log_Html_Result("PASS", "QA Value: " + QA_Value + " > FE $Value: " + FE_Value, false, ParentTest.createNode("Compare QA_Value and FE_Value"));
                        EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + FE_Value + "\t" + "PASS" + "\t" + " - " +
                        "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                        _p++; 
                    }else{
                        Log_Html_Result("FAIL", "QA Value: " + QA_Value + " > FE $Value: " + FE_Value, true, ParentTest.createNode("Compare QA_Value and FE_Value"));
                        EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + FE_Value + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + " -" + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                        _f++;                            
                    }
                } else{
                    Log_Html_Result("FAIL", "QA Value: " + QA_Value + " > FE $Value: " +  " Not Found ", true, ParentTest.createNode("Compare QA_Value and FE_Value"));
                    EX += _t + "\t" + "Compare QA_Value and FE_Value" + "\t" + "QA Value: " + QA_Value + "\t" + "FE $Value: " + " Not Found " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n";
                    _f++;                        
                }
                if(L2.size() > 2) {     
                    Element_Text("Loaded Metric Card Value 2", L2.get(2), ParentTest, "no_jira");         
                }   
            }
        }        
    }   
} 
