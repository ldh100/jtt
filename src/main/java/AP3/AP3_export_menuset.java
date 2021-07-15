package AP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author dhruv.seth
 */
        //AUT-875: As an Admin, I cannot export the menu in EDIT mode
        //AUT-876: As an Admin, I can export the menu
        //AUT-877: As a user, I can verify the fields in the exported excel report
        //AUT-262 : Disabling a menu set  
        //AUT-997: As an Admin, I can export the Global Modifiers

class AP3_export_menuset extends AP3_GUI{
    String MenuSetName = "";
    String MenuSetFile = "";
    String Menu_ID="";
    boolean NO_DATA = false;
    String destinationDir = System.getProperty("user.home") + File.separator + "Downloads"; 
    String API_Response_Body = "";   
        
    protected AP3_export_menuset (AP3_GUI a) {
        d1 = a.d1;
        url = a.url;
        loadTimeout = a.loadTimeout;
        LoadTimeOut = a.LoadTimeOut;
        ParentTest = a.ParentTest;
        env = a.env;
        BaseAPI = a.BaseAPI;        
        
        ADMIN_ID = a.ADMIN_ID;
        ADMIN_PW = a.ADMIN_PW;
        
        AP3_TKN = a.AP3_TKN;
        
        app = a.app;
        SITE = a.SITE;
        SiteID = a.SiteID;
        BRAND = a.BRAND;
        BrandID = a.BrandID;
        SECTOR = a.SECTOR;
        SectorID = a.SectorID;
        GL_MENU = a.GL_MENU;
        CompanyID = a.CompanyID;
        
        AP3_TKN = a.AP3_TKN;
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
               
    } 
    protected void run(){
    try {
       
               //AUT-875: As an Admin, I cannot export the menu in EDIT mode
         selectingGlobalMenu();
         
         
         
         //<editor-fold defaultstate="collapsed" desc="Check Export is disabled">
        //This block clicks on Export file for the first menuset after entering the global menu
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent",ParentTest ,"no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]",ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);        
        
        //Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent",ParentTest, "no_jira"); 
        // ^^^ fails
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL || L0.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            } 
        Element_Attribute("Menu setName", L0.get(0), "textContent", ParentTest, "no_jira");      
        MenuSetName = t; // ==========================

//        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 2), "tagName", "button", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(0), "tagName", "button", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Thread.sleep(500);
        Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
            if (FAIL) { return;}   
        Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                
        Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  ParentTest, "no_jira");                      
                if(t.contains("Export")){ 
                    T_Index = i; 
                } 
            }
         
        Element_By_Path_Attribute("Check if Export is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", ParentTest, "no_jira");      
            if (FAIL) { return;}
         //</editor-fold> 
        
        //AUT-876: As an Admin, I can export the menu
        Navigate_Back("Navigate Back"," 'global menu' page"," 'View Global Menus of a group' page", ParentTest, "no_jira"); 
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);

        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}                                         

        //<editor-fold defaultstate="collapsed" desc="Click on Export">
        //This block clicks on Export file for the first menuset after entering the global menu
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
        //Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent",ParentTest, "no_jira"); 
        // ^^^ fails
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL || L0.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            } 
        Element_Attribute("Menu setName", L0.get(0), "textContent", ParentTest, "no_jira");      
        MenuSetName = t; // ==========================

//        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 2), "tagName", "button", ParentTest, "no_jira"); 
//            if (FAIL) { return;}
        Element_Child_List_L2("Find Added Menu Set - dots", L0.get(0), "tagName", "button", ParentTest, "no_jira"); 
            if (FAIL) { return;}            
        Thread.sleep(500);
        Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
            if (FAIL) { return;}   
        Thread.sleep(1000);
        Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}                
        Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  ParentTest, "no_jira");                      
                if(t.contains("Export")){ 
                    T_Index = i; 
                }                    
            } 
