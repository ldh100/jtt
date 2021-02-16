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

/**
 *
 * @author Oleg.Spozito
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
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
              if (FAIL) { return;}   
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
        Thread.sleep((long) sleep);
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Test Promo LTO", false, "no_jira");
        if (FAIL) { return;}
        
        // Select App 
        
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Open App Dropdown", "xpath","//label[normalize-space()='App']", "no_jira");
                                                     //another xpath for app //div[@class='v-select__selections']/input[@aria-label='App']
                                                    //body/div[@id='operator']/div/main[@data-booted='true']/div/div/form[@novalidate='novalidate']/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1] 
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
       
//        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Select Brand (Global Menu)' text", "Select Brand (Global Menu)", true, "no_jira");
//        if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to Brand (Global Menu)", e, "no_jira");

        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Open Brand Dropdown", "xpath","//div[@class='flex xs5']//div[@class='v-input border-label-input v-text-field v-text-field--enclosed v-text-field--outline v-select v-autocomplete theme--light']", "no_jira");
        if (FAIL) { return;}      
       /*                                                                                                            
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
        if (FAIL) { return;}         //input[@aria-label='Brands']    //div[@class='v-menu__content theme--light menuable__content__active'] 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        // scroll Global Menu
         T_Index = L1.size();
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu Count #2", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
            if (FAIL) { return;}
        int SC = 2;    
        while(T_Index < L1.size()) {
            T_Index = L1.size();
            Thread.sleep(2000);
             SC++; _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu Count #" + SC, e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                if (FAIL) { return;}  }   
        T_Index = -1; String menu_group = GL_MENU.concat(" (").concat(GROUP).concat(")");
        for (int j = 0; j < L1.size(); j++) {
            if (true)  { _t++; TWeb.Element_Text("Global Menu Name", L1.get(j), "no_jira");  
                if (FAIL) { return;}  }
            if(t.trim().equalsIgnoreCase(menu_group)){T_Index = j;}  }
        if(T_Index > -1){
            _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Menu " + GROUP, L1.get(T_Index), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Global Menu " + GROUP, L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
        } else{return;} 
 */
       
        String menu_group = GL_MENU.concat(" (").concat(GROUP).concat(")");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Brand", "xpath", "//input[@aria-label='Brands']", menu_group, false, "no_jira");
        if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu ", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Global Menu " + GROUP, L1.get(0), "no_jira");
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
     
        
       
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to promotion schedule", e, "no_jira");
        
        //Select Dates
         LocalDate date = LocalDate.now();             
         LocalDate  futuredate = date.plusDays(1);
         LocalDate  future_end_date = futuredate.plusDays(1);
//         Month month = Month.from(date);        // Month : February
//         Month futuremonth = Month.from(futuredate);     //  March
         DateTimeFormatter Dayofdate = DateTimeFormatter.ofPattern("dd");
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", "no_jira");
        if (FAIL) { return;}
//        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Find Days", e1, "", Day, url);
//        if (FAIL) { return;}
//        //div[@class='v-menu__content theme--light menuable__content__active']//button[@class='v-btn v-btn--flat v-btn--floating v-btn--outline theme--light accent--text']
        T_Index = -1;
        for(int i=0;i<=L1.size();i++)
        {
            if(L1.get(i).getText().equals( Dayofdate.format(date)))
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
                       
            if(L1.get(i).getText().equals(Dayofdate.format(futuredate)))
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
         if(L1.get(i).getText().equalsIgnoreCase("Custom")){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Custom" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Monday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'M')]", "no_jira");
        if (FAIL) { return;}
         
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Wednesday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'W')]", "no_jira");
        if (FAIL) { return;}
         
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click 'Friday'", "xpath", "//div[@class='v-item-group theme--light']//span[contains(text(),'F')]", "no_jira");
        if (FAIL) { return;}
         
         _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Schedule confirmation","Promotion will repeat" , true, "no_jira");
        if (FAIL) { return;}
        
        
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
        if (FAIL) { return;}                                                                                  //div[contains(text(),'Select Items')]  
                                                                                                            //div[@class='layout row wrap']//div[@class='flex xs12']//div//button[@type='button']
        
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
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select First Item"  , L0.get(2), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Second Item "  , L0.get(3), "no_jira");
         if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Third Item "  , L0.get(4), "no_jira");
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
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'EDIT' ","Edit" , true, "no_jira");
        if (FAIL) { return;}    
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Edit", "xpath", "//div[contains(text(),'EDIT')]", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Cancel button'", "xpath", "//div[@class='v-dialog v-dialog--active']//button[@class='v-btn v-btn--flat theme--light blue--text']", "no_jira");
        if (FAIL) { return;}   
     
        _t++;Thread.sleep((long) sleep);TWeb.List_L0("List of Remove button", "xpath", "//div[contains(text(),'REMOVE')]", "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Element_Click("Remove Last item", L0.get(2), "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Confirm Remove", "xpath", "//div[contains(text(),'REMOVE')]", "no_jira");
        if (FAIL) { return;}
        
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
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount amount", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, "no_jira");
         if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
        
        /*----------------------------------------------------------------------------------------------------------------------------------------------
         To Find the LTO Promo created
             
        -------------------------------------------------------------------------------------------------------------------------------------------------*/
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
        if (FAIL) { return;}       
        
           Thread.sleep(3000);   
           _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
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
            
        T_Index = -1;
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Promotion Count", "xpath", "//table[@class='v-datatable v-table theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
           if(L0.get(i).getText().contains("Automation Test Promo"))
           {T_Index = i; break;}
        }  
      
         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
          if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to created Promo", e, "no_jira");
