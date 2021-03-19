/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;

/**
 *
 * @author oleg.spozito
 */
public class An_Met { 
//    protected void Set_Mobile_Package_Name(){
//        if ("Boost".equals(app)) {
//            appPackage = "com.compass_canada.boost";
//            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
//        }
//        if ("JJKitchen".equals(app)) {
//            appPackage = "io.compassdigital.jjkitchen";
//            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
//        }
//        if ("Thrive".equals(app)) {
//            appPackage = "com.compass_canada.thrive";
//            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
//        }
//        if ("Nourish".equals(app)) {
//            appPackage = "io.compassdigital.nourish";
//            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
//        }
//        if ("Rogers".equals(app)) {
//            appPackage = "com.compass_canada.digital_hospitality.rogers";
//            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
//        }
//        if ("Bolter".equals(app)) {
//            appPackage = "io.compassdigital.delivery";
//            appActivity = "io.compassdigital.delivery.splash.SplashActivity";
//        }
//    }
//    protected String Report(boolean Open_File){
//        Report_File = "";
//        if ("".equals(Last_EX.trim()) || "None".equals(Last_EX.trim())){
//            return "=== Report > Not Excel";
//        }   
//        try {
//            int col = 9; 
//            String Top_Row = Last_EX.substring(0, Last_EX.indexOf("\r\n"));        
//            String[] lines = Last_EX.substring(Last_EX.indexOf("\r\n") + 2).split(System.getProperty("line.separator"));
//            int l = lines.length;
//            String[][] Values = new String[l][col];
//            int n = 1;
//            for (int i = 0; i < l; i++) {
//                String[] v = lines[i].split("\t");
//                System.arraycopy(v, 0, Values[i], 0, v.length); 
//            }
//            Report_File = A.Func.fExcel(l, col, Values, "Android_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
//            return "=== Report Excel file:\r\n" + Report_File + "\r\n";
//        } catch (IOException ex) {
//            return "=== Report > ERROR: " + ex.getMessage() + "\r\n";
//        }
//    }
//    protected String LOG_START(){
//        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
//            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[aw_result] (" +
//                    "[Date]" +   // 1
//                    ", [Time]" +   // 2
//                    ", [app]" +   // 3
//                    ", [url]" +   // 4
//                    ", [summary]" +   // 5
//                    ", [t_calls]" +   // 6
//                    ", [t_min]" +   // 7
//                    ", [t_avg]" +   // 8
//                    ", [t_max]" +   // 9
//                    ", [p_50]" +   // 10
//                    ", [p_90]" +   // 11
//                    ", [test_type]" +   // 12
//                    ", [user_id]" +   // 13
//                    ", [user_ws]" +   // 14
//                    ", [env]" +   // 15
//                    ", [Result]" +   // 16
//                    ", [Status]" +   // 17
//                    ", [Excel]" +     // 18
//                    ") VALUES (" +
//                    "?" +     // 1
//                    ",?" +    // 2
//                    ",?" +    // 3
//                    ",?" +    // 4
//                    ",?" +    // 5
//                    ",?" +    // 6
//                    ",?" +    // 7
//                    ",?" +    // 8
//                    ",?" +    // 9
//                    ",?" +    // 10
//                    ",?" +    // 11
//                    ",?" +    // 12
//                    ",?" +    // 13
//                    ",?" +    // 14
//                    ",?" +    // 15
//                    ",?" +    // 16
//                    ",?" +    // 17
//                    ",?" +    // 18
//                    ")");
//            _insert.setString(1, LocalDateTime.now().format(Date_formatter));
//            _insert.setString(2, LocalDateTime.now().format(Time_24_formatter));
//            _insert.setString(3, "Android_" + app + "_" + env);
//            _insert.setString(4, url);
//            _insert.setString(5, "Running...");
//            _insert.setString(6, "0");
//            _insert.setString(7, "0");
//            _insert.setString(8, "0");
//            _insert.setString(9, "0");
//            _insert.setString(10, "0");
//            _insert.setString(11, "0");
//            _insert.setString(12, r_type);
//            _insert.setString(13, A.A.UserID);
//            _insert.setString(14, A.A.WsID);
//            _insert.setString(15, devModel+ " OSv: " + devOS);
//            _insert.setString(16, "=== Job is running... ===\r\n" + "");
//            _insert.setString(17, "Running");
//            _insert.setString(18, "None");
//            int row = _insert.executeUpdate();
//            conn.close();
//            return "=== LOG_START > OK" + "\r\n";
//        } catch (SQLException ex) {
//            return "=== LOG_START > SQL ERROR: " + ex.getMessage() + "\r\n";
//        }
//    }      
//    protected String LOG_UPDATE(String LOG){  
//        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
//            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[aw_result] SET " +
//                    " [Date] = ?" +       // 1
//                    ", [Time] = ?" +      // 2
//                    ", [app] = ?" +       // 3
//                    ", [url] = ?" +       // 4
//                    ", [summary] = ?" +   // 5
//                    ", [t_calls] = ?" +   // 6
//                    ", [t_min] = ?" +     // 7
//                    ", [t_avg] = ?" +     // 8
//                    ", [t_max] = ?" +     // 9
//                    ", [p_50] = ?" +      // 10
//                    ", [p_90] = ?" +      // 11
//                    ", [test_type] = ?" +     // 12
//                    ", [user_id] = ?" +       // 13
//                    ", [user_ws] = ?" +       // 14
//                    ", [env] = ?" +       // 15
//                    ", [Result] = ?" +    // 16
//                    ", [Status] = ?" +    // 17
//                    ", [Excel] = ?" +     // 18
//                    " WHERE [app] = 'Android_" + app + "_" + env + "' AND [Status] = 'Running'");
//            _update.setString(1, LocalDateTime.now().format(Date_formatter));
//            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
//            _update.setString(3, "Android_" + app + "_" + env);
//            _update.setString(4, url);
//            _update.setString(5, Summary + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")");
//            _update.setInt(6, t_calls);
//            _update.setDouble(7, t_min);
//            _update.setDouble(8, t_avg);
//            _update.setDouble(9, t_max);
//            _update.setDouble(10, p_50);
//            _update.setDouble(11, p_90);
//            _update.setString(12, r_type);
//            _update.setString(13, A.A.UserID);
//            _update.setString(14, A.A.WsID);
//            _update.setString(15, devModel + " OSv: " + devOS);
//            _update.setString(16, LOG);
//            _update.setString(17, "Scope: " + SCOPE);
//            _update.setString(18, EX);
//            int row = _update.executeUpdate();
//            conn.close();
//            return "=== LOG_UPDATE > OK" + "\r\n";
//        } catch (SQLException ex) {
//            return "=== LOG_UPDATE > SQL ERROR: " + ex.getMessage() + "\r\n";
//        }
//    }
//
//    protected String Swipe_WakeUp(){       
//        return A.Func.ExecuteCmdProcessBuilder(A.A.ADB_HOME + "adb -s " + devID + " shell input touchscreen swipe 800 400 400 400 100", A.A.CWD, false, false);    
//    }
//    protected String CheckDevice(String D){
//        devID = "";
//        devModel = "";
//        if(D.contains("id:")){
//            devModel = D.substring(0,D.indexOf(" ")).trim(); 
//            devID = D.substring(D.indexOf("id:") + 3).trim();        
//            devOS = A.Func.ExecuteCmdProcessBuilder(A.A.ADB_HOME + "adb -s " + devID + " shell getprop ro.build.version.release", A.A.CWD, true, true).trim();
//            devOS = devOS.replace("null", "").substring(0, devOS.indexOf("\r\n")).trim();
//            return "=== CheckDevice OK > Model: " + devModel + ", OS version: " + devOS + "\r\n";
//        } else{
//            return "=== CheckDevice: " + "ID Not Found" + "\r\n";           
//        }        
//    }
//    protected String CheckAppPackage(){
//        String v1 = "?";
//        String v2 = "?";
//        appVersion = "Not Found";
//        try{
//            String v = A.Func.ExecuteCmdProcessBuilder(A.A.ADB_HOME + "adb -s " + devID + " shell dumpsys package " + appPackage, A.A.CWD, true, true).trim();
//            if ("".equals(v.trim())) {
//                return "=== appPackage  " + appPackage + " - no information\r\n";
//            }
////            if(v.contains("pkg=Package{")){
////                Hash = v.substring(v.indexOf("pkg=Package{") + 12); // // pkg=Package{f2241b0 com.compass_canada.boost}  <<<< hash ??
////                Hash = Hash.substring(0, Hash.indexOf(" ")).trim();                
////            }
//            if(v.contains("versionName") && v.contains("versionCode")) {
//                v1 = v.substring(v.indexOf("versionName"));
//                v1 = v1.substring(0, v1.indexOf("\r\n"));
//                v1 = v1.substring(v1.indexOf("=") + 1).trim();
//                v2 = v.substring(v.indexOf("versionCode"));
//                v2 = v2.substring(0, v2.indexOf("\r\n"));
//                v2 = v2.substring(v2.indexOf("=") + 1);
//                v2 = v2.substring(0, v2.indexOf(" "));
//                appVersion = "v" + v1 + "(" + v2 + ")"; // Git Hash: " + Hash;
//            }
//            return "=== appPackage: " + appPackage + " > Version: " + appVersion + "\r\n";
//        } catch (Exception ex) { 
//            return "=== CheckAppPackage: " + ex.getMessage() + "\r\n";
//        }      
//    }
//    
//    protected String AndroidDriver() {
//        try {
//            DesiredCapabilities  cap = new DesiredCapabilities ();
//            cap.setCapability("platformName", "Android");
//            cap.setCapability("deviceName", devModel);
//            cap.setCapability("udid", devID); 
//            cap.setCapability("platformVersion", devOS);
//            cap.setCapability("clearSystemFiles", true);
//            cap.setCapability("appPackage", appPackage);
//            cap.setCapability("appActivity", appActivity);
//
//            cap.setCapability("autoGrantPermissions", false); // false- always get prompt
//            cap.setCapability("unicodeKeyboard", false);
//            cap.setCapability("resetKeyboard", true);
//            cap.setCapability("sendKeyStrategy", "oneByOne");
//            cap.setCapability("automationName", "UiAutomator2");  // UiAutomator2 / Appium 
//            
//            AppiumServiceBuilder builder = new AppiumServiceBuilder();
//            builder.usingAnyFreePort();
//            appiumService = AppiumDriverLocalService.buildService(builder);
//            appiumService.start();
//            
//            ad = new AndroidDriver(new URL(appiumService.getUrl().toString()), cap);             
//            ad.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);
//                      
//            loadTimeout = new FluentWait(ad).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
//			.pollingEvery(Duration.ofMillis(200))  			
//			.ignoring(NoSuchElementException.class);   
//            return "=== Android Driver Start > OK " + "\r\n";
//        } catch (Exception ex) {
//            F += "=== Android Driver > ERROR: " + ex.getMessage() + "\r\n";
//            if(ad != null) {
//                ad.quit(); 
//            }
//            if(appiumService != null && appiumService.isRunning()){
//                appiumService.stop();                    
//            }
//            return "=== Android Driver > ERROR: " + ex.getMessage() + "\r\n";
//        }   
//    }    
//    protected String Get_S3_MOB_Credentials(){     
//        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
//            ResultSet rs1 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_A_Key_MOB'");
//            rs1.next();
//            AWS_A_key = rs1.getString(1);
//            ResultSet rs2 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_S_Key_MOB'");
//            rs2.next();
//            AWS_S_key = rs2.getString(1);
//            conn.close();
//            AWS_credentials = new BasicAWSCredentials(
//                new String(Base64.getDecoder().decode(AWS_A_key)),
//                new String(Base64.getDecoder().decode(AWS_S_key))
//            );  
//            return "= Get_S3_MOB_Credentials > " + "OK" + "\r\n";
//        } catch (SQLException ex) {
//            return "= Get_S3_MOB_Credentials > " + ex.getMessage() + "\r\n";
//        }
//    }
//    protected String UnInstaPackage(String PKG) {
//        return A.Func.ExecuteCmdProcessBuilder(A.A.ADB_HOME + "adb -s " + devID + " uninstall " + PKG, A.A.CWD, true, true).trim() + "\r\n";
//    } 
//    protected String InstallBuild(String BuildFile) {
//        return A.Func.ExecuteCmdProcessBuilder(A.A.ADB_HOME + "adb -s " + devID + " install -r " + BuildFile, A.A.CWD, true, true).trim() + "\r\n";
//    }  
//    protected File newUnzipFile(File destinationDir, ZipEntry zipEntry) throws IOException {
//        File destFile = new File(destinationDir, zipEntry.getName());
//        String destDirPath = destinationDir.getCanonicalPath();
//        String destFilePath = destFile.getCanonicalPath();
//        if (!destFilePath.startsWith(destDirPath + File.separator)) {
//            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
//        }
//        return destFile;
//    }
//    protected String Unzip_Build (){           
//        String dir = A.A.CWD + File.separator + "MobileBuilds"; 
//        File zip_source = new File(dir + File.separator + "x.zip");
//        File destDir = new File(dir);
//        byte[] buffer = new byte[1024];
//        try {
//            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zip_source))) {
//                ZipEntry zipEntry = zis.getNextEntry();
//                appBuldFile = zipEntry.getName();
//                while (zipEntry != null) {
//                    File newFile = newUnzipFile(destDir, zipEntry);
//                    if (zipEntry.isDirectory()) {
//                        //
//                    } else { // fix for Windows-created archives
////                        File zipParent = newFile.getParentFile(); 
////                        if (!zipParent.isDirectory() && !zipParent.mkdirs()) {
////                            return "== " + "Failed to create directory " + zipParent + "\r\n";
////                        }
//                        FileOutputStream fos = new FileOutputStream(newFile);
//                        int len;
//                        while ((len = zis.read(buffer)) > 0) {
//                            fos.write(buffer, 0, len);
//                        }
//                        fos.close();
//                    }
//                    zipEntry = zis.getNextEntry();
//                }
//                zis.closeEntry();
//                zis.close();
//            }
//            return "== " + "Unzipped Build OK: " + appBuldFile + "\r\n"; 
//        } catch (IOException ex) { 
//            return "== " + "Unzip_Build: " + ex.getMessage() + "\r\n";
//        }
//    }      
//    protected String Download_Build(String B_PATH){    
//        String dir = A.A.CWD + File.separator + "MobileBuilds"; 
//        try {                        
//            AmazonS3 s3client = AmazonS3ClientBuilder
//                    .standard()
//                    .withCredentials(new AWSStaticCredentialsProvider(AWS_credentials))
//                    .withRegion(Regions.US_EAST_1)
//                    .build();
//            S3Object s3object = s3client.getObject("mobile-app-repos", B_PATH);
//            S3ObjectInputStream inputStream = s3object.getObjectContent();
//            FileUtils.copyInputStreamToFile(inputStream, new File(dir + File.separator + "x.zip")); 
//            return "== Download Build " + B_PATH + " OK >" + "\r\n" + "downloaded in " + dir + " as x.zip" + "\r\n";
//        } catch (SdkClientException | IOException ex) { 
//            return "== " + "Download_Build: " + ex.getMessage() + "\r\n";
//        }
//    }    
//
//    protected String InstallBuild_S3(String B_PATH){        
//        if(Download_Build(B_PATH).contains("OK")){
//            if(Unzip_Build().contains("OK")){
//                UnInstaPackage(appPackage);
//                String BuildPath = System.getProperty("user.dir") + File.separator + "MobileBuilds" + File.separator + appBuldFile;
//                InstallBuild(BuildPath);
//                CheckAppPackage();
//            }
//        }
//      return "=== InstallBuild_S3: Check Result...." + "\r\n";  
//    }    
//    protected String Get_Bolter_User_Site_ID(String ID, String PW){  
//        String S_ID = "ERROR";
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        try { 
//            String UserAuth = Base64.getEncoder().encodeToString((ID + ":" + PW).getBytes());
//            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + "bolter"); 
//            httpget.setHeader("Authorization", "Basic " + UserAuth);
//            httpget.setHeader("From", "Bolter/1.0");
//            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
//                int status = response.getStatusLine().getStatusCode();
//                if (status >= 200 && status < 500) {
//                    HttpEntity entity = response.getEntity();
//                    return entity != null ? EntityUtils.toString(entity) : null;
//                } else {
//                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
//                }
//            };
//            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
//            if(json.has("profile")){
//                S_ID = json.getJSONObject("profile").getString("location_group") + "\r\n";  
//            }else{
//                if(json.has("error")){
//                    S_ID = "=== Get_Bolter_User_Site_ID > ERROR: " + json.getString("error")+ "\r\n"; 
//                    S_ID += "=== URL: " + BaseAPI + "/user/auth" + "?realm=" + "bolter" + "\r\n";
//                    S_ID += "=== Runner: " + ID + "\r\n";
//                }
//            }
//            return S_ID;  
//        } catch (IOException | JSONException ex){
//            return "=== Get_Bolter_User_Site_ID > ERROR: " + ex.getMessage() + "\r\n";
//        }
//    }   
}
