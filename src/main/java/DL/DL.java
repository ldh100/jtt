/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DL;

import A.Func;
import static A.A.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.google.common.base.Stopwatch;
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.safari.SafariDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.ElementScrollBehavior;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.FluentWait;
public class DL extends javax.swing.JInternalFrame {
    public DL() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMetrics = new javax.swing.JLabel();
        lblDates = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        lblSITES4 = new javax.swing.JLabel();
        txtAdmin_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtAdmin_PW = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        nShowPage = new javax.swing.JSpinner();
        nWaitElement = new javax.swing.JSpinner();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES7 = new javax.swing.JLabel();
        lblSITES9 = new javax.swing.JLabel();
        lblSITES10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _login = new javax.swing.JCheckBox();
        _all_data = new javax.swing.JCheckBox();
        _metrics_selection = new javax.swing.JCheckBox();
        _metric_data = new javax.swing.JCheckBox();
        _filters = new javax.swing.JCheckBox();
        _4 = new javax.swing.JCheckBox();
        _password = new javax.swing.JCheckBox();
        _logout = new javax.swing.JCheckBox();
        _users = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cmbBrow = new javax.swing.JComboBox<>();
        btnRun = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFails = new javax.swing.JButton();
        btnExel = new javax.swing.JButton();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES11 = new javax.swing.JLabel();
        lblSITES13 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        _slack = new javax.swing.JCheckBox();
        _headless = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        DVU = new javax.swing.JTable();
        lblTestData = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Distiller Automatio Manager >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("DL"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
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

        lblMetrics.setText("Metrics");
        lblMetrics.setAlignmentX(0.5F);
        getContentPane().add(lblMetrics, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 360, -1));

