package Orders;

import A.Func;
import static A.A.*;
import com.google.common.base.Stopwatch;
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author Oleg.Spozito
 */

/*[10/29 11:22 AM] Morozov, Andrei
https://api.compassdigital.org/staging/order/swagger.json
https://github.com/compassdigital
https://github.com/compassdigital/compassdigital.provider.order.cdl/blob/dev/test/order_test.js
https://github.com/compassdigital/compassdigital.provider.order.cdl
*/

public class Orders extends javax.swing.JInternalFrame {
    /**
     * Creates new form OR
     */
    public Orders() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrders = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnRun = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES13 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        lblSITES14 = new javax.swing.JLabel();
        cmbApp = new javax.swing.JComboBox<>();
        chkKeep = new javax.swing.JCheckBox();
        chkAll = new javax.swing.JCheckBox();
        chkLoop = new javax.swing.JCheckBox();
        nLoop = new javax.swing.JSpinner();
        lblSITES5 = new javax.swing.JLabel();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        lblUserOrders = new javax.swing.JLabel();
        txtMobile_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtMobile_PW = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Orders = new javax.swing.JList<>();
        lblSITES4 = new javax.swing.JLabel();
        btnSCart = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Orders >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("OR"); // NOI18N
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

        lblOrders.setText("Saved Shopping Cart templates ");
        lblOrders.setAlignmentX(0.5F);
        getContentPane().add(lblOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 496, -1));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 28, 848, 268));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 392, 428, 112));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setEnabled(false);
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.setPreferredSize(new java.awt.Dimension(70, 20));
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });

        chkKeep.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        chkKeep.setSelected(true);
        chkKeep.setText("Keep Payment Method");
        chkKeep.setEnabled(false);
        chkKeep.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        chkAll.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        chkAll.setText("Generate All");
        chkAll.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chkAll.setRequestFocusEnabled(false);
        chkAll.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkAllStateChanged(evt);
            }
        });

        chkLoop.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        chkLoop.setText("Repeat / Loop >");
        chkLoop.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        chkLoop.setRequestFocusEnabled(false);

        nLoop.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        nLoop.setModel(new javax.swing.SpinnerNumberModel(2, 2, 100, 1));
        nLoop.setName("nLoop"); // NOI18N

        lblSITES5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES5.setText(" times   Wait between loops:");
        lblSITES5.setToolTipText("");
        lblSITES5.setAlignmentX(0.5F);

        nWaitLoad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitLoad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 0.0d, 60.0d, 5.0d));
        nWaitLoad.setName("nWaitLoad"); // NOI18N

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES7.setText("sec");
        lblSITES7.setToolTipText("");
        lblSITES7.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkKeep)
                                        .addComponent(chkAll))
                                    .addGap(168, 168, 168))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(chkLoop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblSITES5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(nWaitLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblSITES7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(chkKeep, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(chkAll, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(chkLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(nLoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES5)
                    .addComponent(nWaitLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES7))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 392, 416, 112));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUser.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnUser.setText("< Re-Load User");
        btnUser.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });
        jPanel1.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 20, 108, 20));

        lblUserOrders.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblUserOrders.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserOrders.setText("User's Orders - last 7 days");
        lblUserOrders.setToolTipText("");
        lblUserOrders.setAlignmentX(0.5F);
        jPanel1.add(lblUserOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 4, 460, -1));

        txtMobile_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_ID.setText("App_User@?.?");
        jPanel1.add(txtMobile_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 20, 184, -1));

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("Mobile User Password");
        lblSITES6.setAlignmentX(0.5F);
        jPanel1.add(lblSITES6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 40, -1, -1));

        txtMobile_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_PW.setText("password");
        jPanel1.add(txtMobile_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 56, 184, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        jList_Orders.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jList_Orders.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Orders.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jList_Orders.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList_OrdersValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(jList_Orders);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 20, 528, 56));

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES4.setText("Mobile User E-mail:");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);
        jPanel1.add(lblSITES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 120, -1));

        btnSCart.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSCart.setText("< SCart & Order");
        btnSCart.setEnabled(false);
        btnSCart.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSCartMouseClicked(evt);
            }
        });
        jPanel1.add(btnSCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 52, 108, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 304, 848, 80));

        btnCart.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCart.setText("Selected Cart & Order");
        btnCart.setEnabled(false);
        btnCart.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartMouseClicked(evt);
            }
        });
        getContentPane().add(btnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 4, 172, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (wdLastRow == DV1.getSelectedRow()) {
            wdLastRow = -1;
        }else{
            wdLastRow = DV1.getSelectedRow();             
        }
        ValidateRun();
    }//GEN-LAST:event_DV1MouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        jPanel3.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent arg0) {
                Load_Form();
            }
            @Override
            public void componentMoved(ComponentEvent arg0) {
                //System.err.println("componentMoved");
            }
            @Override
            public void componentShown(ComponentEvent arg0) {
                //System.err.println("componentShown");
            }
            @Override
            public void componentHidden(ComponentEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_formAncestorAdded
    private void Load_Form(){
        Load = true;
        cmbApp.addItem("Boost");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Development");
        //cmbEnv.addItem("Production");  
        
        cmbEnv.setSelectedIndex(1); // delevopment
        cmbApp.setSelectedIndex(0);        
        Load = false;
        LOAD_ENV();
        Get_User();
        LoadOrders(); // ================================  
        lblUserOrders.setText("User's Orders - last 7 days >> " + jList_Orders.getModel().getSize() + " found");
        this.setTitle("Orders");
    }

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        Get_User();
        lblUserOrders.setText("User's Orders - last 7 days >> " + jList_Orders.getModel().getSize() + " found");
    }
    private void Get_User(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load User..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String J = "==== User API(s):" + "\r\n";
        userID = "";
        userTKN = "";
        PaymetMethod = new JSONObject();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = Func.Realm_ID(cmbApp.getSelectedItem().toString(), env);
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        
        try {     // ============ User
            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + Realm);
            httpget.setHeader("Authorization", "Basic " + UserAuth);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/user/auth?realm=" + Realm + "\r\n" + json.toString(4);

            userID = json.getString("user");
            userTKN = json.getString("token");

        } catch (IOException | JSONException ex) {
            txtLog.append(" > " + J); 
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/user/auth?realm="  + Realm + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();
        
        if(userID.isEmpty()){
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
        
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         // ============ Payment 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/payment/method" + "?user_id=" + userID);
            httpget.setHeader("Authorization",  "Bearer " + userTKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            PaymetMethod = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += "\r\n";
            J += BaseAPI + "/payment/method" + "?user_id=" + userID + "\r\n" + PaymetMethod.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/payment/method" + "?user_id=" + userID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/payment/method" + "?user_id=" + userID + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();

        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        // ============ Orders  
        long m1 = System.currentTimeMillis();                     // 1605286535799
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // 1604681735799

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1);
            httpget.setHeader("Authorization",  "Bearer " + userTKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            String Order_Status;
            String Order_Date;

            ZoneOffset offset = OffsetDateTime.now( ZoneId.of(TimeZone.getDefault().getID())).getOffset();
            DateTimeFormatter UTC_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            DateTimeFormatter LOC_formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");
            LocalDateTime LocDate;
            SCART_IDS = new ArrayList<>();
            ORDER_IDS = new ArrayList<>();
            DefaultListModel<String> model = new DefaultListModel<>();
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            JSONArray OR = json.getJSONArray("orders");
            if(!OR.isEmpty()){
                for (int i = 0; i < OR.length(); i++) {
                    JSONObject or = OR.getJSONObject(i);
                    JSONObject is = or.getJSONObject("is");
                    Order_Status = "";
                    if (is.getBoolean("accepted")) Order_Status = "  Accepted ";
                    if (is.getBoolean("in_progress")) Order_Status = "  In_Progress ";
                    if (is.getBoolean("ready")) Order_Status = "  Ready ";
                    SCART_IDS.add(or.getString("shoppingcart"));
                    ORDER_IDS.add(or.getString("id"));
                    LocDate = LocalDateTime.parse(or.getString("requested_date"), UTC_formatter).plusSeconds(offset.getTotalSeconds());
                    Order_Date = LocDate.format(LOC_formatter);
                    model.addElement(Order_Date + " " + Order_Status +
                        " - " + or.getJSONObject("details").getString("order_type") +
                        ", ID: " + or.getJSONObject("details").getString("display_id") +
                        ", Destination: '" + or.getJSONObject("details").getString("destination") + "'");
                }
            }
            jList_Orders.setModel(model);
//            J += "\r\n";
//            J += BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1 + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
//            J += BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1 + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1 + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnUserMouseClicked

    private void jList_OrdersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_OrdersValueChanged
        btnSCart.setEnabled(false);
        if(!evt.getValueIsAdjusting()) {
            btnSCart.setEnabled(true);
        }
    }//GEN-LAST:event_jList_OrdersValueChanged

    private void btnSCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSCartMouseClicked
        if(btnSCart.isEnabled()){
            GetShoppingCartAndOrder();
        }
    }

    private void GetShoppingCartAndOrder(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Shopping Cart..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String J = "==== Shopping Cart" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();

        String CartID = "";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            CartID = SCART_IDS.get(jList_Orders.getSelectedIndex());
            HttpGet httpget = new HttpGet(BaseAPI + "/shoppingcart/" + CartID);
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/shoppingcart/" + CartID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/shoppingcart/" + CartID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/shoppingcart/" + CartID + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();

        J += "\r\n==== Order" + "\r\n";
        txtLog.append("- Order..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String OrderID = "";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            OrderID = ORDER_IDS.get(jList_Orders.getSelectedIndex());
            HttpGet httpget = new HttpGet(BaseAPI + "/order/" + OrderID);
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/order/" + OrderID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/order/" + OrderID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/order/" + OrderID + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();

        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnSCartMouseClicked

    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            jList_Orders.setModel(model);           
            btnSCart.setEnabled(false);
            app = cmbApp.getSelectedItem().toString();
        }
    }//GEN-LAST:event_cmbAppItemStateChanged

    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            LOAD_ENV();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        SAVE_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked

    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnLogMouseClicked

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        btnRun.setEnabled(false);

        t_calls = 0;
        t_min =  0;
        t_avg = 0;
        t_max =  0;
        p_50 = 0;
        p_90 = 0;
        _t = 0; // Total
        _p = 0; // Passed
        _f = 0; // Failed
        _w = 0; // Warn
        r_time = "";        

        
        Instant dw_start = Instant.now();        
        txtLog.append("=== Execution started @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        //LOG_START(); // ========================================================
        try {
            Execute(String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 7))); // ======================================================
        }
        catch (InterruptedException ex) {
            txtLog.append("Execute ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        if(_f > 0) {
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + " with " + _f + " FAIL(s)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }else{
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }         
        Done(dw_start); // ===============================        
    }//GEN-LAST:event_btnRunMouseClicked
    private void Execute(String JCart) throws InterruptedException{
        try{          
            NewScartID = RandomStringUtils.randomAlphanumeric(67); // lenght > 68
            JSCart = new JSONObject(JCart); //String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 7));
            Instant Created = Instant.now();
            Instant Modified = Instant.now().minusSeconds(60);

            //JSCart.remove("date"); // ============================ ???? 
            JSCart.getJSONObject("date").remove("ordered");
            JSCart.getJSONObject("date").remove("created");
            JSCart.getJSONObject("date").put("created", Created); // "2020-12-03T22:32:14.049Z",
            JSCart.getJSONObject("date").remove("modified");
            JSCart.getJSONObject("date").put("modified", Modified);

            JSCart.remove("id"); 
            JSCart.put("id", NewScartID); // ============================ ???? 
            JSCart.remove("order");
            
            /*
                "payment_method": {"payment_methods": [{
                    "date": {
                        "created": "2020-11-12T21:48:13Z",
                        "modified": "2020-12-03T22:32:13Z"
                    },
                    "last4": "1111",
                    "image": "https://assets.braintreegateway.com/payment_method_logo/visa.png?environment=sandbox",
                    "expiration": {
                        "expired": false,
                        "month": 12,
                        "year": 2021
                    },
                    "type": "CreditCard",
                    "card_type": "Visa",
                    "token": "3PjEj8D8pXf7l11p97roujDzPJ0AqKFYEZ45B7yzTGjBD"
                }]}
            */  
            if(!chkKeep.isSelected()){
                //JSCart.remove("payment_method");
                if(JSCart.toString().contains("credit_card") && PaymetMethod.toString().contains("card_type")){
                    JSONArray PaymetMethods = PaymetMethod.getJSONArray("payment_methods");
                    JSONObject PMethod = PaymetMethods.getJSONObject(0);
                        JSCart.getJSONObject("payment_method").getJSONObject("credit_card").remove("last4");
                        JSCart.getJSONObject("payment_method").getJSONObject("credit_card").put("last4", PMethod.get("last4"));
                        JSCart.getJSONObject("payment_method").getJSONObject("credit_card").remove("card_type");
                        JSCart.getJSONObject("payment_method").getJSONObject("credit_card").put("credit_card", PMethod.get("card_type")); 

                } else if((JSCart.toString().contains("mealplan") && PaymetMethod.toString().contains("mealplan"))){
                    txtLog.append("=== Selected Shopping Cart 'mealplan' Method - To Do" + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                    //return; 
                    
                } else if((JSCart.toString().contains("meal_swipes") && PaymetMethod.toString().contains("meal_swipes"))){
                    txtLog.append("=== Selected Shopping Cart 'meal_swipes' Method - To Do" + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                    //return;  
                    
                } else if((JSCart.toString().contains("digital_wallet_pay") && PaymetMethod.toString().contains("digital_wallet_pay"))){
                    txtLog.append("=== Selected Shopping Cart 'digital_wallet_pay' Method - To Do" + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                    //return;  
                    
                }else{
                    txtLog.append("=== Selected Shopping Cart/User Payment Methods - match Not Found" + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                    //return;                
                }
            }

String R = Func.SHOW_LOG_FILE(JSCart.toString(4), "json");
if(!R.equals("OK")){
    txtLog.append(R + "\r\n");
    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
}
        }catch(Exception ex){
            txtLog.append("=== Refactor Shopping Cart ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        // Put Scard + Order // ==================================
    }
    private void Done(Instant dw_start){
        txtLog.append("========   " + "Execution step-by-step log..." + "   ========" + "\r\n");  
        txtLog.setCaretPosition(txtLog.getDocument().getLength());               
        DD = Duration.between(dw_start, Instant.now());
        Summary = "Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w;

        try {
            String t_rep = "";
            if (!"".equals(r_time.trim())) {
                double[] am0 = Arrays.stream(r_time.split(";")).mapToDouble(Double::parseDouble).toArray();
                if (am0.length > 0) {
                    Arrays.sort(am0);
                    double total = 0;
                    for(int i=0; i < am0.length; i++){
                        total = total + am0[i];
                    }
                    t_calls = am0.length;
                    t_min = am0[0] / (double)1000;
                    t_avg = (total / am0.length) / (double)1000;
                    t_max = am0[am0.length - 1]  / (double)1000; 
                    p_50 = Func.p50(am0) / (double)1000;
                    p_90 = Func.p90(am0) / (double)1000;

                    t_rep += "=== Total Calls: " + t_calls + ", Response Times (sec) - Min: " + A.A.df.format(t_min) +
                                                                ", Avg: " + A.A.df.format(t_avg) +
                                                                ", Max: " + A.A.df.format(t_max) +
                                                                ", p50: " + A.A.df.format(p_50) +
                                                                ", p90: " + A.A.df.format(p_90);
                }
                txtLog.append("" + t_rep + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        } catch(Exception ex){
            txtLog.append("=== LOG_UPDATE > Call Times parsing ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
        btnRun.setEnabled(true);
        txtLog.append("=== " + Summary + "\r\n");
        txtLog.append("=== Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  

        LOG_UPDATE(); // ========================================================
               
    }
    
    private void chkAllStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkAllStateChanged
        ValidateRun();
    }//GEN-LAST:event_chkAllStateChanged

    private void btnCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartMouseClicked
        if(btnCart.isEnabled() && DV1.getSelectedRowCount() > 0){
            String R = Func.SHOW_LOG_FILE(
                    "==== Shopping Cart:\r\n" + DV1.getValueAt(DV1.getSelectedRow(), 7).toString() +
                    "\r\n\r\n" +
                    "==== Order:\r\n" + DV1.getValueAt(DV1.getSelectedRow(), 8).toString(), "json");
            if(!R.equals("OK")){
                txtLog.append(R + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        }
    }//GEN-LAST:event_btnCartMouseClicked

    private void LOAD_ENV(){
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
        DefaultListModel model = new DefaultListModel();
        model.clear();
        jList_Orders.setModel(model);
        btnSCart.setEnabled(false);
        
        Get_AP3_TKN(); // ===============================
        LOAD_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        //LoadOrders(); // ================================      
    }
    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM[dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            AP3_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LoadOrders() {
        wdLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Shopping Card Templates ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        SQL = "SELECT " + 
                "[Env] " +
                ",[App] " +
                ",[Site] " +
                ",[Brand] " +
                ",[Service] " +
                ",[Promo] " +
                ",[Payment] " +
                ",[JCart] " +
                ",[JOrder] " +
                ",[UserID] " +
                ",[UserPW] " +
                "FROM[dbo].[orders] ORDER BY[qID] DESC";
                //"FROM[dbo].[orders] WHERE [Env] = '" + env + "' AND [app] = '" + app + "' ORDER BY[qID] DESC";  
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
  
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
            
            for (int i = 0; i < DV1.getColumnCount(); i++) {
                DefaultTableColumnModel colModel = (DefaultTableColumnModel) DV1.getColumnModel();
                TableColumn col = colModel.getColumn(i);
            }
            DV1.setDefaultEditor(Object.class, null);
            DV1.getColumnModel().getColumn(0).setPreferredWidth(40);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(80);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(160);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(160);        
            DV1.getColumnModel().getColumn(4).setPreferredWidth(75);
            DV1.getColumnModel().getColumn(5).setPreferredWidth(80);            
            DV1.getColumnModel().getColumn(6).setPreferredWidth(75);
            DV1.getColumnModel().getColumn(7).setPreferredWidth(200); 
        } catch (SQLException ex) {
            txtLog.append("=== Load Shopping Card Templates > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }        
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        lblOrders.setText("Shopping Card templates - " + DV1.getRowCount() + " found");
        txtLog.append("SCard templates: " + cmbApp.getSelectedItem().toString() + ", " + cmbEnv.getSelectedItem().toString() + " - " + DV1.getRowCount() + " found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void ValidateRun(){
        if(chkAll.isSelected() ){
            DV1.getSelectionModel().clearSelection();
        }
        if(DV1.getSelectedRowCount() > 0 ){
            btnCart.setEnabled(true);
        }else{
            btnCart.setEnabled(false);
        }
        if (DV1.getRowCount() > 0 &&  (DV1.getSelectedRowCount() > 0 && !chkAll.isSelected()) || chkAll.isSelected() ) {
            btnRun.setEnabled(true);
        }else{
            btnRun.setEnabled(false);           
        }
    }
    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'OR' AND [env] = '" + env + "'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            CONFIG = false;
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
            
        try{            
            if (C.contains(": ")) {
                String c;
                c = C.substring(C.indexOf("env:")); c = c.substring(0, c.indexOf("\r\n")).trim(); env = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("app:")); c = c.substring(0, c.indexOf("\r\n")).trim(); app = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("txtMobile_ID:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_ID.setText(c.substring(c.indexOf(" ")).trim());
                c = C.substring(C.indexOf("txtMobile_PW:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_PW.setText(c.substring(c.indexOf(" ")).trim());

                CONFIG = true;
                txtLog.append("=== LOAD_CONFIG > OK" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } else {
                CONFIG = false;
                txtLog.append("=== WEB / AP3, User: " + UserID + ", Env: " + env + " > No saved Configuration Found" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        } catch (Exception ex) {
            CONFIG = false;
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void SAVE_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String _S = "n/a";
        String _B = "n/a";
        try {
            C = "";
            C += "env: " + env + "\r\n";
            C += "app: " + cmbApp.getSelectedItem().toString() + "\r\n";
            C += "txtMobile_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "txtMobile_PW: " + txtMobile_PW.getText()  + "\r\n";            

        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'OR' AND [env] = '" + env + "'";
            Statement _del = conn.createStatement();
            _del.execute(SQL);
            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[a_config]" +
                    "([user_id]" +   // 1
                    ",[env]" +       // 2
                    ",[platform]" +  // 3
                    ",[app]" +       // 4
                    ",[_conf]" +     // 5
                    ") VALUES (" +
                    "?" +
                    ",?" +
                    ",?" +
                    ",?" +
                    ",?" +
                    ")");
            _insert.setString(1, UserID);
            _insert.setString(2, env);
            _insert.setString(3, "WEB");
            _insert.setString(4, "OR");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            txtLog.append("=== SAVE_CONFIG > OK (" + row + " row)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== SAVE_CONFIG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void LOG_UPDATE(){  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            PreparedStatement _update = conn.prepareStatement("UPDATE [dbo].[aw_result] SET " +
                    " [Date] = ?" +       // 1
                    ", [Time] = ?" +      // 2
                    ", [app] = ?" +       // 3
                    ", [url] = ?" +       // 4
                    ", [summary] = ?" +   // 5
                    ", [t_calls] = ?" +   // 6
                    ", [t_min] = ?" +     // 7
                    ", [t_avg] = ?" +     // 8
                    ", [t_max] = ?" +     // 9
                    ", [p_50] = ?" +      // 10
                    ", [p_90] = ?" +      // 11
                    ", [test_type] = ?" +     // 12
                    ", [user_id] = ?" +       // 13
                    ", [user_ws] = ?" +       // 14
                    ", [env] = ?" +       // 15
                    ", [Result] = ?" +    // 16
                    ", [Status] = ?" +    // 17
                    ", [Excel] = ?" +     // 18
                    " WHERE [app] = 'OR_" + env + "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "OR_" + env);
            _update.setString(4, "N/A");
            _update.setString(5, Summary + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")");
            _update.setInt(6, t_calls);
            _update.setDouble(7, t_min);
            _update.setDouble(8, t_avg);
            _update.setDouble(9, t_max);
            _update.setDouble(10, p_50);
            _update.setDouble(11, p_90);
            _update.setString(12, "N/A");
            _update.setString(13, UserID);
            _update.setString(14, WsID);
            _update.setString(15, "N/A");
            _update.setString(16, txtLog.getText());
            _update.setString(17, "Scope: " + "N/A");
            _update.setString(18, "N/A");
            int row = _update.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== LOG_UPDATE > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LOG_START(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
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
            _insert.setString(1, LocalDateTime.now().format(Date_formatter));
            _insert.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _insert.setString(3, "OR_" + env);
            _insert.setString(4, "N/A");
            _insert.setString(5, "Running...");
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, "N/A");
            _insert.setString(13, UserID);
            _insert.setString(14, WsID);
            _insert.setString(15, "N/A");
            _insert.setString(16, "=== Job is running... ===\r\n" + "");
            _insert.setString(17, "Running");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
            conn.close();
        }  catch (SQLException ex) {
            txtLog.append("=== LOG_START > SQL ERROR: " + ex.getMessage() + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration - do not modify">
    private boolean Load;
    private JSONObject JSCart;
    private JSONObject PaymetMethod;
    private String NewScartID; 
    private String C = "";
    private static Duration DD;
    private List<String> ORDER_IDS; 
    private List<String> SCART_IDS;   
    private int wdLastRow = -1; 
    private boolean CONFIG = false;
   
    private String userID;
    private String userTKN;
    private static final Stopwatch sw1 = Stopwatch.createUnstarted();
    private static final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    private static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static String SQL = ""; 
    private static String app = "";
    private static String env;
    private static String BaseAPI;

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSCart;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JButton btnUser;
    private javax.swing.JCheckBox chkAll;
    private javax.swing.JCheckBox chkKeep;
    private javax.swing.JCheckBox chkLoop;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JList<String> jList_Orders;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES5;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblUserOrders;
    private javax.swing.JSpinner nLoop;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
