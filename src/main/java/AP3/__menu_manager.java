/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import java.time.LocalDateTime;
/**
 *
 * @author Oleg.Spozito
 */
public class __menu_manager {
    public static void run() throws InterruptedException { 
//        DH menu IDs; see https://teamideaworks.atlassian.net/browse/AUT-253
//        A3lvmE18ORC7zv1GkPG - Brand: PIZZA PIZZA, Site: Sheridan College Davis B & C Wing, Unit: Sheridan College Davis C-Wing
//        z03ykAm5JNszPA7Ne3X - Brand: Tim Hortons, Site: Sheridan College Davis B & C Wing, Unit: Sheridan College Davis C-Wing
//        NWEJgN87Q3Sw46JaQ1Q - Brand: PARAMOUNT,   Site: Fennel, Unit: Mohawk College
        String Menu_ID = "";        
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > 'Menu Manager' Click", "xpath", "//*[contains(text(), 'Menu Manager')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
             
        // <editor-fold defaultstate="collapsed" desc="Group Selection">  
        EX += " - " + "\t" + " === MM Sector Selection " + "\t" + " ===== " + "\t" + " == Sector Selection Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";  
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.Page_URL("Menu Manager page URL", "no_jira"); 
            if (FAIL) { return;}   
            
        _t++; T.Find_Text("Button 'Go to Menu' text", "Go to menus", true,"no_jira");   
            if (FAIL) { return;}
        _t++; T.Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled","no_jira");
            if (FAIL) { return;}
            
        // =========================================== Group Selection
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", "no_jira");
            if (FAIL) return;   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", GROUP, "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + GROUP + "')]", "no_jira"); 
                if (FAIL) { return;}             
//        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Group' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active v-autocomplete__content')]", "no_jira");
//            if (FAIL) { return;} 
//        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Groups Count #1", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
//            if (FAIL) { return;} 
//            T_Index = L1.size();
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(L1.size() - 1));
//            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Last Group", L1.get(L1.size() - 1), "no_jira");
//                if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Groups Count #2", e1, "xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
//            if (FAIL) { return;} 
//
//        int SC = 2;    
//        while(T_Index < L1.size()) {
//            T_Index = L1.size();
//            SC++;
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(L1.size() - 1));
//            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to last Group, L1.get(L1.size() - 1), "no_jira");
//                if (FAIL) { return;}
//            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Groups Count #" + SC, e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");             
//                if (FAIL) { return;} 
//        }   
//        T_Index = -1;
//        for (int j = 0; j < L1.size(); j++) {
//            if(ALL_DATA){
//                _t++; T.Element_Text("Group Name", L1, "L1", j, "no_jira");  
//            }
//            if(L1.get(j).getText().trim().equals(GROUP)){
//                T_Index = j;
//            }
//        }
//        if(T_Index > -1){
//            //((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", L1.get(T_Index));  
//            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Group " + GROUP, L1.get(T_Index), "no_jira");
//                if (FAIL) { return;}
////            _t++; Thread.sleep((long) sleep); T.Element_Click("Select Group " + GROUP, L1, "L1", T_Index, "no_jira");
//                if (FAIL) { return;} 
//        } else{
//            return;
//        } 
        _t++; T.Clickable_Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
            //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "no_jira"); 
                if (FAIL) { return;}
        // ========================================= Group Selection ^^^^
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Page_URL("Menu > " + GROUP + " page URL", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,"no_jira");   
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; T.Find_Text("Fund 'Search...' text", "Search Menus", true,"no_jira");   
            if (FAIL) { return;}  
        EX += " - " + "\t" + " === MM Sector Selection " + "\t" + " ===== " + "\t" + " == Sector Selection End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>           
        // <editor-fold defaultstate="collapsed" desc="Training Video">
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Trainig Video Icon Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-help-circle')]", "no_jira"); 
            if (FAIL) { return;}             
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("Swith to Video Player", "tagName", "iframe", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Player load", "className", "play-icon", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Video Title", "xpath", "//header[contains(@class, 'vp-title-header')]", "textContent","no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Play Click", "className", "play-icon", "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("Back to Site page", "defaultContent", "N/A", "no_jira");
            if (FAIL) { return;}      
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Video Player Close Click", "xpath", "//i[contains(@class, 'v-icon mdi mdi-close')]", "no_jira"); 
            if (FAIL) { return;} 
        // </editor-fold>        
        // <editor-fold defaultstate="collapsed" desc="Global Modifiers">  
        EX += " - " + "\t" + " === MM Global Modifiers " + "\t" + "New ID: " + "\t" + " == Global Modifiers Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); T.List_L2("Menus Count", "xpath", "//div[@class='layout hover align-baseline']", "no_jira");             
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L2.size(); i++) { 
                _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", "no_jira"); 
                if(t.trim().startsWith(GL_MENU)){
                    T_Index = i;
                } 
            }
        if(T_Index > -1){
            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}  
            _t++; T.List_L1("Local Menus count", "xpath", "//div[@class='layout hover indent align-center row wrap']","no_jira");         
                if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {    
                   _t++; T.Element_Attribute("Local Menu (Index " + j + ") Name", L1.get(j), "textContent", "no_jira"); 
                }                  
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find " + GL_MENU + " 'View Global Modifiers Groups' button", L2, T_Index, "xpath", ".//button[@type='button'][2]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Click(" 'View Global Modifiers Groups' Click", e1, "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            //Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load", "tagName", "table", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Page_URL("Current page URL", "no_jira");
            
            //<editor-fold defaultstate="collapsed" desc="Pagination">   
            _t++; T.Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", "no_jira");
                if (FAIL) { return;}
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
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'All'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;}

            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira");
                if (FAIL) { return;}
                if(t.equals("–")){
                    NO_DATA = true;
                }
            _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");
                if (FAIL) { return;}
            //</editor-fold>
            
            _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
                if (FAIL) { return;}
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}  
                }                          

            // ================ New Group
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'NEW GROUP'", "xpath", "//*[contains(text(), 'new group')]", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Group Name", "css", "[aria-label='Modifier Group Name']", "New Group " + New_ID, "no_jira");
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Label In App", "css", "[aria-label='Label In App']", "Label " + New_ID , "no_jira");
                if (FAIL) { return;}  
                
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Rules fragment", "xpath", "//div[@class='layout size-line row wrap align-baseline']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_E2("Find 'Rules' drop-down", e1, "xpath", ".//div[@class='v-input__icon v-input__icon--append']", "no_jira");
                if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); T.Element_Click(" 'Rules' combo-box open Click", e2, "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_E2_Find("Find Rules list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", "no_jira");
                if (FAIL) { return;}                                                                                             
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Rules Count", e2,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Tax Tag (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                    if(t.contains("Maximum")){ 
                        T_Index = i; 
                    }
                } 
                if(T_Index > -1){
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Maximum'", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Child_E2("Find 'number' input", e1, "xpath", ".//input[@type='number']", "no_jira");
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_Text_Enter("Enter 'Max' 12", e2, "12", "no_jira"); 
                        if (FAIL) { return;} 
                    _t++; T.Find_Text("Fund 'Error...' text", "There must be at least 12 modifiers", true,"no_jira");   
                        if (FAIL) { return;} 
                    _t++; T.Element_Text_Clear(" 'Max' 12 Clear", e2,  "no_jira"); 
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Element_Text_Enter("Enter 'Max' 1", e2, "1", "no_jira"); 
                        if (FAIL) { return;} 
                } 

            // ================ Add New Modifiesr(s) 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click  'Add MODIFIER'", "xpath", "//*[contains(text(), 'Add MODIFIER')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira"); 
                if (FAIL) { return;}   
                
            _t++; Thread.sleep((long) sleep); T.List_L0("Modifier Name Count", "css", "[aria-label='Item Name']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text_Enter("Modifier Name (" + i + ") Enter", L0.get(i), "Mod " + i + " " + New_ID, "no_jira");             
                    if (FAIL) { return;}
                } 
            _t++; Thread.sleep((long) sleep); T.List_L0("Price Count", "css", "[aria-label='Price']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text_Enter("Price (" + i + ") Enter", L0.get(i), Integer.toString(i+2) + ".25", "no_jira");             
                    if (FAIL) { return;}
                }            
            _t++; Thread.sleep((long) sleep); T.List_L0("Calories Count", "css", "[aria-label='Calories']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text_Enter("Calories (" + i + ") Enter", L0.get(i), "10" + Integer.toString(i*2), "no_jira");             
                    if (FAIL) { return;}
                }               
            _t++; Thread.sleep((long) sleep); T.List_L0("PLU: Count", "css", "[aria-label='PLU:']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Text_Enter("PLU: (" + i + ") Enter", L0.get(i), "60010" + Integer.toString(i*2), "no_jira");             
                    if (FAIL) { return;}
                }  
            _t++; Thread.sleep((long) sleep); T.List_L0("Chit # Count", "css", "[min='0']", "no_jira");             
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Click("Chit # (" + i + ") Click", L0.get(i), "no_jira");             
                    if (FAIL) { return;}
                    _t++; T.Element_Text_Enter("Chit # (" + i + ") Enter", L0.get(i), Integer.toString(i+1), "no_jira");             
                    if (FAIL) { return;}
                }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Tax Tags dropdown Click Open", "css", "[aria-label='Tax Tags']", "no_jira");
                if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Tax Tags list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                             
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Tax Tags list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Tax Tag (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                    if(t.contains("Prepared")){ 
                        T_Index = i; 
                    }
                } 
                if(T_Index > -1){
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Prepared'", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;}   
                } 
            _t++; Thread.sleep((long) sleep); T.Click_out_of_Visible_Element("Tax Tags dropdown Close", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  "Top",4, 4, "no_jira");
                if (FAIL) { return;}
                    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", "no_jira"); 
              if (FAIL) { return;}     
            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;}                                                                           
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Refresh("Refresh after PUBLISH", "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load", "xpath", "//*[@class='H4-Secondary-Center']", "no_jira"); 
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
   
            _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count after Add Group", "tagName", "tr", "no_jira");             
                if (FAIL) { return;}
                T_Index = -1;  
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                    for (int i = 2; i < L0.size(); i++) {
                        _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                            if(t.trim().contains("New Group " + New_ID)){
                                T_Index = i;
                        }
                    } 
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select New Group", L0.get(T_Index), "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);
//            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait Selected Group page", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "no_jira"); 
//                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Cancel'", "xpath", "//div[contains(text(), 'Cancel')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select New Group Again", L0.get(T_Index), "no_jira");
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.List_L2("Mofifiers Count", "xpath", "//div[@class='layout modifier row wrap align-center']", "no_jira");             
                if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); T.Move_to_Element("Last Mofifier Hover", L2.get(L2.size() - 1), "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 'Delete' Mofifier icon", L2, (L2.size() - 1), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", "no_jira"); 
                    if (FAIL) { return;}      
            _t++; Thread.sleep((long) sleep); T.Element_Click(" 'Delete' Last Mofifier Click", e1, "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click  'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", "no_jira"); 
              if (FAIL) { return;}
                
            // Delete New Group
            if(!NO_DATA && T_Index > -1){
                _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 'Delete' New Group " + New_ID, L0, T_Index, "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", "no_jira"); 
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); T.Element_Click("New Group " + New_ID + " 'Delete' Click", e1, "no_jira"); 
                    if (FAIL) { return;} 
                _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                    if (FAIL) { return;}                                                                            
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count after Delete - Publish", "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}
                }                     
            } else{   
                _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                    if (FAIL) { return;}                                                                           
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                    if (FAIL) { return;} 
                    Thread.sleep(500);
//                _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "no_jira"); 
//                        if (FAIL) { return;}                    
            }
                
            // ======================== Group Copy >>>> 
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
             
            _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count", "tagName", "tr", "no_jira");             
                if (FAIL) { return;}
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}
                }             
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 'Copy' Last Group", L0, (L0.size() - 1), "xpath", ".//i[@class='v-icon mdi mdi-content-copy theme--light']", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Copy' Last Group", e1, "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count after Copy", "tagName", "tr", "no_jira");             
                if (FAIL) { return;}   
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}
                }    
            int S = L0.size(); 
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select Copied Group", L0.get(S-1), "no_jira");
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Copied Group Name Clear", "css", "[aria-label='Modifier Group Name']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter New Copied Group Name", "css", "[aria-label='Modifier Group Name']", "Copied Group " + New_ID, "no_jira");
                if (FAIL) { return;}    
                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click  'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", "no_jira"); 
                if (FAIL) { return;}            
              
            _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count after Copy - Publish", "tagName", "tr", "no_jira");             
                if (FAIL) { return;}
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}
                }  
            if(S == L0.size()){
                // ======================== Copied  Group Delete >>>> 
                _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 'Delete' Copied Group", L0, (S - 1), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", "no_jira"); 
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); T.Element_Click(" 'Delete' Copied Group Click", e1, "no_jira"); 
                    if (FAIL) { return;} 
                _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                    if (FAIL) { return;}                                                                            
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                _t++; Thread.sleep((long) sleep); T.List_L0("Groups Count after Copied Delete - Publish", "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}
                _t++; T.Element_Text("Modifier Group Row Header", L0.get(0), "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    _t++; T.List_TR_TDs("Modifier Group Row Data", L0, i, "no_jira");   
                        if (FAIL) { return;}
                }                   
            }else{
                _t++; _f++;
                EX += " - " + "\t" + "Copy Modifier Group" + "\t" + "Copied after Publish"+ "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            }
            // ======================== New Group Copy ^^^^ End

            // ======================== Modify Group / Modifiers
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 1st Group to modify", L0.get(2), "no_jira"); // 1st > index 2
                if (FAIL) { return;} 
                Thread.sleep(500);
//            _t++; T.Element_By_Path_Text_Select_Copy("Name", "xpath", "//input[@aria-label='Modifier Group Name']", "no_jira"); 
//                if (FAIL) { return;}    
            _t++; T.Element_By_Path_Text_Select_Copy("Label In App", "css", "[aria-label='Label In App']", "no_jira"); 
                if (FAIL) { return;}          
            _t++; T.Element_By_Path_Text_Select_Copy("Group Chit #", "css", "[min='0']", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.List_L2("Modifiers Count", "xpath", "//*[@class='layout modifier row wrap align-center']", "no_jira");             
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Move_to_Element("1st Mofifier Hover", L2.get(0), "no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 1st Mofifier Name input", L2, 0, "xpath", ".//span[@class='Body-1-Black-Medium-Emphasis-Left']", "no_jira"); 
                if (FAIL) { return;}      
            _t++; Thread.sleep((long) sleep); T.Element_Click("1st Mofifier Name Click", e1, "no_jira"); 
                if (FAIL) { return;} 
                
            _t++; T.Element_By_Path_Text_DblClick_Copy("1st Mod Name", "css", "[aria-label='Item Name']", "no_jira"); 
                if (FAIL) { return;}                 
            _t++; T.Element_By_Path_Text_DblClick_Copy("1st Mod Price", "css", "[aria-label='Price']", "no_jira"); 
                if (FAIL) { return;}                  
            _t++; T.Element_By_Path_Text_DblClick_Copy("1st Mod Calories", "css", "[aria-label='Calories']", "no_jira"); 
                if (FAIL) { return;}       
            _t++; T.Element_By_Path_Text_DblClick_Copy("1st Mod PLU", "css", "[aria-label='PLU:']", "no_jira"); 
                if (FAIL) { return;}   
                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'Cancel')]", "no_jira"); 
                if (FAIL) { return;} 
                
            // ===============================================================================================================================  
            _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back"," 'globalmods' page"," 'menu' page", "no_jira"); 
                    //if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}               
                //Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Menu page load", "xpath", "//div[@class='layout hover align-baseline']", "no_jira"); 
                    if (FAIL) { return;}                
        } else {
           _t++; _f++;
           EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        }
        EX += " - " + "\t" + " === MM Global Modifiers " + "\t" + " ===== " + "\t" + " == Global Modifiers End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>       
        // <editor-fold defaultstate="collapsed" desc="Global Menus Add Menu Set">  
        EX += " - " + "\t" + " === MM Global Menus Add Menu Set" + "\t" + " ===== " + "\t" + " == Add Menu Sets Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); T.List_L2("Menus Count", "xpath", "//div[@class='layout hover align-baseline']", "no_jira");             
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) { 
            _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", "no_jira"); 
            if(t.trim().startsWith(GL_MENU)){
                T_Index = i;
            }                
        }
        if(T_Index > -1){
            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}  
            _t++; T.List_L1("Local Menus count", "xpath", "//div[@class='layout hover indent align-center row wrap']","no_jira");         
                if (FAIL) { return;}       
                for (int j = 0; j < L1.size(); j++) {    
                   _t++; T.Element_Attribute("Local Menu (Index " + j + ") Name", L1.get(j), "textContent", "no_jira"); 
                }                  
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find " + GL_MENU + " 'View Global Menus' button", L2, T_Index, "xpath", ".//button[@type='button'][1]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Click(GL_MENU + " 'View Global Menus' Click", e1, "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; T.Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");        
                if (FAIL) { return;}   
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(1000);        
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'ADD MENU SET'", "xpath", "//*[contains(text(), 'add menu set')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(1000); 
            _t++; Thread.sleep((long) sleep); T.List_L0("Menus + 1 Added Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;} 
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find New Menu Set Name input", L0, (L0.size() - 1), "xpath", ".//input[@type='text']", "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_Text_Enter("Enter Added Menu Set Name", e1, "Added " + New_ID, "no_jira"); 
                if (FAIL) { return;} 
            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;}                       
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Added Menu Set Name Click", "xpath", "//*[contains(text(), 'Added " + New_ID + "')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);                
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'No Categories...'", "xpath", "//*[contains(text(), 'No categories found')]", "textContent","no_jira"); 
                if (FAIL) { return;}  

            _t++; T.Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");        
                if (FAIL) { return;}   
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'EDIT'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            //Thread.sleep(2000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Menu List page", "css", "[menu-id]", "no_jira"); 
                    if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.List_L2("Published Menus ID Count", "css", "[menu-id]", "no_jira");             
            _t++; Thread.sleep((long) sleep); T.List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                T_Index = -1;
                Menu_ID = "not_found";
                if(L0.size() == L2.size()){
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        } 
                    }  
                }else{
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                    }                
                    for (int i = 0; i < L2.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        }
                    } 
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                    EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n"; 
                }                 
                
               
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find last 'Added...' > '+'", L0, (L0.size() - 1), "xpath", ".//i[@class='v-icon mdi mdi-plus theme--light']", "no_jira"); 
                if (FAIL) { return;}  
                Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.Element_Click("Last Added Set > '+' Click", e1, "no_jira"); 
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for Category Name field", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
                Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira"); 
                Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("New Category Chit # Click", "css", "[aria-label='Chit #']", "no_jira");
                if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Category Chit #", "css", "[aria-label='Chit #']", "3", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("New Category Name Click", "css", "[aria-label='Enter Category Name']", "no_jira");
                if (FAIL) { return;}            
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Category Name", "css", "[aria-label='Enter Category Name']", "Category " + New_ID, "no_jira");
                if (FAIL) { return;}          
            Thread.sleep(500); 
            // ======== New Item
            _t++; T.Move_to_Element_By_Path("Scroll to 'NEW ITEM' button", "xpath", "//*[contains(text(), 'new item')]", "no_jira");        
                if (FAIL) { return;}   
            Thread.sleep(500);            
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'NEW ITEM' Click", "xpath", "//*[contains(text(), 'new item')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("New Item Name Click", "css", "[aria-label='Item Name']", "no_jira");
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Item Name", "css", "[aria-label='Item Name']", "Item " + New_ID, "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Price Click", "css", "[aria-label='Price']", "no_jira");
                if (FAIL) { return;}                 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Price", "css", "[aria-label='Price']", "1.05", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Calories Click", "css", "[aria-label='Calories']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Calories", "css", "[aria-label='Calories']", "280", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Units Click", "css", "[aria-label='Units']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Units", "css", "[aria-label='Units']", "8", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("PLU Click", "css", "[aria-label='PLU ID']", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter PLU ID", "css", "[aria-label='PLU ID']", "900019", "no_jira");
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Description Click", "css", "[aria-label='Description']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Description", "css", "[aria-label='Description']", "Description " + New_ID, "no_jira");
                if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Tax Tags dropdown Click Open", "css", "[aria-label='Tax Tags']", "no_jira");
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Tax Tags list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}                                                                                             
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Tax Tags list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Tax Tag (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                    if(t.contains("Prepared")){ 
                        T_Index = i; 
                    }
                } 
                if(T_Index > -1){
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Prepared'", L1.get(T_Index), "no_jira");
                        if (FAIL) { return;}   
                } 
                _t++; Thread.sleep((long) sleep); T.Click_out_of_Visible_Element("Tax Tags dropdown Close", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",  "Top",4, 4, "no_jira");
                    if (FAIL) { return;} 
   
            // ======= Add Modifier >>>
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Modifiers 'Add Group' Click", "xpath", "//*[contains(text(), 'Add modifier group')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep(500); T.Element_By_Path_Click("Modifier Name Input Click", "xpath", "//div[@class='v-input v-text-field v-select v-input--is-focused theme--light primary--text']", "no_jira"); 
                if (FAIL) { return;}                                                                                                     
            _t++; Thread.sleep(500); T.Element_E1_Find("Find 'Modifier Groups list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Available Modifier Groups Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Modifier Group (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 1st Group", L1.get(0), "no_jira");
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); T.List_L0("Updated Modifier Group Count", "xpath", "//div[@class='modifier-group']", "no_jira");             
                if (FAIL) { return;}   
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Attribute("Modifier Group (Index " + i + ") Text Content", L0.get(i), "textContent", "no_jira");            
                    if (FAIL) { return;}
                }
            // ======= Add Modifier End ^^^         
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", "no_jira"); 
                if (FAIL) { return;}   

            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}            

            // ======== Delete Last Added
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'EDIT MENU' Click", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Added Menu Set Hover", "xpath", "//*[contains(text(), 'Added " + New_ID + "')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;} 
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");            
                    if (FAIL) { return;}
                }              
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 1), "tagName", "button", "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_Click("Added Menu Set 'dots' Click", L2.get(1), "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira"); 
                    if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  "no_jira");             
                    if(t.contains("Delete")){ T_Index = i; }
                }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Delete'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
                
            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;}  
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            //Thread.sleep(2000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Menu list", "css", "[menu-id]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L2("Published Menus ID Count", "css", "[menu-id]", "no_jira");        
            _t++; Thread.sleep((long) sleep); T.List_L0("Re-Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;}    
                if(L0.size() == L2.size()){
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        } 
                    }  
                }else{
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                    }                
                    for (int i = 0; i < L2.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        }
                    } 
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                    EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n"; 
                }     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
             if (FAIL) { return;} 
        } else {
           _t++; _f++;
           EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        }
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back","MM 'Menu' page","MM 'Sector' page", "no_jira"); 
            //if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
            
        // =================== "Leave without publishing?" Dialog even PUBLISH OK ============ DEBUG    
        _t++; Thread.sleep((long) sleep); T.Text_Found("Find 'Leave...' question", "Leave without publishing?", "no_jira"); 
        if ("Found".equals(t)) {     
            _t++; _f++;
            EX += " - " + "\t" + "Navigate Back after Publish OK" + "\t" + "MM 'Sector' page" + "\t" + "Dialog 'Leave without publishing?'" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            _t++; FAIL = false; T.Find_Text("Find 'Leave...' note", "Changes will be lost if you do not publish.", true,"no_jira"); 
                if (FAIL) { return; }   
            _t++; FAIL = false; T.Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", "no_jira"); 
                if (FAIL) { return; }         
            _t++; FAIL = false; T.Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", "no_jira"); 
                if (FAIL) { return; }     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'LEAVE' Click", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", "no_jira"); 
                if (FAIL) { return;}  
        }            
        //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for MM 'Sector' page", "xpath", "//div[@class='layout hover align-baseline']", "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === MM Global Menus Add Menu Set" + "\t" + " ===== " + "\t" + " == Add Menu Sets End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>   
        
        // <editor-fold defaultstate="collapsed" desc="Global Menus Import">  
        EX += " - " + "\t" + " === MM Global Menus Import" + "\t" + " ===== " + "\t" + " == Global Menus Import Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); T.List_L2("Menus Count", "xpath", "//div[@class='layout hover align-baseline']", "no_jira");             
            if (FAIL) { return;}
        T_Index = -1;
        for (int i = 0; i < L2.size(); i++) { // ============ L2 ======================================================================
            _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L2.get(i), "textContent", "no_jira"); 
            if(t.trim().startsWith(GL_MENU)){
                T_Index = i;
            }                
        }
        if(T_Index > -1){
            _t++; Thread.sleep((long) sleep); T.Scroll_to_Element("Scroll to Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click Menu " + GL_MENU, L2.get(T_Index), "no_jira");
                if (FAIL) { return;}         
       
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find " + GL_MENU + " 'View Global Menus' button", L2, T_Index, "xpath", ".//button[@type='button'][1]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Click(GL_MENU + " 'View Global Menus' Click", e1, "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");        
                if (FAIL) { return;}  
             Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Page_URL("Current page URL", "no_jira");
                //if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.List_L2(GL_MENU + " Global Menus ID Count", "css", "[menu-id]", "no_jira");      
            _t++; Thread.sleep((long) sleep); T.List_L0(GL_MENU + " Global Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");              
                if(L0.size() == L2.size()){
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        } 
                    }  
                }else{
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                    }                
                    for (int i = 0; i < L2.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        }
                    } 
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                    EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n"; 
                }  
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}     

            _t++; Thread.sleep((long) sleep); T.To_Bottom("no_jira"); 
                if (FAIL) { return;}
                Thread.sleep(1000); 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("IMPORT > 'Menu ID' Click", "css", "[aria-label='Menu ID']", "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500); 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Enter Menu ID", "css", "[aria-label='Menu ID']", "NWEJgN87Q3Sw46JaQ1Q"  , "no_jira");
                if (FAIL) { return;}                                                                              //z03ykAm5JNszPA7Ne3X ? >> NWEJgN87Q3Sw46JaQ1Q 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'IMPORT'", "xpath", "//*[contains(text(), 'IMPORT')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for 'IMPORT' result...", "xpath", "//i[@class='v-icon v-icon--link mdi mdi-delete-forever theme--light']", "no_jira"); 
                if (FAIL) { return;}               
            Thread.sleep(1000); 
            _t++; Thread.sleep((long) sleep); T.List_L0("Menus + 1 Imported Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find New Menu Set Name field", L0, (L0.size() - 1), "xpath", ".//input[@type='text']", "no_jira"); 
                if (FAIL) { return;}

            _t++; Thread.sleep((long) sleep); T.Element_Text_Enter("Enter Imported Menu Set Name", e1, "Imported " + New_ID, "no_jira"); 
                if (FAIL) { return;} 
            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;}                       
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(1000);       
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}             
            _t++; T.Move_to_Element_By_Path("Scroll to 'EDIT MENU' button", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");        
                if (FAIL) { return;}   
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}  
                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Imported Menu Set Name Click", "xpath", "//*[contains(text(), 'Imported " + New_ID + "')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}    
            //Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for Set Categories page", "xpath", "//div[contains(@class, 'flex xs12 list-item no-icon')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.List_L2("Imported Set Categories Count", "xpath", "//div[contains(@class, 'flex xs12 list-item no-icon')]", "no_jira");             
                if (FAIL) { return;}  
                
            if(L2.size() > 1){ // Delete last category from Imported if more then 2 categories    
                _t++; Thread.sleep((long) sleep); T.Move_to_Element("Last Category Hover", L2.get(L2.size() - 1), "no_jira"); 
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Find Last Category - dots", L2.get(L2.size() - 1), "tagName", "button", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_Click("Last Category 'dots' Click", L1.get(0), "no_jira");
                    if (FAIL) { return;}   
                    Thread.sleep(1000);
                _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Category Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Category Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                    if (FAIL) { return;}
                    T_Index = -1;
                    for (int i = 0; i < L1.size(); i++) {
                        _t++; T.Element_Text("Category Edit Option (index " + i + ")", L1.get(i),  "no_jira");             
                        if (FAIL) { return;}
                        if(t.contains("Delete")){ T_Index = i; }
                    }
                _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Delete'", L1.get(T_Index), "no_jira");
                    if (FAIL) { return;}               
            }

            _t++; Thread.sleep((long) sleep); T.Element_Click("1st Category Click", L2.get(0), "no_jira");
                if (FAIL) { return;}     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Items' table", "xpath", "//div[@class='v-table__overflow']", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Items Count", e1,"tagName", "tr", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                   _t++; T.Element_Text("Item Row Text", L1.get(i), "no_jira");  
                        if (FAIL) { return;}
                }  
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}   
            // ======== Delete 2nd Item
            if(L1.size() > 3){
                _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 2nd Item 'Delete' icon", L1, 3, "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", "no_jira"); 
                    if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); T.Element_Click(" 'Delete' 2nd Item Click", e1, "no_jira"); 
                    if (FAIL) { return;}     
            }
            // ======== Check Mods // modifier-group
            _t++; Thread.sleep((long) sleep); T.Element_Click("1st Item Click (size() - 2)", L1.get(2), "no_jira");
                if (FAIL) { return;} // Sleep after that >>>
            _t++; Thread.sleep(500); T.List_L0("Modifier Group Count", "xpath", "//div[@class='modifier-group']", "no_jira");             
                //if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Modifiers 'Add Group' Click", "xpath", "//*[contains(text(), 'Add modifier group')]", "no_jira"); 
                if (FAIL) { return;}  
            _t++; Thread.sleep(500); T.Element_By_Path_Click("Modifier Name Input Click", "xpath", "//div[@class='v-input v-text-field v-select v-input--is-focused theme--light primary--text']", "no_jira"); 
                if (FAIL) { return;}                                                                                                     
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'Modifier Groups list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Available Modifier Groups Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Modifier Group (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Select 1st Group", L1.get(0), "no_jira");
                if (FAIL) { return;}             
            _t++; Thread.sleep((long) sleep); T.List_L0("Updated Modifier Group Count", "xpath", "//div[@class='modifier-group']", "no_jira");             
                if (FAIL) { return;}   
                for (int i = 0; i < L0.size(); i++) {
                    _t++; T.Element_Attribute("Modifier Group (Index " + i + ") Text Content", L0.get(i), "textContent", "no_jira");            
                    if (FAIL) { return;}
                }             
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click  'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", "no_jira"); 
                if (FAIL) { return;}   

            _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;} 
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}  
             Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}

            // ======== Delete Last Imported
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'EDIT MENU' Click", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
                if (FAIL) { return;}   
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
                if (FAIL) { return;}

                
            _t++; Thread.sleep((long) sleep); T.List_L2("Published Menus ID Count", "css", "[menu-id]", "no_jira"); 
            _t++; Thread.sleep((long) sleep); T.List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                T_Index = -1;
                Menu_ID = "not_found";
                if(L0.size() == L2.size()){
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        } 
                    }  
                }else{
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                    }                
                    for (int i = 0; i < L2.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        }
                    } 
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                    EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n"; 
                }      
