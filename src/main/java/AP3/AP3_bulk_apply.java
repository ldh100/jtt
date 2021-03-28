package AP3;

import A.TWeb;

import static A.A.*;
import static AP3.AP3.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

public class AP3_bulk_apply {
    public static void run() throws InterruptedException {

        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Local Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID+"/brands/"+BrandID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        //Bulk Apply Start       
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click > First Category", L0.get(0), "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        
        //get orginal price values
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Store Data >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Get Category Label", L0.get(0), "xpath", "//span/div","no_jira");
        if (FAIL) { return;}
        String Category = t;
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("First Items Set Label", "xpath", "(//div[contains(@class,'flex xs12 list-item no-icon active')])[1]//span/div[1]", "no_jira");
        if (FAIL) { return;}
        String IS = t;
        String[] List_of_Item_Prices_Before_Change = new String[L1.size()];
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_Text("Original Price of item " + String.valueOf(i+1), L1.get(i),"xpath", "//td[5]", "no_jira");
            if (FAIL) { return;}
            List_of_Item_Prices_Before_Change[i] = t;
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Select, Click Update, Verify Bulk Apply Side Panel">  
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Bulk Select, Click Update, Verify Bulk Apply Side Panel >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        //Open Bulk Apply Side Panel for all items and verify side panel
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Side Panel", "xpath", "//aside[@id='bulkupdatepaneldrawer']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Update "+L1.size()+" Items header", "xpath", "//div[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Price Container", "xpath", "(//div[contains(@class,'v-card__title')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Stock Container", "xpath", "(//div[contains(@class,'v-card__title')])[6]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("In-App Visibility", "xpath", "(//div[contains(@class,'v-card__title')])[7]", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        //change price
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Local Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Bulk Change Prices in Local Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Invalid Price Value", "xpath", "//input[@placeholder='Price ($)']", "aa", false,"no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Get Default Price", "xpath", "//input[@placeholder='Price ($)']", "value", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[@placeholder='Price ($)']", "500", false,"no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Get New Price", "xpath", "//input[@placeholder='Price ($)']", "value", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + i+1,"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'5')]", "no_jira");
            if (FAIL) { return;}
            //List_of_Item_Prices_After_Change[i] = t;
        }
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Publish " + Category, "xpath", "//div[contains(text(),'publish')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Check Global Menu Prices">  
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Check Global Menu Prices >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Open_Switch_to_2nd_Tab("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category " + Category, "xpath", "//div[contains(text(),'"+Category+"')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Item Set " + IS, "xpath", "//div[contains(text(),'"+IS+"')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        for (int i = 0; i < L1.size(); i++){
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Updated Price of item " + i+1,"xpath", "//table[contains(@class,'v-table')]//tbody/tr["+String.valueOf(i+1)+"]/td[contains(text(),'"+List_of_Item_Prices_Before_Change[i]+"')]", "no_jira");
            if (FAIL) { return;}
            //List_of_Item_Prices_After_Change[i] = t;
        }
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Bulk Change Prices in Global Menu >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("List of Categories", "xpath", "//div[contains(@class,'flex xs12 list-item list-item-large')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Category", "xpath", "//div[contains(text(),'Flame Grilled Pitas')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.List_L1("List of Items", "xpath", "//table[contains(@class,'v-table')]//tbody/tr", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Select Bulk Apply Checkbox", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Update "+L1.size()+" Items", "xpath", "//span[contains(text(),'Update "+String.valueOf(L1.size())+" Items')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Valid Price Value", "xpath", "//input[@placeholder='Price ($)']", "500", false,"no_jira");
        if (FAIL) { return;}      
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Bulk Change Prices in Global Menu">  
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " == Bulk Update Global Modifiers >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; TWeb.Move_to_Element_By_Path("Move to Edit Mod Groups Section", "xpath", "//div[text()='Edit Mod Groups in Your Item Selection']", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_E1_Find("Find Modifier Group Input", "xpath", "//input[@placeholder='Pita Options Modifier']", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_E1_Find("Find Label in App Input", "xpath", "//input[@placeholder='Pita Options']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Modifier Group", "xpath", "(//i[contains(@class,'v-icon mdi mdi-checkbox-blank-outline theme--light')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.List_L3("Modifier Options", "xpath", "//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_Child_Click("Remove Third Mod Option", L3.get(2), "xpath", "//i[contains(@class,'mdi-delete')]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.List_L3("Modifier Options", "xpath", "//div[contains(@class,'v-text-field--placeholder')]/ancestor::div[contains(@class,'align-center modifier')]", "no_jira");
        if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Click("Click > Save Mod Changes", "xpath", "//div[text(),'Save Modifiers Changes']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Apply Changes", "xpath", "//div[contains(text(),'Apply Changes')]", "no_jira");
        if (FAIL) { return;}
        
        for (int i = 0; i < L1.size(); i++) {
            _t++; TWeb.Element_Child_Click("Click > Item " + i+1, L1.get(i), "xpath", "//div[contains(text(),'"+String.valueOf(i+1)+"')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click on Modifier", "xpath", "//span[text(),'Pita Options Modifier']", "no_jira");
            if (FAIL) { return;}
            _t++; TWeb.List_L0("List of Modifier Options", "xpath", "//div[contains(@class,'layout modifier')]", "no_jira");
            if (FAIL) { return;}
            _t++; compareListSizes("", L3, L0, L3.size()>L0.size(), "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click Cancel", "xpath", "//span[text(),'Pita Options Modifier']", "no_jira");
            if (FAIL) { return;}
        }
        
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
    }
    
    // Comparison eg. LIST1.size() ==/>/< LIST2.size()
    private static void compareListSizes(String NAME, List<WebElement> LIST1, List<WebElement> LIST2, Boolean comparison, String JIRA) {
        FAIL = false;
        try {
            if(comparison) {
                if(LIST1.size() > LIST2.size()) {
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " > " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                    "\t" + "===" + "\t" + JIRA + "\r\n";    
                } else if (LIST1.size() < LIST2.size()) {
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " < " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                "   \t" + "===" + "\t" + JIRA + "\r\n"; 
                } else if (LIST1.size() == LIST2.size()) {
                   _p++; 
                    EX += _t + "\t" + NAME + "\t" + LIST1 + " = " + LIST2 + "\t" + "List size comparison successful" + "\t" + "PASS" + "\t" + "===" +
                "   \t" + "===" + "\t" + JIRA + "\r\n";  
                }                   
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + LIST1+ " " +LIST2+ "\t" + "Lists Size Comparison Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + "===" + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
    }
}
