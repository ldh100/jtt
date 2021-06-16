package Jobs;

import it.sauronsoftware.cron4j.InvalidPatternException;
import it.sauronsoftware.cron4j.Scheduler;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Oleg.Spozito
 */

public class Jobs extends javax.swing.JInternalFrame {

//<editor-fold defaultstate="collapsed" desc="Cron PAttern Samples">
//    5 * * * *
//    This pattern causes a task to be launched once every hour, at the begin of the fifth minute (00:05, 01:05, 02:05 etc.).
//    
//    * * * * *
//    This pattern causes a task to be launched every minute.
//    
//    * 12 * * Mon
//    This pattern causes a task to be launched every minute during the 12th hour of Monday.
//    
//    * 12 16 * Mon
//    This pattern causes a task to be launched every minute during the 12th hour of Monday, 16th, but only if the day is the 16th of the month.
//    
//    Every sub-pattern can contain two or more comma separated values.
//    59 11 * * 1,2,3,4,5
//    This pattern causes a task to be launched at 11:59AM on Monday, Tuesday, Wednesday, Thursday and Friday.
//    
//    Values intervals are admitted and defined using the minus character.
//    59 11 * * 1-5
//    This pattern is equivalent to the previous one.
//    
//    The slash character can be used to identify step values within a range. It can be used both in the form */c and a-b/c. The subpattern is matched every c values of the range 0,maxvalue or a-b.         
//    */5 * * * *
//    This pattern causes a task to be launched every 5 minutes (0:00, 0:05, 0:10, 0:15 and so on).
//            
//    3-18/5 * * * *
//    This pattern causes a task to be launched every 5 minutes starting from the third minute of the hour, up to the 18th (0:03, 0:08, 0:13, 0:18, 1:03, 1:08 and so on).
//
//    */15 9-17 * * *
//    This pattern causes a task to be launched every 15 minutes between the 9th and 17th hour of the day (9:00, 9:15, 9:30, 9:45 and so on... note that the last execution will be at 17:45).
//
//    All the fresh described syntax rules can be used together.
//
//    * 12 10-16/2 * *
//    This pattern causes a task to be launched every minute during the 12th hour of the day, but only if the day is the 10th, the 12th, the 14th or the 16th of the month.
//
//    * 12 1-15,17,20-25 * *
//    This pattern causes a task to be launched every minute during the 12th hour of the day, but the day of the month must be between the 1st and the 15th, the 20th and the 25, or at least it must be the 17th.
//
//    Finally cron4j lets you combine more scheduling patterns into one, with the pipe character:
//
//    0 5 * * *|8 10 * * *|22 17 * * *
//    This pattern causes a task to be launched every day at 05:00, 10:08 and 17:22.
//</editor-fold>
    