//            _t++; FAIL = false; T.Call_API("Call 'menu' API", BaseAPI + "/menu/" + Menu_ID + "?extended=true&nocache=1", true,"no_jira" );
//                if (FAIL) { return;}          

            _t++; Thread.sleep((long) sleep); T.Move_to_Element_By_Path("Imported Menu Set Hover", "xpath", "//*[contains(text(), 'Imported " + New_ID + "')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L2("Imported Menu Set - dots", L0.get(L0.size() - 1), "tagName", "button", "no_jira"); 
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Click("Imported Menu Set 'dots' Click", L2.get(1), "no_jira");
                if (FAIL) { return;}   
                Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; T.Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                    if(t.contains("Delete")){ T_Index = i; }
                }
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Delete'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;} 
            _t++; T.Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", "no_jira");        
                if (FAIL) { return;}  
                Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", "no_jira"); 
                if (FAIL) { return;} 
            _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
                if (FAIL) { return;} 
                Thread.sleep(2000);
                
            _t++; Thread.sleep((long) sleep); T.List_L2("Re-Published Menus ID Count", "css", "[menu-id]", "no_jira");      
            _t++; Thread.sleep((long) sleep); T.List_L0("Re-Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira"); 
                if(L0.size() == L2.size()){
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        } 
                    }  
                }else{
                    for (int i = 0; i < L0.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");  
                        if(t.equals("Added " + New_ID)){ 
                            T_Index = i; 
                        }
                    }                
                    for (int i = 0; i < L2.size(); i++) {
                        _t++; T.Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", "no_jira"); 
                        if(T_Index != i){ 
                            Menu_ID = t; 
                        }
                    } 
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "Global Menus" + "\t" + "Menu Names / Menu ID(s)" + "\t" + "Not Equial ^^^" + "\t" + "FAIL" + "\t" + "Unexpected";
                    EX += "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n"; 
                } 
//            _t++; FAIL = false; T.Call_API("Call 'menu' API", BaseAPI + "/menu/" + Menu_ID + "?extended=true&nocache=1", true,"no_jira" );
//                if (FAIL) { return;}     
                
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
             if (FAIL) { return;} 
        } else {
           _t++; _f++;
           EX += " - " + "\t" + "Find Menu" + "\t" + GL_MENU + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        }
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back","MM 'Menu' page","MM 'Sector' page", "no_jira"); 
            //if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}               
        //Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for MM 'Sector' page", "xpath", "//div[@class='layout hover align-baseline']", "no_jira"); 
            if (FAIL) { return;}           
        EX += " - " + "\t" + " === MM Global Menus Import" + "\t" + " ===== " + "\t" + " == Global Menus Import End ^^" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>   
    }   
}
