package AP3;

import A.TWeb;

import static A.A.*;
import static AP3.AP3.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AP3_bulk_apply {
    /*
    Currently set-up for Staging only
    TO RUN THIS TEST IN JTT, SELECT (APPLICATION: Boost, SITE: Sites Bulk Apply)
    */
    public static void run() throws InterruptedException {
        if (!env.equals("PR")) {
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", "no_jira");
        if (FAIL) { return;}
        //Bulk Apply Start       
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;} 
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        //get orginal price values
        EX += " - " + "\t" + " === " + "\t" + " ===== Store Data and Reset List" + "\t" + " == Store Data and Reset List >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category: Sides", "xpath", "//div[contains(text(),'Sides')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        String[] List_of_Item_Prices_Before_Change = new String[L1.size()];
        for (int i = 0; i < L1.size(); i++){
            List_of_Item_Prices_Before_Change[i] = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[5]", "innerHTML");
        }
        //open Local Menu on new tab
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID+"/brands/"+BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(10000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category: Sides", "xpath", "//div[contains(text(),'Sides')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Item Set: Soup", "xpath", "//div[contains(text(),'Soup')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        //API call https://api.compassdigital.org/staging/menu/4Wyo37NMD5tpzMvEJMl2FNdZNmL3NzFywWP52ZP8CKQPWlLQy2H4BdpXwaKDc9aq8mO?nocache=true&extended=true&show_unlinked=false
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Sides / API )", BaseAPI + "/menu/4Wyo37NMD5tpzMvEJMl2FNdZNmL3NzFywWP52ZP8CKQPWlLQy2H4BdpXwaKDc9aq8mO?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray groups = new JSONArray();
        groups = json.getJSONArray("groups");
        JSONObject json2 = groups.getJSONObject(0);
        JSONArray items = new JSONArray();
        items = json2.getJSONArray("items");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);           
            if (item.getJSONObject("is").getBoolean("hidden")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"hidden\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"hidden\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            if (item.getJSONObject("is").getBoolean("out_of_stock")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"out_of_stock\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"out_of_stock\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }
        //reset list visibility and in/out of stock checkbox indicator
        String inStock = getAttributeOfElementByXpath("((//table[contains(@class,'v-table')]//tbody/tr)[1]//td[8])//input", "aria-checked");
        String visible = getAttributeOfElementByXpath("((//table[contains(@class,'v-table')]//tbody/tr)[1]//td[4])//i", "class");
        if (inStock.contains("false") && visible.contains("mdi-eye-off")) {
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Reset visibility of item "+ String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//i[contains(@class,'mdi-eye-off')]", "no_jira");
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Reset In/Out of stock of item "+ String.valueOf(i+1), "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[8])//input", "no_jira");
            }
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Local Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(5000);
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", "no_jira");
            if (FAIL) { return;}
        }
        //API call https://api.compassdigital.org/staging/menu/4Wyo37NMD5tpzMvEJMl2FNdZNmL3NzFywWP52ZP8CKQPWlLQy2H4BdpXwaKDc9aq8mO?nocache=true
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Sides / API )", BaseAPI + "/menu/4Wyo37NMD5tpzMvEJMl2FNdZNmL3NzFywWP52ZP8CKQPWlLQy2H4BdpXwaKDc9aq8mO?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
        json = new JSONObject(API_Response_Body);
        groups = new JSONArray();
        groups = json.getJSONArray("groups");
        json2 = groups.getJSONObject(0);
        items = new JSONArray();
        items = json2.getJSONArray("items");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);           
            if (!item.getJSONObject("is").getBoolean("hidden")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + " {\"hidden\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + " {\"hidden\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            if (!item.getJSONObject("is").getBoolean("out_of_stock")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"out_of_stock\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"out_of_stock\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Select, Click Update, Verify Bulk Apply Side Panel">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Select, Click Update, Verify Bulk Apply Side Panel" + "\t" + " == Bulk Select, Click Update, Verify Bulk Apply Side Panel >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        String OP = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[1]//td[5]", "innerHTML");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        //Open Bulk Apply Side Panel for all items and verify side panel
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Update "+L1.size()+" Items header", "xpath", "//div[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Price Container", "xpath", "(//div[contains(@class,'v-card__title')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Stock Container", "xpath", "(//div[contains(@class,'v-card__title')])[6]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("In-App Visibility", "xpath", "(//div[contains(@class,'v-card__title')])[7]", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        //change price
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Local Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Prices in Local Menu" + "\t" + " == Bulk Change Prices in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Price Input Field", "xpath", "//input[contains(@placeholder,'Price')]", "no_jira");
        if (FAIL) { return;}
        if (OP.contains("6")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,"no_jira");
            if (FAIL) { return;}
        } else if (OP.contains("5")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "600", false,"no_jira");
            if (FAIL) { return;}
        } else {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,"no_jira");
            if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        for (int i = 0; i < L1.size(); i++){
            if (OP.contains("6")) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'5')]", "no_jira");
                if (FAIL) { return;}
            } else if (OP.contains("5")) {
               _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'6')]", "no_jira");
                if (FAIL) { return;} 
            } else {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'5')]", "no_jira");
                if (FAIL) { return;}
            } 
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Change IN/OUT of stock in Local Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change IN/OUT of stock in Local Menu" + "\t" + " == Bulk Change IN/OUT of stock in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is In Stock", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[8])//input[@aria-checked='true']", "no_jira");
            if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Out of Stock checkbox", "xpath", "//input[@aria-label='Out of Stock']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is Out of Stock", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[8])//input[@aria-checked='false']", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Visibility in Local Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Visibility in Local Menu" + "\t" + " == Bulk Change Visibility in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//i[contains(@class,'mdi-eye ')]", "no_jira");
            if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Hide In App", "xpath", "//input[@aria-label='Hide In App']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is NOT visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//i[contains(@class,'mdi-eye-off')]", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        //publish changes in Local Menu
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Local Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Visibility of Modifiers in Local Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Visibility of Modifiers in Local Menu" + "\t" + " == Bulk Change Visibility of Modifiers in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'mdi-pencil')])[7]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Show Selection", "xpath", "//div[contains(text(),'Show Selection')]", "no_jira");
        if (FAIL) { return;}
        String secondModVisibility = getAttributeOfElementByXpath("((//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i)[2]", "class");
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Close Selection", "xpath", "//div[contains(text(),'Close Selection')]", "no_jira");
        if (FAIL) { return;}
        if (secondModVisibility.contains("mdi-eye-off")) {
            //API call https://api.compassdigital.org/staging/menu/G2WGRdwMygFp93RRYqawiKJX08vL15UoAokKwmaZcQO1lWXPAWTprNA8wWL0sZRlp8m?nocache=true
            _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Flame Grilled Pitas / API )", BaseAPI + "/menu/G2WGRdwMygFp93RRYqawiKJX08vL15UoAokKwmaZcQO1lWXPAWTprNA8wWL0sZRlp8m?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
            json = new JSONObject(API_Response_Body);
            groups = new JSONArray();
            groups = json.getJSONArray("groups");
            json2 = groups.getJSONObject(0);
            items = new JSONArray();
            items = json2.getJSONArray("items");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);           
                JSONArray options = new JSONArray();
                options = item.getJSONArray("options");
                JSONObject option = options.getJSONObject(0);
                JSONArray option_items = new JSONArray();
                option_items = option.getJSONArray("items");
                if (option_items.length() == 3) {
                    _t++;
                    _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 3" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 3" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            }
            _t++; TWeb.Element_By_Path_Click("Add Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; TWeb.Element_By_Path_Click("Add Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; TWeb.Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item "+ String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]", "no_jira");
                if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Modifier", "xpath", "//span[contains(text(),'Pita Options Modifier')]", "no_jira");
                if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check Modifier 'Extra Beef' is visible", "xpath", "(//div[contains(@class,'layout modifier')])[2]//i[contains(@class,'mdi-eye ')]", "no_jira");
                if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", "no_jira");
                if (FAIL) { return;}
            }
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
        } else {
            //API call https://api.compassdigital.org/staging/menu/G2WGRdwMygFp93RRYqawiKJX08vL15UoAokKwmaZcQO1lWXPAWTprNA8wWL0sZRlp8m?nocache=true
            _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Flame Grilled Pitas / API )", BaseAPI + "/menu/G2WGRdwMygFp93RRYqawiKJX08vL15UoAokKwmaZcQO1lWXPAWTprNA8wWL0sZRlp8m?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
            json = new JSONObject(API_Response_Body);
            groups = new JSONArray();
            groups = json.getJSONArray("groups");
            json2 = groups.getJSONObject(0);
            items = new JSONArray();
            items = json2.getJSONArray("items");
            for (int i = 0; i < items.length(); i++) {
                JSONObject item = items.getJSONObject(i);           
                JSONArray options = new JSONArray();
                options = item.getJSONArray("options");
                JSONObject option = options.getJSONObject(0);
                JSONArray option_items = new JSONArray();
                option_items = option.getJSONArray("items");
                if (option_items.length() == 4) {
                    _t++;
                    _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 4" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 4" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            }
            _t++; TWeb.Element_By_Path_Click("Remove Visibility of Second Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[2]//i[contains(@class,'mdi-eye')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; TWeb.Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item "+ String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]", "no_jira");
                if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Modifier", "xpath", "//span[contains(text(),'Pita Options Modifier')]", "no_jira");
                if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check Modifier 'Extra Beef' is NOT visible", "xpath", "(//div[contains(@class,'layout modifier')])[2]//i[contains(@class,'mdi-eye-off')]", "no_jira");
                if (FAIL) { return;} 
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", "no_jira");
                if (FAIL) { return;}
            }
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
        }             
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        // <editor-fold defaultstate="collapsed" desc="Check Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Global Menu" + "\t" + " == Check Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", "no_jira");
        if (FAIL) { return;}
        TWeb.Refresh("Refresh page", "no_jira");
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category: Sides", "xpath", "//div[contains(text(),'Sides')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Item Set: Soup ", "xpath", "//div[contains(text(),'Soup')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Check Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'"+List_of_Item_Prices_Before_Change[i]+"')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is Enabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[4])//input[@aria-checked='true']", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
             
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Change Prices in Global Menu" + "\t" + " == Bulk Change Prices in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        //get First Item Price (FIP)
        String FIP = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)[1]//td[5]", "innerHTML");
        //API call https://api.compassdigital.org/staging/menu/lpmAZO8Ga6Umjaz85ELNI93MkmW1B7TezGGJ1r5MiX0ZDgJMdySk7ZYM9lwqI2a4Zy0?nocache=true&extended=true&show_unlinked=false
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Flame Grilled Pitas / API )", BaseAPI + "/menu/lpmAZO8Ga6Umjaz85ELNI93MkmW1B7TezGGJ1r5MiX0ZDgJMdySk7ZYM9lwqI2a4Zy0?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
        json = new JSONObject(API_Response_Body);
        groups = new JSONArray();
        groups = json.getJSONArray("groups");
        json2 = groups.getJSONObject(0);
        items = new JSONArray();
        items = json2.getJSONArray("items");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);           
            if (!item.getJSONObject("is").getBoolean("disabled")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"disabled\" : false}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"disabled\" : false}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            if (item.getJSONObject("price").getInt("amount") == Integer.parseInt(FIP)) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "\"price\" : {\"amount\" : "+FIP+"}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "\"price\" : {\"amount\" : "+FIP+"}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            if (item.isNull("plu")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "has PLU" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "has PLU" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            JSONArray options = new JSONArray();
            options = item.getJSONArray("options");
            JSONObject option = options.getJSONObject(0);
            JSONArray option_items = new JSONArray();
            option_items = option.getJSONArray("items");          
            if (option_items.length() == 4) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 4" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 4" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }  
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Price Input Field", "xpath", "//input[contains(@placeholder,'Price')]", "no_jira");
        if (FAIL) { return;}
        if (FIP.contains("5")) {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "400", false,"no_jira");
            if (FAIL) { return;}  
        } else {
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[contains(@placeholder,'Price')]", "500", false,"no_jira");
            if (FAIL) { return;} 
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            if (FIP.contains("5")) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'4')]", "no_jira");
                if (FAIL) { return;}    
            } else {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'5')]", "no_jira");
                if (FAIL) { return;} 
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Update Enable/Disable in Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Update Enable/Disable in Global Menu" + "\t" + " == Bulk Update Enable/Disable in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is Enabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[4])//input[@aria-checked='true']", "no_jira");
            if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Disable in Local Menu", "xpath", "(//i[contains(@class,'mdi-radiobox')])[2]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is Disabled", "xpath", "((//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[4])//input[@aria-checked='false']", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Remove PLU numbers in Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Remove PLU numbers in Global Menu" + "\t" + " == Bulk Remove PLU numbers in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        for (int i = 0; i < L1.size(); i++){
            String PLU = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[6]", "innerHTML");
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" has a PLU number", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[contains(text(),'"+PLU+"')]", "no_jira");
            if (FAIL) { return;}
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Remove PLU Numbers", "xpath", "//input[@aria-label='Remove PLU Numbers from selected Items']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            String PLU = getAttributeOfElementByXpath("(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[6]", "innerHTML");
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" has NO PLU number", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[contains(text(),'"+PLU+"')]", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Update Global Modifiers">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Update Global Modifiers" + "\t" + " == Bulk Update Global Modifiers >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; TWeb.Move_to_Element_By_Path("Move to Edit Mod Groups Section", "xpath", "//div[text()='Edit Mod Groups in Your Item Selection']", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_E1_Find("Find Modifier Group Input", "xpath", "//input[@placeholder='Pita Options Modifier']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'mdi-pencil')])[3]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; TWeb.List_L3("Modifier Options", "xpath", "//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Click("Remove Third Mod Option", "xpath", "(//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')])[3]//i[contains(@class,'mdi-delete')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text()='Save Modifiers Changes']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            _t++; TWeb.Element_By_Path_Click("Click > Item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[3]", "no_jira");
            if (FAIL) { return;}
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Modifier", "css", "div.layout.display-flex.justify-space-between.align-center", "no_jira");
            if (FAIL) { return;}
            _t++; TWeb.List_L0("List of Modifier Options", "css", "div.layout.modifier.row.wrap.align-center", "no_jira");
            if (FAIL) { return;}
            _t++; compareListSizes("updated Mod List size is smaller than original size", L3, L0, L3.size()>L0.size(), "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        //publish changes in Global Menu
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        //API call https://api.compassdigital.org/staging/menu/lpmAZO8Ga6Umjaz85ELNI93MkmW1B7TezGGJ1r5MiX0ZDgJMdySk7ZYM9lwqI2a4Zy0?nocache=true&extended=true&show_unlinked=false
        _t++; Thread.sleep((long) sleep); TWeb.Call_API_Auth("Call /Menu/ Flame Grilled Pitas / API )", BaseAPI + "/menu/lpmAZO8Ga6Umjaz85ELNI93MkmW1B7TezGGJ1r5MiX0ZDgJMdySk7ZYM9lwqI2a4Zy0?nocache=true&extended=true&show_unlinked=false", true,"no_jira");
        json = new JSONObject(API_Response_Body);
        groups = new JSONArray();
        groups = json.getJSONArray("groups");
        json2 = groups.getJSONObject(0);
        items = new JSONArray();
        items = json2.getJSONArray("items");
        for (int i = 0; i < items.length(); i++) {
            JSONObject item = items.getJSONObject(i);           
            if (item.getJSONObject("is").getBoolean("disabled")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"disabled\" : true}" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "{\"disabled\" : true}" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            if (item.isNull("plu")) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "has No PLU" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "has No PLU" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
            JSONArray options = new JSONArray();
            options = item.getJSONArray("options");
            JSONObject option = options.getJSONObject(0);
            JSONArray option_items = new JSONArray();
            option_items = option.getJSONArray("items");
            if (option_items.length() == 3) {
                _t++;
                _p++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 3" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {
                _t++;
                _f++; EX += _t + "\t" + "API - Item " + String.valueOf(i+1) + "\t" + "-" + "\t" + "modifier options = 3" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            }
        }     
        // <editor-fold defaultstate="collapsed" desc="Check Local Menu After Global Changes">  
        EX += " - " + "\t" + " === " + "\t" + " ===== Check Local Menu After Global Changes" + "\t" + " == Check Local Menu After Global Changes >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID+"/brands/"+BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check table is empty", "xpath", "//td[contains(text(),'No data available')]", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== Bulk Re-enabled Items in Global and Verify in Local" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", "no_jira");
        if (FAIL) { return;}
        TWeb.Refresh("Refresh page", "no_jira");
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Enable in Local Menu", "xpath", "(//i[contains(@class,'mdi-radiobox')])[1]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Navigate to Local Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID+"/brands/"+BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            if (FIP.contains("5")) {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'4')]", "no_jira");
                if (FAIL) { return;}    
            } else {
                _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + String.valueOf(i+1),"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'5')]", "no_jira");
                if (FAIL) { return;} 
            }
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is in Stock", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//input[@aria-checked='true']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check item "+ String.valueOf(i+1)+" is Visible", "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//i[contains(@class,'mdi-eye ')]", "no_jira");
            if (FAIL) { return;}
        }
        for (int i = 0; i < L1.size(); i++) {
            _t++; TWeb.Element_By_Path_Click("Click > Item " + String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[3]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Modifier", "xpath", "//span[contains(text(),'Pita Options Modifier')]", "no_jira");
            if (FAIL) { return;}
            _t++; TWeb.List_L0("List of Modifier Options", "xpath", "//div[contains(@class,'layout modifier')]", "no_jira");
            if (FAIL) { return;}
            _t++; compareListSizes("updated Mod List size is smaller than original size", L3, L0, L3.size()>L0.size(), "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel", "xpath", "(//div[text()='Cancel'])[5]", "no_jira");
            if (FAIL) { return;}
        }   
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        //Reset Global Modifiers
        EX += " - " + "\t" + " === " + "\t" + " ===== Reset Global Modifiers, and PLUs " + "\t" + " == Reset Global Modifiers, and PLUs >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Close_Current_Tab_switch_To_1st("Switch Tab to Global Menu", "no_jira");
        if (FAIL) { return;}
        TWeb.Refresh("Refresh page", "no_jira");
        Thread.sleep(5000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item "+ String.valueOf(i+1), "xpath", "(//table[contains(@class,'v-table')]//tbody/tr)["+String.valueOf(i+1)+"]//td[3]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on item PLU input", "xpath", "//input[@aria-label='PLU ID']", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Reset PLU on item "+ String.valueOf(i+1), "xpath", "//input[@aria-label='PLU ID']", getRandNumberString(), false, "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
            if (FAIL) { return;}
        }           
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'v-icon mdi mdi-pencil theme--light')])[3]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Add Modifier", "xpath", "//div[contains(text(),'Add MODIFIER')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Dropdown Carrot", "xpath", "(//i[contains(@class,'mdi-menu-down')])[6]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Mod from dropdown", "xpath", "(//div[@class='v-list__tile__title'])[1]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[contains(text(),'Save Modifiers Changes')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        //publish changes in Global Menu
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Publish in Global Menu", "xpath", "//div[contains(text(),'publish')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
    }
    }
    // Comparison eg. LIST1.size() ==/>/< LIST2.size()
    private static void compareListSizes(String NAME, List<WebElement> LIST1, List<WebElement> LIST2, Boolean comparison, String JIRA) {
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
            EX += _t + "\t" + NAME + "\t" + LIST1+ " " +LIST2+ "\t" + "Lists Size Comparison Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + "===" + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
    }
    
    private static String getAttributeOfElementByXpath(String xpath, String attribute) {
        WebElement el = d1.findElement(By.xpath(xpath));
        return el.getAttribute(attribute);
    }
    
    private static String getRandNumberString() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
