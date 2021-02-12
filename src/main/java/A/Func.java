/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import static A.A.WsOS;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.BufferedReader;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

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
    public static String ExecuteCmdRuntime(String cmd){
        String output = null;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while(( line = b.readLine())!= null){
                output += line + "\r\n";
            }
        } catch(Exception ex){
            output = ex.getMessage();
        }
       return output;   
    }
    public static String ExecuteCmdProcessBuilder(String cmd, String WorkingDirectory, boolean NoWindow, boolean useShellExecute, boolean ReturnOutput){
        String output = null;
        try {
            ProcessBuilder builder = new ProcessBuilder();
            builder.directory(new File(System.getProperty("user.home")));
            if(WsOS.toLowerCase().contains("windows")){
                builder.command("cmd.exe", "/c", cmd);            
            }
            if(WsOS.toLowerCase().contains("mac")){
                builder.command(cmd);            
            }

            Process p = builder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            int exitCode = p.waitFor();
            System.out.println("\nExited with error code : " + exitCode);            
         } catch(IOException | InterruptedException ex){
             output = ex.getMessage();
         }
       return output;   
    }
    public static String SHOW_LOG_FILE(String BODY, String EXT){
        File aLog = null;
        try {
            String userHomeFolder = System.getProperty("user.home") + File.separator + "Desktop"; 
            aLog = new File(userHomeFolder + File.separator + "aLog." + EXT);
            Files.write(Paths.get(aLog.getPath()), BODY.getBytes());
            java.awt.Desktop.getDesktop().open(aLog);
            return "OK";
        }
        catch (IOException ex) {
            System.out.println("\r\n\r\n=== Show " + aLog + " > ERROR: " + ex.getMessage());
            return "\r\n\r\n=== Show " + aLog + " > ERROR: " + ex.getMessage();
        }
    }
    public static class ColorRenderer extends DefaultTableCellRenderer{
        private static final TableCellRenderer TCR = new DefaultTableCellRenderer();
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value.toString().toLowerCase().contains("fail") && !value.toString().toLowerCase().contains("failed: 0")) {
                setBackground( Color.decode("#FFA38C"));
            } else if(value.toString().toLowerCase().contains("warnings") && !value.toString().toLowerCase().contains("warnings: 0")) {
                setBackground( Color.YELLOW);
            } else if(value.toString().toLowerCase().contains("fail") && value.toString().toLowerCase().contains("failed: 0")) {
                setBackground( Color.decode("#B1F694")); 
            } else if(value.toString().toLowerCase().contains("started") && value.toString().toLowerCase().contains("started: 0")) {
                setBackground( Color.decode("#FAFACA")); 
            } else if(value.toString().toLowerCase().contains("running")) {
                setBackground( Color.decode("#C2F5FD"));
            }else{
                setBackground( Color.WHITE);
            }
            setFont(new Font("Dialog", Font.PLAIN, 11));
            setValue(table.getValueAt(row, column));
            return this;
        }
    }
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
    public static String fExcel(int row1, int col1, String[][] Values1, String SheetName1, String Top_Row1, 
                              int row2, int col2, String[][] Values2, String SheetName2, String Top_Row2, boolean Open_File) 
        throws FileNotFoundException, IOException    {
        File ExcelFile;
        try (XSSFWorkbook WB = new XSSFWorkbook()) { //Create blank workbook
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
            for(int i = 2; i <= row1; i++) { // 1st(0) - summary, 2nd(1) - header, Values start from (2)
                Row = SH1.createRow(i);
                for(int j = 0; j < col1; j++) {
                    cell = Row.createCell(j);
                    cell.setCellValue(Values1[i-1][j]); // Values (i=0) > header
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
            String UserDesktop = System.getProperty("user.home") + "/Desktop";
            ExcelFile = new File(UserDesktop, SheetName1 + ".xlsx");
            try (FileOutputStream out = new FileOutputStream(ExcelFile)) {
                WB.write(out);
            }
        } 
        if(Open_File){
            java.awt.Desktop.getDesktop().open(ExcelFile);
        }
        return ExcelFile.getAbsolutePath();
    }
    public static String Send_File_to_Slack(String Path, String Channel, String MSG) {
        try{           
            File file = new File(Path); 
            MultipartEntityBuilder builder = MultipartEntityBuilder.create(); 
            builder.addTextBody("token", A.S_OAuth_TKN); 
            builder.addTextBody("channels", Channel); 
            builder.addTextBody("initial_comment", MSG); 
            //builder.addPart(Path, contentBody);
            builder.addBinaryBody(
                "file", // File_Name
                new FileInputStream(file), 
                ContentType.APPLICATION_OCTET_STREAM,
                file.getName()
             );
            HttpEntity multiPartEntity = builder.build();
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost("https://slack.com/api/files.upload");
            httpPost.setEntity(multiPartEntity); 
            HttpResponse response = httpclient.execute(httpPost);
            return "\r\n\r\n=== Send_File_to_Slack - " + response.getStatusLine() + "\r\n"; 
        }catch(IOException ex) {
            return "\r\n\r\n=== Send_File_to_Slack > ERROR: " + ex.getMessage() + "\r\n";
        }
    }
}