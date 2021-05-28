/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import A.TWeb;
import static A.A.*;
import static AP3.AP3.*;

/**
 *
 * @author Oleg.Spozito
 */
public class AP3_sales_reporting_for_hidden_stations {

    public static void run() throws InterruptedException {
         String storeBusinessUnit="";
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(500);
        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Click("Drawer > Sites Click", "xpath", "//div[contains(text(),'Sites')]", "no_jira");
        if (FAIL) {
            return;
        }
        _t++;
        Thread.sleep(200);
        TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, "no_jira");
        if (FAIL) {
            return;
        }
        _t++;
        TWeb.Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]", "no_jira");
        if (FAIL) {
            return;
        }

        _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        System.err.println(t);
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open drop-down for On Site Product selection", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", " //div[@class='v-select-list v-card theme--light']/div[1]/div[1]/a[1]/div[1]/div[1] [contains(text(),'All')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
      }
        //This portion of code will exicute if On site product = "All"
        if (t.equals("All")) {
                _t++;

                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
                if (FAIL) {
                    return;
                }
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Get Site name after search result", "xpath", "/html[1]/body[1]/div[1]/div[33]/main[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]", "no_jira");
                if (FAIL) {
                    return;
                }

                if (t.isEmpty() && t.equals("")) {
                    System.err.println("Selected site from JTT not found in site list");
                } else if (t.equals(SITE)) {
                
               
                Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", "no_jira");
                TWeb.Element_By_Path_Text("Get Business Unit search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]//td[7]//span[1]", "no_jira");
                System.err.println("ss"+t);
                storeBusinessUnit=t.toString();
                    
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Click("Click on Site", "xpath", "//table[@class='v-datatable v-table theme--light']/tbody/tr[1][@class='clickable']", "No Jira");
                 if (FAIL) {return;}
                }
                
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Validate selected site header", "xpath", "//div[@class='title-brand clickable']//div[@class='H3-Primary-Left']", "no_jira");
                if (FAIL) {
                    return;
                }

                _t++;
                Thread.sleep((long) sleep);
                TWeb.List_L0("Station row Count", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr", "no_jira");
               
                //Validate if all Stations are hidden in application
                for (int row = 1; row <= L0.size(); row++) {
                    _t++; Thread.sleep((long) sleep);
                    TWeb.Element_By_Path_Attribute("Visibility Status", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr["+row+"]/td[6]//div[@class='v-input__control']//div[@class='v-input--selection-controls__input']/i", "className", "no_jira");
                    if (FAIL) {return;} System.err.println("Css class"+t);
                   if(t.trim().equals("v-icon mdi mdi-eye theme--light")){
                       System.out.println("Skipped");
                        _t++;Thread.sleep((long) sleep);
                        TWeb.Element_By_Path_Click("Hide in App", "xpath", "//div[@class='v-table__overflow']//table[@class='v-datatable v-table theme--light']/tbody/tr["+row+"]/td[6]//div[@class='v-input__control']", "no_jira");
                   }
                }     
              _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
             if (FAIL) { return;} 
              _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Sales Reporting' Click", "xpath", "//*[contains(text(), 'Sales Reporting')]", "no_jira"); 
             if (FAIL) { return;} 
            _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira");
            if (FAIL) { return;}                    
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
              if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}    
            }  
         _t++;
        Thread.sleep((long) sleep);
        TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
        if (FAIL) {
            return;
        }
        System.err.println(t);
        if (t != "All") {
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Open drop-down for On Site Product selection", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty theme--light']//div[@class='v-select__selections']//div[@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Click("Select All from On Site Product from drop-down", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list theme--light']//div[contains(text(),'All')]", "no_jira");
            if (FAIL) {
                return;
            }
            _t++;
            Thread.sleep((long) sleep);
            TWeb.Element_By_Path_Text("Validate Production app", "xpath", "//div[@class='v-input v-text-field v-text-field--single-line v-text-field--solo v-text-field--enclosed v-select v-input--is-label-active v-input--is-dirty v-input--is-focused theme--light primary--text']/div[1][@class='v-input__control']/div[1]/div[1]/div[1]/div[1][@class='v-select__selection v-select__selection--comma']", "no_jira");
            if (FAIL) {
                return;
            }
      }
           if (t.equals("All")) {
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
                if (FAIL) {
                    return;
                }
                
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Element_By_Path_Text("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody//tr[1]//td[1]", "no_jira");
                      
               
                if(t.equals(SITE)) {
                    
                _t++;
                Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Get Site name after search result", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
                TWeb.Element_By_Path_Click("Click on selected site", "xpath", "//table[@class='v-datatable v-table theme--light']//tbody/tr[1]", "no_jira");
                if (FAIL) {
                    return;
                }       
                   
                
                
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-card v-card--flat v-sheet theme--light']//div[1][@class='H6-Selected-On-Surface-Medium-Emphasis-Center']", "no_jira");
                TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//body/div[@id='operator']/div[@class='application--wrap']/main[@class='v-content admin_content']/div[@class='v-content__wrap']/div[@class='container grid-list-xl']/div[@class='layout']/div[@class='flex xs12']/div[@class='v-tabs']/div[@class='v-window']/div[@class='v-window__container']/div[1]/div[1]/div[2]", "no_jira");
                    System.err.println("No da"+t);
                  if (FAIL) {
                    return;
                } 
                
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", "no_jira");
                TWeb.Element_By_Path_Click("Click on selected site", "xpath", "//*[@class='flex shrink']/button[@class='v-btn v-btn--flat theme--light']", "no_jira");
                if (FAIL) {return;}   
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Wait_For_Element_By_Path_Visibility("Filter drawer should visible", "xpath", "//*[@class='v-navigation-drawer v-navigation-drawer--fixed v-navigation-drawer--open v-navigation-drawer--right v-navigation-drawer--temporary theme--light']", "no_jira");
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
                TWeb.Element_By_Path_Text("Copy Business Unit number", "xpath", "//*[@class='v-list theme--light']//div[2][@class='v-list__tile__content']//div[1][@class='v-list__tile__title']", "no_jira");
                    System.err.println(t.replace("Unit ", ""));
                    
                if(storeBusinessUnit.equals(t.replace("Unit ", "")))
                {
                   
                 _t++; Thread.sleep(200);
                TWeb.Element_By_Path_Click("Select Business Unit", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
               Thread.sleep(200); 
                if (FAIL) { 
                 TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
                 TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//*[@class='v-input__slot']//*[@class='v-input--selection-controls__input']", "no_jira");
                }
                
                _t++; Thread.sleep(200); 
                TWeb.Element_By_Path_Click("Click outside drawer", "xpath", "//*[@class='v-overlay v-overlay--active']", "no_jira");
                if (FAIL) { return;}
                
                _t++;Thread.sleep((long) sleep);
                TWeb.Element_By_DisplayCheck("Filter element should visible", "xpath", "//*[@class='v-card v-card--flat v-sheet theme--light']//div[1][@class='H6-Selected-On-Surface-Medium-Emphasis-Center']", "no_jira");
                TWeb.Element_By_Path_Text("Click on selected site", "xpath", "//body/div[@id='operator']/div[@class='application--wrap']/main[@class='v-content admin_content']/div[@class='v-content__wrap']/div[@class='container grid-list-xl']/div[@class='layout']/div[@class='flex xs12']/div[@class='v-tabs']/div[@class='v-window']/div[@class='v-window__container']/div[1]/div[1]/div[2]", "no_jira");
                    System.err.println("No da"+t);
                if (FAIL) {   
                    _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Check if report is available", "No reports available for selected units", true,"no_jira");
                }
                
                if(t.equals("No reports available for selected units"))
                {
                    
                }
                }
                
                if (FAIL) {return;}
                
                
                } else{
                   System.err.println("Selected site from JTT not found in site list");
                }
            
                   
                } else{
                   System.err.println("Site header don not matches with selected site");
                }
           
    }
}
