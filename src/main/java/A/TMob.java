/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import static A.A.*;
import com.google.common.base.Stopwatch;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author oleg.spozito
 */
public class TMob {
    private static final Stopwatch sw1 = Stopwatch.createUnstarted();
    public static void ResetApp(String NAME, String JIRA ){
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
    public static void Test(String NAME, String JIRA ){
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        FAIL = false;
        t ="?";

        try {
            t = "Test OK";
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
}