    public Jobs() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnLog = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConfig = new javax.swing.JTextArea();
        txtJob_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCheckValue = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbTrigger = new javax.swing.JComboBox<>();
        txtCron = new javax.swing.JFormattedTextField();
        btnStartCron = new javax.swing.JButton();
        btnStopCron = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Jobs");
        setMaximumSize(new java.awt.Dimension(858, 527));
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("Jobs"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 103, 0));
        setPreferredSize(new java.awt.Dimension(858, 527));
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

        DV1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        DV1.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV1.setName("DV1"); // NOI18N
        DV1.setRequestFocusEnabled(false);
        DV1.setRowHeight(18);
        DV1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV1.getTableHeader().setReorderingAllowed(false);
        DV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DV1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 552, 424));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 430, 548, 68));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 472, 104, 24));

        btnSave.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave.setText("Save Changes ^");
        btnSave.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave.setName("btnSAVE"); // NOI18N
        btnSave.setPreferredSize(new java.awt.Dimension(70, 20));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 436, 104, 24));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRun.setForeground(new java.awt.Color(0, 0, 0));
        btnRun.setText(" Run Selected Job (ad-hoc)");
        btnRun.setEnabled(false);
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 472, 176, 24));

        txtConfig.setColumns(20);
        txtConfig.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConfig.setRows(100);
        txtConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConfig.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtConfig.setMinimumSize(new java.awt.Dimension(854, 525));
        jScrollPane2.setViewportView(txtConfig);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 96, 296, 332));

        txtJob_Name.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtJob_Name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJob_Name.setEnabled(false);
        txtJob_Name.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtJob_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 4, 152, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setText("Config:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 80, 48, -1));
        getContentPane().add(txtCheckValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 48, 152, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Job Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 8, 79, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Trigger");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 28, 79, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Check Value");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 52, 80, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Cron Frequency");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 72, 96, -1));

        cmbTrigger.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbTrigger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "websocket", "webhook", "new version", "new githash" }));
        getContentPane().add(cmbTrigger, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 24, 152, 20));

        txtCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        getContentPane().add(txtCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 72, 152, -1));

        btnStartCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnStartCron.setForeground(new java.awt.Color(0, 0, 0));
        btnStartCron.setText("Start Cron");
        btnStartCron.setName("btnStart"); // NOI18N
        btnStartCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartCronMouseClicked(evt);
            }
        });
        getContentPane().add(btnStartCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 436, 84, 24));

        btnStopCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnStopCron.setForeground(new java.awt.Color(0, 0, 0));
        btnStopCron.setText("Stop Cron");
        btnStopCron.setEnabled(false);
        btnStopCron.setName("btnStop"); // NOI18N
        btnStopCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStopCronMouseClicked(evt);
            }
        });
        getContentPane().add(btnStopCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 436, 84, 24));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    private int dv1LastRow = -1; 
    private String Last_JOB = ""; 
    private String JobName = "";
    private Scheduler SCH;
    private String r_type;  
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">        
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (dv1LastRow == DV1.getSelectedRow()) {
            return;
        }
        dv1LastRow = DV1.getSelectedRow(); 
        GET_JOB_CONFIG();
    }//GEN-LAST:event_DV1MouseClicked
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        STOP_CRON();
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        LOAD_JOBS();
    }//GEN-LAST:event_formAncestorAdded
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        SAVE_CHANGES();   
    }//GEN-LAST:event_btnSaveMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled() || DV1.getRowCount() == 0){
            return;
        }
        String Job = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        String config = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 6));
        Run_Selected_Job(Job, config);  
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnStartCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartCronMouseClicked
        START_CRON();       
    }//GEN-LAST:event_btnStartCronMouseClicked
    private void btnStopCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopCronMouseClicked
        STOP_CRON();  
    }//GEN-LAST:event_btnStopCronMouseClicked
    // </editor-fold>
    
    private void LOAD_JOBS() {
        dv1LastRow = -1; 
        ResultSet rs = null;
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            rs = conn.createStatement().executeQuery("SELECT * FROM [dbo].[jtt_jobs] ORDER BY [job_name]");
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel dm = new DefaultTableModel();
            int cols = rsmd.getColumnCount();
            String c[] = new String[cols];
            for(int i = 0; i < cols; i++){
                c[i] = rsmd.getColumnName(i+1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[cols];
            while(rs.next()){
                for(int i = 0; i < cols; i++){
                    row[i] = rs.getString(i+1);
                }
                dm.addRow(row);
            }
            DV1.setModel(dm);
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV1.getModel());
            DV1.setRowSorter(sorter);
            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);  
            sorter.setSortable(0, false); 
            
            for (int i = 0; i < DV1.getColumnCount(); i++) {
                DefaultTableColumnModel colModel = (DefaultTableColumnModel) DV1.getColumnModel();
                TableColumn col = colModel.getColumn(i);
            }
            DV1.setDefaultEditor(Object.class, null);
            DV1.getColumnModel().getColumn(0).setPreferredWidth(150);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(90);  
            DV1.getColumnModel().getColumn(2).setPreferredWidth(60);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(90);
            DV1.getColumnModel().getColumn(4).setPreferredWidth(100);        
            DV1.getColumnModel().getColumn(5).setPreferredWidth(110);  
            DV1.getColumnModel().getColumn(6).sizeWidthToFit();
          
            sorter.setSortable(0, true); 
            sorter.sort();
            
            conn.close();           
        } catch (SQLException ex) {
            txtLog.append( "= Load Jobs > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }    
        if (DV1.getRowCount() > 0) {
            DV1.changeSelection(0, 0, false, false);
            if (!"".equals(Last_JOB)) {
                for(int row = 0; row < DV1.getRowCount(); row++) {
                    if(DV1.getValueAt(row, 0).equals(Last_JOB)){
                        DV1.changeSelection(row, 0, false, false);
                        break;
                    }
                }
            }
            txtLog.append( "= Load / Refresh Jobs List > OK" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
            GET_JOB_CONFIG();
            btnRun.setEnabled(true);
        } else{
            btnRun.setEnabled(false);
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void SAVE_CHANGES() { 
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            Last_JOB = txtJob_Name.getText();
            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[jtt_jobs] SET " +
                        " [_cron] = ?" +           // 1
                        ", [_trigger] = ?" +       // 2
                        ", [_check_val] = ?" +     // 4                               
                        ", [_conf] = ?" +          // 3 
                    " WHERE [job_name] = '" + Last_JOB + "'");
                _update.setString(1, txtCron.getText());
                _update.setString(2, cmbTrigger.getSelectedItem().toString());
                _update.setString(3, txtCheckValue.getText());
                _update.setString(4, txtConfig.getText());

            int row = _update.executeUpdate();
            if(row == 0){
                txtLog.append( "= Save " + Last_JOB + " configuration changes - ERROR: no row updated " + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());                   
            }else{
                txtLog.append( "= Save " + Last_JOB + " configuration changes - OK" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());             
            }
        } catch (SQLException ex) {
            txtLog.append( "= Save " + Last_JOB + " configuration changes > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }    
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        LOAD_JOBS();
    }
    private void GET_JOB_CONFIG() {
        try{
            txtJob_Name.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0))); 
            txtCron.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3))); 
            cmbTrigger.setSelectedItem(DV1.getValueAt(DV1.getSelectedRow(), 4));
            txtCheckValue.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 5)));          
            txtConfig.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 6))); 
            txtConfig.setCaretPosition(0);              
        }catch (Exception ex) {
            txtLog.append( "= GetConfig > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
    }
    private void LOG_FAILURE(String MSG){
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
            _insert.setString(3, JobName);
            _insert.setString(4, "N/A");
            _insert.setString(5, MSG.replace("===", "Failed:"));
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, "auto");
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
            _insert.setString(15, "N/A");
            _insert.setString(16, "Failed");
            _insert.setString(17, "Failed");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();   
            txtLog.append("Failure logged in Reports: " + MSG + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (SQLException ex) {
            txtLog.append("Log Failure ERROR : " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }      

    private void START_CRON(){
        btnStartCron.setEnabled(false);
        txtLog.append( "= START_CRON @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        r_type = "cron";
        int Job_Count = 0;
        SCH = new Scheduler();
        String SCH_PATTERN = ""; // "59 11 * * 1,2,3,4,5" 
        for(int i = 0; i < DV1.getRowCount(); i++){
            String Cron_Status = DV1.getValueAt(i, 2).toString();
            SCH_PATTERN = DV1.getValueAt(i, 3).toString();
            
            if(!SCH_PATTERN.toLowerCase().contains("no") && Cron_Status.equals("Idle")){
                JobName = DV1.getValueAt(i, 0).toString();
                String CONFIG = DV1.getValueAt(i, 6).toString();
                try{
                    if(JobName.startsWith("API")){              
                        SCH.schedule(SCH_PATTERN, () -> {
                            Job_API(JobName,CONFIG);
                            txtLog.append("= Scheduled Job " + JobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(JobName);
                        
                    } else if(JobName.startsWith("AP3")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            Job_AP3(JobName,CONFIG);
                            txtLog.append("= Scheduled Job " + JobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(JobName);
                        
                    } else if(JobName.startsWith("DL")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            Job_DL(JobName,CONFIG);
                            txtLog.append("= Scheduled Job " + JobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });                       
                        Job_Count++;
                        Set_Cron_Status_Running(JobName);

                    } else if(JobName.startsWith("C360")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            Job_C360(JobName,CONFIG);
                            txtLog.append("= Scheduled Job " + JobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(JobName);
                        
                    } else if(JobName.startsWith("Android")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            Job_Android(JobName,CONFIG);
                            txtLog.append("= Scheduled Job " + JobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(JobName);
                    
                    } else if(JobName.startsWith("FW")){
                        //Job_FW(JobName,CONFIG);
                        
                    } else if(JobName.startsWith("WO")){
                        //Job_WO(JobName,CONFIG);
                        
     
                    } else if(JobName.startsWith("iOS")){
                        //Job_iOS(config);
                    }                    

                } catch(InvalidPatternException | IllegalStateException ex){
                    txtLog.append( "= Scheduler ERROR > " + ex.getMessage() + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());            
                }                
            }
        }

//        try{        
//            Scheduler SCH = new Scheduler();
//            SCH_PATTERN = "*/5 * * * *";
//            ProcessTask TASK = new ProcessTask("A_TASK");
//            String Sch_Task_ID = SCH.schedule(SCH_PATTERN, () -> {
//                txtLog.append( "= SCH_2 Another 5 minutes ticked away..." + "\r\n");
//                txtLog.setCaretPosition(txtLog.getDocument().getLength());  
//            });
//            SCH.start();
//            txtLog.append( "= Scheduler SCH_2 started started @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");
//            txtLog.setCaretPosition(txtLog.getDocument().getLength());
//        } catch(InvalidPatternException | IllegalStateException ex){
//            txtLog.append( "= SCH ERROR > " + ex.getMessage() + "\r\n");
//            txtLog.setCaretPosition(txtLog.getDocument().getLength());            
//        }
        if(Job_Count > 0){
            SCH.start();
            btnStopCron.setEnabled(true);
            LOAD_JOBS();    
            txtLog.append( "= Cron Started - " + Job_Count + " Job(s) scheduled" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } else{
            btnStartCron.setEnabled(true);
            btnStopCron.setEnabled(false);
            txtLog.append( "= Cron NOT Started - " + Job_Count + " Job(s) to schedule" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }    
    private void STOP_CRON(){
        btnStopCron.setEnabled(false);
        if(SCH.isStarted()){
            SCH.stop();
            SCH = null;
        }

        txtLog.append( "= STOP_CRON @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        for(int i = 0; i < DV1.getRowCount(); i++){
            if(String.valueOf(DV1.getValueAt(i, 1)).equals(A.A.WsID)){
                DV1.setValueAt("N/A" , i, 2); 
                DV1.setValueAt("Idle", i, 3);
            }
        }
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[jtt_jobs] SET " +
                    " [Host] = '" + "N/A" + "'" +  
                    ", [Cron] = 'Idle'" +  
                    ", [UserID] = '" + "N/A" + "'" +  
                    " WHERE [Host] = '" + A.A.WsID + "'");
            int row = _update.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            txtLog.append( "= Set_Cron_Status_Idle > SQL ERROR: " + ex.getMessage());
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }

        btnStartCron.setEnabled(true);
        LOAD_JOBS();
    }
    private void Set_Cron_Status_Running(String job){
            try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
                PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[jtt_jobs] SET " +
                        " [Host] = '" + A.A.WsID + "'" + 
                        ", [Cron] = 'Running'" +
                        ", [UserID] = '" + A.A.UserID + "'" +

                    " WHERE [Job_Name] = '" + job + "'");
                int row = _update.executeUpdate();
                conn.close();
            } catch (SQLException ex) {
                txtLog.append( "= Set_Cron_Status_Running > SQL ERROR: " + ex.getMessage());
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
            for(int i = 0; i < DV1.getRowCount(); i++){
                if(String.valueOf(DV1.getValueAt(i, 0)).equals(job)){
                    DV1.setValueAt(A.A.WsID , i, 1);
                    DV1.setValueAt("Running", i, 2);
                }
            }
    }
    private void Run_Selected_Job(String Job, String config){
        JobName = txtJob_Name.getText();
        r_type = "ad-hoc";
        if(JobName.startsWith("API")){
            Job_API(JobName, config);
        } else if(JobName.startsWith("AP3")){
            Job_AP3(JobName, config);        
        } else if(JobName.startsWith("DL")){
            Job_DL(JobName, config);
        } else if(JobName.startsWith("C360")){
            Job_C360(JobName, config);
        } else if(JobName.startsWith("FW")){
            //Job_FW(JobName,config);
        } else if(JobName.startsWith("WO")){
            //Job_WO(config);
        } else if(JobName.startsWith("Android")){
            Job_Android(JobName, config);
        } else if(JobName.startsWith("iOS")){
            //Job_iOS(config);
        }  
        txtLog.append( "= " + Job + ": (ad-hoc) Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
    }

    //<editor-fold defaultstate="collapsed" desc="Jobs > Job Name, Config">
    private void Job_AP3(String job, String config){
        AP3_New.AP3_GUI _Job = new AP3_New.AP3_GUI();
        String RES = _Job.JOB_Run_Auto(r_type, config);
        txtLog.append("= Job " + job + " > Result @" + LocalDateTime.now().format(A.A.Time_12_formatter) +  "\r\n" + RES.trim() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_API(String job, String config){
        API.API_GUI _Job = new API.API_GUI();
        String RES = _Job.JOB_Run_Auto(r_type, config);
        txtLog.append("= Job " + job + " > Result @" + LocalDateTime.now().format(A.A.Time_12_formatter) +  "\r\n" + RES.trim() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_Android(String job, String config){
        Mob_Android.An_GUI _Job = new Mob_Android.An_GUI();
        String RES = _Job.JOB_Run_Auto(r_type, config);
        txtLog.append("= Job " + job + " > Result @" + LocalDateTime.now().format(A.A.Time_12_formatter) +  "\r\n" + RES.trim() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_C360(String job, String config){
        C360.C360_GUI _Job = new C360.C360_GUI();
        String RES = _Job.JOB_Run_Auto(r_type, config);
        txtLog.append("= Job " + job + " > Result @" + LocalDateTime.now().format(A.A.Time_12_formatter) +  "\r\n" + RES.trim() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_DL(String job, String config){
        DL.DL_GUI _Job = new DL.DL_GUI();
        String RES = _Job.JOB_Run_Auto(r_type, config);
        txtLog.append("= Job " + job + " > Result @" + LocalDateTime.now().format(A.A.Time_12_formatter) +  "\r\n" + RES.trim() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStartCron;
    private javax.swing.JButton btnStopCron;
    private javax.swing.JComboBox<String> cmbTrigger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCheckValue;
    private javax.swing.JTextArea txtConfig;
    private javax.swing.JFormattedTextField txtCron;
    private javax.swing.JTextField txtJob_Name;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
