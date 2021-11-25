package DL;

import com.aventstack.extentreports.ExtentTest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        Variants = a.Variants;
        System.out.println(Variants);
    }
    protected void run(String CompareTo, String Variants) {  
    try {    
        SelectMember();
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
        String Var4="";
        String Var5="";
        String Var6="";
        String Var7="";
        String Var8="";
        String Var9="";
        String Var10="";
        if(Variants.equalsIgnoreCase("Total")) {
            Var4="Contract Utilization Rate";
            Var5="Member Rate of Return";
            Var6="Member Strength of Program";
            Var7="Customer Rate of Return";
            Var8="Customer Strength of Program";
            Var9="Program Rate of Return";
            Var10="Program Strength of Program";   
        } else {
            Var4="CUR";
            Var5="Member RoR";
            Var6="Member SoP";
            Var7="Customer RoR";
            Var8="Customer SoP";
            Var9="Program RoR";
            Var10="Program SoP";
        }
        UnCheckMetrics(); // ===============
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
        SelectVariants();
        Thread.sleep(5000);
        Element_By_Path_Click("Open TS 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get TS Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        TS = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Thread.sleep(5000);
        Element_By_Path_Click("Open CS 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Thread.sleep(5000);
        Element_By_Path_Text("Get CS Valuet", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CS = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Thread.sleep(7000);
      
        Element_By_Path_Click("Open CUR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var4+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Thread.sleep(5000);
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Thread.sleep(5000);
         Element_By_Path_Text("Get CUR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var4+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
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
        SelectVariants();
        Thread.sleep(5000);
        Element_By_Path_Click("Open MER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Thread.sleep(5000);
        Element_By_Path_Text("Get MER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open MROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var5+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get MROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var5+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open MSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var6+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Thread.sleep(5000);
        Element_By_Path_Text("Get MSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var6+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        MSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Member Rate of Return Calculation",MER, TS, MROR, ParentTest, "no_jira" );
        SecondaryMetric_Calculation("Member Strength of Program Calculation", MER, CS, MSOP, ParentTest,"no_jira" );


        UnCheckMetrics(); // ================================
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
        SelectVariants();
        Thread.sleep(5000);
        Element_By_Path_Click("Open CER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
        Thread.sleep(5000);
        Element_By_Path_Text("Get CER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var7+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get CROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var7+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}


        CROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open CSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var8+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get CSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var8+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        CSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Customer Rate of Return Calculation", CER,TS, CROR, ParentTest,"no_jira" );
        SecondaryMetric_Calculation("Customer Strength of Program Calculation",CER,CS, CSOP, ParentTest, "no_jira" );

        UnCheckMetrics(); // ===================================================
        Thread.sleep(2000);
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
        SelectVariants(); // ==========================
        Thread.sleep(5000);
        Element_By_Path_Click("Open PER 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get PER Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PER = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open PROR 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var9+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Thread.sleep(5000);
        Element_By_Path_Text("Get PROR Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var9+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PROR = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        Element_By_Path_Click("Open PSOP 'Compare to' dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var10+ "')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select '" + CompareTo + "'", "xpath", "//ul/li[contains(.,'" + CompareTo + "')]", ParentTest, "no_jira");  
            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Get PSOP Value", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" +Var10+ "')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}

        PSOP = Double.parseDouble(t.replace("$", "").replace(",", "").replace("%", "").replace("(", "").replace(")", ""));
        SecondaryMetric_Calculation("Program Rate of Return Calculation", PER,TS, PROR, ParentTest, "no_jira" );
        SecondaryMetric_Calculation("Program Strength of Program Calculation", PER,CS, PSOP, ParentTest, "no_jira" );
    } catch (Exception ex){}   // =============================================  
    }


    public void UnCheckMetrics() {
        try {    
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");  
                if (FAIL) { return;}  
            Thread.sleep(500);

            Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            if(t.equalsIgnoreCase("arrow_right")) {
                Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "//span[contains(text(),'arrow_right')]", ParentTest, "no_jira");  
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
        } catch (Exception ex){}   // =============================================  
    }
    
    public void SelectVariants() {
        try {    
            List_L2("More icon on Metric Cards", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//button[contains(@class,'MuiButtonBase-root MuiIconButton-root jss')]", ParentTest, "no_jira");
            for (int i = 0; i < L2.size(); i++) {
               Thread.sleep(500);
                Element_Click("Click on the More icon on metric cards", L2.get(i), ParentTest, "no_jira");
                           Thread.sleep(500);
                List_L1("More icon on Metric Cards", "xpath", "//ul/li", ParentTest, "no_jira");
                Thread.sleep(500);

                if(!L1.isEmpty()&& L1.size()==1) {
                    System.out.println(L1.size());
                    Find_Text("Find Variant '" +  "Total" + "'", "Total", true, ParentTest, "no_jira");
                    if (t.equals("Not Found")) {
                        return;  
                    }
                    Element_By_Path_Click("Select Variant Total", "xpath", "//ul/li[contains(text(), 'Total')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;}  
                } else {
                    Find_Text("Find Variant '" + Variants + "'", Variants, true, ParentTest, "no_jira");
                    if (t.equals("Not Found")) {
                        return;  
                    }
                    Element_By_Path_Click("Select Variant " + Variants, "xpath", "//ul/li[contains(., '" + Variants + "')]", ParentTest, "no_jira"); 
                        if (FAIL) { return;} 
                }
            }
        } catch (Exception ex){
            // =============================================  
        }   
    }
    public void SelectMember() {
        try{
            Text_Found("Check member is Displayed ", "My Members", ParentTest, "no_jira");
            if (t.equalsIgnoreCase("Not Found")) {
                return;
            }
            List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
                if (FAIL) { return; }
            if (L2 == null || L2.size() == 0) {
                List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                    if (FAIL) { return; }
            }
            List<String> Memberlist = new ArrayList<>();

            Element_Click("Members Selection List" + (0 + 1), L2.get(0), ParentTest, "no_jira");
            Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
                if (FAIL) { return; }
            Thread.sleep(5000);
        }catch (Exception ex){
            // ==============
        }
    }
}