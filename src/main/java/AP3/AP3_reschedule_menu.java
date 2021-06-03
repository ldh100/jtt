/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import static A.A.*;
import static AP3.AP3.*;
import A.TWeb;
import java.time.LocalDateTime;
import java.util.Random;
import org.openqa.selenium.By;

/**
 *
 * @author astrit.ademi
 */
public class AP3_reschedule_menu {

    public static void run() throws InterruptedException {
        
        String[] startTimes = {"05:00A", "06:00A", "07:00A", "08:00A", "09:00A", "10:00A", "11:00A"};
        String[] endTimes = {"05:00P", "06:15P", "07:30P", "08:40P", "09:00P", "10:10P", "11:20P"};
               
            _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Schedule Menus Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", "no_jira");
                if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Menu Schedule' page", "xpath", "//*[contains(text(), 'Schedule Your Menus')]","no_jira");
                if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", "no_jira");
                if (FAIL) {return;}
                
            int expectedScheduledMenus = L0.size(); //
                
            for (int i = 0; i < 50; i++) {
                String startTime = startTimes[new Random().nextInt(startTimes.length)];
                String endTime = endTimes[new Random().nextInt(endTimes.length)];
                if (L0.isEmpty()) {
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", "no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click > first menu on list", L0.get(0),"no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", startTime, false,"no_jira");
                    if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter End Time '6PM'", "css", "[aria-label='End Time']", endTime, false,"no_jira");
                    if (FAIL) { return;}
                    if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']","no_jira");
                        if (FAIL) {return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
                        if (FAIL) {return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]","no_jira");
                        if (FAIL) {return;}
                    }
                    if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i","no_jira");
                        if (FAIL) {return;}
                        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", "no_jira");
                        if (FAIL) {return;}
                        if (L1.size() > 1) {
                            _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']","no_jira");
                        if (FAIL) {return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]","no_jira");
                        if (FAIL) {return;}
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]","no_jira");
                        if (FAIL) {return;}
                    }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
                    if (FAIL) {return;}
                } else {
                    _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", "no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click > first menu on list", L0.get(0),"no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Menu Details' page", "xpath", "//*[contains(text(),'Menu Details')]","no_jira");
                    if (FAIL) {return;}
                    if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                        //click on All day
                        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", "no_jira");
                            if (FAIL) { return;} 
                    }
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", startTime, false,"no_jira");
                    if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter End Time '6PM'", "css", "[aria-label='End Time']", endTime, false,"no_jira");
                    if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
                    if (FAIL) {return;}
                    _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
                    if (FAIL) {return;}
                }
                _t++; Thread.sleep((long) sleep); TWeb.List_L2("List of Scheduled Menus", "xpath", "//tbody/tr", "no_jira");
                    if (FAIL) {return;}
                if (L2.size() == L0.size()) {
                    _t++;
                    _p++; EX += _t + "\t" + "Expected number of Scheduled Menus" + "\t" + "-" + "\t" + expectedScheduledMenus + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Expected number of Scheduled Menus" + "\t" + "-" + "\t" + expectedScheduledMenus + "\t" + "FAIL" + "\t" + "reschduled menu may have cause an unexpected duplication after " +i+ " iterations" + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }           
            }           //------- AUT-850
    }
}
