/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import static A.A.FAIL;
import static A.A.L0;
import static A.A.L1;
import static A.A.L2;
import static A.A.T_Index;
import static A.A._t;
import static A.A.e1;
import static A.A.sleep;
import static A.A.t;
import A.TWeb;
import static AP3.AP3.ADMIN_ID;
import static AP3.AP3.ADMIN_PW;
import static AP3.AP3.GL_MENU;
import static AP3.AP3.SECTOR;
import static AP3.AP3.url;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.openqa.selenium.io.Zip;

/**
 *
 * @author dhruv.seth
 */
public class AP3_export_menuset {
    
     String storemenuset = "";
    
     public static void run() throws InterruptedException, FileNotFoundException, IOException { 
        
         String storemenuset = "";
         
        /*
       selectingGlobalMenu();
        
      
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'EDIT MENU'", "xpath", "//*[contains(text(), 'EDIT MENU')]", "no_jira"); 
            if (FAIL) { return;} 
        Thread.sleep(500);  
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}   
        Thread.sleep(500);
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
            if (FAIL) { return;}
            
         
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;} 
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");            
                    if (FAIL) { return;}
                }              
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 2), "tagName", "button", "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Added Menu Set 'dots' Click", L2.get(1), "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira"); 
                    if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; TWeb.Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  "no_jira");             
                    if(t.contains("Export")){ T_Index = i; }
                }
          _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Check if Export is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", "no_jira");
                if (FAIL) { return;}  
                
            Thread.sleep(500);    

            logout();
                     
            Admin_IDLogin();
           
           */
           //Admin_IDLogin();
      
            selectingGlobalMenu();
            
            _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;}
             _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Find 'Last/Editing...' text", "xpath", "//span[@class='v-chip__content']", "textContent","no_jira"); 
            if (FAIL) { return;}
            
         
        _t++; Thread.sleep((long) sleep); TWeb.List_L0("Published Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", "no_jira");             
                if (FAIL) { return;} 
                for (int i = 0; i < L0.size(); i++) {
                    _t++; TWeb.Element_Attribute("Menu (Index " + i + ") Name", L0.get(i), "textContent", "no_jira");            
                    if (FAIL) { return;}                   
                } 
                
             _t++; TWeb.Element_Attribute("Menu setName", L0.get(0), "textContent", "no_jira");      
                storemenuset= t;
                System.out.println(t);
                                          
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L2("Find Added Menu Set - dots", L0.get(L0.size() - 2), "tagName", "button", "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(500);
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Added Menu Set 'dots' Click", L2.get(1), "no_jira");
                if (FAIL) { return;}   
            Thread.sleep(1000);
            _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira"); 
                    if (FAIL) { return;}                
            _t++; Thread.sleep((long) sleep); TWeb.Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", "no_jira");
                if (FAIL) { return;}
            _t++; Thread.sleep((long) sleep); TWeb.Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", "no_jira");                                     
                if (FAIL) { return;}
                T_Index = -1;
                for (int i = 0; i < L1.size(); i++) {
                    _t++; TWeb.Element_Text("Menu Edit Option (index " + i + ")", L1.get(i),  "no_jira");                      
                    if(t.contains("Export")){ T_Index = i; }                    
                } 
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Text("Getting the export text from the active class", "xpath", "//div[@class='v-menu__content theme--light menuable__content__active']//div[@class='v-list__tile__title'][normalize-space()='Export']", "no_jira");                
                if (FAIL) { return;}    
            _t++; Thread.sleep((long) sleep);TWeb.Element_By_Path_Attribute("Check if rename is disabled", "xpath", ".//div[@class='v-list--disabled']", "disabled", "no_jira");
                if (FAIL) { return;}
            
                
            _t++; Thread.sleep((long) sleep); TWeb.Element_Click("Click Category 'Export'", L1.get(T_Index), "no_jira");
                if (FAIL) { return;}
            
           
            Thread.sleep(3000);  
            
             LocalDate date = LocalDate.now(); 
             System.out.println(date);
             
             //DateTimeFormatter Dayofdate = DateTimeFormatter.ofPattern("yyyy-mm-dd");
             //Dayofdate.format(date);
             
            String menusetfile =storemenuset.trim()+ " - " + date +".zip";    // Lunch - 2021-06-15.zip
                                                                       // Lunch - 2021-06-15
            System.out.println(menusetfile);
            
            String test1= System.getProperty("user.home") + File.separator + "Downloads";
            System.out.println(test1);
        
            /*
             LocalDate date = LocalDate.now(); 
             DateTimeFormatter Dayofdate = DateTimeFormatter.ofPattern("yyyy-mm-dd");
             Dayofdate.format(date);
             
            String menusetfile = storemenuset+ File.separator + Dayofdate.format(date);
            
            System.out.println(menusetfile);
            */
            
            Thread.sleep(3000);
            String destinationDir=System.getProperty("user.home") + File.separator + "Downloads"+File.separator;
            
            //Zip.unzip(new FileInputStream(destinationDir), new File(menusetfile));
            /*
            _t++; Thread.sleep((long) sleep); TWeb.File_Find("Find Report File", System.getProperty("user.home") + File.separator + "Downloads", "Lunch - 2021-06-15.zip", "no_jira");
            //if (FAIL) { return;} 
            //if(!"".equals(t)){                      
            
            _t++; Thread.sleep((long) sleep); TWeb.File_Delete("Delete Report File", System.getProperty("user.home") + File.separator + "Downloads",menusetfile , "no_jira");
                    if (FAIL) { return;}                                                                                                                             // Lunch - 2021-06-15.zip
            }                                                          
             */
         
            Thread.sleep(500);
            
          //String destinationDir=System.getProperty("user.home") + File.separator + "Downloads"+File.separator;
   
          
         
         
         
        
    
    
     } // run time closing bracket
     
