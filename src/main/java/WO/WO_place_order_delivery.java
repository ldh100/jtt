package WO;

import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

class WO_place_order_delivery extends WO_GUI {
    protected WO_place_order_delivery(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;
        SITE = a.SITE;
        BRAND = a.BRAND;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }

    protected void run() { 
    try{    
        DELIVERY = false;
        String SERVICE = "";

        List_L0("Check Available Services (Delivery/Delivery)", "css", "[role='tab']", ParentTest, "no_jira");
        if (L0.isEmpty()) {
            Element_By_Selector_Text("Single Available Service: ", "xpath", "//div[@class='pickup-or-delivery']",  ParentTest, "no_jira"); 
            if (t.toLowerCase().contains("delivery")) { 
                DELIVERY = true;
                SERVICE = "Delivery";
            } 

        } else { 
            for (int i = 0; i < 2; i++) {
                //List_L0("Find Service tabs", "css", "[role='tab']", ParentTest, "no_jira");
                Element_Text("Service tab (" + (i+1) + ") name: ", L0.get(i),  ParentTest, "no_jira");                       
                if (t.toLowerCase().equals("delivery")) { 
                    DELIVERY = true; 
                    SERVICE = "Delivery";           
                    Element_Click("Click '" + SERVICE + "' tab", L0.get(i), ParentTest, "no_jira"); 
                        if (FAIL) { return; } 
                    break;
                }
            } 
        }
        if (!DELIVERY){
            _t++; EX += _t + "\t" + "Site " + SITE + " - Delivery service is not available" + "\t" + " ===== " + "\t" + "No Brands offering Delivery" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("WARN", "No Brands offering Delivery", false, ParentTest.createNode(_t + ". " + "Site " + SITE + " - Delivery service is not available"), new Date());
            return;
        }
        List_L1(SITE + " > " + SERVICE + " Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
//            for (int j = 0; j < L1.size(); j++) {
//                Element_Text(SERVICE + " Brand (" + j + ") Name", L1.get(j),  ParentTest, "no_jira");     
//            } 
        if(L1.isEmpty()) {
            _t++; EX += _t + "\t" + "Site " + SITE + " - Delivery service is not available" + "\t" + " ===== " + "\t" + "No Brands offering Delivery" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("WARN", "Site " + SITE + " - No Brands offering Delivery", false, ParentTest.createNode(_t + ". " + "No Brands offering Delivery"), new Date());
            return;
        }
//                    for (int j = 0; j < L1.size(); j++) {
//                        Element_Text(SERVICE + " Brand (" + (j+1) + ") Name", L1.get(j), ParentTest, "no_jira");     
//                    }
        Element_Click("Select 1st " + SERVICE + " Brand in the List", L1.get(0),  ParentTest, "no_jira"); 
        List_L2("Get Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");                 
//                    for (int j = 0; j < L2.size(); j++){         
//                        //Element_Text("Print Menu Category " + (j+1) + " Name ", L2.get(j),  ParentTest, "no_jira");
//                        Element_Click("Select Category " + (j+1), L2.get(j), ParentTest, "no_jira");                
//                    }   
        Element_Click("Select 1st Category", L2.get(0), ParentTest, "no_jira"); 
        List_L2("Get Selected Category > Menu Items Count", "xpath", "//div[@class='menu-item pa-3 mt-3 v-card v-card--link v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira"); 
        Element_Click("Select 1st Menu Item", L2.get(0), ParentTest, "no_jira");
//        Element_E1_Find("Find 'Add to basket' dialog", "xpath", "//div[@class='v-dialog v-dialog--active']", ParentTest, "no_jira");
//            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Selector_Click("Click '+'  > add 1 more Item", "xpath", "//button[contains(@class, 'mdi-plus')]", ParentTest, "no_jira");
// Options ??? 

        Element_By_Selector_Click("Click 'Add to basket'", "id", "add-to-basket", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}

        // check Basket
        Element_By_Selector_Click("Click navigation > 'Basket'", "id", "nav-basket-btn", ParentTest, "no_jira");
            if (FAIL) { return;}
        //  to do details
        Element_By_Selector_Click("Click 'x' > Close 'Basket'", "id", "close-basket-btn", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Selector_Click("Click 'Checkout'", "id", "prompt-to-checkout",  ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}

        Element_By_Selector_Click("Open 'Delivery location' drop-down", "xpath", "//input[@placeholder='Select a delivery location']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L2("Get 'Delivery Location' list > Count", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
        Element_Click("Select 1st Delivery Location", L2.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}

//Payments input id card-list placeholder "Select a payment method" parent test contains Card ending

//Promo

        Element_By_Selector_Click("Click 'Place order'", "id", "place-order",  ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}

        List_L0("Check Order History > default 'Active Orders", "css", "[role='tab']", ParentTest, "no_jira");
            if (FAIL) { return;}
        List_L1("Get 'Active orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
        // Last order details  > Delivery time: 2:40 p.m.

        Element_Click("Click 'Past orders' tab", L0.get(1), ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        List_L1("Get 'Past orders' list > Count", "xpath", "//div[@class='card-container v-card v-sheet theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;}

        Element_By_Selector_Click("Click Application '" + app + "' > Home logo", "id", "home-logo", ParentTest, "no_jira"); 
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
