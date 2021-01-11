/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author larry.li
 */
public class CredentialResposistory {
 
    //File name 
    private String excelPath = System.getProperty("user.dir")+"/register.xlsx";
    //Locate the Sheetname 
    private String sheetName = "RegisterEmails";
    // Insert index
    private int insertStartPointer ;
    
    /**
     * insert one row at bottom
     */
    public void insertRows(String EMail, String PWD) {
        XSSFWorkbook wb = returnWorkBookGivenFileHandle();
        XSSFSheet sheet1 = wb.getSheet(sheetName);
        insertStartPointer = sheet1.getLastRowNum();
        XSSFRow row = sheet1.createRow(insertStartPointer+1);
        row.createCell(0).setCellValue(EMail);
        row.createCell(1).setCellValue(PWD);       
        
        saveExcel(wb);

    }
    
    /**
     * Save Workbook 
     * @param wb
     */
    private void saveExcel(XSSFWorkbook wb) {
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(excelPath);
            wb.write(fileOut);
            fileOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   /**
    * POI object initiate 
    * @return
    */
    private XSSFWorkbook returnWorkBookGivenFileHandle() {
        XSSFWorkbook wb = null;
        FileInputStream fis = null;
        File f = new File(excelPath);
        try {
            if (f != null) {
                fis = new FileInputStream(f);
                wb = new XSSFWorkbook(fis);
            }
        } catch (Exception e) {
            return null;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return wb;
    }
   



}