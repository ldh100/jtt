/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author astrit.ademi
 */
public class AP3_fr_menu_upload extends AP3_GUI{
    String API_Response_Body = ""; 
    String AAA = "";
    protected AP3_fr_menu_upload (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;        
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
        AP3_TKN = a.AP3_TKN;
        
        app = a.app;
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        SECTOR = a.SECTOR;
        SectorID = a.SectorID;
        GL_MENU = a.GL_MENU;
        CompanyID = a.CompanyID;
        
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    } 
//    String MenuName = "";
//    String MenuID = ""; 
//    List<WebElement> Menus = null;
//    List<WebElement> Menu_IDS = null;
//    String Excel_Edit = "";
//    String Export_File_Name = "";   
//    String Backup_File_Name = "";
//    String Download_Dir = System.getProperty("user.home") + File.separator + "Downloads";  
//    String[] ValuesToWrite;
//    String Errors = "";
     protected void run() throws Exception {
         
         appId = "014B6RP683C2QL7X00oDS86lrKOO14twGXQwzDARCgympJ42Q5SD1LWZ2gppTOGd4eov2GcePXaa59Zquma";
         SiteID = "jDPLyJKy3et2e6LqJeLvCdl30XBvLyu5YNaWvWozs8mqY0lZEPFOKeKvGoALFB2py2zQYyIjgR";
         
        Navigate_to_URL("Navigate to Station List Page", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'FR Menu Import Testing')]", ParentTest, "no_jira");
            if (FAIL) {return;}
         Element_By_Path_Click("Click on Station", "xpath", "//*[contains(text(),'FR Menu Import Testing')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(),'Import menu')]/ancestor::button", ParentTest, "no_jira");
            if (FAIL) {return;}
            // //input[contains(@accept, '.json')] locator for input to send file to for upload
        EX += " - " + "\t" + " === " + "\t" + " ===== Upload original FR menu json" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            File tmp = new File(System.getProperty("user.dir")+File.separator+ "FilesToUpload" +File.separator+ "Fr_menu_original.json");
            if(tmp.exists()) {
                d1.findElement(By.xpath("//input[contains(@accept, '.json')]")).sendKeys(System.getProperty("user.dir")+File.separator+ "FilesToUpload" +File.separator+ "Fr_menu_original.json");
                Thread.sleep(5000);
                _t++; 
//                Find_Text("Toast message", "Menu successfully uploaded", true, ParentTest, "no_jira");
//                    if (FAIL) { return;}
            }
         Element_E1_Find("Find > Test Frictionless Menu Import breadcrumb", "xpath", "(//a[text()='Test Frictionless Menu Import'])[2]", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > Test Frictionless Menu Import breadcrumb", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(), 'ADD STATION')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        Element_E1_Find("Find > 'VIEW MENU' button", "xpath", "//td[contains(text(),'FR Menu Import Testing')]/ancestor::tr//div[normalize-space()='VIEW MENU']", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > 'VIEW MENU' button", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[@class='H4-Secondary-Center'][normalize-space()='General Store']", ParentTest, "no_jira");
            if (FAIL) {return;}
        Element_E1_Find("Find > 'FR Menu set'", "xpath", "//div[contains(text(), 'Frictionless Menu')]/ancestor::div[@class='flex xs12 list-item list-item-large']", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > 'FR Menu set'", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//span[@class='Button-Primary-Center' and contains(text(),'Please select items for bulk update')]", ParentTest, "no_jira");
            if (FAIL) {return;}
         List_L1("List of Item Names", "xpath", "(//tbody)[9]/tr/td[3]/div", ParentTest, "no_jira");
            if (FAIL) {return;}
         List<WebElement> originalItemNames = L1;
         List_L2("List of Item Prices", "xpath", "(//tbody)[9]/tr/td[5]", ParentTest, "no_jira");
            if (FAIL) {return;}
         List<WebElement> originalItemPrices = L2;
         
//         String sectorId = "QDaXdWJdvktvLG5qXwYOhwWgGE6LNJC9aXDReBJdHjWlq50lGgFZyXzJ6mLmsvYw17zkjXtDeGQM";
//         String companyId = "PpzmrEBrveHRB9NLLoAet3dwyv1kl2tRB2rayqrNSe1dD5ev97HlXlOWPR95UQoZwMdMk7HEa1aDj";
//         String brandId = "yy9mGPrGD0HA3ARyEpJ4FaMEXpX6GQuY9BLrwYwKsp3KavQlvriKQKdNlDJvFwO56r8KvrTJ5M";
         
         Navigate_to_URL("Navigate to Station List Page", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(),'FR Menu Import Testing')]", ParentTest, "no_jira");
            if (FAIL) {return;}
         Element_By_Path_Click("Click on Station", "xpath", "//*[contains(text(),'FR Menu Import Testing')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(),'Import menu')]/ancestor::button", ParentTest, "no_jira");
            if (FAIL) {return;}
            // //input[contains(@accept, '.json')] locator for input to send file to for upload
        EX += " - " + "\t" + " === " + "\t" + " ===== Upload original FR menu json" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            File tmp2 = new File(System.getProperty("user.dir")+File.separator+ "FilesToUpload" +File.separator+ "Fr_menu_add_new.json");
            if(tmp2.exists()) {
                d1.findElement(By.xpath("//input[contains(@accept, '.json')]")).sendKeys(System.getProperty("user.dir")+File.separator+ "FilesToUpload" +File.separator+ "Fr_menu_add_new.json");
                Thread.sleep(5000);
                _t++; 
//                Find_Text("Toast message", "Menu successfully uploaded", true, ParentTest, "no_jira");
//                    if (FAIL) { return;}
            }
         Element_E1_Find("Find > Test Frictionless Menu Import breadcrumb", "xpath", "(//a[text()='Test Frictionless Menu Import'])[2]", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > Test Frictionless Menu Import breadcrumb", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(), 'ADD STATION')]", ParentTest, "no_jira");
            if (FAIL) {return;}
        Element_E1_Find("Find > 'VIEW MENU' button", "xpath", "//td[contains(text(),'FR Menu Import Testing')]/ancestor::tr//div[normalize-space()='VIEW MENU']", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > 'VIEW MENU' button", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[@class='H4-Secondary-Center'][normalize-space()='General Store']", ParentTest, "no_jira");
            if (FAIL) {return;}
        Element_E1_Find("Find > 'FR Menu set'", "xpath", "//div[contains(text(), 'Frictionless Menu')]/ancestor::div[@class='flex xs12 list-item list-item-large']", ParentTest, "npp_jira");
         if (FAIL) { return;}
         Element_Click("Click > 'FR Menu set'", e1, ParentTest, "no_jira");
         if (FAIL) { return;}
         Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//span[@class='Button-Primary-Center' and contains(text(),'Please select items for bulk update')]", ParentTest, "no_jira");
            if (FAIL) {return;}
         List_L1("List of Item Names", "xpath", "(//tbody)[9]/tr/td[3]/div", ParentTest, "no_jira");
            if (FAIL) {return;}
         List<WebElement> updatedItemNames = L1;
         List_L2("List of Item Prices", "xpath", "(//tbody)[9]/tr/td[5]", ParentTest, "no_jira");
            if (FAIL) {return;}
         List<WebElement> updatedItemPrices = L2;
         if (originalItemNames.size()+2 == updatedItemNames.size()) {
            _t++;
            _p++; EX += _t + "\t" + "Number of items after update should be " + originalItemNames.size()+2 + "\t" + "-" + "\t" + updatedItemNames.size() + "\t" + "PASS" + "\t" 
                    + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
            Log_Html_Result("PASS", String.valueOf(updatedItemNames.size()), false, ParentTest.createNode(_t + "Number of items after update should be " + originalItemNames.size()+2), new Date());   
         }
         
     }   
}
