/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_site_new {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(500); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Sites page URL", "no_jira"); 
            if (FAIL) { return;}
            
        // <editor-fold defaultstate="collapsed" desc="New Site and Unit > Create">    
        _t++; TWeb.To_Top("no_jira");
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Add New Site Click", "xpath", "//div[@class='v-btn__content' and contains(text(),'ADD NEW SITE')]", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);       
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("New Site page URL","no_jira");
            if (FAIL) { return;}   

        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Site Name", "css", "[aria-label='Location Name']", "New Auto Site " + New_ID, false, "no_jira");
            if (FAIL) { return;} // ^^^ enter name to show buttons
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Cancel' text", "Cancel", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Create Site' text", "Create Site", true,"no_jira"); 
            if (FAIL) { return;}                                                                    
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Site Info Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}  
        for (int i = 0; i < L0.size(); i++) {
            switch (i) {
                case 0:
                    _t++; TWeb.Element_Text(" === Site Definition section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Location Details Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Location Details' text", "Location Details", true,"no_jira"); 
                       if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Location Name' text", "Location Name", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Address' text", "Address", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Sector' text", "Sector", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Country' text", "Country", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'City' text", "City", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Latitude, Longitude' text", "Latitude, Longitud", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Postal Code' text", "Postal Code", true,"no_jira"); 
                        if (FAIL) { return;} 
                    _t++; TWeb.Find_Text("Products Title", "On Site Product", true,"no_jira"); 
                        if (FAIL) { return;}

                    _t++; TWeb.Element_By_Path_Click("Create Site", "xpath", "//*[contains(text(), 'Create Site')]", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Required:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }  
                    //String ADDR = "87 Bordeaux Drive, Logan Township, NJ, USA";
                    //String ADDR_Short = "87 Bordeaux Dr"; 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Site Address", "css", "[aria-label='Address']", "87 Bordeaux Drive, Logan Township", false, "no_jira");
                        if (FAIL) { return;}  
                        Thread.sleep(1000); 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select new Site Address", "xpath", "//*[contains(text(), '" + "Bordeaux Drive" + "')]", "no_jira");
                        if (FAIL) { return;} 
                        Thread.sleep(1000); 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Select_Copy("New Site Address", "xpath", "//input[@aria-label='Address']", "no_jira"); 
                        if (FAIL) { return;}
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Sector dropdown", "xpath", "//input[@aria-label='Sector']", "no_jira");
                        if (FAIL) { return;}
                     _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Sector' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
                        if (FAIL) { return;}  
                     _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Sector list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                        if (FAIL) { return;}
                     for (int k = 0; k < L1.size(); k++) {
                     _t++; TWeb.Element_Text("Sector Name (index " + k + ")", L1.get(k),  "no_jira");              
                     if (FAIL) { return;}
                     if(t.trim().startsWith("Chartwells")){ T_Index = k; }
                     }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Chartwells", L1.get(T_Index), "no_jira");
                     if (FAIL) { return;}
                    _t++; TWeb.Element_By_Path_Text("New Site Country", "xpath", "//input[@aria-label='Country']/parent::div", "no_jira"); 
                        if (FAIL) { return;} // Not OK
                    _t++; TWeb.Element_By_Path_Text("New Site State", "xpath", "//input[@aria-label='State']/parent::div", "no_jira"); 
                        if (FAIL) { return;} // Not OK
                    _t++; TWeb.Element_By_Path_Text_Select_Copy("New Site City", "xpath", "//input[@aria-label='City']", "no_jira"); 
                        if (FAIL) { return;} // Not OK
                    _t++; TWeb.Element_By_Path_Text_Select_Copy("New Site Zip Code", "xpath", "//input[@aria-label='Zip Code']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Element_By_Path_Text_Select_Copy("New Site Latitude, Longitude", "xpath", "//input[@aria-label='Latitude, Longitude']", "no_jira"); 
                        if (FAIL) { return;}

                    _t++; TWeb.List_L1("Available Products Count", "className", "App-Container", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Product Name", L1.get(j), "no_jira");
                            if (FAIL) { return;} 
                            if(t == null ? app == null : t.equals(app)){
                                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("New Site Select Product " + app, L1.get(j), "no_jira"); 
                                   if (FAIL) { return;}                                    
                            }
                            _t++; TWeb.Element_Child_Attribute("Product Image", L1.get(j), "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", "no_jira");             
                            if (FAIL) { return;}
                            // _t++; TWeb.Element_Child_Attribute("Product Selected", L0, "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", j, "no_jira");             
                            // if (FAIL) { return;}            // //_t++; Thread.Sleep(sleep); App_Enabled(DT[i], "no_jira"); if (FAIL) return;
                        }   
                    break;
                case 1:
                    _t++; TWeb.Element_Text(" === Payment section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Payment Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment ID' text", "Payment ID", true,"no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment Type' text", "Payment Type", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Payment Type Prompt", "css", "[aria-label='Payment Type']", "placeholder", "no_jira");
                         if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Payment Type Dropdown Open", "xpath", "//input[@placeholder='Select Payment Type']/parent::div[@class='v-select__selections']/following-sibling::div", "no_jira");
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Find 'Payment Types' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 
                        
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Available Payment Type:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Payment Type", "xpath", "//*[contains(text(), '" + "FreedomPay" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter FP Store ID", "css", "[aria-label='Freedom Pay Store ID']", "1471190011", false, "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter FP Terminal ID", "css", "[aria-label='Freedom Pay Terminal ID']", "2479168011", false, "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Refunds Accepted?' text", "Refunds Accepted?", true,"no_jira"); 
                        if (FAIL) { return;}
                    break;
                case 2:
                    
                    _t++; TWeb.Element_Text(" === Mealplan section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Mealplan Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Mealplan Info' text", "Mealplan Info", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Choose Prompt", "css", "[aria-label='Plan Type']", "placeholder", "no_jira");
                         if (FAIL) { return;}
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Meal Plan Dropdown", "xpath", "//div[@id='mealplan-detail']//i[@class='v-icon mdi mdi-menu-down theme--light']", "no_jira");
                         if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Plan Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);// 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Plan Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");     
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Available Meal Plan:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Meal Plan", "xpath", "//*[contains(text(), '" + "Blackboard" + "')]", "no_jira");
                        if (FAIL) { return;}  
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Plan Name", "css", "[aria-label='Plan Name']", "BLACKBOARD", false, "no_jira");
//                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Meal Plan Name", "css", "[aria-label='Plan Name']","no_jira");
                     if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Host", "css", "input[aria-label='Host']", "20.62.183.69", false, "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Port", "css", "input[aria-label='Port']", "9003", false, "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter AES", "css", "input[aria-label='AES key']", "294A404E635266556A586E3272357537", false, "no_jira");
                        if (FAIL) { return;}
                    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Vendor Dropdown", "xpath", "//input[@aria-label='Vendor number']/parent::div[@class='v-select__selections']/following-sibling::div//i", "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Vendor number' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);
                    T_Index = -1;
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Vendor number Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");     
                    for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Available Vendor Number:", L1.get(j), "no_jira");
                            if (FAIL) { return;}
                            if(t.trim().equals("3600"))
                                T_Index = j;
                       }   
                    if(T_Index!= -1)
                    {
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select vendor", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;}  
                    }
                      
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter EN Additional Instructions", "css", "[aria-label='Additional Instructions (en)']", "Do not use - test auto generated", false, "no_jira");
                        if (FAIL) { return;} // ma-0 v-btn v-btn--flat v-btn--small theme--light
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EN>FR'", "xpath", "//button[@class='ma-0 v-btn v-btn--flat v-btn--small theme--light']", "no_jira");
                        if (FAIL) { return;}                         
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter FR Additional Instructions", "css", "[aria-label='Additional Instructions (fr)']", "Ne pas utiliser - test généré automatiquement", false, "no_jira");
                        if (FAIL) { return;}     
                    _t++; Thread.sleep((long)sleep); TWeb.Text_Found("Find meal plan terminal ID", "Meal Plan Terminal ID", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long)sleep); TWeb.Scroll_to_Element("Scroll to Meal plan terminal ID", e, "no_jira");
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Meal Plan Terminal ID", "css", "[aria-label='Meal Plan Terminal ID']", "401001", false, "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Tender Type", "xpath", "//input[@placeholder='Please select Tender Type']/preceding-sibling::div","no_jira");
                        if (FAIL) { return;}     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Name of tender", "css", "input[aria-label='Name of Tender']", "Tender 401001", false, "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Tender ID", "css", "input[aria-label='Tender ID']", "401", false, "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Tax Exempt Dropdown", "xpath", "//input[@aria-label='Tax Exempt']/parent::div[@class='v-select__selections']/following-sibling::div//i", "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Tax exempt' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}    
                    Thread.sleep(500);
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Tax exempt options", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");     
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Available Tax exempt options :", L1.get(j), "no_jira");
                            if (FAIL) { return;}
                            if(t.trim().equals("Yes"))
                                T_Index = j;
                       }   
                    if(T_Index!= -1)
                    {
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'Tax exempt'", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;}  
                    }    
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Add another tender type' text", "add another tender type", true,"no_jira"); 
                        if (FAIL) { return;}      
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Add another tender type'", e, "no_url");
                        if (FAIL) { return;}
                      _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cancel  another tender type", "xpath", "(//div[@class='flex display-flex align-center']//div[@class='flex xs1']//i[contains(@class,'close')])[2]", "no_jira");
                        if (FAIL) { return;} 
                       
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Manage Meal Plan Domains' text", "Manage Meal Plan Domains", true,"no_jira"); 
                        if (FAIL) { return;}      
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Manage Meal Plan Domains'", "xpath", "//div[contains(@class,'Primary-Left Domain') and contains(text(),'Manage Meal Plan Domains')]", "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);    
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Cancel  Manage Meal Plan Dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-btn__content'][normalize-space()='cancel']", "no_jira");
//                      if (FAIL) { return;}
//                     
                   _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Domains' card", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter invalid Domain", "css", "[aria-label='Email Domain']", "auto_com", false, "no_jira"); 
                        if (FAIL) { return;}                         
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'invalid Domain' text", "Invalid Email Domain", true,"no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear invalid Domain", "css", "[aria-label='Email Domain']","no_jira"); 
                        if (FAIL) { return;}                       
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click 'CANCEL'", e1, "xpath", ".//div[text()='cancel']", "no_jira"); 
                        if (FAIL) { return; }                           
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Manage Domains'", "xpath", "//div[@class='Body-1-Primary-Left Domain-Emails-Link']", "no_jira"); 
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Domains' card", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                        if (FAIL) { return;}                          
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter valid Domain", "css", "[aria-label='Email Domain']", "auto.com", false, "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click 'ADD'", e1, "xpath", ".//div[text()='ADD']", "no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click 'SAVE'", e1, "xpath", ".//div[text()='save']", "no_jira"); 
                        if (FAIL) { return; }    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Access Domains text", "xpath", "//div[@class='Caption-Black-Medium-Emphasis-Left']", "no_jira"); 
                        if (FAIL) { return;} 
                    break;
                case 3:
                    _t++; TWeb.Element_Text(" === Loyalty section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Loyalty Info Click", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Loyalty Program' text", "Loyalty Program", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'not enabled' text", "Loyalty is not enabled for this brand", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'to enable' text", "Would you like to enable Loyalty?", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Yes' text", "Yes", true,"no_jira"); 
                        if (FAIL) { return;}
                   break;
                case 4:
                    _t++; TWeb.Element_Text(" === Promotion section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Promotion Info'", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Promotions' text", "Promotions", true,"no_jira"); 
                        if (FAIL) { return;}
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promotion Detail' section", "id", "promotion-detail", "no_jira");
                        if (FAIL) { return;} 
                    _t++; TWeb.Element_Child_List_L1("Promotions Count", e1, "tagName", "tr", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Create...' text", "CREATE PROMO", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", "no_jira"); 
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Save promo Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;}   
                     _t++; Thread.sleep((long) sleep); TWeb.List_L1(" 'Required' missing Count", "xpath", ".//div[contains(@class,'v-messages__message')]", "no_jira");             
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Required:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo%%" , false, "no_jira");
                        if (FAIL) { return;} 

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", "no_jira");
                         if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                                         
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Promo Type:", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }                       
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Promo Type %%", "xpath", "//*[contains(text(), '" + "Percentage off" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Percentage off 50%", "css", "[aria-label='Value ($ or %)']", "50", false, "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", "no_jira");
                         if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Promo State:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            }  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promotion Detail' section", "id", "promotion-detail", "no_jira");
                        if (FAIL) { return;} 
                    _t++; TWeb.Element_Child_List_L1("Promotions Count", e1, "tagName", "tr", "no_jira");
                        if (FAIL) { return;} 
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create promo Click", "xpath", "//*[contains(text(), 'CREATE PROMO')]", "no_jira"); 
                        if (FAIL) { return;}                                                     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Promo Name", "css", "[aria-label='Promotion Name']", "New Auto Site " + New_ID + " Promo$$" , false, "no_jira");
                        if (FAIL) { return;} 

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Promo Type Dropdown Open", "css", "[aria-label='Promotion Type']", "no_jira");
                         if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promo Types' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                                         
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Promo Types Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                              
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Promo Type:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            }  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Promo Type $$", "xpath", "//*[contains(text(), '" + "Amount off" + "')]", "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Ammount off 2$", "css", "[aria-label='Value ($ or %)']", "2", false, "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Promo State Dropdown Open", "css", "[aria-label='Promotion State']", "no_jira");
                         if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promo State' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--fixed menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}                           
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Promo State Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                            
//                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Promo State Count", "xpath", "/html/body/div/div[4]/div/div/div", "no_jira");             
//                        if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; TWeb.Element_Text("Promo State:", L1.get(j), "no_jira");             
                                if (FAIL) { return;}
                            } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Promo State 'Active'", "xpath", "//*[contains(text(), '" + "Active" + "')]", "no_jira");
                        if (FAIL) { return;}  

                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Create promo 'Save Changes' Click", "xpath", "//*[contains(text(), 'save changes')]", "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promotion Detail' section", "id", "promotion-detail", "no_jira");
                        if (FAIL) { return;} 
                    _t++; TWeb.Element_Child_List_L1("Promo Count - Only 1 Active", e1, "tagName", "tr", "no_jira");           
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("Promotion Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }                                
                        break;
                    case 5:
                    _t++; TWeb.Element_Text(" === KDS Configuration  section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'KDS Configuration'", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'KDS Configuration' text", "KDS Configuration", true,"no_jira"); 
                        if (FAIL) { return;}
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Promotion Detail' section", "id", "kds-conf", "no_jira");
                        if (FAIL) { return;} 
                    _t++; TWeb.Element_Child_List_L1("KDS Devices Count", e1, "tagName", "tr", "no_jira");             
                        for (int j = 0; j < L1.size(); j++) {
                            _t++; TWeb.Element_Text("KDS Config Data Row", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        }                        
                      break;
                      
                    case 6:
                    _t++; TWeb.Element_Text(" === APEX Configuration  section >>>", L0.get(i), "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'APEX Configuration'", L0.get(i), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'APEX Foodlocker Configuration' text", "APEX Foodlocker Configuration", true,"no_jira"); 
                        if (FAIL) { return;}
                   _t++; TWeb.Find_Text("Find 'not enabled' text", "Food Locker is not enabled for this site", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'to enable' text", "Would you like to enable Food locker integration with APEX?", true,"no_jira"); 
                        if (FAIL) { return;}
                    _t++; TWeb.Find_Text("Find 'Yes' text", "Yes", true,"no_jira"); 
                        if (FAIL) { return;}
                        break;
                    default:
                        break;
                }
            }   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Button 'Create Site' click", "xpath", "//*[contains(text(), 'Create Site')]","no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500);    
        Location_API();
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
            
         // ADD BISINESS UNIT 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Create Sites' page result...", "xpath", "//button[contains(@class, 'v-btn v-btn--outline v-btn--depressed theme--light primary--text')]", "no_jira"); 
            if (FAIL) { return;} 
        //Thread.sleep(1000);
          String S_ID = "";
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Created Site page URL", "no_jira"); 
            if(t.contains("/")){
                S_ID = t.substring(t.lastIndexOf("site/") + 5); }
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Add Unit..' Text", "Add Business Unit",true,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Add Business Unit'", "xpath", "//button[contains(@class, 'v-btn v-btn--outline v-btn--depressed theme--light primary--text')]","no_jira");             
            if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Convert to...' Text", "Convert to Marketplace",true,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Unit Name", "css", "[aria-label='Business Unit Name']", "New Auto Unit " + New_ID, false, "no_jira");
            if (FAIL) { return;} 
        //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter new Unit Number", "css", "[aria-label='Business Unit Number']", New_ID, false, "no_jira");
            if (FAIL) { return;}     
        //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Button 'Save unit' Click", "xpath", "//div[contains(text(), 'Save Business Unit')]","no_jira");             
            if (FAIL) { return;}   
        Thread.sleep(500);    
      
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Station List' page load...", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", "no_jira"); 
            if (FAIL) { return;}           
          Location_Group_API(S_ID);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Site 'Station List' text", "xpath", "//div[contains(@class, 'H6-Selected')]", "no_jira");
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("New Sites Unit(s) Count", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", "no_jira");                                               
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Child_Attribute("New Brand Name", L0.get(i), "xpath", ".//h3[contains(@class, 'brand-name')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; TWeb.Element_Child_Attribute("New Brand Unit", L0.get(i), "xpath", ".//h4[contains(@class, 'Brand-Unit')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; TWeb.Element_Child_List_L1("New Unit Stations 'tr's", L0.get(i), "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}
                for (int j = 2; j < L1.size(); j++) {   // L1 > L0 inner List >>>>>>>>>>>>   0 > 2 skip empty rows              
                    _t++; TWeb.List_TR_TDs("Data row " + (j - 1), L1, j, "no_jira");      
                }
            }   
        // </editor-fold>  
    
        // <editor-fold defaultstate="collapsed" desc="Add Station">  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Button 'Add Station' click", "xpath", "//*[contains(text(), 'ADD STATION')]","no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait 'Add a new Station' page", "xpath", "//div[starts-with(@id, 'toc-')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("New Station setup Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.List_L2("New Station setup Group Count", "xpath", "//div[starts-with(@id, 'toc-')]", "no_jira");             
            if (FAIL) { return;} 
            
        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            _t++; TWeb.Element_Attribute(" === Station setup Navigation >>>", L0.get(i), "textContent", "no_jira");
                if (FAIL) return;
            String CHOICE = t; 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click(" === Click '" + CHOICE + "'", L0.get(i), "no_jira"); 
                if (FAIL) return;
                Thread.sleep(1000);
            switch (CHOICE) { 
                case "Station Information":            
                    // =========================================== Group Selection
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", "no_jira");
                        if (FAIL) return;   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Group' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) {   
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown (re-try)", "css", "[aria-label='Group']", "no_jira");
                                if (FAIL) return; 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Group' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                if (FAIL) return;
                        }  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Groups Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 
                        T_Index = L1.size();
                    _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Groups Count #2", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 

                    int SC = 2;    
                    while(T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Group", L1.get(L1.size() - 1), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Groups Count #" + SC, e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                            if (FAIL) { return;} 
                    }   
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        if (ALL_DATA)  {
                            _t++; TWeb.Element_Text("Group Name", L1.get(j), "no_jira");  
                            if (FAIL) { return;} 
                        }
                        if(L1.get(j).getText().trim().equals(SECTOR)){
                            T_Index = j;
                        }
                    }
                    if(T_Index > -1){
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Group " + SECTOR, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Group " + SECTOR, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;} 
                    } else{
                        _t++;
                        _f++;
                        EX += " - " + "\t" + "Select Group/Sector" + "\t" + SECTOR + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + SECTOR + " Not found";
                        EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";
                        return;
                    } 
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click '" + t + "'", L0, "L0", i, "no_jira"); // === invisible DEBUG
//                        if (FAIL) return;
                        Thread.sleep(1000);
                    // ========================================= Group Selection ^^^^
                    
                    // =========================================== Menu Assignation >>>>>>
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Menu Assignation' dropdown", "css", "[aria-label='Global Menu Assignation']", "no_jira");
                        if (FAIL) return;                                                                                              
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Global Menu' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) {   
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Menu Assignation' dropdown (re-try)", "css", "[aria-label='Group']", "no_jira");
                                if (FAIL) return; 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Global Menu' list (re-try)", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                if (FAIL) return;
                        }
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menus Count #1", e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 
                        T_Index = L1.size();
                    _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menus #2", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 

                    SC = 2;    
                    while(T_Index < L1.size()) {
                        T_Index = L1.size();
                        SC++;
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Menu", L1.get(L1.size() - 1), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menu #" + SC, e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                            if (FAIL) { return;} 
                    }   
                    T_Index = -1;
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; TWeb.Element_Text("Global Menu Name", L1.get(j), "no_jira");  
                        if (FAIL) { return;} 
                        if(L1.get(j).getText().trim().equals(GL_MENU)){
                            T_Index = j;
                        }
                    }
                    if(T_Index > -1){
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to " + GL_MENU, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select " + GL_MENU, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;} 
                    } else{
                        _t++;
                        _f++;
                        EX += " - " + "\t" + SECTOR + " Global Menu List" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + GL_MENU + " Not found";
                        EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";
                        return;
                    } 
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click '" + t + "'", L0, "L0", i, "no_jira"); 
//                        if (FAIL) return;
                        Thread.sleep(1000);
                    // ============================== ^^^ Menu Assignation
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Station Name'", "xpath", "//label[contains(text(), 'Station Name')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Name", "css", "[aria-label='Station Name']", "New Station " + New_ID, false, "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Station Location Description Click", "xpath", "//label[contains(text(), 'Location Description')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Location Description", "css", "[aria-label='Station Location Description']", "Attic " + New_ID, false, "no_jira"); 
                        if (FAIL) { return;}      
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Location [Cost Centre] Click", "xpath", "//*[contains(text(), 'Location [Cost Centre]')]", "no_jira"); 
                        if (FAIL) { return;}  
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Cost Centre' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Cost Centre Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to last Cost Centre", L1.get(L1.size() - 1), "no_jira");
                            if (FAIL) { return;}

                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select last Cost Centre in the List", L1.get(L1.size() - 1), "no_jira"); 
                        if (FAIL) { return;} 
                        
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Tax Rate Click", "css", "[aria-label='Tax Rate']", "no_jira"); 
                        if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Tax Rate", "css", "[aria-label='Tax Rate']", "12", false, "no_jira"); 
                        if (FAIL) { return;}                                
                    break;
                case "Fee Setup":                   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Fee Setup types count", L2.get(i), "xpath", ".//input[@role='checkbox']", "no_jira"); // 1st
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Enable Fee - Service Check", L1.get(0), "no_jira"); // 1st
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Enable Fee - Delivery Check", L1.get(1), "no_jira"); // 2nd
                        if (FAIL) { return;}
                        
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Input 'Flat Fee' Count", "css", "[aria-label='Flat Fee']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Service Flat Fee - click", L1.get(0), "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Service Fee", L1.get(0), "0.51", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Delivery Flat Fee - click", L1.get(1), "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Delivery Fee", L1.get(1), "0.71", "no_jira"); 
                        if (FAIL) { return;}
                    break; 
                case "Pickup Details":    
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Pickup 'DISABLE' Click", "xpath", "//div[contains(text(), 'DISABLE')]", "no_jira");
                       if (FAIL) { return;}    
                   _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'DISABLE' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                       if (FAIL) { return;}    // Find fragment                     
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'DISABLE' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center dropoff-title']", "no_jira");
                       if (FAIL) { return;}   
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text(" 'DISABLE' dialog Title", e2, "no_jira");
                       if (FAIL) { return;}                          
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'DISABLE' dialog Save", e1, "xpath", ".//div[text()='save']", "no_jira");
                       if (FAIL) { return;}   
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text(" 'DISABLE' Save Text", e2, "no_jira");
                       if (FAIL) { return;}    
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'DISABLE' confirm input", e1, "xpath", ".//input[@aria-label='Confirm Disabling']", "no_jira");
                       if (FAIL) { return;}   
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'DISABLE' confirm input", e2, "no_jira");
                       if (FAIL) { return;}                     
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter 'DISABLX' > typo", e2, "DISABLX", "no_jira");
                       if (FAIL) { return;}                     
                   _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'typo' error message", "Must input the word", true, "no_jira");
                       if (FAIL) { return;} 
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Clear("Clear 'DISABLE' input", e2, "no_jira");
                       if (FAIL) { return;}  
                   _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'cannot be empty' error message", "Confirmation cannot be", true, "no_jira");
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter 'DISABLE'", e2, "DISABLE", "no_jira");
                       if (FAIL) { return;}                     
                   _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Cannot' error message", "Cannot disable both", true, "no_jira");
                       if (FAIL) { return;} 
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'DISABLE' dialog Cancel", e1, "xpath", ".//div[text()='cancel']", "no_jira");
                       if (FAIL) { return;}   
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Text(" 'DISABLE' Cancel text", e2, "no_jira");
                       if (FAIL) { return;}                         
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Click(" 'DISABLE' Cancel Click", e2, "no_jira");
                       if (FAIL) { return;} 
                            
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Timeslot Length Click", "css", "[aria-label='Timeslot Length (minutes)']", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Timeslot Length (minutes)']", "12", false, "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Average Prep Length Click", "css", "[aria-label='Average Prep Length (minutes)']", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Average Prep Length", "css", "[aria-label='Average Prep Length (minutes)']", "14", false, "no_jira"); 
                       if (FAIL) { return;} 
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Customers Per Slot Click", "css", "[aria-label='Customers Per Slot']", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Customers Per Slot", "css", "[aria-label='Customers Per Slot']", "2", false, "no_jira"); 
                       if (FAIL) { return;}                     
                       
                   _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find 'ASAP Pickup' checkbox", L2, i, "xpath", ".//input[@role='checkbox']", "no_jira"); 
                       if (FAIL) { return;} 
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Click("ASAP Pickup checkbox Click", e1, "no_jira"); 
                       if (FAIL) { return;} 
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Input 'ASAP Pickup theshold' Click", "css", "[aria-label='ASAP time threshold']", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter ASAP time threshold", "css", "[aria-label='ASAP time threshold']", "2", false, "no_jira"); 
                       if (FAIL) { return;}                    
                    break;
                case "Delivery Details":     
                   _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find Setup Delievery > Yes", L2, i, "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Setup Delievery > Yes Click", e1, "no_jira"); 
                       if (FAIL) { return;}  
                   _t++; Thread.sleep((long) sleep); TWeb.List_L1("Input 'Timeslot Length' Count", "css", "[aria-label='Timeslot Length']", "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Delivery 'Timeslot Length' Click", L1.get(1), "no_jira"); // 2nd
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Delivery Timeslot Length", L1.get(1), "11", "no_jira"); // 2nd
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Input 'Customers Per Slot' Count", "css", "[aria-label='Customers Per Slot']", "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click Delivery 'Customers Per Slot'", L1.get(1), "no_jira"); // 2nd
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Delivery 'Customers Per Slot'", L1.get(1), "3", "no_jira"); // 2nd
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Manage Drop-off Locations'", "xpath", "//a[contains(text(), 'Manage Drop-off Locations')]", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Manage Drop-off' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                       if (FAIL) { return;}         
                   
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Enter Drop Off Locations'", "css", "[aria-label='Enter Drop Off Locations']", "no_jira"); 
                       if (FAIL) { return;}                        
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Drop Off Locations", "css", "[aria-label='Enter Drop Off Locations']", "Attic " + New_ID, false, "no_jira"); 
                       if (FAIL) { return;}    
                   _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click '+'", "xpath", "//button[@class='location-btn v-btn v-btn--depressed theme--light primary']", "no_jira"); 
                       if (FAIL) { return;}                                                              
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Button 'Save' Count", e1, "xpath", ".//div[text()='save']", "no_jira"); 
                       if (FAIL) { return;}
                   _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Drop Off Locations 'Save' Click", L1.get(0), "no_jira"); // 2nd
                       if (FAIL) { return;}    
                     break;
                case "Scan & Go Setup":  
                  _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Enable Scan & ...'", "Enable Scan & Go?", true,"no_jira");                                                        
                    break;
                case "Assign Menus":
                      _t++; Thread.sleep((long) sleep); TWeb.List_L3("Menu 'Button' Count", "xpath", "//button[@class='ml-0 pl-0 v-btn v-btn--flat theme--light']", "no_jira"); 
                        if (FAIL) { return;}
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'IMPORT MENU'", L3.get(1), "no_jira"); // index 1 > 2nd button - Import
                        if (FAIL) { return;} 
                    //Thread.sleep(1000);
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Import options...", "css", "[aria-label='Location Stations']", "no_jira"); 
                        if (FAIL) { return;}  
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Location Station drop-down", "css", "[aria-label='Location Stations']", "no_jira"); 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", "no_jira");             
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Open 'Location Station' drop-down", L1.get(0), "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Location Station' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Location Station Count", e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if(L1.size() > 0) {
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Attribute("Last Location Station", L1.get(L1.size() - 1), "textContent", "no_jira");
                                if (FAIL) { return;}                            
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Location Station", L1.get(L1.size() - 1), "no_jira");
                                if (FAIL) { return;}
                            Thread.sleep(500);
