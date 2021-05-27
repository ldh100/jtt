package DL;

import com.aventstack.extentreports.ExtentTest;
import java.io.IOException;

class DL_metric_data extends DL_GUI {
    protected DL_metric_data (DL_GUI a) {
        DL_UserID = a.DL_UserID;
        DL_UserPW = a.DL_UserPW;
        url = a.url;
        d1 = a.d1;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        METRIC = a.METRIC;
        DATE_RANGE = a.DATE_RANGE;
    }
    protected void run(String CompareTo) throws InterruptedException, Exception {   
        double TS = 0.0;
        double CS = 0.0;
        double MER = 0.0;
        double CER = 0.0;
        double PER = 0.0;
        double CUR = 0.0;
        double MROR = 0.0;
        double MSOP = 0.0;
        double CROR = 0.0;
        double CSOP = 0.0;
        double PROR = 0.0;
        double PSOP = 0.0;  

        UnCheckMetrics(); // =================================================================================================================
        Element_By_Path_Click("Select Metric 'Total Spend'", "xpath", "//span[text()='" + "Total Spend" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric 'Contracted Spend'", "xpath", "//span[text()='" + "Contracted Spend" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Select Metric 'Contracted Utilization Rate'", "xpath", "//span[text()='" + "Contracted Utilization Rate" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        Thread.sleep(500);            
            
        Element_By_Path_Click("Select Date Range " + DATE_RANGE, "xpath", "//span[text()='" + DATE_RANGE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}           
Thread.sleep(5000);

        Element_By_Path_Click("Open TS 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get TS Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        TS = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CS 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
Thread.sleep(5000);
        Element_By_Path_Text("Get CS Valuet", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CS = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CUR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contract Utilization Rate')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
Thread.sleep(5000);
         Element_By_Path_Text("Get CUR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contract Utilization Rate')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CUR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Contract Utilization Rate Calculation", CS, TS, CUR, ParentTest, "no_jira" );

        UnCheckMetrics(); // =================================================================================================================
        Element_By_Path_Click("Select Metric " + "Member Earned Revenue", "xpath", "//span[text()='" + "Member Earned Revenue" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric " + "Member Rate of Return", "xpath", "//span[text()='" + "Member Rate of Return" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Select Metric " + "Member Strength of Program", "xpath", "//span[text()='" + "Member Strength of Program" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 

        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        Thread.sleep(500);

        Element_By_Path_Click("Open MER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
Thread.sleep(5000);
        Element_By_Path_Text("Get MER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open MROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get MROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open MSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
Thread.sleep(5000);
        Element_By_Path_Text("Get MSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Member Rate of Return Calculation",MER, TS, MROR, ParentTest, "no_jira" );
        SecondaryMetric_Calculation("Member Strength of Program Calculation", MER, CS, MSOP, ParentTest,"no_jira" );


        UnCheckMetrics(); // =================================================================================================================
        Element_By_Path_Click("Select Metric 'Customer Earned Revenue'", "xpath", "//span[text()='" + "Customer Earned Revenue" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric 'Customer Rate of Return'", "xpath", "//span[text()='" + "Customer Rate of Return" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Select Metric 'Customer Strength of Program'", "xpath", "//span[text()='" + "Customer Strength of Program" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        Thread.sleep(500);
        
        Element_By_Path_Click("Open CER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
Thread.sleep(5000);
        Element_By_Path_Text("Get CER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get CROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}


        CROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get CSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Customer Rate of Return Calculation", CER,TS, CROR, ParentTest,"no_jira" );
        SecondaryMetric_Calculation("Customer Strength of Program Calculation",CER,CS, CSOP, ParentTest, "no_jira" );

        UnCheckMetrics(); // =================================================================================================================
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Click("Select Metric " + "Program Earned Revenue", "xpath", "//span[text()='" + "Program Earned Revenue" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric " + "Program Rate of Return", "xpath", "//span[text()='" + "Program Rate of Return" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Select Metric " + "Program Strength of Program", "xpath", "//span[text()='" + "Program Strength of Program" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 

        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}   
        Thread.sleep(500);

        Element_By_Path_Click("Open PER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get PER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open PROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
Thread.sleep(5000);
        Element_By_Path_Text("Get PROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open PSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
Thread.sleep(5000);
        Element_By_Path_Text("Get PSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Program Rate of Return Calculation", PER,TS, PROR, ParentTest, "no_jira" );
        SecondaryMetric_Calculation("Program Strength of Program Calculation", PER,CS, PSOP, ParentTest, "no_jira" );
    }


    public void UnCheckMetrics() throws Exception {
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(500);

        Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        }
        Thread.sleep(500);
        List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");              
            if (FAIL) { return;}            
            if (L0.isEmpty()) { 
                return;  // No User Metrics Found FATAL ===================================================
            } 
        List_L0("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", ParentTest, "no_jira");              
            if (FAIL) { return;}  
            for (int j = 0; j < L0.size(); j++) { 
                Thread.sleep(500);
                Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), ParentTest, "no_jira"); 
            }   
    }
}
