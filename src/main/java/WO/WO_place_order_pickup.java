package WO;

import java.util.Date;

class WO_place_order_pickup extends WO_GUI {
    protected WO_place_order_pickup(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        COUNTRY = a.COUNTRY;
        New_ID = a.New_ID;
        SITE = a.SITE;
        BRAND = a.BRAND;
        PROMO = a.PROMO;
        _Promo = a._Promo;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    String paymentType = "";   
    
    protected void run() { 
    try{    
        if(COUNTRY.toLowerCase().startsWith("c")){
            paymentType = "exact";
        } else {
            paymentType = "freedompay";
        }
        PICKUP = false;
        String SERVICE = "";
        Element_By_Selector_Click("Click Application '" + app + "' > Home logo", "id", "home-logo", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        List_L0("Check Available Services (Pickup/Delivery)", "css", "[role='tab']", ParentTest, "no_jira");
        if (L0.isEmpty()) {
            Element_By_Selector_Text("Single Available Service: ", "xpath", "//div[@class='pickup-or-delivery']",  ParentTest, "no_jira"); 
            if (t.toLowerCase().contains("pickup")) { 
                PICKUP = true; 
                SERVICE = "Pickup";
            }
        } else { 
            for (int i = 0; i < 2; i++) {
                //List_L0("Find Service tabs", "css", "[role='tab']", ParentTest, "no_jira");
                Element_Text("Service tab (" + (i+1) + ") name:", L0.get(i),  ParentTest, "no_jira");                       
                if (t.toLowerCase().equals("pickup")) { 
                    PICKUP = true; 
                    SERVICE = "Pickup";           
                    Element_Click("Click '" + SERVICE + "' tab", L0.get(i), ParentTest, "no_jira"); 
                        if (FAIL) { return; } 
                    break;
                }
            } 
        }
        if (!PICKUP){
            _t++; _w++;
            EX += _t + "\t" + "Site " + SITE + " - Pickup service is not available" + "\t" + " ===== " + "\t" + "No Brands offering Pickup" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("WARN", "No Brands offering Pickup", true, ParentTest.createNode(_t + ". " + "Site " + SITE + " - Pickup service is not available"), new Date());
            return;
        }
        List_L1(SITE + " > " + SERVICE + " Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
//            for (int j = 0; j < L1.size(); j++) {
//                Element_Text(SERVICE + " Brand (" + j + ") Name", L1.get(j),  ParentTest, "no_jira");     
//            } 
        if(L1.isEmpty()) {
            _t++; _w++;
            EX += _t + "\t" + "Site " + SITE + " - Pickup service is not available" + "\t" + " ===== " + "\t" + "No Brands offering Pickup" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("WARN", "Site " + SITE + " - No Brands offering Pickup", true, ParentTest.createNode(_t + ". " + "No Brands offering Pickup"), new Date());
            return;
        }
//                    for (int j = 0; j < L1.size(); j++) {
//                        Element_Text(SERVICE + " Brand (" + (j+1) + ") Name", L1.get(j), ParentTest, "no_jira");     
//                    }
        Element_Click("Select 1st " + SERVICE + " Brand in the List", L1.get(0),  ParentTest, "no_jira"); 
        Thread.sleep(500);
        List_L2("Get Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");                 
//                    for (int j = 0; j < L2.size(); j++){         
//                        //Element_Text("Print Menu Category " + (j+1) + " Name ", L2.get(j),  ParentTest, "no_jira");
//                        Element_Click("Select Category " + (j+1), L2.get(j), ParentTest, "no_jira");                
//                    }   
        //Element_Click("Select 1st Category", L2.get(0), ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_Click("Select Last Category", L2.get(L2.size() - 1), ParentTest, "no_jira"); 
        Thread.sleep(500);
        List_L2("Get Selected Category > Menu Items Count", "xpath", "//div[@class='menu-item pa-3 mt-3 v-card v-card--link v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira"); 
        //Element_Click("Select 1st Menu Item", L2.get(0), ParentTest, "no_jira");
        Element_Click("Select Last Menu Item", L2.get(L2.size() - 1), ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500);
        // Options >>>>
        List_L3("Get selected Item > Options count", "css", "[role='checkbox']", ParentTest, "no_jira");
            if (FAIL) { return;}
            for (int j = 0; j < L3.size(); j++) {         
                Element_Click("Select Option " + (j+1), L3.get(j), ParentTest, "no_jira");                
            } 
        Element_By_Selector_Click("Click '+' 1 Item quantity", "xpath", "//button[contains(@class, 'mdi-plus')]", ParentTest, "no_jira");
        Element_By_Selector_Click("Click 'Add to basket'", "id", "add-to-basket", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L3("Check for 'Start a new basket'", "id", "qa-start-new-basket", ParentTest, "no_jira");
            if (FAIL) { return;}
        if(!L3.isEmpty()){
            Element_Click("Click 'Start a new basket'", L3.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}

        // check Basket
        Element_By_Selector_Click("Click navigation > 'Basket'", "id", "qa-nav-basket-btn", ParentTest, "no_jira");
            if (FAIL) { return;}
        //  to do details
        Element_By_Selector_Click("Click 'x' > Close 'Basket'", "id", "qa-close-basket-btn", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Selector_Click("Click 'Checkout'", "id", "qa-prompt-to-checkout",  ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}

        // Timeslots
        Element_By_Selector_Click("Open 'Pickup time/Timeslots' drop-down", "xpath", "//input[@placeholder='Select a Pick up time']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get 'Timeslots list' > Count", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@role='option']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        if(L2.size() > 1) {
            Element_Click("Select 2nd available Timeslot", L2.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}
        }else{
            // ?????
        }

        if(_Promo){
            Element_By_Selector_Text_Enter("Enter invalid Promo Code", "id", "promo", "Invalid_Promo_Code", false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Selector_Click("Click 'Apply'", "id", "apply-promo", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                if (FAIL) { return;}
            Element_By_Selector_Text("Verify Error Message > 'Invalid promo code'" , "xpath", "//div[@class='v-messages theme--light error--text']",  ParentTest, "no_jira"); 
            //String x = t;
            Element_By_Selector_Input_Select_Clear("Click 'Apply'", "id", "promo", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Selector_Text_Enter("Enter valid Promo Code", "id", "promo", PROMO, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Selector_Click("Click 'Apply'", "id", "apply-promo", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                if (FAIL) { return;}
        }

        //<editor-fold defaultstate="collapsed" desc="Check / Add Payment">
        Element_By_Selector_Click("Open 'Select a payment method' drop-down", "xpath", "//input[@placeholder='Select a payment method']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get Payments 'Card list' > Count", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']/descendant::div[@role='option']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        if(L2.size() == 1) {
            Element_Click("Select 'Use New Card'", L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
                if (FAIL) { return;}
            Thread.sleep(500);
            Wait_For_Element_By_Selector_Presence("Wait for 'Add New Card' fragment present", "id", "name-on-card", ParentTest, "no_jira");
                if (FAIL) { return;}
            switch (paymentType){
                case "exact":     
                    Element_By_Selector_Text_Enter("Enter Name on card", "id", "name-on-card", "JTT " + New_ID, false, ParentTest, "no_jira");
                        if (FAIL) { return;} 
                    Element_By_Selector_Text_Enter("Enter Card Number", "id", "masked-card-number", "5500000000000004", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Selector_Text_Enter("Enter Expiration Date", "id", "expiry-date", "1223", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Selector_Text_Enter("Enter CVV (SecurityCode)", "id" , "cvv", "123", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    Element_By_Selector_Text_Enter("Enter Canada Postal code", "id" , "postal-code", "L4L3C3", false, ParentTest, "no_jira");
                        if (FAIL) { return;}
                    //Scroll_to_WebElement("Scroll to 'Save Card...' checkbox", "id", "should-save-card",  ParentTest, "no_jira"); 
                    Element_By_Selector_Click("Check 'Save card information for faster checkout next time'", "id", "should-save-card", ParentTest, "no_jira"); 

                    Element_By_Selector_Click("Click 'Save' <New Card> button", "id", "save-card-btn", ParentTest, "no_jira"); 
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
//                    Element_By_Selector_Text_Enter("Enter Name on Card", "id", "name-on-card", "JTT " + New_ID, false, ParentTest, "no_jira");
//                        if (FAIL) { return;}
                    //Scroll_to_WebElement("Scroll to 'Save Card...' checkbox", "id", "should-save-card",  ParentTest, "no_jira"); 
                    Element_By_Selector_Click("Check 'Save card information for faster checkout next time'", "id", "should-save-card", ParentTest, "no_jira"); 

                    Swith_to_Frame("Switch to Freedompay iframe", "tagName", "iframe", ParentTest, "no_jira"); //Switch to iframe
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
        } else{
            Element_Click("Select 1st available Card", L2.get(0), ParentTest, "no_jira");
                if (FAIL) { return;}
        }
        //</editor-fold>


        Element_By_Selector_Attribute("Check 'Place Order' enabled/disabled", "id", "place-order", "disabled", ParentTest, "no_jira");
        if(t.equals("true")){
            _t++; _w++;
            EX += _t + "\t" + "Unable to Place Order (disabled)" + "\t" + " ===== " + "\t" + "'Place Order' disabled > check payment(s)" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("WARN", "'Place Order' disabled > check payment(s)", true, ParentTest.createNode(_t + ". " + "Unable to Place Order (disabled)"), new Date());
            Element_By_Selector_Click("Back to Home > Click Application '" + app + "' logo", "id", "home-logo", ParentTest, "no_jira"); 
            return;
        } 
        Element_By_Selector_Click("Click 'Place order'", "id", "place-order",  ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}
        Wait_For_Element_By_Selector_Presence("Wait for 'Order(s)' tabs present", "css", "[role='tab']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L0("Check Order History > default 'Active Orders'", "css", "[role='tab']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L1("Get 'Active orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
        // Last order details  > Pickup time: 2:40 p.m.
        if(!L0.isEmpty()){
            Element_Click("Click 'Past orders' tab", L0.get(1), ParentTest, "no_jira"); 
                if (FAIL) { return;} 
            Thread.sleep(500);
            List_L1("Get 'Past orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
                if (FAIL) { return;}
        }

        Element_By_Selector_Click("Back to Home > Click Application '" + app + "' logo", "id", "home-logo", ParentTest, "no_jira"); 
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }       
    }
}