//                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Menus drop-down", "css", "[aria-label='Menus']", "no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Inport Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", "no_jira");             
                                if (FAIL) { return;}  
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Open 'Menus' drop-down", L1.get(1), "no_jira");                                 
                                 if (FAIL) { return;}
                            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Menus' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                if (FAIL) { return;}
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menus Count", e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Attribute("Last Menu", L1.get(L1.size()- 1), "textContent", "no_jira");
                                if (FAIL) { return;} 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Last Menu", L1.get(L1.size() - 1), "no_jira");
                                if (FAIL) { return;}  
                                Thread.sleep(500);
                        } else{
                            _t++; 
                            _f++;
                            F += _t + " > " + "Add Station > Assign Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                            EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Import" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";                               
                        }                                                  
                                              
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("ADD MENU Click", L3.get(0), "no_jira"); // index 0 > 1st button - Add
                        if (FAIL) { return;}    
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Menu Name drop-down", "css", "[aria-label='Menu Name']", "no_jira"); 
//                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Add Menu > drop-down(s) count", L2.get(i), "xpath", ".//div[@class='v-input__icon v-input__icon--append']", "no_jira");             
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Open 'Menu Name' drop-down", L1.get(0), "no_jira");                                 
                         if (FAIL) { return;}                                               
  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Menu Names' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menu Names Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if (FAIL) { return;} 
                        if(L1.size() > 0) {
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Attribute("1st Menu Name", L1.get(0), "textContent", "no_jira");
                                if (FAIL) { return;}
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Menu", L1.get(0), "no_jira");
                                if (FAIL) { return;} 
                                Thread.sleep(500);
                        } else{
                            _t++; 
                            _f++;
                            F += _t + " > " + "Add Station > Assign Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                            EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";                           
                        }
                    break;
                case "Integration Type": 
                    _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find Setup KDS > Yes", L2, i, "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", "no_jira"); 
                    if (!FAIL) { 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Setup KDS > Yes Click", e1, "no_jira"); 
                            if (FAIL) { return;}   
                            Thread.sleep(1000);
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'KDS Device Email'", "css", "[aria-label='KDS Device Email']", "no_jira"); 
                            if (!FAIL) {                        
                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter KDS Device Email", "css", "[aria-label='KDS Device Email']", ADMIN_ID, false, "no_jira"); 
                                if (!FAIL) {   
                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'KDS Admin Passcode'", "css", "[aria-label='KDS Admin Passcode']", "no_jira"); 
                                        if (FAIL) { return;}                        
                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter KDS Admin Passcode", "css", "[aria-label='KDS Admin Passcode']", "1459", false, "no_jira"); 
                                        if (FAIL) { return;}

                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Station Phone Number'", "css", "[aria-label='Station Phone Number']", "no_jira"); 
                                        if (FAIL) { return;}                                     
                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Phone Number", "css", "[aria-label='Station Phone Number']", "9025550321", false, "no_jira"); 
                                        if (FAIL) { return;}

                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Message On...'", "css", "[aria-label='Message On Receipt (Thanks for Ordering) ']", "no_jira"); 
                                        if (FAIL) { return;}                                                           
                                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Message On Receipt", "css", "[aria-label='Message On Receipt (Thanks for Ordering) ']", "Thanks for Auto Ordering", false, "no_jira"); 
                                        if (FAIL) { return;}
                                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow ... Refunds'", "Allow for KDS Refunds", true,"no_jira");     
                                        if (FAIL) { return;}
                                }
                            }
                        }
                    break;
                case "Third Party Integration":
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Request Phone...'", "Request Customer Phone Number at Checkout", true,"no_jira"); 
                        if (!FAIL) { 
                            //
                        }                                     
                    break;
                case "Menu Information":
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Requires Promo Exemptions...'", "Menu Requires Item Promo Exemptions:", true,"no_jira"); 
                        if (!FAIL) { 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Requires Item PLU's...'", "Menu Requires Item PLU's:", true,"no_jira"); 
                                if (FAIL) { return; } 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Showcase ...'", "Showcase Items:", true,"no_jira"); 
                                if (FAIL) { return; } 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow Description Edits'", "Allow Local Item Description Edits:", true,"no_jira"); 
                                if (FAIL) { return; } 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow Images'", "Allow Local Menu Images:", true,"no_jira"); 
                                if (FAIL) { return; }
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow Calorie edits'", "Allow Local Menu Calories Edits:", true,"no_jira"); 
                                if (FAIL) { return; }
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow In App Item Naming'", "Allow In App Item Naming:", true,"no_jira"); 
                                if (FAIL) { return; }
                                
                        }
                    break;                      
                case "Payment ID":  
                    
                    break;
                case "Meal Plan":  
                         //By default Site should have meal plan active
                       _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Meal Plan", "id", "toc-mealplan", "no_jira"); 
                        if (FAIL) { return;}
                       _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Would you like to activate meal plan' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                        if (FAIL) { return;} 
                       _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Activate Meal PLan' - Yes", L1.get(0), "no_jira");
                        if (FAIL) { return;}      
                            
                       
                    break;
                case "Loyalty Program":  
                    
                    break;
                case "Payment Method Exclusion":   
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Credit card..'", "Credit Card", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Apple Wallet..'", "Apple Wallet", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Google Wallet..'", "Google Wallet", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Meal Plans..'", "Meal Plans", true,"no_jira"); 
                        if (FAIL) { return; }
                    break;
                case "Web Ordering":  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Web Ordering", "id", "web-order", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow Web Ordering' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow Web Ordering' - Yes", L1.get(0), "no_jira");
                        if (FAIL) { return;}                   
                    break;
                default:
                    break;
            }
        }           
