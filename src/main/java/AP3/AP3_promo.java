package AP3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

class AP3_promo extends AP3_GUI{
    String API_Response_Body = "";
    protected AP3_promo (AP3_GUI a) {
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
        DH_MENU_ID = a.DH_MENU_ID;
        SECTOR = a.SECTOR;
        CompanyID = a.CompanyID;
        GL_MENU = a.GL_MENU;
        
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
        Element_By_Path_Click("Drawer > 'Promo Management' Click", "xpath", "//*[contains(text(), 'Promo Management')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("Promo Management page URL", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);     
//        Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
//            if (FAIL) { return;}            
        Wait_For_Element_By_Path_Presence("Wait for New Promotion", "xpath", "//div[contains(text(), 'New Promotion')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
//Thread.sleep(20000); 
        Element_By_Path_Attribute("Page Title", "xpath", "//span[@class='titlePromo']", "textContent", ParentTest, "no_jira"); 
           if (FAIL) { return;}          
        Wait_For_Element_By_Path_Presence("Wait for Promotion Name","xpath" , "//th[contains(@aria-label, 'Promotion Name')]", ParentTest, "no_jira");
       
        // <editor-fold defaultstate="collapsed" desc="Pagination">  
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Pagination Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n"; 
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}          
        List_L0("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
        if (FAIL) { return;}
        if (_All_data)  {
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Promotion Data Row Text", L0.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            Element_Text("Promotion Data Row Text", L0.get(L0.size()- 1), ParentTest, "no_jira");             
            if (FAIL) { return;}        
        }       
        List_L1("Columns Count", "css", "[role='columnheader']", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                Element_Attribute("Column Label", L1.get(i), "aria-label", ParentTest, "no_jira");             
                if (FAIL) { return;}
            }        
        To_Bottom("Scroll to Page Bottom", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }            
        Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
        Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}            
                Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}         
            }
            
            //All Promotions
            
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}         
        Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            
        Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                    
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
        Thread.sleep(1000);             
