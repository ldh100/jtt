/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Oleg.Spozito
 */
public class WO_place_order {
    public static int  ORDERCOUNT = 2;
    
    public static void run(boolean ISDELIVERYORDER) throws InterruptedException { 
       final String ORDERTYPE  =  ISDELIVERYORDER?"Delivery":"Pickup";
//        try {
//            System.out.println ("place "+ ORDERTYPE +" orders number");
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
                _t++; EX += _t + "\t" + "Delivery service is not available for "+SITE + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
            }
             if (!ISDELIVERYORDER & !PICKUP){
                _t++; EX += _t + "\t" + "PICKUP service is not available for "+SITE + "\t" + " ===== " + "\t" + "Jump out PICKUP order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                    return;
            }
        }
        String ServiceTabxPathStr="";
//        if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
        ServiceTabxPathStr = ISDELIVERYORDER?"//strong[text()=' Delivery ']" :    "//strong[text()=' Pickup ']"   ;
//            //String isDeliveryTabSelected=d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected");
//                //Verify is Service tab selected
//            while(!"true".equalsIgnoreCase(d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected"))){
//                _t++;   TWeb.Element_By_Path_Click("Click service tab ","xpath",ServiceTabxPathStr,"no_jira");             
//            }
//        }
//        
        if(true){
            Thread.sleep((long) 3000);
            for (int ordersCount=0; ordersCount< ORDERCOUNT; ordersCount++ ){
                _t++; TWeb.Element_By_Path_Click("click search bar ", "xpath", "//label[text()='Enter Your Thrive Location']/following::input","no_jira");
                _t++; TWeb.Element_By_Path_Text_Enter("Type in search bar", "xpath", "//label[text()='Enter Your Thrive Location']/following::input", SITE, FAIL, "no_jira");
                
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Location list", "xpath", "//div[@role='listbox']", "no_jira");
                    if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
                //for (int i = 0; i < L1.size(); i++) {
                _t++; TWeb.Element_Text("Location (" + "1" + ") Name:", L1.get(0),  "no_jira");             
                    if (FAIL) { return;}
                //}
              
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
                if (FAIL) { return; } 
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for location screen rendering", "xpath","//strong[text()=' Delivery ']", "no_jira");   
                Thread.sleep( 3000);
                if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
                    while(!"true".equalsIgnoreCase(d1.findElement(By.xpath(ServiceTabxPathStr)).findElement(By.xpath("./..")).getAttribute("aria-selected"))){
                        _t++;   TWeb.Element_By_Path_Click("Click service tab ","xpath",ServiceTabxPathStr,"no_jira");             
                    }
                    
                    
                   // _t++; TWeb.Element_By_Path_Click("Click 'service' tab", "xpath",ServiceTabxPathStr,"no_jira"); 
                    Thread.sleep( 3000);
                }
                
                
                
                
                
                _t++; Thread.sleep((long) sleep);  TWeb.Element_By_Path_Click("Enter Selected  Brand:   "+ BRAND ,"xpath", "//strong[text()=' "+BRAND+" ']",  "no_jira"); 
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for Brand Menu page rendering", "xpath", "//div[@class='pt-5']", "no-jira");
                System.out.println("+++++++++++++++++++++++++++++++++++ Start " + ORDERTYPE + " Order Number " + (ordersCount+1) + " of " + ORDERCOUNT +" +++++++++++++++++++++++++++++++++++");
                _t++; EX += _t + "\t" + "Start placing "+ORDERTYPE +"  #"+ (ordersCount+1) +" order "+ "\t" + " +++++++++ " + "\t" + "++++++++++ " + "\t" + "  " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                //Menu screen
                _t++; TWeb.List_L3("Menu Category in the middle pannel  ", "xpath", "//div[@class='pb-6']", "no-jira");
  //L0:       L1:         L2:       L3:   Middle Pannel catgory 
                //iterate each category's first item
                for(WebElement we: L3) {
                    _t++; TWeb.Element_Child_Text("Category Name:  ", we, "css"  , "[class='pb-4']", "no_jira");
                    _t++; TWeb.Element_Child_List_L1("-Items count in Category  ",we, "css","[class='row mb-5 bold no-gutters']", "no_jira");
   //L0:       L1:items of each catgory         L2:        L3:   Middle Pannel catgory           
                
                    _t++; TWeb.Element_Text("-First item name in Catgory  ",L1.get(0),"no_jira");
                    _t++; TWeb.Element_Click("-Click to open first item modal --- "+L1.get(0).getText(),L1.get(0) , "no_jira");
                        if (FAIL) { return;} 

                //switch to opened modal 
                    _t++; TWeb.Element_By_Path_Text("--Verify Item Name in Model Title", "css", "[class='my-0']", "no_jira");
                        if (FAIL) { return;}  
                    _t++; TWeb.Element_By_Path_Text("--Button(in item modal) Text" , "xpath","(//span[@class='v-btn__content'])[5]" , "no_jira"); //verify button 
                    String buttonText = t;
                   
                    if (buttonText.trim().contains("HOURS HAVE ENDED")){
                        TWeb.Element_By_Path_Click("Close item model ","css", "[class='v-icon notranslate pa-5 close mdi mdi-close theme--light']", "no_Jira");
                        Thread.sleep((long) 3000);
                        TWeb.Navigate_Back("Return to Site Page","Brand page ", "Site page","No_Jira");
                        //TWeb.Element_By_Path_Click("Return to Site Page", "xpath", "//div[text()=' "+ SITE +" ']", "no_jira");
                        Thread.sleep((long) 3000);
                        return;
                    }
                    
                    if (t.trim().equalsIgnoreCase(" Add to Cart ".trim().toLowerCase())){
                        _t++; TWeb.Element_By_Path_Click("--Click 'add to basket' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", "no_jira");
                        continue;
                    }
  //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory                   
                    _t++;  TWeb.List_L2("--Number of Modifier's categories ", "css", "[class='pl-5 pr-6 modGroup-title d-flex align-center v-card v-sheet v-sheet--tile theme--light']", "no_jira");
 //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory     		
                    //_t++;  TWeb.List_L0("Number of required odifier's categories ", "css", "[class='v-input--radio-group__input']", "no_jira");               
                    JavascriptExecutor js = (JavascriptExecutor) d1;                 
                    for (int i=0; i<L2.size();i++){                    
                        _t++; TWeb.Element_Child_Text("---Modifier Category " + i + " name ",L2.get(i), "css", "[class='pa-0 col']", "no_jira");
                          //  System.out.println (t);
                        _t++; TWeb.Element_Child_Text("---Modifier Category " + i + " options ",L2.get(i), "css", "[class='pa-0 text-capitalize col']", "no_jira");
                          //  System.out.println (t);
                        _t++; TWeb.Element_Child_Text("---Modifier Category " + i + " Required/Optional",L2.get(i), "css", "[class='pa-0 text-right col']", "no_jira");
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
                                WebElement btn = charge.findElement(By.xpath("./..")).findElement(By.cssSelector("[type='"+selectionType+"']"));
                                js.executeScript("arguments[0].click();",btn );
                                clicked ++ ;
                            }

                        }
                        if(clicked < req) {
                           // List< WebElement> checkbtns = ModifierGroupPannel.findElements(By.cssSelector("[type='checkbox']"));
                           for (WebElement btn : btns){
                                if (clicked >=req) {break;}
                                //System.out.println(btn.getAttribute("aria-checked"));
                                if (btn.getAttribute("aria-checked").equalsIgnoreCase("false")){
                                   js.executeScript("arguments[0].click();",btn );
                                    clicked++;  
                                }
                            }
                        }
                    }
                    _t++; TWeb.Element_By_Path_Click("---Click 'add to cart' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", "no_jira");
                }           
            //Place order
                _t++; TWeb.Element_By_Path_Click("Click CHECKOUT Button", "xpath", "//p[text()='Checkout']", "no_jira");
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
//                Thread.sleep(3000); 
                _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");       
       
       
                pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup");
                
                Thread.sleep(1000);
                _t++; TWeb.Refresh("Refresh Page", "no-jira");
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira"); 
                pickTimeSlot(ISDELIVERYORDER?"Delivery":"Pickup");
                
                if (ISDELIVERYORDER){
                    pickLocation();
                    if (FAIL) continue;
                }
                
                pickPayment();
                if (FAIL) continue;
              
                _t++; TWeb.Element_By_Path_Click("Click 'PLACE ORDR' button ", "xpath", "(//div[@class='v-window-item v-window-item--active']//button)[2]", "no_jira");//(//div[@class='v-window-item v-window-item--active']//button)[2]
                
                _t++; TWeb.Wait_For_Element_By_Path_InVisibility("Wait for checkout complete and direct to past order screen", "css", "[role='document']", "no_jira");
                
                System.out.println("+++++++++++++++++++++++++++++++++++ " + ORDERTYPE + " Order Nuber  " + (ordersCount+1) + " Complete  +++++++++++++++++++++++++++++++++++");
                System.out.println();
                _t++; EX += _t + "\t" + "Order #"+ (ordersCount+1) +" is completed "+ "\t" + " +++++++++ " + "\t" + "++++++++++ " + "\t" + "  " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                
                
                
             //Return to Site page
