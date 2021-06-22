package AP3_New;

import static A.A.*;
import java.time.LocalDateTime;

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
        New_ID = a.New_ID;
        TZone = a.TZone;
    }    
    String API_Response_Body = "";
    protected void run() throws Exception {

        String SITE_NAME = "University of Houston";

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
        Wait_For_Element_By_Path_Presence("Wait (if needed) page to load", "xpath", "//div[@class='salesTransactions']", ParentTest,"no_jira");
        if (FAIL) { return;}
        
        // <editor-fold defaultstate="collapsed" desc="Order Types">  
        EX += " - " + "\t" + " === " + "\t" + " =====  Order Types Begin" + "\t" + " == Order Types Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Element_By_Path_Click("Click > 'Order Type' dd", "xpath", "//label[contains(text(),'Order Type')]/parent::div", ParentTest,"no_jira");
        if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait (if needed) for dd to appear", "xpath", "//*[@class='v-list v-list--dense theme--light']",ParentTest, "no_jira");
        if (FAIL) { return;}
        List_L1("List of Order Types", "xpath", "(//*[@class='v-list v-list--dense theme--light'])[2]/div[@class='primary--text']", ParentTest,"no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++) {
            Element_Child_Attribute("Get Order Types 'class' attribute", L1.get(i), "xpath", "//a", "class", ParentTest, "no_jira");
            if (FAIL) { return;}
        }
        EX += " - " + "\t" + " === " + "\t" + " =====  Order Types End" + "\t" + " ==  Order Types End >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        // </editor-fold>
    }
}
