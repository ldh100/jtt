package AP3;

import static A.A.Time_12_formatter;
import static A.A.sleep;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

class AP3_orders extends AP3_GUI{
    protected AP3_orders (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        New_ID = a.New_ID;
        app = a.app;
        SITE = a.SITE;
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        SECTOR = a.SECTOR;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    protected void run() { 
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        Element_By_Path_Click("Drawer > 'Orders' Click", "xpath", "//*[contains(text(), 'Orders')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");             
            if (FAIL) { return;}
             
        Page_URL("Orders page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", ParentTest, "no_jira"); 
            if (FAIL) { return;}     
        Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Application Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                if(t.trim().startsWith(app)){ 
                    T_Index = i; 
                }
            }
        Element_Click("Select " + app, L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);             
        Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Not Found' notification", "No matching records found", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        List_L0("Sites Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Sites Data Row Text", L0.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Thread.sleep(1000);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}   // v-datatable__progress << 'v-progress-circular'
        Thread.sleep(500);            
        
         //Find stations 

        Find_Text("Find 'All Stations'","All Stations" , true, ParentTest, "no_jira");      
        Find_Text("Find 'Search for...'", "Search for anything", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Order type'", "Order Type", true, ParentTest, "no_jira"); 
            
        String filebrand = BRAND.toLowerCase().replace(" ","-");
        filebrand = "all-orders-" + filebrand + "-undefined.pdf";
        // Should be not here > expected nothing for today  //Once we add placing orders to our script the below export is required.
        Find_Text("Find 'Export' text", "Export", true, ParentTest, "no_jira");      
        Element_By_Path_Click("Click Export Button", "xpath", "//div[normalize-space()='Export']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(5000);           
        //  Call it later after date range selected, Check PDF > delete, change to CSV > Check > delete 
     
        File tmp = new File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator+ "pickup-orders-undefined.pdf");
        if (tmp.exists()) {
            File_Delete("PDF Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", "pickup-orders-undefined.pdf", ParentTest, "no_jira") ;
        } else {
            _t++;
            _w++;
            EX += _t + "\t" + "File to delete does not exist" + "\t" + "File : pickup-orders-undefined.pdf  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
 
        Element_By_Path_Text("Default Order Type", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Default Order Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Open Order Type combobox", "css", "[aria-label='Order Type']", ParentTest, "no_jira"); 
            if (FAIL) { return;}                                                          
        List_L1("Order Type Count", "xpath", "/html/body/div/div[3]/div/div/div", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 1; i <= L1.size(); i++) {
                Element_By_Path_Text("Order Type (index " + i + ")", "xpath", "/html/body/div/div[3]/div/div/div[" + i + "]/a/div/div",  ParentTest, "no_jira");             
                if (FAIL) { return;}
            }
        Element_By_Path_Click("Select 'All'", "xpath", "/html/body/div/div[3]/div/div/div[" + 1 + "]/a/div/div", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
        //<editor-fold defaultstate="collapsed" desc="Pagination">   
        Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light v-menu__content--auto menuable__content__active
        Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  ParentTest, "no_jira");
            if (FAIL) { return;}
            if(t.trim().startsWith("All")){ 
                T_Index = i; 
            }
        }
        Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        //</editor-fold>            
        
        List_L0("Orders Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_Text("Order Data Headers", L0.get(7), ParentTest, "no_jira");  
        if(L0.size() > 7)  {
            T_Index = 0;
            for (int i = 8; i < L0.size(); i++) {
                Element_Text("Order Data Row Text", L0.get(i), ParentTest, "no_jira");             
                if(t.equalsIgnoreCase("No orders found")){
                    T_Index = -1;
                }
            }            
            if(T_Index != -1) {  //Execute only if orders present
                //Export in CSV format
               Element_By_Path_Click("Select  CSV", "xpath", "(//div[@class='v-radio theme--light'])[1]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}              
                  Thread.sleep(3000);
                Element_By_Path_Click("Click Export Button", "xpath", "//div[normalize-space()='Export']", ParentTest, "no_jira");
                   if (FAIL) { return;}         
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                   if (FAIL) { return;}      
                Thread.sleep(3000);
                tmp = new File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator+ "all-orders-undefined.csv");
                if (tmp.exists()) {
                    File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", "all-orders-undefined.csv",ParentTest, "no_jira");
                } else {
                    _t++; _w++;
                    EX += _t + "\t" + "CSV File to delete does not exist" + "\t" + "all-orders-undefined.pdf  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                         
                List_Child_E1_By_Path("Find child 'td' element", L0.get(8), "tagName", "td", ParentTest, "no_jira"); 
                    if (FAIL) { return;}        // ====== index 8, was 9 ===  
                Element_Click("Click top Order",L0.get(8), ParentTest, "no_jira");  //  e1
                    if (FAIL) { return;} 
                Element_By_Path_Text("Order #YYYY text", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center v-card__title--primary')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                                                                    
                Element_By_Path_Attribute("Tab 1 text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Attribute("Tab 2 text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}        
                List_L1("Order Items Count", "xpath", "//table[contains(@class,'orderTable')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        Element_Attribute("Order Items Text", L1.get(i), "textContent", ParentTest, "no_jira");             
                    } 
                List_L1("Order Details Count", "xpath", "//div[@class='flex shrink']", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        Element_Attribute("Order Items Text", L1.get(i), "textContent", ParentTest, "no_jira");           
                    }
                Element_By_Path_Click("Click 'Raw' tab", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                    
                List_L1("Nodes 'Toggle' Count", "xpath", "//div[contains(@class, 'jv-node toggle')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                List_L1("Nodes 'Key' Count", "xpath", "//span[contains(@class, 'jv-key')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                List_L1("Nodes 'Item String' Count", "xpath", "//span[contains(@class, 'jv-item jv-string')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                List_L1("Nodes 'Item Number' Count", "xpath", "//span[contains(@class, 'jv-item jv-number')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                List_L1("Nodes 'Item Object' Count", "xpath", "//span[contains(@class, 'jv-item jv-object')]", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                Element_By_Path_Text("Order #YYYY 'Close' text", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Element_By_Path_Click("Close Order #YYYY", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}       
            }   
        }
            //Selecting a station to display orders
            T_Index = 0; // ============= Default 'All Stations' ===================
            Element_By_Path_Click("Open Brand combobox", "css", "[aria-label='Brand']", ParentTest, "no_jira"); 
                if (FAIL) { return;} // ^  == Shows only 20 BRANDS, need to scroll to see all if more then 20, otherwise - default 'All Stations'                                                   
            List_L2("Brands Count", "xpath", "//div[contains(@class,'menuable__content__active')]/descendant::div[@class='v-list__tile__title']", ParentTest, "no_jira");             
                if (FAIL) { return;}
            for (int i = 0; i < L2.size(); i++) {
                Element_Attribute("Brand " + i, L2.get(i), "textContent", ParentTest, "no_jira");    
                    if (FAIL) { return;}
                if(t.equalsIgnoreCase(BRAND)) {
                    T_Index = i;
                }
            }
            Element_Click("Select Brand: " + BRAND, L2.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}    
            Thread.sleep(3000);
           
        //Select a specific date from the calendar to view the orders for that date
        LocalDate date = LocalDate.now();  
        LocalDate prev_date = date.minusDays(1);
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
         if(prev_date.getMonthValue() != date.getMonthValue()) {  
            Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
         }  
Thread.sleep(3000);
        Element_By_Path_Click("Click previous day", "xpath", "//tr/td[contains(number()," + prev_date.getDayOfMonth() + ")]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(3000);  
        Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(5000);
//        Element_By_Path_Attribute("Button Attribute", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", "dates", ParentTest, "no_jira");
//            if (FAIL) { return;} 
//        String button_date_attribute = t;  //2021-06-02
//        Page_URL("Current URL", ParentTest, "no_jira");
//        String date_URL = t.substring(t.length() - 10);
//        if(date_URL.equals(button_date_attribute))  { // Pass order date is equal to displayed order date
//            _t++;
//            _p++; EX += _t + "\t" + "URL Order date is equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
//        } else { 
//            _t++;
//            _f++; EX += _t + "\t" + "URL Order date is not equal to button date attribute" + "\t" + "Date in URL: " + date_URL + "\t" + "Date in Datepicker: " + button_date_attribute + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
//        }
              
        //Select a 7 day range from the calendar to view the orders for that period
        Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        //Error toast message since more than 7 days
        Element_By_Path_Click("Click day 10", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(1000);
        Element_By_Path_Click("Click day 17", "xpath", "//tr/td[contains(number(),17)]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(3000);    
       Element_By_Path_DblClick("Click day 10", "xpath", "//tr/td[contains(number(),10)]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
Thread.sleep(3000);
        Element_By_Path_Click("Click day 16", "xpath", "//tr/td[contains(number(),16)]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(5000);
        //Can use Close Date picker too instead of Escape Key   
        d1.findElement(By.cssSelector("[aria-label='Date(s)']")).sendKeys(Keys.ESCAPE);
Thread.sleep(1000);
        //URL to verify the date picker has selected 7 day range
        Page_URL("Current URL", ParentTest, "no_jira");
       
        Element_By_Path_Click("Click Export Button", "xpath", "//div[normalize-space()='Export']", ParentTest, "no_jira");
           if (FAIL) { return;}         
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
           if (FAIL) { return;}      
        Thread.sleep(3000);
        tmp = new File(System.getProperty("user.home") + File.separator + "Downloads" + File.separator+ filebrand);
        if (tmp.exists()) {
            File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads", filebrand, ParentTest, "no_jira"); 
        } else {
            _t++; _w++;
            EX += _t + "\t" + "File to delete does not exist" + "\t" + filebrand + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }   
    } 
}
