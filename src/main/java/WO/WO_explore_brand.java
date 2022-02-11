package WO;

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
        Navigate_to_URL("Navigate to", url, ParentTest, "no_jira");             
            if (FAIL) { return;}
        Page_URL("Login page", ParentTest, "no_jira");             
        Element_By_Selector_Attribute("Find " + app + " Image", "xpath", "//div[@class='v-image__image v-image__image--cover']", "style", ParentTest, "no_jira");
        //Element_By_Selector_Text("Find 'card-header' text", "xpath", "//p[@class='card-header']", ParentTest, "no_jira");           
        Find_Text("Find 'Support' text", "Support", true, ParentTest, "no_jira");           
        Find_Text("Find 'Enter Location' text", "Enter Your " + app.toLowerCase() + " Location", true, ParentTest, "no_jira");           

        List_L0("Find 'Location' combobox", "css", "[role='combobox']", ParentTest, "no_jira");             
            if (FAIL) { return;}             
        Element_Child_Click("Click 'Select Location' Slot", L0.get(0), "tagName", "input", ParentTest, "no_jira");             
            if (FAIL) { return;}                      
        Element_Child_Text_Enter("Enter Site Name", L0.get(0), "tagName", "input", SITE, false, ParentTest, "no_jira");             
            if (FAIL) { return;} 
        Thread.sleep(500); 
        Wait_For_All_Elements_InVisibility("Wait for 'fetch-sites-loader'...", "xpath", "//*[contains(@class, 'fetch-sites-loader')]", ParentTest, "no_jira");                                                                                     
            if (FAIL) { return;}  
        Thread.sleep(500);             
        Element_E1_Find("Find Location list", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active v-autocomplete__content']", ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", ParentTest, "no_jira");                                     
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Location (" + i + ") Name:", L1.get(i),  ParentTest, "no_jira");             
                if (FAIL) { return;}
            }
        Element_Click("Select 1st Location in the list", L1.get(0),ParentTest, "no_jira"); 
            if (FAIL) { return; }  
        
//        Element_E1_Find("Find Header Card", "xpath", "//div[@class='header-card v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira");
//            if (FAIL) { return;} 
//        Element_Child_List_L1("Header lines count", e1,"xpath", ".//div[contains(@class, 'v-card__')]", ParentTest, "no_jira");                                     
//            for (int i = 0; i < L1.size(); i++) {
//                Element_Text("Header (" + i + ") line:", L1.get(i),  ParentTest, "no_jira");             
//            }  
            
        PICKUP = false;
        DELIVERY = false;
        List_L0("Find Service tabs", "css", "[role='tab']", ParentTest, "no_jira");
        if (L0.isEmpty()) {
            Element_By_Selector_Text("Single Available Service:", "xpath", "//div[@class='pickup-or-delivery']",  ParentTest, "no_jira"); 
            if (t.toLowerCase().contains("pickup")) { 
                PICKUP = true; 
                List_L1("Pickup Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira");
                for (int j = 0; j < L1.size(); j++) {
                    Element_Text("Pickup Brand (" + j + "):", L1.get(j),  ParentTest, "no_jira");     
                }
            }
            if (t.toLowerCase().contains("delivery")) { 
                DELIVERY = true;
                List_L1("Delivery Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
                for (int j = 0; j < L1.size(); j++) {
                    Element_Text("Delivery Brand (" + j + "):", L1.get(j),  ParentTest, "no_jira");     
                } 
            } 
        } else { 
            for (int i = 0; i < 2; i++) {
                List_L0("Find Service tabs", "css", "[role='tab']", ParentTest, "no_jira");
                Element_Text("Service tab (" + i + ") name:", L0.get(i),  ParentTest, "no_jira");                       
                if (t.toLowerCase().equals("pickup")) { 
                    PICKUP = true; 
                    Element_Click("Click 'Pickup' tab", L0.get(i),ParentTest, "no_jira"); 
                        if (FAIL) { return; } 
                    List_L1("Pickup Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira");
                        if(L1.isEmpty())  {return;}
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Pickup Brand (" + j + "):", L1.get(j), ParentTest, "no_jira");     
                    }
                    leftPanelClick(L1.get(0));                  
                }
                if (t.toLowerCase().equals("delivery")) { 
                    DELIVERY = true;
                    Element_Click("Click 'Delivery' tab", L0.get(i), ParentTest, "no_jira"); 
                        if (FAIL) { return; } 
                    List_L1("Delivery Brands Count", "xpath", "//span[@class='ma-0 pa-7 pb-0 pt-3 brand-name-text']", ParentTest, "no_jira"); 
                        if(L1.isEmpty())  {return;}
                    for (int j = 0; j < L1.size(); j++) {
                        Element_Text("Delivery Brand (" + j + "):", L1.get(j),  ParentTest, "no_jira");     
                    } 
                    leftPanelClick(L1.get(0));
                } 
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
    private void leftPanelClick( WebElement brandCard ) {
    try {
        Element_Click("Select first Brand in the List", brandCard,  ParentTest, "no_jira"); 
        List_L2("Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");                 
        for ( WebElement we : L2){         
            Element_Text("Menu Category : ", we,  ParentTest, "no_jira");
            Element_Click("Click Category", we, ParentTest, "no_jira");                
        }
        Navigate_Back("Navigate Back", "Brand", "Site", ParentTest, "no_jira");
  
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        try{
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }catch(Exception eee) {};
    }
    }
}

