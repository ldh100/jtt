package DL;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Oleg.Spozito
 */
class DL__baseline_data extends DL_GUI {
    protected DL__baseline_data (DL_GUI a) {
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
    protected void run() throws InterruptedException, Exception {   
        Thread.sleep(500); 
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
        List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", ParentTest, "no_jira");              
            if (FAIL) { return;}            
            if (L0.isEmpty()) { 
                return;  // No User Metrics Found FATAL ===================================================
            } 
        List_L0("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", ParentTest, "no_jira");              
            if (FAIL) { return;}            
            for (int j = 0; j < L0.size(); j++) {        
                Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), ParentTest, "no_jira"); 
            } 
        List_L0("Metrics Subheader Count", "xpath", "//ul[contains(@class, 'MuiList-subheader')]", ParentTest, "no_jira");              
            if (FAIL) { return;}  
        for (int i = 0; i < L0.size(); i++) {
            Element_Child_Text("Metrics Subheader Title", L0.get(i),"xpath", ".//p[contains(@class, 'MuiTypography-body1')]", ParentTest, "no_jira");                           
                if (FAIL) { return;}
            if(t.toUpperCase().equals("BASELINE"))   {
                Element_Child_List_L1(t + " > Metrics count", L0.get(i),"xpath", ".//span[contains(@class, 'MuiTypography-displayBlock')]", ParentTest, "no_jira");                           
                    if (FAIL) { return;}
                for (int j = 0; j < L1.size(); j++) {
                    Element_Text("Metric " + j + " name", L1.get(j), ParentTest, "no_jira"); 
                    Element_Click("Select Metric " + t, L1.get(j), ParentTest, url);
                }             
            } 
           
        }            
              
        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
        Element_By_Path_Click("Select Date Range " + DATE_RANGE, "xpath", "//span[text()='" + DATE_RANGE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}           
            
