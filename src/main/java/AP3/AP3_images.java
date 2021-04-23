/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import static A.A.*;
import A.TWeb;
import static AP3.AP3.*;

/**
 *
 * @author astrit.ademi
 */
public class AP3_images {

    public static void run() throws InterruptedException {
    
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'No'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'No'" + "\t" + " == Toggle Allow Images to 'No' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'No'
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Images' > 'No'", "xpath", "//div[contains(text(),'No')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'No' is Selected", "xpath", "//div[contains(text(),'Yes')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' toggle is Disabled", "xpath", "//div[contains(@class,'Toggle-Disabled')]", "no_jira");
        if (FAIL) { return;}
        //navigate to global menu and check that images cannot be added
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_InVisibility("Check > Upload image area is exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold> 
        
        // <editor-fold defaultstate="collapsed" desc="Toggle Allow Images to 'Yes'"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Toggle Allow Images to 'Yes'" + "\t" + " == Toggle Allow Images to 'Yes' >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Group Management List Page", url + "#/sectors/" + SectorID, "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > Edit Global menu on 'Starbucks' Brand", "xpath", "//*[text()='Starbucks']/ancestor::tr//button", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Edit Global Menu Brand Name' dialog is open", "xpath", "//div[contains(text(),'Allow Images in Global Menu')]", "no_jira");
        if (FAIL) { return;}
        //toggle 'Allow Images' to 'No'
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Images' > 'Yes'", "xpath", "//div[contains(text(),'Yes')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Yes' is Selected", "xpath", "//div[contains(text(),'No')]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save'", "xpath", "(//div[contains(text(),'Save')])[2]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        //navigate to the sites -> brand -> settings
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Site -> Brand Configuration", url + "#/sites/" + appId + "/site/" + SiteID + "/brand/" + BrandID + "/settings", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Navigated to Brand Configuration", "xpath", "//div[contains(text(),'Station Information')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Scroll_to_WebElement("Scroll to 'Menu Information' Section", "xpath", "//div[@id='toc-menu-info']", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Toggle 'Allow Local Menu Images' > 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'Yes')])[5]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > 'Allow Local Menu Images' Toggled to 'Yes'", "xpath", "(//div[@id='toc-menu-info']//div[contains(text(),'No')])[5]/parent::div[contains(@class,'Not-Selected')]", "no_jira");
        if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'Save Changes'", "xpath", "//div[contains(text(),'Save Changes')]", "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="Add an Image to Global Menu Item"> 
        EX += " - " + "\t" + " === " + "\t" + " ===== Add an Image to Global Menu Item" + "\t" + " == Add an Image to Global Menu Item >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/"+SectorID+"/company/"+CompanyID, "no_jira");
        if (FAIL) { return;}
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Category", "xpath", "(//div[contains(@class,'flex xs12 list-item list-item-large')])[1]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(2000);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", "no_jira"); 
        if (FAIL) { return;} 
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Check > Upload image area is exists", "xpath", "//canvas", "no_jira");
        if (FAIL) { return;}
        EX += " - " + "\t" + " === " + "\t" + " ===== " + "\t" + " ==  >>" + "\t" + " - " + "\t" + " - " + "\t" + " -" + "\t" + " - " + "\r\n";
    }
}
