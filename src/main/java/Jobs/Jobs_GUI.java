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

public class Jobs_GUI extends javax.swing.JInternalFrame {
    // <editor-fold defaultstate="collapsed" desc="Cron Patterns">    
    String C_HELP = "Cron for Java - Pattern Samples" + " >> https://www.sauronsoftware.it/projects/cron4j/manual.php" +
    "	\n\n" +
    "    5 * * * *\n" +
    "    This pattern causes a task to be launched once every hour, at the begin of the fifth minute (00:05, 01:05, 02:05 etc.).\n" +
    "    \n" +
    "    * * * * *\n" +
    "    This pattern causes a task to be launched every minute.\n" +
    "    \n" +
    "    * 12 * * Mon\n" +
    "    This pattern causes a task to be launched every minute during the 12th hour of Monday.\n" +
    "    \n" +
    "    * 12 16 * Mon\n" +
    "    This pattern causes a task to be launched every minute during the 12th hour of Monday, 16th, but only if the day is the 16th of the month.\n" +
    "    \n" +
    "    Every sub-pattern can contain two or more comma separated values.\n" +
    "    59 11 * * 1,2,3,4,5\n" +
    "    This pattern causes a task to be launched at 11:59AM on Monday, Tuesday, Wednesday, Thursday and Friday.\n" +
    "    \n" +
    "    Values intervals are admitted and defined using the minus character.\n" +
    "    59 11 * * 1-5\n" +
    "    This pattern is equivalent to the previous one.\n" +
    "    \n" +
    "    The slash character can be used to identify step values within a range. It can be used both in the form */c and a-b/c. The subpattern is matched every c values of the range 0,maxvalue or a-b.         \n" +
    "    */5 * * * *\n" +
    "    This pattern causes a task to be launched every 5 minutes (0:00, 0:05, 0:10, 0:15 and so on).\n" +
    "            \n" +
    "    3-18/5 * * * *\n" +
    "    This pattern causes a task to be launched every 5 minutes starting from the third minute of the hour, up to the 18th (0:03, 0:08, 0:13, 0:18, 1:03, 1:08 and so on).\n" +
    "\n" +
    "    */15 9-17 * * *\n" +
    "    This pattern causes a task to be launched every 15 minutes between the 9th and 17th hour of the day (9:00, 9:15, 9:30, 9:45 and so on... note that the last execution will be at 17:45).\n" +
    "\n" +
    "    All the fresh described syntax rules can be used together.\n" +
    "\n" +
    "    * 12 10-16/2 * *\n" +
    "    This pattern causes a task to be launched every minute during the 12th hour of the day, but only if the day is the 10th, the 12th, the 14th or the 16th of the month.\n" +
    "\n" +
    "    * 12 1-15,17,20-25 * *\n" +
    "    This pattern causes a task to be launched every minute during the 12th hour of the day, but the day of the month must be between the 1st and the 15th, the 20th and the 25, or at least it must be the 17th.\n" +
    "\n" +
    "    Finally cron4j lets you combine more scheduling patterns into one, with the pipe character:\n" +
    "\n" +
    "    0 5 * * *|8 10 * * *|22 17 * * *\n" +
    "    This pattern causes a task to be launched every day at 05:00, 10:08 and 17:22."
            + "";
    // </editor-fold>
    
