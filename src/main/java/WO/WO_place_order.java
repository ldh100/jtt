package WO;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

class WO_place_order extends WO_GUI {
    protected WO_place_order(WO_GUI a) {
        url = a.url;
        d1 = a.d1;
        app = a.app;

        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
    }

    public static int  ORDERCOUNT = 5;
    
    protected void run(boolean ISDELIVERYORDER) throws InterruptedException { 
    try{    
        if (env == "PR"){ 
            return;
        }
        
       final String ORDERTYPE  =  ISDELIVERYORDER?"Delivery":"Pickup";
//        try {
//            System.out.println ("place " + ORDERTYPE + " orders number");
//            int  inputCount =  System.in.read();System.out.println(inputCount);
//            ORDERCOUNT = inputCount - '0';
//        } catch (IOException ex) {
//            ORDERCOUNT = 2;
//        }
    //delivery order work flow
    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration - do not modify">
        
        Thread.sleep( 3000);  
        if (DELIVERY ^ PICKUP){
            if (ISDELIVERYORDER & !DELIVERY){
                _t++; EX += _t + "\t" + "Delivery service is not available for " +SITE + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
            }
             if (!ISDELIVERYORDER & !PICKUP){
                _t++; EX += _t + "\t" + "PICKUP service is not available for " +SITE + "\t" + " ===== " + "\t" + "Jump out PICKUP order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
            }
        }
        String ServiceTabxPathStr="";
//        if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
        ServiceTabxPathStr = ISDELIVERYORDER?"//strong[text()=' Delivery ']" :    "//strong[text()=' Pickup ']"   ;
//            //String isDeliveryTabSelected=d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected");
//                //Verify is Service tab selected
//            while(!"true".equalsIgnoreCase(d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected"))){
//                _t++;   TWeb.Element_By_Selector_Click("Click service tab ","xpath",ServiceTabxPathStr,ParentTest, "no_jira");             
//            }
//        }
//        
        if(true){
            Thread.sleep((long) 3000);
            for (int ordersCount=0; ordersCount< ORDERCOUNT; ordersCount++ ){
                Element_By_Selector_Click("click search bar ", "xpath", "//label[text()='Enter Your Thrive Location']/following::input",ParentTest, "no_jira");
                Element_By_Selector_Text_Enter("Type in search bar", "xpath", "//label[text()='Enter Your Thrive Location']/following::input", SITE, FAIL, ParentTest, "no_jira");
                Wait_For_Element_By_Selector_Presence("Wait for location list present ", "xpath", "//div[@role='listbox']", ParentTest, "no_jira");
                List_L0("Locate to Location list", "xpath", "//div[@role='listbox']", ParentTest, "no_jira");
                    if (FAIL|L0.size()==0) { continue;}  
                Element_Child_List_L1("Matching Locations Count", L0.get(L0.size()-1),"xpath", ".//div[@class='v-list-item__title']", ParentTest, "no_jira");                                     
                if(L1.size()==0){continue;}
                //for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Location (" + "1" + ") Name:", L1.get(0),  ParentTest, "no_jira");             
                //}
              
                Element_Click("Select 1st Location in the list", L1.get(0),ParentTest, "no_jira"); 
                if (FAIL) { return; } 
                Wait_For_Element_By_Selector_Presence("Wait for location screen rendering", "xpath","//strong[text()=' Delivery ']", ParentTest, "no_jira");   
                Thread.sleep( 3000);
                if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
                    while(!"true".equalsIgnoreCase(d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected"))){
                        Element_By_Selector_Click("Click service tab ","xpath",ServiceTabxPathStr,ParentTest, "no_jira");             
                    }                   
                   // Element_By_Selector_Click("Click 'service' tab", "xpath",ServiceTabxPathStr,ParentTest, "no_jira"); 
                    Thread.sleep( 3000);
                }
                
                Element_By_Selector_Click("Enter Selected  Brand:   " + BRAND ,"xpath", "//strong[text()=' " +BRAND+ " ']",  ParentTest, "no_jira"); 
                if (FAIL){
                    _t++; EX += _t + "\t" + "Brand --" +BRAND+ " --has no " +ORDERTYPE+ " service, quit placing order " + "\t" + " ===== " + "\t" + "Jump out PICKUP order" + "\t" + " Fail " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
                }
                Wait_For_Element_By_Selector_Presence("Wait for Brand Menu page rendering", "xpath", "//div[@class='pt-5']", ParentTest, "no-jira");
                System.out.println(" +++++++++++++++++++++++++++++++++++ Start " + ORDERTYPE + " Order Number " + (ordersCount+1) + " of " + ORDERCOUNT + " +++++++++++++++++++++++++++++++++++ ");
                _t++; EX += _t + "\t" + "Start placing " +ORDERTYPE + "  #" + (ordersCount+1) + " order " + "\t" + " +++++++++ " + "\t" + " ++++++++++ " + "\t" + "  " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                //Menu screen
                
                List_L3("Menu Category in the middle pannel  ", "xpath", "//div[@class='pb-6']", ParentTest, "no-jira");
                    if(FAIL|L3.size()==0){continue;}
  //L0:       L1:         L2:       L3:   Middle Pannel catgory 
                //iterate each category's first item
                if (ORDERCOUNT>2){L3 = L3.subList(0, 1);}
                for(WebElement we: L3) {
                    Element_Child_Text("Category Name:  ", we, "css"  , "[class='pb-4']", ParentTest, "no_jira");
                    Element_Child_List_L1("-Items count in Category  ",we, "css","[class='row mb-5 bold no-gutters']", ParentTest, "no_jira");
   //L0:       L1:items of each catgory         L2:        L3:   Middle Pannel catgory           
                
                    Element_Text("-First item name in Catgory  ",L1.get(0),ParentTest, "no_jira");
                    Element_Click("-Click to open first item modal --- " +L1.get(0).getText(),L1.get(0) , ParentTest, "no_jira");
                        if (FAIL) { 
                            return;} 

                //switch to opened modal 
                    Wait_For_Element_By_Selector_Presence("Wait for item modal rendering", "xpath", "(//span[@class='v-btn__content'])[5]", ParentTest, "no-jira");
                    Element_By_Selector_Text("--Verify Item Name in Model Title", "css", "[class='my-0']", ParentTest, "no_jira");
                        if (FAIL) { return;}  
                    Element_By_Selector_Text("--Button(in item modal) Text" , "xpath","(//span[@class='v-btn__content'])[5]" , ParentTest, "no_jira"); //verify button 
                    String buttonText = t;
                   
                    if (buttonText.trim().contains("HOURS HAVE ENDED")){
                        Element_By_Selector_Click("Close item model ","css", "[class='v-icon notranslate pa-5 close mdi mdi-close theme--light']", ParentTest, "no_jira");
                        Thread.sleep((long) 3000);
                        Navigate_Back("Return to Site Page","Brand page ", "Site page",ParentTest, "no_jira");
                        //TWeb.Element_By_Selector_Click("Return to Site Page", "xpath", "//div[text()=' " + SITE + " ']", ParentTest, "no_jira");
                        Thread.sleep((long) 3000);
                        return;
                    }
                    
                    if (t.trim().equalsIgnoreCase(" Add to Cart ".trim().toLowerCase())){
                        Thread.sleep((long) 1000);
                        Element_By_Selector_Click("--Click 'add to basket' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", ParentTest, "no_jira");
                        continue;
                    }
  //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory                   
                    List_L2("--Number of Modifier's categories ", "css", "[class='pl-5 pr-6 modGroup-title d-flex align-center v-card v-sheet v-sheet--tile theme--light']", ParentTest, "no_jira");
 //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory     		
                    //_t++;  TWeb.List_L0("Number of required odifier's categories ", "css", "[class='v-input--radio-group__input']", ParentTest, "no_jira");               
                    JavascriptExecutor js = (JavascriptExecutor) d1;                 
                    for (int i = 0; i < L2.size(); i++){                    
                        Element_Child_Text("---Modifier Category " + i + " name ",L2.get(i), "css", "[class='pa-0 col']", ParentTest, "no_jira");
                          //  System.out.println (t);
                        Element_Child_Text("---Modifier Category " + i + " options ",L2.get(i), "css", "[class='pa-0 text-capitalize col']", ParentTest, "no_jira");
                          //  System.out.println (t);
                        Element_Child_Text("---Modifier Category " + i + " Required/Optional",L2.get(i), "css", "[class='pa-0 text-right col']", ParentTest, "no_jira");
                          //  System.out.println (t); 
                        int req = Integer.parseInt(t.equalsIgnoreCase("optional")? "0" :t.substring(0, t.indexOf( ' ' )) );
                        boolean required = (t.toLowerCase().contains("required") ? true : false); 
                        String selectionType = "";
                        WebElement ModifierGroupPannel =   L2.get(i).findElement(By.xpath("./.."));
                        try{
                            ModifierGroupPannel.findElement(By.cssSelector("[role='radiogroup']"));
                            selectionType = "radio";
                        }catch (Exception e){
                            selectionType = "checkbox";

                        }
                    

                        int clicked = 0 ;
                        List<WebElement> charges = null;
                        List<WebElement> btns = null;
                        
                        switch (selectionType) {
                            case "radio":
                                charges  = ModifierGroupPannel.findElements(By.cssSelector("[class='d-flex justify-end mr-2 col']"));
                                btns = ModifierGroupPannel.findElements(By.cssSelector("[type='radio']"));
                                break;
                                
                            case "checkbox":
                                charges  = ModifierGroupPannel.findElements(By.cssSelector("[class='d-flex align-center justify-end mr-2 col']"));
                                btns = ModifierGroupPannel.findElements(By.cssSelector("[type='checkbox']"));
                                break;
                            
                            default :
                                break;
                        }
                        for (WebElement charge : charges ){
                            if (clicked>= req) {break;}
                            if (!charge.getAttribute("innerText").isEmpty()){
                                WebElement testEl = charge.findElement(By.xpath("./.."));
                                testEl = testEl.findElement(By.cssSelector("[type='checkbox']+ div"));///following-sibling::div"));
                               // testEl = testEl.findElement(By.xpath("./following-sibling::div[1]"));
                                js.executeScript("arguments[0].click();",testEl );
                                
                                //WebElement btn = charge.findElement(By.xpath("./..")).findElement(By.cssSelector("[type='" +selectionType+ "']"));
                                
                                
                                
                                //js.executeScript("arguments[0].click();",btn );
                                clicked ++ ;
                            }

                        }
                        if(clicked < req) {
                           // List< WebElement> checkbtns = ModifierGroupPannel.findElements(By.cssSelector("[type='checkbox']"));
                           for (WebElement btn : btns){
                                if (clicked >=req) {break;}
                                //System.out.println(btn.getAttribute("aria-checked"));
                                if (btn.getAttribute("aria-checked").equalsIgnoreCase("false")){
                                    WebElement testEl = btn.findElement(By.xpath("./.."));
                                testEl = testEl.findElement(By.xpath("./input[@role='checkbox']/following-sibling::div"));
                                js.executeScript("arguments[0].click();",testEl );
                                    
                                    
                                    
                                 //  js.executeScript("arguments[0].click();",btn );
                                   clicked++;  
                                }
                            }
                        }
                    }
                    Element_By_Selector_Click("---Click 'add to cart' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", ParentTest, "no_jira");
                    if(FAIL){return;}
                }           
            //Place order
                Element_By_Selector_Click("Click CHECKOUT Button", "xpath", "//p[text()='Checkout']", ParentTest, "no_jira");
                
                if (url.contains("dev.thriveapp.io")){
                    Wait_For_Element_By_Selector_Presence("Wait for checkout screen", "xpath", "//h3[text()=' Ordering from ']", ParentTest, "no-Jira");

                    WebElement placeOrdertext = d1.findElement(By.xpath("//p[text()='Place order']"));
                    System.out.println(placeOrdertext.getText());
                    WebElement btn = placeOrdertext.findElement(By.xpath("./..") ).findElement(By.xpath("./.."));
                    System.out.println(btn.getAttribute("disabled"));
                    System.out.println(d1.findElement(By.xpath("//p[text()='Place order']")).findElement(By.xpath("./..")).findElement(By.xpath("./..")).getAttribute("disabled"));

                    pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup",true);
                    Thread.sleep(1000);
                    System.out.println("Place Order Button disabled is " +d1.findElement(By.xpath("//p[text()='Place order']")).findElement(By.xpath("./..")).findElement(By.xpath("./..")).getAttribute("disabled"));

                    while ("true".equals(d1.findElement(By.xpath("//p[text()='Place order']")).findElement(By.xpath("./..")).findElement(By.xpath("./..")).getAttribute("disabled"))){
                        Refresh("Refresh Page", ParentTest, "no-jira");
                        Wait_For_Element_By_Selector_Presence("Wait for checkout screen", "xpath", "//h3[text()=' Ordering from ']", ParentTest, "no_jira");
                        //Element_By_Selector_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira"); 
                        pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup",true);

                        if (ISDELIVERYORDER){
                            pickLocation(true);
                            //if (FAIL) continue;
                        }        
                        System.out.println("Place Order Button disabled is " +d1.findElement(By.xpath("//p[text()='Place order']")).findElement(By.xpath("./..")).findElement(By.xpath("./..")).getAttribute("disabled"));


                        pickPayment(true);
                        System.out.println("Place Order Button disabled is " +d1.findElement(By.xpath("//p[text()='Place order']")).findElement(By.xpath("./..")).findElement(By.xpath("./..")).getAttribute("disabled")); 
                    }
                    Element_By_Selector_Click("Click 'PLACE ORDER' button ", "xpath","//p[text()='Place order']/../..", ParentTest, "no-Jira");
                }
                
            
                else{
                
                    Wait_For_Element_By_Selector_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira");
    //                Thread.sleep(3000); 
                    Element_By_Selector_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira");       


                    pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup",false);

                    Thread.sleep(1000);
                    System.out.println("Place button " +d1.findElement(By.xpath("(//div[@class='v-window-item v-window-item--active']//button)[2]")).getAttribute("disabled"));
                    while ("true".equals(d1.findElement(By.xpath("(//div[@class='v-window-item v-window-item--active']//button)[2]")).getAttribute("disabled"))){
                        Refresh("Refresh Page", ParentTest, "no-jira");
                        Wait_For_Element_By_Selector_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira");
                        Element_By_Selector_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira"); 
                        pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup",false);

                        if (ISDELIVERYORDER){
                            pickLocation(false);
                            //if (FAIL) continue;
                        }

                        pickPayment(false);
                    }
                    Element_By_Selector_Click("Click 'PLACE ORDER' button ", "xpath", "(//div[@class='v-window-item v-window-item--active']//button)[2]", ParentTest, "no_jira");//(//div[@class='v-window-item v-window-item--active']//button)[2]
                
                    
                }
              
              //  Element_By_Selector_Click("Click 'PLACE ORDR' button ", "xpath", "(//div[@class='v-window-item v-window-item--active']//button)[2]", ParentTest, "no_jira");//(//div[@class='v-window-item v-window-item--active']//button)[2]
                Wait_For_Element_By_Selector_InVisibility("Wait for greating message Loader complete and page redirect ", "css", "[role='document']", ParentTest, "no_jira");
                Wait_For_Element_By_Selector_InVisibility("Wait for 'Place Order' button disappear, and page redirect(Loader present) ", "css", "[class='col col-4']", ParentTest, "no_jira");
                    if(FAIL){continue;}
                    
                
                System.out.println(" +++++++++++++++++++++++++++++++++++ " + ORDERTYPE + " Order Nuber  " + (ordersCount+1) + " Complete  +++++++++++++++++++++++++++++++++++ ");
                System.out.println();
                _t++; EX += _t + "\t" + "Order #" + (ordersCount+1) + " is completed " + "\t" + " +++++++++ " + "\t" + " ++++++++++ " + "\t" + "  " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                
                
                
             //Return to Site page
//                Element_By_Selector_Click("click search bar ", "xpath", "//label[text()='Enter Your Thrive Location']/following::input",ParentTest, "no_jira");
//                Element_By_Selector_Text_Enter("Type in search bar", "xpath", "//label[text()='Enter Your Thrive Location']/following::input", SITE, FAIL, ParentTest, "no_jira");
//                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Location list", "xpath", "//div[@role='listbox']", ParentTest, "no_jira");
//                    if (FAIL) { return;}  
//                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", ParentTest, "no_jira");                                     
//                for (int i = 0; i < L1.size(); i++) {
//                    Element_Text("Location (" + i + ") Name:", L1.get(i),  ParentTest, "no_jira");             
//                    if (FAIL) { return;}
//                }
//              
//                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Location in the list", L1.get(0),ParentTest, "no_jira"); 
//                if (FAIL) { return; } Thread.sleep(1000);
//                Wait_For_Element_By_Selector_Presence("Wait for location screen rendering", "xpath","//strong[text()=' Delivery ']", ParentTest, "no_jira");   
//                Thread.sleep( 3000);
//                if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
//                    Element_By_Selector_Click("Click 'service' tab", "xpath",ServiceTabxPathStr,ParentTest, "no_jira"); 
//                    Thread.sleep( 3000);
//                }
            }
        }
        
           
        
    //Pickup Order work flow
        else{     
            if (!PICKUP){
                _t++; EX += _t + "\t" + "Pickup  service is not available for " +SITE+ "/" +BRAND + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                return;
            }
            if (PICKUP && DELIVERY){
                Element_By_Selector_Click("Click Pickup Tab ", "xpath", "//strong[text()=' Pickup ']", ParentTest, "no_jira");
                    if(FAIL) return;
            }
            Element_By_Selector_Click("Enter Selected  Brand:   " + BRAND ,"xpath", "//strong[text()=' " +BRAND+ " ']",  ParentTest, "no_jira"); 
            List_L2("Menu Category count ", "css", "[role='tab']", ParentTest, "no_jira");
                
            //List_L1("Pickup Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", ParentTest, "no_jira");
        }
            
    } catch (Exception ex){}              
    }  
    
