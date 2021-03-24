/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobs;

import A.Func;
import static A.A.*;
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
    /**
     * Creates new form Jobs
     */
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbTrigger = new javax.swing.JComboBox<>();
        txtCron = new javax.swing.JFormattedTextField();
        txtFrom = new javax.swing.JFormattedTextField();
        txtTo = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Jobs");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("Jobs"); // NOI18N
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

        DV1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
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

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

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

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(0, 0, 0));
        btnRun.setText(" Run Selected Job");
        btnRun.setEnabled(false);
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        txtConfig.setColumns(20);
        txtConfig.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtConfig.setRows(5);
        txtConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtConfig.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtConfig.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane2.setViewportView(txtConfig);

        txtJob_Name.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtJob_Name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtJob_Name.setEnabled(false);
        txtJob_Name.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setText("Config");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Job Name");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Trigger");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Check Value");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Run From");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Run To");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Frequency (min)");

        cmbTrigger.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbTrigger.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cron", "new version", "new githash", "webhook" }));

        txtCron.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCron.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        try {
            txtFrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFrom.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        try {
            txtTo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJob_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTrigger, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckValue, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCron, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(btnRun))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(576, 576, 576)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJob_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTrigger, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCheckValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (dv1LastRow == DV1.getSelectedRow()) {
            return;
        }
        dv1LastRow = DV1.getSelectedRow(); 
        GetConfig();
    }//GEN-LAST:event_DV1MouseClicked
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        LoadJobs();
    }//GEN-LAST:event_formAncestorAdded
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        SAVE_CHANGES();
        LoadJobs();
    }//GEN-LAST:event_btnSaveMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
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
        String config = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 4));
        Run_Job(Job, "ad-hoc", config);  
    }//GEN-LAST:event_btnRunMouseClicked

    private void LoadJobs() {
        dv1LastRow = -1; 
        SQL = "SELECT * FROM [dbo].[jtt_jobs] ORDER BY[job_name]";          
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
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
            conn.close();
            
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
            DV1.getColumnModel().getColumn(0).setPreferredWidth(120);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(60);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(75);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(120);        
            DV1.getColumnModel().getColumn(4).setPreferredWidth(50);
            DV1.getColumnModel().getColumn(5).setPreferredWidth(50);            
            DV1.getColumnModel().getColumn(6).setPreferredWidth(50);
            DV1.getColumnModel().getColumn(7).setPreferredWidth(40); 
            DV1.getColumnModel().getColumn(8).setPreferredWidth(10); 
            
            sorter.setSortable(0, true); 
            sorter.sort();
            
        } catch (SQLException ex) {
            txtLog.append("=== Load Jobs > ERROR: " + ex.getMessage() + "\r\n");
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
            txtLog.append("=== Load (re-load) Jobs > OK" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
            GetConfig();
            btnRun.setEnabled(true);
        } else{
            btnRun.setEnabled(false);
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void SAVE_CHANGES() { 
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            Last_JOB = txtJob_Name.getText();
            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[jtt_jobs] SET " +
                "_trigger = '" + cmbTrigger.getSelectedItem().toString() + "', " +
                "_check_val = '" + txtCheckValue.getText() + "', " +
                "_conf = '" + txtConfig.getText() + "', " +
                "_from = '" + txtFrom.getText() + "', " +
                "_to = '" + txtTo.getText() + "', " +
                "_cron = '" + txtCron.getText() + "' " +                            
                "WHERE [job_name] = '" + Last_JOB + "'");
            int row = _update.executeUpdate();
            if(row == 0){
                txtLog.append("=== Save " + Last_JOB + " configuration changes - ERROR: no row updated " + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());                   
            }else{
                txtLog.append("=== Save " + Last_JOB + " configuration changes - OK" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());             
            }
        } catch (SQLException ex) {
            txtLog.append("=== Save " + Last_JOB + " configuration changes > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }    

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetConfig() {
        try{
            txtJob_Name.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0))); 
            cmbTrigger.setSelectedItem(DV1.getValueAt(DV1.getSelectedRow(), 1));
            txtCheckValue.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 2))); 
            txtFrom.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 5))); 
            txtTo.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 6))); 
            txtCron.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 7)));
            
            txtConfig.setText(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 4))); 
            txtConfig.setCaretPosition(0);              
        }catch (Exception ex) {
            txtLog.append("=== GetConfig > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
    }

    private void Run_Job(String Job, String r_type, String config){
        txtLog.append("=== Execution (" + r_type + ") started @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
//        if(Job name == "??"){
            Android.An_GUI An_Job = new Android.An_GUI();
            String RES = An_Job.JOB_Run_Auto("ad-hoc", config);
            txtLog.append("Run_Job: " + "\r\n" + RES.trim() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());        
//        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration - do not modify">
    private int dv1LastRow = -1; 
    private String Last_JOB = ""; 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbTrigger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtCheckValue;
    private javax.swing.JTextArea txtConfig;
    private javax.swing.JFormattedTextField txtCron;
    private javax.swing.JFormattedTextField txtFrom;
    private javax.swing.JTextField txtJob_Name;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JFormattedTextField txtTo;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
