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
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_brand_new {
    public static void run(boolean NEW_SITE) throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);                  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Sites page URL", "no_jira"); 
            if (FAIL) { return;} 
                  
        // <editor-fold defaultstate="collapsed" desc="Existing Site and Unit > Select"> 
        // Select "New Auto Site XXXXXX" for Add Station
        String ADD_TO_SITE = SITE;
//        if(NEW_SITE){
//            ADD_TO_SITE = "New Auto Site " + New_ID;
//        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira"); 
                if (FAIL) { return;}
                if(t.contains("All")){ 
                    T_Index = i; 
                }
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", ADD_TO_SITE, false, "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + ADD_TO_SITE + "']", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);           
        // </editor-fold> 

        // <editor-fold defaultstate="collapsed" desc="Add Station">    
        Thread.sleep(1000); 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Button 'Add Station' click", "xpath", "//*[contains(text(), 'ADD STATION')]","no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500);            
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Add Station setup Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.List_L2("Add Station setup Group Count", "xpath", "//div[starts-with(@id, 'toc-')]", "no_jira");             
            if (FAIL) { return;} 
            
        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            _t++; TWeb.Element_Attribute(" === Station setup Navigation >>>", L0.get(i), "textContent", "no_jira");
                if (FAIL) return;
            String CHOICE = t; 
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click '" + CHOICE + "'", L0.get(i), "no_jira"); 
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
                        //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(T_Index));  
                        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Group " + SECTOR, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Group " + SECTOR, L1.get(T_Index), "no_jira");
                            if (FAIL) { return;} 
                    } else{
                        return;
                    } 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click '" + t + "'", L0.get(i), "no_jira"); // === invisible DEBUG
                        if (FAIL) return;
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
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Global Menus Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
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
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click '" + t + "'", L0.get(i), "no_jira"); 
                        if (FAIL) return;
                        Thread.sleep(1000);
                    // ============================== ^^^ Menu Assignation
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Station Name'", "xpath", "//label[contains(text(), 'Station Name')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Name", "css", "[aria-label='Station Name']", "Add Station " + New_ID, false, "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Station Location Description Click", "xpath", "//label[contains(text(), 'Location Description')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Location Description", "css", "[aria-label='Station Location Description']", "Penthouse " + New_ID, false, "no_jira"); 
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
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Tax Rate Click", "xpath", "//label[contains(text(), 'Tax Rate')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Tax Rate", "css", "[aria-label='Tax Rate']", "1.5", false, "no_jira"); 
                        //if (FAIL) { return;}                         
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
                        if (FAIL) { return;}                       
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
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Cancel 'DISABLE' text", e2, "no_jira");
                        if (FAIL) { return;}                         
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'DISABLE' Cancel", e2, "no_jira");
                        if (FAIL) { return;} 
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Timeslot Length Click", "xpath", "//label[contains(text(), 'Timeslot Length')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Timeslot Length", "css", "[aria-label='Timeslot Length (minutes)']", "12", false, "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Average Prep Length Click", "xpath", "//label[contains(text(), 'Average Prep Length')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Average Prep Length", "css", "[aria-label='Average Prep Length (minutes)']", "14", false, "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Customers Per Slot Click", "xpath", "//label[contains(text(), 'Customers Per Slot')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Customers Per Slot", "css", "[aria-label='Customers Per Slot']", "2", false, "no_jira"); 
                        if (FAIL) { return;}                     
                        
                    _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find 'ASAP Pickup' checkbox", L2, i, "xpath", ".//input[@role='checkbox']", "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("ASAP Pickup checkbox Click", e1, "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Input 'ASAP Pickup theshold' Click", "xpath", "//label[contains(text(), 'ASAP time threshold')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter ASAP time threshold", "css", "[aria-label='ASAP time threshold']", "2", false, "no_jira"); 
                        if (FAIL) { return;}                    
                    break;
                case "Delivery Details":     
                    _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find Setup Delievery > Yes", L2, i, "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Setup Delievery > Yes Click", e1, "no_jira"); 
                        if (FAIL) { return;}  
                        
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Timeslot Type dropdown Click", "xpath", "//*[contains(text(), 'Automatic')]", "no_jira"); 
//                        if (FAIL) { return;}     
//                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select 'Automatic'", "xpath", "//*[contains(text(), 'Automatic')]", "no_jira"); 
//                        if (FAIL) { return;}   

                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Label 'Timeslot Length' Count", "xpath", "//label[contains(text(), 'Timeslot Length')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Delivery 'Timeslot Length' Click", L1.get(1), "no_jira"); // 2nd
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Input 'Timeslot Length' Count", "css", "[aria-label='Timeslot Length']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Delivery Timeslot Length", L1.get(1), "11", "no_jira"); // 2nd
                        if (FAIL) { return;}

                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Label 'Customers Per Slot' Count", "xpath", "//label[contains(text(), 'Customers Per Slot')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click Delivery 'Customers Per Slot'", L1.get(1), "no_jira"); // 2nd
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.List_L1("Input 'Customers Per Slot' Count", "css", "[aria-label='Customers Per Slot']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Text_Enter("Enter Delivery 'Customers Per Slot'", L1.get(1), "3", "no_jira"); // 2nd
                        if (FAIL) { return;}  
                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Manage Drop-off Locations'", "xpath", "//a[contains(text(), 'Manage Drop-off Locations')]", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Manage Drop-off' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", "no_jira");
                        if (FAIL) { return;}         
                    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Enter Drop Off Locations'", "css", "[aria-label='Enter Drop Off Locations']", "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Drop Off Locations", "css", "[aria-label='Enter Drop Off Locations']", "Penthouse " + New_ID, false, "no_jira"); 
                        if (FAIL) { return;}    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click '+'", "xpath", "//button[@class='location-btn v-btn v-btn--depressed theme--light primary']", "no_jira"); 
                        if (FAIL) { return;}                                                              
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Button 'Save' Count", e1, "xpath", ".//div[text()='save']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Drop Off Locations 'Save' Click", L1.get(0), "no_jira"); // 1st ?
                        if (FAIL) { return;}    
                     break;
                case "Scan & Go Setup":  
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Enable Scan & ...'", "Enable Scan & Go?", true,"no_jira"); 
                        if (!FAIL) { 
                            //
                        }                    
                    break;
                case "Assign Menus":
                    _t++; Thread.sleep((long) sleep); TWeb.List_L3("Menu 'Button' Count", "xpath", "//button[@class='ml-0 pl-0 v-btn v-btn--flat theme--light']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click 'IMPORT MENU'", L3.get(1), "no_jira"); // index 1 > 2nd button - Import
                        if (FAIL) { return;} 
                    //Thread.sleep(1000);
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Import options...", "css", "[aria-label='Location Stations']", "no_jira"); 
                        if (FAIL) { return;}                        
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Location Station drop-down", "css", "[aria-label='Location Stations']", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Location Station' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Location Station Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
                        if(L1.size() > 0) {
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Attribute("Last Location Station", L1.get(L1.size() - 1), "textContent", "no_jira");
                                if (FAIL) { return;}                            
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select Location Station", L1.get(L1.size() - 1), "no_jira");
                                if (FAIL) { return;}
                            Thread.sleep(500);
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Menus drop-down", "css", "[aria-label='Menus']", "no_jira"); 
                                if (FAIL) { return;}
                            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find 'Menus' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                                if (FAIL) { return;}
                            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menus Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
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
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open Menu Name drop-down", "css", "[aria-label='Menu Name']", "no_jira"); 
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
                            F += _t + " > " + "Add Station > Assing Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                            EX += " - " + "\t" + "Add Station > Assign Menus" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";                           
                        }
                    break;
                case "Integration Type": 
                    _t++; Thread.sleep((long) sleep); TWeb.List_Child_E1_By_Path("Find Setup KDS > Yes", L2, i, "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", "no_jira"); 
                    if (!FAIL) { 
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Setup KDS > Yes Click", e1, "no_jira"); 
                            if (FAIL) { return;}   
                            Thread.sleep(1000);
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'KDS Device Email'", "xpath", "//*[contains(text(), 'KDS Device Email')]", "no_jira"); 
                            if (!FAIL) {                        
                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter KDS Device Email", "css", "[aria-label='KDS Device Email']", ADMIN_ID, false, "no_jira"); 
                                    if (FAIL) { return;} 

                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'KDS Admin Passcode'", "xpath", "//*[contains(text(), 'KDS Admin Passcode')]", "no_jira"); 
                                    if (FAIL) { return;}                        
                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter KDS Admin Passcode", "css", "[aria-label='KDS Admin Passcode']", "1459", false, "no_jira"); 
                                    if (FAIL) { return;}

                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Station Phone Number'", "xpath", "//label[contains(text(), 'Station Phone Number')]", "no_jira"); 
                                    if (FAIL) { return;}                                     
                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Station Phone Number", "css", "[aria-label='Station Phone Number']", "9025550321", false, "no_jira"); 
                                    if (FAIL) { return;}

                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Message On...'", "xpath", "//*[contains(text(), 'Message On Receipt')]", "no_jira"); 
                                    if (FAIL) { return;}                                                           
                                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Message On Receipt", "css", "[aria-label='Message On Receipt (Thanks for Ordering) ']", "Thanks for Auto Ordering", false, "no_jira"); 
                                    if (FAIL) { return;}
                                _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Allow ... Refunds'", "Allow for KDS Refunds", true,"no_jira");     
                                    if (FAIL) { return;}
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
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Calorie Disclaimer'", "Calorie Disclaimer", true,"no_jira"); 
                        if (!FAIL) { 
                            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Check 'Display Calories", "css", "[aria-label='Display Calories']", "no_jira");                          
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Requires Promo Exemptions...'", "Menu Requires Item Promo Exemptions:", true,"no_jira");
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Requires Item PLU's...'", "Menu Requires Item PLU's:", true,"no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Showcase Items", "Showcase Items:", true,"no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Local Item Description Edits'", "Allow Local Item Description Edits:", true,"no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Local Menu Images'", "Allow Local Menu Images:", true,"no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...Menu Calories Edits...'", "Allow Local Menu Calories Edits:", true,"no_jira"); 
                            _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '...App Item Naming'", "Allow In App Item Naming:", true,"no_jira"); 
                        }
                    break;                      
                case "Payment ID":  
                    
                    break;
                case "Meal Plan":  
                    
                    break;
                case "Loyalty Program":  
                    
                    break;
                case "Payment Method Exclusion":  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Method Exclusion section", "id", "toc-payment-exclusions", "no_jira"); 
                        if (FAIL) { return;}                    
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Find 'Payment Methods' options", e1, "xpath", ".//div[@class='v-input--selection-controls__input']", "no_jira");             
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Credit Card'", "Credit Card", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Apple Wallet'", "Apple Wallet", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Google Wallet'", "Google Wallet", true,"no_jira"); 
                        if (FAIL) { return; }                    
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Meal Plans'", "Meal Plans", true,"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Excluded tenders'", "Excluded tenders", true,"no_jira"); 
                        if (FAIL) { return; } 
                    if(L1.size() > 0){
                        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Check/Exclude last method", L1.get(L1.size() -1), "no_jira");
                            if (FAIL) { return;}              
                    }
                    break;
                case "Web Ordering":  
                    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Web Ordering section", "id", "web-order", "no_jira"); 
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

        // <editor-fold defaultstate="collapsed" desc="Add Station > Hours">   
        _t++; TWeb.Move_to_Element_By_Path("Scroll to New Brand data row", "xpath", "//td[contains(text(), '" + "Add Station " + New_ID + "')]", "no_jira");        
            if (FAIL) { return;} 
        _t++; TWeb.Element_By_Path_Click("Click 'New Brand' Name", "xpath", "//*[contains(text(), 'Add Station " + New_ID + "')]","no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait 'Add a new Station' page", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
            if (FAIL) { return;}  // ====================== L0 ^^^ =============================================================================  
         for (int i = 0; i < L0.size(); i++) {     
            _t++; TWeb.Element_Text("New Brand Setup Tab >>>>", L0.get(i), "no_jira"); 
         }
         _t++; TWeb.Element_Click("Click 'Menu' Tab", L0.get(0), "no_jira");
            if (FAIL) { return;} 
            Thread.sleep(500);           
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
        Thread.sleep(500);
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
//            _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_Element("Scroll to Menu " + GL_MENU, L2.get(T_Index), "no_jira");
//                if (FAIL) { return;} 
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
            Thread.sleep(500);     
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
                _f++;
                F += _t + " > " + "Add Station > Schedule Menu" + " > " + "Add" + " > " + "No Available Menus" + "\r\n";
                EX += " - " + "\t" + "Add Station > Schedule Menu" + "\t" + "Add" + "\t" + "No Available Menus" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";                           
                return;
            }
        // </editor-fold>    
    }
}
