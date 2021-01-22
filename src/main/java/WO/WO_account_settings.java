/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;
import static WO.WO.*;
import static java.lang.System.exit;
import java.util.*;
import org.openqa.selenium.By;

/**
 *
 * @author Oleg.Spozito
 */


public class WO_account_settings {
    static String[] NAME =new String[]{"Visa Larry", "Master Mickey Mouse", "AMEX Donald Duck","Discovery snoopy "}  ;
    static String[] CARD_NUM =new String[]{"4111111111111111", "5500000000000004","340000000000009" ,"6011000000000004"};
    static String[] EXPIRE_MON =new String[]{"01","04","07","12"};
    static String[] EXPIRE_YEAR =new String[]{"2023","2025","2030", "2027"};
    static String[] CVV = new String[]{"444","444", "6960", "145"};
    static String[] POSTAL = new String[]{"l1l2l3","12345", "", "a1b2c3"};
    static String[] ERRMESSAGE = {"Card Number is incomplete","Expiration Date is incomplete","Security Code is incomplete","Postal Code is incomplete"};
    static String[] PAYMENT_TYPE = {"exact","freedompay"};
   
    static class PaymentInfo{
        String name,card_num,expire_month,expire_year,cvv,postalcode;
        PaymentInfo(){};
        PaymentInfo(String name,String card_num ,String expire_month ,String expire_year ,String cvv,String postalcode ){
            this.name = name;
            this.card_num = card_num;
            this.expire_month = expire_month;
            this.expire_year = expire_year;
            this.cvv = cvv;     
            this.postalcode = postalcode;
        }
        
        
    }
    

    
    public static void run() throws InterruptedException{ 
    
//        _t++; Thread.sleep((long) sleep); T.Call_API("Call /location/private config API", BaseAPI + "/config/" + SiteID + "?nocache=1", true,"no_jira" );
//        
//        System.out.println( API_Response_Body);      
        //String paymentType ="" ;
//        for(String str : PAYMENT_TYPE)
//        if (API_Response_Body.contains(str)){          
//           paymentType = str;
//           System.out.println(paymentType);
//           _t++; T.API_Body_Contains("Identify the Payment Type of site", paymentType,true, "no_jira");
//           break;
//        }
//         if ("".equals(paymentType)) 
//         { //_t++; EX += _t + "no payment type setting "  + "\t" +"=====" + "\t" + "could not find the payment type" + "\t" + "PASS" + "\t" + " - " +"";
//             System.out.println("Payment  not found");
//             return;
//         } 
         
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Toolbar element", "xpath", "//div[@class='v-toolbar__content']", "no_jira");
            if (FAIL) { return;}           
        _t++; Thread.sleep((long) sleep); T.Element_Child_Click("Click 'Account' Button", e1, "xpath", ".//i[@class='v-icon notranslate mdi mdi-account-circle theme--light']", "no_jira");                                     
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Click 'Account Settings'", "xpath", ".//*[text()='Account Settings']", "no_jira");                                     
            if (FAIL) { return;}  
        Thread.sleep((long) sleep);
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Title text", "xpath", ".//h1[@class='header']", "no_jira");
            if (FAIL) { return;}   
    //Test add Credit Card 
    //1. open Payment  Tab
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Payment tab  text", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
          if (FAIL) { return;} 
          Thread.sleep(5000);  
    //verify CC ---- delete  existed
    
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Detect First row of list ", "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");
        int n=1;
        while(t.toLowerCase().contains("card ending"))
        {
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click First row of list "+ n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");               
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click Deletc betton   "+ n, "xpath", "//span[text()=' Delete ']" , "no_jira");
            T.Wait_For_Element_By_Path_Presence("wait for alert present","className", "vts__message", "no_jira");
            //Thread.sleep(5000);
            if (FAIL) { return;} 
            n++;
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'My Account' Tab", "xpath", "//a[@href='/account-settings/my-account']", "no_jira");
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
            if (FAIL) { return;} 
            Thread.sleep(5000);
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Detect First row of list " + n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");
      
        }
    //Enter Add New CC screen   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira"); 
        if (FAIL) { return;}  
        Thread.sleep(5000); 
    //Determine the payment type
    //FreedomPay vs. EXACT
        String paymentType = "freedompay";
        Thread.sleep((long) sleep); 
        
         //T.Element_E1_Find("Determine the payment type","tagName", "iframe", "no_jira");    
        if(d1.findElements(By.tagName("iframe")).isEmpty())     // no iframe ----- exact 
        {
            paymentType = "exact";
        }
        _t++; EX += _t + "\t" + "Determine the payment type " + "\t" + " ===== " + "\t" + paymentType + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
       
        PaymentInfo pi = new PaymentInfo() ;
        
        switch (paymentType){
            case "freedompay":
                for (int i = 0; i< NAME.length ; i++){               
                    pi = new PaymentInfo(NAME[i],CARD_NUM[i],EXPIRE_MON[i],EXPIRE_YEAR[i],CVV[i],POSTAL[i]);
                    _t++; EX += _t + "\t" + "Add CC  "+ i  + "\t" + " ===== " + "\t" + NAME[i] + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    
                    AddCC_FreedomPay(pi);
                    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira");
                }
              
                _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
                //delete
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                if (FAIL) { return;} 
                Thread.sleep(5000); 
              
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click First row of list "+ n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");               
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click Delete betton   "+ n, "xpath", "//span[text()=' Delete ']" , "no_jira");
               // T.Wait_For_Element_By_Path_Presence("wait for alert present","className", "vts__message", "no_jira");
            
                Thread.sleep(5000); 
                if (FAIL) { return;}    
                break;
            
            case "exact":     
                 for (int i = 0; i< NAME.length;i++){               
                    pi = new PaymentInfo(NAME[i],CARD_NUM[i],EXPIRE_MON[i],EXPIRE_YEAR[i],CVV[i],POSTAL[i]);
                    _t++; EX += _t + "\t" + "Add CC (Exact)  "+ i  + "\t" + " ===== " + "\t" + NAME[i] + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    
                    AddCC_Exact(pi);
                    
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira");
                
                 }
                    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                if (FAIL) { return;} 
                Thread.sleep(5000); 
               
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click First row of list "+ n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");               
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click Delete betton   "+ n, "xpath", "//span[text()=' Delete ']" , "no_jira");
                // Thread.sleep(5000);                  
                break;                
            default: 
                break;
        }
    }  
    
    public static void AddCC_FreedomPay(PaymentInfo pi) throws InterruptedException  {
    //Verfiy the Name input 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Add card form---Name Label","css", "div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label","textContent", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("click ---Name field",           "className", "iframe-input", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input Name ",              "className", "iframe-input", pi.name,false,"no_jira");
    //Switch to iframe
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("switch iframe",          "tagName", "IFRAME", "no_jira");
    //Verify label and input CC Info
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Verify label ---Card number",   "xpath", "//label[text()='Card Number']", "no_jira"); 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Cursor locate to --Card number field",          "id", "CardNumber", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input Card Number ",          "id", "CardNumber",pi.card_num ,false,"no_jira");

        String expiration = pi.expire_month+"/"+ pi.expire_year.substring(2);
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Date Label ",  "xpath", "//label[text()='Expiration Date']", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Cursor locate to --Expire Date field",          "id", "ExpirationDate", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input Expire Date ",          "id", "ExpirationDate",expiration ,false,"no_jira");
   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---CVV Label",   "xpath", "//label[text()='Security Code']", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Cursor locate to --CVV field",          "id", "SecurityCode", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input CVV ",            "id", "SecurityCode",pi.cvv ,false,"no_jira");
   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Postal Code  Label",  "xpath", "//label[text()='Postal Code']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Cursor locate to --Postal Codefield",           "id",   "PostalCode", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input Postal Code ",            "id",   "PostalCode",pi.postalcode ,false,"no_jira");
   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Next button Label",   "xpath", "//button[text()='Next']", "no_jira");
        //String ds = d1.getPageSource(); System.out.println("ds");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("click --Next button to save",        "xpath", "//button[text()='Next']", "no_jira");
            Thread.sleep(5000);  
    //Determine page redirect        
       
        if (!d1.findElements(By.tagName("h3")).isEmpty()){  
            _t++; EX += _t + "\t" + "Add CC successful " + "\t" + " ===== " + "\t" + pi.name + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
         //   _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("switch to orginal webdriver",          "defaultContent", null, "no_jira");
         //d1.switchTo().parentFrame();
            return;
        }
    //Determine the error message
        String  errormessages =new String();
        for (String str : ERRMESSAGE){
            _t++; T.Text_Found("looking for error message", str, "no_jira");
            errormessages =  t == "Found"?( errormessages.equals("")?str:errormessages+", "+str ):errormessages ;
            
        }
        _t++;_f++; EX += _t + "\t" + "Add CC FAIL " + "\t" + " ===== " + "\t" + errormessages + "\t" + " FAIL " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
   
        _t++; Thread.sleep((long) sleep); T.Swith_to_Frame("switch to orginal webdriver",          "defaultContent", null, "no_jira");
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}       
 
