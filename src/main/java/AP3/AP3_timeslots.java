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
import java.time.LocalTime;
import java.util.Calendar;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
/**
 *
 * @author astrit.ademi
 */
public class AP3_timeslots {

    public static void run() throws InterruptedException {
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", "no_jira");
                if (FAIL) {return;}
     
        // <editor-fold defaultstate="collapsed" desc="Station Hours Greater Than Menu Hours">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Station Hours Greater Than Menu Hours Begin" + "\t" + " == Station Hours Greater Than Menu Hours Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        if (L0.isEmpty()) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select > Menu from dd", "xpath", "//div[contains(text(),'Lunch')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", "03:00P", false,"no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter End Time '6PM'", "css", "[aria-label='End Time']", "06:00P", false,"no_jira");
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
                
            }  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
            if (FAIL) {return;}
        } else {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'Lunch')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", "no_jira");
                    if (FAIL) { return;} 
            }
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", "03:00P", false,"no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter End Time '6PM'", "css", "[aria-label='End Time']", "06:00P", false,"no_jira");
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i","no_jira");
                if (FAIL) {return;}
                _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", "no_jira");
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
            if (FAIL) {return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
            if (FAIL) {return;}
        }
        
        //get day of the week
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); 

        switch (day) {
            case Calendar.SUNDAY:
                setHours("sunday");
                break;
            case Calendar.MONDAY:
                setHours("monday");
                break;
            case Calendar.TUESDAY:
                setHours("tuesday");
                break;
            case Calendar.WEDNESDAY:
                setHours("wednesday");
                break;
            case Calendar.THURSDAY:
                setHours("thursday");
                break;
            case Calendar.FRIDAY:
                setHours("friday");
                break;
            case Calendar.SATURDAY:
                setHours("saturday");
                break;
        }
        int numberOfExpectedTimeslots = 0;
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        if (hour <= 11) {
            numberOfExpectedTimeslots = 12;
        } else {
            numberOfExpectedTimeslots = 9; //or less
        }
        String MenuID = "";
        TWeb.Call_API_Auth("Find MenuID", BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, "no_jira");
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
                System.out.println(loc_brand);
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals("Lunch")) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("timeslots API call (pick-up menu)", BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, "no_jira");
        json = new JSONObject(API_Response_Body);
        JSONArray timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("timeslots API call (delivery menu)", BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, "no_jira");
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Station Hours Greater Than Menu Hours End" + "\t" + " == Station Hours Greater Than Menu Hours End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>
               
    }
   
    private static void setHours(String day) throws InterruptedException {
        day = day.substring(0, 1).toUpperCase() + day.substring(1, day.length()).toLowerCase();
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Service Hours", "xpath", "//a[contains(text(), 'Service Hours')]","no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(@class,'FormStyle')]","no_jira");
            if (FAIL) {return;}
        if (d1.findElement(By.xpath("(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]")).getAttribute("class").contains("mdi-checkbox-marked")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Deselect > '24 Hour Service' checkbox", "xpath", "(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]", "no_jira");
                if (FAIL) {return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Opens' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
        Actions actions = new Actions(d1);
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter '11:30AM'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", "11:30A", false,"no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Closes' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter '6PM'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", "06:00P", false,"no_jira");
            if (FAIL) {return;}
        /***check if save button is present, if not there was no difference in 
            configuration the save button will not appear, in this case we just
            navigate back to Schedule Menu page           
        */
        if (d1.findElements(By.xpath("//*[contains(text(),'Save')]")).size() > 0) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
            if (FAIL) {return;}
            Thread.sleep(1000);
        } else {
            _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
            if (FAIL) {return;}
        }
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Delivery Hours", "xpath", "//a[contains(text(), 'Delivery Hours')]","no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//a[contains(text(), 'Delivery Hours') and contains(@class,'item--active')]","no_jira");
            if (FAIL) {return;}
        if (d1.findElement(By.xpath("(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]")).getAttribute("class").contains("mdi-checkbox-marked")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Deselect > '24 Hour Service' checkbox", "xpath", "(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]", "no_jira");
                if (FAIL) {return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Opens' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter '11:30AM'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", "11:30A", false,"no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Closes' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]","no_jira");
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter '6PM'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", "06:00P", false,"no_jira");
            if (FAIL) {return;}
        /***check if save button is present, if not there was no difference in 
            configuration the save button will not appear, in this case we just
            navigate back to Schedule Menu page           
        */
        if (d1.findElements(By.xpath("//*[contains(text(),'Save')]")).size() > 0) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]","no_jira");
            if (FAIL) {return;}
            Thread.sleep(1000);
        } else {
            _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]","no_jira");
            if (FAIL) {return;}
        }
    }   
}
