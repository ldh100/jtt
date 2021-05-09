// <editor-fold defaultstate="collapsed" desc="Pilot Oleg's template">
package DL;
import A.TWeb;
import static A.A.*;
import static DL.DL.*;
/**
 *
 * @author Oleg.Spozito
 */
public class DL_qa_user {
    private static String TrasLate_Date_Range(String DR){
       switch (DR) {
            case "L4":
                return "Last 4 weeks";
            case "L12":
                return "Last 12 weeks";
            case "L52":
                return "Last 52 weeks";                       
            case "CYTD":
                return "Calendar YTD"; 
            case "FYTD":
               return "Foodbuy YTD"; 
            default:
               break;   
        }
        return "Not Found";
    }
    public static void run(String BROWSER, String User_ID, String Metric, String Period, String Location_Filters, String Item_Filters, String Kpi, String Source) throws InterruptedException { 
        if(!User_ID.equals(DL_UserID)){
            DL_UserID = User_ID; // Use last QA User from S3 for the next in the loop

            _t++; Thread.sleep((long) sleep); TWeb.Clear_Cookies_Restart_Driver(BROWSER,"no_jira");  
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url, "no_jira"); 
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for 'USERNAME' input", "id", "username", "no_jira");
                if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'USERNAME' input", "id", "username", "no_jira"); 
                if (FAIL) { return;}
            _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Name", "id", "username", User_ID, false, "no_jira"); 
                if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'PASSWORD' input", "id", "password", "no_jira"); 
                if (FAIL) { return;}
            _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid User Password", "id", "password", DL_UserPW, true, "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);  
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Login page URL", "no_jira");                     
            _t++; Thread.sleep((long) sleep); TWeb.List_L0("Check for Login Messages (count)", "xpath", "//*[@class = 'message' or @class = 'note note-danger']", "no_jira");             
                if (FAIL) { return;}
            if(!L0.isEmpty()){
                _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Message text", L0.get(0), "no_jira");
                if(t.contains("locked")){   // This account has been locked. 
                    EX += _t + "\t" + "Check for Login Messages" + "\t" + DL_UserID + "\t" + "This account has been locked." + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
                    F += _t + " > " + DL_UserID + " > " + "Invalid credentials." + "\r\n";
                    DL_UserID = User_ID + " Bad Login";
                    return;
                } else {                      // ...will expire
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reset Password Now' button", "name", "resetPasswordNow", "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Reset Later' button", "name", "continue", "no_jira");
                        if (FAIL) { return;}            
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Reset Later'", e1, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);  
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                        if (FAIL) { return;}  
                    Thread.sleep(500); 
                }
            } 
            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Invalid credentials'", "Invalid credentials.", false,"no_jira"); 
            if (t.toLowerCase().contains("invalid")) { 
                EX += _t + "\t" + "Find 'Invalid credentials'" + "\t" + DL_UserID + "\t" + "Invalid credentials." + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
                F += _t + " > " + DL_UserID + " > " + "Invalid credentials." + "\r\n";
                DL_UserID = User_ID + " Bad Login"; 
                return;  // Login Failed FATAL for this User ===================================================
            }
        }

        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
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
                EX += _t + "\t" + "Get User Metrics Count" + "\t" + DL_UserID + "\t" + "No Metrics" + "\t" + "FAIL" + "\t" + "L0.isEmpty()" +
                "\t" + " - " + "\t" + " - " + "\t" +  "no_jira" + "\r\n";
                DL_UserID = User_ID + " Bad Login";
                return;  // No User Metrics Found FATAL ===================================================
            }         
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Get Selected Metrics Count", "xpath", "//span[contains(@class, ' Mui-checked ')]", "no_jira");             
            if (FAIL) { return;}            
            for (int j = 0; j < L0.size(); j++) {        
                _t++; TWeb.Element_Click("Un-Check Selected Metrics " + (j + 1), L0.get(j), "no_jira");
            }        
        // Find / Select dMetric
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find Metric '" + Metric + "'", Metric, true,"no_jira"); 
            if (t.equals("Not Found")) { 
                return;  // Metric Not Found FATAL for this Test# ===================================================
            } 
        _t++; TWeb.Element_By_Path_Click("Select Metric '" + Metric + "'", "xpath", "//span[text()='" + Metric + "']", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
            if (FAIL) { return;}        
        


             
        // Check dTPeriod - select one from current row
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Date selection container", "xpath", "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']", "no_jira");         
        _t++; TWeb.Element_By_Path_Click("Select Date Range " + Period, "xpath", "//span[text()='" + TrasLate_Date_Range(Period) + "']", "no_jira");
            if (FAIL) { return;} 


        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Filters' label", "Filters", true,"no_jira"); 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Configure Filters' button label", " Configure Filters", true,"no_jira");        

        for (String L : Location_Filters.split("\r\n")) {// Location dIFilter(s) loop 
            if(L.contains(":")){
                String L_FilterKey = L.substring(0,L.indexOf(":")).trim();
                String L_FilterValue = L.substring(L.indexOf(":")+1 ).trim();   
                // ========  Apply Location Filter Key / FilterValue ===============
                //
            }  
        }                   

        for (String I : Item_Filters.split("\r\n")) {// Item dIFilter(s) loop
            if(I.contains(":")){
                String I_FilterKey = I.substring(0,I.indexOf(":")).trim();
                String I_FilterValue = I.substring(I.indexOf(":")+1 ).trim();   
                // ========  Apply Item Filter Key / FilterValue ===============
                //
            }                
        }
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for Selected Metric load...", "xpath", "//div[@role='progressbar']", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Loaded Metrics Cards Count", "xpath", "//div[contains(@class, 'MuiPaper-root MuiCard-root')]", "no_jira");             
            if (FAIL) { return;} 
            if (L1.isEmpty()) { 
                return;  // Loaded Metric Not Found FATAL for this Test# ===================================================
            }  
            
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
        // Verify dValue from file against FrontEnd   
    }   
} 
// </editor-fold>

