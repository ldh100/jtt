/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;
import static A.A.*;
import A.Func;
import java.awt.Component;
import java.awt.Cursor;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
/**
 *
 * @author Oleg.Spozito
 */

public class W_Report extends javax.swing.JInternalFrame {
    /**
     * Creates new form W_Report
     */
    public W_Report() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtLOG = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        dtpDEL = new com.toedter.calendar.JDateChooser();
        lblSITES = new javax.swing.JLabel();
        btnDEL = new javax.swing.JButton();
        btnDEL_OLD = new javax.swing.JButton();
        btnEXCEL = new javax.swing.JButton();
        btnLOG = new javax.swing.JButton();
        btnREF = new javax.swing.JButton();
        cmbF = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reports");
        setDoubleBuffered(true);
        setMinimumSize(new java.awt.Dimension(847, 253));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtLOG.setEditable(false);
        txtLOG.setColumns(20);
        txtLOG.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtLOG.setRows(5);
        txtLOG.setMargin(new java.awt.Insets(2, 2, 1, 1));
        jScrollPane1.setViewportView(txtLOG);

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

        dtpDEL.setDateFormatString("DD-MMM-yyyy");
        dtpDEL.setFocusCycleRoot(true);
        dtpDEL.setName("dtpFEL"); // NOI18N
        dtpDEL.setPreferredSize(new java.awt.Dimension(103, 24));
        dtpDEL.setRequestFocusEnabled(false);
        dtpDEL.setVerifyInputWhenFocusTarget(false);

        lblSITES.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSITES.setText("Filter by App:");
        lblSITES.setAlignmentX(0.5F);

        btnDEL.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDEL.setText("Delete Selected");
        btnDEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDELMouseClicked(evt);
            }
        });

        btnDEL_OLD.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDEL_OLD.setText("Delete Before:");
        btnDEL_OLD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDEL_OLDMouseClicked(evt);
            }
        });

        btnEXCEL.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnEXCEL.setText("Excel Report");
        btnEXCEL.setPreferredSize(new java.awt.Dimension(113, 25));
        btnEXCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEXCELMouseClicked(evt);
            }
        });

        btnLOG.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLOG.setText("Log");
        btnLOG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLOGMouseClicked(evt);
            }
        });

        btnREF.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnREF.setText("Ref");
        btnREF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnREFMouseClicked(evt);
            }
        });

        cmbF.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbF.setMinimumSize(new java.awt.Dimension(113, 24));
        cmbF.setPreferredSize(new java.awt.Dimension(113, 24));
        cmbF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(dtpDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(btnDEL_OLD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSITES, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnREF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnEXCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDEL_OLD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(dtpDEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(lblSITES))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEXCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnREF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        LoadREP();
    }//GEN-LAST:event_formAncestorAdded
    private void LoadREP() {                                      
        dtpDEL.setDateFormatString("dd-MMM-yyy");
        Date now = new Date();
        dtpDEL.setMaxSelectableDate(now);
        dtpDEL.setDate(new Date(now.getTime() - Duration.ofDays(14).toMillis()));
        LoadF();
        LoadDB();
    } 
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedColumn()== 5){
            DV1.changeSelection(DV1.getSelectedRow(), 0, false, false);            
        }
        SUM();
    }//GEN-LAST:event_DV1MouseClicked

    private void btnDELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDELMouseClicked
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
        try {
            conn.createStatement().execute("DELETE FROM [dbo].[aw_result] WHERE qID = '" + DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");        
        } catch (SQLException ex) {
            txtLOG.append("\r\n\r\n=== Delete report > ERROR: " + ex.getMessage());
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));

        LoadF();
        LoadDB();
    }//GEN-LAST:event_btnDELMouseClicked

    private void btnDEL_OLDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDEL_OLDMouseClicked
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "yyyy-MM-dd");
        Object[] options = {"Yes", "No"};
        int reply = JOptionPane.showOptionDialog(this,
            "Are you sure you want to delete all recodrs logged before " + simpleDateFormat.format(dtpDEL.getDate()) + "?",
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
        try {
            
            Statement st = conn.createStatement();
            int d = st.executeUpdate("DELETE FROM [dbo].[aw_result] WHERE [Date] < '" + simpleDateFormat.format(dtpDEL.getDate()) + "'");
            txtLOG.append("\r\n\r\n=== Old Reports > " + d + " record(s) deleted");       
        } catch (SQLException ex) {
            txtLOG.append("\r\n\r\n=== Delete Old Reports > ERROR: " + ex.getMessage());
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        LoadF();
        LoadDB();
    }//GEN-LAST:event_btnDEL_OLDMouseClicked

    private void btnEXCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEXCELMouseClicked
        btnEXCEL.setEnabled(false);
        EXCEL();
        btnEXCEL.setEnabled(true);
    }//GEN-LAST:event_btnEXCELMouseClicked

    private void btnLOGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLOGMouseClicked
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [Result] FROM [dbo].[aw_result] WHERE [qID] = '" +
               DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");
            rs.next();
            String EXX = rs.getString(1);
            if(!Func.SHOW_FILE(EXX, "txt")){
                txtLOG.append("\r\n\r\n=== Cannot show 'txt' output");
            }
