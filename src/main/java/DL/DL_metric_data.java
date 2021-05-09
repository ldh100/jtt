package DL;
import A.TWeb;
import static A.A.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metric_data {
    public static void run() throws InterruptedException {   
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);
          _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "//*[text()='Filters']", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Filters' label", "Filters", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Configure Filters' button label", " Configure Filters", true,"no_jira");        
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira"); 
            if (!FAIL) {         
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Date Items count", e1,"xpath", ".//div[contains(@class, 'MuiGrid-root MuiGrid-item')]", "no_jira");             
                     if (FAIL) { return;}                              
                for (int i = 0; i < L1.size(); i++) {
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Date Items", L1.get(i), "no_jira");                          
                }
            }  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
            if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
            if (FAIL) { return;}  
        }
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Get User Metrics Count", "xpath", "//div[@class='MuiListItemIcon-root']", "no_jira");             
            if (FAIL) { return;}            
            if (L0.isEmpty()) { 
                return;  // No User Metrics Found FATAL ===================================================
            } 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", "no_jira");             
            if (FAIL) { return;}            
            for (int j = 0; j < L0.size(); j++) {        
                _t++; TWeb.Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), "no_jira");
            }        
        _t++; TWeb.Element_By_Path_Click("Select Metric " + DL.METRIC, "xpath", "//span[text()='" + DL.METRIC + "']", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;} 
            
        _t++; TWeb.Element_By_Path_Click("Select Date Range " + DL.DATE_RANGE, "xpath", "//span[text()='" + DL.DATE_RANGE + "']", "no_jira");
            if (FAIL) { return;}           
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", "no_jira");             
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L2("Loaded Metric Card '-body1' Count", L1.get(L1.size() - 1), "xpath", ".//p[contains(@class,'-body1')]", "no_jira");             
            if (FAIL) { return;} 
        if(L2.size() > 0) {    
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card name", L2.get(0), "no_jira"); 
            if(L2.size() > 1) {  
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card Value 1", L2.get(1), "no_jira");
                if(L2.size() > 2) {     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Loaded Metric Card Value 2", L2.get(2), "no_jira");        
                }   
            }
        }

    
        
        
        // Continue ...... Maybe not necessary
    } 
    
    
    public static void metrics() {
        List<String> metricList = new ArrayList<>();
            metricList.add("Total Spend");
            metricList.add("Contracted Spend");
            metricList.add("Contracted Utilization Rate");
            metricList.add("Member Earned Revenue");
            metricList.add("Member Rate of Return");
            metricList.add("Member Strength of Program");
            metricList.add("Customer Earned Revenue");
            metricList.add("Customer Rate of Return");
            metricList.add("Customer Strength of Program");
            metricList.add("Program Earned Revenue");
            metricList.add("Program Rate of Return");
            metricList.add("Program Strength of Program");
            
        metricList.stream().map(metric -> {
            _t++;
            return metric;
        }).forEachOrdered(metric -> {
            TWeb.Element_By_DisplayChecking("Check '" + metric + "' is Displayed", "xpath", "//div/span[contains(.,'" + metric + "')]/parent::div/parent::div/div/span/span/input", "no_jira");
        });
    }
}
//        
//        
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;}
//        if(t.equalsIgnoreCase("arrow_right")) {
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
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
//       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
//       SelectMetricCard("Member Earned Revenue", null, 4, 1);
//       SelectMetricCard("Member Strength of Program", "Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)", 6, 0);
//      
//       SelectMetricCard("Customer Earned Revenue", null, 7, 1);
//       SelectMetricCard("Customer Strength of Program", "Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)", 9, 0);
//       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
//    }
//    
//    public static  void SelectComparedToLastMonth_Week()throws InterruptedException {
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select metrics dropdown", "xpath", "//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", "no_jira"); 
//            if (FAIL) { return;}	    
//	Thread.sleep(500); 
//	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", "no_jira"); 
//            if (FAIL) { return;}
//
//    }
//    
//    public static void SelectMetricCard(String desc, String calcDesc, int position, int initVar) throws InterruptedException {
//    	Thread.sleep(6000);
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;} // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;}
//        if(t.equalsIgnoreCase("arrow_right")) {
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
//                if (FAIL) { return;} 
//        }
//        _t++; TWeb.Element_By_DisplayChecking("Check '" + desc + "' is Displayed ", "xpath", "//div/span[contains(.,'" + desc +"')]/parent::div/parent::div/div/span/span/input", "no_jira");
//        
//        metrics(); // ==============================
//        
//        if (FAIL) { return;}
//    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check '" + desc + "' checkbox", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=" +  position + "]", "no_jira"); 
//        if (FAIL) { return;}
//        Thread.sleep(12000);
//       
//        if(count != 0) {
//            SelectComparedToLastMonth_Week();
//        }
//       
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the '" + desc + "' amount", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
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
//            _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying '" + calcDesc + "'", "no jira");
//            if (FAIL) { return;}
//        } catch(Exception e) {
//            System.out.println(e);
//        }
//
//       _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck '" + desc + "' checkbox", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", "no_jira"); 
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
//            F += _t + " > " + err + "\r\n";
//	}  













