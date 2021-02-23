/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metric_data {
    public static void run() throws InterruptedException {     
       Thread.sleep(6000);
	for (int i = 0; i < 3; i++) {
	    	 System.out.println("count "+i);
	    	 count = i;
	    	 if(i==1) 
	    		 metricRef="Compared to last month";
	    	 if(i==2) 
	    		 metricRef="Compared to last week";	 
	    	 
	    	 MetricCardsSelection();
	     }
	    	
      }
    
    public static void MetricCardsSelection()throws InterruptedException {

       SelectMetricCard("Total Spend", null, 1, 2);
       SelectMetricCard("Contracted Spend", null, 2, 1);
       SelectMetricCard("Contract Utilization Rate (CUR)", "Contract Utilization Rate (CUR) = Sum (Contracted Spend)/ Sum (Total Spend)", 3, 0);
   
       
       SelectMetricCard("Program earned revenue", null, 10, 1);
       SelectMetricCard("Program rate of return", "Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", 11, 0);
       
       SelectMetricCard("Member earned revenue", null, 4, 1);
       SelectMetricCard("Member rate of return", "Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend)", 5, 0);
      
       SelectMetricCard("Customer earned revenue", null, 7, 1);
       SelectMetricCard("Customer rate of return", "Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend)", 8, 0);
       
      
       SelectMetricCard("Contracted Spend", null, 2, 2);
       SelectMetricCard("Program Earned Revenue", null, 10, 1);
       SelectMetricCard("Program Strength of Program", "Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend)", 12, 0);
      
       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
       SelectMetricCard("Member Earned Revenue", null, 4, 1);
       SelectMetricCard("Member Strength of Program", "Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)", 6, 0);
      
       SelectMetricCard("Customer Earned Revenue", null, 7, 1);
       SelectMetricCard("Customer Strength of Program", "Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)", 9, 0);
       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
    }
    
    public static  void SelectComparedToLastMonth_Week()throws InterruptedException {
    	 _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select metrics dropdown", "xpath", "//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", "no_jira"); 
	      if (FAIL) { return;}
	    
	      Thread.sleep(2000); 
		 _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select metrics dropdown item '"+metricRef+"' ", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", "no_jira"); 
		  if (FAIL) { return;}
		  Thread.sleep(12000);
    }
    
    public static void SelectMetricCard(String desc, String calcDesc, int position, int initVar)throws InterruptedException {
    	
    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check '"+desc+"' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(12000);
       
        if(count != 0)
        	SelectComparedToLastMonth_Week();
       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the '"+desc+"' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       	if (FAIL) { return;}
       	
       	
       	if (initVar == 1) {
			var1 = Integer.parseInt(get_Text(t));
		}else if (initVar == 2) {
			var2 = Integer.parseInt(get_Text(t));
		}else {
			var3 = Double.parseDouble(get_Text(t)) ;
            _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying '"+calcDesc+"' ", "no jira");
            if (FAIL) { return;}
		}
       	
        
       _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck '"+desc+"' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", "no_jira"); 
        if (FAIL) { return;}
    }
 
    
      public static String get_Text(String str) {
    	for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ',') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '(') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ')') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '%') str = str.replace(String.valueOf(str.charAt(i)), "");
	}
    	//System.out.println("final str "+str);
    	return str;
    }

    private static void DL_Calculation_1(String NAME, String JIRA) {
	String status;     
	try {
            double val = (double) var1 / var2 * 100;
            double actVal = Math.round(val * 100.0) / 100.0;

            if (actVal == (double) var3) {
                t = "Actual value - " + actVal + " is matching with expected value - " + (double) var3;
                status = "PASS";
            } else {
                t = "Actual value - " + actVal + " is not matching with expected value - " + (double) var3;
                status = "FAIL";
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + t + "\t" + status + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";
			
        } catch (Exception ex) {
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
	}
    }

    }

