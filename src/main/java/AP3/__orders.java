/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
import java.time.LocalDateTime;
/**
 *
 * @author Oleg.Spozito
 */
public class __orders {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Orders' Click", "xpath", "//*[contains(text(), 'Orders')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
//            
//        _t++; Thread.sleep((long) sleep); T.Navigate_to_URL("Navigate to 'Orders'", url + "/#/orders","no_jira");             
//            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Page_URL("Orders page URL", "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light menuable__content__active
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");              
                if (FAIL) { return;}
                if(t.trim().startsWith(app)){ T_Index = i; }
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select " + app, L1.get(T_Index), "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Not Found' notification", "No matching records found", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; T.Visible_Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;}                                                                                         // v-datatable__progress << 'v-progress-circular'
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Brands load", "xpath", "//*[@class='H6-Selected-On-Surface-Medium-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.List_L0("Brands Count", "xpath", "//div[contains(@class,'clickable v-card')]", "no_jira");             
            if (FAIL) { return;}
            if(L0.isEmpty()){
                EX += " - " + "\t" + "Orders - Brands Count" + "\t" + app + "\t" + SITE + "\t" + "FAIL" + "\t" + "No Brands";
                EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";
            }else{            
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Child_Attribute("Brand " + (i+1) + " Name", L0.get(i), "tagName", "span", "textContent", "no_jira");             
                        if (FAIL) { return;}   
                    if(t.trim().startsWith(BRAND)){
                        T_Index = i;
                    }
                    _t++; T.Element_Child_Attribute("Brand " + (i+1) + " Logo/Image", L0.get(i), "xpath", ".//div[contains(@class,'v-image__image v-image__image--cover')]", "style", "no_jira");             
                        if (FAIL) { return;}     
                }         
            }
        _t++; T.Element_Click("Click Brand", L0.get(T_Index),"no_jira");  
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'v-datatable__progress')]", "no_jira");
            if (FAIL) { return;}
            
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Search for...'", "Search for anything", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Order type'", "Order Type", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Export", "Export", true,"no_jira"); 
            if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Default Order Type", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Date picker", "css", "[aria-label='Date']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Default Order Date", "xpath", "//div[contains(@class, 'v-picker__title__btn v-date-picker-title__date v-picker__title__btn--active')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Close Date picker", "css", "[aria-label='Date']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open Order Type combobox", "css", "[aria-label='Order Type']", "no_jira"); 
            if (FAIL) { return;}                                                          
        _t++; Thread.sleep((long) sleep); T.List_L1("Order Type Count", "xpath", "/html/body/div/div[3]/div/div/div", "no_jira");             
            if (FAIL) { return;}
            for (int i = 1; i <= L1.size(); i++) {
                _t++; T.Element_By_Path_Text("Order Type (index " + i + ")", "xpath", "/html/body/div/div[3]/div/div/div[" + i + "]/a/div/div",  "no_jira");             
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Select 'All'", "xpath", "/html/body/div/div[3]/div/div/div[" + 1 + "]/a/div/div", "no_jira"); 
            if (FAIL) { return;} 
            
            //<editor-fold defaultstate="collapsed" desc="Pagination">   
            _t++; T.Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", "no_jira");
            if (FAIL) { return;}

            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                                                                      //  v-menu__content theme--light v-menu__content--auto menuable__content__active
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Rows per page Value (index " + i + ")", L1.get(i),  "no_jira");
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira");
            if (FAIL) { return;}
            //</editor-fold>            
            
        _t++; Thread.sleep((long) sleep); T.List_L0("Orders Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            _t++; T.Element_Text("Order Data Headers", L0.get(6), "no_jira");  
            
        if(L0.size() > 8)  {
            T_Index = 0;
            for (int i = 8; i < L0.size(); i++) {
                _t++; T.Element_Text("Order Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
                if(t.equalsIgnoreCase("No orders found")){
                    T_Index = -1;
                }
            }
            if(T_Index != -1){  
                _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find child 'td' element", L0, 8, "tagName", "td", "no_jira"); // ====== index 8 ===  
                    if (FAIL) { return;} 
                _t++; T.Element_Click("Click top Order",e1, "no_jira");  
                    if (FAIL) { return;} 
//                _t++; T.Clickable_Element_By_Path_Click("Click top Order", "className", "clickable", "no_jira");  // ====== index 8 ===  OPENS Resent Updates ~???
//                    if (FAIL) { return;} 
//                _t++; T.Element_Click("Click top Order",L0, "L0", 8,"no_jira");  // ====== index 8 ===  OPENS Resent Updates ~???
//                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Order #YYYY text", "xpath", "//div[contains(@class, 'v-card__title H4-Secondary-Center v-card__title--primary')]", "no_jira"); 
                    if (FAIL) { return;}                                                                    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 1 text", "xpath", "//div[contains(@class, 'v-tabs__div')][1]", "textContent", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Tab 2 text", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "textContent", "no_jira");
                    if (FAIL) { return;}        
                _t++; Thread.sleep((long) sleep); T.List_L1("Order Items Count", "xpath", "//table[contains(@class,'orderTable')]", "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; T.Element_Attribute("Order Items Text", L1.get(i), "textContent", "no_jira");             
                    } 
                _t++; Thread.sleep((long) sleep); T.List_L1("Order Details Count", "xpath", "//div[@class='flex shrink']", "no_jira");             
                    if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; T.Element_Attribute("Order Items Text", L1.get(i), "textContent", "no_jira");           
                    }
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Raw' tab", "xpath", "//div[contains(@class, 'v-tabs__div')][2]", "no_jira"); 
                    if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); T.List_L1("Nodes 'Toggle' Count", "xpath", "//div[contains(@class, 'jv-node toggle')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Nodes 'Key' Count", "xpath", "//span[contains(@class, 'jv-key')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Nodes 'Item String' Count", "xpath", "//span[contains(@class, 'jv-item jv-string')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Nodes 'Item Number' Count", "xpath", "//span[contains(@class, 'jv-item jv-number')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Nodes 'Item Object' Count", "xpath", "//span[contains(@class, 'jv-item jv-object')]", "no_jira");             
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Order #YYYY 'Close' text", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Close Order #YYYY", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')]", "no_jira"); 
                    if (FAIL) { return;}                 
            }
        }     
    }  
}
