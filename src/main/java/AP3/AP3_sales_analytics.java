package AP3;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;

/**
 *
 * @author astrit.ademi
 */

class AP3_sales_analytics extends AP3_GUI{
    protected AP3_sales_analytics (AP3_GUI a) throws Exception {
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
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
    }    
    String API_Response_Body = "";
    
    protected void run() throws Exception {
        
        ArrayList<String> brandIds = new ArrayList<String>();
        String brandNames[] = {"subeway", "drexler's bbq", "chick-fil-a", "starbucks", "freshii", "pizza hut", "einstein bros. bagels", "taco cabana", "taco bell"};
        //get all brand ids from site: University of Houston 
        Call_API("Call /location/group/'SiteID'", "Bearer " + AP3_TKN, "https://api.compassdigital.org/v1/location/group/" + SiteID + "?nocache=1&extended=true", true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + "https://api.compassdigital.org/v1/location/group/" + SiteID + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + "https://api.compassdigital.org/v1/location/group/" + SiteID + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray locations = json.getJSONArray("locations");
        for (int i = 0; i < locations.length(); i++) {
            JSONObject location = locations.getJSONObject(i);
            JSONArray brands = location.getJSONArray("brands");
            for (int k = 0; k < brands.length(); k++) {
                JSONObject brand = brands.getJSONObject(k);
                for (int j = 0; j < brandNames.length; j++) {
                    if (brandNames[j].contains(brand.getString("name").toLowerCase())) {
                        brandIds.add(brand.getString("id"));
                    }
                }
                
            }
        }      

        //combine brand ids to pass into the analytics API call
        String combinedBrands = "";
        
        for (int i = 0; i < brandIds.size(); i++) {
            if (combinedBrands.equals("")) {
                combinedBrands = brandIds.get(i);
            } else {
                combinedBrands += ","+brandIds.get(i);
            }  
        }
        
        String Start = ""; 
        String End = ""; 
        Date _Start = new DateTime(new Date()).minusDays(7).toDate();
        Date _End = new DateTime(new Date()).minusDays(1).toDate();
        Start = new SimpleDateFormat("yyyy-MM-dd").format(_Start); 
        End = new SimpleDateFormat("yyyy-MM-dd").format(_End);
        
        Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date="+Start+"&end_date="+End, true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date="+Start+"&end_date="+End + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=2021-06-14&end_date=2021-06-20", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        JSONObject analytics = json.getJSONObject("analytics");
        //get various data from analytics API
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
        
        Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
        if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L0("Get List of Sites", "xpath", "//tbody/tr", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (L0.isEmpty() || L0.get(0).findElement(By.tagName("td")).getAttribute("textContent").contains("No data available")) {
            _t++;
            _f++; EX += _t + "\t" + "List of Sites did not load" + "\t" + "-" + "\t" + L0.get(0).getAttribute("textContent") + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "List of Sites", true, ParentTest.createNode("Sites failed to load"));
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
        Element_By_Path_Text_Enter("Search > 'University of Houston'", "css", "[aria-label='Search Sites']", SITE, false,ParentTest, "no_jira");
        if (FAIL) { return;}
        //get list of records
        List_L0("Get list of records", "xpath", "//tbody/tr", ParentTest,"no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            Wait_For_Element_By_Path_Presence("Check name of site " + String.valueOf(i+1), "xpath", "((//tbody/tr)["+String.valueOf(i+1)+"])/td[contains(text(),'"+SITE+"')]",ParentTest, "no_jira");
            if (FAIL) { return;}
        } 
        if (!env.equals("PR")) {
            Element_By_Path_Click("Click > 'Site' = '"+SITE+"'", "xpath", "//span[text()='Volante Printer']/ancestor::tr//td[text()='"+SITE+"']",ParentTest, "no_jira");
            if (FAIL) { return;}
        } else {
            Element_By_Path_Click("Click > 'Site' = '"+SITE+"'", "xpath", "//td[text()='"+SITE+"']",ParentTest, "no_jira");
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
            if (FAIL) { return;}
            if (t.contains("active")) {
                _t++;
                _p++; EX += _t + "\t" + "Check order type " +(i+1)+ " is active by default" + "\t" + "-" + "\t" + t + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                Log_Html_Result("PASS", "Check order type " +(i+1)+ " is active by default", false, ParentTest);
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check order type " +(i+1)+ " is active by default" + "\t" + "-" + "\t" + t + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("FAIL", "Check order type " +(i+1)+ " is active by default", true, ParentTest);
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " =====  Check Default Analytics" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$"+sales_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (String.valueOf(avg_bill).length() == 3 && String.valueOf(avg_bill).contains(".0")) {
            String formatted_avg_bill = String.valueOf(avg_bill).substring(0, 1);
            Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+formatted_avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        } else if (String.valueOf(avg_bill).length() == 3) {
           String formatted_avg_bill = String.valueOf(avg_bill) + "0"; 
           Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+formatted_avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        } else {
            Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        }
        Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '"+transactions_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (L2.size() == 3) {
            _t++;
            _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("PASS", "Number of 'Top Selling Items'", false, ParentTest.createNode("Outout: " + L2.size() + " / Expected: " + top_items.length()));
            Element_E1_Find("Verify Top Item 1 is '" + top_items.getJSONObject(0).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[1]/td[text()='"+top_items.getJSONObject(0).getString("itemlabel")+"']", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_E1_Find("Verify Top Item 2 is '" + top_items.getJSONObject(1).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[2]/td[text()='"+top_items.getJSONObject(1).getString("itemlabel")+"']", ParentTest, "no_jira");
            if (FAIL) { return;}
            Element_E1_Find("Verify Top Item 3 is '" + top_items.getJSONObject(2).getString("itemlabel") + "'", "xpath", "((//tbody)[2]/tr)[3]/td[text()='"+top_items.getJSONObject(2).getString("itemlabel")+"']", ParentTest, "no_jira");
            if (FAIL) { return;}
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("FAIL", "Number of 'Top Selling Items'", true, ParentTest.createNode("Outout: " + L2.size() + " / Expected: " + top_items.length()));
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
            if (t.contains(String.valueOf(prices[i]))) {
               _t++;
               _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
               Log_Html_Result("PASS", "Verify tooltip value", false, ParentTest.createNode("Output: " + t + " / Expected: $ " + String.valueOf(prices[i])));
               
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                Log_Html_Result("FAIL", "Verify tooltip value", true, ParentTest.createNode("Output: " + t + " / Expected: $ " + String.valueOf(prices[i])));
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
        Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$"+sales_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (String.valueOf(avg_bill).length() == 3 && String.valueOf(avg_bill).contains(".0")) {
            String formatted_avg_bill = String.valueOf(avg_bill).substring(0, 1);
            Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+formatted_avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        } else if (String.valueOf(avg_bill).length() == 3) {
           String formatted_avg_bill = String.valueOf(avg_bill) + "0"; 
           Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+formatted_avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        } else {
            Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        }
        Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '"+transactions_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (L2.size() == 3) {
            _t++;
            _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "\t" + "Output: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("PASS", "Number of 'Top Selling Items'", false, ParentTest.createNode("Outout: " + L2.size() + " / Expected: " + top_items.length()));
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Output: " + L2.size() + " / Expected: " + top_items.length() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("FAIL", "Number of 'Top Selling Items'", true, ParentTest.createNode("Outout: " + L2.size() + " / Expected: " + top_items.length()));
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
            if (t.contains(String.valueOf(prices[i]))) {
               _t++;
               _p++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: " + t + " / Expected: $ " + String.valueOf(prices[i]) +  "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
               Log_Html_Result("PASS", "Verify tooltip value", false, ParentTest.createNode("Output: " + t + " / Expected: $ " + String.valueOf(prices[i])));
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Verify tooltip value" + "\t" + "\t" + "Output: " + t + " / Expected: $ " + String.valueOf(prices[i]) + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
                Log_Html_Result("FAIL", "Verify tooltip value", true, ParentTest.createNode("Output: " + t + " / Expected: $ " + String.valueOf(prices[i])));
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
            Log_Html_Result("PASS", "Number of 'Top Selling Items'", false, ParentTest.createNode("Outout: " + L2.size() + " / Expected: 1"));
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" +  "\t" + "Output: " + L2.size() + " / Expected: 1" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("FAIL", "Number of 'Top Selling Items'", true, ParentTest.createNode("Outout: " + L2.size() + " / Expected: 1"));
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
    }
}
