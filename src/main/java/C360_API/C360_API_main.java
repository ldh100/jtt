package C360_API;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.base.Stopwatch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingWorker;
import org.json.JSONObject;

public class C360_API_main {   

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    protected String JOB_Name = ""; 
    protected String Realm = "";
    protected String Auth = "";
    protected String NewID = "";

    protected String C360_ADMIN_ID = "";
    protected String C360_ADMIN_PW = "";
    protected String C360_User_ID = "";
    protected String C360_User_TKN = "";


    private String HTML_Report_Path = "";
    private String Report_Date = "";
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    protected JSONObject json;
    protected String SCOPE = "";

    private SwingWorker BW1;
    private Instant run_start;
    protected String r_time = "";
    private boolean Zip_Report = true;
    private boolean _Slack = false;
    private String Slack_Channel = "";
    private String Log = "";

    private boolean Load;
    private boolean CONFIG = false;

    private final Stopwatch sw1 = Stopwatch.createUnstarted();
    private final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    private final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private String SQL = "";

    private String url = "";
    protected String app = "C360";
    protected String env = "";
    protected String BaseAPI = "";
    protected String BODY = "";



    protected int _t = 0; // Total
    protected int _p = 0; // Passed
    protected int _f = 0; // Failed
    protected int _w = 0; // Warn
    protected int _i = 0; // Info
    protected String t = "";
    protected String EX = "";
    protected String err = "";
    protected String Summary = "";
    protected boolean FAIL = false;
    protected boolean FATAL_FAIL = false;
    protected String r_type = "";
    protected String t_rep = "";

    protected int t_calls = 0;
    protected double t_min = 0;
    protected double t_max = 0;
    protected double t_avg = 0;
    protected double p_50 = 0;
    protected double p_90 = 0;
    private Duration DD;
    private String Report_File = "";
    // </editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="Extend HTML Report Methods">
    protected void Extent_Report_Config() throws IOException {
        HTML_Report_Path = System.getProperty("user.home") + File.separator + "Desktop";
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + "C360_API_" + env + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);

