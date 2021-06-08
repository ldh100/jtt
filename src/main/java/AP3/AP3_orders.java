/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_orders {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Orders' Click", "xpath", "//*[contains(text(), 'Orders')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Orders page URL", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light menuable__content__active
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith(app)){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " + app, L1.get(T_Index), "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;}                                                                                         // v-datatable__progress << 'v-progress-circular'
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
            
        
         //Find stations 
         int T_Index2 = -1;
         _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'All Stations'","All Stations" , true, "no_jira");
     
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Search for...'", "Search for anything", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Order type'", "Order Type", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Export", "Export", true,"no_jira"); 
            if (FAIL) { return;}       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Export Button", "xpath", "//div[normalize-space()='Export']", "no_jira");
            if (FAIL) { return;}    
        Thread.sleep(5000);           
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Default Order Type", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Default Order Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Order Type combobox", "css", "[aria-label='Order Type']", "no_jira"); 
            if (FAIL) { return;}                                                          
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Order Type Count", "xpath", "/html/body/div/div[3]/div/div/div", "no_jira");             
            if (FAIL) { return;}
            for (int i = 1; i <= L1.size(); i++) {
                _t++; TWeb.Element_By_Path_Text("Order Type (index " + i + ")", "xpath", "/html/body/div/div[3]/div/div/div[" + i + "]/a/div/div",  "no_jira");             
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 'All'", "xpath", "/html/body/div/div[3]/div/div/div[" + 1 + "]/a/div/div", "no_jira"); 
            if (FAIL) { return;} 
            //<editor-fold defaultstate="collapsed" desc="Pagination">   
            _t++; TWeb.Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira");
            if (FAIL) { return;}

            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light v-menu__content--auto menuable__content__active
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira");
            if (FAIL) { return;}
            //</editor-fold>            
           
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Orders Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            _t++; TWeb.Element_Text("Order Data Headers", L0.get(7), "no_jira");  
        if(L0.size() > 7)  {
            T_Index = 0;
            for (int i = 8; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Order Data Row Text", L0.get(i), "no_jira");             
                //if (FAIL) { return;}
                if(t.equalsIgnoreCase("No orders found")){
                    T_Index = -1;
                }
            }
            //Execute only if orders present
            if(T_Index != -1){  
                _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find child 'td' element", L0, 9, "tagName", "td", "no_jira"); // ====== index 8 ===  
                    if (FAIL) { return;} 
                _t++; TWeb.Element_Click("Click top Order",e1, "no_jira");  
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Order #YYYY text", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center v-card__title--primary')]", "no_jira"); 
                    if (FAIL) { return;}                                                                    
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 1 text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Tab 2 text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira");
                    if (FAIL) { return;}        
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Order Items Count", "xpath", "//table[contains(@class,'orderTable')]", "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; TWeb.Element_Attribute("Order Items Text", L1.get(i), "textContent", "no_jira");             
                    } 
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Order Details Count", "xpath", "//div[@class='flex shrink']", "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; TWeb.Element_Attribute("Order Items Text", L1.get(i), "textContent", "no_jira");           
                    }
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Raw' tab", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "no_jira"); 
                    if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Nodes 'Toggle' Count", "xpath", "//div[contains(@class, 'jv-node toggle')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Nodes 'Key' Count", "xpath", "//span[contains(@class, 'jv-key')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Nodes 'Item String' Count", "xpath", "//span[contains(@class, 'jv-item jv-string')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Nodes 'Item Number' Count", "xpath", "//span[contains(@class, 'jv-item jv-number')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("Nodes 'Item Object' Count", "xpath", "//span[contains(@class, 'jv-item jv-object')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Order #YYYY 'Close' text", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Close Order #YYYY", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", "no_jira"); 
                    if (FAIL) { return;}       
            }     
                //Selecting a station to display orders
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Brand combobox", "css", "[aria-label='Brand']", "no_jira"); 
            if (FAIL) { return;}                                                          
             
            _t++; Thread.sleep((long) sleep); TWeb.List_L2("Brands Count", "xpath", "//div[contains(@class,'menuable__content__active')]/descendant::div[@class='v-list__tile__title']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L2.size(); i++) {
                _t++; TWeb.Element_Attribute("Brands : ", L2.get(i), "textContent", "no_jira");    
                if (FAIL) { return;}
               if(t.equalsIgnoreCase(BRAND))
               {
                T_Index = i;
               }
            }
         _t++; Thread.sleep((long) sleep);TWeb.Element_Click("Select 'Brand'"+BRAND, L2.get(T_Index), "no_jira");
            if (FAIL) { return;}    
             Thread.sleep(3000);
                
                
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Export Button", "xpath", "//div[normalize-space()='Export']", "no_jira");
            if (FAIL) { return;}    
         Thread.sleep(500);      
         _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}      
         }     
        
        
        //Select a specific date from the calendar to view the orders for that date
        LocalDate date = LocalDate.now();  
        LocalDate prev_date = date.minusDays(1);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", "no_jira"); 
            if (FAIL) { return;} 
         if(prev_date.getMonthValue()!=date.getMonthValue())
         {  _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", "no_jira"); 
            if (FAIL) { return;} 
         }  
         Thread.sleep(3000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click previous day", "xpath", "//tr/td[contains(number(),"+ prev_date.getDayOfMonth() +")]", "no_jira"); 
            if (FAIL) { return;} 
          Thread.sleep(3000);  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date(s)']", "no_jira"); 
            if (FAIL) { return;} 
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Button Attribute", "xpath", "//button[@class=' button-styling export-button v-btn theme--light primary']", "dates", "no_jira");
          if (FAIL) { return;} 
        String button_date_attribute = t;  //2021-06-02
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Current URL", "no_jira");
        String date_URL = t.substring(t.length()-10);
        if(date_URL.equals(button_date_attribute))
           { // Pass order date is equal to displayed order date
             _t++;
             _p++; EX += _t + "\t" + "URL Order date is equal to button date attribute" + "\t" + "Date in URL: "+date_URL + "\t" + "Date in Datepicker: "+button_date_attribute + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
         else
           { _t++;
             _f++; EX += _t + "\t" + "URL Order date is not equal to button date attribute" + "\t" + "Date in URL: "+date_URL + "\t" + "Date in Datepicker: "+button_date_attribute + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
              
        //Select a 7 day range from the calendar to view the orders for that period
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date(s)']", "no_jira"); 
            if (FAIL) { return;} 
         //Click previous month
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click previous month", "xpath", "//i[@class='v-icon mdi mdi-chevron-left theme--light']", "no_jira"); 
            if (FAIL) { return;} 
        //Error toast message since more than 7 days
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click day 10", "xpath", "//tr/td[contains(number(),10)]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click day 17", "xpath", "//tr/td[contains(number(),17)]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(3000);    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click day 10", "xpath", "//tr/td[contains(number(),10)]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(3000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click day 16", "xpath", "//tr/td[contains(number(),16)]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(5000);
         //Can use Close Date picker too instead of Escape Key   
         d1.findElement(By.cssSelector("[aria-label='Date(s)']")).sendKeys(Keys.ESCAPE);
         Thread.sleep(1000);
         //URL to verify the date picker has selected 7 day range
         _t++; Thread.sleep((long) sleep);TWeb.Page_URL("Current URL", "no_jira");
    }  
}
