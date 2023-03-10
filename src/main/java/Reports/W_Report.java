/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.awt.Component;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class W_Report extends javax.swing.JInternalFrame {

    public W_Report() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        dtpDel = new com.toedter.calendar.JDateChooser();
        lblSITES = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        btnDelOld = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnRef = new javax.swing.JButton();
        cmbF_App = new javax.swing.JComboBox<>();
        lblUsers = new javax.swing.JLabel();
        cmbF_User = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reports");
        setDoubleBuffered(true);
        setMinimumSize(new java.awt.Dimension(847, 253));
        setName("Report"); // NOI18N
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(2, 2, 1, 1));
        jScrollPane1.setViewportView(txtLog);

        DV1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV1.setCellSelectionEnabled(true);
        DV1.setGridColor(java.awt.SystemColor.windowBorder);
        DV1.setName("DV1"); // NOI18N
        DV1.setRowHeight(18);
        DV1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV1.getTableHeader().setReorderingAllowed(false);
        DV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV1);
        DV1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        dtpDel.setDateFormatString("DD-MMM-yyyy");
        dtpDel.setFocusCycleRoot(true);
        dtpDel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        dtpDel.setName("dtpDel"); // NOI18N
        dtpDel.setPreferredSize(new java.awt.Dimension(103, 24));
        dtpDel.setRequestFocusEnabled(false);
        dtpDel.setVerifyInputWhenFocusTarget(false);

        lblSITES.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSITES.setText("Filter by App:");
        lblSITES.setAlignmentX(0.5F);

        btnDel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDel.setText("Delete Selected");
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
        });

        btnDelOld.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDelOld.setText("Delete Before:");
        btnDelOld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelOldMouseClicked(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnReport.setText("View Report");
        btnReport.setPreferredSize(new java.awt.Dimension(113, 25));
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText("Log");
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        btnRef.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRef.setText("Refresh");
        btnRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefMouseClicked(evt);
            }
        });

        cmbF_App.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbF_App.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbF_App.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbF_App.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbF_AppItemStateChanged(evt);
            }
        });

        lblUsers.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUsers.setText("Filter by User:");
        lblUsers.setAlignmentX(0.5F);

        cmbF_User.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbF_User.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbF_User.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbF_User.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbF_UserItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dtpDel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelOld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbF_User, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbF_App, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelOld, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtpDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblUsers)
                        .addGap(4, 4, 4)
                        .addComponent(cmbF_User, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSITES)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbF_App, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRef, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        LoadREP();
    }//GEN-LAST:event_formAncestorAdded
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedColumn() == 5){
            DV1.changeSelection(DV1.getSelectedRow(), 0, false, false);            
        }
        Summary();
    }//GEN-LAST:event_DV1MouseClicked
    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        String LAST_APP = cmbF_App.getSelectedItem().toString();
        Object[] options = {"Yes", "No"};
        int reply = JOptionPane.showOptionDialog(this,
            "Are you sure you want to delete selected report?",
            "Delete Automation Report",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            "No"); // options[1]
        if (reply == 1){
            return;
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            conn.createStatement().execute("DELETE FROM [dbo].[aw_result] WHERE qID = '" + DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== Delete report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));

        LoadFilters(); //=============
        try{
            cmbF_App.setSelectedItem(LAST_APP);
        } catch (Exception ex) {
            txtLog.append("=== Delete Old Reports > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        LoadDB(); //============
    }//GEN-LAST:event_btnDelMouseClicked
    private void btnDelOldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelOldMouseClicked
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd-MMM-yyyy");
        Object[] options = {"Yes", "No"};
        int reply = JOptionPane.showOptionDialog(this,
            "Are you sure you want to delete all recodrs logged before " + simpleDateFormat.format(dtpDel.getDate()) + "?",
            "Delete Old Automation Reports",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            "No"); // options[1]
        if (reply == 1){
            return;
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            Statement st = conn.createStatement();
            int d = st.executeUpdate("DELETE FROM [dbo].[aw_result] WHERE [Date] < '" + simpleDateFormat.format(dtpDel.getDate()) + "'");
            conn.close(); 
            txtLog.append("=== Old Reports > " + d + " record(s) deleted" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } catch (SQLException ex) {
            txtLog.append("=== Delete Old Reports > ERROR: " + ex.getMessage());
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        LoadFilters();
        LoadDB();
    }//GEN-LAST:event_btnDelOldMouseClicked
    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        btnReport.setEnabled(false);
        Report(true);
        btnReport.setEnabled(true);
    }//GEN-LAST:event_btnReportMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String EXX;
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [Result] FROM [dbo].[aw_result] WHERE [qID] = '" +
                    DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");
            rs.next();
            EXX = rs.getString(1);
            conn.close();

            String R = A.Func.SHOW_FILE(EXX, "txt");
            if(!R.equals("OK")){
                txtLog.append(R + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }                   
        }catch (SQLException ex){
            txtLog.append("=== " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnRefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefMouseClicked
        LoadFilters();
        LoadDB();
    }//GEN-LAST:event_btnRefMouseClicked
    private void cmbF_AppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbF_AppItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbF_AppItemStateChanged
    private void cmbF_UserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbF_UserItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbF_UserItemStateChanged

    private void LoadREP() {   
        dtpDel.setDateFormatString("dd-MMM-yyy");
        Date now = new Date();
        dtpDel.setMaxSelectableDate(now);
        dtpDel.setDate(new Date(now.getTime() - Duration.ofDays(7).toMillis())); // 1 week old
        LoadFilters();
        LOAD = false;
        LoadDB();
    } 

    private void Summary() {
        if (DV1.getRowCount() < 1) return;
        btnLog.setEnabled(true);
        btnDelOld.setEnabled(true); 
        if (A.A.UserID.toLowerCase().contains("oleg")){
            btnDelOld.setEnabled(true);
        }  else{
            btnDelOld.setEnabled(false);
        }   
        String AUTOR = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_id").getModelIndex()).toString();
        if (AUTOR.equals(A.A.UserID)|| A.A.UserID.toLowerCase().contains("oleg")){ 
            btnDel.setEnabled(true);
        }  else{
            btnDel.setEnabled(false);
        }          
        if (DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("AP3") || 
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("C360") || 
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("FW") || 
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("DL") || 
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("WO") ||
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("API") ||
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("Android") ||
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("V1 Menus") ||
            DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("iOS")) {
                btnReport.setEnabled(true);
        } else {
            btnReport.setEnabled(false);
        }        
        String utcTimeString = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("cDate").getModelIndex()).toString();
        DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date utcTime = null;
        try {
            utcTime = utcFormat.parse(utcTimeString);
        } catch (ParseException ex) {
            // Logger.getLogger(W_Report.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        DateFormat localFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        localFormat.setTimeZone(TimeZone.getDefault());
        String Status = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("Status").getModelIndex()).toString().trim();
        if(!Status.contains("Scope")){
            Status = "";
        }
        txtLog.setText("LogID: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("qID").getModelIndex())
            + " @" + localFormat.format(utcTime) 
            + " (" + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("test_type").getModelIndex()) + ") > "
            + "WS: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_ws").getModelIndex())+ ", " 
            + "User: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_id").getModelIndex()) + "\r\n" 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()) + " - " 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("url").getModelIndex()) + " - " 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("env").getModelIndex()) + "\r\n" 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("summary").getModelIndex()).toString().trim() + "\r\n" 
            + Status + "\r\n"               
        );
        txtLog.setCaretPosition(0);
    }
    private void Report(boolean Open_File){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String EXX = "";
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT TOP 1 [Excel] FROM [dbo].[aw_result] WHERE [qID] = '" +
                    DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");
            rs.next();
            EXX = rs.getString(1);
            conn.close();
        }catch (SQLException ex){
            txtLog.append("=== " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        if (!"".equals(EXX.trim()) && EXX.startsWith("{") && EXX.endsWith("}")){
            A.Func.SHOW_FILE(EXX, "json");
            setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        } 

        if ("".equals(EXX.trim()) || "None".equals(EXX.trim()) || EXX.startsWith("{")){
            setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            txtLog.append("=== Report > Not Excel" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }   
        try {
            int col = 9; 
            String Top_Row = EXX.substring(0, EXX.indexOf("\r\n"));
            EXX = EXX.substring(EXX.indexOf("\r\n") + 2);
        
            String[] lines = EXX.split(System.getProperty("line.separator"));
            int l = lines.length;
            String[][] Values = new String[l][col];
            for (int i = 0; i < l; i++) {
                String[] v = lines[i].split("\t");
                System.arraycopy(v, 0, Values[i], 0, v.length); 
            }
            String Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
            try{
                Report_Date = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("Date").getModelIndex()).toString() +
                    " " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("Time").getModelIndex()).toString();
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                Date R_Date = formatter.parse(Report_Date); 
                formatter = new SimpleDateFormat("ddMMMyyyy_HHmmss");
                Report_Date = formatter.format(R_Date);
            } catch (Exception ex){
                txtLog.append("=== Report Excel Error: " + ex.getMessage()+ "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
            // ===============================================================
            txtLog.append("=== Report Excel file:\r\n" + A.Func.fExcel(l, col, Values, DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()) + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File) + "\r\n");
            // ===============================================================
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            txtLog.append("=== Report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }                                     

    private void LoadFilters() {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        cmbF_App.removeAllItems();
        cmbF_App.addItem("ALL");
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT Distinct [app] FROM[dbo].[aw_result] ORDER BY [app]");
            while (rs.next()) {
                cmbF_App.addItem(rs.getString(1));
            }
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== Load APP Filter > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        cmbF_App.setSelectedIndex(0);
        
        cmbF_User.removeAllItems();
        cmbF_User.addItem("ALL");
        int User_Index = -1;
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT Distinct [user_id] FROM[dbo].[aw_result] ORDER BY [user_id]");
            int count = 1;
            while (rs.next()) {
                String USER = rs.getString(1);
                if(USER.toLowerCase().equals(A.A.UserID.toLowerCase())){
                   User_Index = count;
                }
                cmbF_User.addItem(USER);
                count++;
            }
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== Load User Filter > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        if(User_Index != -1){
            cmbF_User.setSelectedIndex(User_Index);
        }else{
            cmbF_User.setSelectedIndex(0);                
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LoadDB(){
        if(LOAD){
            return;
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String Filter = "";
        if (cmbF_App.getSelectedItem() != "ALL" && cmbF_User.getSelectedItem() == "ALL") {
            Filter = " WHERE [app] = '" + cmbF_App.getSelectedItem() + "'";
        }
        if (cmbF_App.getSelectedItem() == "ALL" && cmbF_User.getSelectedItem() != "ALL") {
            Filter = " WHERE [user_id] = '" + cmbF_User.getSelectedItem() + "'";
        }
        if (cmbF_App.getSelectedItem()!= "ALL" && cmbF_User.getSelectedItem() != "ALL") {
            Filter += "  WHERE [app] = '" + cmbF_App.getSelectedItem() + "' AND [user_id] = '" + cmbF_User.getSelectedItem() + "'";
        }

        SQL = "SELECT " + 
                "[qID] " +
                ",[Date] " +
                ",[Time] " +
                ",[app] " +
                ",[url] " +
                ",[summary] " +
                ",[Status] " + 
                ",[user_id] " +
                ",[user_ws] " +
                ",[test_type] " + 
                ",[env] " +
                ",[t_calls] " +
                ",[t_min] " +
                ",[t_avg] " +
                ",[t_max] " +
                ",[p_50] " +
                ",[p_90] " +
                ",[cDate] " +
            "FROM[dbo].[aw_result] " + Filter + " ORDER BY[qID] DESC";  
            
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
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
            
            for (int i = 0; i < DV1.getColumnCount(); i++) {
                DefaultTableColumnModel colModel = (DefaultTableColumnModel) DV1.getColumnModel();
                TableColumn col = colModel.getColumn(i);
                int width = 0;

                TableCellRenderer cr;
                for (int r = 0; r < DV1.getRowCount(); r++) {
                  cr = DV1.getCellRenderer(r, i);
                  Component comp = cr.getTableCellRendererComponent(DV1, DV1.getValueAt(r, i), false, false, r, i);
                  width = Math.max(width, comp.getPreferredSize().width);
                }
                col.setPreferredWidth(width + 4);
            }
            conn.close();
            
            for (int i = DV1.getRowCount() - 1; i >= 0; i--){
                Object value = DV1.getValueAt(i, 5); 
                TableCellRenderer cr = new A.Func.ColorRenderer();
                Component cell = cr.getTableCellRendererComponent(DV1, value, false, false, i, 5);
                DV1.getColumnModel().getColumn(5).setCellRenderer(cr);
            }
        } catch (SQLException ex) {
            txtLog.append("=== Load Data > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setTitle("Reports - " + DV1.getRowCount() + " found");
        if(DV1.getRowCount() > 0){
            DV1.changeSelection(0, 0, false, false);
            Summary();
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }  

    // <editor-fold defaultstate="collapsed" desc="Private Variables">    
    private boolean LOAD = true;
    private String SQL = ""; 
    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelOld;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnReport;
    private javax.swing.JComboBox<String> cmbF_App;
    private javax.swing.JComboBox<String> cmbF_User;
    private com.toedter.calendar.JDateChooser dtpDel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
