package AP3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 *
 * @author astrit.ademi
 * Use Site: University of Houston in JTT
 */

class AP3_sales_analytics extends AP3_GUI{
    protected AP3_sales_analytics (AP3_GUI a) {
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
        SECTOR = a.SECTOR;
        CompanyID = a.CompanyID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
    }    
    String API_Response_Body = "";
    String[] expectedDateRanges = {"Today", "Yesterday", "Last 7 Days", "Last Week", "Last 30 Days", "Last 90 Days", "Last Month", "Last Year", "Custom"};

    protected void run() {
        try {
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Sales Analytics Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";       
        ArrayList<String> brandIds = new ArrayList<String>();       
        Call_API("Call /location/group/<SiteID>", "Bearer " + AP3_TKN, BaseAPI + "/location/group/" + SiteID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/group/" + SiteID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/group/" + SiteID + "?nocache=1&extended=true", false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            return;
        }
        
        String brand1 = "";
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray locations = json.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            JSONArray brands = location.getJSONArray("brands");
            for (int k = 0; k < brands.length(); k++) {
                JSONObject brand = brands.getJSONObject(k);
                brandIds.add(brand.getString("id"));
                if (brand.getString("name").equalsIgnoreCase(BRAND)) {
                    brand1 = brand.getString("id");                        
                }                
            }
        }      
        
        if (!brandIds.isEmpty()) {
            //combine brand ids to pass into the analytics API call
            String combinedBrands = "";
            for (int i = 0; i < brandIds.size(); i++) {
                if (combinedBrands.equals("")) {
                    combinedBrands = brandIds.get(i);
                } else {
                    combinedBrands += "," +brandIds.get(i);
                }  
            }

            String Start = ""; 
            String End = ""; 
            Calendar c = Calendar.getInstance();
            int day = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
            Date _Start = new DateTime(new Date()).minusDays(7+day).toDate();
            Date _End = new DateTime(new Date()).minusDays(day).toDate();
            Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
            End = new SimpleDateFormat("yyyy-MM-dd").format(_End);

            Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End, true, ParentTest, "no_jira");
            if(t.startsWith("{")){
                API_Response_Body = t;               
            }else{
                EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("FAIL", "URL: " + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End , false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                return;
            }
            json = new JSONObject(API_Response_Body);
            JSONObject analytics = json.getJSONObject("analytics");
            //get various data from analytics API
            if (analytics.isEmpty()) {
                float avg_bill = analytics.getFloat("avg_bill");
                JSONArray top_items = analytics.getJSONArray("top_items");
                int transactions_total = analytics.getInt("transactions_total");
                int sales_total = analytics.getInt("sales_total");
                JSONArray series = analytics.getJSONArray("series");
                JSONObject series1 = series.getJSONObject(0);
                JSONArray data = series1.optJSONArray("data");
                float[] prices = new float[data.length()];
                for (int i = 0; i < data.length(); i++) {
                    prices[i] = data.optFloat(i);
                }
                JSONObject series2 = series.getJSONObject(1);
                JSONArray data2 = series2.optJSONArray("data");
                float[] prices2 = new float[data2.length()];
                for (int i = 0; i < data2.length(); i++) {
                    prices2[i] = data2.optFloat(i);
                }

                Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L0("Get List of Sites", "xpath", "//tbody/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L0.isEmpty() || L0.get(0).findElement(By.tagName("td")).getAttribute("textContent").contains("No data available")) {
                    _t++;
                    _f++; EX += _t + "\t" + "List of Sites did not load" + "\t" + "-" + "\t" + L0.get(0).getAttribute("textContent") + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "List of Sites", true, ParentTest.createNode(_t + ". " + "Sites failed to load"), new Date());
                }
                Element_By_Path_Click("Click > app selection dropdown", "xpath", "(//*[@class='v-select__selections'])[1]", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for app dd list to appear", "xpath", "//*[contains(@class, 'menuable__content__active')]", ParentTest,"no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'All' in app dd list", "xpath", "//*[contains(@class, 'menuable__content__active')]//*[contains(text(), 'All')]", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for table to be loaded", "xpath", "//table",ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Search' field", "css", "[aria-label='Search Sites']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Element_By_Path_Text_Enter("Search > '" + SITE + "'", "css", "[aria-label='Search Sites']", SITE, false,ParentTest, "no_jira");
                if (FAIL) { return;}
                //get list of records
                List_L0("Get list of records", "xpath", "//tbody/tr", ParentTest,"no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < L0.size(); i++) {
                    Wait_For_Element_By_Path_Presence("Check name of site " + String.valueOf(i+1), "xpath", "((//tbody/tr)[" +String.valueOf(i+1)+ "])/td[contains(text(),'" +SITE+ "')]",ParentTest, "no_jira");
                    if (FAIL) { return;}
                } 
                if (!env.equals("PR")) {
                    Element_By_Path_Click("Click > 'Site' = '" + SITE + "'", "xpath", "//span[text()='Volante Printer']/ancestor::tr//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    Element_By_Path_Click("Click > 'Site' = '" + SITE + "'", "xpath", "//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                }        
                Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest, "no_jira");
                if (FAIL) { return;}

                // <editor-fold defaultstate="collapsed" desc="Order Types">  
                EX += " - " + "\t" + " === " + "\t" + " =====  Order Types Begin" + "\t" + " == Order Types Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Element_By_Path_Click("Click > 'Order Type' dd", "xpath", "//label[contains(text(),'Order Type')]/parent::div", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                List_L1("List of Order Types", "xpath", "(//*[@class='v-list v-list--dense theme--light'])[2]/div[@class='primary--text']", ParentTest,"no_jira");
                    if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Element_Child_Attribute("Get Order Types 'class' attribute", L1.get(i), "xpath", "//a", "class", ParentTest, "no_jira");
                    if (t.contains("active")) {
                        _t++;
                        _p++; EX += _t + "\t" + "Check order type " +(i+1)+ " is active by default" + "\t" + "-" + "\t" + t + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("PASS", t, false, ParentTest.createNode(_t + ". " + "Check order type " +(i+1)+ " is active by default"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Check order type " +(i+1)+ " is active by default" + "\t" + "-" + "\t" + t + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", t, true, ParentTest.createNode(_t + ". " + "Check order type " +(i+1)+ " is active by default"), new Date());
                    }
                }
                EX += " - " + "\t" + " === " + "\t" + " =====  Check Default Analytics" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$" +sales_total+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                if (String.valueOf(avg_bill).length() == 3 && String.valueOf(avg_bill).contains(".0")) {
                    String formatted_avg_bill = String.valueOf(avg_bill).substring(0, 1);
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                } else if (String.valueOf(avg_bill).length() == 3) {
                   String formatted_avg_bill = String.valueOf(avg_bill) + "0"; 
                   Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                } else {
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +avg_bill+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                }
                Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '" +transactions_total+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.size() == top_items.length()) {
                    _t++;
                    _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Outout: " + L2.size() + " / Expected: " + top_items.length(), false, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                    Element_E1_Find("Verify Top Item 1 is '" + top_items.getJSONObject(0).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[1]/td[text()='" +top_items.getJSONObject(0).getString("itemlabel")+ "']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 2 is '" + top_items.getJSONObject(1).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[2]/td[text()='" +top_items.getJSONObject(1).getString("itemlabel")+ "']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 3 is '" + top_items.getJSONObject(2).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[3]/td[text()='" +top_items.getJSONObject(2).getString("itemlabel")+ "']", ParentTest, "no_jira");
                        if (FAIL) { return;}
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Outout: " + L2.size() + " / Expected: " + top_items.length(), true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                }
                Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is present", "xpath", "//div[contains(@id, 'apexchart')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] == 0 && (i+1) == prices.length) {
                        break;
                    } else if (prices[i] == 0  && (i+1) != prices.length){
                        continue;
                    }
                    Move_to_Element_By_Path("Move > Bar " + (i+1) + " in Chart for Brand 1", "xpath", "//*[local-name()='g'][1]/*[local-name()='path'][" + (i+1) + "]", ParentTest, "np_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Attribute("Get tooltip value", "xpath", "(//span[@class='apexcharts-tooltip-text-y-value'])[1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    t = t.replace("$ ", "");
                    if (t.contains(String.valueOf(prices[i]))) {
                       _t++;
                       _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                       Log_Html_Result("PASS", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), false, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());

                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), true, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    }
                }
                for (int i = 0; i < prices2.length; i++) {
                    if (prices2[i] == 0 && (i+1) == prices2.length) {
                        break;
                    } else if (prices2[i] == 0  && (i+1) != prices2.length){
                        continue;
                    }
                    Move_to_Element_By_Path("Move > Bar " + (i+1) + " in Chart for Brand 2", "xpath", "//*[local-name()='g'][2]/*[local-name()='path'][" + (i+1) + "]", ParentTest, "np_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Attribute("Get tooltip value", "xpath", "(//span[@class='apexcharts-tooltip-text-y-value'])[1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    t = t.replace("$ ", "");
                    if (String.valueOf(prices2[i]).contains(t)) {
                       _t++;
                       _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices2[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                       Log_Html_Result("PASS", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices2[i]), false, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());

                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices2[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices2[i]), true, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    }
                }
                EX += " - " + "\t" + " === " + "\t" + " =====  Pickup Only" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Element_By_Path_Click("Click > 'Order Type' dd", "xpath", "//label[contains(text(),'Order Type')]/parent::div", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L1("List of Order Types", "xpath", "(//*[@class='v-list v-list--dense theme--light'])[2]/div[@class='primary--text']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > Disable 'Delivery' OT", "xpath", "((//*[@class='v-list v-list--dense theme--light'])[2]/div[@class='primary--text'])[2]/a", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check the Order Type selection was updated", "xpath", "//span[text()='Pickup']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Apply'", "xpath", "(//*[text()='Apply']/parent::button)[2]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to reload", "xpath", "//*[text()='Top Selling Items']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$" +sales_total+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (String.valueOf(avg_bill).length() == 3 && String.valueOf(avg_bill).contains(".0")) {
                    String formatted_avg_bill = String.valueOf(avg_bill).substring(0, 1);
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                } else if (String.valueOf(avg_bill).length() == 3) {
                   String formatted_avg_bill = String.valueOf(avg_bill) + "0"; 
                   Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                } else {
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +avg_bill+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                }
                Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '" +transactions_total+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.size() == 3) {
                    _t++;
                    _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Outout: " + L2.size() + " / Expected: " + top_items.length(), false, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Output: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Outout: " + L2.size() + " / Expected: " + top_items.length(), true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                }
                Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is present", "xpath", "//div[contains(@id, 'apexchart')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] == 0) {
                        break;
                    }
                    Move_to_Element_By_Path("Move > Bar " + (i+1) + " in Chart for Brand 1", "xpath", "//*[local-name()='g'][1]/*[local-name()='path'][" + (i+1) + "]", ParentTest, "np_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Attribute("Get tooltip value", "xpath", "(//span[@class='apexcharts-tooltip-text-y-value'])[1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    t = t.replace("$ ", "");
                    if (String.valueOf(prices[i]).contains(t)) {
                       _t++;
                       _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                       Log_Html_Result("PASS", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), false, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), true, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    }
                }

                EX += " - " + "\t" + " === " + "\t" + " =====  Delivery Only" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Element_By_Path_Click("Click > 'Order Type' dd", "xpath", "//label[contains(text(),'Order Type')]/parent::div", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > Re-enable 'Delivery' OT", "xpath", "((//*[@class='v-list v-list--dense theme--light'])[2]//a)[3]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click > Disable 'Pickup' OT", "xpath", "((//*[@class='v-list v-list--dense theme--light'])[2]/div[@class='primary--text'])[1]/a", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check the Order Type selection was updated", "xpath", "//span[text()='Delivery']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Apply'", "xpath", "(//*[text()='Apply']/parent::button)[2]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to reload", "xpath", "//*[text()='Top Selling Items']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//*[text()='Total Sales']/following-sibling::*[text()='$0']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//*[text()='Average Bill']/following-sibling::*[text()='$0']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//*[text()='Total Transactions']/following-sibling::*[text()='0']", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.isEmpty() || L2.get(0).findElement(By.tagName("td")).getAttribute("textContent").contains("No data available")) {
                    _t++;
                    _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: 1" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Outout: " + L2.size() + " / Expected: 1", true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Output: " + L2.size() + " / Expected: 1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Outout: " + L2.size() + " / Expected: 1", true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                }
                Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is not present", "xpath", "//*[text()='Sales']/following-sibling::*[text()='No data available']", ParentTest, "no_jira");
                if (FAIL) { return;}

                EX += " - " + "\t" + " === " + "\t" + " =====  Delivery Not Set-up" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Search' field", "css", "[aria-label='Search Sites']", ParentTest,"no_jira");
                if (FAIL) { return;}
                if (env.equals("ST")){
                    Element_By_Path_Text_Enter("Search > '00G'", "css", "[aria-label='Search Sites']", "00G", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Site' = '00G'", "xpath", "//td[text()='00G']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    Element_By_Path_Text_Enter("Search > 'CDL test'", "css", "[aria-label='Search Sites']", "CDL test", false,ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_By_Path_Click("Click > 'Site' = 'CDL test'", "xpath", "//td[text()='CDL test']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_E1_Find("Check Order Types is not visible", "xpath", "//span[text()='All Order Types']/parent::div/preceding-sibling::label[@aria-hidden='true']", ParentTest, "no_jira");
                if (FAIL) { return;}
                EX += " - " + "\t" + " === " + "\t" + " =====  Order Types End" + "\t" + " ==  Order Types End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc="Station Selection">  
                EX += " - " + "\t" + " === " + "\t" + " =====  Station Selection Begin" + "\t" + " == Station Selection Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Search' field", "css", "[aria-label='Search Sites']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Element_By_Path_Text_Enter("Search > 'University of Houston'", "css", "[aria-label='Search Sites']", SITE, false,ParentTest, "no_jira");
                if (FAIL) { return;}
                if (!env.equals("PR")) {
                    Element_By_Path_Click("Click > 'Site' = '" +SITE+ "'", "xpath", "//span[text()='Volante Printer']/ancestor::tr//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    Element_By_Path_Click("Click > 'Site' = '" +SITE+ "'", "xpath", "//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                }        
                Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Order Type' dd", "xpath", "//label[contains(text(),'Order Type')]/parent::div", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Select > 'All Order Types'", "xpath", "//*[text()='All Order Types']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
                Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Select Station' dropdown", "xpath", "//*[text()='Select Station']/following-sibling::*[@class='v-select__selections']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L3("Get list of Active Stations", "xpath", "(//div[@class='v-select-list v-card theme--light'])[3]//a[contains(@class,'primary--text')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < L3.size(); i++) {
                    Element_Attribute("Get 'class' value of Station " + (i+1), L3.get(i), "class", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    if (t.contains("active")) {
                        _t++;
                        _p++; EX += _t + "\t" + "Verify Station " + (i+1) + "is active" + "\t" + "\t" + t.contains("active") + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("PASS", t, false, ParentTest.createNode(_t + ". " + "Verify Station " + (i+1) + "is active"), new Date());
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify Station " + (i+1) + "is active" + "\t" + "\t" + t.contains("active") + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", t, true, ParentTest.createNode(_t + ". " + "Verify Station " + (i+1) + "is active"), new Date());
                    }
                }
                Element_By_Path_Click("Deselect > '" +BRAND+ "'", "xpath", "//div[text()='" +BRAND+ "']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click > 'Apply'", "xpath", "(//*[text()='Apply']/parent::button)[2]", ParentTest, "no_jira");
                if (FAIL) { return;}

                combinedBrands = combinedBrands.replace(brand1, "");
                if (combinedBrands.contains(",,")) {
                    combinedBrands = combinedBrands.replace(",,", ",");
                }
                if (combinedBrands.substring(0,1).equals(",")) {
                    combinedBrands = combinedBrands.substring(1, combinedBrands.length());
                }

                Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End, true, ParentTest, "no_jira");
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                json = new JSONObject(API_Response_Body);
                analytics = json.getJSONObject("analytics");
                //get various data from analytics API
                float avg_bill2 = analytics.getFloat("avg_bill");
                top_items = analytics.getJSONArray("top_items");
                int transactions_total2 = analytics.getInt("transactions_total");
                int sales_total2 = analytics.getInt("sales_total");
                series = analytics.getJSONArray("series");
                series1 = series.getJSONObject(0);
                data = series1.optJSONArray("data");
                prices = new float[data.length()];
                for (int i = 0; i < data.length(); i++) {
                    prices[i] = data.optFloat(i);
                }

                EX += " - " + "\t" + " === " + "\t" + " =====  Check Updated Analytics" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$" +sales_total2+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (String.valueOf(avg_bill2).length() == 3 && String.valueOf(avg_bill2).contains(".0")) {
                    String formatted_avg_bill = String.valueOf(avg_bill2).substring(0, 1);
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else if (String.valueOf(avg_bill2).length() == 3) {
                    String formatted_avg_bill = String.valueOf(avg_bill2) + "0"; 
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                } else {
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +avg_bill2+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '" +transactions_total2+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.size() == 3) {
                    _t++;
                    _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Outout: " + L2.size() + " / Expected: " + top_items.length(), false, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                    Element_E1_Find("Verify Top Item 1 is '" + top_items.getJSONObject(0).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[1]/td[text()='" +top_items.getJSONObject(0).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 2 is '" + top_items.getJSONObject(1).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[2]/td[text()='" +top_items.getJSONObject(1).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 3 is '" + top_items.getJSONObject(2).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[3]/td[text()='" +top_items.getJSONObject(2).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Outout: " + L2.size() + " / Expected: " + top_items.length(), true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                }
                Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is present", "xpath", "//div[contains(@id, 'apexchart')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] == 0) {
                        break;
                    }
                    Move_to_Element_By_Path("Move > Bar " + (i+1) + " in Chart for Brand 1", "xpath", "//*[local-name()='g'][1]/*[local-name()='path'][" + (i+1) + "]", ParentTest, "np_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Attribute("Get tooltip value", "xpath", "(//span[@class='apexcharts-tooltip-text-y-value'])[1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    t = t.replace("$ ", "");
                    if (String.valueOf(prices[i]).contains(t)) {
                        _t++;
                        _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("PASS", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), false, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());

                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), true, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    }
                }
                EX += " - " + "\t" + " === " + "\t" + " =====  Multi-select/de-select Stations" + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Element_By_Path_Click("Click > 'Select Station' dropdown", "xpath", "//*[text()='Select Station']/following-sibling::*[@class='v-select__selections']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("Get list of Active Stations", "xpath", "(//div[@class='v-select-list v-card theme--light'])[3]//a[contains(@class,'primary--text')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                int initalSizeOfSelectedStations = L2.size();
                for (int i = 0; i < L2.size(); i++) {
                    Element_Attribute("Get 'class' value of Station " + (i+1), L2.get(i), "class", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    if (t.contains("active")) {
                        Element_Click("Deselect 'Stations'", L2.get(i), ParentTest, "no_jira");
                        if (FAIL) { return;}
                    } 
                }
                List_L2("Get list of Active Stations after De-select", "xpath", "(//div[@class='v-select-list v-card theme--light'])[3]//a[contains(@class,'primary--text')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (initalSizeOfSelectedStations != L2.size()) {
                    _t++;
                    _p++; EX += _t + "\t" + "Verify List Size of Active Stations" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: $ " + initalSizeOfSelectedStations + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Output: " + L2.size() + " / Expected: $ " + initalSizeOfSelectedStations, false, ParentTest.createNode(_t + ". " + "Verify List of Active Stations"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Verify List Size of Active Stations" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: $ " + initalSizeOfSelectedStations + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Output: " + L2.size() + " / Expected: $ " + initalSizeOfSelectedStations, true, ParentTest.createNode(_t + ". " + "Verify List of Active Stations"), new Date());
                }
                Element_By_Path_Click("Click > 'Apply'", "xpath", "(//*[text()='Apply']/parent::button)[2]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Select Station' dropdown", "xpath", "//*[text()='Select Station']/following-sibling::*[@class='v-select__selections']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L0("Get List of Stations", "xpath", "(//div[@class='v-select-list v-card theme--light'])[3]//a[@class='v-list__tile v-list__tile--link theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 1; i < L0.size(); i++) {
                    Element_Attribute("Get 'class' value of Station " + i, L0.get(i), "class", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    if (!t.contains("active")) {
                        Element_Child_Text("Get Station Name", L0.get(i), "xpath", "//div[contains(text(),'" +BRAND+ "')]", ParentTest, "no_jira");
                        if (FAIL) { return;}
                        if (!t.equals(BRAND)) {
                            Element_Click("Select 'Stations'", L0.get(i), ParentTest, "no_jira");
                            if (FAIL) { return;}
                        } 
                    } 
                }
                List_L2("Get list of Active Stations after Multi-select", "xpath", "(//div[@class='v-select-list v-card theme--light'])[3]//a[contains(@class,'primary--text')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.size() == L3.size()-1) {
                    _t++;
                    _p++; EX += _t + "\t" + "Verify List Size of Active Stations" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: $ " + (L3.size()-1) + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Output: " + L2.size() + " / Expected: $ " + (L3.size()-1), false, ParentTest.createNode(_t + ". " + "Verify List of Active Stations"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Verify List Sive of Active Stations" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: $ " + (L3.size()-1) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Output: " + L2.size() + " / Expected: $ " + (L3.size()-1), true, ParentTest.createNode(_t + ". " + "Verify List of Active Stations"), new Date());
                }
                EX += " - " + "\t" + " === " + "\t" + " =====  Station Selection End" + "\t" + " ==  Station Selection End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc="Time Range Selection">  
                EX += " - " + "\t" + " === " + "\t" + " =====  Time Range Begin" + "\t" + " == Time Range Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Search' field", "css", "[aria-label='Search Sites']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Element_By_Path_Text_Enter("Search > 'University of Houston'", "css", "[aria-label='Search Sites']", SITE, false,ParentTest, "no_jira");
                if (FAIL) { return;}
                if (!env.equals("PR")) {
                    Element_By_Path_Click("Click > 'Site' = '" +SITE+ "'", "xpath", "//span[text()='Volante Printer']/ancestor::tr//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    Element_By_Path_Click("Click > 'Site' = '" +SITE+ "'", "xpath", "//td[text()='" +SITE+ "']",ParentTest, "no_jira");
                    if (FAIL) { return;}
                }        
                Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Date Picker' field", "css", "[class='datePicker']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Wait_For_Element_By_Path_Presence("Wait for date picker to appear", "xpath", "//div[contains(@class,'menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                Element_By_Path_Click("Click > 'Date  Range' dd", "xpath", "(//i[contains(@class,'mdi-menu-down')])[1]", ParentTest,"no_jira");
                if (FAIL) { return;}
                List_L1("Get List of Date Ranges", "xpath", "//div[contains(@class,'menuable__content__active')]//a", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < L1.size(); i++) {
                    Wait_For_Element_By_Path_Presence("Check Date Range List positon " + (i+1) + " is '" + expectedDateRanges[i] + "'", "xpath", 
                            "//div[contains(@class,'menuable__content__active')]//a//*[text()='" + expectedDateRanges[i] + "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Element_By_Path_Click("Click > 'Last 30 Days' in List", "xpath", "//*[text()='Last 30 Days']", ParentTest,"no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click > 'Apply' in date picker", "xpath", "(//div[text()='Apply'])[1]", ParentTest,"no_jira");
                if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click > 'Apply'", "xpath", "(//*[text()='Apply']/parent::button)[2]", ParentTest, "no_jira");
                if (FAIL) { return;}

                _Start = new DateTime(new Date()).minusDays(30).toDate();
                _End = new DateTime(new Date()).toDate();
                Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
                End = new SimpleDateFormat("yyyy-MM-dd").format(_End);

                Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End, true, ParentTest, "no_jira");
                if(t.startsWith("{")){
                    API_Response_Body = t;               
                }else{
                    EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=" +Start+ "&end_date=" +End, false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
                    return;
                }
                json = new JSONObject(API_Response_Body);
                analytics = json.getJSONObject("analytics");
                //get various data from analytics API
                float avg_bill3 = analytics.getFloat("avg_bill");
                top_items = analytics.getJSONArray("top_items");
                int transactions_total3 = analytics.getInt("transactions_total");
                int sales_total3 = analytics.getInt("sales_total");
                series = analytics.getJSONArray("series");
                series1 = series.getJSONObject(0);
                data = series1.optJSONArray("data");
                prices = new float[data.length()];
                for (int i = 0; i < data.length(); i++) {
                    prices[i] = data.optFloat(i);
                }

                EX += " - " + "\t" + " === " + "\t" + " =====  Check Updated Analytics" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$" +sales_total3+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (String.valueOf(avg_bill3).length() == 3 && String.valueOf(avg_bill3).contains(".0")) {
                    String formatted_avg_bill = String.valueOf(avg_bill3).substring(0, 1);
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else if (String.valueOf(avg_bill3).length() == 3) {
                    String formatted_avg_bill = String.valueOf(avg_bill3) + "0"; 
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +formatted_avg_bill+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                } else {
                    Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$" +avg_bill3+ "')]", ParentTest, "no_jira");
                    if (FAIL) { return;}
                }
                Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '" +transactions_total3+ "')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
                if (FAIL) { return;}
                if (L2.size() == top_items.length()) {
                    _t++;
                    _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("PASS", "Outout: " + L2.size() + " / Expected: " + top_items.length(), false, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                    Element_E1_Find("Verify Top Item 1 is '" + top_items.getJSONObject(0).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[1]/td[text()='" +top_items.getJSONObject(0).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 2 is '" + top_items.getJSONObject(1).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[2]/td[text()='" +top_items.getJSONObject(1).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    Element_E1_Find("Verify Top Item 3 is '" + top_items.getJSONObject(2).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[3]/td[text()='" +top_items.getJSONObject(2).getString("itemlabel")+ "']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                    Log_Html_Result("FAIL", "Outout: " + L2.size() + " / Expected: " + top_items.length(), true, ParentTest.createNode(_t + ". " + "Number of 'Top Selling Items'"), new Date());
                }
                Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is present", "xpath", "//div[contains(@id, 'apexchart')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                for (int i = 0; i < prices.length; i++) {
                    if (prices[i] == 0) {
                        break;
                    }
                    Move_to_Element_By_Path("Move > Bar " + (i+1) + " in Chart for Brand 1", "xpath", "//*[local-name()='g'][1]/*[local-name()='path'][" + (i+1) + "]", ParentTest, "np_jira");
                    if (FAIL) { return;}
                    Thread.sleep(500);
                    Element_By_Path_Attribute("Get tooltip value", "xpath", "(//span[@class='apexcharts-tooltip-text-y-value'])[1]", "textContent", ParentTest, "no_jira");
                    if (FAIL) { return;}
                    t = t.replace("$ ", "");
                    if (String.valueOf(prices[i]).contains(t)) {
                        _t++;
                        _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("PASS", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), false, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());

                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                        Log_Html_Result("FAIL", "Output: $ " + t + " / Expected: $ " + String.valueOf(prices[i]), true, ParentTest.createNode(_t + ". " + "Verify tooltip value"), new Date());
                    }
                }      
                EX += " - " + "\t" + " === " + "\t" + " =====  Time Range End" + "\t" + " == Time Range End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                // </editor-fold>

                EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Sales Analytics End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            } else {
                _t++;
                _w++; EX += _t + "\t" + "WARNING - NO SALES DATA EXISTS" + "\t" + "- SALES ANALYTICS CANNOT BE TESTED" + "\t" + "---" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("WARN", "---" + "\t" + "- SALES ANALYTICS CANNOT BE TESTED", false, ParentTest.createNode(_t + ". " + "WARNING - NO SALES DATA EXISTS"), new Date());
            }
        } else {
            _t++;
            _w++; EX += _t + "\t" + "WARNING - NO BRANDS EXISTS" + "\t" + "- SALES ANALYTICS CANNOT BE TESTED" + "\t" + "---" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("WARN", "---" + "\t" + "- SALES ANALYTICS CANNOT BE TESTED", false, ParentTest.createNode(_t + ". " + "WARNING - NO BRANDS EXISTS"), new Date());
        }
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    } 
    } 
}