    private void pickTimeSlot(String OrderType,boolean newUI)throws InterruptedException  {
    try {    
        if (newUI && OrderType == "Pickup") OrderType = "Pick Up";
        
        String cssStr = newUI?"[placeholder='Select a " +    OrderType +  " Time']":"[placeholder='Select " +    OrderType +  " Time']";
        
        Wait_For_Element_By_Selector_Presence("Wait for timeslot presence ", "css", cssStr, ParentTest, "no_jira");
       
        WebElement TimeSlotDroplist;
         //WebElement TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        while (FAIL||"true".equalsIgnoreCase(d1.findElement(By.cssSelector(cssStr)).getAttribute("disabled"))) {           
            Refresh("Refresh Page", ParentTest, "no-jira");
           // Wait_For_Element_By_Selector_Presence("Wait for 'ORDRR DETAIL' screen", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira");
            Thread.sleep(3000); 
            Element_By_Selector_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", ParentTest, "no_jira"); 
            Wait_For_Element_By_Selector_Presence("Wait for TimeSlot presence", "css", cssStr, ParentTest, "no_jira");
           // TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        }
        Thread.sleep(1000);
        TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        Element_Click("click 'Delivery time'  dropdown", TimeSlotDroplist , ParentTest, "no_jira");
        Element_E1_Find("Locate Drop Listbox", "xpath", "(//div[@role='listbox'])", ParentTest, "no_jira");
        Element_Child_List_L1("List count ", e1, "css", "[role='option']", ParentTest, "no_jira");
        Element_Click("select 'Delivery Time' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), ParentTest, "no_jira"); 
    } catch (Exception ex){}
}
    
    
    private void pickLocation(boolean newUI){
    try {       
        Element_By_Selector_Click("Click 'select Delivery location' dropdown", "css", newUI?"[placeholder='Select a Delivery Location']":"[placeholder='Select Delivery Location']", ParentTest, "no_jira");
        List_L0("find list box ", "xpath", "(//div[@role='listbox'])", ParentTest, "no_jira");
        //List<WebElement> listBox = d1.findElements(By.xpath("(//div[@role='listbox'])"));
        Element_Child_List_L1("Find location list count ", L0.get(L0.size()-1), "css", "[role='option']", ParentTest, "no_jira");
      
        //System.out.println(" ListBox   " +L1.size());            
        Element_Click("Select last 'Delivery location' from Dropdown", L1.get(L1.size()-1), ParentTest, "no_jira");
        if(FAIL) {return;}
    } catch (Exception ex){}        
    }
    
    
    private void pickPayment(boolean newUI){
    try {       
        if (newUI){
            Element_By_Selector_Click("Open Payment Dropdown", "css", "[placeholder='Select a Payment Method']", ParentTest, "no_jira");
            List_L0("Locate list box ", "xpath", "(//div[@role='listbox'])",  ParentTest, "no_jira");
            Element_Child_List_L1("Find Payment CC list count ", L0.get(L0.size()-1), "css", "[role='option']", ParentTest, "no_jira");
            Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), ParentTest, "no_jira");
            if (FAIL){return;}
        }
        
        
        
        else{
            Element_E1_Find("Find Payment Panel Title  " ,"xpath" , "//div[text()=' Saved Cards ']", ParentTest, "no-jira");
            Element_Child_E2("Locate Payment panel", e1, "xpath", "./..", ParentTest, "no_jira");
            Element_Child_Click("Open Payment Dropdown", e2, "css", "[class='v-select__slot']", ParentTest, "no_jira");
            List_L0("Locate list box ", "xpath", "(//div[@role='listbox'])", ParentTest, "no_jira");
            Element_Child_List_L1("Find Payment CC list count ", L0.get(L0.size()-1), "css", "[role='option']", ParentTest, "no_jira");
            Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), ParentTest, "no_jira");
            if (FAIL){return;}
        }
        //WebElement cardPanel = e1.findElement(By.xpath("./.."));
        //System.out.println(cardPanel.getAttribute("class"));
        //System.out.println(cardPanel.findElement(By.cssSelector("[class='v-select__slot']")).getAttribute("class"));
        //cardPanel.findElement(By.cssSelector("[class='v-select__slot']")).click();
        //Element_Child_Click("Click  'Payment' dropdown",e1 ,"xpath", "(//div[@class='v-select__slot'])", ParentTest, "no_jira");
           
        
//         List<WebElement> listBox = d1.findElements(By.xpath("(//div[@role='listbox'])"));
//        _t++ ;TWeb.Element_Child_List_L1("Find Payment card  list count ", listBox.get(listBox.size()-1), "css", "[role='option']", ParentTest, "no_jira");
        //TWeb.List_L0("", "css", "[role='listbox']", url);
//        System.out.println(" ListBox   " +L1.size());
        //Element_E1_Find(app, "xpath", "(//div[@role='listbox'])[3]", url);
        
        //Element_By_Selector_Click("Select lasrt Payment card  from Dropdown", "xpath", "(//div[@role='option'])[" +(L1.size())+ "]", ParentTest, "no_jira");

//        Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), ParentTest, "no_jira");
    } catch (Exception ex){}        
    }
}
