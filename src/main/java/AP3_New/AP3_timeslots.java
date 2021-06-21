
package AP3_New;

import java.io.File;
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
class AP3_timeslots extends AP3_GUI{
    protected AP3_timeslots (AP3_GUI a) throws Exception {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;

        New_ID = a.New_ID;
        app = a.app;
        appId = a.appId;
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        _All_data = a._All_data;
        TZone = a.TZone;
    }    
    String API_Response_Body = "";
    protected void run() throws Exception {
        
        String MENU = "";
        String MENU2 = "";
        
        Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira" );
            if (FAIL) {return;}
     
       // <editor-fold defaultstate="collapsed" desc="Station Hours Greater Than Menu Hours">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Station Hours Greater Than Menu Hours Begin" + "\t" + " == Station Hours Greater Than Menu Hours Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        if (L0.isEmpty()) {
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[1]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", "03:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '6PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "06:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        } else {         
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '3PM'", "css", "[aria-label='Start Time']", "03:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '6PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "06:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }
        
        //get day of the week
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK); 

        switch (day) {
            case Calendar.SUNDAY:
                setHours("sunday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.MONDAY:
                setHours("monday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.TUESDAY:
                setHours("tuesday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.WEDNESDAY:
                setHours("wednesday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.THURSDAY:
                setHours("thursday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.FRIDAY:
                setHours("friday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
            case Calendar.SATURDAY:
                setHours("saturday", "11:30AM", "06:00PM", "11:30AM", "06:00PM");
                break;
        }
        int numberOfExpectedTimeslots = 0;
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();
        if (hour <= 11) {
            numberOfExpectedTimeslots = 36;
        } else {
            numberOfExpectedTimeslots = 32; //or less
        }
        String MenuID = "";
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        JSONArray timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Station Hours Greater Than Menu Hours End" + "\t" + " == Station Hours Greater Than Menu Hours End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>
       
       Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
       // <editor-fold defaultstate="collapsed" desc="Menu hours greater than station hours">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Menu Hours Greater than Station Hours Begin" + "\t" + " == Menu Hours Greater than Station Hours Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        if (L0.isEmpty()) {
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[1]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '11:30A'", "css", "[aria-label='Start Time']", "11:30A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '5PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "05:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        } else {
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '11:30AM'", "css", "[aria-label='Start Time']", "11:30A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '5PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "05:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }

        switch (day) {
            case Calendar.SUNDAY:
                setHours("sunday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.MONDAY:
                setHours("monday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.TUESDAY:
                setHours("tuesday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.WEDNESDAY:
                setHours("wednesday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.THURSDAY:
                setHours("thursday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.FRIDAY:
                setHours("friday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
            case Calendar.SATURDAY:
                setHours("saturday", "03:00PM", "06:00PM", "03:00PM", "06:00PM");
                break;
        }
        lt = LocalTime.now();
        hour = lt.getHour();
        if (hour <= 11) {
            numberOfExpectedTimeslots = 24;
        } else {
            numberOfExpectedTimeslots = 20; //or less
        }
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }        
        EX += " - " + "\t" + " === " + "\t" + " ===== Menu Hours Greater than Station Hours End" + "\t" + " == Menu Hours Greater than Station Hours End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>
       
        Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
       // <editor-fold defaultstate="collapsed" desc="Overlapping menus">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Overlapping Menus Begin" + "\t" + " == Overlapping Menus Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        if (L0.isEmpty()) {
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > First Menu Name", "xpath", "(//div[@class='v-list__tile__title'])[45]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '9AM'", "css", "[aria-label='Start Time']", "09:00A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '3PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "03:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
            //// ---------- add second menu
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > First Menu Name", "xpath", "(//div[@class='v-list__tile__title'])[46]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU2 = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU2+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '2PM'", "css", "[aria-label='Start Time']", "02:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '9PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "09:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        } else {
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[1]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '11:30AM'", "css", "[aria-label='Start Time']", "11:30A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '5PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "05:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
            ///////------- updated second menu
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[2]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU2 = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU2+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '11:30AM'", "css", "[aria-label='Start Time']", "11:30A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '5PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "05:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }

        switch (day) {
            case Calendar.SUNDAY:
                setHours("sunday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.MONDAY:
                setHours("monday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.TUESDAY:
                setHours("tuesday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.WEDNESDAY:
                setHours("wednesday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.THURSDAY:
                setHours("thursday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.FRIDAY:
                setHours("friday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.SATURDAY:
                setHours("saturday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
        }
        lt = LocalTime.now();
        hour = lt.getHour();
        if (hour <= 9) {
            numberOfExpectedTimeslots = 24;
        } else {
            numberOfExpectedTimeslots = 20; //or less
        }
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
        
        ///// ------api verif. for second menu 
        hour = lt.getHour();
        if (hour <= 14) {
            numberOfExpectedTimeslots = 24;
        } else {
            numberOfExpectedTimeslots = 20; //or less
        }
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU2)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Overlapping Menus End" + "\t" + " == Overlapping Menus End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
       
        Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
        // <editor-fold defaultstate="collapsed" desc="Non-overlapping menus">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Non-Overlapping Menus Begin" + "\t" + " == Non-Overlapping Menus Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        if (L0.isEmpty()) {
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > First Menu Name", "xpath", "(//div[@class='v-list__tile__title'])[45]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '9AM'", "css", "[aria-label='Start Time']", "09:00A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '1PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "01:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
            //// ---------- add second menu
            Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Attribute("Get > First Menu Name", "xpath", "(//div[@class='v-list__tile__title'])[46]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU2 = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU2+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '2PM'", "css", "[aria-label='Start Time']", "02:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '9PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "09:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        } else {
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[1]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '09:00AM'", "css", "[aria-label='Start Time']", "09:00A", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '1PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "01:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            
            ///////------- updated second menu
            Element_By_Path_Attribute("Get > Menu Name", "xpath", "(//tbody/tr[2]/td)[1]", "textContent" , ParentTest, "no_jira" );
            if (FAIL) {return;}
            MENU2 = t.trim();
            Element_By_Path_Click("Click > Menu", "xpath", "//*[contains(text(),'"+MENU2+"')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                //click on All day
                Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira" );
                    if (FAIL) { return;} 
            }
            Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter Start Time '2PM'", "css", "[aria-label='Start Time']", "02:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            Element_By_Path_Click("Click > 'End Time'", "xpath", "//*[contains(@aria-label,'End Time')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Element_By_Path_Text_Enter("Enter End Time '9PM'", "xpath", "//*[contains(@aria-label,'End Time')]", "09:00P", false, ParentTest, "no_jira" );
            if (FAIL) { return;}
            if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira" );
                if (FAIL) {return;}
                List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
                if (L1.size() > 1) {
                    _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                
            }  
            Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            if (d1.findElements(By.xpath("//*[contains(@class,'v-btn--outline')]")).size() > 0) {
                Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira" );
                if (FAIL) {return;}
            }
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }

        switch (day) {
            case Calendar.SUNDAY:
                setHours("sunday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.MONDAY:
                setHours("monday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.TUESDAY:
                setHours("tuesday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.WEDNESDAY:
                setHours("wednesday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.THURSDAY:
                setHours("thursday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.FRIDAY:
                setHours("friday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
            case Calendar.SATURDAY:
                setHours("saturday", "09:00AM", "09:00PM", "09:00AM", "09:00PM");
                break;
        }
        lt = LocalTime.now();
        hour = lt.getHour();
        if (hour <= 9) {
            numberOfExpectedTimeslots = 16;
        } else {
            numberOfExpectedTimeslots = 12; //or less
        }
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true"+ "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
        
        ///// ------api verif. for second menu 
        hour = lt.getHour();
        if (hour <= 14) {
            numberOfExpectedTimeslots = 28;
        } else {
            numberOfExpectedTimeslots = 24; //or less
        }
        Call_API("Find MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        menus = new JSONArray();
        menus = json.getJSONArray("menus");
        for (int i = 0; i < menus.length(); i++) {
            JSONObject menu = menus.getJSONObject(i);
            String loc_brand = "";
            if (menu.has("location_brand")) {
                loc_brand = menu.getString("location_brand");
            }  
            if (loc_brand.equals(BrandID)) {
                if (menu.has("label")) {
                    JSONObject label = menu.getJSONObject("label");
                    String menuName = label.getString("en");
                    if (menuName.equals(MENU2)) {
                        MenuID = menu.getString("id");
                    }
                }  
            }
        }
        Call_API("timeslots API call (pick-up menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of pick-up timeslots - " + MENU2 + " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of pick-up timeslots - " + MENU2 + " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        Call_API("timeslots API call (delivery menu)", "Bearer " + AP3_TKN, BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        timeslots = new JSONArray();
        timeslots = json.getJSONArray("timeslots");
        if (timeslots.length() <= numberOfExpectedTimeslots) {
            _t++;
            _p++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
            _t++;
            _f++; EX += _t + "\t" + "API - number of delivery timeslots - " +MENU2+ " menu" + "\t" + "-" + "\t" + timeslots.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Non-Overlapping Menus End" + "\t" + " == Non-Overlapping Menus End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
    }
   
    private void setHours(String day, String pick_up_time_start, String pick_up_time_end, String delivery_start, String delivery_end) throws Exception {
        day = day.substring(0, 1).toUpperCase() + day.substring(1, day.length()).toLowerCase();
        Element_By_Path_Click("Click > Service Hours", "xpath", "//a[contains(text(), 'Service Hours')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(@class,'FormStyle')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        if (d1.findElement(By.xpath("(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]")).getAttribute("class").contains("mdi-checkbox-marked")) {
            Element_By_Path_Click("Deselect > '24 Hour Service' checkbox", "xpath", "(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]", ParentTest, "no_jira" );
                if (FAIL) {return;}
        }
        Element_By_Path_Click("Click > 'Opens' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Actions actions = new Actions(d1);
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        Element_By_Path_Text_Enter("Enter '"+pick_up_time_start+"'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", pick_up_time_start, false, ParentTest, "no_jira" );
            if (FAIL) {return;}
        Element_By_Path_Click("Click > 'Closes' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();    
        Element_By_Path_Text_Enter("Enter '"+pick_up_time_end+"'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", pick_up_time_end, false, ParentTest, "no_jira" );
            if (FAIL) {return;}
        /***check if save button is present, if not there was no difference in 
            configuration the save button will not appear, in this case we just
            navigate back to Schedule Menu page           
        */
        if (d1.findElements(By.xpath("//*[contains(text(),'Save')]")).size() > 0) {
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Thread.sleep(1000);
        } else {
            Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }
                // =================== "Leave without publishing?" Dialog even PUBLISH OK ============ DEBUG    
                Text_Found("Find 'Leave...' question", "Leave without publishing?", ParentTest, "no_jira" ); 
                if ("Found".equals(t)) {     
                    _t++; _f++;
                    EX += _t + "\t" + "Navigate Back after Publish OK" + "\t" + "MM 'Sector' page" + "\t" + "Dialog 'Leave without publishing?'" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
                    F += "Step: " + _t + " > " + "Dialog 'Leave without publishing?' after Published OK" + "\r\n";
                    Find_Text("Find 'Leave...' note", "Changes will be lost if you do not publish.", true, ParentTest, "no_jira" ); 
                    if (FAIL) { return; }   
                     Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", ParentTest, "no_jira" ); 
                    if (FAIL) { return; }         
                    Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira" ); 
                    if (FAIL) { return; }     
                    Element_By_Path_Click("Click 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", ParentTest, "no_jira" ); 
                    if (FAIL) { return;}  
                }
                // =================== "Leave without publishing?" Dialog even PUBLISH OK ============ DEBUG
                
        Element_By_Path_Click("Click > Delivery Hours", "xpath", "//a[contains(text(), 'Delivery Hours')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//a[contains(text(), 'Delivery Hours') and contains(@class,'item--active')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        if (d1.findElement(By.xpath("(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]")).getAttribute("class").contains("mdi-checkbox-marked")) {
            Element_By_Path_Click("Deselect > '24 Hour Service' checkbox", "xpath", "(//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//i)[4]", ParentTest, "no_jira" );
                if (FAIL) {return;}
        }
        Element_By_Path_Click("Click > 'Opens' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        Element_By_Path_Text_Enter("Enter '"+delivery_start+"'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[@aria-label='Opens']", delivery_start, false, ParentTest, "no_jira" );
            if (FAIL) {return;}
        Element_By_Path_Click("Click > 'Closes' input", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.BACK_SPACE).build().perform();
        Element_By_Path_Text_Enter("Enter '"+delivery_end+"'", "xpath", "//p[contains(text(),'"+day+"')]//ancestor::div[contains(@class,'FormStyle')]//input[contains(@aria-label,'Closes')]", delivery_end, false, ParentTest, "no_jira" );
            if (FAIL) {return;}
        /***check if save button is present, if not there was no difference in 
            configuration the save button will not appear, in this case we just
            navigate back to Schedule Menu page           
        */
        if (d1.findElements(By.xpath("//*[contains(text(),'Save')]")).size() > 0) {
            Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
            Thread.sleep(1000);
        } else {
            Navigate_to_URL( "Navigate to Schedule Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira" );
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira" );
            if (FAIL) {return;}
        }
    }   
}
