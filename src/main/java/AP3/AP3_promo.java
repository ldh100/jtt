/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_promo {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > 'Promo Management' Click", "xpath", "//*[contains(text(), 'Promo Management')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Page_URL("Promo Management page URL", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for data...", "className", "v-datatable__progress", "no_jira"); 
            if (FAIL) { return;}            
//        _t++; Thread.sleep(5000); T.Wait_For_Element_By_Path_Presence("Wait for New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira"); 
//            if (FAIL) { return;} 
        
        _t++; Thread.sleep(20000); T.Element_By_Path_Attribute("Page Title", "xpath", "//span[@class='titlePromo']", "textContent", "no_jira"); 
           if (FAIL) { return;}          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}     
        
        _t++; Thread.sleep((long) sleep); T.List_L0("Promotions Count", "tagName", "tr", "no_jira");             
        if (FAIL) { return;}
        if (ALL_DATA)  {
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Promotion Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            _t++; T.Element_Text("Promotion Data Row Text", L0.get(L0.size()- 1), "no_jira");             
            if (FAIL) { return;}        
        }       
        
        _t++; Thread.sleep((long) sleep); T.List_L1("Columns Count", "css", "[role='columnheader']", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++)  {
                _t++; T.Element_Attribute("Column Label", L1.get(i), "aria-label", "no_jira");             
                if (FAIL) { return;}
            }        
        _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Previous page '<' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;} 
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Next page '>' attribute", "css", "[aria-label='Next page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Next page '>' Click", "css", "[aria-label='Next page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Previous page '>' attribute", "css", "[aria-label='Previous page']", "disabled", "no_jira");
            if (FAIL) { return;}      
            if(t == "null" || t == "false"){
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Previous page '>' Click", "css", "[aria-label='Previous page']", "no_jira"); 
                    if (FAIL) { return;}            
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
                    if (FAIL) { return;}         
            }
            
            //All Promotions
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira"); 
            if (FAIL) { return;}  
            
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                    
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ 
                    T_Index = i; 
                }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}               
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Promotions Count", "tagName", "tr", "no_jira");             
        if (FAIL) { return;}
        if (ALL_DATA)  {
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Promotion Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        } else {
            _t++; T.Element_Text("Promotion Data Row Text", L0.get(L0.size() - 1), "no_jira");             
            if (FAIL) { return;}        
        } 
            
            

        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click New Promotion", "xpath", "//div[contains(text(),'New Promotion')]", "no_jira"); 
            if (FAIL) { return;}   
            
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Name' text", "Promotion Name", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Locations' text", "Promotion Locations", true, "no_jira");
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select App' text", "Select App", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select Brand (Global Menu)' text", "Select Brand (Global Menu)", true, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Filter by Location' text", "Filter by Location", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select Sites' text", "Select Sites", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'All Sites' text", "All Sites", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected' text", "Sites Selected (0)", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Schedule' text", "Promotion Schedule", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select Dates' text", "Select Dates", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select Times' text", "Select Times", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Repeat' text", "Repeat", true, "no_jira");
        if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Select Days' text", "Select Days", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Details' text", "Promotion Details", true, "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Type' text", "Promotion Type", true, "no_jira");
        if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Promotion Text' text", "Promotion Text", true, "no_jira");
        if (FAIL) { return;}  
             
        
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click Promotion name textbox", "xpath", "//input[@aria-label='Promotion Name']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click Promotion Description textbox", "xpath", "//textarea[@aria-label='Promotion Description']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Promotion name is required", "xpath", "//div[contains(text(),'Promotion Name is Required')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Visible_Element_By_Path_Input_Select_Clear("Clear promotion name field", "xpath", "//input[@aria-label='Promotion Name']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Visible_Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Promo", false, url);
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Clickable_Element_By_Path_Click("Click Create Notification Button", "xpath","//div[@class='v-btn__content'][normalize-space()='Create New Promotion']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Promotion Description is required", "xpath","//div[@class='v-messages__message' and contains(text(),'Promotion Description is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: App is required", "xpath","//div[contains(text(),'App is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Brand is required", "xpath","//div[contains(text(),'Brand is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Start Date is required", "xpath","//div[contains(text(),'Start date cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: End Date is required", "xpath","//div[contains(text(),'End date cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Start time is required", "xpath","//div[contains(text(),'Start time cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: End time is required", "xpath","//div[contains(text(),'End time cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Select days  is required", "xpath","//div[contains(text(),'Select days cannot be empty.')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Promotion type  is required", "xpath","//div[contains(text(),'Promotion Type is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Promotion text(EN)  is required", "xpath","//div[contains(text(),'Promotion Text is Required')]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Element_By_Path_Text("Warn: Promotion text(FR)  is required", "xpath","//body//div[@id='operator']//div//div//div//div//div//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]" , "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click Cancel Button", "xpath", "//div[normalize-space()='Cancel']", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep((long) sleep);
        _t++; Thread.sleep((long) sleep);T.Visible_Element_By_Path_Text_Enter("Enter Promotion name", "xpath", "//input[@aria-label='Promotion Name']", "Automation Promo", false, url);
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep);T.Visible_Element_By_Path_Text_Enter("Enter Promotion text", "xpath", "//textarea[@aria-label='Promotion Description']", "Automation Promo description BOGO", false, url);
        if (FAIL) { return;}
        
        // Select App 
        
        _t++; Thread.sleep((long) sleep);T.Clickable_Element_By_Path_Click("Open App Dropdown", "xpath","//body/div[@id='operator']/div/main[@data-booted='true']/div/div/form[@novalidate='novalidate']/div/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]", "no_jira");
                                                                                                                    //another xpath for app //div[@class='v-select__selections']/input[@aria-label='App']
        if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}  
              
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
         _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");              
         if (FAIL) { return;}
         if(t.trim().startsWith(app)){ T_Index = i; }
         }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select " + app, L1.get(T_Index), "no_jira");
         if (FAIL) { return;}
        
        //Select Brand (Global Menu)