//        Element_By_Path_Text("Get 'Export' button text", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Export']", ParentTest, "no_jira");                
//            if (FAIL) { return;}    
        Element_By_Path_Attribute("Check 'rename' is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_Click("Click Category 'Export'", L1.get(T_Index), ParentTest, "no_jira");
            if (FAIL) { return;}
        //</editor-fold>    
                
        Thread.sleep(5000);  // ============ give time to load file
        
        //AUT-877: As a user, I can verify the fields in the exported excel report
        
        String destinationDir = System.getProperty("user.home") + File.separator + "Downloads"; 
        MenuSetFile = MenuSetName.trim() + " - " + LocalDate.now() +".zip";    // Lunch - 2021-06-15.zip

        //File_Find("Find Report Zip File", destinationDir, MenuSetFile, ParentTest, "no_jira");
            //if (FAIL) { return;}   
         
             File temp=new File(destinationDir+ File.separator + MenuSetFile);
                System.out.println(temp);
            
                if (temp.exists()) {
        File_UnZip("Unzip Report File", destinationDir, MenuSetFile, ParentTest, "no_jira");
            if (FAIL) { return;}          
        File_Delete("Delete Report Zip File", destinationDir,MenuSetFile , ParentTest, "no_jira");
           if (FAIL) { return;}  
           
         
         readExcel( destinationDir, MenuSetName.trim() + ".xlsx",MenuSetName.trim());                   

         Thread.sleep(3000);
           
        File_Delete("Delete Report Unzipped File", destinationDir, MenuSetName.trim() + ".xlsx" , ParentTest, "no_jira");
            if (FAIL) { return;}                                                                
    }  
               
                
         
        //AUT-262 : Disabling a menu set 
        
        //selectingGlobalMenu();
        
        
        Navigate_Back("Navigate Back"," 'global menu' page"," 'View Global Menus of a group' page", ParentTest, "no_jira"); 
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);

        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        int flag=1;                          

        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);
        Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest,"no_jira"); 
            if (FAIL) { return;}
          
          
          Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            
        List_L2("Published Menus ID Count", "css", "[menu-id]", ParentTest, "no_jira");   
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL) { return;} 
                if(L0.size() == L2.size())
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id", ParentTest, "no_jira");   
                } 
                
             Element_Attribute("Menu setName", L0.get(0), "textContent", ParentTest, "no_jira");      
                MenuSetName= t.trim();
                
            System.out.println("ds:"+MenuSetName);
            
            Element_Attribute("Menu ID", L2.get(0), "menu-id", ParentTest, "no_jira");
             Menu_ID=t;
             System.out.println("ds:"+Menu_ID);
            
            Element_Child_List_L2("Find Added Menu Set - dots", L0.get(0), "tagName", "button", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500);
            Element_Click("Added Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                
            Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Menu Edit Option (index " + i + ")", L1.get(i), ParentTest,"no_jira");                      
                    if(t.contains("Disable")){ T_Index = i; }                    
                } 
            Element_By_Path_Attribute("Check if Export is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", ParentTest, "no_jira");
                if (FAIL) { return;}   
             
            Element_Click("Click Category 'Disable'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}    
              
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]",ParentTest, "no_jira");        
                if (FAIL) { return;} 
                            Thread.sleep(500);
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]",ParentTest, "no_jira"); 
                if (FAIL) { return;}                       
                        Thread.sleep(500);
            Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
                if (FAIL) { return;}   
            Wait_For_Element_By_Path_Presence("Wait for Menu list", "css", "[menu-id]", ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Element_By_Path_Attribute("Menu-d", "css", "[menu-id]", "textContent", ParentTest,"no_jira"); 
            if (FAIL) { return;}    
                
            Thread.sleep(3000); 
            Refresh("Refresh", ParentTest, "no_jira");
            
            Call_Company_API(MenuSetName,flag);
            
            Refresh("Refresh", ParentTest, "no_jira");
            
            Call_GlobalMenuSet_API(Menu_ID,MenuSetName,flag);
            
            
           
            
            Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(500);  
            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
            if (FAIL) { return;}   
             Thread.sleep(500);
            Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent", ParentTest,"no_jira"); 
            if (FAIL) { return;}
            
            Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent",ParentTest, "no_jira"); 
            if (FAIL) { return;}
          
            List_L2("Published Menus ID Count", "css", "[menu-id]",ParentTest, "no_jira");  
            List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']",ParentTest, "no_jira");             
            if (FAIL) { return;} 
            if(L0.size() == L2.size())
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent",ParentTest, "no_jira");
                    Element_Attribute("Menu (Index " + i + ") ID", L2.get(i), "menu-id",ParentTest, "no_jira");   
                } 
                
                 
                
             Element_Attribute("Menu setName", L0.get(0), "textContent",ParentTest, "no_jira");      
                 
             MenuSetName= t.trim();
             int j= MenuSetName.indexOf(" ");
                MenuSetName=MenuSetName.substring(0, j);
                        //MenuSetName.substring(0, MenuSetNamedisabled.indexOf(' '));
                
            System.out.println("ds:"+MenuSetName);
            
             Element_Attribute("Menu ID", L2.get(0), "menu-id",ParentTest, "no_jira");
             Menu_ID=t;
             System.out.println("ds:"+Menu_ID);            
            
            Element_Child_List_L2("Find Added Menu Set - dots", L0.get(0), "tagName", "button",ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500);
            Element_Click("Added Menu Set 'dots' Click", L2.get(1),ParentTest, "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",ParentTest, "no_jira"); 
                    if (FAIL) { return;}                
            Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]",ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']",ParentTest, "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),ParentTest,"no_jira");                      
                    if(t.contains("Enable")){ T_Index = i; }                    
                } 
            Element_By_Path_Attribute("Check if Export is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", ParentTest, "no_jira");
                if (FAIL) { return;}   
             
            Element_Click("Click Category 'Enable'", L1.get(T_Index),ParentTest, "no_jira");
                if (FAIL) { return;}    
              
            Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]",ParentTest, "no_jira");        
                if (FAIL) { return;}                            
            Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]",ParentTest, "no_jira"); 
                if (FAIL) { return;}                       
                       
            Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest,"no_jira"); 
                if (FAIL) { return;}
                 Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Menu list", "css", "[menu-id]",ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Element_By_Path_Attribute("Menu-d", "css", "[menu-id]", "textContent",ParentTest, "no_jira"); 
            if (FAIL) { return;}  
            Thread.sleep(3000); 
            Refresh("Refresh",ParentTest, "no_jira");
             
            flag=2;
            
          Call_Company_API(MenuSetName,flag);
           
           Thread.sleep(3000);   
           
          Call_GlobalMenuSet_API(Menu_ID,MenuSetName,flag);

        
        
        //AUT-997: As an Admin, I can export the Global Modifiers
        /*
        selectingGlobalMenu();
        
        Element_By_Path_Click("View Global Modifiers Groups Click", "xpath", "//div[normalize-space()='View GLobal Modifier Groups']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;} 
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;} 
        To_Top("Scroll to page Top", ParentTest, "no_jira"); // Temp fix for BUG
                if (FAIL) { return;}            
        Wait_For_Element_By_Path_Presence("Wait for page load", "tagName", "table", ParentTest, "no_jira"); 
                if (FAIL) { return;}    
        Thread.sleep(500);       
        Page_URL("Current page URL", ParentTest, "no_jira");
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira"); 
                if (FAIL) { return;}
        
                //<editor-fold defaultstate="collapsed" desc="Pagination">   
            Move_to_Element_By_Path("Paging - Rows per page", "css", "[aria-label='Rows per page:']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Click("Rows per page Click", "xpath", "//input[@aria-label='Rows per page:']", ParentTest, "no_jira");
                if (FAIL) { return;}

            Element_E1_Find("Find 'Rows per page' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light v-menu__content--auto menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}  
            Element_Child_List_L1("List 'Rows per page' values Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Rows per page Value (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if (FAIL) { return;}
                if(t.trim().startsWith("All")){ T_Index = i; }
            }
            Element_Click("Click 'All'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500); 

            Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_By_Path_Text("Pagination", "xpath", "//div[contains(@class, 'v-datatable__actions__pagination')]", ParentTest, "no_jira");
                if (FAIL) { return;}
                if(t.equals("–")){
                    NO_DATA = true;
                }
            To_Top("Scroll to page Top", ParentTest, "no_jira");
                if (FAIL) { return;}
            //</editor-fold>
            
            List_L0("Groups Count", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                for (int i = 2; i < L0.size(); i++) {
                    List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                        if (FAIL) { return;}  
                }
                
              Element_By_Path_Click("Click on Export", "xpath", "//i[@class='v-icon mdi mdi-download theme--light']", ParentTest, "no_jira");
                if (FAIL) { return;}  
             
                
             
                
                
                File[] listFiles = new File(destinationDir).listFiles();
                System.out.println(destinationDir);
               //System.out.println(GL_MENU+"-global-modifier-groups-"+LocalDate.now());
                System.out.println(listFiles.length);
                for (File listFile : listFiles) {
                  if (listFile.isFile()) {
                String GlobalModifierFileName = listFile.getName();
                if(GlobalModifierFileName.contains(GL_MENU+"-global-modifier-groups-")){
                System.out.println("File name: " +GlobalModifierFileName);
                }
            }
        }
         */        
         //Prerequisite for this test is that there cannot be any Global modifier group in the global menu to be selected     
        //AUT-280: Mods can be added only if they exist in the global mods 
        //Description:2 scenarios here. 1st scenario: No mod groups exist in the global mods
        //Go to the Global Menu
        //Select V2 menu
        //Select an item
        //Click on Add Modifier Group
        
        /*
        selectingGlobalMenu();
        
        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Modifier Groups']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        
        
       Element_By_Path_Text("Check no Global Modifier Group is present", "xpath", "//table/tbody/tr[1]/td[1]", ParentTest, "no_jira"); 
            if (FAIL) { return; }
        System.out.println(t);
                        
        
        if(t.equals("No data available")){
            _t++;
            _p++; EX += _t + "\t" + "No Global Modifiers Group Found" + "\t" + t + "\t"  + "\t" + "Pass" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";  
            Log_Html_Result("Pass", "No data available", true, ParentTest.createNode("Global Modifiers are present")); 
        }
        else{
            Element_By_Path_Text("Get Modifier Name", "xpath", "//table/tbody/tr[1]/td[2]", ParentTest, "no_jira");
            _t++;
            _f++; EX += _t + "\t" + "Global Modifiers Group Present" + "\t" + t + "\t" + "\t" + "Fail" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "Global Modifier Group Present", true, ParentTest.createNode("Global Modifiers are present"));
            return;            
            }
        
        
        
        Navigate_Back("Navigate Back"," 'globalmods' page"," 'menu' page", ParentTest, "no_jira"); 
            Thread.sleep(500); 
            Wait_For_All_Elements_InVisibility("Wait for page load...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                if (FAIL) { return;}               
            Wait_For_Element_By_Path_Presence("Wait for Menu page load", "xpath", "//div[@class='layout hover align-baseline']", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                
        
        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);         
        
        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}            
                    
                    
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent",ParentTest ,"no_jira"); 
            if (FAIL) { return;} 
        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]",ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);        
        
        //Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent",ParentTest, "no_jira"); 
        // ^^^ fails
        List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");             
            if (FAIL || L0.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            } 
        Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira");      
        MenuSetName = t; // ==========================
        Element_Click("Click First Menuset", L0.get(0), ParentTest, "no_jira");        
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
            if (FAIL) { return;}
            
        Element_By_Path_Click("Click > First Item", "xpath", "//table/tbody/tr[1]/td[3]", ParentTest, "no_jira"); 
            if (FAIL) { return;}    
        Element_By_Path_Attribute("Get Current Item Name Value", "css", "[aria-label='Item Name']", "value", ParentTest, "no_jira");
        if (FAIL) { return;} 
        Element_By_Path_Click("Click > Add Modifier Group ", "xpath", "//div[contains(text(),'Add modifier group')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            Thread.sleep(3000);
        Element_By_Path_Click("Click >  ", "xpath", "//div[@class='v-select__selections']", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            Thread.sleep(3000);  
        
        Element_By_Path_Click("Modifier Name Input Click", "xpath", "//div[@class='v-input v-text-field v-select theme--light']", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
            
            
        //Element_By_Path_Click("Modifier Name Input Click", "xpath", "//div[@class='v-input v-text-field v-select v-input--is-focused theme--light primary--text']", ParentTest, "no_jira"); 
            //if (FAIL) { return;}    
        Element_E1_Find("Find 'Modifier Groups' list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
            if (FAIL) { return;}             
        Element_Child_List_L1("Available Modifier Groups Count", e1,"xpath", "//div[@class='v-input v-text-field v-select v-select--is-menu-active v-input--is-focused theme--light primary--text']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Modifier Group (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
                Element_Attribute("Menu setName", L1.get(i), "textContent", ParentTest, "no_jira");           
                if (FAIL) { return;}                               
                Element_By_Path_Attribute("No modifier found text", "xpath", "//div[@data-v-21325df0='true']//div[@class='v-list__tile__title'][normalize-space()='No data available']", "textContent",ParentTest ,"no_jira"); 
                if (FAIL) { return;}
                
            if(t.equals("No data available")) {//Print Fail the ids are not unique
                _t++;
                _p++; EX += _t + "\t" + "No Global Modifiers Group Found" + "\t" + t + "\t"  + "\t" + "Pass" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {//Print Pass the ids are unique
                _t++;
                _f++; EX += _t + "\t" + "Global Modifiers Group Present" + "\t" + t + "\t" + "\t" + "Fail" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("FAIL", "Global Modifier Group Present", true, ParentTest.createNode("Global Modifiers are present"));
            }
        
            }
        
            */
            
            
    } catch (Exception ex){}   // =============================================  
        
    } //run time closing bracket
    
    //This block clicks Menu Manager, selects group that was selected in GUI, searches and clicks on the global menu that was selected in jtt
    public void selectingGlobalMenu() {
    try {    
        //<editor-fold defaultstate="collapsed" desc="Select Global Menu">
        //This block clicks Menu Manager, selects group that was selected in GUI, searches and clicks on the global menu that was selected in jtt
        Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Drawer > 'Menu Manager' Click", "xpath", "//*[contains(text(), 'Menu Manager')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,ParentTest, "no_jira");
            if (FAIL) { return;}

        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu Manager page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Go to Menu' text", "Go to menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled",ParentTest, "no_jira");
            if (FAIL) { return;}

        // =========================================== Group Selection
        Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", ParentTest, "no_jira");
            if (FAIL) return;
        Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", ParentTest, "no_jira");
            if (FAIL) { return;}
        // ========================================= Group Selection ^^^^

        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        
 
        
        Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}   
        
        
        //</editor-fold>
    } catch (Exception ex){}   // =============================================  
    }
    
      
    public void readExcel(String filePath, String fileName, String sheetName) {
    try {    
        //<editor-fold defaultstate="collapsed" desc="Read Excel">
        //This block reads and gets the cell value of from the exported menuset excel file
    //Create an object of File class to open xlsx file    

    File file =    new File(filePath+"/"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook menusetworkbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    menusetworkbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of HSSFWorkbook class

        menusetworkbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet menusetsheet = menusetworkbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = menusetsheet.getLastRowNum()-menusetsheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

   // for (int i = 0; i < rowCount+1; i++) {

        Row row = menusetsheet.getRow(0);       

        if(row.getCell(0).getStringCellValue().equals("Record Type")){                                      
             _t++;
              _p++; EX += _t + "\t" + "Cell 0,0: "+row.getCell(0).getStringCellValue() + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
       }else
       {           
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,0: Test Failed" + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }   
         
         
        if(row.getCell(1).getStringCellValue().equals("Category ID")){             
              _t++;
              _p++; EX += _t + "\t" +  "Cell 0,1: "+row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue()+ "\t" + "Category ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,1: "+row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Category ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
        
        if(row.getCell(2).getStringCellValue().equals("Category Name")){             
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,2: " +row.getCell(2).getStringCellValue() + "\t" + row.getCell(2).getStringCellValue() + "\t" + "Category Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,2: "+row.getCell(2).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Category Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
        if(row.getCell(3).getStringCellValue().equals("Category Chit #")){            
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,3: "+row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Chit #" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" +  "Cell 0,3: "+row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Chit #" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        
          if(row.getCell(4).getStringCellValue().equals("Category Enabled")){             
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,4: "+ row.getCell(4).getStringCellValue() + "\t" + row.getCell(4).getStringCellValue() + "\t" + "Category Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,4: "+row.getCell(4).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
          
         if(row.getCell(5).getStringCellValue().equals("Item ID")){            
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,5: "+row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Item ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,5: "+row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Item ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
         
         if(row.getCell(6).getStringCellValue().equals("Item Name")){             
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,6: "+row.getCell(6).getStringCellValue() + "\t" + row.getCell(6).getStringCellValue() + "\t" + "Item Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,6: " +row.getCell(6).getStringCellValue()+ "\t" + row.getCell(6).getStringCellValue() + "\t" + "Item Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
         
         if(row.getCell(7).getStringCellValue().equals("Price")){
             
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Price" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Price" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
         
         if(row.getCell(8).getStringCellValue().equals("Calories")){            
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,8: " +row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue()+ "\t" + "Calories" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,8: "+row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue() + "\t" + "Calories" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(9).getStringCellValue().equals("Description")){
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,9: "+row.getCell(9).getStringCellValue() + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Description" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,9: " +row.getCell(9).getStringCellValue()  + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Description" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(10).getStringCellValue().equals("Item Chit #")){           
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,10: "+row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Item Chit #" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,10: "+row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Item Chit #" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(11).getStringCellValue().equals("PLU")){
              _t++;
              _p++; EX += _t + "\t" +"Cell 0,11: " +row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue() + "\t" + "PLU" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,11: " +row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue()+ "\t" + "PLU" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(12).getStringCellValue().equals("Item Enabled")){             
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,12: "+row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue() + "\t" + "Item Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,12: "+row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue()+ "\t" + "Item Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(13).getStringCellValue().equals("Modifier Group ID")){             
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,13: "+row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "Modifier Group ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,13: "+row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "Modifier Group ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
         
         if(row.getCell(14).getStringCellValue().equals("Modifier Group Name")){             
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,14: "+row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue() + "\t" + "Modifier Group Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
                        
        }else
       { 
          _t++;
          _f++; EX += _t + "\t" + "Cell 0,14: "+ row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue()+ "\t" + "Modifier Group Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }  
          //</editor-fold>
    } catch (Exception ex){}   // =============================================  
    }
    
    //<editor-fold defaultstate="collapsed" desc="Call Company API">    //This block call the company API: BaseAPI + "/menu/company/"+CompanyID
    public  void Call_Company_API(String MenuSetName,int flag) {
    try {    

        Call_API("Call Global menu API", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID, true, ParentTest, "no_jira" );        
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode("API Responce Error"));
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray menus = json.getJSONArray("menus");
         
        for(int k = 0; k < menus.length(); k++) {
           JSONObject menu = menus.getJSONObject(k);
           if(menu.has("location_brand")){                                  
               if(menu.getString("location_brand").equals(BrandID)) {
                   if(menu.getJSONObject("label").getString("en").equalsIgnoreCase(MenuSetName)) {
                       if(menu.getJSONObject("is").getBoolean("disabled") && flag==1) {
                            _t++;
                            _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuSet is disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                           //print pass menu set is disabled
                        }  else if(!menu.getJSONObject("is").getBoolean("disabled") && flag==2) {
                            _t++;
                            _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuSet is enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                           //print pass menu set is d
                        } else {
                           _t++;
                           _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found opposite values" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                           //print fail menuset is eneabled
                        }  
                    }    
                }     
            } 
        }
    } catch (Exception ex){}   // =============================================  
    } 
    //</editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="Call Global Menuset API">    //This block call the GlobalMenuSet API: BaseAPI + "/menu/" + Menu_ID
    public  void Call_GlobalMenuSet_API(String Menu_ID, String MenuSetName, int flag) {
    try {    

        Call_API("Call GlobalMenuSet API", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + Menu_ID, true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/"+CompanyID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/"+CompanyID , false, ParentTest.createNode("API Responce Error"));
            return;
        }               
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray groups = json.getJSONArray("groups");
        if(json.getString("id").equals(Menu_ID.trim())){                           
            if(json.has("id")){                                     
                System.out.println(json.getJSONObject("label").getString("en"));
                if(json.getJSONObject("label").getString("en").equalsIgnoreCase(MenuSetName)){
                    if(json.getJSONObject("is").getBoolean("disabled") && flag==1) {
                         _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuSet is disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass menu set is disabled
                    } else if(!json.getJSONObject("is").getBoolean("disabled") && flag==2) {
                         _t++;
                         _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuSet is enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        //print pass menu set is enabled
                    } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + "-" + "\t" + "Found opposite values" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        //print fail if found contradicting values
                    }                                              
                }                                      
            }
        }   

    } catch (Exception ex){}   // =============================================  
    } 
    //</editor-fold>
}