        lblDates.setText("Date Ranges");
        lblDates.setName("lblDates"); // NOI18N
        getContentPane().add(lblDates, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 300, 280, -1));

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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 188, 428, 108));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 320, 428, 96));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 420, 428, 84));

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES4.setText("Admin ID:");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);
        getContentPane().add(lblSITES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 380, 120, -1));

        txtAdmin_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAdmin_ID.setText("App_User@?.?");
        getContentPane().add(txtAdmin_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 396, 216, -1));

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("Admin Password");
        lblSITES6.setAlignmentX(0.5F);
        getContentPane().add(lblSITES6, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 380, -1, -1));

        txtAdmin_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAdmin_PW.setText("password");
        getContentPane().add(txtAdmin_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 396, 184, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Wait (sec):"));

        nShowPage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nShowPage.setModel(new javax.swing.SpinnerNumberModel(0.2d, 0.2d, 2.0d, 0.2d));
        nShowPage.setAutoscrolls(true);
        nShowPage.setName("nShowPage"); // NOI18N

        nWaitElement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitElement.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 1.0d));
        nWaitElement.setName("nWaitElement"); // NOI18N

        nWaitLoad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitLoad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 0.0d, 60.0d, 5.0d));
        nWaitLoad.setName("nWaitLoad"); // NOI18N

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES7.setText("Show page:");
        lblSITES7.setAlignmentX(0.5F);

        lblSITES9.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES9.setText("Timeout:");
        lblSITES9.setAlignmentX(0.5F);

        lblSITES10.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES10.setText("Element exists:");
        lblSITES10.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSITES7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nShowPage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblSITES10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nWaitElement, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSITES9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nWaitLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nWaitElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nWaitLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nShowPage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 172, 416, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Scope"));
        jPanel1.setToolTipText("");
        jPanel1.setDoubleBuffered(false);
        jPanel1.setName("Scope"); // NOI18N

        _login.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _login.setSelected(true);
        _login.setText("Login ");
        _login.setEnabled(false);
        _login.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _login.setRequestFocusEnabled(false);

        _all_data.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _all_data.setText("Show all data rows");
        _all_data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _all_data.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _all_data.setRequestFocusEnabled(false);

        _metrics_selection.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _metrics_selection.setText("Metrics Selection");
        _metrics_selection.setContentAreaFilled(false);
        _metrics_selection.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _metrics_selection.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _metric_data.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _metric_data.setText("Metric Data");
        _metric_data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _metric_data.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _metric_data.setRequestFocusEnabled(false);

        _filters.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _filters.setText("Metric(s) Filters");
        _filters.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _filters.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _filters.setRequestFocusEnabled(false);

        _4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _4.setText("op4");
        _4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _4.setRequestFocusEnabled(false);

        _password.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _password.setText("Forgot Password");
        _password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _password.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _password.setRequestFocusEnabled(false);

        _logout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _logout.setText("User Logout");
        _logout.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _logout.setRequestFocusEnabled(false);

        _users.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _users.setText("QA Users Data Validation");
        _users.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _users.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _users.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_metrics_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_metric_data, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_filters, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_all_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(_users, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_all_data, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(_metrics_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_metric_data, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_filters, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_users, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 216, 412, 160));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbBrow.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(cmbBrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 32, 84, 20));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        jPanel3.add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 56, 84, 28));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        jPanel3.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 60, 84, 22));

        btnFails.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnFails.setText("Show Fails");
        btnFails.setEnabled(false);
        btnFails.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnFails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFailsMouseClicked(evt);
            }
        });
        jPanel3.add(btnFails, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 32, 84, 22));

        btnExel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExel.setText("Excel Rep");
        btnExel.setEnabled(false);
        btnExel.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnExel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExelMouseClicked(evt);
            }
        });
        jPanel3.add(btnExel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 84, 22));

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });
        jPanel3.add(btnSave_Opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 116, 22));

        lblSITES11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES11.setText("Browser:");
        lblSITES11.setAlignmentX(0.5F);
        jPanel3.add(lblSITES11, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 16, 72, 16));

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);
        jPanel3.add(lblSITES13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 16, 92, 16));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 32, 116, 20));

        _slack.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _slack.setText("Report to Slack");
        _slack.setToolTipText("");
        _slack.setRequestFocusEnabled(false);
        jPanel3.add(_slack, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 52, 100, 14));

        _headless.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _headless.setText("Headless <<<<");
        _headless.setToolTipText("");
        _headless.setRequestFocusEnabled(false);
        jPanel3.add(_headless, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 68, 100, 14));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 416, 416, 88));

        DVU.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DVU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DVU.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DVU.setCellSelectionEnabled(true);
        DVU.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DVU.setName("DV2"); // NOI18N
        DVU.setOpaque(false);
        DVU.setRowHeight(18);
        DVU.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(DVU);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 852, 152));

        lblTestData.setText("Test Data");
        lblTestData.setName("lblDates"); // NOI18N
        getContentPane().add(lblTestData, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 4, 820, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (wdLastRow == DV1.getSelectedRow() || DV1.getRowCount() == 0) {
           return;
        }

        METRIC = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        MetricID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        wdLastRow = DV1.getSelectedRow(); 
    }//GEN-LAST:event_DV1MouseClicked
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if(BW2 != null && !BW2.isCancelled()) BW2.cancel(true);
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if (d2LastRow == DV2.getSelectedRow()) {
           return;
        }
        d2LastRow = DV2.getSelectedRow();   
        DATE_RANGE = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 0));
        CatID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
    }//GEN-LAST:event_DV2MouseClicked
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
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        btnRun.setEnabled(false);
        btnFails.setEnabled(false);
        btnExel.setEnabled(false);
        //txtLog.setText("");
        txtLog.append("=== Execution started @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        WaitForElement = Math.round((double)nWaitElement.getValue() *1000);
        LoadTimeOut = (double)nWaitLoad.getValue() *1000;
        sleep = (double)nShowPage.getValue() *1000;
        EX = "";
        F = "";
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

        ALL_DATA = _all_data.isSelected();
        SCOPE = "";
        DL_UserID = txtAdmin_ID.getText();
        DL_UserPW = txtAdmin_PW.getText();
        
        if(DV1.getRowCount() > 0) {
            METRIC = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
        }
        if(DV2.getRowCount() > 0) {
            DATE_RANGE = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
        }

        if(_headless.isSelected()) {
            txtLog.append("=== Headless mode is selected - Browser is hidden" + "\r\n");
            txtLog.append("=== Please wait for report...\r\n");          
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        txtLog.append("=== Starting Web Driver..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        r_type = "ad-hoc";

        if(Driver()){
            txtLog.append("=== Web Driver Started in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            sw1.reset();

            LOG_START(); // ========================================================
            
            BW2_DoWork(
                // parameters?
            );
            try {
                Execute();
            }            
            catch (InterruptedException ex) {
                txtLog.append("Execute DL  " + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        }
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnFailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFailsMouseClicked
        if(!btnFails.isEnabled()) {return;}
        String R = Func.SHOW_LOG_FILE(F, "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnFailsMouseClicked
    private void btnExelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExelMouseClicked
        if(!btnExel.isEnabled()) {return;}
        btnExel.setEnabled(false);
        Report(true);
        btnExel.setEnabled(true);
    }//GEN-LAST:event_btnExelMouseClicked
    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        SAVE_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            LOAD_ENV();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void Load_Form(){
        Load = true;   
        
        cmbBrow.addItem("Chrome");  
        cmbBrow.addItem("Firefox"); 
        cmbBrow.addItem("Edge"); 
        if(WsOS.toLowerCase().contains("windows")){
            cmbBrow.addItem("IE11");             
        }
        if(WsOS.toLowerCase().contains("mac")){
            cmbBrow.addItem("Safari");             
        }
        cmbBrow.setSelectedIndex(0); // Chrome
        
        cmbEnv.addItem("Development");
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");         
        cmbEnv.setSelectedIndex(0); 
        

        LOAD_ENV();
        Load = false;
        CONFIG = false;   
        this.setTitle("Distiller Automation Manager");
    }
    private void BW2_DoWork(){
        BW2 = new SwingWorker() {             
            @Override
            protected String doInBackground() throws Exception { 
                while (true){
                    Toast_Msg = "";
                    Thread.sleep(1000);
                    try {
                        List<WebElement> ALERTS = d1.findElements(By.cssSelector("[role='alert']"));
                        if(ALERTS.size() > 0){
                            Toast_Msg = ALERTS.get(0).getAttribute("textContent");// .getText();
                            if(     Toast_Msg.toLowerCase().contains("successfully") || 
                                    Toast_Msg.toLowerCase().contains(" been updated") || 
                                    Toast_Msg.toLowerCase().contains(" been added") || 
                                    Toast_Msg.toLowerCase().contains(" been removed") ||
                                    Toast_Msg.toLowerCase().contains(" been reset") ||
                                    Toast_Msg.toLowerCase().contains(" saved")) {
                                _t++;
                                _p++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";                            
                            } else if(Toast_Msg.toLowerCase().contains("could not")|| 
                                    Toast_Msg.toLowerCase().contains("unable to save")|| 
                                    Toast_Msg.toLowerCase().contains("fail")) {
                                _t++;
                                _f++;
                                F += _t + " > FAIL - " + Toast_Msg + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            } else if(Toast_Msg.toLowerCase().contains("fix") || Toast_Msg.toLowerCase().contains("error")) {
                                _t++;
                                _w++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            } else {
                                _t++;
                                _w++;
                                //F += _t + " > WARN - " + tt + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            }
                            Thread.sleep(4000); //  pause till new alert expected ???? 
                        }
                    } catch (InterruptedException ex){ // Exception ex
                        System.out.println("BW2: " + "ex.getMessage()");
                    }
                }
            }
        }; 
        BW2.execute();  // executes the swingworker on worker thread   
    }
    private void Execute() throws InterruptedException{
        Instant dw_start = Instant.now();
        if (_login.isSelected()) { 
            SCOPE += "Login";
            EX += " - " + "\t" + " === Login " + "\t" + " ===== " + "\t" + " == Login Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_login.run();
            EX += " - " + "\t" + " === ^ Login " + "\t" + " ===== " + "\t" + " == ^ Login End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        if (_metrics_selection.isSelected()) { 
            SCOPE += ", Metrics Selection";  
            EX += " - " + "\t" + " === Metrics Selection" + "\t" + " ===== " + "\t" + " == Metrics Selection Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_metrics_selection.run();
            EX += " - " + "\t" + " === ^ Metrics Selection" + "\t" + " ===== " + "\t" + " == ^ Metrics Selection End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }  
        if (_metric_data.isSelected()) { 
            SCOPE += ", Metrics Data";  
            EX += " - " + "\t" + " === Metrics Data" + "\t" + " ===== " + "\t" + " == Metrics Data Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_metric_data.run();
            EX += " - " + "\t" + " === ^ Metrics Data" + "\t" + " ===== " + "\t" + " == ^ Metrics Data End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        if (_filters.isSelected()) { 
            SCOPE += ", Metrics Filters";  
            EX += " - " + "\t" + " === Metrics Filters" + "\t" + " ===== " + "\t" + " == Metrics Filters Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_filters.run();
            EX += " - " + "\t" + " === ^ Metrics Filters" + "\t" + " ===== " + "\t" + " == ^ Metrics Filters End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }        
        if (_users.isSelected()) { 
            SCOPE += ", Users";  
            EX += " - " + "\t" + " === Users - Data Access" + "\t" + " ===== " + "\t" + " == Users Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_users.run(DVU); // ====== pass QA Data from GUI DVU
            EX += " - " + "\t" + " === ^ Users - Data Access" + "\t" + " ===== " + "\t" + " == ^ Users End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }        

        // ============================== Last Blocks
        if (_logout.isSelected()) { 
            SCOPE += ", LogOut";
            EX += " - " + "\t" + " === Logout" + "\t" + " ===== " + "\t" + " == Logout Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_logout.run();
            EX += " - " + "\t" + " === ^ Logout" + "\t" + " ===== " + "\t" + " == ^ Logout End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        if (_password.isSelected()) { 
            SCOPE += ", Forgot PW";  
            EX += " - " + "\t" + " === Forgot PW" + "\t" + " ===== " + "\t" + " == Forgot PW Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_password.run();
            EX += " - " + "\t" + " === ^ Forgot PW" + "\t" + " ===== " + "\t" + " == ^ Forgot PW End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }  
        
                    
        if(_f > 0) {
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + " with " + _f + " FAIL(s)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }else{
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }         
        Done(dw_start);
    }
    private void Done(Instant dw_start){
        BW2.cancel(true); // ================================================
        Ver = "?";
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MMM_yyyy_hh_mma"));
        txtLog.append("========   " + "Execution step-by-step log..." + "   ========" + "\r\n");  
        txtLog.setCaretPosition(txtLog.getDocument().getLength());               
        EX = "DL " + env + " - v" + Ver + ", Browser: " + cmbBrow.getSelectedItem().toString() +
        " - Steps: " + _t + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ". Scope: " + SCOPE + "\r\n" +
         "#\tTC\tTarget/Element/Input\tExpected/Output\tResult\tComment/Error\tResp\tTime\tJIRA\r\n"
         + EX;
        txtLog.append("" + EX.replaceAll("\t", " > ") + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        Last_EX = EX;
        
        BW2 = null;
        try  { 
            if(d1 != null) {
                d1.quit(); 
            }
        }  
        catch (Exception ex)  { 
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } 
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

                    DecimalFormat df = new DecimalFormat("#.##");
                    t_rep += "=== Total Calls: " + t_calls + ", Response Times (sec) - Min: " + df.format(t_min) +
                                                                ", Avg: " + df.format(t_avg) +
                                                                ", Max: " + df.format(t_max) +
                                                                ", p50: " + df.format(p_50) +
                                                                ", p90: " + df.format(p_90);
                }
                txtLog.append("" + t_rep + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        } catch(Exception ex){
            txtLog.append("=== LOG_UPDATE > Call Times parsing ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
        btnRun.setEnabled(true);
        txtLog.append("=== " + Summary + "\r\n"); // Summary shown in EX top
        txtLog.append("=== Scope: " + SCOPE + "\r\n"); // SCOPE shown in EX top
        txtLog.append("=== Browser: " + cmbBrow.getSelectedItem().toString() + ", Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
  
        if(!"".equals(F.trim())){
            btnFails.setEnabled(true);
        } else{
            btnFails.setEnabled(false);
        }
        btnExel.setEnabled(true);
        
        LOG_UPDATE(); // ========================================================
        
        if(_slack.isSelected()){
            Report(false);
            String MSG = "DL_" + env + " Automation report - " + Report_Date  +  
                    "\r\n Machine: " + WsID + " OS: " + WsOS + ", User: *" + UserID + "*\r\n" +
                    "Browser: *" + cmbBrow.getSelectedItem().toString() + "*, Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" +        
                    "Scope: " + SCOPE + "\r\n" +
                    "Steps: " + _t + ", Passed: " + _p + ", *Failed: " + _f + "*, Warnings: " + _w;

            txtLog.append(Func.Send_File_with_Message_to_Slack(Report_File, "dl_automation", MSG + "\r\n"));
            File f = new File(Report_File);
            if(f.exists() && !f.isDirectory()) { 
                f.delete();
            }
        }
    }

    private boolean Driver() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            txtLog.append("=== CWD: " + CWD + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            
            if(WsOS.toLowerCase().contains("windows")){
                System.setProperty("webdriver.chrome.driver", CWD + "\\chromedriver.exe");                
                System.setProperty("webdriver.edge.driver", CWD + "\\msedgedriver.exe");  
                System.setProperty("webdriver.gecko.driver", CWD + "\\geckodriver.exe"); 
                System.setProperty("webdriver.ie.driver", CWD + "\\IEDriverServer.exe"); 
            }
            if(WsOS.toLowerCase().contains("mac")){
                System.out.println("******** " + CWD + "/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", CWD + "/chromedriver");  
               // System.setProperty("webdriver.chrome.driver", "/Users/prathyusha.deshpande/distilr/BrowserDriver/87/chromedriver");            
                System.setProperty("webdriver.edge.driver", CWD + "/msedgedriver");  
                System.setProperty("webdriver.gecko.driver", CWD + "/geckodriver");
                System.setProperty("webdriver.safari.driver", CWD + "/safaridriver");
            }
            switch (cmbBrow.getSelectedItem().toString()) {
                case "Chrome":
                        ChromeOptions chrome_op = new ChromeOptions();
                        //chrome_op.addExtensions(new File("/path/to/extension.crx"));
                        chrome_op.addArguments("--disable-infobars");
                        chrome_op.addArguments("--start-maximized");
            //            chrome_op.addArguments("--start-minimized");
            //            chrome_op.addArguments("enable-automation");
            //            chrome_op.addArguments("--no-sandbox");
            //            chrome_op.addArguments("--disable-extensions");
            //            chrome_op.addArguments("--dns-prefetch-disable");
            //            chrome_op.addArguments("--disable-gpu");
                        if(_headless.isSelected()){
                            chrome_op.addArguments("--headless");
                        }
                        chrome_op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        d1 = new ChromeDriver(chrome_op);
                    break;
                case "Edge":
//                    txtLog.append("=== Edge Driver:" + System.getProperty("webdriver.edge.driver") + "\r\n");
//                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                        EdgeDriverService edgeServise = EdgeDriverService.createDefaultService();
                        //edgeServise.SuppressInitialDiagnosticInformation = true;
//                        service.seVerboseLogging = false;
//                        service.UseSpecCompliantProtocol = false;
                        EdgeOptions edge_op = new EdgeOptions();
                       //edge_op.setPageLoadStrategy("normal");
                        edge_op.setCapability( "disable-infobars", true);
                        edge_op.setCapability( "disable-gpu", true);
                        edge_op.setCapability("useAutomationExtension", false);
//                                PageLoadStrategy = PageLoadStrategy.Default,
//                                UnhandledPromptBehavior = UnhandledPromptBehavior.Dismiss
                        if(_headless.isSelected()){
                            edge_op.setCapability( "headless", true);
                        }
                        
                        d1 = new EdgeDriver(edgeServise, edge_op);
                    break;
                case "Firefox":
                        FirefoxProfile profile = new FirefoxProfile();
                        profile.setPreference("network.proxy.no_proxies_on", "localhost");
                        profile.setPreference("javascript.enabled", true);

//                        DesiredCapabilities capabilities = DesiredCapabilities.;
//                        capabilities.setCapability("marionette", true);
//                        capabilities.setCapability(FirefoxDriver.PROFILE, profile);

                        FirefoxOptions ff_op = new FirefoxOptions();
                        //ff_op.merge(capabilities);
                        //ff_op.addPreference("browser.link.open_newwindow", 3);
                        //ff_op.addPreference("browser.link.open_newwindow.restriction", 0);

                        d1 = new FirefoxDriver(ff_op);
                    break;
                case "IE11":
                        InternetExplorerOptions ie_op = new InternetExplorerOptions();
                        ie_op.ignoreZoomSettings(); // Not necessarily in case 100% zoom.
                        ie_op.introduceFlakinessByIgnoringSecurityDomains(); // Necessary to skip protected  mode setup
                        ie_op.elementScrollTo(ElementScrollBehavior.BOTTOM);
                        ie_op.disableNativeEvents();
//                        var options = new InternetExplorerOptions
//                        {
//                                IgnoreZoomLevel = true,
//                                IntroduceInstabilityByIgnoringProtectedModeSettings = true,
//                                RequireWindowFocus = false,
//                                ElementScrollBehavior = InternetExplorerElementScrollBehavior.Top, // with botton click doesn't work
//                                EnsureCleanSession = true,
//                                //AcceptInsecureCertificates = true,
//                                EnablePersistentHover = true,
//                                UnhandledPromptBehavior = UnhandledPromptBehavior.Accept,
//                                EnableNativeEvents = false //  with true > click problem
//                        };
                        d1 = new InternetExplorerDriver(ie_op);
                    break;
                case "Safari":
                        //To do on MAC machine // =====================================
                        d1 = new SafariDriver();     
                    break;
            }

            d1.manage().window().maximize();
            d1.manage().deleteAllCookies(); // =================================
            
            d1.manage().timeouts().pageLoadTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().setScriptTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);
            loadTimeout = new FluentWait(d1).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
			.pollingEvery(Duration.ofMillis(200))  			
			.ignoring(NoSuchElementException.class);       // for load > progress
            
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return true;
        } catch (Exception ex) {
            txtLog.append("=== Web Driver > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return false;
        }   
    }
    private void LOAD_ENV(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://staging.member.distilr.io";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "https://dev.member.distilr.io";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "https://mpower.distilr.io/";
        }
        
        LOAD_CONFIG();
        //GET_DL_USER_TOKEN(false);
        GetDates();       
        GetMetrics(); 
        Get_S3_DL_Credentials();
        Get_S3_data(AWS_credentials);

    }
    private void Get_S3_DL_Credentials(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs1 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_A_Key_DL'");
            rs1.next();
            access_key = rs1.getString(1);
            ResultSet rs2 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_S_Key_DL'");
            rs2.next();
            secret_key = rs2.getString(1);
            conn.close();
            AWS_credentials = new BasicAWSCredentials(
                new String(Base64.getDecoder().decode(access_key)),
                new String(Base64.getDecoder().decode(secret_key))
            );  
        } catch (SQLException ex) {
            txtLog.append("= Get_S3_MOB_Credentials > " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }    
    private void Get_S3_data(AWSCredentials credentials){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load DL S3 data ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        String[] SitesColumnsName = {"username","metric","period","value","location_filters","item_filters","kpi","source"}; 
        DefaultTableModel TestDataModel = new DefaultTableModel();
        TestDataModel.setColumnIdentifiers(SitesColumnsName);
        DVU.setModel(TestDataModel);
        String BucketName = "distilr-data-qa"; ///fmp_source_qa_files/";
        try {
            BasicAWSCredentials awsCreds = new BasicAWSCredentials(access_key, secret_key);
            AmazonS3 s3client = AmazonS3ClientBuilder
                    .standard()
                    .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                    .withRegion(Regions.US_EAST_2)
                    .build();
            ListObjectsV2Result File_List = s3client.listObjectsV2(BucketName);
            File_List.getObjectSummaries().sort(Comparator.comparing(S3ObjectSummary::getLastModified)); 
            int LastFileIndex = File_List.getObjectSummaries().size() - 1;
            String File_Path = File_List.getObjectSummaries().get(LastFileIndex).getKey();
            lblTestData.setText("Test Data - from file:   " 
                    + File_Path + "  >  "
                    + File_List.getObjectSummaries().get(LastFileIndex).getLastModified());
            S3Object s3object = s3client.getObject(BucketName, File_Path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(s3object.getObjectContent()));
            String TestDataJson = "";
            String s = null;
            while ((s = reader.readLine()) != null) {
                TestDataJson += s;
            }   
            String username = "";

            String metric = "";
            String time_period = "";
            String location_filters = "None";
            String item_filters = "None";
            Float value = 0.0f;
            String source = "";
            String KPI = "";
            JSONObject json = new JSONObject(TestDataJson);  
            JSONArray Results = json.getJSONArray("results");
            for (int i = 0; i < Results.length(); i++) {
                JSONObject o = Results.getJSONObject(i);
                if(o.has("username")){
                    username = o.getString("username");   
                } 
                if(o.has("metric")){
                    metric = o.getString("metric");
                }              
                if(o.has("time_period")){
                    time_period = o.getString("time_period");
                }  
                if(o.has("location_filters")){
                    location_filters = "";
                    JSONObject LF = o.getJSONObject("location_filters");
                    Iterator keys = LF.keys();
                    while(keys.hasNext()) {
                        String NextKey = (String)keys.next();
                        location_filters += NextKey + ": " + LF.getString(NextKey) + ", \r\n";
                    }
                } 
                if(o.has("item_filters")){
                    item_filters = "";
                    JSONObject IF = o.getJSONObject("item_filters"); 
                    Iterator keys = IF.keys();
                    while(keys.hasNext()) {
                        String NextKey = (String)keys.next();
                        item_filters += NextKey + ": " + IF.getString(NextKey) + ", \r\n";
                    }
                } 
                if(o.has("value")){
                    value = o.getFloat("value");//.toString()
                }  
                if(o.has("teams_info")){
                    JSONObject TI = o.getJSONObject("teams_info"); 
                    if(TI.has("KPIs Available")){
                        KPI = TI.getString("KPIs Available");
                    }
                }                
                if(o.has("source")){
                    source = o.getString("source");
                }
                TestDataModel.addRow(new Object[]{
                    username.trim(), 
                    metric.trim(), 
                    time_period.trim(), 
                    value, 
                    location_filters.trim(), 
                    item_filters.trim(), 
                    KPI.trim(), 
                    source.trim()});
            }
            
            DVU.setModel(TestDataModel);
            DVU.setDefaultEditor(Object.class, null);
            DVU.getColumnModel().getColumn(0).setPreferredWidth(130);
            DVU.getColumnModel().getColumn(1).setPreferredWidth(150);
            DVU.getColumnModel().getColumn(2).setPreferredWidth(40);            
            DVU.getColumnModel().getColumn(4).setPreferredWidth(160);
            DVU.getColumnModel().getColumn(5).setPreferredWidth(140);            
            DVU.changeSelection(0, 0, false, false);
            
            txtLog.append("= BucketName: " + File_List.getBucketName() + ", Size: " + File_List.getObjectSummaries().size() + "\r\n");
            txtLog.append("= Total validations requested: " + DVU.getRowCount() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } catch (Exception ex) {
            txtLog.append("= " + "DL S3 data: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }     
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    } 
     
    private void GetMetrics() {
        d2LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Metrics ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        try{
            String[] DateColumnsName = {"Metric Nnme", "Group"}; 
            DefaultTableModel DateModel = new DefaultTableModel();
            DateModel.setColumnIdentifiers(DateColumnsName);
            DV1.setModel(DateModel);

//            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV1.getModel());
//            DV1.setRowSorter(sorter);
//            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
//            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
//            sorter.setSortKeys(sortKeys);  
//            sorter.setSortable(0, false);  
            
            DateModel.addRow(new Object[]{"Contracted Spend", "Baseline"});       
            DateModel.addRow(new Object[]{"Contracted Utilization Rate", "Baseline" }); 
            DateModel.addRow(new Object[]{"Total Spend", "Baseline"});  
            DateModel.addRow(new Object[]{"Customer Earned Revenue","Customer"});    
            DateModel.addRow(new Object[]{"Customer Rate of Return", "Customer"});    
            DateModel.addRow(new Object[]{"Customer Strength of Program", "Customer"});     
            DateModel.addRow(new Object[]{"Member Earned Revenue", "Member"});    
            DateModel.addRow(new Object[]{"Member Rate of Return", "Member"});    
            DateModel.addRow(new Object[]{"Member Strength of Program", "Member"});               
            DateModel.addRow(new Object[]{"Program Earned Revenue", "Program"});    
            DateModel.addRow(new Object[]{"Program Rate of Return", "Program"});    
            DateModel.addRow(new Object[]{"Program Strength of Program", "Program"}); 

            DV1.setModel(DateModel);    
            DV1.setDefaultEditor(Object.class, null);
            DV1.getColumnModel().getColumn(0).setPreferredWidth(260);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(150);

//            sorter.setSortable(0, true); 
//            sorter.sort();            
   
        } catch (Exception ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }          
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
   
        if (DV1.getRowCount() > 0) {
            DV1.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(METRIC.trim())) {
                for(int row = 0; row < DV1.getRowCount(); row++) {
                    if(DV1.getValueAt(row, 0).equals(METRIC)){
                        DV1.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 
        wdLastRow = DV1.getSelectedRow();        
        lblDates.setText("Metrics (" + DV1.getRowCount() + " found/defined)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetDates() {
        d2LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Date Ranges ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        try{
            String[] DateColumnsName = {"Date Range"}; 
            DefaultTableModel DateModel = new DefaultTableModel();
            DateModel.setColumnIdentifiers(DateColumnsName);
            DV2.setModel(DateModel);

            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV2.getModel());
            DV2.setRowSorter(sorter);
            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);  
            sorter.setSortable(0, false);         
            DateModel.addRow(new Object[]{"Last 4 weeks"});       
            DateModel.addRow(new Object[]{"Last 12 weeks"}); 
            DateModel.addRow(new Object[]{"Calendar YTD"});  
            DateModel.addRow(new Object[]{"Compass YTD"});    
            DV2.setModel(DateModel);    
            DV2.setDefaultEditor(Object.class, null);
            DV2.getColumnModel().getColumn(0).setPreferredWidth(240);
//            DV2.getColumnModel().getColumn(1).setPreferredWidth(140);
//            DV2.getColumnModel().getColumn(2).setPreferredWidth(80);

            sorter.setSortable(0, true); 
            sorter.sort();            
   
        } catch (Exception ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }          
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
   
        if (DV2.getRowCount() > 0) {
            DV2.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(DATE_RANGE.trim()))
            {
                for(int row = 0; row < DV2.getRowCount(); row++) {
                    if(DV2.getValueAt(row, 0).equals(DATE_RANGE)){
                        DV2.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 

        d2LastRow = DV2.getSelectedRow();        
        lblDates.setText("Date Ranges (" + DV2.getRowCount() + " found/defined)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'DL' AND [env] = '" + env + "'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (Exception ex) {
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
                if(l.contains("url: ")) url = value;
                //if(l.contains("Slack_Ch: ")) Slack_Channel = value;
                if(l.contains("_slack: ")) _slack.setSelected(Boolean.parseBoolean(value));                
                if(l.contains("_headless: ")) _headless.setSelected(Boolean.parseBoolean(value));
                
                if(l.contains("METRIC: ")) METRIC = value;
                if(l.contains("DATE_RANGE: ")) DATE_RANGE = value;

                if(l.contains("txtAdmin_ID: ")) txtAdmin_ID.setText(value);
                if(l.contains("txtAdmin_PW: ")) txtAdmin_PW.setText(value);

                if(l.contains("nWaitElement: ")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nShowPage: ")) nShowPage.setValue(Double.parseDouble(value)); 
                if(l.contains("nWaitLoad: ")) nWaitLoad.setValue(Double.parseDouble(value)); 

           
                if(l.contains("_metrics_selection: ")) _metrics_selection.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_metric_data: ")) _metric_data.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_filters: ")) _filters.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_4: ")) _4.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_password: ")) _password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_all_data: ")) _all_data.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_logout: ")) _logout.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_users: ")) _users.setSelected(Boolean.parseBoolean(value));
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
            C += "url: " + url + "\r\n";
            
            C += "_slack: " + _slack.isSelected() + "\r\n";
            C += "_headless: " + _headless.isSelected() + "\r\n";  
           
            C += "METRIC: " + _S + "\r\n";
            C += "DATE_RANGE: " + _B + "\r\n";         
            
            C += "txtAdmin_ID: " + txtAdmin_ID.getText() + "\r\n";
            C += "txtAdmin_PW: " + txtAdmin_PW.getText()  + "\r\n";
            
            C += "nShowPage: " + nShowPage.getValue() + "\r\n";
            C += "nWaitElement: " + nWaitElement.getValue() + "\r\n";
            C += "nWaitLoad: " + nWaitLoad.getValue()+ "\r\n";

            C += "_metrics_selection: " + _metrics_selection.isSelected() + "\r\n";
            C += "_metric_data: " + _metric_data.isSelected() + "\r\n";
            C += "_filters: " + _filters.isSelected() + "\r\n";
            C += "_4: " + _4.isSelected() + "\r\n";
            C += "_password: " + _password.isSelected() + "\r\n";         
            C += "_all_data: " + _all_data.isSelected() + "\r\n";
            C += "_logout: " + _logout.isSelected() + "\r\n";          
            C += "_users: " + _users.isSelected() + "\r\n"; 
        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'DL' AND [env] = '" + env + "'";
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
            _insert.setString(4, "DL");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            conn.close();
            
            txtLog.append("=== SAVE_CONFIG > OK (" + row + " row) " + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());            
        } catch (SQLException ex) {
            txtLog.append("=== SAVE_CONFIG > SQL ERROR: " + ex.getMessage());
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
                    " WHERE [app] = 'DL_" + env + "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "DL_" + env);
            _update.setString(4, url);
            _update.setString(5, Summary + " (dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + ")");
            _update.setInt(6, t_calls);
            _update.setDouble(7, t_min);
            _update.setDouble(8, t_avg);
            _update.setDouble(9, t_max);
            _update.setDouble(10, p_50);
            _update.setDouble(11, p_90);
            _update.setString(12, r_type);
            _update.setString(13, UserID);
            _update.setString(14, WsID);
            _update.setString(15, cmbBrow.getSelectedItem().toString());
            _update.setString(16, txtLog.getText());
            _update.setString(17, "Scope: " + SCOPE);
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
            _insert.setString(3, "DL_" + env);
            _insert.setString(4, url);
            _insert.setString(5, "Running...");
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, r_type);
            _insert.setString(13, UserID);
            _insert.setString(14, WsID);
            _insert.setString(15, cmbBrow.getSelectedItem().toString());
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
            Report_File = Func.fExcel(l, col, Values, "DL_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            txtLog.append("=== Report Excel file:\r\n" + Report_File + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (IOException ex) {
            txtLog.append("=== Report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
      
    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration - do not modify">
    private static String access_key;
    private static String secret_key;
    private static AWSCredentials AWS_credentials; 
    
    public static String url = "";
    public static String env = "";
    private static SwingWorker BW2; 
    private static String Toast_Msg = "";   
    public static String metricRef=null;
    public static int count;
    public static int var1;
    public static int var2;
    public static double var3;//0.42//0.05
    
    private boolean Load;
    private String Report_Date;
    private String Report_File;
    private static Duration DD;
    private int wdLastRow = -1; 
    private int d2LastRow = -1; 
    private List<String> GROUP_IDS;
    private List<String> COMP_IDS; 
    private List<String> MENU_IDS;  
    private boolean CONFIG = false;
    private String C = "";

    public static int T_Index;
    private String Last_EX;    
    private static final Stopwatch sw1 = Stopwatch.createUnstarted();
    private static final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    private static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private static String SQL = ""; 
    private String SCOPE;
    
    public static String DL_UserID = "";    
    public static String DL_UserPW = "";

    private static String METRIC = "";
    private static String MetricID = "";
    private static String DATE_RANGE = "";
    private static String CatID = "";
    private static String BaseAPI = "";

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JTable DVU;
    private javax.swing.JCheckBox _4;
    private javax.swing.JCheckBox _all_data;
    private javax.swing.JCheckBox _filters;
    private javax.swing.JCheckBox _headless;
    private javax.swing.JCheckBox _login;
    private javax.swing.JCheckBox _logout;
    private javax.swing.JCheckBox _metric_data;
    private javax.swing.JCheckBox _metrics_selection;
    private javax.swing.JCheckBox _password;
    private javax.swing.JCheckBox _slack;
    private javax.swing.JCheckBox _users;
    private javax.swing.JButton btnExel;
    private javax.swing.JButton btnFails;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JComboBox<String> cmbBrow;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDates;
    private javax.swing.JLabel lblMetrics;
    private javax.swing.JLabel lblSITES10;
    private javax.swing.JLabel lblSITES11;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JLabel lblTestData;
    private javax.swing.JSpinner nShowPage;
    private javax.swing.JSpinner nWaitElement;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JTextField txtAdmin_ID;
    private javax.swing.JTextField txtAdmin_PW;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