//        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
//            if (FAIL) { return;}   
        Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
            
        List_L0("Promotions Count", "tagName", "tr", ParentTest, "no_jira");             
        if (FAIL) { return;}
        if (_All_data)  {
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Promotion Row Text", L0.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            Element_Text("Promotion Data Row Text", L0.get(L0.size() - 1), ParentTest, "no_jira");             
            if (FAIL) { return;}        
        } 
        
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Pagination Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
         
        // </editor-fold> 
        
        To_Top("Scroll to Page Top", ParentTest, "no_jira");
        Element_By_Path_Click("Click 'New Promotion'", "xpath", "//div[contains(text(),'New Promotion')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);    
//        Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
//            if (FAIL) { return;}            
        Wait_For_Element_By_Path_Presence("Wait 'Promotion Name'", "xpath", "//div[contains(text(), 'Promotion Name')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}              
        // <editor-fold defaultstate="collapsed" desc="Verify-text">       
        Find_Text("Find 'Promotion Name' text", "Promotion Name", true, ParentTest, "no_jira");
        Find_Text("Find 'Promotion Locations' text", "Promotion Locations", true, ParentTest, "no_jira");
        Find_Text("Find 'Select App' text", "Select App", true, ParentTest, "no_jira");
        Find_Text("Find 'Select Brand (Global Menu)' text", "Select Brand (Global Menu)", true, ParentTest, "no_jira");
        Find_Text("Find 'Filter by Location' text", "Filter by Location", true, ParentTest, "no_jira");
        Find_Text("Find 'Select Sites' text", "Select Sites", true, ParentTest, "no_jira");
        Find_Text("Find 'All Sites' text", "All Sites", true, ParentTest, "no_jira");
        Find_Text("Find 'Sites Selected' text", "Sites Selected (0)", true, ParentTest, "no_jira");  
        Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Select Dates' text", "Select Dates", true, ParentTest, "no_jira");  
        Find_Text("Find 'Select Times' text", "Select Times", true, ParentTest, "no_jira");
        Find_Text("Find 'Repeat' text", "Repeat", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Select Days' text", "Select Days", true, ParentTest, "no_jira");
        Find_Text("Find 'Promotion Details' text", "Promotion Details", true, ParentTest, "no_jira");
        Find_Text("Find 'Promotion Type' text", "Promotion Type", true, ParentTest, "no_jira"); 
        Find_Text("Find 'Promotion Text' text", "Promotion Text", true, ParentTest, "no_jira");                
        Element_By_Path_Click("Click Promotion name textbox", "xpath", "//input[@aria-label='Promotion Name']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Click("Click Promotion Description textbox", "xpath", "//textarea[@aria-label='Promotion Description']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Promotion name is required", "xpath", "//div[contains(text(),'Promotion Name is Required')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear promotion name field", "xpath", "//input[@aria-label='Promotion Name']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click Create Promotion Button", "xpath","//div[@class='v-btn__content'][normalize-space()='Create Promotion']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Promotion Description is required", "xpath","//div[@class='v-messages__message' and contains(text(),'Promotion Description is Required')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: App is required", "xpath","//div[contains(text(),'App is Required')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Brand is required", "xpath","//div[contains(text(),'Brand is Required')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Start Date is required", "xpath","//div[contains(text(),'Start date cannot be empty.')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: End Date is required", "xpath","//div[contains(text(),'End date cannot be empty.')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Start time is required", "xpath","//div[contains(text(),'Start time cannot be empty.')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: End time is required", "xpath","//div[contains(text(),'End time cannot be empty.')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Select days  is required", "xpath","//div[contains(text(),'Select days cannot be empty.')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Promotion type  is required", "xpath","//div[contains(text(),'Promotion Type is Required')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Promotion text(EN)  is required", "xpath","//div[contains(text(),'Promotion Text is Required')]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Warn: Promotion text(FR)  is required", "xpath","//body//div[@id='operator']//div//div//div//div//div//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]" , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click Cancel Button", "xpath", "//div[normalize-space()='Cancel']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        // </editor-fold>    
            

        String menu_group = GL_MENU.concat(" (").concat(SECTOR).concat(")");
        //Select Dates
        LocalDate date = LocalDate.now();             
        LocalDate futuredate = date.plusDays(1);
        LocalDate future_end_date = futuredate.plusDays(1);
//      Month month = Month.from(date);        // Month : February
//      Month futuremonth = Month.from(futuredate);     //  March
        
       
        // <editor-fold defaultstate="collapsed" desc="LTO PROMO"> 
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating LTO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        Promo_details("LTO");        
        Promo_scheduling(date, futuredate, "Custom");
        
        To_Bottom("Scroll to Page Bottom", ParentTest, "no_jira");
            if (FAIL) { return;}
        
Thread.sleep(10000);       
        Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                    
        Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            if(L1.get(i).getText().equalsIgnoreCase("Limited Time Offer")){ 
                T_Index = i; 
            }
        }
        Element_Click("Select 'Limited Time Offer'" , L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Items' text", "Items" , true, ParentTest, "no_jira");       
        Find_Text("Find 'Select Items' text", "Select Items", true, ParentTest, "no_jira");
        Scroll_to_Element("Scroll to 'Select items'", e, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(3000);
        Element_By_Path_Click("Click 'Select Items'", "xpath", "//div[contains(text(),'Select Items')]", ParentTest, "no_jira");
            if (FAIL) { return;}                                                                                  
        Find_Text("Find Global menu & Group Sector", menu_group, true, ParentTest, "no_jira");
        Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Menu Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
            if (FAIL) { return;}
        }        
        Element_Click("Select Menu Category [0]" , L1.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(5000);
        Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Menu Category : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
            if (FAIL) { return;}
        }
         
        Element_Click("Select "  , L2.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}
       
        List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
        Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        for (int i = 2; i < L0.size(); i++) {
           List_TR_TDs("Items row Data", L0.get(i), ParentTest, "no_jira");
            if (FAIL) { return;}
        }  
        int Item_cnt = -1;
        if(L0.size() >= 2)  {  
            Element_Click("Select First Item"  , L0.get(2), ParentTest, "no_jira"); 
            if (FAIL) { return;}
        }
        if(L0.size() >= 3)  {  
            Element_Click("Select Second Item ", L0.get(3), ParentTest, "no_jira"); 
            if (FAIL) { return;}
        }
        if(L0.size() >= 4)  {  
            Element_Click("Select Third Item " , L0.get(4), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            Item_cnt = 3;
        }         
        
        Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
        Scroll_to_Element("Items", e, ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
        Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira");
        Find_Text("Find 'Discounted Price'","Discounted Price" , true, ParentTest, "no_jira");
        Find_Text("Find 'Discount given' ","Discount Given" , true, ParentTest, "no_jira");    
        Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, ParentTest, "no_jira");
        Find_Text("Find 'EDIT' ","Edit" , true, ParentTest, "no_jira");
        Element_By_Path_Click("Click Edit", "xpath", "//div[contains(text(),'EDIT')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click Cancel button'", "xpath", "//div[@class='v-dialog v-dialog--active']//button[@class='v-btn v-btn--flat theme--light blue--text']", ParentTest, "no_jira");
            if (FAIL) { return;}   
     
        if(Item_cnt == 3)  {
            List_L0("List of Remove button", "xpath", "//div[contains(text(),'REMOVE')]", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Click("Remove Last item", L0.get(2), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Confirm Remove", "xpath", "//div[contains(text(),'REMOVE')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", ParentTest, "no_jira");
        if (FAIL) { return;} 
        
        Element_Click("Click 1st item Discount type", L0.get(2), ParentTest, "no_jira");
            if (FAIL) { return;}   
        
        Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}
        
        Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Discount type : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            if(t.trim().equalsIgnoreCase("$ Discount Amount")){ 
                T_Index = i; 
            }
        }
        Element_Click("Select : Discount Amount"  , L2.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter discount amount", "xpath", "//div[contains(@class,'active')]//input[@type='number']", "0.50", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Click("Click 2nd item Discount type", L0.get(3), ParentTest, "no_jira");
            if (FAIL) { return;}    
        Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) {
            Element_Text("Discount type : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            if(t.trim().equalsIgnoreCase("% Percentage Off")){ 
                T_Index = i; 
            }
        }
        Element_Click("Select : Discount Percentage"  , L2.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter discount percent", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click 'Create Promotion' button", "xpath", "//button[@type='button']//div[contains(text(),'Create Promotion')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        
        Promo_Actions("LTO");
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating LTO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        // </editor-fold>    
        
        // <editor-fold defaultstate="collapsed" desc="Tests for Dev and Staging Environment">   
       if(!env.equals("PR"))  {  
            // <editor-fold defaultstate="collapsed" desc="BOGO PROMO">  
            EX += " - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating BOGO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            To_Top("Scroll to Page Top", ParentTest, "no_jira");
            Element_By_Path_Click("Click 'New Promotion'", "xpath", "//div[contains(text(),'New Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Thread.sleep(500);    
            Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_Presence("Wait 'Promotion Name'", "xpath", "//div[contains(text(), 'Promotion Name')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Promo_details("BOGO");
            Promo_scheduling(date, futuredate, "Every Day"); 

            To_Bottom("Scroll to Page Bottom", ParentTest, "no_jira");
                if (FAIL) { return;}
Thread.sleep(10000);       
            Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                if (FAIL) { return;}                                              //input[@aria-label='Promotion Type']
            Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
                if(L1.get(i).getText().equalsIgnoreCase("BOGO")){ 
                    T_Index = i; 
                }
            }
            Element_Click("Select 'BOGO'" , L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}

            Find_Text("Find 'Main Item' ","Main Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Select Main Item button' ","Select Main Item" , true, ParentTest, "no_jira");
            Scroll_to_Element("Select Main item", e, ParentTest, "no_jira");
                if (FAIL) { return;}
Thread.sleep(3000);
            Element_By_Path_Click("Click 'Select Main Items'", "xpath", "//div[contains(text(),'Select Main Item')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                               
            Find_Text("Find Global menu & Group Sector", menu_group, true, ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                    if (FAIL) { return;}
            }
            Element_Click("Select " , L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            }
            Element_Click("Select "  , L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 2; i < L0.size(); i++) {
                List_TR_TDs("Items row Data", L0.get(i), ParentTest, "no_jira");
                    if (FAIL) { return;}
            }  
            Element_Click("Select Main Item"  , L0.get(2), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
                if (FAIL) { return;}        
            Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
            Scroll_to_Element("Items", e, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira");
            Find_Text("Find 'Free Item' ","Free Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Select Free Item button' ","Select Free Item" , true, ParentTest, "no_jira");
            Scroll_to_Element("Select Free item", e, ParentTest, "no_jira");
                if (FAIL) { return;}
Thread.sleep(3000);
            Element_By_Path_Click("Click 'Select Free Items'", "xpath", "//div[contains(text(),'Select Free Item')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                               
            Find_Text("Find Global menu & Group Sector", menu_group,  true, ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                    if (FAIL) { return;}
            }
            Element_Click("Select " , L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                    if (FAIL) { return;}
            }       
            Element_Click("Select Category"  , L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 2; i < L0.size(); i++) {
               List_TR_TDs("Items row Data", L0.get(i), ParentTest, "no_jira");
            if (FAIL) { return;}
            }  

            Element_Click("Select Free Item"  , L0.get(3), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
                if (FAIL) { return;}        
            Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
            Scroll_to_Element("Items", e, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Find_Text("Find 'Discounted Price'","Discounted Price" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Find_Text("Find 'Discount given' ","Discount Given" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 

            Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, ParentTest, "no_jira");
            if (FAIL) { return;}  

            List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", ParentTest, "no_jira");
                if (FAIL) { return;}    
            Element_Click("Click 1st item Discount type", L0.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Discount type : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                    if (FAIL) { return;}
                if(t.trim().equalsIgnoreCase("% Percentage Off")){ 
                    T_Index = i; 
                }
            }
            Element_Click("Select : Discount Percentage"  , L2.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter discount percent ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_By_Path_Click("Click 'Create Promotion' button", "xpath", "//button[@type='button']//div[contains(text(),'Create Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}   
            Promo_Actions("BOGO"); 
            EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating BOGO PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";  
            // </editor-fold>               

            // <editor-fold defaultstate="collapsed" desc="Bundle PROMO">             
            EX += " - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating BUNDLE PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            To_Top("Scroll to Page Top", ParentTest, "no_jira");
            Element_By_Path_Click("Click 'New Promotion'", "xpath", "//div[contains(text(),'New Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Thread.sleep(500);    
            Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_Presence("Wait 'Promotion Name'", "xpath", "//div[contains(text(), 'Promotion Name')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Promo_details("bundle");
            Promo_scheduling(futuredate, future_end_date, "Weekdays");

            To_Bottom("Scroll to Page Bottom", ParentTest, "no_jira");
                if (FAIL) { return;}
   Thread.sleep(10000);       
           Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
               if (FAIL) { return;}                                                                                    //input[@aria-label='Promotion Type']     
           Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
               if (FAIL) { return;}
           Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
               if (FAIL) { return;}
           T_Index = -1;
           for (int i = 0; i < L1.size(); i++) {
               Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                   if (FAIL) { return;}
               if(L1.get(i).getText().equalsIgnoreCase("Bundle")){ 
                   T_Index = i; 
               }
           }

           Element_Click("Select 'Bundle'" , L1.get(T_Index), ParentTest, "no_jira");
               if (FAIL) { return;}
           Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, ParentTest, "no_jira");
               if (FAIL) { return;}
           Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, ParentTest, "no_jira");
               if (FAIL) { return;}
           Find_Text("Find 'Main Item' ","Main Item" , true, ParentTest, "no_jira");        
           Find_Text("Find 'Select Main Item button' ","Select Main Item" , true, ParentTest, "no_jira");
           Scroll_to_Element("Select Main item", e, ParentTest, "no_jira");
               if (FAIL) { return;}
Thread.sleep(3000);
            Element_By_Path_Click("Click 'Select Main Items'", "xpath", "//div[contains(text(),'Select Main Item')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                               
            Find_Text("Find Global menu & Group Sector", menu_group, true, ParentTest, "no_jira");       
             Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                 if (FAIL) { return;}
            Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}       
            Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                    if (FAIL) { return;}
            }
            Element_Click("Select " , L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            }
            Element_Click("Select "  , L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            for (int i = 2; i < L0.size(); i++) {
                List_TR_TDs("Items row Data", L0.get(i), ParentTest, "no_jira");
                if (FAIL) { return;}
            }  
            Element_Click("Select Ist Main Item"  , L0.get(2), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Click("Select 2nd Main Item"  , L0.get(3), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
                if (FAIL) { return;}        
            Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Scroll_to_Element("Items", e, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira"); 
            Find_Text("Find 'Bundle Item' ","Bundle Item" , true, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Select Bundle Item button' ","Select Bundle Item" , true, ParentTest, "no_jira");
                if (FAIL) { return;}  
            Scroll_to_Element("Bundle item", e, ParentTest, "no_jira");
                if (FAIL) { return;}
Thread.sleep(3000);
            Element_By_Path_Click("Click 'Select Bundle Items'", "xpath", "//div[contains(text(),'Select Bundle Item')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                               
            Find_Text("Find Global menu & Group Sector", menu_group, true, ParentTest, "no_jira");
            Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}        
            Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
            if (FAIL) { return;}
                T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            }

            Element_Click("Select " , L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Menu Category : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            }
            Element_Click("Select Category"  , L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            for (int i = 2; i < L0.size(); i++) {
                List_TR_TDs("Items row Data", L0.get(i), ParentTest, "no_jira");
                if (FAIL) { return;}
            }  
            Element_Click("Select Free Item"  , L0.get(4), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
                if (FAIL) { return;}      
            Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Scroll_to_Element("Items", e, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discounted Price'","Discounted Price" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discount given' ","Discount Given" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, ParentTest, "no_jira");         
            List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Click("Click Bundle item Discount type", L0.get(5), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Discount type : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
                if(t.trim().equalsIgnoreCase("% Percentage Off")){ 
                    T_Index = i; 
                }
            }
            Element_Click("Select : Discount Percentage"  , L2.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter discount percent ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Bundle Price Before Discounts'","Bundle Price Before Discounts" , true, ParentTest, "no_jira");
            Find_Text("Find 'Bundle Price After Discounts' ","Bundle Price After Discounts" , true, ParentTest, "no_jira");
            Find_Text("Find 'Total Discount Given'","Total Discount Given" , true, ParentTest, "no_jira");

            Element_By_Path_Click("Click 'Create Promotion' button", "xpath", "//button[@type='button']//div[contains(text(),'Create Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}      
            Promo_Actions("bundle");
            EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Creating BUNDLE PROMO" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
           // </editor-fold>   

            EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Creating LTO with Repeat : Weekends==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            To_Top("Scroll to Page Top", ParentTest, "no_jira");
            Element_By_Path_Click("Click 'New Promotion'", "xpath", "//div[contains(text(),'New Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);    
            Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_Presence("Wait 'Promotion Name'", "xpath", "//div[contains(text(), 'Promotion Name')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Promo_details("LTO");
            Promo_scheduling(date,  futuredate, "Weekends");
            To_Bottom("Scroll to Page Bottom", ParentTest, "no_jira");
Thread.sleep(10000);       
            Element_By_Path_Click("Click 'Promotion type'", "xpath", "//div[@class='layout row wrap']//div[@class='v-input__icon v-input__icon--append']", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                    
            Element_E1_Find("Find 'Promotion Type'","css" , "div[class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                 Element_Text("Promotion type options : (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                     if (FAIL) { return;}
                 if(L1.get(i).getText().equalsIgnoreCase("Limited Time Offer")){ 
                     T_Index = i; 
                 }
            }
            Element_Click("Select 'Limited Time Offer'" , L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Promotion text English", "xpath", "//input[@placeholder='English']", "Automation English Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter Promotion text French", "xpath", "//input[@placeholder='French']", "Automation French Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Items' text","Items" , true, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Select Items' text","Select Items", true, ParentTest, "no_jira");
                if (FAIL) { return;} 
            Scroll_to_Element("Scroll to 'Select items'", e, ParentTest, "no_jira");
                if (FAIL) { return;}
 Thread.sleep(3000);
            Element_By_Path_Click("Click 'Select Items'", "xpath", "//div[contains(text(),'Select Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}                                                                                
            Find_Text("Find Global menu & Group Sector", menu_group, true, ParentTest, "no_jira");
                if (FAIL) { return;}
             Wait_For_Element_By_Path_Presence("Wait for 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                 if (FAIL) { return;}
            Element_E1_Find("Find 'Menu Category container'","xpath" , "//ul[@class='v-expansion-panel panel theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Category elements", e1,"xpath" , "//div[@class='v-expansion-panel__header']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Click("Select " , L1.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
 Thread.sleep(5000);
            Element_E2_Find("Find 'Category container'","xpath" , "//div[@class='v-expansion-panel__body']//div[@role='list']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L2("Category elements", e2,"xpath" , ".//div[@class='v-list__tile__title group ml-3']", ParentTest, "no_jira");
                if (FAIL) { return;}         
            Element_Click("Select "  , L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Item Count", "xpath", "//table[@class='v-datatable v-table v-datatable--select-all theme--light']//tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
            Element_Text("Item Row Header", L0.get(0), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            if(L0.size()>=2)  {  
                Element_Click("Select First Item"  , L0.get(2), ParentTest, "no_jira"); 
                    if (FAIL) { return;}
            }
            Element_By_Path_Click("Click 'Save'", "xpath", "//div[normalize-space()='Save']", ParentTest, "no_jira");
                if (FAIL) { return;}        
            Find_Text("Find 'Item Name' ","Item Name" , true, ParentTest, "no_jira");
            Scroll_to_Element("Items", e, ParentTest, "no_jira");
                if (FAIL) { return;}
            Find_Text("Find 'Price per Item'","Price Per Item" , true, ParentTest, "no_jira");
            Find_Text("Find 'Total Item Price' ","Total Item Price" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discounted Price'","Discounted Price" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discount given' ","Discount Given" , true, ParentTest, "no_jira");
            Find_Text("Find 'Discount Amount' ","$ Discount Amount" , true, ParentTest, "no_jira");
            List_L0("List of Discount type box", "xpath", "//div[contains(text(),'No Discount')]", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_Click("Click 1st item Discount type", L0.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Element_E2_Find("Find 'Discount type dropdown'","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_Child_List_L2("Discount type", e2,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}
                T_Index = -1;
            for (int i = 0; i < L2.size(); i++) {
                Element_Text("Discount type : (index " + i + ")", L2.get(i),  ParentTest, "no_jira");              
                if(t.trim().equalsIgnoreCase("$ Discount Amount")){ 
                    T_Index = i; 
                }
             }
            Element_Click("Select : Discount Amount"  , L2.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text_Enter("Enter discount amount", "xpath", "//div[contains(@class,'active')]//input[@type='number']", "0.50", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Create Promotion' button", "xpath", "//button[@type='button']//div[contains(text(),'Create Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}   

            Promo_Actions("LTO");
            EX += "\n - " + "\t" + " ====END=====" + "\t" + " ===== " + "\t" + " == Creating LTO with Repeat : Weekends" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
            //End of staging environment
        }
    // </editor-fold>
    } catch (Exception ex){}   // =============================================  
    } 
    
    private void Promo_details(String Promo_type) {
    try {    
        Element_By_Path_Text_Enter("Enter Promotion Name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Promotion Desription", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Test Promo " + Promo_type, false, ParentTest, "no_jira");
            if (FAIL) { return;}     
        // Select App 
        Element_By_Path_Click("Open App Dropdown", "xpath","//input[@aria-label='App']", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Wait_For_Element_By_Path_Presence("Wait for 'App' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_E1_Find("Find 'App' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_List_L1("Application list Count", e1, "xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Application Name (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
            if(t.trim().startsWith(app)){ 
                T_Index = i; 
            }
         }  
        Element_Click("Select " + app, L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(5000);
        Scroll_XY("Scroll to brand", 0, 500, ParentTest, "no_jira"); // ========== ?????
      Element_By_Path_Click("Open Brand Dropdown", "xpath","//div[@class='flex xs5']//div[@class='v-input dropdown-always-active-label v-text-field v-text-field--enclosed v-text-field--outline v-select v-autocomplete theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}      
        String menu_group = GL_MENU.concat(" (").concat(SECTOR).concat(")");
        Element_By_Path_Text_Enter("Enter Brand", "xpath", "//input[@aria-label='Brands']", menu_group, false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", ParentTest, "no_jira");
            if (FAIL) { return;}   
        Element_Child_List_L1("Global Menu ", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
        Element_Click("Select/Click Global Menu '" + SECTOR + "'", L1.get(0), ParentTest, "no_jira");
            if (FAIL) { return;} 
         //Select Sites
        Scroll_XY("Scroll to Site", 0, 650, ParentTest, "no_jira");
        Element_By_Path_Click("Click 'Select All'", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text_Enter("Enter Search '" + SITE + "'", "css", "[aria-label='Search Sites']", SITE, false, ParentTest, "no_jira");
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Wait for 'Remove All' element", "xpath", "//i[@class='v-icon v-icon--link mdi mdi-close-circle theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Element_By_Path_Click("Click 'Remove All'", "xpath", "//i[@class='v-icon v-icon--link mdi mdi-close-circle theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}           
        Element_By_Path_Click("Click SITE", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']/following::i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}
    } catch (Exception ex){}   // =============================================  
    } //End of Promo_details
    
    private void Promo_scheduling(LocalDate startdate,LocalDate enddate,String Repeat_opt)  {  
    try {    
        DateTimeFormatter Dayofdate = DateTimeFormatter.ofPattern("d");
        Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Scroll_to_Element("Scroll to promotion schedule", e, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", ParentTest, "no_jira");
        T_Index = -1;
        for(int i=0; i<= L1.size(); i++) {
            if(L1.get(i).getText().equals( Dayofdate.format(startdate))) {
                T_Index = i; break;
            }            
        }        
        Element_Click("Select start date", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_By_Path_Click("Click End date", "xpath", "//input[@aria-label='End Date']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find Calendar element","tagName" , "table", ParentTest, "no_jira");
            if (FAIL) { return;}        
        Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", ParentTest, "no_jira");
            if (FAIL) { return;}
        T_Index = -1;
        for(int i=0;i<=L1.size();i++) {           
            if(L1.get(i).getText().equals(Dayofdate.format(enddate))) {
                T_Index = i; 
                break;
            }            
        }
        Element_Click("Select End date", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click add Time Slot", "xpath", "//div[contains(text(),'Add Time Slot')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Remove Time slot'","Remove Time Slot" , true, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click Remove Time Slot", "xpath", "//div[contains(text(),'Remove Time Slot')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            
//        Element_By_Path_Click("Click Start Time Slot", "xpath", "//input[@aria-label='Start Time']", ParentTest, "no_jira");
//            if (FAIL) { return;}
        String hR;
        String mR;
        hR = String.format("%02d",(int)(Math.random()*3 + 8));
        mR = String.format("%02d",(int)(Math.random()*59));
        New_From = hR + ":" + mR + "AM";
        Element_By_Path_Text_Enter("Enter Start Time: " + New_From, "xpath", "//input[@aria-label='Start Time']", New_From, false, ParentTest, "no_jira");
            if(FAIL) {return;}
            
//        Element_By_Path_Click("Click End Time Slot", "xpath", "//input[@aria-label='End Time']", ParentTest, "no_jira");
//            if (FAIL) { return;}
        hR = String.format("%02d",(int)(Math.random()*3 + 1));
        mR = String.format("%02d",(int)(Math.random()*59));
        New_To = hR + ":" + mR + "PM";
        Element_By_Path_Text_Enter("Enter End Time: " + New_To, "xpath", "//input[@aria-label='End Time']", New_To, false, ParentTest, "no_jira");
            if(FAIL) {return;}
        Element_By_Path_Click("Click/Close Time Pickers", "xpath", "//input[@aria-label='End Time']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        
        Element_By_Path_Click("Click 'Repeat - Custom'", "xpath", "//div[@class='v-select__selections']//div[contains(text(),'Custom')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_E1_Find("Find Repeat options","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Date elements", e1,"xpath" , ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
            if (FAIL) { return;}

        T_Index = -1;
        for (int i = 0; i < L1.size(); i++) {
            Element_Text("Repeat options: (index " + i + ")", L1.get(i),  ParentTest, "no_jira");              
                if (FAIL) { return;}
            if(L1.get(i).getText().equalsIgnoreCase(Repeat_opt)){ 
                T_Index = i; 
            }
        }
        Element_Click("Select " + Repeat_opt, L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        
        if(Repeat_opt.equalsIgnoreCase("Custom")) {    
            Element_By_Path_Click("Click 'Monday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'M')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Wednesday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'W')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click 'Friday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'F')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        Find_Text("Find Schedule confirmation","Promotion will repeat" , true, ParentTest, "no_jira");
    } catch (Exception ex){}   // =============================================  
    } //End of Promo_scheduling
    
    private void Promo_Actions(String Promo_type) {
    try {    
        String P_ID = "";
        Thread.sleep(500);   
        Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
            if (FAIL) { return;}       
Thread.sleep(5000);   
        Element_By_Path_Text_Enter("Enter Search 'Automation Test Promo'", "xpath","//input[@aria-label='Search Promotions']" , "Automation Test Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}  
        Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr[1]/td[1]/span[1]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr[1]/td[2]/span[1]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr[1]/td[3]/span[1]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr[1]/td[5]/span[1]", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr[1]/td[6]/span[1]/span[1]", ParentTest, "no_jira");
            if (FAIL) { return;}  
         
         //Clone bundle promotion
         if(Promo_type.equalsIgnoreCase("bundle")) {
            Element_By_Path_Click("Clone promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'copy')]", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Element_By_Path_Click("Confirm 'Clone promo' ", "xpath", "//div[normalize-space()='CLONE']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for cloned promo..", "xpath", "//span[contains(text(),'Copy')]", ParentTest, "no_jira");
                if (FAIL) { return;}
//            Element_By_Path_Click("Clear search box", "xpath","//i[@class='v-icon v-icon--link mdi mdi-close theme--light']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//            Refresh("Refresh Page", ParentTest, "no_jira");
//            Thread.sleep(20000);
//            Element_By_Path_Click("Click search box", "xpath","input[aria-label='Search Promotions']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//            Element_By_Path_Input_Select_Clear("Clear search box", "xpath","input[aria-label='Search Promotions']", ParentTest, "no_jira");
//            if (FAIL) { return;}
//            Element_By_Path_Text_Enter("Search for Cloned promo", "css","input[aria-label='Search Promotions']" , "Copy - Automation Test Promo", false, ParentTest, "no_jira");
//            if (FAIL) { return;}
            Find_Text("Find 'Automation Test promo'", "Copy - Automation Test Promo", true, ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr[2]/td[1]/span[1]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr[2]/td[2]/span[1]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr[2]/td[3]/span[1]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr[2]/td[5]/span[1]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr[2]/td[6]/span[1]/span[1]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_By_Path_Click("Edit Cloned promo", "xpath", "//tbody/tr[2]/td[7]//i[contains(@class,'pencil')]", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Wait_For_Element_By_Path_Presence("Wait for edit cloned promo..", "xpath", "//div[@class='H3-Primary-Left' and contains(normalize-space(),'Edit Promotion')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Page_URL("Created Promotion page URL", ParentTest, "no_jira"); 
            if(t.contains("/")){
                P_ID = t.substring(t.lastIndexOf("/") + 1); 
                Promo_API(P_ID,"Cloned",Promo_type);
                Promo_Location_API(P_ID,"Cloned",Promo_type);
            }
            Element_By_Path_Text_Enter("Update Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", " update", false, ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Save updated changes'", "xpath", "//div[normalize-space()='Save Changes']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
                if (FAIL) { return;}       
Thread.sleep(5000);
            Element_By_Path_Text_Enter("Search for Cloned promo", "xpath","//input[@aria-label='Search Promotions']" , "Copy - Automation Test Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}  
             
            Find_Text("Find 'Cloned Automation Test promo'", "Automation Test Promo", true, ParentTest, "no_jira"); 
             if (FAIL) { return;}  
            Element_By_Path_Click("Delete Cloned promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'delete')]", ParentTest, "no_jira");
                if (FAIL) { return;}               
            Element_By_Path_Click("Confirm Delete cloned  promo", "xpath", "//div[normalize-space()='DELETE']", ParentTest, "no_jira");
                if (FAIL) { return;}
Thread.sleep(5000);
            Refresh("Refresh Page", ParentTest, "no_jira");
Thread.sleep(20000);
            Element_By_Path_Text_Enter("Search for Original promo", "css","input[aria-label='Search Promotions']" , "Automation Test Promo", false, ParentTest, "no_jira");
                if (FAIL) { return;}           
         }//End of if cloned promo
         
         // Editing a promo for promo id to make a API call
        Element_By_Path_Click("Edit promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'pencil')]", ParentTest, "no_jira");
           if (FAIL) { return;} 
Thread.sleep(2000);
        Page_URL("Created Promotion page URL", ParentTest, "no_jira"); 
        if(t.contains("/")){
            P_ID = t.substring(t.lastIndexOf("/") + 1); 
            
            Promo_API(P_ID,"Original", Promo_type);
            Promo_Location_API(P_ID,"Original", Promo_type);
         }            
        Element_By_Path_Text_Enter("Update Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", " update", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Save updated changes'", "xpath", "//div[normalize-space()='Save Changes']", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);    
        Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", ParentTest, "no_jira"); 
            if (FAIL) { return;}       
        Thread.sleep(500);   
        
        Promo_API(P_ID,"Edited", Promo_type); 
        Promo_Location_API(P_ID,"Edited", Promo_type);
        
        Element_By_Path_Text_Enter("Enter Search for Created 'Automation Test Promo'", "css","input[aria-label='Search Promotions']" , "Automation Test Promo", false, ParentTest, "no_jira");
            if (FAIL) { return;}  
        Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'pause')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
Thread.sleep(3000);
        Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(3000);
        Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr[1]/td[7]//i[contains(@class,'delete')]", ParentTest, "no_jira");
            if (FAIL) { return;}               
        Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(5000);
        Promo_API(P_ID,"Deleted",Promo_type);  
        Promo_Location_API(P_ID,"Deleted",Promo_type);
    } catch (Exception ex){}   // =============================================  
    } //End of Promo_search_btn
    
    private void Promo_API(String P_ID,String Promo_action,String Promo_type) {
    try {    
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Promo API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
        Call_API("Call /Promo/ API (" + Promo_action + " promo)", "Bearer " + AP3_TKN, BaseAPI + "/promo/" + P_ID, true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode("API Responce Error"), new Date());
            return;
        }
        API_Body_Contains("Promo API - find company ID", API_Response_Body, CompanyID, true, ParentTest, "no_jira");    
        API_Body_Contains("Promo API - find Promo Name", API_Response_Body, "Automation Test Promo ",true, ParentTest, "no_jira");
        API_Body_Contains("Promo API - find Type", API_Response_Body, Promo_type,true, ParentTest, "no_jira");  
        if(Promo_action.equalsIgnoreCase("original") || Promo_action.equalsIgnoreCase("cloned")) {
            API_Body_Contains("Promo API - find Desc (" + Promo_action + " promo)", API_Response_Body, "Automation Test Promo " + Promo_type, true, ParentTest, "no_jira");
        } else {
            API_Body_Contains("Promo API - find Desc (" + Promo_action + " promo)", API_Response_Body, "Automation Test Promo " + Promo_type + " update", true, ParentTest, "no_jira");
        }
        if(Promo_action.equalsIgnoreCase("original")||Promo_action.equalsIgnoreCase("edited")|| Promo_action.equalsIgnoreCase("cloned")) {
            if(Promo_type.equalsIgnoreCase("bundle")) { 
                API_Body_Contains("Promo API - find Status", API_Response_Body, "scheduled", true, ParentTest, "no_jira");
            } else { 
                API_Body_Contains("Promo API - find Status", API_Response_Body, "active", true, ParentTest, "no_jira");
            }
        } else {
            API_Body_Contains("Promo API - find Status", API_Response_Body, "archived", true, ParentTest, "no_jira");
        }
        Promo_discount_verify();
        EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Promo API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";
    } catch (Exception ex){}   // =============================================  
    } //End of Promo_API
    
    private void Promo_discount_verify() {
    try {    
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray promo_items = new JSONArray();
        String type = json.getString("type") ;
        if(type.equalsIgnoreCase("LTO")) { 
            promo_items = json.getJSONObject("items").getJSONArray("main");}
        else { 
            promo_items = json.getJSONObject("items").getJSONArray("additional");}
            for (int i = 0; i < promo_items.length(); i++) {
                JSONObject promo_item = promo_items.getJSONObject(i);
                JSONObject discount = promo_item.getJSONObject("discount");
                if(discount.has("amount_off"))  {
                    float fpromo_amount = discount.getFloat("amount_off");           //getString("amount_off");
                    _t++;
                    if(fpromo_amount == 0.50)  { 
                        _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Discount Amount: "+fpromo_amount + "\t" + "0.50" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "Discount Amount: "+fpromo_amount, false, ParentTest.createNode("Discount Amount : Found-as expected"), new Date());
                    } else {
                        _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Discount Amount: "+fpromo_amount + "\t" + "0.50" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "Discount Amount: "+fpromo_amount  , true, ParentTest.createNode("Discount Amount : Not Found - expected"), new Date()); 
                    }
                }  else if(discount.has("percent_off")) {
                    int promo_amount = discount.getInt("percent_off");           //getString("amount_off");
                    if(promo_amount == 50) { 
                        _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Percent off : "+promo_amount + "\t" + "50%" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "Percent off : "+promo_amount, false, ParentTest.createNode("Percent off : Found-as expected"), new Date());
                    } else {
                        _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Percent off : "+promo_amount + "\t" + "50%" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "Percent off : "+promo_amount  , true, ParentTest.createNode("Percent off : Not Found - expected"), new Date());
                    }
                }//End of percent off
       }//End of for
    } catch (Exception ex){}   // =============================================  
    } 
    
    private void Promo_Location_API(String P_ID,String Promo_action,String Promo_type) {
    try {    
        EX += "\n - " + "\t" + " ====START====" + "\t" + " ===== " + "\t" + " == Promo Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";    
        if(Promo_type.equalsIgnoreCase("bundle")) {
            Call_API("Call/Promo/Location API", "Bearer " + AP3_TKN, BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1", true, ParentTest, "no_jira" );  
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode("API Responce Error"), new Date());
                return;
            }
            if(Promo_action.equalsIgnoreCase("Original")||Promo_action.equalsIgnoreCase("Edited")|| Promo_action.equalsIgnoreCase("cloned"))  { 
               API_Body_Contains("Promo Location API - find Promo ID", API_Response_Body, P_ID, true, ParentTest, "no_jira");
               API_Body_Contains("Promo Location API - find Promo name", API_Response_Body, "Automation Test Promo", true, ParentTest, "no_jira");
               API_Body_Contains("Promo Location API - find company ID", API_Response_Body, CompanyID, true, ParentTest, "no_jira");
            } else { 
               API_Body_Contains("Promo Location API - find Promo ID", API_Response_Body, P_ID, false, ParentTest, "no_jira");
               API_Body_Contains("Promo Location API - find Promo name", API_Response_Body, "Automation Test Promo",false, ParentTest, "no_jira");
            }   
        } else {
            if(Promo_action.equalsIgnoreCase("Original")||Promo_action.equalsIgnoreCase("Edited")|| Promo_action.equalsIgnoreCase("cloned")) {
                Call_API("Call/Promo/Location API - " + Promo_action, "Bearer " + AP3_TKN, BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?status=active&nocache=1", true, ParentTest, "no_jira" );
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?status=active&nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?status=active&nocache=1", false, ParentTest.createNode("API Responce Error"), new Date());
                    return;
                }                
                API_Body_Contains("Promo Location API - find Promo ID", API_Response_Body, P_ID, true, ParentTest, "no_jira");
                API_Body_Contains("Promo Location API - find Promo name", API_Response_Body, "Automation Test Promo",true, ParentTest, "no_jira");
                API_Body_Contains("Promo Location API - find company ID", API_Response_Body, CompanyID,true, ParentTest, "no_jira"); 
            }else {
                Call_API("Call/Promo/Location API", "Bearer " + AP3_TKN, BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1", true, ParentTest, "no_jira" );
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/promo/company/" + CompanyID + "/location/group/" + SiteID + "?nocache=1", false, ParentTest.createNode("API Responce Error"), new Date());
                    return;
                }    
                API_Body_Contains("Promo Location API - find Promo ID", API_Response_Body,P_ID,  false, ParentTest, "no_jira");
                API_Body_Contains("Promo Location API - find Promo name",  API_Response_Body, "Automation Test Promo", false, ParentTest, "no_jira");
            }       
        }
        EX += "\n - " + "\t" + " ====END====" + "\t" + " ===== " + "\t" + " == Promo Location API Verification==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n\n";   
    } catch (Exception ex){}   // =============================================  
    }  // End of Promo_Location_API
}