        HtmlReport.setSystemInfo("Application", "C360 API(s)");
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID);
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        HtmlReport.setReportUsesManualConfiguration(true); // DEBUG - steps duration time incorrect

        HtmlReporter.config().setDocumentTitle("JTT C360 API Automation Report");
        //HtmlReporter.config().setTheme(Theme.DARK);               
        HtmlReporter.config().setTheme(Theme.STANDARD);
    }
    protected void Log_Html_Result(String RES, String Test_Description, ExtentTest Test, Date API_Start) {
        switch (RES) {
            case "PASS":
                Test.log(Status.PASS, MarkupHelper.createLabel(Test_Description, ExtentColor.GREEN));
                break;
            case "FAIL":
                Test.log(Status.FAIL, MarkupHelper.createLabel(Test_Description, ExtentColor.RED));
                break;
            case "INFO":
                Test.log(Status.INFO, MarkupHelper.createLabel(Test_Description, ExtentColor.BLUE));
                break;
            case "WARN":
                Test.log(Status.WARNING, MarkupHelper.createLabel(Test_Description, ExtentColor.YELLOW));
                break;
        }
        Test.getModel().setStartTime(API_Start);
        Test.getModel().setEndTime(new Date());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Automated JOB">
    public String JOB_Run_Auto(String job_name, String run_type, String config) {
        JOB_Name = job_name;
        run_start = Instant.now();
        Log = "";
        String RES = "";

        RES = JOB_Load_CONFIG(config);
        if (RES.contains("ERROR")) {
            Current_Log_Update(false, RES);
            return "JOB_Load_CONFIG > " + RES;
        }
        Current_Log_Update(false, RES);
        if (!RES.contains("OK")) {
            return RES;
        }

        try {
            Current_Log_Update(false, "= Auto Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
            NewID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
            EX = "";
            t_calls = 0;
            t_min = 0;
            t_avg = 0;
            t_max = 0;
            p_50 = 0;
            p_90 = 0;
            _t = 0; // Total
            _p = 0; // Passed
            _f = 0; // Failed
            _w = 0; // Warn
            _i = 0; // Info
            r_time = "";
            r_type = run_type;

            if (sw1.isRunning()) {
                sw1.reset();
            }
            sw1.start();
            LOG_START();   // ========================================================
            BW1_DoWork(false);
        } catch (Exception ex) {
            return "ERROR > " + ex.getMessage();
        }
        return "OK > Job Started >> Please Monitor Reports...";
    }

    private String JOB_Load_CONFIG(String config) {
        String[] lines = config.split("\n");
        String value;
        try {
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if (l.contains("env: ")) { env = value; }
                if (l.contains("app: ")) { app = value; }
                if (l.contains("url: ")) { url = value; }

                if (l.contains("SlackCh: ")) { Slack_Channel = value; }
                if (l.contains("_slack: ")) {  _Slack = Boolean.parseBoolean(value); }
                if (l.contains("_zip_report: ")) { Zip_Report = Boolean.parseBoolean(value); }
                
                if (l.contains("C360_ADMIN_ID: ")) { C360_ADMIN_ID = value; }
                if (l.contains("C360_ADMIN_PW: ")) { C360_ADMIN_PW = value; } 

            }
            CONFIG = true;
            switch (env) {
                case "ST":
                    BaseAPI = "https://api.compassdigital.org/staging";
                    break;
                case "DE":
                    BaseAPI = "https://api.compassdigital.org/dev";
                    break;
                default:
                    BaseAPI = "https://api.compassdigital.org/v1";
                    break;
            }         

            Current_Log_Update(true, "= JOB_Load_CONFIG > OK" + "\r\n");
            return "OK";
        } catch (Exception ex) {
            CONFIG = false;
            Current_Log_Update(true, "= JOB_Load_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            return "ERROR > " + ex.getMessage();
        }
    }

    protected void Current_Log_Update(boolean GUI, String Text) {
        Log += Text;
    }

    private void LOG_UPDATE(String LOG) {
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[aw_result] SET "
                    + " [Date] = ?"
                    + // 1
                    ", [Time] = ?"
                    + // 2
                    ", [app] = ?"
                    + // 3
                    ", [url] = ?"
                    + // 4
                    ", [summary] = ?"
                    + // 5
                    ", [t_calls] = ?"
                    + // 6
                    ", [t_min] = ?"
                    + // 7
                    ", [t_avg] = ?"
                    + // 8
                    ", [t_max] = ?"
                    + // 9
                    ", [p_50] = ?"
                    + // 10
                    ", [p_90] = ?"
                    + // 11
                    ", [test_type] = ?"
                    + // 12
                    ", [user_id] = ?"
                    + // 13
                    ", [user_ws] = ?"
                    + // 14
                    ", [env] = ?"
                    + // 15
                    ", [Result] = ?"
                    + // 16
                    ", [Status] = ?"
                    + // 17
                    ", [Excel] = ?"
                    + // 18
                    " WHERE [app] = 'C360_API_" + env + "' AND [Status] = 'Running' AND [user_id] = '" + A.A.UserID + "' AND [user_ws] = '" + A.A.WsID + "'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "C360_API_" + env);
            _update.setString(4, url);
            _update.setString(5, Summary + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")");
            _update.setInt(6, t_calls);
            _update.setDouble(7, t_min);
            _update.setDouble(8, t_avg);
            _update.setDouble(9, t_max);
            _update.setDouble(10, p_50);
            _update.setDouble(11, p_90);
            _update.setString(12, r_type);
            _update.setString(13, A.A.UserID);
            _update.setString(14, A.A.WsID);
            _update.setString(15, env);
            _update.setString(16, LOG);
            _update.setString(17, "Scope: " + "All");
            _update.setString(18, EX);
            int row = _update.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            //
        }
    }
    private void LOG_START() {
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[aw_result] ("
                    + "[Date]" + // 1
                    ", [Time]" + // 2
                    ", [app]" + // 3
                    ", [url]" + // 4
                    ", [summary]" + // 5
                    ", [t_calls]" + // 6
                    ", [t_min]" + // 7
                    ", [t_avg]" + // 8
                    ", [t_max]" + // 9
                    ", [p_50]" + // 10
                    ", [p_90]" + // 11
                    ", [test_type]" + // 12
                    ", [user_id]" + // 13
                    ", [user_ws]" + // 14
                    ", [env]" + // 15
                    ", [Result]" + // 16
                    ", [Status]" + // 17
                    ", [Excel]" + // 18
                    ") VALUES ("
                    + "?" + // 1
                    ",?" + // 2
                    ",?" + // 3
                    ",?" + // 4
                    ",?" + // 5
                    ",?" + // 6
                    ",?" + // 7
                    ",?" + // 8
                    ",?" + // 9
                    ",?" + // 10
                    ",?" + // 11
                    ",?" + // 12
                    ",?" + // 13
                    ",?" + // 14
                    ",?" + // 15
                    ",?" + // 16
                    ",?" + // 17
                    ",?" + // 18
                    ")");
            _insert.setString(1, LocalDateTime.now().format(Date_formatter));
            _insert.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _insert.setString(3, "C360_API_" + env);
            _insert.setString(4, url);
            _insert.setString(5, "Running...");
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, r_type);
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
            _insert.setString(15, env);
            _insert.setString(16, "=== Job is running... ===\r\n" + "");
            _insert.setString(17, "Running");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            //
        }
    }

    private void BW1_DoWork(Boolean GUI) {
        BW1 = new SwingWorker() {
            @Override
            protected String doInBackground() throws Exception {
                Extent_Report_Config();
                NewID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
                
                Execute(); // ======================================================================= 

                if (_f > 0) {
                    return "= Execution finished @" + LocalDateTime.now().format(A.A.Time_12_formatter) + " with " + _f + " FAIL(s)";
                } else {
                    return "= Execution finished @" + LocalDateTime.now().format(A.A.Time_12_formatter);
                }
            }

            @Override
            protected void done() {
                try {
                    Summary = "";
                    String statusMsg = (String) get();
                    BW1 = null;
                } catch (InterruptedException | ExecutionException ex) {
                    Current_Log_Update(GUI, "- Execution ERROR: " + ex.getMessage() + "\r\n");
                    Summary = " Execution Error: " + ex.getMessage();
                    Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs
                    _t++;
                    _f++;
                    EX += " - " + "\t" + "=== Fatal Execution Error ===" + "\t" + " >>> " + "\t" + ex.getMessage() + "\t" + "FAIL" + "\t" + " - "
                        + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + "no_jira" + "\r\n";
                    Log_Html_Result("FAIL", ex.getMessage(), ParentTest.createNode("Fatal Execution Error"), API_SRART);                    
                    
                }
                BW1_Done(GUI); // ================================================================================ 
            }
        };
        BW1.execute();
    }

    private void BW1_Done(boolean GUI) {       
        DD = Duration.between(run_start, Instant.now());
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
        Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");

        if (!"".equals(r_time.trim())) {
            double[] am0 = Arrays.stream(r_time.split(";")).mapToDouble(Double::parseDouble).toArray();
            if (am0.length > 0) {
                Arrays.sort(am0);
                double total = 0;
                for (int i = 0; i < am0.length; i++) {
                    total = total + am0[i];
                }
                t_calls = am0.length;
                t_min = am0[0] / (double) 1000;
                t_avg = (total / am0.length) / (double) 1000;
                t_max = am0[am0.length - 1] / (double) 1000;
                p_50 = A.Func.p50(am0) / (double) 1000;
                p_90 = A.Func.p90(am0) / (double) 1000;

                t_rep += " Response (sec) > Min: " + A.A.df.format(t_min)
                        + ", Avg: " + A.A.df.format(t_avg)
                        + ", Max: " + A.A.df.format(t_max)
                        + ", p50: " + A.A.df.format(p_50)
                        + ", p90: " + A.A.df.format(p_90);
            }
            Current_Log_Update(GUI, t_rep + "\r\n");
        }               

        EX = "C360_API_" + env + ". "
                + " Steps: " + _t + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ", Info: " + _i
                + ". " + t_rep
                + ". Dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + "\r\n"
                + "#\tTC\tTarget/Element/Input\tExpected/Output\tResult\tComment/Error\tResp\tTime\tJIRA\r\n"
                + EX;

        Current_Log_Update(GUI, EX.replaceAll("\t", " > ") + "\r\n");        
           
        Summary = "Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i + Summary;
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= C360 API(s) " + ", Environment: " + env + "\r\n");


        LOG_UPDATE(Log); // ========================================================
        
        HtmlReporter.config().setReportName("C360 API(s)" + ", Env: " + env
                + ", Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i
                + ". Resp(sec) - Min: " + A.A.df.format(t_min)
                + ", Avg: " + A.A.df.format(t_avg)
                + ", Max: " + A.A.df.format(t_max)
                + ", p50: " + A.A.df.format(p_50)
                + ", p90: " + A.A.df.format(p_90)
                + ". Dur: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s");
        HtmlReport.flush();

        if (_Slack && !Slack_Channel.equals("N/A")) {

            String MSG = JOB_Name + " Excel Automation report - " + Report_Date
                    + "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: " + A.A.UserID + "\r\n"
                    + "Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n"
                    + "Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i;

            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(Report_File, Slack_Channel, MSG));
            File ef = new File(Report_File);
            if (ef.exists() && !ef.isDirectory()) {
                ef.delete();
            }
            
            String HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Click to Open";
            String HTML_Path = HtmlReporter.getFile().getAbsolutePath();
            if (Zip_Report) {
                String Origin_HTML = HTML_Path;
                HTML_Path = A.Func.Zip_File(HTML_Path);
                File hf = new File(Origin_HTML);
                if (hf.exists() && !hf.isDirectory()) {
                    hf.delete();
                }
                HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Extract Here > open unzipped HTML file";
            }
            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(HTML_Path, Slack_Channel, HTML_Report_Msg));
            File hf = new File(HTML_Path);
            if (hf.exists() && !hf.isDirectory()) {
                hf.delete();
            }
        }
    }
    //</editor-fold>   

    protected void JOB_Api_Call(String NAME, String Method, String EndPoint, String AUTH, String BODY, int ExpStatus, ExtentTest ParentTest, String JIRA) {
        FAIL = false;
        String Result = "?";
        int status = 0;
        String R_Time = "";
        String ErrorMsg = "";
        json = null;
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs
        RequestSpecification request;
        request = RestAssured.given();
        if (!AUTH.isEmpty()) {
            request.header("Authorization", AUTH);
        }
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        try {
            if (sw1.isRunning()) {
                sw1.reset();
            }
            _t++;
            sw1.start();
            Response response = null;
            switch (Method) {
                case "GET":
                    if (BODY.equals("Bolter")) {
                        request.header("From", "Bolter/1.0");
                    }
                    response = request.get(EndPoint);
                    break;
                case "POST":
                    request.body(BODY);
                    response = request.post(EndPoint);
                    break;
                case "PATCH":
                    request.body(BODY);
                    response = request.patch(EndPoint);
                    break;
                case "DELETE":
                    request.body(BODY);
                    response = request.delete(EndPoint);
                    break;
                case "PUT":
                    request.body(BODY);
                    response = request.put(EndPoint);
                    break;
                case "OPTIONS":
                    response = request.options(EndPoint);
                    break;
                default:
                    break;
            }
            Result = response.getStatusLine();
            status = response.getStatusCode();

            if (response.asString().startsWith("{") && response.asString().endsWith("}")) {
                json = new JSONObject(response.asString());
                if (json.has("message")) {
                    ErrorMsg = "Error Message: " + json.getString("message") + ". ";
                } else if(json.has("error")){
                    ErrorMsg = "Error: " + json.getString("error") + ". ";
                }
            }
            R_Time = String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec";
            if (status == ExpStatus) {
                _p++;
                EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + ErrorMsg + Result + "\t" + "PASS" + "\t" + " - "
                        + "\t" + R_Time + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", ErrorMsg + "Expected Status Code: " + ExpStatus + " > Actual: " + status + ", Result: " + Result + " (" + R_Time + ")",
                        ParentTest.createNode(_t + ". " + NAME + " > " + Method + ": " + EndPoint), API_SRART);                
            } else {
                _f++;
                FAIL = true;
                EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + ErrorMsg + Result + "\t" + "FAIL" + "\t" + " - "
                        + "\t" + R_Time + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("FAIL", ErrorMsg + "Expected Status Code: " + ExpStatus + " > Actual: " + status + ", Result: " + Result + " (" + R_Time + ")",
                        ParentTest.createNode(_t + ". " + NAME + " > " + Method + ": " + EndPoint), API_SRART);
            }
        } catch (Exception ex) {
            R_Time = String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec";
            _f++;
            FAIL = true;
            err = ex.getMessage().trim();
            if (err.contains("\n")) {
                (err = err.substring(0, err.indexOf("\n"))).trim();
            }
            EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + Result + "\t" + "FAIL" + "\t" + err
                    + "\t" + String.format("%.2f", (double) (sw1.elapsed(TimeUnit.MILLISECONDS)) / (long) (1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + " (" + R_Time + ")", ParentTest.createNode(_t + ". " + NAME + " > " + Method + ": " + EndPoint), API_SRART);
        }
        r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
        sw1.reset();
    }
    
    private void Execute() throws Exception {       
        if (true) {
            SCOPE += "Login ";
            EX += " - " + "\t" + "Login" + "\t" + " " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest = HtmlReport.createTest("Login");
            login BR = new C360_API.login(C360_API_main.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;
            ParentTest.getModel().setName("Login - Tot: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());
            C360_User_ID = BR.C360_User_ID;
            C360_User_TKN = BR.C360_User_TKN;
        }
        if (true) {
            SCOPE += "Users ";
            EX += " - " + "\t" + "Users" + "\t" + " " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest = HtmlReport.createTest("Users");
            cafe360user BR = new C360_API.cafe360user(C360_API_main.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;
            ParentTest.getModel().setName("Users - Tot: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());
            C360_User_ID = BR.C360_User_ID;
            C360_User_TKN = BR.C360_User_TKN;
        }  
        if (true) {
            SCOPE += "Orders ";
            EX += " - " + "\t" + "Orders" + "\t" + " " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest = HtmlReport.createTest("Orders");
            orders BR = new C360_API.orders(C360_API_main.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;
            ParentTest.getModel().setName("Orders - Tot: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());
            C360_User_ID = BR.C360_User_ID;
            C360_User_TKN = BR.C360_User_TKN;
        }       
   }
}
