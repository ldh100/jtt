package Jobs;

import com.google.common.base.Stopwatch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class _AP3_Tokens {
    private final Stopwatch sw1 = Stopwatch.createUnstarted();
    private final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    private final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private Connection conn = null;
    private String r_type = "cron";
    int _f = 0;
    private String Summary = "?"; 
    private Instant run_start;
    private Duration DD;
    private String Log = "GET AP3 Admin User Tokens: ";
    private String ADMIN_ID = "oleg.spozito@compassdigital.io";
    private String ADMIN_PW = "Password1"; 
    private String TKN = "";

    protected void AP3_Tokens(String job, String run_type, String config){
        r_type = run_type;
        run_start = Instant.now();
        try {
            conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING);
            LOG_START();

            String AUTH = "Basic " + Base64.getEncoder().encodeToString((ADMIN_ID + ":" + ADMIN_PW).getBytes());

            JOB_Api_Call("https://api.compassdigital.org/dev/user/auth?realm=6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5", AUTH);    //  DE 
            if(!TKN.isEmpty()) {
                try {    
                    PreparedStatement _update = conn.prepareStatement("UPDATE env SET ap_token = '" + TKN + "' WHERE env = 'Development'");
                    _update.executeUpdate();  
                } catch (SQLException ex) {
                    _f++;
                    Log += "  > " + ex.getMessage();
                }
            }
            JOB_Api_Call("https://api.compassdigital.org/staging/user/auth?realm=6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5", AUTH); //  ST       
            if(!TKN.isEmpty()) {
                try {  
                    PreparedStatement _update = conn.prepareStatement("UPDATE env SET ap_token = '" + TKN + "' WHERE env = 'Staging_P2'");
                    _update.executeUpdate(); 
                } catch (SQLException ex) {
                    _f++;
                    Log += "  > " + ex.getMessage();
                }                    
            }
            JOB_Api_Call("https://api.compassdigital.org/v1/user/auth?realm=6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5", AUTH);     //  PR       
            if(!TKN.isEmpty()) {
                try {  
                    PreparedStatement _update = conn.prepareStatement("UPDATE env SET ap_token = '" + TKN + "' WHERE env = 'Production_P2'");
                    _update.executeUpdate();
                } catch (SQLException ex) {
                    _f++;
                    Log += "  > " + ex.getMessage();
                } 
            }

        } catch (SQLException ex) {
            _f++;
            Log += "  > " + ex.getMessage();
        } 
        DD = Duration.between(run_start, Instant.now());
        Summary = "Steps: 3, Failed: " + _f + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")";
        try {
            LOG_UPDATE(Log);
            conn.close();                    
        } catch (SQLException ex) {}
    }
    protected void JOB_Api_Call(String EndPoint, String AUTH) {
        RequestSpecification request;
        request = RestAssured.given();
        request.header("Authorization", AUTH);
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        try {
            TKN = "";
            Response response = request.get(EndPoint);
            if (response.asString().startsWith("{") && response.asString().endsWith("}")) {
                JSONObject json = new JSONObject(response.asString());
                if (json.has("error")) {
                    _f++;
                    Log += "\r\n" + "=== API Endpoint: " + EndPoint + " Error: " + json.getString("error") + ". ";
                }else{
                    TKN = json.getString("token");
                    Log += "\r\n" + "=== API Endpoint: " + EndPoint + " > TKN: " + TKN;
                }
            }else{
                _f++;
                Log += "\r\n" + "=== API Endpoint: " + EndPoint + " Error: Responce is Not JSON";
            }
        } catch (Exception ex) {
            _f++;
            Log += "\r\n" + "API Call Error: " + ex.getMessage().trim();
        }
    }

    private void LOG_START() {
        try {
            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[aw_result] ("
                    + "[Date]"
                    + // 1
                    ", [Time]"
                    + // 2
                    ", [app]"
                    + // 3
                    ", [url]"
                    + // 4
                    ", [summary]"
                    + // 5
                    ", [t_calls]"
                    + // 6
                    ", [t_min]"
                    + // 7
                    ", [t_avg]"
                    + // 8
                    ", [t_max]"
                    + // 9
                    ", [p_50]"
                    + // 10
                    ", [p_90]"
                    + // 11
                    ", [test_type]"
                    + // 12
                    ", [user_id]"
                    + // 13
                    ", [user_ws]"
                    + // 14
                    ", [env]"
                    + // 15
                    ", [Result]"
                    + // 16
                    ", [Status]"
                    + // 17
                    ", [Excel]"
                    + // 18
                    ") VALUES ("
                    + "?"
                    + // 1
                    ",?"
                    + // 2
                    ",?"
                    + // 3
                    ",?"
                    + // 4
                    ",?"
                    + // 5
                    ",?"
                    + // 6
                    ",?"
                    + // 7
                    ",?"
                    + // 8
                    ",?"
                    + // 9
                    ",?"
                    + // 10
                    ",?"
                    + // 11
                    ",?"
                    + // 12
                    ",?"
                    + // 13
                    ",?"
                    + // 14
                    ",?"
                    + // 15
                    ",?"
                    + // 16
                    ",?"
                    + // 17
                    ",?"
                    + // 18
                    ")");
            _insert.setString(1, LocalDateTime.now().format(Date_formatter));
            _insert.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _insert.setString(3, "AP3_Tokens");
            _insert.setString(4, ".../user/auth?realm=");
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
            _insert.setString(15, "DE, ST, PR");
            _insert.setString(16, "=== Job is running... ===\r\n" + "");
            _insert.setString(17, "Running");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
        } catch (SQLException ex) {
            Summary += "  > " + ex.getMessage();
        }
    }    
    private void LOG_UPDATE(String LOG) {
        try {
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
                    " WHERE [app] = 'AP3_Tokens"+ "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "AP3_Tokens");
            _update.setString(4, ".../user/auth?realm=");
            _update.setString(5, Summary); 
            _update.setInt(6, 3);
            _update.setDouble(7, 0);
            _update.setDouble(8, 0);
            _update.setDouble(9, 0);
            _update.setDouble(10, 0);
            _update.setDouble(11, 0);
            _update.setString(12, r_type);
            _update.setString(13, A.A.UserID);
            _update.setString(14, A.A.WsID);
            _update.setString(15, "DE, ST, PR");
            _update.setString(16, LOG);
            _update.setString(17, "Scope: " + "N/A");
            _update.setString(18, "None");
            int row = _update.executeUpdate();
        } catch (SQLException ex) {
            Summary += "  > " + ex.getMessage();
        }
    }
}
