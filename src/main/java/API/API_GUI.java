package API;

import A.Func;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.base.Stopwatch;///
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
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
public class API_GUI extends javax.swing.JInternalFrame {
    public API_GUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSITES = new javax.swing.JLabel();
        lblBRANDS = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnApp = new javax.swing.JButton();
        btnSite = new javax.swing.JButton();
        btnUnit = new javax.swing.JButton();
        btnBrand = new javax.swing.JButton();
        btnCal = new javax.swing.JButton();
        btnLoc_Menus = new javax.swing.JButton();
        btnOrders = new javax.swing.JButton();
        btnPromo = new javax.swing.JButton();
        btnAn = new javax.swing.JButton();
        btnUpdates = new javax.swing.JButton();
        btnGroup = new javax.swing.JButton();
        btnComp = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        dtpDate = new com.toedter.calendar.JDateChooser();
        btnUserPermissions = new javax.swing.JButton();
        txtAP3_ID = new javax.swing.JTextField();
        txtAP3_PW = new javax.swing.JTextField();
        lblSITES9 = new javax.swing.JLabel();
        btnEod = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnLog = new javax.swing.JButton();
        lblSITES13 = new javax.swing.JLabel();
        lblSITES14 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        cmbApp = new javax.swing.JComboBox<>();
        btnSave_Opt = new javax.swing.JButton();
        cmbGroup = new javax.swing.JComboBox<>();
        lblSITES8 = new javax.swing.JLabel();
        cmbComp = new javax.swing.JComboBox<>();
        lblSITES12 = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();
        lblSITES7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUser = new javax.swing.JButton();
        lblSITES3 = new javax.swing.JLabel();
        txtMobile_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtMobile_PW = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_Orders = new javax.swing.JList<>();
        lblSITES4 = new javax.swing.JLabel();
        btnSCart = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtApi = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Configurations / APIs >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("API"); // NOI18N
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

