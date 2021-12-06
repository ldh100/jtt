package AP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

/**
 *
 * @author roya.jacob
 */
class AP3_mm_import_menu extends AP3_GUI{
    String API_Response_Body = ""; 
    String AAA = "";
    protected AP3_mm_import_menu (AP3_GUI a) {
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
    String MenuName = "";
    String MenuID = ""; 
    List<WebElement> Menus = null;
    List<WebElement> Menu_IDS = null;
    String Excel_Edit = "";
    String Export_File_Name = "";   
    String Backup_File_Name = "";
    String Download_Dir = System.getProperty("user.home") + File.separator + "Downloads";  
    String[] ValuesToWrite;
    String Errors = "";
    protected void run() { 
        try{
            Navigate_to_URL("Navigate to Sector > Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID, ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            
            List_L0("Get Menus Count", "xpath", "//div[@class='flex xs12 list-item list-item-large']", ParentTest, "no_jira");
            Menus = L0.stream().collect(Collectors.toList());
            List_L0("Get Menus ID(s) Count", "css", "[menu-id]", ParentTest, "no_jira");
            Menu_IDS = L0.stream().collect(Collectors.toList());
            for (int i = 0; i < Menus.size(); i++) {
                Element_Attribute("Menu (Index " + i + ") Name", Menus.get(i), "textContent", ParentTest, "no_jira");
                String temp1 = t;
                Element_Attribute("Menu (Index " + i + ") ID", Menu_IDS.get(i), "menu-id", ParentTest, "no_jira");
                String temp2 = t;                
                    if(i == 0) {
                        MenuName = temp1.trim();
                        MenuID = temp2.trim();
                    }
                }
            Element_Child_List_L2("Find 1st Menu Set - dots", Menus.get(0), "tagName", "button", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Element_Click("1st Menu Set 'dots' Click", L2.get(1), ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Wait_For_Element_By_Path_Presence("Wait for Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_E1_Find("Find Menu Edit Options list", "xpath", "//div[contains(@class, 'v-menu__content theme--light menuable__content__active')]", ParentTest, "no_jira");
                if (FAIL) { return;}
            Element_Child_List_L1("Menu Edit Options list Count", e1,"xpath", ".//div[@class='v-list__tile__title']", ParentTest, "no_jira");
                if (FAIL) { return;}
            T_Index = -1;
            for (int i = 0; i < L1.size(); i++) {
                Element_Text("Menu Edit Option (index " + i + ")", L1.get(i), ParentTest, "no_jira");
                if(t.contains("Export")){ 
                    T_Index = i; 
                }
            }
            Element_Click("Click 'Export'", L1.get(T_Index), ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(5000);            
            Export_File_Name = MenuName + " - " +  LocalDate.now();
            
            File_Find("Find Global Menu Set export Zip file", Download_Dir, Export_File_Name, ParentTest, "no_jira"); 
                if (FAIL) { return;}
            File_UnZip("Unzip Global Menu Set export Zip file ", Download_Dir, t, ParentTest, "no_jira");
                if (FAIL) { return;}          
            File_Delete("Delete Exported Zip File", Download_Dir,t, ParentTest, "no_jira");
                if (FAIL) { return;}  
                                 
            Export_File_Name = MenuName + ".xlsx";
            Backup_File_Name = MenuName + "_Backup.xlsx";
            File_Copy("Create Exported Menuset File Copy", Download_Dir + File.separator + Export_File_Name, Download_Dir + File.separator + Backup_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;} 
    
            Element_Attribute("Get Menu ID (Index 0) - Exported", Menu_IDS.get(0), "menu-id", ParentTest, "no_jira");             
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'As Is' to the Same MenuSet", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            List_L3("Find import Errors list - Expected None", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (!L3.isEmpty()) { 
                    _t++;
                    _f++; EX += _t + "\t" + "Import Errors - Expected None" + "\t" + " - " + "\t" + "Found incorrect errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "Found " + L3.size() + " unexpected error(s)", true,ParentTest.createNode(_t + ". " + "Import Errors - Expected None"), new Date());                       
                    for (int i = 0; i < L3.size(); i++) {
                        Element_Attribute("UnExpected Error (Index " + i + ") Text", L3.get(i), "textContent", ParentTest, "no_jira");
                        Errors += t + "\n";
                    }
                }                 
            
            //  ===========================  Import to other Menu with ID(s)    
            Element_Attribute("Get Menu ID (Index 1) - next after Exported", Menu_IDS.get(1), "menu-id", ParentTest, "no_jira");
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'As Is' to Another MenuSet", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);  
            Find_Text("Find Import Errors Notification - Expected", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Expected Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Expected Error (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira"); 
            }
            Find_Text("Find Error: 'Imported category has \"Category ID\" set, but no matching category was found.'", "but no matching category was found.", true, ParentTest, "no_jira"); 
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
            Thread.sleep(500);  
            
            //  ===========================  Import to other Menu with ID(s) removed and Price '>$200'  
            Excel_Edit = Excel_Edit_DataRow(Download_Dir, Export_File_Name, MenuName, "New_Category_Name"); 
            Excel_Edit = Excel_Edit_DataRow(Download_Dir, Export_File_Name, MenuName, "Price 205"); 
            Element_Attribute("Get Menu ID (Index 1) - next after Exported", Menu_IDS.get(1), "menu-id", ParentTest, "no_jira");
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'Removed ID(s)' to Another MenuSet", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);  
            Find_Text("Find Import Errors Notification - Expected", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Expected Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Expected Error (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");
                Errors += t + "\n";
            }           
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
            
            //  ===========================  Import to other Menu with ID(s) removed   
            File_Copy("Restore Exported File Copy", Download_Dir + File.separator + Backup_File_Name, Download_Dir + File.separator + Export_File_Name, ParentTest, "no_jira");
                if (FAIL) { return;}             
            
            Excel_Edit = Excel_Edit_DataRow(Download_Dir, Export_File_Name, MenuName, "New_Category_Name");  
            Element_Attribute("Get Menu ID (Index 1) - next after Exported", Menu_IDS.get(1), "menu-id", ParentTest, "no_jira");
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'Removed ID(s)' to Another MenuSet", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}  
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);  
            List_L3("Find import Errors list - Expected None", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                if (!L3.isEmpty()) { 
                    _t++;
                    _f++; EX += _t + "\t" + "Find import Errors list - Expected None" + "\t" + " - " + "\t" + "Found unexpected errors" + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", "Found " + L3.size() + " unexpected error(s)", true,ParentTest.createNode(_t + ". " + "Find import Errors list - Expected None"), new Date());                       
                } 

/*
1	          2	            3	            4	             5	           6	      7	         8	  9	         10	          11	         12	13	         14	                  15	                 16	          17	          18
Record Type	Category ID	Category Name	Category Chit #	Category Enabled  Item ID   Item Name	Price	Calories	Description	Item Chit #	PLU	Item Enabled	Modifier Group ID	Modifier Group Name	Tax Tags	Barcodes	Units
*/
            //                               1         2        3            4     5     6   7   8   9   10  11  12  13  14  15  16  17  18
            ValuesToWrite = new String[] {"Category", "", "Cat " + New_ID, "10", "TRUE", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);
//            if(Excel_Edit.contains("Error")){
//                _t++;
//                _w++;
//                EX += "\n - " + "\t" + " ==== Exported file update ===="  + "\t" + "== Write new data row ==" + "\t" + Excel_Edit + "\t" + "WARN" + "\t" + "Execution interrupted" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
//                Log_Html_Result("WARN", Excel_Edit, false, ParentTest.createNode(_t + ". " + " == Exported file update Error =="), new Date());
//                return;
//            } 
            //                               1     2  3   4   5   6     7              8       9    10  11   12         13     14  15  16   17   18            
            ValuesToWrite = new String[] {"Item", "", "", "", "", "", "Item Name X", "200.12", "100", "", "9", "900911", "FALSE", "", "", "[\"Carbonated Beverage\"]", "", "2"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);
            Element_Attribute("Get Menu ID (Index 1) - next after Exported", Menu_IDS.get(1), "menu-id", ParentTest, "no_jira");            
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'With New Rows' to other MenuSet > Expect OK", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            List_L0("Find import Errors list - Expected None", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
                for (int i = 0; i < L0.size(); i++) {
                    Element_Attribute("UnExpected Error (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");
                    Errors += t + "\n";
                }
            //                            1   2   3   4   5   6   7   8   9  10   11  12  13  14  15  16  17  18            
            ValuesToWrite = new String[] {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);
          
            ValuesToWrite = new String[] {"Category", "", "", "a", "", "", "", "", "", "", "", "PLU", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);
            
            ValuesToWrite = new String[] {"Category", "", "Duplicate Name", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite); 
          
            ValuesToWrite = new String[] {"Category", "", "Duplicate Name", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);            

            ValuesToWrite = new String[] {"Item", "", "", "1.2", "", "", "Item Name XXX", "210.99", "100.2", "", "10.2", "PLU", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);

            ValuesToWrite = new String[] {"Modifier Group", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);

            ValuesToWrite = new String[] {"Item", "", "", "", "", "", "", "Price", "Cal", "", "", "90078.9", "", "", "", "Tax Tag", "", "A"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);
            // Duplicate Modifier Group
            ValuesToWrite = new String[] {"Modifier Group", "", "", "", "", "", "", "", "", "", "", "", "", "A3lvmDKMQkfrKlyq5m0qs1MMZD7mEwslL7MDpZDes9eq7w4R7kC7Dm9WdemRUL0OGNGBrXhyZ6z4olzpsqd6qjYZ0", "", "", "", ""};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);                        
            
            ValuesToWrite = new String[] {"Modifier Group", "", "", "", "", "", "", "", "", "", "", "", "", "A3lvmDKMQkfrKlyq5m0qs1MMZD7mEwslL7MDpZDes9eq7w4R7kC7Dm9WdemRUL0OGNGBrXhyZ6z4olzpsqd6qjYZ0", "", "", "", ""};         
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);                                              
            
            ValuesToWrite = new String[] {"Item", "", "", "5", "", "2J8oB5rMkmU8j0gOQJoMukXERLwg98FA3mDYZ0vpHk4vgjGz0PCBLLX3kdP3uPZgYdr", "Item Name XYZ", "1.00", "350", "", "", "900789", "", "", "", "[]", "", "4"};
            Excel_Edit = Excel_New_DataRow(Download_Dir, Export_File_Name, MenuName,  ValuesToWrite);  
       
            Element_Attribute("Get Menu ID (Index 1) - next after Exported", Menu_IDS.get(1), "menu-id", ParentTest, "no_jira");                        
            Element_By_Path_Text_Enter("Import MenuSet " + MenuName + " - 'With New Rows' to other MenuSet > Expect Errors", "xpath", "//input[@id='menuSetImportInput-" + t + "']", Download_Dir + File.separator + Export_File_Name, false, ParentTest, "no_jira"); 
                if (FAIL) { return;}            
            Wait_For_Element_By_Path_InVisibility("Wait for 'progress'", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                if (FAIL) { return;}
            Thread.sleep(500);
            Find_Text("Find Import Errors Notification - Expected", "There were errors while trying to import from your excel sheet.", true, ParentTest, "no_jira");
            List_L0("Expected Import Errors", "xpath", "//div[@class='v-dialog v-dialog--active']//div[@class='v-card__text']//li", ParentTest, "no_jira");             
            for (int i = 0; i < L0.size(); i++) {
                Element_Attribute("Expected Error (Index " + i + ") Text", L0.get(i), "textContent", ParentTest, "no_jira");
                Errors += t + "\n";
            }         
            Element_By_Path_Click("Close Import error dialog box", "xpath", "//div[@class='v-dialog v-dialog--active']//div[contains(text(),'Close')]", ParentTest, "no_jira");
            Thread.sleep(500);
      
            Check_Error("Invalid \"Record Type\". Should be \"Category\", \"Item\", or \"Modifier Group\".");
            Check_Error("Imported item has \"Item ID\" set, but no matching item was found.");
            Check_Error("\"Category Name\" is a required field. Please enter a string value.");
            Check_Error("\"Category Enabled\" is a required field");
            Check_Error("\"Item Name\" is a required field");
            Check_Error("\"Item Enabled\" is a required field");
            Check_Error("\"Calories\" must be a number.");
            Check_Error("\"Calories\" must be a whole number (no decimals).");
            Check_Error("\"Category Chit #\" must be a number.");
            Check_Error("\"Item Chit #\" must be a whole number (no decimals).");
            Check_Error("\"Units\" must be a number.");

            Check_Error("\"Modifier Group ID\" is a required field");
            Check_Error("\"Price\" must be a number.");
            Check_Error("\"Price\" must be a number from 0 to 200.");            
            Check_Error("\"PLU\" must be a number.");
            Check_Error("\"PLU\" must be a whole number (no decimals)");            
            Check_Error("\"Units\" must be a number.");
            Check_Error("Error parsing \"Tax Tags\"");  
            
            File_Delete("Delete " + Export_File_Name + " file", Download_Dir, Export_File_Name, ParentTest, "no_jira");             
            File_Delete("Delete " + Backup_File_Name + " file", Download_Dir, Backup_File_Name, ParentTest, "no_jira");
      
        } catch (Exception ex){
            _t++; _f++; EX += _t + "\t" + "Execution Exception:" + "\t" + "Not Found" + "\t" + ex.getMessage() + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", "Execution Exception", false,ParentTest.createNode(_t + ". " + "Exception: " + ex.getMessage()), new Date());                                       
        }
    }
    
    private void Check_Error(String ExpectedError){
        if(Errors.contains(ExpectedError)){
            _t++; _p++; EX += _t + "\t" + "Expected Error:" + "\t" + "Found" + "\t" + ExpectedError + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("PASS", ExpectedError, false,ParentTest.createNode(_t + ". " + "Expected Error: " + ExpectedError), new Date());                                       
        }else{
            _t++; _f++; EX += _t + "\t" + "Expected Error:" + "\t" + "Not Found" + "\t" + ExpectedError + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
            Log_Html_Result("FAIL", ExpectedError, false,ParentTest.createNode(_t + ". " + "Expected Error Not Found"), new Date());                                       
        }        
    }
    private String Excel_New_DataRow(String filePath, String fileName, String sheetName, String[] dataToWrite) {
        try{
            File file =    new File(filePath+ File.separator + fileName);           //Create an object of File class to open xlsx file
            FileInputStream inputStream = new FileInputStream(file);                //Create an object of FileInputStream class to read excel file
            Workbook _Workbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            if(fileExtensionName.equals(".xlsx")){
                _Workbook = new XSSFWorkbook(inputStream);   //If it is xlsx file then create object of XSSFWorkbook class
            } else if (fileExtensionName.equals(".xls")){
                _Workbook = new HSSFWorkbook(inputStream);    //If it is xls file then create object of XSSFWorkbook class
            }    
            Sheet sheet = _Workbook.getSheet(sheetName);               //Read excel sheet by sheet name    
            int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();    //Get the current count of rows in excel file
            Row row = sheet.getRow(0);                                //Get the first row from the sheet
            Row newRow = sheet.createRow(rowCount + 1);                     //Create a new row and append it at last of sheet
            
            for(int j = 0; j < row.getLastCellNum(); j++){           //Loop over the cells of newly created Row
                Cell cell = newRow.createCell(j);              //Fill data in row
                //cell.setCellValue(dataToWrite[j]);
                if ((j==4 || j==12) && dataToWrite[j].equals("TRUE")) {
                    cell.setCellValue(Boolean.TRUE);
                } else if ((j==4 || j==12) && dataToWrite[j].equals("FALSE")){
                    cell.setCellValue(Boolean.FALSE);
                } else if( j==7 && dataToWrite[j].equals("210.99")) { // price > 200
                    cell.setCellValue( Double.parseDouble(dataToWrite[j].trim()));
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
    private String Excel_Edit_DataRow(String filePath, String fileName, String sheetName, String Whatt_ToEdit) {
        try {
            File file = new File(filePath + File.separator + fileName);      //Create an object of File class to open xlsx file
            FileInputStream inputStream = new FileInputStream(file);         //Create an object of FileInputStream class to read excel file
            Workbook _Workbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            if(fileExtensionName.equals(".xlsx")) {
                _Workbook = new XSSFWorkbook(inputStream);                //If it is xlsx file then create object of XSSFWorkbook class
            } else if(fileExtensionName.equals(".xls")){
               _Workbook = new HSSFWorkbook(inputStream);                  //If it is xls file then create object of XSSFWorkbook class
            }    
            Sheet sheet = _Workbook.getSheet(sheetName);                //Read excel sheet by sheet name    
            for(int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);       
                Cell cell = row.getCell(0);
                if(cell.getStringCellValue().equals("Category")) {
                    row.getCell(1).setCellValue(""); 
                    row.getCell(2).setCellValue("Update Category " + New_ID + " " + i);
                    //row.getCell(3).setCellValue(i + 1);
                } 
                if(cell.getStringCellValue().equals("Item") && Whatt_ToEdit.equals("Price 205")) { 
                    row.getCell(7).setCellValue(205);
                }         
                if(cell.getStringCellValue().equals("Item") && Whatt_ToEdit.equals("Remove Item ID")) { 
                    row.getCell(5).setCellValue("");
                    row.getCell(6).setCellValue(row.getCell(6).getStringCellValue() + " Exported-" + New_ID);
                }                
//                else if (cell.getStringCellValue().equals("Modifier Group")) {
//                    if(Whatt_ToEdit.equals("New_Mod_Group_Name")){
//                        row.getCell(14).setCellValue("Update Mod group " + New_ID);                            
//                        //row.getCell(13).setCellValue(""); 
//                    }
//                }                            
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
}
