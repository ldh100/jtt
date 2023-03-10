package WO;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.base.Stopwatch;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Dimension;
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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WO_GUI extends javax.swing.JInternalFrame {
    public WO_GUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSITES = new javax.swing.JLabel();
        lblBRANDS = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        lblSITES4 = new javax.swing.JLabel();
        txtMobile_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtMobile_PW = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        nShowPage = new javax.swing.JSpinner();
        nWaitElement = new javax.swing.JSpinner();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES7 = new javax.swing.JLabel();
        lblSITES9 = new javax.swing.JLabel();
        lblSITES10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _login = new javax.swing.JCheckBox();
        _account_info = new javax.swing.JCheckBox();
        _order_status = new javax.swing.JCheckBox();
        _edit_item = new javax.swing.JCheckBox();
        _order_history = new javax.swing.JCheckBox();
        _place_delivery_order = new javax.swing.JCheckBox();
        _forgot_password = new javax.swing.JCheckBox();
        _logout = new javax.swing.JCheckBox();
        lblSITES8 = new javax.swing.JLabel();
        _place_pickup_order = new javax.swing.JCheckBox();
        _new_user = new javax.swing.JCheckBox();
        _order_email = new javax.swing.JCheckBox();
        _explore_brand_menu = new javax.swing.JCheckBox();
        _promo = new javax.swing.JCheckBox();
        txtPromo = new javax.swing.JTextField();
        lblSITES12 = new javax.swing.JLabel();
        txtMplan = new javax.swing.JTextField();
        _mplan = new javax.swing.JCheckBox();
        _account_password = new javax.swing.JCheckBox();
        _account_payments = new javax.swing.JCheckBox();
        _support = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cmbBrow = new javax.swing.JComboBox<>();
        btnRun = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFails = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        _headless = new javax.swing.JCheckBox();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES11 = new javax.swing.JLabel();
        lblSITES13 = new javax.swing.JLabel();
        lblSITES14 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        cmbApp = new javax.swing.JComboBox<>();
        _slack = new javax.swing.JCheckBox();
        lblSITES16 = new javax.swing.JLabel();
        txtSlackCh = new javax.swing.JTextField();
        _remote = new javax.swing.JCheckBox();
        _mobile = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Web Ordering >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("WO"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setVisible(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblSITES.setText("Sites");
        lblSITES.setAlignmentX(0.5F);

        lblBRANDS.setText("Selected Site > Brands");
        lblBRANDS.setName("lblBRANDS"); // NOI18N

        DV1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV1.setCellSelectionEnabled(true);
        DV1.setGridColor(java.awt.SystemColor.windowBorder);
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
        DV1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        DV2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV2.setCellSelectionEnabled(true);
        DV2.setGridColor(java.awt.SystemColor.windowBorder);
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
        lblSITES4.setText("Existing Mobile/Web User Email");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);

        txtMobile_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_ID.setText("App_User@?.?");

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("< Password");
        lblSITES6.setAlignmentX(0.5F);

        txtMobile_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_PW.setText("password");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Wait (sec):"));

        nShowPage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nShowPage.setModel(new javax.swing.SpinnerNumberModel(0.2d, 0.2d, 2.0d, 0.2d));
        nShowPage.setAutoscrolls(true);
        nShowPage.setName("nShowPage"); // NOI18N

        nWaitElement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitElement.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 0.5d));
        nWaitElement.setName("nWaitElement"); // NOI18N

        nWaitLoad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitLoad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 5.0d, 60.0d, 5.0d));
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
                .addGap(0, 0, 0)
                .addComponent(lblSITES7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nShowPage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblSITES10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(nWaitElement, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblSITES9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nWaitLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Scope"));
        jPanel1.setToolTipText("");
        jPanel1.setDoubleBuffered(false);
        jPanel1.setName("Scope"); // NOI18N

        _login.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _login.setSelected(true);
        _login.setText("Existing User (EU) Login ");
        _login.setEnabled(false);
        _login.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _login.setRequestFocusEnabled(false);

        _account_info.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _account_info.setText("Account Information");
        _account_info.setContentAreaFilled(false);
        _account_info.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _account_info.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _order_status.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _order_status.setText("Order Status");
        _order_status.setEnabled(false);
        _order_status.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _order_status.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _order_status.setRequestFocusEnabled(false);

        _edit_item.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _edit_item.setText("Edit / Remove Item");
        _edit_item.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _edit_item.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _edit_item.setRequestFocusEnabled(false);

        _order_history.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _order_history.setText("Order History");
        _order_history.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _order_history.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _order_history.setRequestFocusEnabled(false);

        _place_delivery_order.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _place_delivery_order.setText("Place Delivery Order");
        _place_delivery_order.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _place_delivery_order.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _place_delivery_order.setRequestFocusEnabled(false);

        _forgot_password.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _forgot_password.setText("Forgot Password > Reset");
        _forgot_password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _forgot_password.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _forgot_password.setRequestFocusEnabled(false);

        _logout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _logout.setSelected(true);
        _logout.setText("Logout");
        _logout.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _logout.setRequestFocusEnabled(false);

        lblSITES8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES8.setText("Promo Code");
        lblSITES8.setAlignmentX(0.5F);

        _place_pickup_order.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _place_pickup_order.setText("Place Pickup Order");
        _place_pickup_order.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _place_pickup_order.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _place_pickup_order.setRequestFocusEnabled(false);

        _new_user.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _new_user.setText("New User (NU)");
        _new_user.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _new_user.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _new_user.setRequestFocusEnabled(false);

        _order_email.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _order_email.setText("Order Email Confirmation");
        _order_email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _order_email.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _order_email.setRequestFocusEnabled(false);

        _explore_brand_menu.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _explore_brand_menu.setSelected(true);
        _explore_brand_menu.setText("Explore Brand Menu");
        _explore_brand_menu.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _explore_brand_menu.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _explore_brand_menu.setRequestFocusEnabled(false);

        _promo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _promo.setText("Promo");
        _promo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _promo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _promo.setRequestFocusEnabled(false);

        txtPromo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtPromo.setText("compassunlimited");

        lblSITES12.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES12.setText("Meal Plan Name");
        lblSITES12.setAlignmentX(0.5F);

        txtMplan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMplan.setText("None");

        _mplan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _mplan.setText("MPlan");
        _mplan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _mplan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _mplan.setRequestFocusEnabled(false);

        _account_password.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _account_password.setText("Account Change Password");
        _account_password.setContentAreaFilled(false);
        _account_password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _account_password.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _account_payments.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _account_payments.setText("Account Payments");
        _account_payments.setContentAreaFilled(false);
        _account_payments.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _account_payments.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _support.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _support.setSelected(true);
        _support.setText("Support/Support Desk");
        _support.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _support.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _support.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_explore_brand_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_edit_item, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_place_pickup_order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_place_delivery_order, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_order_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_order_history, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_order_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_account_info, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_account_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_account_payments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(_forgot_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_support, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblSITES8)
                .addGap(33, 33, 33)
                .addComponent(_promo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSITES12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(_mplan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMplan, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_new_user, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_account_info, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_explore_brand_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_account_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_edit_item, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_account_payments, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_place_pickup_order, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(_place_delivery_order, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_order_email, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_order_history, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_forgot_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_order_status, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_support, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSITES8)
                    .addComponent(_promo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSITES12)
                        .addComponent(_mplan, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPromo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMplan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cmbBrow.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
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

        btnFails.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnFails.setText("Show Fails");
        btnFails.setEnabled(false);
        btnFails.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnFails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFailsMouseClicked(evt);
            }
        });

        btnExcel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExcel.setText("Excel Rep");
        btnExcel.setEnabled(false);
        btnExcel.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcelMouseClicked(evt);
            }
        });

        _headless.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _headless.setText("Headless <<");
        _headless.setToolTipText("");
        _headless.setRequestFocusEnabled(false);

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });

        lblSITES11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES11.setText("Browser:");
        lblSITES11.setAlignmentX(0.5F);

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });

        _slack.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _slack.setText("Report to Slack");
        _slack.setToolTipText("");
        _slack.setRequestFocusEnabled(false);

        lblSITES16.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES16.setText("Slack Shannel:");
        lblSITES16.setAlignmentX(0.5F);
        lblSITES16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSlackCh.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtSlackCh.setText("xtt_test");

        _remote.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _remote.setText("Remote <<");
        _remote.setToolTipText("");
        _remote.setRequestFocusEnabled(false);

        _mobile.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _mobile.setText("Mobile View <<");
        _mobile.setToolTipText("");
        _mobile.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(_slack, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblSITES16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtSlackCh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSITES11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(cmbBrow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFails, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_headless, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_remote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(_mobile)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSlackCh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_slack, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSITES11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBrow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFails, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(_headless, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(_remote, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBRANDS, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSITES4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(lblSITES6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblSITES, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSITES)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES4)
                            .addComponent(lblSITES6))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBRANDS)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declaration">
    protected String JOB_Name = "";  
    private boolean Zip_Report = true;
    private boolean _Slack = false;
    private String Slack_Channel = "";
    private String Log = "";
    
    private String HTML_Report_Path = null;
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    protected String Report_File;
    private String Report_Date;
    private String Excel_Report_Path;
    
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

    private Duration DD;
    
    private String SQL = ""; 
    protected String Ver = "";
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
    
    protected String SCOPE;
    protected boolean _Headless = false;
    protected boolean _Mobile = false;
    protected boolean _Run_on_Remote = false;  
  
    protected String MOBILE_ID;
    protected String MOBILE_PW;
    
    protected boolean PICKUP;
    protected boolean DELIVERY;  
    

    protected int wdLastRow = -1; 
    protected int d2LastRow = -1; 

    protected boolean CONFIG = false;
    protected String C = "";
    protected String New_ID = "";

    protected DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    protected final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    protected final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    protected String AP3_TKN = "";    

    protected String app = "";
    protected String appId = "";
    protected String SITE = "";
    protected String Site_ID = "";
    protected String BRAND = "";
    protected String Brand_ID = "";

    protected String COUNTRY = "COUNTRY";
    protected String platform = "CDL";
    protected String BaseAPI;
    protected String PROMO = "";
    protected String MPLAN = "";
    protected boolean _New_user = false;
    protected boolean _Explore_brand = false;
    protected boolean _Account_payments = false;
    protected boolean _Account_password = false;
    protected boolean _Account_info = false;

    protected boolean _Order_status = false;
    protected boolean _Order_history = false;
    protected boolean _Edit_item = false;
    protected boolean _Place_pickup_order = false;
    protected boolean _Place_delivery_order = false;
    protected boolean _Order_email = false;
    protected boolean _Forgot_Password = false;       
    protected boolean _Logout = false;
    protected boolean _Promo = false;
    protected boolean _Mplan = false;
    protected boolean _Support = false;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">       
    protected void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (wdLastRow == DV1.getSelectedRow()) {
           return;
        }
        SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        platform = DV1.getValueAt(DV1.getSelectedRow(), 1).toString(); // platform        
        COUNTRY = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 2));
        GUI_Get_Brands(); 
        wdLastRow = DV1.getSelectedRow(); 
    }//GEN-LAST:event_DV1MouseClicked
    protected void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        if(BW2 != null && !BW2.isCancelled()) BW2.cancel(true);
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed
    protected void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if (d2LastRow == DV2.getSelectedRow()) {
           return;
        }
        d2LastRow = DV2.getSelectedRow();   
        BRAND = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 0));
    }//GEN-LAST:event_DV2MouseClicked
    protected void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
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
    protected void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        if(!btnRun.isEnabled()){
            return;
        }
        GUI_Run_Manual();
    }//GEN-LAST:event_btnRunMouseClicked
    protected void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked
    protected void btnFailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFailsMouseClicked
        if(!btnFails.isEnabled()) {return;}
        String R = A.Func.SHOW_FILE(F, "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnFailsMouseClicked
    protected void btnExcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMouseClicked
        if(!btnExcel.isEnabled()) {
            return;
        }
        btnExcel.setEnabled(false);
        Report(true);
        btnExcel.setEnabled(true);
    }//GEN-LAST:event_btnExcelMouseClicked
    protected void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        GUI_Save_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    protected void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            GUI_Load_Env();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    protected void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            app = cmbApp.getSelectedItem().toString();
            if(cmbEnv.getSelectedItem().toString().contains("Staging")){
                url = "https://staging.<APP>app.io/"; 
            } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
                url = "https://dev.<APP>app.io/";
            } else{
                url = "https://<APP>app.io/";
            }
            app = cmbApp.getSelectedItem().toString();
            url = url.replace("<APP>", app.toLowerCase());
            GUI_Get_Sites();
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">    
    protected void Load_Form(){
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
         
//        cmbApp.addItem("Boost");
//        cmbApp.addItem("Canteen");
//        cmbApp.addItem("JJKitchen");
//        cmbApp.addItem("Rogers");
//        cmbApp.addItem("Tacit");
        cmbApp.addItem("Thrive");
        cmbApp.addItem("Boost");   
     
        cmbEnv.addItem("Development");         
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");
        
        cmbEnv.setSelectedIndex(0); // delevopment       
        
        Load = false;
        GUI_Load_Env();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;   
        this.setTitle("Web Ordering Automation Manager");
    }

    protected void GUI_Load_Env(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://staging.<APP>app.io/"; 
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "https://dev.<APP>app.io/";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "https://<APP>app.io/";
        }
        Get_AP3_TKN();
        GUI_Load_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        url = url.replace("<APP>", app.toLowerCase());
        GUI_Get_Sites();       
    }

    protected void GUI_Get_Sites() {
        wdLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        appId = A.Func.App_ID(cmbApp.getSelectedItem().toString(), env);

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
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + appId + "?web=true&expanded=true");         
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
            String id;
            JSONObject addresses;
            JSONObject meta;

            JSONArray Groups = json.getJSONArray("groups");
            for (int i = 0; i < Groups.length(); i++) {
                site = "";
                COUNTRY = "null";
                id = "null";
                addresses = null;
                meta = null;
                platform = "DH";
                JSONObject sites = Groups.getJSONObject(i);
                    if(sites.has("name")){
                        site = sites.getString("name");   
                    } 
                    if(sites.has("id")){
                        id = sites.getString("id");
                    } 
                    if(sites.has("meta")){
                        meta = sites.getJSONObject("meta");
                        if (meta.has("migrated") && meta.getBoolean("migrated")){
                            platform = "CDL migrated";
                        }
                    }              
                    if (id.length() > 50) {
                        platform = "CDL";
                    } 

                    if(sites.has("address")){
                        addresses = sites.getJSONObject("address");
                    }  
                    if(addresses != null && addresses.has("country")){
                        COUNTRY = addresses.getString("country");   
                    }
                    SitesModel.addRow(new Object[]{site, platform, COUNTRY, id});                   
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
            GUI_Get_Brands();
        }
        lblSITES.setText(app + " Sites (" + DV1.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    protected void GUI_Get_Brands() {
        d2LastRow = -1;
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
            //HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + DV1.getValueAt(DV1.getSelectedRow(), 3) + "?web=true&extended=true&nocache=1"); 
            HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + DV1.getValueAt(DV1.getSelectedRow(), 3) + "?non_scan_go=true&nocache=1"); 

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
            if (CONFIG && !"".equals(BRAND.trim()))
            {
                for(int row = 0; row < DV2.getRowCount(); row++) {
                    if(DV2.getValueAt(row, 0).equals(BRAND)){
                        DV2.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
        } 

        d2LastRow = DV2.getSelectedRow();        
        lblBRANDS.setText("Selected Site Brands (" + DV2.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    protected void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM[dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            AP3_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== WO_TKN > ERROR: " + ex.getMessage() + "\r\n");
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
    protected void Report(boolean Open_File){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        if ("".equals(Last_EX.trim()) || "None".equals(Last_EX.trim())){
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            txtLog.append("=== Report > Not Excel" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }   
        try {
            int col = 9; // 8 + 1 new JIRA = 9
            String Top_Row = Last_EX.substring(0, Last_EX.indexOf("\r\n"));        
            String[] lines = Last_EX.substring(Last_EX.indexOf("\r\n") + 2).split(System.getProperty("line.separator"));
            int l = lines.length;
            String[][] Values = new String[l][col];
            int n = 1;
            for (int i = 0; i < l; i++) {
                String[] v = lines[i].split("\t");
                System.arraycopy(v, 0, Values[i], 0, v.length); 
            }
            Report_File = A.Func.fExcel(l, col, Values, "WO_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            txtLog.append("=== Report Excel file:\r\n" + Report_File + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());

        } catch (IOException ex) {
            txtLog.append("=== Report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    protected void LOG_START(){
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
            _insert.setString(3, JOB_Name);
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
    protected void LOG_UPDATE(String LOG){  
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
                    " WHERE [app] = '" + JOB_Name + "' AND [Status] = 'Running' AND [user_id] = '" + A.A.UserID + "' AND [user_ws] = '" + A.A.WsID + "'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, JOB_Name);
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
            _update.setString(15, cmbBrow.getSelectedItem().toString());
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

    protected void GUI_Load_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'WO' AND [env] = '" + env + "'";
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
        String[] lines = C.split("\n");  
        String value;
        try{             
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim(); 
                if(l.contains("Browser: ")) cmbBrow.setSelectedItem(value);
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;
                
                if(l.contains("MOBILE_ID: ")) txtMobile_ID.setText(value);
                if(l.contains("MOBILE_PW: ")) txtMobile_PW.setText(value);

                if(l.contains("SITE: ")) SITE = value;
                if(l.contains("BRAND: ")) BRAND = value;
                
                if(l.contains("nWaitElement: ")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nWaitLoad: ")) nWaitLoad.setValue(Double.parseDouble(value));
                
                if(l.contains("SlackCh: ")) txtSlackCh.setText(value);
                if(l.contains("_slack: ")) _slack.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_zip_report: ")) Zip_Report = Boolean.parseBoolean(value);
                if(l.contains("_run_on_remote: ")) _remote.setSelected(Boolean.parseBoolean(value));

                
                if(l.contains("_headless: ")) _headless.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_mobile: ")) _mobile.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_run_on_remote: ")) _remote.setSelected(Boolean.parseBoolean(value));

                if(l.contains("_new_user: ")) _new_user.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_explore_brand_menu: ")) _explore_brand_menu.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_account_info: ")) _account_info.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_account_password: ")) _account_password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_account_payments: ")) _account_payments.setSelected(Boolean.parseBoolean(value));

                if(l.contains("_order_status: "))  _order_status.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_order_history: "))  _order_history.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_edit_item: "))  _edit_item.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_place_pickup_order: "))  _place_pickup_order.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_place_delivery_order: "))  _place_delivery_order.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_order_email: "))  _order_email.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_account_password: "))  _account_password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_forgot_password: "))  _forgot_password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_logout: "))  _logout.setSelected(Boolean.parseBoolean(value)); 
                if(l.contains("_support: "))  _support.setSelected(Boolean.parseBoolean(value)); 
                if(l.contains("_promo: "))  _promo.setSelected(Boolean.parseBoolean(value));
                if(l.contains("Promo: ")) txtPromo.setText(value); 
                if(l.contains("_mplan: "))  _mplan.setSelected(Boolean.parseBoolean(value));
                if(l.contains("MPlan: ")) txtMplan.setText(value);            
            }  
            CONFIG = true;
            txtLog.append("= LOAD_CONFIG > OK" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            CONFIG = false;
            txtLog.append("= LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    protected void GUI_Save_CONFIG() {
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
            
            C += "SlackCh: " + "#xtt_test" + "\r\n";
            C += "_slack: " + _slack.isSelected() + "\r\n";
            C += "_zip_report: " + "true" + "\r\n";
            
            C += "_headless: " + _headless.isSelected() + "\r\n";  
            C += "_mobile: " + _mobile.isSelected() + "\r\n";  
            C += "_run_on_remote: " + _remote.isSelected() + "\r\n";  
            
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
            C += "COUNTRY: " + COUNTRY + "\r\n";            
            
            C += "MOBILE_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "MOBILE_PW: " + txtMobile_PW.getText().trim()  + "\r\n";
            
            C += "nShowPage: " + nShowPage.getValue() + "\r\n";
            C += "nWaitElement: " + nWaitElement.getValue() + "\r\n";
            C += "nWaitLoad: " + nWaitLoad.getValue()+ "\r\n";

            C += "_new_user: " + _new_user.isSelected() + "\r\n";
            C += "_explore_brand_menu: " + _explore_brand_menu.isSelected() + "\r\n";
            C += "_account_info: " + _account_info.isSelected() + "\r\n";
            C += "_account_payments: " + _account_payments.isSelected() + "\r\n";
            C += "_account_password: " + _account_password.isSelected() + "\r\n";

            C += "_order_status: " + _order_status.isSelected() + "\r\n";
            C += "_order_history: " + _order_history.isSelected() + "\r\n";
            C += "_edit_item: " + _edit_item.isSelected() + "\r\n";
            C += "_place_pickup_order: " + _place_pickup_order.isSelected() + "\r\n";
            C += "_place_delivery_order: " + _place_delivery_order.isSelected() + "\r\n";
            C += "_order_email: " + _order_email.isSelected() + "\r\n";
            C += "_forgot_password: " + _forgot_password.isSelected() + "\r\n";         
            C += "_logout: " + _logout.isSelected() + "\r\n";
            C += "_support: " + _support.isSelected() + "\r\n";
            C += "_promo: " + _promo.isSelected() + "\r\n";
            C += "Promo: " + txtPromo.getText() + "\r\n";  
            C += "_mplan: " + _mplan.isSelected() + "\r\n";
            C += "MPlan: " + txtMplan.getText() + "\r\n";             
        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'WO' AND [env] = '" + env + "'";
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
            _insert.setString(4, "WO");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            conn.close(); 
            
            txtLog.append("=== SAVE_CONFIG > OK (" + row + " row)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 

        } catch (SQLException ex) {
            txtLog.append("=== SAVE_CONFIG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    protected void GUI_Run_Manual(){
        JOB_Name = "WO_" + env;
        btnRun.setEnabled(false);
        btnFails.setEnabled(false);
        btnExcel.setEnabled(false);
        Slack_Channel = txtSlackCh.getText();
        _Slack = _slack.isSelected();

        try{    
            run_start = Instant.now();
            Current_Log_Update(true, "= Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
            
            WaitForElement = Math.round((double)nWaitElement.getValue() *1000);
            LoadTimeOut = (double)nWaitLoad.getValue() *1000;

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

            MOBILE_ID = txtMobile_ID.getText();
            MOBILE_PW = txtMobile_PW.getText();
            
            BROWSER = cmbBrow.getSelectedItem().toString();
            Slack_Channel = txtSlackCh.getText();
            _Slack = _slack.isSelected();
            _Headless = _headless.isSelected();
            _Mobile = _mobile.isSelected();
            _Run_on_Remote = _remote.isSelected();
            Zip_Report = true;

            MOBILE_ID = txtMobile_ID.getText();
            MOBILE_PW = txtMobile_PW.getText();

            _New_user = _new_user.isSelected();
            _Explore_brand = _explore_brand_menu.isSelected();

            _Account_info = _account_info.isSelected();
            _Account_payments = _account_payments.isSelected();
            _Account_password = _account_password.isSelected();

            _Order_status = _order_status.isSelected();
            _Order_history = _order_history.isSelected();
            _Edit_item = _edit_item.isSelected();
            _Place_pickup_order = _place_pickup_order.isSelected();
            _Place_delivery_order = _place_delivery_order.isSelected();
            _Order_email = _order_email.isSelected();
            _Promo = _promo.isSelected();
            _Forgot_Password = _forgot_password.isSelected();
            _Logout = _logout.isSelected();
            _Support = _support.isSelected();
            _Promo = _promo.isSelected();
            PROMO = txtPromo.getText();            
            
            

            if(DV1.getRowCount() > 0) {
                SITE = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
                platform = DV1.getValueAt(DV1.getSelectedRow(), 1).toString(); // platform
                COUNTRY = DV1.getValueAt(DV1.getSelectedRow(), 2).toString();
                Site_ID = DV1.getValueAt(DV1.getSelectedRow(), 3).toString();
            }
            if(DV2.getRowCount() > 0) {
                BRAND = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
            }

            SCOPE = "";
            r_type = "ad-hoc"; 
            if(_Headless) {
                Current_Log_Update(true,"= Headless mode is selected - Browser is hidden" + "\r\n");
                txtLog.append( "= Please wait for report...\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
            
            
            Current_Log_Update(true, "= Starting WebDriver..." + "\r\n");
            
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();
            LOG_START(); // ========================================================
            BW1_DoWork(true);
            //BW2_DoWork();  >>>>>>> Moved into BW1_DoWork after Driver started successfully
        }catch(Exception ex){
            Current_Log_Update(true, "= GUI_Run_Manual ERROR > " + ex.getMessage() + "\r\n");
            BW1_FAIL_LOG_UPDATE("= GUI_Run_Manual ERROR > " + ex.getMessage());
        }
    }
    public String JOB_Run_Auto(String job_name, String run_type, String config){
        JOB_Name = job_name;
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

            Current_Log_Update(false, "- Starting Web Driver..." + "\r\n");
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
    protected String JOB_Load_CONFIG(String config){
        String[] lines = config.split("\n");  
        String value;
        try{             
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim(); 
                if(l.contains("Browser: ")) BROWSER = value;
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;
                if(l.contains("url: ")) url = value;
             
                if(l.contains("SlackCh: ")) Slack_Channel = value;
                if(l.contains("_slack:")) _Slack = Boolean.parseBoolean(value); 
                if(l.contains("_headless: ")) _Headless = Boolean.parseBoolean(value);
                if(l.contains("_mobile: ")) _Mobile = Boolean.parseBoolean(value);
                if(l.contains("_run_on_remote: ")) _Run_on_Remote = Boolean.parseBoolean(value);
                         
                if(l.contains("_zip_report: ")) Zip_Report = Boolean.parseBoolean(value);
                
                if(l.contains("SITE: ")) SITE = value;
                if(l.contains("BRAND: ")) BRAND = value;
                
                if(l.contains("MOBILE_ID: ")) MOBILE_ID = value;
                if(l.contains("MOBILE_PW: ")) MOBILE_PW = value;

                if(l.contains("nWaitElement: ")) WaitForElement = Math.round(Double.parseDouble(value) * 1000);
                if(l.contains("nWaitLoad: ")) LoadTimeOut = Double.parseDouble(value) * 1000;

                if(l.contains("_new_user: ")) _New_user = Boolean.parseBoolean(value); 
                if(l.contains("_explore_brand_menu: ")) _Explore_brand = Boolean.parseBoolean(value);

                if(l.contains("_account_info: ")) _Account_info = Boolean.parseBoolean(value);
                if(l.contains("_account_payments: ")) _Account_payments = Boolean.parseBoolean(value);
                if(l.contains("_account_password: ")) _Account_password = Boolean.parseBoolean(value);


                if(l.contains("_order_status: ")) _Order_status = Boolean.parseBoolean(value);
                if(l.contains("_order_history: ")) _Order_history = Boolean.parseBoolean(value);
                if(l.contains("_edit_item: ")) _Edit_item = Boolean.parseBoolean(value);
                if(l.contains("_place_pickup_order: ")) _Place_pickup_order = Boolean.parseBoolean(value);
                if(l.contains("_place_delivery_order: ")) _Place_delivery_order = Boolean.parseBoolean(value);
                if(l.contains("_order_email: ")) _Order_email = Boolean.parseBoolean(value);
                if(l.contains("_forgot_password: ")) _Forgot_Password = Boolean.parseBoolean(value);
                if(l.contains("_support: ")) _Support = Boolean.parseBoolean(value);
                if(l.contains("_logout: ")) _Logout = Boolean.parseBoolean(value);
                if(l.contains("_promo: ")) _Promo = Boolean.parseBoolean(value);
                if(l.contains("Promo: ")) PROMO = value; 
                if(l.contains("_mplan: ")) _Mplan = Boolean.parseBoolean(value);
                if(l.contains("Promo: ")) MPLAN = value; 
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
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + JOB_Name + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);
        
        HtmlReport.setSystemInfo("App Version", "Cafe 360" + " " + "Version - TBD"); 
        HtmlReport.setSystemInfo("Browser", BROWSER);        
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID); 
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        
        HtmlReporter.config().setDocumentTitle("JTT Web Automation Report");
        HtmlReporter.config().setTheme(Theme.STANDARD);               
    }    
    protected void Log_Html_Result(String RES, String Test_Description, boolean Capture_Screenshot, ExtentTest Test, Date API_Start) throws IOException  {
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
        Test.getModel().setStartTime(API_Start);
        Test.getModel().setEndTime(new Date());
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
    protected String StartLocalWebDriver() {
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
                        chrome_op.addArguments("--disable-web-security");
                        chrome_op.addArguments("--no-proxy-server");
                        if(_Headless){
                            chrome_op.addArguments("--headless");
                        }
                        chrome_op.setPageLoadStrategy(PageLoadStrategy.NORMAL);

                        chrome_op.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
                        //chrome_op.setExperimentalOption("useAutomationExtension", false);
                        Map<String, Object> prefs = new HashMap<String, Object>();
                        prefs.put("useAutomationExtension", false); 
                        prefs.put("credentials_enable_service", false);
                        prefs.put("profile.password_manager_enabled", false);
                        chrome_op.setExperimentalOption("prefs", prefs);
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
            if(_Mobile){
                Dimension dimension = new Dimension(414, 896);
                d1.manage().window().setSize(dimension);
            } else{
                d1.manage().window().maximize();
            }

            d1.manage().deleteAllCookies(); // =================================
            
            d1.manage().timeouts().pageLoadTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().setScriptTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);        
            loadTimeout = new FluentWait(d1).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
			.pollingEvery(Duration.ofMillis(200))  			
			.ignoring(NoSuchElementException.class); 
            d1.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);     
           
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return "= Local WebDriver Start > OK " + "\r\n";
        } catch (Exception ex) {
            F += "= WebDriver > ERROR: " + ex.getMessage() + "\r\n";
            if(d1 != null) {
                d1.quit();
            }
            return "= WebDriver > ERROR: " + ex.getMessage() + "\r\n";
        }  
    }
    protected String StartRemotelWebDriver() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try { 
            switch (BROWSER) {
                case "Chrome":
                        Map<String, Object> prefs = new HashMap<String, Object>();
                        ChromeOptions chrome_op = new ChromeOptions();
                        chrome_op.setCapability("browserVersion", "latest");
                        if(A.A.WsOS.toLowerCase().contains("windows")){ 
                            chrome_op.setCapability("platformName", "Windows 10");              
                        }else{
                            chrome_op.setCapability("platformName", "macOS 12");                
                         }
//                        prefs.put("username", "ospozito");
//                        prefs.put("accessKey", "1b5dbec6-dd24-405c-84c6-81ce924f93bc");
                        prefs.put("name", app + " Web Ordering");

                        chrome_op.setCapability("sauce:options", prefs);
                        URL _url = new URL("https://ospozito:1b5dbec6-dd24-405c-84c6-81ce924f93bc@ondemand.us-west-1.saucelabs.com:443/wd/hub");
                        d1 = new RemoteWebDriver(_url, chrome_op);
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
                    SafariOptions safariOptions = new SafariOptions();
                    safariOptions.setCapability("browserVersion", "15");
                    if(A.A.WsOS.toLowerCase().contains("windows")){ 
                        safariOptions.setCapability("platformName", "Windows 10");              
                    }else{
                        safariOptions.setCapability("platformName", "macOS 12");                
                    }
                    Map<String, Object> s_prefs = new HashMap<String, Object>();
//                        prefs.put("username", "ospozito");
//                        prefs.put("accessKey", "1b5dbec6-dd24-405c-84c6-81ce924f93bc");
                    s_prefs.put("name", app + " Web Ordering");
                    d1 = new SafariDriver();     
                    break;
            }
            if(_Mobile){
                Dimension dimension = new Dimension(414, 896);
                d1.manage().window().setSize(dimension);
            } else{
                d1.manage().window().maximize();
            }

            d1.manage().deleteAllCookies(); // =================================
            
            d1.manage().timeouts().pageLoadTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);
            d1.manage().timeouts().setScriptTimeout((long) LoadTimeOut, TimeUnit.MILLISECONDS);          
            loadTimeout = new FluentWait(d1).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
			.pollingEvery(Duration.ofMillis(200))  			
			.ignoring(NoSuchElementException.class); 
            d1.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS); 
             
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return "= Remote WebDriver Start > OK " + "\r\n";
        } catch (Exception ex) {
            F += "= Remote WebDriver > ERROR: " + ex.getMessage() + "\r\n";
            if(d1 != null) {
                d1.quit();
            }
            return "= Remote WebDriver > ERROR: " + ex.getMessage() + "\r\n";
        }  
    }
    protected void BW1_DoWork(Boolean GUI) { 
        BW1 = new SwingWorker() {             
            @Override
            protected String doInBackground() throws Exception { 
                String DriverStart = "";
                if(_Run_on_Remote){
                    DriverStart = StartRemotelWebDriver();
                } else{
                    DriverStart = StartLocalWebDriver();
                }
                if(DriverStart.contains("OK")){
                    Current_Log_Update(GUI, "= WebDriver Started in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\r\n");
                    sw1.reset();
                } else{
                    Current_Log_Update(GUI, DriverStart.trim() + "\r\n");
                    Summary = "Start Web Driver - Failed";
                    DD = Duration.between(run_start, Instant.now());
                    LOG_UPDATE(DriverStart.trim() + "\r\n");   // ======================================================
                    btnRun.setEnabled(true);
                    btnFails.setEnabled(true);
                }
                BW2_DoWork(); 
                New_ID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
                
                Extent_Report_Config();
                Execute();// ======================================================================= 
                
                DD = Duration.between(run_start, Instant.now());
                Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
                Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");
                
                EX = "WO " + env + ", v" + Ver + ", Browser: " + BROWSER  + HEADLESS +
                    " - Steps: " + _t + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ". Scope: " + SCOPE + 
                    ". Dur: " + DD.toHours() + ":" + (DD.toMinutes() % 60) + ":" + (DD.getSeconds() % 60) + "\r\n" +
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
                } catch (InterruptedException | ExecutionException ex)  { 
                    Current_Log_Update(GUI, "- BW1 Done > ERROR: " + ex.getMessage() + "\r\n");
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
                        if(!ALERTS.isEmpty()) {
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
                                Log_Html_Result("PASS", Toast_Msg, false, ParentTest.createNode(_t + ". " + "Snackbar Toast Msg"), new Date());                            
                            } else if(Toast_Msg.toLowerCase().contains("could not")|| 
                                    Toast_Msg.toLowerCase().contains("unable to save")|| 
                                    Toast_Msg.toLowerCase().contains("already ")|| 
                                    Toast_Msg.toLowerCase().contains("fail")) {
                                _t++;
                                _f++;
                                F += "Step: " + _t + " > FAIL - " + Toast_Msg + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("FAIL", Toast_Msg, true, ParentTest.createNode(_t + ". " + "Snackbar Toast Msg"), new Date());                            
                            } else if(Toast_Msg.toLowerCase().contains("fix") || Toast_Msg.toLowerCase().contains("error")) {
                                _t++;
                                _w++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("WARN", Toast_Msg, true, ParentTest.createNode(_t + ". " + "Snackbar Toast Msg"), new Date());                            
                            } else {
                                _t++;
                                _w++;
                                //F += "Step: " + _t + " > WARN - " + tt + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                                Log_Html_Result("WARN", Toast_Msg, true, ParentTest.createNode(_t + ". " + "Snackbar Toast Msg"), new Date());
                            }
                            Thread.sleep(2000); //  pause till new alert expected ???? 
                        }
                    } catch (IOException | InterruptedException ex){ // Exception ex
//                        txtLog.append( "= BW2: " + ex.getMessage() + "\r\n");
//                        txtLog.setCaretPosition(txtLog.getDocument().getLength());                         
                    }
                }
                return "Done"; 
            }
        }; 
        BW2.execute();
    }
    protected void BW1_FAIL_LOG_UPDATE(String Error){
        Summary = "BW1 - Failed: " + Error;
        DD = Duration.between(run_start, Instant.now());
        LOG_UPDATE("- BW1 ERROR: " + Error);
        btnRun.setEnabled(true);
    }

    protected void BW1_Done(boolean GUI) throws Exception{
        DD = Duration.between(run_start, Instant.now());      
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
        
        Current_Log_Update(GUI, "= WO" + " v: " + Ver + ", App: " + app + ", Env: " + env + "\r\n");       
        Current_Log_Update(GUI, "= Scope: " + SCOPE + "\r\n"); // SCOPE shown in EX top
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n");
    
        if(GUI){
            Log = txtLog.getText();
        }

        HtmlReporter.config().setReportName("WO" + ", Env: " + env + ", Ver: " + Ver +
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
            String MSG = "WO_" + env + " Excel Automation report - " + Report_Date +  
                    "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: *" + A.A.UserID + "*\r\n" +
                    "Browser: *" + BROWSER  + HEADLESS + "*" + "\r\n" +        
                    "Scope: " + SCOPE + "\r\n" +
                    "Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" + 
                    "Steps: " + _t + ", Passed: " + _p + ", *Failed: " + _f + "*, Warnings: " + _w + ", Info: " + _i;
            
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
        btnExcel.setEnabled(true);
        
        LOG_UPDATE(Log); // ========================================================
    }
    // </editor-fold> 

    protected void Execute() throws InterruptedException{

        if (_Explore_brand) { 
            SCOPE += "Explore Brand Menu";
            ParentTest = HtmlReport.createTest("Explore Brand"); 
            EX += " - " + "\t" + " === Explore Brand Menu" + "\t" + " ===== " + "\t" + " == Explore Brand > Menu, no Login >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_explore_brand BR = new WO_explore_brand(WO_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            PICKUP = BR.PICKUP;
            DELIVERY = BR.DELIVERY;
            EX += " - " + "\t" + " === ^ Explore Brand > Menu, no Login" + "\t" + " ===== " + "\t" + " == ^ Explore Brand > Menu, no Login" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Explore Brand > Menu, no Login: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        } 
        if (_Forgot_Password) { 
            SCOPE += ", Forgot Password";
            ParentTest = HtmlReport.createTest("Forgot Password"); 
            EX += " - " + "\t" + " === Login " + "\t" + " ===== " + "\t" + " == Forgot Password Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_forgot_password BR = new WO_forgot_password(WO_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            Ver = BR.Ver;
            EX += " - " + "\t" + " === ^ Forgot Password " + "\t" + " ===== " + "\t" + " == ^ Forgot Password End " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Forgot Password: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (true) { 
            SCOPE += ", Login";
            ParentTest = HtmlReport.createTest("Login"); 
            EX += " - " + "\t" + " === Login " + "\t" + " ===== " + "\t" + " == Login Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_login BR = new WO_login(WO_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            Ver = BR.Ver;
            EX += " - " + "\t" + " === ^ Login " + "\t" + " ===== " + "\t" + " == ^ Login End " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Login: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Account_info) { 
            SCOPE += ", Account Info";
            ParentTest = HtmlReport.createTest("Account Info"); 
            EX += " - " + "\t" + " === Account Info" + "\t" + " ===== " + "\t" + " == Account Settings Info >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_account_info BR = new WO_account_info(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Account Info" + "\t" + " ===== " + "\t" + " == ^ Account Settings Info End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Account Info: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Account_payments) { 
            SCOPE += ", Payments";
            ParentTest = HtmlReport.createTest("Payments"); 
            EX += " - " + "\t" + " === Account Settings" + "\t" + " ===== " + "\t" + " == Account Settings Payments Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_account_payments BR = new WO_account_payments(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Account Payments" + "\t" + " ===== " + "\t" + " == ^ Account Settings Payments End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Payments: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }

        if (_Place_pickup_order) { 
            SCOPE += ", Pickup Order";
            ParentTest = HtmlReport.createTest("Place Pickup Order"); 
            EX += " - " + "\t" + " === Place Pickup Order" + "\t" + " ===== " + "\t" + " == Place Pickup Order >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_place_order_pickup BR = new WO_place_order_pickup(WO_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Place Pickup Order" + "\t" + " ===== " + "\t" + " == ^ Place Pickup Order" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Place Pickup Order: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Place_delivery_order) { 
            SCOPE += ", Delivery Order";
            ParentTest = HtmlReport.createTest("Place Delivery Order"); 
            EX += " - " + "\t" + " === Place Delivery Order" + "\t" + " ===== " + "\t" + " == Place Delivery Order >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_place_order_delivery BR = new WO_place_order_delivery(WO_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Place Delivery Order" + "\t" + " ===== " + "\t" + " == ^ Place Delivery Order" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Place Delivery Order: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        // ============================== Last Blocks
        if (_Order_status) { 
            SCOPE += ", Order Status";
            ParentTest = HtmlReport.createTest("Order Status"); 
            EX += " - " + "\t" + " === Order Status" + "\t" + " ===== " + "\t" + " == Order Status Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_order_status BR = new WO_order_status(WO_GUI.this);
            BR.run(); // ======================================            
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Order Status" + "\t" + " ===== " + "\t" + " == ^ Order Status End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
        }

        if (_Order_history) { 
            SCOPE += ", Order History";
            ParentTest = HtmlReport.createTest("Order History"); 
            EX += " - " + "\t" + " === Order History" + "\t" + " ===== " + "\t" + " == Order History Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_order_history BR = new WO_order_history(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Order History" + "\t" + " ===== " + "\t" + " == ^ Order History End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Order History: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Support) { 
            SCOPE += ", Support";
            ParentTest = HtmlReport.createTest("Order History"); 
            EX += " - " + "\t" + " === Support" + "\t" + " ===== " + "\t" + " == Support Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_support BR = new WO_support(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Supporty" + "\t" + " ===== " + "\t" + " == ^ Support End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Support: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Account_password) { 
            SCOPE += ", Update Password";
            ParentTest = HtmlReport.createTest("Update Password"); 
            EX += " - " + "\t" + " === Account Password" + "\t" + " ===== " + "\t" + " == Account > Update Password Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_account_password BR = new WO_account_password(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Update Password" + "\t" + " ===== " + "\t" + " == ^ Update Password End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("Update Password: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
        if (_Logout) { 
            SCOPE += ", LogOut";
            ParentTest = HtmlReport.createTest("Log Out"); 
            EX += " - " + "\t" + " === Logout" + "\t" + " ===== " + "\t" + " == Logout Begin >>" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            WO_logout BR = new WO_logout(WO_GUI.this);
            BR.run(); // ====================================== 
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            EX += " - " + "\t" + " === ^ Logout" + "\t" + " ===== " + "\t" + " == ^ Logout End" + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\t" + " - " + "\r\n";
            ParentTest.getModel().setName("LogOut: " + BR._t + ", Failed: " + BR._f);
            ParentTest.getModel().setEndTime(new Date());    
        }
                                   
        if(_f > 0) {
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + " with " + _f + " FAIL(s)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }else{
            txtLog.append("=== Execution finished @" + LocalDateTime.now().format(Time_12_formatter) + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }         
    }

    // <editor-fold defaultstate="collapsed" desc="Driver Actions > Log Step Result">  
    protected void Clear_Cookies_Restart_Driver(String BROWSER, ExtentTest ParentTest, String JIRA )throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs
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
//                                ElementScrollBehavior = InternetExplorerElementScrollBehavior.Top, // with button click doesn't work
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
            
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Browser: " + BROWSER + " > " + "d1.manage().deleteAllCookies()", false, ParentTest.createNode(_t + ". " + "Clear Cookies & Re-start Driver"), new Date());
            EX += " - " + "\t" + "Clear Cookies & Re-start Driver" + "\t" + "Current page" + "\t" + "d1.manage().deleteAllCookies()" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += " - " + "\t" + "Clear Cookies & Re-start Driver" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Browser: " + BROWSER + " > " + "d1.manage().deleteAllCookies()", true, ParentTest.createNode(_t + ". " + "Clear Cookies & Re-start Driver"), new Date());
        } 
        sw1.reset();
    }
    protected void Open_Switch_to_2nd_Tab(String NAME, String LINK, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t ="?";
        try {
            if(!LINK.isEmpty()){
                ((JavascriptExecutor) d1).executeScript("window.open(arguments[0])", LINK);
            }
            ArrayList<String> tabs = null;
            for(int i = 0; i < 10; i++){
                tabs = new ArrayList<>(d1.getWindowHandles());
                if(tabs.size() > 1){
                    break;
                }else{
                    Thread.sleep(500);
                }
            }
            d1.switchTo().window(tabs.get(1));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />Target URL" + " > " + LINK, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Target URL" + " > " + LINK, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }    
    protected void Close_Current_Tab_switch_To_1st(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            d1.close();
            ArrayList<String> tabs = new ArrayList<>(d1.getWindowHandles());
//            for(int i = tabs.size(); i > 0; i--){
//              d1.switchTo().window(tabs.get(i)); 
//              d1.close();
//            }
            d1.switchTo().window(tabs.get(0));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.switchTo().window()", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.switchTo().window()", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Page_URL(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t ="?";
        try {
            t = d1.getCurrentUrl();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Page URL"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.getCurrentUrl()" + " URL: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.getCurrentUrl()", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }    
    protected void Navigate_to_URL(String NAME, String URL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            d1.navigate().to(URL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "URL" + "\t" + URL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().to(" + URL + ")", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + URL + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().to(" + URL + ")", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Navigate_Back(String NAME, String FROM, String TO, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            d1.navigate().back();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().back()(" + FROM + "  > " + TO + ")", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().back()(" + FROM + "  > " + TO + ")", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Navigate_Forward(String NAME, String FROM, String TO, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            d1.navigate().forward();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.forward().back()(" + FROM + "  > " + TO + ")", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().forward()(" + FROM + "  > " + TO + ")", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Refresh(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            d1.navigate().refresh();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />d1.navigate().refresh()", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim(); 
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.navigate().refresh()", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void To_Top(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs  
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.HOME).perform();
            _p++;
            EX += _t + "\t" + "Move to page Top" + "\t" + "Current page" + "\t" + "Scroll bar at top" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.sendKeys(Keys.HOME).perform())", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Top" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.sendKeys(Keys.HOME).perform())", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void To_Bottom(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.END).perform();
            _p++; 
            EX += _t + "\t" + "Move to page Bottom" + "\t" + "Current page" + "\t" + "Scroll bar at Bottom" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.sendKeys(Keys.END).perform())", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Bottom" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.sendKeys(Keys.END).perform())", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Swith_to_Frame(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />d1.switchTo().frame())", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />d1.switchTo().frame())", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Scroll_XY(String NAME, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("window.scrollBy(" + X + "," + Y + ")", "");
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName()+ "<br />\"window.scrollBy(" + X + "," + Y + ")", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />window.scrollBy(" + X + "," + Y + ")", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }    

    protected void Wait_For_Element_By_Selector_Visibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.xpath(PATH)));
                    break;
                case "css":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PATH)));
                    break;
                case "className":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.className(PATH)));
                    break;
                case "id":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.id(PATH)));
                    break;
                case "tagName":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.tagName(PATH)));
                    break;                     
                case "linkText":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.linkText(PATH)));
                    break;
                case "partialLinkText":
                    loadTimeout.until((Function) ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(PATH)));
                    break;
                default:
                    break;
            }
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            _p++; 
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Wait_For_Element_By_Selector_Presence(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Wait_For_All_Elements_InVisibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Wait_For_Element_By_Selector_InVisibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />" + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />" + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void Scroll_to_Element(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            ((JavascriptExecutor)d1).executeScript("arguments[0].scrollIntoView(true);", E);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />executeScript(\"arguments[0].scrollIntoView(true)", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />executeScript(\"arguments[0].scrollIntoView(true)", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Move_to_Element(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.moveToElement(E).perform()", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.moveToElement(E).perform()", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    } 
    protected void Click_out_of_Element(String NAME, WebElement E, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />action.moveToElement(E, XX, YY).click().perform()", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />action.moveToElement(E, XX, YY).click().perform()", true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    } 
    protected void Move_to_Element_By_Selector(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Move_out_of_Element_By_Selector(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Click_out_of_Element_By_Selector(String NAME, String BY, String PATH, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            //Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void Text_Found(String NAME, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t ="?";
        try {
            e = d1.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = "Found";
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            t = "Not Found";
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Not Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        _p++;
        sw1.reset();
    }
    protected void Find_Text(String NAME, String VAL, Boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "Not Found";
            }
            if(EXPECTED){
                _p++; 
                EX += _t + "\t" + NAME + "\t" + "Text Found" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL + " Expected: " + EXPECTED + " Text: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            } else {
                _f++; FAIL = false; 
                EX += _t + "\t" + NAME + "\t" + "Unexpected Text Found" + "\t" + t + "\t" + "FAIL" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + "Found Unexpected Text: " + t;
                Log_Html_Result("FAIL", "Found Unexpected Text"  + "<br />Element locator: " + VAL + " Expected: " + EXPECTED + " Text: " + t, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);                
            }
        } catch(Exception ex){
            if(EXPECTED){
                _f++; FAIL = true; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err  + "<br />Element locator: " + VAL + " Expected: " + EXPECTED, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);                
            } else {
                _p++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found As Expected" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Text Not Found As Expected", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);                
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
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Not Found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_E2_Find(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Not Found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Click(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Text(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "empty"; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Text: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Attribute(String NAME, String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        t = ""; FAIL = false;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + VAL, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Text_Select_Copy(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex) {
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Text_DblClick_Copy(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs  
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Input_Select_Clear(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset(); 
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                e.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text
                e.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it                  
            }else{
                //e.clear();
                e.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text
                e.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }

            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_By_Selector_Text_Enter(String NAME, String BY, String PATH, String VAL, boolean HIDE, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + "Enter: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH + "Enter: " + VAL, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }

    protected void Element_Text(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t = "?";
        try {
            t = E.getText();
            if(t.trim().equals("")){
                t = E.getAttribute("textContent");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Text: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_Text_Clear(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {      
            if(A.A.WsOS.toLowerCase().contains("windows")){
                E.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it              
            }else{
                //E.clear();
                E.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                E.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }   
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Text cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_Text_Enter(String NAME, WebElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            E.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element enter: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_Attribute(String NAME, WebElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {       
        t = "empty";
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            t = E.getAttribute(VAL);
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+ ", " "); 
            } else {
                t = "null";
            }
            if (t.contains("img-default")) {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Attribute: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element Attribute: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = false;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Element_Click(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.moveToElement(E).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Passed Element", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void Element_Child_List_L1(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" +  BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }    
    protected void Element_Child_List_L2(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        if(L2 != null) {L2.clear();}
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }    
    protected void Element_Child_E2(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "e2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++;
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text_Enter(String NAME, WebElement E, String BY, String PATH, String VAL, boolean HIDE, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void Element_Child_Click(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }    
    protected void Element_Child_Attribute(String NAME, WebElement E, String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "";
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                t = t.replaceAll("[ ]+ ", " ");
            } else {
                t = "null";
            }
            if (t.contains("placeholder") || t.contains("adminpanel.compassdigital.org") || t.contains("img-default"))
            {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Attribute: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " Attribute: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            } 
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void List_L0(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L0.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L0.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void List_L1(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L1.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void List_L2(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            if(L2.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L2.isEmpty()" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L2.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void List_L3(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L3.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L3.size() + " item(s) (L3)" + "\t" + "WARN" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH + " - Size: " + L3.size(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L3" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void List_Child_E1_By_Selector(String NAME, WebElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs         
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    e1 = E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    e1 = E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    e1 = E.findElement(By.className(PATH));
                    break;
                case "id":
                    e1 = E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    e1 = E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    e1 = E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    e1 = E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    e1 = E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "PAssed Element " + " > " + PATH + "\t" + "element found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element " + " > " + PATH + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }

    protected void List_TR_TDs(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                    dt = dt.replaceAll("[ ]+ ", " ");
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Text: " + t, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": td(s)" + "\t" + "table data" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void List_TR_THs(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("th"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+ ", " ");
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />List[" + I + "] " +  " > " + t , false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Index " + I + ": th(s)" + "\t" + "table header" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void Scroll_to_Day(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            e = L.get(I);
            Actions action = new Actions(d1);
            action.moveToElement(e).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + "Day " + I + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + I + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Day_Schedule(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            } else if ("true".equals(X2)){
                _24 = "Closed All Day"; 
                t = Day + ": " + Open + " > " + Close + " > " + _24;
                EX += _t + "\t" + NAME + "\t" + "Day " + (I + 1) + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
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
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Day " + (I + 1) + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Time_Enter(String NAME, List<WebElement> L, int I,String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }

    protected void Brand_Status(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }     
    protected void Brand_Status_Click(String NAME, List<WebElement> L, int I,  ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            e = X.get(X.size() - 1).findElement(By.xpath(".//i[contains(@class, 'icon mdi mdi-eye')]"));
            Actions action = new Actions(d1);
            action.moveToElement(e).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "mdi-eye/mdi-eye-off" + "\t" + "action.moveToElement(e).click().perform()" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }     
    protected void Menu_Snedule(String NAME, List<WebElement> L, int I, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t = "";
        String dt;
        try {
            List<WebElement> X = L.get(I).findElements(By.tagName("td"));
            for (int k = 0; k < X.size(); k++) {
                dt = X.get(k).getAttribute("textContent");
                if(dt != null){
                    dt = dt.replace("\r\n", " ").replace("\n", " ");
                    dt = dt.replaceAll("[ ]+ ", " ");
                }else{
                    dt = "null";
                }
                t += dt + " > ";
            }
            EX += _t + "\t" + NAME + "\t" + "Row Index " + I + ": td(s)" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            _p++; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Row" + " Index " + I + ": td(s)" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void Call_API(String NAME, String AUTH, String URL, boolean EXPECT_OK, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        String RR = "";
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
            if(AUTH != ""){
                httpget.setHeader("Authorization", AUTH);               
            }
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; FAIL = true; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err + "<br />URL: " +  URL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);                
            } else {
                _p++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />URL: " + URL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } 
        sw1.reset();
    }
    protected void API_Body_Contains(String NAME, String VAL, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - not expected" + "\t" + "FAIL" + "\t" + "not Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - expected" + "\t" + "FAIL" + "\t" + "Not Found - Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + VAL, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }                                    
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Value: " + VAL, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    
    protected void Calendar_API_Closure(String NAME, String C_Name, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";    
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "Title: " + C_Name + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + "Closure Title: " + C_Name + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Brand_API_Hours(String NAME, String TARGET, String From, String To, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                        if(_start == Integer.parseInt(DAY)){
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
                        if(_start == Integer.parseInt(DAY)){
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                } else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "AP3 change: " + From + "-" + To + "\t" + Z_From + "-" + Z_To + " TZone: " + TZone + " > UTC: " + _From + "-" + _To + " start:" + _start + ", end:" + _end + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                                    
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }else{
                _f++; 
                EX += _t + "\t == " + NAME + "\t" + "Wrong From - To Format" + "\t" + from_to + "\t" + "FAIL" + "\t" + "Expected " + From + "-" + To +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                                                    
                Log_Html_Result("FAIL", "Wrong From - To Format", false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "Day " + DAY + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void Brand_API_Is(String NAME, String TARGET, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Not Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Not Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Value: " + TARGET, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }                                    
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "*_supported" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Value: " + TARGET, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }

    protected void Calendar_API_Pickup(String NAME, String DAY, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       

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
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";  
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }

        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    protected void Calendar_API_Delivey(String NAME, String DAY, boolean EXPECTED, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }else{
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY+ "\t" + "Found after remove in AP3" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";   
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }else{
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + "Not Found after remove in AP3" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                  
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }

        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + DAY + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }

    protected void File_Find(String NAME, String DIR, String F_NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        t = "";
        try {
            List<File> listOfFiles = Files.list(Paths.get(DIR))
                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
            //listOfFiles.forEach(System.out::println); 
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + "Delete the file after test" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    protected void File_Read(String NAME, String DIR, String F_NAME, String CHECK, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
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
                Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                if("User_Count".equals(CHECK)){
                    ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(DIR + File.separator + t), StandardCharsets.UTF_8));
                    if(lines.size() == Integer.parseInt(VAL) + 1){
                        _p++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "PASS" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                             
                        Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                    } else{
                        _w++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "WARN" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                            
                        Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                    }
                }
                if("Site_Count".equals(CHECK)){
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    }
    
    protected void File_Delete(String NAME, String DIR, String F_NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs       
 
        FAIL = false;
        try {
            File xx = new File(DIR + File.separator + F_NAME);
            if (xx.exists()) {
                xx.delete();     
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />File: " + F_NAME, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />File: " + F_NAME, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } 
        sw1.reset();
    } 

    protected void Element_SendKey_Enter(String NAME, WebElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs      
 
        FAIL = false;
        try {
            E.sendKeys(Keys.chord(Keys.ENTER)); 
            _p++;
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Enter key presses" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
   
    protected void Element_By_DisplayCheck(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs      
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                      if(!d1.findElements(By.xpath(PATH)).isEmpty())
                                  d1.findElement(By.xpath(PATH)).click();
                    break;
                case "css":
                      if (!d1.findElements(By.cssSelector(PATH)).isEmpty())
                                 d1.findElement(By.cssSelector(PATH)).click();
                    break;
                case "className":
                      if(!d1.findElements(By.className(PATH)).isEmpty())
                                 d1.findElement(By.className(PATH)).click();
                    break;
                case "id":
                      if(!d1.findElements(By.id(PATH)).isEmpty())
                                 d1.findElement(By.id(PATH)).click();
                    break;
                case "tagName":
                      if(!d1.findElements(By.tagName(PATH)).isEmpty())
                                 d1.findElement(By.tagName(PATH)).click();
                    break;
                case "name":
                      if(!d1.findElements(By.name(PATH)).isEmpty())
                                 d1.findElement(By.name(PATH)).click();
                    break;
                 case "linkText":
                      if(!d1.findElements(By.linkText(PATH)).isEmpty())
                                 d1.findElement(By.linkText(PATH)).click();
                    break;
                case "partialLinkText":
                      if(!d1.findElements(By.partialLinkText(PATH)).isEmpty())
                                 d1.findElement(By.partialLinkText(PATH)).click();
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "item has been displayed & deleted successfully" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    
    protected void Scroll_to_WebElement(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start(); 
        Date API_SRART = new Date(); //  ========== new to fix Extend Report time bugs      
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(_t + ". " + NAME), API_SRART);
        }
        sw1.reset();
    }
    // </editor-fold>    
 
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JCheckBox _account_info;
    private javax.swing.JCheckBox _account_password;
    private javax.swing.JCheckBox _account_payments;
    private javax.swing.JCheckBox _edit_item;
    private javax.swing.JCheckBox _explore_brand_menu;
    private javax.swing.JCheckBox _forgot_password;
    private javax.swing.JCheckBox _headless;
    private javax.swing.JCheckBox _login;
    private javax.swing.JCheckBox _logout;
    private javax.swing.JCheckBox _mobile;
    private javax.swing.JCheckBox _mplan;
    private javax.swing.JCheckBox _new_user;
    private javax.swing.JCheckBox _order_email;
    private javax.swing.JCheckBox _order_history;
    private javax.swing.JCheckBox _order_status;
    private javax.swing.JCheckBox _place_delivery_order;
    private javax.swing.JCheckBox _place_pickup_order;
    private javax.swing.JCheckBox _promo;
    private javax.swing.JCheckBox _remote;
    private javax.swing.JCheckBox _slack;
    private javax.swing.JCheckBox _support;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnFails;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbBrow;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBRANDS;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JLabel lblSITES10;
    private javax.swing.JLabel lblSITES11;
    private javax.swing.JLabel lblSITES12;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES16;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES8;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JSpinner nShowPage;
    private javax.swing.JSpinner nWaitElement;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    private javax.swing.JTextField txtMplan;
    private javax.swing.JTextField txtPromo;
    private javax.swing.JTextField txtSlackCh;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
