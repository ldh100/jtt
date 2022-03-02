package AP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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
        
        Navigate_Back("Navigate Back"," 'global menu' page"," 'View Global Menus of a group' page", ParentTest, "no_jira"); 
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("'Global Menu' text", "Global Menu", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Local Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click  Global Menu", "xpath", "//span[@id='global-menu-label']", ParentTest, "no_jira");
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
        
        String destinationDir = System.getProperty("user.home") + File.separator + "Downloads"; 
        MenuSetFile = MenuSetName.trim() + " - " + LocalDate.now() + ".zip";    // Lunch - 2021-06-15.zip

        File_Find("Find Report Zip File", destinationDir, MenuSetFile, ParentTest, "no_jira");
         
        File temp = new File(destinationDir+ File.separator + MenuSetFile);          
        if (temp.exists()) {
            File_UnZip("Unzip Report File", destinationDir, MenuSetFile, ParentTest, "no_jira");
                if (FAIL) { return;}          
            File_Delete("Delete Report Zip File", destinationDir,MenuSetFile, ParentTest, "no_jira");
               if (FAIL) { return;}  
            readExcel(destinationDir, MenuSetName.trim() + ".xlsx",MenuSetName.trim());                   
            Thread.sleep(3000);
            File_Delete("Delete File after reading", destinationDir, MenuSetName.trim() + ".xlsx" , ParentTest, "no_jira");
                if (FAIL) { return;}                                                                
        }  

        Navigate_Back("Navigate Back"," 'global menu' page"," 'View Global Menus of a group' page", ParentTest, "no_jira"); 
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Page_URL("Menu > " + SECTOR + " page URL", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", ParentTest, "no_jira");
            if (FAIL) { return;}
        Find_Text("Find 'Search...' text", "Search Local Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click  Global Menu", "xpath", "//span[@id='global-menu-label']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        int flag = 1;                          
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
                
            System.out.println("ds:" +MenuSetName);
            
            Element_Attribute("Menu ID", L2.get(0), "menu-id", ParentTest, "no_jira");
             Menu_ID=t;
             System.out.println("ds:" +Menu_ID);
            
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
            Element_By_Path_Attribute("Menu ID", "css", "[menu-id]", "textContent", ParentTest,"no_jira"); 
                if (FAIL) { return;}   
         
            Thread.sleep(5000); 
            Refresh("Refresh", ParentTest, "no_jira");
            Refresh("Refresh", ParentTest, "no_jira");   
         
            Thread.sleep(10000); // allow time to propage published updates
            Call_Company_API(MenuSetName,flag);               // ========================== 
            Call_GlobalMenuSet_API(Menu_ID,MenuSetName,flag); // ========================== 
            
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
                 
            MenuSetName = t.trim();
            int j = MenuSetName.indexOf(" ");
            MenuSetName = MenuSetName.substring(0, j);
            
            Element_Attribute("Menu ID", L2.get(0), "menu-id",ParentTest, "no_jira");
            Menu_ID = t;     
            
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
            Element_By_Path_Attribute("Menu ID", "css", "[menu-id]", "textContent",ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Thread.sleep(3000); 
            Refresh("Refresh",ParentTest, "no_jira");
             
            flag = 2;       
            Thread.sleep(10000); // allow time to propage published updates
            Call_Company_API(MenuSetName, flag);
            Call_GlobalMenuSet_API(Menu_ID, MenuSetName, flag);

            Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Element_By_Path_Click("Click 'Global mod Export'", "xpath", "//div[contains(text(),'Export')]//i", ParentTest, "no_jira");
                if (FAIL) { return;}
            //Thread.sleep(5000);  
            String ModGrpPath = GL_MENU.trim() + "-global-modifier-groups-" + LocalDate.now();  
            Path path = Paths.get(destinationDir + File.separator + ModGrpPath + File.separator + ".zip");
            for(int i = 0; i < 20; i++){
                if(Files.exists(path)){
                    break;
                }else{
                    Thread.sleep(500);
                }
            }
  
            File_Find("Find Global mod export Zip File", destinationDir, ModGrpPath, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(3000);
            File_UnZip("Unzip global mod export file ", destinationDir, t, ParentTest, "no_jira");
                if (FAIL) { return;}          
            File_Delete("Delete Report Zip File", destinationDir,t, ParentTest, "no_jira");
                if (FAIL) { return;}  
            ModGrpPath = GL_MENU.trim()+ "-global-modifier-groups.xlsx";

            readGlobalModExcel(destinationDir, ModGrpPath ,"Modifier Groups");              

            Thread.sleep(3000);

            File_Delete("Delete Global Modifier File after reading", destinationDir, ModGrpPath , ParentTest, "no_jira");
            if (FAIL) { return;}
        
       
        //Prerequisite for this test is that there cannot be any Global modifier group in the global menu to be selected 
        //Use Sector: DS Meadowvale Village and Global Menu : DS Tim Hortans in Staging for this test
        //AUT-280: Mods can be added only if they exist in the global mods 
        //Description:2 scenarios here. 1st scenario: No mod groups exist in the global mods
        //Go to the Global Menu
        //Select V2 menu
        //Select an item
        //Click on Add Modifier Group
        
        //Commenting the below ticket (Refer Prerequisite)
        
        /*
        Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
            if (FAIL) { return;}
        Refresh("Refresh the page", ParentTest, "no_jira");        
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
            Log_Html_Result("Pass", "No data available", true, ParentTest.createNode(_t + ". " + "Global Modifiers are present")); 
        }
        else{
            Element_By_Path_Text("Get Modifier Name", "xpath", "//table/tbody/tr[1]/td[2]", ParentTest, "no_jira");
            _t++;
            _f++; EX += _t + "\t" + "Global Modifiers Group Present" + "\t" + t + "\t" + "\t" + "Fail" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "Global Modifier Group Present", true, ParentTest.createNode(_t + ". " + "Global Modifiers are present"));
            return;            
            }
        
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
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
                Log_Html_Result("FAIL", "Global Modifier Group Present", true, ParentTest.createNode(_t + ". " + "Global Modifiers are present"));
            }
        
            }
            
        // AUT-284:  Adding mods to an existing mod group
        
        Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
            if (FAIL) { return;}                       
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        
       
        Element_By_Path_Click("Click 'NEW GROUP'", "xpath", "//*[contains(text(), 'new group')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);     
        Element_By_Path_Text_Enter("Enter Group Name", "css", "[aria-label='Modifier Group Name']", "New Group " + New_ID, false, ParentTest, "no_jira");
            if (FAIL) { return;}  
        Element_By_Path_Text_Enter("Enter Label In App", "css", "[aria-label='Label In App']", "Label " + New_ID , false, ParentTest, "no_jira");
            if (FAIL) { return;}
            
        EX += " - " + "\t" + " === Add new modifier to a group" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        Element_By_Path_Click("Click > Item Name Field on New Modifier", "xpath", "(//input[@aria-label='Item Name'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter a Name for New Modifier", "xpath", "(//input[@aria-label='Item Name'])[1]", "Mod 1", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Price Field on New Modifier", "xpath", "(//input[@aria-label='Price'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter a Price for New Modifier", "xpath", "(//input[@aria-label='Price'])[1]", "5.98", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Input_Select_Clear("Clear > Calories Field on Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter a Calories for Existing Modifier", "xpath", "(//*[@aria-label='Calories'])[1]","200", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);    
         
        //Adding Modifier group to the first menu item in the global Menu
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
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
        Element_Child_List_L1("Available Modifier Groups Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");                                     
            if (FAIL) { return;}
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Modifier Group (index " + i + ")", L1.get(i), ParentTest, "no_jira");             
                if (FAIL) { return;}
            }
        Element_Click("Select 1st Group", L1.get(0), ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Modifier Group", "xpath", "//div[@class='modifier-group']//span[@class='Body-1-Selected-On-Surface-High-Emphasis-Left']", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        List_L2("Modifiers Count", "xpath", ".//div[@class='modifiers-list']//div[@class='flex xs8']", ParentTest, "no_jira");             
            if (FAIL || L2.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L2.size(); i++) {
                Element_Attribute("Modifier (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            }
        int InitialModifierCount = L2.size();
        
        Element_By_Path_Click("Click 'APPLY Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}   
            
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}
            
        Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
            if (FAIL) { return;} 
            Thread.sleep(500);
        Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
            if (FAIL) { return;}  
        Thread.sleep(500);
        
        //Adding one more Modifier to the group
        Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
            if (FAIL) { return;}                       
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        
       List_L0("Groups Count after Add Group", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                T_Index = -1;  
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                    for (int i = 2; i < L0.size(); i++) {
                        List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                            if(t.trim().contains("New Group " + New_ID)){
                                T_Index = i;
                        }
                    } 
            Element_Click("Select New Group", L0.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;} 
            Thread.sleep(500);
        
            
            
        EX += " - " + "\t" + " === Add new modifier to a group" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        
        Element_By_Path_Click("Click > ADD MODIFIER", "xpath", "//*[contains(text(),'Add MODIFIER')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Item Name Field on New Modifier", "xpath", "(//input[@aria-label='Item Name'])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter a Name for New Modifier", "xpath", "(//input[@aria-label='Item Name'])[2]", "Mod Test 2", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > Price Field on New Modifier", "xpath", "(//input[@aria-label='Price'])[2]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter a Price for New Modifier", "xpath", "(//input[@aria-label='Price'])[2]", "3.89", false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Click("Click > 'Apply Changes'", "xpath", "//*[contains(text(), 'Apply Changes')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000);
        Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
        if (FAIL) { return;}
        Thread.sleep(500);  
        
        EX += " - " + "\t" + " === Validate if the new modifier added us auto assigned to the Global Menu item" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(1000); 
        Refresh("Refresh", ParentTest, "no_jira");    
        Wait_For_Element_By_Path_Presence("Wait for Global Menu", "xpath", "//*[@class='menu-nav']", ParentTest,"no_jira");
        if (FAIL) { return;}        
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}            
                    
                    
        Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent",ParentTest ,"no_jira"); 
            if (FAIL) { return;} 
//        Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]",ParentTest, "no_jira"); 
//            if (FAIL) { return;} 
//        Thread.sleep(500);  
//        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]",ParentTest, "no_jira"); 
//            if (FAIL) { return;}   
//        Thread.sleep(500);        
        
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
        
        Element_By_Path_Click("Click > Modifier Group", "xpath", "//div[@class='modifier-group']//span[@class='Body-1-Selected-On-Surface-High-Emphasis-Left']", ParentTest, "no_jira");
            if (FAIL) { return;}
            
        List_L2("Modifiers Count", "xpath", ".//div[@class='modifiers-list']//div[@class='flex xs8']", ParentTest, "no_jira");             
            if (FAIL || L2.isEmpty()) { 
                return;
            } 
            for (int i = 0; i < L2.size(); i++) {
                Element_Attribute("Modifier (Index " + i + ") Name", L2.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}                   
            }
        int NewModifierCount = L2.size();
        
        if (NewModifierCount == (InitialModifierCount + 1)) {
                _t++;
                _p++; EX += _t + "\t" + "The new Modifier was auto assigned to the menu item in the global Menu" + "\t" + t + "\t"  + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            } else {//Print Pass the ids are unique
                _t++;
                _f++; EX += _t + "\t" + "The new Modifiere was not auto assigned" + "\t" + t + "\t" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                Log_Html_Result("FAIL", "The new Modifiere was not auto assigned", true, ParentTest.createNode(_t + ". " + "The new Modifiere was not auto assigned"));
            }
        
        
        EX += " - " + "\t" + " === Deleting the Modifier Group" + "\t" + " ===== " + "\t" + " == >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods/", ParentTest, "no_jira");
            if (FAIL) { return;}                       
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
       
        List_L0("Groups Count after Add Group", "tagName", "tr", ParentTest, "no_jira");             
                if (FAIL) { return;}
                T_Index = -1;  
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                    for (int i = 2; i < L0.size(); i++) {
                        List_TR_TDs("Modifier Group Row Data", L0.get(i), ParentTest, "no_jira");   
                            if(t.trim().contains("New Group " + New_ID)){
                                T_Index = i;
                        }
                    }
        
                List_Child_E1_By_Path("Find 'Delete' New Group " + New_ID, L0.get(T_Index), "xpath", ".//i[@class='v-icon mdi mdi-delete theme--light']", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Element_Click("New Group " + New_ID + " 'Delete' Click", e1, ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                Move_to_Element_By_Path("Scroll to 'PUBLISH' button", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira");        
                    if (FAIL) { return;} 
                Element_By_Path_Click("Click 'PUBLISH'", "xpath", "//*[contains(text(), 'publish')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;}                                                                            
                Thread.sleep(500);
                Wait_For_All_Elements_InVisibility("Wait 'PUBLISH' result...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira"); 
                    if (FAIL) { return;} 
                    Thread.sleep(500);
                List_L0("Groups Count after Delete - Publish", "tagName", "tr", ParentTest, "no_jira");             
                    if (FAIL) { return;}
                Element_Text("Modifier Group Row Header", L0.get(0), ParentTest, "no_jira"); 
                    if (FAIL) { return;}   
        
      */           
        
    } catch (Exception ex){
        String AAA = ex.getMessage(); _t++; _f++;
        EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
        Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
    }     
    } 
    
    //This block clicks Menu Manager, selects group that was selected in GUI, searches and clicks on the global menu that was selected in jtt
    public void selectingGlobalMenu() {
    //<editor-fold defaultstate="collapsed" desc="Select Global Menu">
    //This block clicks Menu Manager, selects group that was selected in GUI, searches and clicks on the global menu that was selected in jtt    
    try {                   
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
        Find_Text("Find 'Search...' text", "Search Global Menus", true,ParentTest, "no_jira");
            if (FAIL) { return;}

        Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Global Menus')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Global Menus']", GL_MENU, false, ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click searched Global menu", "xpath", "//span[@id='item-label-0']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", ParentTest, "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500);
        Element_By_Path_Click("Click  Global Menu", "xpath", "//span[@id='global-menu-label']", ParentTest, "no_jira");
            if (FAIL) { return;}
        Wait_For_Element_By_Path_Presence("Wait for Menu List", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            if (FAIL) { return;}   
        
        
        
    } catch (Exception ex){}   // =============================================  
    }
    //</editor-fold>
      
    public void readExcel(String filePath, String fileName, String sheetName) {
    //<editor-fold defaultstate="collapsed" desc="Read Excel">
        //This block reads and gets the cell value of from the exported menuset excel file
    try {              
        File file =    new File(filePath+ "/" +fileName);//Create an object of File class to open xlsx file 
        FileInputStream inputStream = new FileInputStream(file);//Create an object of FileInputStream class to read excel file
        Workbook menusetworkbook = null;
        
        String fileExtensionName = fileName.substring(fileName.indexOf("."));//Find the file extension by splitting file name in substring  and getting only extension name
        
        if(fileExtensionName.equals(".xlsx")){//Check condition if the file is xlsx file       
            menusetworkbook = new XSSFWorkbook(inputStream);//If it is xlsx file then create object of XSSFWorkbook class
        } else if(fileExtensionName.equals(".xls")){ //Check condition if the file is xls file       
            menusetworkbook = new HSSFWorkbook(inputStream);//If it is xls file then create object of HSSFWorkbook class
        }
        
        Sheet menusetsheet = menusetworkbook.getSheet(sheetName);//Read sheet inside the workbook by its name
       
        int rowCount = menusetsheet.getLastRowNum() - menusetsheet.getFirstRowNum(); //Find number of rows in excel file
        //Create a loop over all the rows of excel file to read it
       // for (int i = 0; i < rowCount+1; i++) {
        Row row = menusetsheet.getRow(0);       
        if(row.getCell(0).getStringCellValue().equals("Record Type")){                                      
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,0: " + row.getCell(0).getStringCellValue() + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else {           
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,0: Test Failed" + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }                    
        if(row.getCell(1).getStringCellValue().equals("Category ID")){             
            _t++;
            _p++; EX += _t + "\t" +  "Cell 0,1: " + row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue()+ "\t" + "Category ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                             
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,1: " + row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Category ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(2).getStringCellValue().equals("Category Name")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,2: " +row.getCell(2).getStringCellValue() + "\t" + row.getCell(2).getStringCellValue() + "\t" + "Category Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,2: " + row.getCell(2).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Category Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }        
        if(row.getCell(3).getStringCellValue().equals("Category Sequence On Ticket")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,3: " + row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Sequence On Ticket" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" +  "Cell 0,3: " + row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Sequence On Ticket" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }        
        if(row.getCell(4).getStringCellValue().equals("Category Enabled")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,4: " + row.getCell(4).getStringCellValue() + "\t" + row.getCell(4).getStringCellValue() + "\t" + "Category Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,4: " + row.getCell(4).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Category Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }           
        if(row.getCell(5).getStringCellValue().equals("Item ID")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,5: " + row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Item ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,5: " + row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Item ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(6).getStringCellValue().equals("Item Name")){             
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,6: " + row.getCell(6).getStringCellValue() + "\t" + row.getCell(6).getStringCellValue() + "\t" + "Item Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                  
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,6: " +row.getCell(6).getStringCellValue()+ "\t" + row.getCell(6).getStringCellValue() + "\t" + "Item Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(7).getStringCellValue().equals("Price")){    
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Price" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Price" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(8).getStringCellValue().equals("Calories")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,8: " +row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue()+ "\t" + "Calories" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                      
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,8: " + row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue() + "\t" + "Calories" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(9).getStringCellValue().equals("Description")){
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,9: " + row.getCell(9).getStringCellValue() + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Description" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                   
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,9: " +row.getCell(9).getStringCellValue()  + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Description" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(10).getStringCellValue().equals("Item Sequence On Ticket")){           
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,10: " + row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Item Sequence On Ticket" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                             
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,10: " + row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Item Sequence On Ticket" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(11).getStringCellValue().equals("PLU")){
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,11: " +row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue() + "\t" + "PLU" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,11: " +row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue()+ "\t" + "PLU" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(12).getStringCellValue().equals("Item Enabled")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,12: " + row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue() + "\t" + "Item Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                 
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,12: " + row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue()+ "\t" + "Item Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(13).getStringCellValue().equals("Modifier Group ID")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,13: " + row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "Modifier Group ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                  
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,13: " + row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "Modifier Group ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(14).getStringCellValue().equals("Modifier Group Name")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,14: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue() + "\t" + "Modifier Group Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,14: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue()+ "\t" + "Modifier Group Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }  
          
    } catch (Exception ex){}   // =============================================  
    }
    //</editor-fold>
    
    public void readGlobalModExcel(String filePath, String fileName, String sheetName) {

    //<editor-fold defaultstate="collapsed" desc="Read Global Mod Group Excel">
    //This block reads and gets the cell value of from the exported Global Mod Group excel file
    try {            
        File file =    new File(filePath+ "/" +fileName);             //Create an object of File class to open xlsx file  
        FileInputStream inputStream = new FileInputStream(file);    //Create an object of FileInputStream class to read excel file
        Workbook menusetworkbook = null;                            //Find the file extension by splitting file name in substring  and getting only extension name
        String fileExtensionName = fileName.substring(fileName.indexOf("."));   //Check condition if the file is xlsx file
        if(fileExtensionName.equals(".xlsx")){              //If it is xlsx file then create object of XSSFWorkbook class
            menusetworkbook = new XSSFWorkbook(inputStream);
        } else if(fileExtensionName.equals(".xls")){        //Check condition if the file is xls file      
            menusetworkbook = new HSSFWorkbook(inputStream);     //If it is xls file then create object of HSSFWorkbook class
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
            _p++; EX += _t + "\t" + "Cell 0,0: " + row.getCell(0).getStringCellValue() + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                             
        }else {           
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,0: Test Failed" + "\t" + row.getCell(0).getStringCellValue() + "\t" + "Record Type" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }                    
        if(row.getCell(1).getStringCellValue().equals("Modifier Group ID")){             
            _t++;
            _p++; EX += _t + "\t" +  "Cell 0,1: " + row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue()+ "\t" + "Modifier Group ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,1: " + row.getCell(1).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Modifier Group ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(2).getStringCellValue().equals("Modifier Group Name")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,2: " + row.getCell(2).getStringCellValue() + "\t" + row.getCell(2).getStringCellValue() + "\t" + "Modifier Group Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,2: " + row.getCell(2).getStringCellValue() + "\t" + row.getCell(1).getStringCellValue() + "\t" + "Modifier Group Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }        
        if(row.getCell(3).getStringCellValue().equals("Label")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,3: " + row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Label" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                             
        }else  { 
            _t++;
            _f++; EX += _t + "\t" +  "Cell 0,3: " + row.getCell(3).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Label" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }        
        if(row.getCell(4).getStringCellValue().equals("Minimum Items")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,4: " + row.getCell(4).getStringCellValue() + "\t" + row.getCell(4).getStringCellValue() + "\t" + "Minimum Items" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,4: " + row.getCell(4).getStringCellValue() + "\t" + row.getCell(3).getStringCellValue() + "\t" + "Minimum Items" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
        if(row.getCell(5).getStringCellValue().equals("Maximum Items")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,5: " + row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Maximum Items" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                    
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,5: " + row.getCell(5).getStringCellValue() + "\t" +row.getCell(5).getStringCellValue() + "\t" + "Maximum Items" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(6).getStringCellValue().equals("Sequence On Ticket")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,6: " + row.getCell(6).getStringCellValue() + "\t" + row.getCell(6).getStringCellValue() + "\t" + "Sequence On Ticket" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,6: " +row.getCell(6).getStringCellValue()+ "\t" + row.getCell(6).getStringCellValue() + "\t" + "Sequence On Ticket" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(7).getStringCellValue().equals("Modifier Group Enabled")){
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Modifier Group Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                             
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,7: " + row.getCell(7).getStringCellValue() + "\t" + row.getCell(7).getStringCellValue()  + "\t" + "Modifier Group Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }          
        if(row.getCell(8).getStringCellValue().equals("Modifier ID")){            
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,8: " +row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue()+ "\t" + "Modifier ID" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,8: " + row.getCell(8).getStringCellValue() + "\t" + row.getCell(8).getStringCellValue() + "\t" + "Modifier ID" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(9).getStringCellValue().equals("Modifier Name")){
              _t++;
              _p++; EX += _t + "\t" + "Cell 0,9: " + row.getCell(9).getStringCellValue() + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Modifier Name" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,9: " + row.getCell(9).getStringCellValue()  + "\t" + row.getCell(9).getStringCellValue()  + "\t" + "Modifier Name" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(10).getStringCellValue().equals("Price")){           
            _t++;
             _p++; EX += _t + "\t" + "Cell 0,10: " + row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Price" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,10: " + row.getCell(10).getStringCellValue() + "\t" + row.getCell(10).getStringCellValue() + "\t" + "Price" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(11).getStringCellValue().equals("Calories")){
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,11: " + row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue() + "\t" + "Calories" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
           _t++;
           _f++; EX += _t + "\t" + "Cell 0,11: " + row.getCell(11).getStringCellValue() + "\t" + row.getCell(11).getStringCellValue()+ "\t" + "Calories" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(12).getStringCellValue().equals("Mod Sequence On Ticket")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,12: " + row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue() + "\t" + "Mod Sequence On Ticket" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,12: " + row.getCell(12).getStringCellValue() + "\t" + row.getCell(12).getStringCellValue()+ "\t" + "Mod Sequence On Ticket" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }         
        if(row.getCell(13).getStringCellValue().equals("PLU")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,13: " + row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "PLU" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                              
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,13: " + row.getCell(13).getStringCellValue() + "\t" + row.getCell(13).getStringCellValue() + "\t" + "PLU" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }
        if(row.getCell(14).getStringCellValue().equals("Modifier Enabled")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,14: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue() + "\t" + "Modifier Enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                          
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,14: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(14).getStringCellValue()+ "\t" + "Modifier Enabled" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        } 
        if(row.getCell(15).getStringCellValue().equals("Tax Tags")){             
            _t++;
            _p++; EX += _t + "\t" + "Cell 0,15: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(15).getStringCellValue() + "\t" + "Tax Tags" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";                                          
        }else { 
            _t++;
            _f++; EX += _t + "\t" + "Cell 0,15: " + row.getCell(14).getStringCellValue() + "\t" + row.getCell(15).getStringCellValue()+ "\t" + "Tax Tags" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
        }   
    } catch (Exception ex){}   // =============================================  
    }
     //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Call Company API">    //This block call the company API: BaseAPI + "/menu/company/" +CompanyID
    public  void Call_Company_API(String MenuSetName, int flag) {
    try {            
        Call_API("Call Global Menu API", "Bearer " + AP3_TKN, BaseAPI + "/menu/company/" + CompanyID, true, ParentTest, "no_jira" );        
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            _t++;
            _f++;
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + CompanyID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            return;
        }
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray menus = json.getJSONArray("menus");
         
        for(int k = 0; k < menus.length(); k++) {
            JSONObject menu = menus.getJSONObject(k);
            if(menu.has("location_brand") && menu.getString("location_brand").equals(BrandID)) {
                if(menu.getJSONObject("label").getString("en").equalsIgnoreCase(MenuSetName)) {
                    if(menu.getJSONObject("is").getBoolean("disabled") && flag == 1) {
                        _t++;
                        _p++; EX += _t + "\t" + "Test Passed" + "\t" + "-" + "\t" + "MenuSet is disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("PASS", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode(_t + ". " + "MenuSet is disabled"), new Date());
                     }  else if(!menu.getJSONObject("is").getBoolean("disabled") && flag == 2) {
                        _t++;
                        _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "MenuSet is enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                        Log_Html_Result("PASS", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode(_t + ". " + "MenuSet is enabled"), new Date());
                     } else {
                        _t++;
                        _f++; EX += _t + "\t" + "Test Failed" + "\t" + " - " + "\t" + "Found opposite values" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                        Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + CompanyID , false, ParentTest.createNode(_t + ". " + "Unexpected MenuSet Enabled/Disabled status"), new Date());
                     }  
                 }        
            } 
        }
    } catch (Exception ex){}   // =============================================  
    } 
    //</editor-fold>  
    
    public  void Call_GlobalMenuSet_API(String Menu_ID, String MenuSetName, int flag) {

    //<editor-fold defaultstate="collapsed" desc="Call Global Menuset API">    //This block call the GlobalMenuSet API: BaseAPI + "/menu/" + Menu_ID
    try {    
        Call_API("Call Global MenuSet API", "Bearer " + AP3_TKN, BaseAPI + "/menu/" + Menu_ID, true, ParentTest, "no_jira" );
        if(t.startsWith("{")){
            API_Response_Body = t;               
        }else{
            EX += _t + "\t == " + "API Responce Error" + "\t" + BaseAPI + "/menu/company/" + Menu_ID + "\t" + " - " + "\t" + "FAIL" + "\t" + " - " +
            "\t" + " - " + "\t" + " - " + "\t" + "no_jira" + "\r\n"; 
            Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + Menu_ID , false, ParentTest.createNode(_t + ". " + "API Responce Error"), new Date());
            return;
        }               
        JSONObject json = new JSONObject(API_Response_Body);
        JSONArray groups = json.getJSONArray("groups");
        if(json.has("id") && json.getString("id").equals(Menu_ID.trim())){                                                              
            System.out.println(json.getJSONObject("label").getString("en"));
            if(json.getJSONObject("label").getString("en").equalsIgnoreCase(MenuSetName)){
                if(json.getJSONObject("is").getBoolean("disabled") && flag == 1) {
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " -"  + "\t" + "MenuSet is disabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", "URL: " + BaseAPI + "/menu/company/" + Menu_ID , false, ParentTest.createNode(_t + ". " + "MenuSet is disabled"), new Date());
                } else if(!json.getJSONObject("is").getBoolean("disabled") && flag == 2) {
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "MenuSet is enabled" + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", "URL: " + BaseAPI + "/menu/company/" + Menu_ID , false, ParentTest.createNode(_t + ". " + "MenuSet is enabled"), new Date());
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Test Failed" + "\t" + " -"  + "\t" + "Found opposite values" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "URL: " + BaseAPI + "/menu/company/" + Menu_ID , false, ParentTest.createNode(_t + ". " + "Unexpected MenuSet Enabled/Disabled status"), new Date());
                }                                              
            }                                      
        }   

    } catch (Exception ex){}   // =============================================  
    } 
    //</editor-fold>
}
