package AP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author roya.jacob
 */
class AP3_mm_import_mod extends AP3_GUI{
    String Excel_Edit = "";
    String Export_File_Name = "";   
    String Backup_File_Name = "";
    String Download_Dir = System.getProperty("user.home") + File.separator + "Downloads";  
    String[] ValuesToWrite;
    protected AP3_mm_import_mod (AP3_GUI a) {
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
        
        _All_data = a._All_data;
        New_ID = a.New_ID;
        TZone = a.TZone;
    } 
    protected void run() { 
        try{
            Navigate_to_URL("Navigate to Global Modifiers", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Element_By_Path_Click("Click Global mod Export ", "xpath", "//div[contains(text(),'Export')]//i", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(7000);
            Export_File_Name = GL_MENU.trim() + "-global-modifier-groups-" + LocalDate.now();
            //Path path = Paths.get(Download_Dir + File.separator + Export_File_Name + File.separator + ".zip");
//            for(int i = 0; i < 20; i++){
//                //if(Files.exists(path)){
//                if(Files.isReadable(path)){
//                    break;
//                }else{
//                    Thread.sleep(500);
//                }
//            }  
            File_Find("Find Global mod exported Zip File", Download_Dir, Export_File_Name, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            File_UnZip("Unzip global mod export Zip file ", Download_Dir, t, ParentTest, "no_jira");
                if (FAIL) { return;}          
            File_Delete("Delete Exported Zip File", Download_Dir,t, ParentTest, "no_jira");
                if (FAIL) { return;}  
                
            Export_File_Name = GL_MENU.trim() + "-global-modifier-groups.xlsx";
            Backup_File_Name = GL_MENU.trim() + "-global-modifier-groups" + "_Backup.xlsx";
            File_Copy("Create Exported File Copy", Download_Dir + File.separator + Export_File_Name, Download_Dir + File.separator + Backup_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}             
            
            Excel_Edit = Excel_Edit_DataRow(Download_Dir,Export_File_Name,"Modifier Groups");
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Excel Data row Edit ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            }             
            //                             0           1                2                     3                       4    5    6     7     8   9   10  11  12  13  14  15 
            ValuesToWrite = new String[] {"Modifier Group", "", "Auto Mod group " + New_ID, "Automation Label " + New_ID, "0", "1", "2", "TRUE", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir,Export_File_Name,"Modifier Groups",ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            }    
            //                                0      1   2   3   4   5   6   7   8           9                   10    11   12     13       14        15 
            ValuesToWrite = new String[] {"Modifier", "", "", "", "", "", "", "", "", "Automation Mod " + New_ID, "5", "20", "1", "600200", "TRUE", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            Element_By_Path_Text_Enter("Upload xlsx file", "id", "globalModsImportInput", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}            
//            Thread.sleep(1000);
//            Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
//                if (FAIL) { return;}
//            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
//                if (FAIL) { return;}
//            Thread.sleep(1000);
//
//            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@id='globalModsImportInput'][@type='file'][@accept='.xlsx']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
//                if (FAIL) { return;}

            Thread.sleep(1000);
            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            Thread.sleep(500);
            List_L0("Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (FAIL) {return;} 
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Errors List: (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");                         
                }            
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
            
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira"); 
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}  

            //Validating if the import is successfull when the chit# field is empty   
//            Excel_Edit = Excel_Convert_PLU(Download_Dir,Export_File_Name,"Modifier Groups");
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Modify PLU data ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                Delete_Test_Items();
//                return;
//            } 
            
            ValuesToWrite = new String[] {"Modifier Group", "", "DS Mod group " + New_ID, "DS Auto Label " + New_ID, "0", "1", "89", "TRUE", "", " ", " ", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            }             
            ValuesToWrite = new String[] {"Modifier", "", "", "", "", "", "", "", "", "DS Mod " + New_ID, "5", "20", "89", "890", "TRUE", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            }             
            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Thread.sleep(1000);
//            Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
//                if (FAIL) { return;}
//            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
//                if (FAIL) { return;}
//            Thread.sleep(1000);
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");              
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}  
                
            //Import Excel to a modifier group Negative Scenarios:                 
            //1) Empty modifier group name , label and empty modifier name
//            Excel_Edit = Excel_Convert_PLU(Download_Dir,Export_File_Name,"Modifier Groups");
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Modify PLU data ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                Delete_Test_Items();
//                return;
//            }       
            ValuesToWrite = new String[] {"Modifier Group", "", "", "", "0", "1", "89", "TRUE", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            ValuesToWrite = new String[] {"Modifier", "", "", "", "", "", "", "", "", "", "5", "20", "89", "890", "TRUE", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (FAIL) {return;} 
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("Errors List: (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");                         
                }
            Thread.sleep(500);
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");             
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}  

            ValuesToWrite = new String[] {"", "Test: Missing Record type", "Missing Record type", "", "5", "9", "8", "TRUE", "", "", "", "", "", "", "", ""};             
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            
            ValuesToWrite = new String[] {"", "", "", "", "", "", "", "", "", "Item Missing Record Type", "5", "9", "89", "598", "TRUE", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (FAIL) {return;} 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Errors List: (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");            
                if(L0.get(i).getAttribute("textContent").contains("Invalid \"Record Type\". Should be \"Modifier Group\" or \"Modifier\".")){
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "Correct Error Found: " + L0.get(i).getAttribute("textContent") + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", L0.get(i).getAttribute("textContent"), false, ParentTest.createNode(_t + ". " + "Invalid Record Type. Should be Modifier Group or Modifier."), new Date());                       
                } else {
                   _t++;
                   _f++; EX += _t + "\t" + "Test Failed" + "\t" + " - " + "\t" + "Found incorrect errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            }
            Thread.sleep(500);
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");              
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}  


            ValuesToWrite = new String[] {"Modifier Group", "", "Missing Enabled", "Missing Enabled", "0", "1", "89", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            
            //4) Import file with Empty Modifier Group Enabled Missed           
            ValuesToWrite = new String[] {"Modifier", "", "", "", "", "", "", "", "", "DS Mod Missing True", "5", "20", "89", "890", "", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
               if (FAIL) { return;}
            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (FAIL) {return;} 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Errors List: (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");            
                    if (FAIL) { return;}
                if(L0.get(0).getAttribute("textContent").contains("\"Modifier Group Enabled\" is a required field. Please enter a boolean value. (TRUE/FALSE)")){
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "Correct Error Found: " + L0.get(0).getAttribute("textContent") + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", L0.get(0).getAttribute("textContent"), false, ParentTest.createNode(_t + ". " + " \"Modifier Group Enabled\" must be a boolean. (TRUE/FALSE)"),new Date());                       
                } else {
                   _t++;
                   _f++; EX += _t + "\t" + "Test Failed" + "\t" + " - " + "\t" + "Found incorrect errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
                if(L0.get(1).getAttribute("textContent").contains("\"Modifier Enabled\" is a required field. Please enter a boolean value. (TRUE/FALSE)")){
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "Correct Error Found: " + L0.get(1).getAttribute("textContent") + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", L0.get(1).getAttribute("textContent"), false, ParentTest.createNode(_t + ". " + " \"Modifier Enabled\" must be a boolean. (TRUE/FALSE)"),new Date());                       
                } else {
                   _t++;
                   _f++; EX += _t + "\t" + "Test Failed" + "\t" + " - " + "\t" + "Found incorrect errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }
            }
            Thread.sleep(500);
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");               
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}  
                
            //5) Import file with Decimals         
//            ValuesToWrite = new String[] {"Modifier Group","","Test Decimals","Test Decimals","0","1","9.1","TRUE","","","","","","","",""};
//            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                return;
//            } 
//            ValuesToWrite = new String[] {"Modifier","","","","","","","","","DS Mod Decimals","5.1","1.20","8.9","8.10","TRUE","[\"Prepared\"]"};
//            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                return;
//            } 
//            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
//                 if (FAIL) { return;}
//            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
//            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
//                if (FAIL) { return;}
//            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");               
//            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
//                if (FAIL) { return;}  
            

            //5) Import file with Price more than $200
//            Excel_Edit = Excel_Convert_PLU(Download_Dir,Export_File_Name,"Modifier Groups");
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Modify PLU data ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                Delete_Test_Items();
//                return;
//            } 
            ValuesToWrite = new String[] {"Modifier Group", "", "Test 200", "Test Price 200", "0", "1", "9", "TRUE", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            ValuesToWrite = new String[] {"Modifier", "", "", "", "", "", "", "", "", "DS Mod 200", "221", "110", "89", "810", "TRUE", "[\"Prepared\"]"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, "Modifier Groups", ValuesToWrite);
            if(Excel_Edit.contains("Error")){
                _t++;
                _w++;
                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
                Delete_Test_Items();
                return;
            } 
            Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            Find_Text("Find Import Errors Notification", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            Thread.sleep(1000);
            List_L0("Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (FAIL) {return;} 
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Errors List: (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");            
                if(L0.get(i).getAttribute("textContent").contains("Modifier \"Price\" must be a number from 0 to 200.")){
                    _t++;
                    _p++; EX += _t + "\t" + "Test Passed" + "\t" + " - " + "\t" + "Correct Error Found: " + L0.get(i).getAttribute("textContent") + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n"; 
                    Log_Html_Result("PASS", L0.get(i).getAttribute("textContent"), false, ParentTest.createNode(_t + ". " + "Modifier 'Price' must be a number from 0 to 200."),new Date());                       
                } else {
                    _t++;
                    _f++; EX += _t + "\t" + "Test Failed" + "\t" + " - " + "\t" + "Found incorrect errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", L0.get(i).getAttribute("textContent"), false, ParentTest.createNode(_t + ". " + "incorrect errors > Modifier 'Price' must be a number from 0 to 200."),new Date());                       
                }
            }
            Thread.sleep(500);
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");

            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");
             
            Delete_Test_Items(); // ==================  
      
        } catch (Exception ex){
            String AAA = ex.getMessage(); _t++; _f++;
            EX += " - " + "\t" + "Run() Exeption:" + "\t" + "Error:" + "\t" + AAA + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\r\n";
            Log_Html_Result("FAIL", "Error: " + AAA, false, ParentTest.createNode(_t + ". Run() Exeption: " + AAA), new Date());
        }
    }

    public void Delete_Test_Items(){// Delete Imported Items >>> "XXXX " + New_ID
        try{            
            File_Delete("Delete " + Backup_File_Name + " file", Download_Dir, Backup_File_Name, ParentTest, "no_jira");
            Refresh("Refresh", ParentTest, "no_jira");
            Thread.sleep(500);
            List_L1("Get Modifier groups data rows list", "tagName", "tr", ParentTest, "no_jira"); 
            for(int i = (L1.size() - 1); i >= 0; i--) {
                Element_Text("Get Mod Group " + i + " data row", L1.get(i), ParentTest, "no_jira"); 
                if(t.endsWith(New_ID)){
                    Element_Child_Click("New Auto Test Mod Group " + i + " > Click 'delete icon'", L1.get(i),"xpath", ".//i[contains(@class,'mdi-delete')]", ParentTest, "np_jira");
                        if (FAIL) { return;}     
                }        
            }
            Thread.sleep(1000);
            Element_By_Path_Click("Click > 'Publish'", "xpath", "//*[contains(text(),'publish')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Wait_For_Element_By_Path_Presence("Wait for publication", "xpath", "//*[contains(text(),'publish')]/parent::button[contains(@class,'disabled')]", ParentTest,"no_jira");
                if (FAIL) { return;}
            Thread.sleep(1000);            
        } catch (Exception ex){
            // 
        }
    }   
    private String Excel_Convert_PLU(String filePath, String fileName, String sheetName) {
        try{
            File file = new File(filePath + File.separator + fileName);            //Create an object of File class to open xlsx file
            FileInputStream inputStream = new FileInputStream(file);    //Create an object of FileInputStream class to read excel file
            Workbook _Workbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            
            if(fileExtensionName.equals(".xlsx")){
                _Workbook = new XSSFWorkbook(inputStream);   //If it is xlsx file then create object of XSSFWorkbook class
            } else if(fileExtensionName.equals(".xls")){
                _Workbook = new HSSFWorkbook(inputStream);   //If it is xls file then create object of HSSFWorkbook class
            }    
            Sheet sheet = _Workbook.getSheet(sheetName);   //Read excel sheet by sheet name    

            for(int j = 1; j <= sheet.getLastRowNum(); j++){          
                Row row = sheet.getRow(j);               //Get the  row from the sheet
                Cell cell = row.getCell(13);
                if(cell != null) {  
                    try {
                        cell.getStringCellValue();
                    } catch (Exception ex)  {
                        continue;
                    } 
                    cell.setCellValue(Integer.parseInt(cell.getStringCellValue()));
                } 
            }
            inputStream.close(); 
            FileOutputStream outputStream = new FileOutputStream(file); //Create an object of FileOutputStream class to create write data in excel file
            _Workbook.write(outputStream);                        //write data in the excel file
            outputStream.close();                                       //close output stream
            return "OK";
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        } 
    }
    private String Excel_Edit_DataRow(String filePath, String fileName, String sheetName) {
        try {
            File file = new File(filePath + File.separator + fileName);      //Create an object of File class to open xlsx file
            FileInputStream inputStream = new FileInputStream(file);         //Create an object of FileInputStream class to read excel file
            Workbook _Workbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            int flag_modifier = -1;
            int flag_modifiergroup = -1;
            if(fileExtensionName.equals(".xlsx")) {
                _Workbook = new XSSFWorkbook(inputStream);        //If it is xlsx file then create object of XSSFWorkbook class
            } else if(fileExtensionName.equals(".xls")){
               _Workbook = new HSSFWorkbook(inputStream);          //If it is xls file then create object of XSSFWorkbook class
            }    
            Sheet sheet = _Workbook.getSheet(sheetName);         //Read excel sheet by sheet name    
            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();      //Get the current count of rows in excel file
            if(rowCount != 1) {       //If modifier group/modifier exist
                for(int i = sheet.getLastRowNum(); i > 1; i--) {
                    Row row = sheet.getRow(i);       
                    Cell cell = row.getCell(0);
                    if(cell.getStringCellValue().equals("Modifier") && flag_modifier != 1) {
                        row.getCell(9).setCellValue("Update Auto Mod " + New_ID);
                        if(row.getCell(10) == null) {
                            row.createCell(10).setCellValue(10);
                        } else {
                            row.getCell(10).setCellValue(10);                               
                        } 
                        if(row.getCell(11) == null) {
                            row.createCell(11).setCellValue(30);
                        } else {
                            row.getCell(11).setCellValue(30);                               
                        } 
                        if(row.getCell(12) == null) {
                            row.createCell(12).setCellValue(6);
                        } else {
                            row.getCell(12).setCellValue(6);                               
                        }
                        if(row.getCell(13) == null) {
                            row.createCell(13).setCellValue(650000);
                        } else {
                            row.getCell(13).setCellValue(650000);                               
                        } 
                        row.getCell(15).setCellValue("[\"Carbonated Beverage\"]");
                        flag_modifier = 1;
                    } else if (cell.getStringCellValue().equals("Modifier Group") && flag_modifiergroup != 1) {
                        row.getCell(2).setCellValue("Update Auto group " + New_ID);
                        row.getCell(3).setCellValue("Update Auto label" + New_ID);
                        row.getCell(4).setCellValue(0);
                        row.getCell(5).setCellValue(1);
                        if(row.getCell(6) == null) {
                            row.createCell(6).setCellValue(6);
                        } else {
                            row.getCell(6).setCellValue(6);                               
                        }
                        // row.getCell(7).setCellValue(Boolean.TRUE);
                        flag_modifiergroup = 1;
                    }                            
                }
            }
            inputStream.close(); 
            FileOutputStream outputStream = new FileOutputStream(file);   //Create an object of FileOutputStream class to create write data in excel file
            _Workbook.write(outputStream);                          //write data in the excel file
            outputStream.close();                                         //close output stream
            return "OK";
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        } 
    } 
    private String Excel_New_DataRow(String filePath, String fileName, String sheetName, String[] dataToWrite) {
        try{
            File file = new File(filePath + File.separator + fileName);           //Create an object of File class to open xlsx file
            FileInputStream inputStream = new FileInputStream(file);     //Create an object of FileInputStream class to read excel file
            Workbook _Workbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            if(fileExtensionName.equals(".xlsx")){
                _Workbook = new XSSFWorkbook(inputStream);   //If it is xlsx file then create object of XSSFWorkbook class
            } else if (fileExtensionName.equals(".xls")){
                _Workbook = new HSSFWorkbook(inputStream);    //If it is xls file then create object of XSSFWorkbook class
            }    
            Sheet sheet = _Workbook.getSheet(sheetName);                //Read excel sheet by sheet name    
            int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();    //Get the current count of rows in excel file
            Row row = sheet.getRow(0);                                //Get the first row from the sheet
            Row newRow = sheet.createRow(rowCount + 1);                     //Create a new row and append it at last of sheet
            
            //                                0           1                2                      3                     4    5    6     7     8   9   10  11  12  13  14  15 
            //String[] ValuesToWrite = {"Modifier Group", "", "Auto Mod group " + New_ID, "Automation Label " + New_ID, "0", "1", "2", "TRUE", "", "", "", "", "", "", "", ""};           
            for(int j = 0; j < row.getLastCellNum(); j++){           //Create a loop over the cell of newly created Row
                Cell cell = newRow.createCell(j);     //Fill data in row
                if(j==4 || j==5 || j==6 || j==10 || j==11 || j==12 || j==13 ) {
                    if (!dataToWrite[j].trim().equals("")) { 
                        cell.setCellValue(Integer.parseInt(dataToWrite[j].trim()));
                    } else  { 
                        cell.setCellValue(dataToWrite[j]);
                    }
                } else if ((j==7 || j==14) && dataToWrite[j].equals("TRUE")) {
                    cell.setCellValue(Boolean.TRUE);
                } else if ((j==7 || j==14) && dataToWrite[j].equals("FALSE")){
                    cell.setCellValue(Boolean.FALSE);
                } else {
                     cell.setCellValue(dataToWrite[j]);
                }
            }
            inputStream.close(); 
            FileOutputStream outputStream = new FileOutputStream(file);     //Create an object of FileOutputStream class to create write data in excel file
            _Workbook.write(outputStream);                            //write data in the excel file
            outputStream.close();                                           //close output stream
            return "OK";
        }catch(Exception ex){
            return "Error: " + ex.getMessage();
        } 
    } 
}