//                _t++; TWeb.Element_By_Path_Click("click search bar ", "xpath", "//label[text()='Enter Your Thrive Location']/following::input","no_jira");
//                _t++; TWeb.Element_By_Path_Text_Enter("Type in search bar", "xpath", "//label[text()='Enter Your Thrive Location']/following::input", SITE, FAIL, "no_jira");
//                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Location list", "xpath", "//div[@role='listbox']", "no_jira");
//                    if (FAIL) { return;}  
//                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
//                for (int i = 0; i < L1.size(); i++) {
//                    _t++; TWeb.Element_Text("Location (" + i + ") Name:", L1.get(i),  "no_jira");             
//                    if (FAIL) { return;}
//                }
//              
//                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
//                if (FAIL) { return; } Thread.sleep(1000);
//                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for location screen rendering", "xpath","//strong[text()=' Delivery ']", "no_jira");   
//                Thread.sleep( 3000);
//                if(d1.findElements(By.className("pickup-or-delivery")).isEmpty()){
//                    _t++; TWeb.Element_By_Path_Click("Click 'service' tab", "xpath",ServiceTabxPathStr,"no_jira"); 
//                    Thread.sleep( 3000);
//                }
            }
        }
        
           
        
    //Pickup Order work flow
        else{     
            if (!PICKUP){
                _t++; EX += _t + "\t" + "Pickup  service is not available for "+SITE+"/"+BRAND + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                return;
            }
            if (PICKUP && DELIVERY){
                _t++; TWeb.Element_By_Path_Click("Click Pickup Tab ", "xpath", "//strong[text()=' Pickup ']", "no_jira");
                    if(FAIL) return;
            }
            _t++; Thread.sleep((long) sleep);  TWeb.Element_By_Path_Click("Enter Selected  Brand:   "+ BRAND ,"xpath", "//strong[text()=' "+BRAND+" ']",  "no_jira"); 
            _t++; Thread.sleep((long) sleep);  TWeb.List_L2("Menu Category count ", "css", "[role='tab']", "no_jira");
                
            //_t++; TWeb.List_L1("Pickup Brands Count", "xpath", "//div[@class='v-card v-card--hover v-card--link v-sheet v-sheet--tile theme--light brand']", "no_jira");
                   
            
            
            
            
        }
            
        
    }  
    
    public static void pickTimeSlot(String OrderType)throws InterruptedException  {
        String cssStr = "[placeholder='Select " +    OrderType +  " Time']";
         TWeb.Wait_For_Element_By_Path_Presence("Wait for timeslot presence ", "css", cssStr, "no_jira");
       
        WebElement TimeSlotDroplist;
         //WebElement TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        while (FAIL||"true".equalsIgnoreCase(d1.findElement(By.cssSelector(cssStr)).getAttribute("disabled"))) {
            
            
            _t++; TWeb.Refresh("Refresh Page", "no-jira");
            _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for 'ORDRR DETAIL' screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
            Thread.sleep(3000); 
            _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira"); 
            _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for TimeSlot presence", "css", cssStr, "no_jira");
           // TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        }
        Thread.sleep(1000);
        TimeSlotDroplist = d1.findElement(By.cssSelector(cssStr));//.getAttribute("disabled");
        _t++; TWeb.Element_Click("click 'Delivery time'  dropdown", TimeSlotDroplist , "no_jira");
        _t++; TWeb.Element_E1_Find("Locate Drop Listbox", "xpath", "(//div[@role='listbox'])", "no_jira");
        _t++ ;TWeb.Element_Child_List_L1("List count ", e1, "css", "[role='option']", "no_jira");
        _t++; TWeb.Element_Click("select 'Delivery Time' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), url); 
     }
    
    
    public static void pickLocation(){
        _t++; TWeb.Element_By_Path_Click("Click 'select Delivery location' dropdown", "css", "[placeholder='Select Delivery Location']", "no_jira");
        _t++; TWeb.List_L0("find list box ", "xpath", "(//div[@role='listbox'])", "no_jira");
        //List<WebElement> listBox = d1.findElements(By.xpath("(//div[@role='listbox'])"));
        _t++ ;TWeb.Element_Child_List_L1("Find location list count ", L0.get(L0.size()-1), "css", "[role='option']", "no_jira");
      
        //System.out.println(" ListBox   "+L1.size());            
        _t++; TWeb.Element_Click("Select last 'Delivery location' from Dropdown", L1.get(L1.size()-1), "no_jira");
        if(FAIL) {return;}
        
    }
    
    
    public static void pickPayment(){
        _t++; TWeb.Element_E1_Find("Find Payment Panel Title  " ,"xpath" , "//div[text()=' Saved Cards ']", "no-jira");
        _t++; TWeb.Element_Child_E2("Locate Payment panel", e1, "xpath", "./..", "no_Jira");
        _t++; TWeb.Element_Child_Click("Open Payment Dropdown", e2, "css", "[class='v-select__slot']", "no_Jira");
        _t++; TWeb.List_L0("Locate list box ", "xpath", "(//div[@role='listbox'])", "no_jira");
        _t++ ;TWeb.Element_Child_List_L1("Find Payment CC list count ", L0.get(L0.size()-1), "css", "[role='option']", "no_jira");
        _t++; TWeb.Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), "no_jira");
        if (FAIL){return;}
        //WebElement cardPanel = e1.findElement(By.xpath("./.."));
        //System.out.println(cardPanel.getAttribute("class"));
        //System.out.println(cardPanel.findElement(By.cssSelector("[class='v-select__slot']")).getAttribute("class"));
        //cardPanel.findElement(By.cssSelector("[class='v-select__slot']")).click();
        //_t++; TWeb.Element_Child_Click("Click  'Payment' dropdown",e1 ,"xpath", "(//div[@class='v-select__slot'])", "no_jira");
           
        
//         List<WebElement> listBox = d1.findElements(By.xpath("(//div[@role='listbox'])"));
//        _t++ ;TWeb.Element_Child_List_L1("Find Payment card  list count ", listBox.get(listBox.size()-1), "css", "[role='option']", "no_jira");
        //TWeb.List_L0("", "css", "[role='listbox']", url);
//        System.out.println(" ListBox   "+L1.size());
        //_t++; TWeb.Element_E1_Find(app, "xpath", "(//div[@role='listbox'])[3]", url);
        
        //_t++; TWeb.Element_By_Path_Click("Select lasrt Payment card  from Dropdown", "xpath", "(//div[@role='option'])["+(L1.size())+"]", "no_jira");

//        _t++; TWeb.Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), "no_jira");
        
    }
    
    public static void addItemToBasket(WebElement ItemModal ) {
         
     }
     
    public static void placeOrder(WebElement ItemModal ) {
         
     }
        

             
         
     
}
