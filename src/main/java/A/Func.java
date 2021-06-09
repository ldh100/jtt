package A;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
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
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

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
    public static String Realm_ID(String APP, String ENV) {
       switch (APP.toLowerCase()) {
            case "boost":
                return "WEW9lgWk5oTkA98PNGEoc97J9Mdgy6foMM2";
            case "thrive":
                return "Kq8m4B8GNRCgjlRL9A3rsYj0YBNGP3SLOKgg";
            case "nourish":
                return"k5wqOkwMrEcvdO3q5BpmCzZ2z18MEGSDrKG2R";
            case "rogers":
                return "2Me8lJeDq4S0vzlga89ZHB9OBdEmBPIpMoDZ";
            case "jjkitchen":
                return "ZeDrkODo2gu0qJ1rZDW3HMN169NZG";
            case "canteen":
                return "81NDOePO6pCwo4KBddpXcGoj9PppoquOed3y4mDD";
            case "tacit":
                return "llq08WB8epuwmABXjj70ce46dgll48SKYB7pqoooFXDoZ6lggdtZmK5owEqEuBQNragNj2h7JmjAqmzGs4G";
            case "distiller":
                return "darvin";
            case "bolter":
                return "bolter";
            case "ap3":
                return "6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5";                              
            default:
               break;
        }
        return "Not Found";
    }

    public static String App_ID(String APP, String ENV) {
       switch (APP.toLowerCase()) {
            case "chrome c360":
                if(ENV.equals("DE")) 
                    return "https://dev.cafe360.compassdigital.org/";
                if(ENV.equals("ST")) 
                    return "https://dev.cafe360.compassdigital.org/";
                if(ENV.equals("PR")) 
                    return "https://dev.cafe360.compassdigital.org/";
            case "chrome wo":
                if(ENV.equals("DE")) 
                    return "https://dev.thriveapp.io";
                if(ENV.equals("ST")) 
                    return "https://staging.thriveapp.io";
                if(ENV.equals("PR")) 
                    return "https://thriveapp.io";
            case "boost":
                if(ENV.equals("DE")) 
                    return "014B6RP683C2QL7X00oDS86lrKOO14twGXQwzDARCgympJ42Q5SD1LWZ2gppTOGd4eov2GcePXaa59Zquma";
                if(ENV.equals("ST")) 
                    return "11J3gKPg8BCR3mr5OO92S6EBL4ddEAT17G44eoLPSw0N21gy4OHjQXjDG6LXIrL1MY8B5PHPX9omNMrqFJO";
                if(ENV.equals("PR")) 
                    return "11J3gKPg8BCR3mr5OO92S6EBL4ddEAT17G44eoLPSw0N21gy4OHjQXjDG6LXIrL1MY8B5PHPX9omNMrqFJO";
            case "thrive":
                if(ENV.equals("DE")) 
                    return "91LoqkPqyDCeGj4JllPRS2e0pWRRj5UZwMWR5E01FwGwORg7kyI0kwpjakyGfK7geXm602UXkg7XzlNDI0k";
                if(ENV.equals("ST")) 
                    return "Ym7By6oy1dTOBE5P880jTamr9022GqCD7BB2y1vOIlgk1B16Y7hzOGjMXNMoh1oQRojae9T8JqBXJ8llt9d";
                if(ENV.equals("PR")) 
                    return "Ym7By6oy1dTOBE5P880jTamr9022GqCD7BB2y1vOIlgk1B16Y7hzOGjMXNMoh1oQRojae9T8JqBXJ8llt9d";
            case "jjkitchen":
                if(ENV.equals("DE")) 
                    return "014B6RP683C2QL7X00oDS86lrKOO6Gi8GWyDLqM8IGerMLAXz4ujgmy4B2jziDvY2604zWTeDj5qwkBai7Q";
                if(ENV.equals("ST")) 
                    return "014B6RP683C2QL7X00oDS86lrKOO6Gi8GWyDLqM8IGerMLAXz4ujgmy4B2jziDvY2604zWTeDj5qwkBai7Q";
                if(ENV.equals("PR")) 
                    return "014B6RP683C2QL7X00oDS86lrKOO6Gi8GWyDLqM8IGerMLAXz4ujgmy4B2jziDvY2604zWTeDj5qwkBai7Q";
            case "nourish":
                if(ENV.equals("DE")) 
                    return "pjKAypwy46UqpZaKOOEBTA86dKRRyJIPDPNNlWPEf3k94PXPj3cAXaO6o4dgsEXjJ8RL78HdBLz7rK75f3W"; 
                if(ENV.equals("ST")) 
                    return "Ym7By6oy1dTOBE5P880jTamr9022mQCvpaXorrdOukDoYNDddatraAzdWPNqSLA8p4B52Mu8QMAOW8Rluad";
                if(ENV.equals("PR")) 
                    return "Ym7By6oy1dTOBE5P880jTamr9022mQCvpaXorrdOukDoYNDddatraAzdWPNqSLA8p4B52Mu8QMAOW8Rluad";
            case "rogers":
                if(ENV.equals("DE")) 
                    return "D72zJqPJQ5h91JXM22Q4Iqa0E4335XC394dO6JN0s2XezzG3P2FQ2LJXzKWgSzkl2ZLP1kFvN7BdEqX0f2e"; 
                 if(ENV.equals("ST")) 
                    return "rjEZyoky4rUlgzRwOO0dtEXkD2wwK3tw1y3GlJJzsY3LYK6aPPTRydal9dOktZ9ZL1aB5JH2zlyPzemzCjy";
                if(ENV.equals("PR")) 
                    return "rjEZyoky4rUlgzRwOO0dtEXkD2wwK3tw1y3GlJJzsY3LYK6aPPTRydal9dOktZ9ZL1aB5JH2zlyPzemzCjy";
            case "bamco":
                if(ENV.equals("DE")) 
                    return "pjKAypwy46UqpZaKOOEBTA86dKRRy5tPe2DKrjoMS37lZO6BZXcyQBv3GZ4WIEmlDaOW8du1drKAWKL6uzR"; 
                if(ENV.equals("ST")) 
                    return "pjKAypwy46UqpZaKOOEBTA86dKRRy5tPe2DKrjoMS37lZO6BZXcyQBv3GZ4WIEmlDaOW8du1drKAWKL6uzR";
                if(ENV.equals("PR")) 
                    return "pjKAypwy46UqpZaKOOEBTA86dKRRy5tPe2DKrjoMS37lZO6BZXcyQBv3GZ4WIEmlDaOW8du1drKAWKL6uzR";
            case "canteen":
                return "71rpYwPYzkCW1Kg466Qjc8K4MvOOdAfQ7M5R9v3AcB99Y3M0XYh45GYz032ohm70lXpNd4F7v8gZZ56QI7N";
            case "Tacit":
                return "llq08WB8epuwmABXjj70ce46dgll48SKYB7pqoooFXDoZ6lggdtZmK5owEqEuBQNragNj2h7JmjAqmzGs4G";
            case "distiller":
                return "darvin";
            case "bolter":
                return "bolter";
            default:
                break;
        }
        return "Not Found";
    }

    public static String ExecuteCmdRuntime(String cmd){
        String output = null;
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while(( line = b.readLine())!= null){
                output += line + "\r\n";
            }
        } catch(IOException ex){
            output = ex.getMessage();
        }
       return output;   
    }

    public static String ExecuteCmdProcessBuilder(String cmd, String Cwd, boolean waitFor, boolean ReturnOutput){
        String output = "";
        Process p = null;
        try {
            ProcessBuilder b = new ProcessBuilder();  
            if(!"".equals(Cwd)){
                b.directory(new File(Cwd));                 
            }
            if(A.WsOS.toLowerCase().contains("windows")){
                b.command("cmd.exe", "/c", cmd);            
            }
            if(A.WsOS.toLowerCase().contains("mac")){
//                String[] ios_cmd = cmd.split(" ");
//                b.command(ios_cmd); 
                b.command("sh", "-c", cmd);
            }

            p = b.start();
            if(ReturnOutput){
                BufferedReader out_reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = out_reader.readLine()) != null) {
                    if(!"".equals(line.trim())){
                        output += line + "\r\n";
                    }
                }                
            }
            if(waitFor){
                p.waitFor(10, TimeUnit.SECONDS);
                boolean exitCode = p.waitFor(10, TimeUnit.SECONDS);
                output += "Terminated normally: " + exitCode + "\r\n";                   
            }   
        } catch(Exception ex){
            output = ex.getMessage();
        } 
        return output;   
    }

    public static String SHOW_LOG_FILE(String BODY, String EXT){
        File aLog = null;
        try {
            String userDesktop = System.getProperty("user.home") + File.separator + "Desktop"; 
            aLog = new File(userDesktop + File.separator + "aLog." + EXT);
            Files.write(Paths.get(aLog.getPath()), BODY.getBytes());
            java.awt.Desktop.getDesktop().open(aLog);
            return "OK";
        }
        catch (IOException ex) {
            System.out.println("\r\n= Show " + aLog + " > ERROR: " + ex.getMessage() + "\r\n");
            return "\r\n= Show " + aLog + " > ERROR: " + ex.getMessage()+ "\r\n";
        }
    }
    
    public static String AWS_ALERT(String BODY){
        int StatusCode = 0;
        String Result = "";
        String EndPoint = "https://events.pagerduty.com/v2/enqueue";
        try {
            RequestSpecification request;
            request = RestAssured.given();
            Response response = null;
            BODY = BODY.replace("AWS_Routing_Key", A.AWS_Routing_Key);
            request.body(BODY);            
            
            response = request.post(EndPoint); //  ===========================
            Result = response.getStatusLine();
            StatusCode = response.getStatusCode();
            if(StatusCode == 202){
                return "= Alert sent to " + EndPoint + " @" + LocalDateTime.now().format(A.Time_12_formatter) + "\r\n";   
            } else{
                return "= Send Alert to " + EndPoint + " ERROR: " + Result + "\r\n";            
            }
        } catch(Exception ex){
            return"= Send Alert to " + EndPoint + " - ERROR:" + ex.getMessage() + "\r\n";
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
    

    public static String Send_File_with_Message_to_Slack(String Path, String Channel, String MSG) {
        try{           
            File file = new File(Path); 
            HttpClient httpclient = HttpClientBuilder.create().disableContentCompression().build();
            HttpPost httpPost = new HttpPost("https://slack.com/api/files.upload");  
            
            MultipartEntityBuilder reqEntity = MultipartEntityBuilder.create(); 
            reqEntity.addTextBody("token", A.S_OAuth_TKN);       
            reqEntity.addTextBody("channels", Channel); 
            reqEntity.addTextBody("initial_comment", MSG); 
            reqEntity.addTextBody("media", "file");
            reqEntity.addBinaryBody("file", file);
            
            httpPost.setEntity(reqEntity.build());
            HttpResponse response = httpclient.execute(httpPost);
            
            return "= File to Slack: " + Path + " > " + response.getStatusLine().getStatusCode() + ", " + response.getStatusLine().getReasonPhrase()+ "\r\n"; 
        } catch(IOException ex) {
            return "= File to Slack: " + Path + " > ERROR: " + ex.getMessage() + "\r\n";
        }
    }
    public static String Zip_File(String Source){
        try {
            try (FileOutputStream fos = new FileOutputStream(Source.replace(".html", ".zip"))) {
                FileInputStream fis;
                try (ZipOutputStream zipOut = new ZipOutputStream(fos)) {
                    File fileToZip = new File(Source);
                    fis = new FileInputStream(fileToZip);
                    ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                    zipOut.putNextEntry(zipEntry);
                    final byte[] bytes = new byte[1024];
                    int length;
                    while ((length = fis.read(bytes)) >= 0) {
                        zipOut.write(bytes, 0, length);
                    }
                }
                fis.close();
            }
            return Source.replace(".html", ".zip"); 
        } catch (IOException ex) {
            return "Zip_File ERROR: " + ex.getMessage();  
        }            
    }
}