//    driver_1.switchTo().frame(iframeElement);
//   String CardNumberLabel =  driver_1.findElement(By.xpath("//label[text()='Card Number']")).getText();
//   
   
    ////*[@id="app"]/div/main/div/div/div[3]/div/div/div/div[2]/div/iframe
//    System.out.println(t);
    
   // elements_List =  d1.findElements(By.className("iframe-input"));
    //d1.switchTo("//div[@class='v-window-item v-window-item--active']")
  //  String str = d1.findElement(By.xpath("div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label")).getText();
    // String str[] = d1.findElements(By.className("label");
//    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Name Label",          "css", "div#app>div>main>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(2)>div>div>label", "no_jira");
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Name Label",          "xpath", "//div[@id='app']/div[1]/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]", "no_jira");
//        
//        //"html[1]/body[1]/form[1]/div[1]"
//        _t++; T.Element_E1_Find("Find iframe", "tagName", "iframe", "no_jira");
//        //_t++; T.Element_E1_Find("Find form", "tagName", "form", "no_jira");
//        
//        _t++; T.Element_By_Path_Text("Add card form---Card number Label", "xpath", "html[1]/body[1]/form[1]/div[1]", "no_jira"); 
//        
 //       _t++; T.Element_Child_Text("Add card form---Card number Label", e1, "xpath",  "//div[@class='control-group invalid']//label[1]", "no_jira");
        
