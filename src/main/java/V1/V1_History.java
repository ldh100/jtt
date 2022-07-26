package V1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Base64;
import javax.swing.table.DefaultTableModel;
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
        btnLog = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Environmet(s)");
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
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
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

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText("Refresh");
        btnLog.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAPI, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Env");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Private Variables">    
    private boolean ALLOW = true;
    private String env = "";
    private String _ENV = "";
    private String SQL = "";

    private String BaseAPI = "";
    private String AP3_TKN = "";
    private String AP3_User_ID = "";
    private String BKP_Json;
    private JSONObject json;
    private JSONObject GET_Json;
    // </editor-fold>   

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        if(A.A.UserID.equals("oleg.spozito") || A.A.UserID.equals("roya.jacob") || A.A.UserID.equals("alex.koss")){
            ALLOW = true;
        } else{
            ALLOW = false;
        }

        LoadDB();
    }//GEN-LAST:event_formAncestorAdded

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedRows().length > 0){
            env = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3)).substring(0, 3).trim();

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
        txtLog.setText("");
        txtLog.append("=== Restore PUT API - not ready yet");

        if(!ALLOW){
            txtLog.append("=== Sorry, you are not allowed to run this function");
            txtLog.setCaretPosition(0);
            return;
        }

        txtLog.setCaretPosition(0);
        if(btnAPI.isEnabled()){
            Get_AP3_TKN_and_UserID();
            GET_BKP_Json();
        }

    }//GEN-LAST:event_btnAPIMouseClicked

    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        LoadDB();
    }//GEN-LAST:event_btnLogMouseClicked
    
    private void Get_AP3_TKN_and_UserID(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        String Auth = "Basic " + Base64.getEncoder().encodeToString(("oleg.spozito@compassdigital.io" + ":" + "Password1").getBytes());
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
    private void LoadDB(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));

        SQL = "SELECT [qID], [Date], [Time], [summary], [user_id] FROM[dbo].[aw_result] " +
                    "WHERE [app] = 'V1 Menus - Mods update' ORDER BY [qID] DESC";         
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
            DV1.getColumnModel().getColumn(1).setPreferredWidth(100);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(60);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(800);

            txtLog.append("= " +  DV1.getRowCount() +  " records\r\n");
            txtLog.setCaretPosition(0); 
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== Load Data > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));        
    }  
    private void GET_BKP_Json(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));    
        String qID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0)).trim(); 
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [Excel] FROM [dbo].[aw_result] WHERE [qID] = '" + qID + "'");
            rs.next();
            BKP_Json = rs.getString(1);
            GET_Json = new JSONObject(BKP_Json);
            conn.close();
        } catch (Exception ex) {
            txtLog.append( "\r\n = GET_BKP_Json > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
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
    private javax.swing.JButton btnLog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