//         if (FAIL) { return;}  
        T_Index--;
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr["+T_Index+"]/td[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr["+T_Index+"]/td[2]/span[1]", "no_jira");
         if (FAIL) { return;}  
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'pause')]", "no_jira");
            if (FAIL) { return;} 
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'delete')]", "no_jira");
            if (FAIL) { return;}               
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
            if (FAIL) { return;}
        
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr["+T_Index+"]/td[3]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr["+T_Index+"]/td[5]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr["+T_Index+"]/td[6]/span[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'pause')]", "no_jira");
            if (FAIL) { return;} 
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'delete')]", "no_jira");
            if (FAIL) { return;}               
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
            if (FAIL) { return;}
        
            
        /*------------------------------------------------------------------------------------------------------------------------------------------------
                                                 Creating BOGO Promo        
        -------------------------------------------------------------------------------------------------------------------------------------------------*/
            
               
         _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Test Promo BOGO", false, "no_jira");
        if (FAIL) { return;}
        // Select App for BOGO
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
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Brand", "xpath", "//input[@aria-label='Brands']", menu_group, false, "no_jira");
        if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu ", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Global Menu " + GROUP, L1.get(0), "no_jira");
                if (FAIL) { return;} 

         //Select Sites for BOGO
        
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
     
        
       
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to promotion schedule", e, "no_jira");
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", "no_jira");
        if (FAIL) { return;}
//        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Find Days", e1, "", Day, url);
//        if (FAIL) { return;}
//        //div[@class='v-menu__content theme--light menuable__content__active']//button[@class='v-btn v-btn--flat v-btn--floating v-btn--outline theme--light accent--text']
        T_Index = -1;
        for(int i=0;i<=L1.size();i++)
        {
            if(L1.get(i).getText().equals( Dayofdate.format(date)))
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
                       
            if(L1.get(i).getText().equals(Dayofdate.format(futuredate)))
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
         if(L1.get(i).getText().equalsIgnoreCase("Every Day")){ T_Index = i; }
         }
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Every Day" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Schedule confirmation","Promotion will repeat" , true, "no_jira");
        if (FAIL) { return;}
   
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
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "50", false, "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
           
            
           /*----------------------------------------------------------------------------------------------------------------------------------------------
                                                                To Find the BOGO Promo created
             
        -------------------------------------------------------------------------------------------------------------------------------------------------*/
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
        if (FAIL) { return;}       
        
           Thread.sleep(3000);   
           _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
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
            
        T_Index = -1;
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Promotion Count", "xpath", "//table[@class='v-datatable v-table theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
           if(L0.get(i).getText().contains("Automation Test Promo"))
           {T_Index = i; break;}
        }  
      
         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
          if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to created Promo", e, "no_jira");
