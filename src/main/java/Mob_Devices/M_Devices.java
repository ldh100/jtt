/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mob_Devices;

import A.Func;
import static A.A.*;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oleg.Spozito
 */

public class M_Devices extends javax.swing.JInternalFrame {
    public M_Devices() {
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
        btnLaunch = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnRef = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell
            }
        };
        lblSITES = new javax.swing.JLabel();
        lblBRANDS = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Mobile Devices");
        setMaximumSize(new java.awt.Dimension(858, 527));
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("Devices"); // NOI18N
        setPreferredSize(new java.awt.Dimension(858, 527));
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
        txtLog.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(2, 2, 1, 1));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 390, 696, 108));

        DV1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 24, 536, 360));

        btnLaunch.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLaunch.setText("^ Launch Selected");
        btnLaunch.setEnabled(false);
        btnLaunch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLaunchMouseClicked(evt);
            }
        });
        getContentPane().add(btnLaunch, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 392, 140, 22));

        btnX.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnX.setText("Do Nothing");
        btnX.setEnabled(false);
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
        });
        getContentPane().add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 420, 140, 22));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText("< Log");
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 448, 140, 22));

        btnRef.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRef.setText("Refresh");
        btnRef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefMouseClicked(evt);
            }
        });
        getContentPane().add(btnRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 476, 140, 22));

        DV2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        DV2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV2.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV2.setName("DV1"); // NOI18N
        DV2.setRowHeight(18);
        DV2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV2.getTableHeader().setReorderingAllowed(false);
        DV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DV2);
        DV2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 24, 300, 360));

        lblSITES.setText("AVD list");
        lblSITES.setAlignmentX(0.5F);
        getContentPane().add(lblSITES, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 4, 220, -1));

        lblBRANDS.setText("Connected devices");
        lblBRANDS.setName("lblBRANDS"); // NOI18N
        getContentPane().add(lblBRANDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 268, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        if(A.A.WsOS.toLowerCase().contains("windows")){
            ADB_HOME = "";  
            EMULATOR_HOME = "C:/Users/" + A.A.UserID + "/AppData/Local/Android/Sdk/emulator";
        }else{
            ADB_HOME = System.getenv("HOME") + File.separator + "Library" + File.separator + "Android"+ File.separator + "sdk" + File.separator + "platform-tools" + File.separator;     
            EMULATOR_HOME =System.getenv("HOME") + File.separator + "Library" + File.separator + "Android"+ File.separator + "sdk" + File.separator + "emulator" + File.separator;   
        }
        Load_AVD();
        Load_Connected_Devices();        
    }//GEN-LAST:event_formAncestorAdded
    private void btnLaunchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLaunchMouseClicked
        Launch();
        //Thread.sleep(2000);
        Load_Connected_Devices();
    }//GEN-LAST:event_btnLaunchMouseClicked
    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        //
        
    }//GEN-LAST:event_btnXMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnRefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefMouseClicked
        Load_AVD();
        Load_Connected_Devices();
    }//GEN-LAST:event_btnRefMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogActionPerformed

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedRow() == 5){
            DV1.changeSelection(DV1.getSelectedRow(), 0, false, false);
        }
    }//GEN-LAST:event_DV1MouseClicked

    private void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if(DV2.getSelectedRows().length > 0){
            btnLaunch.setEnabled(true);       
        } else{
            btnLaunch.setEnabled(false);
        }
    }//GEN-LAST:event_DV2MouseClicked
 
    private void Load_AVD() {   
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String[] dev;
        String Dev = "";
        String D = "";
        String ID = ""; 
               
        String[] M2_ColumnsName = {"Platform", "Name"}; 
        DefaultTableModel M2 = new DefaultTableModel();
        M2.setColumnIdentifiers(M2_ColumnsName);
        DV2.setModel(M2); 
        
        Dev  = Func.ExecuteCmdProcessBuilder("emulator -list-avds", EMULATOR_HOME, true, true).trim();
        txtLog.append("- " + "emulator -list-avds" + " >> " + "\r\n" + Dev + "\r\n\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        
        dev = Dev.split("\r\n");
        for (int i = 0; i < dev.length -1; i++) {
            M2.addRow(new Object[]{"Android", dev[i]}); 
        }

        DV2.setDefaultEditor(Object.class, null);
        DV2.getColumnModel().getColumn(0).setPreferredWidth(60);
        DV2.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        //DV2.getColumnModel().getColumn(1).sizeWidthToFit();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Load_Connected_Devices() {  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String[] dev;
        String Dev = "";
        String D = "";
        String ID = ""; 
        
        String[] M1_ColumnsName = {"Platform", "Model", "Type", "ID", "Status", "Name", "OSv"}; 
        DefaultTableModel M1 = new DefaultTableModel();
        M1.setColumnIdentifiers(M1_ColumnsName);
        DV1.setModel(M1);
        
        Dev  = Func.ExecuteCmdProcessBuilder("adb devices -l", ADB_HOME, true, true).trim();
        txtLog.append("- " + "adb devices -l" + " >> " + "\r\n" + Dev + "\r\n\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        
        dev = Dev.split("\r\n");
        if (dev.length > 2) {
            for (int i = 1; i < dev.length - 1; i++) {
                D = dev[i];
                if(D.contains("model")){
                    ID = D.substring(0, dev[i].indexOf(" ")).trim();
                    D = D.substring(D.indexOf("model:") + 6);
                    D = D.substring(0, D.indexOf(" ")).trim();
                    M1.addRow(new Object[]{"Android", D, "?", ID, "Online", D, "?"});  
                }else{
                    //cmbDevice.addItem(D);
                }
            }
        }    
        DV1.setDefaultEditor(Object.class, null);
        DV1.getColumnModel().getColumn(0).setPreferredWidth(60);
        DV1.getColumnModel().getColumn(1).sizeWidthToFit();   
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Launch(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String D = "";
        String Dev = "";
        if(DV2.getSelectedRows().length > 0){
            String AVD = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 1));
            if(String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 0)).equals("Android")){
                D = "";
                Dev  = Func.ExecuteCmdProcessBuilder("emulator -avd " + AVD, EMULATOR_HOME, true, false).trim();
                txtLog.append("- " + "emulator -avd " + AVD + " >> " + "\r\n" + Dev + "\r\n\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());                
            }else{
                txtLog.append("= iOS - still in development" + "\r\n\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());           
            }       
        } else{
            txtLog.append("= No Virtual Device Selected" + "\r\n\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());                  
        } 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Public & Private Variables">    
    private String ADB_HOME;
    private String EMULATOR_HOME;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JButton btnLaunch;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRef;
    private javax.swing.JButton btnX;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBRANDS;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
