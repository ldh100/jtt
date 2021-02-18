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
        
            _t++; Thread.sleep((long) sleep);  TWeb.Element_Click("return to top category ",L2.get(0) , "no_jira");
            
            
            for (int ordersCount=0; ordersCount< ORDERCOUNT; ordersCount++ ){
                System.out.println("+++++++++++++++++++++++++++++++++++ " + ordersCount + " +++++++++++++++++++++++++++++++++++");
            
        //Menu screen
            
          //  _t++; TWeb.Element_Click("return to top category ",L2.get(0) , "no_jira");
            _t++; TWeb.List_L3("Menu Category in the middle pannel  ", "xpath", "//div[@class='pb-6']", "no-jira");
  //L0:       L1:         L2:Left pannel category         L3:   Middle Pannel catgory 
        //iterate each category's first item
            for(WebElement we: L3) {     
               // _t++; TWeb.Element_By_Path_Text("Category Name:+++++++++  ", "xpath", "//div[@class='pb-6']//h2", "no_jira");
                //_t++;
                String cat = we.findElement(By.cssSelector("[class='pb-4']")).getText();
               // System.out.println("----------------------------");
               // System.out.println(cat);
                _t++; TWeb.Element_Child_Text("Category Name:  ", we, "css"  , "[class='pb-4']", "no_jira");
                _t++; TWeb.Element_Child_List_L1("Items count in Category --- ",we, "css","[class='row mb-5 bold no-gutters']", "no_jira");
   //L0:       L1:items of each catgory         L2:Left pannel category         L3:   Middle Pannel catgory           
                //System.out.println ("first item in the catgory " +we.getText());
                //System.out.println ("first item in the catgory " +L1.get(0).getText());
               
                _t++; TWeb.Element_Text("First item ",L1.get(0),"no_jira");
                _t++; TWeb.Element_Click("Click to open first item modal --- "+L1.get(0).getText(),L1.get(0) , "no_jira");
            //switch to opened modal
                _t++; TWeb.Element_E1_Find("Switch to modal","css" , "[role='document']", "no_jira");
                    if (FAIL) { return;}  
                    
                _t++; TWeb.Element_By_Path_Text("Button Text" , "xpath","(//span[@class='v-btn__content'])[5]" , "no_jira"); //verify button 
                    // System.out.println(t);
                if (t.trim().equalsIgnoreCase(" Add to Cart ".trim().toLowerCase())){
                    _t++; TWeb.Element_By_Path_Click("Click 'add to basket' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", "no_jira");
                    continue;
                    }
                _t++; TWeb.Element_By_Path_Text("Verify Item Name in Title", "css", "[class='my-0']", "no_jira");
                    if (FAIL) { return;}   
                //   System.out.println ("Verify Item Name in Title: " +t); 
                   
                   
  //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory                   
                _t++;  TWeb.List_L2("Number of Modifier's categories ", "css", "[class='pl-5 pr-6 modGroup-title d-flex align-center v-card v-sheet v-sheet--tile theme--light']", "no_jira");
 //L0:       L1:items of each catgory         L2:modifier catgory list        L3:   Middle Pannel catgory     		
                _t++;  TWeb.List_L0("Number of required odifier's categories ", "css", "[class='v-input--radio-group__input']", "no_jira");
		
               // System.out.println ("Number of Modifier's categories " +L2.size()); 
               // System.out.println ("Number of required Modifier's categories " +L0.size()); 
                
               
                JavascriptExecutor js = (JavascriptExecutor) d1;                 
                for (int i=0; i<L2.size();i++){                    
                    _t++; TWeb.Element_Child_Text("Modifier Category " + i + " name ",L2.get(i), "css", "[class='pa-0 col']", "no_jira");
                      //  System.out.println (t);
                    _t++; TWeb.Element_Child_Text("Modifier Category " + i + " options ",L2.get(i), "css", "[class='pa-0 text-capitalize col']", "no_jira");
                      //  System.out.println (t);
                    _t++; TWeb.Element_Child_Text("Modifier Category " + i + " Required/Optional",L2.get(i), "css", "[class='pa-0 text-right col']", "no_jira");
                      //  System.out.println (t); 
                      String req = t.substring(0, t.indexOf( ' ' ) ) ;
                    if (t.toLowerCase().contains("required")){
                        List<WebElement> radios = L0.get(i).findElements(By.cssSelector("[type='radio']"));
                        for (WebElement radio :radios){
                            js.executeScript("arguments[0].click();",radio );
                        }                        
                    }
                }
                _t++; TWeb.Element_By_Path_Click("Click 'add to basket' button " , "xpath","//button[contains(@class,'add-to-cart v-btn')]", "no_jira");
            }
            
            
            
            _t++; TWeb.Element_By_Path_Click("Click CHECKOUT Button", "xpath", "//p[text()='Checkout']", "no_jira");
            _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");
            Thread.sleep(3000); 
            _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");       
//
            



            String Time_Droplist ;// = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getAttribute("id");
//            Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getCssValue("readonly");
//            Time_Droplist = d1.findElement(By.cssSelector("[placeholder='Select Delivery Time']")).getCssValue("disabled");
            
            
            
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

//_t++; TWeb.Element_By_Path_Attribute("Verify Time droplist","css", "[placeholder='Select Delivery Time']","disabled", "no_jira");
             //= t;
//            System.out.println(" Time droplist disable =   "+t+"-------------------------"+Time_Droplist);
//            _t++; TWeb.Element_By_Path_Attribute("Verify location droplist","css", "[placeholder='Select Delivery Location']","disabled", "no_jira");
//            String Locatio_Droplist = t;
//            System.out.println(" Location droplist disable =   "+t + "==================="+Locatio_Droplist);
 //           if (("true".equalsIgnoreCase(Locatio_Droplist.trim())||"true".equalsIgnoreCase(Time_Droplist.trim()))){
                
                
           // }
//            _t++; TWeb.Refresh("Refresh Page", "no-jira");
//            _t++; TWeb.Wait_For_Element_By_Path_Presence("Wait for checkout screen", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");            
//            _t++; TWeb.Element_By_Path_Click("Click 'PROCEED TO CHECKOUT' BUTTON", "xpath", "//p[text()='Proceed to Checkout']", "no_jira");   
//            
            
            
            
            
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
            Thread.sleep( 300000);
        }
        }
    
                
                
                 
                 