//         if (FAIL) { return;}  
        T_Index--;
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr["+T_Index+"]/td[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr["+T_Index+"]/td[2]/span[1]", "no_jira");
         if (FAIL) { return;}  
         
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr["+T_Index+"]/td[3]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr["+T_Index+"]/td[5]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr["+T_Index+"]/td[6]/span[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
    
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'pause')]", "no_jira");
            if (FAIL) { return;} 
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'delete')]", "no_jira");
            if (FAIL) { return;}               
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
            if (FAIL) { return;}
        
        
        
                  
        /*------------------------------------------------------------------------------------------------------------------------------------------------
                                                 Creating Bundle Promo        
        -------------------------------------------------------------------------------------------------------------------------------------------------*/
            
              
         _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Test Promo", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("Enter Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Test Promo BUNDLE", false, "no_jira");
        if (FAIL) { return;}
        // Select App for BUNDLE
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
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Brand", "xpath", "//input[@aria-label='Brands']", menu_group, false, "no_jira");
        if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Brand' list", "xpath", "//div[contains(@class,'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu ", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Global Menu " + GROUP, L1.get(0), "no_jira");
                if (FAIL) { return;} 

         //Select Sites for BUNDLE
        
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
     
        
       
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to promotion schedule", e, "no_jira");
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", "no_jira");
        if (FAIL) { return;}
        _t++;Thread.sleep((long) sleep);TWeb.Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Date elements", e1,"xpath" , "//div[@class='v-btn__content']", "no_jira");
        if (FAIL) { return;}
//        _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Find Days", e1, "", Day, url);
//        if (FAIL) { return;}
//        //div[@class='v-menu__content theme--light menuable__content__active']//button[@class='v-btn v-btn--flat v-btn--floating v-btn--outline theme--light accent--text']
        T_Index = -1;
        
        
        for(int i=0;i<=L1.size();i++)
        {
            if(L1.get(i).getText().equals( Dayofdate.format(futuredate)))
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
                       
            if(L1.get(i).getText().equals(Dayofdate.format(future_end_date)))
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
         if(L1.get(i).getText().equalsIgnoreCase("Weekdays")){ T_Index = i; }
         }
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Weekdays" , L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find Schedule confirmation","Promotion will repeat" , true, "no_jira");
        if (FAIL) { return;}
   
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
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter discount ", "xpath", "//div[contains(@class,'error--text')]//input[@type='number']", "100", false, "no_jira");
         if (FAIL) { return;}
         
         _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Bundle Price Before Discounts'","Bundle Price Before Discounts" , true, "no_jira");
        if (FAIL) { return;} 
        _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Bundle Price After Discounts' ","Bundle Price After Discounts" , true, "no_jira");
        if (FAIL) { return;} 
          _t++;Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Total Discount Given'","Total Discount Given" , true, "no_jira");
        if (FAIL) { return;} 
        
        _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click Create New Promotion button'", "xpath", "//button[@type='button']//div[contains(text(),'Create New Promotion')]", "no_jira");
        if (FAIL) { return;}   
           
            
           /*----------------------------------------------------------------------------------------------------------------------------------------------
                                                                To Find the BUNDLE Promo created
             
        -------------------------------------------------------------------------------------------------------------------------------------------------*/
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
        if (FAIL) { return;}       
        
           Thread.sleep(3000);   
           _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
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
            
        T_Index = -1;
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Promotion Count", "xpath", "//table[@class='v-datatable v-table theme--light']//tr", "no_jira");             
        if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
           if(L0.get(i).getText().contains("Automation Test Promo"))
           {T_Index = i; break;}
        }  
      
         _t++; Thread.sleep((long) sleep);TWeb.Find_Text("Find 'Automation Test promo'", "Automation Test Promo", true, "no_jira"); 
          if (FAIL) { return;}  
//        _t++; Thread.sleep((long) sleep);TWeb.Scroll_to_Element("Scroll to created Promo", e, "no_jira");
//         if (FAIL) { return;}  
        T_Index--;
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Promo Name", "xpath", "//tbody/tr["+T_Index+"]/td[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Type of promo", "xpath", "//tbody/tr["+T_Index+"]/td[2]/span[1]", "no_jira");
         if (FAIL) { return;}  
          _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Brand Name", "xpath", "//tbody/tr["+T_Index+"]/td[3]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Schedule of promo", "xpath", "//tbody/tr["+T_Index+"]/td[5]/span[1]", "no_jira");
         if (FAIL) { return;}  
         _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Status of promo", "xpath", "//tbody/tr["+T_Index+"]/td[6]/span[1]/span[1]", "no_jira");
         if (FAIL) { return;}  
    
         
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pause promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'pause')]", "no_jira");
            if (FAIL) { return;} 
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm pause promo", "xpath", "//div[normalize-space()='PAUSE']", "no_jira");
            if (FAIL) { return;}
         Thread.sleep(3000);
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Delete promo", "xpath", "//tbody/tr["+T_Index+"]/td[7]//i[contains(@class,'delete')]", "no_jira");
            if (FAIL) { return;}               
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Confirm Delete promo", "xpath", "//div[normalize-space()='DELETE']", "no_jira");
            if (FAIL) { return;}
       
         Thread.sleep(15000);

    }
}