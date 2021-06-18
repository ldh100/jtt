/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import static A.A.*;
import A.TWeb;
import static AP3.AP3.*;
import java.io.File;
import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 * @author astrit.ademi
 */
public class AP3_images {

    public static void run() throws InterruptedException {
        /*
        * currently only in staging
        * Tes data to be used in JTT:
        * App - Thrive, Site - Ap3 Automation, Brand - Starbucks
        */ 
        if (!env.equals("PR")) {
        // <editor-fold defaultstate="collapsed" desc="Add New Brand has 'Allow Images in Global Menu' set to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand has 'Allow Images in Global Menu' set to 'No'" + "\t" + " == Add New Brand has 'Allow Images in Global Menu' set to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand List", url + "#/sites/" + appId + "/site/" + SiteID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        //add new brand and check 'Allow Local Menu Images' toggle is disabled
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > ADD STATION", "xpath", "//div[contains(text(),'ADD STATION')]/parent::button", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Group > 'Automation only/CA'", "xpath", "//*[contains(text(),'Automation only')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Global Menu Assignaton' dropdown", "css", "[aria-label='Global Menu Assignation']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Global Menu > 'Starbucks'", "xpath", "//*[contains(text(),'Starbucks')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' toggle is Disabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'Yes'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'Yes'" + "\t" + " == Toggle Allow Images to 'Yes' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, "no_jira");
        if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(text(),'LEAVE')]")).size() > 0) {
            d1.findElement(By.xpath("//*[contains(text(),'LEAVE')]")).click();
        }
        Thread.sleep(1000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > '+ GLOBAL MENU' button", "xpath", "//*[contains(text(),'Global Menu')]/parent::button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'No' is Selected by default", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[2]", "no_jira");
        if (FAIL) { return;}
        //check initial api
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Check API before toggle", BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, "no_jira");
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray companies = new JSONArray();
        companies = json.getJSONArray("companies");
        JSONObject json2 = companies.getJSONObject(2);
        JSONObject is = json2.getJSONObject("is");
        if (is.getBoolean("global_images_enabled")) {
             _t++;
             _f++; EX += _t + "\t" + "API - Global Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"global_images_enabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
             _t++;
             _p++; EX += _t + "\t" + "API - Global Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"global_images_enabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }                              
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'Yes'
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Images' > 'Yes'", "xpath", "//div[contains(text(),'Yes')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Yes' is Selected", "xpath", "//div[contains(text(),'No')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Check API before toggle", BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, "no_jira");
        json = new JSONObject(API_Response_Body);
        companies = new JSONArray();
        companies = json.getJSONArray("companies");
        json2 = companies.getJSONObject(2);
        is = json2.getJSONObject("is");
        if (is.getBoolean("global_images_enabled")) {
             _t++;
             _p++; EX += _t + "\t" + "API - Global Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"global_images_enabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
             _t++;
             _f++; EX += _t + "\t" + "API - Global Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"global_images_enabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand as 'Allow Images in Global Menu' set to 'Yes'" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand List", url + "#/sites/" + appId + "/site/" + SiteID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        //add new brand and check 'Allow Local Menu Images' toggle is enabled
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > ADD STATION", "xpath", "//div[contains(text(),'ADD STATION')]/parent::button", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Group > 'Automation only/CA'", "xpath", "//*[contains(text(),'Automation only')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Global Menu Assignaton' dropdown", "css", "[aria-label='Global Menu Assignation']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Global Menu > 'Starbucks'", "xpath", "//*[contains(text(),'Starbucks')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > 'Allow Local Menu Images' toggle is Enabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand as 'Allow Images in Global Menu' set to 'Yes'" + "\t" + " == End >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(text(),'LEAVE')]")).size() > 0) {
            d1.findElement(By.xpath("//*[contains(text(),'LEAVE')]")).click();
        }
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(5000);
        //check initial api
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Check API before toggle", BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, "no_jira");
        json = new JSONObject(API_Response_Body);
        companies = new JSONArray();
        companies = json.getJSONArray("companies");
        json2 = companies.getJSONObject(2);
        JSONArray locations = new JSONArray();
        locations = json2.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            if (location.getString("name").contains("Builiding A")) {
                JSONArray brands = new JSONArray();
                brands = location.getJSONArray("brands");
                for (int j = 0; j < brands.length(); j++) {
                    JSONObject brand = brands.getJSONObject(j);
                    if (brand.getString("location_description").contains("100th floor, canteen area")) {
                        if (brand.getJSONObject("is").getBoolean("local_images_enabled")) {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Local Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Local Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Local Menu Images' > 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'Yes')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' Toggled to 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'No')])[5]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save Changes'", "xpath", "//div[contains(text(),'Save Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Check API before toggle", BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, "no_jira");
        json = new JSONObject(API_Response_Body);
        companies = new JSONArray();
        companies = json.getJSONArray("companies");
        json2 = companies.getJSONObject(2);
        locations = new JSONArray();
        locations = json2.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            if (location.getString("name").contains("Builiding A")) {
                JSONArray brands = new JSONArray();
                brands = location.getJSONArray("brands");
                for (int j = 0; j < brands.length(); j++) {
                    JSONObject brand = brands.getJSONObject(j);
                    if (brand.getString("location_description").contains("100th floor, canteen area")) {
                        if (brand.getJSONObject("is").getBoolean("local_images_enabled")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Local Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Local Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Add an Image to Global Menu Item"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Add an Image to Global Menu Item" + "\t" + " == Add an Image to Global Menu Item >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Upload image area exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(@class,'icon-remove')]")).size() > 0){
            EX += " - " + "\t" + " === " + "\t" + " ===== Remove image from previous test run" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(500);
        }
        //try non png,jpg file
        EX += " - " + "\t" + " === " + "\t" + " ===== Try upload non jpg/png file type" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        File tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_test_pdf_in_image.pdf");
        if(tmp.exists()) {
            d1.findElement(By.xpath("//input[@type='file']")).sendKeys(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_test_pdf_in_image.pdf");
            _t++; TWeb.Find_Text("Toast message", "Invalid file type, choose a jpg or png file.", true, "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Try upload non jpg/png file type" + "\t" + " == End >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png");
        if(tmp.exists()) {
            _t++; TWeb.Element_By_Path_Text_Enter("Upload Item Image with png extension", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png", false, "no_jira"); 
            if (FAIL) { return;}
        }
        else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File : Ap3_image1  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Remove Image Icon exists", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check for Image in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Image area exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Image was removed", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Image area to re-add image", "xpath", "//canvas", "no_jira"); 
        if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Image was re-added", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
       // <editor-fold defaultstate="collapsed" desc="Remove Image from Global Menu Item"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Remove Image from Global Menu Item" + "\t" + " == Remove Image from Global Menu Item >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n"; 
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Global Menu Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Image was Removed in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Local Menu Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Image area does not exist", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="'Allow Images in Local Menu' set to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== 'Allow Images in Local Menu' set to 'No'" + "\t" + " == 'Allow Images in Local Menu' set to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        EX += " - " + "\t" + " === " + "\t" + " ===== Re-upload Image to Item in Global Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Global Menu Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg");
        if(tmp.exists()) {
            _t++; TWeb.Element_By_Path_Text_Enter("Upload Item Image with jpg extension", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg", false, "no_jira"); 
            if (FAIL) { return;}
        }
        else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File : Ap3_image1-jpg  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        EX += " - " + "\t" + " === " + "\t" + " ===== Navigate to Station Configuration Page and Toggle 'Allow Local Menu Images' to 'No' " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        TWeb.Refresh("Refresh Station Configuration Page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Local Menu Images' > 'No'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'No')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' Toggled to 'No'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'Yes')])[5]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save Changes'", "xpath", "//div[contains(text(),'Save Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Image Area does not exist in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Image area does not exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'No'" + "\t" + " == Toggle Allow Images to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'No'
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Images' > 'No'", "xpath", "//div[contains(text(),'No')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' toggle is Disabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", "no_jira");
        if (FAIL) { return;}
        //navigate to global menu and check that images cannot be added
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Upload image area does not exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "//div[@class='flex shrink']//*[contains(text(),'Cancel')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        }
    }
}