//=========================test code ==================================================================                    
                //  _t++; TWeb.Element_Child_Text("Modifier Category name",L2.get(0), "css", "[class='pa-0 col']", "no_jira");
                //System.out.println (L0.get(0).findElements(By.cssSelector("[role='radio']")).size()); 
                
//                int num = d1.findElements(By.cssSelector("[role='radio']")).size();
//                System.out.println(num);
//                num = d1.findElements(By.cssSelector("[class='pa-0 col']")).size();
//                 System.out.println(num);
                 
                 
//                e=d1.findElement(By.cssSelector("[role='document']"));
//               // TWeb.Element_By_Path_Text(cat, t, cat, url);
//                
//                _t++; TWeb.Element_E1_Find("Switch to modal","css" , "[role='document']", "no_jira");
//                num = e1.findElements(By.cssSelector("[class='v-input__slot']")).size();
//                
//              //  e1.findElements(By.cssSelector("[class='v-input__slot']")).get(1).click();
//                
//                System.out.println(num);
//                  System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
//                  
//                  
//                  JavascriptExecutor js = (JavascriptExecutor) d1;
//               
//                  num = e1.findElements(By.cssSelector("[class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light']")).size();
//                    System.out.println(num);
//                  WebElement  element_checkbox =  e1.findElements(By.cssSelector("[class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light']")).get(0);
//                  System.out.println(element_checkbox.getAttribute("class"));
//                  System.out.println(element_checkbox.getAttribute("style"));
//                  js.executeScript("arguments[0].click();",element_checkbox );
//                  js.executeScript("arguments[0].click();",e1.findElements(By.cssSelector("[role='checkbox']")).get(0) );
//                 
//                  js.executeScript("arguments[0].click();",e1.findElements(By.cssSelector("[role='radio']")).get(0) );
//                  
//                  
//                  
//                   js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element_checkbox,"class","v-icon notranslate mdi mdi-checkbox-marked theme--light");
//                   js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element_checkbox,"style","color: var(--v-turquoise-base); caret-color: var(--v-turquoise-base);");
//              //    js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element_checkbox,"checked","true");
//                  //js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element_checkbox,"checked","checked");
//                    js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",element_checkbox ,"aria-checked","true");
//                   js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element_checkbox,"value","true");
//                   
//                   boolean TRUE = true;
//                   js.executeScript("arguments[0].click();",element_checkbox );
//                  js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e1.findElements(By.cssSelector("[role='checkbox']")).get(0),"value",true);
//                  js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e1.findElements(By.cssSelector("[role='checkbox']")).get(0),"aria-checked",true);
//                  System.out.println(e1.findElements(By.cssSelector("[role='checkbox']")).get(0).getAttribute(":checked"));
//                  js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e1.findElements(By.cssSelector("[role='checkbox']")).get(0),":checked", true);
//                
//                   
//                   System.out.println(element_checkbox.getAttribute("class"));
//                  System.out.println(element_checkbox.getAttribute("style"));
//                  
//                  //element_checkbox.click();
////d1. findElements(By.xpath("(//input[@role='checkbox']")).get(3).click(); 
//                 //d1. findElement(By.xpath("(//input[@role='checkbox']/following-sibling::div)[2]")).click();
//                for (int i=0;i<num;i++){
//                   System.out.println("i= "+i);
//                   System.out.println( e1.findElements(By.cssSelector("[role='checkbox']")).get(i).getAttribute("aria-checked"));
//                   js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e1.findElements(By.cssSelector("[role='checkbox']")).get(i),"aria-checked","true");
//                   js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e1.findElements(By.cssSelector("[role='checkbox']")).get(i),"value","true");
//                   
//                 //  e1.findElements(By.cssSelector("[role='checkbox']")).get(i).click()
//                           ;
//                }
//                ////*[@id="app"]/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div/div[3]
//                 System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
//                
//                
//                TWeb.Element_Child_E2("find category", e1, "xpath", "//div[@class='pa-0 col']", "no_jira");
//                  // System.out.println(e2.);
//                
//                
//                
//                if (FAIL) {return ;}
                    
                    
                    
                    
//                addItemToBasket(e1);
                
                

                  
            
        
    //Pickup Order work flow
        else{     
            if (!PICKUP){
                _t++; EX += _t + "\t" + "Pickup  service is not available for "+SITE+"/"+BRAND + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
              return;
                     
            }
            
            
            
            
        }
            
        
    }  
     public static void addItemToBasket(WebElement ItemModal ) {
        
//         
//         _t++; 
//         
//         if(ItemModal.findElement(By.xpath("//button[contains(@class,'add-to-cart v-btn')]")).isEnabled()){
//             TWeb.Element_Child_Click("Add item to basket", ItemModal, "xpath", "//button[contains(@class,'add-to-cart v-btn')]", "no-jira");
//             
//             return;
//             //ItemModal.findElement(By.xpath("//button[contains(@class,'add-to-cart v-btn')]")).click();
//         };
//         
//         System.out.println(ItemModal.findElements(By.xpath("//div[@class='pa-0 col']")).size());
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
//         _t++;  System.out.println(ItemModal.findElements(By.cssSelector("[role='radiogroup']")).size());
//         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
//         
//        System.out.println(
//            ItemModal.findElements(By.cssSelector("[role='radiogroup']")).get(0).findElements(By.cssSelector("[class='v-input--selection-controls__input']")).size());
//              
//        //ItemModal.findElements(By.cssSelector("[role='radiogroup']")).get(0).findElements(By.cssSelector("[class='v-input--selection-controls__input']")).get(1).sendKeys(Keys.SPACE);
//       
//        
//        int radiosize = ItemModal.findElements(By.cssSelector("[role='radio']")).size();
//         System.out.println("@@@@@@@@@@@@@@"+radiosize);
//         System.out.println(ItemModal.findElements(By.cssSelector("[role='radio']")).get(0).isSelected());
//                             // ItemModal.findElements(By.cssSelector("[role='radio']")).get(0).click();
//                             // ItemModal.findElements(By.cssSelector("[role='radio']")).get(0).sendKeys(Keys.SPACE);
//
//        System.out.println( 
//            ItemModal.findElements(By.cssSelector("[role='radiogroup']")).get(1).findElements(By.cssSelector("[class='v-input--selection-controls__input']")).get(1).getAttribute("id"));
//         
//                
//                
//                
//                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
//          
//          
//          
//          
//          
//          
//          
//          
//         _t++; TWeb.Element_Child_List_L2("List Modifiers Category", e1, "css", "//div[@class='pa-0 col']", "no-jira");
//         System.out.println("*********"+L2.size()+"************");
//         
//         for(WebElement we1:L2){
//             System.out.println(we1.getText());
//             _t++;  TWeb.Element_Child_Text("Find REQUIRED items", we1, "xpath", "//div[contains(@class,'pa-0 text-right')]", "no-jira");
//             //if (t.equalsIgnoreCase("optional")){
//               //  continue;
//            // }
//             
//        //     we1.findElements(By.xpath("//div[@class='v-input--selection-controls__ripple']")).get(0).click();
//             
//             
//             
//             
//             
//         }
//         //_t++; TWeb.Element_E2_Find(app, t, app, url);
////        while (!ItemModal.findElement(By.xpath("//button[contains(@class,'add-to-cart v-btn')]")).isEnabled()) {
////             TWeb.Element_Child_List_L2("Find REQUIRED items", ItemModal, "xpath", "//div[contains(@class,'pa-0 text-right')]", "no-jira");
////             for(WebElement we1:L2){
////                 if (we1.getText().equalsIgnoreCase("optional")){
////                     continue;
////                 }
////                 
//             
//             
////             }
//             
//             
//             
//             
//             
//                 
//             
//             
//        
//         //System.out.println(isAvailable);
//
////xpath("//button[contains(@class,'add-to-cart v-btn')]"
//// if () {}<button data-v-3e64e7ba="" type="button" disabled="disabled" class="add-to-cart v-btn v-btn--contained v-btn--disabled v-btn--tile theme--light v-size--default" style="height: 5em; width: 100%;"><span class="v-btn__content"> Selection Required </span></button>
//        
//         //while ()
             
         
     }
}
