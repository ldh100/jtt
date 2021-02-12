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
import static org.openqa.selenium.By.xpath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
/**
 *
 * @author Oleg.Spozito
 */
public class WO_place_order {
    public static void run(boolean ISDELIVERYORDER) throws InterruptedException { 
    //delivery order work flow
        if (ISDELIVERYORDER){
            if (!DELIVERY) {
            _t++; EX += _t + "\t" + "Delivery service is not available for "+SITE + "\t" + " ===== " + "\t" + "Jump out Delivery order" + "\t" + " PASS " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
              return;
            }
            _t++; TWeb.Element_By_Path_Click("Enter Selected Pickup Brand:   "+ BRAND ,"xpath", "//strong[text()=' "+BRAND+" ']",  "no_jira"); 
        //Menu screen
            _t++; TWeb.List_L2("Menu Category count ", "css", "[role='tab']", "no_jira");
           
            for ( WebElement we : L2){          //(int i=0; i< L2.size()  ; i++){
                _t++; TWeb.Element_Text("Menu Category : ", we ,  "no_jira");
                _t++; TWeb.Element_Click("Click Category",we , "no_jira");
                
            }
            _t++; TWeb.List_L3("Menu Category in the middle pannel  ", "xpath", "//div[@class='pb-6']", "no-jira");
          //  TWeb.Element_Child_List_L1("items under category",L2, "css","[class='row mb-5 bold no-gutters']", "no_jira");
            for(WebElement we: L3) {
               // _t++; TWeb.Element_By_Path_Text("Category Name:+++++++++  ", "xpath", "//div[@class='pb-6']//h2", "no_jira");
                //_t++;
                String cat = we.findElement(By.cssSelector("[class='pb-4']")).getText();
                System.out.println("----------------------------");
                System.out.println(cat);
                _t++; TWeb.Element_Child_Text("Category Name:  ", we, "css"  , "[class='pb-4']", "no_jira");
                
                _t++; TWeb.Element_Child_List_L1("Items count in Category --- ",we, "css","[class='row mb-5 bold no-gutters']", "no_jira");
                System.out.println ("first item in the catgory " +we.getText());
                _t++; TWeb.Element_Text("First item ",L1.get(0),"no_jira");
                _t++; TWeb.Element_Click("Click to open first item modal --- "+L1.get(0).getText(),L1.get(0) , "no_jira");
            //switch to opened modal
                _t++; TWeb.Element_E1_Find("Switch to modal","css" , "[role='document']", "no_jira");
                    if (FAIL) { return;}  
                    
                    
		
//=========================test code ==================================================================                    
                
                
                int num = d1.findElements(By.cssSelector("[role='radio']")).size();
                System.out.println(num);
                num = d1.findElements(By.cssSelector("[class='pa-0 col']")).size();
                 System.out.println(num);
                 
                 
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
                if (FAIL) {return ;}
                    
                    
                    
                    
                addItemToBasket(e1);
                
                
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
