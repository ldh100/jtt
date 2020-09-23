/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Oleg.Spozito
 */
public class Func {
    public static double p90(double[] l){
        if (l.length < 2) {
            return Math.round(l[0]);
        }
        Arrays.sort(l); 
        double position = (double)(l.length + 1) * 90 / 100.0;
        double leftNumber, rightNumber;
        double n = 90 / 100.0d * (l.length - 1) + 1.0d;
        if (position >= 1) {
            leftNumber = l[(int)Math.floor(n) - 1]; rightNumber = l[(int)Math.floor(n)];
        } else {
            leftNumber = l[0]; rightNumber = l[1];
        }// first data
        if (leftNumber == rightNumber) {
            return Math.round(leftNumber);
        } else {
            double part = n - Math.floor(n); return Math.round(leftNumber + part * (rightNumber - leftNumber));
        }
    }
    public static double p50(double[] l){
        if (l.length < 2) {
            return Math.round(l[0]);
        }
        Arrays.sort(l); 
        double position = (double)(l.length + 1) * 50 / 100.0;
        double leftNumber, rightNumber;
        double n = 50 / 100.0d * (l.length - 1) + 1.0d;
        if (position >= 1) {
            leftNumber = l[(int)Math.floor(n) - 1]; rightNumber = l[(int)Math.floor(n)];
        } else {
            leftNumber = l[0]; rightNumber = l[1];
        }// first data
        if (leftNumber == rightNumber) {
            return Math.round(leftNumber);
        } else {
            double part = n - Math.floor(n); return Math.round(leftNumber + part * (rightNumber - leftNumber));
        }
    }
    public static void fExcel(int row1, int col1, String[][] Values1, String SheetName1, String Top_Row1, 
                              int row2, int col2, String[][] Values2, String SheetName2, String Top_Row2) 
        throws FileNotFoundException, IOException    {

        XSSFWorkbook WB = new XSSFWorkbook();                 //Create blank workbook
        XSSFSheet  SH1 = WB.createSheet(SheetName1);  //Create a blank sheet 1
        XSSFSheet  SH2 = WB.createSheet(SheetName2);  //Create a blank sheet 2
        XSSFRow Row;                                          //Create row object
        Cell cell;                                            //Create cel object

        XSSFFont SummaryFont = WB.createFont(); 
	SummaryFont.setFontHeight((short) (10*20)); 
        SummaryFont.setBold(true);  
        SummaryFont.setColor(IndexedColors.BLUE.index);
        
        CellStyle SummaryStyle = WB.createCellStyle();
	SummaryStyle.setFont(SummaryFont); 
        SummaryStyle.setLocked(true);
        SummaryStyle.setBorderBottom(BorderStyle.MEDIUM);  
        SummaryStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
        SummaryStyle.setBorderRight(BorderStyle.MEDIUM);  
        SummaryStyle.setRightBorderColor(IndexedColors.BLUE.getIndex());  
        SummaryStyle.setBorderTop(BorderStyle.MEDIUM);  
        SummaryStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());        

        XSSFRow SummaryRow = SH1.createRow(0);
        cell = SummaryRow.createCell(0);
        cell.setCellValue(Top_Row1);
        cell.setCellStyle(SummaryStyle);

        SH1.addMergedRegion(new CellRangeAddress(0, 0, 0, col1-1));
        SH1.createFreezePane(2, 2);
        
        XSSFFont HeaderFont = WB.createFont(); 
	HeaderFont.setFontHeight((short) (10*20)); 
        HeaderFont.setBold(true); 
        HeaderFont.setColor(IndexedColors.MAROON.index);
        
        CellStyle HeaderStyle = WB.createCellStyle();
        HeaderStyle.setFont(HeaderFont); 
        HeaderStyle.setLocked(true);
        HeaderStyle.setBorderBottom(BorderStyle.MEDIUM);  
        HeaderStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
        HeaderStyle.setBorderRight(BorderStyle.THIN);  
        HeaderStyle.setRightBorderColor(IndexedColors.BLUE.getIndex());  
        HeaderStyle.setBorderTop(BorderStyle.MEDIUM);  
        HeaderStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());  
            
        XSSFRow headerRow = SH1.createRow(1);
        for(int i = 0; i < col1; i++) {
            cell = headerRow.createCell(i);
            cell.setCellValue(Values1[0][i]);
            cell.setCellStyle(HeaderStyle);
        }  
        
        XSSFFont CellFont = WB.createFont(); 
	CellFont.setFontHeight((short) (10*20));         
        CellStyle cellStyle = WB.createCellStyle();
        CellFont.setBold(false);
        cellStyle.setFont(CellFont); 
        cellStyle.setLocked(true);
        cellStyle.setBorderBottom(BorderStyle.THIN);  
        cellStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());  
        cellStyle.setBorderRight(BorderStyle.THIN);  
        cellStyle.setRightBorderColor(IndexedColors.BLUE.getIndex());  
        cellStyle.setBorderTop(BorderStyle.THIN);  
        cellStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());         
        
        for(int i = 2; i < row1; i++) {
            Row = SH1.createRow(i);
            for(int j = 0; j < col1; j++) {
                cell = Row.createCell(j);
                cell.setCellValue(Values1[i][j]);
                cell.setCellStyle(cellStyle);
            }	
        }
        for(int i = 0; i < col1; i++) { // Resize all columns to fit the content size
            SH1.autoSizeColumn(i);
        }
        SH1.setColumnWidth(1,8500); 
        SH1.setColumnWidth(2,7500); 
        SH1.setColumnWidth(3,12000); 
        SH1.setColumnWidth(5,5000);   
        //Write the workbook in file system
        String userHomeFolder = System.getProperty("user.home") + "/Desktop";
        File ExcelFile = new File(userHomeFolder, SheetName1 + ".xlsx");
        FileOutputStream out = new FileOutputStream(ExcelFile);

        WB.write(out);
        out.close();
        WB.close();
        System.out.println(ExcelFile + " written successfully");
        java.awt.Desktop.getDesktop().open(ExcelFile);
    }
}