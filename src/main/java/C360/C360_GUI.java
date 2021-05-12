package C360;

import A.Func;
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
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
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
import org.json.JSONException;
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

public class C360_GUI extends javax.swing.JInternalFrame {
    public C360_GUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSITES = new javax.swing.JLabel();
        lblBRANDS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _login = new javax.swing.JCheckBox();
        _all_data = new javax.swing.JCheckBox();
        _site_new = new javax.swing.JCheckBox();
        _site = new javax.swing.JCheckBox();
        _brand = new javax.swing.JCheckBox();
        _orders = new javax.swing.JCheckBox();
        _resent_updates = new javax.swing.JCheckBox();
        _announcements = new javax.swing.JCheckBox();
        _promo = new javax.swing.JCheckBox();
        _sales_reporting = new javax.swing.JCheckBox();
        _menu_manager = new javax.swing.JCheckBox();
        _users = new javax.swing.JCheckBox();
        _password = new javax.swing.JCheckBox();
        _logout = new javax.swing.JCheckBox();
        _roles = new javax.swing.JCheckBox();
        _brand_new = new javax.swing.JCheckBox();
        _smart_analytics = new javax.swing.JCheckBox();
        _group_management = new javax.swing.JCheckBox();
        lblSITES8 = new javax.swing.JLabel();
        lblSITES12 = new javax.swing.JLabel();
        _sales_analytics = new javax.swing.JCheckBox();
        _notifications = new javax.swing.JCheckBox();
        txtDH_Id = new javax.swing.JTextField();
        lblSITES15 = new javax.swing.JLabel();
        txtComp = new javax.swing.JTextField();
        txtSector = new javax.swing.JTextField();
        _bulk_apply = new javax.swing.JCheckBox();
        _images = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        nShowPage = new javax.swing.JSpinner();
        nWaitElement = new javax.swing.JSpinner();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES7 = new javax.swing.JLabel();
        lblSITES9 = new javax.swing.JLabel();
        lblSITES10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cmbBrow = new javax.swing.JComboBox<>();
        btnRun = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFails = new javax.swing.JButton();
        btnExel = new javax.swing.JButton();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES11 = new javax.swing.JLabel();
        lblSITES13 = new javax.swing.JLabel();
        lblSITES14 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        cmbApp = new javax.swing.JComboBox<>();
        _slack = new javax.swing.JCheckBox();
        _headless = new javax.swing.JCheckBox();
        _mobile_view = new javax.swing.JCheckBox();
        txtADMIN_ID = new javax.swing.JTextField();
        txtSM_ID = new javax.swing.JTextField();
        txtIM_ID = new javax.swing.JTextField();
        txtADMIN_PW = new javax.swing.JTextField();
        txtSM_PW = new javax.swing.JTextField();
        txtIM_PW = new javax.swing.JTextField();
        lblSITES1 = new javax.swing.JLabel();
        lblSITES2 = new javax.swing.JLabel();
        lblSITES3 = new javax.swing.JLabel();
        lblSITES4 = new javax.swing.JLabel();
        lblSITES5 = new javax.swing.JLabel();
        lblSITES6 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("C360 Automation Manager >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("C360"); // NOI18N
        setVisible(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                C360_AncestorAdded(evt);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Scope"));
        jPanel1.setToolTipText("");
        jPanel1.setDoubleBuffered(false);
        jPanel1.setName("Scope"); // NOI18N

        _login.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _login.setSelected(true);
        _login.setText("Admin Login");
        _login.setEnabled(false);
        _login.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _login.setRequestFocusEnabled(false);

        _all_data.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _all_data.setText("Show all data rows");
        _all_data.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _all_data.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _all_data.setRequestFocusEnabled(false);

        _site_new.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _site_new.setText("New Site (not in Prod)");
        _site_new.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _site_new.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _site_new.setRequestFocusEnabled(false);

        _site.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _site.setText("Sites");
        _site.setContentAreaFilled(false);
        _site.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _site.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _brand.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _brand.setText("Brand");
        _brand.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _brand.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _brand.setRequestFocusEnabled(false);

        _orders.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _orders.setText("Orders");
        _orders.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _orders.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _orders.setRequestFocusEnabled(false);

        _resent_updates.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _resent_updates.setText("Recent Updates");
        _resent_updates.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _resent_updates.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _resent_updates.setRequestFocusEnabled(false);

        _announcements.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _announcements.setText("Announcements");
        _announcements.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _announcements.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _announcements.setRequestFocusEnabled(false);

        _promo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _promo.setText("Promo Management");
        _promo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _promo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _promo.setRequestFocusEnabled(false);

        _sales_reporting.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _sales_reporting.setText("Sales Reporting");
        _sales_reporting.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _sales_reporting.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _sales_reporting.setRequestFocusEnabled(false);

        _menu_manager.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _menu_manager.setText("Menu Manager");
        _menu_manager.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _menu_manager.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _menu_manager.setRequestFocusEnabled(false);

        _users.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _users.setSelected(true);
        _users.setText("Users");
        _users.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _users.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _users.setRequestFocusEnabled(false);

        _password.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _password.setText("Forgot Password");
        _password.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _password.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _password.setRequestFocusEnabled(false);

        _logout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _logout.setText("User Feedback & Logout");
        _logout.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _logout.setRequestFocusEnabled(false);

        _roles.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _roles.setText("Roles Permissions");
        _roles.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _roles.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _roles.setRequestFocusEnabled(false);

        _brand_new.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _brand_new.setText("Add Brand (not in Prod)");
        _brand_new.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _brand_new.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _brand_new.setRequestFocusEnabled(false);

        _smart_analytics.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _smart_analytics.setText("Smart Analytics");
        _smart_analytics.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _smart_analytics.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _smart_analytics.setRequestFocusEnabled(false);

        _group_management.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _group_management.setText("Group Management");
        _group_management.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _group_management.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _group_management.setRequestFocusEnabled(false);

        lblSITES8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES8.setText("Group/Sector:");
        lblSITES8.setAlignmentX(0.5F);

        lblSITES12.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES12.setText("Company/Global Menu:");
        lblSITES12.setAlignmentX(0.5F);

        _sales_analytics.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _sales_analytics.setText("Sales Analytics");
        _sales_analytics.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _sales_analytics.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _sales_analytics.setRequestFocusEnabled(false);

        _notifications.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _notifications.setText("Notifications");
        _notifications.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _notifications.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _notifications.setRequestFocusEnabled(false);

        txtDH_Id.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtDH_Id.setText("Fails, no test");

        lblSITES15.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES15.setText("> Import DH Menu Id:");
        lblSITES15.setAlignmentX(0.5F);

        txtComp.setEditable(false);
        txtComp.setBackground(new java.awt.Color(255, 255, 255));
        txtComp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtComp.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtSector.setEditable(false);
        txtSector.setBackground(new java.awt.Color(255, 255, 255));
        txtSector.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtSector.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        _bulk_apply.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _bulk_apply.setText("Bulk Apply");
        _bulk_apply.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _bulk_apply.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _bulk_apply.setRequestFocusEnabled(false);

        _images.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _images.setText("Images");
        _images.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _images.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _images.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSITES8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(_smart_analytics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_menu_manager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_bulk_apply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(_sales_analytics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(_sales_reporting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_site, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(_orders, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(_brand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(_group_management, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_announcements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_notifications, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_resent_updates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_images, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_promo, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_brand_new, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(_all_data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(_site_new, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(_users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_roles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(_logout, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lblSITES15)
                        .addGap(1, 1, 1)
                        .addComponent(txtDH_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_site, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_resent_updates, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(_announcements, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_group_management, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_sales_reporting, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_sales_analytics, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_promo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_notifications, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_smart_analytics, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(_all_data, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_site_new, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_images, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(_brand_new, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_users, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_roles, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_password, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(_bulk_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_menu_manager, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDH_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES15))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSITES8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES12))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {_announcements, _brand, _group_management, _login, _orders, _promo, _resent_updates, _sales_reporting, _site});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 140, 424, 240));

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
        DV2.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV2.setName("DV2"); // NOI18N
        DV2.setOpaque(false);
        DV2.setRowHeight(18);
        DV2.getTableHeader().setReorderingAllowed(false);
        DV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 22, 420, 64));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Wait (sec):"));

        nShowPage.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nShowPage.setModel(new javax.swing.SpinnerNumberModel(0.2d, 0.2d, 2.0d, 0.2d));
        nShowPage.setAutoscrolls(true);
        nShowPage.setName("nShowPage"); // NOI18N

        nWaitElement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitElement.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 0.5d));
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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 92, 424, -1));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        txtLog.setPreferredSize(null);
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 354, 428, 148));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbBrow.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jPanel3.add(cmbBrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 56, 78, 20));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        jPanel3.add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 80, 78, 32));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        jPanel3.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 88, 84, 22));

        btnFails.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnFails.setText("Show Fails");
        btnFails.setEnabled(false);
        btnFails.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnFails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFailsMouseClicked(evt);
            }
        });
        jPanel3.add(btnFails, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 56, 84, 22));

        btnExel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExel.setText("Excel Rep");
        btnExel.setEnabled(false);
        btnExel.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnExel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExelMouseClicked(evt);
            }
        });
        jPanel3.add(btnExel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 32, 84, 22));

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });
        jPanel3.add(btnSave_Opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 88, 116, 22));

        lblSITES11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES11.setText("Browser:");
        lblSITES11.setAlignmentX(0.5F);
        jPanel3.add(lblSITES11, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 40, 72, 16));

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);
        jPanel3.add(lblSITES13, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 40, 92, 16));

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);
        jPanel3.add(lblSITES14, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 40, 92, 16));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 56, 116, 20));

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 56, 108, 20));

        _slack.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _slack.setText("Report to Slack");
        _slack.setToolTipText("");
        _slack.setRequestFocusEnabled(false);
        jPanel3.add(_slack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 100, 14));

        _headless.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _headless.setText("Headless <<<<");
        _headless.setToolTipText("");
        _headless.setRequestFocusEnabled(false);
        jPanel3.add(_headless, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 96, 100, 14));

        _mobile_view.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _mobile_view.setText("mobile_view");
        _mobile_view.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _mobile_view.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _mobile_view.setRequestFocusEnabled(false);
        _mobile_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _mobile_viewActionPerformed(evt);
            }
        });
        jPanel3.add(_mobile_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 8, 160, 16));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 384, 416, 116));

        txtADMIN_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtADMIN_ID.setText("oleg.spozito@compassdigital.io");
        getContentPane().add(txtADMIN_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 284, 184, -1));

        txtSM_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtSM_ID.setText("cdl.test.xtt@gmail.com");
        getContentPane().add(txtSM_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 308, 184, -1));

        txtIM_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtIM_ID.setText("cdl.test.xtt+rn@gmail.com");
        txtIM_ID.setToolTipText("");
        getContentPane().add(txtIM_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 332, 184, -1));

        txtADMIN_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtADMIN_PW.setText("Password1");
        getContentPane().add(txtADMIN_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 284, 84, -1));

        txtSM_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtSM_PW.setText("Password1");
        getContentPane().add(txtSM_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 332, 84, -1));

        txtIM_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtIM_PW.setText("Password1");
        getContentPane().add(txtIM_PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 308, 84, -1));

        lblSITES1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES1.setText("Runner:");
        lblSITES1.setToolTipText("");
        lblSITES1.setAlignmentX(0.5F);
        getContentPane().add(lblSITES1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 332, 72, 16));

        lblSITES2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES2.setText("PW:");
        lblSITES2.setAlignmentX(0.5F);
        getContentPane().add(lblSITES2, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 336, -1, -1));

        lblSITES3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES3.setText("Mobile User:");
        lblSITES3.setToolTipText("");
        lblSITES3.setAlignmentX(0.5F);
        getContentPane().add(lblSITES3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 312, 76, -1));

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES4.setText("C360 User");
        lblSITES4.setAlignmentX(0.5F);
        getContentPane().add(lblSITES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 288, 60, -1));

        lblSITES5.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES5.setText("PW:");
        lblSITES5.setAlignmentX(0.5F);
        getContentPane().add(lblSITES5, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 288, -1, -1));

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES6.setText("PW:");
        lblSITES6.setAlignmentX(0.5F);
        getContentPane().add(lblSITES6, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 312, -1, -1));

        getAccessibleContext().setAccessibleName("C360");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    private boolean Zip_Report = true;
    private String Slack_Channel = "";
    protected boolean _Slack = false;
    private String Log = "";
    private String HTML_Report_Path = "";
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
    
    protected boolean ALL_DATA = false;
    protected boolean NO_DATA = false;
    
    protected boolean FAIL = false;
    
    protected int _t = 0; // Total
    protected int _p = 0; // Passed
    protected int _f = 0; // Failed
    protected int _w = 0; // Warn
    protected int _i = 0; // Info
    protected String t = "";   
    protected String F = "";   
    protected String EX = "";   
    protected String r_time = ""; 
    protected double sleep = 500; // milisec
    
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
    private String Report_File;
    private Duration DD;
    
    private String Ver = "";
    private String TZone;      
    private String Summary;
    private String r_type;  
    
    protected FluentWait loadTimeout = null;
    protected long WaitForElement = 1500; // milisec
    protected double LoadTimeOut = 15 * 1000; // milisec 
    
    private static SwingWorker BW1;  
    private static SwingWorker BW2; 
    private String Toast_Msg = ""; 
    private Instant run_start;
    private String err;

    private String SQL;
    private String AP3_TKN = "";
    private boolean CONFIG = false;
    private String C = "";
    private int wdLastRow = -1; 
    private int d2LastRow = -1; 
    
    protected List<String> SECTORS;
    protected List<String> SECTOR_IDS;
    protected List<String> COMPANIES;
    protected List<String> COMP_IDS;

    private String SCOPE;
    
    protected String New_ID = "";
    protected String Tab_Name;
    
    protected String Day;
    protected String Open;
    protected String Close;
    protected String New_From;
    protected String New_To;
    protected String _24;    
    
    protected String ADMIN_ID;
    protected String ADMIN_PW;
    protected String SM_ID; 
    protected String SM_PW;
    protected String IM_ID; 
    protected String IM_PW;
      
    private String S_Client_ID = "";
    private String S_Client_Secret  = "";
    private String S_Signing_Secret = "";
    private String S_Hook = "";
    
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
    
    protected String url = "";
    protected String app = "";
    protected String appId = "";
    protected String env = "";
    protected String platform = "CDL";
    protected String BaseAPI;
    protected String COUNTRY = "COUNTRY";
    protected String SITE = "";
    protected String SiteID = "";
    protected String SECTOR = "";
    protected String BRAND = "";
    protected String BrandID = "";
    protected String Location = "";
    protected String SectorID = "";
    protected String CompanyID = "";
    protected String DH_Menu_ID = "";    
    protected String GL_MENU = "TIM HORTONS";

    // </editor-fold>
 
    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">     
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (wdLastRow == DV1.getSelectedRow() || DV1.getRowCount() == 0) {
           return;
        }
        SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        COUNTRY = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 2));
        wdLastRow = DV1.getSelectedRow(); 
        GUI_Get_Brands();
    }//GEN-LAST:event_DV1MouseClicked
    private void C360_AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_C360_AncestorAdded
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
    }//GEN-LAST:event_C360_AncestorAdded
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        A.A.F_COUNT--;
        if(BW1 != null && !BW1.isCancelled()) BW1.cancel(true);
        if(BW2 != null && !BW2.isCancelled()) BW2.cancel(true);
    }//GEN-LAST:event_formInternalFrameClosed
    private void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if (d2LastRow == DV2.getSelectedRow() || DV2.getRowCount() == 0) {
           return;
        }
        d2LastRow = DV2.getSelectedRow(); 
        BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        Location = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 1));
        GUI_Get_Brand_Sector();
    }//GEN-LAST:event_DV2MouseClicked
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            this.setTitle("C360 Automation Manager >>> Changing Application,  please wait...");
            app = cmbApp.getSelectedItem().toString();
            GUI_Get_Sites();
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            this.setTitle("C360 Automation Manager >>> Changing Environment,  please wait...");
            GUI_Load_Env();
            this.setTitle("C360 Automation Manager");
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        GUI_Save_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    private void btnExelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExelMouseClicked
        if(!btnExel.isEnabled()) {return;}
        btnExel.setEnabled(false);
        Report(true);
        btnExel.setEnabled(true);
    }//GEN-LAST:event_btnExelMouseClicked
    private void btnFailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFailsMouseClicked
        if(!btnFails.isEnabled()) {return;}
        String R = Func.SHOW_LOG_FILE(F, "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnFailsMouseClicked
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
        GUI_Run_Manual();
    }//GEN-LAST:event_btnRunMouseClicked

    private void _mobile_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__mobile_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__mobile_viewActionPerformed

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
                
        cmbApp.addItem("Boost");
        cmbApp.addItem("Canteen");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Rogers");
        cmbApp.addItem("StandardCognition");
        cmbApp.addItem("Tacit");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Development");
        //cmbEnv.addItem("Staging");
        //cmbEnv.addItem("Production");

     
        cmbEnv.setSelectedIndex(0); // 2 Select Development
        cmbApp.setSelectedIndex(0);
        
        Load = false;
        GUI_Load_Env();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;  
        this.setTitle("C360 Automation Manager");
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">      
    private void GUI_Load_Env(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://staging.cafe360.compassdigital.org/";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "http://dev.cafe360.compassdigital.org/";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "http://cafe360.compassdigital.org/";
        }    
        
        Get_AP3_TKN();
        GUI_Load_CONFIG(); 
        
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        GUI_Get_Sectors(); // load 1st to be ready for selection by BrandSector
        GUI_Get_Sites();
    }

    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM [dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            AP3_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append( "= AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Get_Sites() {
        wdLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
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
//            DV1.repaint();
            SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
            SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
            GUI_Get_Brands();
        }
        lblSITES.setText(app + " Sites (" + DV1.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Get_Brands() {
        d2LastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Brands ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
     
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
            //HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + DV1.getValueAt(DV1.getSelectedRow(), 3)); 
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
            JSONArray Loc = json.getJSONArray("locations");
            JSONArray brands = null;
            
            String brand;
            String location;
            String id;
            String unit_id;
            if (Location != null) {
                for (Object l : Loc) {
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
            BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
            Location = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 1));
        } else {
            BrandID = "null";
            Location = "";
        }
        d2LastRow = DV2.getSelectedRow();
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        lblBRANDS.setText("Selected Site Brands (" + DV2.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        
        GUI_Get_Brand_Sector();
    }

    private void GUI_Get_Sectors() {  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Groups/Sector ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        SECTORS = new ArrayList<>();
        SECTOR_IDS = new ArrayList<>();
        
        Load = true;
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
     
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
            for (int i = 0; i < Sectors.length(); i++) {
                SECTORS.add(Sectors.getJSONObject(i).getString("name"));
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
        int SectorIndex = -1;
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
                SectorID = json.getString("sector");
                if(!SectorID.isEmpty()){
                    for (int i = 0; i < SECTOR_IDS.size(); i++) {
                        if(SECTOR_IDS.get(i).equals(SectorID)){
                            SectorIndex = i;
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
        
        if(!SectorID.equals("")){
            txtSector.setText(SECTORS.get(SectorIndex));
        }else{
            txtSector.setText("Not Found");
            txtComp.setText("Not Found");
        }
        if(!"".equals(CompanyID)){
            GUI_Get_Companies();    // Load Brans Companies List after Brand's Gropu/Sector selected
            GUI_Get_Brand_Company(); // after Brand's Gropu/Sector selected            
        }
    } 
 
    private void GUI_Get_Companies() {  
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sector/Companies(Menus) ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            COMPANIES = new ArrayList<>();
            COMP_IDS = new ArrayList<>();
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();        
     
            HttpGet httpget = new HttpGet(BaseAPI + "/location/sector/" + SectorID + "?expanded=false");
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
            JSONArray Coimpanies = json.getJSONArray("companies");           
            String C_NAME = "";
            for (int i = 0; i < Coimpanies.length(); i++) {
                C_NAME = Coimpanies.getJSONObject(i).getString("name");
                if(!C_NAME.isEmpty()) {
                    COMPANIES.add(C_NAME);
                    COMP_IDS.add(Coimpanies.getJSONObject(i).getString("id"));
                }
            }
        } catch (IOException | JSONException ex) {
            txtLog.append("- GetCompanies: " + ex.getMessage() + "\r\n");  
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                txtLog.append("- GetCompanies: " + ex.getMessage() + "\r\n");
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
        if(!CompanyID.isEmpty()){
            for (int i = 0; i < COMP_IDS.size(); i++) {
                if(COMP_IDS.get(i).equals(CompanyID)){
                    CompanyIndex = i;
                }
            }
        }  
        if(!CompanyID.equals("")){
            txtComp.setText(COMPANIES.get(CompanyIndex));
        }else{
            txtComp.setText("Not Found");
            txtLog.append("- Company ID not Found in this Brand API" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
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
            txtLog.append( "= Report > Not Excel");
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
            Report_File = Func.fExcel(l, col, Values, "C360_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            txtLog.append( "= Report Excel file:\r\n" + Report_File + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            txtLog.append( "= Report > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void LOG_UPDATE(String GUI){  
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
                    " WHERE [app] = 'C360_" + env + "' AND [Status] = 'Running'");
            _update.setString(1, LocalDateTime.now().format(A.A.Date_formatter));
            _update.setString(2, LocalDateTime.now().format(A.A.Time_24_formatter));
            _update.setString(3, "C360_" + env);
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
            _update.setString(16, txtLog.getText());
            _update.setString(17, "Scope: " + SCOPE);
            _update.setString(18, EX);
            int row = _update.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            txtLog.append( "= LOG_UPDATE > SQL ERROR: " + ex.getMessage());
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
            _insert.setString(3, "C360_" + env);
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
            _insert.setString(16,  "= Job is running... ===\r\n" + "");
            _insert.setString(17, "Running");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
            conn.close();
        }  catch (SQLException ex) {
            txtLog.append( "= LOG_START > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void GUI_Load_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'C360' AND [env] = '" + env + "'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            CONFIG = false;
            txtLog.append( "= LOAD_CONFIG > ERROR: " + ex.getMessage());
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
            
        String[] lines = C.split(System.getProperty("line.separator"));  
        String value;
        try{             
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim(); 
                if(l.contains("cmbBROW: ")) cmbBrow.setSelectedItem(value);
                if(l.contains("env:")) env = value;
                if(l.contains("app:")) app = value;
                if(l.contains("url:")) url = value;
             
                if(l.contains("_slack:")) _slack.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_headless:")) _headless.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_mobile_view:")) _mobile_view.setSelected(Boolean.parseBoolean(value));
                
                if(l.contains("GROUP:")) SECTOR = value;
                if(l.contains("GL_MENU:")) GL_MENU = value;
                if(l.contains("SITE:")) SITE = value;
                if(l.contains("BRAND:")) BRAND = value;
                if(l.contains("DH_MENU_ID:")) txtDH_Id.setText(value);
                
                if(l.contains("txtEMail:")) txtADMIN_ID.setText(value);
                if(l.contains("txtPW:")) txtADMIN_PW.setText(value);
                if(l.contains("txtSM:")) txtSM_ID.setText(value);
                if(l.contains("txtSM_PW:")) txtSM_PW.setText(value);
                if(l.contains("txtIM:")) txtIM_ID.setText(value);
                if(l.contains("txtIM_PW:")) txtIM_PW.setText(value);

                if(l.contains("nShowPage:")) nShowPage.setValue(Double.parseDouble(value));
                if(l.contains("nWaitElement:")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nWaitLoad:")) nWaitLoad.setValue(Double.parseDouble(value));

                if(l.contains("_site:"))  _site.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_site_new:"))  _site_new.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_brand_new:"))  _brand_new.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_brand:"))  _brand.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_group_management:"))  _group_management.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_menu_manager:"))  _menu_manager.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_bulk_apply:"))  _bulk_apply.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_images:"))  _images.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_orders:"))  _orders.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_sales_reporting:"))  _sales_reporting.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_users:"))  _users.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_resent_updates:"))  _resent_updates.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_announcements:"))  _announcements.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_promo:"))  _promo.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_password:"))  _password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_roles:"))  _roles.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_all_data:"))  _all_data.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_logout:"))  _logout.setSelected(Boolean.parseBoolean(value));               
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
    private void GUI_Save_CONFIG() {
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
            
            C += "cmbBROW: " + cmbBrow.getSelectedItem().toString() + "\r\n";
            C += "url: " + url + "\r\n";
            C += "GROUP: " + txtSector.getText() + "\r\n";
            C += "GL_MENU: " + txtComp.getText() + "\r\n";
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
            C += "COUNTRY: " + COUNTRY + "\r\n";
            C += "DH_MENU_ID: " + txtDH_Id.getText() + "\r\n";
            
            C += "_slack: " + _slack.isSelected() + "\r\n";
            C += "_headless: " + _headless.isSelected() + "\r\n";  
            
            C += "_mobile_view: " + _mobile_view.isSelected() + "\r\n";
           
            C += "txtEMail: " + txtADMIN_ID.getText() + "\r\n";
            C += "txtPW: " + txtADMIN_PW.getText()  + "\r\n";
            C += "txtSM: " + txtSM_ID.getText()  + "\r\n";
            C += "txtSM_PW: " + txtSM_PW.getText() + "\r\n";
            C += "txtIM: " + txtIM_ID.getText()+ "\r\n";
            C += "txtIM_PW: " + txtIM_PW.getText() + "\r\n";

            C += "_site: " + _site.isSelected() + "\r\n";
            C += "_site_new: " + _site_new.isSelected() + "\r\n";
            C += "_brand_new: " + _brand_new.isSelected() + "\r\n";
            C += "_brand: " + _brand.isSelected() + "\r\n";
            C += "_group_management: " + _group_management.isSelected() + "\r\n";
            C += "_menu_manager: " + _menu_manager.isSelected() + "\r\n";
            C += "_bulk_apply: " + _bulk_apply.isSelected() + "\r\n";
            C += "_images: " + _images.isSelected() + "\r\n";
            C += "_orders: " + _orders.isSelected() + "\r\n";
            C += "_sales_reporting: " + _sales_reporting.isSelected() + "\r\n";
            C += "_users: " + _users.isSelected() + "\r\n";
            C += "_resent_updates: " + _resent_updates.isSelected() + "\r\n";
            C += "_announcements: " + _announcements.isSelected() + "\r\n";
            C += "_promo: " + _promo.isSelected() + "\r\n";
            C += "_password: " + _password.isSelected() + "\r\n";
            C += "_roles: " + _roles.isSelected() + "\r\n";           
            C += "_all_data: " + _all_data.isSelected() + "\r\n";
            C += "_logout: " + _logout.isSelected() + "\r\n";
            
            C += "nShowPage: " + nShowPage.getValue() + "\r\n";
            C += "nWaitElement: " + nWaitElement.getValue() + "\r\n";
            C += "nWaitLoad: " + nWaitLoad.getValue()+ "\r\n";
        } catch (Exception ex)  {
            txtLog.append( "= SAVE_CONFIG > ERROR: " + ex.getMessage());
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'C360' AND [env] = '" + env + "'";
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
            _insert.setString(4, "C360");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            txtLog.append( "= SAVE_CONFIG > OK (" + row + " row)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            conn.close();
        } catch (SQLException ex) {
            txtLog.append( "= SAVE_CONFIG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    private void GUI_Run_Manual(){
        btnRun.setEnabled(false);
        btnFails.setEnabled(false);
        btnExel.setEnabled(false);
  
        try{    
            run_start = Instant.now();
            Current_Log_Update(true, "= Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");
            
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

            ADMIN_ID = txtADMIN_ID.getText();
            ADMIN_PW = txtADMIN_PW.getText();
            SM_ID = txtADMIN_ID.getText();
            SM_PW = txtADMIN_ID.getText();
            IM_ID = txtADMIN_ID.getText();
            IM_PW = txtADMIN_ID.getText();
            ALL_DATA = _all_data.isSelected();
            DH_Menu_ID = txtDH_Id.getText(); // like NWEJgN87Q3Sw46JaQ1Q, length > 18
            
            SCOPE = "";
            r_type = "manual";
            
            if(DV1.getRowCount() > 0) {
                SITE = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
                platform = DV1.getValueAt(DV1.getSelectedRow(), 1).toString(); // platform
                COUNTRY = DV1.getValueAt(DV1.getSelectedRow(), 2).toString();
            }
            if(DV2.getRowCount() > 0) {
                BRAND = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
            }

            SECTOR = txtSector.getText();
            GL_MENU = txtComp.getText();
            //GroupID = "";
            //CompanyID = "";

            if(_headless.isSelected()) {
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
                if(l.contains("cmbBROW: ")) cmbBrow.setSelectedItem(value);
                if(l.contains("env:")) env = value;
                if(l.contains("app:")) app = value;
                if(l.contains("url:")) url = value;
             
                if(l.contains("_slack:")) _slack.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_headless:")) _headless.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_mobile_view:")) _mobile_view.setSelected(Boolean.parseBoolean(value));
                
                if(l.contains("GROUP:")) SECTOR = value;
                if(l.contains("GL_MENU:")) GL_MENU = value;
                if(l.contains("SITE:")) SITE = value;
                if(l.contains("BRAND:")) BRAND = value;
                if(l.contains("DH_MENU_ID:")) txtDH_Id.setText(value);
                
                if(l.contains("txtEMail:")) txtADMIN_ID.setText(value);
                if(l.contains("txtPW:")) txtADMIN_PW.setText(value);
                if(l.contains("txtSM:")) txtSM_ID.setText(value);
                if(l.contains("txtSM_PW:")) txtSM_PW.setText(value);
                if(l.contains("txtIM:")) txtIM_ID.setText(value);
                if(l.contains("txtIM_PW:")) txtIM_PW.setText(value);

                if(l.contains("nShowPage:")) nShowPage.setValue(Double.parseDouble(value));
                if(l.contains("nWaitElement:")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nWaitLoad:")) nWaitLoad.setValue(Double.parseDouble(value));

                if(l.contains("_site:"))  _site.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_site_new:"))  _site_new.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_brand_new:"))  _brand_new.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_brand:"))  _brand.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_group_management:"))  _group_management.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_menu_manager:"))  _menu_manager.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_bulk_apply:"))  _bulk_apply.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_images:"))  _images.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_orders:"))  _orders.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_sales_reporting:"))  _sales_reporting.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_users:"))  _users.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_resent_updates:"))  _resent_updates.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_announcements:"))  _announcements.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_promo:"))  _promo.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_password:"))  _password.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_roles:"))  _roles.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_all_data:"))  _all_data.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_logout:"))  _logout.setSelected(Boolean.parseBoolean(value)); 
            }            
            CONFIG = true;
            
            switch (env) {
                case "ST":
                    BaseAPI = "https://api.compassdigital.org/staging";
                    url = "https://staging.adminpanel.compassdigital.org/";
                    break;
                case "DE":
                    BaseAPI = "https://api.compassdigital.org/dev";
                    url = "https://dev.adminpanel.compassdigital.org/";
                    break;
                default:
                    BaseAPI = "https://api.compassdigital.org/v1";
                    url = "https://adminpanel.compassdigital.org/";
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
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + "C360" + "_" + env + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);
        
        HtmlReport.setSystemInfo("App Version", "Cafe 360" + " " + "Version - TBD"); 
        HtmlReport.setSystemInfo("Browser", cmbBrow.getSelectedItem().toString());        
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID); 
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        
        HtmlReporter.config().setDocumentTitle("JTT Web Automation Report");
        HtmlReporter.config().enableTimeline(false);
        HtmlReporter.config().setTheme(Theme.DARK);               
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
            case "FATAL":
                Test.log(Status.FATAL, MarkupHelper.createLabel(Test_Description, ExtentColor.PURPLE));
                if (Capture_Screenshot) {
                    Test.log(Status.FATAL, "Screenshot - click to open >  ", MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshot()).build());
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
            Instant dw_start = Instant.now();

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
                New_ID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
                Extent_Report_Config();// ======================================================================= 
                
                Execute();
                
                DD = Duration.between(run_start, Instant.now());
                Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MMM_yyyy_hh_mma"));
                Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");
                
                EX = "C360 " + env + ", v" + Ver + ", Browser: " + cmbBrow.getSelectedItem().toString() +
                    " - Steps: " + _t + ", Passed: " + _p + ", Warnings: " + _w + ", Failed: " + _f + ". Scope: " + SCOPE + "\r\n" +
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
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "PASS" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                            
                            } else if(Toast_Msg.toLowerCase().contains("could not")|| 
                                    Toast_Msg.toLowerCase().contains("unable to save")|| 
                                    Toast_Msg.toLowerCase().contains("fail")) {
                                _t++;
                                _f++;
                                F += "Step: " + _t + " > FAIL - " + Toast_Msg + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "FAIL" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            } else if(Toast_Msg.toLowerCase().contains("fix") || Toast_Msg.toLowerCase().contains("error")) {
                                _t++;
                                _w++;
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            } else {
                                _t++;
                                _w++;
                                //F += "Step: " + _t + " > WARN - " + tt + "\r\n";
                                EX += _t + "\t" + " === Snackbar Toast Msg" + "\t" + "[role='alert']" + "\t" + Toast_Msg + "\t" + "WARN" + "\t" + " - " + "\t" + " - " + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + " - " + "\r\n";                           
                            }
                            Thread.sleep(4000); //  pause till new alert expected ???? 
                        }
                    } catch (InterruptedException ex){ // Exception ex
                        txtLog.append( "= BW2: " + ex.getMessage() + "\r\n");
                        txtLog.setCaretPosition(txtLog.getDocument().getLength());                         
                    }
                }
            }
        }; 
        BW2.execute();  // executes the swingworker on worker thread   
    }
    private void BW1_FAIL_LOG_UPDATE(String Error){
        Summary = "BW1 - Failed";
        DD = Duration.between(run_start, Instant.now());
        LOG_UPDATE("- BW1 ERROR: " + Error);
        btnRun.setEnabled(true);
    }
    private void Execute() throws Exception {
        if(_login.isSelected()){
            SCOPE += "Login";
            ParentTest = HtmlReport.createTest("Cafe 360 Login"); 
            C360_login BR = new C360.C360_login(C360_GUI.this);
            BR.run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            Thread.sleep(1500);            
        }
//        if(_login.isSelected()){
//            SCOPE += "Login";
//            ParentTest = HtmlReport.createTest("Cafe 360 Login"); 
//            C360_login BR = new C360.C360_login(C360_GUI.this);
//            BR.run(); // ======================================
//            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
//            Thread.sleep(1500);            
//        }
    }
    private void BW1_Done(boolean GUI) throws Exception{
        DD = Duration.between(run_start, Instant.now());
             
        Slack_Channel = "xtt_test";
        _Slack = true;
        Zip_Report = true;
        
        Last_EX = EX;
        Summary = "Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i;
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
                    t_rep += "= Total Calls: " + t_calls +
                            ", Response Times (sec) - Min: " + df.format(t_min) +
                            ", Avg: " + df.format(t_avg) +
                            ", Max: " + df.format(t_max) +
                            ", p50: " + df.format(p_50) +
                            ", p90: " + df.format(p_90);
                }
                Current_Log_Update(GUI, t_rep + "\r\n");
            }
        } catch(Exception ex){
            Current_Log_Update(GUI, "= LOG_UPDATE > Call Times parsing ERROR: " + ex.getMessage() + "\r\n");
        }
        
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= Scope: " + SCOPE + "\r\n"); // SCOPE shown in EX top
        Current_Log_Update(GUI, "= C360" + " v: " + "?" + ", Environment: " + env + "\r\n");
        
        if(GUI){
            Log = txtLog.getText();
        }
        LOG_UPDATE(Log); // ========================================================
        HtmlReporter.config().setReportName("C360" + " v: " + "?" + ", Environment: " + env + ", Summary: Total Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i);
        HtmlReport.flush();
        
        if(_Slack && !Slack_Channel.equals("N/A")){
            Report(false);
            String MSG = "C360_" + env + " Excel Automation report - " + Report_Date +  
                    "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: *" + A.A.UserID + "*\r\n" +
                    "Browser: *" + cmbBrow.getSelectedItem().toString() + "*, Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" +        
                    "Scope: " + SCOPE + "\r\n" +
                    "Steps: " + _t + ", Passed: " + _p + ", *Failed: " + _f + "*, Warnings: " + _w + ", Info: " + _i;
            
            Current_Log_Update(GUI, Func.Send_File_with_Message_to_Slack(Report_File, Slack_Channel, MSG));
            File ef = new File(Report_File);
            if(ef.exists() && !ef.isDirectory()) {
                ef.delete();
            }  
            String HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Click to Open";
            String HTML_Path = HtmlReporter.getFilePath();
            if(Zip_Report){
                String Origin_HTML = HTML_Path;
                HTML_Path = A.Func.Zip_File(HTML_Path);
                File hf = new File(Origin_HTML);
                if(hf.exists() && !hf.isDirectory()) {
                    hf.delete();
                }
                HTML_Report_Msg = "HTML Report - to view please Click > Open containing folder > Extract Here > open unzipped HTML file";
            }
            Current_Log_Update(GUI, Func.Send_File_with_Message_to_Slack(HTML_Path, Slack_Channel, HTML_Report_Msg));
            File hf = new File(HTML_Path);
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
    }

    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Driver Actions > Log Step Result">  
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Target URL" + "\t" + LINK + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + URL + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + FROM+ "\t" + TO + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + FROM + "\t" + TO + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim(); err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void To_Top(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
       sw1.start();
       FAIL = false;
        try {
            Actions action = new Actions(d1);
            action.sendKeys(Keys.HOME).perform();
            _p++;
            EX += _t + "\t" + "Move to page Top" + "\t" + "Current page" + "\t" + "Scroll bar at top" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Top" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + "Move to page Bottom" + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Swith_to_Frame(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        t = "empty"; FAIL = false;
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "X = " + X + ", Y = " + Y + "\t" + "Scroll Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }    

    protected void Wait_For_Element_By_Path_Visibility(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + PATH + "\t" + "LoadTimeOut " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Move '" + DIRECTION + "' of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            //Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            t = "Not Found";
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Not Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
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
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Text Found" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECTED){
                _f++; FAIL = false; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));                
            } else {
                _p++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex) {
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();
 
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + " > " + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
    protected void Element_Attribute(String NAME, WebElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {       
        t = "empty";
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();       
 
        FAIL = false;
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            } 
        } catch(Exception ex){
            _f++; FAIL = false; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
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
            if(L3.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L3.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + L3.size() + " item(s) (L3)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH+ "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "List index " + I + " > " + PATH + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + BY + " " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
        String RR = "";
        CloseableHttpClient httpclient = HttpClients.createDefault(); 
        try {
            HttpGet httpget = new HttpGet(URL); 
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
            _p++; 
            API_Response_Body = httpclient.execute(httpget, responseHandler);
            r_time += Math.round(sw1.elapsed(TimeUnit.MILLISECONDS)) + ";";
            EX += _t + "\t == " + NAME + "\t" + URL + "\t" + "Call successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));                
            } else {
                _p++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECT_OK){
                _f++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
                Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));                
            } else {
                _p++; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t == " + NAME + "\t" + URL + "\t" + err + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n"; 
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Found - not expected" + "\t" + "FAIL" + "\t" + "not Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - expected" + "\t" + "FAIL" + "\t" + "Not Found - Expected" +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                      
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + "Not Found - as expected" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }                                    
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + VAL + "\t" + " --- " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                } else {
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Found - Brand AP3 Status: 'Not Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }  
            } else{
                if(EXPECTED){
                    _f++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Supported'" + "\t" + "FAIL" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                     
                    Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                } else {
                    _p++; 
                    EX += _t + "\t == " + NAME + "\t" + "*_supported" + "\t" + "Not Found - Brand AP3 Status: 'Not Supported'" + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                       
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }                                    
            }
        } catch(Exception ex){
            _f++; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t == " + NAME + "\t" + TARGET + "\t" + "*_supported" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + "Delete the file after test" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
                Log_Html_Result("FAIL", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                if("User_Count".equals(CHECK)){
                    ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(DIR + File.separator + t), StandardCharsets.UTF_8));
                    if(lines.size() == Integer.parseInt(VAL) + 1){
                        _p++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "PASS" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                             
                        Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                    } else{
                        _w++; 
                        EX += _t + "\t" + NAME + "\t" + F_NAME + "\t" + lines.size() + " Expected: header + " + VAL + "\t" + "WARN" + "\t" + "User Count + Header" +
                        "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                            
                        Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                    }
                }
                if("Site_Count".equals(CHECK)){
                    _p++; 
                    EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                    "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                    Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
                }
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                _w++; 
                EX += _t + "\t" + NAME + "\t" + DIR + "\t" + t + "\t" + "WARN" + "\t" + "File not found" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIR + "\t" + "File not found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
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
   
    protected void Element_By_DisplayCheck(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();      
 
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
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
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
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    // </editor-fold>
     
    // <editor-fold defaultstate="collapsed" desc="GUI Variables Declaration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JCheckBox _all_data;
    private javax.swing.JCheckBox _announcements;
    private javax.swing.JCheckBox _brand;
    private javax.swing.JCheckBox _brand_new;
    private javax.swing.JCheckBox _bulk_apply;
    private javax.swing.JCheckBox _group_management;
    private javax.swing.JCheckBox _headless;
    private javax.swing.JCheckBox _images;
    private javax.swing.JCheckBox _login;
    private javax.swing.JCheckBox _logout;
    private javax.swing.JCheckBox _menu_manager;
    private javax.swing.JCheckBox _mobile_view;
    private javax.swing.JCheckBox _notifications;
    private javax.swing.JCheckBox _orders;
    private javax.swing.JCheckBox _password;
    private javax.swing.JCheckBox _promo;
    private javax.swing.JCheckBox _resent_updates;
    private javax.swing.JCheckBox _roles;
    private javax.swing.JCheckBox _sales_analytics;
    private javax.swing.JCheckBox _sales_reporting;
    private javax.swing.JCheckBox _site;
    private javax.swing.JCheckBox _site_new;
    private javax.swing.JCheckBox _slack;
    private javax.swing.JCheckBox _smart_analytics;
    private javax.swing.JCheckBox _users;
    private javax.swing.JButton btnExel;
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
    private javax.swing.JLabel lblSITES1;
    private javax.swing.JLabel lblSITES10;
    private javax.swing.JLabel lblSITES11;
    private javax.swing.JLabel lblSITES12;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES15;
    private javax.swing.JLabel lblSITES2;
    private javax.swing.JLabel lblSITES3;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES5;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES8;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JSpinner nShowPage;
    private javax.swing.JSpinner nWaitElement;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JTextField txtADMIN_ID;
    private javax.swing.JTextField txtADMIN_PW;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtDH_Id;
    private javax.swing.JTextField txtIM_ID;
    private javax.swing.JTextField txtIM_PW;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtSM_ID;
    private javax.swing.JTextField txtSM_PW;
    private javax.swing.JTextField txtSector;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}