        lblSITES.setText("Sites");
        lblSITES.setAlignmentX(0.5F);
        getContentPane().add(lblSITES, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 360, -1));

        lblBRANDS.setText("Selected Site - Brands");
        lblBRANDS.setName("lblBRANDS"); // NOI18N
        getContentPane().add(lblBRANDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 4, 268, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic AP3 Configurations/API (s):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnApp.setText("App - multigroup");
        btnApp.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAppMouseClicked(evt);
            }
        });
        jPanel5.add(btnApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 28, 112, 20));

        btnSite.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSite.setText("Site - group");
        btnSite.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiteMouseClicked(evt);
            }
        });
        jPanel5.add(btnSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 52, 112, 20));

        btnUnit.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnUnit.setText("Unit - location");
        btnUnit.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUnit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnitMouseClicked(evt);
            }
        });
        jPanel5.add(btnUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 76, 112, 20));

        btnBrand.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnBrand.setText("Brand");
        btnBrand.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBrandMouseClicked(evt);
            }
        });
        jPanel5.add(btnBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 100, 112, 20));

        btnCal.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCal.setText("Brand Calendar");
        btnCal.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalMouseClicked(evt);
            }
        });
        jPanel5.add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 124, 112, 20));

        btnLoc_Menus.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLoc_Menus.setText(" < Brand Menus");
        btnLoc_Menus.setEnabled(false);
        btnLoc_Menus.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnLoc_Menus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoc_MenusMouseClicked(evt);
            }
        });
        jPanel5.add(btnLoc_Menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 100, 160, 20));

        btnOrders.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnOrders.setText("Brand Orders on >");
        btnOrders.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdersMouseClicked(evt);
            }
        });
        jPanel5.add(btnOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 124, 160, 20));

        btnPromo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnPromo.setText("Promos");
        btnPromo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnPromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPromoMouseClicked(evt);
            }
        });
        jPanel5.add(btnPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 76, 160, 20));

        btnAn.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnAn.setText("Announcements");
        btnAn.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnMouseClicked(evt);
            }
        });
        jPanel5.add(btnAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 52, 112, 20));

        btnUpdates.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnUpdates.setText("Resent Updates");
        btnUpdates.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUpdates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdatesMouseClicked(evt);
            }
        });
        jPanel5.add(btnUpdates, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 76, 112, 20));

        btnGroup.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnGroup.setText("Groups/Sectors");
        btnGroup.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnGroup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGroupMouseClicked(evt);
            }
        });
        jPanel5.add(btnGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 100, 112, 20));

        btnComp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnComp.setText("Sector > Companies");
        btnComp.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompMouseClicked(evt);
            }
        });
        jPanel5.add(btnComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 124, 112, 20));

        btnMenu.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnMenu.setText("Company > Menus");
        btnMenu.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        jPanel5.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 148, 112, 20));

        dtpDate.setDateFormatString("");
        dtpDate.setFocusCycleRoot(true);
        dtpDate.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        dtpDate.setName("dtpDate"); // NOI18N
        dtpDate.setPreferredSize(new java.awt.Dimension(103, 24));
        dtpDate.setRequestFocusEnabled(false);
        dtpDate.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(dtpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 148, 160, 20));

        btnUserPermissions.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnUserPermissions.setText("AP3 User ^ Permissions");
        btnUserPermissions.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUserPermissions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserPermissionsMouseClicked(evt);
            }
        });
        jPanel5.add(btnUserPermissions, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 160, 20));

        txtAP3_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAP3_ID.setText("Ap3_User@?.?");
        jPanel5.add(txtAP3_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 28, 160, -1));

        txtAP3_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAP3_PW.setText("password");
        jPanel5.add(txtAP3_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 28, 116, -1));

        lblSITES9.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES9.setText("AP3 User Email  -  Password");
        lblSITES9.setAlignmentX(0.5F);
        jPanel5.add(lblSITES9, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 12, 172, -1));

        btnEod.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnEod.setText("Site Sales EOD on >");
        btnEod.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnEod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEodMouseClicked(evt);
            }
        });
        jPanel5.add(btnEod, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 148, 112, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 104, 416, 176));
        jPanel5.getAccessibleContext().setAccessibleName("API(s):");

        DV1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 22, 428, 260));

        DV2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV2.setCellSelectionEnabled(true);
        DV2.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV2.setName("DV2"); // NOI18N
        DV2.setOpaque(false);
        DV2.setRowHeight(18);
        DV2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV2.getTableHeader().setReorderingAllowed(false);
        DV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 22, 416, 76));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 420, 428, 84));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        jPanel3.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 20, 52, 20));

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);
        jPanel3.add(lblSITES13, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 4, 92, 16));

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);
        jPanel3.add(lblSITES14, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 4, 92, 16));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 20, 116, 20));

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 20, 108, 20));

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
        jPanel3.add(btnSave_Opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 20, 100, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 460, 416, 44));

        cmbGroup.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbGroup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGroupItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 440, 188, 20));

        lblSITES8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES8.setText("Group/Sector:");
        lblSITES8.setAlignmentX(0.5F);
        getContentPane().add(lblSITES8, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 424, -1, -1));

        cmbComp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        getContentPane().add(cmbComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 188, 20));

        lblSITES12.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES12.setText("Company/Global Menu:");
        lblSITES12.setAlignmentX(0.5F);
        getContentPane().add(lblSITES12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 424, -1, -1));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnRun.setText(" Run ^^^");
        btnRun.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 392, 112, 20));

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setForeground(new java.awt.Color(153, 0, 0));
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES7.setText("   <   Custom API URL");
        lblSITES7.setAlignmentX(0.5F);
        getContentPane().add(lblSITES7, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 376, 112, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUser.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnUser.setText("Mobile/App User");
        btnUser.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });
        jPanel1.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 20, 112, 20));

        lblSITES3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES3.setText("User's Orders - last 7 days");
        lblSITES3.setToolTipText("");
        lblSITES3.setAlignmentX(0.5F);
        jPanel1.add(lblSITES3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 4, 152, -1));

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

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 20, 520, 56));

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
        jPanel1.add(btnSCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 52, 112, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 284, 848, 80));

        txtApi.setColumns(20);
        txtApi.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtApi.setLineWrap(true);
        txtApi.setRows(5);
        txtApi.setText("https://compassdidital.org/");
        txtApi.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtApi.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane5.setViewportView(txtApi);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 368, 716, 52));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">        
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (d1LastRow == DV1.getSelectedRow() || DV1.getRowCount() == 0) {
           return;
        }
        SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        GetBrands();
        d1LastRow = DV1.getSelectedRow(); 
    }//GEN-LAST:event_DV1MouseClicked
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
//            this.setTitle("Configurations / APIs >>> re-loading, please fluentWait ... ... ... ...");
//            this.repaint();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            LOAD_ENV();
            txtApi.setText(BaseAPI + "/");
