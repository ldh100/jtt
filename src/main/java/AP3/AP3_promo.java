/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Roya Jacob
 * Basic outline :
 * 1) Create LTO Promo with 3 items / Remove third item
 * 2) First LTO with Amount discount of .50
 * 3) Second LTO with Percent discount of 50%
 * 4) Create promo /verify api call/Edit Promo call/Verify Promo api call/Delete Promo/Verify Api call
 * 5) Create BOGO Promo with One main item and Other item at 50% off
 * 6) Create promo /verify api call/Edit Promo call/Verify Promo api call/Delete Promo/Verify Api call
 * 7) Create bundle promo with 2 main items and one bundle item at 100% discount
 * 8) Create promo /verify api call/Edit Promo call/Verify Promo api call/Delete Promo/Verify Api call
 * 
 */
public class AP3_promo {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Promo Management' Click", "xpath", "//*[contains(text(), 'Promo Management')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Promo Management page URL", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
            if (FAIL) { return;}            
//        _t++; Thread.sleep(5000); TWeb.Wait_For_Element_By_Path_Presence("Wait for New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira"); 
//            if (FAIL) { return;} 
        
        _t++; Thread.sleep(20000); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//span[@class='titlePromo']", "textContent", "no_jira"); 
           if (FAIL) { return;}          
          
        // _t++; Thread.sleep((long) sleep);TWeb.Wait_For_Element_By_Path_Presence("Wait for Promotion Name","xpath" , "//th[contains(@aria-label,'Promotion Name')]", "no_jira");
       
         // <editor-fold defaultstate="collapsed" desc="Pagination">  
         EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Pagination Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
          
           _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}     
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Promotions Count", "tagName", "tr", "no_jira");             
        if (FAIL) { return;}
        if (ALL_DATA)  {
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Promotion Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            _t++; TWeb.Element_Text("Promotion Data Row Text", L0.get(L0.size()- 1), "no_jira");             
            if (FAIL) { return;}        
        }       
        
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                _t++; TWeb.Element_Attribute("Column Label", L1.get(i), "aria-label", "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
            
            //All Promotions
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                    
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
            }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}               
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Promotions Count", "tagName", "tr", "no_jira");             
        if (FAIL) { return;}
        if (ALL_DATA)  {
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Promotion Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            _t++; TWeb.Element_Text("Promotion Data Row Text", L0.get(L0.size() - 1), "no_jira");             
            if (FAIL) { return;}        
        } 
        
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Pagination Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         
        // </editor-fold> 
        
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
              if (FAIL) { return;}   
              
        // <editor-fold defaultstate="collapsed" desc="Verify-text">       
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Name' text", "Promotion Name", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Locations' text", "Promotion Locations", true, "no_jira");
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select App' text", "Select App", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Brand (Global Menu)' text", "Select Brand (Global Menu)", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Filter by Location' text", "Filter by Location", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Sites' text", "Select Sites", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'All Sites' text", "All Sites", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Sites Selected' text", "Sites Selected (0)", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Dates' text", "Select Dates", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Times' text", "Select Times", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Repeat' text", "Repeat", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Days' text", "Select Days", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Details' text", "Promotion Details", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Type' text", "Promotion Type", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Text' text", "Promotion Text", true, "no_jira");
        if (FAIL) { return;}  
             
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Promotion name textbox", "xpath", "//input[@aria-label='Promotion Name']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Promotion Description textbox", "xpath", "//textarea[@aria-label='Promotion Description']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Promotion name is required", "xpath", "//div[contains(text(),'Promotion Name is Required')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Input_Select_Clear("Clear promotion name field", "xpath", "//input[@aria-label='Promotion Name']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create Notification Button", "xpath","//div[@class='v-btn__content'][normalize-space()='Create New Promotion']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Promotion Description is required", "xpath","//div[@class='v-messages__message' and contains(text(),'Promotion Description is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: App is required", "xpath","//div[contains(text(),'App is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Brand is required", "xpath","//div[contains(text(),'Brand is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Start Date is required", "xpath","//div[contains(text(),'Start date cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: End Date is required", "xpath","//div[contains(text(),'End date cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Start time is required", "xpath","//div[contains(text(),'Start time cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: End time is required", "xpath","//div[contains(text(),'End time cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Select days  is required", "xpath","//div[contains(text(),'Select days cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Promotion type  is required", "xpath","//div[contains(text(),'Promotion Type is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Promotion text(EN)  is required", "xpath","//div[contains(text(),'Promotion Text is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Warn: Promotion text(FR)  is required", "xpath","//body//div[@id='operator']//div//div//div//div//div//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel Button", "xpath", "//div[normalize-space()='Cancel']", "no_jira"); 
            if (FAIL) { return;}
        // </editor-fold>    
            
        Thread.sleep((long) sleep);
        String menu_group = GL_MENU.concat(" (").concat(SECTOR).concat(")");
        //Select Dates
        LocalDate date = LocalDate.now();             
        LocalDate futuredate = date.plusDays(1);
        LocalDate future_end_date = futuredate.plusDays(1);
