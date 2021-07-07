package A;

import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



/**
 *
 * @author Oleg.Spozito
 */

public class Env extends javax.swing.JInternalFrame {
    public Env() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        cmbEnv = new javax.swing.JComboBox<>();
        cmbWhat = new javax.swing.JComboBox<>();
        lblUsers = new javax.swing.JLabel();
        cmbApp = new javax.swing.JComboBox<>();
        btnView = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnCsv = new javax.swing.JButton();
        btnStatistics = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Environmet(s)");
        setDoubleBuffered(true);
        setMinimumSize(new java.awt.Dimension(847, 253));
        setName("Env"); // NOI18N
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
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
        DV1.setCellSelectionEnabled(true);
        DV1.setGridColor(java.awt.SystemColor.activeCaptionBorder);
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

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(2, 2, 1, 1));
        jScrollPane1.setViewportView(txtLog);

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Production", "Staging", "Development" }));
        cmbEnv.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbEnv.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        cmbWhat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbWhat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sites", "Units", "Brands", "Menus" }));
        cmbWhat.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbWhat.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbWhat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWhatItemStateChanged(evt);
            }
        });

        lblUsers.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblUsers.setText("Selections:");
        lblUsers.setAlignmentX(0.5F);

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All App", "Boost", "Thrive", "JJKitchen", "Tacit" }));
        cmbApp.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbApp.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnView.setText("Print Selected ^");
        btnView.setEnabled(false);
        btnView.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewMouseClicked(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText("< Log");
        btnLog.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        btnExcel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExcel.setText("^ Excel");
        btnExcel.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcelMouseClicked(evt);
            }
        });

        btnCsv.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCsv.setText("^ CSV");
        btnCsv.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnCsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCsvMouseClicked(evt);
            }
        });

        btnStatistics.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnStatistics.setText("Statistics");
        btnStatistics.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lblUsers)
                        .addGap(1, 1, 1)
                        .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cmbWhat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbWhat, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsers)
                    .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        getAccessibleContext().setAccessibleName("Env");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
         LoadDB();
    }//GEN-LAST:event_formAncestorAdded
    private void btnViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewMouseClicked
        PrintRow();
    }//GEN-LAST:event_btnViewMouseClicked
    private void cmbWhatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWhatItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbWhatItemStateChanged
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    private void btnExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseClicked
        btnExcel.setEnabled(false);
        Excel();
        btnExcel.setEnabled(true);
    }//GEN-LAST:event_btnExcelMouseClicked
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedRows().length > 0){
            btnView.setEnabled(true);
        } else{
            btnView.setEnabled(false);
        }
    }//GEN-LAST:event_DV1MouseClicked
    private void btnCsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCsvMouseClicked
        btnCsv.setEnabled(false);
        CSV_Full();
        btnCsv.setEnabled(true);
    }//GEN-LAST:event_btnCsvMouseClicked

    private void btnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseClicked
        if(cmbWhat.getSelectedItem().toString().toLowerCase().contains("menu")){
            MenuSTAT(); 
        } else {
            LocationSTAT(cmbWhat.getSelectedItem().toString()); 
        }
    }//GEN-LAST:event_btnStatisticsMouseClicked
    
    private void LoadDB(){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String _where = "";
        if (!cmbApp.getSelectedItem().toString().startsWith("All")) {
            _where = " WHERE [app] = '" + cmbApp.getSelectedItem().toString() + "'";
        }
        TBL = "p2_" + cmbWhat.getSelectedItem().toString().toLowerCase() + "_" + cmbEnv.getSelectedItem().toString().substring(0, 2).toLowerCase();
        SQL = "SELECT * FROM[dbo].[" + TBL + "] " + _where;  
            
        try (Connection conn = DriverManager.getConnection(A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel dm = new DefaultTableModel();
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
            
            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV1.getModel());
            DV1.setRowSorter(sorter);
            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);  
            //sorter.setSortable(0, false); 
            sorter.sort(); 
            txtLog.append("= " + 
                    cmbEnv.getSelectedItem().toString() + " > " +
                    cmbApp.getSelectedItem().toString() + " > " + 
                    cmbWhat.getSelectedItem().toString() + " > " +
                    DV1.getRowCount() + 
                    " records\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            if(DV1.getRowCount() > 0){
                DV1.changeSelection(0, 0, false, false);
                btnView.setEnabled(true);
            }
        } catch (SQLException ex) {
            txtLog.append("=== Load Data > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));        
    }  
    private void PrintRow(){
        if(DV1.getSelectedRow() == -1){
            txtLog.append("\r\n== Nothing selected. Please select row/cell" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        String RowDetails = "";
        for (int j = 0; j < DV1.getColumnCount(); j++) {
            RowDetails += DV1.getColumnModel().getColumn(j).getHeaderValue();
            RowDetails += " : " + DV1.getValueAt(DV1.getSelectedRow(), j);
            RowDetails += "\r\n";
        }
        
        String R = Func.SHOW_FILE(RowDetails, "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }
    private void Excel(){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
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

            String SheetName = " == " + cmbEnv.getSelectedItem().toString() + " > " + 
                    cmbApp.getSelectedItem().toString() + " > " +  
                    cmbWhat.getSelectedItem().toString() + " > " + DV1.getRowCount();
            Func.fExcel(rows + 1, cols, Values, cmbWhat.getSelectedItem().toString(), SheetName, 0, 0, null, " ", " ", true);
        } catch (Exception ex) {
            txtLog.append("= Excel > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void CSV_Full(){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        int cols = DV1.getColumnCount(); 
        int rows = DV1.getRowCount(); 
        String CSV = "";
        try {
            for (int i = 0; i < cols - 3; i++) {
                CSV += DV1.getColumnModel().getColumn(i).getHeaderValue().toString() + ",";
            }
            CSV = CSV.substring(0, CSV.length() - 1) + "\r\n";
            for (int j = 0; j < rows; j++) {
                for (int i = 0; i < cols - 3; i++) { 
                    CSV += "\""+ DV1.getModel().getValueAt(j, i).toString() + "\"" + ",";
                }
                CSV = CSV.substring(0, CSV.length() - 1) + "\r\n";
            }
            Func.SHOW_FILE(CSV, ".csv");
        } catch (Exception ex) {
            txtLog.append("= CSV > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
  
    private void LocationSTAT(String WHAT) {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String Statistics = "";
        int Tot = 0;
        int cdl = 0;
        int dhm = 0;
        int dh = 0;
        TBL = "p2_" + WHAT.toLowerCase() + "_" + cmbEnv.getSelectedItem().toString().substring(0, 2).toLowerCase();
        try {
            try (Connection conn = DriverManager.getConnection(A.QA_BD_CON_STRING)) {
                Tot = 0;
                cdl = 0;
                dhm = 0;
                dh = 0;
                Statistics = "";
                SQL = "SELECT st.app, " +
                        "(SELECT count(*) FROM [dbo].[" + TBL +"]  WHERE app = st.app ) AS Total, " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'CDL' AND app = st.app) AS v1Menu, " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'CDL migrated' AND app = st.app) AS v2Menu, " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'DH' AND app = st.app) AS BadMenu " +
                        "FROM [dbo].[" + TBL +"] st GROUP BY app";
                ResultSet rs = conn.createStatement().executeQuery(SQL);
                while(rs.next()) {
                    int SubTot = (int)rs.getObject(2);
                    int _cdl = (int)rs.getObject(3);
                    int _dhm = (int)rs.getObject(4);
                    int _dh = (int)rs.getObject(5);
                    
                    Tot = Tot + SubTot;
                    cdl = cdl + _cdl;
                    dhm = dhm + _dhm;
                    dh = dh + _dh;
                    
                    String _cdl_p = " (" + String.format("%.1f", (double)_cdl / SubTot * 100.0) + "%)";
                    String _dhm_p = " (" + String.format("%.1f", (double)_dhm / SubTot * 100.0) + "%)";
                    String _dh_p = " (" + String.format("%.1f", (double)_dh / SubTot * 100.0) + "%)"; 
                    
                    Statistics += rs.getString(1) + ": " + SubTot + "\r\n" +
                            "     - CDL:  " + _cdl  + _cdl_p + "\r\n" +
                            "     - CDL migrated:  " + _dhm  + _dhm_p + "\r\n" +
                            "     - DH:  " + _dh + _dh_p + "\r\n";
                }
                rs.close();
                
                String cdl_p = " (" + String.format("%.1f", (double)cdl / Tot * 100.0) + "%)";
                String dhm_p = " (" + String.format("%.1f", (double)dhm / Tot * 100.0) + "%)";
                String dh_p = " (" + String.format("%.1f", (double)dh / Tot * 100.0) + "%)";                
                
                Statistics = "==== " + cmbEnv.getSelectedItem().toString() + " " + WHAT + ":" + " \r\n\r\n" +
                        "Total: " + Tot + "\r\n" +
                            "     - CDL:  " + cdl  + cdl_p + "\r\n" +
                            "     - CDL migrated:  " + dhm  + dhm_p + "\r\n" +
                            "     - DH:  " + dh + dh_p + "\r\n\r\n" +
                        Statistics + "\r\n";
                
                SQL = "SELECT TOP 1 " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'CDL' AND country LIKE 'c%') AS v1c, " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'CDL migrated' AND country LIKE 'c%') AS v2c, " +
                        "(SELECT count(Platform) FROM [dbo].[" + TBL +"] WHERE Platform = 'DH' AND country LIKE 'c%') AS Badc " +
                        "FROM [dbo].[" + TBL + "]";
                rs = conn.createStatement().executeQuery(SQL);
                rs.next();
                
                int cdl_c = (int)rs.getObject(1);
                int dhm_c = (int)rs.getObject(2);
                int dh_c = (int)rs.getObject(3);
                
                rs.close();
                

                cdl_p = " (" + String.format("%.1f", (double)cdl_c / (cdl_c + dhm_c + dh_c) * 100.0) + "%)";
                dhm_p = " (" + String.format("%.1f", (double)dhm_c / (cdl_c + dhm_c + dh_c) * 100.0) + "%)";
                dh_p = " (" + String.format("%.1f", (double)dh_c / (cdl_c + dhm_c + dh_c) * 100.0) + "%)"; 
                
                Statistics += "== Canada Total: " + (cdl_c + dhm_c + dh_c)+ "\r\n" +
                        "     - CDL:  " + cdl_c + cdl_p + "\r\n" +
                        "     - CDL migrated:  " + dhm_c + dhm_p + "\r\n" +
                        "     - DH:  " + dh_c + dh_p + "\r\n";
                
                cdl_p = " (" + String.format("%.1f", (double)(cdl - cdl_c) / (Tot - (cdl_c + dhm_c + dh_c)) * 100.0) + "%)";
                dhm_p = " (" + String.format("%.1f", (double)(dhm - dhm_c) / (Tot - (cdl_c + dhm_c + dh_c)) * 100.0) + "%)";
                dh_p = " (" + String.format("%.1f", (double)(dh - dh_c) / (Tot - (cdl_c + dhm_c + dh_c)) * 100.0) + "%)";
                
                Statistics += "== US Total: " + (Tot - (cdl_c + dhm_c + dh_c)) + "\r\n" +
                        "     - CDL:  " +  (cdl - cdl_c) + cdl_p + "\r\n" +
                        "     - CDL migrated:  " +(dhm - dhm_c) + dhm_p + "\r\n" +
                        "     - DH:  " +  (dh - dh_c) + dh_p+ "\r\n";
            }
        } catch (Exception ex)  {
            txtLog.append("= LocationSTAT > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }

        Func.SHOW_FILE(Statistics, ".txt");
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    private void MenuSTAT() {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String Statistics = "";
        int Tot = 0;
        int v1t = 0;
        int v2t = 0;
        int Bt = 0;
        TBL = "p2_" + cmbWhat.getSelectedItem().toString().toLowerCase() + "_" + cmbEnv.getSelectedItem().toString().substring(0, 2).toLowerCase();
        try {
            try (Connection conn = DriverManager.getConnection(A.QA_BD_CON_STRING)) {
                Tot = 0;
                v1t = 0;
                v2t = 0;
                Bt = 0;
                Statistics = "";
                SQL = "SELECT st.app, " +
                        "(SELECT count(*) FROM [dbo].[" + TBL +"]  WHERE app = st.app ) AS TotMenu, " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = 'v1' AND app = st.app) AS v1Menu, " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = 'v2' AND app = st.app) AS v2Menu, " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = '?' AND app = st.app) AS BadMenu " +
                        "FROM [dbo].[" + TBL +"] st GROUP BY app";
                ResultSet rs = conn.createStatement().executeQuery(SQL);
                while(rs.next()) {
                    int SubTot = (int)rs.getObject(2);
                    int v1 = (int)rs.getObject(3);
                    int v2 = (int)rs.getObject(4);
                    int B = (int)rs.getObject(5);
                    
                    Tot = Tot + SubTot;
                    v1t = v1t + v1;
                    v2t = v2t + v2;
                    Bt = Bt + B;
                    
                    String Bp = " (" + String.format("%.1f", (double)B / SubTot * 100.0) + "%)";
                    String v1p = " (" + String.format("%.1f", (double)v1 / SubTot * 100.0) + "%)";
                    String v2p = " (" + String.format("%.1f", (double)v2 / SubTot * 100.0) + "%)";
                    
                    Statistics += rs.getString(1) + ": " + SubTot + "\r\n" +
                            "     - Unknown/Bad API:  " + B  + Bp + "\r\n" +
                            "     - Ver1:  " + v1  + v1p + "\r\n" +
                            "     - Ver2:  " + v2 + v2p + "\r\n";
                }
                rs.close();
                
                String Btp = " (" + String.format("%.1f", (double)Bt / Tot * 100.0) + "%)";
                String v1tp = " (" + String.format("%.1f", (double)v1t / Tot * 100.0) + "%)";
                String v2tp = " (" + String.format("%.1f", (double)v2t / Tot * 100.0) + "%)";
                
                
                Statistics = "==== " + cmbEnv.getSelectedItem().toString() + " Menus:" + " \r\n\r\n" +
                        "Total: " + Tot + "\r\n" +
                        "     - Unknown/Bad API:  " + Bt + Btp + "\r\n" +
                        "     - Ver1:  " + v1t + v1tp + "\r\n" +
                        "     - Ver2:  " + v2t + v2tp + "\r\n\r\n" +
                        Statistics + "\r\n";
                
                SQL = "SELECT TOP 1 " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = 'v1' AND country LIKE 'c%') AS v1c, " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = 'v2' AND country LIKE 'c%') AS v2c, " +
                        "(SELECT count(ver) FROM [dbo].[" + TBL +"] WHERE ver = '?' AND country LIKE 'c%') AS Badc " +
                        "FROM [dbo].[" + TBL + "]";
                rs = conn.createStatement().executeQuery(SQL);
                rs.next();
                
                int v1c = (int)rs.getObject(1);
                int v2c = (int)rs.getObject(2);
                int Bc = (int)rs.getObject(3);
                
                rs.close();
                
                Btp = " (" + String.format("%.1f", (double)Bc / (v1c + v2c + Bc) * 100.0) + "%)";
                v1tp = " (" + String.format("%.1f", (double)v1c / (v1c + v2c + Bc) * 100.0) + "%)";
                v2tp = " (" + String.format("%.1f", (double)v2c / (v1c + v2c + Bc) * 100.0) + "%)";
                Statistics += "== Canada Total: " + (v1c + v2c + Bc)+ "\r\n" +
                        "     - Unknown/Bad API:  " + Bc + Btp + "\r\n" +
                        "     - Ver1:  " + v1c + v1tp + "\r\n" +
                        "     - Ver2:  " + v2c + v2tp + "\r\n";
                
                Btp = " (" + String.format("%.1f", (double)(Bt - Bc) / (Tot - (v1c + v2c + Bc)) * 100.0) + "%)";
                v1tp = " (" + String.format("%.1f", (double)(v1t - v1c) / (Tot - (v1c + v2c + Bc)) * 100.0) + "%)";
                v2tp = " (" + String.format("%.1f", (double)(v2t - v2c) / (Tot - (v1c + v2c + Bc)) * 100.0) + "%)";
                Statistics += "== US Total: " + (Tot - (v1c + v2c + Bc)) + "\r\n" +
                        "     - Unknown/Bad API:  " + (Bt - Bc) + Btp + "\r\n" +
                        "     - Ver1:  " + (v1t - v1c) + v1tp + "\r\n" +
                        "     - Ver2:  " + (v2t - v2c) + v2tp + "\r\n";
            }
        } catch (Exception ex)  {
            txtLog.append("= MenuSTAT > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }

        Func.SHOW_FILE(Statistics, ".txt");
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Private Variables">    
    private String SQL = "";
    private String TBL = "";
    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnCsv;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnStatistics;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JComboBox<String> cmbWhat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsers;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
