/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;
import A.T;
import static A.A.*;
import static AP3.AP3.*;
/**
 *
 * @author Oleg.Spozito
 */
public class __brand {
    public static void run() throws InterruptedException { 
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Drawer > Dashboard Click", "xpath", "//*[contains(text(), 'Dashboard')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Move_to_Visible_Element("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); T.Clickable_Element_By_Path_Click("Drawer > Sites Click", "xpath", "//*[contains(text(), 'Sites')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); T.Move_out_of_Visible_Element("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500); 
                       
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Page_URL("Sites page URL", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("User default App", "xpath", "//div[contains(@class, 'v-select__selection v-select__selection--comma')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++;  T.Element_By_Path_Click("Open App combobox", "css", "[role='combobox']", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find 'App' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
            if (FAIL) { return;}                                         
        _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Application list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
            if (FAIL) { return;}     
            for (int i = 0; i < L1.size(); i++) {
                _t++; T.Element_Text("Application Name (index " + i + ")", L1.get(i),  "no_jira");         
                if (FAIL) { return;}
                if(t.contains("All")){ T_Index = i; }
        }
        _t++; Thread.sleep((long) sleep); T.Element_Click("Select 'All'", L1.get(T_Index), "no_jira");
            if (FAIL) { return;} 
 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Search Prompt", "xpath", "//*[contains(text(), 'Search Sites')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", "Not Existing Site", false, "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Not Found' notification", "No matching records found", true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Site Search Clear", "xpath", "//input[contains(@aria-label, 'Search ')]",  "no_jira"); 
            if (FAIL) { return;}            
        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Search Site Name", "css", "[aria-label='Search Sites']", SITE, false, "no_jira");
            if (FAIL) { return;}   
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Data Rows Count", "tagName", "tr", "no_jira");             
            if (FAIL) { return;}
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Text("Sites Data Row Text", L0.get(i), "no_jira");             
                if (FAIL) { return;}
            } 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Site' Name", "xpath", "//td[text()='" + SITE + "']", "no_jira"); 
            if (FAIL) { return;}                                                                                               
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//div[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//div[contains(@class, 'timezone-address')]", "no_jira"); 
                if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Address text", "xpath", "//div[contains(@class, 'timezone-address')][1]", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Timezone text", "xpath", "//div[contains(@class, 'timezone-address')][2]", "no_jira"); 
            if (FAIL) { return;}   
            if(!"empty".equals(t) && t.contains(" ")) {
                TZone = t.substring(t.indexOf(" ")).trim();// ===================================
            } else{
                TZone = "NotFound";
            }
            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site 'Station List' text", "xpath", "//div[contains(@class, 'H6-Selected')]", "no_jira");
            if (FAIL) { return;}  
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Site Configuration", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;}     
        _t++; Thread.sleep((long) sleep); T.List_L0("Sites Unit(s) Count", "xpath", "//div[contains(@class, 'v-card-custom v-card v-sheet theme--light')]", "no_jira");             
            if (FAIL) { return;}
        int SITE_LIST_COL_COUNT = 0;    
            for (int i = 0; i < L0.size(); i++) {
                _t++; T.Element_Child_Attribute("Brand Name", L0.get(i), "xpath", ".//h3[contains(@class, 'brand-name')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; T.Element_Child_Attribute("Brand Unit", L0.get(i), "xpath", ".//h4[contains(@class, 'Brand-Unit')]", "textContent", "no_jira");   
                    if (FAIL) { return;}
                _t++; T.Element_Child_List_L1("Unit Stations Count", L0.get(i), "tagName", "tr", "no_jira");             
                    if (FAIL) { return;}
                for (int j = 2; j < L1.size(); j++) {  
                    _t++; T.List_TR_TDs("Station " + (j - 1), L1, j, "no_jira");      
                        if (FAIL) { continue;}
                    if(t.trim().startsWith(BRAND)){
                        T_Index = j;
                        _t++; T.Element_Child_List_L2("Stations List Column Cout", L1.get(j), "tagName", "td", "no_jira"); // remember Brand List wheere BRAND found
                        SITE_LIST_COL_COUNT = L2.size();
                        _t++; T.Element_Child_List_L2("Save Target Stations List", L0.get(i), "tagName", "tr", "no_jira"); // remember Brand List wheere BRAND found
                    }
                }
            }     
        _t++; T.Move_to_Element_By_Path("Scroll to Brand data row", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira");        
            if (FAIL) { return;} 
            
        if(SITE_LIST_COL_COUNT == 5){
            _t++; T.Brand_Status("Get Brand Status in App", L2, T_Index,"no_jira");        
                if (FAIL) { return;}  
                if(t.equals("Hidden in App")){ 
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call /location/group/ API", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true,"no_jira" );
                    _t++; T.API_Body_Contains("Location Group API - find Hidden Brand", BrandID,false, "no_jira");        
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Brand_Status_Click("Status Click to 'Display'",L2, T_Index,"no_jira");  // was L1 ^^^
                        if (FAIL) { return;}
                    Thread.sleep(500); 
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call /location/group/ API", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true,"no_jira" ); 
                    _t++; T.API_Body_Contains("Location Group API - find Displayed Brand", BrandID,true, "no_jira");        
                        if (FAIL) { return;}     
                } else {
                    _t++; Thread.sleep((long) sleep); T.Brand_Status_Click("Status Click to 'Hide'",L2, T_Index,"no_jira");  
                        if (FAIL) { return;} 
                    Thread.sleep(500); 
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call /location/group/ API", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true,"no_jira" );      
                    _t++; T.API_Body_Contains("Location Group API - find Hidden Brand", BrandID,false, "no_jira");        
                        if (FAIL) { return;}   
                    _t++; Thread.sleep((long) sleep); T.Brand_Status_Click("Status Click to 'Display'", L2, T_Index,"no_jira");  
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for update...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call /location/group/ API", BaseAPI + "/location/group/" + SiteID + "?nocache=1", true,"no_jira" );
                    _t++; T.API_Body_Contains("Location Group API - find Displayed Brand", BrandID,true, "no_jira");        
                        if (FAIL) { return;}     
                }
        }            
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Brand Name Click", "xpath", "//td[contains(text(), '" + BRAND + "')]", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); T.Wait_For_Element_By_Path_Presence("Wait for page load...", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Configuration'", "xpath", "//*[contains(text(), 'Configuration')]", "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");                                                                                     
            if (FAIL) { return;}                                                              
        _t++; Thread.sleep((long) sleep); T.List_L0("Brand Configuration Navigation Count", "xpath", "//div[contains(@class, 'SelectedLeft')]", "no_jira");             
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); T.List_L1("Brand Configuration Group Count", "xpath", "//div[starts-with(@id, 'toc-')]", "no_jira");             
            if (FAIL) { return;}  
        
        for (int i = 0; i < L0.size(); i++) { // ========================================================================================
            _t++; T.Element_Attribute("Brand Configuration Navigation >>>>>>", L0.get(i), "textContent", "no_jira");
                if (FAIL) return;
            String CHOICE = t; 
            _t++; Thread.sleep((long) sleep); T.Element_Click("Click '" + CHOICE + "'", L0.get(i), "no_jira"); 
                if (FAIL) return;
                Thread.sleep(1000);
            switch (CHOICE) { 
                case "Station Information":   
                    _t++; T.Element_By_Path_Attribute(" = Phone Preview Image", "tagName", "img", "src",  "no_jira");
                        if (FAIL) { return;}
                    _t++; T.Element_By_Path_Attribute(" = Phone Preview Brand Name", "xpath", "//span[contains(@class,'H5-Black-High-Emphasis-Left')]", "textContent",  "no_jira");
                        if (FAIL) { return;}
                    _t++;   T.Element_By_Path_Attribute(" = Phone Preview Location", "xpath", "//span[contains(@class,'H6-Black-Medium-Emphasis-Left')]", "textContent",  "no_jira");
                        if (FAIL) { return;}
                    break;
                case "Fee Setup":       
                    _t++; T.Find_Text("Find 'Enable Fee' text", "Enable Fee", true,"no_jira");
                        if (FAIL) { return; }
                    _t++; T.Find_Text("Find 'Service Fee' text", "Service Fee", true,"no_jira");
                        if (FAIL) { return; }
                    _t++; T.Find_Text("Find 'Delivery Fee' text", "Delivery Fee", true,"no_jira"); 
                        if (FAIL) { return; }
                    break; 
                case "Pickup Details":         // Service / Pickup
                    _t++; T.Text_Found("Is Pickup Enabled?", "Pickup is not enabled", "no_jira");
                    if(t.equals("Not Found")){                    
                        _t++; T.Find_Text("Find 'Timeslot Length' text", "Timeslot Length", true,"no_jira");
                        if (FAIL) { return; }
                        _t++; T.Find_Text("Find 'Avg Prep time' text", "Average Prep Time", true,"no_jira");
                            if (FAIL) { return; }
                        _t++; T.Find_Text("Find 'Cust per Slot' text", "Customers Per Slot", true,"no_jira");
                            if (FAIL) { return; }
                        _t++; T.Find_Text("Find 'ASAP pickup' text", "ASAP Pickup", true,"no_jira");
                            if (FAIL) { return; }
                        _t++; T.Element_By_Path_Attribute("Find 'DISABLE' text", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", "textContent", "no_jira");
                            if (FAIL) { return; }                                                             
//                        _t++; T.Element_By_Path_Click("Click 'DISABLE'", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", "no_jira");
//                            if (!FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'CANCEL'", "xpath", "//*[contains(text(), 'cancel')]", "no_jira");
//                            if (FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Save..'", "xpath", "//*[contains(text(), 'save')]", "no_jira");
//                            if (FAIL) { return; }
//                        _t++; T.Clickable_Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'cancel')]","no_jira");
//                            if (FAIL) { return;}    
                    } else {
                        _t++; Thread.sleep((long) sleep); T.Call_API("Call '/location/brand/' API", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true,"no_jira" );
                        _t++; T.Brand_API_Is("Brand API Pickup Supported", "pickup_supported", false, "no_jira" );
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find '...enable Pickup' text", "to enable Pickup", true,"no_jira");
                            if (FAIL) { return; }
                    }
                    break;
                case "Delivery Details":       
                    _t++; T.Text_Found("Is Delivery Enabled?", "Delivery is not enabled", "no_jira");
                    if(t.equals("Not Found")){
                        _t++; Thread.sleep((long) sleep); T.Call_API("Call '/location/brand/' API", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true,"no_jira" );
                        _t++; T.Brand_API_Is("Brand API Delivery Supported", "delivery_supported", true, "no_jira" );
                        if("DH".equals(platform)){
                            _t++; T.Find_Text("Find 'Timeslot Type' text", "Timeslot Type", true,"no_jira");
                        }else{
                            _t++;
                            _p++;
                            EX += _t + "\t" + " === " + platform + " Site: " + SITE + "\t" + "Brand: " + BRAND + "\t" + "No 'Delivery Timeslot Type' feature" + "\t" + "PASS" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";                            
                        }
                            
                        _t++;  T.Find_Text("Find 'Avg Prep Time' text", "Average Prep Time", true,"no_jira");
                            if (FAIL) { return; }
                        _t++; T.Find_Text("Find 'Cust per Slot' text", "Customers Per Slot", true,"no_jira");
                            if (FAIL) { return; } 
                        _t++; T.Find_Text("Find 'Timeslots as...' text", "Display timeslots as one time", true,"no_jira");
                            if (FAIL) { return; }
                        _t++; T.Find_Text("Find 'Del instruction' text", "Allow delivery instruction?", true,"no_jira");
                            if (FAIL) { return; }
                        
                        _t++; T.Find_Text("Find 'Manage Delivery locations' text", "Manage Drop-off Locations", true,"no_jira");
                            if (FAIL) { return; }
//                        _t++; T.Element_By_Path_Click("Click 'Manage Drop-off Locations'", "xpath", "//*[contains(text(), 'Manage Drop-off Locations')]", "no_jira");
//                            if (!FAIL) { return; }
//                        // list ???    
//                        _t++; T.Clickable_Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'cancel')]","no_jira");
//                            if (FAIL) { return;}

                        _t++; T.Element_By_Path_Attribute("Find 'DISABLE' text", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", "textContent", "no_jira");
                            if (FAIL) { return; }                                                             // old > 'v-icon mdi mdi-delete-outline theme--light'
//                        _t++; T.Element_By_Path_Click("Click 'DISABLE'", "xpath", "//i[contains(@class, 'v-icon icon mdi mdi-cellphone-off theme--light')]/parent::div", "no_jira");
//                            if (!FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'CANCEL'", "xpath", "//*[contains(text(), 'cancel')]", "no_jira");
//                            if (FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Save..'", "xpath", "//*[contains(text(), 'save')]", "no_jira");
//                            if (FAIL) { return; }
//                        _t++; T.Clickable_Element_By_Path_Click("Click 'Cancel'", "xpath", "//*[contains(text(), 'cancel')]","no_jira");
                            if (FAIL) { return;}
                    } else {
                        _t++; Thread.sleep((long) sleep); T.Call_API("Call '/location/brand/' API", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true,"no_jira" );
                        _t++; T.Brand_API_Is("Brand API Delivery Supported", "delivery_supported", false, "no_jira" );
                        _t++; Thread.sleep((long) sleep); T.Find_Text("Find '...setup delivery' text", "to setup delivery", true,"no_jira");
                            if (FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.List_Child_E1_By_Path("Find 'Yes' button", L1, i, "xpath", ".//div[contains(@class, 'Option-Left-Not-Selected-Blue-White')]", "no_jira");
//                            if (FAIL) { return; }
//                        _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Yes' button", e1, "no_jira");
//                        if (FAIL) { return; }
                    }
                    break;
                case "Scan & Go Setup":   
                        break;
                case "Assign Menus":          
                        break;
                case "Integration Type": 
                    break;
                case "Third Party Integration":
                    break;
                case "Menu Information":
                    break;
                case "Payment ID":  
                    break;
                case "Meal Plan":
                    break;
                case "Loyalty Program":  
                    break;
                case "Payment Method Exclusion":        // Payment Method Exclusion   
                    break;
                case "Web Ordering":  
                    _t++; Thread.sleep((long) sleep); T.Element_E1_Find("Find Web Ordering", "id", "web-order", "no_jira"); 
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Element_Child_List_L1("Find 'Allow Web Ordering' options", e1,"xpath", ".//div[contains(@class, 'Option-Left')]", "no_jira");             
                        if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_Click("Click 'Allow Web Ordering' - Yes", L1.get(0), "no_jira");
                        if (FAIL) { return;}                   
                    break;
                default:
                break;
            }
        }
//        _t++; T.Clickable_Element_By_Path_Click("Click 'Save Changes'", "xpath", "//*[contains(text(), 'Save Changes')]","no_jira");
//            if (FAIL) { return;}
//        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
//            if (FAIL) { return;}                                                          

        _t++; Thread.sleep((long) sleep); T.Navigate_Back("Navigate Back", "Brand Configuration","Brand Site", "no_jira");
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
         Thread.sleep(1000);
        _t++; Thread.sleep((long) sleep); T.Text_Found("Find 'Leave...' question", "Leave without saving?", "no_jira"); 
        if ("Found".equals(t)) {    // Leave asked om CDL Site and not on DH Site (!?)      
            _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Leave...' note", "Changes will be lost if you do not save.", true,"no_jira"); 
                if (FAIL) { return; }   
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'CANCEL'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light grey--text')]", "no_jira"); 
                if (FAIL) { return; }         
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'LEAVE'", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", "no_jira"); 
                if (FAIL) { return; }     
            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'LEAVE' Click", "xpath", "//button[contains(@class, 'v-btn v-btn--flat theme--light primary--text')][1]", "no_jira"); 
                if (FAIL) { return;}  
        } 
        // ^^^ Click 'SAVE'ed >>> leaves /settings and goes to /schedule >>>
        _t++; Thread.sleep((long) sleep); T.List_L0("Tabs Count", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
            if (FAIL) { return;} 
        for (int i = 0; i < L0.size(); i++) {        
            _t++; T.Element_Text("Brand Setup Tab >>>>", L0.get(i), "no_jira");
            Tab_Name = t;
            if (Tab_Name.toLowerCase().contains("menu")) { // Menu > Menu Scheduler
                _t++; Thread.sleep((long) sleep); T.Page_URL("Schedules page URL", "no_jira"); 
                    if (FAIL) { return;}   
                if (platform.startsWith("DH")){
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Menu > Unable.. for DH", "Unable", true,"no_jira"); 
                    //if (FAIL) { return; }
                } else {
                    _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Schedule your...'", "Schedule Your Menus", true, "no_jira"); 
                    if(t.equals("Not Found")) { 
                        _t++;
                        _w++;
                        EX += _t + "\t" + " === " + platform + " Site: " + SITE + "\t" + "Brand: " + BRAND + "\t" + "Unable to schedule menus for " + platform + " locations" + "\t" + "WARN" + "\t" + " - " + "\t" + "Expected enabled" + "\r\n";                            
                    } else{
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Schedule menu' button", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                            if (FAIL) return;   
                         _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Menu Search Clear", "xpath", "//input[contains(@repeatlabel, 'Search ')]",  "no_jira"); 
                            if (FAIL) { return;}            
                        _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Menu Name", "css", "[repeatlabel='Search Menus in " + BRAND + "']", "xxx_yyy", false, "no_jira");
                            if (FAIL) { return;}   
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'Not Found' notification", "tagName", "td", "no_jira");
                            if (FAIL) { return; }
                        _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Clear Search 'X' Click", "xpath", "//i[contains(@class, 'v-icon v-icon--link mdi mdi-close theme--light')]", "no_jira"); 
                            if (FAIL) { return;}
                        _t++; Thread.sleep((long) sleep); T.List_L1("Menus Count", "tagName", "tr", "no_jira");             
                            if (FAIL) { return;} 
                            for (int j = 0; j < L1.size(); j++) {
                                _t++; T.Element_Text("Menu Data Row Text", L1.get(j), "no_jira");             
                                    if (FAIL) { return;}
                            }
                        _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                            if (FAIL) { return;}
                        Thread.sleep(1000);  
                    }
                }
            } else if (Tab_Name.toLowerCase().contains("service")) { 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Page_URL("Pickup page URL", "no_jira"); 
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); T.List_L1("Service Week Days count", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", "no_jira");             
                    if (FAIL) { return;} 
                if(L1.isEmpty()){ // Pickup is not enabled for this brand
                       _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'not enabled...'", "Pickup is not enabled for this brand", true, "no_jira");                  
                }else{                     
                    for (int j = 0; j < L1.size(); j++) { 
                        _t++; T.Scroll_to_Day("Scroll to Day " + j, L1, j, "no_jira");             
                            if (FAIL) { return;}                        
                        _t++; T.Element_Text("Service Week Day Labels", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        _t++; T.Day_Snedule("Service Week Day Schedule", L1, j, "no_jira");             
                            if (FAIL) { return;}
                    }                    
                    _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                        if (FAIL) { return;}  
                    Thread.sleep(1000);

                    // Check Sunday 24 hours / Closed All Day > uncheck  
                    _t++; T.Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", "no_jira");   
                        if (FAIL) { return;}
                        if("true".equals(t)){
                            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("UnCheck '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                if (FAIL) { return; } 
                        } else {
                           _t++; T.Element_Child_Attribute("Sunday 'Closed All Day' state", L1.get(0), "css", "[aria-label='Closed All Day']", "aria-checked", "no_jira");   
                               if (FAIL) { return;}
                            if("true".equals(t)){  
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("UnCheck 'Closed All Day'", "css", "[aria-label='Closed All Day']", "no_jira"); 
                                if (FAIL) { return; } 
                            } else {
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                   if (FAIL) { return; } 
                                _t++; T.Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", "no_jira");   
                                    if (FAIL) { return;}
                                if("true".equals(t)){
                                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                       if (FAIL) { return; } 
                                }
                            }                  
                        }
                    String hR;
                    String mR;
                    hR = String.format("%02d",(int)(Math.random()*3 + 8));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_From = hR + ":" + mR + "AM";    
                    _t++; Thread.sleep((long) sleep); T.Time_Enter("Enter Sunday Opens Time", L1, 0, "css", "[aria-label='Opens']", New_From,"no_jira");             
                        if (FAIL) { return;}                               // ^^^ Enter Text within 8:00-11:59 AM
                    hR = String.format("%02d",(int)(Math.random()*3 + 1));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_To = hR + ":" + mR + "PM";
                    _t++; Thread.sleep((long) sleep); T.Time_Enter("Enter Sunday Closes Time", L1, 0, "css", "[aria-label^='Closes']", New_To,"no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 1:00-4:59 PM
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Sunday'  - activate 'Save'", "xpath", "//p[text()='Sunday']", "no_jira"); 
                        if (FAIL) { return;}    //  Save not visible after time enter/not selection    - DEBUG                                                                                       

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call '/location/brand/' API", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true,"no_jira" );
                        if (FAIL) { return;}                
                    _t++; Thread.sleep((long) sleep); T.Brand_API_Hours("Brand API - new Service Hours", "Pickup - day 0", New_From, New_To,true, "no_jira");
                        if (FAIL) { return;} // ^^ Check Brand API > Pickup / Delivery / others?                 ^^ "Delivery - day X"
                    // Click Sunday Opens >
                    // Enter Text 11:45 AM
                    // Click Sunday Closes >
                    // Enter Text 3:00 PM 
                    // Save
                    // Check API

                    // =================   Refresh Page after Save and Select Service Tab
                    _t++; Thread.sleep((long) sleep); T.List_L0("Tabs Count - refresh after save", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                            if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.List_L1("Week Days - refresh after save", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", "no_jira");             
                            if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Service Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}        
                    for (int j = 0; j < L1.size(); j++) { 
                        _t++; T.Scroll_to_Day("Scroll to Day " + j, L1, j, "no_jira");             
                            if (FAIL) { return;}                        
                        _t++; T.Element_Text("Service Week Day Labels", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        _t++; T.Day_Snedule("Service Week Day Schedule", L1, j, "no_jira");             
                            if (FAIL) { return;}
                    }  
                    _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                        if (FAIL) { return;}
                    Thread.sleep(1000);    
                }
            } else if (Tab_Name.toLowerCase().contains("delivery")) { 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Page_URL("Delivery page URL", "no_jira"); 
                    if (FAIL) { return;}   
                _t++; Thread.sleep((long) sleep); T.List_L1("Delivery Week Days count", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", "no_jira");             
                    if (FAIL) { return;} 
                if(L1.isEmpty()){ // Delivery is not enabled for this station.
                       _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'not enabled...'", "Delivery is not enabled for this station", true, "no_jira");                  
                }else{                   
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; T.Scroll_to_Day("Scroll to Day " + j, L1, j, "no_jira");             
                            if (FAIL) { return;} 
                        _t++; T.Element_Text("Delivery Week Day Labels", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        _t++; T.Day_Snedule("Delivery Week Day Schedule", L1, j, "no_jira");             
                            if (FAIL) { return;}                           
                    }
                    // ===================================================================================================
                    _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                        if (FAIL) { return;}  
                    Thread.sleep(1000);

                    // Check Sunday 24 hours / Closed All Day > unchek  
                    _t++; T.Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", "no_jira");   
                        if (FAIL) { return;}
                        if("true".equals(t)){
                            _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("UnCheck '24h Service'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                if (FAIL) { return; } 
                        } else {
                           _t++; T.Element_Child_Attribute("Sunday 'Closed All Day' state", L1.get(0), "css", "[aria-label='Closed All Day']", "aria-checked", "no_jira");   
                               if (FAIL) { return;}
                            if("true".equals(t)){  
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("UnCheck 'Closed All Day'", "css", "[aria-label='Closed All Day']", "no_jira"); 
                                if (FAIL) { return; } 
                            } else {
                                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                   if (FAIL) { return; } 
                                _t++; T.Element_Child_Attribute("Sunday '24 Hour Service' state", L1.get(0), "css", "[aria-label='24 Hour Service']", "aria-checked", "no_jira");   
                                    if (FAIL) { return;}
                                if("true".equals(t)){
                                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Check '24h Service' - activate 'Save'", "css", "[aria-label='24 Hour Service']", "no_jira"); 
                                       if (FAIL) { return; } 
                                }
                            }                  
                        }
                    String hR;
                    String mR;
                    hR = String.format("%02d",(int)(Math.random()*3 + 8));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_From = hR + ":" + mR + "AM";    
                    _t++; Thread.sleep((long) sleep); T.Time_Enter("Enter Sunday Delivery Opens Time", L1, 0, "css", "[aria-label='Opens']", New_From,"no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 8:00-11:59 AM
                    hR = String.format("%02d",(int)(Math.random()*3 + 1));
                    mR = String.format("%02d",(int)(Math.random()*59));
                    New_To = hR + ":" + mR + "PM";
                    _t++; Thread.sleep((long) sleep); T.Time_Enter("Enter Sunday Delivery Closes Time", L1, 0, "css", "[aria-label^='Closes']", New_To,"no_jira");             
                        if (FAIL) { return;}                                // ^^^ Enter Text within 1:00-4:59 PM
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Sunday'  - activate 'Save'", "xpath", "//p[text()='Sunday']", "no_jira"); 
                        if (FAIL) { return;}    //  Save not visible after time enter/not selection    - DEBUG                                                                                       

                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                        if (FAIL) { return; } // Save
                    _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                        if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.Call_API("Call '/location/brand/' API", BaseAPI + "/location/brand/" + BrandID + "?nocache=1", true,"no_jira" );
                        if (FAIL) { return;}                  
                    _t++; Thread.sleep((long) sleep); T.Brand_API_Hours("Brand API - new Delivery Hours", "Delivery - day 0", New_From, New_To,true, "no_jira");
                        if (FAIL) { return;} // ^^ Check Brand API > Pickup / Delivery / others?                         ^^ "Delivery - day X"

                    // =================   Refresh Page after Save and Select Service Tab
                    _t++; Thread.sleep((long) sleep); T.List_L0("Tabs Count - refresh after save", "xpath", "//div[contains(@class, 'v-tabs__div')]", "no_jira");             
                            if (FAIL) { return;}
                    _t++; Thread.sleep((long) sleep); T.List_L1("Week Days - refresh after save", "xpath", "//div[contains(@class, 'layout FormStyle row align-baseline')]", "no_jira");             
                            if (FAIL) { return;} 
                    _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Delivery Hours'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                        if (FAIL) { return;}        
                    for (int j = 0; j < L1.size(); j++) { 
                        _t++; T.Scroll_to_Day("Scroll to Day " + j, L1, j, "no_jira");             
                            if (FAIL) { return;}                        
                        _t++; T.Element_Text("Delivery Week Day Labels", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                        _t++; T.Day_Snedule("Delivery Week Day Schedule", L1, j, "no_jira");             
                            if (FAIL) { return;}
                    }    
                    _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                        if (FAIL) { return;}
                    Thread.sleep(1000);
                }   
            } else if (Tab_Name.toLowerCase().contains("closure")) {
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Brand Closure'", "xpath", "//div[contains(@class, 'v-tabs__div')][" + (i + 1) + "]", "no_jira"); 
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Page_URL("Closure page URL", "no_jira"); 
                    if (FAIL) { return;}  
                //..../brand/rjEZyoky4rUZ1ZqEyP8RFAEqOzg2RQcwqQlBX0vaF8XBo3RlkdsKg0aL9Dw2FZ9QKRAGk6S761K/closure
//                _t++; Thread.sleep((long) sleep); T.List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", "no_jira");             
//                    if (FAIL) { return;}                    
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Add closure' text", "Add Station Closure", true,"no_jira"); 
                    if (FAIL) { return; }     
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'Add closure'", "xpath", "//button[contains(@class, 'ml-0 pl-0 v-btn v-btn--flat theme--light')]", "no_jira"); 
                    if (FAIL) { return; } 
                _t++; Thread.sleep((long) sleep); T.List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", "no_jira");             
                    if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; T.Element_Text("Closure Data Row Text", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                    }
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find '..Reason' text", "Closure Reason", true,"no_jira"); 
                    if (FAIL) { return; }
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Remove' text", "REMOVE", true,"no_jira"); 
                    if (FAIL) { return; }
                _t++; Thread.sleep((long) sleep); T.Find_Text("Find 'Save' text", "Save", true,"no_jira"); 
                    if (FAIL) { return; }
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click(" 'SAVE' Click", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                    if (FAIL) { return; } 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'required' text", "xpath", "//div[contains(@class,'v-messages__message')]","no_jira"); 
                    if (FAIL) { return; }                    
                _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Input_Select_Clear("Clear Closure Reason", "css", "[aria-label='Closure Reason']", "no_jira");
                    if (FAIL) { return;}

                _t++; Thread.sleep((long) sleep); T.Visible_Element_By_Path_Text_Enter("Enter Closure Reason", "css", "[aria-label='Closure Reason']", "Auto Closure " + New_ID, false, "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                    if (FAIL) { return; } 
                Thread.sleep(500); 
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'progress')]", "no_jira");
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", "no_jira");             
                    if (FAIL) { return;} 
                    for (int j = 0; j < L1.size(); j++) {
                        _t++; T.Element_Text("Closure Data Row Text", L1.get(j), "no_jira");             
                            if (FAIL) { return;}
                    }
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text_Select_Copy("Saved Closure Reason", "xpath", "//input[@aria-label='Closure Reason']","no_jira"); 
                    if (FAIL) { return; }                    
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Text("Find 'closure under effect...'", "className", "Temporarily-closed-text", "no_jira"); 
                    if (FAIL) { return; }   
                _t++; Thread.sleep((long) sleep); T.Call_API("Call 'calendar' API", BaseAPI + "/calendar/" + BrandID, true,"no_jira" );
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Calendar_API_Closure("Validate Closure in 'calendar' API", "Auto Closure " + New_ID, true, "no_jira" );
                    if (FAIL) { return;}

                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'REMOVE'", "xpath", "//i[contains(@class, 'v-icon mr-1 v-icon--left mdi mdi-delete-outline')]", "no_jira"); 
                    if (FAIL) { return; } 
                _t++; Thread.sleep((long) sleep); T.Element_By_Path_Click("Click 'SAVE'", "xpath", "//button[contains(@class, 'mt-4 v-btn theme--light primary rounded m-2')]", "no_jira"); 
                    if (FAIL) { return; } 
                _t++; Thread.sleep((long) sleep); T.Wait_For_All_Elements_InVisibility("Wait for save...", "xpath", "//*[contains(@class, 'v-progress-circular')]", "no_jira");
                    if (FAIL) { return;}
//                _t++; Thread.sleep((long) sleep); T.List_L1("Closure rows Count", "xpath", "//div[contains(@class, 'layout flex xs12 nowrap align-center')]", "no_jira");             
//                    if (FAIL) { return;} 
//                    for (int j = 0; j < L1.size(); j++) {
//                        _t++; T.Element_Text("Closure Data Row Text", L1.get(j), "no_jira");             
//                            if (FAIL) { return;}
//                    }          
                _t++; Thread.sleep((long) sleep); T.Call_API("Call 'calendar' API", BaseAPI + "/calendar/" + BrandID, true,"no_jira" );
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.Calendar_API_Closure("Validate Closure in 'calendar' API", "Auto Closure " + New_ID, false, "no_jira" );
                    if (FAIL) { return;}
                _t++; Thread.sleep((long) sleep); T.To_Top("no_jira");             
                    if (FAIL) { return;}
                Thread.sleep(1000);
            }
        }
    }  
}
