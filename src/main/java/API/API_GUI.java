package API;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.base.Stopwatch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingWorker;
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
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
        DV1.setOpaque(false);
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

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    protected String Realm = "";
    protected String Auth = "";    
    protected String NewID = "";
     
    protected String ADMIN_ID = "";
    protected String ADMIN_PW = "";
    protected String AP3_User_ID = "";
    protected String AP3_User_TKN = "";  
    
    protected String MOBILE_ID = "";
    protected String MOBILE_PW = "";
    protected String Mobile_User_ID = "";
    protected String Mobile_User_TKN = "";
    protected String Payment_TKN = "";
    protected String Card_Type = "";
    protected String Card_Last4 = "";
    protected String PProvider_Type = "";
    protected String Card_Name = "";
    
    protected String RUNNER_ID = "";
    protected String RUNNER_PW = "";
    protected String Bolter_User_ID = "";
    protected String Bolter_User_TKN = "";   

    private String HTML_Report_Path = "";
    private String Report_Date = "";
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    protected JSONObject json;
    protected String SCOPE = "";   
    
    private SwingWorker BW1; 
    private Instant run_start;
    protected String r_time = "";  
    private boolean Zip_Report = true;
    private boolean _Slack = false;
    private String Slack_Channel = "";
    private String Log = "";
    
    private boolean Load;
    private int d1LastRow = -1; 
    private int d2LastRow = -1; 

    private boolean CONFIG = false;

    private final Stopwatch sw1 = Stopwatch.createUnstarted();
    private final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    private final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private String SQL = ""; 
    

    private String url = "";
    protected String app = "";
    protected String AppID = "";
    protected String env = "";
    protected String platform = "CDL";
    protected String BaseAPI = "";
    protected String BODY = "";
    
    protected String SITE = "";
    protected String SiteID = "";
    
    protected String SECTOR = "";
    protected String SectorID = ""; 
    protected String BRAND = "";
    protected String BrandID = "";
    protected String UnitID = "";
    protected String CompanyID = "";
    protected String GL_MENU = "";
    
    protected String Bolter_Site_ID = "";  
    protected String Market_Brand_ID = ""; 

    protected String Menu_ID = "";
    protected String Category_ID;  
    protected String Item_ID; 
    protected String TimeSlotID = "";      
    protected String BrandIDS = "";  
    protected String ShoppingCart_ID = "";  
    protected String OrderID = "";  
    
    protected List<String> BolterBrandIDS; 

    protected List<String> SECTOR_IDS;
    protected List<String> COMP_IDS; 
    protected List<String> MENU_IDS;
    protected List<String> ORDER_IDS; 
    protected List<String> SCART_IDS; 
    protected List<String> CATEGORIES_IDS;   
    protected List<String> ITEMS_IDS;  
    protected List<String> TIMESLOTS_IDS; 
    
    protected List<String> NOTIFICATION_IDS; 
    protected List<String> ANNOUNCEMENT_IDS;

    
    protected int _t = 0; // Total
    protected int _p = 0; // Passed
    protected int _f = 0; // Failed
    protected int _w = 0; // Warn
    protected int _i = 0; // Info
    protected String t = "";   
    protected String EX = "";   
    protected String err = "";
    protected String Summary = "";    
    protected boolean FAIL = false;
    protected boolean FATAL_FAIL = false;
    protected String r_type = "";  
    
    protected int t_calls = 0;
    protected double t_min = 0;
    protected double t_max = 0;
    protected double t_avg = 0;
    protected double p_50 = 0;
    protected double p_90 = 0;  
    private Duration DD;
    private String Last_EX = "";
    private String Report_File = "";
    // </editor-fold>    

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">        
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (d1LastRow == DV1.getSelectedRow() || DV1.getRowCount() == 0) {
           return;
        }
        SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        GUI_Get_Brands();
        d1LastRow = DV1.getSelectedRow(); 
    }//GEN-LAST:event_DV1MouseClicked
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            GUI_Load_Env();
            txtApi.setText(BaseAPI + "/");
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            DefaultListModel Lmodel = new DefaultListModel();
            Lmodel.clear();
            jList_Orders.setModel(Lmodel);
            btnSCart.setEnabled(false); 
            app = cmbApp.getSelectedItem().toString();
            GUI_Get_Sites();
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
        GUI_Get_Brand_Sector();
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
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + AppID); 
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/public/" + AppID + "\r\n" + json.toString(4) + "\r\n";
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + AppID + " > " + ex.getMessage() + "\r\n";
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
            HttpGet httpget = new HttpGet(BaseAPI + "/config/" + AppID); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/config/" + AppID + "\r\n" + json.toString(4) + "\r\n";
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + AppID + " > " + ex.getMessage() + "\r\n";
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
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + AppID + "?nocache=true&extended=true"); // ?nocache=true&extended=true
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/location/multigroup/" + AppID  + "?nocache=true&extended=true"+ "\r\n" + json.toString(4) + "\r\n";
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/multigroup/" + AppID  + "?nocache=true&extended=true"+ " > " + ex.getMessage() + "\r\n";
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
            String R = A.Func.SHOW_FILE(J, "json");
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
        
        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            J += GUI_API_Get(BaseAPI + "/config/public/" + SiteID, "") + "\r\n"; 
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
            J += GUI_API_Get(BaseAPI + "/config/" + SiteID, "Bearer " + AP3_User_TKN) + "\r\n";             
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
            J += GUI_API_Get(BaseAPI + "/location/group/" + SiteID, "Bearer " + "") + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/group/" + SiteID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== /location/group/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            String R = A.Func.SHOW_FILE(J, "json");
            if(!R.equals("OK")){
                txtLog.append(R + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } 
    }//GEN-LAST:event_btnSiteMouseClicked
    private void btnUnitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnitMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load " + "Utit" + " location API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        UnitID = DV2.getValueAt(DV2.getSelectedRow(), 3).toString();
        String J = "==== Unit ID: " + UnitID + " - configuration API(s):" + "\r\n";

        J += "\r\n========= Public Configuration:" + "\r\n";
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
 
        try {
            J += GUI_API_Get(BaseAPI + "/config/public/" + UnitID, "") + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/public/" + UnitID + " > " + ex.getMessage() + "\r\n";
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
            J += GUI_API_Get(BaseAPI + "/config/" + UnitID, "Bearer " + AP3_User_TKN) + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/config/" + UnitID + " > " + ex.getMessage() + "\r\n";
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
            J += GUI_API_Get(BaseAPI + "/location/" + UnitID + "?extended=true&nocache=1", "") + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/" + UnitID + "?extended=true&nocache=1" + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        
        txtLog.append("== /location/> " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/location/sector/" + SECTOR_IDS.get(I) + "?expanded=false", "Bearer " + AP3_User_TKN) + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/sector/" + SECTOR_IDS.get(I) + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   

        txtLog.append("== /location/sector/<ID> > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
            J += GUI_API_Get(BaseAPI + "/config/public/" + BrandID, "") + "\r\n";             
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
            J += GUI_API_Get(BaseAPI + "/config/" + BrandID, "Bearer " + AP3_User_TKN) + "\r\n";             
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
            HttpGet httpget = new HttpGet(BaseAPI + "/location/brand/" + BrandID + "?nocache=true&extended=true"); 
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            JSONArray MENUS = json.getJSONArray("menus");
            for (int i = 0; i < MENUS.length(); i++) {
                JSONObject menu = MENUS.getJSONObject(i);
                    MENU_IDS.add(menu.getString("id"));
            }             
            J += BaseAPI + "/location/brand/" + BrandID + "?nocache=true&extended=true" + "\r\n" + json.toString(4) + "\r\n";
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
        String R = A.Func.SHOW_FILE(J, "json");
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
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "", "Bearer " + AP3_User_TKN) + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/location/sector?_provider=cdl" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   

        txtLog.append("== /location/sector?_provider=cdl > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnGroupMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
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
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/calendar/" + BrandID, "Bearer " + AP3_User_TKN) + "\r\n";             
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/calendar/" + " > " + ex.getMessage() + "\r\n";              
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== /calendar/ > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
            // Logger.getLogger(API_GUI.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
            
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/order/location/brand/" + BrandID + "?pickup_start=" + from + "&pickup_end=" + to, "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException ex) {
            J += BaseAPI + "/order/location/brand/" + BrandID + " > " + ex.getMessage() + "\r\n";                  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   

        txtLog.append("== " + BaseAPI + "order/location/brand/" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/announcement/resource/", "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/announcement/resource" + " > " + ex.getMessage() + "\r\n";     
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   

        txtLog.append("== " + BaseAPI + "/announcement/resource" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }        
    }//GEN-LAST:event_btnAnMouseClicked
    private void cmbGroupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGroupItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            GUI_Get_Companies();
        }
    }//GEN-LAST:event_cmbGroupItemStateChanged
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Custom API..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        String J = "==== Custom API:" + "\r\n";
        String URL = txtApi.getText().trim();
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(URL, "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        txtLog.append("== " + URL + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        Mobile_User_ID = "";
        Mobile_User_TKN = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = A.Func.Realm_ID(app, env);
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();         // ============ Mobile User Authentication
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/user/auth?realm=" + Realm + "\r\n" + json.toString(4) + "\r\n";
            
            Mobile_User_ID = json.getString("user");
            Mobile_User_TKN = json.getString("token");
            
        } catch (IOException | JSONException ex) {
            txtLog.append(" > " + J); 
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== " + BaseAPI + "/user/auth?realm="  + Realm + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
        
        if(Mobile_User_ID.isEmpty()){
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        // ============ Mobile User Payment
        try { 
            J += GUI_API_Get(BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, "Bearer " + Mobile_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/payment/method" + "?user_id=" + AP3_User_ID + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        txtLog.append("== " + BaseAPI + "/payment/method" + "?user_id=" + AP3_User_ID + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        // ============ Mobile User Orders
        long m1 = System.currentTimeMillis();                     // 1605286535799
        long m7 = System.currentTimeMillis() - (60*60*24*7*1000); // 1604681735799

        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1); 
            httpget.setHeader("Authorization",  "Bearer " + Mobile_User_TKN);
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
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
            J += BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1 + "\r\n" + json.toString(4) + "\r\n";
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1 + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }   
        txtLog.append("== " + BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + ";end=" + m1 + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();          
        try {
            httpclient.close();
        } catch (IOException ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
            J += GUI_API_Get(BaseAPI + "/menu/company/" + COMP_IDS.get(I), "Bearer " + AP3_User_TKN) + "\r\n";                        
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
        String R = A.Func.SHOW_FILE(J, "json");
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
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/notification?realm=cdl&target=admin_panel", "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/notification?realm=cdl&target=admin_panel" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }   
        txtLog.append("== " + BaseAPI + "/notification?realm=cdl&target=admin_panel" + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID, "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID + " > " + ex.getMessage() + "\r\n";              
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        txtLog.append("== " + BaseAPI + "/promo/company/" + COMP_IDS.get(cmbComp.getSelectedIndex()) + "/location/group/" + SiteID + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
    }//GEN-LAST:event_btnPromoMouseClicked
    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        GUI_Save_CONFIG();
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
        for(int i = 0; i < MENU_IDS.size(); i++){
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();        

            try {
                J += GUI_API_Get(BaseAPI + "/menu/" + MENU_IDS.get(i) + "?extended=true&nocache=1", "") + "\r\n";                        
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
                    J += GUI_API_Get(BaseAPI + "/menu/" + MENU_IDS.get(i), "") + "\r\n";                        
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

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        String Realm = A.Func.Realm_ID("AP3", env); //"6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5";
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/user/auth?realm=" + Realm + "\r\n" + json.toString(4) + "\r\n";            
            User_ID = json.getString("user");
            Mobile_User_TKN = json.getString("token");
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/user/auth?realm=" + Realm + " > " + ex.getMessage() + "\r\n";            
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
            J += GUI_API_Get(BaseAPI + "/user/" + User_ID + "/permissions" + "?nocache=1", "Bearer " + AP3_User_TKN) + "\r\n";                        
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
            J += GUI_API_Get(BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000", "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/user/realm/" + Realm + "?nocache=1&max=2000" + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }   
        txtLog.append("== " + "/user/realm/" + Realm + "?nocache=1&max=2000"+ " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();        

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
        String From = new SimpleDateFormat( "yyyy-MM-dd").format(dtpDate.getDate()); //"2020-11-15";
        String To = From;
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        try {
            J += GUI_API_Get(BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To, "Bearer " + AP3_User_TKN) + "\r\n";                        
        } catch (IOException | JSONException ex) {
            J += BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To + " > " + ex.getMessage() + "\r\n";  
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }   
        txtLog.append("== " + BaseAPI + "/report/eod/group/" + SiteID + "?start=" + From + "&end=" + To + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        String R = A.Func.SHOW_FILE(J, "json");
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
//        MENU_IDS = new ArrayList<>();
//        BolterBrandIDS = new ArrayList<>();
        
        Load = false;
        GUI_Load_Env();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;   
        this.setTitle("Configurations / APIs");
    }
    private void GUI_Load_Env(){
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
        GUI_Load_CONFIG();
        
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        GUI_Get_Groups(); // load 1st to be ready for selection by BrandSector
        GUI_Get_Sites();       
    }
    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM[dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            AP3_User_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Get_Sites() {
        d1LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();     
        
        AppID = A.Func.App_ID(cmbApp.getSelectedItem().toString(), env);

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
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + AppID);         
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
            json = new JSONObject(responseBody);
            
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
                JSONObject group = Groups.getJSONObject(i);
                if(group.has("name")){
                    site = group.getString("name");   
                } 
                if(group.has("id")){
                    id = group.getString("id");
                } 
                if(group.has("meta")){
                    meta = group.getJSONObject("meta");
                    if (meta.has("migrated") && meta.getBoolean("migrated")){
                        platform = "CDL migrated";
                    }
                }              
                if (id.length() > 50) {
                    platform = "CDL";
                } 

                if(group.has("address")){
                    addresses = group.getJSONObject("address");
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
            GUI_Get_Brands();
        }
        lblSITES.setText(app + " Sites (" + DV1.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Get_Brands() {
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
            json = new JSONObject(responseBody);
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
        
        GUI_Get_Brand_Sector();
    }
    private void GUI_Get_Groups() {  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Groups/Sector ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        cmbGroup.removeAllItems();
        SECTOR_IDS = new ArrayList<>();
        
        Load = true;
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector?_provider=cdl"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
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
            json = new JSONObject(responseBody);
            JSONArray Sectors = json.getJSONArray("sectors");           
            String S_NAME = "";
            for (int i = 0; i < Sectors.length(); i++) {
                S_NAME = Sectors.getJSONObject(i).getString("name");
                cmbGroup.addItem(S_NAME);
                SECTOR_IDS.add(Sectors.getJSONObject(i).getString("id"));
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
    private void GUI_Get_Brand_Sector() {  
        txtLog.append("- Get Brand's Group/Sector" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(DV2.getRowCount()< 1){
            txtLog.append("==== No Brands" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            return;
        }
        BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        SectorID = "";
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
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));        
            if(json.has("sector")){
                SectorID = json.getString("sector");
                if(!SectorID.isEmpty()){
                    for (int i = 0; i < SECTOR_IDS.size(); i++) {
                        if(SECTOR_IDS.get(i).equals(SectorID)){
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
        if(!SectorID.equals("")){
            cmbGroup.setSelectedIndex(GroupIndex);
        }else{
            if(cmbGroup.getItemCount() > 0){
                cmbGroup.setSelectedIndex(0);
            }
        }
        Load = false;
        
        GUI_Get_Companies();    // Load Brans Companies List after Brand's Gropu/Sector selected
        GUI_Get_Brand_Company(); // after Brand's Gropu/Sector selected
    } 
    private void GUI_Get_Companies() {  
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
     
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector/" + SECTOR_IDS.get(I) + "?expanded=false"); 
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
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
            json = new JSONObject(responseBody);
            JSONArray Sectors = json.getJSONArray("companies");           
            String S_NAME = "";
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
    private void GUI_Get_Brand_Company(){ // after Brand's Group/Sector slected
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
    private void GUI_Load_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String C = "";
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
        String[] lines = C.split(System.getProperty("line.separator"));  
        String value;            
        try{       
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;
                if(l.contains("url: ")) url = value;
                if(l.contains("SECTOR: ")) SECTOR  = value;
                if(l.contains("GL_MENU: ")) GL_MENU = value;
                if(l.contains("SITE: ")) SITE = value;
                if(l.contains("BRAND: ")) BRAND = value;
                if(l.contains("MOBILE_ID: ")) txtMobile_ID.setText(value);
                if(l.contains("MOBILE_PW: ")) txtMobile_PW.setText(value);
                if(l.contains("ADMIN_ID: ")) txtAP3_ID.setText(value);
                if(l.contains("ADMIN_PW: ")) txtAP3_PW.setText(value);             
            }             
            CONFIG = true;
            txtLog.append("=== LOAD_CONFIG > OK" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } catch (Exception ex) {
            CONFIG = false;
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Save_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String C = "";
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
            C += "SECTOR: " + cmbGroup.getSelectedItem().toString() + "\r\n";
            C += "GL_MENU: " + cmbComp.getSelectedItem().toString() + "\r\n";
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
            
            C += "MOBILE_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "MOBILE_PW: " + txtMobile_PW.getText().trim()  + "\r\n";
            C += "ADMIN_ID: " + txtAP3_ID.getText()  + "\r\n";
            C += "ADMIN_PW: " + txtAP3_PW.getText() + "\r\n";            

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
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
            
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/shoppingcart/" + CartID + "\r\n" + json.toString(4) + "\r\n";
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
            httpget.setHeader("Authorization",  "Bearer " + AP3_User_TKN);
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/order/" + OrderID + "\r\n" + json.toString(4) + "\r\n";
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
        String R = A.Func.SHOW_FILE(J, "json");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
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
            json = new JSONObject(httpclient.execute(httpget, responseHandler));
            AJ += EndPoint + "\r\n" + json.toString(4) + "\r\n";
        }
        return AJ;
    }
    // </editor-fold>  

    //<editor-fold defaultstate="collapsed" desc="Extend HTML Report Methods">
    protected void Extent_Report_Config() throws IOException{
        HTML_Report_Path = System.getProperty("user.home") + File.separator + "Desktop";
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + "API_" + env + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);
        
        HtmlReport.setSystemInfo("Application", "API(s)");
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID); 
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        HtmlReport.setReportUsesManualConfiguration(true); // DEBUG - steps duration time incorrect
        
        HtmlReporter.config().setDocumentTitle("JTT API Automation Report");
        //HtmlReporter.config().setTheme(Theme.DARK);               
        HtmlReporter.config().setTheme(Theme.STANDARD);               
   }    
    protected void Log_Html_Result(String RES, String Test_Description, ExtentTest Test)  {
        switch (RES) {
            case "PASS":
                Test.log(Status.PASS, MarkupHelper.createLabel(Test_Description, ExtentColor.GREEN));
                break;
            case "FAIL":
                Test.log(Status.FAIL, MarkupHelper.createLabel(Test_Description, ExtentColor.RED));               
                break;
            case "INFO":
                Test.log(Status.INFO, MarkupHelper.createLabel(Test_Description, ExtentColor.BLUE));
                break;
            case "WARN":
                Test.log(Status.WARNING, MarkupHelper.createLabel(Test_Description, ExtentColor.YELLOW));
                break;
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Automated JOB">
    public String JOB_Run_Auto(String run_type, String config){
        run_start = Instant.now();
        Log  = "";
        String RES = "";
        
        RES = JOB_Load_CONFIG(config);
        if(RES.contains("ERROR")){
            Current_Log_Update(false, RES);
            return "JOB_Load_CONFIG > " + RES;
        }
        Current_Log_Update(false, RES);
        if(!RES.contains("OK")){
            return RES;
        }
        
        try{
            Current_Log_Update(false, "= Auto Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
            NewID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
            EX = "";
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
            _i = 0; // Info
            r_time = "";
            r_type = run_type;
            
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();
            LOG_START();   // ========================================================
            BW1_DoWork(false);
        }catch(Exception ex){
            return "ERROR > " + ex.getMessage();
        }
        return "OK > Job Started >> Please Monitor Reports...";
    }
    private String JOB_Load_CONFIG(String config){
        String[] lines = config.split("\n");
        String value;
        try{
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;
                if(l.contains("url: ")) url = value; 
                
                if(l.contains("SlackCh: ")) Slack_Channel = value;
                if(l.contains("_slack: ")) _Slack = Boolean.parseBoolean(value);
                if(l.contains("_zip_report: ")) Zip_Report = Boolean.parseBoolean(value);
                
                if(l.contains("SECTOR: ")) SECTOR  = value;
                if(l.contains("GL_MENU: ")) GL_MENU = value;
                if(l.contains("SITE: ")) SITE = value;
                if(l.contains("BRAND: ")) BRAND = value;
                if(l.contains("MOBILE_ID: ")) MOBILE_ID = value; 
                if(l.contains("MOBILE_PW: ")) MOBILE_PW = value; 
                if(l.contains("ADMIN_ID: ")) ADMIN_ID = value; 
                if(l.contains("ADMIN_PW: ")) ADMIN_PW = value;  
                if(l.contains("RUNNER_ID: ")) RUNNER_ID = value; 
                if(l.contains("RUNNER_PW: ")) RUNNER_PW = value; 
                if(l.contains("Market_Brand_ID: ")) Market_Brand_ID = value; 
            }
            CONFIG = true;
            switch (env) {
                case "ST":
                    BaseAPI = "https://api.compassdigital.org/staging";
                    break;
                case "DE":
                    BaseAPI = "https://api.compassdigital.org/dev";
                    break; 
                default:
                    BaseAPI = "https://api.compassdigital.org/v1";
                    break;
            }
            AppID = A.Func.App_ID(app, env);
            Current_Log_Update(true, "= JOB_Load_CONFIG > OK" + "\r\n");
            return "OK";
        } catch (Exception ex) {
            CONFIG = false;
            Current_Log_Update(true, "= JOB_Load_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            return "ERROR > " + ex.getMessage();
        }
    }
    protected void Current_Log_Update(boolean GUI, String Text){
        if(GUI){
            txtLog.append(Text);
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } else{
            Log += Text;
        }
    }
    
    private void Report(boolean Open_File){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Report_File = "";
        if ("".equals(Last_EX.trim()) || "None".equals(Last_EX.trim())){
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            txtLog.append("=== Report > Not Excel" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            return;
        }
        try {
            int col = 9;
            String Top_Row = Last_EX.substring(0, Last_EX.indexOf("\r\n"));
            String[] lines = Last_EX.substring(Last_EX.indexOf("\r\n") + 2).split(System.getProperty("line.separator"));
            int l = lines.length;
            String[][] Values = new String[l][col];
            int n = 1;
            for (int i = 0; i < l; i++) {
                String[] v = lines[i].split("\t");
                System.arraycopy(v, 0, Values[i], 0, v.length);
            }
            Report_File = A.Func.fExcel(l, col, Values, "API_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            txtLog.append("=== Report Excel file:\r\n" + Report_File + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (IOException ex) {
            txtLog.append("=== Report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LOG_UPDATE(String LOG){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
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
                    " WHERE [app] = 'API_" + env + "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "API_" + env);
            _update.setString(4, url);
            _update.setString(5, Summary + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")");
            _update.setInt(6, t_calls);
            _update.setDouble(7, t_min);
            _update.setDouble(8, t_avg);
            _update.setDouble(9, t_max);
            _update.setDouble(10, p_50);
            _update.setDouble(11, p_90);
            _update.setString(12, r_type);
            _update.setString(13, A.A.UserID);
            _update.setString(14, A.A.WsID);
            _update.setString(15, "N/A");
            _update.setString(16, LOG);
            _update.setString(17, "Scope: " + "All");
            _update.setString(18, EX);
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
            _insert.setString(1, LocalDateTime.now().format(Date_formatter));
            _insert.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _insert.setString(3, "API_" + env);
            _insert.setString(4, url);
            _insert.setString(5, "Running...");
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, r_type);
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
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
    private void BW1_DoWork(Boolean GUI) { 
        BW1 = new SwingWorker() {             
            @Override
            protected String doInBackground() throws Exception { 
                
                Extent_Report_Config();
                NewID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
                Execute();// ======================================================================= 
                
                DD = Duration.between(run_start, Instant.now());
                Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
                Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");
                
                EX = "API " + env + ". " +
                    " Steps: " + _t + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ", Info: " + _i + 
                        " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")" + "\r\n" +
                    "#\tTC\tTarget/Element/Input\tExpected/Output\tResult\tComment/Error\tResp\tTime\tJIRA\r\n"
                    + EX;
                
                Current_Log_Update(GUI, EX.replaceAll("\t", " > ") + "\r\n");
                
                BW1_Done(GUI); // ================================================================================

                if(_f > 0) {
                    return  "= Execution finished @" + LocalDateTime.now().format(A.A.Time_12_formatter) + " with " + _f + " FAIL(s)";
                }else{
                    return  "= Execution finished @" + LocalDateTime.now().format(A.A.Time_12_formatter);  
                } 
            }  
            @Override
            protected void done() {      
                try  { 
                    String statusMsg = (String) get(); 
                    txtLog.append("" + statusMsg + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                   
                    BW1 = null;
                }  
                catch (InterruptedException | ExecutionException ex)  { 
                    Current_Log_Update(GUI, "- BW1 ERROR: " + ex.getMessage() + "\r\n");
                    BW1_FAIL_LOG_UPDATE(ex.getMessage()); 
                } 
            } 
        }; 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        BW1.execute();  
    }
    private void BW1_FAIL_LOG_UPDATE(String Error){
        Summary = "BW1 - Failed: " + Error;
        DD = Duration.between(run_start, Instant.now());
        LOG_UPDATE("- BW1 ERROR: " + Error);
    } 
    private void BW1_Done(boolean GUI) throws Exception{
        DD = Duration.between(run_start, Instant.now());
        Last_EX = EX;
        Summary = "Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i;
        try {
            String t_rep = "";
            if (!"".equals(r_time.trim())) {
                double[] am0 = Arrays.stream(r_time.split(";")).mapToDouble(Double::parseDouble).toArray();
                if (am0.length > 0) {
                    Arrays.sort(am0);
                    double total = 0;
                    for(int i = 0; i < am0.length; i++){
                        total = total + am0[i];
                    }
                    t_calls = am0.length;
                    t_min = am0[0] / (double)1000;
                    t_avg = (total / am0.length) / (double)1000;
                    t_max = am0[am0.length - 1]  / (double)1000;
                    p_50 = A.Func.p50(am0) / (double)1000;
                    p_90 = A.Func.p90(am0) / (double)1000;
                    
                    t_rep += "= Total Calls: " + t_calls +
                            ", Response Times (sec) - Min: " + A.A.df.format(t_min) +
                            ", Avg: " + A.A.df.format(t_avg) +
                            ", Max: " + A.A.df.format(t_max) +
                            ", p50: " + A.A.df.format(p_50) +
                            ", p90: " + A.A.df.format(p_90);
                }
                Current_Log_Update(GUI, t_rep + "\r\n");
            }
        } catch(Exception ex){
            Current_Log_Update(GUI, "= LOG_UPDATE > Call Times parsing ERROR: " + ex.getMessage() + "\r\n");
        }
        
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= API(s) " + ", Environment: " + env + "\r\n");
        
        if(GUI){
            Log = txtLog.getText();
        }
        LOG_UPDATE(Log); // ========================================================
        HtmlReporter.config().setReportName("API(s)" + ", Env: " + env + 
                ", Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i +
                ". Resp(sec) - Min: " + A.A.df.format(t_min) +
                            ", Avg: " + A.A.df.format(t_avg) +
                            ", Max: " + A.A.df.format(t_max) +
                            ", p50: " + A.A.df.format(p_50) +
                            ", p90: " + A.A.df.format(p_90) + 
                ". Dur: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s");
        HtmlReport.flush();
        
        if(_Slack && !Slack_Channel.equals("N/A")){
            Report(false);
            String MSG = "API_" + env + " Excel Automation report - " + Report_Date +
                    "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: " + A.A.UserID + "\r\n" +    
                    "Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" + 
                    "Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i;
            
            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(Report_File, Slack_Channel, MSG));
            File ef = new File(Report_File);
            if(ef.exists() && !ef.isDirectory()) {
                ef.delete();
            }  
            String HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Click to Open";
            String HTML_Path = HtmlReporter.getFile().getAbsolutePath();
            if(Zip_Report){
                String Origin_HTML = HTML_Path;
                HTML_Path = A.Func.Zip_File(HTML_Path);
                File hf = new File(Origin_HTML);
                if(hf.exists() && !hf.isDirectory()) {
                    hf.delete();
                }
                HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Extract Here > open unzipped HTML file";
            }
            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(HTML_Path, Slack_Channel, HTML_Report_Msg));
            File hf = new File(HTML_Path);
            if(hf.exists() && !hf.isDirectory()) {
                hf.delete();
            }
        }
    }
    //</editor-fold>    
    
    private void Execute() throws Exception {
        if(true){
            SCOPE += "Mobile User ";
            ParentTest = HtmlReport.createTest("Mobile User"); 
            user_mobile BR = new API.user_mobile(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
            Mobile_User_ID = BR.Mobile_User_ID; 
            Mobile_User_TKN = BR.Mobile_User_TKN;
        }
        if(true){
            SCOPE += "Payment ";
            ParentTest = HtmlReport.createTest("Payment"); 
            payment BR = new API.payment(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
            PProvider_Type = BR.PProvider_Type;
            Card_Type = BR.Card_Type; 
            Card_Last4 = BR.Card_Last4;
            Card_Name = BR.Card_Name; 
            Payment_TKN = BR.Payment_TKN;
        } 
        if(true){
            SCOPE += "Bolter ";
            ParentTest = HtmlReport.createTest("Bolter"); 
            user_bolter BR = new API.user_bolter(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
            Bolter_User_ID = BR.Bolter_User_ID; 
            Bolter_User_TKN = BR.Bolter_User_TKN;
            Bolter_Site_ID = BR.Bolter_Site_ID;
            BolterBrandIDS =  BR.BolterBrandIDS;
        }
        if(true){
            SCOPE += "AP3 User ";
            ParentTest = HtmlReport.createTest("AP3 User"); 
            user_ap3 BR = new API.user_ap3(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
            AP3_User_ID = BR.AP3_User_ID; 
            AP3_User_TKN = BR.AP3_User_TKN;
        }      
        if(true){
            SCOPE += "Locations ";
            ParentTest = HtmlReport.createTest("Locations"); 
            locations BR = new API.locations(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
            AppID = BR.AppID; 
            SiteID = BR.SiteID; 
            UnitID = BR.UnitID;
            BrandID = BR.BrandID;
            BrandIDS = BR.BrandIDS;
            SectorID = BR.SectorID;
            CompanyID = BR.CompanyID;
            MENU_IDS = BR.MENU_IDS;
            Menu_ID = BR.Menu_ID;
        }        
        if(true){
            SCOPE += "Config ";
            ParentTest = HtmlReport.createTest("Config"); 
            config BR = new API.config(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        } 
        if(true){
            SCOPE += "Promo ";
            ParentTest = HtmlReport.createTest("Promo"); 
            promo BR = new API.promo(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }
        if(true){
            SCOPE += "Task ";
            ParentTest = HtmlReport.createTest("Task"); 
            task BR = new API.task(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }
        if(true){
            SCOPE += "Calendar ";
            ParentTest = HtmlReport.createTest("Calendar"); 
            calendar BR = new API.calendar(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }       
        if(true){
            SCOPE += "Menus ";
            ParentTest = HtmlReport.createTest("Global/Local Menus"); 
            menus BR = new API.menus(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;         
            Category_ID = BR.Category_ID;
            Item_ID = BR.Item_ID;
            TimeSlotID = BR.TimeSlotID; 
        }   
        if(true){
            SCOPE += "ShoppingCart ";
            ParentTest = HtmlReport.createTest("ShoppingCart"); 
            shoppingcart BR = new API.shoppingcart(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time; 
            ShoppingCart_ID = BR.ShoppingCart_ID;
        }          
        if(true){
            SCOPE += "Order ";
            ParentTest = HtmlReport.createTest("Order"); 
            order BR = new API.order(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }         
        
        if(true){
            SCOPE += "Reports ";
            ParentTest = HtmlReport.createTest("Reports"); 
            reports BR = new API.reports(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }            
        if(true){
            SCOPE += "Announcement ";
            ParentTest = HtmlReport.createTest("Announcement"); 
            announcement BR = new API.announcement(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }
        if(true){
            SCOPE += "Notification ";
            ParentTest = HtmlReport.createTest("Recent Updates/Notifications");      
            notification BR = new API.notification(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }
        if(true){
            SCOPE += "KDS ";
            ParentTest = HtmlReport.createTest("KDS");      
            kds BR = new API.kds(API_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; r_time += BR.r_time;  
        }        
  
    }
    protected void JOB_Api_Call(String NAME, String Method, String EndPoint, String AUTH, String BODY, int ExpStatus, ExtentTest ParentTest, String JIRA) {
        FAIL = false;
        String Result = "?";
        int status = 0;
        String R_Time = "";
        json = null;
        RequestSpecification request;
        request = RestAssured.given();
        if(!AUTH.isEmpty()){
            request.header("Authorization", AUTH);
        } 
        try {
            int i = 1;   
//for (i = 1; i < 4; i++){   // ========== Loop +2 times if 1st FAIL
                if(sw1.isRunning()){
                    sw1.reset();
                }
                _t++; sw1.start(); 
                Response response = null;
                switch (Method) {
                    case "GET":
                        if(BODY.equals("Bolter")){
                            request.header("From", "Bolter/1.0");
                        }
                        response = request.get(EndPoint);
                        break;
                    case "POST":
                        request.body(BODY);
                        response = request.post(EndPoint);
                        break;
                    case "PATCH":
                        request.body(BODY);
                        response = request.patch(EndPoint);
                        break;
                    case "DELETE":
                        request.body(BODY);
                        response = request.delete(EndPoint);
                        break;
                    case "PUT":
                        request.body(BODY);
                        response = request.put(EndPoint);
                        break; 
                    case "OPTIONS":
                        request.header("Accept", "*/*");
                        response = request.options(EndPoint);
                        break;  
                    default:
                        break;
                }
                Result = response.getStatusLine();
                status = response.getStatusCode();

                if(response.asString().startsWith("{") && response.asString().endsWith("}")) {
                    json = new JSONObject(response.asString());
                }
                R_Time = String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec";
                if (status == ExpStatus) {                                                 
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + Result + "\t" + "PASS" + "\t" + "Attempt #" + i + 
                    "\t" + R_Time + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                    Log_Html_Result("PASS", "Expected Status Code: " + ExpStatus + " > Actual: " + status + ", Result: " + Result + " (" + R_Time + ")" + 
                            "  Attempt #" + i, ParentTest.createNode(NAME + " > " + Method + ": " + EndPoint));
                    
//break; // =================  Do not attempt againg if passed
                    
                } else {
                    _f++; FAIL = true; 
                    EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + "Status Code: " + status + " > " + Result + "\t" + "FAIL" + "\t" + "Attempt #" + i +
                    "\t" + R_Time + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                    Log_Html_Result("FAIL", "Expected Status Code: " + ExpStatus + " > Actual: " + status + ", Result: " + Result + " (" + R_Time + ")" + 
                            "  Attempt #" + i, ParentTest.createNode(NAME + " > " + Method + ": " + EndPoint));
                }
//} // =======   3 times Loop if not good
            
        } catch(Exception ex){
            R_Time = String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec";
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + EndPoint + "\t" + Result + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + " (" + R_Time + ")", ParentTest.createNode(NAME + " > " + Method + ": " + EndPoint));
        } 
        r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
        sw1.reset();
    }

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
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
