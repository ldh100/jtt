/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Android;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author oleg.spozito
 */
public class An_Mob extends An_GUI { 
    private String err;
    protected void Reset_App(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "resetApp()";
        try {
            ad.resetApp();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "test"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }     
    protected void HideKeyboard(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            if(ad.isKeyboardShown()){
                ad.hideKeyboard();                
                EX += _t + "\t" + NAME + "\t" + "Keyboard is Shown"  + "\t" + "hideKeyboard" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }else{
                EX += _t + "\t" + NAME + "\t" + "Keyboard is Not Shown"  + "\t" + " - " + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            }
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    } 
    protected void Swipe_From_Screen_Center(String NAME, String DIRECTION, int DURATION, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            int h = ad.manage().window().getSize().height; 
            int w = ad.manage().window().getSize().width;
            int endX = w/2;
            int endY = h/2;
            int startX = w/2;
            int startY = h/2; 
            
            switch (DIRECTION) {
                case "UP":
                    endX = w/2;  
                    endY = 10;
                    break;
                case "DOWN":
                    endX = w/2;  
                    endY = h - 10;
                    break;
                case "LEFT":
                    endX = 10;  
                    endY = h/2;
                    break;
                case "RIGHT":
                    endX = w - 10;  
                    endY = h/2;
                    break;
                default:
                    break;
            }        
            new TouchAction(ad)
                    .press(point(startX, startY))
                    .waitAction(waitOptions(Duration.ofMillis(DURATION)))
                    .moveTo(point(endX, endY)).release().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Swipe " + DIRECTION + "\t" + "Swipe OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Swipe " + DIRECTION + "\t" + "Swipe Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }    
    protected void Swipe_From_Elenent_XY(String NAME, AndroidElement E, String DIRECTION, int DURATION, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;

        try {
            int h = ad.manage().window().getSize().height; 
            int w = ad.manage().window().getSize().width;
            int endX = w/2;
            int endY = h/2; 
            int startX = E.getLocation().x;
            int startY = E.getLocation().y;
            
            switch (DIRECTION) {
                case "UP":
                    endX = w/2;  
                    endY = 10;
                    break;
                case "DOWN":
                    endX = w/2;  
                    endY = h - 10;
                    break;
                case "LEFT":
                    endX = 10;  
                    endY = h/2;
                    break;
                case "RIGHT":
                    endX = w - 10;  
                    endY = h/2;
                    break;
                default:
                    break;
            }        
            new TouchAction(ad)
                    .press(point(startX, startY))
                    .waitAction(waitOptions(Duration.ofMillis(DURATION)))
                    .moveTo(point(endX, endY)).release().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + DIRECTION + "\t" + "Swipe OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIRECTION + "\t" + "Swipe Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }    
    protected void Wait_For_Element_By_Path_Visibility(String NAME, String BY, String PATH, String JIRA ){
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Done in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Wait_For_Element_By_Path_Presence(String NAME, String BY, String PATH, String JIRA ){
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Done in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Wait_For_Element_By_Path_InVisibility(String NAME, String BY, String PATH, String JIRA ){
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Done in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    protected void Scroll_to_Element(String NAME, AndroidElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            ((JavascriptExecutor)ad).executeScript("arguments[0].scrollIntoView(true);", E);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Move_to_Element(String NAME, AndroidElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(ad);
            action.moveToElement(E).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    } 
    protected void Click_out_of_Element(String NAME, AndroidElement E, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            int XX = E.getLocation().x;
            int YY = E.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + ae.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + ae.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(ad);
            action.moveToElement(E, XX, YY).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    } 
    protected void Move_to_Element_By_Path(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.moveToElement(ae).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Move_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            
            int XX = ae.getLocation().x;
            int YY = ae.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + ae.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + ae.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(ad);
            action.moveToElement(ae, XX, YY).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Move '" + DIRECTION + "' of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Click_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }

            int XX = ae.getLocation().x;
            int YY = ae.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + ae.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + ae.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }            
            
            Actions action = new Actions(ad);
            action.moveToElement(ae, XX, YY).click().perform();
            //Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    protected void Text_Found(String NAME, String VAL, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";
        try {
            ae = ad.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
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
    protected void Find_Text(String NAME, String VAL, Boolean EXPECTED,String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "Not Found";
        try {
            ae = ad.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = ae.getText();
            if(t.trim().equals("")){
                t = ae.getAttribute("content-desc");
            }
            if(t != null && t.trim() != ""){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
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
            F += _t + " > " + err + "\r\n";                
            } else {
                _p++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        }
        sw1.reset();
    }    

    protected void Element_E1_Find(String NAME, String BY, String PATH, String JIRA ){
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    ae1 = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae1 = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae1 = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae1 = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae1 = ad.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    ae1 = ad.findElement(By.name(PATH));                
                    break;
                 case "linkText":
                    ae1 = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae1 = ad.findElement(By.partialLinkText(PATH));
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
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_E2_Find(String NAME, String BY, String PATH, String JIRA ){
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    ae2 = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae2 = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae2 = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae2 = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae2 = ad.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    ae2 = ad.findElement(By.name(PATH));                   
                case "linkText":
                    ae2 = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae2 = ad.findElement(By.partialLinkText(PATH));
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
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Click(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.moveToElement(ae).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text(String NAME, String BY, String PATH, String JIRA ){
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    t = ad.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = ad.findElement(By.cssSelector(PATH)).getText();   
                    break;
                case "className":
                    t = ad.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = ad.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = ad.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = ad.findElement(By.name(PATH)).getText();                    
                    break;
                case "linkText":
                    t = ad.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = ad.findElement(By.partialLinkText(PATH)).getText();
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
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Attribute(String NAME, String BY, String PATH, String VAL, String JIRA ){
        t = ""; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            switch (BY) {
                case "xpath":
                    t = ad.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = ad.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = ad.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = ad.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = ad.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = ad.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = ad.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = ad.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
                    break;
                default:
                    break;
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
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
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_Select_Copy(String NAME, String BY, String PATH, String JIRA ){
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;                    
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy                 
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }
            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Copy(String NAME, String BY, String PATH, String JIRA ){
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.doubleClick(ae).perform();
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy             
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }            

            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  String JIRA ){
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.doubleClick(ae).perform();
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                ae.sendKeys(Keys.chord(Keys.CONTROL, "v")); //paste       
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                ae.sendKeys(Keys.chord(Keys.COMMAND, "v")); //paste                
            }               
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + " > " + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Input_Select_Clear(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH)); 
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it                  
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }

            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_Enter(String NAME, String BY, String PATH, String VAL, boolean HIDE,String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            if(null != BY) switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH)); 
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            ae.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }

    protected void Element_Text(String NAME, AndroidElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t = "?";
        try {
            t = E.getText();
            if(t.trim().equals("")){
                //t = E.getAttribute("content-desc");
                t = E.getAttribute("name");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_Text_Clear(String NAME, AndroidElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {      
            if(A.A.WsOS.toLowerCase().contains("windows")){
                E.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it              
            }else{
                E.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }   
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Text cleared"+ "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_Text_Enter(String NAME, AndroidElement E, String VAL, String JIRA ){
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
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_Attribute(String NAME, AndroidElement E, String VAL, String JIRA ){       
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
                t = t.replaceAll("[ ]+", " "); 
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
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void Element_Click(String NAME, AndroidElement E, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(ad);
            action.moveToElement(E).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    protected void Element_Child_List_L1(String NAME, AndroidElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.className(PATH));
                    break;
                case "id":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL1.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    protected void Element_Child_List_L2(String NAME, AndroidElement  E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.className(PATH));
                    break;
                case "id":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL2.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L2.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    protected void Element_Child_E2(String NAME, AndroidElement E, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae2 = (AndroidElement) E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae2 = (AndroidElement) E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae2 = (AndroidElement) E.findElement(By.className(PATH));
                    break;
                case "id":
                    ae2 = (AndroidElement) E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae2 = (AndroidElement) E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae2 = (AndroidElement) E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    ae2 = (AndroidElement) E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae2 = (AndroidElement) E.findElement(By.partialLinkText(PATH));
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
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text(String NAME, AndroidElement E, String BY, String PATH, String JIRA ){
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
                t = E.getAttribute("content-desc");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
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
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text_Enter(String NAME, AndroidElement E, String BY, String PATH, String VAL, boolean HIDE, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        AndroidElement _e = null;
        try {
            switch (BY) {
                case "xpath":
                    _e = (AndroidElement) E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    _e = (AndroidElement) E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    _e = (AndroidElement) E.findElement(By.className(PATH));
                    break;
                case "id":
                    _e = (AndroidElement) E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    _e = (AndroidElement) E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    _e = (AndroidElement) E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    _e = (AndroidElement) E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    _e = (AndroidElement) E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _e.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }            
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    protected void Element_Child_Click(String NAME, AndroidElement E, String BY, String PATH, String JIRA ){
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
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
    protected void Element_Child_Attribute(String NAME, AndroidElement E, String BY, String PATH, String VAL, String JIRA ){
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
                t = t.replaceAll("[ ]+", " ");
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
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }

    protected void List_L0(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL0 != null) {aL0.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL0 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL0 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL0 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL0 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL0 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL0 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL0 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL0 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL0.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L0.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        }
        sw1.reset();
    }
    protected void List_L1(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL1 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL1 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL1 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL1 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL1 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL1 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL1 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL1 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL1.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    protected void List_L2(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL2 != null) {aL2.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL2 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL2 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL2 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL2 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL2 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL2 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL2 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL2 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL2.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L2.isEmpty()" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }
    protected void List_L3(String NAME, String BY, String PATH, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        if(aL3 != null) {aL3.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL3 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL3 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL3 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL3 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL3 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL3 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL3 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL3 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL3.isEmpty()){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L3.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + PATH + "\t" + aL3.size() + " item(s) (L3)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += _t + " > " + err + "\r\n";
        } 
        sw1.reset();
    }    
}
