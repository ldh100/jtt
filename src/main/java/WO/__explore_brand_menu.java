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
public class __explore_brand_menu {
    public static void run(boolean EDIT_ITEM) throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Enter Location' text", "Enter Your Thrive Location", true,"no_jira"); 
            //if (FAIL) { return;}
        _t++; T.List_L0("Find 'combobox(s)", "css", "[role='combobox']", "no_jira");             
            if (FAIL) { return;}             
        _t++; T.Element_Child_Click("Click 'Select Location' Slot", L0.get(1), "tagName", "input", "no_jira");             
            if (FAIL) { return;}                   
        _t++; T.Element_Child_Text_Enter("Enter Site Name", L0.get(1), "tagName", "input", SITE,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Location list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Location (index " + i + "):", L1.get(i),  "no_jira");             
                if (FAIL) { return;}
            }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
            if (FAIL) { return; }           
//        _t++; T.Click_out_of_Element("Close 'Select Location'", L1.get(1), "Top", 4, 12,"no_jira");
//            //if (FAIL) { return;}

    }  
}
