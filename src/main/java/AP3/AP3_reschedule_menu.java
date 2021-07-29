package AP3;

import java.time.LocalDateTime;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 *
 * @author astrit.ademi
 */

class AP3_reschedule_menu extends AP3_GUI{
    protected AP3_reschedule_menu (AP3_GUI a) {
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
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        DH_MENU_ID = a.DH_MENU_ID;
        SECTOR = a.SECTOR;
        CompanyID = a.CompanyID;
        BrandID=a.BrandID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    String API_Response_Body = "";
    protected void run() {
    try {    
        String[] startTimes = {"05:00A", "06:00A", "07:00A", "08:00A", "09:00A", "10:00A", "11:00A"};
        String[] endTimes = {"05:00P", "06:15P", "07:30P", "08:40P", "09:00P", "10:10P", "11:20P"};
               
        Navigate_to_URL("Navigate to Schedule Menus Page", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/schedules", ParentTest, "no_jira");
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Menu Schedule' page", "xpath", "//*[contains(text(), 'Schedule Your Menus')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira");
            if (FAIL) {return;}

        int expectedScheduledMenus = L0.size(); 
        for (int i = 0; i < 50; i++) {  //this will run the rescheduling of a menu 50 times
            String startTime = startTimes[new Random().nextInt(startTimes.length)];
            String endTime = endTimes[new Random().nextInt(endTimes.length)];
            if (L0.isEmpty()) {
                Element_By_Path_Click("Click > 'Schedule menu'", "xpath", "//*[contains(text(), 'Schedule menu')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for 'Schedule menu' page", "xpath", "//*[contains(text(),'Schedule Menu')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Click("Click > Menu dropdown", "css", "[aria-label='Menu']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for Menu dd list to appear", "xpath", "//div[contains(@class,'v-menu__content')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_Click("Click > first menu on list", L0.get(0), ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter Start Time", "css", "[aria-label='Start Time']", startTime, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter End Time", "css", "[aria-label='End Time']", endTime, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                if (d1.findElement(By.cssSelector("[aria-label='Repeat']")).getAttribute("value").equals("")) {
                    Element_By_Path_Click("Click > 'Repeat' dd", "css", "[aria-label='Repeat']", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    Element_By_Path_Click("Select > 'Daily' in dd list", "xpath", "//*[contains(text(), 'Daily')]", ParentTest, "no_jira");
                        if (FAIL) {return;}
                }
                if (!d1.findElement(By.xpath("//input[@aria-label='No end date']/following-sibling::i")).getAttribute("class").contains("-marked")) {
                    Element_By_Path_Click("Click > 'No end date' Checkbox", "xpath", "//input[@aria-label='No end date']/following-sibling::i", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    List_L1("List of 'Date' Fields", "xpath", "//input[contains(@aria-label, 'Date')]", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    if (L1.size() > 1) {
                        _f++; EX += _t + "\t" + "Expected number of 'Date' fields" + "\t" + "-" + "\t" + "1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    }
                    Element_By_Path_Click("Click > 'Start Date' field", "css", "[aria-label='Start Date']", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    Wait_For_Element_By_Path_Presence("Wait for datepicker", "xpath", "//*[contains(@class,'v-picker--date')]", ParentTest, "no_jira");
                        if (FAIL) {return;}
                    Element_By_Path_Click("Click > today's date", "xpath", "//*[contains(@class,'v-btn--outline')]", ParentTest, "no_jira");
                        if (FAIL) {return;}
                }
                Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Call_API("Call Calendar API", "Bearer " + AP3_TKN, BaseAPI + "/calendar/" + BrandID + "?nocache=false", true, ParentTest, "no_jira");
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID + "?nocache=false"+ "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID + "?nocache=false", false, ParentTest.createNode("API Responce Error"));
                    return;
                }      
                JSONObject json = new JSONObject(API_Response_Body);
                JSONArray events = new JSONArray();
                events = json.getJSONArray("events");
                if (events.length() == 16) {
                    _t++;
                    _p++; EX += _t + "\t" + "Expected Number of events" + "\t" + "-" + "\t" + "16" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Expected Number of events" + "\t" + "-" + "\t" + "16" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            } else {
                List_L0("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_Click("Click > first menu on list", L0.get(0), ParentTest, "no_jira");
                if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for 'Menu Details' page", "xpath", "//*[contains(text(),'Menu Details')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                if (d1.findElements(By.xpath("(//div[@class='flex']//div[contains(@class,'is-disabled')])[1]")).size() > 0) {
                    //click on All day
                    Element_By_Path_Click("Deselect > 'All day' checkbox", "xpath", "(//i[contains(@class,'marked')])[1]", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                }
                Element_By_Path_Click("Click > 'Start Time'", "css", "[aria-label='Start Time']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter Start Time", "css", "[aria-label='Start Time']", startTime, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > 'End Time'", "css", "[aria-label='End Time']", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for dropdown", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Element_By_Path_Text_Enter("Enter End Time", "css", "[aria-label='End Time']", endTime, false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Save'", "xpath", "//*[contains(text(),'Save')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'Schedule menu')]", ParentTest, "no_jira");
                    if (FAIL) {return;}
            }
            List_L2("List of Scheduled Menus", "xpath", "//tbody/tr", ParentTest, "no_jira");
                if (FAIL) {return;}
            if (expectedScheduledMenus == 0 && L2.size() == 1) {
                _t++;
                _p++; EX += _t + "\t" + "Expected number of Scheduled Menus" + "\t" + "-" + "\t" + L2.size() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else if (L2.size() == expectedScheduledMenus) {                    
                _t++;
                _p++; EX += _t + "\t" + "Expected number of Scheduled Menus" + "\t" + "-" + "\t" + expectedScheduledMenus + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Expected number of Scheduled Menus" + "\t" + "-" + "\t" + expectedScheduledMenus + "\t" + "FAIL" + "\t" + "reschduled menu may have cause an unexpected duplication after " + i + " iterations" + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            Call_API("Call Calendar API", "Bearer " + AP3_TKN, BaseAPI + "/calendar/" + BrandID + "?nocache=false", true, ParentTest, "no_jira");
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/calendar/" + BrandID + "?nocache=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/calendar/" + BrandID + "?nocache=false", false, ParentTest.createNode("API Responce Error"));
                return;
                }     
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = new JSONArray();
            events = json.getJSONArray("events");
            if (events.length() == 16) {
                _t++;
                _p++; EX += _t + "\t" + "Expected Number of events" + "\t" + "-" + "\t" + "16" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Expected Number of events" + "\t" + "-" + "\t" + "16" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }                
        }           //------- AUT-850
    } catch (Exception ex){}   // =============================================  
    } 
}
