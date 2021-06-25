package AP3;

import static A.A.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

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
        
        String SITE_NAME = "University of Houston";
        String userId = "";
        ArrayList<String> brandIds = new ArrayList<String>();
        
        //get userId
        Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/user/realm/6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5?nocache=1&max=2000", true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/user/realm/6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5?nocache=1&max=2000" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/user/realm/6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5?nocache=1&max=2000", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray users = json.getJSONArray("users");
        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);
            //JSONObject name = user.getJSONObject("name");
            if (user.getString("email").equals(ADMIN_ID)) {
                userId = user.getString("id");
                break;
            }
        }
        //get all brand ids from site: University of Houston 
        Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/location/multigroup/" + appId + "/user/" + userId + "?nocache=1&extended=true", true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/location/multigroup/" + appId + "/user/" + userId + "?nocache=1&extended=true" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/location/multigroup/" + appId + "/user/" + userId + "?nocache=1&extended=true", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        JSONArray groups = json.getJSONArray("groups");
        JSONArray locations = new JSONArray();
        JSONObject location = new JSONObject();
        for (int i = 0; i < groups.length(); i++) {
            JSONObject group = groups.getJSONObject(i);
            JSONObject label = group.getJSONObject("label");
            if (label.getString("en").equals(SITE_NAME)) {
                locations = group.getJSONArray("locations");
                break;
            }
        }
        
        for (int i = 0; i < locations.length(); i++) {
            location = locations.getJSONObject(i);
            JSONArray brands = location.getJSONArray("brands");
            for (int k = 0; k < brands.length(); k++) {
                JSONObject brand = brands.getJSONObject(k);
                brandIds.add(brand.getString("id"));  
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
        
        Call_API("Call Analytics API", "Bearer " + AP3_TKN, BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=2021-06-14&end_date=2021-06-20", true, ParentTest, "no_jira");
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=2021-06-14&end_date=2021-06-20" + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/report/analytics/combined/group/" + SiteID + "?brand_ids=" + combinedBrands + "&time_frame=day&start_date=2021-06-14&end_date=2021-06-20", false, ParentTest.createNode("API Responce Error"));
            return;
        }
        json = new JSONObject(API_Response_Body);
        JSONObject analytics = json.getJSONObject("analytics");
        //get various data from analytics API
        String avg_bill = analytics.getString("avg_bill");
        JSONArray top_items = analytics.getJSONArray("top_items");
        String transactions_total = analytics.getString("transactions_total");
        String sales_total = analytics.getString("sales_total");
        JSONArray dates = analytics.getJSONArray("dates");

        Navigate_to_URL("Navigate to Sales Analytics Page", url + "#/sales-analytics/all", ParentTest, "no_jira");
        if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for page to load", "xpath", "//*[contains(text(), 'Sales Analytics')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L0("Get List of Sites", "xpath", "//tbody/tr", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (L0.isEmpty() || L0.get(0).getAttribute("textContent").contains("No data available")) {
            _t++;
            _f++; EX += _t + "\t" + "List of Sites did not load" + "\t" + "-" + "\t" + L0.get(0).getAttribute("textContent") + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
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
        Element_By_Path_Text_Enter("Search > 'University of Houston'", "css", "[aria-label='Search Sites']", SITE_NAME, false,ParentTest, "no_jira");
        if (FAIL) { return;}
        //get list of records
        List_L0("Get list of records", "xpath", "//tbody/tr", ParentTest,"no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L0.size(); i++) {
            Wait_For_Element_By_Path_Presence("Check name of site " + String.valueOf(i+1), "xpath", "((//tbody/tr)["+String.valueOf(i+1)+"])/td[contains(text(),'"+SITE_NAME+"')]",ParentTest, "no_jira");
            if (FAIL) { return;}
        } 
        Element_By_Path_Click("Click > 'Site' = '"+SITE_NAME+"'", "xpath", "((//tbody/tr)[2])/td[contains(text(),'"+SITE_NAME+"')]",ParentTest, "no_jira");
        if (FAIL) { return;}
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
                _p++; EX += _t + "\t" + "Check order type " +(i+1)+" is active by default" + "\t" + "-" + "\t" + t + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
            } else {
                _t++;
                _f++; EX += _t + "\t" + "Check order type " +(i+1)+" is active by default" + "\t" + "-" + "\t" + t + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
            }
        }
        EX += " - " + "\t" + " === " + "\t" + " =====  Check Default Analytics" + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Wait_For_Element_By_Path_Presence("Check 'Total Sales' is present", "xpath", "//span[contains(text(), '$"+sales_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check 'Average Bill' is present", "xpath", "//span[contains(text(), '$"+avg_bill+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Check 'Total Transactions' is present", "xpath", "//span[contains(text(), '"+transactions_total+"')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L2("List of 'Top Selling Items'", "xpath", "(//tbody)[2]/tr", ParentTest, "no_jira");
        if (FAIL) { return;}
        if (L2.size() == 3) {
            _t++;
            _p++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "- Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + t + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
        } else {
            _t++;
            _f++; EX += _t + "\t" + "Number of 'Top Selling Items'" + "\t" + "- Outout: " + L2.size() + " / Expected: " + top_items.length() + "\t" + t + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
        }
        Wait_For_Element_By_Path_Presence("Check 'Sales Chart' is present", "xpath", "//div[contains(@id, 'apexchart')]", ParentTest, "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " =====  Order Types End" + "\t" + " ==  Order Types End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>
    }
}
