/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
import org.openqa.selenium.WebElement;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_explore_brand_menu {
    public static void run(boolean EDIT_ITEM) throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Enter Location' text", "Enter Your Thrive Location", true,"no_jira"); 
            //if (FAIL) { return;}
        _t++; TWeb.List_L0("Find 'combobox(s)", "css", "[role='combobox']", "no_jira");             
            if (FAIL) { return;}             
        _t++; TWeb.Element_Child_Click("Click 'Select Location' Slot", L0.get(1), "tagName", "input", "no_jira");             
            if (FAIL) { return;}                   
        //Thread.sleep(500);    
        _t++; TWeb.Element_Child_Text_Enter("Enter Site Name", L0.get(1), "tagName", "input", SITE, false, "no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'fetch-sites-loader'...", "xpath", "//*[contains(@class, 'fetch-sites-loader')]", "no_jira");                                                                                     
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Location list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Location (" + i + ") Name:", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
            if (FAIL) { return; } 
        Thread.sleep(500);    
        
//if (true)   {PICKUP = true;DELIVERY = true;return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Header Card", "xpath", "//div[@class='header-card v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Header lines count", e1,"xpath", ".//div[contains(@class, 'v-card__')]", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Header (" + i + ") line:", L1.get(i),  "no_jira");             
            }    
        PICKUP = false;
        DELIVERY = false;
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Find Service tabs", "css", "[role='tab']", "no_jira");
        if (L0.isEmpty()) {
            _t++; TWeb.Element_By_Path_Text("Single Available Service:", "xpath", "//div[@class='pickup-or-delivery']",  "no_jira"); 
            if (t.toLowerCase().contains("pickup")) { 
                PICKUP = true; 
                _t++; TWeb.List_L1("Pickup Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", "no_jira");
                for (int j = 0; j < L1.size(); j++) {
                    _t++; TWeb.Element_Text("Pickup Brand (" + j + "):", L1.get(j),  "no_jira");     
                }
            }
            if (t.toLowerCase().contains("delivery")) { 
                DELIVERY = true;
                for (int j = 0; j < L1.size(); j++) {
                    _t++; TWeb.Element_Text("Delivery Brand (" + j + ") name:", L1.get(j),  "no_jira");     
                } 
                _t++; TWeb.List_L1("Delivery Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", "no_jira"); 
                for (int j = 0; j < L1.size(); j++) {
                    _t++; TWeb.Element_Text("Delivery Brand (" + j + "):", L1.get(j),  "no_jira");     
                } 
            } 
        } else { 
            for (int i = 0; i < L0.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.List_L0("Find Service tabs", "css", "[role='tab']", "no_jira");
                _t++; TWeb.Element_Text("Service tab (" + i + ") name:", L0.get(i),  "no_jira");       
                
                if (t.toLowerCase().equals("pickup")) { 
                    PICKUP = true; 
                    _t++; TWeb.Element_Click("Click 'Pickup' tab", L0.get(i),"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; TWeb.List_L1("Pickup Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", "no_jira");
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; TWeb.Element_Text("Pickup Brand (" + j + "):", L1.get(j),  "no_jira");     
                    }
                   // _t++; Thread.sleep((long) sleep);  TWeb.Element_Click("Enter first Brand in Pickup:   ", L1.get(0),  "no_jira"); 
                    leftPanelClick(L1.get(0));
                    
                }
                if (t.toLowerCase().equals("delivery")) { 
                    DELIVERY = true;
                    _t++; TWeb.Element_Click("Click 'Delivery' tab", L0.get(i),"no_jira"); 
                        if (FAIL) { return; } 
                    _t++; TWeb.List_L1("Delivery Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", "no_jira"); 
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; TWeb.Element_Text("Delivery Brand (" + j + "):", L1.get(j),  "no_jira");     
                    } 
                    //_t++; Thread.sleep((long) sleep);  TWeb.Element_Click("Enter first Brand in Delivery:   ", L1.get(0),  "no_jira"); 
                    leftPanelClick(L1.get(0));
                } 
            } 
            
        }    
    }  
    public static void leftPanelClick( WebElement brandCard ) throws InterruptedException {
            _t++; Thread.sleep((long) sleep);  TWeb.Element_Click("Enter first Brand in Pickup:   ", brandCard,  "no_jira"); 
            Thread.sleep(3000);
            _t++; TWeb.List_L2("Menu Category count ", "css", "[role='tab']", "no_jira");
 //L0:       L1:         L2:Left pannel category         L3:                 
            for ( WebElement we : L2){         
                _t++; TWeb.Element_Text("Menu Category : ", we ,  "no_jira");
                _t++; TWeb.Element_Click("Click Category",we , "no_jira");                
            }
            _t++; Thread.sleep((long) sleep);  TWeb.Element_By_Path_Click(" Return to site page in:   ", "xpath","//div[text()=' "+ SITE +" ']",  "no_jira"); 
            //(By.xpath("//div[contains(@class,'row pa-0')]")
        
    } 

}