//        _t++; Thread.sleep((long) sleep); T._Text("Add card form---Card number Label",   "xpath", "//label[@for='CardNumber']", "no_jira");  
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Date Label ",  "xpath", "//div[@class='control-group valid']//label", "no_jira");  
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---CVV Label",           "xpath", "(//div[@class='control-group valid']//label)[2]", "no_jira");  
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Postal Code  Label",  "xpath", "(//div[@class='control-group']//label)[2]", "no_jira");
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Submit button Label", "xpath", "//button[text()='Next']", "no_jira");
//         if (FAIL) { return;} 
//         
//    //input CC info
//
//       // _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]", "no_jira");
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NAME ", "xpath", "//input[@placeholder='Enter name on card']", NAME[1], false, "no_jira");
//       
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to ---Card number input","xpath", "(//div[@class='v-input__slot']//div)[13]", "no_jira");  
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NUMBER ", "xpath", "//label[text()='Card Number']/following::input", CARD_NUM[1], false, "no_jira");
//        
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Expire Date input ", "xpath", "(//div[@class='v-input__slot']//div)[14]", "no_jira");
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card MONTH ", "xpath", "//label[text()='Expiry Month']/following::input", EXPIRE_MON[1], false, "no_jira");
//        
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[15]", "no_jira");       
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card YEAR ", "xpath", "//label[text()='Expiry Year']/following::input", EXPIRE_YEAR[1], false, "no_jira");
//        
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Postal Code input", "xpath", "(//div[@class='v-input__slot']//div)[16]", "no_jira");        
//        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card CVV ", "xpath", "//label[text()='CVV']/following::input", CVV[1], false, "no_jira");
//        
//         _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("click Submit button", "xpath", "//span[@class='v-btn__content']//span[1]", "no_jira");
//          if (FAIL) { return;} 
//         Thread.sleep(5000); 
         
         
        
    }
    
    public static void AddCC_Exact(PaymentInfo pi) throws InterruptedException  {
                 
    //input CC info
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Name input field", "xpath", "(//div[@class='v-input__slot']//div)[12]", "no_jira");       
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NAME ", "xpath", "//label[text()='Name on Card']/following::input", pi.name, false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Card number input field", "xpath", "(//div[@class='v-input__slot']//div)[13]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to ---Card number input","xpath", "(//div[@class='v-input__slot']//div)[13]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NUMBER ", "xpath", "//label[text()='Card Number']/following::input", pi.card_num, false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Month input Field ", "xpath", "(//div[@class='v-input__slot']//div)[14]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Expire Month input ", "xpath", "(//div[@class='v-input__slot']//div)[14]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card MONTH ", "xpath", "//label[text()='Expiry Month']/following::input", pi.expire_month, false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Year input field", "xpath", "(//div[@class='v-input__slot']//div)[15]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Expire Year input", "xpath", "(//div[@class='v-input__slot']//div)[15]", "no_jira");       
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card YEAR ", "xpath", "//label[text()='Expiry Year']/following::input", pi.expire_year, false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---CVV input field", "xpath", "(//div[@class='v-input__slot']//div)[16]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[16]", "no_jira");        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card CVV ", "xpath", "//label[text()='CVV']/following::input", pi.cvv, false, "no_jira");
        
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Submit button", "xpath", "//span[@class='v-btn__content']//span[1]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("click Submit button", "xpath", "//span[@class='v-btn__content']//span[1]", "no_jira");
          if (FAIL) { return;} 
        // Thread.sleep(5000); 
         
            
    //Determine the page redirect    
        String attr = d1.findElement(By.xpath("/html/body/div/div/div/main/div/div/div[3]/div/div/div/div[2]")).getAttribute("style");
      //  d1.findElement(By.xpath("//span[text()=' Submit ']")).getAttribute(Style);
        System.out.println(attr);         
        if("display: none;".equals(attr)){  
            _t++; EX += _t + "\t" + "Add CC successful " + "\t" + " ===== " + "\t" + pi.name + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n"; 
            return;
        }
        T.List_L0("looking for error message", "css", "[role='alert']", "no_jira");
        String  errormessages ="";
        if (!L0.isEmpty()){
            System.out.println("find alert");           
            for (int i =0; i< L0.size() ; i++){
                L0.get(i).getText()    ;
                //errormessages = L0.get(i)+ ", "+errormessages;                
                errormessages = "".equals(errormessages)? L0.get(i).getText(): errormessages +",  "+L0.get(i).getText();
            }
            _t++;_f++; EX += _t + "\t" + "Add CC FAIL " + "\t" + " ===== " + "\t" + "mandatory field requires: " + errormessages+ "\t" + " FAIL " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
           
        }
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}       
    }
}