        List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", ParentTest, "no_jira");              
            if (FAIL) { return;} 
        Element_Child_List_L2("Loaded Metric Card '-body1' Count", L1.get(L1.size() - 1), "xpath", ".//p[contains(@class,'-body1')]", ParentTest, "no_jira");              
            if (FAIL) { return;} 
        if(L2.size() > 0) {    
            Element_Text("Loaded Metric Card name", L2.get(0), ParentTest, "no_jira");  
            if(L2.size() > 1) {  
                Element_Text("Loaded Metric Card Value 1", L2.get(1), ParentTest, "no_jira"); 
                if(L2.size() > 2) {     
                    Element_Text("Loaded Metric Card Value 2", L2.get(2), ParentTest, "no_jira");         
                }   
            }
        }

    
        
        
        // Continue ...... Maybe not necessary
    } 
    
    

}
//        
//        
//        Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
//            if (FAIL) { return;} 
//        Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
//        if(t.equalsIgnoreCase("arrow_right")) {
//            Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira");  
//                if (FAIL) { return;} 
//        }    
//        
//        Thread.sleep(500);
//	for (int i = 0; i < 3; i++) {
//	    count = i;
//	    if(i == 1)  metricRef = "Compared to last month";
//	    if(i == 2)  metricRef = "Compared to last week";	 
//	    MetricCardsSelection();      
//	}   	
//    }
//    
//    public static void MetricCardsSelection()throws InterruptedException {
//       Thread.sleep(6000);
//
//       SelectMetricCard("Total Spend", null, 1, 2);
//       Thread.sleep(6000);
//       SelectMetricCard("Contracted Spend", null, 2, 1);
//       Thread.sleep(6000);
//       SelectMetricCard("Contract Utilization Rate (CUR)", "Contract Utilization Rate (CUR) = Sum (Contracted Spend)/ Sum (Total Spend)", 3, 0);
//   
//       Thread.sleep(6000);
//       SelectMetricCard("Program earned revenue", null, 10, 1);
//       SelectMetricCard("Program rate of return", "Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", 11, 0);
//       
//       SelectMetricCard("Member earned revenue", null, 4, 1);
//       SelectMetricCard("Member rate of return", "Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend)", 5, 0);
//      
//       SelectMetricCard("Customer earned revenue", null, 7, 1);
//       SelectMetricCard("Customer rate of return", "Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend)", 8, 0);
//       
//      
//       SelectMetricCard("Contracted Spend", null, 2, 2);
//       SelectMetricCard("Program Earned Revenue", null, 10, 1);
//       SelectMetricCard("Program Strength of Program", "Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend)", 12, 0);
//      
//       To_Top(ParentTest, "no_jira"); 
//       SelectMetricCard("Member Earned Revenue", null, 4, 1);
//       SelectMetricCard("Member Strength of Program", "Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)", 6, 0);
//      
//       SelectMetricCard("Customer Earned Revenue", null, 7, 1);
//       SelectMetricCard("Customer Strength of Program", "Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)", 9, 0);
//       To_Top(ParentTest, "no_jira"); 
//    }
//    
//    public static  void SelectComparedToLastMonth_Week()throws InterruptedException {
//        Element_By_Path_Click("Select metrics dropdown", "xpath", "//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
//            if (FAIL) { return;}	    
//	Thread.sleep(500); 
//	Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
//            if (FAIL) { return;}
//
//    }
//    
//    public static void SelectMetricCard(String desc, String calcDesc, int position, int initVar) throws InterruptedException {
//    	Thread.sleep(6000);
//        Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
//            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
//        Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
//        if(t.equalsIgnoreCase("arrow_right")) {
//            Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", ParentTest, "no_jira");  
//                if (FAIL) { return;} 
//        }
//        Element_By_DisplayChecking("Check '" + desc + "' is Displayed ", "xpath", "//div/span[contains(.,'" + desc +"')]/parent::div/parent::div/div/span/span/input", ParentTest, "no_jira"); 
//        
//        metrics(); // ==============================
//        
//        if (FAIL) { return;}
//    	Element_By_Path_Click("Check '" + desc + "' checkbox", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=" +  position + "]", ParentTest, "no_jira");  
//        if (FAIL) { return;}
//        Thread.sleep(12000);
//       
//        if(count != 0) {
//            SelectComparedToLastMonth_Week();
//        }
//       
//        Element_By_Path_Text("Get the '" + desc + "' amount", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
//       	
//        try {
//            switch (initVar) {
//                case 1:
//                    var1 = Integer.parseInt(get_Text(t));
//                    break;
//                case 2:
//                    var2 = Integer.parseInt(get_Text(t));
//                    break;
//                default:
//                    var3 = Double.parseDouble(get_Text(t)) ;
//                    break;
//            }
//            DL_Calculation_1("Verifying '" + calcDesc + "'", "no jira");
//            if (FAIL) { return;}
//        } catch(Exception e) {
//            System.out.println(e);
//        }
//
//       Element_By_Path_Click("Uncheck '" + desc + "' checkbox", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", ParentTest, "no_jira");  
//        if (FAIL) { return;}
//    }
// 


//    public static String get_Text(String str) {
//    	for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '$') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == ',') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == '(') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == ')') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == '%') str = str.replace(String.valueOf(str.charAt(i)), "");
//	}
//    	return str;
//    }
//    private static void DL_Calculation_1(String NAME, String JIRA) {
//	String status;     
//	try {
//            double val = (double) var1 / var2 * 100;
//            double actVal = Math.round(val * 100.0) / 100.0;
//
//            if (actVal == (double) var3) {
//                t = "Actual value - " + actVal + " is matching with expected value - " + (double) var3;
//                status = "PASS";
//            } else {
//                t = "Actual value - " + actVal + " is not matching with expected value - " + (double) var3;
//                status = "FAIL";
//            }
//            _p++;
//            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + t + "\t" + status + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";			
//        } catch (Exception ex) {
//            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
//            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
//            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";
//            F += "Step: " + _t + " > " + err + "\r\n";
//	}  













