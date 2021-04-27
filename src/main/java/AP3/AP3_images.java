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

/**
 * @author astrit.ademi
 */
public class AP3_images {

    public static void run() throws InterruptedException {
        /*
        * currently only in staging
        * App: Thrive, Site: Ap3 Automation, Brand: Starbucks
        */        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'Yes'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'Yes'" + "\t" + " == Toggle Allow Images to 'Yes' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(2000);
        //check initial api
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Check API before toggle", BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, "no_jira");
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray companies = new JSONArray();
        companies = json.getJSONArray("companies");
        JSONObject json2 = companies.getJSONObject(2);
        JSONArray locations = new JSONArray();
        locations = json2.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            if (location.getString("name").contains("Building A")) {
                JSONArray brands = new JSONArray();
                brands = location.getJSONArray("brands");
                for (int j = 0; j < brands.length(); j++) {
                    JSONObject brand = brands.getJSONObject(j);
                    if (brand.getString("location_description").contains("100th floor, canteen area")) {
                        if (brand.getJSONObject("is").getBoolean("local_images_enabled")) {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "images are disabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "iamges are disabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'No'
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Images' > 'Yes'", "xpath", "//div[contains(text(),'Yes')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Yes' is Selected", "xpath", "//div[contains(text(),'No')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        json = new JSONObject(API_Response_Body);
        companies = new JSONArray();
        companies = json.getJSONArray("companies");
        json2 = companies.getJSONObject(2);
        locations = new JSONArray();
        locations = json2.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            if (location.getString("name").contains("Building A")) {
                JSONArray brands = new JSONArray();
                brands = location.getJSONArray("brands");
                for (int j = 0; j < brands.length(); j++) {
                    JSONObject brand = brands.getJSONObject(j);
                    if (brand.getString("location_description").contains("100th floor, canteen area")) {
                        if (brand.getJSONObject("is").getBoolean("local_images_enabled")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "images are enabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "iamges are enabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        TWeb.Refresh("Refresh Brand List Page", "no_jira");
        Thread.sleep(2000);
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
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Upload image area is exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        File tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png");
        if(tmp.exists()) {
            _t++; TWeb.Element_By_Path_Text_Enter("Upload Item Image", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png", false, "no_jira"); 
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
        Thread.sleep(500);
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
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Image area does not exist", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="'Allow Images in Local Menu' set to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== 'Allow Images in Local Menu' set to 'No'" + "\t" + " == 'Allow Images in Local Menu' set to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        EX += " - " + "\t" + " === " + "\t" + " ===== Re-upload Image to Item in Global Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        TWeb.Refresh("Refresh Global Menu Page", "no_jira");
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
        tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg");
        if(tmp.exists()) {
            _t++; TWeb.Element_By_Path_Text_Enter("Upload Item Image", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg", false, "no_jira"); 
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
        Thread.sleep(2000);
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
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[5]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
    }
}