//        _t++; TWeb.Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'Cancel')]","no_jira");
//            if (FAIL) { return;}
        // Leave without saving..
        
        _t++; TWeb.Element_By_Path_Click("Click 'Create Brand'", "xpath", "//*[contains(text(), 'Create Brand')]","no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);       
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'Create Brand'", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}    
              
        // </editor-fold>     

        // 
              
        
/*                   After_Station_creation
        1)  Verify api calls
        2) Flag = 2 make changes in brand configuration / Save changes / Verify api calls
        3) Flag = 3 Choose integration type : Volante   / Save changes / Verify api calls
        4) Flag = 4 Choose integration type : Agilysys  / Save changes / Verify api calls
        5) Flag = 5 Verify Brand API Calls before and after refresh
*/        
        After_station_creation();
        
        // <editor-fold defaultstate="collapsed" desc="Add Station > Hours">   
//        _t++; TWeb.Move_to_Element_By_Path("Scroll to New Brand data row", "xpath", "//td[contains(text(), '" + "New Station " + New_ID + "')]", "no_jira");        
//            if (FAIL) { return;} 
//        _t++; TWeb.Element_By_Path_Click("Click 'New Brand' Name", "xpath", "//*[contains(text(), 'New Station " + New_ID + "')]","no_jira");
//            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
            if (FAIL) { return;}  // ====================== L0 ^^^ =============================================================================  
         for (int i = 0; i < L0.size(); i++) {     
            _t++; TWeb.Element_Text("New Brand Setup Tab >>>>", L0.get(i), "no_jira"); 
         }
         _t++; TWeb.Element_Click("Click 'Menu' Tab", L0.get(0), "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(1000);  
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Please assign...'", "Please assign Service or Delivery hours", true,"no_jira"); 
            if (FAIL) { return; }
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Go to...'", "Go to operation hours", true,"no_jira"); 
            if (FAIL) { return; }            
        _t++; TWeb.Element_By_Path_Click("Click 'Go to...'", "xpath", "//div[text()='Go to operation hours']","no_jira");
            if (FAIL) { return;}    
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Tab 'Service Hours' Click", "xpath", "//*[text()='Service Hours']", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Pickup page URL", "no_jira"); 
            if (FAIL) { return;}   
        _t++; TWeb.Element_E1_Find("Service Days container", "xpath", "//div[@class='layout row wrap align-baseline']",  "no_jira");         
            if (FAIL) { return;}  
            Thread.sleep(500); 
        _t++; TWeb.Element_Child_List_L1("24 Hour Service Count", e1, "xpath", ".//input[@aria-label='24 Hour Service']",  "no_jira");         
            if (FAIL) { return;}             
            for (int j = 0; j < L1.size(); j++) { 
                if(j > 3){
                    _t++; TWeb.Scroll_to_Element("Scroll to Day " + j, L1.get(j), "no_jira");             
                        if (FAIL) { return;}  
                }
                Thread.sleep(500); 
                _t++; TWeb.Element_Click("Check '24 Hour Service' " + j, L1.get(j), "no_jira");             
                    if (FAIL) { return;}
            }  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
            if (FAIL) { return; } 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Tab 'Delivery Hours' Click", "xpath", "//*[text()='Delivery Hours']", "no_jira"); 
            if (FAIL) { return;}              
            Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Delivery page URL", "no_jira"); 
            if (FAIL) { return;}               
        _t++; TWeb.Element_E1_Find("Delivery Days container", "xpath", "//div[@class='layout mt-4 row wrap']",  "no_jira");  // layout row wrap align-baseline       
            if (FAIL) { return;}   
        _t++; TWeb.Element_Child_List_L1("24 Hour Service Count", e1, "xpath", ".//input[@aria-label='24 Hour Service']",  "no_jira");         
            if (FAIL) { return;} 
            for (int j = 0; j < L1.size(); j++) { 
                if(j > 3){
                    _t++; TWeb.Scroll_to_Element("Scroll to Day " + j, L1.get(j), "no_jira");             
                        if (FAIL) { return;}  
                }
                Thread.sleep(500); 
                _t++; TWeb.Element_Click("Check '24 Hour Service' " + j, L1.get(j), "no_jira");             
                    if (FAIL) { return;}
            }  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
            if (FAIL) { return; }
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;} 
        // </editor-fold>    
        
        // <editor-fold defaultstate="collapsed" desc="MM - Activate/Set Visible in App New Local Menu">
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Open Menu Manager in New Tab", url + "#/menu","no_jira");             
        EX += " - " + "\t" + " === MM New Local Menu " + "\t" + " ===== " + "\t" + " == Activate New Local Menu Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Thread.sleep(500);              
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}       
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Menu Manager page URL", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; TWeb.Find_Text("Button 'Go to Menu' text", "Go to menus", true,"no_jira");   
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled","no_jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", "no_jira");
            if (FAIL) return;   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, "no_jira");
                if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; TWeb.Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        // ========================================= Group Selection ^^^^
   
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Menu > " + SECTOR + " page URL", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L2("Menus Count", "xpath", "//div[@class='layout hover align-baseline']", "no_jira");             
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) { 
            _t++; TWeb.Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", "no_jira"); 
            if(t.trim().startsWith(GL_MENU)){
                T_Index = i;
            }                
        }
        if(T_Index > -1){  
            _t++; TWeb.Find_Text("Fund 'Search...' text", "Search Menus", true,"no_jira");   
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, "no_jira");
                if (FAIL) { return;} 
             Thread.sleep(500);
             
            _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find 'View Local Brands' button", L2, T_Index, "xpath", ".//button[@type='button'][3]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'View Local Brands'", e1, "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
                if (FAIL) { return;}                  
            _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Current page URL", "no_jira");             
            _t++; TWeb.Find_Text("Fund 'Search...' text", "Search Menus", true,"no_jira");   
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Local Menu Search", "css", "[aria-label='Search Menus']", New_ID, false, "no_jira");
                if (FAIL) { return;} 
             Thread.sleep(500);                
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'VIEW LOCAL MENUS'", "xpath", "//div[contains(text(), 'View Local Menus')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);  
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}      
            _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");        
             Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); TWeb.List_L1("Menu Sets Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; TWeb.Element_Attribute("Menu Set (Index " + i + ")", L1.get(i), "textContent", "no_jira");  
                }               

            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 1st Menu Set", L1.get(0), "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(500);                 
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Find 'Edit Menu Set Name' dialog", "xpath", "//div[@class='v-card__title H4-Secondary-Center v-card__title--primary']", "no_jira");
                if (t.contains("Edit")){                              
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Edit Menu Set name' container", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                        if (FAIL) { return;}                       
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Edit...' dialog Title", e1, "xpath", ".//div[@class='v-card__title H4-Secondary-Center v-card__title--primary']", "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Dialog 'Edit..' Title text", e2, "no_jira");
                        if (FAIL) { return;}  
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Use original..' Text", "Use original name",true,"no_jira");                            
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Use original' check-box", e1, "xpath", ".//i[@class='v-icon mdi mdi-checkbox-marked theme--light secondary--text']", "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Uncheck 'Use original' check-box", e2, "no_jira");
                        if (FAIL) { return;}                          
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Menu Set Name' text input", e1, "xpath", ".//input[@aria-label='Menu Set Name']", "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Clear("Clear 'Menu Set Name' input", e2, "no_jira");
                        if (FAIL) { return;}                 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter new Menu Set Name", e2, "New Auto Menu " + New_ID, "no_jira");
                        if (FAIL) { return;}      
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Cancel' button", e1, "xpath", ".//div[text()='Cancel']", "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Button 'Cancel' Text", e2, "no_jira"); 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find dialog 'Save' button", e1, "xpath", ".//div[text()='Save']", "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Button 'Save' Text", e2, "no_jira");
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Save'", e2, "no_jira"); 
                        if (FAIL) { return;}   
                    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 1st Menu Set/expand", L1.get(0), "no_jira"); 
                        if (FAIL) { return;}  
                    Thread.sleep(500);                         
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                        if (FAIL) { return;}    
                    Thread.sleep(500);  
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Updated Menu Sets Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                        if (FAIL) { return;}
                        for (int i = 0; i < L1.size(); i++) {
                            _t++; TWeb.Element_Attribute("Menu Set (Index " + i + ")", L1.get(i), "textContent", "no_jira");  
                        }                    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 1st Menu Set", L1.get(0), "no_jira"); 
                        if (FAIL) { return;}
                    Thread.sleep(500);                         
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                        if (FAIL) { return;}    
                }             
  
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L2("Categories Count", L1.get(0), "xpath", ".//div[@class='layout align-center']", "no_jira");             
            for (int i = 0; i < L1.size(); i++) {
                    _t++; TWeb.List_TR_TDs("Categories Row Data", L2, i, "no_jira");   
                        if (FAIL) { return;}                
                }                 
            _t++; Thread.sleep((long) sleep); TWeb.List_L3("Item Rows Count", "tagName", "tr", "no_jira");             
                _t++; TWeb.List_TR_THs("Item Table Header", L3, 0, "no_jira"); 
                for (int i = 2; i < L3.size(); i++) {
                    _t++; TWeb.List_TR_TDs("Item Row Data", L3, i, "no_jira");   
                        if (FAIL) { return;}                
                }            
            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Bulk' container", "xpath", "//div[@class='layout justify-left align-center']", "no_jira");             
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Find 'Bulk' default prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", "no_jira");             
                //if (FAIL) { return;} 
                
