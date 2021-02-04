/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;
import A.A;
import A.T;
import static A.A.*;
import static DL.DL.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_metric_data {
    public static void run() throws InterruptedException {    
	  
	     Thread.sleep(10000);
	     
			/*
			 * ***********************************************************************************************************************
			 ************************Contract Utilization Rate (CUR)Sum (Contracted Spend)/ Sum (Total Spend).************************
			 *************************************************************************************************************************
			 */
	//Select Total Spend
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Total Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=1]", "no_jira"); 
    	if (FAIL) { return;}
    	Thread.sleep(6000);    
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Total Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
        if (FAIL) { return;}
        A.var2 = Integer.parseInt(T.get_Text(A.t)) ;
        //System.out.println("var 2 "+ var2);
        
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Total Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=1]", "no_jira"); 
        if (FAIL) { return;}
        
        	
         //Select Contracted Spend
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);
       
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       	if (FAIL) { return;}
       	A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
        //System.out.println("var 1" +var1);
        
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
        if (FAIL) { return;}
        	
        	
        
       //Select Contract Utilization Rate (CUR)
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Contract Utilization Rate' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Contract Utilization Rate' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       	if (FAIL) { return;}
       	
       	A.var3=Double.parseDouble(T.get_Text(A.t));
       	//System.out.println("var3 "+ var3);      
        _t++; Thread.sleep((long) sleep); T.calculation("Verifying Contract Utilization Rate (CUR) = Sum (Contracted Spend)/ Sum (Total Spend) =  ", "no jira");
        if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Contract Utilization Rate (CUR)' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=3]", "no_jira"); 
        if (FAIL) { return;}
        
        
    	/*									RATE OF RETURN								
		 * ***********************************************************************************************************************
		 ************************2 a. Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend).************************
		 *************************************************************************************************************************
		 */
        
        
        //Select program earned revenue	
	_t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       	if (FAIL) { return;}
       	
    	A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       	//System.out.println("var1 "+ var1);
       	
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
        if (FAIL) { return;}
        
        
      //Select program rate of return
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Program Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=11]", "no_jira"); 
        if (FAIL) { return;}
        Thread.sleep(16000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Program Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       	if (FAIL) { return;}
       	
       	//
       	A.var3=Double.parseDouble(T.get_Text(A.t));
       	//System.out.println("var3 "+ var3);      
        _t++; Thread.sleep((long) sleep); T.calculation("Verifying Program Rate of Return: Sum (Program Earned Revenue)/Sum (Total Spend)", "no jira");
        if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Program Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=11]", "no_jira"); 
        if (FAIL) { return;}
        
        
        /*														
		 * ***********************************************************************************************************************
		 ************************2 b. Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend).************************
		 *************************************************************************************************************************
		 */
        
        
      //Select Member Earned Revenue
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Member Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var1 "+ var1);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
       if (FAIL) { return;}
      
      
     //Select Member Rate of Return
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Member Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=5]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Member Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       if (FAIL) { return;}
     	
       A.var3=Double.parseDouble(T.get_Text(A.t));
       //System.out.println("var3 "+ var3);      
       _t++; Thread.sleep((long) sleep); T.calculation("Verifying 'Member Rate of Return: Sum (Member Earned Revenue)/ Sum (Total Spend)' ", "no jira");
       if (FAIL) { return;}
      
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Member Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=5]", "no_jira"); 
       if (FAIL) { return;}
       
       
       /*														
		 * ***********************************************************************************************************************
		 ************************2 c. Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend).************************
		 *************************************************************************************************************************
		 */
       
       
       //Select Customer Earned Revenue
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Customer Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var1 "+ var1);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
       if (FAIL) { return;}
      
      
     //Select Customer Rate of Return
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Customer Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=8]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Customer Rate of Return' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
       if (FAIL) { return;}
     	
       A.var3=Double.parseDouble(T.get_Text(A.t));
      // System.out.println("var3 "+ var3);      
       _t++; Thread.sleep((long) sleep); T.calculation("Verifying 'Customer Rate of Return: Sum (Customer Earned Revenue)/ Sum (Total Spend)' ", "no jira");
       if (FAIL) { return;}
      
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Customer Rate of Return' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=8]", "no_jira"); 
       if (FAIL) { return;}
       
       
       /*									3.	Strength of Program							
		 * ***********************************************************************************************************************
		 ************************a.Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend)************************
		 *************************************************************************************************************************
		 */
       
       //Select Contracted Spend
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Contracted Spend' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var2 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var2 "+ var2);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Contracted Spend' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=2]", "no_jira"); 
       if (FAIL) { return;}
       
       
       
       //Select Program Earned Revenue
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(10000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Program Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var1 "+ var1);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Program Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=10]", "no_jira"); 
       if (FAIL) { return;}
       
       
       
       //Select Program Strength of Program
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Program Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=12]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Program Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var3 = Double.parseDouble(T.get_Text(A.t)) ;
       //System.out.println("var3 "+ var3);
       _t++; Thread.sleep((long) sleep); T.calculation("Verifying 'Program Strength of Program: Sum (Program Earned Revenue)/ Sum (Contracted Spend' ", "no jira");
       if (FAIL) { return;}
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Program Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=12]", "no_jira"); 
       if (FAIL) { return;}
       
       Thread.sleep(2000);
       
       	/*														
     		 * ***********************************************************************************************************************
     		 ************************3 b.Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)************************
     		 *************************************************************************************************************************
        */
       
       
       //Select Member Earned Revenue
       
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Member Earned Revenue' checkbox ", "xpath", "  (//div[@class='MuiListItemIcon-root']/span/span/*[name()='svg']/*)[position()=4]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Member Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var1 "+ var1);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Member Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=4]", "no_jira"); 
       if (FAIL) { return;}
       
       
       
       //Select Member Strength of Program
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Member Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=6]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(6000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Member Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var3 = Double.parseDouble(T.get_Text(A.t)) ;
       //System.out.println("var3 "+ var3);
       _t++; Thread.sleep((long) sleep); T.calculation("Verifying 'Member Strength of Program: Sum (Member Earned Revenue)/ Sum (Contracted Spend)' ", "no jira");
       if (FAIL) { return;}
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Member Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=6]", "no_jira"); 
       if (FAIL) { return;}
       
       
   	/*														
		 * ***********************************************************************************************************************
		 ************************3 c. Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend) ************************
		 *************************************************************************************************************************
   */
       
       //Select Customer Earned Revenue
       
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Customer Earned Revenue' checkbox ", "xpath", "  (//div[@class='MuiListItemIcon-root']/span/span/*[name()='svg']/*)[position()=7]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(12000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Customer Earned Revenue' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var1 = Integer.parseInt(T.get_Text(A.t)) ;
       //System.out.println("var1 "+ var1);
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Customer Earned Revenue' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=7]", "no_jira"); 
       if (FAIL) { return;}
       
       
       
       //Select Customer Strength of Program
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check 'Customer Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "no_jira"); 
       if (FAIL) { return;}
       Thread.sleep(16000);	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Get the 'Customer Strength of Program' amount ", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]/div[2]/div[2]/p", "no_jira");
     	if (FAIL) { return;}
     	
       A.var3 = Double.parseDouble(T.get_Text(A.t)) ;
       //System.out.println("var3 "+ var3);
       _t++; Thread.sleep((long) sleep); T.calculation("Verifying 'Customer Strength of Program: Sum (Customer Earned Revenue)/ Sum (Contracted Spend)' ", "no jira");
       if (FAIL) { return;}
     	
       _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Uncheck 'Customer Strength of Program' checkbox ", "xpath", "(//div[@class='MuiListItemIcon-root']/span/span/input)[position()=9]", "no_jira"); 
       if (FAIL) { return;}
       
      }
 } 
