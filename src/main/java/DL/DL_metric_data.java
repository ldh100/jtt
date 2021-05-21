package DL;

import com.aventstack.extentreports.ExtentTest;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 *
 * @author Oleg.Spozito
 */
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
        //System.out.println(a.METRIC);
        DATE_RANGE = a.DATE_RANGE;
       // System.out.println(a.DATE_RANGE);
        
        
    }
  protected void run() throws InterruptedException, Exception {   
          
  String metricRef="Compared to last year";
   Thread.sleep(500);
	for (int i = 0; i < 3; i++) {
	    
	    if(i == 1)  metricRef = "Compared to last month";
	    if(i == 2)  metricRef = "Compared to last week";	 
       Thread.sleep(5000); 
        int TS;
        int CS;
        int MER;
        int CER;
        int PER;
        double CUR;
        double MROR;
        double MSOP;
        double CROR;
        double CSOP;
        double PROR;
        double PSOP;
        UnCheckMetrics();
        Element_By_Path_Click("Select Metric " + "Total Spend", "xpath", "//span[text()='" + "Total Spend" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric " + "Contracted Spend", "xpath", "//span[text()='" + "Contracted Spend" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Select Metric " + "Contracted Utilization Rate", "xpath", "//span[text()='" + "Contracted Utilization Rate" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(5000);
        Element_By_Path_Click("Select Date Range " + DATE_RANGE, "xpath", "//span[text()='" + DATE_RANGE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}           
        Thread.sleep(10000);
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
       Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        TS= Integer.parseInt(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
           
//              Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contracted Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
       // System.out.println(get_Text(t));
        CS= Integer.parseInt(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contract Utilization Rate')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//                  Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contract Utilization Rate')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
         Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Contract Utilization Rate')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        CUR= Double.parseDouble(get_Text(t));

         SecondaryMetric_Calculation(CS, TS, CUR, "Contract Utilization Rate Calculation", ParentTest, "no_jira" );
         UnCheckMetrics();
            
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
            
         
        Thread.sleep(10000);
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Total Spend')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
       Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        MER= Integer.parseInt(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        MROR= Double.parseDouble(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
         Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Member Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
      //  System.out.println(get_Text(t));
        MSOP= Double.parseDouble(get_Text(t));

         SecondaryMetric_Calculation(MER,TS, MROR, "Member Rate of Return Calculation",ParentTest, "no_jira" );
         SecondaryMetric_Calculation(MER,CS, MSOP, "Member Strength of Program Calculation", ParentTest,"no_jira" );
         UnCheckMetrics();
            
        Element_By_Path_Click("Select Metric " + "Customer Earned Revenue", "xpath", "//span[text()='" + "Customer Earned Revenue" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Select Metric " + "Customer Rate of Return", "xpath", "//span[text()='" + "Customer Rate of Return" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            Element_By_Path_Click("Select Metric " + "Customer Strength of Program", "xpath", "//span[text()='" + "Customer Strength of Program" + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  

        Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
          
        Thread.sleep(10000); 
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        CER= Integer.parseInt(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        CROR= Double.parseDouble(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Customer Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        CSOP= Double.parseDouble(get_Text(t));

         SecondaryMetric_Calculation(CER,TS, CROR, "Customer Rate of Return Calculation", ParentTest,"no_jira" );
         SecondaryMetric_Calculation(CER,CS, CSOP, "Customer Strength of Program Calculation",ParentTest, "no_jira" );
         UnCheckMetrics();
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
 //           Thread.sleep(500);
        Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
         
        Thread.sleep(10000); 
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Earned Revenue')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
      //  System.out.println(get_Text(t));
        PER= Integer.parseInt(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Rate of Return')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
        Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Rate of Return')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
      //  System.out.println(get_Text(t));
        PROR= Double.parseDouble(get_Text(t));
        Element_By_Path_Click("Select Metric reference dropdown", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Strength of Program')]/../..//div[starts-with(@class,'MuiSelect-root MuiSelect-select')]", ParentTest, "no_jira");  
            if (FAIL) { return;} 
        Element_By_Path_Click("Select metrics dropdown item '" + metricRef + "'", "xpath", "//ul/li[contains(.,'"+metricRef+"')]", ParentTest, "no_jira");  
            if (FAIL) { return;}
//        Wait_For_All_Elements_InVisibility("Wait for metric cards to load", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");  
//            if (FAIL) { return;}  
        Thread.sleep(5000);
         Element_By_Path_Text("Loaded Metrics Cards Count", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'Program Strength of Program')]/..//div[2]/div[1]/p", ParentTest, "no_jira");              
            if (FAIL) { return;}
 
       // System.out.println(get_Text(t));
        PSOP= Double.parseDouble(get_Text(t));

         SecondaryMetric_Calculation(PER,TS, PROR, "Program Rate of Return Calculation", ParentTest, "no_jira" );
         SecondaryMetric_Calculation(PER,CS, PSOP, "Program Strength of Program Calculation",ParentTest, "no_jira" );
        }
    }

    
        
        

 public void UnCheckMetrics() throws Exception
    {
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
              Thread.sleep(500);  
       
                Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), ParentTest, "no_jira"); 
            }   
    }
    public String get_Text(String str) {
    	for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ',') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '(') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == ')') str = str.replace(String.valueOf(str.charAt(i)), "");
            if (str.charAt(i) == '%') str = str.replace(String.valueOf(str.charAt(i)), "");
	}
    	return str;
    }
    private void SecondaryMetric_Calculation(int var1,int var2, double var3, String NAME,ExtentTest ParentTest, String JIRA) {
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
            F += "Step: " + _t + " > " + err + "\r\n";
	}  
    }
}