////// <editor-fold defaultstate="collapsed" desc="New Code">
//package DL;
//
//import static A.A.FAIL;
//import static A.A.L0;
//import static A.A._t;
//import static A.A.sleep;
//import static A.A.t;
//import static DL.DL.url;
//import javax.swing.JTable;
//import A.TWeb;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DL_qa_user {
//    public static String loc_dropdown1 = "";
//    public static String item1 = "";
//    public static String loc_dropdown2 = "";
//    public static String item2 = "";
//    public static String tbl_userName;
//    public static String tbl_metric;
//    public static String tbl_timePeriod;
//    public static String tbl_value;
//    public static String tbl_locationFilter;
//    public static String tbl_itemFilter; 
//    
//    public static void run(JTable TBL) throws InterruptedException {
//        String Logged_User = DL.DL_UserID;
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for Side bar arrow", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;}   // [1]/span > [2]/span after 'Apply' buttorn added ([1]/span)
//        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get Side bar arrow text/direction", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira");
//            if (FAIL) { return;}
//        if(t.equalsIgnoreCase("arrow_right")) {
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click ' arrow_right' > Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[2]/span", "no_jira"); 
//                if (FAIL) { return;} 
//        }
//
//        for (int i = 10; i < 11; i++) {  // ================== BEBUG
//    	    tbl_userName = TBL.getValueAt(i, 0).toString();
//            if (Logged_User == null || Logged_User.length()== 0 || !Logged_User.equals(tbl_userName) ) {
//                Logged_User = tbl_userName;
//
//                _t++;TWeb.Open_NewIncognitoWindow("Open a New Incognito Window", "no_jira");
//                
//                _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url, "no_jira"); 
//                
//                if (FAIL) { return;}
//                 _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Login page URL", "no_jira");             
//        //        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'LOGIN'", "id", "login-btn", "no_jira"); 
//        //            if (FAIL) { return;}  
//        //        Thread.sleep(500);  
//                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//                    if (FAIL) { return;}  
//                _t++; TWeb.Element_By_Path_Text_Enter("Enter valid Username", "id", "username",tbl_userName , false, "no_jira"); 
//                    if (FAIL) { return;}            
//                _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "id", "password", "Compass1", true, "no_jira"); 
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "name", "login", "no_jira"); 
//                    if (FAIL) { return;} 
//                _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("get the side bar text ", "xpath", "(//span[@class='MuiButton-label'])[1]/span", "no_jira");
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("get the side bar text ", "xpath", "(//span[@class='MuiButton-label'])[1]/span", "no_jira");
//                   if (FAIL) { return;}
//                if(t.equalsIgnoreCase("arrow_right")) {
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'To Expand the Side bar'", "xpath", "(//span[@class='MuiButton-label'])[1]", "no_jira"); 
//                    if (FAIL) { return;} 
//                }
//            }
//            //Thread.sleep(5000);
//
//            List<String> metricList=new ArrayList<>();
//            metricList.add("Total Spend");
//            metricList.add("Contracted Spend");
//            metricList.add("Contracted Utilization Rate");
//            metricList.add("Member Earned Revenue");
//            metricList.add("Member Rate of Return");
//            metricList.add("Member Strength of Program");
//            metricList.add("Customer Earned Revenue");
//            metricList.add("Customer Rate of Return");
//            metricList.add("Customer Strength of Program");
//            metricList.add("Program Earned Revenue");
//            metricList.add("Program Rate of Return");
//            metricList.add("Program Strength of Program");
//            
//            for (String metric : metricList) {
//                _t++; TWeb.Element_By_DisplayChecking("Check '"+ metric+"' is Displayed ", "xpath", "//div/span[contains(.,'"+metric+"')]/parent::div/parent::div/div/span/span/input", "no_jira");
//                //Metric Selection
//                tbl_metric = TBL.getValueAt(i, 1).toString();
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check '"+tbl_metric+"' checkbox ", "xpath", "//div/span[contains(.,'"+tbl_metric+"')]/parent::div/parent::div/div/span/span", "no_jira"); 
//                    if (FAIL) { return;}
//
//                //Select the Time period
//                tbl_timePeriod = TBL.getValueAt(i, 2).toString();
//                String filterTimePeriod = filterTimePeriod();
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Choose '"+filterTimePeriod+"' Date period ", "xpath", "//button[contains(@class,'disableElevation')]/span[contains(.,'"+filterTimePeriod+"')]", "no_jira"); 
//                    if (FAIL) { return;}
//
//                //Click on Configure Filter
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on configure filters", "xpath", "//button[contains(.,' Configure Filters')]", "no_jira"); 
//                    if (FAIL) { return;}           
//
//                //Delete choosen Location Filters
//                if(i > 0) {
//                    //Thread.sleep(15000);
//    //                _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("list all selected items", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", "no_jira");
//    //             if (FAIL) { return;}
//                    _t++; Thread.sleep((long) sleep); TWeb.List_L0("list all selected items", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", "no_jira");                                     
//                    for (int j = 0; j < L0.size(); j++) {
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Delete all selected items", L0.get(j), "no_jira");
//                        if (FAIL) { return;} 
//                    }
//                }
//
//                //Select Location Filters
//                tbl_locationFilter = TBL.getValueAt(i, 4).toString();
//                    testdataFilter(tbl_locationFilter, 0);
//
//                //Select Item Filters
//                tbl_itemFilter = TBL.getValueAt(i, 5).toString(); 
//                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", "no_jira");
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Products/Item Categories tab", "xpath", "//span[contains(text(),'Products/Item Categories')]", "no_jira"); 
//                    if (FAIL) { return;}
//
//                //Delete choosen Item Filters
//                if(i > 0) {
//                    //Thread.sleep(15000);
//    //                  _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("list all selected items", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", "no_jira");  
//    //                  if (FAIL) { return;}
//                    _t++; Thread.sleep((long) sleep); TWeb.List_L0("list all selected items", "xpath", "//div[contains(@class,'MuiChip-deletable')]/*[name()='svg']", "no_jira");                                     
//                    for (int j = 0; j < L0.size(); j++) {
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Delete all selected items", L0.get(j), "no_jira");
//                        if (FAIL) { return;} 
//                    }
//                }
//                testdataFilter(tbl_itemFilter, 1);
//
//                //Click on Apply
//                _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on 'Apply' button", "xpath", "//button/span[contains(.,'Apply')]", "no_jira");
//                    if (FAIL) { return;}	
//        	tbl_value = TBL.getValueAt(i, 3).toString();
//        	_t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for 'Dollar' amount", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'" + tbl_metric + "')]/..//div[2]/div[2]/p", "no_jira");
//                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get 'Dollar' amount", "xpath", "//div[starts-with(@class,'MuiCardContent-root jss')]//*[contains(.,'"+ tbl_metric + "')]/..//div[2]/div[2]/p", "no_jira");
//                    if (FAIL) { return;}
//           	
//           	TWeb.CompareText("comparing values ", get_Text(t), tbl_value, "no_jira");
//           	//Uncheck Metric
//           	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Un Check '" + tbl_metric + "' checkbox ", "xpath", "//div/span[contains(.,'" + tbl_metric + "')]/parent::div/parent::div/div/span/span", "no_jira"); 
//                if (FAIL) { return;}
//            }
//        }
//    }
//
//    private static void testdataFilter(String str, int flag)throws InterruptedException {
//            // Division: HCA HealthCare, Sector: HealthTrust,
//            // Division: HCA HealthCare,
//            // None
//
//            if (str==null || str.length()==0 || (str!= null && str.equalsIgnoreCase("none"))) {//None
//                    System.out.println("do nothing");
//            } else if(str.contains(",")) {
//                for(int i=0; i < str.split(",").length; i++) {
//                    loc_dropdown1 = str.split(",")[i].split(":")[0].trim();
//                    item1 = str.split(",")[i].split(":")[1].trim();
//                    if(flag == 0) {//choose location filter
//
//                         if(loc_dropdown1.contains("Dropdown")) {
//                             _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira");
//                              if (FAIL) { return;}
//                             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
//                                    if (FAIL) { return;}
////				 Thread.sleep(6000);
//                             _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("choose  dropdown item - '" + item1 + "'", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira");
//                              if (FAIL) { return;}
//                             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose  dropdown item - '" + item1 + "'", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira"); 
//                                    if (FAIL) { return;}
////				        Thread.sleep(6000);
////				        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item "+item1+" from the table", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira");
////				        if (FAIL) { return;}
//                             continue;
//                         }
//                    } else {
//                        if(loc_dropdown1.contains("Dropdown")) {
//                              _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Cick on Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira");
//                              if (FAIL) { return;}
//                             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on Item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
//                                    if (FAIL) { return;}
////				 Thread.sleep(6000);
//                             _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("choose  dropdown item - '" + item1 + "'", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira"); 
//                              if (FAIL) { return;}
//                             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose  dropdown item - '" + item1 + "'", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira"); 
//                                    if (FAIL) { return;}
////				        Thread.sleep(14000);
////				        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item " + item1 + " from the table", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira");
////				        if (FAIL) { return;}
//                             continue;
//                         }
//                    }
//                }
//
//                for(int i=0; i < str.split(",").length; i++) {
//                    loc_dropdown1 = str.split(",")[i].split(":")[0].trim();
//                    item1= str.split(",")[i].split(":")[1].trim();
//                    if(flag == 0) {//choose location filter
//                         if(loc_dropdown1.contains("Dropdown")) {
//                             continue;
//                         }
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
//                        if (FAIL) { return;}
//                        Thread.sleep(6000);
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for dropdown item - '" + loc_dropdown1 + "'", "xpath", "//div[@role='dialog']//*[contains(text(), '"+loc_dropdown1+"')]", "no_jira"); 
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose  dropdown item - '" + loc_dropdown1 + "'", "xpath", "//div[@role='dialog']//*[contains(text(), '"+loc_dropdown1+"')]", "no_jira"); 
//                            if (FAIL) { return;}
//                            
//                        Thread.sleep(10000);
//                        _t++; TWeb.Element_By_Path_Text_Enter("Enter Item "+item1+" to be Searched", "id", "filter-group-search",item1 , false, "no_jira"); 
//                            if (FAIL) { return;} 
//
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Select item " + item1 + " from the table", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'"+item1+"')]/..", "no_jira");
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item " + item1 + " from the table", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'"+item1+"')]/..", "no_jira");
//                            if (FAIL) { return;}
//
//                    }else {//choose item filter
//                        if(loc_dropdown1.contains("Dropdown")) {
//                             continue;
//                         }
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", "no_jira"); 
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=3]", "no_jira"); 
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for dropdown item - '" + loc_dropdown1 + "'", "xpath", "//*[contains(text(), '" + loc_dropdown1 + "')]", "no_jira"); 
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Vhoose  dropdown item - '" + loc_dropdown1 + "'", "xpath", "//*[contains(text(), '" + loc_dropdown1 + "')]", "no_jira"); 
//                            if (FAIL) { return;}
//                        Thread.sleep(10000);
//
//                        _t++; TWeb.Element_By_Path_Text_Enter("Enter Item " + item1 + " to be Searched", "id", "filter-group-search",item1 , false, "no_jira"); 
//                            if (FAIL) { return;} 
//                        _t++; Thread.sleep((long) sleep); TWeb.Wait_Element_Visible("Wait for item " + item1 + " from the table", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'" + item1 + "')]/..", "no_jira");
//                            if (FAIL) { return;}
//                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item " + item1 + " from the table", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]//*[contains(text(),'" + item1 + "')]/..", "no_jira");
//                        if (FAIL) { return;}
//                    }
//                    Thread.sleep(8000);
//                }
////			if(str.split(",").length>1) {//Multiple Items
////				if(str.split(",")[0].contains(":")) {
////					loc_dropdown1=str.split(",")[0].split(":")[0].trim();
////					item1=str.split(",")[0].split(":")[1].trim();
////				    
////					if(flag == 0) {//choose location filter
////						_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
////				        if (FAIL) { return;}
////				        Thread.sleep(6000);
////				    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose  dropdown item - '"+loc_dropdown1+"'  ", "xpath", "//*[contains(text(), '"+loc_dropdown1+"')]", "no_jira"); 
////				        if (FAIL) { return;}
////				        
////				        Thread.sleep(6000);
////				        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item "+item1+" from the table", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira");
////				        if (FAIL) { return;}
////				        
////				        Thread.sleep(10000);
////				        
////					}else {//choose item filter
////						 _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
////				            if (FAIL) { return;}
////				         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Beverages ' from the dropdown box", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira"); 
////				            if (FAIL) { return;}
////				           
////					}
////			        Thread.sleep(8000);
////				}	
////				if(str.split(",")[1].contains(":")) {
////					loc_dropdown2=str.split(",")[1].split(":")[0].trim();
////					item2=str.split(",")[1].split(":")[1].trim();
////					if(flag == 0) {//choose location filter
////						_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
////				        if (FAIL) { return;}
////				        Thread.sleep(6000);
////				    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose  dropdown item - '"+loc_dropdown2+"'  ", "xpath", "//*[contains(text(), '"+loc_dropdown2+"')]", "no_jira"); 
////				        if (FAIL) { return;}
////				        Thread.sleep(6000);
////				        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item "+item2+" from the table", "xpath", "//*[contains(text(), '"+item2+"')]", "no_jira");
////				        if (FAIL) { return;} 
////				        Thread.sleep(6000); 
////				        if (FAIL) { return;}
////					}else {//choose item filter
////						_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
////			            if (FAIL) { return;}
////			            
////			            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Beverages ' from the dropdown box", "xpath", "//*[contains(text(), '"+item2+"')]", "no_jira"); 	
////			            if (FAIL) { return;}
////			            
////			            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 1st item from the list box", "xpath", "//div[@role='dialog']//div[starts-with(@class,'jss')]/div/div[1]/div['"+item2+"']", "no_jira"); 
////			            if (FAIL) { return;}
////					}
////					
////				}
////			}else {//ONE ITEM
////			
////				loc_dropdown1=str.split(",")[0].split(":")[0].trim();
////				item1=str.split(",")[0].split(":")[1].trim();
////				if(flag == 0) {//choose location filter
////					_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cick on location filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')])[position()=3]", "no_jira"); 
////			        if (FAIL) { return;}
////			        Thread.sleep(6000);
////			    	_t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose dropdown item - '"+loc_dropdown1+"'  ", "xpath", "//*[contains(text(), '"+loc_dropdown1+"')]", "no_jira"); 
////			        if (FAIL) { return;}
////			        
////			        
////			        Thread.sleep(6000);
////			        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select item "+item1+" from the table", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira");
////			        if (FAIL) { return;}
////			        
////			        Thread.sleep(8000);		
////				}else {//choose item filter
////					 _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item filter dropdown menu", "xpath", "(//div[contains(@class,'indicatorContainer')]/*[name()='svg'])[position()=2]", "no_jira"); 
////			            if (FAIL) { return;}
////			         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("choose 'Beverages ' from the dropdown box", "xpath", "//*[contains(text(), '"+item1+"')]", "no_jira"); 
////			            if (FAIL) { return;}
////				}
////			}
//        }
//    }
//
//    public static String filterTimePeriod() {
//            tbl_timePeriod=tbl_timePeriod.trim();
//            if(tbl_timePeriod.equalsIgnoreCase("L4"))
//                    tbl_timePeriod = "Last 4 weeks";
//            else if(tbl_timePeriod.equalsIgnoreCase("L12"))
//                    tbl_timePeriod = "Last 12 weeks";
//            else
//                    tbl_timePeriod = "Last 52 weeks";
//            return tbl_timePeriod;
//    }
//
//    public static String get_Text(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '$') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == ',') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == '(') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == ')') str = str.replace(String.valueOf(str.charAt(i)), "");
//            if (str.charAt(i) == '%') str = str.replace(String.valueOf(str.charAt(i)), "");
//        }
//        return str;
//    }
//
//    
//}
//// </editor-fold>


