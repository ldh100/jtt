/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AP3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
class AP3_import_mm extends AP3_GUI{
    String API_Response_Body = ""; 
    
    protected AP3_import_mm (AP3_GUI a) {
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
        SectorID = a.SectorID;
        GL_MENU= a.GL_MENU;
        
     } 
    
    protected void run() { 
     try{
                GL_MENU = "Starbucks";

                Navigate_to_URL("Navigate to Global Menu", url + "#/menu/sector/" + SectorID + "/brand/company/" + CompanyID + "/globalmods", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);
                Wait_For_Element_By_Path_InVisibility("Wait for Spinner", "xpath", "//circle[@class='v-progress-circular__overlay']", ParentTest, "no_jira");
                    if (FAIL) { return;}
                Thread.sleep(500);
                Element_By_Path_Click("Click Global mod Export ", "xpath", "//div[contains(text(),'Export')]//i", ParentTest, "no_jira");
                 if (FAIL) { return;}
                Thread.sleep(5000);
                String dest_dir = System.getProperty("user.home") + File.separator + "Downloads"; 
                String MenuSetFile = GL_MENU.trim() + "-global-modifier-groups-" + LocalDate.now();    // Lunch - 2021-06-15.zip
               // MenuSetFile = "Starbucks-global-modifier-groups-2021-08-05";
                File_Find("Find Global mod export Zip File", dest_dir, MenuSetFile, ParentTest, "no_jira"); 
                 if (FAIL) { return;}
                 Thread.sleep(3000);
                File_UnZip("Unzip global mod export file ", dest_dir, t, ParentTest, "no_jira");
                 if (FAIL) { return;}          
                File_Delete("Delete Report Zip File", dest_dir,MenuSetFile , ParentTest, "no_jira");
                 if (FAIL) { return;}  
                MenuSetFile = GL_MENU.trim()+"-global-modifier-groups.xlsx";
               // readExcel( dest_dir, MenuSetFile,"Modifier Groups");
                convertPLUExcel(dest_dir,MenuSetFile,"Modifier Groups");
                String[] valueToWrite = {"Modifier Group","","Auto Mod group "+New_ID,"Automation Label "+New_ID,"0","1","2","TRUE","","","","","","","",""};
                writeExcel(dest_dir,MenuSetFile,"Modifier Groups",valueToWrite);
                valueToWrite = new String[] {"Modifier","","","","","","","","","Automation Mod "+New_ID,"5","20","1","600200","TRUE","[\"Prepared\"]"};
                writeExcel(dest_dir,MenuSetFile,"Modifier Groups",valueToWrite);
               
                
                File xlsfile = new File(dest_dir+File.separator+MenuSetFile);
                if(xlsfile.exists()){
                   Element_By_Path_Text_Enter("Upload xlsx file", "xpath", "//div[@class='flex shrink']//input[@type='file']", dest_dir+File.separator+MenuSetFile, false, ParentTest, "no_jira"); 
                     if (FAIL) { return;}
                }else
                { _t++; 
                  _w++; EX += _t + "\t" + "File to upload does not exist" + "\t" + "File :"+MenuSetFile + "\t" + "-" + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                }  
                Find_Text("Check if any Import Errors", "Import Errors", false, ParentTest, "no_jira");
                  if (FAIL) { return;}
             
                Element_By_Path_Click("Click Publish", "xpath", "//div[@class='flex shrink']//div[normalize-space()='publish']", ParentTest, "no_jira");
                  if (FAIL) { return;}
               
                      
         }catch(Exception ex){} // ============================================= 
    }//End of run()
    
    
    public void convertPLUExcel(String filePath,String fileName,String sheetName)
    {
      try{
          EX += "\n - " + "\t" + " ====Start====" + "\t" + " ===== " + "\t" + " == Modify PLU data to Excel file==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                File file =    new File(filePath+"/"+fileName);//Create an object of File class to open xlsx file
                FileInputStream inputStream = new FileInputStream(file);//Create an object of FileInputStream class to read excel file
                Workbook modifier_Workbook = null;
                String fileExtensionName = fileName.substring(fileName.indexOf("."));
                if(fileExtensionName.equals(".xlsx")){
                modifier_Workbook = new XSSFWorkbook(inputStream);//If it is xlsx file then create object of XSSFWorkbook class
                }
                else if(fileExtensionName.equals(".xls")){
                   modifier_Workbook = new HSSFWorkbook(inputStream);//If it is xls file then create object of XSSFWorkbook class
                }    
                Sheet sheet = modifier_Workbook.getSheet(sheetName);//Read excel sheet by sheet name    
                
                for(int j = 1; j <= sheet.getLastRowNum(); j++){          
                     Row row = sheet.getRow(j);//Get the  row from the sheet
                     Cell cell = row.getCell(13);
                        if(cell != null)
                        {  
                            cell.setCellValue(Integer.parseInt(cell.getStringCellValue()));
                        } 
                   }
                inputStream.close(); 
                FileOutputStream outputStream = new FileOutputStream(file); //Create an object of FileOutputStream class to create write data in excel file
                modifier_Workbook.write(outputStream);//write data in the excel file
                outputStream.close();//close output stream
            EX += "\n - " + "\t" + " ====End====" + "\t" + " ===== " + "\t" + " == Modify PLU data to Excel file==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
             
          }catch(Exception ex){ex.printStackTrace();} // ============================================= 
    }//End of writeExcel()
    
