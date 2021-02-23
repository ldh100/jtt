/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FW;
import A.TWeb;
import static A.A.*;
import static FW.FW.*;
import org.apache.commons.lang3.RandomStringUtils;
/**
 *
 * @author Oleg.Spozito
 */
public class FW_restaurants {
    public static void run() throws InterruptedException { 
        
        //************************* Select a Restaurant Testcase*****************************************************************
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Drawer menu 'Restaurants'", "xpath", "//a[@href='/partners/']", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//nav[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira"); 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; TWeb.Element_By_Path_Text_Enter("Enter '" + RESTAURANT + "' in Search", "xpath", "//input[@placeholder='Search']", FW.RESTAURANT, false, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress-circular')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Restaurant(s) Data row Count", "tagName", "tr", "no_jira");                                     
            T_Index = -1;
            for (int i = 0; i < L0.size(); i++) {
                _t++; TWeb.Element_Text("Restaurant Data Row Text", L0.get(i), "no_jira"); 
                if(t.contains(RESTAURANT) && t.contains(RestMarket)){
                    T_Index = i;
                } 
            }
        if(T_Index == -1) {
           _t++; _f++;
           EX += " - " + "\t" + "Find Restaurant" + "\t" + RESTAURANT + "/" + RestMarket + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";            
           {return;}
        }   
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click target Restaurant/Market", L0.get(T_Index), "no_jira");
            if (FAIL) { return;}         
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[@role='progressbar']", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find '" + RESTAURANT + "' Title Name", RESTAURANT, true,"no_jira");
        
        
        //*************************** Add a Restaurant Testcases**********************************
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Drawer menu 'Restaurants'", "xpath", "//a[@href='/partners/']", "no_jira"); 
            if (FAIL) { return;}
         Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on the 'Add Restaurants'", "xpath", "(//*[@type='button'])[2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Find_Text("Find 'Add a Restaurant' label", "Add a Restaurant", true,"no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Add a Restaurant form", "xpath", "(//div[@class='row justify-center'])[1]", "no_jira"); 
            if (FAIL) { return;}        
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Sections in Add a Restaurant form ", e1,"xpath", "//div/h5", "no_jira");             
             if (FAIL) { return;}                              
        for (int i = 1; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Section---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
    } 
      _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Labels in Add a Restaurant form ", e1,"xpath", "(//*[contains(@class, 'v-label')])", "no_jira");             
             if (FAIL) { return;}                              
        for (int i = 0; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Label---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
    }   
      _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Get the *FW Employee dropdown value ", "xpath", "(//*[contains(@class, 'v-select__selection')])[1]", "no_jira");
      if (FAIL) { return;} 
      
  
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("*Market dropdown click ","xpath", "(//div[@class='v-input__icon v-input__icon--append'])[2]", "no_jira"); 
      if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("*Market dropdown values ", e1,"xpath", "//div[@class='v-list-item__title']", "no_jira");  
      if (FAIL) { return;}
        for (int i = 2; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("*Market dropdown value---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
          }  
         _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select dropdown value", L1.get(4), "no_jira"); 
            if (FAIL) { return;}

    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Partner Type dropdown click ","xpath", "(//div[@class='v-input__icon v-input__icon--append'])[3]", "no_jira"); 
      if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Partner Type dropdown values ", e1,"xpath", "//div[@class='v-list-item__title']", "no_jira");  
      if (FAIL) { return;}
        for (int i = 22; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Partner Type dropdown value---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
        }
    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select dropdown value", L1.get(22), "no_jira"); 
    if (FAIL) { return;}  
    
    
     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("*Restaurant Partner dropdown click ","xpath", "(//div[@class='v-input__icon v-input__icon--append'])[4]", "no_jira"); 
      if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("*Restaurant Partner dropdown values ", e1,"xpath", "//div[@class='v-list-item__title']", "no_jira");  
      if (FAIL) { return;}
        for (int i = 24; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("*Restaurant Partner dropdown value---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
        }
    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select dropdown value", L1.get(27), "no_jira"); 
    if (FAIL) { return;}   
     Thread.sleep(5000);
     _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to Restaurant Name", 0, 500, "no_jira");
 //     String s = RandomStringUtils.randomAlphanumeric(8); // To generate alphanumeric
    String alphabet = "Restaurant"; // To generate randow alphabets
    String s = RandomStringUtils.random(10, alphabet);
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Restaurant Name", "xpath" , "//input[@id='restaurant_name']" ,s , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("*Street Address", "xpath" , "//input[@id='street']" ,"1 Prologis ave" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Unit, Suite, Floor etc.", "xpath" , "(//*[contains(@id, 'input')])[3]" ,"1" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("*City", "xpath" , "(//*[contains(@id, 'city')])[2]" ,"New York" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("*State", "xpath" , "//*[contains(@id, 'state')]" ,"NY" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("*State dropdown click ","xpath", "(//div[@class='v-input__icon v-input__icon--append'])[5]", "no_jira"); 
      if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find *State dropdown list", "xpath", "//div[contains(@class,'v-list v-select-list v-sheet theme--light theme--light')]", "no_jira");
      if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("*State", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
        if (FAIL) { return;}
      for (int i = 1; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("*State dropdown value---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
        }
//    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select *State",   L1.get(36), "no_jira");
//        if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("*Zip", "xpath" , "(//*[contains(@id, 'zip')])[2]" ,"12134" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Website", "xpath" , "(//*[contains(@id, 'website')])[2]" ,"www.google.ca" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Business Number", "xpath" , "(//*[contains(@id, 'business_number')])[2]" ,"123-456-7890" , false, "no_jira");
    if (FAIL) { return;}
    _t++; Thread.sleep((long) sleep);TWeb.Scroll_XY("Scroll to Restaurant Name", 0, 500, "no_jira");
     _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("*Cuisine Type dropdown click ","xpath", "(//div[@class='v-input__icon v-input__icon--append'])[6]", "no_jira"); 
      if (FAIL) { return;} 
    _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("*Cuisine Type dropdown values ", e1,"xpath", "//div[@class='v-list-item__title']", "no_jira");  
      if (FAIL) { return;}
        for (int i = 45; i < L1.size(); i++) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_Text("*Cuisine Type dropdown value---'"+i+"'", L1.get(i), "no_jira");                          
                if (FAIL) { return;}
        }
    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select dropdown value", L1.get(46), "no_jira"); 
    if (FAIL) { return;} 
     
    } 
}
