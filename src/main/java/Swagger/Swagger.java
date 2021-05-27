package Swagger;

import A.Func;
import static A.A.*;
import java.awt.Cursor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
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

public class Swagger extends javax.swing.JInternalFrame {
    public Swagger() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnLog = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Tragets = new javax.swing.JList<>();
        lblOutput = new javax.swing.JLabel();
        lblTargets = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        lblEnv = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Swagger");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("Swagger"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setPreferredSize(new java.awt.Dimension(860, 532));
        setVisible(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 672, 484));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Open -> default text editor");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 168, 24));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(0, 0, 0));
        btnRun.setText("Reload Selected ^");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 432, 168, 20));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        jList_Tragets.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jList_Tragets.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "announcement", "config", "datalake", "file", "kds", "location", "logger", "loyalty", "mealplan", "menu", "message", "notification", "order", "partner", "payment", "promo", "report", "shoppingcart", "task", "user", "vote" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList_Tragets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Tragets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList_Tragets.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_TragetsValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jList_Tragets);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 172, 408));

        lblOutput.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblOutput.setText("Output");
        lblOutput.setAlignmentX(0.5F);
        getContentPane().add(lblOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 252, -1));

        lblTargets.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTargets.setText("Target");
        lblTargets.setName("lblTargets"); // NOI18N
        getContentPane().add(lblTargets, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 4, 160, -1));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Development", "Staging", "Production" }));
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 456, 116, 20));

        lblEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEnv.setText("Env:");
        lblEnv.setName("lblTargets"); // NOI18N
        getContentPane().add(lblEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 460, 32, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        RUN();    
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void jList_TragetsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_TragetsValueChanged
        if(!evt.getValueIsAdjusting()) {
            RUN();
        }
    }//GEN-LAST:event_jList_TragetsValueChanged

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        cmbEnv.setSelectedIndex(1);
        jList_Tragets.setSelectedValue("config", true);
    }//GEN-LAST:event_formAncestorAdded

    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadEnv();
            RUN();
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void Get_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [su_token] FROM env WHERE ENV LIKE '" + cmbEnv.getSelectedItem() + "%'"); 
            rs.next();
            TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LoadEnv(){
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
        Get_TKN();
    }
    private void RUN(){
        txtLog.setText("");
        txtLog.setVisible(false);
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));        
        try {
            txtLog.append(GUI_API_Get(BaseAPI + "/" + jList_Tragets.getSelectedValue() + "/swagger.json", "Bearer " + TKN));             
        } catch (IOException | JSONException ex) {
            txtLog.append(BaseAPI + "/" + jList_Tragets.getSelectedValue() + " > " + ex.getMessage());  
        }  
        txtLog.setCaretPosition(0);
        txtLog.setVisible(true);
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private String GUI_API_Get(String EndPoint, String AUTH) throws IOException{
        String AJ = "";
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpget = new HttpGet(EndPoint);
            if(!AUTH.isEmpty()){
                httpget.setHeader("Authorization",  AUTH);
            }
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;      
                } else {
                    throw new ClientProtocolException("\r\n" + "== ERROR > " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            AJ += EndPoint + "\r\n" + json.toString(4);
        }
        return AJ;
    }

    private String BaseAPI;
    private String TKN;
    private String env;
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JList<String> jList_Tragets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblEnv;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblTargets;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