      String destinationDir=System.getProperty("user.home") + File.separator + "Downloads"+File.separator;
     
     public File newUnzipFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }
        return destFile;
    }
    public String Unzip_Build (){  
        String appBuldFile = "";
        String dir = System.getProperty("user.home") + File.separator + "Downloads"; 
        File zip_source = new File(dir + File.separator + "x.zip");
        File destDir = new File(dir);
        byte[] buffer = new byte[1024];
        try {
            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zip_source))) {
                ZipEntry zipEntry = zis.getNextEntry();
                appBuldFile = zipEntry.getName();
                while (zipEntry != null) {
                    File newFile = newUnzipFile(destDir, zipEntry);
                    if (zipEntry.isDirectory()) {
                        //
                    } else { // fix for Windows-created archives
//                        File zipParent = newFile.getParentFile(); 
//                        if (!zipParent.isDirectory() && !zipParent.mkdirs()) {
//                            return "== " + "Failed to create directory " + zipParent + "\r\n";
//                        }
                        FileOutputStream fos = new FileOutputStream(newFile);
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                        fos.close();
                    }
                    zipEntry = zis.getNextEntry();
                }
                zis.closeEntry();
                zis.close();
            }
            return "== " + "Unzipped Build OK: " + appBuldFile + "\r\n"; 
        } catch (IOException ex) { 
            return "== " + "Unzip_Build: " + ex.getMessage() + "\r\n";
        }
    }
     
    
     //Me: my login
    public static void Admin_IDLogin() throws InterruptedException{
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Email", "css", "[aria-label='E-mail']", ADMIN_ID, false, "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text_Enter("Enter Valid Password", "css", "[aria-label='Password']", ADMIN_PW, true, "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Sign In'", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Visibility("Wait for 'AP3 Welcome...' text", "xpath", "//*[contains(text(), 'Welcome to the CDL Admin Panel')]", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("AP3 Dashboard URL", "no_jira");             
            if (FAIL) { return;}                       
    }
     
     public static void ap3LoginPage() throws InterruptedException{
        _t++; Thread.sleep((long) sleep); TWeb.Navigate_to_URL("Navigate to", url,"no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("AP3 Login page", "no_jira");             
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Welcome to >", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[2]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Email Text", "xpath", "//*[contains(text(), 'E-mail')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Text("Sign In Text", "xpath", "//*[contains(text(), 'Sign in')]", "no_jira"); 
            if (FAIL) { return;}  
        _t++; TWeb.Element_By_Path_Text("Forgot Password Text", "xpath", "//*[contains(text(), 'Forgot Password?')]", "no_jira"); 
            if (FAIL) { return;}    
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Email Clear", "xpath", ".//input[@type='text']",  "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Input_Select_Clear("Password Clear", "xpath", ".//input[@type = 'password']", "no_jira"); 
            if (FAIL) { return;}     
     }
     
     
     //User logout
    public static void logout() throws InterruptedException{
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'User Name'", "css", "div[class='v-btn__content'] div[class='flex xs12']", "no_jira");
            if (FAIL) {return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Click 'Logout'", "xpath", "//*[contains(text(), 'Logout')]", "no_jira");
            if (FAIL) {return;}   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text("Welcome Prompt", "xpath", "//*[@id='operator']/div/main/div/div[2]/div[2]/div/div/form/div[1]", "no_jira"); 
            if (FAIL) { return;}    
    }
     
 //Export Automation tickets AUT-876
          //This method clicks Menu Manager, selects group that was selected in jtt, searches and clicks on the global menu that was selected in jtt
        public static void selectingGlobalMenu() throws InterruptedException{ 
        _t++; Thread.sleep((long) sleep); TWeb.Move_to_Element_By_Path("Open Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "no_jira");             
            if (FAIL) { return;}
        Thread.sleep(500);          
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Drawer > 'Menu Manager' Click", "xpath", "//*[contains(text(), 'Menu Manager')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep(200); TWeb.Move_out_of_Element_By_Path("Close Dashboard Drawer", "xpath", "//aside[contains(@class, 'navigation-drawer')]", "Right", 2, 0,"no_jira");             
            if (FAIL) { return;}
         
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;}         
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;}              
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Menu Manager page URL", "no_jira"); 
            if (FAIL) { return;}   
        _t++; TWeb.Find_Text("Button 'Go to Menu' text", "Go to menus", true,"no_jira");   
            if (FAIL) { return;}
        _t++; TWeb.Element_By_Path_Attribute("Button 'Go to Menu' state", "xpath", "//button[contains(@class, 'v-btn v-btn--disabled theme--light primary--text')]", "disabled","no_jira");
            if (FAIL) { return;}
            
        // =========================================== Group Selection
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Open 'Group' dropdown", "css", "[role='combobox']", "no_jira");
            if (FAIL) return;   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Sector Name", "css", "[role='combobox']", SECTOR, false, "no_jira");
            if (FAIL) { return;}    
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Sector Name Click", "xpath", "//*[contains(text(), '" + SECTOR + "')]", "no_jira"); 
            if (FAIL) { return;}     
        
        _t++; TWeb.Element_By_Path_Click("Button 'Go to Menu' Click", "xpath", "//button[contains(@class, 'v-btn theme--light primary')]", "no_jira");
            if (FAIL) { return;}
        Thread.sleep(500); 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_All_Elements_InVisibility("Wait for 'progress'...", "xpath", "//*[contains(@class, 'progress')]", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Wait_For_Element_By_Path_Presence("Wait for MM > Group page load", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "no_jira"); 
                if (FAIL) { return;}
        // ========================================= Group Selection ^^^^
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page Title", "xpath", "//div[contains(@class, 'H3-Primary')]", "textContent", "no_jira"); 
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Page_URL("Menu > " + SECTOR + " page URL", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Find_Text("Button 'Add Global Menu' text", "ADD GLOBAL MENU", true,"no_jira");   
            if (FAIL) { return;} 
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Attribute("Page SubTitle", "xpath", "//ul[@class='v-breadcrumbs breadcrumbs v-breadcrumbs--large theme--light']", "textContent", "no_jira"); 
            if (FAIL) { return;}
        _t++; TWeb.Find_Text("Find 'Search...' text", "Search Menus", true,"no_jira");   
            if (FAIL) { return;}  
                   
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Search Menus Click", "xpath", "//label[contains(text(), 'Search Menus')]", "no_jira"); 
            if (FAIL) { return;}
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Text_Enter("Enter Global Menu Search", "css", "[aria-label='Search Menus']", GL_MENU, false, "no_jira");
            if (FAIL) { return;} 
        Thread.sleep(500);
        
        _t++; Thread.sleep((long) sleep); TWeb.Element_By_Path_Click("Search Menus Click", "xpath", "//div[normalize-space()='View GLobal Menus']", "no_jira"); 
            if (FAIL) { return;}
        Thread.sleep(500); 
}

}
