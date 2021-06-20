package AP3_New;

import java.io.File;
import java.time.LocalDateTime;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 * @author astrit.ademi
 */
class AP3_images extends AP3_GUI{
    protected AP3_images (AP3_GUI a) throws InterruptedException, Exception {
        d1 = a.d1; 
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        url = a.url;

        AP3_TKN = a.AP3_TKN;
        
        BaseAPI = a.BaseAPI;
        New_ID = a.New_ID;
        app = a.app;
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        SECTOR = a.SECTOR;
        SectorID = a.SectorID;
        GL_MENU = a.GL_MENU;
        CompanyID = a.CompanyID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        TZone = a.TZone;
    } 
    protected void run() throws InterruptedException, Exception {
        /*
        * currently only in staging
        * Tes data to be used in JTT:
        * App - Thrive, Site - Ap3 Automation, Brand - Starbucks
        */ 
        if (!env.equals("PR")) {
        // <editor-fold defaultstate="collapsed" desc="Add New Brand has 'Allow Images in Global Menu' set to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand has 'Allow Images in Global Menu' set to 'No'" + "\t" + " == Add New Brand has 'Allow Images in Global Menu' set to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        Navigate_to_URL("Navigate to Site -> Brand List", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        //add new brand and check 'Allow Local Menu Images' toggle is disabled
        Element_By_Path_Click("Click > ADD STATION", "xpath", "//div[contains(text(),'ADD STATION')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Select Group > 'Automation only/CA'", "xpath", "//*[contains(text(),'Automation only')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Open 'Global Menu Assignaton' dropdown", "css", "[aria-label='Global Menu Assignation']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Select Global Menu > 'Starbucks'", "xpath", "//*[contains(text(),'Starbucks')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' toggle is Disabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'Yes'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'Yes'" + "\t" + " == Toggle Allow Images to 'Yes' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, ParentTest, "no_jira");
            if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(text(),'LEAVE')]")).size() > 0) {
            d1.findElement(By.xpath("//*[contains(text(),'LEAVE')]")).click();
        }
Thread.sleep(1000);
        Refresh("Refresh Brand List Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > '+ GLOBAL MENU' button", "xpath", "//*[contains(text(),'Global Menu')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'No' is Selected by default", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        //check initial api
        Call_API("Check API before toggle", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, ParentTest, "no_jira");
        JSONObject json = new JSONObject(t);
        JSONArray companies = new JSONArray();
        companies = json.getJSONArray("companies");
        JSONObject json2 = companies.getJSONObject(2);
        JSONObject is = json2.getJSONObject("is");
        if (is.getBoolean("global_images_enabled")) {
             _t++;
             _f++; EX += _t + "\t" + "API - Global Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"global_images_enabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
             _t++;
             _p++; EX += _t + "\t" + "API - Global Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"global_images_enabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }                              
        Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        //toggle 'Allow Images' to 'Yes'
        Element_By_Path_Click("Toggle 'Allow Images' > 'Yes'", "xpath", "//div[contains(text(),'Yes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Yes' is Selected", "xpath", "//div[contains(text(),'No')]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh page", ParentTest, "no_jira");
Thread.sleep(5000);
        Call_API("Check API before toggle", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, ParentTest, "no_jira");
        json = new JSONObject(t);
        companies = new JSONArray();
        companies = json.getJSONArray("companies");
        json2 = companies.getJSONObject(2);
        is = json2.getJSONObject("is");
        if (is.getBoolean("global_images_enabled")) {
             _t++;
             _p++; EX += _t + "\t" + "API - Global Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"global_images_enabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } else {
             _t++;
             _f++; EX += _t + "\t" + "API - Global Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"global_images_enabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand as 'Allow Images in Global Menu' set to 'Yes'" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        Navigate_to_URL("Navigate to Site -> Brand List", url + "#/sites/" + appId + "/site/" + SiteID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        //add new brand and check 'Allow Local Menu Images' toggle is enabled
        Element_By_Path_Click("Click > ADD STATION", "xpath", "//div[contains(text(),'ADD STATION')]/parent::button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Open 'Group' dropdown", "css", "[aria-label='Group']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Select Group > 'Automation only/CA'", "xpath", "//*[contains(text(),'Automation only')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Open 'Global Menu Assignaton' dropdown", "css", "[aria-label='Global Menu Assignation']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Select Global Menu > 'Starbucks'", "xpath", "//*[contains(text(),'Starbucks')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Check > 'Allow Local Menu Images' toggle is Enabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== Add New Brand as 'Allow Images in Global Menu' set to 'Yes'" + "\t" + " == End >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        //navigate to the sites -> brand -> settings
        Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(text(),'LEAVE')]")).size() > 0) {
            d1.findElement(By.xpath("//*[contains(text(),'LEAVE')]")).click();
        }
Thread.sleep(2000);
        Refresh("Refresh Brand List Page", ParentTest, "no_jira");
Thread.sleep(5000);
        //check initial api
        Call_API("Check API before toggle", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, ParentTest, "no_jira");
        json = new JSONObject(t);
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
                            _f++; EX += _t + "\t" + "API - Local Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Local Menu Images are Disabled" + "\t" + "images are disabled" + "\t" + "{\"local_images_enabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Toggle 'Allow Local Menu Images' > 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'Yes')])[5]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' Toggled to 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'No')])[5]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes'", "xpath", "//div[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh page", ParentTest, "no_jira");
Thread.sleep(5000);
        Call_API("Check API before toggle", "Bearer " + AP3_TKN, BaseAPI + "/location/sector/" + SectorID + "?nocache=true&expanded=true", true, ParentTest, "no_jira");
        json = new JSONObject(t);
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
                            _p++; EX += _t + "\t" + "API - Local Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Local Menu Images are Enabled" + "\t" + "images are enabled" + "\t" + "{\"local_images_enabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        }
                    }
                }
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Add an Image to Global Menu Item"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Add an Image to Global Menu Item" + "\t" + " == Add an Image to Global Menu Item >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Brand List Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Check > Upload image area exists", "xpath", "//canvas", ParentTest, "no_jira");
            if (FAIL) { return;}
        if (d1.findElements(By.xpath("//*[contains(@class,'icon-remove')]")).size() > 0){
            EX += " - " + "\t" + " === " + "\t" + " ===== Remove image from previous test run" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
            Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        }
        //try non png,jpg file
        EX += " - " + "\t" + " === " + "\t" + " ===== Try upload non jpg/png file type" + "\t" + " == Start >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        File tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_test_pdf_in_image.pdf");
        if(tmp.exists()) {
            d1.findElement(By.xpath("//input[@type='file']")).sendKeys(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_test_pdf_in_image.pdf");
            _t++; Find_Text("Toast message", "Invalid file type, choose a jpg or png file.", true, ParentTest, "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== Try upload non jpg/png file type" + "\t" + " == End >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png");
        if(tmp.exists()) {
            Element_By_Path_Text_Enter("Upload Item Image with png extension", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1.png", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        }
        else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File : Ap3_image1  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Check > Remove Image Icon exists", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(5000);
        Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check for Image in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Brand List Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Check > Image area exists", "xpath", "//canvas", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Check > Image was removed", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click > Image area to re-add image", "xpath", "//canvas", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_Presence("Check > Image was re-added", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Remove Image from Global Menu Item"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Remove Image from Global Menu Item" + "\t" + " == Remove Image from Global Menu Item >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n"; 
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Global Menu Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > 'Remove Icon' on Image", "xpath", "//*[contains(@class,'icon-remove')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Image was Removed in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Local Menu Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_InVisibility("Check > Image area does not exist", "xpath", "//canvas", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="'Allow Images in Local Menu' set to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== 'Allow Images in Local Menu' set to 'No'" + "\t" + " == 'Allow Images in Local Menu' set to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        EX += " - " + "\t" + " === " + "\t" + " ===== Re-upload Image to Item in Global Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Global Menu Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        tmp = new File(System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg");
        if(tmp.exists()) {
            _t++; Element_By_Path_Text_Enter("Upload Item Image with jpg extension", "xpath", "//input[@type='file']", System.getProperty("user.dir")+File.separator+"FilesToUpload"+File.separator+"Ap3_image1-jpg.jpg", false, ParentTest, "no_jira"); 
            if (FAIL) { return;}
        }
        else {
            _t++; 
            _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File : Ap3_image1-jpg  " + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(),'Apply Changes')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        EX += " - " + "\t" + " === " + "\t" + " ===== Navigate to Station Configuration Page and Toggle 'Allow Local Menu Images' to 'No' " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(1000);
        Refresh("Refresh Station Configuration Page", ParentTest, "no_jira");
Thread.sleep(5000);
        Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Toggle 'Allow Local Menu Images' > 'No'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'No')])[5]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' Toggled to 'No'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'Yes')])[5]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save Changes'", "xpath", "//div[contains(text(),'Save Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Image Area does not exist in Local Menu" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Refresh("Refresh Brand List Page", ParentTest, "no_jira");
Thread.sleep(2000);
        Element_By_Path_Click("Click > Category Item manipulated in global menu", "xpath", "//*[contains(text(),'Lunch')][1]/parent::span", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Wait_For_Element_By_Path_InVisibility("Check > Image area does not exists", "xpath", "//canvas", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Cancel'", "xpath", "(//*[contains(text(),'Cancel')])[4]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'No'" + "\t" + " == Toggle Allow Images to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'No'
        Element_By_Path_Click("Toggle 'Allow Images' > 'No'", "xpath", "//div[contains(text(),'No')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' toggle is Disabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        //navigate to global menu and check that images cannot be added
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
Thread.sleep(2000);
        Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
Thread.sleep(2000);
        Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        Wait_For_Element_By_Path_InVisibility("Check > Upload image area does not exists", "xpath", "//canvas", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click > 'Cancel'", "xpath", "//div[@class='flex shrink']//*[contains(text(),'Cancel')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        }
    }
}