    public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite)
    {
      try{
          EX += "\n - " + "\t" + " ====Start====" + "\t" + " ===== " + "\t" + " == Write data to Excel file==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                File file =    new File(filePath+"/"+fileName);//Create an object of File class to open xlsx file
                FileInputStream inputStream = new FileInputStream(file);//Create an object of FileInputStream class to read excel file
                Workbook modifier_Workbook = null;
                String fileExtensionName = fileName.substring(fileName.indexOf("."));
                if(fileExtensionName.equals(".xlsx")){
                modifier_Workbook = new XSSFWorkbook(inputStream);//If it is xlsx file then create object of XSSFWorkbook class
                }
                else if(fileExtensionName.equals(".xls")){
                   modifier_Workbook = new HSSFWorkbook(inputStream);//If it is xls file then create object of XSSFWorkbook class
                }    
                Sheet sheet = modifier_Workbook.getSheet(sheetName);//Read excel sheet by sheet name    
                int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();//Get the current count of rows in excel file
                Row row = sheet.getRow(0);//Get the first row from the sheet
                Row newRow = sheet.createRow(rowCount+1);//Create a new row and append it at last of sheet
                for(int j = 0; j < row.getLastCellNum(); j++){           //Create a loop over the cell of newly created Row
                    Cell cell = newRow.createCell(j);//Fill data in row
                        if(j==4 || j == 5 || j==6 || j==10 || j==11 || j==12 || j==13 )
                        {  if (!dataToWrite[j].equals(""))
                                { cell.setCellValue(Integer.parseInt(dataToWrite[j])); } 
                           else
                                { cell.setCellValue(dataToWrite[j]);}
                        }else if((j==7 ||j==14) && dataToWrite[j].equals("TRUE")) {
                            cell.setCellValue(Boolean.TRUE);
                        }else if((j==7 ||j==14) && dataToWrite[j].equals("FALSE")){
                            cell.setCellValue(Boolean.FALSE);
                        }else{
                             cell.setCellValue(dataToWrite[j]);
                        }
                }
                inputStream.close(); 
                FileOutputStream outputStream = new FileOutputStream(file); //Create an object of FileOutputStream class to create write data in excel file
                modifier_Workbook.write(outputStream);//write data in the excel file
                outputStream.close();//close output stream
            EX += "\n - " + "\t" + " ====End====" + "\t" + " ===== " + "\t" + " == Write data to Excel file==" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
             
          }catch(Exception ex){ex.printStackTrace();} // ============================================= 
    }//End of writeExcel()
 
}