////////        Thread.sleep(2000);
//        T.Element_By_Path_Text("Brand dropdown element", "xpath", "//div[@class='v-select__selections']/input[@aria-label='Brands']", "no_jira");
//         //body/div[@id='operator']/div[@class='application--wrap']/main[@class='v-content admin_content']/div[@class='v-content__wrap']/div[@class='container grid-list-md']/form[@class='v-form settings']/div[@class='layout wrap']/div[@class='flex xs12']/div[@class='layout row wrap mt-4 mb-4']/div[@class='w100 v-card v-sheet theme--light']/div[@class='v-card-content']/div[@class='layout']/div[@class='flex xs12']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]
       
        _t++; Thread.sleep((long) sleep);T.Scroll_XY("Scroll to brand", 0, 500, "no_jira");
        _t++; Thread.sleep((long) sleep);T.Clickable_Element_By_Path_Click("Open Brand Dropdown", "xpath","//body/div[@id='operator']/div/main[@data-booted='true']/div/div/form[@novalidate='novalidate']/div/div/div/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]", "no_jira");
        if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Brand' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Global Menu Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
        if (FAIL) { return;}
        // scroll Global Menu
         T_Index = L1.size();
        _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Global Menu Count #2", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
            if (FAIL) { return;} 
        int SC = 2;    
        while(T_Index < L1.size()) {
            T_Index = L1.size();
            SC++; _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Global Menu Count #" + SC, e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                if (FAIL) { return;}  }   
        T_Index = -1; String menu_group = GL_MENU.concat(" (").concat(GROUP).concat(")");
        for (int j = 0; j < L1.size(); j++) {
            if (true)  { _t++; T.Element_Text("Global Menu Name", L1.get(j), "no_jira");  
                if (FAIL) { return;}  }
            if(t.trim().equalsIgnoreCase(menu_group)){T_Index = j;}  }
        if(T_Index > -1){
            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Menu " + GROUP, L1.get(T_Index), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select Global Menu " + GROUP, L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
        } else{return;} 
 
        //Select Sites
        
     //  _t++;T.Element_By_Path_Click("Click Select All Sites", "xpath", "//div[@class='v-input--selection-controls__input']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Select All'", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira"); 
        if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) { return;}
            T.
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Remove All'", "xpath", "//i[@class='v-icon v-icon--link mdi mdi-close-circle theme--light']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Sites Selected (num)' text", "Sites Selected", true,"no_jira"); 
            if (FAIL) { return;}
            
       _t++;Thread.sleep((long) sleep);T.Element_By_Path_Click("Click SITE", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']/following::i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira");
        if (FAIL) { return;}
     
        _t++; Thread.sleep((long) sleep);T.Scroll_XY("Scroll to brand", 0, 800, "no_jira");
        
        _t++;Thread.sleep((long) sleep);T.Element_By_Path_Click("Click Start date", "xpath", "//input[@aria-label='Start Date']", "no_jira");
        if (FAIL) { return;}
        
        
        
        _t++;Thread.sleep((long) sleep);T.Element_E1_Find("Find Calendar element","xpath" , "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
        if (FAIL) { return;}
        
        
        
//        _t++;Thread.sleep((long) sleep);T.Element_Child_List_L1("Find Days", e1, "", Day, url);
//        if (FAIL) { return;}
//        //div[@class='v-menu__content theme--light menuable__content__active']//button[@class='v-btn v-btn--flat v-btn--floating v-btn--outline theme--light accent--text']
        
        _t++;Thread.sleep((long) sleep);T.Element_Child_Click("Click Current date", e1, "xpath", "//button[@class='v-btn v-btn--flat v-btn--floating v-btn--outline theme--light accent--text']", "no_jira");
        if (FAIL) { return;}
        
//        _t++;Thread.sleep((long) sleep);T;
//        if (FAIL) { return;}
//        
//        _t++;Thread.sleep((long) sleep);T;
//        if (FAIL) { return;}
//        
        
//       Thread.sleep(15000);
        
    }
}