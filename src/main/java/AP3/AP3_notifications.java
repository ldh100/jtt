package AP3;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

class AP3_notifications extends AP3_GUI{
    protected AP3_notifications (AP3_GUI a) {
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
        SITE = a.SITE;
        BRAND = a.BRAND;
        SiteID = a.SiteID;
        Location = a.Location;
        DH_MENU_ID = a.DH_MENU_ID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    protected void run() {
    String API_Response_Body = "";    
    try {    
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > 'Ap3 Notification' Click", "xpath", "//*[contains(text(), 'Notification')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Page title > 'AP3 Notification Management'", "xpath", "//span[contains(text(),'AP3 Notification Management')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        
        // <editor-fold defaultstate="collapsed" desc="Verify Notifications API">  
        Call_API("Notification API", "Bearer " + AP3_TKN, BaseAPI + "/notification?realm=cdl&target=admin_panel", true, ParentTest, "no_jira");
            if (FAIL) { return;}
        if(t.startsWith("{")){
            API_Response_Body = t;  
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray notifications = json.getJSONArray("notifications"); 
            if(notifications.isEmpty()){
                _t++;
                _i++;
                EX += _t + "\t == " + "AP3 Notification" + "\t" + "Notification API > no Notifications" + "\t" + " - " + "\t" + "INFO" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("INFO", "URL: " + BaseAPI + "/notification?realm=cdl&target=admin_panel", false, ParentTest.createNode(_t + ". " + "Notification API > No Notification Found"), new Date());               
            } else{
                API_Body_Contains("Notification API - Title", API_Response_Body, "title", true, ParentTest, "no_jira");    
                API_Body_Contains("Notification API - ID",  API_Response_Body,"id", true, ParentTest, "no_jira");    
                API_Body_Contains("Notification API - Text",  API_Response_Body,"text", true, ParentTest, "no_jira");    
                API_Body_Contains("Notification API - Date Modified",  API_Response_Body,"date_modified", true, ParentTest, "no_jira");    
                API_Body_Contains("Notification API - Release Date",  API_Response_Body,"release_date", true, ParentTest, "no_jira");                 
            }
        }else{ 
            _t++;
            _f++;
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "/deliverydestination?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/notification?realm=cdl&target=admin_panel", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
        }                
        // </editor-fold>  

        // <editor-fold defaultstate="collapsed" desc="Verify Notifications Page">  
        Find_Text("Find 'New Notification' button", "New Notification", true, ParentTest, "no_jira");   
        Wait_For_Element_By_Path_Presence("Find 'Notification Bell' icon", "xpath", "(//button[contains(@class, 'bell-button')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}        
        List_L1("Notifications table headers", "xpath", "//*[@role='columnheader']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("Notification Name", L1.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("Notification Description", L1.get(1), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("Notification Status", L1.get(2), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("Date Scheduled", L1.get(3), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("Action", L1.get(4), ParentTest, "no_jira");
            if (FAIL) { return;}
            
        boolean No_Data = false;
        List_L0("Notifications Data Rows Count", "tagName", "tr", ParentTest, "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                Element_Text("Sites Data Row " + i + " text", L0.get(i), ParentTest, "no_jira");             
                if (t.toLowerCase().contains("no data")) { 
                    No_Data = true;
                }
            }           
        if(!No_Data)  {
            Wait_For_Element_By_Path_Presence("Calendar icon", "xpath", "//i[contains(@class, 'mdi-calendar')]", ParentTest, "no_jira");
               if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Edit icon", "xpath", "//i[contains(@class, 'mdi-pencil')]", ParentTest, "no_jira");
               if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Delete icon", "xpath", "//i[contains(@class, 'mdi-delete')]", ParentTest, "no_jira");
               if (FAIL) { return;}           
        }  
        // </editor-fold> 
        
        if(env.equals("PR")){ // No Automated new/edit Notificatiocation in Production
            _t++;
            _i++;
            EX += _t + "\t == " + "AP3 Notification" + "\t" + "No Automated New/Edit Notification in Production" + "\t" + " - " + "\t" + "INFO" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("INFO", "AP3 Notification in Production", false, ParentTest.createNode(_t + ". " + "No Automated New/Edit Notification in Production"), new Date()); 
            return;
        }

        // <editor-fold defaultstate="collapsed" desc="Create New Notification">  
        //========= click on '+ New Notification' button then Verify the Page and Create a New Notification
        Element_By_Path_Click("Add New Notifications Button", "xpath", "//*[contains(text(), 'New Notification')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Visibility("Create New In App Notification Section", "xpath", "(//div[contains(text(), 'Create New In App Notification')])[2]", ParentTest, "no_jira");
                if (FAIL) { return;}
        List_L2("List of Breadcrumb Items", "xpath", "//a[contains(@class,'v-breadcrumbs__item')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Text("AP3 Notification Management", L2.get(0), ParentTest, "no_jira");
        Element_Text("Create New In App Notification", L2.get(1), ParentTest, "no_jira");
        List_L1("List of Notification Cofiguration Sections", "xpath", "//div[contains(@class,'v-card-content')]/parent::div/parent::div", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Notification Name", L1.get(0), "xpath", "//div[contains(text(),'Notification Name')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text_Enter("Enter Notification Name", L1.get(0), "xpath", "//input[@aria-label='Notification Name']", "Auto-notif-test", false , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text_Enter("Enter Notification Description", L1.get(0), "xpath", "//textarea[@aria-label='Notification Description']", "Auto-notif-test-desc", false , ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Send Schedule", L1.get(1), "xpath", "//div[contains(text(),'Send Schedule')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Select Date", L1.get(1), "xpath", "//div[contains(text(),'Select Date')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Click("Click > Date Input Field", L1.get(1), "xpath", "//input[@aria-label='Date']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Date Picker' control", "xpath", "//div[contains(@class,'v-picker--date')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Select Toady's Date", "xpath", "//button[contains(@class,'v-btn--active')]//div[@class='v-btn__content']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Calendar Icon", "xpath", "//i[contains(@class,'mdi-calendar')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        To_Bottom("Scroll to Bottom",  ParentTest, "no_jira");
        Thread.sleep(100);
        Element_Child_Click("Click > Start Time Input Field", L1.get(1), "xpath", "//input[@aria-label='Start Time']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Start Time Dropdown List", "xpath", "//div[contains(@class,'v-select-list')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click outside Start Time Input Field", "xpath", "(//div[contains(@class,'v-card-content')]/parent::div/parent::div)[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("'cannot be empty' Validation Message", "xpath", "//div[contains(text(),'Schedule start time cannot be empty.')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Click("Click > Start Time Input Field", L1.get(1), "xpath", "//input[@aria-label='Start Time']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Click("Select 1AM as Start Time", L1.get(1), "xpath", "//div[contains(text(),'1:00 AM')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("'cannot schedule in past' Validation Message", "xpath", "//div[contains(text(),'You cannot schedule a notification to be released in the past')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Clock Icon", "xpath", "//i[contains(@class,'mdi-clock')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Click("Click > Start Time Input Field", L1.get(1), "xpath", "//input[@aria-label='Start Time']/parent::div", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text_Enter("Enter 9PM Start Time", L1.get(1), "xpath", "//input[@aria-label='Start Time']", "09:00PM", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Invalid Message > 'Cannot Schedule in past' is not Visible", "xpath", "//div[contains(text(),'You cannot schedule a notification to be released in the past')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Cancel Button", "xpath", "//div[contains(text(),'Cancel')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Create New Notification Button", "xpath", "//div[contains(text(),'Create New Notification')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Create New Notification Button", "xpath", "//*[contains(text(),'Create New Notification')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Verify New Notification">  
        List_L2("Get List of Records in Notification Management Table", "xpath", "//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Created Notification > Notification Name", L2.get(0), "xpath", "//div[contains(text(),'Auto-notif-test')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Created Notification > Notification Description", L2.get(0), "xpath", "//div[contains(text(),'Auto-notif-test-desc')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Created Notification > Notification Status", L2.get(0), "xpath", "//div[contains(text(),'Pending')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        String DATE = String.format(LocalDateTime.now().format(A.A.Date_formatter));
        String MONTH = DATE.substring(0,2);
        switch (MONTH) {
            case "01":
                if (DATE.charAt(3) == '0') {
                    DATE = "Jan " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jan " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "02":
                if (DATE.charAt(3) == '0') {
                    DATE = "Feb " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Feb " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "03":
                if (DATE.charAt(3) == '0') {
                    DATE = "Mar " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Mar " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "04":
                if (DATE.charAt(3) == '0') {
                    DATE = "Apr " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Apr " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "05":
                if (DATE.charAt(3) == '0') {
                    DATE = "May " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "May " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "06":
                if (DATE.charAt(3) == '0') {
                    DATE = "Jun " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jun " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "07":
                if (DATE.charAt(3) == '0') {
                    DATE = "Jul " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jul " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "08":
                if (DATE.charAt(3) == '0') {
                    DATE = "Aug " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Aug " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "09":
                if (DATE.charAt(3) == '0') {
                    DATE = "Sep " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Sep " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "10":
                if (DATE.charAt(3) == '0') {
                    DATE = "Oct " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Oct " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "11":
                if (DATE.charAt(3) == '0') {
                    DATE = "Nov " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Nov " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "12":
                if (DATE.charAt(3) == '0') {
                    DATE = "Dec " + DATE.charAt(4) + ", " + DATE.substring(6);
                } else {
                    DATE = "Dec " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            default:
                break;
        }
        Element_Child_Text("Created Notification > Date Scheduled", L2.get(0), "xpath", "//span[contains(text(),'" + DATE + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Edit and Cancel"> 
        Element_Child_Click("Click > Edit icon", L2.get(0), "xpath", "//i[contains(@class, 'mdi-pencil')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear > Notification Name", "xpath", "//input[@aria-label='Notification Name']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Name", "xpath", "//input[@aria-label='Notification Name']","Auto-notif-test-upd", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > Notification Description", "xpath", "//textarea[@aria-label='Notification Description']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Description", "xpath", "//textarea[@aria-label='Notification Description']","Auto-notif-test-desc-upd", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Date Input Field", "xpath", "//input[@aria-label='Date']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for 'Date Picker' control", "xpath", "//div[contains(@class,'v-picker--date')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Today's day", "xpath", "//button[contains(@class,'v-btn--active')]/div", ParentTest, "no_jira");
            if (FAIL) { return;}
        int day = Integer.parseInt(t);
        if (day >= 28) {
            Element_By_Path_Click("Click on Next Month Arrow", "xpath", "//i[contains(@class, 'mdi-chevron-right')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Click("Select A Later Date", "xpath", "//div[contains(@class, 'v-btn__content') and contains(text(),'1')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        } else {
            day = day+1;
            Element_By_Path_Click("Select A Later Date", "xpath", "//div[contains(@class, 'v-btn__content') and contains(text(),'" +String.valueOf(day)+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        Element_By_Path_Click("Click > Cancel Button", "xpath", "//div[contains(text(),'Cancel')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Navigate_to_URL("Navigate to Notifications page", url + "#/notification-manager/", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get List of Records in Notification Management Table", "xpath", "//tr", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Canceled edit Notification > Notification Name", L2.get(0), "xpath", "//div[contains(text(),'Auto-notif-test')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Canceled edit Notification > Notification Description", L2.get(0), "xpath", "//div[contains(text(),'Auto-notif-test-desc')]", ParentTest, "o_jira");
            if (FAIL) { return;}
        Element_Child_Text("Canceled edit Notification > Notification Status", L2.get(0), "xpath", "//div[contains(text(),'Pending')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_Text("Canceled edit Notification > Date Scheduled", L2.get(0), "xpath", "//span[contains(text(),'" +DATE+ "')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Edit and Save"> 
        Element_Child_Click("Click > Edit icon", L2.get(0), "xpath", "//i[contains(@class, 'mdi-pencil')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Input_Select_Clear("Clear > Notification Name", "xpath", "//input[@aria-label='Notification Name']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Name", "xpath", "//input[@aria-label='Notification Name']","Auto-notif-test-upd", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > Notification Description", "xpath", "//textarea[@aria-label='Notification Description']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Description", "xpath", "//textarea[@aria-label='Notification Description']","Auto-notif-test-desc-upd", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        /**
         * Get LocalTime and format it into a String with value 'HH:MMAM/PM' to edit a 'Pending'
         * Notification's Start Time with Current Time +1 minute for the purpose of Testing when
         * Status changes from 'Pending' to 'Released'
        **/
        LocalTime LT = LocalTime.now();
        String HH = String.valueOf(LT.getHour());
        String MM = String.valueOf(LT.getMinute() + 2);
        if (MM.length() == 1) {
            MM = "0" + MM;
        }
        String AMPM = "AM";
        if (LT.getHour() >= 12) {
           AMPM = "PM";
        }
        switch (HH) {
            case "13":
                HH = "01";
                break;
            case "14":
                HH = "02";
                break;
            case "15":
                HH = "03";
                break;
            case "16":
                HH = "04";
                break;
            case "17":
                HH = "05";
                break;
            case "18":
                HH = "06";
                break;
            case "19":
                HH = "07";
                break;
            case "20":
                HH = "08";
                break;
            case "21":
                HH = "09";
                break;
            case "22":
                HH = "10";
                break;
            case "23":
                HH = "11";
                break;
            case "00":
                HH = "12";
                break;
            default:
                break;
        }
        String updatedTime = HH + ":" + MM + AMPM;
        To_Bottom("Scroll to Bottom",  ParentTest, "no_jira");
        Thread.sleep(1000);      
        Element_By_Path_Text_Enter("Enter Current Time + 2 minute Start Time", "xpath", "//input[@aria-label='Start Time']", updatedTime, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Save Changes Button > Release Notification", "xpath", "//*[contains(text(),'Save Changes')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
            
            _t++;
            _i++;
            EX += _t + "\t" + "AP3 Notification" + "\t" + "Wait 2 min for Notification release" + "\t" + " - " + "\t" + "INFO" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("INFO", "Notification 2 min release delay", false, ParentTest.createNode(_t + ". " + "Wait 2 min for Notification release"), new Date()); 
            
            Thread.sleep(120000); // <<<<<<<<<<<<<<<<<<<<<<<<<<<
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Edit 'Released' Notification"> 
        //========== Edit Notification with 'Released' Status
        Refresh("Refresh for New Notification Status >  'Released", ParentTest, "no_jira");
        Thread.sleep(1000);
        Page_URL("AP3 Notification URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Get 'Released' Original Notification Name", "xpath", "(//div[contains(text(), 'Released')]/ancestor::tr)[1]/td[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        String NewNotificationName = t;
        Element_By_Path_Text("Original 'Released' Notification Description", "xpath", "(//div[contains(text(), 'Released')]/ancestor::tr)[1]/td[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        String nd = t;   
        Element_By_Path_Click("Click > Edit on Notif. with Released Status", "xpath", "//div[contains(text(),'" + NewNotificationName + "')]/ancestor::tr//i[contains(@class, 'mdi-pencil')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        //Released notification auto controller (AC)
        char AC = '1';
        if (NewNotificationName.charAt(NewNotificationName.length() - 1) != AC && nd.charAt(nd.length() - 1) != AC) {
            NewNotificationName = NewNotificationName + AC;
            nd = nd + AC;
        } else {
            NewNotificationName = NewNotificationName.substring(0, NewNotificationName.length() - 1);
            nd = nd.substring(0, nd.length() - 1);
        }
        Element_By_Path_Input_Select_Clear("Clear > Notification Name", "xpath", "//input[@aria-label='Notification Name']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Name", "xpath", "//input[@aria-label='Notification Name']", NewNotificationName, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > Notification Description", "xpath", "//textarea[@aria-label='Notification Description']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter > Updated Notification Description", "xpath", "//textarea[@aria-label='Notification Description']", nd, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Date Field is Disabled", "xpath", "//input[@aria-label='Date']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Time Field is Disabled", "xpath", "//input[@aria-label='Start Time']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Cancel Button", "xpath", "//div[contains(text(),'Cancel')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Save Changes Button", "xpath", "//*[contains(text(),'Save Changes')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(5000);
        Element_By_Path_Text("Updated > Notif. Name on Released Notif.", "xpath", "//div[contains(text(), '" + NewNotificationName + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Updated > Notif. Desc. on Released Notif.", "xpath", "//div[contains(text(), '" + NewNotificationName + "')]/ancestor::tr/td[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Verify 'Pending' to 'Released' Status Change"> 
        /**
         * Compare Current LocalTime with the Previous LocalTime; Loop as long as Current Minutes Value = Previous Minutes Value
         * This is required to wait for Notification with 'Pending' status to change to 'Released' for the purpose of testing
         * Bell Notification Count and Clicking on 'Unread' Notification card in side panel and verify it has been 'read' by 
         * Comparing the Count before click and after click 
        **/
        int i = 1;
        for(int j = 0; j < i; j++) {
            LocalTime CLT = LocalTime.now();
            if (CLT.getMinute() == LT.getMinute()) {
                i++; //<------ loop breaker          
            } else {
                Navigate_to_URL("Navigate to Notifications page", url + "#/notification-manager/", ParentTest, "no_jira");
            }
            Thread.sleep(1000);  //<------- this should limit the loop to run once per second until the condition is no longer met 
        }
        Page_URL("AP3 Notification URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Updated Notification Name", "xpath", "//div[contains(text(),'Auto-notif-test-upd')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Updated Notification Description", "xpath", "//div[contains(text(),'Auto-notif-test-desc-upd')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Status has Changed from 'Pending' > 'Released'", "xpath", "//div[contains(text(),'Released')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text("Bell Notif. - New Notifications Number", "xpath", "(//button[contains(@class, 'bell-button')])[1]//span", ParentTest, "no_jira");
            if (FAIL) { return;}
        int BNN = Integer.parseInt(t);
        Element_By_Path_Click("Click > Bell icon", "xpath", "(//button[contains(@class, 'bell-button')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Bell Notif. Panel", "xpath", "(//aside[contains(@class,'v-navigation-drawer')])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > First Notif. Card in the list", "xpath", "(//div[contains(@class,'notification-card')])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        if(BNN > 1){
            Element_By_Path_Text("Bell Notif. - Updated Number", "xpath", "(//button[contains(@class, 'bell-button')])[1]//span", ParentTest, "no_jira");
        }
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Delete Notification"> 
        Refresh("Refresh Notifications page", ParentTest, "no_jira");
            if (FAIL) { return;}
//        Wait_For_Element_By_Path_Presence("Wait for 'New Notif' Name in the table", "xpath", "//div[contains(text(), '" + NewNotificationName + "')])", ParentTest, "no_jira");
//            if (FAIL) { return;}  
        Thread.sleep(1000);
        Page_URL("AP3 Notification URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("'" + NewNotificationName + "' > Delete", "xpath", "//div[contains(text(), '" + NewNotificationName + "')]/ancestor::tr//i[contains(@class, 'mdi-delete')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Visibility("Delete Confirmation Dialog", "xpath", "//div[contains(@class, 'confirm-dialog v-card')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Delete in Dialog", "xpath", "//*[contains(text(),'DELETE')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);            
        Wait_For_Element_By_Path_InVisibility("Deleted New Notification no Longer in the Table", "xpath", "//div[contains(text(), '" + NewNotificationName + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        // </editor-fold>

    } catch (Exception ex){}   // =============================================  
    } 
}
