/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import static A.A.*;
import com.google.common.base.Stopwatch;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Oleg.Spozito
 */

public class TWeb {
    private static final Stopwatch sw1 = Stopwatch.createUnstarted();
    public static void Open_Switch_to_2nd_Tab(String NAME, String LINK, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            ((JavascriptExecutor) d1).executeScript("window.open(arguments[0])", LINK);
            ArrayList<String> tabs = new ArrayList<>(d1.getWindowHandles());
            d1.switchTo().window(tabs.get(1));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }    
    public static void Close_Current_Tab_switch_To_1st(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            d1.close();
            ArrayList<String> tabs = new ArrayList<>(d1.getWindowHandles());
            d1.switchTo().window(tabs.get(0));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Page_URL(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }    
    public static void Navigate_to_URL(String NAME, String URL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            d1.navigate().to(URL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "URL" + "\t" + URL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + URL + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Navigate_Back(String NAME, String FROM, String TO, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            d1.navigate().back();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Navigate_Forward(String NAME, String FROM, String TO, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            d1.navigate().forward();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM+ "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Refresh(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            d1.navigate().refresh();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Clear_Cookies_Restart_Driver(String BROWSER,String JIRA ){
       sw1.start();
       FAIL = false;
        try {
            d1.manage().deleteAllCookies();
            d1.quit();
            d1 = null;
            if(WsOS.toLowerCase().contains("windows")){
                System.setProperty("webdriver.chrome.driver", CWD + "\\chromedriver.exe");                
                System.setProperty("webdriver.edge.driver", CWD + "\\msedgedriver.exe");  
                System.setProperty("webdriver.gecko.driver", CWD + "\\geckodriver.exe"); 
                System.setProperty("webdriver.ie.driver", CWD + "\\IEDriverServer.exe"); 
            }
            if(WsOS.toLowerCase().contains("mac")){
                System.out.println("******** " + CWD + "/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", CWD + "/chromedriver");  
               // System.setProperty("webdriver.chrome.driver", "/Users/prathyusha.deshpande/distilr/BrowserDriver/87/chromedriver");            
                System.setProperty("webdriver.edge.driver", CWD + "/msedgedriver");  
                System.setProperty("webdriver.gecko.driver", CWD + "/geckodriver");
                System.setProperty("webdriver.safari.driver", CWD + "/safaridriver");
            }
            switch (BROWSER) {
                case "Chrome":
                        ChromeOptions chrome_op = new ChromeOptions();
                        //chrome_op.addExtensions(new File("/path/to/extension.crx"));
                        chrome_op.addArguments("--disable-infobars");
                        chrome_op.addArguments("--start-maximized");
            //            chrome_op.addArguments("--start-minimized");
            //            chrome_op.addArguments("enable-automation");
            //            chrome_op.addArguments("--no-sandbox");
            //            chrome_op.addArguments("--disable-extensions");
            //            chrome_op.addArguments("--dns-prefetch-disable");
            //            chrome_op.addArguments("--disable-gpu");
//                        if(_Headless){
//                            chrome_op.addArguments("--headless");
//                        }
                        chrome_op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        d1 = new ChromeDriver(chrome_op);
                    break;
                case "Edge":
//                    txtLog.append("=== Edge Driver:" + System.getProperty("webdriver.edge.driver") + "\r\n");
//                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                        EdgeDriverService edgeServise = EdgeDriverService.createDefaultService();
                        //edgeServise.SuppressInitialDiagnosticInformation = true;
//                        service.seVerboseLogging = false;
//                        service.UseSpecCompliantProtocol = false;
                        EdgeOptions edge_op = new EdgeOptions();
                       //edge_op.setPageLoadStrategy("normal");
                        edge_op.setCapability( "disable-infobars", true);
                        edge_op.setCapability( "disable-gpu", true);
                        edge_op.setCapability("useAutomationExtension", false);
//                                PageLoadStrategy = PageLoadStrategy.Default,
//                                UnhandledPromptBehavior = UnhandledPromptBehavior.Dismiss
//                        if(_Headless){
//                            edge_op.setCapability( "headless", true);
//                        }
                        
                        d1 = new EdgeDriver(edgeServise, edge_op);
                    break;
                case "Firefox":
                        FirefoxProfile profile = new FirefoxProfile();
                        profile.setPreference("network.proxy.no_proxies_on", "localhost");
                        profile.setPreference("javascript.enabled", true);

//                        DesiredCapabilities capabilities = DesiredCapabilities.;
//                        capabilities.setCapability("marionette", true);
//                        capabilities.setCapability(FirefoxDriver.PROFILE, profile);

                        FirefoxOptions ff_op = new FirefoxOptions();
                        //ff_op.merge(capabilities);
                        //ff_op.addPreference("browser.link.open_newwindow", 3);
                        //ff_op.addPreference("browser.link.open_newwindow.restriction", 0);

                        d1 = new FirefoxDriver(ff_op);
                    break;
                case "IE11":
                        InternetExplorerOptions ie_op = new InternetExplorerOptions();
                        ie_op.ignoreZoomSettings(); // Not necessarily in case 100% zoom.
                        ie_op.introduceFlakinessByIgnoringSecurityDomains(); // Necessary to skip protected  mode setup
                        ie_op.elementScrollTo(ElementScrollBehavior.BOTTOM);
                        ie_op.disableNativeEvents();
//                        var options = new InternetExplorerOptions
//                        {
//                                IgnoreZoomLevel = true,
//                                IntroduceInstabilityByIgnoringProtectedModeSettings = true,
//                                RequireWindowFocus = false,
//                                ElementScrollBehavior = InternetExplorerElementScrollBehavior.Top, // with button click doesn't work
//                                EnsureCleanSession = true,
//                                //AcceptInsecureCertificates = true,
//                                EnablePersistentHover = true,
//                                UnhandledPromptBehavior = UnhandledPromptBehavior.Accept,
//                                EnableNativeEvents = false //  with true > click problem
//                        };
                        d1 = new InternetExplorerDriver(ie_op);
                    break;
                case "Safari":
                        //To do on MAC machine // =====================================
                        d1 = new SafariDriver();     
                    break;
            }

            d1.manage().window().maximize();
            d1.manage().deleteAllCookies(); // =================================
            
            d1.manage().timeouts().pageLoadTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().setScriptTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);
            loadTimeout = new FluentWait(d1).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
			.pollingEvery(Duration.ofMillis(200))  			
			.ignoring(NoSuchElementException.class);       // for load > progress
            
            _p++;
            EX += _t + "\t" + "Clear Cookies & Re-start Driver" + "\t" + "Current page" + "\t" + "d1.manage().deleteAllCookies()" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Clear Cookies & Re-start Driver" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    public static void To_Top(String JIRA ){
       sw1.start();
       FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.HOME).perform();
            _p++;
            EX += _t + "\t" + "Move to page Top" + "\t" + "Current page" + "\t" + "Scroll bar at top" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Top" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void To_Bottom(String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.END).perform();
            _p++; 
            EX += _t + "\t" + "Move to page Bottom" + "\t" + "Current page" + "\t" + "Scroll bar at Bottom" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Bottom" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Swith_to_Frame(String NAME, String BY, String PATH, String JIRA ){
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "defaultContent":
                    d1.switchTo().defaultContent(); 
                    break;
                case "xpath":
                    d1.switchTo().frame(d1.findElement(By.xpath(PATH)));
                    break;
                case "css":
                    d1.switchTo().frame(d1.findElement(By.cssSelector(PATH)));  
                    break;
                case "className":
                    d1.switchTo().frame(d1.findElement(By.className(PATH)));
                    break;
                case "id":
                    d1.switchTo().frame(d1.findElement(By.id(PATH)));
                    break;
                case "tagName":
                    d1.switchTo().frame(d1.findElement(By.tagName(PATH)));
                    break;
                case "name":
                    d1.switchTo().frame(d1.findElement(By.name(PATH)));
                    break;
                case "linkText":
                    d1.switchTo().frame(d1.findElement(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    d1.switchTo().frame(d1.findElement(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            EX += _t + "\t" + NAME + "\t" + BY  + "\t" + PATH + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 

        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Scroll_XY(String NAME, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("window.scrollBy(" + X + "," + Y + ")", "");
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }    

    public static void Wait_For_Element_By_Path_Visibility(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.tagName(PATH)));
                    break;                     
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Wait_For_Element_By_Path_Presence(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.tagName(PATH)));
                    break;                     
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Wait_For_All_Elements_InVisibility(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {          
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.xpath(PATH))));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.cssSelector(PATH))));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.className(PATH))));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.id(PATH))));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.tagName(PATH))));
                    break;
                case "name":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.name(PATH))));
                    break;                   
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.linkText(PATH))));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.partialLinkText(PATH))));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Wait_For_Element_By_Path_InVisibility(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.tagName(PATH)));
                    break;
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Scroll_to_Element(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", E);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Move_to_Element(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    } 
    public static void Click_out_of_Element(String NAME, WebElement E, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            int XX = E.getLocation().x;
            int YY = E.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(d1);
            action.moveToElement(E, XX, YY).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    } 
    public static void Move_to_Element_By_Path(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.moveToElement(e).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Move_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            
            int XX = e.getLocation().x;
            int YY = e.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(d1);
            action.moveToElement(e, XX, YY).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Move '" + DIRECTION + "' of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Click_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }

            int XX = e.getLocation().x;
            int YY = e.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }            
            
            Actions action = new Actions(d1);
            action.moveToElement(e, XX, YY).click().perform();
            //Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Text_Found(String NAME, String VAL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            e = d1.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = "Found";
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            t = "Not Found";
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Not Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        }
        _p++;
        sw1.reset();
    }
    public static void Find_Text(String NAME, String VAL, Boolean EXPECTED,String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "Not Found";
        try {
            e = d1.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = e.getText();
            if(t.trim().equals("")){
                t = e.getAttribute("textContent");
            }
            if(t != null && t.trim() != ""){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "Not Found";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Text Found" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            if(EXPECTED){
                _f++; FAIL = false; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";                
            } else {
                _w++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found" + "\t" + "WARN" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        }
        sw1.reset();
    }    

    public static void Element_E1_Find(String NAME, String BY, String PATH, String JIRA ){
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    e1 = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e1 = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e1 = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e1 = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e1 = d1.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    e1 = d1.findElement(By.name(PATH));                
                    break;
                 case "linkText":
                    e1 = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e1 = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element Not Found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_E2_Find(String NAME, String BY, String PATH, String JIRA ){
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    e2 = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e2 = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e2 = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e2 = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e2 = d1.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    e2 = (WebElement) (By.name(PATH));                   
                case "linkText":
                    e2 = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e2 = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element Not Found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Click(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.moveToElement(e).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Text(String NAME, String BY, String PATH, String JIRA ){
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    t = d1.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = d1.findElement(By.cssSelector(PATH)).getText();   
                    break;
                case "className":
                    t = d1.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = d1.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = d1.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = d1.findElement(By.name(PATH)).getText();                    
                    break;
                case "linkText":
                    t = d1.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = d1.findElement(By.partialLinkText(PATH)).getText();
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t.replace("\r\n", " ").replace("\n", " ") + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Attribute(String NAME, String BY, String PATH, String VAL, String JIRA ){
        t = ""; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    t = d1.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = d1.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = d1.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = d1.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = d1.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = d1.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = d1.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = d1.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
                    break;
                default:
                    break;
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Text_Select_Copy(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            } 
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;                    
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            
            if(WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy                 
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }
            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex) {
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Text_DblClick_Copy(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            }
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.doubleClick(e).perform();
            if(WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy             
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }            

            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();          
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            }
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.doubleClick(e).perform();
            
            if(WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                e.sendKeys(Keys.chord(Keys.CONTROL, "v")); //paste       
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                e.sendKeys(Keys.chord(Keys.COMMAND, "v")); //paste                
            }               
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + " > " + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Input_Select_Clear(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset(); 
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH)); 
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it                  
            }else{
                //e.clear();
                e.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }

            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_Path_Text_Enter(String NAME, String BY, String PATH, String VAL, boolean HIDE, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            if(null != BY) switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH)); 
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            e.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    public static void Element_Text(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "?";
        try {
            t = E.getText();
            if(t.trim().equals("")){
                t = E.getAttribute("textContent");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_Text_Clear(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {      
            if(WsOS.toLowerCase().contains("windows")){
                E.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it              
            }else{
                E.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }   
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Text cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_Text_Enter(String NAME, WebElement E, String VAL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            E.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_Attribute(String NAME, WebElement E, String VAL, String JIRA ){       
        t = "empty";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            t = E.getAttribute(VAL);
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " "); 
            } else {
                t = "null";
            }
            if (t.contains("img-default"))
            {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
            }
        } catch(Exception ex){
            _f++; FAIL = false;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_Click(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Element_Child_List_L1(String NAME, WebElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L1 != null) {L1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L1 = E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L1 = E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L1 = E.findElements(By.className(PATH));
                    break;
                case "id":
                    L1 = E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L1 = E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L1 = E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L1 = E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L1 = E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L1.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    public static void Element_Child_List_L2(String NAME, WebElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L2 != null) {L2.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L2 = E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L2 = E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L2 = E.findElements(By.className(PATH));
                    break;
                case "id":
                    L2 = E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L2 = E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L2 = E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L2 = E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L2 = E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L2.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L2.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    public static void Element_Child_E2(String NAME, WebElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e2 = E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e2 = E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e2 = E.findElement(By.className(PATH));
                    break;
                case "id":
                    e2 = E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e2 = E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e2 = E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    e2 = E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e2 = E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element (e2) found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "e2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    public static void Element_Child_Text(String NAME, WebElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "?";
        try {
            switch (BY) {
                case "xpath":
                    t = E.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = E.findElement(By.cssSelector(PATH)).getText();
                    break;
                case "className":
                    t = E.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = E.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = E.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = E.findElement(By.name(PATH)).getText();
                    break;
                case "linkText":
                    t = E.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = E.findElement(By.partialLinkText(PATH)).getText();
                    break;
                default:
                    break;
            }
            if(t.trim().equals("")){
                t = E.getAttribute("textContent");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++;
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    public static void Element_Child_Text_Enter(String NAME, WebElement E, String BY, String PATH, String VAL, boolean HIDE, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        WebElement _e = null;
        try {
            switch (BY) {
                case "xpath":
                    _e = E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    _e = E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    _e = E.findElement(By.className(PATH));
                    break;
                case "id":
                    _e = E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    _e = E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    _e = E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    _e = E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    _e = E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _e.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }            
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void Element_Child_Click(String NAME, WebElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    E.findElement(By.xpath(PATH)).click();
                    break;
                case "css":
                    E.findElement(By.cssSelector(PATH)).click();
                    break;
                case "className":
                    E.findElement(By.className(PATH)).click();
                    break;
                case "id":
                    E.findElement(By.id(PATH)).click();
                    break;
                case "tagName":
                    E.findElement(By.tagName(PATH)).click();
                    break;
                case "name":
                    E.findElement(By.name(PATH)).click();
                    break;
                case "linkText":
                    E.findElement(By.linkText(PATH)).click();
                    break;
                case "partialLinkText":
                    E.findElement(By.partialLinkText(PATH)).click();
                    break;
                default:
                    break;
            }
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Click OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++;
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    public static void Element_Child_Attribute(String NAME, WebElement E, String BY, String PATH, String VAL, String JIRA ){
        t = "";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    t = E.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = E.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = E.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = E.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = E.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = E.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = E.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = E.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
                    break;
                default:
                    break;
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            if (t.contains("placeholder") || t.contains("adminpanel.compassdigital.org") || t.contains("img-default"))
            {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
            } 
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void List_L0(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L0 != null) {L0.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L0 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L0 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L0 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L0 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L0 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L0 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L0 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L0 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L0.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L0.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void List_L1(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L1 != null) {L1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L1 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L1 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L1 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L1 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L1 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L1 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L1 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L1 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L1.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void List_L2(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L2 != null) {L2.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L2 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L2 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L2 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L2 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L2 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L2 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L2 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L2 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L2.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L2.isEmpty()" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void List_L3(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(L3 != null) {L3.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L3 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L3 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L3 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L3 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L3 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L3 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L3 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L3 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L3.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L3.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + L3.size() + " item(s) (L3)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void List_Child_E1_By_Path(String NAME, List<WebElement> L, int I, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e1 = L.get(I).findElement(By.xpath(PATH));
                    break;
                case "css":
                    e1 = L.get(I).findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e1 = L.get(I).findElement(By.className(PATH));
                    break;
                case "id":
                    e1 = L.get(I).findElement(By.id(PATH));
                    break;
                case "tagName":
                    e1 = L.get(I).findElement(By.tagName(PATH));
                    break;
                case "name":
                    e1 = L.get(I).findElement(By.name(PATH));
                    break;
                case "linkText":
                    e1 = L.get(I).findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e1 = L.get(I).findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "List index " + I + " > " + PATH + "\t" + "element found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "List index " + I + " > " + PATH + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    public static void List_TR_TDs(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        String dt;
        String STAT = "Status: ?";
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            int TDS = X.size();
            for (int k = 0; k < TDS; k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+ ", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            if(t.endsWith(" > ")){
                t = t.substring(0, t.length() - 3); //   =========================   DEBUG
            } 

            if(NAME.startsWith("Station") && !t.toLowerCase().contains("no data") && TDS == 5 ){ // <<< td[5] - Status
                //   check status 
                STAT = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]")).getAttribute("class").trim();
                if(!STAT.equals("") && STAT.contains("mdi-eye-off")){
                    STAT = "Hidden in App";         //   v-icon mdi mdi-eye-off theme--light none--text
                } else {
                    STAT = "Display in App";        //   v-icon mdi mdi-eye theme--light
                }
                t = t + STAT;
            }
            
            if(NAME.startsWith("Modifier Group") && !t.toLowerCase().contains("no data")){ //   check status 
                STAT = X.get(X.size() - 1).findElement(By.xpath("//input[@role='checkbox']")).getAttribute("aria-checked").trim();
                t = t + STAT;
            }       
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": td(s) >>" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": td(s)" + "\t" + "table data" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void List_TR_THs(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("th"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+ ", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            if(t.endsWith(" > ")){
                t = t.substring(0, t.length() - 3); //   =========================   DEBUG
            } 
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": th(s) >>" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": th(s)" + "\t" + "table header" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Scroll_to_Day(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            e = L.get(I);
            Actions action = new Actions(d1);
            action.moveToElement(e).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + "Day " + I + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + I + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Day_Schedule(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        String Day = "";
        String Open = " -- ";
        String Close = " -- ";
        String _24 = "false";
        try {
            Day = L.get(I).findElement(By.xpath(".//p[contains(@class, 'WeekdayLabel')]")).getText();
            String X1 = L.get(I).findElement(By.cssSelector("[aria-label='24 Hour Service']")).getAttribute("aria-checked");
            String X2 = L.get(I).findElement(By.cssSelector("[aria-label='Closed All Day']")).getAttribute("aria-checked");
            
            if("true".equals(X1)){
                _24 = "24 Hour Service";  
                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
            } else if ("true".equals(X2)){
                _24 = "Closed All Day"; 
                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
            } else {
                _24 = "";
                e = L.get(I).findElement(By.cssSelector("[aria-label='Opens']"));
                e.click(); 
                
                Opens = e.findElements(By.xpath("/html/body/div/div[14]/div/div/div"));
                for (WebElement Open1 : Opens) {
                    if(Open1.getAttribute("class").contains("primary--text")){
                        Open = Open1.getText() + "|";
                        break;
                    }
                }
                if(Open.endsWith("|")){
                    Open = "Opens: " + Open.replace("|","");
                } else{
                    Open = "Opens: " + "not in View";
                }
                
                e = L.get(I).findElement(By.cssSelector("[aria-label^='Closes']"));
                e.click(); 
                Closes = e.findElements(By.xpath("/html/body/div/div[13]/div/div/div")); // /html/body/div/div[14]/div/div/div[1]
                for (WebElement Close1 : Closes) {
                    if(Close1.getAttribute("class").contains("primary--text")){
                        Close = Close1.getText() + "|";
                        break;
                    }
                } 
                if(Close.endsWith("|")){
                    Close = "Closes: " + Close.replace("|","");
                    // class="nextDayLabel" 
                } else{
                    Close = "Closes: " + "not in View";
                }

                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + (I + 1) + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Time_Enter(String NAME, List<WebElement> L, int I,String BY, String PATH, String VAL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
//            switch (BY) {
//                case "xpath":
//                    t = L.get(I).findElement(By.xpath(PATH)).getAttribute(VAL); 
//                    break;
//                case "css":
//                    t = L.get(I).findElement(By.cssSelector(PATH)).getAttribute(VAL); 
//                    break;
//                default:
//                    break;
//            }
            e = L.get(I).findElement(By.cssSelector(PATH));
            e.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    public static void Brand_Status(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            t = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]")).getAttribute("class").trim();
            if(!t.equals("") && t.contains("mdi-eye-off")){
                t = "Hidden in App";         //   v-icon mdi mdi-eye-off theme--light none--text
            } else {
                t = "Display in App";        //   v-icon mdi mdi-eye theme--light
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }     
    public static void Brand_Status_Click(String NAME, List<WebElement> L, int I,  String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            e = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]"));
            Actions action = new Actions(d1);
            action.moveToElement(e).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off" + "\t" + "action.moveToElement(e).click().perform()" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }     
    public static void Menu_Snedule(String NAME, List<WebElement> L, int I, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+ ", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            EX += _t + "\t" + NAME + "\t" + "Row Index " + I + ": td(s)" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Row" + " Index " + I + ": td(s)" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void Call_API_Auth(String NAME, String URL, boolean EXPECT_OK, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        String RR = "";
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            API_Response_Body = httpclient.execute(httpget, responseHandler);
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            EX += _t + "\t == " + NAME + "\t" + URL + "\t" + "Call successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            _p++;
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";                
            } else {
                _p++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            }
        } 
        sw1.reset();
    }
    public static void Call_API(String NAME, String URL, boolean EXPECT_OK, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        String RR = "";
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            API_Response_Body = httpclient.execute(httpget, responseHandler);
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            EX += _t + "\t == " + NAME + "\t" + URL + "\t" + "Call successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            _p++;
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";                
            } else {
                _p++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            }
        } 
        sw1.reset();
    }
    public static void API_Body_Contains(String NAME, String VAL, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        boolean FOUND;
        try {
            FOUND = API_Response_Body.contains(VAL);
            if(FOUND){
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - not expected" + "\t" + "FAIL" + "\t" + "not Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - expected" + "\t" + "FAIL" + "\t" + "Not Found - Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                }                                    
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    
    public static void Calendar_API_Closure(String NAME, String C_Name, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(C_Name)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";    
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";   
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + "Closure Title: " + C_Name + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Brand_API_Hours(String NAME, String TARGET, String From, String To, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String DAY = TARGET.substring(TARGET.length() - 1).trim();
        String from_to = "";
        int _start = 0;
        int _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            if(NAME.contains("Service Hours")){
                JSONArray Hours = json.getJSONArray("hours");
                for (int i = 0; i < Hours.length(); i++) {
                    JSONObject hours = Hours.getJSONObject(i); 
                    JSONObject day = hours.getJSONObject("day");
                    if(hours != null){
                        from_to = hours.getString("hours");
                        _start = day.getInt("start");
                        _end = day.getInt("end");
                        if(_start == Integer.parseInt(DAY)){
                            break;            
                        }
                    }                  
                }                
            }
            if(NAME.contains("Delivery Hours")){
                JSONArray Hours = json.getJSONArray("deliveryHours");
                for (int i = 0; i < Hours.length(); i++) {
                    JSONObject hours = Hours.getJSONObject(i); 
                    JSONObject day = hours.getJSONObject("day");
                    if(hours != null){
                        from_to = hours.getString("hours");
                        _start = day.getInt("start");
                        _end = day.getInt("end");
                        if(_start == Integer.parseInt(DAY)){
                            break;            
                        }
                    }                  
                }                
            }
            if(from_to.length() == 11){
                String _From = from_to.substring(0,5);
                String _To = from_to.substring(6);

                ZoneOffset _offset = OffsetDateTime.now( ZoneId.of(TZone)).getOffset();  
                Duration z_From = Duration.parse("PT" + _From.replace(":", "H") + "M");
                z_From = z_From.plusSeconds(_offset.getTotalSeconds());
                Duration z_To = Duration.parse("PT" + _To.replace(":", "H") + "M");
                z_To = z_To.plusSeconds(_offset.getTotalSeconds());

                String Z_From = String.format("%02d:%02d", z_From.toHours(), z_From.minusHours(z_From.toHours()).toMinutes());
                String Z_To = String.format("%02d:%02d", z_To.toHours(), z_To.minusHours(z_To.toHours()).toMinutes());
                Date CF = new SimpleDateFormat("hh:mm a", Locale.US).parse(From.replace("AM", " AM").replace("PM", " PM"));  
                Date DF = new SimpleDateFormat("hh:mm", Locale.US).parse(Z_From);
                Date CT = new SimpleDateFormat("hh:mm a", Locale.US).parse(To.replace("AM", " AM").replace("PM", " PM"));
                Date DT = new SimpleDateFormat("hh:mm", Locale.US).parse(Z_To);

                if(CF.compareTo(DF) == 0 && CT.compareTo(DT) == 0){                
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "AP3 change: " + From + "-" + To + "\t" + Z_From + "-" + Z_To + " TZone: " + TZone + " > UTC: " + _From + "-" + _To + " start:" + _start + ", end:" + _end + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                } else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "AP3 change: " + From + "-" + To + "\t" + Z_From + "-" + Z_To + " TZone: " + TZone + " > UTC: " + _From + "-" + _To + " start:" + _start + ", end:" + _end + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                                    
                }
            }else{
                _f++; 
                EX += _t + "\t == " + NAME + "\t" + "Wrong From - To Format" + "\t" + from_to + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                                                    
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "Day " + DAY + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void Brand_API_Is(String NAME, String TARGET, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        boolean IS_YES = false;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONObject IS = json.getJSONObject("is");

            if(TARGET.startsWith("delivery_supported") && IS.getBoolean("delivery_supported")) {
                IS_YES = true;
            }
            if(TARGET.startsWith("pickup_supported") && IS.getBoolean("pickup_supported")) {
                IS_YES = true;
            }

            if(IS_YES){
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Not Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Not Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                }                                    
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "*_supported" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    public static void Calendar_API_Pickup(String NAME, String DAY, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(DAY)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY+ "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";    
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";  
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                }
            }

        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Calendar_API_Delivey(String NAME, String DAY, boolean EXPECTED, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(DAY)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY+ "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";   
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";   
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                }
            }

        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    public static void File_Find(String NAME, String DIR, String F_NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        try {
            File folder = new File(DIR); 
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.getName().contains(F_NAME)) {
                    t = file.getName();
                    break;
                }
            }
            if("".equals(t)){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + F_NAME + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + "Delete the file after test" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    public static void File_Read(String NAME, String DIR, String F_NAME, String CHECK, String VAL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "";
        try {
            File folder = new File(DIR); 
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.getName().contains(F_NAME)) {
                    t = file.getName();
                    break;
                }
            }
            if("".equals(t)){
                _f++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + F_NAME + "\t" + "FAIL" + "\t" + "File not found";                
            }else{
                if("User_Count".equals(CHECK)){
                    ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(DIR + File.separator + t), StandardCharsets.UTF_8));
                    if(lines.size() == Integer.parseInt(VAL) + 1){
                        _p++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "PASS" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                             
                    } else{
                        _w++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "WARN" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                            
                    }
                }
                if("Site_Count".equals(CHECK)){
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    
    public static void File_Delete(String NAME, String DIR, String F_NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            File xx = new File(DIR + File.separator + F_NAME);
            if (xx.exists()) {
                xx.delete();     
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    } 
    public static void Element_SendKey_Enter(String NAME, WebElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       
 
        FAIL = false;
        try {
            E.sendKeys(Keys.chord(Keys.ENTER)); //select all text in textbox
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Enter key presses" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_DisplayCheck(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                      if(d1.findElements(By.xpath(PATH)).size()!=0)
                                  d1.findElement(By.xpath(PATH)).click();
                    break;
                case "css":
                      if (d1.findElements(By.cssSelector(PATH)).size()!=0)
                                 d1.findElement(By.cssSelector(PATH)).click();
                    break;
                case "className":
                      if(d1.findElements(By.className(PATH)).size()!=0)
                                 d1.findElement(By.className(PATH)).click();
                    break;
                case "id":
                      if(d1.findElements(By.id(PATH)).size()!=0)
                                 d1.findElement(By.id(PATH)).click();
                    break;
                case "tagName":
                      if(d1.findElements(By.tagName(PATH)).size()!=0)
                                 d1.findElement(By.tagName(PATH)).click();
                    break;
                case "name":
                      if(d1.findElements(By.name(PATH)).size()!=0)
                                 d1.findElement(By.name(PATH)).click();
                    break;
                 case "linkText":
                      if(d1.findElements(By.linkText(PATH)).size()!=0)
                                 d1.findElement(By.linkText(PATH)).click();
                    break;
                case "partialLinkText":
                      if(d1.findElements(By.partialLinkText(PATH)).size()!=0)
                                 d1.findElement(By.partialLinkText(PATH)).click();
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "item has been displayed & deleted successfully" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Scroll_to_WebElement(String NAME, String BY, String PATH, String JIRA){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       
 
        FAIL = false;
        try {         
            switch (BY) {
             case "xpath":
                 e = d1.findElement(By.xpath(PATH));
                 break;
             case "css":
                 e = d1.findElement(By.cssSelector(PATH));
                 break;
             case "className":
                 e = d1.findElement(By.className(PATH));
                 break;
             case "id":
                 e = d1.findElement(By.id(PATH));
                 break;
             case "tagName":
                 e = d1.findElement(By.tagName(PATH));
                 break;
             case "name":
                 e = d1.findElement(By.name(PATH));
                 break;
              case "linkText":
                 e = d1.findElement(By.linkText(PATH));
                 break;
             case "partialLinkText":
                 e = d1.findElement(By.partialLinkText(PATH));
                 break;
             default:
                 break;
            }            
            ((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", e);
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    
    // Added by Prathyusha  >>>> temporary
    public static void Wait_Element_Visible(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        WebDriverWait Wait_d = new WebDriverWait(d1,10);
        try {
            switch (BY) {
                case "xpath":
                    Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PATH)));                   
                    break;
                case "className":
                    Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.className(PATH)));                  
                    break;
                case "id":
                     Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.id(PATH)));                  
                    break;
                case "tagName":
                         Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(PATH)));               
                    break;
                case "name":
                     Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.name(PATH)));                    
                    break;
                 case "linkText":
                         Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(PATH)));                   
                    break;
                case "partialLinkText":
                    Wait_d.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(PATH)));                   
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Open_NewIncognitoWindow(String NAME, String JIRA){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       
 
        FAIL = false;
        try {         
            d1.close();
            ChromeOptions chrome_op = new ChromeOptions();                    
            chrome_op.addArguments("incognito"); // ==================
            chrome_op.addArguments("--disable-infobars");
            chrome_op.addArguments("--start-maximized");
            chrome_op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            d1 = new ChromeDriver(chrome_op);
            d1.manage().window().maximize();

            Thread.sleep(7000);
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Opening the Browser in Incognito Mode" + "\t" + "Incognito Mode" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Opening the Browser in Incognito Mode" + "\t" + "Not able to Open Browser in Incognito Mode" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void Element_By_DisplayChecking(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    if(!d1.findElements(By.xpath(PATH)).isEmpty())
                        e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    if (!d1.findElements(By.cssSelector(PATH)).isEmpty())
                        e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    if(!d1.findElements(By.className(PATH)).isEmpty())
                        e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    if(!d1.findElements(By.id(PATH)).isEmpty())
                        e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    if(!d1.findElements(By.tagName(PATH)).isEmpty())
                        e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    if(!d1.findElements(By.name(PATH)).isEmpty())
                        e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    if(!d1.findElements(By.linkText(PATH)).isEmpty())
                        e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    if(!d1.findElements(By.partialLinkText(PATH)).isEmpty())
                        e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(e.isSelected()) {              
                Actions action = new Actions(d1);
                action.moveToElement(e).click().perform();
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "KPI is Displayed" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void CheckboxElement_By_Path_Click(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(!e.isSelected()){
                Actions action = new Actions(d1);
                action.moveToElement(e).click().perform();
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    public static void CompareText(String NAME, String actual, String Expected,String JIRA) {
        try {
            if(actual.equals(Expected)) {
                _p++;
                EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Expected Matches " +Expected+ "  with Actual Value " +actual+ "" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }
            else if((Integer.parseInt(actual)-2)<=Integer.parseInt(Expected)) {
                _p++;
                EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Expected Matches " +Expected+ "  with Actual Value " +actual+ "" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }else {
                _f++; FAIL = true; err ="Failed to match Expected value " +Expected+ "  with Actual value - " +actual+ "";
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t"  + "L0" + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
            }
        } catch(Exception ex){
            _f++; FAIL = true; err ="Failed due to exception " + Expected + "  with Actual value - " +actual+ "";
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t"  + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
    }
    public static void Element_By_Path_Text_DblClick(String NAME, String BY, String PATH, String JIRA) {
        if (sw1.isRunning()) {
            sw1.reset();
        }
        sw1.start();

        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.moveToElement(e).doubleClick().perform();
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - "
                    + "\t" + String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch (Exception ex) {
            _f++;
            FAIL = true;
            err = ex.getMessage().trim();
            if (err.contains("\n")) {
                (err = err.substring(0, err.indexOf("\n"))).trim();
            }
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err
                    + "\t" + String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
}

