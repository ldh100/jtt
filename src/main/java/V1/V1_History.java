package V1;

import A.Func;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.zip.GZIPOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;


/**
 *
 * @author Oleg.Spozito
 */

public class V1_History extends javax.swing.JInternalFrame {
    public V1_History() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnAPI = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        btnExcel = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Global Menus = Items > Modifiers up date: History / Restore from Backup");
        setDoubleBuffered(true);
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("Env"); // NOI18N
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        DV1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        DV1.setGridColor(java.awt.SystemColor.windowBorder);
        DV1.setName("DV1"); // NOI18N
        DV1.setRowHeight(18);
        DV1.getTableHeader().setReorderingAllowed(false);
        DV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV1);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(2, 2, 1, 1));
        jScrollPane1.setViewportView(txtLog);

        btnAPI.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnAPI.setText("Restore Selected");
        btnAPI.setEnabled(false);
        btnAPI.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnAPI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAPIMouseClicked(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Environment:");

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        btnExcel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExcel.setText("^ Excel");
        btnExcel.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnExcel.setMaximumSize(new java.awt.Dimension(140, 29));
        btnExcel.setMinimumSize(new java.awt.Dimension(140, 29));
        btnExcel.setPreferredSize(new java.awt.Dimension(140, 29));
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(cmbEnv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );

        getAccessibleContext().setAccessibleName("Env");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Private Variables">    
    private boolean ALLOW = true;
    private boolean LOAD = true;
    private String env = "";
    private String _ENV = "";
    private String SQL = "";

    private String BaseAPI = "";
    private String AP3_USER = "";
    private String AP3_PW = "";
    private String AP3_TKN = "";
    private String AP3_User_ID = "";
    private String BKP_Json;
    private JSONObject json;
    private JSONObject GET_Json;
    private DecimalFormat DEC_FORMAT = new DecimalFormat("#.##");
    // </editor-fold>   

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        if(A.A.UserID.equals("oleg.spozito") || A.A.UserID.equals("roya.jacob") || A.A.UserID.equals("alex.koss")){
            ALLOW = true;
        } else{
            ALLOW = false;
        }
        cmbEnv.addItem("Development"); 
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");

        Load_CONFIG();
        LOAD = false;

        cmbEnv.setSelectedIndex(2); // Production > //LoadDB();
    }//GEN-LAST:event_formAncestorAdded

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedRows().length > 0){
            env = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 4)).trim();
            if(env.equals("ST")){
                BaseAPI = "https://api.compassdigital.org/staging";
                _ENV = "Staging";
            } else if (env.equals("DE")){
                BaseAPI = "https://api.compassdigital.org/dev";
                _ENV = "Development";
            } else{
                BaseAPI = "https://api.compassdigital.org/v1";
                _ENV = "Production";
            }
            btnAPI.setEnabled(true);
        } else{
            btnAPI.setEnabled(false);
        }
    }//GEN-LAST:event_DV1MouseClicked

    private void btnAPIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAPIMouseClicked

        if(!ALLOW){
            txtLog.append("\r\n====== Sorry, you are not allowed to run this function ======\r\n");
            txtLog.setCaretPosition(0);
            return;
        }
        txtLog.setCaretPosition(0);
        if(btnAPI.isEnabled()){
            if(GET_BKP_Json()){
                double GetMenu_Size = GET_Json.toString().getBytes().length; 
                // <editor-fold defaultstate="collapsed" desc="=== Warning / Confirmation ">
                Object[] options = {"Yes", "No"};
                int reply = JOptionPane.showOptionDialog(this,
                    "Are you sure to RESTORE Menu > \r\n\r\n" + 
                        String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3)).trim() + "\r\n\r\n" +
                        "Environment: " + cmbEnv.getSelectedItem().toString() + "\r\n\r\n"
                    + "   === Backup Menu (GET) size: " 
                    + DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB",

                    "Menu - update Modifiers",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    options,
                    "No"); 
                if (reply == 1){
                    txtLog.append("== Backup GET Json >> \r\n" + GET_Json.toString(4) + "\r\n");
                    txtLog.setCaretPosition(0);
                    
                    return;
                }
                // </editor-fold> 
                this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));                
                Get_AP3_TKN_and_UserID();
                Restore();
                DB_LOG();

                txtLog.append("\r\n====== Restore task completed. Please check Reports ======\r\n");
                txtLog.setCaretPosition(0); 
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
           }
        }
    }//GEN-LAST:event_btnAPIMouseClicked

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        LoadDB();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if (evt.getStateChange() == 1) {
            if(cmbEnv.getSelectedItem().toString().contains("Staging")){
                BaseAPI = "https://api.compassdigital.org/staging";
                env = "ST";
            } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
                BaseAPI = "https://api.compassdigital.org/dev";
                env = "DE";
            } else{
                BaseAPI = "https://api.compassdigital.org/v1";
                env = "PR";
            }
            LoadDB();
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void btnExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseClicked
        btnExcel.setEnabled(false);
        Excel();
        btnExcel.setEnabled(true);
    }//GEN-LAST:event_btnExcelMouseClicked
    private void Excel(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        int cols = DV1.getColumnCount(); 
        int rows = DV1.getRowCount(); 
        String[][] Values = new String[rows + 1][cols]; // +1 for summary row
        try {
            for (int i = 0; i < cols; i++) {
                Values[0][i] = DV1.getColumnModel().getColumn(i).getHeaderValue().toString();
            }
            for (int j = 0; j < rows; j++) {// after added summary row
                for (int i = 0; i < cols; i++) { 
                    Values[j + 1][i] = DV1.getModel().getValueAt(j, i).toString();
                }
            }
            String Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMM_HH-mm"));
            String SheetName = " == " + cmbEnv.getSelectedItem().toString() + " > " + 
                    "GL Menus - Update Mods Jobs" + " > " + DV1.getRowCount();
            Func.fExcel(rows + 1, cols, Values, "ModsJobs_" + Report_Date, SheetName, 0, 0, null, " ", " ", true);
        } catch (Exception ex) {
            txtLog.append("= Excel > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void LoadDB(){
        if(LOAD) {
            return;
        }

        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        SQL = "SELECT [qID], [Date], [Time], [summary], [env], [user_id] FROM[dbo].[aw_result] " +
                    "WHERE [app] = 'V1 Menus - Mods update' AND [env] = '" + env + "' ORDER BY [qID] DESC";         
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel dm = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            int cols = rsmd.getColumnCount();
            String c[] = new String[cols];
            for(int i = 0; i < cols; i++){
                c[i] = rsmd.getColumnName(i + 1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[cols];
            while(rs.next()){
                for(int i = 0; i < cols; i++){
                    row[i] = rs.getString(i + 1);
                }
                dm.addRow(row);
            }
            DV1.setModel(dm);
             
            DV1.getColumnModel().getColumn(0).setPreferredWidth(60);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(80);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(60);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(600);
            DV1.getColumnModel().getColumn(4).setPreferredWidth(35);

            txtLog.append("= " +  DV1.getRowCount() +  " records\r\n");
            txtLog.setCaretPosition(0); 
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== Load Data > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        if(DV1.getSelectedRowCount() < 1){
            btnAPI.setEnabled(false);
        }else{
            btnAPI.setEnabled(true);
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));        
    }  

    private void Load_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        LOAD = true;
        String C = "";
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            String SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'V1'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            return;
        }
        //String[] lines = C.split(System.getProperty("line.separator"));  
        String[] lines = C.split("\n");  
        String value;
        try {
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if (l.contains("env: ")) env = value;
                if (l.contains("ADMIN_ID: ")) AP3_USER = value;           
                if (l.contains("ADMIN_PW: ")) AP3_PW = value;
            }

            txtLog.append("==== LOAD_CONFIG > OK" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    
    private void Get_AP3_TKN_and_UserID(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        String Auth = "Basic " + Base64.getEncoder().encodeToString((AP3_USER + ":" + AP3_PW).getBytes());
        Api_Call("GET", BaseAPI + "/user/auth" + "?realm=" + "6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5", Auth, "");
        if(json != null){ 
            try {
                if(json.has("user")) {
                    AP3_User_ID = json.getString("user");
                } 
                if(json.has("token")) {
                    AP3_TKN = json.getString("token");
                } 
            } catch (Exception ex){
                txtLog.setText("");
                txtLog.append(json.toString(4) + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            }
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private boolean GET_BKP_Json(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));    
        String qID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0)).trim(); 
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [Excel] FROM [dbo].[aw_result] WHERE [qID] = '" + qID + "'");
            rs.next();
            BKP_Json = rs.getString(1);
            conn.close();
            GET_Json = new JSONObject(BKP_Json);
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            return true;
        } catch (Exception ex) {
            txtLog.append( "\r\n = GET_BKP_Json > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            return false;
        }
    }
    
    private void DB_LOG(){
        String Scope = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3)).trim(); 
        String LOG = "RESTORE > " + Scope;

        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[aw_result] (" +
                    "[Date]" +   // 1
                    ", [Time]" +   // 2
                    ", [app]" +   // 3
                    ", [url]" +   // 4
                    ", [summary]" +   // 5
                    ", [t_calls]" +   // 6
                    ", [t_min]" +   // 7
                    ", [t_avg]" +   // 8
                    ", [t_max]" +   // 9
                    ", [p_50]" +   // 10
                    ", [p_90]" +   // 11
                    ", [test_type]" +   // 12
                    ", [user_id]" +   // 13
                    ", [user_ws]" +   // 14
                    ", [env]" +   // 15
                    ", [Result]" +   // 16
                    ", [Status]" +   // 17
                    ", [Excel]" +     // 18
                    ") VALUES (" +
                    "?" +     // 1
                    ",?" +    // 2
                    ",?" +    // 3
                    ",?" +    // 4
                    ",?" +    // 5
                    ",?" +    // 6
                    ",?" +    // 7
                    ",?" +    // 8
                    ",?" +    // 9
                    ",?" +    // 10
                    ",?" +    // 11
                    ",?" +    // 12
                    ",?" +    // 13
                    ",?" +    // 14
                    ",?" +    // 15
                    ",?" +    // 16
                    ",?" +    // 17
                    ",?" +    // 18
                    ")");
            _insert.setString(1, LocalDateTime.now().format(A.A.Date_formatter));
            _insert.setString(2, LocalDateTime.now().format(A.A.Time_24_formatter));
            _insert.setString(3, "V1 Menus - Mods update");
            _insert.setString(4, BaseAPI);
            _insert.setString(5, Scope);
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, "Manual");
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
            _insert.setString(15, env);
            _insert.setString(16, LOG); 
            _insert.setString(17, "Restored from Backup");
            _insert.setString(18, "None"); 
            int row = _insert.executeUpdate();
            conn.close();
        }  catch (SQLException ex) {
            txtLog.append( "= DB_LOG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }

    private void Restore(){
        double GetMenu_Size = GET_Json.toString().getBytes().length; 
        txtLog.append("\r\n== Select Menu GET Json size: >> " + DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB" + "\r\n");
        try {

            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutStream = new GZIPOutputStream(byteOutStream);
            gzipOutStream.write(GET_Json.toString().getBytes());
            IOUtils.closeQuietly(gzipOutStream);
            byte[] bytes = byteOutStream.toByteArray();
            String gzipped = Base64.getEncoder().encodeToString(bytes);

            // === Publish Menu
            String putMenuID = GET_Json.getString("id");
            txtLog.append( "\r\n== Target Menu ID: " + putMenuID + "\r\n");

            Api_Call("PUT", BaseAPI + "/menu/" + putMenuID, "Bearer " + AP3_TKN, gzipped);

        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
    }

    private void Api_Call(String Method, String EndPoint, String AUTH, String BODY) {
        String Result = "?";
        int status = 0;
        String ErrorMsg = "";
        json = null;
        RequestSpecification request;
        request = RestAssured.given();
        if (!AUTH.isEmpty()) {
            request.header("Authorization", AUTH);
        }
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        try {
            Response response = null;
            switch (Method) {
                case "GET":
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
            }else{
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            }       
        } catch (Exception ex) {
            txtLog.setText("");
            txtLog.append(json.toString(4) + "\r\n\r\n");
            txtLog.setCaretPosition(0);
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnAPI;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
