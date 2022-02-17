package WO;

import com.aventstack.extentreports.ExtentTest;
import java.util.Date;
import org.openqa.selenium.WebElement;

class WO_explore_brand extends WO_GUI {
    protected WO_explore_brand(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        SITE = a.SITE;
        _Edit_item = a._Edit_item;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }
    protected void run () { 
    try {   
        Navigate_to_URL("Navigate to " + url, url, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("Login page", ParentTest, "no_jira");             
        //Element_By_Selector_Attribute("Find " + app + " Image", "xpath", "//div[@class='v-image__image v-image__image--cover']", "style", ParentTest, "no_jira");
        //Element_By_Selector_Text("Find 'card-header' text", "xpath", "//p[@class='card-header']", ParentTest, "no_jira");           
        //Find_Text("Find 'Support' text", "Support", true, ParentTest, "no_jira");           
        //Find_Text("Find 'Enter Location' text", "Enter Your " + app.toLowerCase() + " Location", true, ParentTest, "no_jira");           

        List_L0("Find 'Enter Location' combobox", "css", "[role='combobox']", ParentTest, "no_jira");             
            if (FAIL) { return;}             
        Element_Child_Click("Click 'Select Location' Slot", L0.get(0), "tagName", "input", ParentTest, "no_jira");             
            if (FAIL) { return;}                      
        Element_Child_Text_Enter("Enter Target Site Name: " + SITE, L0.get(0), "tagName", "input", SITE, false, ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'fetch-sites-loader'...", "xpath", "//*[contains(@class, 'fetch-sites-loader')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}            
//        Element_SendKey_Enter("Click 'Location' combobox 'ENTER'", L0.get(0), ParentTest, "no_jira");  
        Element_E1_Find("Find Matching Location list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_Child_List_L1("Matching Locations Count", e1, "xpath", ".//div[@class='v-list-item__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return; }  
//            for (int i = 0; i < L1.size(); i++) {
//                Element_Text("Location (" + i + ") Name:", L1.get(i),  ParentTest, "no_jira");             
//            }
        Element_Click("Select 1st Location in the found Locations list", L1.get(0),ParentTest, "no_jira"); 
            if (FAIL) { return; }  
        
//        Element_E1_Find("Find Header Card", "xpath", "//div[@class='header-card v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira");
//            if (FAIL) { return;} 
//        Element_Child_List_L1("Header lines count", e1,"xpath", ".//div[contains(@class, 'v-card__')]", ParentTest, "no_jira");                                     
//            for (int i = 0; i < L1.size(); i++) {
//                Element_Text("Header (" + i + ") line:", L1.get(i),  ParentTest, "no_jira");             
//            }  
            
        PICKUP = false;
        DELIVERY = false;
        String SERVICE = "";
        List_L0("Check Available Services (Pickup/Delivery)", "css", "[role='tab']", ParentTest, "no_jira");
        if (L0.isEmpty()) {
            Element_By_Selector_Text("Single Available Service: ", "xpath", "//div[@class='pickup-or-delivery']",  ParentTest, "no_jira"); 
            if (t.toLowerCase().contains("pickup")) { 
                PICKUP = true; 
                SERVICE = "Pickup";
            }
            if (t.toLowerCase().contains("delivery")) { 
                DELIVERY = true;
                SERVICE = "Delivery";

            } 
            List_L1(SERVICE + " Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
            for (int j = 0; j < L1.size(); j++) {
                Element_Text("Delivery Brand (" + j + "):", L1.get(j),  ParentTest, "no_jira");     
            } 
        } else { 
            for (int i = 0; i < 2; i++) {
                List_L0("Find Service tabs", "css", "[role='tab']", ParentTest, "no_jira");
                Element_Text("Service tab (" + i + ") name:", L0.get(i),  ParentTest, "no_jira");                       
                if (t.toLowerCase().equals("pickup")) { 
                    PICKUP = true; 
                    SERVICE = "Pickup";           
                }
                if (t.toLowerCase().equals("delivery")) { 
                    DELIVERY = true;
                    SERVICE = "Delivery";         
                } 
                Element_Click("Click '" + SERVICE + "' tab", L0.get(i), ParentTest, "no_jira"); 
                    if (FAIL) { return; } 
                List_L1("List " + SERVICE + " Brands / Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
                if(!L1.isEmpty()) {
//                    for (int j = 0; j < L1.size(); j++) {
//                        Element_Text(SERVICE + " Brand (" + j + "):", L1.get(j), ParentTest, "no_jira");     
//                    }
                    Element_Click("Select 1st " + SERVICE + " Brand in the List", L1.get(0),  ParentTest, "no_jira"); 
                    List_L2("Get Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");                 
//                    for (int j = 0; j < L2.size(); j++){         
//                        //Element_Text("Print Menu Category " + j + " Name ", L2.get(j),  ParentTest, "no_jira");
//                        Element_Click("Select Category " + j, L2.get(j), ParentTest, "no_jira");                
//                    }   
                    Element_Click("Select 1st Category", L2.get(0), ParentTest, "no_jira"); 
                    List_L2("Get Selected Category > Menu Items Count", "xpath", "//div[@class='menu-item pa-3 mt-3 v-card v-card--link v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira"); 
                } 
                Navigate_Back("Navigate Back", "Brand Menu", "Site Brands", ParentTest, "no_jira");   
            } 
 
        }    
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }  
    }  
//    private void leftPanelClick( WebElement brandCard ) {
//    try {
//        Element_Click("Select first Brand in the List", brandCard,  ParentTest, "no_jira"); 
//        List_L2("Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");                 
//        for ( WebElement we : L2){         
//            Element_Text("Menu Category : ", we,  ParentTest, "no_jira");
//            Element_Click("Click Category", we, ParentTest, "no_jira");                
//        }
//
//  
//    } catch (Exception ex){
//        String AAA = ex.getMessage(); _t++; _f++;
//        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
//        try{
//            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
//        }catch(Exception eee) {};
//    }
//    }
}

