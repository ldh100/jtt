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
        /*
         * ***********************************************************************************************************************
         ************************Contract Utilization Rate (CUR)Sum (Contracted Spend)/ Sum (Total Spend).************************
         *************************************************************************************************************************
         */
	//Select Total Spend // Compared to Last Year
        Thread.sleep(6000); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Total Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=1]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Total Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
        int var2 = Integer.parseInt(get_Text(t)); //System.out.println("var 2 "+ var2); 
        
        //Compared to Last Month
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
  
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last month", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[2]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Total Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        int var_last_month_ts = Integer.parseInt(get_Text(t));System.out.println(var_last_month_ts);
        Thread.sleep(500);
        
        //Compared to Last Week
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
  
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last week", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[3]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Total Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        int var_last_week_ts = Integer.parseInt(get_Text(t));System.out.println(var_last_week_ts);
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Total Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=1]", "no_jira"); 
            if (FAIL) { return;} 
            
         //Select Contracted Spend  // Compared to Last Year
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
        int var1 = Integer.parseInt(get_Text(t)); //System.out.println("var 1" +var1);
        
        //Compared to Last Month
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last month", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[2]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        int var_last_month_cs = Integer.parseInt(get_Text(t));System.out.println(var_last_month_cs);
        
        //Compared to Last Week
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last week", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[3]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
         
        int var_last_week_cs = Integer.parseInt(get_Text(t));System.out.println(var_last_week_cs);
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
            if (FAIL) { return;}


       //Select Contract Utilization Rate (CUR) // Compared to Last Year
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Contract Utilization Rate' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=3]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contract Utilization Rate' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
       	
        double var3 = Double.parseDouble(get_Text(t)); //System.out.println("var3 "+ var3); 
        
       //Compared to Last Month
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last month", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[2]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contract Utilization Rate' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        double var_last_month_cur = Double.parseDouble(get_Text(t));
        System.out.println(var_last_month_cur);
        
        //Compared to Last Week
         Thread.sleep(10000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last week", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[3]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contract Utilization Rate' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        double var_last_week_cur = Double.parseDouble(get_Text(t));System.out.println(var_last_week_cur);
        
        
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Contract Utilization Rate (CUR) for Last Year = Sum (Contracted Spend)/ Sum (Total Spend) =  ", var1, var2, var3, "no jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Contract Utilization Rate (CUR) for Last Month  = Sum (Contracted Spend)/ Sum (Total Spend) =  ", var_last_month_cs, var_last_month_ts, var_last_month_cur, "no jira");
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Contract Utilization Rate (CUR) for Last Week  = Sum (Contracted Spend)/ Sum (Total Spend) =  ",  var_last_week_cs, var_last_week_ts,  var_last_week_cur, "no jira");
            if (FAIL) { return;} 
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Contract Utilization Rate (CUR)' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=3]", "no_jira"); 
            if (FAIL) { return;}
        
    	/*									RATE OF RETURN								
        * ***********************************************************************************************************************
        ************************2 a. Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend).************************
        *************************************************************************************************************************
        */
        //Select program earned revenue //Compared to Last Year
        Thread.sleep(8000);
	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
    	var1 = Integer.parseInt(get_Text(t)) ;//System.out.println("var1 "+ var1);
        
        //Compared to Last Month
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last month", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[2]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        int var_last_month_per = Integer.parseInt(get_Text(t));System.out.println(var_last_month_per);
        Thread.sleep(500);
        
        //Compared to Last Week
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last week", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[3]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        int var_last_week_per = Integer.parseInt(get_Text(t));System.out.println(var_last_week_per);
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
            if (FAIL) { return;}

        //Select program rate of return
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Program Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=11]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  	
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;}
       	var3 = Double.parseDouble(get_Text(t));
       	//System.out.println("var3 "+ var3);   
        
        //Compared to Last Month
         Thread.sleep(25000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last month", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[2]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        double var_last_month_ror = Double.parseDouble(get_Text(t));
        System.out.println(var_last_month_ror);
        
        //Compared to Last Week
         Thread.sleep(20000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Dropdown List ", "xpath", "//body/div[@id='root']/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the Compared to last week", "xpath", "(//li[starts-with(@class,'MuiButtonBase-root')])[3]", "no_jira"); 
            if (FAIL) { return;}
           Thread.sleep(4000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
            if (FAIL) { return;} 
        double var_last_week_ror = Double.parseDouble(get_Text(t));System.out.println(var_last_week_ror);
        
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", var1, var2, var3, "no jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", var_last_month_per, var_last_month_ts, var_last_month_ror, "no jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)",  var_last_week_per, var_last_week_ts,  var_last_week_ror, "no jira");
            if (FAIL) { return;} 
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Program Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=11]", "no_jira"); 
            if (FAIL) { return;}
        
        
        /*														
        * ***********************************************************************************************************************
        ************************2 b. Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend).************************
        *************************************************************************************************************************
        */
//        //Select Member Earned Revenue
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Member Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var1 = Integer.parseInt(get_Text(t)) ;
//        //System.out.println("var1 "+ var1);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Member Rate of Return
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Member Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=5]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Member Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var3 = Double.parseDouble(get_Text(t));
//        //System.out.println("var3 "+ var3);      
//        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying 'Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend)' ", var1, var2, var3, "no jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Member Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=5]", "no_jira"); 
//            if (FAIL) { return;}
       
       
       /*														
        * ***********************************************************************************************************************
        ************************2 c. Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend).************************
        *************************************************************************************************************************
        */