    public Jobs_GUI() {
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
        btnHelp = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Jobs");
        setMaximumSize(new java.awt.Dimension(858, 527));
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("Jobs"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 103, 0));
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
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
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
        DV1.setGridColor(java.awt.SystemColor.windowBorder);
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
        DV1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                DV1ComponentHidden(evt);
            }
        });
        jScrollPane3.setViewportView(DV1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 548, 435));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 443, 548, 68));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 479, 110, 24));

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
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 449, 110, 24));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRun.setText(" Run Selected Job (ad-hoc)");
        btnRun.setEnabled(false);
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 479, 186, 24));

        txtConfig.setColumns(20);
        txtConfig.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConfig.setRows(100);
        txtConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConfig.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtConfig.setMinimumSize(new java.awt.Dimension(854, 525));
        jScrollPane2.setViewportView(txtConfig);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 119, 296, 322));

        txtJob_Name.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtJob_Name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJob_Name.setEnabled(false);
        txtJob_Name.setSelectionColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtJob_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 4, 155, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setText("Job Configuration, Data Setup:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 104, 178, -1));
        getContentPane().add(txtCheckValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 49, 156, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Job Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 8, 60, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Trigger");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 31, 44, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Check ");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 56, 40, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Cron Frequency");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 65, 96, -1));

        cmbTrigger.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbTrigger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "websocket", "webhook", "new version", "new githash" }));
        getContentPane().add(cmbTrigger, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 29, 157, 20));

        txtCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        getContentPane().add(txtCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 79, 300, -1));

        btnStartCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnStartCron.setText("Start Cron");
        btnStartCron.setMargin(new java.awt.Insets(0, 1, 0, 1));
        btnStartCron.setName("btnStart"); // NOI18N
        btnStartCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartCronMouseClicked(evt);
            }
        });
        getContentPane().add(btnStartCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 449, 86, 24));

        btnStopCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnStopCron.setText("Stop Cron");
        btnStopCron.setEnabled(false);
        btnStopCron.setMargin(new java.awt.Insets(0, 1, 0, 1));
        btnStopCron.setName("btnStop"); // NOI18N
        btnStopCron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStopCronMouseClicked(evt);
            }
        });
        getContentPane().add(btnStopCron, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 449, 94, 24));

        btnHelp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnHelp.setText("Cron Help");
        btnHelp.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnHelp.setName("btnStart"); // NOI18N
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 33, 64, 20));

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
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
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
        
        // === to get HTML report saved locally and prevent Send to Slack if JOB Run ad-hoc ===
        if(config.contains("_slack: true")){
            config = config.replace("_slack: true", "_slack: false");
        }
        // ============================ ^^^^^^^^ ==============================================
        Run_Selected_Job(Job, config);  
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnStartCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartCronMouseClicked
        START_CRON();       
    }//GEN-LAST:event_btnStartCronMouseClicked
    private void btnStopCronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopCronMouseClicked
        STOP_CRON(); 
        LOAD_JOBS(); //  ==== Reload definitions to capture possible updates
    }//GEN-LAST:event_btnStopCronMouseClicked

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
         try {
            A.Func.SHOW_FILE(C_HELP, "txt");
        }
        catch (Exception ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHelpMouseClicked

    private void DV1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DV1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_DV1ComponentHidden
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

        int Job_Count = 0;
        SCH = new Scheduler();
        String SCH_PATTERN = ""; // "59 11 * * 1,2,3,4,5" 
        for(int i = 0; i < DV1.getRowCount(); i++){
            String Cron_Status = DV1.getValueAt(i, 2).toString();
            SCH_PATTERN = DV1.getValueAt(i, 3).toString();
            
            if(!SCH_PATTERN.toLowerCase().contains("no") && Cron_Status.equals("Idle")){
                String CronJobName = DV1.getValueAt(i, 0).toString();
                String CONFIG = DV1.getValueAt(i, 6).toString();
                try{
                    if(CronJobName.equals("Tokens_AP3")){              
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Tokens_AP3(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("AP3_API")){              
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_AP3_API(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("FW_API")){              
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_FW_API(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("AP3_PR_Smoke")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_AP3(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("AP3_FE")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_AP3(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("DL_FE")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_DL(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });                       
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                    } else if(CronJobName.startsWith("DL_API")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_DL_API(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });                       
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                        
                    } else if(CronJobName.startsWith("C360_FE")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_C360(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);   
                        
                    } else if(CronJobName.startsWith("C360_API")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_C360_API(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);   
                        
                    } else if(CronJobName.startsWith("FW_FE")){
                        //Job_FW(CronJobName,CONFIG);
                        
                    } else if(CronJobName.startsWith("WO_FE")){
                        //Job_WO(CronJobName,CONFIG);
  
                    } else if(CronJobName.startsWith("Android")){
                        SCH.schedule(SCH_PATTERN, () -> {
                            r_type = "cron";                            
                            Job_Android(CronJobName,CONFIG);
//                            txtLog.append("= Scheduled Job " + CronJobName + " started @"  + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
//                            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                        });
                        Job_Count++;
                        Set_Cron_Status_Running(CronJobName);
                         
                    } else if(CronJobName.startsWith("iOS")){
                        //Job_iOS(config);
                    }                    

                } catch(InvalidPatternException | IllegalStateException ex){
                    txtLog.append( "= Scheduler ERROR > " + ex.getMessage() + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());            
                }                
            }
        }
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
        if(SCH == null){
            return;
        }
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
        JobName = Job;
        r_type = "ad-hoc";
        txtLog.append( "= " + Job + ": (ad-hoc) Execution started. Check Reports..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        
        if(JobName.equals("Tokens_AP3")){
            Tokens_AP3(JobName, config);
        } else if(JobName.startsWith("AP3_API")){
            Job_AP3_API(JobName, config);
        } else if(JobName.startsWith("FW_API")){
            Job_FW_API(JobName, config);
        } else if(JobName.startsWith("AP3_FE") || JobName.equals("AP3_PR_Smoke")){
            Job_AP3(JobName, config);        
        } else if(JobName.startsWith("DL_FE")){
            Job_DL(JobName, config);
        } else if(JobName.startsWith("DL_API")){
            Job_DL_API(JobName, config);
        } else if(JobName.startsWith("C360_FE")){
            Job_C360(JobName, config);
        } else if(JobName.startsWith("C360_API")){
            Job_C360_API(JobName, config);
        } else if(JobName.startsWith("FW_FE")){
            //Job_FW(CronJobName,config);
        } else if(JobName.startsWith("WO")){
            //Job_WO(config);
        } else if(JobName.startsWith("Android")){
            Job_Android(JobName, config);
        } else if(JobName.startsWith("iOS")){
            //Job_iOS(config);
        }  
    }

    //<editor-fold defaultstate="collapsed" desc="Jobs_GUI > Job Name, Config">
    private void Tokens_AP3(String job, String config){
        AP3_Tokens _Job = new AP3_Tokens();
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        _Job.AP3_Tokens(job, r_type, config);
//        txtLog.append("= Please Check Report" + "\r\n");
    }    
    private void Job_AP3(String job, String config){
        AP3.AP3_GUI _Job = new AP3.AP3_GUI();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_AP3_API(String job, String config){
        AP3_API.AP3_API_GUI _Job = new AP3_API.AP3_API_GUI();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_FW_API(String job, String config){
        FW_API.FW_API_main _Job = new FW_API.FW_API_main();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }    
    private void Job_Android(String job, String config){
        Mob_Android.An_GUI _Job = new Mob_Android.An_GUI();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_C360(String job, String config){
        C360.C360_GUI _Job = new C360.C360_GUI();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_C360_API(String job, String config){
        C360_API.C360_API_main _Job = new C360_API.C360_API_main();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_DL(String job, String config){
        DL.DL_GUI _Job = new DL.DL_GUI();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    private void Job_DL_API(String job, String config){
        DL_API.DL_API_main _Job = new DL_API.DL_API_main();
        String RES = _Job.JOB_Run_Auto(job, r_type, config);
//        txtLog.append("= " + job + " > " + RES.trim() + "\r\n");
//        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(!RES.contains("OK")){
            LOG_FAILURE(RES);
        }
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnHelp;
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
