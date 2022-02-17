package WO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

class WO_account_settings extends WO_GUI {
    protected WO_account_settings(WO_GUI a) {
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
    String[] NAME = new String[]{"JTT Visa", "JTT Mastercard", "JTT AMEX","JTT Discovery"}  ;
    String[] CARD_NUM = new String[]{"4111111111111111", "5500000000000004","340000000000009" ,"6011000000000004"};
    String[] EXPIRE_MON = new String[]{"01","04","07","12"};
    String[] EXPIRE_YEAR = new String[]{"2023","2025","2030", "2027"};
    String[] CVV = new String[]{"444","444", "6960", "145"};
    String[] POSTAL = new String[]{"l1l2l3","12345", "", "a1b2c3"};
    String[] ERRMESSAGE = {"Card Number is incomplete","Expiration Date is incomplete","Security Code is incomplete","Postal Code is incomplete"};
    String[] PAYMENT_TYPE = {"exact","freedompay"};
    String paymentType = "";   
    class PaymentInfo{
        String name, card_num, expire_month, expire_year, cvv, postalcode;
        PaymentInfo(){};
        PaymentInfo(String name, String card_num, String expire_month, String expire_year,String cvv, String postalcode ){
            this.name = name;
            this.card_num = card_num;
            this.expire_month = expire_month;
            this.expire_year = expire_year;
            this.cvv = cvv;     
            this.postalcode = postalcode;
        }
    }

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
        Element_By_Selector_Click("Open User 'Menu'", "xpath", "//i[@class='v-icon notranslate mdi mdi-menu theme--light']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}          
        Element_By_Selector_Click("Click 'My Account'", "xpath", "//h4[text()='My account']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}    
        //Element_By_Selector_Text("Get 'Payment methods' tab text", "xpath", "//a[@href='/account-settings/payment-options']", ParentTest, "no_jira");  
        Element_By_Selector_Click("Click 'Payment methods' tab", "xpath", "//a[@href='/account-settings/payment-options']", ParentTest, "no_jira");
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
       
       
        PaymentInfo pi = new PaymentInfo() ;
        
        switch (paymentType){
            case "exact":     
                Element_By_Selector_Text_Enter("Enter Name on card", "id", "nameOnCard", "JTT " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Card Number", "id", "maskedCardNumber", "5500000000000004", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter Expiration Date", "id", "expiryDate", "1223", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter CVV", "id" , "cvv", "123", false, ParentTest, "no_jira");
                    if (FAIL) { return;}
                Element_By_Selector_Text_Enter("Enter Canada Postal code", "id" , "zipcode", "L4L3C3", false, ParentTest, "no_jira");
                    if (FAIL) { return;}

                Element_By_Selector_Click("Click 'Save' <Card> button", "id", "saveCardButton", ParentTest, "no_jira"); 
                    if (FAIL) { return;}
                Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                    if (FAIL) { return;}
                //Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)",ParentTest, "no_jira");                  
                break; 
            case "freedompay":
                Element_By_Selector_Click("Click 'Enter Name on card' input", "className", "iframe-input", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Name on Card", "className", "iframe-input", "JTT " + New_ID, false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                //Switch to iframe
                Swith_to_Frame("switch iframe", "tagName", "iframe", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Card Number", "id", "CardNumber", "340000000000009",false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter Expire Date", "id", "ExpirationDate", "1124", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter CVV","id", "SecurityCode", "6960", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Text_Enter("Enter US Zip Code", "id", "PostalCode", "47234", false, ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Element_By_Selector_Click("Click Save Card", "className", "fp-hpc-pay-button", ParentTest, "no_jira");
                    if (FAIL) { return;} 
                Swith_to_Frame("Switch back from 'ifarme' to orginal 'defaultContent'", "defaultContent", null, ParentTest, "no_jira");
                //Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)",ParentTest, "no_jira");
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
    
    private void AddCC_FreedomPay(PaymentInfo pi) {
    try{
    //Verfiy the Name input 
        Element_By_Selector_Attribute("Add card form---Name Label","css", "div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label","textContent",ParentTest, "no_jira");
        Element_By_Selector_Click("click ---Name field", "className", "iframe-input",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input Name ", "className", "iframe-input", pi.name,false, ParentTest, "no_jira");
    //Switch to iframe
        Swith_to_Frame("switch iframe", "tagName", "IFRAME",ParentTest, "no_jira");
    //Verify label and input CC Info
        Element_By_Selector_Text("Verify label ---Card number",   "xpath", "//label[text()='Card Number']",ParentTest, "no_jira"); 
        Element_By_Selector_Click("Cursor locate to --Card number field", "id", "CardNumber",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input Card Number ", "id", "CardNumber",pi.card_num ,false, ParentTest, "no_jira");

        String expiration = pi.expire_month+ "/" + pi.expire_year.substring(2);
        Element_By_Selector_Text("Add card form---Expire Date Label ",  "xpath", "//label[text()='Expiration Date']",ParentTest, "no_jira");  
        Element_By_Selector_Click("Cursor locate to --Expire Date field",          "id", "ExpirationDate",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input Expire Date ",          "id", "ExpirationDate",expiration ,false, ParentTest, "no_jira");
   
        Element_By_Selector_Text("Add card form---CVV Label",   "xpath", "//label[text()='Security Code']",ParentTest, "no_jira");  
        Element_By_Selector_Click("Cursor locate to --CVV field",          "id", "SecurityCode",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input CVV ",            "id", "SecurityCode",pi.cvv ,false, ParentTest, "no_jira");
   
        Element_By_Selector_Text("Add card form---Postal Code  Label",  "xpath", "//label[text()='Postal Code']",ParentTest, "no_jira");
        Element_By_Selector_Click("Cursor locate to --Postal Codefield",           "id",   "PostalCode",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input Postal Code ",            "id",   "PostalCode",pi.postalcode ,false, ParentTest, "no_jira");
   
        Element_By_Selector_Text("Add card form---Next button Label",   "xpath", "//button[text()='Next']",ParentTest, "no_jira");
        Element_By_Selector_Click("click --Next button to save",        "xpath", "//button[text()='Next']",ParentTest, "no_jira");
            Thread.sleep(5000);  
    //Determine page redirect        
       
        if (!d1.findElements(By.tagName("h3")).isEmpty()){  
            _t++; EX += _t + "\t" + "Add CC successful " + "\t" + " ===== " + "\t" + pi.name + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
         //   Swith_to_Frame("switch to orginal webdriver",          "defaultContent", null,ParentTest, "no_jira");
         //wd.switchTo().parentFrame();
            return;
        }
    //Determine the error message
        String  errormessages =new String();
        for (String str : ERRMESSAGE){
            _t++; Text_Found("looking for error message", str,ParentTest, "no_jira");
            errormessages =  t == "Found"?( errormessages.equals("")?str:errormessages+ ", " +str ):errormessages ;
            
        }
        _t++;_f++; EX += _t + "\t" + "Add CC FAIL " + "\t" + " ===== " + "\t" + errormessages + "\t" + " FAIL " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
   
        Swith_to_Frame("switch to orginal webdriver", "defaultContent", null,ParentTest, "no_jira");
        Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)",ParentTest, "no_jira");
            if (FAIL) { return;}       
 
//   driver_1.switchTo().frame(iframeElement);
//   String CardNumberLabel =  driver_1.findElement(By.xpath("//label[text()='Card Number']")).getText();
//   
   
    ////*[@id="app"]/div/main/div/div/div[3]/div/div/div/div[2]/div/iframe
//    System.out.println(t);
    
   // elements_List =  d1.findElements(By.className("iframe-input"));
    //wd.switchTo("//div[@class='v-window-item v-window-item--active']")
  //  String str = d1.findElement(By.xpath("div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label")).getText();
    // String str[] = d1.findElements(By.className("label");
//    Element_By_Selector_Text("Add card form---Name Label",          "css", "div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label",ParentTest, "no_jira");
//        Element_By_Selector_Text("Add card form---Name Label",          "xpath", "//div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]",ParentTest, "no_jira");
//        
//        //"html[1]/body[1]/form[1]/div[1]"
//        _t++; Element_E1_Find("Find iframe", "tagName", "iframe",ParentTest, "no_jira");
//        //_t++; Element_E1_Find("Find form", "tagName", "form",ParentTest, "no_jira");
//        
//        _t++; Element_By_Selector_Text("Add card form---Card number Label", "xpath", "html[1]/body[1]/form[1]/div[1]",ParentTest, "no_jira"); 
//        
 //       _t++; Element_Child_Text("Add card form---Card number Label", e1, "xpath",  "//div[@class='control-group invalid']//label[1]",ParentTest, "no_jira");
        
//        _Text("Add card form---Card number Label",   "xpath", "//label[@for='CardNumber']",ParentTest, "no_jira");  
//        Element_By_Selector_Text("Add card form---Expire Date Label ",  "xpath", "//div[@class='control-group valid']//label",ParentTest, "no_jira");  
//        Element_By_Selector_Text("Add card form---CVV Label",           "xpath", "(//div[@class='control-group valid']//label)[2]",ParentTest, "no_jira");  
//        Element_By_Selector_Text("Add card form---Postal Code  Label",  "xpath", "(//div[@class='control-group']//label)[2]",ParentTest, "no_jira");
//        Element_By_Selector_Text("Add card form---Submit button Label", "xpath", "//button[text()='Next']",ParentTest, "no_jira");
//         if (FAIL) { return;} 
//         
//    //input CC info
//
//       // Element_By_Selector_Click("cursor locate to---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]",ParentTest, "no_jira");
//        Element_By_Selector_Text_Enter("Input card NAME ", "xpath", "//input[@placeholder='Enter name on card']", NAME[1], false,ParentTest, "no_jira");
//       
//        Element_By_Selector_Click("cursor locate to ---Card number input","xpath", "(//div[@class='v-input__slot']//div)[13]",ParentTest, "no_jira");  
//        Element_By_Selector_Text_Enter("Input card NUMBER ", "xpath", "//label[text()='Card Number']/following::input", CARD_NUM[1], false,ParentTest, "no_jira");
//        
//        Element_By_Selector_Click("cursor locate to---Expire Date input ", "xpath", "(//div[@class='v-input__slot']//div)[14]",ParentTest, "no_jira");
//        Element_By_Selector_Text_Enter("Input card MONTH ", "xpath", "//label[text()='Expiry Month']/following::input", EXPIRE_MON[1], false,ParentTest, "no_jira");
//        
//        Element_By_Selector_Click("cursor locate to---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[15]",ParentTest, "no_jira");       
//        Element_By_Selector_Text_Enter("Input card YEAR ", "xpath", "//label[text()='Expiry Year']/following::input", EXPIRE_YEAR[1], false,ParentTest, "no_jira");
//        
//        Element_By_Selector_Click("cursor locate to---Postal Code input", "xpath", "(//div[@class='v-input__slot']//div)[16]",ParentTest, "no_jira");        
//        Element_By_Selector_Text_Enter("Input card CVV ", "xpath", "//label[text()='CVV']/following::input", CVV[1], false,ParentTest, "no_jira");
//        
//         Element_By_Selector_Click("click Submit button", "xpath", "//span[@class='v-btn__content']//span[1]",ParentTest, "no_jira");
//          if (FAIL) { return;} 
//         Thread.sleep(5000); 
         
         
    } catch (Exception ex){}
    }
    
    private void AddCC_Exact(PaymentInfo pi){
    try {       
    //input CC info
        //Element_By_Selector_Text("Add card form---Name input field", "xpath", "(//div[@class='v-input__slot']//div)[12]",ParentTest, "no_jira");       
        Element_By_Selector_Click("cursor locate to---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input card NAME ", "xpath", "//label[text()='Name on Card']/following::input", pi.name, false,ParentTest, "no_jira");
        
        //Element_By_Selector_Text("Add card form---Card number input field", "xpath", "(//div[@class='v-input__slot']//div)[13]",ParentTest, "no_jira");  
        Element_By_Selector_Click("cursor locate to ---Card number input","xpath", "(//div[@class='v-input__slot']//div)[13]",ParentTest, "no_jira");  
        Element_By_Selector_Text_Enter("Input card NUMBER ", "xpath", "//label[text()='Card Number']/following::input", pi.card_num, false,ParentTest, "no_jira");
        
        //Element_By_Selector_Text("Add card form---Expire Month input Field ", "xpath", "(//div[@class='v-input__slot']//div)[14]",ParentTest, "no_jira");  
        Element_By_Selector_Click("cursor locate to---Expire Month input ", "xpath", "(//div[@class='v-input__slot']//div)[14]",ParentTest, "no_jira");
        Element_By_Selector_Text_Enter("Input card MONTH ", "xpath", "//label[text()='Expiry Month']/following::input", pi.expire_month, false,ParentTest, "no_jira");
        
        //Element_By_Selector_Text("Add card form---Expire Year input field", "xpath", "(//div[@class='v-input__slot']//div)[15]",ParentTest, "no_jira");  
        Element_By_Selector_Click("cursor locate to---Expire Year input", "xpath", "(//div[@class='v-input__slot']//div)[15]",ParentTest, "no_jira");       
        Element_By_Selector_Text_Enter("Input card YEAR ", "xpath", "//label[text()='Expiry Year']/following::input", pi.expire_year, false,ParentTest, "no_jira");
        
        //Element_By_Selector_Text("Add card form---CVV input field", "xpath", "(//div[@class='v-input__slot']//div)[16]",ParentTest, "no_jira");
        Element_By_Selector_Click("cursor locate to---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[16]",ParentTest, "no_jira");        
        Element_By_Selector_Text_Enter("Input card CVV ", "xpath", "//label[text()='CVV']/following::input", pi.cvv, false,ParentTest, "no_jira");
        
        
        //Element_By_Selector_Text("Add card form---Submit button", "xpath", "//span[@class='v-btn__content']//span[1]",ParentTest, "no_jira");
        Element_By_Selector_Click("Click Submit button", "xpath", "//span[@class='v-btn__content']//span[1]",ParentTest, "no_jira");
          if (FAIL) { return;} 
//        Wait_For_Element_By_Selector_Presence("Alert Present","css", "[role='alert']",ParentTest, "no_jira");
//        // Thread.sleep(5000); 
//         List<WebElement> ALERTS_1 = d1.findElements(By.cssSelector("[role='alert']"));
//         
//         System.out.println (ALERTS_1.get(ALERTS_1.size()-2).getText()+ "----------------" +ALERTS_1.get(ALERTS_1.size()-1).getText());
//         //WebElement ALERT ;
//         for (WebElement ALERT : ALERTS_1 ){
//         System.out.println (ALERT.getAttribute("textContent"));

         
            
    //Determine the page redirect    
        String attr = d1.findElement(By.xpath("/html/body/div/div/div/main/div/div/div[3]/div/div/div/div[2]")).getAttribute("style");
      //  d1.findElement(By.xpath("//span[text()=' Submit ']")).getAttribute(Style);
        System.out.println(attr);         
        if("display: none;".equals(attr)){  
            _t++; EX += _t + "\t" + "Add CC successful " + "\t" + " ===== " + "\t" + pi.name + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
            return;
        }
        List_L0("looking for error message", "css", "[role='alert']",ParentTest, "no_jira");
        String  errormessages ="";
        if (!L0.isEmpty()){
            System.out.println("find alert");           
            for (int i =0; i< L0.size() ; i++){
                L0.get(i).getText()    ;
                //errormessages = L0.get(i)+ ", " +errormessages;                
                errormessages = "".equals(errormessages)? L0.get(i).getText(): errormessages + ",  " +L0.get(i).getText();
            }
            _t++;_f++; EX += _t + "\t" + "Add CC FAIL " + "\t" + " ===== " + "\t" + "mandatory field requires: " + errormessages+ "\t" + " FAIL " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
           
        }
        Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", ParentTest, "no_jira");
            if (FAIL) { return;}       
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }
}
}