//            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Check 'Bulk' select All", e1,"xpath", ".//input[@role='checkbox']", "no_jira");             
//                if (FAIL) { return;} // element not visible ^^^
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Bulk' select All checkbox", e1,"xpath", ".//input[@role='checkbox']", "no_jira");             
                if (FAIL) { return;}                 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check 'Bulk' select All", e2,"no_jira");             
                if (FAIL) { return;} 
                
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_E2("Find 'Bulk' updated prompt", e1,"xpath", ".//span[@class='Button-Primary-Center']", "no_jira");             
                if (FAIL) { return;}               
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Find 'Bulk' updated prompt text", e2,"no_jira");             
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Update X Items' prompt", e2, "no_jira");             
                if (FAIL) { return;} 
                
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'In Stock'", "css", "[aria-label='In Stock']", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Visible In App'", "css", "[aria-label='Visible In App']", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//div[contains(text(), 'Apply Changes')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(3500);
                           
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);  
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}               
        } else {
           _t++; _f++;
           EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        }  
        EX += " - " + "\t" + " === MM New Local Menu " + "\t" + " ===== " + "\t" + " == Activate Local Menu End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";

            
        _t++; Thread.sleep((long) sleep); TWeb.Close_Current_Tab_switch_To_1st("Close Menu Managar tab","no_jira");  
        // </editor-fold> 


        // <editor-fold defaultstate="collapsed" desc="Add Station > Schedule Menu">               
        _t++; Thread.sleep((long) sleep); TWeb.To_Top("no_jira");
            if (FAIL) { return;}
            Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Tab 'Menu' Click", "xpath", "//*[text()='Menu']", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(500); 
