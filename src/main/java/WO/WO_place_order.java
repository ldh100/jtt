/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import A.TWeb;
import static A.A.*;
import static WO.WO.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Oleg.Spozito
 */
public class WO_place_order {
    public static int  ORDERCOUNT = 15;
    public static void run(boolean ISDELIVERYORDER) throws InterruptedException { 
    //delivery order work flow
      
        
        if (ISDELIVERYORDER){
            if (!DELIVERY) {
                _t++; EX += _t + "\t" + "Delivery service is not available for "+SITE + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                return;
            }
            _t++; Thread.sleep((long) sleep);  TWeb.Element_By_Path_Click("Enter Selected  Brand:   "+ BRAND ,"xpath", "//strong[text()=' "+BRAND+" ']",  "no_jira"); 
            _t++; Thread.sleep((long) sleep);  TWeb.List_L2("Menu Category count ", "css", "[role='tab']", "no_jira");
 //L0:       L1:         L2:Left pannel category         L3:                 
            for ( WebElement we : L2){         
                _t++; TWeb.Element_Text("Menu Category : ", we ,  "no_jira");
                _t++; TWeb.Element_Click("Click Category",we , "no_jira");                
            }
        
            try{_t++; Thread.sleep((long) sleep);  TWeb.Element_Click("return to top category ",L2.get(0) , "no_jira");
            
            }catch (Exception e){
                
            }
            
            for (int ordersCount=0; ordersCount< ORDERCOUNT; ordersCount++ ){
                System.out.println("+++++++++++++++++++++++++++++++++++ Order Nuber  " + (ordersCount+1) + " +++++++++++++++++++++++++++++++++++");
                _t++; EX += _t + "\t" + "Start placing "+ (ordersCount+1) +" order "+ "\t" + " +++++++++ " + "\t" + "++++++++++ " + "\t" + "  " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                //Menu screen
                _t++; TWeb.List_L3("Menu Category in the middle pannel  ", "xpath", "//div[@class='pb-6']", "no-jira");
  //L0:       L1:         L2:Left pannel category         L3:   Middle Pannel catgory 
                //iterate each category's first item
                for(WebElement we: L3) {
                  //  String cat = we.findElement(By.cssSelector("[class='pb-4']")).getText();
                    _t++; TWeb.Element_Child_Text("Category Name:  ", we, "css"  , "[class='pb-4']", "no_jira");
                    _t++; TWeb.Element_Child_List_L1("-Items count in Category  ",we, "css","[class='row mb-5 bold no-gutters']", "no_jira");
   //L0:       L1:items of each catgory         L2:Left pannel category         L3:   Middle Pannel catgory           
                //System.out.println ("first item in the catgory " +we.getText());
                //System.out.println ("first item in the catgory " +L1.get(0).getText());
               
                    _t++; TWeb.Element_Text("-First item name in Catgory  ",L1.get(0),"no_jira");
                    _t++; TWeb.Element_Click("-Click to open first item modal --- "+L1.get(0).getText(),L1.get(0) , "no_jira");
            //switch to opened modal
                    //_t++; TWeb.Element_E1_Find("Switch to modal","css" , "[role='document']", "no_jira");
                        if (FAIL) { return;}  
                    _t++; TWeb.Element_By_Path_Text("--Verify Item Name in Model Title", "css", "[class='my-0']", "no_jira");
                        if (FAIL) { return;}  
                    _t++; TWeb.Element_By_Path_Text("--Button(in item modal) Text" , "xpath","(//span[@class='v-btn__content'])[5]" , "no_jira"); //verify button 
                    // System.out.println(t);
                    
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
                    
//                    System.out.println  ("requirement ------- "+req );
//                    System.out.println  ("required ------- "+required );
//                    System.out.println("selectionType --------"+selectionType );
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
            
                _t++; TWeb.Element_By_Path_Click("Click CHECKOUT Button", "xpath", "//p[text()='Checkout']", "no_jira");
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                Thread.sleep(3000); 
                _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");       

                String Time_Droplist ;         
            
                Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getAttribute("disabled");
                while ("true".equalsIgnoreCase(Time_Droplist)) {
                _t++; TWeb.Refresh("Refresh Page", "no-jira");
                
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                Thread.sleep(3000); 
                //_t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");  
                _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira"); 
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "css", "[placeholder='Select Delivery Time']", "no_jira");
                Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getAttribute("disabled");
            }
            Thread.sleep(1000);
            _t++; TWeb.Element_By_Path_Click("click 'Delivery time'  dropdown", "css", "[placeholder='Select Delivery Time']", "no_jira");
            _t++; TWeb.Element_E1_Find(app, "xpath", "(//div[@role='listbox'])", url);
            _t++ ;TWeb.Element_Child_List_L1(app, e1, "css", "[role='option']", url);
            _t++; TWeb.Element_Click("select 'Delivery Time' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), url);
            _t++; TWeb.Refresh("Refresh Page", "no-jira");
            _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
            _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira"); 
            
            Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getAttribute("disabled");
            while ("true".equalsIgnoreCase(Time_Droplist)) {
                _t++; TWeb.Refresh("Refresh Page", "no-jira");
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                Thread.sleep(3000);
                //_t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "css", "[placeholder='Select Delivery Time']", "no_jira");
                Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getAttribute("disabled");
            }
      
            TWeb.List_L0("", "css", "[role='listbox']", url);
            System.out.println(" ListBox   "+L0.size());
            TWeb.List_L0("", "css", "[class='v-input__control']", url);
            System.out.println(" input__control   "+L0.size());
            for(WebElement input__control:L0) System.out.println(" input__control---------   " +input__control.getText());
            TWeb.List_L0("", "css", "[class='v-select__selections']", url);
            System.out.println(" select__selections   "+L0.size());
           
            
        //Select location
            
            _t++; TWeb.Element_By_Path_Click("Click 'Delivery location' dropdown", "css", "[placeholder='Select Delivery Location']", "no_jira");
            TWeb.List_L0("", "css", "[role='option']", url);
            System.out.println(" ListBox   "+L0.size());            
            _t++; TWeb.Element_By_Path_Click("Select 'Delivert location' from Dropdown", "xpath", "(//div[@role='option'])["+(L0.size())+"]", "no_jira");
            
         
            
           
        //Select time 
            _t++; TWeb.Element_By_Path_Click("Select 'Delivery time' from dropdown", "css", "[placeholder='Select Delivery Time']", "no_jira");
            TWeb.List_L0("", "css", "[role='listbox']", url);
            System.out.println(" ListBox   "+L0.size());
            _t++; TWeb.Element_E1_Find(app, "xpath", "(//div[@role='listbox'])[2]", url);
            _t++ ;TWeb.Element_Child_List_L1(app, e1, "css", "[role='option']", url);
            System.out.println("numbers of Timeslot " + L1.size());
            _t++; TWeb.Element_Click("select 'Delivery Time' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), url);
            
            
           
        //Select Payment    
            _t++; TWeb.Element_By_Path_Click("Click  'Payment' dropdown", "xpath", "(//div[@class='v-select__slot'])[5]", "no_jira");
           
            TWeb.List_L0("", "css", "[role='listbox']", url);
            System.out.println(" ListBox   "+L0.size());
               _t++; TWeb.Element_E1_Find(app, "xpath", "(//div[@role='listbox'])[3]", url);
               _t++ ;TWeb.Element_Child_List_L1(app, e1, "css", "[role='option']", url);
              // TWeb.
                System.out.println("numbers of Timeslot " + L1.size());
            
                _t++; TWeb.Element_Click("Select 'Payment' from dropdown", L1.get(L1.size()>3?3:(L1.size()-1)), "no_jira");
            
                _t++; TWeb.Element_By_Path_Click("Click 'PLACE ORDR' button ", "xpath", "(//div[@class='v-window-item v-window-item--active']//button)[2]", "no_jira");//(//div[@class='v-window-item v-window-item--active']//button)[2]
                _t++; TWeb.Wait_For_Element_By_Path_InVisibility("Wait for checkout complete and direct to past order screen", "css", "[role='document']", "no_jira");    


                _t++; TWeb.Element_By_Path_Click("click search bar ", "xpath", "//label[text()='Enter Your Thrive Location']/following::input","no_jira");
                _t++; TWeb.Element_By_Path_Text_Enter("Type in search bar", "xpath", "//label[text()='Enter Your Thrive Location']/following::input", SITE, FAIL, "no_jira");
                _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Location list", "xpath", "//div[@role='listbox']", "no_jira");
                if (FAIL) { return;}  
                _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Matching Locations Count", e1,"xpath", ".//div[@class='v-list-item__title']", "no_jira");                                     
                for (int i = 0; i < L1.size(); i++) {
                    _t++; TWeb.Element_Text("Location (" + i + ") Name:", L1.get(i),  "no_jira");             
                    if (FAIL) { return;}
                }
              
                _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Select 1st Location in the list", L1.get(0),"no_jira"); 
                if (FAIL) { return; } Thread.sleep(1000);
    //            _t++; TWeb.Element_By_Path_Click("Click title to return to location page ", "xpath", "//div[text()=' "+SITE +" ']", url);
                _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for location screen rendering", "xpath","//strong[text()=' Delivery ']", "no_jira");   
                _t++; TWeb.Element_By_Path_Click("Click 'Delivery' tab", "xpath","//strong[text()=' Delivery ']","no_jira"); 
                Thread.sleep( 3000);
                _t++; TWeb.Element_By_Path_Click("Enter Selected  Brand:   "+ BRAND ,"xpath", "//strong[text()=' "+BRAND+" ']",  "no_jira"); 
                Thread.sleep( 3000);
            }
        }
           
        
    //Pickup Order work flow
        else{     
            if (!PICKUP){
                _t++; EX += _t + "\t" + "Pickup  service is not available for "+SITE+"/"+BRAND + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
              return;
                     
            }
            
            
            
            
        }
            
        
    }  
    public static void addItemToBasket(WebElement ItemModal ) {
         
     }
     
    public static void placeOrder(WebElement ItemModal ) {
         
     }
        

             
         
     
}
