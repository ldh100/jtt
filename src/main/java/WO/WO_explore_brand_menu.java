/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;
import static WO.WO.*;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_explore_brand_menu {
    public static void run(boolean EDIT_ITEM) throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Enter Location' text", "Enter Your Thrive Location", true,"no_jira"); 
            //if (FAIL) { return;}
        _t++; T.List_L0("Find 'combobox(s)", "css", "[role='combobox']", "no_jira");             
            if (FAIL) { return;}             
        _t++; T.Element_Child_Click("Click 'Select Location' Slot", L0.get(1), "tagName", "input", "no_jira");             
            if (FAIL) { return;}                   
        //Thread.sleep(500);    
        _t++; T.Element_Child_Text_Enter("Enter Site Name", L0.get(1), "tagName", "input", SITE, false, "no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'fetch-sites-loader'...", "xpath", "//*[contains(@class, 'fetch-sites-loader')]", "no_jira");                                                                                     
            if (FAIL) { return;}
        Thread.sleep(500);             
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Location list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Location (" + i + ") Name:", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
            if (FAIL) { return; } 
        Thread.sleep(500);    
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Header Card", "xpath", "//div[@class='header-card v-card v-sheet v-sheet--tile theme--light']", "no_jira");
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Header lines count", e1,"xpath", ".//div[contains(@class, 'v-card__')]", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Header (" + i + ") line:", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }    
        PICKUP = false;
        DELIVERY = false;
        _t++; Thread.sleep((long) sleep); T.List_L1("Find Service tabs", "css", "[role='tab']", "no_jira");
            if (FAIL) { return;} 
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Service tab (" + i + ") name:", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            } 
    }  
}
