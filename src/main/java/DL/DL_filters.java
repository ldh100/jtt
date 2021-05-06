/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;
import static A.A.EX;
import static A.A.F;
import static A.A.FAIL;
import static A.A._f;
import static A.A._p;
import static A.A._t;
import static A.A.err;
import static A.A.sleep;
import static A.A.t;

import A.TWeb;
import static DL.DL.count;
import static DL.DL.var1;
import static DL.DL.var2;
import static DL.DL.var3;
import static DL.DL_metric_data.MetricCardsSelection;
public class DL_filters {
    public static void run() throws InterruptedException {    
       Thread.sleep(10000);  
       MetricCards("Total Spend", null, 1, 2);
       Thread.sleep(10000);
       MetricCards("Contracted Spend", null, 2, 1);
       Thread.sleep(10000);
       MetricCards("Contract Utilization Rate (CUR)", "Contract Utilization Rate (CUR) = Sum (Contracted Spend)/ Sum (Total Spend)", 3, 0);
       Thread.sleep(10000);
       MetricCards("Program earned revenue", null, 10, 1);
       Thread.sleep(10000);
       MetricCards("Program rate of return", "Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", 11, 0);
       Thread.sleep(10000);
       MetricCards("Member earned revenue", null, 4, 1);
       Thread.sleep(10000);
       MetricCards("Member rate of return", "Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend)", 5, 0);
       Thread.sleep(10000);
       MetricCards("Customer earned revenue", null, 7, 1);
       Thread.sleep(10000);
       MetricCards("Customer rate of return", "Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend)", 8, 0);
       Thread.sleep(10000);
       MetricCards("Contracted Spend", null, 2, 2);
       Thread.sleep(10000);
       MetricCards("Program Earned Revenue", null, 10, 1);
       Thread.sleep(10000);
       MetricCards("Program Strength of Program", "Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend)", 12, 0);
       Thread.sleep(10000);
       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
       Thread.sleep(10000);
       MetricCards("Member Earned Revenue", null, 4, 1);
       Thread.sleep(10000);
       MetricCards("Member Strength of Program", "Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)", 6, 0);
       Thread.sleep(10000);
       MetricCards("Customer Earned Revenue", null, 7, 1);
       Thread.sleep(10000);
       MetricCards("Customer Strength of Program", "Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)", 9, 0);
       _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
              
//        MetricCards();
            
      }
    public static void MetricCards(String desc, String calcDesc, int position, int initVar)throws InterruptedException {
    	Thread.sleep(6000);

        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for side bar", "xpath", "(//span[@class='MuiButton-label'])[1]/span", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the side bar text ", "xpath", "(//span[@class='MuiButton-label'])[1]/span", "no_jira");
            if (FAIL) { return;}
        if(t.equalsIgnoreCase("arrow_right")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'To Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[1]", "no_jira"); 
            if (FAIL) { return;} 
        }

//metrics();        
    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check '"+desc+"' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(12000);
        Configure();
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the '"+desc+"' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck '"+desc+"' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()="+position+"]", "no_jira"); 
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
    }
    public static void Configure() throws InterruptedException {
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on configure filters", "xpath", "//button[contains(.,' Configure Filters')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_DisplayCheck("Delete the existing item", "xpath", "(//div[contains(@class,'MuiChip-deletable')]/*[name()='svg'])[1]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_DisplayCheck("Delete the existing item", "xpath", "(//div[contains(@class,'MuiChip-deletable')]/*[name()='svg'])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_DisplayCheck("Delete the existing item", "xpath", "(//div[contains(@class,'MuiChip-deletable')]/*[name()='svg'])[1]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_DisplayCheck("Delete the existing item", "xpath", "(//div[contains(@class,'MuiChip-deletable')]/*[name()='svg'])[1]", "no_jira");
        if (FAIL) { return;}
        //Division 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Division Name' from the dropdown box", "xpath", "(//*[contains(text(), 'Division')])[4]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
        if (FAIL) { return;}
//        Sector
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Sector Name' from the dropdown box", "xpath", "//*[contains(text(), 'Sector')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
        if (FAIL) { return;}
   //   District 2nd value
      Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'District Name' from the dropdown box", "xpath", "//*[contains(text(), 'District')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 2nd item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[2]/div[1]", "no_jira"); 
        if (FAIL) { return;}
    //    Region
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on first dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Region Name' from the dropdown box", "xpath", "(//*[contains(text(), 'Region')])[4]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div[1]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on dropdown menu", "xpath", "//*[contains(text(), 'Beverages')]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to apply dropdown",  "xpath", "//span[contains(.,'Apply')]", "no_jira");
   	if (FAIL) { return;}
   	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Apply button", "xpath", "//span[contains(.,'Apply')]", "no_jira"); 
        if (FAIL) { return;}
        
        Thread.sleep(8000);
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