//            setTitle("Configurations / APIs");
//            this.repaint();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            DefaultListModel model = new DefaultListModel();
            model.clear();
            jList_Orders.setModel(model);
            btnSCart.setEnabled(false);
        
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            app = cmbApp.getSelectedItem().toString();
            GetSites();
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if (d2LastRow == DV2.getSelectedRow() || DV2.getRowCount() == 0) {
           return;
        }
        d2LastRow = DV2.getSelectedRow();   
        BRAND = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 0));
        BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        btnLoc_Menus.setEnabled(false);
        GetBrandSector();
    }//GEN-LAST:event_DV2MouseClicked
    private void btnAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAppMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load " + app + " configurations, API(s)..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Application: " + app + " - configuration API(s):" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + appId); 
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/public/" + appId + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + appId + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());      
        }         
        txtLog.append("== /config/public/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        J += "\r\n=========  Private Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/" + appId); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/" + appId + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + appId + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         
        txtLog.append("== /config/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        J += "\r\n========= Multigroup API" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + appId + "?nocache=true&extended=true"); // ?nocache=true&extended=true
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/location/multigroup/" + appId  + "?nocache=true&extended=true"+ "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/multigroup/" + appId  + "?nocache=true&extended=true"+ " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }         
        txtLog.append("== /location/multigroup/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
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
    }//GEN-LAST:event_btnAppMouseClicked
    private void btnSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiteMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load " + SITE + " group API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Site: " + SITE + " - configuration API(s):" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        
        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + SiteID); 
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/public/" + SiteID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + SiteID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         
        txtLog.append("== /config/public/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        J += "\r\n=========  Private Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/" + SiteID); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/" + SiteID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + SiteID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         
        txtLog.append("== /config/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        J += "\r\n========= Location/Group API" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + SiteID); 
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
            J += BaseAPI + "/location/group/" + SiteID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/group/" + SiteID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== /location/group/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            String R = Func.SHOW_LOG_FILE(J, "json");
            if(!R.equals("OK")){
                txtLog.append(R + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } 
    }//GEN-LAST:event_btnSiteMouseClicked
    private void btnUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnitMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load " + "Utit" + " location API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String UNIT_ID = DV2.getValueAt(DV2.getSelectedRow(), 3).toString();
        String J = "==== Unit ID: " + UNIT_ID + " - configuration API(s):" + "\r\n";

        CloseableHttpClient httpclient = HttpClients.createDefault();
        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + UNIT_ID); 
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/public/" + UNIT_ID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + UNIT_ID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }         
        txtLog.append("== /config/public/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        J += "\r\n=========  Private Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/" + UNIT_ID); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/" + UNIT_ID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + UNIT_ID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }         
        txtLog.append("== /config/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        J += "\r\n========= Location API" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/" + UNIT_ID + "?extended=true&nocache=1"); 
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
            J += BaseAPI + "/location/" + UNIT_ID + "?extended=true&nocache=1" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/" + UNIT_ID + "?extended=true&nocache=1" + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("== /location/> " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
    }//GEN-LAST:event_btnUnitMouseClicked
    private void btnCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompMouseClicked
        int I = cmbGroup.getSelectedIndex();
        if(I < 0){ // =========== DEBUG
            txtLog.append("- Load Sector/Companies(Menus) ERROR: cmbGROUP.getSelectedIndex() < 0" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sector/Companies(Menus) API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Sector/Companies(Menus):" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();

        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector/" + GROUP_IDS.get(I) + "?expanded=false"); 
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
            J += BaseAPI + "/location/sector/" + GROUP_IDS.get(I) + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/sector/" + GROUP_IDS.get(I) + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== /location/sector/<ID> > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnCompMouseClicked
    private void btnBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrandMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load " + BRAND + " brand API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Site: " + SITE + ", Brand: " + BRAND + " - configuration API(s):" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + BrandID); // ?nocache=true&extended=true
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));               
            J += BaseAPI + "/config/public/" + BrandID  + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + BrandID  + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());      
        }         
        txtLog.append("== /config/public/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        J += "\r\n=========  Private Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/" + BrandID); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(response.getEntity()) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/" + BrandID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + BrandID  + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         
        txtLog.append("== /config/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        J += "\r\n========= Brand API" + "\r\n";
        MENU_IDS.clear();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/brand/" + BrandID + "?nocache=true&extended=true"); // ?extended=true
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
            JSONArray MENUS = json.getJSONArray("menus");
            for (int i = 0; i < MENUS.length(); i++) {
                JSONObject menu = MENUS.getJSONObject(i);
                    MENU_IDS.add(menu.getString("id"));
            }             
            J += BaseAPI + "/location/brand/" + BrandID + "?nocache=true&extended=true" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/brand/" + BrandID + "?nocache=true&extended=true" + " > " + ex.getMessage() + "\r\n";            
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== /location/brand/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        if(MENU_IDS.isEmpty()){
            btnLoc_Menus.setEnabled(false);
        }else{
            btnLoc_Menus.setEnabled(true);
        }

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnBrandMouseClicked
    private void btnGroupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGroupMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Group/Sector API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Group/Sector:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();

        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector?_provider=cdl"); 
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
            J += BaseAPI + "/location/sector?_provider=cdl" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/sector?_provider=cdl" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }
        txtLog.append("== /location/sector?_provider=cdl > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnGroupMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnCalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Group/Sector API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        String J = "==== Site: " + SITE + ", Brand: " + BRAND + " > Calendar:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();

        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/calendar/" + BrandID); 
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
            J += BaseAPI + "/calendar/"  + BrandID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/calendar/" + " > " + ex.getMessage() + "\r\n";              
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("== /calendar/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
 
        }        
    }//GEN-LAST:event_btnCalMouseClicked
    private void btnOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdersMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Brand > Orders API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Site: " + SITE + ", Brand: " + BRAND + " > Order:" + "\r\n";
        
        String From = new SimpleDateFormat( "yyyy-MM-dd 00:00:01").format(dtpDate.getDate());
        SimpleDateFormat StartFormat = new SimpleDateFormat( "yyyy-MM-dd 00:00:01");
        long from = 0;
        long to= 0;
        try {
            from = ((Date)StartFormat.parse(From)).getTime();
            to = from + (60*60*24*1000) - 2;
        }
        catch (ParseException ex) {
            Logger.getLogger(API_GUI.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
            
        CloseableHttpClient httpclient = HttpClients.createDefault();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/order/location/brand/" + BrandID + "?pickup_start=" + from + "&pickup_end=" + to); 
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
            J += BaseAPI + "/order/location/brand/" + BrandID + "\r\n" + json.toString(4);  
            
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/order/location/brand/" + BrandID + " > " + ex.getMessage() + "\r\n";                  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "order/location/brand/" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }         
    }//GEN-LAST:event_btnOrdersMouseClicked
    private void btnAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Announcements API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "========= Announcements:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/announcement/resource"); 
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
            J += BaseAPI + "/announcement/resource" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/announcement/resource" + " > " + ex.getMessage() + "\r\n";     
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "/announcement/resource" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }        
    }//GEN-LAST:event_btnAnMouseClicked
    private void cmbGroupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGroupItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            GetCompanies();
        }
    }//GEN-LAST:event_cmbGroupItemStateChanged
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Custom API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        String J = "==== Custom API:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String URL = txtApi.getText().trim();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(URL); 
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
            J += URL + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + URL + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load User API(s)..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== User API(s):" + "\r\n";
        userID = "";
        userTKN = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = Func.App_ID(cmbApp.getSelectedItem().toString(), env);
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         // ============ User
        try {   
            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + Realm); 
            httpget.setHeader("Authorization",  "Basic " + UserAuth);
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
        sw1.start();        // ============ Payment
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
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += "\r\n";
            J += BaseAPI + "/payment/method" + "?user_id=" + userID + "\r\n" + json.toString(4);
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
            String A;
            String D;

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
                    A = "";
                    if (is.getBoolean("accepted")) A = "  Accepted ";
                    if (is.getBoolean("in_progress")) A = "  In_Progress ";
                    if (is.getBoolean("ready")) A = "  Ready ";
                    SCART_IDS.add(or.getString("shoppingcart"));
                    ORDER_IDS.add(or.getString("id"));
                    LocDate = LocalDateTime.parse(or.getString("requested_date"), UTC_formatter).plusSeconds(offset.getTotalSeconds());
                    D = LocDate.format(LOC_formatter);
                    model.addElement(D + " " + A + 
                        " - " + or.getJSONObject("details").getString("order_type") +
                        ", ID: " + or.getJSONObject("details").getString("display_id") +
                        ", Destination: '" + or.getJSONObject("details").getString("destination") + "'");
                }    
            }
            jList_Orders.setModel(model);  
            J += "\r\n";
            J += BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1 + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/order/customer/" + userID + "?start=" + m7 + ";end=" + m1 + " > " + ex.getMessage() + "\r\n";  
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
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnUserMouseClicked
    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        int I = cmbComp.getSelectedIndex();
        if(I < 0){ // =========== DEBUG
            txtLog.append("- Load Company/Menus ERROR: cmbCOMP.getSelectedIndex() < 0" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Company > Menus API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Company " + cmbComp.getSelectedItem() + " > Menus:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/menu/company/" + COMP_IDS.get(I)); 
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
            J += BaseAPI + "/menu/company/"  + COMP_IDS.get(I) + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/menu/company/"  + COMP_IDS.get(I) + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "/menu/company/" + COMP_IDS.get(I) + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnMenuMouseClicked
    private void btnUpdatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatesMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- AP3 Resent Updates/Notifications API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== AP3 Resent Updates/Notifications:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/notification?realm=cdl&target=admin_panel"); 
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
            J += BaseAPI + "/notification?realm=cdl&target=admin_panel" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/notification?realm=cdl&target=admin_panel" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "/notification?realm=cdl&target=admin_panel" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
    }//GEN-LAST:event_btnUpdatesMouseClicked
    private void btnPromoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromoMouseClicked
        if(!btnPromo.isEnabled()){
            return;
        }
        //https://api.compassdigital.org/dev/promo/company/KElyDR7DvBFgX64AA5eMF6jBEM66XwcW8jzYReGGsLzJBLd0MDiNB0MqaQBvs27AEYrZDef8JMR3Y/location/group/LWg8oK2ovJFvg0EqOgEkfw7k3AdLzZFRDAyrOD2AF4oO0G8kmOHdMdmAwmdKFWeXQAOLQyUeZw?status=active
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Promo API..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Company: " + cmbComp.getSelectedItem().toString() + ", Site: " + SITE + " > Promo:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID); 
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
            J += BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID + " > " + ex.getMessage() + "\r\n";              
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnPromoMouseClicked
    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        SAVE_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    private void btnLoc_MenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoc_MenusMouseClicked
        if(!btnLoc_Menus.isEnabled()){
            return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Menu(s) API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        String J = "==== Site: " + SITE + ", Brand: " + BRAND + " > Menu(s):" + "\r\n";
        boolean DH = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        for(int i = 0; i < MENU_IDS.size(); i++){
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();        

            try {
                HttpGet httpget = new HttpGet(BaseAPI + "/menu/" + MENU_IDS.get(i) + "?extended=true&nocache=1"); 
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
                J += BaseAPI + "/menu/" + MENU_IDS.get(i) + "?extended=true&nocache=1" + "\r\n" + json.toString(4);
            } catch (IOException | JSONException ex) {
                DH = true;
                J += BaseAPI + "/menu/" + MENU_IDS.get(i) + "?extended=true&nocache=1" + " > " + ex.getMessage() + "\r\n";
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
                txtLog.setCaretPosition(txtLog.getDocument().getLength());     
            }   
            txtLog.append("== " + BaseAPI + "/menu/" + MENU_IDS.get(i) + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            sw1.reset(); 
            
            if(DH){
                if(sw1.isRunning()){
                    sw1.reset();
                }
                sw1.start();        

                try {
                    HttpGet httpget = new HttpGet(BaseAPI + "/menu/" + MENU_IDS.get(i)); 
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
                    J += BaseAPI + "/menu/" + MENU_IDS.get(i) + "\r\n" + json.toString(4);
                } catch (IOException | JSONException ex) {
                    J += BaseAPI + "/menu/" + MENU_IDS.get(i) + " > " + ex.getMessage() + "\r\n";
                    txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());   
                }   
                txtLog.append("== " + BaseAPI + "/menu/" + MENU_IDS.get(i) + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                sw1.reset();   
            }
        }   
        
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
    }//GEN-LAST:event_btnLoc_MenusMouseClicked
    private void jList_OrdersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList_OrdersValueChanged
        btnSCart.setEnabled(false);
        if(!evt.getValueIsAdjusting()) {
            btnSCart.setEnabled(true);
        }
    }//GEN-LAST:event_jList_OrdersValueChanged
    private void btnUserPermissionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserPermissionsMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- AP3 User, Permissions API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 

        String J = "==== AP3 User:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String UserAuth = Base64.getEncoder().encodeToString((txtAP3_ID.getText().trim() + ":" + txtAP3_PW.getText().trim()).getBytes());
        String User_ID = ""; 
        //String Realm = "6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5"; 
        String Realm = Func.Realm_ID("AP3");
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         // ============ AP3 User
        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + Realm); 
            httpget.setHeader("Authorization",  "Basic " + UserAuth);
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
            //J += "\r\n";            
            User_ID = json.getString("user");
            userTKN = json.getString("token");
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/user/auth?realm=" + Realm + " > " + ex.getMessage();            
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }   
        txtLog.append("== " + "/user/auth?realm="  + Realm + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         // ============ AP3 User Permissions
        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/user/" + User_ID + "/permissions" + "?nocache=1"); 
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
            J += "\r\n\r\n";
            J += BaseAPI + "/user/" + User_ID + "/permissions" + "?nocache=1" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/user/" + User_ID + "/permissions" + "?nocache=1" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== " + "/user/" + User_ID + "/permissions" + "?nocache=1" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();       // ============ AP3 User
        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN); // UserAuth // userTKN
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
            J += "\r\n\r\n";
            J += BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000" + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== " + "/user/realm/" + Realm + "?nocache=1&max=2000"+ " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnUserPermissionsMouseClicked
    private void btnEodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEodMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Site: " + SITE + " Sales Reporting API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        String J = "==== Site: " + SITE + " Sales Reporting - EOD:" + "\r\n";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String From = new SimpleDateFormat( "yyyy-MM-dd").format(dtpDate.getDate()); //"2020-11-15";
        String To = From;
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN); // 401 "Not authorized" ??
            //httpget.setHeader("Authorization",  "Basic " + AP3_TKN); // // 401 "Not authorized" ??
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
            J += BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To + "\r\n" + json.toString(4);
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== " + BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = Func.SHOW_LOG_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }    
    }//GEN-LAST:event_btnEodMouseClicked
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        jPanel1.addComponentListener(new ComponentListener() {
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
    private void btnSCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSCartMouseClicked
        if(btnSCart.isEnabled()){
            GetShoppingCartAndOrder();
        }
    }//GEN-LAST:event_btnSCartMouseClicked
    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">       
    private void Load_Form(){
        Load = true;
        cmbApp.addItem("Boost");
        cmbApp.addItem("Canteen");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Nourish");
        cmbApp.addItem("Rogers");
        cmbApp.addItem("StandardCognition");
        cmbApp.addItem("Tacit");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");
        cmbEnv.addItem("Development");
     
        cmbEnv.setSelectedIndex(2); // delevopment
        cmbApp.setSelectedIndex(0);
        
        Date now = new Date();
        dtpDate.setDateFormatString("EEE, dd-MMM-yyyy");
        dtpDate.setMaxSelectableDate(now);
        dtpDate.setDate(now);
        MENU_IDS = new ArrayList<>();
        
        Load = false;
        LOAD_ENV();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;   
        this.setTitle("Configurations / APIs");
    }
    private void LOAD_ENV(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://staging.adminpanel.compassdigital.org/";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "https://dev.adminpanel.compassdigital.org/";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "https://adminpanel.compassdigital.org/";
        }     

        txtApi.setText(BaseAPI + "/");
        DefaultListModel model = new DefaultListModel();
        model.clear();
        jList_Orders.setModel(model);
        btnSCart.setEnabled(false);
        
        Get_AP3_TKN();
        LOAD_CONFIG();
        
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        GetGroups(); // load 1st to be ready for selection by BrandSector
        GetSites();       
    }
    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
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
    private void GetSites() {
        d1LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();     
        
        appId = Func.App_ID(cmbApp.getSelectedItem().toString(), env);

        String[] SitesColumnsName = {"Site","Platform","Country","Id"}; 
        DefaultTableModel SitesModel = new DefaultTableModel();
        SitesModel.setColumnIdentifiers(SitesColumnsName);
        DV1.setModel(SitesModel);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV1.getModel());
        DV1.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);  
        sorter.setSortable(0, false);         
                  
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + appId);         
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + response.getStatusLine().getStatusCode() + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            
            String site;
            String country;
            String id;
            JSONObject addresses;
            JSONObject meta;

            JSONArray Groups = json.getJSONArray("groups");
            for (int i = 0; i < Groups.length(); i++) {
                site = "";
                country = "null";
                id = "null";
                addresses = null;
                meta = null;
                platform = "DH";
                JSONObject object = Groups.getJSONObject(i);
                if(object.has("name")){
                    site = object.getString("name");   
                } 
                if(object.has("id")){
                    id = object.getString("id");
                } 
                if(object.has("meta")){
                    meta = object.getJSONObject("meta");
                    if (meta.has("migrated") && meta.getBoolean("migrated")){
                        platform = "CDL migrated";
                    }
                }              
                if (id.length() > 50) {
                    platform = "CDL";
                } 

                if(object.has("address")){
                    addresses = object.getJSONObject("address");
                }  
                if(addresses != null && addresses.has("country")){
                    country = addresses.getString("country");   
                }
                SitesModel.addRow(new Object[]{site, platform, country, id});
            }
            DV1.setModel(SitesModel);
            DV1.setDefaultEditor(Object.class, null);
            DV1.getColumnModel().getColumn(0).setPreferredWidth(250);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(70);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(50);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(400);
            
            sorter.setSortable(0, true); 
            sorter.sort();            
   
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }         
        finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        }
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        if (DV1.getRowCount() > 0) {
            DV1.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(SITE.trim())) {
                for(int row = 0; row < DV1.getRowCount(); row++) {
                    if(DV1.getValueAt(row, 0).equals(SITE)){
                        DV1.changeSelection(row, 0, false, false);
                        break;
                    }
                }
            }
            SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
            SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
            GetBrands();
        }
        lblSITES.setText(app + " Sites (" + DV1.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetBrands() {
        d2LastRow = -1;
        d1LastRow = DV1.getSelectedRow();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Brands ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         
        
        String[] BrandsColumnsName = {"Station","Location","Brand Id", "Unit ID"}; 
        DefaultTableModel BrandsModel = new DefaultTableModel();
        BrandsModel.setColumnIdentifiers(BrandsColumnsName);
        DV2.setModel(BrandsModel);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV2.getModel());
        DV2.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);  
        sorter.setSortable(0, false);         
       
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + DV1.getValueAt(DV1.getSelectedRow(), 3) + "?extended=true&nocache=1"); 
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            JSONArray Location = json.getJSONArray("locations");
            JSONArray brands = null;
            
            String brand;
            String location;
            String id;
            String unit_id;
            if (Location != null) {
                for (Object l : Location) {
                    brand = "";
                    location = "";
                    id = "";
                    unit_id = "";
                    JSONObject loc = (JSONObject) l;
                    if (loc.has("brands")) {
                        brands = loc.getJSONArray("brands");
                        for (Object b : brands) {
                            JSONObject br = (JSONObject) b;
                            brand = br.getString("name");                            
                            if (!br.isNull("location_description")) {
                                location = br.getString("location_description");
                            }
                            id = br.getString("id");
                            unit_id = loc.getString("id");
                            BrandsModel.addRow(new Object[]{brand, location, id, unit_id});
                        }
                    }
                }
            }
            DV2.setModel(BrandsModel);    
            DV2.setDefaultEditor(Object.class, null);
            DV2.getColumnModel().getColumn(0).setPreferredWidth(140);
            DV2.getColumnModel().getColumn(1).setPreferredWidth(140);
            DV2.getColumnModel().getColumn(2).setPreferredWidth(80);
            
            sorter.setSortable(0, true); 
            sorter.sort();            
               
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }         
        finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        } 
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
   
        if (DV2.getRowCount() > 0) {
            DV2.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(BRAND.trim())) {
                for(int row = 0; row < DV2.getRowCount(); row++) {
                    if(DV2.getValueAt(row, 0).equals(BRAND)){
                        DV2.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
            BRAND = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 0));
            BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        } else {
            BrandID = "null";
            BRAND = "?";
        }

        d2LastRow = DV2.getSelectedRow();        
        lblBRANDS.setText("Selected Site Brands (" + DV2.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        
        GetBrandSector();
    }
    private void GetGroups() {  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Groups/Sector ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        cmbGroup.removeAllItems();
        GROUP_IDS = new ArrayList<>();
        
        Load = true;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector?_provider=cdl"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            JSONArray Sectors = json.getJSONArray("sectors");           
            String S_NAME = "";
            T_Index = -1;
            for (int i = 0; i < Sectors.length(); i++) {
                S_NAME = Sectors.getJSONObject(i).getString("name");
                cmbGroup.addItem(S_NAME);
                GROUP_IDS.add(Sectors.getJSONObject(i).getString("id"));
            }
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
                txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            }
        } 
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        Load = false;  
    }
    private void GetBrandSector() {  
        txtLog.append("- Get Brand's Group/Sector" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(DV2.getRowCount()< 1){
            txtLog.append("==== No Brands" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            return;
        }
        BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        GroupID = "";
        CompanyID = "";
        int GroupIndex = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();        
     
            HttpGet httpget = new HttpGet(BaseAPI + "/location/brand/" + BrandID + "?extended=true&nocache=1"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));        
            if(json.has("sector")){
                GroupID = json.getString("sector");
                if(!GroupID.isEmpty()){
                    for (int i = 0; i < GROUP_IDS.size(); i++) {
                        if(GROUP_IDS.get(i).equals(GroupID)){
                            GroupIndex = i;
                        }
                    }
                }   
            } else{
                txtLog.append("- Sector ID not Found in this Brand API" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
            if(json.has("company")){
                CompanyID = json.getString("company");
            } else{
                txtLog.append("- Company ID not Found in this Brand API" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
                txtLog.setCaretPosition(txtLog.getDocument().getLength());  
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            }
        } 
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset(); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));       
        
        Load = true;
        if(!GroupID.equals("")){
            cmbGroup.setSelectedIndex(GroupIndex);
        }else{
            if(cmbGroup.getItemCount() > 0){
                cmbGroup.setSelectedIndex(0);
            }
        }
        Load = false;
        
        GetCompanies();    // Load Brans Companies List after Brand's Gropu/Sector selected
        GetBrandCompany(); // after Brand's Gropu/Sector selected
    } 
    private void GetCompanies() {  
        int I = cmbGroup.getSelectedIndex();
        if(I < 0){ // =========== DEBUG
            txtLog.append("- Load Sector/Companies(Menus) ERROR: cmbGROUP.getSelectedIndex() < 0" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sector/Companies(Menus) ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            cmbComp.removeAllItems();
            COMP_IDS = new ArrayList<>();
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();        
     
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector/" + GROUP_IDS.get(I) + "?expanded=false"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_TKN);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                String Msg = response.getStatusLine().getReasonPhrase();
                if (status >= 200 && status < 300) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + Msg);
                }
            };
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            JSONArray Sectors = json.getJSONArray("companies");           
            String S_NAME = "";
            T_Index = -1;
            for (int i = 0; i < Sectors.length(); i++) {
                S_NAME = Sectors.getJSONObject(i).getString("name");
                if(!S_NAME.isEmpty()) {
                    cmbComp.addItem(S_NAME);
                    COMP_IDS.add(Sectors.getJSONObject(i).getString("id"));
                }
            }
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());    
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            }
        } 
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
    }
    private void GetBrandCompany(){ // after Brand's Group/Sector slected
        txtLog.append("- Get Brand's Company/Clobal Menu" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        int CompanyIndex = -1;
        try{
        if(!CompanyID.isEmpty()){
            for (int i = 0; i < COMP_IDS.size(); i++) {
                    if(COMP_IDS.get(i).equals(CompanyID)){
                        CompanyIndex = i;
                    }
                }
            }  
            if(!CompanyID.equals("")){
                cmbComp.setSelectedIndex(CompanyIndex);
            }else{
                if(cmbComp.getItemCount() > 0){
                    cmbComp.setSelectedIndex(0);
                }
            }
        } catch (Exception ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }
    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'API' AND [env] = '" + env + "'";
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
                c = C.substring(C.indexOf("url:")); c = c.substring(0, c.indexOf("\r\n")).trim(); url = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("GROUP:")); c = c.substring(0, c.indexOf("\r\n")).trim(); GROUP = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("GL_MENU:")); c = c.substring(0, c.indexOf("\r\n")).trim(); GL_MENU = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("SITE:")); c = c.substring(0, c.indexOf("\r\n")).trim(); SITE = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("BRAND:")); c = c.substring(0, c.indexOf("\r\n")).trim(); BRAND = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("COUNTRY:")); c = c.substring(0, c.indexOf("\r\n")).trim(); COUNTRY = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("txtMobile_ID:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_ID.setText(c.substring(c.indexOf(" ")).trim());
                c = C.substring(C.indexOf("txtMobile_PW:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_PW.setText(c.substring(c.indexOf(" ")).trim());
                c = C.substring(C.indexOf("txtAP3_ID:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtAP3_ID.setText(c.substring(c.indexOf(" ")).trim());
                c = C.substring(C.indexOf("txtAP3_PW:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtAP3_PW.setText(c.substring(c.indexOf(" ")).trim());

                CONFIG = true;
                txtLog.append("=== LOAD_CONFIG > OK" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } else {
                CONFIG = false;
                txtLog.append("=== WEB / AP3, User: " + A.A.UserID + ", Env: " + env + " > No saved Configuration Found" + "\r\n");
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
            if(DV1.getRowCount() > 0){
                _S = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
            }
            if(DV2.getRowCount() > 0){
                _B = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
            }
            C = "";
            C += "env: " + env + "\r\n";
            C += "app: " + cmbApp.getSelectedItem().toString() + "\r\n";
            C += "url: " + url + "\r\n";
            C += "GROUP: " + cmbGroup.getSelectedItem().toString() + "\r\n";
            C += "GL_MENU: " + cmbComp.getSelectedItem().toString() + "\r\n";
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
            C += "COUNTRY: " + COUNTRY + "\r\n";
            
            C += "txtMobile_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "txtMobile_PW: " + txtMobile_PW.getText().trim()  + "\r\n";
            C += "txtAP3_ID: " + txtAP3_ID.getText()  + "\r\n";
            C += "txtAP3_PW: " + txtAP3_PW.getText() + "\r\n";            

        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'API' AND [env] = '" + env + "'";
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
            _insert.setString(1, A.A.UserID);
            _insert.setString(2, env);
            _insert.setString(3, "WEB");
            _insert.setString(4, "API");
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
       
    private void GetShoppingCartAndOrder(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Shopping Cart..." + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String J = "==== Shopping Cart and Order" + "\r\n";
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
    }                                     
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    private String HTML_Report_Path;
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    private boolean Load;
    private int d1LastRow = -1; 
    private int d2LastRow = -1; 
    private List<String> GROUP_IDS;
    private List<String> COMP_IDS; 
    private List<String> MENU_IDS;
    private List<String> ORDER_IDS; 
    private List<String> SCART_IDS; 
    private boolean CONFIG = false;
    private String C = "";
    private String AP3_TKN;
    private String userID;
    private String userTKN;
    private int T_Index;
    
    private final Stopwatch sw1 = Stopwatch.createUnstarted();
    private final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    private final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private String SQL = ""; 
    
    private String url = "";
    private String app = "";
    private String appId = "";
    private String env = "";
    private String SITE = "";
    private String SiteID = "";
    private String GROUP = "";
    private String BRAND = "";
    private String BrandID = "";
    private String CompanyID = "";
    private String GroupID = "";
    private String COUNTRY = "COUNTRY";
    private String GL_MENU = "TIM HORTONS";
    private String platform = "CDL";
    private String BaseAPI;
    private String TZone; 
    // </editor-fold>    

    // <editor-fold defaultstate="collapsed" desc="API(s)">
    private void API_config(){
		// 
	}
    private void API_config_pulic(){
                    // 
    }
//    private void API_config(){
//                     
//    }
//    private void API_config(){
//                     
//    }
//    private void API_config(){
//                     
//    }
//    private void API_config(){
//                     
//    }
//    private void API_config(){
//                     
//    }
//    private void API_config(){
//                     
//    }

    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="GUI Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JButton btnAn;
    private javax.swing.JButton btnApp;
    private javax.swing.JButton btnBrand;
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnComp;
    private javax.swing.JButton btnEod;
    private javax.swing.JButton btnGroup;
    private javax.swing.JButton btnLoc_Menus;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnOrders;
    private javax.swing.JButton btnPromo;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSCart;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JButton btnSite;
    private javax.swing.JButton btnUnit;
    private javax.swing.JButton btnUpdates;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnUserPermissions;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbComp;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JComboBox<String> cmbGroup;
    private com.toedter.calendar.JDateChooser dtpDate;
    private javax.swing.JList<String> jList_Orders;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblBRANDS;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JLabel lblSITES12;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES3;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES8;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JTextField txtAP3_ID;
    private javax.swing.JTextField txtAP3_PW;
    private javax.swing.JTextArea txtApi;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
