package DL;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.base.Stopwatch;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import javax.imageio.ImageIO;
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
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class DL_GUI extends javax.swing.JInternalFrame {

    
    public DL_GUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMetrics = new javax.swing.JLabel();
        lblDates = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV_METRICS = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV_D_RANGES = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        lblSITES4 = new javax.swing.JLabel();
        txtAdmin_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtAdmin_PW = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        nWaitElement = new javax.swing.JSpinner();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES9 = new javax.swing.JLabel();
        lblSITES10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _login = new javax.swing.JCheckBox();
        _all_data = new javax.swing.JCheckBox();
        _metrics_selection = new javax.swing.JCheckBox();
        _metric_data = new javax.swing.JCheckBox();
        _sanity = new javax.swing.JCheckBox();
        _drilldown = new javax.swing.JCheckBox();
        _password = new javax.swing.JCheckBox();
        _logout = new javax.swing.JCheckBox();
        _users = new javax.swing.JCheckBox();
        _invalid_login = new javax.swing.JCheckBox();
        _insights = new javax.swing.JCheckBox();
        _account_manager = new javax.swing.JCheckBox();
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
        txtSlackCh = new javax.swing.JTextField();
        lblSITES14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        DV_QA = new javax.swing.JTable();
        lblTestData = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DV_D_Variants = new javax.swing.JTable();
        lblDates1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Distiller Automation Manager >>> loading, please wait ... ... ... ...");
        setMaximumSize(new java.awt.Dimension(858, 527));
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("DL"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
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

        lblMetrics.setText("Metrics");
        lblMetrics.setAlignmentX(0.5F);

        lblDates.setText("Date Ranges");
        lblDates.setName("lblDates"); // NOI18N

        DV_METRICS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV_METRICS.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_METRICS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_METRICS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_METRICS.setCellSelectionEnabled(true);
        DV_METRICS.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_METRICS.setName("DV_METRICS"); // NOI18N
        DV_METRICS.setRequestFocusEnabled(false);
        DV_METRICS.setRowHeight(18);
        DV_METRICS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_METRICS.getTableHeader().setReorderingAllowed(false);
        DV_METRICS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_METRICSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DV_METRICS);
        DV_METRICS.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        DV_D_RANGES.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_D_RANGES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_D_RANGES.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_D_RANGES.setCellSelectionEnabled(true);
        DV_D_RANGES.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_D_RANGES.setName("DV_D_RANGES"); // NOI18N
        DV_D_RANGES.setOpaque(false);
        DV_D_RANGES.setRowHeight(18);
        DV_D_RANGES.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_D_RANGES.getTableHeader().setReorderingAllowed(false);
        DV_D_RANGES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_D_RANGESMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV_D_RANGES);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES4.setText("User ID:");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);

        txtAdmin_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAdmin_ID.setText("App_User@?.?");

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("User Password");
        lblSITES6.setAlignmentX(0.5F);

        txtAdmin_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAdmin_PW.setText("Compass1");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Wait (sec):"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nWaitElement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitElement.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 1.0d));
        nWaitElement.setName("nWaitElement"); // NOI18N
        jPanel4.add(nWaitElement, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 12, 44, -1));

        nWaitLoad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitLoad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 0.0d, 60.0d, 5.0d));
        nWaitLoad.setName("nWaitLoad"); // NOI18N
        jPanel4.add(nWaitLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 12, 43, -1));

        lblSITES9.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES9.setText("Timeout:");
        lblSITES9.setAlignmentX(0.5F);
        jPanel4.add(lblSITES9, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 16, 49, 16));

        lblSITES10.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES10.setText("Element exists:");
        lblSITES10.setAlignmentX(0.5F);
        jPanel4.add(lblSITES10, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 16, 85, 16));

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
        _metric_data.setText("Secondary Metric Data Validation ");
        _metric_data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _metric_data.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _metric_data.setRequestFocusEnabled(false);

        _sanity.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _sanity.setForeground(new java.awt.Color(204, 0, 0));
        _sanity.setText("Sanity Test Only");
        _sanity.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _sanity.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _sanity.setRequestFocusEnabled(false);

        _drilldown.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _drilldown.setText("Drilldown");
        _drilldown.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _drilldown.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _drilldown.setRequestFocusEnabled(false);

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
        _users.setForeground(new java.awt.Color(0, 51, 255));
        _users.setText("QA Users Data Validation");
        _users.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _users.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _users.setRequestFocusEnabled(false);

        _invalid_login.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _invalid_login.setText("Invalid Login");
        _invalid_login.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _invalid_login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _invalid_login.setRequestFocusEnabled(false);

        _insights.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _insights.setText("Insights ");
        _insights.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _insights.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _insights.setRequestFocusEnabled(false);

        _account_manager.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _account_manager.setText("Account Manager");
        _account_manager.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _account_manager.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _account_manager.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_account_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_metrics_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_drilldown, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_invalid_login, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_metric_data, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_all_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(_users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_sanity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(_invalid_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_metrics_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_metric_data, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_all_data, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(_account_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_drilldown, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_users, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_insights, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_sanity, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbBrow.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(cmbBrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 36, 84, 20));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        jPanel3.add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 60, 84, 24));

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

        lblSITES11.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES11.setText("Browser:");
        lblSITES11.setAlignmentX(0.5F);
        jPanel3.add(lblSITES11, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 20, 72, 16));

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);
        jPanel3.add(lblSITES13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 92, 16));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 116, 20));

        _slack.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _slack.setText("Report to Slack");
        _slack.setToolTipText("");
        _slack.setRequestFocusEnabled(false);
        jPanel3.add(_slack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 52, 100, 14));

        _headless.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _headless.setText("Headless <<<<");
        _headless.setToolTipText("");
        _headless.setRequestFocusEnabled(false);
        jPanel3.add(_headless, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 68, 100, 14));

        txtSlackCh.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtSlackCh.setText("#xtt_test");
        jPanel3.add(txtSlackCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 4, 96, -1));

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Slack Shannel:");
        lblSITES14.setAlignmentX(0.5F);
        lblSITES14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblSITES14, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 4, 72, 16));

        DV_QA.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_QA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_QA.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_QA.setCellSelectionEnabled(true);
        DV_QA.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_QA.setName("DV2"); // NOI18N
        DV_QA.setOpaque(false);
        DV_QA.setRowHeight(18);
        DV_QA.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(DV_QA);

        lblTestData.setText("Test Data");
        lblTestData.setName("lblDates"); // NOI18N

        DV_D_Variants.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_D_Variants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_D_Variants.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_D_Variants.setCellSelectionEnabled(true);
        DV_D_Variants.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_D_Variants.setName("DV_D_Variants"); // NOI18N
        DV_D_Variants.setOpaque(false);
        DV_D_Variants.setRowHeight(18);
        DV_D_Variants.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_D_Variants.getTableHeader().setReorderingAllowed(false);
        DV_D_Variants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_D_VariantsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DV_D_Variants);

        lblDates1.setText("Variants");
        lblDates1.setName("lblDates"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblTestData, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblMetrics, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblDates, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lblDates1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblSITES4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(lblSITES6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAdmin_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(txtAdmin_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblTestData)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMetrics)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDates)
                            .addComponent(lblDates1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES4)
                            .addComponent(lblSITES6))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdmin_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdmin_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">     
    private void DV_METRICSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_METRICSMouseClicked
        if (wdLastRow == DV_METRICS.getSelectedRow() || DV_METRICS.getRowCount() == 0) {
           return;
        }
        METRIC = String.valueOf(DV_METRICS.getValueAt(DV_METRICS.getSelectedRow(), 0));
        GROUP = String.valueOf(DV_METRICS.getValueAt(DV_METRICS.getSelectedRow(), 1));
        wdLastRow = DV_METRICS.getSelectedRow(); 
    }//GEN-LAST:event_DV_METRICSMouseClicked
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if(BW2 != null && !BW2.isCancelled()) BW2.cancel(true);
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    private void DV_D_RANGESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_D_RANGESMouseClicked
        if (d2LastRow == DV_D_RANGES.getSelectedRow()) {
           return;
        }
        d2LastRow = DV_D_RANGES.getSelectedRow();   
        DATE_RANGE = String.valueOf(DV_D_RANGES.getValueAt(DV_D_RANGES.getSelectedRow(), 0));
    }//GEN-LAST:event_DV_D_RANGESMouseClicked
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
        GUI_Run_Manual();
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnFailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFailsMouseClicked
        if(!btnFails.isEnabled()) {return;}
        String R = A.Func.SHOW_FILE(F, "txt");
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
        GUI_Save_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            GUI_Load_Env();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void DV_D_VariantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_D_VariantsMouseClicked
        // TODO add your handling code here:
         if (d2LastRow == DV_D_Variants.getSelectedRow()) {
           return;
        }
        d2LastRow = DV_D_Variants.getSelectedRow();   
        Variants = String.valueOf(DV_D_Variants.getValueAt(DV_D_Variants.getSelectedRow(), 0));
        System.out.println(Variants);
    }//GEN-LAST:event_DV_D_VariantsMouseClicked

    private void _AccountmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__AccountmanagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__AccountmanagerActionPerformed

    private void _invalid_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__invalid_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__invalid_loginActionPerformed

    private void _usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__usersActionPerformed

    private void _metric_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__metric_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__metric_dataActionPerformed

    private void _AccountmanagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__AccountmanagerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event__AccountmanagerMouseClicked
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">  
    private boolean Zip_Report = true;
    private boolean _Slack = false;
    private String Slack_Channel = "";
    private String Log = "";
    private String access_key;
    private String secret_key;
    private AWSCredentials AWS_credentials; 
    
    private String HTML_Report_Path = null;
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    
    protected String BROWSER = "";
    protected String HEADLESS = "";
    protected String url = "";
    protected String env = "";
    private SwingWorker BW1; 
    private SwingWorker BW2; 
    private Instant run_start;


    protected boolean FAIL = false;
    
    protected int _t = 0; // Total - calculate in report as sum of others
    protected int _p = 0; // Passed
    protected int _f = 0; // Failed
    protected int _w = 0; // Warn
    protected int _i = 0; // Info
    protected String t = "";   
    protected String F = "";   
    protected String EX = "";   
    protected String r_time = ""; 

    protected String err = "";
    protected String Toast_Msg = ""; 
    
    protected int t_calls = 0;
    protected double t_min = 0;
    protected double t_max = 0;
    protected double t_avg = 0;
    protected double p_50 = 0;
    protected double p_90 = 0; 
    
    private String Last_EX;
    private  final Stopwatch sw1 = Stopwatch.createUnstarted();
    private boolean Load;
    private String Report_Date;
    private String Excel_Report_Path;
    private Duration DD;
    
    private String SQL = ""; 
    private String Ver = "";
    private String TZone;      
    private String Summary;
    private String r_type;  
    
    protected String API_Response_Body = "";   
    protected int T_Index;
    protected WebDriver d1;
    protected WebElement e;
    protected WebElement e1;
    protected WebElement e2;
    protected List<WebElement> L0 = null;
    protected List<WebElement> L1 = null;
    protected List<WebElement> L2 = null;
    protected List<WebElement> L3 = null; 
    protected List<WebElement> Opens = null;
    protected List<WebElement> Closes = null; 
    
    protected FluentWait loadTimeout = null;
    protected long WaitForElement = 1500; // milisec
    protected double LoadTimeOut = 15 * 1000; // milisec    
    
    private int wdLastRow = -1; 
    private int d2LastRow = -1; 
 
    private boolean CONFIG = false;
    private String C = "";
    
    private String SCOPE;
    private boolean _Headless = false;
    private boolean _Sanity = false;
    private boolean _Invalid_login = false;
    private boolean _Metrics_selection = false;
    protected boolean _Metric_data = false;
    protected boolean _Account_manager = false;

    private boolean _Drilldown = false;
    private boolean _Insights = false;
    private boolean _Password = false;
    private boolean _All_data = false;
    private boolean _Logout = false;
    private boolean _Users = false;
    
    protected String DL_UserID = "";    
    protected String DL_UserPW = "";
    protected boolean Login_OK = true;

    protected String METRIC = "";
    protected String GROUP = "";
    protected String DATE_RANGE = "";
    protected String Variants = "";
    protected String CompareTo="";
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">   
    private void Load_Form(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Load = true;   
        
        cmbBrow.addItem("Chrome");  
        cmbBrow.addItem("Firefox"); 
        cmbBrow.addItem("Edge"); 
        if(A.A.WsOS.toLowerCase().contains("windows")){
            cmbBrow.addItem("IE11");             
        }
        if(A.A.WsOS.toLowerCase().contains("mac")){
            cmbBrow.addItem("Safari");             
        }
        cmbBrow.setSelectedIndex(0); // Chrome
        
        cmbEnv.addItem("Development");
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");         
        cmbEnv.setSelectedIndex(1); // <<< Staging

        GUI_Load_Env();
        Load = false;
        CONFIG = false;   
        this.setTitle("Distiller Automation Manager");
    }

    private void GUI_Load_Env(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            env = "ST";
            url = "https://staging.member.distilr.io";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            env = "DE";
            url = "https://dev.member.distilr.io";
        } else{
            env = "PR";
            url = "https://mpower.distilr.io/";
        }
        
        GUI_Load_CONFIG();
        //GET_DL_USER_TOKEN(false);
        GetDates();       
        GetMetrics();
        GetVariants();
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
        
        String[] SitesColumnsName = {"#", "username","metric","Restr","period","selection","value","location_filters","item_filters","kpi","source"}; 
        DefaultTableModel TestDataModel = new DefaultTableModel();
        TestDataModel.setColumnIdentifiers(SitesColumnsName);
        DV_QA.setModel(TestDataModel);
        
        
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
            String Restricted = "";
            String time_period = "";
            String location_filters = "None";
            String item_filters = "None";
            float qa_value = 0.0f;
            String source = "";
            String KPI = "";
            String member_selection = "None";
            
            JsonObject jo = JsonParser.parseString​(TestDataJson).getAsJsonObject(); 