//        //Select Customer Earned Revenue
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Customer Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var1 = Integer.parseInt(get_Text(t)) ;
//        //System.out.println("var1 "+ var1);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Customer Rate of Return
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Customer Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=8]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Customer Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var3 = Double.parseDouble(get_Text(t));
//       // System.out.println("var3 "+ var3);      
//        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying 'Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend)' ", var1, var2, var3, "no jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Customer Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=8]", "no_jira"); 
//            if (FAIL) { return;}


        /*	3.	Strength of Program							
         * ***********************************************************************************************************************
         ************************a.Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend)************************
         *************************************************************************************************************************
        */
//        //Select Contracted Spend
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var2 = Integer.parseInt(get_Text(t)) ;
//        //System.out.println("var2 "+ var2);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Program Earned Revenue
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var1 = Integer.parseInt(get_Text(t)) ;
//        //System.out.println("var1 "+ var1);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Program Strength of Program
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Program Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=12]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Program Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//
//        var3 = Double.parseDouble(get_Text(t)) ;
//        //System.out.println("var3 "+ var3);
//        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying 'Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend' ", var1, var2, var3, "no jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Program Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=12]", "no_jira"); 
//            if (FAIL) { return;}
        //Thread.sleep(2000);

         /*														
        *************************************************************************************************************************
        ************************3 b.Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)**************
        *************************************************************************************************************************
         */
        //Select Member Earned Revenue
//        Thread.sleep(5000); 
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Member Earned Revenue' checkbox ", "xpath", "  (//div[@class='MuiListItemIcon-root']/span/span/*[name()='svg']/*)[position()=4]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Member Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var1 = Integer.parseInt(get_Text(t)) ; //System.out.println("var1 "+ var1);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Member Strength of Program
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Member Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=6]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Member Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//
//        var3 = Double.parseDouble(get_Text(t)) ;
//        //System.out.println("var3 "+ var3);
//        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying 'Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)' ", var1, var2, var3, "no jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Member Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=6]", "no_jira"); 
//            if (FAIL) { return;}


        /*														
        ************************************************************************************************************************
        ************************3 c. Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend) ************************
        *************************************************************************************************************************
        */
        //Select Customer Earned Revenue
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Customer Earned Revenue' checkbox ", "xpath", "  (//div[@class='MuiListItemIcon-root']/span/span/*[name()='svg']/*)[position()=7]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  	
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Customer Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var1 = Integer.parseInt(get_Text(t)) ; //System.out.println("var1 "+ var1);
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
//            if (FAIL) { return;}
//
//        //Select Customer Strength of Program
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Customer Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "no_jira"); 
//            if (FAIL) { return;}
//        Thread.sleep(500);  
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//            if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the 'Customer Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
//            if (FAIL) { return;}
//        var3 = Double.parseDouble(get_Text(t)) ; //System.out.println("var3 "+ var3);
//        _t++; Thread.sleep((long) sleep); DL_Calculation_1("Verifying 'Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)' ", var1, var2, var3, "no jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Uncheck 'Customer Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "no_jira"); 
//            if (FAIL) { return;}
   }

    private static String get_Text(String str) {
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

    private static void DL_Calculation_1(String NAME, int var1, int var2, double var3, String JIRA ) {
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