//      Month month = Month.from(date);        // Month : February
//      Month futuremonth = Month.from(futuredate);     //  March
        
       
         // <editor-fold defaultstate="collapsed" desc="LTO PROMO"> 
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating LTO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
        Promo_details("lto");        
        Promo_scheduling(date,futuredate,"Custom");
        
        _t++;Thread.sleep((long) sleep);TWeb.To_Bottom("no_jira");
        if (FAIL) { return;}
        
        Thread.sleep(10000);       
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", "no_jira");
        if (FAIL) { return;}                                                                                    
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(L1.get(i).getText().equalsIgnoreCase("Limited Time Offer")){ T_Index = i; }
         }
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'Limited Time Offer'" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Items' ","Items" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Items button' ","Select Items" , true, "no_jira");
        if (FAIL) { return;} 
         
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Select items", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Items'", "xpath", "//div[contains(text(),'Select Items')]", "no_jira");
        if (FAIL) { return;}                                                                                
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
       
        
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        Thread.sleep(5000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select "  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           _t++; TWeb.List_TR_TDs("Items row Data", L0, i, "no_jira");
        if (FAIL) { return;}
       }  
        int Item_cnt = -1;
        if(L0.size()>=2)  {  _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select First Item"  , L0.get(2), "no_jira"); if (FAIL) { return;}}
        if(L0.size()>=3)  {  _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Second Item ", L0.get(3), "no_jira"); if (FAIL) { return;}}
        if(L0.size()>=4)  {  _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Third Item " , L0.get(4), "no_jira"); if (FAIL) { return;} Item_cnt = 3;}         
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discounted Price'","Discounted Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount given' ","Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
     
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, "no_jira");
        if (FAIL) { return;}  
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'EDIT' ","Edit" , true, "no_jira");
        if (FAIL) { return;}    
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Edit", "xpath", "//div[contains(text(),'EDIT')]", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Cancel button'", "xpath", "//div[@class='v-dialog v-dialog--active']//button[@class='v-btn v-btn--flat theme--light blue--text']", "no_jira");
        if (FAIL) { return;}   
     
        if(Item_cnt == 3)
        {
            _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Remove button", "xpath", "//div[contains(text(),'REMOVE')]", "no_jira");
            if (FAIL) { return;} 
            _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Remove Last item", L0.get(2), "no_jira");
            if (FAIL) { return;} 
            _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Confirm Remove", "xpath", "//div[contains(text(),'REMOVE')]", "no_jira");
            if (FAIL) { return;}
        }
        _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Click 1st item Discount type", L0.get(2), "no_jira");
        if (FAIL) { return;}   
        
         _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Discount type : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().equalsIgnoreCase("$ Discount Amount")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select : Discount Amount"  , L2.get(T_Index), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount amount", "xpath", "//div[contains(@class,'active')]//input[@type='number']", "0.50", false, "no_jira");
         if (FAIL) { return;}
         _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Click 2nd item Discount type", L0.get(3), "no_jira");
        if (FAIL) { return;}    
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
         for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Discount type : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().equalsIgnoreCase("% Percentage Off")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select : Discount Percentage"  , L2.get(T_Index), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount percent", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, "no_jira");
         if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
        
        Promo_Actions("lto");
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating LTO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
       
        // </editor-fold>    
        
            
         // <editor-fold defaultstate="collapsed" desc="BOGO PROMO">  
         
          EX += " - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating BOGO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
         if (FAIL) { return;}  
         
        Promo_details("bogo");
        Promo_scheduling(date,futuredate,"Every Day"); 

        _t++;Thread.sleep((long) sleep);TWeb.To_Bottom("no_jira");
        if (FAIL) { return;}
        
        Thread.sleep(10000);       
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", "no_jira");
        if (FAIL) { return;}                                                                                    //input[@aria-label='Promotion Type']
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(L1.get(i).getText().equalsIgnoreCase("BOGO")){ T_Index = i; }
         }
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'BOGO'" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, "no_jira");
        if (FAIL) { return;}
        
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Main Item' ","Main Item" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Main Item button' ","Select Main Item" , true, "no_jira");
        if (FAIL) { return;}  
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Select Main item", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Main Items'", "xpath", "//div[contains(text(),'Select Main Item')]", "no_jira");
        if (FAIL) { return;}                                                                               
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
       
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select "  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           _t++; TWeb.List_TR_TDs("Items row Data", L0, i, "no_jira");
        if (FAIL) { return;}
        }  
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Main Item"  , L0.get(2), "no_jira");
         if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
            
            
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Free Item' ","Free Item" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Free Item button' ","Select Free Item" , true, "no_jira");
        if (FAIL) { return;}  
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Select Free item", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Free Items'", "xpath", "//div[contains(text(),'Select Free Item')]", "no_jira");
        if (FAIL) { return;}                                                                               
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
       
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Category"  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           _t++; TWeb.List_TR_TDs("Items row Data", L0, i, "no_jira");
        if (FAIL) { return;}
        }  
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Free Item"  , L0.get(3), "no_jira");
         if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discounted Price'","Discounted Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount given' ","Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
     
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, "no_jira");
        if (FAIL) { return;}  
                         
        _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Click 1st item Discount type", L0.get(1), "no_jira");
        if (FAIL) { return;}   
        
         _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Discount type : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().equalsIgnoreCase("% Percentage Off")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select : Discount Percentage"  , L2.get(T_Index), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount percent ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
           
         Promo_Actions("bogo"); 
          EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating BOGO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";  
        // </editor-fold>
                  
        
         // <editor-fold defaultstate="collapsed" desc="Bundle PROMO">     
        
        EX += " - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating BUNDLE PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
         if (FAIL) { return;}  
        
         Promo_details("bundle");
         Promo_scheduling(futuredate,future_end_date,"Weekdays");
        
         _t++;Thread.sleep((long) sleep);TWeb.To_Bottom("no_jira");
        if (FAIL) { return;}
        
        Thread.sleep(10000);       
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", "no_jira");
        if (FAIL) { return;}                                                                                    //input[@aria-label='Promotion Type']
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(L1.get(i).getText().equalsIgnoreCase("Bundle")){ T_Index = i; }
         }
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'Bundle'" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, "no_jira");
        if (FAIL) { return;}
        
        
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Main Item' ","Main Item" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Main Item button' ","Select Main Item" , true, "no_jira");
        if (FAIL) { return;}  
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Select Main item", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Main Items'", "xpath", "//div[contains(text(),'Select Main Item')]", "no_jira");
        if (FAIL) { return;}                                                                               
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
       
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select "  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           _t++; TWeb.List_TR_TDs("Items row Data", L0, i, "no_jira");
        if (FAIL) { return;}
        }  
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Ist Main Item"  , L0.get(2), "no_jira");
         if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 2nd Main Item"  , L0.get(3), "no_jira");
         if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
            
            
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Bundle Item' ","Bundle Item" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Bundle Item button' ","Select Bundle Item" , true, "no_jira");
        if (FAIL) { return;}  
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Bundle item", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Bundle Items'", "xpath", "//div[contains(text(),'Select Bundle Item')]", "no_jira");
        if (FAIL) { return;}                                                                               
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
       
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Menu Category : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         }
         
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Category"  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           _t++; TWeb.List_TR_TDs("Items row Data", L0, i, "no_jira");
        if (FAIL) { return;}
        }  
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Free Item"  , L0.get(4), "no_jira");
         if (FAIL) { return;} 
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}      
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discounted Price'","Discounted Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount given' ","Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
     
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, "no_jira");
        if (FAIL) { return;}  
        
                   
        _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Click Bundle item Discount type", L0.get(5), "no_jira");
        if (FAIL) { return;}   
        
         _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Discount type : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().equalsIgnoreCase("% Percentage Off")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select : Discount Percentage"  , L2.get(T_Index), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount percent ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, "no_jira");
         if (FAIL) { return;}
         
         _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Bundle Price Before Discounts'","Bundle Price Before Discounts" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Bundle Price After Discounts' ","Bundle Price After Discounts" , true, "no_jira");
        if (FAIL) { return;} 
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Discount Given'","Total Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
           
         Promo_Actions("bundle");
         EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating BUNDLE PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
       // </editor-fold>   
       
         // <editor-fold defaultstate="collapsed" desc="Tests for Dev and Staging Environment">   
         
       if(!env.equals("PR"))
       {
            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating LTO with Repeat : Weekends==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
      
         _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
         if (FAIL) { return;}
         Promo_details("lto");
         Promo_scheduling(date,futuredate,"Weekends");
         _t++;Thread.sleep((long) sleep);TWeb.To_Bottom("no_jira");
         Thread.sleep(10000);       
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", "no_jira");
        if (FAIL) { return;}                                                                                    
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(L1.get(i).getText().equalsIgnoreCase("Limited Time Offer")){ T_Index = i; }
         }
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'Limited Time Offer'" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Items' ","Items" , true, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Select Items button' ","Select Items" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Select items", e, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(3000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Select Items'", "xpath", "//div[contains(text(),'Select Items')]", "no_jira");
        if (FAIL) { return;}                                                                                
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Global menu & Group Sector ",menu_group , true, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " , L1.get(0), "no_jira");
         if (FAIL) { return;}
        Thread.sleep(5000);
        _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", "no_jira");
        if (FAIL) { return;} 
                
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select "  , L2.get(0), "no_jira");
         if (FAIL) { return;}
       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        _t++; TWeb.Element_Text("Item Row Header", L0.get(0), "no_jira"); 
        if (FAIL) { return;} 
     
         
        
        if(L0.size()>=2)  {  _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select First Item"  , L0.get(2), "no_jira"); if (FAIL) { return;}}
        
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", "no_jira");
        if (FAIL) { return;}        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Item Name' ","Item Name" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Items", e, "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Price per Item'","Price Per Item" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Item Price' ","Total Item Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discounted Price'","Discounted Price" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount given' ","Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
     
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, "no_jira");
        if (FAIL) { return;}  
        
        _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Click 1st item Discount type", L0.get(1), "no_jira");
        if (FAIL) { return;}   
        
         _t++;Thread.sleep((long) sleep);TWeb.Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
         T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
         _t++; TWeb.Element_Text("Discount type : (index " + i + ")", L2.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().equalsIgnoreCase("$ Discount Amount")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select : Discount Amount"  , L2.get(T_Index), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount amount", "xpath", "//div[contains(@class,'active')]//input[@type='number']", "0.50", false, "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
        
        Promo_Actions("lto");
        
        EX += "\n - " + "\t" + " ====END=====" + "\t" + " ===== " + "\t" + " == Creating LTO with Repeat : Weekends" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
       //End of staging environment
     // </editor-fold>
    }
    
} 
    public static void Promo_details(String Promo_type) throws InterruptedException
    {
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Test Promo "+Promo_type, false, "no_jira");
        if (FAIL) { return;}
        
        // Select App 
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Open App Dropdown", "xpath","//label[normalize-space()='App']", "no_jira"); 
         if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'App' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}  
              
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().startsWith(app)){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " + app, L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to brand", 0, 500, "no_jira");
       
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Open Brand Dropdown", "xpath","//div[@class='flex xs5']//div[@class='v-input border-label-input v-text-field v-text-field--enclosed v-text-field--outline v-select v-autocomplete theme--light']", "no_jira");
        if (FAIL) { return;}      
       
        String menu_group = GL_MENU.concat(" (").concat(SECTOR).concat(")");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Brand", "xpath", "//input[@aria-label='Brands']", menu_group, false, "no_jira");
        if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu ", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Global Menu " + SECTOR, L1.get(0), "no_jira");
                if (FAIL) { return;} 

         //Select Sites
        
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to Site", 0, 650, "no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Select All'", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira"); 
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Remove All'", "xpath", "//i[@class='v-icon v-icon--link mdi mdi-close-circle theme--light']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
            if (FAIL) { return;}
            
       _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click SITE", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']/following::i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");
        if (FAIL) { return;}
     
    }//End of Promo_details

    public static void Promo_scheduling(LocalDate startdate,LocalDate enddate,String Repeat_opt) throws InterruptedException
    {
        
        DateTimeFormatter Dayofdate = DateTimeFormatter.ofPattern("d");
        
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to promotion schedule", e, "no_jira");
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", "no_jira");
        if (FAIL) { return;}
        
        T_Index = -1;
        for(int i=0;i<=L1.size();i++)
        {
            
            if(L1.get(i).getText().equals( Dayofdate.format(startdate)))
            {T_Index = i; break;
            }            
        }
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Select start date", L1.get(T_Index), "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click End date", "xpath", "//input[@aria-label='End Date']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Calendar element","tagName" , "table", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for(int i=0;i<=L1.size();i++)
        {
                       
            if(L1.get(i).getText().equals(Dayofdate.format(enddate)))
            {T_Index = i; break;
            }            
        }
       _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Select End date", L1.get(T_Index), "no_jira");
        if (FAIL) { return;}


        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click add Time Slot", "xpath", "//div[contains(text(),'Add Time Slot')]", "no_jira");
        if (FAIL) { return;}
        
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Remove Time slot'","Remove Time Slot" , true, "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Remove Time Slot", "xpath", "//div[contains(text(),'Remove Time Slot')]", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Start Time Slot", "xpath", "//input[@aria-label='Start Time']", "no_jira");
        if (FAIL) { return;}
        
        String hR;
        String mR;
        hR = String.format("%02d",(int)(Math.random()*3 + 8));
        mR = String.format("%02d",(int)(Math.random()*59));
        New_From = hR + ":" + mR + "AM";
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Start Time", "xpath", "//input[@aria-label='Start Time']", New_From, false, "no_jira");
        if(FAIL) {return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click End Time Slot", "xpath", "//input[@aria-label='End Time']", "no_jira");
        if (FAIL) { return;}
        
        hR = String.format("%02d",(int)(Math.random()*3 + 1));
        mR = String.format("%02d",(int)(Math.random()*59));
        New_To = hR + ":" + mR + "PM";
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("End Time", "xpath", "//input[@aria-label='End Time']", New_To, false, "no_jira");
        if(FAIL) {return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Repeat'", "xpath", "//div[@class='v-select__selections']//div[contains(text(),'Custom')]", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Repeat options","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", "no_jira");
        if (FAIL) { return;}
        
         T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
         _t++; TWeb.Element_Text("Repeat options : (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(L1.get(i).getText().equalsIgnoreCase(Repeat_opt)){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select "+Repeat_opt , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
         if(Repeat_opt.equalsIgnoreCase("Custom"))
         {    
            _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Monday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'M')]", "no_jira");
            if (FAIL) { return;}

            _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Wednesday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'W')]", "no_jira");
            if (FAIL) { return;}

            _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Friday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'F')]", "no_jira");
            if (FAIL) { return;}
         }
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Schedule confirmation","Promotion will repeat" , true, "no_jira");
        
        
    }//End of Promo_scheduling
    
    
    public static void Promo_Actions(String Promo_type) throws InterruptedException
    {
         String P_ID = "";
          _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
         if (FAIL) { return;}       
        
         Thread.sleep(5000);   
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Search for Created promo", "css","input[aria-label='Search Promotions']" , "Automation Test Promo", false, "no_jira");
         if (FAIL) { return;}  

         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
         if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr[1]/td[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr[1]/td[2]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr[1]/td[3]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr[1]/td[5]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr[1]/td[6]/span[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         
         //Clone bundle promotion
         if(Promo_type.equalsIgnoreCase("bundle"))
         {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Clone promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'copy')]", "no_jira");
            if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm 'Clone promo' ", "xpath", "//div[normalize-space()='CLONE']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep);TWeb.Wait_For_Element_By_Path_Presence("Wait for cloned promo..", "xpath", "//span[contains(text(),'Copy')]", "no_jira");
            if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Clear search box", "xpath","//i[@class='v-icon v-icon--link mdi mdi-close theme--light']", "no_jira");
//            if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep);TWeb.Refresh("Refresh Page", "no_jira");
//            Thread.sleep(20000);
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click search box", "xpath","input[aria-label='Search Promotions']", "no_jira");
//            if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear search box", "xpath","input[aria-label='Search Promotions']", "no_jira");
//            if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Search for Cloned promo", "css","input[aria-label='Search Promotions']" , "Copy  - Automation Test Promo", false, "no_jira");
//            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Copy  - Automation Test Promo", true, "no_jira"); 
              if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr[2]/td[1]/span[1]", "no_jira");
             if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr[2]/td[2]/span[1]", "no_jira");
             if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr[2]/td[3]/span[1]", "no_jira");
             if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr[2]/td[5]/span[1]", "no_jira");
             if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr[2]/td[6]/span[1]/span[1]", "no_jira");
             if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Edit Cloned promo", "xpath", "//tbody/tr[2]/td[7]//i[contains(@class,'pencil')]", "no_jira");
            if (FAIL) { return;} 
            TWeb.Wait_For_Element_By_Path_Presence("Wait for edit cloned promo..", "xpath", "//div[@class='H3-Primary-Left' and contains(normalize-space(),'Edit Promotion')]", "no_jira");
            if (FAIL) { return;}
             _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Created Promotion page URL", "no_jira"); 
            if(t.contains("/")){
            P_ID = t.substring(t.lastIndexOf("/") + 1); 
            Promo_API(P_ID,"Cloned",Promo_type);
            Promo_Location_API(P_ID,"Cloned",Promo_type);
            }
             _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Update Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", " update", false, "no_jira");
             if (FAIL) { return;}
             _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Save updated changes'", "xpath", "//div[normalize-space()='Save Changes']", "no_jira");
             if (FAIL) { return;} 
             _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
             if (FAIL) { return;}       
             Thread.sleep(5000);
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Search for Cloned promo", "css","input[aria-label='Search Promotions']" , "Copy  - Automation Test Promo", false, "no_jira");
             if (FAIL) { return;}  
             
             _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Cloned Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
              if (FAIL) { return;}  
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete Cloned promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'delete')]", "no_jira");
                if (FAIL) { return;}               
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete cloned  promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
                if (FAIL) { return;}
             Thread.sleep(5000);
             _t++; Thread.sleep((long) sleep);TWeb.Refresh("Refresh Page", "no_jira");
             Thread.sleep(20000);
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Search for Original promo", "css","input[aria-label='Search Promotions']" , "Automation Test Promo", false, "no_jira");
             if (FAIL) { return;}           
         }//End of if cloned promo
         
         // Editing a promo for promo id to make a API call
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Edit promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'pencil')]", "no_jira");
           if (FAIL) { return;} 
          Thread.sleep(2000);
         _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Created Promotion page URL", "no_jira"); 
          if(t.contains("/")){
            P_ID = t.substring(t.lastIndexOf("/") + 1); 
            Promo_API(P_ID,"Original",Promo_type);
            Promo_Location_API(P_ID,"Original",Promo_type);
          }            
            
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Update Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", " update", false, "no_jira");
         if (FAIL) { return;}
         _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Save updated changes'", "xpath", "//div[normalize-space()='Save Changes']", "no_jira");
         if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
         if (FAIL) { return;}       
         Promo_API(P_ID,"Edited",Promo_type); 
         Promo_Location_API(P_ID,"Edited",Promo_type);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Search for Created promo", "css","input[aria-label='Search Promotions']" , "Automation Test Promo", false, "no_jira");
         if (FAIL) { return;}  

         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
          if (FAIL) { return;}  
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'pause')]", "no_jira");
            if (FAIL) { return;} 
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'delete')]", "no_jira");
            if (FAIL) { return;}               
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(5000);
         Promo_API(P_ID,"Deleted",Promo_type);  
         Promo_Location_API(P_ID,"Deleted",Promo_type);
         
    }//End of Promo_search_btn
    
     public static void Promo_API(String P_ID,String Promo_action,String Promo_type) throws InterruptedException
     {
         EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Promo API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         
          _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Promo/ API ("+Promo_action+" promo)", BaseAPI + "/promo/" + P_ID, true,"no_jira" );
            _t++; TWeb.API_Body_Contains("Promo API - find company ID", CompanyID,true, "no_jira");    
            _t++; TWeb.API_Body_Contains("Promo API - find Promo Name", "Automation Test Promo ",true, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo API - find Type", Promo_type,true, "no_jira");  
           if(Promo_action.equalsIgnoreCase("original") || Promo_action.equalsIgnoreCase("cloned"))
                {_t++; TWeb.API_Body_Contains("Promo API - find Desc ("+Promo_action+" promo)", "Automation Test Promo "+Promo_type,true, "no_jira");}
           else {_t++; TWeb.API_Body_Contains("Promo API - find Desc ("+Promo_action+" promo)", "Automation Test Promo "+Promo_type+" update",true, "no_jira");}
          
            
            if(Promo_action.equalsIgnoreCase("original")||Promo_action.equalsIgnoreCase("edited")|| Promo_action.equalsIgnoreCase("cloned"))
            {
                if(Promo_type.equalsIgnoreCase("bundle"))
                { _t++; TWeb.API_Body_Contains("Promo API - find Status", "scheduled",true, "no_jira");}
                else { _t++; TWeb.API_Body_Contains("Promo API - find Status", "active",true, "no_jira");}
            }
            else {_t++; TWeb.API_Body_Contains("Promo API - find Status", "archived",true, "no_jira");}
          Promo_discount_verify();
         EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Promo API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
          
      }//End of Promo_API
     
     public static void Promo_discount_verify() throws InterruptedException
     {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray promo_items = new JSONArray();
            String type = json.getString("type") ;
            if(type.equalsIgnoreCase("lto"))
            { promo_items= json.getJSONObject("items").getJSONArray("main");}
            else
            { promo_items = json.getJSONObject("items").getJSONArray("additional");}
                    for (int i = 0; i < promo_items.length(); i++) {
                        JSONObject promo_item = promo_items.getJSONObject(i);
                        JSONObject discount = promo_item.getJSONObject("discount");
                        if(discount.has("amount_off"))
                         {
                            float fpromo_amount = discount.getFloat("amount_off");           //getString("amount_off");
                            _t++;
                            if(fpromo_amount == 0.50)
                                 { 
                                    _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Discount Amount: "+fpromo_amount + "\t" + "0.50" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                                 }
                            else
                                 {
                                    _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Discount Amount: "+fpromo_amount + "\t" + "0.50" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                                 }
                         } // amount_off
                        else if(discount.has("percent_off"))
                        {
                           int promo_amount = discount.getInt("percent_off");           //getString("amount_off");
                            if(promo_amount == 50)
                                 { _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Percent off : "+promo_amount + "\t" + "50%" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";

                                 }
                            else
                                 {
                                   _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Percent off : "+promo_amount + "\t" + "50%" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                                 }
                        }//End of percent off

           }//End of for
          
     }
     
     
     public static void Promo_Location_API(String P_ID,String Promo_action,String Promo_type) throws InterruptedException
     {
         EX += "\n - " + "\t" + " ====START====" + "\t" + " ===== " + "\t" + " == Promo Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         
         if(Promo_type.equalsIgnoreCase("bundle"))
         {
         _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call/Promo/Location API", BaseAPI + "/promo/company/" +CompanyID+"/location/group/"+SiteID+"?nocache=1", true,"no_jira" );  
         if(Promo_action.equalsIgnoreCase("Original")||Promo_action.equalsIgnoreCase("Edited")|| Promo_action.equalsIgnoreCase("cloned"))
          { 
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo ID", P_ID,true, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo name", "Automation Test Promo",true, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find company ID", CompanyID,true, "no_jira");
          }
         else
          { 
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo ID", P_ID,false, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo name", "Automation Test Promo",false, "no_jira");
          }   
          
         }
         else
         {
          if(Promo_action.equalsIgnoreCase("Original")||Promo_action.equalsIgnoreCase("Edited")|| Promo_action.equalsIgnoreCase("cloned"))
          { _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call/Promo/Location API - "+Promo_action, BaseAPI + "/promo/company/" +CompanyID+"/location/group/"+SiteID+"?status=active&nocache=1", true,"no_jira" );
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo ID", P_ID,true, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo name", "Automation Test Promo",true, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find company ID", CompanyID,true, "no_jira"); 
          }
         else
          { _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call/Promo/Location API", BaseAPI + "/promo/company/" +CompanyID+"/location/group/"+SiteID+"?nocache=1", true,"no_jira" );
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo ID", P_ID,false, "no_jira");
            _t++; TWeb.API_Body_Contains("Promo Location API - find Promo name", "Automation Test Promo",false, "no_jira");
          }       
         }
       EX += "\n - " + "\t" + " ====END====" + "\t" + " ===== " + "\t" + " == Promo Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         
     } // End of Promo_Location_API
}