//          JSONArray Results = json.getJSONArray("results");               // JSONArray,  sorted     - NOT OK 
            JsonArray Results = jo.getAsJsonArray("results");      // JsonArray,  not sorted - OK


            for (int i = 0; i < Results.size(); i++) {                
                JsonObject o = Results.get(i).getAsJsonObject();
                if(o.has("username")){
                    username = o.get("username").getAsString();   
                } 
                if(o.has("metric")){
                    metric = o.get("metric").getAsString();  
                } 
                if(o.has("metric_restriction")){
                    if(o.get("metric_restriction").getAsString().contains("Not ")){
                        Restricted = "No";
                    }else{
                        Restricted = "Yes";
                    }  
                }   
                
                if(o.has("time_period")){
                    time_period = o.get("time_period").getAsString();   
                }  
                if(o.has("member_selection")){
                    member_selection = o.get("member_selection").getAsString();   
                }
                if(o.has("location_filters")){
                    location_filters = "";
                    JsonObject LF = o.get("location_filters").getAsJsonObject();
                    for (String key : LF.keySet()) {
                        location_filters += key + ": " + LF.get(key).getAsString() + ", \r\n";
                    }                    
                } 
                if(o.has("item_filters")){
                    item_filters = "";
                    JsonObject IF = o.get("item_filters").getAsJsonObject();
                    for (String key : IF.keySet()) {
                        item_filters += key + ": " + IF.get(key).getAsString() + ", \r\n";
                    }                    
                } 
                if(o.has("value")){
                    qa_value = o.get("value").getAsFloat();
                }  
                if(o.has("teams_info")){
                    JsonObject TI = o.get("teams_info").getAsJsonObject();
                    if(TI.has("KPIs Available")){
                        KPI = TI.get("KPIs Available").getAsString();
                    }
                }                
                if(o.has("source")){
                    source = o.get("source").getAsString();
                }
                
                TestDataModel.addRow(new Object[]{
                    (i+1),
                    username.trim(), 
                    metric.trim(), 
                    Restricted,
                    time_period.trim(), 
                    member_selection.trim(), 
                    qa_value, 
                    location_filters.trim(), 
                    item_filters.trim(), 
                    KPI.trim(), 
                    source.trim()});
            }
            
            DV_QA.setModel(TestDataModel);
            DV_QA.setDefaultEditor(Object.class, null);
            DV_QA.getColumnModel().getColumn(0).setPreferredWidth(30);
            DV_QA.getColumnModel().getColumn(1).setPreferredWidth(130);
            DV_QA.getColumnModel().getColumn(2).setPreferredWidth(150);
            DV_QA.getColumnModel().getColumn(3).setPreferredWidth(40);
            DV_QA.getColumnModel().getColumn(4).setPreferredWidth(60);            
            DV_QA.getColumnModel().getColumn(5).setPreferredWidth(60);
            DV_QA.getColumnModel().getColumn(6).setPreferredWidth(80);
            DV_QA.getColumnModel().getColumn(7).setPreferredWidth(140);            
            DV_QA.getColumnModel().getColumn(8).setPreferredWidth(140); 
            DV_QA.getColumnModel().getColumn(9).setPreferredWidth(60); 
            DV_QA.getColumnModel().getColumn(10).sizeWidthToFit();
            DV_QA.changeSelection(0, 0, false, false);
            
            txtLog.append("= BucketName: " + File_List.getBucketName() + ", Size: " + File_List.getObjectSummaries().size() + "\r\n");
            txtLog.append("= Total validations requested: " + DV_QA.getRowCount() + "\r\n");
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
            String[] DateColumnsName = {"Metric Name", "Group", "Level"}; 
            DefaultTableModel DateModel = new DefaultTableModel();
            DateModel.setColumnIdentifiers(DateColumnsName);
            DV_METRICS.setModel(DateModel);

            
            DateModel.addRow(new Object[]{"Total Spend", "Baseline", "Primary"}); 
            DateModel.addRow(new Object[]{"Contracted Spend", "Baseline", "Primary"});       
            DateModel.addRow(new Object[]{"Contracted Utilization Rate", "Baseline", "Secondary"}); 
 
            DateModel.addRow(new Object[]{"Customer Earned Revenue","Customer", "Primary"});    
            DateModel.addRow(new Object[]{"Customer Rate of Return", "Customer", "Secondary"});    
            DateModel.addRow(new Object[]{"Customer Strength of Program", "Customer", "Secondary"}); 
            
            DateModel.addRow(new Object[]{"Member Earned Revenue", "Member", "Primary"});    
            DateModel.addRow(new Object[]{"Member Rate of Return", "Member", "Secondary"});    
            DateModel.addRow(new Object[]{"Member Strength of Program", "Member", "Secondary"}); 
            
            DateModel.addRow(new Object[]{"Program Earned Revenue", "Program", "Primary"});    
            DateModel.addRow(new Object[]{"Program Rate of Return", "Program", "Secondary"});    
            DateModel.addRow(new Object[]{"Program Strength of Program", "Program", "Secondary"}); 

            DV_METRICS.setModel(DateModel);    
            DV_METRICS.setDefaultEditor(Object.class, null);
            DV_METRICS.getColumnModel().getColumn(0).setPreferredWidth(240);
            DV_METRICS.getColumnModel().getColumn(1).setPreferredWidth(85);
            DV_METRICS.getColumnModel().getColumn(2).setPreferredWidth(85);
   
        } catch (Exception ex) {
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength());    
        }          
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
   
        if (DV_METRICS.getRowCount() > 0) {
            DV_METRICS.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(METRIC.trim())) {
                for(int row = 0; row < DV_METRICS.getRowCount(); row++) {
                    if(DV_METRICS.getValueAt(row, 0).equals(METRIC)){
                        DV_METRICS.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 
        wdLastRow = DV_METRICS.getSelectedRow();        
        lblMetrics.setText("Metrics (" + DV_METRICS.getRowCount() + " found/defined)");
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
            DV_D_RANGES.setModel(DateModel);

            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV_D_RANGES.getModel());
            DV_D_RANGES.setRowSorter(sorter);
            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);  
            sorter.setSortable(0, false);         
            DateModel.addRow(new Object[]{"Last 4 weeks"});       
            DateModel.addRow(new Object[]{"Last 12 weeks"}); 
            DateModel.addRow(new Object[]{"Last 52 weeks"});    
            DateModel.addRow(new Object[]{"Calendar YTD"});
            DateModel.addRow(new Object[]{"Foodbuy YTD"});
            DV_D_RANGES.setModel(DateModel);    
            DV_D_RANGES.setDefaultEditor(Object.class, null);
            DV_D_RANGES.getColumnModel().getColumn(0).setPreferredWidth(240);
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
   
        if (DV_D_RANGES.getRowCount() > 0) {
            DV_D_RANGES.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(DATE_RANGE.trim()))
            {
                for(int row = 0; row < DV_D_RANGES.getRowCount(); row++) {
                    if(DV_D_RANGES.getValueAt(row, 0).equals(DATE_RANGE)){
                        DV_D_RANGES.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 

        d2LastRow = DV_D_RANGES.getSelectedRow();        
        lblDates.setText("Date Ranges (" + DV_D_RANGES.getRowCount() + " found/defined)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    private void GetVariants() {
        d2LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Variants ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        try{
            String[] DateColumnsName = {"Variants"}; 
            DefaultTableModel DateModel = new DefaultTableModel();
            DateModel.setColumnIdentifiers(DateColumnsName);
            DV_D_Variants.setModel(DateModel);

            TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV_D_Variants.getModel());
            DV_D_Variants.setRowSorter(sorter);
            ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
            sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
            sorter.setSortKeys(sortKeys);  
            sorter.setSortable(0, false);         
            DateModel.addRow(new Object[]{"Total"});       
            DateModel.addRow(new Object[]{"Distributor only"}); 
            DateModel.addRow(new Object[]{"Manufacturer only"});    
        
            DV_D_Variants.setModel(DateModel);    
            DV_D_Variants.setDefaultEditor(Object.class, null);
            DV_D_Variants.getColumnModel().getColumn(0).setPreferredWidth(240);
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
   
        if (DV_D_Variants.getRowCount() > 0) {
            DV_D_Variants.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(Variants.trim()))
            {
                for(int row = 0; row < DV_D_Variants.getRowCount(); row++) {
                    if(DV_D_Variants.getValueAt(row, 0).equals(Variants)){
                        DV_D_Variants.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 

        d2LastRow = DV_D_Variants.getSelectedRow();        
        lblDates1.setText("Variants (" + DV_D_Variants.getRowCount() + " found/defined)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void GUI_Load_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'DL' AND [env] = '" + env + "'";
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
                if(l.contains("Browser: ")) cmbBrow.setSelectedItem(value);
                if(l.contains("env: ")) env = value;
                if(l.contains("url: ")) url = value;
                if(l.contains("SlackCh: ")) txtSlackCh.setText(value);
                if(l.contains("_slack: ")) _slack.setSelected(Boolean.parseBoolean(value));                
                if(l.contains("_headless: ")) _headless.setSelected(Boolean.parseBoolean(value));
                
                if(l.contains("METRIC: ")) METRIC = value;
                if(l.contains("DATE_RANGE: ")) DATE_RANGE = value;

                if(l.contains("User_ID: ")) txtAdmin_ID.setText(value);
                if(l.contains("User_PW: ")) txtAdmin_PW.setText(value);
                if(l.contains("_invalid_login: ")) _invalid_login.setSelected(Boolean.parseBoolean(value));
                
                if(l.contains("nWaitElement: ")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nWaitLoad: ")) nWaitLoad.setValue(Double.parseDouble(value)); 
           
                if(l.contains("_metrics_selection: ")) _metrics_selection.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_metric_data: ")) _metric_data.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_account_manager: ")) _account_manager.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_sanity: ")) _sanity.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_drilldown: ")) _drilldown.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_insights: ")) _insights.setSelected(Boolean.parseBoolean(value)); 
              
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
    private void GUI_Save_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String _S = "n/a";
        String _B = "n/a";
        try {
            if(DV_METRICS.getRowCount() > 0){
                _S = DV_METRICS.getValueAt(DV_METRICS.getSelectedRow(), 0).toString();
            }
            if(DV_D_RANGES.getRowCount() > 0){
                _B = DV_D_RANGES.getValueAt(DV_D_RANGES.getSelectedRow(), 0).toString();
            }
            C = "";
            C += "Browser: " + cmbBrow.getSelectedItem().toString() + "\r\n";
            C += "env: " + env + "\r\n";
            C += "url: " + url + "\r\n";
            
            C += "SlackCh: " + txtSlackCh.getText() + "\r\n";
            C += "_slack: " + _slack.isSelected() + "\r\n";
            C += "_zip_report: " + "true" + "\r\n";
            
            C += "_headless: " + _headless.isSelected() + "\r\n";  
           
            C += "METRIC: " + _S + "\r\n";
            C += "DATE_RANGE: " + _B + "\r\n";         
            
            C += "User_ID: " + txtAdmin_ID.getText() + "\r\n";
            C += "User_PW: " + txtAdmin_PW.getText()  + "\r\n";
            C += "_invalid_login: " + _invalid_login.isSelected() + "\r\n";            
            C += "nWaitElement: " + nWaitElement.getValue() + "\r\n";
            C += "nWaitLoad: " + nWaitLoad.getValue()+ "\r\n";

            C += "_metrics_selection: " + _metrics_selection.isSelected() + "\r\n";
            C += "_metric_data: " + _metric_data.isSelected() + "\r\n";
            C += "_account_manager: " + _account_manager.isSelected() + "\r\n";
            C += "_sanity: " + _sanity.isSelected() + "\r\n";
            C += "_drilldown: " + _drilldown.isSelected() + "\r\n";
            C += "_insights: " + _insights.isSelected() + "\r\n";
         
            C += "_password: " + _password.isSelected() + "\r\n";         
            C += "_all_data: " + _all_data.isSelected() + "\r\n";
 
            C += "_logout: " + _logout.isSelected() + "\r\n";          
            C += "_users: " + _users.isSelected() + "\r\n"; 
        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'DL' AND [env] = '" + env + "'";
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
        Excel_Report_Path = "";
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
            Excel_Report_Path = A.Func.fExcel(l, col, Values, "DL_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            txtLog.append("=== Report Excel file:\r\n" + Excel_Report_Path + "\r\n");
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
                    " WHERE [app] = 'DL_" + env + "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(A.A.Date_formatter));
            _update.setString(2, LocalDateTime.now().format(A.A.Time_24_formatter));
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
            _update.setString(13, A.A.UserID); 
            _update.setString(14, A.A.WsID);
            _update.setString(15, BROWSER + HEADLESS);
            _update.setString(16, LOG);
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
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
            _insert.setString(15, BROWSER + HEADLESS);
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

    private void GUI_Run_Manual(){
        btnRun.setEnabled(false);
        btnFails.setEnabled(false);
        btnExel.setEnabled(false);
        Slack_Channel = txtSlackCh.getText();
        try{
            run_start = Instant.now();
            txtLog.append("=== Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            WaitForElement = Math.round((double)nWaitElement.getValue() *1000);
            LoadTimeOut = (double)nWaitLoad.getValue() *1000;
            
            BROWSER = cmbBrow.getSelectedItem().toString();
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

            DL_UserID = txtAdmin_ID.getText();
            DL_UserPW = txtAdmin_PW.getText();

            if(DV_METRICS.getRowCount() > 0) {
                METRIC = DV_METRICS.getValueAt(DV_METRICS.getSelectedRow(), 0).toString();
            }
            if(DV_D_RANGES.getRowCount() > 0) {
                DATE_RANGE = DV_D_RANGES.getValueAt(DV_D_RANGES.getSelectedRow(), 0).toString();
            }

            SCOPE = "";
            r_type = "manual"; 

            _Headless = _headless.isSelected();
            _Slack = _slack.isSelected();                
            _Sanity = _sanity.isSelected();
            _Invalid_login = _invalid_login.isSelected();

            _Metrics_selection = _metrics_selection.isSelected();
            _Metric_data = _metric_data.isSelected();
            _Account_manager = _account_manager.isSelected();
            _Drilldown = _drilldown.isSelected();
            _Insights = _insights.isSelected();
            _Password = _password.isSelected();
            _All_data = _all_data.isSelected();
            _Logout = _logout.isSelected();
            _Users = _users.isSelected();
            
            if(_Headless) {
                Current_Log_Update(true,"= Headless mode is selected - Browser is hidden" + "\r\n");
                txtLog.append( "= Please wait for report...\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
            Current_Log_Update(true, "= Starting Appium Service and Android Driver..." + "\r\n");
            
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();
            LOG_START(); // ========================================================
            BW1_DoWork(true);
            BW2_DoWork();
        }catch(Exception ex){
            Current_Log_Update(true, "= GUI_Run_Manual ERROR > " + ex.getMessage() + "\r\n");
            BW1_FAIL_LOG_UPDATE("= GUI_Run_Manual ERROR > " + ex.getMessage());
        }           
    }
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
            _i = 0; // Info
            r_time = "";
            SCOPE = "";
            r_type = run_type; 

            Current_Log_Update(false, "- Starting Appium Service and Android Driver..." + "\r\n");
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();
            LOG_START();   // ========================================================            
            BW1_DoWork(false);
            BW2_DoWork();
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
                if(l.contains("Browser: ")) BROWSER = value;
                if(l.contains("env: ")) env = value;
                if(l.contains("url: ")) url = value;

                if(l.contains("METRIC: ")) METRIC = value;
                if(l.contains("DATE_RANGE: ")) DATE_RANGE = value;

                if(l.contains("User_ID: ")) DL_UserID = value;
                if(l.contains("User_PW: ")) DL_UserPW = value;

                if(l.contains("nWaitElement:")) WaitForElement = Math.round(Double.parseDouble(value) * 1000);
                if(l.contains("nWaitLoad:")) LoadTimeOut = Double.parseDouble(value) * 1000;

                if(l.contains("SlackCh: ")) Slack_Channel = value;
                if(l.contains("_headless: ")) _Headless = Boolean.parseBoolean(value);
                if(l.contains("_slack: ")) _Slack = Boolean.parseBoolean(value);                
                if(l.contains("_sanity: ")) _Sanity = Boolean.parseBoolean(value);
                if(l.contains("_invalid_login: ")) _Invalid_login = Boolean.parseBoolean(value);

                if(l.contains("_metrics_selection: ")) _Metrics_selection = Boolean.parseBoolean(value);
                if(l.contains("_metric_data: ")) _Metric_data = Boolean.parseBoolean(value);
                if(l.contains("_account_manager: ")) _Account_manager = Boolean.parseBoolean(value);
                
                if(l.contains("_drilldown: ")) _Drilldown = Boolean.parseBoolean(value);
                if(l.contains("_insights: ")) _Insights = Boolean.parseBoolean(value);
                if(l.contains("_Accountmanager: "))_Account_manager = Boolean.parseBoolean(value);
                if(l.contains("_password: ")) _Password = Boolean.parseBoolean(value);
                if(l.contains("_all_data: ")) _All_data = Boolean.parseBoolean(value);
                if(l.contains("_logout: ")) _Logout = Boolean.parseBoolean(value);
                if(l.contains("_users: ")) _Users = Boolean.parseBoolean(value);
            }             
            CONFIG = true;
            Current_Log_Update(true, "= JOB_Load_CONFIG > OK" + "\r\n");
            return "OK";
        } catch (Exception ex) {
            CONFIG = false;
            Current_Log_Update(true, "= JOB_Load_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            return "ERROR > " + ex.getMessage(); 
        }
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Extend HTML Report Methods">
    protected void Extent_Report_Config() throws IOException{
        HTML_Report_Path = System.getProperty("user.home") + File.separator + "Desktop";
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + "DL" + "_" + env + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);
        
        HtmlReport.setSystemInfo("App Version", "Distiller" + " " + "Version - TBD"); 
        HtmlReport.setSystemInfo("Browser", BROWSER);        
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID); 
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        
        HtmlReporter.config().setDocumentTitle("JTT Web Automation Report");
        //HtmlReporter.config().setTheme(Theme.DARK);   
        HtmlReporter.config().setTheme(Theme.STANDARD);   
    }    
    protected void Log_Html_Result(String RES, String Test_Description, boolean Capture_Screenshot, ExtentTest Test) throws IOException  {
        switch (RES) {
            case "PASS":
                Test.log(Status.PASS, MarkupHelper.createLabel(Test_Description, ExtentColor.GREEN));
                if (Capture_Screenshot) {
                    Test.log(Status.PASS, "Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
                }
                break;
            case "FAIL":
                Test.log(Status.FAIL, MarkupHelper.createLabel(Test_Description, ExtentColor.RED));
                if (Capture_Screenshot) {
                    Test.log(Status.FAIL, "Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
                }                
                break;
            case "SKIP":
                Test.log(Status.SKIP, MarkupHelper.createLabel(Test_Description, ExtentColor.ORANGE));
                if (Capture_Screenshot) {
                    Test.log(Status.SKIP, "Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
                }
                break;
            case "INFO":
                Test.log(Status.INFO, MarkupHelper.createLabel(Test_Description, ExtentColor.BLUE));
                if (Capture_Screenshot) {
                    Test.log(Status.INFO, "Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
                }
                break;
            case "WARN":
                Test.log(Status.WARNING, MarkupHelper.createLabel(Test_Description, ExtentColor.YELLOW));
                if (Capture_Screenshot) {
                    Test.log(Status.WARNING,"Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
                }
                break;
        }
    }
    protected String getScreenshot() {
        try{
            TakesScreenshot scrShot =((TakesScreenshot)d1);
            File SF = scrShot.getScreenshotAs(OutputType.FILE);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(ImageIO.read(SF), "png", bos);
            SF.delete();
            return "data:image/png;base64, " + Base64.getEncoder().encodeToString(bos.toByteArray());
        }catch (IOException ex) {
            return "data:image/png;base64," + " ERROR: " + ex.getMessage();
        }
    }
     //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Background Workers: Web Driver > Execution > Reports">
    private String StartWebDriver() {
        if(_Headless){
            HEADLESS = " - headless";           
        } else{
            HEADLESS = "";
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            txtLog.append( "= CWD: " + A.A.CWD + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                System.setProperty("webdriver.chrome.driver", A.A.CWD + "\\chromedriver.exe");                
                System.setProperty("webdriver.edge.driver", A.A.CWD + "\\msedgedriver.exe");  
                System.setProperty("webdriver.gecko.driver", A.A.CWD + "\\geckodriver.exe"); 
                System.setProperty("webdriver.ie.driver", A.A.CWD + "\\IEDriverServer.exe"); 
            }
            if(A.A.WsOS.toLowerCase().contains("mac")){
                System.setProperty("webdriver.chrome.driver", A.A.CWD + "/chromedriver");                
                System.setProperty("webdriver.edge.driver", A.A.CWD + "/msedgedriver");  
                System.setProperty("webdriver.gecko.driver", A.A.CWD + "/geckodriver");
                System.setProperty("webdriver.safari.driver", A.A.CWD + "/safaridriver");
            }
            switch (BROWSER) {
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
                        if(_Headless){
                            chrome_op.addArguments("--headless");
                        }
                        chrome_op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                        d1 = new ChromeDriver(chrome_op);
                    break;
                case "Edge":
//                    txtLog.append( "= Edge Driver:" + System.getProperty("webdriver.edge.driver") + "\r\n");
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
                        if(_Headless){
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
            return "= WabDriver Start > OK " + "\r\n";
        } catch (Exception ex) {
            F += "= WebDriver > ERROR: " + ex.getMessage() + "\r\n";
            if(d1 != null) {
                d1.quit();
            }
            return "=WebDriver > ERROR: " + ex.getMessage() + "\r\n";
        }  
    }
    private void BW1_DoWork(Boolean GUI) { 
        BW1 = new SwingWorker() {             
            @Override
            protected String doInBackground() throws Exception { 
                String DriverStart = StartWebDriver();
                if(DriverStart.contains("OK")){
                    Current_Log_Update(GUI, "= Appium Service and Android Driver Started in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\r\n");
                    sw1.reset();
                } else{
                    Current_Log_Update(GUI, DriverStart.trim() + "\r\n");
                    Summary = "Start Web Driver - Failed";
                    DD = Duration.between(run_start, Instant.now());
                    LOG_UPDATE(DriverStart.trim() + "\r\n");   // ======================================================
                    btnRun.setEnabled(true);
                    btnFails.setEnabled(true);
                }
                Extent_Report_Config();// ======================================================================= 
                
                Execute();
                
                DD = Duration.between(run_start, Instant.now());
                Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
                Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");
                
                EX = "Distiller " + env + ", v" + Ver + ", Browser: " + BROWSER  + HEADLESS +
                    " - Steps: " + (_p + _f +_w + _i) + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ". Scope: " + SCOPE + 
                    ", Dur: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" +
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
                BW2.cancel(true); // ================================================            
                try  { 
                    String statusMsg = (String) get(); 
                    txtLog.append("" + statusMsg + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                    
                    BW2 = null;
                    BW1 = null;
                    
                    if(d1 != null) {
                        d1.quit(); 
                    }
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
    private void BW2_DoWork(){
        BW2 = new SwingWorker() {             
            @Override
            protected String doInBackground() throws Exception { 
                String Toast_Msg = "";
                String Previous_Toast_Msg = "";
                while (BW1 != null){
                    Toast_Msg = "";
                    Thread.sleep(1000);
                    try {
                        List<WebElement> ALERTS = d1.findElements(By.cssSelector("[role='alert']"));
                        if(ALERTS.size() > 0) {
                            Toast_Msg = ALERTS.get(0).getAttribute("textContent");// .getText();
                            if(Toast_Msg.equals(Previous_Toast_Msg)){
                                continue;
                            }
                            Previous_Toast_Msg = Toast_Msg;
                            if(     Toast_Msg.toLowerCase().contains("successfully") || 
                                    Toast_Msg.toLowerCase().contains(" been updated") || 
                                    Toast_Msg.toLowerCase().contains(" been added") || 
                                    Toast_Msg.toLowerCase().contains(" been removed") ||
                                    Toast_Msg.toLowerCase().contains(" been reset") ||
                                    Toast_Msg.toLowerCase().contains(" saved")) {
                                _t++;
                                _p++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                            
                                Log_Html_Result("PASS", Toast_Msg, false, ParentTest.createNode("Snackbar Toast Msg"));                            
                            } else if(Toast_Msg.toLowerCase().contains("could not")|| 
                                    Toast_Msg.toLowerCase().contains("unable to save")|| 
                                    Toast_Msg.toLowerCase().contains("already ")|| 
                                    Toast_Msg.toLowerCase().contains("fail")) {
                                _t++;
                                _f++;
                                F += "Step: " + _t + " > FAIL - " + Toast_Msg + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("FAIL", Toast_Msg, true, ParentTest.createNode("Snackbar Toast Msg"));                            
                            } else if(Toast_Msg.toLowerCase().contains("fix") || Toast_Msg.toLowerCase().contains("error")) {
                                _t++;
                                _w++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("WARN", Toast_Msg, true, ParentTest.createNode("Snackbar Toast Msg"));                            
                            } else {
                                _t++;
                                _w++;
                                //F += "Step: " + _t + " > WARN - " + tt + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("WARN", Toast_Msg, true, ParentTest.createNode("Snackbar Toast Msg"));
                            }
                            Thread.sleep(2000); //  pause till new alert expected ???? 
                        }
                    } catch (IOException | InterruptedException ex){ // Exception ex
                        txtLog.append( "= BW2: " + ex.getMessage() + "\r\n");
                        txtLog.setCaretPosition(txtLog.getDocument().getLength());                         
                    }
                }
                return "Done"; 
            }
        }; 
        BW2.execute();
    }
    private void BW1_FAIL_LOG_UPDATE(String Error){
        Summary = "BW1 - Failed: " + Error;
        DD = Duration.between(run_start, Instant.now());
        LOG_UPDATE("- BW1 ERROR: " + Error);
        btnRun.setEnabled(true);
    }
    private void Execute() throws Exception {
        if (_Sanity) { 
            ParentTest = HtmlReport.createTest("Sanity"); 
            SCOPE += "Sanity";                  
  
            DL_UserID = txtAdmin_ID.getText();
            DL_UserPW = txtAdmin_PW.getText();
            EX += " - " + "\t" + " === Sanity Test " + "\t" + " ===== " + "\t" + " == Sanity Test Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";      
            DL_sanity BR = new DL_sanity(DL_GUI.this);
            BR.run(DL_UserID, DL_UserPW ); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Sanity Test " + "\t" + " ===== " + "\t" + " == ^ Sanity Test End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";

            return; // Do Not execute any Other Scope if Testing Sanity
        }        

        
        if (_Users) { 
            SCOPE += "QA Users";
            DL_UserID = "";         // Clear DL_User from GUI to force Clear_Cookies > Restart_Driver and Re-Login
            String QA_USER = "";    // Next QA User from S3 DV_QA table
            Boolean IsMember=false;
            Boolean IsMemberSwitch=false;
            for (int i = 500; i < 560; i++) {   // Custom Test range selection from DV_QA table >>>> i = (# in the table - 1)  <<<< !!!!!
           // for (int i = 0; i < DV_QA.getRowCount(); i++) {    // All Tests from S3 DV_QA table
                if(QA_USER.equals(DV_QA.getValueAt(i, 1).toString()) && !Login_OK){
                    continue;      // Do Not proceed with User having Invalid Credentials or Locked Account
                }  
                IsMemberSwitch=false;
                ParentTest = HtmlReport.createTest("User: " + DV_QA.getValueAt(i, 1) + " Test# " + (i + 1));  // (i+1) = # in the table
                QA_USER = DV_QA.getValueAt(i, 1).toString();
                if (i == 500) {
                    Text_Found("Check member is Displayed ", "My Members", ParentTest, "no_jira");
                    if (t.equalsIgnoreCase("Not Found")) {
                        IsMember = false;
                    } else {
                        IsMember = true;
                        SelectMember(DV_QA.getValueAt(i, 5).toString());
                        IsMemberSwitch=true;
                    }
                }
                System.out.println(DV_QA.getValueAt(i, 5).toString());
                if (!QA_USER.equals(DL_UserID)) {  // ======  Clear Cookies and Login with New QA User ===========
                    DL_UserID = QA_USER;                // ======  Use last QA User from S3 for the next in the loop ====
                    EX += " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " " + "\r\n";
                    Clear_Cookies_Restart_Driver(BROWSER, ParentTest, "no_jira");
                    if (!FAIL) {
                        DL_login BR = new DL_login(DL_GUI.this);
                        BR.run(DL_UserID, DL_UserPW, false); // ======================================
                        EX += BR.EX;
                        _t += BR._t;
                        _p += BR._p;
                        _f += BR._f;
                        _w += BR._w;
                        _i += BR._i;
                        F += BR.F;
                        r_time += BR.r_time;
                        Login_OK = BR.Login_OK;
                        Text_Found("Check member is Displayed ", "My Members", ParentTest, "no_jira");
                        if (t.equalsIgnoreCase("Not Found")) {
                            IsMember = false;
                        } else {
                            IsMember = true;
                            SelectMember(DV_QA.getValueAt(i, 5).toString());
                            IsMemberSwitch=true;
                        }
                    } else {
                        Login_OK = false;
                    }
                }
                if (!Login_OK) {
                    continue;      // Go to next Test
                }
                if(!IsMemberSwitch && IsMember)
                {
                    SwitchMember(DV_QA.getValueAt(i, 5).toString());
                    
                }
                EX += " - " + "\t" + " " + "\t" + " " + "\t" + " " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                EX += " - " + "\t" + " === QA Users - Data Validation" + "\t" + "User: " + QA_USER + "\t" + " == Users " + " - Test# " + (i+1) + " Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                
                DL_qa_user BR = new DL_qa_user(DL_GUI.this);
                BR.run(  // ====== pass QA User Test # 'i + 1' Data from QA Data Table build from S3 QA file =========================
                    DL_UserID, 
                    DV_QA.getValueAt(i, 2).toString(),     
                    DV_QA.getValueAt(i, 3).toString(), 
                    DV_QA.getValueAt(i, 4).toString(), 
                    DV_QA.getValueAt(i, 6).toString(), 
                    DV_QA.getValueAt(i, 7).toString(), 
                    DV_QA.getValueAt(i, 8).toString(),
                    DV_QA.getValueAt(i, 9).toString(), 
                    DV_QA.getValueAt(i, 10).toString(),
                    IsMember
                );
                EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time; // DL_UserID = BR.DL_UserID;
                EX += " - " + "\t" + " === ^ QA Users - Data Validation" + "\t" + "User: " + DV_QA.getValueAt(i, 1).toString() + "\t" + " == ^ User " + " - Test# "+ (i+1) + " End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";             
            }   

            return; // Do Not execute any Other Scope if Testing QA Users S3 list
        }   
        
        
        if (true) { // _login.isSelected() ALWAYS TRUE
            if(_Invalid_login){
                ParentTest = HtmlReport.createTest("Valid/Invalid Login"); 
                SCOPE += "Valid/Invalid Login";                  
            } else{
                ParentTest = HtmlReport.createTest("Login"); 
                SCOPE += "Login";                
            }
            DL_UserID = txtAdmin_ID.getText();
            DL_UserPW = txtAdmin_PW.getText();
            EX += " - " + "\t" + " === Login(s) " + "\t" + " ===== " + "\t" + " == Login(s) Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";      
            DL_login BR = new DL_login(DL_GUI.this);
            BR.run(DL_UserID, DL_UserPW, _invalid_login.isSelected()); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Login(s) " + "\t" + " ===== " + "\t" + " == ^ Login(s) End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        
        if(!Login_OK){
            return; // Cannot proceed with this User - Bad Login
        }
            
        if (_Metrics_selection) { 
            ParentTest = HtmlReport.createTest("Metrics Selection"); 
            SCOPE += ", Metrics Selection"; 
            EX += " - " + "\t" + " === Metrics Selection" + "\t" + " ===== " + "\t" + " == Metrics Selection Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_metrics_selection BR = new DL_metrics_selection(DL_GUI.this);
            BR.run(); // ============================================================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Metrics Selection" + "\t" + " ===== " + "\t" + " == ^ Metrics Selection End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }  
        if (_Metric_data ) { 
            String CompareTo = "";
            SCOPE += ", Metrics Secondary Data"; 
            for (int i = 0; i < 3; i++) {
                if(i == 0)  CompareTo = "Compared to last year";
                if(i == 1)  CompareTo = "Compared to last month";
                if(i == 2)  CompareTo = "Compared to last week";
                for (int j = 0; j < 3; j++) {
                if(j == 0)  Variants = "Total";
                if(j == 1)  Variants = "Distributor only";
                if(j == 2)  Variants = "Manufacturer only";
                ParentTest = HtmlReport.createTest("Secondary Metrics - " + CompareTo); 
                EX += " - " + "\t" + " === Secondary Metrics  - " + CompareTo + "\t" + " ===== " + "\t" + " == Secondary Metrics Data Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
                DL_metric_data BR = new DL_metric_data(DL_GUI.this);
                BR.run(CompareTo, Variants); // ============================================================================            
                EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
                EX += " - " + "\t" + " === ^ Secondary Metrics  - " + CompareTo + "\t" + " ===== " + "\t" + " == ^ Secondary Metrics Data End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            }    
            }
        }
        


        if (_Insights) { 
            ParentTest = HtmlReport.createTest("Insights");                         
            SCOPE += ", Insights";
            EX += " - " + "\t" + " === Insights" + "\t" + " ===== " + "\t" + " == Insights Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_insights BR = new DL_insights(DL_GUI.this);
            BR.run(); // ============================================================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Insights" + "\t" + " ===== " + "\t" + " == ^ Insights End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        
        if (_Drilldown) { 
            ParentTest = HtmlReport.createTest("Drilldown");                         
            SCOPE += ", Drilldown";
            EX += " - " + "\t" + " === Drilldown" + "\t" + " ===== " + "\t" + " == Drilldown Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_drilldown BR = new DL_drilldown(DL_GUI.this);
            BR.run(); // ============================================================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Drilldown" + "\t" + " ===== " + "\t" + " == ^ Drilldown End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }

        if (_Logout) { 
            ParentTest = HtmlReport.createTest("LogOut");                         
            SCOPE += ", LogOut";
            EX += " - " + "\t" + " === Logout" + "\t" + " ===== " + "\t" + " == Logout Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_logout BR = new DL_logout(DL_GUI.this);
            BR.run(); // ============================================================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Logout" + "\t" + " ===== " + "\t" + " == ^ Logout End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }
        if (_Password) { 
            ParentTest = HtmlReport.createTest("Forgot PW");                                     
            SCOPE += ", Forgot PW";  
            EX += " - " + "\t" + " === Forgot PW" + "\t" + " ===== " + "\t" + " == Forgot PW Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_password BR = new DL_password(DL_GUI.this);
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            BR.run(); // ============================================================================
            EX += " - " + "\t" + " === ^ Forgot PW" + "\t" + " ===== " + "\t" + " == ^ Forgot PW End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        }    
       if (_Account_manager) { 
            ParentTest = HtmlReport.createTest("Account Manager");                                     
            SCOPE += ", Account Manager";  
            EX += " - " + "\t" + " === Account Manager" + "\t" + " ===== " + "\t" + " == Account Manager Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            DL_Accountmanager BR = new DL_Accountmanager(DL_GUI.this);
            BR.run();
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            // ============================================================================
            EX += " - " + "\t" + " === ^ Account Manager" + "\t" + " ===== " + "\t" + " == ^ Account ManagerEnd" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            Thread.sleep(1500);
        } 
    }
    private void BW1_Done(boolean GUI) throws Exception{
        DD = Duration.between(run_start, Instant.now());
             
        Slack_Channel = "xtt_test";
        Zip_Report = true;
        
        Last_EX = EX;
        Summary = "Steps: " + (_p + _f +_w + _i) + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i;
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
        
        Current_Log_Update(GUI, "= Distiller" + " v: " + "?" + ", Environment: " + env + "\r\n");
        Current_Log_Update(GUI, "= Scope: " + SCOPE + "\r\n"); // SCOPE shown in EX top
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n");

        
        if(GUI){
            Log = txtLog.getText();
        }

        HtmlReporter.config().setReportName("Distiller" + ", Env: " + env + 
            ", Steps: " + (_p + _f +_w + _i) + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i +
            ". Resp(sec) - Min: " + A.A.df.format(t_min) +
                        ", Avg: " + A.A.df.format(t_avg) +
                        ", Max: " + A.A.df.format(t_max) +
                        ", p50: " + A.A.df.format(p_50) +
                        ", p90: " + A.A.df.format(p_90) + 
            ". Dur: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s");
        HtmlReport.flush();
        
        if(_Slack && !Slack_Channel.equals("N/A")){
            Report(false);
            String MSG = "Distiller " + env + " Excel Automation report - " + Report_Date +
                "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: " + A.A.UserID + "\r\n" +
                "Browser: *" + BROWSER  + HEADLESS + "*" + "\r\n" +        
                "Scope: " + SCOPE + "\r\n" +
                "Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" + 
                "Steps: " + (_p + _f +_w + _i) + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i;
            
            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(Excel_Report_Path, Slack_Channel, MSG));
            File ef = new File(Excel_Report_Path);
            if(ef.exists() && !ef.isDirectory()) {
                ef.delete();
            }  
            String HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Click to Open";
            HTML_Report_Path = HtmlReporter.getFile().getAbsolutePath();
            if(Zip_Report){
                String Origin_HTML = HTML_Report_Path;
                HTML_Report_Path = A.Func.Zip_File(HTML_Report_Path);
                File hf = new File(Origin_HTML);
                if(hf.exists() && !hf.isDirectory()) {
                    hf.delete();
                }
                HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Extract Here > open unzipped HTML file";
            }
            Current_Log_Update(GUI, A.Func.Send_File_with_Message_to_Slack(HTML_Report_Path, Slack_Channel, HTML_Report_Msg));
            File hf = new File(HTML_Report_Path);
            if(hf.exists() && !hf.isDirectory()) {
                hf.delete();
            }
        }
        btnRun.setEnabled(true);
        if(!"".equals(F.trim())){
            btnFails.setEnabled(true);
        } else{
            btnFails.setEnabled(false);
        }
        btnExel.setEnabled(true);
        
        LOG_UPDATE(Log); // ========================================================
    }
     public void SelectMember(String Member) {
         try{
    Boolean p = false;
        List_L2("Members Selection List", "xpath", "//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        if (L2 == null || L2.size() == 0) {
            p = true;
            List_L2("Members Selection List", "xpath", "//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
        }
        List<String> Memberlist = new ArrayList<>();

        if (p) {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//p[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//p[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                } else {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//div[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//div[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
        Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
        if (FAIL) {
            return;
        }
        Thread.sleep(5000);
    }catch (Exception ex){}
         
     }
     public void SwitchMember(String Member) {
         try{
              Boolean p = false;

            List_L2("Members Selection List", "xpath", "//div[@role='dialog']//button[contains(@class, 'MuiGrid-root jss')]/div", ParentTest, "no_jira");
            if (FAIL) {
                return;
            }
            if (L2 == null || L2.size() == 0) {
                p = true;
                List_L2("Members Selection List", "xpath", "//div[@role='dialog']//p[contains(@class, 'MuiTypography-root jss')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
            }
         
Thread.sleep(5000);

                Wait_For_Element_By_Path_Presence("Wait for Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }
                Element_By_Path_Click("Click on Chevron", "xpath", "//span[contains(text(),'keyboard_arrow_down')]", ParentTest, "no_jira");
                if (FAIL) {
                    return;
                }

                Thread.sleep(5000);
                if (p) {
                    Move_to_Element_By_Path("Scroll to Member", "xpath", "//p[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on a Member", "xpath", "//p[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                } else {
                    Scroll_to_WebElement("Scroll to Member", "xpath", "//div[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                    Thread.sleep(2000);
                    Element_By_Path_Click("Click on Continue as a Member", "xpath", "//div[text()=\"" + Member.replaceAll("'", "\\\'") + "\"]", ParentTest, "no_jira");
                    if (FAIL) {
                        return;
                    }
                }
                System.out.println(Member);

                Element_By_Path_Click("Click on Continue as a Member", "xpath", "//span[text()='Continue as Member']", ParentTest, "no_jira");
                if (FAIL) {
                    return;

                }
    }catch (Exception ex){}
         
     }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Driver Actions > Log Step Result">  
    protected void Clear_Cookies_Restart_Driver(String BROWSER, ExtentTest ParentTest, String JIRA )throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();
        FAIL = false;
        try {
            d1.manage().deleteAllCookies();
            d1.quit();
            d1 = null;
            if(A.A.WsOS.toLowerCase().contains("windows")){
                System.setProperty("webdriver.chrome.driver", A.A.CWD + "\\chromedriver.exe");                
                System.setProperty("webdriver.edge.driver", A.A.CWD + "\\msedgedriver.exe");  
                System.setProperty("webdriver.gecko.driver", A.A.CWD + "\\geckodriver.exe"); 
                System.setProperty("webdriver.ie.driver", A.A.CWD + "\\IEDriverServer.exe"); 
            }
            if(A.A.WsOS.toLowerCase().contains("mac")){
                System.setProperty("webdriver.chrome.driver", A.A.CWD + "/chromedriver");          
                System.setProperty("webdriver.edge.driver", A.A.CWD + "/msedgedriver");  
                System.setProperty("webdriver.gecko.driver", A.A.CWD + "/geckodriver");
                System.setProperty("webdriver.safari.driver", A.A.CWD + "/safaridriver");
            }
            switch (BROWSER) {
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
//                        if(_Headless){
//                            chrome_op.addArguments("--headless");
//                        }
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
//                        if(_Headless){
//                            edge_op.setCapability( "headless", true);
//                        }
                        
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
//                                //AcceptInsecureCustomer_Earned_Revenue tificates = true,
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
            
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Browser: " + BROWSER + " > " + "d1.manage().deleteAllCookies()", false, ParentTest.createNode("Clear Cookies & Re-start Driver"));
            EX += " - " + "\t" + "Clear Cookies & Re-start Driver" + "\t" + "Current page" + "\t" + "d1.manage().deleteAllCookies()" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += " - " + "\t" + "Clear Cookies & Re-start Driver" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Browser: " + BROWSER + " > " + "d1.manage().deleteAllCookies()", true, ParentTest.createNode("Clear Cookies & Re-start Driver"));
        } 
        sw1.reset();
    }
    protected void Open_Switch_to_2nd_Tab(String NAME, String LINK, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t ="?";
        try {
            ((JavascriptExecutor) d1).executeScript("window.open(arguments[0])", LINK);
            ArrayList<String> tabs = new ArrayList<>(d1.getWindowHandles());
            d1.switchTo().window(tabs.get(1));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />Target URL" + " > " + LINK, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Target URL" + " > " + LINK, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }    
    protected void Close_Current_Tab_switch_To_1st(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            d1.close();
            ArrayList<String> tabs = new ArrayList<>(d1.getWindowHandles());
            d1.switchTo().window(tabs.get(0));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.switchTo().window()", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.switchTo().window()", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Page_URL(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.getCurrentUrl()" + " URL: " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.getCurrentUrl()", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }    
    protected void Navigate_to_URL(String NAME, String URL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            d1.navigate().to(URL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "URL" + "\t" + URL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().to(" + URL + ")", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + URL + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().to(" + URL + ")", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Navigate_Back(String NAME, String FROM, String TO, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            d1.navigate().back();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().back()(" + FROM + "  > " + TO + ")", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().back()(" + FROM + "  > " + TO + ")", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Navigate_Forward(String NAME, String FROM, String TO, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            d1.navigate().forward();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.forward().back()(" + FROM + "  > " + TO + ")", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().forward()(" + FROM + "  > " + TO + ")", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Refresh(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            d1.navigate().refresh();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().refresh()", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().refresh()", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void To_Top(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();  
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.HOME).perform();
            _p++;
            EX += _t + "\t" + "Move to page Top" + "\t" + "Current page" + "\t" + "Scroll bar at top" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.sendKeys(Keys.HOME).perform())", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Top" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.sendKeys(Keys.HOME).perform())", true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void To_Bottom(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.END).perform();
            _p++; 
            EX += _t + "\t" + "Move to page Bottom" + "\t" + "Current page" + "\t" + "Scroll bar at Bottom" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.sendKeys(Keys.END).perform())", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Bottom" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.sendKeys(Keys.END).perform())", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Swith_to_Frame(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            switch (BY) {
                case "defaultContent":
                    d1.switchTo().defaultContent(); 
                    break;
                case "xpath":
                    d1.switchTo().frame(d1.findElement(By.xpath(PATH)));
                    break;
                case "css":
                    d1.switchTo().frame(d1.findElement(By.cssSelector(PATH)));  
                    break;
                case "className":
                    d1.switchTo().frame(d1.findElement(By.className(PATH)));
                    break;
                case "id":
                    d1.switchTo().frame(d1.findElement(By.id(PATH)));
                    break;
                case "tagName":
                    d1.switchTo().frame(d1.findElement(By.tagName(PATH)));
                    break;
                case "name":
                    d1.switchTo().frame(d1.findElement(By.name(PATH)));
                    break;
                case "linkText":
                    d1.switchTo().frame(d1.findElement(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    d1.switchTo().frame(d1.findElement(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            EX += _t + "\t" + NAME + "\t" + BY  + "\t" + PATH + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.switchTo().frame())", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.switchTo().frame())", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Scroll_XY(String NAME, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("window.scrollBy(" + X + "," + Y + ")", "");
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />\"window.scrollBy(" + X + "," + Y + ")", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />window.scrollBy(" + X + "," + Y + ")", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }    

    protected void Wait_For_Element_By_Path_Presence(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.tagName(PATH)));
                    break;                     
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.presenceOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Wait_For_All_Elements_InVisibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {          
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.xpath(PATH))));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.cssSelector(PATH))));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.className(PATH))));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.id(PATH))));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.tagName(PATH))));
                    break;
                case "name":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.name(PATH))));
                    break;                   
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.linkText(PATH))));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfAllElements(d1.findElements(By.partialLinkText(PATH))));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Wait_For_Element_By_Path_InVisibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.tagName(PATH)));
                    break;
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Scroll_to_Element(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", E);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />executeScript(\"arguments[0].scrollIntoView(true)", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />executeScript(\"arguments[0].scrollIntoView(true)", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Scroll_to_WebElement(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();      
 
        FAIL = false;
        try {         
            switch (BY) {
             case "xpath":
                 e = d1.findElement(By.xpath(PATH));
                 break;
             case "css":
                 e = d1.findElement(By.cssSelector(PATH));
                 break;
             case "className":
                 e = d1.findElement(By.className(PATH));
                 break;
             case "id":
                 e = d1.findElement(By.id(PATH));
                 break;
             case "tagName":
                 e = d1.findElement(By.tagName(PATH));
                 break;
             case "name":
                 e = d1.findElement(By.name(PATH));
                 break;
              case "linkText":
                 e = d1.findElement(By.linkText(PATH));
                 break;
             case "partialLinkText":
                 e = d1.findElement(By.partialLinkText(PATH));
                 break;
             default:
                 break;
            }            
            ((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", e);
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Scroll OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    
    protected void Move_to_Element(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.moveToElement(E).perform()", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.moveToElement(E).perform()", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 
    protected void Click_out_of_Element(String NAME, WebElement E, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            int XX = E.getLocation().x;
            int YY = E.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(d1);
            action.moveToElement(E, XX, YY).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.moveToElement(E, XX, YY).click().perform()", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.moveToElement(E, XX, YY).click().perform()", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 
    protected void Move_to_Element_By_Path(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.moveToElement(e).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Move_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            
            int XX = e.getLocation().x;
            int YY = e.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(d1);
            action.moveToElement(e, XX, YY).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move '" + DIRECTION + "' of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Click_out_of_Element_By_Path(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }

            int XX = e.getLocation().x;
            int YY = e.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + e.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + e.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }            
            
            Actions action = new Actions(d1);
            action.moveToElement(e, XX, YY).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Text_Found(String NAME, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t ="?";
        try {
            e = d1.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = "Found";
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            t = "Not Found";
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Not Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(NAME));
        }
        _p++;
        sw1.reset();
    }
    protected void Find_Text(String NAME, String VAL, Boolean EXPECTED,ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "Not Found";
        try {
            e = d1.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = e.getText();
            if(t.trim().equals("")){
                t = e.getAttribute("textContent");
            }
            if(t != null && t.trim() != ""){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "Not Found";
            }
            if(EXPECTED){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + "Text Found" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL + " Expected: " + EXPECTED + " Text: " + t, false, ParentTest.createNode(NAME));
            } else {
                _f++; FAIL = false; 
                EX += _t + "\t" + NAME + "\t" + "Unexpected Text Found" + "\t" + t + "\t" + "FAIL" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + "Found Unexpected Text: " + t;
                Log_Html_Result("FAIL", "Found Unexpected Text"  + "<br />Element locator: " + VAL + " Expected: " + EXPECTED + " Text: " + t, true, ParentTest.createNode(NAME));                
            }
        } catch(Exception ex){
            if(EXPECTED){
                _f++; FAIL = true; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err  + "<br />Element locator: " + VAL + " Expected: " + EXPECTED, true, ParentTest.createNode(NAME));                
            } else {
                _p++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found As Expected" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Text Not Found As Expected", false, ParentTest.createNode(NAME));                
            }
        }
        sw1.reset();
    }    

    protected void Element_E1_Find(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            switch (BY) {
                case "xpath":
                    e1 = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e1 = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e1 = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e1 = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e1 = d1.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    e1 = d1.findElement(By.name(PATH));                
                    break;
                 case "linkText":
                    e1 = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e1 = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_E2_Find(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            switch (BY) {
                case "xpath":
                    e2 = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e2 = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e2 = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e2 = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e2 = d1.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    e2 = (WebElement) (By.name(PATH));                   
                case "linkText":
                    e2 = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e2 = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Click(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH));
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.moveToElement(e).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            switch (BY) {
                case "xpath":
                    t = d1.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = d1.findElement(By.cssSelector(PATH)).getText();   
                    break;
                case "className":
                    t = d1.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = d1.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = d1.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = d1.findElement(By.name(PATH)).getText();                    
                    break;
                case "linkText":
                    t = d1.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = d1.findElement(By.partialLinkText(PATH)).getText();
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t.replace("\r\n", " ").replace("\n", " ") + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Text: " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Attribute(String NAME, String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        t = ""; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            switch (BY) {
                case "xpath":
                    t = d1.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = d1.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = d1.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = d1.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = d1.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = d1.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = d1.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = d1.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
                    break;
                default:
                    break;
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + VAL, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_Select_Copy(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            } 
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;                    
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            
            if(A.A.WsOS.toLowerCase().contains("windows")){ 
                e.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy                 
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }
            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex) {
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Copy(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            }
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.doubleClick(e).perform();
            if(A.A.WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy             
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }            

            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();  
 
        FAIL = false;
        t = "not found!";
        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = null;
            try{
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null); // 900009
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            }
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(d1);
            action.doubleClick(e).perform();
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                e.sendKeys(Keys.chord(Keys.CONTROL, "v")); //paste       
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                e.sendKeys(Keys.chord(Keys.COMMAND, "v")); //paste                
            }               
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + " > " + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Input_Select_Clear(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset(); 
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH)); 
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(A.A.WsOS.toLowerCase().contains("windows")){
                e.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it                  
            }else{
                e.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                e.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }

            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_Enter(String NAME, String BY, String PATH, String VAL, boolean HIDE, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            if(null != BY) switch (BY) {
                case "xpath":
                    e = d1.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e = d1.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    e = d1.findElement(By.className(PATH)); 
                    break;
                case "id":
                    e = d1.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e = d1.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e = d1.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    e = d1.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e = d1.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            e.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " Enter: " + VAL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH + " Enter: " + VAL, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }

    protected void Element_Text(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "?";
        try {
            t = E.getText();
            if(t.trim().equals("")){
                t = E.getAttribute("textContent");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Text: " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Text_Clear(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {      
            if(A.A.WsOS.toLowerCase().contains("windows")){
                E.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it              
            }else{
                E.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }   
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Text cleared"+ "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Text_Enter(String NAME, WebElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            E.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Enter: " + VAL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Attribute(String NAME, WebElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {       
        t = "empty";FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        try {
            t = E.getAttribute(VAL);
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " "); 
            } else {
                t = "null";
            }
            if (t.contains("img-default")) {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Attribute: " + t, false, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Attribute: " + t, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = false;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Click(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Element_Child_List_L1(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        if(L1 != null) {L1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L1 = E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L1 = E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L1 = E.findElements(By.className(PATH));
                    break;
                case "id":
                    L1 = E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L1 = E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L1 = E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L1 = E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L1 = E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L1.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" +  BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_List_L2(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        if(L1 != null) {L1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L2 = E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L2 = E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L2 = E.findElements(By.className(PATH));
                    break;
                case "id":
                    L2 = E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L2 = E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L2 = E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L2 = E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L2 = E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L2.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L2.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_E2(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e2 = E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e2 = E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e2 = E.findElement(By.className(PATH));
                    break;
                case "id":
                    e2 = E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e2 = E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e2 = E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    e2 = E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e2 = E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element (e2) found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "e2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "?";
        try {
            switch (BY) {
                case "xpath":
                    t = E.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = E.findElement(By.cssSelector(PATH)).getText();
                    break;
                case "className":
                    t = E.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = E.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = E.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = E.findElement(By.name(PATH)).getText();
                    break;
                case "linkText":
                    t = E.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = E.findElement(By.partialLinkText(PATH)).getText();
                    break;
                default:
                    break;
            }
            if(t.trim().equals("")){
                t = E.getAttribute("textContent");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++;
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text_Enter(String NAME, WebElement E, String BY, String PATH, String VAL, boolean HIDE, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        WebElement _e = null;
        try {
            switch (BY) {
                case "xpath":
                    _e = E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    _e = E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    _e = E.findElement(By.className(PATH));
                    break;
                case "id":
                    _e = E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    _e = E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    _e = E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    _e = E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    _e = E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _e.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }            
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void Element_Child_Click(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    E.findElement(By.xpath(PATH)).click();
                    break;
                case "css":
                    E.findElement(By.cssSelector(PATH)).click();
                    break;
                case "className":
                    E.findElement(By.className(PATH)).click();
                    break;
                case "id":
                    E.findElement(By.id(PATH)).click();
                    break;
                case "tagName":
                    E.findElement(By.tagName(PATH)).click();
                    break;
                case "name":
                    E.findElement(By.name(PATH)).click();
                    break;
                case "linkText":
                    E.findElement(By.linkText(PATH)).click();
                    break;
                case "partialLinkText":
                    E.findElement(By.partialLinkText(PATH)).click();
                    break;
                default:
                    break;
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++;
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Attribute(String NAME, WebElement E, String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "";
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    t = E.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = E.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = E.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = E.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = E.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = E.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = E.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = E.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
                    break;
                default:
                    break;
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            if (t.contains("placeholder") || t.contains("adminpanel.compassdigital.org") || t.contains("img-default"))
            {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Attribute: " + t, false, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " Attribute: " + t, false, ParentTest.createNode(NAME));
            } 
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void List_L0(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        if(L0 != null) {L0.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L0 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L0 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L0 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L0 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L0 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L0 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L0 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L0 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L0.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L0.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L0.size(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L0.size(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void List_L1(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        if(L1 != null) {L1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L1 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L1 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L1 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L1 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L1 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L1 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L1 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L1 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L1.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void List_L2(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
        // L2 specific for Empty List just - PASS in ether case and report size, not - WARN 
        FAIL = false;
        if(L2 != null) {L2.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L2 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L2 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L2 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L2 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L2 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L2 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L2 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L2 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void List_L3(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
        // L3 specific for Login Messages - if No "will expire" or "locked" - PASS, otherwise - WARN > procees to FAIl in Execution
        FAIL = false;
        if(L3 != null) {L3.clear();}
        try {
            switch (BY) {
                case "xpath":
                    L3 = d1.findElements(By.xpath(PATH));
                    break;
                case "css":
                    L3 = d1.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    L3 = d1.findElements(By.className(PATH));
                    break;
                case "id":
                    L3 = d1.findElements(By.id(PATH));
                    break;
                case "tagName":
                    L3 = d1.findElements(By.tagName(PATH));
                    break;
                case "name":
                    L3 = d1.findElements(By.name(PATH));
                    break;
                case "linkText":
                    L3 = d1.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    L3 = d1.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(L3.isEmpty()){ // L3 specific for Login Messages - if No "will expire" or "locked" - PASS, otherwise - WARN > procees to FAIl in Execution
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "PASS" + "\t" + "L3.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L3.size(), false, ParentTest.createNode(NAME));
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L3.size() + " item(s) (L3)" + "\t" + "WARN" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L3.size(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L3" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void List_Child_E1_By_Path(String NAME, List<WebElement> L, int I, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e1 = L.get(I).findElement(By.xpath(PATH));
                    break;
                case "css":
                    e1 = L.get(I).findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e1 = L.get(I).findElement(By.className(PATH));
                    break;
                case "id":
                    e1 = L.get(I).findElement(By.id(PATH));
                    break;
                case "tagName":
                    e1 = L.get(I).findElement(By.tagName(PATH));
                    break;
                case "name":
                    e1 = L.get(I).findElement(By.name(PATH));
                    break;
                case "linkText":
                    e1 = L.get(I).findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e1 = L.get(I).findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "List index " + I + " > " + PATH + "\t" + "element found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "List index " + I + " > " + PATH + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }

    protected void List_TR_TDs(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        String dt;
        String STAT = "Status: ?";
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            int TDS = X.size();
            for (int k = 0; k < TDS; k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            if(t.endsWith(" > ")){
                t = t.substring(0, t.length() - 3); //   =========================   DEBUG
            } 

            if(NAME.startsWith("Station") && !t.toLowerCase().contains("no data") && TDS == 5 ){ // <<< td[5] - Status
                //   check status 
                STAT = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]")).getAttribute("class").trim();
                if(!STAT.equals("") && STAT.contains("mdi-eye-off")){
                    STAT = "Hidden in App";         //   v-icon mdi mdi-eye-off theme--light none--text
                } else {
                    STAT = "Display in App";        //   v-icon mdi mdi-eye theme--light
                }
                t = t + STAT;
            }
            
            if(NAME.startsWith("Modifier Group") && !t.toLowerCase().contains("no data")){ //   check status 
                STAT = X.get(X.size() - 1).findElement(By.xpath("//input[@role='checkbox']")).getAttribute("aria-checked").trim();
                t = t + STAT;
            }       
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": td(s) >>" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Text: " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": td(s)" + "\t" + "table data" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void List_TR_THs(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("th"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            if(t.endsWith(" > ")){
                t = t.substring(0, t.length() - 3); //   =========================   DEBUG
            } 
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": th(s) >>" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />List[" + I + "] " +  " > " + t , false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": th(s)" + "\t" + "table header" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Scroll_to_Day(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            e = L.get(I);
            Actions action = new Actions(d1);
            action.moveToElement(e).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + "Day " + I + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + I + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Day_Snedule(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        String Day = "";
        String Open = " -- ";
        String Close = " -- ";
        String _24 = "false";
        try {
            Day = L.get(I).findElement(By.xpath(".//p[contains(@class, 'WeekdayLabel')]")).getText();
            String X1 = L.get(I).findElement(By.cssSelector("[aria-label='24 Hour Service']")).getAttribute("aria-checked");
            String X2 = L.get(I).findElement(By.cssSelector("[aria-label='Closed All Day']")).getAttribute("aria-checked");
            
            if("true".equals(X1)){
                _24 = "24 Hour Service";  
                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            } else if ("true".equals(X2)){
                _24 = "Closed All Day"; 
                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            } else {
                _24 = "";
                e = L.get(I).findElement(By.cssSelector("[aria-label='Opens']"));
                e.click(); 
                
                Opens = e.findElements(By.xpath("/html/body/div/div[14]/div/div/div"));
                for (WebElement Open1 : Opens) {
                    if(Open1.getAttribute("class").contains("primary--text")){
                        Open = Open1.getText() + "|";
                        break;
                    }
                }
                if(Open.endsWith("|")){
                    Open = "Opens: " + Open.replace("|","");
                } else{
                    Open = "Opens: " + "not in View";
                }
                
                e = L.get(I).findElement(By.cssSelector("[aria-label^='Closes']"));
                e.click(); 
                Closes = e.findElements(By.xpath("/html/body/div/div[13]/div/div/div")); // /html/body/div/div[14]/div/div/div[1]
                for (WebElement Close1 : Closes) {
                    if(Close1.getAttribute("class").contains("primary--text")){
                        Close = Close1.getText() + "|";
                        break;
                    }
                } 
                if(Close.endsWith("|")){
                    Close = "Closes: " + Close.replace("|","");
                    // class="nextDayLabel" 
                } else{
                    Close = "Closes: " + "not in View";
                }

                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + (I + 1) + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Time_Enter(String NAME, List<WebElement> L, int I,String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
//            switch (BY) {
//                case "xpath":
//                    t = L.get(I).findElement(By.xpath(PATH)).getAttribute(VAL); 
//                    break;
//                case "css":
//                    t = L.get(I).findElement(By.cssSelector(PATH)).getAttribute(VAL); 
//                    break;
//                default:
//                    break;
//            }
            e = L.get(I).findElement(By.cssSelector(PATH));
            e.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }

    protected void Brand_Status(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t ="?";
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            t = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]")).getAttribute("class").trim();
            if(!t.equals("") && t.contains("mdi-eye-off")){
                t = "Hidden in App";         //   v-icon mdi mdi-eye-off theme--light none--text
            } else {
                t = "Display in App";        //   v-icon mdi mdi-eye theme--light
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }     
    protected void Brand_Status_Click(String NAME, List<WebElement> L, int I,  ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            e = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]"));
            Actions action = new Actions(d1);
            action.moveToElement(e).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off" + "\t" + "action.moveToElement(e).click().perform()" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }     
    protected void Menu_Snedule(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            EX += _t + "\t" + NAME + "\t" + "Row Index " + I + ": td(s)" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Row" + " Index " + I + ": td(s)" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Call_API_Auth(String NAME, String URL, boolean EXPECT_OK, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
            httpget.setHeader("Authorization",  "Bearer " + A.A.AP3_TKN);
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
            _p++; 
            API_Response_Body = httpclient.execute(httpget, responseHandler);
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            EX += _t + "\t == " + NAME + "\t" + URL + "\t" + "Call successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err + "<br />URL: " +  URL, true, ParentTest.createNode(NAME));                
            } else {
                _p++; 
                err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(NAME));
            }
        } 
        sw1.reset();
    }
    protected void Call_API(String NAME, String URL, boolean EXPECT_OK, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        String RR = "";
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
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
            _p++;
            API_Response_Body = httpclient.execute(httpget, responseHandler);
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            EX += _t + "\t == " + NAME + "\t" + URL + "\t" + "Call successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err + "<br />URL: " +  URL, true, ParentTest.createNode(NAME));                
            } else {
                _p++; 
                err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(NAME));
            }
        } 
        sw1.reset();
    }
    protected void API_Body_Contains(String NAME, String VAL, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        boolean FOUND;
        try {
            FOUND = API_Response_Body.contains(VAL);
            if(FOUND){
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(NAME));
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - not expected" + "\t" + "FAIL" + "\t" + "not Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(NAME));
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - expected" + "\t" + "FAIL" + "\t" + "Not Found - Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(NAME));
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(NAME));
                }                                    
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Value: " + VAL, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    
    protected void Calendar_API_Closure(String NAME, String C_Name, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(C_Name)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";    
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + "Closure Title: " + C_Name + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Brand_API_Hours(String NAME, String TARGET, String From, String To, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String DAY = TARGET.substring(TARGET.length() - 1).trim();
        String from_to = "";
        int _start = 0;
        int _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            if(NAME.contains("Service Hours")){
                JSONArray Hours = json.getJSONArray("hours");
                for (int i = 0; i < Hours.length(); i++) {
                    JSONObject hours = Hours.getJSONObject(i); 
                    JSONObject day = hours.getJSONObject("day");
                    if(hours != null){
                        from_to = hours.getString("hours");
                        _start = day.getInt("start");
                        _end = day.getInt("end");
                        if(_start == Double.parseDouble(DAY)){
                            break;            
                        }
                    }                  
                }                
            }
            if(NAME.contains("Delivery Hours")){
                JSONArray Hours = json.getJSONArray("deliveryHours");
                for (int i = 0; i < Hours.length(); i++) {
                    JSONObject hours = Hours.getJSONObject(i); 
                    JSONObject day = hours.getJSONObject("day");
                    if(hours != null){
                        from_to = hours.getString("hours");
                        _start = day.getInt("start");
                        _end = day.getInt("end");
                        if(_start == Double.parseDouble(DAY)){
                            break;            
                        }
                    }                  
                }                
            }
            if(from_to.length() == 11){
                String _From = from_to.substring(0,5);
                String _To = from_to.substring(6);

                ZoneOffset _offset = OffsetDateTime.now( ZoneId.of(TZone)).getOffset();  
                Duration z_From = Duration.parse("PT" + _From.replace(":", "H") + "M");
                z_From = z_From.plusSeconds(_offset.getTotalSeconds());
                Duration z_To = Duration.parse("PT" + _To.replace(":", "H") + "M");
                z_To = z_To.plusSeconds(_offset.getTotalSeconds());

                String Z_From = String.format("%02d:%02d", z_From.toHours(), z_From.minusHours(z_From.toHours()).toMinutes());
                String Z_To = String.format("%02d:%02d", z_To.toHours(), z_To.minusHours(z_To.toHours()).toMinutes());
                Date CF = new SimpleDateFormat("hh:mm a", Locale.US).parse(From.replace("AM", " AM").replace("PM", " PM"));  
                Date DF = new SimpleDateFormat("hh:mm", Locale.US).parse(Z_From);
                Date CT = new SimpleDateFormat("hh:mm a", Locale.US).parse(To.replace("AM", " AM").replace("PM", " PM"));
                Date DT = new SimpleDateFormat("hh:mm", Locale.US).parse(Z_To);

                if(CF.compareTo(DF) == 0 && CT.compareTo(DT) == 0){                
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "AP3 change: " + From + "-" + To + "\t" + Z_From + "-" + Z_To + " TZone: " + TZone + " > UTC: " + _From + "-" + _To + " start:" + _start + ", end:" + _end + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(NAME));
                } else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "AP3 change: " + From + "-" + To + "\t" + Z_From + "-" + Z_To + " TZone: " + TZone + " > UTC: " + _From + "-" + _To + " start:" + _start + ", end:" + _end + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                                    
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }else{
                _f++; 
                EX += _t + "\t == " + NAME + "\t" + "Wrong From - To Format" + "\t" + from_to + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                                                    
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "Day " + DAY + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void Brand_API_Is(String NAME, String TARGET, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        boolean IS_YES = false;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONObject IS = json.getJSONObject("is");

            if(TARGET.startsWith("delivery_supported") && IS.getBoolean("delivery_supported")) {
                IS_YES = true;
            }
            if(TARGET.startsWith("pickup_supported") && IS.getBoolean("pickup_supported")) {
                IS_YES = true;
            }

            if(IS_YES){
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(NAME));
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Not Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(NAME));
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(NAME));
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Not Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(NAME));
                }                                    
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "*_supported" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Value: " + TARGET, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }

    protected void Calendar_API_Pickup(String NAME, String DAY, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       

        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(DAY)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY+ "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";    
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";  
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }

        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Calendar_API_Delivey(String NAME, String DAY, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        long _start = 0;
        long _end = 0; 
        boolean FOUND;
        try {
            JSONObject json = new JSONObject(API_Response_Body);
            JSONArray events = json.getJSONArray("events");

            for (int i = 0; i < events.length(); i++) {
                JSONObject event = events.getJSONObject(i);
                if(event.has("data") && event.has("schedule")){
                    JSONObject data = event.getJSONObject("data");
                    JSONObject schedule = event.getJSONObject("schedule");
                    if(data.has("calendar") && "holiday".equals(data.getString("calendar")) && data.getString("title").equals(DAY)){
                        _start = schedule.getLong("start");
                        _end = schedule.getLong("end");
                        break;
                    }                    
                }
            }
            
            if(_start != 0 && _end != 0 && EXPECTED){
                java.util.Date S = new java.util.Date((long)_start);
                java.util.Date E = new java.util.Date((long)_end);
                if(EXPECTED){
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + S + " - " + E + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY+ "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }

        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void File_Find(String NAME, String DIR, String F_NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        try {
            File folder = new File(DIR); 
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.getName().contains(F_NAME)) {
                    t = file.getName();
                    break;
                }
            }
            if("".equals(t)){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + F_NAME + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + "Delete the file after test" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void File_Read(String NAME, String DIR, String F_NAME, String CHECK, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        t = "";
        try {
            File folder = new File(DIR); 
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.getName().contains(F_NAME)) {
                    t = file.getName();
                    break;
                }
            }
            if("".equals(t)){
                _f++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + F_NAME + "\t" + "FAIL" + "\t" + "File not found";                
                Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
            }else{
                if("User_Count".equals(CHECK)){
                    ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(DIR + File.separator + t), StandardCharsets.UTF_8));
                    if(lines.size() == Double.parseDouble(VAL) + 1){
                        _p++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "PASS" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                             
                        Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
                    } else{
                        _w++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "WARN" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                            
                        Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
                    }
                }
                if("Site_Count".equals(CHECK)){
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void File_Delete(String NAME, String DIR, String F_NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
        try {
            File xx = new File(DIR + File.separator + F_NAME);
            if (xx.exists()) {
                xx.delete();     
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    } 

    protected void PressEnter(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();      
 
        FAIL = false;
        try {
            E.sendKeys(Keys.chord(Keys.ENTER)); //select all text in textbox
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Enter key presses"+ "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    
    protected void SecondaryMetric_Calculation(String NAME, double var1, double var2, double var3, ExtentTest ParentTest, String JIRA) throws IOException {
	String status; 
        t = "";
         _t++; 
	try {
            double val = (double) var1 / var2 * 100;
            double actVal = Math.round(val * 100.0) / 100.0;

            if (actVal == var3) {
                t = "Actual value - " + actVal + " is matching with expected value - " + (double) var3;
                status = "PASS";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + t, false, ParentTest.createNode(NAME));
                _p++;
            } else {
                t = "Actual value - " + actVal + " is not matching with expected value - " + (double) var3;
                status = "FAIL";
                Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + t, true, ParentTest.createNode(NAME));  
                _f++;
            }
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + t + "\t" + status + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";			
        } catch (Exception ex) {
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err + "\t" + " - " + "\t" + " - " + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + t, true, ParentTest.createNode(NAME));
	}  
    }

    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV_D_RANGES;
    private javax.swing.JTable DV_D_Variants;
    private javax.swing.JTable DV_METRICS;
    private javax.swing.JTable DV_QA;
    private javax.swing.JCheckBox _account_manager;
    private javax.swing.JCheckBox _all_data;
    private javax.swing.JCheckBox _drilldown;
    private javax.swing.JCheckBox _headless;
    private javax.swing.JCheckBox _insights;
    private javax.swing.JCheckBox _invalid_login;
    private javax.swing.JCheckBox _login;
    private javax.swing.JCheckBox _logout;
    private javax.swing.JCheckBox _metric_data;
    private javax.swing.JCheckBox _metrics_selection;
    private javax.swing.JCheckBox _password;
    private javax.swing.JCheckBox _sanity;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblDates;
    private javax.swing.JLabel lblDates1;
    private javax.swing.JLabel lblMetrics;
    private javax.swing.JLabel lblSITES10;
    private javax.swing.JLabel lblSITES11;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JLabel lblTestData;
    private javax.swing.JSpinner nWaitElement;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JTextField txtAdmin_ID;
    private javax.swing.JTextField txtAdmin_PW;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtSlackCh;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