//            File aLog = new File("aLog.txt");
//            if (aLog.createNewFile()) {
//                txtLOG.append("\r\n\r\n=== Report > File created: " + aLog.getName());
//            } else {
//                txtLOG.append("\r\n\r\n=== Report > File already exists");
//            }
//            Files.write(Paths.get(aLog.getPath()), EXX.getBytes());
//            java.awt.Desktop.getDesktop().open(aLog);        
        }catch (Exception ex){
            txtLOG.append("\r\n\r\n=== Report > ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnLOGMouseClicked

    private void btnREFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnREFMouseClicked
        LoadF();
        LoadDB();
    }//GEN-LAST:event_btnREFMouseClicked

    private void cmbFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFItemStateChanged
        if(evt.getStateChange() == 1) {
            LoadDB();
        }
    }//GEN-LAST:event_cmbFItemStateChanged
    private void SUM() {
        if (DV1.getRowCount() < 1) return;
        btnLOG.setEnabled(true);
        btnDEL_OLD.setEnabled(true); 
        if (UserID.toLowerCase().contains("oleg")){
            btnDEL_OLD.setEnabled(true);
        }  else{
            btnDEL_OLD.setEnabled(false);
        }   
        String AUTOR = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_id").getModelIndex()).toString();
        if (AUTOR.equals(UserID)|| UserID.toLowerCase().contains("oleg")){ 
            btnDEL.setEnabled(true);
        }  else{
            btnDEL.setEnabled(false);
        }          
        if (DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("AP3") || 
                DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("Food")|| 
                DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()).toString().startsWith("WO"))
        {
            btnEXCEL.setEnabled(true);
        } else {
            btnEXCEL.setEnabled(false);
        }        
        String utcTimeString = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("cDate").getModelIndex()).toString();
        DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date utcTime = null;
        try {
            utcTime = utcFormat.parse(utcTimeString);
        } catch (ParseException ex) {
            Logger.getLogger(W_Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        DateFormat localFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        localFormat.setTimeZone(TimeZone.getDefault());
        String Status = DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("Status").getModelIndex()).toString().trim();
        if(!Status.contains("Scope")){
            Status = "";
        }
        txtLOG.setText("LogID: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("qID").getModelIndex())
            + " @" + localFormat.format(utcTime) 
            + " (" + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("test_type").getModelIndex()) + ") > "
            + "WS: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_ws").getModelIndex())+ ", " 
            + "User: " + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("user_id").getModelIndex()) + "\r\n" 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("app").getModelIndex()) + " - " 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("url").getModelIndex()) + " - " 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("env").getModelIndex()) + "\r\n" 
            + DV1.getValueAt(DV1.getSelectedRow(), DV1.getColumn("summary").getModelIndex()).toString().trim() + "\r\n" 
            + Status               
        );
        txtLOG.setCaretPosition(0);
    }
    private void EXCEL(){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String EXX = "";
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT TOP 1 [Excel] FROM [dbo].[aw_result] WHERE [qID] = '" +
               DV1.getValueAt(DV1.getSelectedRow(), 0) + "'");
            rs.next();
            EXX = rs.getString(1);
        }catch (Exception ex){
            txtLOG.append("\r\n\r\n=== Report > ERROR: " + ex.getMessage());
        }
        if ("".equals(EXX.trim()) || "None".equals(EXX.trim())){
            setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            txtLOG.append("\r\n\r\n=== Report > Not Excel");
            return;
        }   
        try {
            int col = 9; 
            String Top_Row = EXX.substring(0, EXX.indexOf("\r\n"));
            EXX = EXX.substring(EXX.indexOf("\r\n") + 2);
        
            String[] lines = EXX.split(System.getProperty("line.separator"));
            int l = lines.length;
            String[][] Values = new String[l][col];
            int n = 1;
            for (int i = 0; i < l; i++) {
                String[] v = lines[i].split("\t");
                System.arraycopy(v, 0, Values[i], 0, v.length); 
//                for (int j = 0; j < v.length; j++){
//                    Values[i][j] = v[j];
//                } 
            }
            String Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MMM_yyyy_hh_mma"));
            Func.fExcel((l - 1), col, Values, "AP3_" + env + "_" + Date, Top_Row, 0, 0, null, " ", " ");


//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                Clipboard clipboard = null;
//                try{
//                    clipboard = toolkit.getSystemClipboard();
//                    clipboard.setContents( new StringSelection(""), null); // 900009
//                }catch (Exception ex){
//                    Thread.sleep(20);
//                    clipboard = toolkit.getSystemClipboard();
//                    clipboard.setContents( new StringSelection(""), null);
//                    //clipboard.setContents( DV1["app", DV1.SelectedCells[0].RowIndex].Value.ToString() + "_" + Date);  
//                }

//            File ExcelLog = new File("ExcelLog.txt");
//            if (ExcelLog.createNewFile()) {
//                txtLOG.append("\r\n\r\n=== Report > File created: " + ExcelLog.getName());
//            } else {
//                txtLOG.append("\r\n\r\n=== Report > File already exists.");
//            }
//            Files.write(Paths.get(ExcelLog.getPath()), EXX.getBytes());
//            java.awt.Desktop.getDesktop().open(ExcelLog);
        } catch (Exception ex) {
            txtLOG.append("\r\n\r\n=== Report > ERROR: " + ex.getMessage());
        }
        Runtime.getRuntime().gc();
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }                                     

    private void LoadF() {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        cmbF.addItem("ALL");
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT Distinct [app] FROM[dbo].[aw_result] ORDER BY [app]");
            while (rs.next()) {
               cmbF.addItem(rs.getString(1));
            }           
        } catch (SQLException ex) {
            txtLOG.append("\r\n\r\n=== Load APP Filter > ERROR: " + ex.getMessage());
        }
        cmbF.setSelectedIndex(0);
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LoadDB(){
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String pl = "";
            if (cmbF.getSelectedItem() != "ALL") {
                pl = " WHERE [app] = '" + cmbF.getSelectedItem() + "'";
            }
            SQL = "SELECT " + 
                  "[qID] " +
                  ",[Date] " +
                  ",[Time] " +
                  ",[app] " +
                  ",[url] " +
                  ",[summary] " +
                  ",[t_calls] " +
                  ",[t_min] " +
                  ",[t_avg] " +
                  ",[t_max] " +
                  ",[p_50] " +
                  ",[p_90] " +
                  ",[test_type] " +
                  ",[user_id] " +
                  ",[user_ws] " +
                  ",[env] " +
                  ",[Status] " +
                  ",[cDate] " +
              "FROM[dbo].[aw_result] " + pl + " ORDER BY[qID] DESC";  
        try {
            ResultSet rs = conn.createStatement().executeQuery(SQL);
            ResultSetMetaData rsmd =rs.getMetaData();
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
    
            for (int i = DV1.getRowCount() - 1; i >= 0; i--){
                Object value = DV1.getValueAt(i, 5); 
                TableCellRenderer cr = new Func.ColorRenderer();
                Component cell = cr.getTableCellRendererComponent(DV1, value, false, false, i, 5);
                DV1.getColumnModel().getColumn(5).setCellRenderer(cr);
            }
        } catch (Exception ex) {
            txtLOG.append("\r\n\r\n=== Load Data > ERROR: " + ex.getMessage());
        }
        DV1.repaint();
        this.title = "Reports - " + DV1.getRowCount() + " records";
        if(DV1.getRowCount() > 0){
            DV1.changeSelection(0, 0, false, false);
            SUM();
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }  
    // <editor-fold defaultstate="collapsed" desc="Public & Private Variables">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnDEL_OLD;
    private javax.swing.JButton btnEXCEL;
    private javax.swing.JButton btnLOG;
    private javax.swing.JButton btnREF;
    private javax.swing.JComboBox<String> cmbF;
    private com.toedter.calendar.JDateChooser dtpDEL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JTextArea txtLOG;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
