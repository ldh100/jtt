package WO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

class WO_account_payments extends WO_GUI {
    protected WO_account_payments(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        BaseAPI = a.BaseAPI;
        AP3_TKN = a.AP3_TKN;

        New_ID = a.New_ID;
        Site_ID = a.Site_ID;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    String[] PAYMENT_TYPE = {"exact","freedompay"};
    String paymentType = "";   


    protected void run() {   
    try {     
        Call_API("Call /location/private config API", "Bearer " + AP3_TKN, BaseAPI + "/config/" + Site_ID + "?nocache=1", true, ParentTest, "no_jira" );      
        for(String str : PAYMENT_TYPE)
        if (API_Response_Body.contains(str)){          
           paymentType = str;
           API_Body_Contains("Get the Site Payment Type from API: " + paymentType, paymentType, true, ParentTest, "no_jira");
           break;
        }
        if(paymentType.isEmpty()){
             EX += _t + "No payment type setting "  + "\t" + "=====" + "\t" + "could not find the payment type" + "\t" + "PASS" + "\t" + " - " + "";
             return;
        } 
//        Element_By_Selector_Click("Open User 'Menu'", "xpath", "//i[@class='v-icon notranslate mdi mdi-menu theme--light']", ParentTest, "no_jira");                                     
//            if (FAIL) { return;}     
        Element_By_Selector_Click("Open User 'Menu'", "id", "nav-menu-btn", ParentTest, "no_jira");                                     
            if (FAIL) { return;}          
        Element_By_Selector_Click("Click Menu > 'My Account'", "xpath", "//h4[text()='My account']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}    
        //Element_By_Selector_Text("Get 'Payment methods' tab text", "xpath", "//a[@href='/account-settings/payment-options']", ParentTest, "no_jira");  
//        Element_By_Selector_Click("Click 'Payment methods' tab", "xpath", "//a[@href='/account-settings/payment-options']", ParentTest, "no_jira");
//           if (FAIL) { return;} 
        Element_By_Selector_Click("Click 'Payment methods' tab", "id", "to-payment-options", ParentTest, "no_jira");
           if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}
        //Get Payment Cards >>> delete  existed
        List_L1("Get Item List in 'Payment Cards' container / Count (including 'Add New Card)", "css", "[role='listitem']", ParentTest, "no_jira"); 
        for (int j = 0; j < (L1.size() - 1); j++) {
            Element_Text("Card > last 4 digit:", L1.get(j), ParentTest, "no_jira");     
            Element_By_Selector_Click("Click/Open Card details", "xpath", "//*[contains(@class, 'v-list-item__action')]", ParentTest, "no_jira");  
                if (FAIL) { return;} 
            Thread.sleep(500);             
            Element_By_Selector_Click("Click Card > Delete button", "xpath", "//span[@class='delete-card-text']", ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                if (FAIL) { return;}
            Thread.sleep(500);
        }
        //Enter Add New CC screen   
        Element_By_Selector_Text("Find 'Add New Card' row", "xpath", "//h4[text()='Add a new card']",ParentTest, "no_jira");
        Element_By_Selector_Click("Click 'Add New Card'", "xpath", "//h4[text()='Add a new card']",ParentTest, "no_jira"); 
            if (FAIL) { return;} 
  
        //Determine the payment type FreedomPay/EXACT validate against API return
        if(paymentType.toLowerCase().equals("freedompay")){
            Element_E1_Find("Determine the payment type (iframe > freedompay)","xpath", "//iframe[contains(@src, 'freedompay')]", ParentTest, "no_jira");    
            if(FAIL) {    // no freedompay iframe >>> exact 
                paymentType = "exact";
                Wait_For_Element_By_Selector_Presence("Wait for 'Add New Card' fragment present", "xpath", "//h2[@class='mb-5 text-center']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                _t++; _f++;
                EX += _t + "\t" + "Validate Payment Type" + "\t" + "Expected by API return" + "\t" + paymentType + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("FAIL", "iframe[contains(@src, 'freedompay')] - Not found", false, ParentTest.createNode(_t + ". " + "Validate FE Payment Type - expected from API: freedompay"), new Date());
            }else{
                paymentType = "freedompay";
                Wait_For_Element_By_Selector_Presence("Wait for 'Add New Card' fragment present", "xpath", "//h2[@class='mb-4 text-center']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                _t++; _p++;
                EX += _t + "\t" + "Validate Payment Type" + "\t" + "Expected by API return" + "\t" + paymentType + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("PASS", "iframe[contains(@src, 'freedompay')] - found", false, ParentTest.createNode(_t + ". " + "Validate FE Payment Type - expected from API: freedompay"), new Date());
            }
        }

        switch (paymentType){
            case "exact":     
                Element_By_Selector_Text_Enter("Enter Name on card", "id", "nameOnCard", "JTT " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Card Number", "id", "maskedCardNumber", "5500000000000004", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter Expiration Date", "id", "expiryDate", "1223", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter CVV (SecurityCode)", "id" , "cvv", "123", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter Canada Postal code", "id" , "zipcode", "L4L3C3", false, ParentTest, "no_jira");
                    if (FAIL) { return;}

                Element_By_Selector_Click("Click 'Save' <Card> button", "id", "saveCardButton", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                    if (FAIL) { return;}  
                List_L3("Check Error Message(s)", "xpath", "//*[contains(@class, 'error-card')]", ParentTest, "no_jira");
                if(!L3.isEmpty()){  // Check Error 'Wallet error', 'Could not save card in wallet'
                    Element_Text("Get Error Message(s)", L3.get(L3.size() - 1), ParentTest, "no_jira");
                    Element_Child_Click("Click 'Error Card > Ok'", L3.get(L3.size() - 1), "xpath", ".//*[text()='Ok']", ParentTest, "no_jira");             
                        //if (FAIL) { return;}  
                }             
                break; 
            case "freedompay":
                Element_By_Selector_Click("Click 'Enter Name on card' input", "className", "iframe-input", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Name on Card", "className", "iframe-input", "JTT " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;}    
             
                Swith_to_Frame("switch iframe", "tagName", "iframe", ParentTest, "no_jira"); //Switch to iframe
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Card Number", "id", "CardNumber", "340000000000009",false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Expiration Date", "id", "ExpirationDate", "1124", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter CVV (SecurityCode)", "id", "SecurityCode", "6960", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter US Zip Code (Postal Code)", "id", "PostalCode", "47234", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Click("Click Save Card", "className", "fp-hpc-pay-button", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Swith_to_Frame("Switch back from 'ifarme' to 'defaultContent'", "defaultContent", null, ParentTest, "no_jira");

                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                    if (FAIL) { return;} 
                List_L3("Check Error Message(s)", "xpath", "//*[contains(@class, 'error-card')]", ParentTest, "no_jira");
                if(!L3.isEmpty()){  // Check Error 'Wallet error', 'Could not save card in wallet'
                    Element_Text("Get Error Message(s)", L3.get(L3.size() - 1), ParentTest, "no_jira");
                    Element_Child_Click("Click 'Error Card > Ok'", L3.get(L3.size() - 1), "xpath", ".//*[text()='Ok']", ParentTest, "no_jira");             
                        //if (FAIL) { return;}  
                }
                break;
            default: 
                break;
        }
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
        }       
    }  

}