//        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'No Menu...'", "No menus for this brand exist in Menu Manager", true, "no_jira"); 
//            if (FAIL) { return; }

        _t++; Thread.sleep((long) sleep); TWeb.List_L1("Menu Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Menu Data Row Text", L1.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Finf 'Schedule Your ...'", "Schedule Your Menus", true,"no_jira"); 
            if (FAIL) { return; } 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for load...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait 'Schedule menu' page", "css", "[aria-label='Menu']", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
         _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Note", "xpath", "//div[contains(@class, 'H6-Selected-On-Surface')]", "textContent", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Menu container Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Menu dropdown Click Open", "css", "[aria-label='Menu']", "no_jira");
            if (FAIL) { return;}                
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Menu list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", "no_jira");
            if (FAIL) { return;}                                                                                             
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menu list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Menu (index " + i + ")", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            } 
            if(L1.size() > 0 && !"No data available".equals(t)){
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Menu", L1.get(0), "no_jira");
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); TWeb.List_L2("Checkboxes Count", "css", "[role='checkbox']", "no_jira");             
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Menu Duration' text", "Menu Duration", true,"no_jira"); 
                    if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check 'All Day'", L2.get(0), "no_jira");
                    if (FAIL) { return;} 
                    
                _t++; Thread.sleep((long) sleep); TWeb.To_Bottom("no_jira");
                    if (FAIL) { return;}                     
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Repeat dropdown Click Open", "css", "[aria-label='Repeat']", "no_jira");
                    if (FAIL) { return;}                     
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Repeat Options list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", "no_jira");
                    if (FAIL) { return;}                                                                                             
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Repeat Options Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                    T_Index = -1;
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; TWeb.Element_Text("Repeat Option (index " + i + ")", L1.get(i),  "no_jira");             
                        if (FAIL) { return;}   
                            if("Custom".equals(t.trim())){
                                T_Index = i;
                            } 
                    }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Custom'", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Dialog Title", "Custom Recurrence", true,"no_jira"); // v-card__title H4-Secondary-Center
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Repeat every Text", "Repeat every", true,"no_jira"); // layout mt-4 H6-Selected-On-Surface-High-Emphasis-Left
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Repeat on Text", "Repeat on", true,"no_jira"); // layout mt-4 H6-Selected-On-Surface-High-Emphasis-Left
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("WeekDays Count", "xpath", "//div[contains(@class, 'Weekday')]", "no_jira");             
                        if (FAIL) { return;}                         
                        for (int i = 1; i < (L1.size() - 1); i++) {
                            _t++; TWeb.Element_Click("Select Weekday (index " + i + ")", L1.get(i),  "no_jira");             
                        }   
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click  'CONTINUE'", "xpath", "//*[contains(text(), 'CONTINUE')]", "no_jira"); 
                      if (FAIL) { return;}  
                      
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check 'No End'", L2.get(1), "no_jira");
                    if (FAIL) { return;}                      
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Start Date Open", "css", "[aria-label='Start Date']", "no_jira");
                    if (FAIL) { return;}     
                int d = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Current Date", "xpath", "//div[text()='" + d + "']", "no_jira"); 
                    if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Service Types' text", "Service Types", true,"no_jira"); 
                    if (FAIL) { return;}                     
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check 'Pickup'", L2.get(2), "no_jira");
                    //if (FAIL) { return;}                      
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check 'Devilery'", L2.get(3), "no_jira");
                    //if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Schedule Summary", "xpath", "//div[@class='Menu-Schedule-Verbiage pa-3 Body-1-Black-High-Emphasis-Left pb-3 noselect']", "textContent","no_jira");
                    //if (FAIL) { return;}                      
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[@class='v-btn theme--light primary rounded m-2']", "no_jira");
                    if (FAIL) { return;}   
                    
                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Brand/Location' page", "css", "[role='columnheader']", "no_jira");
                    if (FAIL) { return;}   
