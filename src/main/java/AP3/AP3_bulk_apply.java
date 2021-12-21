package AP3;

import com.aventstack.extentreports.ExtentTest;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Test data for this scope

//Env: Staging
//App:Boost
//Location: Sites Bulk Apply / Boost site
//Brand: Bulk Apply Station

class AP3_bulk_apply extends AP3_GUI{
    protected AP3_bulk_apply (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;

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
        New_ID = a.New_ID;
        TZone = a.TZone;
    } 
    protected void run() {
        //required cvurrently because of inconsistent element xpaths between staging and prod
        int tempBulkSelectId;
        int tempEditModifiersId;
        if (env.equals("PR")) {
            tempBulkSelectId = 5;
            tempEditModifiersId = 7;
        } else {
            tempBulkSelectId = 3;
            tempEditModifiersId = 5;
        }
    try {    
        String API_Response_Body = "";
        JSONObject json;
        JSONArray menus;
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        //Bulk Apply Start       
        List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        //get orginal price values
        if (!L0.isEmpty()) {
            EX += " - " + "\t" + " === " + "\t" + " ===== Store Data and Reset List" + "\t" + " == Store Data and Reset List >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Element_By_Path_Click("Click > Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            String CATEGORY1 = e.findElement(By.xpath("//*[contains(@class,'Subtitle-1-Selected')]")).getAttribute("textContent").trim();
            Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for items table to load", "xpath", "//table[contains(@class,'v-table')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
                Thread.sleep(500);
            List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
            String[] List_of_Item_Prices_Before_Change = new String[L1.size()];
            for (int i = 0; i < L1.size(); i++){
                List_of_Item_Prices_Before_Change[i] = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[5]", "innerHTML");
            }
            //open Local Menu on new tab
            Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/brands/" + BrandID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published:')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Category: " + CATEGORY1, "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            String MenuID = "";
            String menuName = "";     
                Call_API("Find '" +CATEGORY1+ "' MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
                try {
                    API_Response_Body = t;               
                    json = new JSONObject(API_Response_Body);
                    menus = new JSONArray();
                    menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                    JSONObject menu = menus.getJSONObject(i);
                    String loc_brand = "";
                    if (menu.has("location_brand") && menu.has("label")) {
                        loc_brand = menu.getString("location_brand");
                        if (loc_brand.equals(BrandID)) {
                            JSONObject label = menu.getJSONObject("label");
                            menuName = label.getString("en");
                            if (menuName.equals(CATEGORY1)) {
                                MenuID = menu.getString("id"); 
                            }
                        }  
                    }
                }  
                }catch (Exception ex) {
                    _f++; err = ex.getMessage().trim();
                    if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }

            Call_API("Call /menu/<MenuID> API", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
            try {
                API_Response_Body = t;               
                json = new JSONObject(API_Response_Body);
                JSONArray groups = new JSONArray();
                groups = json.getJSONArray("groups");
                JSONObject json2 = groups.getJSONObject(0);
                JSONArray items = new JSONArray();
                items = json2.getJSONArray("items");
                for (int i = 0; i < items.length(); i++) {
                    JSONObject item = items.getJSONObject(i);           
                    if (item.getJSONObject("is").getBoolean("hidden")) {
                        _t++;
                        _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is not visible" + "\t" + "-" + "\t" + "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden") + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is not visible"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is not visible" + "\t" + "-" + "\t" + "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden") + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is not visible"), new Date());
                    }
                    if (item.getJSONObject("is").getBoolean("out_of_stock")) {
                        _t++;
                        _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is out of stock" + "\t" + "-" + "\t" + "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock") + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is out of stock"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is out of stock" + "\t" + "-" + "\t" + "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock") + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is out of stock"), new Date());
                    }
                } 
            }catch (Exception ex) {
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + err+ "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }        
            //reset list visibility and in/out of stock checkbox indicator
            String inStock = getAttributeOfElementByXpath("((//table[contains(@class,'v-table')]//tbody/tr)[1]//td[9])//i", "class");
            String visible = getAttributeOfElementByXpath("((//table[contains(@class,'v-table')]//tbody/tr)[1]//td[4])//i", "class");
            if (inStock.contains("mdi-checkbox-blank-outline") && visible.contains("mdi-eye-off")) {
                Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' button", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);    
                Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_By_Path_Click("Click > In Stock", "xpath", "//label[contains(text(),'In Stock')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Visible In App", "xpath", "//label[contains(text(),'Visible In App')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);           
                Element_By_Path_Click("Click Publish in Local Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
            }       
            Call_API("Find '" +CATEGORY1+ "' MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
            try {
                API_Response_Body = t;               
                json = new JSONObject(API_Response_Body);
                menus = new JSONArray();
                menus = json.getJSONArray("menus");
                for (int i = 0; i < menus.length(); i++) {
                    JSONObject menu = menus.getJSONObject(i);
                    String loc_brand = "";
                    if (menu.has("location_brand") && menu.has("label")) {
                        loc_brand = menu.getString("location_brand");
                        if (loc_brand.equals(BrandID)) {
                            JSONObject label = menu.getJSONObject("label");
                            menuName = label.getString("en");
                            if (menuName.equals(CATEGORY1)) {
                                MenuID = menu.getString("id"); 
                            }
                        }  
                    }
                }  
            }catch (Exception ex) {
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();            
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }

            Call_API("Call /menu/<MenuID> API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
            try {
                API_Response_Body = t;               
                json = new JSONObject(API_Response_Body);
                JSONArray groups = new JSONArray();
                groups = json.getJSONArray("groups");
                JSONObject json2 = groups.getJSONObject(0);
                JSONArray items = new JSONArray();
                items = json2.getJSONArray("items");
                for (int i = 0; i < items.length(); i++) {
                    JSONObject item = items.getJSONObject(i);           
                    if (!item.getJSONObject("is").getBoolean("hidden")) {
                        _t++;
                        _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is visible" + "\t" + "-" + "\t" + " \"hidden\" : " + item.getJSONObject("is").getBoolean("hidden") + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is visible"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is visible" + "\t" + "-" + "\t" + " \"hidden\" : " + item.getJSONObject("is").getBoolean("hidden") + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "\"hidden\" : " + item.getJSONObject("is").getBoolean("hidden"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is visible"), new Date());
                    }
                    if (!item.getJSONObject("is").getBoolean("out_of_stock")) {
                        _t++;
                        _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is in stock" + "\t" + "-" + "\t" + "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock") + "\t" + "PASS" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("PASS", "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("hidden"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is in stock"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is in stock" + "\t" + "-" + "\t" + "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("out_of_stock") + "\t" + "FAIL" + "\t" 
                                + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "\"out_of_stock\" : " + item.getJSONObject("is").getBoolean("hidden"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is in stock"), new Date());
                    }
                } 
            }catch (Exception ex) {
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();  
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }

            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

            // <editor-fold defaultstate="collapsed" desc="Bulk Select, Click Update, Verify Bulk Apply Side Panel">  
            EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Select, Click Update, Verify Bulk Apply Side Panel" + "\t" + " == Bulk Select, Click Update, Verify Bulk Apply Side Panel >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            String OP = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[1]//td[5]", "innerHTML");
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, Ver);
                if (FAIL) { return;}
                Thread.sleep(500);
            Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                if (FAIL) { return;}
            //Open Bulk Apply Side Panel for all items and verify side panel
            Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                if (FAIL) { return;}
            Thread.sleep(500);                
            Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
            //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Update " + L1.size() + " Items header", "xpath", "//div[contains(text(),'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Price Container", "xpath", "(//div[contains(@class,'v-card__title')])[5]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Stock Container", "xpath", "(//div[contains(@class,'v-card__title')])[6]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("In-App Visibility", "xpath", "(//div[contains(@class,'v-card__title')])[7]", ParentTest, "no_jira");
                if (FAIL) { return;}
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            // </editor-fold> 

            //change price
            // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Local Menu">  
            EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Prices in Local Menu" + "\t" + " == Bulk Change Prices in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Element_By_Path_Click("Click on Price Input Field", "xpath", "//input[contains(@placeholder,'Price')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (OP.contains("6")) {
                Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,ParentTest, "no_jira");
                if (FAIL) { return;}
            } else if (OP.contains("5")) {
                Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "600", false,ParentTest, "no_jira");
                if (FAIL) { return;}
            } else {
                Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,ParentTest, "no_jira");
                if (FAIL) { return;}
            }
            Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            for (int i = 0; i < L1.size(); i++){
                if (OP.contains("6")) {
                    Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'5')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else if (OP.contains("5")) {
                   Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'6')]", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                } else {
                    Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'5')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } 
            }
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Bulk Change IN/OUT of stock in Local Menu">  
            EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change IN/OUT of stock in Local Menu" + "\t" + " == Bulk Change IN/OUT of stock in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            for (int i = 0; i < L1.size(); i++){
                Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is In Stock", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[9])//input[@aria-checked='true']", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
            Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);              
            Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
            //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Out of Stock", "xpath", "//label[contains(text(),'Out of Stock')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            for (int i = 0; i < L1.size(); i++){
                Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is Out of Stock", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[8])//input[@aria-checked='false']", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="Bulk Change Visibility in Local Menu">  
            EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Visibility in Local Menu" + "\t" + " == Bulk Change Visibility in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            for (int i = 0; i < L1.size(); i++){
                Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//i[contains(@class,'mdi-eye ')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
            Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                if (FAIL) { return;}
            Thread.sleep(500);              
            Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
            //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Hide In App", "xpath", "//label[contains(text(),'Hide In App')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++){
                Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is NOT visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//i[contains(@class,'mdi-eye-off')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            }
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            // </editor-fold> 

            //publish changes in Local Menu
            Element_By_Path_Click("Click Publish in Local Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, Ver);
                if (FAIL) { return;}
                Thread.sleep(500);
            EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

            // <editor-fold defaultstate="collapsed" desc="Bulk Change Visibility of Modifiers in Local Menu">  
            EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Visibility of Modifiers in Local Menu" + "\t" + " == Bulk Change Visibility of Modifiers in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
           Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
            Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                if (FAIL) { return;}
                Thread.sleep(500);              
            Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
            //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
            if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                if (FAIL) { return;}
            List_L0("Check for modifiers", "xpath", "(//i[contains(@class,'mdi-pencil')])[" +tempEditModifiersId+ "]", ParentTest, "no_jira");
                if (FAIL) { return;}
            if (!L0.isEmpty()) {  ////////---------------------------
                Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'mdi-pencil')])[" +tempEditModifiersId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for modifiers changes side panel", "xpath", "//*[text()='Save Modifiers Changes']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                List_L3("List of modifier options", "xpath", "//*[@class='layout row wrap align-center modifier']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Show Selection", "xpath", "//div[contains(text(),'Show Selection')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                String secondModVisibility = getAttributeOfElementByXpath("((//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i)[2]", "class");
                Element_By_Path_Click("Click > Close Selection", "xpath", "//div[contains(text(),'Close Selection')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (secondModVisibility.contains("mdi-eye-off")) {
                    Call_API("Find '" +CATEGORY1+ "' MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
                    try {
                        API_Response_Body = t;               
                        json = new JSONObject(API_Response_Body);
                        menus = new JSONArray();
                        menus = json.getJSONArray("menus");
                        for (int i = 0; i < menus.length(); i++) {
                            JSONObject menu = menus.getJSONObject(i);
                            String loc_brand = "";
                            if (menu.has("location_brand") && menu.has("label")) {
                                loc_brand = menu.getString("location_brand");
                                if (loc_brand.equals(BrandID)) {
                                    JSONObject label = menu.getJSONObject("label");
                                    menuName = label.getString("en");
                                    if (menuName.equals(CATEGORY1)) {
                                        MenuID = menu.getString("id"); 
                                    }
                                }  
                            }
                        }
                    }catch (Exception ex) {
                        _f++; err = ex.getMessage().trim();
                        if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "Error: " + err+ "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }
                    Call_API("Call /menu/<MenuID> API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
                    try {
                        API_Response_Body = t;               
                        json = new JSONObject(API_Response_Body);
                        JSONArray groups = new JSONArray();
                        groups = json.getJSONArray("groups");
                        JSONObject json2 = groups.getJSONObject(0);
                        JSONArray items = new JSONArray();
                        items = json2.getJSONArray("items");
                        for (int i = 0; i < items.length(); i++) {
                            JSONObject item = items.getJSONObject(i);           
                            JSONArray options = new JSONArray();
                            options = item.getJSONArray("options");
                            JSONObject option = options.getJSONObject(0);
                            JSONArray option_items = new JSONArray();
                            option_items = option.getJSONArray("items");
                            if (option_items.length() == L3.size()-1) {
                                _t++;
                                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +(L3.size()-1)+ " modifier options" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("PASS", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +(L3.size()-1)+ " modifier options"), new Date());
                            } else {
                                _t++;
                                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +(L3.size()-1)+ " modifier options" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("FAIL", "modifier options = " + option_items.length(), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +(L3.size()-1)+ " modifier options"), new Date());
                            }
                        } 
                    }catch (Exception ex) {
                        _f++; err = ex.getMessage().trim();
                        if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();                 
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }
                    Element_By_Path_Click("Add Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Click("Add Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        Element_By_Path_Click("Click on item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click on Modifier", "xpath", "//*[@class='modifier-group']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check Modifier is visible", "xpath", "(//div[contains(@class,'layout modifier')])[2]//i[contains(@class,'mdi-eye ')]", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", ParentTest, "no_jira");
                            if (FAIL) { return;}  
                    }
                    Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);
                    Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);
                    Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);    
                } else { 
                    Call_API("Call /menu/company/<CompanyID> API", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
                    try {
                        API_Response_Body = t;               
                        json = new JSONObject(API_Response_Body);
                        menus = new JSONArray();
                    menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                        JSONObject menu = menus.getJSONObject(i);
                        String loc_brand = "";
                        if (menu.has("location_brand") && menu.has("label")) {
                            loc_brand = menu.getString("location_brand");
                            if (loc_brand.equals(BrandID)) {
                                JSONObject label = menu.getJSONObject("label");
                                menuName = label.getString("en");
                                if (menuName.equals(CATEGORY1)) {
                                    MenuID = menu.getString("id"); 
                                }
                            }  
                        }
                    } 
                    }catch (Exception ex) {
                        _f++; err = ex.getMessage().trim();
                        if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }
                    Call_API("Call /menu/<MenuID> API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
                    try {
                        API_Response_Body = t;               
                        json = new JSONObject(API_Response_Body);
                        JSONArray groups = new JSONArray();
                        groups = json.getJSONArray("groups");
                        JSONObject json2 = groups.getJSONObject(0);
                        JSONArray items = new JSONArray();
                        items = json2.getJSONArray("items");
                        for (int i = 0; i < items.length(); i++) {
                            JSONObject item = items.getJSONObject(i);           
                            JSONArray options = new JSONArray();
                            options = item.getJSONArray("options");
                            JSONObject option = options.getJSONObject(0);
                            JSONArray option_items = new JSONArray();
                            option_items = option.getJSONArray("items");
                            if (option_items.length() == L3.size()) {
                                _t++;
                                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("PASS", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                            } else {
                                _t++;
                                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("FAIL", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                            }
                        }
                    }catch (Exception ex) {
                        _f++; err = ex.getMessage().trim();
                        if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
                        EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                        "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                        return;
                    }
                    Element_By_Path_Click("Remove Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    for (int i = 0; i < L1.size(); i++) {
                        Element_By_Path_Click("Click on item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Element_By_Path_Click("Click on Modifier", "xpath", "//*[@class='modifier-group']", ParentTest, "no_jira");
                            if (FAIL) { return;}
                        Wait_For_Element_By_Path_Presence("Check Modifier 2 is NOT visible", "xpath", "(//div[contains(@class,'layout modifier')])[2]//i[contains(@class,'mdi-eye-off')]", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                        Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", ParentTest, "no_jira");
                            if (FAIL) { return;}
                    }
                    Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);
                    Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        Thread.sleep(500);
                }                              
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc="Check Global Menu">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Check Global Menu" + "\t" + " == Check Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Refresh("Refresh Page", ParentTest, "no_jira");
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, Ver);
                    if (FAIL) { return;}
                List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > Category: " +CATEGORY1+ "", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++){
                    Element_By_Path_Text("Check Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'" +List_of_Item_Prices_Before_Change[i]+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is Enabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[4])//input[@aria-checked='true']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Global Menu">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Prices in Global Menu" + "\t" + " == Bulk Change Prices in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')][1]/parent::span", ParentTest, "no_jira");
                    if (FAIL) { return;}
                //get First Item Price (FIP)
                String FIP = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[1]//td[5]", "textContent");
                Call_API("Find '" +CATEGORY1+ "' MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
                try {
                    API_Response_Body = t;  
                    json = new JSONObject(API_Response_Body);
                    menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                        JSONObject menu = menus.getJSONObject(i);
                        //String loc_brand = "";
                        if (!menu.has("location_brand") && menu.has("label")) {
                            //loc_brand = menu.getString("location_brand");
                            JSONObject label = menu.getJSONObject("label");
                            menuName = label.getString("en");
                            if (menuName.equals(CATEGORY1)) {
                                MenuID = menu.getString("id"); 
                            }  
                        }
                    }
                }catch (Exception ex) {
                    _f++; err = ex.getMessage().trim();
                    if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                Call_API("Call /menu/<MenuID> API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
                try {
                    API_Response_Body = t;               
                    json = new JSONObject(API_Response_Body);
                    JSONArray groups = new JSONArray();
                    groups = json.getJSONArray("groups");
                    JSONObject json2 = groups.getJSONObject(0);
                    JSONArray items = new JSONArray();
                    items = json2.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject item = items.getJSONObject(i);           
                        if (!item.getJSONObject("is").getBoolean("disabled")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is not disabled" + "\t" + "-" + "\t" + "\"disabled\" = " + item.getJSONObject("is").getBoolean("disabled") + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "\"disabled\" = " + item.getJSONObject("is").getBoolean("disabled"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is not disabled"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is not disabled" + "\t" + "-" + "\t" + "\"disabled\" = " + item.getJSONObject("is").getBoolean("disabled") + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "\"disabled\" = " + item.getJSONObject("is").getBoolean("disabled"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is not disabled"), new Date());
                        }
                        if (item.getJSONObject("price").getFloat("amount") == Float.parseFloat(FIP)) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " price is " + FIP + "\t" + "-" + "\t" + "\"price\" = " + item.getJSONObject("price").getFloat("amount") + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "\"price\" = " + item.getJSONObject("price").getInt("amount"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " price is " + FIP), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " price is " + FIP + "\t" + "-" + "\t" + "\"price\" = " + item.getJSONObject("price").getFloat("amount") + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "\"price\" = " + item.getJSONObject("price").getInt("amount"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " price is " + FIP), new Date());
                        }
                        if (!item.getJSONObject("meta").isNull("plu")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has a PLU" + "\t" + "-" + "\t" + "has PLU = " + item.getJSONObject("meta").getString("plu") + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "has PLU = " + item.getJSONObject("meta").isNull("plu"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has a PLU"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has a PLU" + "\t" + "-" + "\t" + "has PLU = " + item.getJSONObject("meta").getString("plu") + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "has PLU = " + item.getJSONObject("meta").isNull("plu"), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has a PLU"), new Date());
                        }
                        JSONArray options = new JSONArray();
                        options = item.getJSONArray("options");
                        JSONObject option = options.getJSONObject(0);
                        JSONArray option_items = new JSONArray();
                        option_items = option.getJSONArray("items");          
                        if (option_items.length() == L3.size()) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("PASS", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                                Log_Html_Result("FAIL", "modifier options = " + option_items.length(), true, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                        }
                    }    
                }catch (Exception ex) {
                    _f++; err = ex.getMessage().trim();
                    if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + err+ "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, Ver);
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Click > Update " +L1.size()+ " Items", "xpath", "//span[contains(text(),'Update " +String.valueOf(L1.size())+ " Items')]", ParentTest,"no_jira");
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click on Price Input Field", "xpath", "//input[contains(@placeholder,'Price')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                if (FIP.contains("5")) {
                    Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "400", false,ParentTest, "no_jira");
                    if (FAIL) { return;}  
                } else {
                    Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,ParentTest, "no_jira");
                    if (FAIL) { return;} 
                }
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);
                List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                    if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    if (FIP.contains("5")) {
                        Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'4')]", ParentTest, "no_jira");
                        if (FAIL) { return;}    
                    } else {
                        Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'5')]", ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    }
                }
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="Bulk Update Enable/Disable in Global Menu">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Update Enable/Disable in Global Menu" + "\t" + " == Bulk Update Enable/Disable in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                for (int i = 0; i < L1.size(); i++){
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is Enabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[4])//input[@aria-checked='true']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click > Update " +L1.size()+ " Items", "xpath", "//span[contains(text(),'Update " +String.valueOf(L1.size())+ " Items')]", ParentTest,"no_jira");
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                //Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click on Disable in Local Menu", "xpath", "(//i[contains(@class,'mdi-radiobox')])[2]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(1000);
                for (int i = 0; i < L1.size(); i++){
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is Disabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[4])//input[@aria-checked='false']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="Bulk Remove PLU numbers in Global Menu">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Remove PLU numbers in Global Menu" + "\t" + " == Bulk Remove PLU numbers in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                for (int i = 0; i < L1.size(); i++){
                    String PLU = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[6]", "innerHTML");
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " has a PLU number", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[contains(text(),'" +PLU+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                    if (FAIL) { return;}
                Thread.sleep(500);              
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click on Remove PLU Numbers", "xpath", "//input[@aria-label='Remove PLU Numbers from selected Items']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(1000);
                for (int i = 0; i < L1.size(); i++){
                    String PLU = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[6]", "innerHTML");
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " has NO PLU number", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[contains(text(),'" +PLU+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                // <editor-fold defaultstate="collapsed" desc="Bulk Update Global Modifiers">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Update Global Modifiers" + "\t" + " == Bulk Update Global Modifiers >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                    if (FAIL) { return;}
                Thread.sleep(500);              
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Move_to_Element_By_Path("Move to Edit Mod Groups Section", "xpath", "//div[text()='Edit Mod Groups in Your Item Selection']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_E1_Find("Find Modifier Group Input", "xpath", "//*[contains(@class,'modifier-group')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'mdi-pencil')])[3]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);
                List_L3("Modifier Options", "xpath", "//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Remove Third Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[3]//i[contains(@class,'mdi-delete')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'Apply Changes' to appear", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(1000);
                List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                    if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_By_Path_Click("Click > Item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[3]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Click("Click on Modifier", "css", "div.layout.display-flex.justify-space-between.align-center", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    List_L0("List of Modifier Options", "css", "div.layout.modifier.row.wrap.align-center", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    compareListSizes("updated Mod List size is smaller than original size", L3, L0, L3.size()>L0.size(), ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                //publish changes in Global Menu
                Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

                Call_API("Find '" +CATEGORY1+ "' MenuID", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
                try {
                    API_Response_Body = t;               
                    json = new JSONObject(API_Response_Body);
                    menus = new JSONArray();
                    menus = json.getJSONArray("menus");
                    for (int i = 0; i < menus.length(); i++) {
                        JSONObject menu = menus.getJSONObject(i);
                        //String loc_brand = "";
                        if (!menu.has("location_brand") && menu.has("label")) {
                            //loc_brand = menu.getString("location_brand");
                            JSONObject label = menu.getJSONObject("label");
                            menuName = label.getString("en");
                            if (menuName.equals(CATEGORY1)) {
                                MenuID = menu.getString("id"); 

                            }  
                        }
                    }  
                } catch (Exception ex) {
                    _f++; err = ex.getMessage().trim();
                    if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + err + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/company/" + CompanyID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                Call_API("Call /menu/<MenuID>/ API )", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", true,ParentTest, "no_jira");
                try {
                    API_Response_Body = t;  
                    json = new JSONObject(API_Response_Body);
                    JSONArray groups = new JSONArray();
                    groups = json.getJSONArray("groups");
                    JSONObject json2 = groups.getJSONObject(0);
                    JSONArray items = new JSONArray();
                    items = json2.getJSONArray("items");
                    for (int i = 0; i < items.length(); i++) {
                        JSONObject item = items.getJSONObject(i);           
                        if (item.getJSONObject("is").getBoolean("disabled")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is disabled" + "\t" + "-" + "\t" + "\"disabled\"  = " + item.getJSONObject("is").getBoolean("disabled") + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "\"disabled\"  = " + item.getJSONObject("is").getBoolean("disabled"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is disabled"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " is disabled" + "\t" + "-" + "\t" + "\"disabled\"  = " + item.getJSONObject("is").getBoolean("disabled") + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "\"disabled\"  = " + item.getJSONObject("is").getBoolean("disabled"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " is disabled"), new Date());
                        }
                        if (item.getJSONObject("meta").isNull("plu")) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " does not have a PLU" + "\t" + "-" + "\t" + "has PLU  = " + item.getJSONObject("meta").isNull("plu") + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "has PLU  = " + item.getJSONObject("meta").isNull("plu"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " does not have a PLU"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " does not have a PLU" + "\t" + "-" + "\t" + "has PLU  = " + item.getJSONObject("meta").isNull("plu") + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "has PLU  = " + item.getJSONObject("meta").isNull("plu"), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " does not have a PLU"), new Date());
                        }
                        JSONArray options = new JSONArray();
                        options = item.getJSONArray("options");
                        JSONObject option = options.getJSONObject(0);
                        JSONArray option_items = new JSONArray();
                        option_items = option.getJSONArray("items");
                        if (option_items.length() == L3.size()) {
                            _t++;
                            _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "PASS" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("PASS", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                        } else {
                            _t++;
                            _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions" + "\t" + "-" + "\t" + "modifier options = " + option_items.length() + "\t" + "FAIL" + "\t" 
                                        + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" +  "no_jira" + "\r\n";
                            Log_Html_Result("FAIL", "modifier options = " + option_items.length(), false, ParentTest.createNode(_t + ". " + "API - Item " + String.valueOf(i+1) + " has " +L3.size()+ " modifier otions"), new Date());
                        }
                    }            
                }catch (Exception ex) {
                    _f++; err = ex.getMessage().trim();
                    if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + err+ "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "Error: " + err + "<br />" + "URL: " + BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }

                // <editor-fold defaultstate="collapsed" desc="Check Local Menu After Global Changes">  
                EX += " - " + "\t" + " === " + "\t" + " ===== Check Local Menu After Global Changes" + "\t" + " == Check Local Menu After Global Changes >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/" +SectorID+ "/brand/company/" +CompanyID+ "/brands/" +BrandID, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Refresh("Refresh Page", ParentTest, "no_jira");
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check table is empty", "xpath", "//td[contains(text(),'No data available')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Re-enabled Items in Global and Verify in Local" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Refresh("Refresh Page", ParentTest, "no_jira");
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, Ver);
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(1000);
                Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                    Thread.sleep(500);              
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");       
                Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(), 'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click on Enable in Local Menu", "xpath", "(//i[contains(@class,'mdi-radiobox')])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/" +SectorID+ "/brand/company/" +CompanyID+ "/brands/" +BrandID, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Refresh("Refresh Page", ParentTest, "no_jira");
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, Ver);
                    if (FAIL) { return;}
                List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    if (FIP.contains("5")) {
                        Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'4')]", ParentTest, "no_jira");
                            if (FAIL) { return;}    
                    } else {
                        Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr[" +String.valueOf(i+1)+ "]/td[contains(text(),'5')]", ParentTest, "no_jira");
                            if (FAIL) { return;} 
                    }
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is in Stock", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//input[@aria-checked='true']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Wait_For_Element_By_Path_Presence("Check item " + String.valueOf(i+1)+ " is Visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//i[contains(@class,'mdi-eye ')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }
                for (int i = 0; i < L1.size(); i++) {
                    Element_By_Path_Click("Click > Item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[3]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click on Modifier", "xpath", "//span[contains(text(),'Pita Options Modifier')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    List_L0("List of Modifier Options", "xpath", "//div[contains(@class,'layout modifier')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    compareListSizes("updated Mod List size is smaller than original size", L3, L0, L3.size()>L0.size(), ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }   
                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold> 

                //Reset Global Modifiers
                EX += " - " + "\t" + " === " + "\t" + " ===== Reset Global Modifiers, and PLUs " + "\t" + " == Reset Global Modifiers, and PLUs >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Refresh("Refresh page", ParentTest, "no_jira");
                Thread.sleep(2000);
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, Ver);
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'" +CATEGORY1+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait to be in Edit mode", "xpath", "//*[contains(text(),'You are editing this menu')]", ParentTest, Ver);
                    if (FAIL) { return;}
                List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", ParentTest, "no_jira");
                    if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++){
                    Element_By_Path_Click("Click on item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)[" +String.valueOf(i+1)+ "]//td[3]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click on item PLU input", "xpath", "//input[@aria-label='PLU ID']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Text_Enter("Reset PLU on item " + String.valueOf(i+1), "xpath", "//input[@aria-label='PLU ID']", New_ID, false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }           
                Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[" +tempBulkSelectId+ "]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'UPDATE x ITEMS' buttom", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, Ver);
                    if (FAIL) { return;}
                    Thread.sleep(500); 
                //Element_By_Path_Click("Click > Update X Items", "xpath", "//span[@class='Button-Primary-Center']", ParentTest, "no_jira");
                Element_By_Path_Click("Click > Update " + L1.size() + " Items", "xpath", "//span[contains(text(),'Update " + String.valueOf(L1.size()) + " Items')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Bulk Update Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'v-icon mdi mdi-pencil theme--light')])[3]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for Add Modifier to appear", "xpath", "//div[contains(text(),'Add MODIFIER')]", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_By_Path_Click("Click > Add Modifier", "xpath", "//div[contains(text(),'Add MODIFIER')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for Dropdown Carrot to appear", "xpath", "(//i[contains(@class,'mdi-menu-down')])[6]", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_By_Path_Click("Click > Dropdown Carrot", "xpath", "(//i[contains(@class,'mdi-menu-down')])[6]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for Mod dropdown to appear", "xpath", "(//div[@class='v-list__tile__title'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_By_Path_Click("Click > Mod from dropdown", "xpath", "(//div[@class='v-list__tile__title'])[1]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[contains(text(),'Save Modifiers Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for 'Apply Changes' to appear", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}    
                Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                //publish changes in Global Menu
                Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                Wait_For_Element_By_Path_Presence("Wait for Publication", "xpath", "//*[contains(text(),'Last Published: Today')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);   
                EX += " - " + "\t" + " === " + "\t" + " === Bulk Apply End >>" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            } else {
                _t++;
                _w++; EX += _t + "\t" + "WARNING - NO MODIFIERS EXIST FOR CHOSEN CATEGORY AND ITEM SET" + "\t" + "- BULK APPLY CANNOT BE TESTED" + "\t" + "---" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("WARN", "---" + "\t" + "- BULK APPLY CANNOT BE TESTED", false, ParentTest.createNode(_t + ". " + "WARNING - NO MODIFIERS EXIST FOR CHOSEN CATEGORY AND ITEM SET"), new Date());
            }            
        } else {
            _t++;
            _w++; EX += _t + "\t" + "WARNING - NO CATEGORIES EXIST" + "\t" + "- BULK APPLY CANNOT BE TESTED" + "\t" + "---" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "---" + "\t" + "- BULK APPLY CANNOT BE TESTED", false, ParentTest.createNode(_t + ". " + "WARNING - NO CATEGORIES EXIST"), new Date());
        }
        
    } catch (Exception ex){}   // =============================================  
    } 
    
    // Comparison eg. LIST1.size() ==/>/< LIST2.size()
    private void compareListSizes(String NAME, List<WebElement> LIST1, List<WebElement> LIST2, Boolean comparison, ExtentTest ParentTest,  String JIRA) {
        FAIL = false;
        try {
            if(comparison) {
                if(LIST1.size() > LIST2.size()) {
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " > " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                    "\t" + "===" + "\t" + JIRA + "\r\n";    
                } else if (LIST1.size() < LIST2.size()) {
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " < " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                    "   \t" + "===" + "\t" + JIRA + "\r\n"; 
                } else if (LIST1.size() == LIST2.size()) {
                   _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " = " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                    "   \t" + "===" + "\t" + JIRA + "\r\n";  
                } else {
                   _f++; 
                    EX += _t + "\t" + NAME + "\t" + "Size comaprison returned false" + "\t" + "List size comparison successful" + "\t" + "FAIL" + "\t" + "===" +
                    "   \t" + "===" + "\t" + JIRA + "\r\n";   
                }                  
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + LIST1 + " - " + LIST2 + "\t" + "Lists Size Comparison Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + "===" + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
    }
    
    private String getAttributeOfElementByXpath(String xpath, String attribute) {
        WebElement el = d1.findElement(By.xpath(xpath));
        return el.getAttribute(attribute);
    }
    
}
