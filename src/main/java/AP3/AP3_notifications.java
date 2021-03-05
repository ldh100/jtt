/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.TWeb;
import static A.A.*;
import java.time.LocalDateTime;
/**
 *
 * @author Oleg.Spozito
 */
public class AP3_notifications {
    public static void run() throws InterruptedException {
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("AP3 Dashboard URL", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Ap3 Notification' Click", "xpath", "//*[contains(text(), 'Notification')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Page title > 'AP3 Notification Management'", "xpath", "//span[contains(text(),'AP3 Notification Management')]", "no_jira");
        if (FAIL) { return;}
        //========= Verify Notifications Page
        _t++; Thread.sleep((long) sleep); TWeb.List_L3("Ap3 Notifications table headers", "xpath", "//*[@role='columnheader']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Notification Name", L3.get(0), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Notification Description", L3.get(1), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Notification Status", L3.get(2), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Date Scheduled", L3.get(3), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Action", L3.get(4), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Calendar icon", "xpath", "//i[contains(@class, 'mdi-calendar')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Edit icon", "xpath", "//i[contains(@class, 'mdi-pencil')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Delete icon", "xpath", "//i[contains(@class, 'mdi-delete')]", "no_jira");
        if (FAIL) { return;}
        //========= click on + New Notification then Verify the Page and Create a New Notification
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Add New Notifications Button", "xpath", "//*[contains(text(), 'New Notification')]/parent::button", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
//        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Create New In App Notification Section", "xpath", "//div[contains(text(),'Create New In App Notification')]", "no_jira");
//            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L2("List of Breadcrumb Items", "xpath", "//a[contains(@class,'v-breadcrumbs__item')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("AP3 Notification Management", L2.get(0), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Text("Create New In App Notification", L2.get(1), "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Notification Cofiguration Sections", "xpath", "//div[contains(@class,'v-card-content')]/parent::div/parent::div", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Notification Name", L1.get(0), "xpath", "//div[contains(text(),'Notification Name')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text_Enter("Enter Notification Name", L1.get(0), "xpath", "//input[@aria-label='Notification Name']", "Auto-notif-test", false ,"no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text_Enter("Enter Notification Description", L1.get(0), "xpath", "//textarea[@aria-label='Notification Description']", "Auto-notif-test-desc", false ,"no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Send Schedule", L1.get(1), "xpath", "//div[contains(text(),'Send Schedule')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Select Date", L1.get(1), "xpath", "//div[contains(text(),'Select Date')]","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click > Date Input Field", L1.get(1), "xpath", "//input[@aria-label='Date']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Date Picker", "xpath", "//div[contains(@class,'v-picker--date')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Select Toady's Date", L1.get(1), "xpath", "//button[contains(@class,'v-btn--active')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Calendar Icon", "xpath", "//i[contains(@class,'mdi-calendar')]", "no_jira");
        if (FAIL) { return;}
        TWeb.To_Bottom("no_jira");
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click > Start Time Input Field", L1.get(1), "xpath", "//input[@aria-label='Start Time']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Start Time Dropdown List", "xpath", "//div[contains(@class,'v-select-list')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Select 1AM as Start Time", L1.get(1), "xpath", "//div[contains(text(),'1:00 AM')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Invalid Message > 'Cannot Schedule in past' is Visible", "xpath", "//div[contains(text(),'You cannot schedule a notification to be released in the past')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Clock Icon", "xpath", "//i[contains(@class,'mdi-clock')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click > Start Time Input Field", L1.get(1), "xpath", "//input[@aria-label='Start Time']/parent::div", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text_Enter("Enter 6PM Start Time", L1.get(1), "xpath", "//input[@aria-label='Start Time']", "06:00PM", false ,"no_jira");
        if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Scroll_XY_In_Element_By_Path("Move to 6PM option", "xpath", "//div[contains(@class,'v-select-list')]/div", 0, 50, "no_jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Select 6PM as Start Time", L1.get(1), "xpath", "//div[contains(text(),'6:00 PM')]", "no_jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Times in Dropdown", "xpath", "//div[contains(@class,'v-select-list')]//div[@role='listitem']", "no_jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 6PM as Start Time", L0.get(74), "no_jira");
//            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Invalid Message > 'Cannot Schedule in past' is not Visible", "xpath", "//div[contains(text(),'You cannot schedule a notification to be released in the past')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Cancel Button", "xpath", "//div[contains(text(),'Cancel')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Create New Notification Button", "xpath", "//div[contains(text(),'Create New Notification')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Create New Notification Button", "xpath", "//*[contains(text(),'Create New Notification')]/parent::button", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L3("Get List of Records in Notification Management Table", "xpath", "//tr", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Created Notification > Notification Name", L3.get(0), "xpath", "//div[contains(text(),'Auto-notif-test')]","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Created Notification > Notification Description", L3.get(0), "xpath", "//div[contains(text(),'Auto-notif-test-desc')]","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Created Notification > Notification Status", L3.get(0), "xpath", "//div[contains(text(),'Pending')]", "no_jira");
        if (FAIL) { return;}
        String DATE = String.format(LocalDateTime.now().format(Date_formatter));
        String MONTH = DATE.substring(0,2);
        switch (MONTH) {
            case "01":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Jan " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jan " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "02":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Feb " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Feb " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "03":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Mar " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Mar " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "04":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Apr " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Apr " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "05":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "May " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "May " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "06":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Jun " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jun " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "07":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Jul " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jul " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "08":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Aug " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Aug " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "09":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Sep " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Sep " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "10":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Oct " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Oct " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "11":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Jan " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Jan " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            case "12":
                if (DATE.substring(3,4).equals("0")) {
                    DATE = "Dec " + DATE.substring(4,5) + ", " + DATE.substring(6);
                } else {
                    DATE = "Dec " + DATE.substring(3,5) + ", " + DATE.substring(6);
                }
                break;
            default:
                break;
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Created Notification > Date Scheduled", L3.get(0), "xpath", "//span[contains(text(),'"+DATE+"')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click > Edit icon", L3.get(0), "xpath", "//i[contains(@class, 'mdi-pencil')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear > Notification Name", "xpath", "//input[@aria-label='Notification Name']","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter > Updated Notification Name", "xpath", "//input[@aria-label='Notification Name']","Auto-notif-test-upd", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Input_Select_Clear("Clear > Notification Name", "xpath", "//textarea[@aria-label='Notification Description']","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter > Updated Notification Name", "xpath", "//textarea[@aria-label='Notification Description']","Auto-notif-test-desc-upd", false, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Save Changes Button", "xpath", "//*[contains(text(),'Save Changes')]/parent::button", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.List_L3("Get List of Records in Notification Management Table", "xpath", "//tr", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Updated Notification Name", L3.get(0), "xpath", "//div[contains(text(),'Auto-notif-test-upd')]","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Updated Notification Description", L3.get(0), "xpath", "//div[contains(text(),'Auto-notif-test-desc-upd')]","no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Click("Click > Delete icon", L3.get(0), "xpath", "//i[contains(@class, 'mdi-delete')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Delete Confirmation Dialog", "xpath", "//div[contains(@class,'confirm-dialog v-card')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Delete in Dialog", "xpath", "//*[contains(text(),'DELETE')]/parent::button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Deleted Notification no Longer in the Table", "xpath", "//div[contains(text(),'Auto-notif-test-upd')]", "no_jira");
        if (FAIL) { return;}
    }
}