//                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Find side_id ", "tagName", "side_id", "side_id","no_jira");
//                    if (FAIL) { return;}                     
                _t++; Thread.sleep((long) sleep); TWeb.List_L0("Menu Count after Schedule", "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}   
                    _t++; TWeb.Element_Text("Menu Row Header", L0.get(0), "no_jira"); 
                        if (FAIL) { return;} 
                    for (int i = 2; i < L0.size(); i++) {
                        _t++; TWeb.List_TR_TDs("Menu Row Data", L0, i, "no_jira");   
                            if (FAIL) { return;}
                    }                  
            } else{
                _t++; 
                _w++;
                F += _t + " > " + "New Station > Schedule Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                EX += " - " + "\t" + "New Station > Schedule Menu" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\r\n";                           
                return;
            }
        // </editor-fold>       
    }

    
    public static void After_station_creation() throws InterruptedException
    {
        int flag = 1;
        while(flag<=4)
        {
          
        if(flag ==1)
        {
        _t++; TWeb.Move_to_Element_By_Path("Scroll to New Brand data row", "xpath", "//td[contains(text(), '" + "New Station " + New_ID + "')]", "no_jira");        
            if (FAIL) { return;} 
        _t++; TWeb.Element_By_Path_Click("Click 'New Brand' Name", "xpath", "//*[contains(text(), 'New Station " + New_ID + "')]","no_jira");
            if (FAIL) { return;}
            
        } 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);  
        //Verifying Brand API before editing fields.
        String B_ID = "";
        _t++; TWeb.Page_URL("URL of brand", "no_jira");
        if(t.contains("/")){
                B_ID = t.substring(t.lastIndexOf("brand/") + 6,t.length()-10); 
            }
        Location_brand_API(B_ID,flag);
        Brand_Private_API(B_ID,flag);
        Brand_Public_API(B_ID,flag); 
        flag++;
        // Verify the Station Data after a refresh
        if(flag==5)
        {
            Verify_station_data_after_refresh(B_ID);
            break;
        }
        _t++; TWeb.Element_By_Path_Click("Click 'Brand Configuration'", "xpath", "//div[contains(text(),'Configuration')]","no_jira");
            if (FAIL) { return;}
            
          _t++; Thread.sleep((long) sleep); TWeb.List_L0("New Station setup Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}    
            
          
         for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            _t++; TWeb.Element_Attribute(" === Station  Navigation >>>", L0.get(i), "textContent", "no_jira");
                if (FAIL) return;
            String CHOICE = t; 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click(" === Click '" + CHOICE + "'", L0.get(i), "no_jira"); 
                if (FAIL) return;
                Thread.sleep(1000);
            switch (CHOICE) { 
                case "Station Information":        
                    break;
                case "Fee Setup":                   
                    break; 
                case "Pickup Details":    
                    break;
                case "Delivery Details":      
                     if(flag==2)
                     {
                         
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Timeslot Type Dropdown", "xpath", "//input[@aria-label='Timeslot Type']", "no_jira"); 
                     if (FAIL) { return;}

                     _t++; Thread.sleep((long) sleep); TWeb.List_L3("Timeslot type options", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@class='v-list__tile__title']", "no_jira"); 
                     if (FAIL) { return;}

                     T_Index=-1; 
                     for (int k = 0; k < L3.size(); k++) {
                     _t++; TWeb.Element_Text("Timeslot Type (index " + k + ")", L3.get(k),  "no_jira");              
                     if (FAIL) { return;}
                     if(t.trim().startsWith("User"))
                     { T_Index = k;
                     }
                     }

                     _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'User Generated'" , L3.get(T_Index), "no_jira");
                     if (FAIL) { return;}

                     _t++;Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to Manage Drop-off locations", "xpath", "//div[@id='toc-delivery']//a[contains(text(),'Manage Drop-off Locations')]", "no_jira");
                     if (FAIL) { return;}
                     
//                     _t++;Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to Add Timeslot", "xpath", "//div[contains(text(),'Add Timeslot')]", "no_jira");
//                     if (FAIL) { return;}
//                     
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Add timeslot", "xpath", "//div[@id='toc-delivery']//div[@class='flex xs12'][6]//button", "no_jira"); 
                     if (FAIL) { return;}
                       
                                            
                     _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Add New Timeslot'", "Add New Timeslot", true, "no_jira"); 
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
                     
                     d1.findElement(By.xpath("//input[@aria-label='Start Time']")).sendKeys(Keys.TAB);
                     _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Click("Click End Time Slot", "xpath", "//input[@aria-label='End Time']", "no_jira");
                     if (FAIL) { return;}

                     hR = String.format("%02d",(int)(Math.random()*3 + 1));
                     mR = String.format("%02d",(int)(Math.random()*59));
                     New_To = hR + ":" + mR + "PM";
                     _t++;Thread.sleep((long) sleep);TWeb.Element_By_Path_Text_Enter("End Time", "xpath", "//input[@aria-label='End Time']", New_To, false, "no_jira");
                     if(FAIL) {return;}
                     d1.findElement(By.xpath("//input[@aria-label='End Time']")).sendKeys(Keys.TAB);
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Select All'", "xpath", "//i[@class='v-icon mdi mdi-checkbox-blank-outline theme--light']", "no_jira"); 
                     if (FAIL) { return;}  
                     _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Dropoff Locations Selected (num)' text", "Dropoff Locations Selected", true,"no_jira"); 
                     if (FAIL) { return;} 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Save - Add New timeslot", "xpath", "//div[@class='v-dialog v-dialog--active']//div[normalize-space()='save']", "no_jira"); 
                     if (FAIL) { return;}
                       
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click - Display timeslots as one time? - Yes", "xpath", "(//div[@id='toc-delivery']//div[@class='flex xs12']//div[contains(@class,'Option-Left')])[1]", "no_jira"); 
                     if (FAIL) { return;}

                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click - Allow delivery instruction? - Yes", "xpath", "(//div[@id='toc-delivery']//div[@class='flex xs12']//div[contains(@class,'Option-Left')])[2]", "no_jira");
                     if (FAIL) { return;}
                       
                     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click - Enable Bolter Delivery App? - Yes", "xpath", "(//div[@id='toc-delivery']//div[@class='flex xs12']//div[contains(@class,'Option-Left')])[3]", "no_jira");; 
                     if (FAIL) { return;}
                    }
                     break;
                case "Scan & Go Setup":  
                    if(flag==2)
                    {
                   _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Enable Scan & ...'", "id", "toc-ScanAndGo", "no_jira"); 
                        if (FAIL) { return;}
                    _t++;Thread.sleep((long) sleep);TWeb.Element_Child_List_L1("Find 'Enable Scan & Go Setup' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Enable Scan & Go' - Yes", L1.get(0), "no_jira");
                        if (FAIL) { return;}                                                       
                    }
                    break;
                case "Assign Menus":
                    break;
                case "Integration Type": 
                         T_Index = -1;
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'KDS Type dropdown'", "xpath", "//div[@id='toc-kds']//i[@class='v-icon mdi mdi-menu-down theme--light']", "no_jira");
                        if (FAIL) { return;}     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'KDS Type' list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
                        if (FAIL) { return;}  
                     _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("KDS Type Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                        if (FAIL) { return;}
                     for (int k = 0; k < L1.size(); k++) {
                     _t++; TWeb.Element_Text("KDS Type (index " + k + ")", L1.get(k),  "no_jira");              
                     if (FAIL) { return;}
                     if(t.trim().startsWith("Nextep") && flag == 2){ T_Index = k; break;}
                     if(t.trim().startsWith("Volante") && flag == 3){ T_Index = k; break;}
                     if(t.trim().startsWith("Agilysys") && flag == 4){ T_Index = k; break;}
                     }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select KDS Type", L1.get(T_Index), "no_jira");
                     if (FAIL) { return;}
                    
                    break;
                case "Third Party Integration":
                    
                    if(flag ==2)
                    {
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Request phone number...'", "id", "toc-thirdParty", "no_jira"); 
                        if (FAIL) { return;}
                    _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Request phone number' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Request Customer Phone number' - Yes", L1.get(0), "no_jira");
                        if (FAIL) { return;}     
            
                    }              
                    break;
                case "Menu Information":
                    if (flag == 2)
                    {  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find '...Requires Promo Exemptions...'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[1]", "no_jira"); 
                        if (!FAIL) { 
                         _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Menu requires Item Promo Exemptions' options", e1, "xpath", ".//div[contains(@class, 'Option-Right')]", "no_jira");             
                            if (FAIL) { return;} 
                         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Menu requires Item Promo Exemptions' - No", L1.get(0), "no_jira");
                            if (FAIL) { return;} 
                        }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find '...Requires Item PLU's...'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[2]", "no_jira");       
                         if (!FAIL) { 
                           _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Menu Requires Item PLU's' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                           _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Menu Requires Item PLU's' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;} 
                        } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Showcase ...'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[3]", "no_jira");       
                       if (!FAIL) { 
                        _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Showcase Items' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Showcase Items' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;} 
                        } 
                  _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Allow Description Edits'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[4]", "no_jira");       
                          if (!FAIL) { 
                        _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow Local Item Description Edits' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow Local Item Description Edits' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;} 
                        
                        } 
                       _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to Local menu images", "xpath", "//h5[normalize-space()='Allow Local Menu Images:']", "no_jira");
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Allow Images'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[5]", "no_jira");      
                        if (!FAIL) { 
                        _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow Local Menu Images' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow Local Menu Images' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;} 
                        }
                     
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Allow Calorie edits'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[6]", "no_jira");       
                         if (!FAIL) { 
                        _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow Local Menu Calories Edits' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow Local Menu Calories Edits' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;}  
                        }
                         
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Allow In App Item Naming'", "xpath", "(//div[@id='toc-menu-info']//div[@class='flex d-flex xs6'])[7]", "no_jira");       
                        if (!FAIL) { 
                        _t++;Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow In App Item Naming' options", e1, "xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                            if (FAIL) { return;} 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow In App Item Naming' - Yes", L1.get(0), "no_jira");
                            if (FAIL) { return;}  
                        }
                                
                    }  
                    break;                      
                case "Payment ID":  
                    
                    break;
                case "Meal Plan":  
                         //Removing Meal plan from station
                    if (flag==2)
                    {
                       _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Meal Plan", "id", "toc-mealplan", "no_jira"); 
                        if (FAIL) { return;}
                       _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click REMOVE Mealplan", "xpath", "//div[@id='toc-mealplan']//i[contains(@class,'delete')]", "no_jira");
                       _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Text_Enter("Enter REMOVE to delete Meal plan", "xpath", "//div[@class='v-dialog v-dialog--active v-dialog--persistent']//input[@aria-label='Confirm Removal']", "REMOVE", false, "no_jira");
                       _t++; Thread.sleep((long)sleep); TWeb.Element_By_Path_Click("Click Continue to remove Mealplan", "xpath", "//div[@class='v-dialog v-dialog--active v-dialog--persistent']//div[contains(text(),'CONTINUE')]", "no_jira");
                    } 
                    break;
                case "Loyalty Program":  
                    
                    break;
                case "Payment Method Exclusion":   
                    if(flag == 2)
                    {
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Credit card..'", "Credit Card", true,"no_jira"); 
                        if (FAIL) { return; } 
                    
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Apple Wallet..'", "Apple Wallet", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check Apple wallet", e, "no_jira");
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Google Wallet..'", "Google Wallet", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check Google wallet", e, "no_jira");
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Payment exclusions ..Meal Plans..'", "Meal Plans", false,"no_jira"); 
                        if (FAIL) { return; }
                    }   
                    break;
                case "Web Ordering":  
                    if(flag == 2)
                    {
                     _t++;Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Web Ordering", "id", "web-order", "no_jira"); 
                        if (FAIL) { return;}
                     _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Allow Web Ordering' options", e1, "xpath", ".//div[contains(@class, 'Option-Right')]", "no_jira");             
                        if (FAIL) { return;} 
                     _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'Allow Web Ordering' - No", L1.get(0), "no_jira");
                        if (FAIL) { return;}                   
                    }
                    break;
                default:
                    break;
            }
        }           

        _t++; TWeb.Element_By_Path_Click("Click 'Save Changes'", "xpath", "//div[normalize-space()='Save Changes']","no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);       
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'Create Brand'", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}   
            
        }         
  } // End of After_station_creation
    
    
    
    public static void Location_brand_API(String B_ID,int flag) throws InterruptedException
    {
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Location Brand API Verification Start==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Location Brand API", BaseAPI + "/location/brand/"+B_ID, true,"no_jira" );
        JSONObject json = new JSONObject(API_Response_Body);
        
        JSONObject meta = json.getJSONObject("meta");
        if(meta.getJSONObject("type_of_kds").getBoolean("cdl"))
        { 
          if(meta.getBoolean("has_kds") && flag == 1)
          {
            //Print pass type of kds is cdl
              _t++;
              _p++; EX += _t + "\t" + "Type of KDS Found-as expected" + "\t" + "CDL" + "\t" + "CDL" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
          }
          else
          {
            //Fail expected false. but Cdl true & has kds is false
              _t++;
              _f++; EX += _t + "\t" + "Type of KDS Not Found as expected" + "\t" + "CDL" + "\t" + "Not CDL" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
          }
        }
        if(meta.getJSONObject("type_of_kds").getBoolean("nextep"))
             {
                 if(!meta.getBoolean("has_kds") && flag == 2)
                 {//Print type of KDS is nextep
                   _t++;
                  _p++; EX += _t + "\t" + "Type of KDS Found-as expected" + "\t" + "Nextep" + "\t" + "Nextep" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         
                 }
                 else
                 {//FAIL   Has kds and nextep is true.
                  _t++;
                  _f++; EX += _t + "\t" + "Type of KDS Not Found as expected " + "\t" + "Nextep" + "\t" + "Not Nextep" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
                 }
             }
        if(meta.getJSONObject("type_of_kds").getBoolean("volante") )
             {
               if(!meta.getBoolean("has_kds") && flag == 3)
                 {//Print type of KDS is volante
                     _t++;
                  _p++; EX += _t + "\t" + "Type of KDS Found-as expected" + "\t" + "Volante" + "\t" + "Volante" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         
                 }
                 else
                 {//FAIL   Has kds and volante is true.
                     _t++;
                  _f++; EX += _t + "\t" + "Type of KDS Not Found as expected " + "\t" + "Volante" + "\t" + "Not Volante" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
                 }
             }
        if(meta.getJSONObject("type_of_kds").getBoolean("agilysys"))
             {
                 if(!meta.getBoolean("has_kds") && flag == 4)
                 {//Print type of KDS is agilysys
                  _t++;
                  _p++; EX += _t + "\t" + "Type of KDS Found-as expected" + "\t" + "Agilysys" + "\t" + "Agilysys" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         
                 }
                 else
                 {//FAIL   Has kds and agilysys is true.
                  _t++;
                  _f++; EX += _t + "\t" + "Type of KDS Not Found as expected " + "\t" + "Agilysys" + "\t" + "Not Agilysys" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                 }
             }
         
        // Verify customer phone number request at checkout
        
        
       boolean check = false;
                                    /* Verify if brand is hidden */
       meta = json.getJSONObject("is");
       if(meta.has("hidden"))
       {  
         if(meta.getBoolean("hidden"))
            { _t++;
              _p++; EX += _t + "\t" + "Brand is hidden" + "\t" + "-" + "\t" + "-" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            else
            { check = true; 
            }   
       }else if(!meta.has("hidden") || check)
        { // Print Brand is visible.
          _t++;
          _p++; EX += _t + "\t" + "Brand is visible" + "\t" + "-" + "\t" + "Brand is Visible" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
       
       
      
        /*                       Verify if scan and go is supported 
                                flag = 1 / Scan and go not supported
                                flag = 2 / Scan and go supported                 */
        
        
        if(!meta.getBoolean("scan_and_go_supported") && flag==1)
        { //print pass scan and go not supported 
          _t++;
          _p++; EX += _t + "\t" + "Scan & Go Not enabled - expected" + "\t" + "Scan & Go Not Enabled" + "\t" + "Scan & Go Not Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
  
        }
        else if(!meta.getBoolean("scan_and_go_supported") && flag==2)
        { //Print Fail (expected scan and go supported   but not supported )
         _t++;
         _f++; EX += _t + "\t" + "Scan & Go enabled - Expected" + "\t" + "Scan & Go - Not enabled" + "\t" + "Scan & Go - enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
        }
        else if(meta.getBoolean("scan_and_go_supported") && flag==1)
        { // Print Fail (expected scan and go not supported but supported)
         _t++;
         _f++; EX += _t + "\t" + "Scan & Go Not enabled - Expected" + "\t" + "Scan & Go - enabled" + "\t" + "Scan & Go - Not enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
        }
        else if(meta.getBoolean("scan_and_go_supported")  && flag==2)
        { //Print pass scan and go supported
          _t++;
          _p++; EX += _t + "\t" + "Scan & Go Enabled - expected" + "\t" + "Scan & Go - enabled" + "\t" + "Scan & Go - enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
  
        }
        
         /*                     Verify if Web Order Enabled is supported 
                                flag = 1 / Web Ordering enabled
                                flag = 2 /  Web Ordering not enabled                */
        
        if(meta.getBoolean("web_order_enabled") && flag ==1)
        {// Print Pass Web Ordering enabled
          _t++;
          _p++; EX += _t + "\t" + "Web Ordering Enabled - expected" + "\t" + "Web Ordering - enabled" + "\t" + "Web Ordering - enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        else if(meta.getBoolean("web_order_enabled") && flag ==2)
        { // Print Fail Web ordering enabled expected to be disabled
          _t++;
         _f++; EX += _t + "\t" + "Web Ordering Not Enabled - expected" + "\t" + "Web Ordering - enabled" + "\t" + "Web Ordering - Not enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
        }
        else if(!meta.getBoolean("web_order_enabled") && flag ==2)
        { // Print Pass Web ordering disabled 
            _t++;
          _p++; EX += _t + "\t" + "Web Ordering Disabled - expected" + "\t" + "Web Ordering - disabled" + "\t" + "Web Ordering - disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
        }
        else if(!meta.getBoolean("web_order_enabled") && flag ==1)
        {// Print Fail Web ordering disabled expected to be enabled
         _t++;
         _f++; EX += _t + "\t" + "Web Ordering Enabled - expected" + "\t" + "Web Ordering - disabled" + "\t" + "Web Ordering - enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
        }
        
         /*                       Verify if Web Order Enabled is supported 
                                flag = 1 / Web Ordering enabled
                                flag = 2 /  Web Ordering not enabled                */
        
        
        EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Location Brand API Verification End==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
         
    }//End of Location Brand API
    
    public static void Brand_Private_API(String B_ID,int flag) throws InterruptedException
     {
         EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Brand API Private config Verification Start==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
          _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Private API", BaseAPI + "/config/"+B_ID, true,"no_jira" );
         JSONObject json = new JSONObject(API_Response_Body);
          JSONArray digital_wallet = json.getJSONObject("excluded_payment_methods").getJSONArray("digital_wallet_pay");
         
         if(digital_wallet.isEmpty() && flag == 1)
         { // Print pass  Expected result Apple pay and google wallet are not excluded.
           _t++;
          _p++; EX += _t + "\t" + "No digital wallet exclusions - expected" + "\t" + "-" + "\t" + "-" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         }
         else if(digital_wallet.isEmpty() && flag ==2)
          {// Print fail   expected Apple pay and google pay are  excluded  ,  But not excluded.        
            _t++;
          _f++; EX += _t + "\t" + "Digital wallet exclusions Not Enabled-  not expected" + "\t" + "Digital wallet exclusions Not Enabled" + "\t" + "Digital wallet exclusions Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
          }       
         else if(!digital_wallet.isEmpty() && flag == 2)         
         {
            for(int l=0;l<digital_wallet.length();l++)
            {
                if(digital_wallet.getString(l).equals("applewallet") || digital_wallet.getString(l).equals("googlewallet"))
                { //Print Pass Expected  is excluded
                 _t++;
                _p++; EX += _t + "\t" + "Digital wallet exclusions - expected" + "\t" + digital_wallet.getString(l)+" is excluded" + "\t" + "-" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        
                }
            }
         }
         else if(!digital_wallet.isEmpty() && flag == 1)  
         {//Print Fail  expected : All payments to be accepted , but digital wallet excluded. 
          _t++;
          _f++; EX += _t + "\t" + "Digital wallet exclusions Enabled-  not expected" + "\t" + "Digital wallet exclusions Enabled" + "\t" + "Digital wallet exclusions Not Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
         }
                  
         
         EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Brand API Private config Verification End==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
       
     }
    
    public static void Brand_Public_API(String B_ID,int flag) throws InterruptedException
     {
         EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Brand API Public config Verification Start==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
         _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Public API", BaseAPI + "/config/public/"+B_ID, true,"no_jira" );
         JSONObject json = new JSONObject(API_Response_Body);
         
         
         // Request customer phone number
         // Flag = 1  Request phone number - No
         // Flag = 2  Request phone number - Yes
         
         if (!json.getBoolean("get_phone_number") && flag == 1)
         {// Print pass expected not to request phone number
          _t++;
          _p++; EX += _t + "\t" + "Request phone number Not Enabled-expected" + "\t" + "Request phone number disabled" + "\t" + "Request phone number disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        
         }
         else if(json.getBoolean("get_phone_number") && flag == 1)
         { //Print Fail  not expected to request phone number
          _t++;
          _f++; EX += _t + "\t" + "Request phone number enabled-  not expected" + "\t" + "Request phone number enabled" + "\t" + "Request phone number disabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
         }
         else if (json.getBoolean("get_phone_number") && flag == 2)
         { // Print pass expected to request phone number
             _t++;
          _p++; EX += _t + "\t" + "Request phone number Enabled-expected" + "\t" + "Request phone number Enabled" + "\t" + "Request phone number Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        
         }
         else if (!json.getBoolean("get_phone_number") && flag == 2)
         { // Print Fail expected to request phone number  but set to NO.
         _t++;
          _f++; EX += _t + "\t" + "Request phone number Not enabled-  not expected" + "\t" + "Request phone number disabled" + "\t" + "Request phone number Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
       
         }
         
         
         // Meal plan verification
         
         if(json.has("mealplan") && flag == 1)
         {
             //Print PASS  meal plans expected and visible : 
          _t++;
          _p++; EX += _t + "\t" + "Meal Plan Enabled-expected" + "\t" + "Meal Plan Enabled" + "\t" + "Meal PLan Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         }
         else if(!json.has("mealplan") && flag == 2)
         { //Print Pass  No meal plan enabled
           _t++;
          _p++; EX += _t + "\t" + "Meal Plan Disabled-expected" + "\t" + "Meal Plan Disabled" + "\t" + "Meal PLan Disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
         }
             
       
         
        // Single time slot verification for User generated Delivery  
        
        if(json.has("show_single_timeslot") && flag == 2)
        {
           if (json.getBoolean("show_single_timeslot"))
           {  // Print pass expected result 
            _t++;
            _p++; EX += _t + "\t" + "Show Single timeslot Enabled-expected" + "\t" + "Show Single timeslot Enabled" + "\t" + "Show Single timeslot Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
           else if (!json.getBoolean("show_single_timeslot"))
           { // Print Fail expected to be enabled but not enabled.
              _t++;
             _f++; EX += _t + "\t" + "Show Single timeslot - Disabled -  not expected" + "\t" + "Show Single timeslot - Disabled" + "\t" + "Show Single timeslot - Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
         }
        
        // Allow delivery instruction verification for User generated Delivery 
        if(json.has("show_instructions") && flag == 2)
        {
           if (json.getBoolean("show_instructions"))
           {  // Print pass expected result 
            _t++;
            _p++; EX += _t + "\t" + "Allow delivery instruction - Enabled-expected" + "\t" + "Allow delivery instruction - Enabled" + "\t" + "Allow delivery instruction - Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
           else if (!json.getBoolean("show_instructions"))
           { // Print Fail expected to be enabled but not enabled.
              _t++;
             _f++; EX += _t + "\t" + "Allow delivery instruction? - Disabled -  not expected" + "\t" + "Allow delivery instruction? - Disabled" + "\t" + "Allow delivery instruction? - Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
         }
        
        // Enable Bolter Delivery App verification for User generated Delivery 
        if(json.has("runner_app_enabled") && flag == 2)
        {
           if (json.getBoolean("runner_app_enabled"))
           {  // Print pass expected result 
            _t++;
            _p++; EX += _t + "\t" + "Bolter Delivery App Enabled-expected" + "\t" + "Bolter Delivery App - Enabled" + "\t" + "Bolter Delivery App - Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
           else if (!json.getBoolean("runner_app_enabled"))
           { // Print Fail expected to be enabled but not enabled.
              _t++;
             _f++; EX += _t + "\t" + "Bolter Delivery App - Disabled -  not expected" + "\t" + "Bolter Delivery App - Disabled" + "\t" + "Bolter Delivery App - Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
         }
        
        EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Brand API Public config Verification End==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
       
     }
    
    public static void Location_API() throws InterruptedException
     {
         EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == App Multipgroup API Verification Start==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
         boolean flag = false;
         String id = "";
         String sectorName = "";
         String site = "New Auto Site "+New_ID;
         JSONObject meta;
         meta = null;
         // Using Boost Multigroup ID since we create a boost site. Else we could have used appId if it was selecting according to JTT
         String Mgroup_ID = "014B6RP683C2QL7X00oDS86lrKOO14twGXQwzDARCgympJ42Q5SD1LWZ2gppTOGd4eov2GcePXaa59Zquma";
         if(env.equals("ST"))
             { Mgroup_ID="11J3gKPg8BCR3mr5OO92S6EBL4ddEAT17G44eoLPSw0N21gy4OHjQXjDG6LXIrL1MY8B5PHPX9omNMrqFJO";}
         
         _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call App Multigroup API", BaseAPI + "/location/multigroup/"+Mgroup_ID+"?nocache=1", true,"no_jira" );
         JSONObject json = new JSONObject(API_Response_Body);
          JSONArray Groups = json.getJSONArray("groups");
            for (int i = 0; i < Groups.length(); i++) {        
               
                JSONObject object = Groups.getJSONObject(i);
                if(object.has("name") && object.getString("name").equalsIgnoreCase(site)){
                   id = object.getString("id");
                
                   if(object.has("meta")){
                    meta = object.getJSONObject("meta");
                    if (meta.has("sector_name")){
                      sectorName = meta.getString("sector_name");
                      
                      if(sectorName.contentEquals("Chartwells"))        
                       { 
                        _t++;
                        _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Sector : "+sectorName + "\t" + "Chartwells" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                       }
                      else
                       {
                        _t++;
                        _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Sector : "+sectorName + "\t" + "Chartwells" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                       }   
                    }
                    else
                    {
                        _t++;
                        _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "No Sector" + "\t" + "-" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    }
                   }
                 }  
            }//End of for    
         EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == App Multipgroup API Verification End==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n\n";
          
      }//End of Location_API
    
    public static void   Location_Group_API(String S_ID) throws InterruptedException
    {
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " == Location Group API Verification Start==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Location group API", BaseAPI + "/location/group/"+S_ID, true,"no_jira" );
        JSONObject json = new JSONObject(API_Response_Body);
        
        //Verify App associated with site
        JSONArray LGroups = json.getJSONArray("locations");
         JSONObject meta = LGroups.getJSONObject(0).getJSONObject("meta");
         if (meta.has("app_name")){
              if(meta.getString("app_name").contentEquals("Boost"))      // Explicitly Boost since its hardcoded in the code.Else we can use appId field from JTT.    
                   { 
                    _t++;
                    _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "App Name : "+meta.getString("app_name") + "\t" + "Boost" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                   }
                  else
                   {
                    _t++;   
                    _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "App Name : "+meta.getString("app_name") + "\t" + "Boost" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                   }   
                }
                else
                {
                    _t++;
                    _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "No App Name field found" + "\t" + "-" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                }
         
         //Verify Sector name of site
         String sector_name = json.getJSONObject("meta").getString("sector_name");
         if(sector_name.equalsIgnoreCase("Chartwells"))
           { 
            _t++;  
            _p++; EX += _t + "\t" + "Found-as expected" + "\t" + "Sector : "+sector_name + "\t" + "Chartwells" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }
          else
           {
            _t++;   
            _f++; EX += _t + "\t" + "Not Found - expected" + "\t" + "Sector : "+sector_name + "\t" + "Chartwells" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
           }   
         EX += " - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " == Location Group API Verification End==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        
    }//End of Location_Group_API
    
    public static void Verify_station_data_after_refresh(String B_ID) throws InterruptedException
    {
        EX += "\n - " + "\t" + " ===START====" + "\t" + " ===== " + "\t" + " ==  API Verification on Refresh START ==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r";
        
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Public API", BaseAPI + "/config/public/"+B_ID, true,"no_jira" );
        String Public_response_Before = API_Response_Body;
    
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Private API", BaseAPI + "/config/"+B_ID, true,"no_jira" );
        String Private_response_Before = API_Response_Body;
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Location Brand API", BaseAPI + "/location/brand/"+B_ID, true,"no_jira" );
        String Brand_response_Before = API_Response_Body;
        
        TWeb.Refresh("Refresh Page", "no_jira");
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        Thread.sleep(500);  
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Public API", BaseAPI + "/config/public/"+B_ID, true,"no_jira" );
        String Public_response_After = API_Response_Body;
    
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Brand Private API", BaseAPI + "/config/"+B_ID, true,"no_jira" );
        String Private_response_After = API_Response_Body;
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call Location Brand API", BaseAPI + "/location/brand/"+B_ID, true,"no_jira" );
        String Brand_response_After = API_Response_Body;
        
        if(Public_response_Before.equals(Public_response_After))
        { // Print Pass 
            _t++;
          _p++; EX += _t + "\t" + "Public Api call response equal after Refresh" + "\t" + "API Response equal" + "\t" + "API response equal" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        else
        {
          _t++;
          _f++; EX += _t + "\t" + "Public Api call response different after Refresh" + "\t" + "Unequal API response" + "\t" + "Unequal API response" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        if(Private_response_Before.equals(Private_response_After))
        { // Print Pass 
            _t++;
          _p++; EX += _t + "\t" + "Private Api call response equal after Refresh" + "\t" + "API Response equal" + "\t" + "API response equal" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        else
        {
          _t++;
          _f++; EX += _t + "\t" + "Private Api call response different after Refresh" + "\t" + "Unequal API response" + "\t" + "Unequal API response" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        if(Brand_response_Before.equals(Brand_response_After))
        { // Print Pass 
            _t++;
          _p++; EX += _t + "\t" + "Brand Api call response equal after Refresh" + "\t" + "API Response equal" + "\t" + "API response equal" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        else
        {
          _t++;
          _f++; EX += _t + "\t" + "Brand Api call response different after Refresh" + "\t" + "Unequal API response" + "\t" + "Unequal API response" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
       EX += "\n - " + "\t" + " ===END====" + "\t" + " ===== " + "\t" + " ==  API Verification on Refresh END ==" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r";
          
    }
    
}
