/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.T;
import static A.A.*;
import static WO.WO.*;
import java.util.*;

/**
 *
 * @author Oleg.Spozito
 */


//Map<String, String> map = new HashMap<String, String>();

 

public class WO_account_settings {
    static String[] NAME =new String[]{"Visa Larry", "Master Mickey Mouse", "AMEX Donald Duck","Discovery snoopy "}  ;
    static String[] CARD_NUM =new String[]{"4111111111111111", "5500000000000004","340000000000009" ,"6011000000000004"};
    static String[] EXPIRE_MON =new String[]{"01","04","07","12"};
    static String[] EXPIRE_YEAR =new String[]{"2023","2025","2030", "2017"};
    static String[] CVV = new String[]{"111","444", "7980", "145"};
    
    
    public static void run() throws InterruptedException { 
        Map<String, String> creditCardInfo  = new HashMap<String, String>() ;
        creditCardInfo.put("name ", "Larry Li");
        creditCardInfo.put("cardNumber", "4111111111111111");
        creditCardInfo.put("expireMonth", "02");
        creditCardInfo.put("expireYear", "2030");
        creditCardInfo.put("CVV","234");
        
           
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
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("delete first row  "+ n, "xpath", "//span[text()=' Delete ']" , "no_jira");
                Thread.sleep(1000);
                //System.out.println ("delete line  " + n);
                 if (FAIL) { return;} 
                n++;
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'My Account' Tab", "xpath", "//a[@href='/account-settings/my-account']", "no_jira");
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Payment Option' tab", "xpath", "//a[@href='/account-settings/payment-options']", "no_jira");
                if (FAIL) { return;} 
                Thread.sleep(5000);
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Detect First row of list " + n, "xpath", "(//div[contains(@class,'v-list v-sheet')]//div)[2]", "no_jira");
                }
          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add New Card' ROW", "xpath", "//h4[text()='Add a new card']", "no_jira"); 
          if (FAIL) { return;}  
    //Verify all element on Add card  form 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Title", "xpath", "//h1[@class='mb-5 text-center']", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Card number input", "xpath", "(//div[@class='v-input__slot']//div)[13]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Month input ", "xpath", "(//div[@class='v-input__slot']//div)[14]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Expire Year input", "xpath", "(//div[@class='v-input__slot']//div)[15]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[16]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Add card form---Submit button", "xpath", "//span[@class='v-btn__content']//span[1]", "no_jira");
         if (FAIL) { return;} 
         
    //input CC info

        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Name input", "xpath", "(//div[@class='v-input__slot']//div)[12]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NAME ", "xpath", "//label[text()='Name on Card']/following::input", NAME[1], false, "no_jira");
   
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to ---Card number input","xpath", "(//div[@class='v-input__slot']//div)[13]", "no_jira");  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card NUMBER ", "xpath", "//label[text()='Card Number']/following::input", CARD_NUM[1], false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Expire Month input ", "xpath", "(//div[@class='v-input__slot']//div)[14]", "no_jira");
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card MONTH ", "xpath", "//label[text()='Expiry Month']/following::input", EXPIRE_MON[1], false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---Expire Year input", "xpath", "(//div[@class='v-input__slot']//div)[15]", "no_jira");       
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card YEAR ", "xpath", "//label[text()='Expiry Year']/following::input", EXPIRE_YEAR[1], false, "no_jira");
        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("cursor locate to---CVV input", "xpath", "(//div[@class='v-input__slot']//div)[16]", "no_jira");        
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Enter("Input card CVV ", "xpath", "//label[text()='CVV']/following::input", CVV[1], false, "no_jira");
        
         _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("click Submit button", "xpath", "//span[@class='v-btn__content']//span[1]", "no_jira");
          if (FAIL) { return;} 
         Thread.sleep(5000); 
         
         
        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", SITE + "Account Settings","Previous page (???)", "no_jira");
            if (FAIL) { return;}       
    }  
}
