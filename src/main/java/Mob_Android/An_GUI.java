package Mob_Android;
import A.Func;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
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
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

/**
 *
 * @author Oleg.Spozito
 */
public class An_GUI extends javax.swing.JInternalFrame {
    public An_GUI() {  
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rb_NU_EU = new javax.swing.ButtonGroup();
        lblSITES = new javax.swing.JLabel();
        lblBRANDS = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        paneCore_Scope = new javax.swing.JPanel();
        _support = new javax.swing.JCheckBox();
        _forgot_pw = new javax.swing.JCheckBox();
        _allow_loc = new javax.swing.JCheckBox();
        _order_history = new javax.swing.JCheckBox();
        rbNU_EU = new javax.swing.JRadioButton();
        _edit_profile = new javax.swing.JCheckBox();
        _invalids = new javax.swing.JCheckBox();
        _logout = new javax.swing.JCheckBox();
        _order_email = new javax.swing.JCheckBox();
        _login = new javax.swing.JCheckBox();
        _all_cards = new javax.swing.JCheckBox();
        _reorder = new javax.swing.JCheckBox();
        cmbPromo = new javax.swing.JComboBox<>();
        lblSITES12 = new javax.swing.JLabel();
        _optX = new javax.swing.JCheckBox();
        _acc_options = new javax.swing.JCheckBox();
        _edit_item = new javax.swing.JCheckBox();
        jrbNU = new javax.swing.JRadioButton();
        _welcome = new javax.swing.JCheckBox();
        _explore = new javax.swing.JCheckBox();
        cmbMPlan = new javax.swing.JComboBox<>();
        rbEU = new javax.swing.JRadioButton();
        lblSITES8 = new javax.swing.JLabel();
        _promo = new javax.swing.JCheckBox();
        _mplan = new javax.swing.JCheckBox();
        _feedback = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        nWaitElement = new javax.swing.JSpinner();
        nWaitLoad = new javax.swing.JSpinner();
        lblSITES9 = new javax.swing.JLabel();
        lblSITES10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnRun = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFails = new javax.swing.JButton();
        btnExel = new javax.swing.JButton();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES13 = new javax.swing.JLabel();
        lblSITES14 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        cmbApp = new javax.swing.JComboBox<>();
        _slack = new javax.swing.JCheckBox();
        txtMobile_Id = new javax.swing.JTextField();
        txtMobile_Pw = new javax.swing.JTextField();
        lblSITES3 = new javax.swing.JLabel();
        lblSITES6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DV3 = new javax.swing.JTable();
        lblAPK = new javax.swing.JLabel();
        cmbDevice = new javax.swing.JComboBox<>();
        btnGetScreenshot = new javax.swing.JButton();
        btnFindDevice = new javax.swing.JButton();
        btnInstallAll = new javax.swing.JButton();
        btnS3Install = new javax.swing.JButton();
        btnGetAPK = new javax.swing.JButton();
        lblSITES4 = new javax.swing.JLabel();
        txtBolter_Id = new javax.swing.JTextField();
        lblSITES7 = new javax.swing.JLabel();
        txtBolter_Pw = new javax.swing.JTextField();
        btnScreenshotFolder = new javax.swing.JButton();
        btnInstallAPK = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Android Automation Manager >>> loading, please wait ... ... ... ...");
        setMinimumSize(new java.awt.Dimension(858, 527));
        setName("Android"); // NOI18N
        setPreferredSize(new java.awt.Dimension(858, 527));
        setVisible(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Android_AncestorAdded(evt);
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
        getContentPane().add(lblSITES, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 4, 360, -1));

        lblBRANDS.setText("Selected Site - Brands");
        lblBRANDS.setName("lblBRANDS"); // NOI18N
        getContentPane().add(lblBRANDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 4, 268, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Scope"));
        jPanel1.setToolTipText("");
        jPanel1.setDoubleBuffered(false);
        jPanel1.setName("Scope"); // NOI18N

        _support.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _support.setText("NU Contact Us, Support");
        _support.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _support.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _support.setRequestFocusEnabled(false);

        _forgot_pw.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _forgot_pw.setText("NU Forgot Password");
        _forgot_pw.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _forgot_pw.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _forgot_pw.setRequestFocusEnabled(false);

        _allow_loc.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _allow_loc.setText("Allow Location");
        _allow_loc.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _allow_loc.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _allow_loc.setRequestFocusEnabled(false);

        _order_history.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _order_history.setText("Order History");
        _order_history.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _order_history.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _order_history.setRequestFocusEnabled(false);

        rb_NU_EU.add(rbNU_EU);
        rbNU_EU.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rbNU_EU.setSelected(true);
        rbNU_EU.setText("Both");

        _edit_profile.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _edit_profile.setSelected(true);
        _edit_profile.setText("NU Edit Profile");
        _edit_profile.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _edit_profile.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _edit_profile.setRequestFocusEnabled(false);

        _invalids.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _invalids.setText("Invalid entries");
        _invalids.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _invalids.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _invalids.setRequestFocusEnabled(false);

        _logout.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _logout.setText("Logout");
        _logout.setContentAreaFilled(false);
        _logout.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _logout.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        _order_email.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _order_email.setText("EU Order Email");
        _order_email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _order_email.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _order_email.setRequestFocusEnabled(false);

        _login.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _login.setSelected(true);
        _login.setText("Login");
        _login.setEnabled(false);
        _login.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _login.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _login.setRequestFocusEnabled(false);

        _all_cards.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _all_cards.setText("NU All Credit Cards");
        _all_cards.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _all_cards.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _all_cards.setRequestFocusEnabled(false);

        _reorder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _reorder.setText("EU Reorder");
        _reorder.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _reorder.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _reorder.setRequestFocusEnabled(false);

        cmbPromo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        lblSITES12.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES12.setText("Meal Plan");
        lblSITES12.setAlignmentX(0.5F);

        _optX.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _optX.setText("=====");
        _optX.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _optX.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _optX.setRequestFocusEnabled(false);

        _acc_options.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _acc_options.setText("NU My Account options");
        _acc_options.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _acc_options.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _acc_options.setRequestFocusEnabled(false);

        _edit_item.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _edit_item.setText("Edit / Remove Item");
        _edit_item.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _edit_item.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _edit_item.setRequestFocusEnabled(false);

        rb_NU_EU.add(jrbNU);
        jrbNU.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jrbNU.setText("NU");

        _welcome.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _welcome.setText("NU Welcome screen");
        _welcome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _welcome.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _welcome.setRequestFocusEnabled(false);

        _explore.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _explore.setText("Explore");
        _explore.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _explore.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _explore.setRequestFocusEnabled(false);

        cmbMPlan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        rb_NU_EU.add(rbEU);
        rbEU.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        rbEU.setText("EU");

        lblSITES8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES8.setText("Promo Code");
        lblSITES8.setAlignmentX(0.5F);

        _promo.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _promo.setText("Promos");
        _promo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _promo.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _promo.setRequestFocusEnabled(false);

        _mplan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _mplan.setText("Meal Plan Order");
        _mplan.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _mplan.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _mplan.setRequestFocusEnabled(false);

        _feedback.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        _feedback.setText("NU Feedback");
        _feedback.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        _feedback.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        _feedback.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setText("New/Existing User:");

        javax.swing.GroupLayout paneCore_ScopeLayout = new javax.swing.GroupLayout(paneCore_Scope);
        paneCore_Scope.setLayout(paneCore_ScopeLayout);
        paneCore_ScopeLayout.setHorizontalGroup(
            paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_optX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_invalids, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_order_history, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_order_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(_reorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(_explore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_edit_item, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(_promo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_mplan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_allow_loc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_support, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(_welcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_acc_options, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(_edit_profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_all_cards, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_feedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_forgot_pw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCore_ScopeLayout.createSequentialGroup()
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                                .addComponent(jrbNU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbEU)
                                .addGap(0, 0, 0)
                                .addComponent(rbNU_EU))
                            .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblSITES12))
                            .addComponent(lblSITES8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPromo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMPlan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );
        paneCore_ScopeLayout.setVerticalGroup(
            paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCore_ScopeLayout.createSequentialGroup()
                        .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_invalids, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_explore, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_optX, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_allow_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_order_history, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_edit_item, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_order_email, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_promo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_reorder, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_mplan, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCore_ScopeLayout.createSequentialGroup()
                        .addComponent(_edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_all_cards, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_forgot_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCore_ScopeLayout.createSequentialGroup()
                        .addComponent(_support, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(_acc_options, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jrbNU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbEU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNU_EU, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSITES8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneCore_ScopeLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(paneCore_ScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbMPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES12))))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCore_Scope, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCore_Scope, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 152, 420, 220));

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
        DV1.setGridColor(new java.awt.Color(153, 153, 153));
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

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 20, 424, 172));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 20, 420, 84));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Wait (sec):"));

        nWaitElement.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitElement.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.0d, 5.0d, 0.5d));
        nWaitElement.setName("nWaitElement"); // NOI18N

        nWaitLoad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        nWaitLoad.setModel(new javax.swing.SpinnerNumberModel(30.0d, 0.0d, 60.0d, 5.0d));
        nWaitLoad.setName("nWaitLoad"); // NOI18N

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
                .addGap(147, 147, 147)
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
                    .addComponent(lblSITES9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 104, 420, -1));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        txtLog.setPreferredSize(null);
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 372, 428, 128));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        jPanel3.add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 48, 78, 20));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        jPanel3.add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 48, 84, 22));

        btnFails.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnFails.setText("Show Fails");
        btnFails.setEnabled(false);
        btnFails.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnFails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFailsMouseClicked(evt);
            }
        });
        jPanel3.add(btnFails, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 24, 84, 20));

        btnExel.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnExel.setText("Excel Rep");
        btnExel.setEnabled(false);
        btnExel.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnExel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExelMouseClicked(evt);
            }
        });
        jPanel3.add(btnExel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 84, 20));

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });
        jPanel3.add(btnSave_Opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 48, 116, 22));

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);
        jPanel3.add(lblSITES13, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 8, 92, 16));

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);
        jPanel3.add(lblSITES14, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 8, 92, 16));

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.setForeground(new java.awt.Color(0, 0, 204));
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbEnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 24, 116, 20));

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.setForeground(new java.awt.Color(0, 0, 204));
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 24, 108, 20));

        _slack.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        _slack.setText("Report to Slack");
        _slack.setToolTipText("");
        _slack.setRequestFocusEnabled(false);
        jPanel3.add(_slack, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 52, 100, 14));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 428, 416, -1));

        txtMobile_Id.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_Id.setText("cdl.test.xtt@gmail.com");
        getContentPane().add(txtMobile_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 376, 188, -1));

        txtMobile_Pw.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_Pw.setText("Password1");
        getContentPane().add(txtMobile_Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 376, 92, -1));

        lblSITES3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES3.setText("Mobile User:");
        lblSITES3.setToolTipText("");
        lblSITES3.setAlignmentX(0.5F);
        getContentPane().add(lblSITES3, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 380, 76, -1));

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES6.setText("PW:");
        lblSITES6.setAlignmentX(0.5F);
        getContentPane().add(lblSITES6, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 380, -1, -1));

        DV3.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV3.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV3.setName("DV3"); // NOI18N
        DV3.setOpaque(false);
        DV3.setRowHeight(18);
        DV3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(DV3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 212, 424, 60));

        lblAPK.setText("Builds / APK");
        lblAPK.setAlignmentX(0.5F);
        getContentPane().add(lblAPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 196, 360, -1));

        cmbDevice.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbDevice.setForeground(new java.awt.Color(0, 51, 204));
        cmbDevice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDeviceItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbDevice, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 348, 424, 20));

        btnGetScreenshot.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnGetScreenshot.setText("Take ScreenShot");
        btnGetScreenshot.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnGetScreenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetScreenshotMouseClicked(evt);
            }
        });
        getContentPane().add(btnGetScreenshot, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 300, 104, 20));

        btnFindDevice.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnFindDevice.setText("Find Connected Device(s) >");
        btnFindDevice.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnFindDevice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindDeviceMouseClicked(evt);
            }
        });
        getContentPane().add(btnFindDevice, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 324, 156, 20));

        btnInstallAll.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnInstallAll.setText("Install All from App Tester ");
        btnInstallAll.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnInstallAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstallAllMouseClicked(evt);
            }
        });
        getContentPane().add(btnInstallAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 276, 148, 20));

        btnS3Install.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnS3Install.setText("Install Selected S3 Build ^");
        btnS3Install.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnS3Install.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnS3InstallMouseClicked(evt);
            }
        });
        getContentPane().add(btnS3Install, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 276, 156, 20));

        btnGetAPK.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnGetAPK.setText("Get Build from Device");
        btnGetAPK.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnGetAPK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGetAPKMouseClicked(evt);
            }
        });
        getContentPane().add(btnGetAPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 156, 20));

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES4.setText("Bolter User:");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);
        getContentPane().add(lblSITES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 400, 76, -1));

        txtBolter_Id.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtBolter_Id.setText("cdl.test.xtt+rn@gmail.com");
        getContentPane().add(txtBolter_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 396, 188, -1));

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSITES7.setText("PW:");
        lblSITES7.setAlignmentX(0.5F);
        getContentPane().add(lblSITES7, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 400, -1, -1));

        txtBolter_Pw.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtBolter_Pw.setText("Password1");
        getContentPane().add(txtBolter_Pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 396, 92, -1));

        btnScreenshotFolder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnScreenshotFolder.setText("Current Directory Folder");
        btnScreenshotFolder.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnScreenshotFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScreenshotFolderMouseClicked(evt);
            }
        });
        getContentPane().add(btnScreenshotFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 300, 148, 20));

        btnInstallAPK.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnInstallAPK.setText("Install Build file...");
        btnInstallAPK.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnInstallAPK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInstallAPKMouseClicked(evt);
            }
        });
        getContentPane().add(btnInstallAPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 276, 104, 20));

        getAccessibleContext().setAccessibleName("Android");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Instance Variables Declarations">
    private int d1LastRow = -1; 
    private int d2LastRow = -1; 
    private boolean Load = true; 
    private SwingWorker BW1;  
    private Instant run_start;
    private String err;   
    
    private String HTML_Report_Path = null;
    private ExtentSparkReporter HtmlReporter;
    protected ExtentReports HtmlReport;
    protected ExtentTest ParentTest;
            
    protected Duration DD;  
    protected final Stopwatch sw1 = Stopwatch.createUnstarted();

    protected String ADB_HOME = "";
    protected String EMULATOR_HOME = "";
    protected boolean Update_Build = false;   
    protected String AWS_A_key = "";   
    protected String AWS_S_key = "";   
    protected AWSCredentials AWS_credentials;   

    protected String appPackage = "";   
    protected String appActivity = "";   
    protected String appBuldFile = "";   
    protected String appVersion = "";   
    
    protected String device = "";   
    protected String devID = "";    
    protected String devOS = "";   
    
    protected String Report_Date;
    protected String SCOPE = "";   
    protected String Last_EX = "";   
    protected String Excel_Report_Path = "";    
    protected String New_ID = "";

    protected String Mobile_ID = "";   
    protected String Mobile_PW = "";   
    protected String Bolter_ID = "";   
    protected String Bolter_PW = "";   
         
    protected String ap3_url = "";
    protected String app_url = "";
    protected String app = "";
    protected String appId = "";
    protected String env = "";
    protected String platform = "CDL";
    protected String BaseAPI = "";   
    protected String COUNTRY = "COUNTRY";
    protected String SITE = "";
    protected String SiteID = "";
    protected String GROUP = "";
    protected String BRAND = "";
    protected String BrandID = "";
    protected String Location = "";
    protected String Menu = "";
    protected String Category = "";
    protected String Options = "";   
    
    protected int _t = 0; // Total
    protected int _p = 0; // Passed
    protected int _f = 0; // Failed
    protected int _w = 0; // Warn
    protected int _i = 0; // Info
    protected String t = "";   
    protected String F = "";   
    protected String EX = "";   
    protected String r_time = "";    

    protected AndroidDriver<AndroidElement> ad = null;
    protected FluentWait loadTimeout = null;
    protected AppiumDriverLocalService appiumService = null;
    protected long WaitForElement = 1500; // milisec
    protected double LoadTimeOut = 15 * 1000; // milisec  
    
    protected int t_calls = 0;
    protected double t_min = 0;
    protected double t_max = 0;
    protected double t_avg = 0;
    protected double p_50 = 0;
    protected double p_90 = 0;  
    
    protected String r_type = "";   

    protected String Ver = "";
    protected String TZone = "";      
    protected String Summary = "";   
    protected String Log = "";   
    protected boolean FAIL = false;
    
    protected final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    protected final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    protected final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    

    protected List<AndroidElement> aL0 = null;
    protected List<AndroidElement> aL1 = null;
    protected List<AndroidElement> aL2 = null;
    protected List<AndroidElement> aL3 = null;
    protected AndroidElement ae = null;
    protected AndroidElement ae1 = null;
    protected AndroidElement ae2 = null;
    protected AndroidElement ae3 = null;
    
    private boolean CONFIG = false;
    private boolean Zip_Report = true;
    private String Slack_Channel = "";
    protected boolean _Slack = false;
    protected boolean _Support = false;
    protected boolean _Forgot_pw  = false;
    protected boolean _Allow_loc  = false;
    protected boolean _Order_history  = false;
    protected boolean _Edit_profile  = false;
    protected boolean _Invalids = false;
    protected boolean _Logout = false;
    protected boolean _Order_email = false;
    protected boolean _Login = false;
    protected boolean _All_cards = false;
    protected boolean _Reorder = false;
    protected boolean _OptX = false;
    protected boolean _Acc_options = false;
    protected boolean _Edit_item = false;
    protected boolean _Welcome = false;
    protected boolean _Explore = false;
    protected boolean _Promo = false;
    protected boolean _Mplan = false;
    protected boolean _Feedback = false;
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">   
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if (d1LastRow == DV1.getSelectedRow() || DV1.getRowCount() == 0) {
           return;
        }
        SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
        SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
        COUNTRY = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 2));
        d1LastRow = DV1.getSelectedRow(); 
        GUI_Get_Brands();
    }//GEN-LAST:event_DV1MouseClicked
    private void Android_AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Android_AncestorAdded
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
            public void componentHidden(ComponentEvent ae) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }//GEN-LAST:event_Android_AncestorAdded
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        A.A.F_COUNT--;
        A.A.An_F_COUNT--;
        if(BW1 != null && !BW1.isCancelled()) {
            BW1.cancel(true);
        }
    }//GEN-LAST:event_formInternalFrameClosed
    private void DV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV2MouseClicked
        if (d2LastRow == DV2.getSelectedRow() || DV2.getRowCount() == 0) {
           return;
        }
        d2LastRow = DV2.getSelectedRow(); 
        BrandID = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 2));
        Location = String.valueOf(DV2.getValueAt(DV2.getSelectedRow(), 1));
    }//GEN-LAST:event_DV2MouseClicked
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            this.setTitle("Android Automation Manager >>> Changing Application,  please wait...");
            app = cmbApp.getSelectedItem().toString();
            app_url = "";
            app_url = Func.App_ID(app, env);

            GUI_Get_S3_Packages(AWS_credentials);
            
            Set_Mobile_Package_Name();
            
            Current_Log_Update(true, "- Check Package " + "\r\n"); 
            Current_Log_Update(true, CheckAppPackage());                                 
            
            if(app.startsWith("Chrome")){
                // do nothing
            }else if(app.equals("Bolter")) {
                GUI_Get_Bolter_Site();
            }else{
                GUI_Get_Sites();
            }
            this.setTitle("Android Automation Manager " + A.A.An_F_COUNT);  
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            this.setTitle("Android Automation Manager >>> Changing Environment,  please wait...");
            GUI_Load_Env();
            this.setTitle("Android Automation Manager");
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
        String R = A.Func.SHOW_LOG_FILE(F, "txt");
        if(!R.equals("OK")){
            Current_Log_Update(true, R + "\r\n");
        }
    }//GEN-LAST:event_btnFailsMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        
//        Current_Log_Update(true, An_Met.Get_Bolter_User_Site_ID(txtBolter_Id.getText(), txtBolter_Pw.getText()) + "\r\n");
       
        String R = A.Func.SHOW_LOG_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            Current_Log_Update(true, R + "\r\n");
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        GUI_Run_Manual();
    }//GEN-LAST:event_btnRunMouseClicked
    private void btnGetScreenshotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetScreenshotMouseClicked
        if(!btnGetScreenshot.isEnabled()){
            return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        Current_Log_Update(true, "- Take Screenshot..." + "\r\n");

        File SCREEN = null;
        String SS = "";
        try {  
            String file = A.A.CWD + File.separator + "ScreenShots" + File.separator + "Mobile_Screen_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMdd_hhmmss")) + ".jpg";
            SCREEN = new File(file);                      // -ad " + devID
            SS = Func.ExecuteCmdProcessBuilder(( ADB_HOME + "adb exec-out screencap -p > " + file).trim(), A.A.CWD, true, true).trim();
            Thread.sleep(3000);
            Current_Log_Update(true, SS + "\r\n");
            Current_Log_Update(true, "= ScreenShot > " + file + "\r\n");
        }
        catch (InterruptedException ex) {
            Current_Log_Update(true, "= ScreenShot > " + ex.getMessage() + "\r\n");
        }
        try {
            java.awt.Desktop.getDesktop().edit(SCREEN);
        }
        catch (IOException ex) {
            Current_Log_Update(true, "= Show last ScreenShot >  " + ex.getMessage() + "\r\n");
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnGetScreenshotMouseClicked
    private void btnFindDeviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindDeviceMouseClicked
        GUI_Find_Connected_Devices();
        if(cmbDevice.getSelectedItem().toString().contains("noDevice")){
            return;
        }
        Current_Log_Update(true, "- Check Device " + "\r\n"); 
        Current_Log_Update(true, CheckDevice(cmbDevice.getSelectedItem().toString()));                                  
        
        Current_Log_Update(true, "- Check Package " + "\r\n"); 
        Current_Log_Update(true, CheckAppPackage());                                 
    }//GEN-LAST:event_btnFindDeviceMouseClicked
    private void btnInstallAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstallAllMouseClicked
        if(!btnInstallAll.isEnabled()){
            return;
        }
        GUI_Install_All_AppTester();
    }//GEN-LAST:event_btnInstallAllMouseClicked
    private void btnS3InstallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnS3InstallMouseClicked
        if(!btnS3Install.isEnabled()){
            return;
        }
        GUI_InstallBuild_S3();
    }//GEN-LAST:event_btnS3InstallMouseClicked
    private void btnGetAPKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGetAPKMouseClicked
        if(!btnGetAPK.isEnabled()){
            return;
        }
        Object[] options = {"Yes", "No"};
        int reply = JOptionPane.showOptionDialog(this,
            "Pull " + app + " " + appVersion + " APK file from " + device + " device to your desktop?" + "\r\n" +
            "Existing " + app + " " + appVersion + " file will be replaced",
            "Pull APK file",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            "No"); // options[1]
        if (reply == 1){
            return;
        }       
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        btnRun.setEnabled(false);
        btnGetScreenshot.setEnabled(false);
        btnGetAPK.setEnabled(false);
        btnS3Install.setEnabled(false);
        btnInstallAll.setEnabled(false); 
        btnInstallAPK.setEnabled(false);
        Current_Log_Update(true, "- Get APK..." + "\r\n");
       
        try {
            String R = Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " shell pm path " + appPackage, A.A.CWD, true, true).trim();
            Current_Log_Update(true, R.trim() + "\r\n");
            
            String where = System.getProperty("user.home") + File.separator + "Desktop";
            R = Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " pull " + R.trim().substring(R.indexOf(":") + 1) + " " + where, where, true, true).trim();
            Current_Log_Update(true, R.trim() + "\r\n");

            Files.move(Paths.get(where + File.separator + "base.apk"), Paths.get(where + File.separator + app + "_" + appVersion + ".apk"), java.nio.file.StandardCopyOption.REPLACE_EXISTING );
            
            Current_Log_Update(true, "File Saved: " + where + File.separator + app + "_" + appVersion + ".apk" + "\r\n");         
        } catch (IOException ex) {
            Current_Log_Update(true, "= Get APK > ERROR: " + ex.getMessage() + "\r\n");
        }
        btnRun.setEnabled(true);
        btnGetScreenshot.setEnabled(true);
        btnGetAPK.setEnabled(true);
        btnS3Install.setEnabled(true);
        btnInstallAll.setEnabled(true); 
        btnInstallAPK.setEnabled(true);
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));         
    }//GEN-LAST:event_btnGetAPKMouseClicked
    private void cmbDeviceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDeviceItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
        if(cmbDevice.getSelectedItem().toString().contains("noDevice")){
            return;
        }
            Current_Log_Update(true, "- Check Device " + "\r\n"); 
            Current_Log_Update(true, CheckDevice(cmbDevice.getSelectedItem().toString()));                                 
        }
    }//GEN-LAST:event_cmbDeviceItemStateChanged
    private void btnScreenshotFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScreenshotFolderMouseClicked
        Current_Log_Update(true, "- Open Current Directory Folder > " + "\r\n" + "=== Look for ScreenShots, Packages, etc." + "\r\n");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        try{     
            String dir = A.A.CWD; 
            Desktop.getDesktop().open(new File(dir));            
        } catch (IOException ex) {
            Current_Log_Update(true, "= Open Current Directory Folder > ERROR: " + ex.getMessage() + "\r\n");
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } 
    }//GEN-LAST:event_btnScreenshotFolderMouseClicked
    private void btnInstallAPKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInstallAPKMouseClicked
        File BuildFile = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(A.A.CWD + File.separator + "MobileBuilds"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
            BuildFile = fileChooser.getSelectedFile();
            
            Current_Log_Update(true, "- UnInstall Package: " + appPackage + " > " + "\r\n");
            Current_Log_Update(true, UnInstaPackage(appPackage));                  
            
            Current_Log_Update(true, "- Install Build: " + BuildFile + " > " + "\r\n"); 
            Current_Log_Update(true, InstallBuild(BuildFile.getAbsolutePath())); 
            
            Current_Log_Update(true, "- Check Package " + "\r\n"); 
            Current_Log_Update(true, CheckAppPackage());                                 
          
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        }
    }//GEN-LAST:event_btnInstallAPKMouseClicked
    // </editor-fold>   
    
    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">    
    private void Load_Form(){   
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));

        Load = true; 
        if(A.A.WsOS.toLowerCase().contains("windows")){
            ADB_HOME = "";    
        }else{
            ADB_HOME = System.getenv("HOME") + File.separator + "Library" + File.separator + "Android"+ File.separator + "sdk" + File.separator + "platform-tools" + File.separator;     
        }
        Get_S3_MOB_Credentials();              

        cmbApp.addItem("Bolter"); 
        cmbApp.addItem("Boost"); 
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Thrive");
        cmbApp.addItem("Chrome C360");
        cmbApp.addItem("Chrome WO");
        
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");
        cmbEnv.addItem("Development");
     
        cmbEnv.setSelectedIndex(0); // 2 Select Development
        cmbApp.setSelectedIndex(1); // 1 Boost
        
        Load = false;
        GUI_Load_Env();
        
        CONFIG = false;  
        GUI_Find_Connected_Devices();
        
        this.setTitle("Android Automation Manager " + A.A.An_F_COUNT);  
        
        if(cmbDevice.getSelectedItem().toString().contains("noDevice")){
            return;
        }
        Current_Log_Update(true, "- Check Device " + "\r\n"); 
        Current_Log_Update(true, CheckDevice(cmbDevice.getSelectedItem().toString()));                                 
      
        Current_Log_Update(true, "- Check Package " + "\r\n"); 
        Current_Log_Update(true, CheckAppPackage());                                
    }
    private void GUI_Load_Env(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            ap3_url = "https://staging.adminpanel.compassdigital.org/";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            ap3_url = "https://dev.adminpanel.compassdigital.org/";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            ap3_url = "https://adminpanel.compassdigital.org/";
        }     

        GUI_Load_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        app_url = Func.App_ID(cmbApp.getSelectedItem().toString(), env);
        
        Set_Mobile_Package_Name();
        GUI_Get_S3_Packages(AWS_credentials);
        
        if("Bolter".equals(app)) {
            GUI_Get_Bolter_Site();
        } else{
            GUI_Get_Sites();
        }
    }
    private void GUI_Get_Sites() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        d1LastRow = -1;
        Current_Log_Update(true,"- Load Sites ..." + "\r\n");
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
            Current_Log_Update(true,"- GUI_Get_Sites: " + ex.getMessage() + "\r\n");     
        }         
        finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                Current_Log_Update(true,"- GUI_Get_Sites: " + ex.getMessage() + "\r\n"); 
            }
        }
        Current_Log_Update(true,"== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
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
    private void GUI_Get_Bolter_Site() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        d1LastRow = -1;

        Current_Log_Update(true,"- Get Bolter " + cmbEnv.getSelectedItem().toString() + " Site ..." + "\r\n");
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        String Site_ID = Get_Bolter_User_Site_ID(txtBolter_Id.getText(), txtBolter_Pw.getText());
        if(Site_ID.contains("ERROR")){
            Current_Log_Update(true, Site_ID + "\r\n");        
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            sw1.reset();
            return;
        }
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
        
        String TBL = "";
        switch (env) {
            case "PR":
                TBL = "p2_sites_pr";
                break;
            case "ST":
                TBL = "p2_sites_st"; 
                break;
            default:
                TBL = "p2_sites_de"; 
                break;
        }
        String site;
        String _platform;
        String country;
        String id;
        try {
            try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
                ResultSet rs = conn.createStatement().executeQuery("SELECT [Site], [Platform], [Country], [id] FROM " + TBL + " WHERE [id] = '" + Site_ID.trim() + "'");
                rs.next();
                site = rs.getString(1);
                _platform = rs.getString(2);
                country = rs.getString(3);
                id = rs.getString(4);
            } 
            SitesModel.addRow(new Object[]{site, _platform, country, id});
            
            DV1.setModel(SitesModel);
            DV1.setDefaultEditor(Object.class, null);
            DV1.getColumnModel().getColumn(0).setPreferredWidth(250);
            DV1.getColumnModel().getColumn(1).setPreferredWidth(70);
            DV1.getColumnModel().getColumn(2).setPreferredWidth(50);
            DV1.getColumnModel().getColumn(3).setPreferredWidth(400);  
            
            sorter.setSortable(0, true); 
            sorter.sort();             
            
        } catch (Exception ex) {
            Current_Log_Update(true,"- Get Bolter Site ERROR > location_group: " + Site_ID + " >> " + ex.getMessage() + "\r\n");
            sw1.reset();
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        } 

        Current_Log_Update(true,"== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        sw1.reset();
        
        if (DV1.getRowCount() > 0) {
            DV1.changeSelection(0, 0, false, false);
            SITE = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 0));
            SiteID = String.valueOf(DV1.getValueAt(DV1.getSelectedRow(), 3));
            GUI_Get_Brands();
        }
        lblSITES.setText(app + " Sites (" + DV1.getRowCount() + " found)");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Get_Brands() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        d2LastRow = -1;
        Current_Log_Update(true, "- Load Brands ..." + "\r\n"); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
        String[] BrandsColumnsName = {"Station", "Location", "Brand Id", "Unit ID"}; 
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
            JSONArray Locations = json.getJSONArray("locations");
            JSONArray brands = null;
            
            String brand;
            String location;
            String id;
            String unit_id;
            if (Location != null) {
                for (Object l : Locations) {
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
                            boolean delivery = false;
                            if(br.getJSONObject("is").has("delivery_supported")){
                                delivery = br.getJSONObject("is").getBoolean("delivery_supported");
                            }
                            if(!"Bolter".equals(app) || delivery){
                                BrandsModel.addRow(new Object[]{brand, location, id, unit_id});                                
                            }
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
            Current_Log_Update(true, "- GUI_Get_Brands: " + ex.getMessage() + "\r\n");      
        }         
        finally {
            try {
                httpclient.close();
            } catch (IOException ex) {
                Current_Log_Update(true, "- GUI_Get_Brands: " + ex.getMessage() + "\r\n");   
            }
        } 
        Current_Log_Update(true, "== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
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
    }
    private String Get_Bolter_User_Site_ID(String ID, String PW){  
        String Site_ID = "ERROR";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            String UserAuth = Base64.getEncoder().encodeToString((ID + ":" + PW).getBytes());
            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + "bolter"); 
            httpget.setHeader("Authorization", "Basic " + UserAuth);
            httpget.setHeader("From", "Bolter/1.0");
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            if(json.has("profile")){
                Site_ID = json.getJSONObject("profile").getString("location_group") + "\r\n";  
            }else{
                if(json.has("error")){
                    Site_ID = "= Get_Bolter_User_Site_ID > ERROR: " + json.getString("error")+ "\r\n"; 
                    Site_ID += "= URL: " + BaseAPI + "/user/auth" + "?realm=" + "bolter" + "\r\n";
                    Site_ID += "= Runner: " + ID + "\r\n";
                }
            }
            return Site_ID;  
        } catch (IOException | JSONException ex){
            return "= Get_Bolter_User_Site_ID > ERROR: " + ex.getMessage() + "\r\n";
        }
    }  

    private void GUI_Find_Connected_Devices(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        btnRun.setEnabled(false);
        btnGetScreenshot.setEnabled(false);
        btnGetAPK.setEnabled(false);
        btnS3Install.setEnabled(false);
        btnInstallAll.setEnabled(false); 
        btnInstallAPK.setEnabled(false);
        Load = true;  
        cmbDevice.removeAllItems();
        Current_Log_Update(true, "- Find Attached Android Devices ..." + "\r\n");

        String Dev  = Func.ExecuteCmdProcessBuilder(ADB_HOME + "adb devices -l", A.A.ADB_HOME, true, true).trim();
        String[] dev = Dev.split("\r\n");
        if (dev.length > 2) {
            for (int i = 1; i < dev.length - 1; i++) {
                String D = dev[i];
                if(D.contains("model")){
                    String ID = D.substring(0, dev[i].indexOf(" ")).trim();
                    D = D.substring(D.indexOf("model:") + 6);
                    D = D.substring(0, D.indexOf(" ")).trim();
                    cmbDevice.addItem(D + "  id:" + ID);
                }else{
                    cmbDevice.addItem(D);
                }
            }
             ///
            Current_Log_Update(true, "= " + Dev + "\r\n");              
            btnRun.setEnabled(true);
            if(cmbDevice.getItemCount() == 1){
                btnGetScreenshot.setEnabled(true); 
            } else{
                btnGetScreenshot.setEnabled(false); 
            }
            btnRun.setEnabled(true);
            btnGetAPK.setEnabled(true);
            btnS3Install.setEnabled(true);
            btnInstallAll.setEnabled(true); 
            btnInstallAPK.setEnabled(true);
            
            cmbDevice.setSelectedIndex(0);        
        } else {
            cmbDevice.addItem("noDevice");
            Current_Log_Update(true, "= No Attached Device(s) found" + "\r\n" + "Return from 'adb devices -l' > '" + Dev + "'" + "\r\n");          
        }
        Load = false; 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));     
    } 
    private void GUI_Install_All_AppTester() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        btnRun.setEnabled(false);
        btnGetScreenshot.setEnabled(false);
        btnGetAPK.setEnabled(false);
        btnS3Install.setEnabled(false);
        btnInstallAll.setEnabled(false); 
        btnInstallAPK.setEnabled(false);        
        Current_Log_Update(true, "- Install All APK(s) - App Tester ..." + "\r\n");
        
        Swipe_WakeUp(); // ===================  
        try {
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();  

            DesiredCapabilities  cap = new DesiredCapabilities ();
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", device);
            cap.setCapability("platformVersion", devOS);
            cap.setCapability("clearSystemFiles", true);
            cap.setCapability("appPackage", "dev.firebase.appdistribution");
            cap.setCapability("appActivity", "dev.firebase.appdistribution.main.MainActivity");
            cap.setCapability("udid", devID);
            cap.setCapability("autoGrantPermissions", false); // false- always get prompt
            cap.setCapability("unicodeKeyboard", false);
            cap.setCapability("resetKeyboard", false);
            cap.setCapability("noReset", true); // ====== ?????
            cap.setCapability("automationName", "UiAutomator2"); 
            
            AppiumServiceBuilder builder = new AppiumServiceBuilder();
            builder.usingAnyFreePort();
            AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildService(builder);
            appiumService.start();
            
            ad = new AndroidDriver(new URL(appiumService.getUrl().toString()), cap);                
            ad.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);
                      
            loadTimeout = new FluentWait(ad).withTimeout(Duration.ofMillis((long) LoadTimeOut))			
			.pollingEvery(Duration.ofMillis(200))  			
			.ignoring(NoSuchElementException.class);       
            
            Current_Log_Update(true, "= Android Driver Started in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\r\n");
            sw1.reset();
            
            try{
                loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("signInButton")));
                ad.findElement(By.id("signInButton")).click();
                loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.gms:id/account_name")));
                ad.findElement(By.id("com.google.android.gms:id/account_name")).click();
            } catch (Exception ex) {
                Current_Log_Update(true, "= 'Sign In...' ERROR - " + ex.getMessage()  + "\r\n");
            }

            loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("app_name")));
            Thread.sleep(500);
            aL0 = ad.findElements(By.id("app_name"));
            int app_count = aL0.size();
            if (app_count > 0) {
                Current_Log_Update(true, "Found Applications - total " + app_count + ": " + "\r\n");
                for (int i = 0; i < aL0.size(); i++) {
                    Current_Log_Update(true, "   - " + (i+1)  + ": " + aL0.get(i).getText() + "\r\n");
                }
                for (int i = 0; i < app_count; i++) {
                    ae = ad.findElements(By.id("app_name")).get(i); 
                    String appName = ae.getText();
                    ae.click();
                    String t = ((AndroidElement)loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("version_info")))).getText();
                    Current_Log_Update(true, "=====  Processing App " + (i + 1) + " - " + appName + " v:" + t + " ..." + "\r\n");
                    try {
                        ad.findElement(By.id("download_button")).click();
                        try {
                            loadTimeout.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progress_bar")));
                            loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("com.android.packageinstaller:id/ok_button")));
                            ad.findElement(By.id("com.android.packageinstaller:id/ok_button")).click();
                            loadTimeout.until(ExpectedConditions.invisibilityOfElementLocated(By.id("progress_bar")));
                            t = ((AndroidElement) loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("installed_version_info")))).getText();
                            Current_Log_Update(true, "- " + t  + "\r\n");

                            ad.findElement(By.id("back_arrow")).click(); 
                            loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("app_name")));
                        } catch(Exception ex) {
                            Current_Log_Update(true, "Download/Install failed: " + ex.getMessage() + "\r\n");
                        }
                    } catch (Exception ex){
                        Current_Log_Update(true, "Download button Not Found >> Latest Version already Insatlled (?)" + "\r\n");
                        ad.findElement(By.id("back_arrow")).click();
                        loadTimeout.until(ExpectedConditions.presenceOfElementLocated(By.id("app_name")));
                    }
                }
            } else {
                Current_Log_Update(true, "= " + "No Applications found" + "\r\n");
            } 
        } catch (Exception ex) {
            Current_Log_Update(true, "= App Tester ERROR: " + ex.getMessage() + "\r\n");
        }            
        if(ad != null) {
            ad.quit(); 
        }
        if(appiumService != null && appiumService.isRunning()){
            appiumService.stop();                    
        }
        
        btnRun.setEnabled(true);
        btnGetScreenshot.setEnabled(true);
        btnGetAPK.setEnabled(true);
        btnS3Install.setEnabled(true);
        btnInstallAll.setEnabled(true); 
        btnInstallAPK.setEnabled(true);        
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));         
    }       
    private void GUI_Get_S3_Packages(AWSCredentials credentials ){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Current_Log_Update(true, "- Load Android Packages list ..." + "\r\n");
        
        String[] SitesColumnsName = {"APK name","Date"}; 
        DefaultTableModel PModel = new DefaultTableModel();
        PModel.setColumnIdentifiers(SitesColumnsName);
        DV3.setModel(PModel);
        
        String BucketName = "";
        String S3_env = "";
        String S3_app = "";

        //Android app S3 bucket path
        String mobile_repo_name = "mobile-app-repos";
        String android_app_path_S3_bucket = "automation/android-coreapp/staging/";
        String Dev_android_app_path_S3_bucket = "automation/android-coreapp/daily/";

        //iOS app S3 bucket path
        String Dev_iOS_app_path_S3_bucket = "automation/novus/";
        String Staging_iOS_app_path_S3_bucket = "automation/novus/regression/";
        String Staging_iOS_app_path_S3_bucket_bolter = "automation/bolter/";
        String Prod_iOS_app_path_S3_bucket = "automation/novus/production/";
    
        switch (env) {
            case "PR":
                S3_env = "/android/production/";
                break;
            case "ST":
                S3_env = "/android/staging/";
                break;
            case "DE":
                S3_env = "/android/development/";
                break;            
        }
        switch (app) {
            case "Boost":
                S3_app = "/boost.zip";
                break;
            case "Bolter":
                S3_app = "/bolter.zip";
                break;
            case "JJKitchen":
                S3_app = "/jjkitchen.zip";
                break;            
            case "Nourish":
                S3_app = "/nourish.zip";
                break;
            case "Rogers":
                S3_app = "/rogers.zip";
                break;
            case "Thrive":
                S3_app = "/thrive.zip";
                break; 
        }  
        
        BucketName = "mobile-app-repos";//automation
        
        String PName = "";
        Date PDate = new Date();
        String X = "";
        try {
            AmazonS3 s3client = AmazonS3ClientBuilder
                    .standard()
                    .withCredentials(new AWSStaticCredentialsProvider(credentials))
                    .withRegion(Regions.US_EAST_1)
                    .build();
            ListObjectsV2Result PACK_List = s3client.listObjectsV2(BucketName);
            PACK_List.getObjectSummaries().sort(Comparator.comparing(S3ObjectSummary::getLastModified));
            for(int i = PACK_List.getObjectSummaries().size() -1 ; i > 0; i--){  // sort desc, default acs  

                PName = PACK_List.getObjectSummaries().get(i).getKey();
                PDate = PACK_List.getObjectSummaries().get(i).getLastModified();
                X +=  PName + "  -  " + PDate + "\r\n";
                if(PName.contains(S3_env) && PName.contains(S3_app)){
                    PModel.addRow(new Object[]{PName, PDate});                              
                }
            }
            
            DV3.setModel(PModel);
            DV3.setDefaultEditor(Object.class, null);
            DV3.getColumnModel().getColumn(0).setPreferredWidth(240);
            DV3.getColumnModel().getColumn(1).setPreferredWidth(170);
            DV3.changeSelection(0, 1, false, false);
            
            Current_Log_Update(true, "= BucketName: " + PACK_List.getBucketName() + ", Size: " + PACK_List.getObjectSummaries().size() + "\r\n");
            Current_Log_Update(true, X + "\r\n");
        } catch (Exception ex) {
            Current_Log_Update(true, "= " + "GetPackages: " + ex.getMessage() + "\r\n");
        }     
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    } 
    private void GUI_InstallBuild_S3(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));  
        Current_Log_Update(true, "- Download_Build > " + "\r\n"); 
        String RES = String.valueOf(DV3.getValueAt(DV3.getSelectedRow(), 0));
        RES = Download_Build(RES); // ====================
        Current_Log_Update(true, RES);
        
        if(RES.contains("OK")){
            Current_Log_Update(true, "- UnZip Build > " + "\r\n"); 
            RES = Unzip_Build();                        // ====================
            Current_Log_Update(true, RES);
            
            if(RES.contains("OK")){
                Current_Log_Update(true, "- UnInstall Package > " + appPackage + "\r\n"); 
                RES = UnInstaPackage(appPackage);   // ====================
                Current_Log_Update(true, RES);
                
                String BuildPath = A.A.CWD + File.separator + "MobileBuilds" + File.separator + appBuldFile;
                
                Current_Log_Update(true, "- Install Build > " + BuildPath + "\r\n"); 
                RES = InstallBuild(BuildPath); // ==================== 
                Current_Log_Update(true, RES);
                
                Current_Log_Update(true, "- Check AppPackage> " + appPackage + "\r\n"); 
                RES = CheckAppPackage();               // ==================== 
                Current_Log_Update(true, RES);         
            }
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));     
    }     
    protected void Set_Mobile_Package_Name(){
        if (app.startsWith("Chrome")) {
            appPackage = "com.android.chrome";
            appActivity = "N/A";
        }
        if ("Boost".equals(app)) {
            appPackage = "com.compass_canada.boost";
            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
        }
        if ("JJKitchen".equals(app)) {
            appPackage = "io.compassdigital.jjkitchen";
            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
        }
        if ("Thrive".equals(app)) {
            appPackage = "com.compass_canada.thrive";
            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
        }
        if ("Nourish".equals(app)) {
            appPackage = "io.compassdigital.nourish";
            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
        }
        if ("Rogers".equals(app)) {
            appPackage = "com.compass_canada.digital_hospitality.rogers";
            appActivity = "io.compassdigital.ca.base.patron.splash.SplashActivity";
        }
        if ("Bolter".equals(app)) {
            appPackage = "io.compassdigital.delivery";
            appActivity = "io.compassdigital.delivery.splash.SplashActivity";
        }
    }

    protected String Swipe_WakeUp(){       
        return A.Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " shell input touchscreen swipe 800 400 400 400 100", A.A.CWD, false, false);    
    }
    protected String CheckDevice(String D){
        devID = "";
        device = "";
        if(D.contains("id:") && !D.contains("offline")){
            device = D.substring(0,D.indexOf(" ")).trim(); 
            devID = D.substring(D.indexOf("id:") + 3).trim();        
            devOS = A.Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " shell getprop ro.build.version.release", A.A.CWD, true, true).trim();
            devOS = devOS.replace("null", "").substring(0, devOS.indexOf("\r\n")).trim();
            return "= Model: " + device + ", OS version: " + devOS + " > OK " + "\r\n";
        } else{
            return "= CheckDevice: " + "ID Not Found Or device is Offline" + "\r\n";           
        }        
    }
    protected String CheckAppPackage(){
        String v1 = "?";
        String v2 = "?";
        appVersion = "Not Found";
        try{
            String v = A.Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " shell dumpsys package " + appPackage, A.A.CWD, true, true).trim();
            if ("".equals(v.trim())) {
                return "= appPackage  " + appPackage + " - no information\r\n";
            }
//            if(v.contains("pkg=Package{")){
//                Hash = v.substring(v.indexOf("pkg=Package{") + 12); // // pkg=Package{f2241b0 com.compass_canada.boost}  <<<< hash ??
//                Hash = Hash.substring(0, Hash.indexOf(" ")).trim();                
//            }
            if(v.contains("versionName") && v.contains("versionCode")) {
                v1 = v.substring(v.indexOf("versionName"));
                v1 = v1.substring(0, v1.indexOf("\r\n"));
                v1 = v1.substring(v1.indexOf("=") + 1).trim();
                v2 = v.substring(v.indexOf("versionCode"));
                v2 = v2.substring(0, v2.indexOf("\r\n"));
                v2 = v2.substring(v2.indexOf("=") + 1);
                v2 = v2.substring(0, v2.indexOf(" "));
                appVersion = v1 + "(" + v2 + ")"; // Git Hash: " + Hash;
            }
            return "= " + appPackage + " > Version: " + appVersion + " > OK" + "\r\n";
        } catch (Exception ex) { 
            return "= CheckAppPackage: " + ex.getMessage() + "\r\n";
        }      
    }
    protected String LOG_GET_DEVICE_STATUS(){
        String Job_Status = "";
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
        ResultSet rs = conn.createStatement().executeQuery("SELECT [env] FROM [dbo].[aw_result] WHERE "
                + " [summary] = '" + "Running..." + "' AND "
                + " [user_ws] = '" + A.A.WsID + "' AND "
                + " [env] LIKE '" + device + "%'" );
            if(rs.next()){
                Job_Status = rs.getString(1);
                conn.close(); 
                return "= Target Device is Busy " + Job_Status; 
            }else{           
                conn.close(); 
                return "= Target Device Availability Check > OK "; 
            }
        } catch (SQLException ex) {
            return "= Device Availability Check > SQL ERROR: " + ex.getMessage() + "\r\n";
        }
    }      
  
    private void GUI_Save_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String _S = "n/a";
        String _B = "n/a";
        String C ="";
        try {
            if(DV1.getRowCount() > 0){
                _S = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
            }
            if(DV2.getRowCount() > 0){
                _B = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
            }
            C = "";
            C += "device: " + "N/A" + "\r\n";
            C += "env: " + env + "\r\n";
            C += "app: " + cmbApp.getSelectedItem().toString() + "\r\n";
            C += "Site: " + _S + "\r\n";
            C += "Brand: " + _B + "\r\n";
            C += "Menu: " + "N/A" + "\r\n";
            C += "Category: " + "N/A" + "\r\n";
            C += "Options: " + "N/A" + "\r\n";  
            
            C += "txtMobile_Id: " + txtMobile_Id.getText() + "\r\n";
            C += "txtMobile_Pw: " + txtMobile_Pw.getText() + "\r\n";
            C += "txtBolter_Id: " + txtBolter_Id.getText() + "\r\n";
            C += "txtBolter_Pw: " + txtBolter_Pw.getText() + "\r\n";
            
            C += "nWaitElement: " + nWaitElement.getValue() + "\r\n";
            C += "nWaitLoad: " + nWaitLoad.getValue() + "\r\n";  
            
            C += "SlackCh: " + "xtt_test"; //txtSlackCh.getText() + "\r\n"; 
            C += "_slack: " + _slack.isSelected() + "\r\n";
            C += "_zip_report: " + "true" + "\r\n";
            
            C += "_acc_options: " + _acc_options.isSelected() + "\r\n";
            C += "_all_cards: " + _all_cards.isSelected() + "\r\n";
            C += "_allow_loc: " + _allow_loc.isSelected() + "\r\n";
            C += "_edit_item: " + _edit_item.isSelected() + "\r\n";
            C += "_edit_profile: " + _edit_profile.isSelected() + "\r\n";
            C += "_explore: " + _explore.isSelected() + "\r\n";
            C += "_feedback: " + _feedback.isSelected() + "\r\n";
            C += "_forgot_pw: " + _forgot_pw.isSelected() + "\r\n";
            C += "_invalids: " + _invalids.isSelected() + "\r\n";
            C += "_login: " + _login.isSelected() + "\r\n";
            C += "_logout: " + _logout.isSelected() + "\r\n";
            C += "_mplan: " + _mplan.isSelected() + "\r\n";
            C += "_optX: " + _optX.isSelected() + "\r\n";
            C += "_order_email: " + _order_email.isSelected() + "\r\n";
            C += "_order_history: " + _order_history.isSelected() + "\r\n";
            C += "_promo: " + _promo.isSelected() + "\r\n";
            C += "_reorder: " + _reorder.isSelected() + "\r\n";
            C += "_support: " + _support.isSelected() + "\r\n";
            C += "_welcome: " + _welcome.isSelected() + "\r\n";
           
        } catch (Exception ex)  {
            Current_Log_Update(true, "= SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            A.A.SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'MOB' AND [app] = 'Android' AND [env] = '" + env + "'";
            Statement _del = conn.createStatement();
            _del.execute(A.A.SQL);
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
            _insert.setString(3, "MOB");
            _insert.setString(4, "Android");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            conn.close(); 
            Current_Log_Update(true, "= SAVE_CONFIG > OK (" + row + " row)" + "\r\n");
        } catch (SQLException ex) {
            Current_Log_Update(true, "= SAVE_CONFIG > SQL ERROR: " + ex.getMessage() + "\r\n");
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GUI_Load_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        String C = "";
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            A.A.SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'MOB' AND [app] = 'Android' AND [env] = '" + env + "'" + "\r\n";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(A.A.SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            CONFIG = false;
            Current_Log_Update(true, "= LOAD_CONFIG > ERROR: " + ex.getMessage());
            Current_Log_Update(true, "= MOB / Android, User: " + A.A.UserID + ", Env: " + env + " > No saved Configuration Found" + "\r\n");
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
        String[] lines = C.split(System.getProperty("line.separator"));  
        String value;
        try{             
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if(l.contains("device: ")) device = value;
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;  
                if(l.contains("Site: ")) SITE = value;
                if(l.contains("Brand: ")) BRAND = value;
                if(l.contains("Menu: ")) Menu = value;
                if(l.contains("Category: ")) Category = value;
                if(l.contains("Options: ")) Options = value;  

                if(l.contains("txtMobile_Id: ")) txtMobile_Id.setText(value);
                if(l.contains("txtMobile_Pw: ")) txtMobile_Pw.setText(value);
                if(l.contains("txtBolter_Id: ")) txtBolter_Id.setText(value);
                if(l.contains("txtBolter_Pw: ")) txtBolter_Pw.setText(value);

                if(l.contains("nWaitElement: ")) nWaitElement.setValue(Double.parseDouble(value));
                if(l.contains("nWaitLoad: ")) nWaitLoad.setValue(Double.parseDouble(value)); 

                if(l.contains("Slack_Ch: ")) Slack_Channel = value;
                if(l.contains("_slack: ")) _slack.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_zip_report: ")) Zip_Report = Boolean.parseBoolean(value);
                
                if(l.contains("_acc_options: ")) _acc_options.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_all_cards: ")) _all_cards.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_allow_loc: ")) _allow_loc.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_edit_item: ")) _edit_item.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_edit_profile: ")) _edit_profile.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_explore: ")) _explore.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_feedback: ")) _feedback.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_forgot_pw: ")) _forgot_pw.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_invalids: ")) _invalids.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_login: ")) _login.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_logout: ")) _logout.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_mplan: ")) _mplan.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_optX: ")) _optX.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_order_email: ")) _order_email.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_order_history: ")) _order_history.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_promo: ")) _promo.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_reorder: ")) _reorder.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_support: ")) _support.setSelected(Boolean.parseBoolean(value));
                if(l.contains("_welcome: ")) _welcome.setSelected(Boolean.parseBoolean(value));
            }            
            CONFIG = true;
            Current_Log_Update(true, "= LOAD_CONFIG > OK" + "\r\n");
        } catch (Exception ex) {
            CONFIG = false;
            Current_Log_Update(true, "= LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
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
        RES = LOG_GET_DEVICE_STATUS();
        Current_Log_Update(false, RES + "\r\n");
        if(!RES.contains("OK")){
            return RES;
        }      
        
        if(RES.contains("ERROR")){
            Current_Log_Update(false, RES);
            return "JOB_STATUS > " + RES;
        }          
        
        if(Update_Build){
            // Get_S3_MOB_Credentials(); // alredy done
            // install resent APK
        }
        Set_Mobile_Package_Name();
        Current_Log_Update(false, "- Check Connected Device " + "\r\n");
        RES = JOB_Find_Connected_Devices();
        Current_Log_Update(false, RES);
        if(!RES.contains("OK")){
            return RES;
        }
        Current_Log_Update(false, "- Check Device " + "\r\n"); 
        Current_Log_Update(false, JOB_Check_Device_OS()); 
        Current_Log_Update(false, "- Check Package " + "\r\n"); 
        Current_Log_Update(false, CheckAppPackage()); 
        
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
                if(l.contains("device: ")) device = value;
                if(l.contains("update_build: ")) Update_Build = Boolean.parseBoolean(value);
                if(l.contains("env: ")) env = value;
                if(l.contains("app: ")) app = value;  
                if(l.contains("Site: ")) SITE = value;
                if(l.contains("Brand: ")) BRAND = value;
                if(l.contains("Menu: ")) Menu = value;
                if(l.contains("Category: ")) Category = value;
                if(l.contains("Options: ")) Options = value;  

                if(l.contains("txtMobile_Id: ")) Mobile_ID = value;
                if(l.contains("txtMobile_Pw: ")) Mobile_PW = value;
                if(l.contains("txtBolter_Id: ")) Bolter_ID = value;
                if(l.contains("txtBolter_Pw: ")) Bolter_PW = value;

                if(l.contains("nWaitElement: ")) WaitForElement = Math.round(Double.parseDouble(value) * 1000);
                if(l.contains("nWaitLoad: ")) LoadTimeOut = Math.round(Double.parseDouble(value) * 1000);

                if(l.contains("Slack_Ch: ")) Slack_Channel = value;
                if(l.contains("_slack: ")) _Slack = Boolean.parseBoolean(value);
           
                if(l.contains("_acc_options: ")) _Acc_options = Boolean.parseBoolean(value);
                if(l.contains("_all_cards: ")) _All_cards = Boolean.parseBoolean(value);
                if(l.contains("_allow_loc: ")) _Allow_loc = Boolean.parseBoolean(value);
                if(l.contains("_edit_item: ")) _Edit_item = Boolean.parseBoolean(value);
                if(l.contains("_edit_profile: ")) _Edit_profile = Boolean.parseBoolean(value);
                if(l.contains("_explore: ")) _Explore = Boolean.parseBoolean(value);
                if(l.contains("_feedback: ")) _Feedback = Boolean.parseBoolean(value);
                if(l.contains("_forgot_pw: ")) _Forgot_pw = Boolean.parseBoolean(value);
                if(l.contains("_invalids: ")) _Invalids = Boolean.parseBoolean(value);
                if(l.contains("_login: ")) _Login = Boolean.parseBoolean(value);
                if(l.contains("_logout: ")) _Logout = Boolean.parseBoolean(value);
                if(l.contains("_mplan: ")) _Mplan = Boolean.parseBoolean(value);
                if(l.contains("_optX: ")) _OptX = Boolean.parseBoolean(value);
                if(l.contains("_order_email: ")) _Order_email = Boolean.parseBoolean(value);
                if(l.contains("_order_history: ")) _Order_history = Boolean.parseBoolean(value);
                if(l.contains("_promo: ")) _Promo = Boolean.parseBoolean(value);
                if(l.contains("_reorder: ")) _Reorder = Boolean.parseBoolean(value);
                if(l.contains("_support: ")) _Support = Boolean.parseBoolean(value);
                if(l.contains("_welcome: ")) _Welcome = Boolean.parseBoolean(value);
            }            
            CONFIG = true;
            
            switch (env) {
                case "ST":
                    BaseAPI = "https://api.compassdigital.org/staging";
                    ap3_url = "https://staging.adminpanel.compassdigital.org/";
                    break;
                case "DE":
                    BaseAPI = "https://api.compassdigital.org/dev";
                    ap3_url = "https://dev.adminpanel.compassdigital.org/";
                    break;
                default:
                    BaseAPI = "https://api.compassdigital.org/v1";
                    ap3_url = "https://adminpanel.compassdigital.org/";
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
    private String JOB_Find_Connected_Devices(){
        Current_Log_Update(true, "- Find Attached Android Devices ..." + "\r\n");
        if(A.A.WsOS.toLowerCase().contains("windows")){
            ADB_HOME = "";  
            EMULATOR_HOME = "C:/Users/" + A.A.UserID + "/AppData/Local/Android/Sdk/emulator";
        }else{
            ADB_HOME = System.getenv("HOME") + File.separator + "Library" + File.separator + "Android"+ File.separator + "sdk" + File.separator + "platform-tools" + File.separator;     
            EMULATOR_HOME =System.getenv("HOME") + File.separator + "Library" + File.separator + "Android"+ File.separator + "sdk" + File.separator + "emulator" + File.separator;   
        }
        String Dev  = Func.ExecuteCmdProcessBuilder(ADB_HOME + "adb devices -l", A.A.ADB_HOME, true, true).trim();
        String[] dev = Dev.split("\r\n");
        if (dev.length > 2 && Dev.contains(device)) {
            for (int i = 1; i < dev.length; i++) {
                String D = dev[i];
                if(D.contains("model") && D.contains(device)){
                    devID = D.substring(0, dev[i].indexOf(" ")).trim();
                    D = D.substring(D.indexOf("model:") + 6);
                    D = D.substring(0, D.indexOf(" ")).trim();
                }
            }
            Current_Log_Update(false, "= " + Dev + "\r\n");  
            return "JOB_Find_Connected_Device > OK: Device " + device + " found" + "\r\n";
        } else {
            Current_Log_Update(false, "= Target Device " + device + " Not Found" + "\r\n");          
            return "JOB_Find_Connected_Devices > ERROR: " + "No Attached Device(s) found";
        } 
    } 
    private String JOB_Check_Device_OS(){
        Current_Log_Update(true, "- JOB_Check_Device_OS ..." + "\r\n");
        devOS = "Not Found";
        devOS = Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " shell getprop ro.build.version.release", A.A.CWD, true, true).trim();
        devOS = devOS.replace("null", "").substring(0, devOS.indexOf("\r\n")).trim();
        return "= JOB_Check_Device_OS > Model: " + device + ", OS version: " + devOS + "\r\n";
    } 
    
    private void GUI_Run_Manual(){
        String Device_Status = LOG_GET_DEVICE_STATUS();
        Current_Log_Update(true, Device_Status + "\r\n"); 
        if(!Device_Status.contains("OK")){
            return;
        }
        btnRun.setEnabled(false);
        btnFails.setEnabled(false);
        btnExel.setEnabled(false);
        try{
            run_start = Instant.now();
            Current_Log_Update(true, "= Execution started @" + LocalDateTime.now().format(A.A.Time_12_formatter) + "\r\n");

            WaitForElement = Math.round((double)nWaitElement.getValue() *1000);
            LoadTimeOut = (double)nWaitLoad.getValue() *1000;   
            _t = 0; // Total
            _p = 0; // Passed
            _f = 0; // Failed
            _w = 0; // Warn
            _i = 0; // Info
            t_calls = 0;
            t_min =  0;
            t_avg = 0;
            t_max =  0;
            p_50 = 0;
            p_90 = 0;
            Mobile_ID = txtMobile_Id.getText();
            Mobile_PW = txtMobile_Pw.getText();
            Bolter_ID = txtBolter_Id.getText();
            Bolter_PW = txtBolter_Pw.getText();

            //Slack_Channel = txt
            _Slack = _slack.isSelected();

            _Acc_options = _acc_options.isSelected();
            _All_cards = _all_cards.isSelected();
            _Allow_loc = _allow_loc.isSelected();
            _Edit_item = _edit_item.isSelected();
            _Edit_profile = _edit_profile.isSelected();
            _Explore = _explore.isSelected();
            _Feedback = _feedback.isSelected();
            _Forgot_pw = _forgot_pw.isSelected();
            _Invalids = _invalids.isSelected();
            _Login = _login.isSelected();
            _Logout = _logout.isSelected();
            _Mplan = _mplan.isSelected();
            _OptX = _optX.isSelected();
            _Order_email = _order_email.isSelected();
            _Order_history = _order_history.isSelected();
            _Promo = _promo.isSelected();
            _Reorder = _reorder.isSelected();
            _Support = _support.isSelected();
            _Welcome = _welcome.isSelected();

            SCOPE = "";
            r_type = "manual";

            if(DV1.getRowCount() > 0) {
                SITE = DV1.getValueAt(DV1.getSelectedRow(), 0).toString();
                platform = DV1.getValueAt(DV1.getSelectedRow(), 1).toString();
                COUNTRY = DV1.getValueAt(DV1.getSelectedRow(), 2).toString();
            }
            if(DV2.getRowCount() > 0) {
                BRAND = DV2.getValueAt(DV2.getSelectedRow(), 0).toString();
            }

            Current_Log_Update(true, "= Starting Appium Service and Android Driver..." + "\r\n");
            
            r_type = "ad-hoc";
            
            if(sw1.isRunning()){
                sw1.reset();
            }
            sw1.start();
            LOG_START();           // ============================================
            BW1_DoWork(true);  // ============================================
        }catch(Exception ex){
            Current_Log_Update(true, "= GUI_Run_Manual ERROR > " + ex.getMessage() + "\r\n");
            BW1_FAIL_LOG_UPDATE("= GUI_Run_Manual ERROR > " + ex.getMessage());
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
    protected String Report(boolean Open_File){
        Excel_Report_Path = "";
        if ("".equals(Last_EX.trim()) || "None".equals(Last_EX.trim())){
            return "= Report > Not Excel";
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
            Excel_Report_Path = A.Func.fExcel(l, col, Values, "Android_" + app + "_" + env + "_" + Report_Date, Top_Row, 0, 0, null, " ", " ", Open_File);
            return "= Report Excel file:\r\n" + Excel_Report_Path + "\r\n";
        } catch (IOException ex) {
            return "= Report > ERROR: " + ex.getMessage() + "\r\n";
        }
    }
    
    protected String LOG_START(){
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
            _insert.setString(3, "Android_" + app + "_" + env);
            _insert.setString(4, ap3_url);
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
            _insert.setString(15, device + " id:" + devID);
            _insert.setString(16, "=== Job is running... ===");
            _insert.setString(17, "Running");
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
            conn.close();
            return "= LOG_START > OK" + "\r\n";
        } catch (SQLException ex) {
            return "= LOG_START > SQL ERROR: " + ex.getMessage() + "\r\n";
        }
    }      
    protected String LOG_UPDATE(String LOG){  
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
                    " WHERE [app] = 'Android_" + app + "_" + env + "' "
                            + "AND [Status] = 'Running'"
                            + "AND [env] = '" + device + " id:" + devID + "'");
            _update.setString(1, LocalDateTime.now().format(Date_formatter));
            _update.setString(2, LocalDateTime.now().format(Time_24_formatter));
            _update.setString(3, "Android_" + app + "_" + env);
            _update.setString(4, ap3_url);
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
            _update.setString(15, device + " id:" + devID);
            _update.setString(16, LOG);
            _update.setString(17, "Scope: " + SCOPE);
            _update.setString(18, EX);
            int row = _update.executeUpdate();
            conn.close();
            return "= LOG_UPDATE > OK" + "\r\n";
        } catch (SQLException ex) {
            return "= LOG_UPDATE > SQL ERROR: " + ex.getMessage() + "\r\n";
        }
    }

    protected String Get_S3_MOB_Credentials(){     
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs1 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_A_Key_MOB'");
            rs1.next();
            AWS_A_key = rs1.getString(1);
            ResultSet rs2 = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S3_S_Key_MOB'");
            rs2.next();
            AWS_S_key = rs2.getString(1);
            conn.close();
            AWS_credentials = new BasicAWSCredentials(
                new String(Base64.getDecoder().decode(AWS_A_key)),
                new String(Base64.getDecoder().decode(AWS_S_key))
            );  
            return "= Get_S3_MOB_Credentials > " + "OK" + "\r\n";
        } catch (SQLException ex) {
            return "= Get_S3_MOB_Credentials > " + ex.getMessage() + "\r\n";
        }
    }
    protected String UnInstaPackage(String PKG) {
        return A.Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " uninstall " + PKG, A.A.CWD, true, true).trim() + "\r\n";
    } 
    protected String InstallBuild(String BuildFile) {
        return A.Func.ExecuteCmdProcessBuilder( ADB_HOME + "adb -s " + devID + " install -r " + BuildFile, A.A.CWD, true, true).trim() + "\r\n";
    }  
    protected File newUnzipFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destFile = new File(destinationDir, zipEntry.getName());
        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destFile.getCanonicalPath();
        if (!destFilePath.startsWith(destDirPath + File.separator)) {
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }
        return destFile;
    }
    protected String Unzip_Build (){           
        String dir = A.A.CWD + File.separator + "MobileBuilds"; 
        File zip_source = new File(dir + File.separator + "x.zip");
        File destDir = new File(dir);
        byte[] buffer = new byte[1024];
        try {
            try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zip_source))) {
                ZipEntry zipEntry = zis.getNextEntry();
                appBuldFile = zipEntry.getName();
                while (zipEntry != null) {
                    File newFile = newUnzipFile(destDir, zipEntry);
                    if (zipEntry.isDirectory()) {
                        //
                    } else { // fix for Windows-created archives
//                        File zipParent = newFile.getParentFile(); 
//                        if (!zipParent.isDirectory() && !zipParent.mkdirs()) {
//                            return "== " + "Failed to create directory " + zipParent + "\r\n";
//                        }
                        FileOutputStream fos = new FileOutputStream(newFile);
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            fos.write(buffer, 0, len);
                        }
                        fos.close();
                    }
                    zipEntry = zis.getNextEntry();
                }
                zis.closeEntry();
                zis.close();
            }
            return "== " + "Unzipped Build OK: " + appBuldFile + "\r\n"; 
        } catch (IOException ex) { 
            return "== " + "Unzip_Build: " + ex.getMessage() + "\r\n";
        }
    }      
    protected String Download_Build(String B_PATH){    
        String dir = A.A.CWD + File.separator + "MobileBuilds"; 
        try {                        
            AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(AWS_credentials))
                .withRegion(Regions.US_EAST_1)
                .build();
            S3Object s3object = s3client.getObject("mobile-app-repos", B_PATH);
            S3ObjectInputStream inputStream = s3object.getObjectContent();
            FileUtils.copyInputStreamToFile(inputStream, new File(dir + File.separator + "x.zip")); 
            return "== Download Build " + B_PATH + " OK >" + "\r\n" + "downloaded in " + dir + " as x.zip" + "\r\n";
        } catch (SdkClientException | IOException ex) { 
            return "== " + "Download_Build: " + ex.getMessage() + "\r\n";
        }
    }    
    protected String InstallBuild_S3(String B_PATH){        
        if(Download_Build(B_PATH).contains("OK")){
            if(Unzip_Build().contains("OK")){
                UnInstaPackage(appPackage);
                String BuildPath = A.A.CWD + File.separator + "MobileBuilds" + File.separator + appBuldFile;
                InstallBuild(BuildPath);
                CheckAppPackage();
            }
        }
        return "= InstallBuild_S3: Check Result...." + "\r\n";  
    }    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Extend HTML Report Methods">
    protected void Extent_Report_Config() throws IOException{
        HTML_Report_Path = System.getProperty("user.home") + File.separator + "Desktop";
        Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_HHmmss"));
        HtmlReporter = new ExtentSparkReporter(HTML_Report_Path + File.separator + "Android_" + app + "_" + env + "_" + Report_Date + ".html");
        HtmlReport = new ExtentReports();
        HtmlReport.attachReporter(HtmlReporter);
        
        HtmlReport.setSystemInfo("App Version", app + " " + appVersion); 
        HtmlReport.setSystemInfo("Device Name", device);        
        HtmlReport.setSystemInfo("Device ID", devID);
        HtmlReport.setSystemInfo("Machine", A.A.WsID);
        HtmlReport.setSystemInfo("Machine OS", A.A.WsOS);
        HtmlReport.setSystemInfo("Tester ID", A.A.UserID); 
        HtmlReport.setSystemInfo("Run Trigger", r_type);
        HtmlReport.setReportUsesManualConfiguration(true); // DEBUG - steps duration time incorrect
        
        HtmlReporter.config().setDocumentTitle("JTT Mobile Automation Report");
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
            File SF = ad.getScreenshotAs(OutputType.FILE);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ImageIO.write(ImageIO.read(SF), "png", bos);
            SF.delete();
            return "data:image/png;base64, " + Base64.getEncoder().encodeToString(bos.toByteArray());
        }catch (IOException ex) {
            return "data:image/png;base64," + " ERROR: " + ex.getMessage();
        }

    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Background Worker: Appium Service > Android Driver > Execution > Reports">
    private void BW1_DoWork(Boolean GUI) throws Exception{
        BW1 = new SwingWorker() {
            Instant dw_start = Instant.now();
            @Override
            protected String doInBackground() throws Exception {
                String DriverStart = StartAndroidDriver();
                if(DriverStart.contains("OK")){
                    Current_Log_Update(GUI, "= Appium Service and Android Driver Started in " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\r\n");
                    sw1.reset();
                } else{
                    Current_Log_Update(GUI, DriverStart.trim() + "\r\n");
                    Summary = "Start Driver - Failed";
                    DD = Duration.between(run_start, Instant.now());
                    LOG_UPDATE(DriverStart.trim() + "\r\n");   // ======================================================
                    btnRun.setEnabled(true);
                    btnFails.setEnabled(true);
                }
                
                New_ID = "9" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
                Extent_Report_Config();// ======================================================================= 
                
                if (app.equals("Bolter")) {
                    Execute_Bolter();
                }else if (app.equals("Chrome C360")) {
                    Execute_C360();    
                }else if (app.equals("Chrome WO")) {
                    Execute_WO(); 
                }else{
                    Execute_Core_App();
                }
                DD = Duration.between(run_start, Instant.now());
                Report_Date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMMyyyy_hh_mma"));
                Current_Log_Update(GUI, "========   " + "Execution step-by-step log..." + "   ========" + "\r\n");
                
                EX = "Android " + app + " " + env + ", App v: " + appVersion + ", Device: " + device + " OS v:" + devOS +
                        " - Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i + ". Scope: " + SCOPE + "\r\n" +
                        "#\tTC\tTarget/Element/Input\tExpected/Output\tResult\tComment/Error\tResp\tTime\tJIRA\r\n"
                        + EX;
                
                Current_Log_Update(GUI, EX.replaceAll("\t", " > ") + "\r\n");
                
                BW1_Done(GUI); // ================================================================================
                
                if(_f > 0) {
                    return "= Completed @" + LocalDateTime.now().format(Time_12_formatter) + " with " + _f + " FAIL(s)"+ ", Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" ;
                }else{
                    return "= Completed @" + LocalDateTime.now().format(Time_12_formatter)+ ", Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" ;
                }
            }
            @Override
            protected void done() {
                try  {
                    String statusMsg = (String) get();
                    Current_Log_Update(GUI, statusMsg + "\r\n");
                    BW1 = null;
                } catch (InterruptedException | ExecutionException ex)  {
                    Current_Log_Update(GUI, "- BW1 ERROR: " + ex.getMessage() + "\r\n");
                    BW1_FAIL_LOG_UPDATE(ex.getMessage());
                }
                if(ad != null) {
                    ad.quit();
                }
                if(appiumService != null && appiumService.isRunning()){
                    appiumService.stop();
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
        btnRun.setEnabled(true);
    }
    private String StartAndroidDriver() {
        try {
            DesiredCapabilities  cap = new DesiredCapabilities ();
            cap.setCapability("platformName", "Android");
            cap.setCapability("deviceName", device);
            cap.setCapability("udid", devID);
            cap.setCapability("platformVersion", devOS);
            cap.setCapability("clearSystemFiles", true);
            if(app.startsWith("Chrome")){
                cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
                // path for correct
                //cap.setCapability("chromedriverExecutable","/Users/myUsername/node_modules/appium/node_modules/appium-chromedriver/chromedriver/mac/chromedriver")
                cap.setCapability("chromedriverExecutable", A.A.CWD + File.separator + "chromedriver.exe");
                //cap.setCapability(CapabilityType.VERSION, "5.1");
            } else{
                cap.setCapability("appPackage", appPackage);  
                cap.setCapability("appActivity", appActivity);                 
            }
            
            cap.setCapability("autoGrantPermissions", false); // false- always get prompt
            cap.setCapability("unicodeKeyboard", false);
            cap.setCapability("resetKeyboard", true);
            cap.setCapability("sendKeyStrategy", "oneByOne"); // ‘setValue’“);
//            cap.setCapability(MobileCapabilityType.FULL_RESET, false);
//            cap.setCapability(MobileCapabilityType.NO_RESET, true);
            cap.setCapability("automationName", "UiAutomator2");
            cap.setCapability("newCommandTimeout", "240");

            AppiumServiceBuilder ASB  = new AppiumServiceBuilder();
            if(!A.A.WsOS.toLowerCase().contains("windows")){
                //asb.usingDriverExecutable(new File(("/path/to/node")));
                HashMap<String, String> environment = new HashMap();
                environment.put("ANDROID_HOME", "/Users/" + A.A.UserID + "/Library/Android/sdk"); 
                ASB.withEnvironment(environment);
                ASB.withAppiumJS(new File(("/usr/local/lib/node_modules/appium/build/lib/main.js")));
            }
            ASB.usingAnyFreePort();
            appiumService = AppiumDriverLocalService.buildService(ASB);
            appiumService.start();

            ad = new AndroidDriver(new URL(appiumService.getUrl().toString()), cap);
            ad.manage().timeouts().implicitlyWait(WaitForElement, TimeUnit.MILLISECONDS);

            loadTimeout = new FluentWait(ad).withTimeout(Duration.ofMillis((long) LoadTimeOut))
                    .pollingEvery(Duration.ofMillis(200))
                    .ignoring(NoSuchElementException.class);
            return "= Android Driver Start > OK " + "\r\n";
        } catch (Exception ex) {
            F += "= Android Driver > ERROR: " + ex.getMessage() + "\r\n";
            if(ad != null) {
                ad.quit();
            }
            if(appiumService != null && appiumService.isRunning()){
                appiumService.stop();
            }
            return "= Android Driver > ERROR: " + ex.getMessage() + "\r\n";
        }
    }
    private void Execute_Bolter() throws Exception {
        if(true){
            SCOPE += "Splash";
            ParentTest = HtmlReport.createTest("Bolter Splash"); 
            An_bolter_main BR = new Mob_Android.An_bolter_main(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(_Forgot_pw){  
            SCOPE += ", Forgot PW";
            ParentTest = HtmlReport.createTest("Forgot Password");         
            An_bolter_forgot_pw BR = new Mob_Android.An_bolter_forgot_pw(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(_Invalids){              
            SCOPE += ", Invalid Logins";
            ParentTest = HtmlReport.createTest("Logins > Invalid Email/PW");         
            An_bolter_invalid_login BR = new Mob_Android.An_bolter_invalid_login(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(_Login){
            SCOPE += ", Login";
            ParentTest = HtmlReport.createTest("Valid Login"); 
            An_bolter_login BR = new Mob_Android.An_bolter_login(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
            if(BR.FAIL){
                // FATAL - cannot procced
                Log_Html_Result("FAIL", "Runner: " + Bolter_ID + "/" + Bolter_PW, true, ParentTest.createNode("Login Failed, cannot proceed"));
                return;
            }
        }        
        if(_Edit_profile){ 
            SCOPE += ", Profile";
            ParentTest = HtmlReport.createTest("User Profile");         
            An_bolter_profile BR = new Mob_Android.An_bolter_profile(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(_Order_history){                    
            SCOPE += ", History";
            ParentTest = HtmlReport.createTest("History");         
            An_bolter_history BR = new Mob_Android.An_bolter_history(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(_Support){       
            SCOPE += ", Support";
            ParentTest = HtmlReport.createTest("Support");         
            An_bolter_support BR = new Mob_Android.An_bolter_support(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        if(true){    
            SCOPE += ", Dashboard";
            ParentTest = HtmlReport.createTest("Delievery Dashboard");         
            An_bolter_dashboard BR = new Mob_Android.An_bolter_dashboard(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
        
        if(_Logout){    
            SCOPE += ", Logout";
            ParentTest = HtmlReport.createTest("Logout");         
            An_bolter_logout BR = new Mob_Android.An_bolter_logout(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
    }
    private void Execute_C360() throws Exception {
        if(true){
            SCOPE += "C360 Chrome";
            ParentTest = HtmlReport.createTest("C360 Chrome"); 
            Chrome_C360 BR = new Mob_Android.Chrome_C360(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }

    }
    private void Execute_WO() throws Exception {
        if(true){
            SCOPE += "WO Chrome";
            ParentTest = HtmlReport.createTest("WO Chrome"); 
            Chrome_WO BR = new Mob_Android.Chrome_WO(An_GUI.this);
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }

    }
    private void Execute_Core_App() throws Exception{
        if(_Login){ 
            SCOPE += "Splash";
            ParentTest = HtmlReport.createTest(app + " Main");
            An_core_main BR = new An_core_main(An_GUI.this);//
            BR.Run(); // ======================================
            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
        }
//        if(true){ 
//            SCOPE += ", Splash";
//            ParentTest = HtmlReport.createTest(app + " Main");
//            An_core_main BR = new An_core_main(An_GUI.this);//
//            CR.Run(); // ======================================
//            EX += BR.EX; _t += BR._t; _p += BR._p; _f += BR._f; _w += BR._w; _i += BR._i; F += BR.F; r_time += BR.r_time;
//        }
    }
    private void BW1_Done(boolean GUI) throws Exception{
        DD = Duration.between(run_start, Instant.now());
        
        Slack_Channel = "xtt_test";
        if(_Slack){
            Zip_Report = true;
        } else{
            Zip_Report = false;
        }
        
        Last_EX = EX;
        Summary = "Steps: " + (_p + _f +_w + _i) + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i;
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
        
        Current_Log_Update(GUI, "= Android_" + app + "_" + env + ", App v: " + appVersion + ", Device: " + device + " OS v: " + devOS + "\r\n"); 
        Current_Log_Update(GUI, "= " + Summary + "\r\n"); // Summary shown in EX top
        Current_Log_Update(GUI, "= Scope: " + SCOPE + "\r\n"); // SCOPE shown in EX top
        Current_Log_Update(GUI, "= Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n");
        
        if(GUI){
            Log = txtLog.getText();
        }

        HtmlReporter.config().setReportName("Android OS v" + devOS + ", App: " + app + " v: " + appVersion + ", Environment: " + env + ", Summary: Total Steps: " + _t + ", Passed: " + _p + ", Failed: " + _f + ", Warnings: " + _w + ", Info: " + _i);
        HtmlReport.flush();
        
   
        if(_Slack && !Slack_Channel.equals("N/A")){
            Report(false);
            String MSG = "Android_" + app + "_" + env + " Excel Automation report - " + Report_Date +
                    "\r\n Machine: " + A.A.WsID + " OS: " + A.A.WsOS + ", User: " + A.A.UserID + "\r\n" +
                    "Device: " + device + " > ID: " + devID + "\r\n" +      
                    "Scope: " + SCOPE + "\r\n" +
                    "Duration: " + DD.toHours() + "h, " + (DD.toMinutes() % 60) + "m, " + (DD.getSeconds() % 60) + "s" + "\r\n" + 
                    "Steps: " + _t + ", Pass: " + _p + ", Fail: " + _f + ", Warn: " + _w + ", Info: " + _i;
            
            Current_Log_Update(GUI, Func.Send_File_with_Message_to_Slack(Excel_Report_Path, Slack_Channel, MSG));
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
            Current_Log_Update(GUI, Func.Send_File_with_Message_to_Slack(HTML_Report_Path, Slack_Channel, HTML_Report_Msg));
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
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Driver Actions > Log Step Result">  
    protected void Test_EX_Update(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
        
        try {
            _p++; 
            err = "No Error";
            EX += _t + "\t" + NAME + "\t" + "Test_EX_Update OK"  + "\t" + t + "\t" + "PASS" + "\t" + err + 
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }     
    protected void Reset_App(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        t = "resetApp()";
        try {
            ad.resetApp();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "test"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Page URL" + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }     
    protected void Go_Back_Key(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            ad.pressKey(new KeyEvent(AndroidKey.BACK));
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "AndroidKey.BACK" + "\t" + "driver.pressKey" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "AndroidKey.BACK" + "\t" + "driver.pressKey" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }     
    protected void Go_To_URL(String NAME, String URL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            ad.get(URL);
            EX += _t + "\t" + NAME + "\t" + "Keyboard is Shown"  + "\t" + "hideKeyboard" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + URL, false, ParentTest.createNode(NAME));
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + URL + "\t" + URL + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Target URL: " + URL, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 
    protected void Get_Current_URL(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            t = ad.getCurrentUrl();
            EX += _t + "\t" + NAME + "\t" + "Keyboard is Shown"  + "\t" + "hideKeyboard" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t, false, ParentTest.createNode(NAME));
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 

    protected void HideKeyboard(String NAME, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            if(ad.isKeyboardShown()){
                ad.hideKeyboard();                
                EX += _t + "\t" + NAME + "\t" + "Keyboard is Shown"  + "\t" + "hideKeyboard" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }else{
                EX += _t + "\t" + NAME + "\t" + "Keyboard is Not Shown"  + "\t" + " - " + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
            }
            _p++; 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + " - " + "\t" + " - " + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 
    protected void Swipe_From_Screen_Center(String NAME, String DIRECTION, int DURATION, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            int h = ad.manage().window().getSize().height; 
            int w = ad.manage().window().getSize().width;
            int endX = w/2;
            int endY = h/2;
            int startX = w/2;
            int startY = h/2; 
            
            switch (DIRECTION) {
                case "UP":
                    endX = w/2;  
                    endY = 10;
                    break;
                case "DOWN":
                    endX = w/2;  
                    endY = h - 10;
                    break;
                case "LEFT":
                    endX = 10;  
                    endY = h/2;
                    break;
                case "RIGHT":
                    endX = w - 10;  
                    endY = h/2;
                    break;
                default:
                    break;
            }        
            new TouchAction(ad)
                    .press(point(startX, startY))
                    .waitAction(waitOptions(Duration.ofMillis(DURATION)))
                    .moveTo(point(endX, endY)).release().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Swipe " + DIRECTION + "\t" + "Swipe OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + DIRECTION, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Swipe " + DIRECTION + "\t" + "Swipe Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }    
    protected void Swipe_From_Elenent_XY(String NAME, AndroidElement E, String DIRECTION, int DURATION, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;

        try {
            int h = ad.manage().window().getSize().height; 
            int w = ad.manage().window().getSize().width;
            int endX = w/2;
            int endY = h/2; 
            int startX = E.getLocation().x;
            int startY = E.getLocation().y;
            
            switch (DIRECTION) {
                case "UP":
                    endX = w/2;  
                    endY = 10;
                    break;
                case "DOWN":
                    endX = w/2;  
                    endY = h - 10;
                    break;
                case "LEFT":
                    endX = 10;  
                    endY = h/2;
                    break;
                case "RIGHT":
                    endX = w - 10;  
                    endY = h/2;
                    break;
                default:
                    break;
            }        
            new TouchAction(ad)
                    .press(point(startX, startY))
                    .waitAction(waitOptions(Duration.ofMillis(DURATION)))
                    .moveTo(point(endX, endY)).release().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + DIRECTION + "\t" + "Swipe OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + DIRECTION, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + DIRECTION + "\t" + "Swipe Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "Wait:  " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "loadTimeout " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
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
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME  + "\t" + BY + " > " + PATH + "\t" + "loadTimeout " + LoadTimeOut + " ms" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Scroll_to_Element(String NAME, AndroidElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            ((JavascriptExecutor)ad).executeScript("arguments[0].scrollIntoView(true);", E);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Move_to_Element(String NAME, AndroidElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(ad);
            action.moveToElement(E).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    } 
    protected void Click_out_of_Element(String NAME, AndroidElement E, String DIRECTION, int X, int Y, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            int XX = E.getLocation().x;
            int YY = E.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + E.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + E.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(ad);
            action.moveToElement(E, XX, YY).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName(), false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + DIRECTION + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.moveToElement(ae).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Move Failed" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            
            int XX = ae.getLocation().x;
            int YY = ae.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + ae.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + ae.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }
            
            Actions action = new Actions(ad);
            action.moveToElement(ae, XX, YY).perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Move '" + DIRECTION + "' of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "moveToElement" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;                     
                case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }

            int XX = ae.getLocation().x;
            int YY = ae.getLocation().y;
            if("Right".equals(DIRECTION)){ 
                XX = XX + ae.getSize().width + X;
            } else if ("Left".equals(DIRECTION)){ 
                XX = XX + X; 
            }
            
            if("Bottom".equals(DIRECTION)){ 
                YY = YY + ae.getSize().height + Y;
            } else if ("Top".equals(DIRECTION)){ 
                YY = YY + Y; 
            }            
            
            Actions action = new Actions(ad);
            action.moveToElement(ae, XX, YY).click().perform();
            //Thread.sleep(500);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Click out " + DIRECTION + " of element successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "moveToElement" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
            ae = ad.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = "Found";
            _p++;
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            t = "Not Found";
            _p++;
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Not Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
        }
        _p++;
        sw1.reset();
    }
    protected void Find_Text(String NAME, String VAL, Boolean EXPECTED,  ExtentTest ParentTest, String JIRA ) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        t = "Not Found";
        try {
            ae = ad.findElement(By.xpath("//*[contains(text(), \"" + VAL + "\")]"));
            t = ae.getText();
            if(t.trim().equals("")){
                t = ae.getAttribute("content-desc");
            }
            if(t != null && t.trim() != ""){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "Not Found";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Text Found" + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            if(EXPECTED){
                _f++; FAIL = true; err = ex.getMessage().trim();
                if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "FAIL" + "\t" + err +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err, true, ParentTest.createNode(NAME));                
            } else {
                _p++; 
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text Not Found" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
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
                    ae1 = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae1 = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae1 = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae1 = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae1 = ad.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    ae1 = ad.findElement(By.name(PATH));                
                    break;
                 case "linkText":
                    ae1 = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae1 = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae2 = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae2 = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae2 = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae2 = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae2 = ad.findElement(By.tagName(PATH));
                    break;
                 case "name":
                    ae2 = ad.findElement(By.name(PATH));                   
                case "linkText":
                    ae2 = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae2 = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + "Element Found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Element Not Found"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Action_Click(String NAME, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.moveToElement(ae).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH));
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            ae.click();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    t = ad.findElement(By.xpath(PATH)).getText();
                    break;
                case "css":
                    t = ad.findElement(By.cssSelector(PATH)).getText();   
                    break;
                case "className":
                    t = ad.findElement(By.className(PATH)).getText();
                    break;
                case "id":
                    t = ad.findElement(By.id(PATH)).getText();
                    break;
                case "tagName":
                    t = ad.findElement(By.tagName(PATH)).getText();
                    break;
                case "name":
                    t = ad.findElement(By.name(PATH)).getText();                    
                    break;
                case "linkText":
                    t = ad.findElement(By.linkText(PATH)).getText();
                    break;
                case "partialLinkText":
                    t = ad.findElement(By.partialLinkText(PATH)).getText();
                    break;
                default:
                    break;
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t.replace("\r\n", " ").replace("\n", " ") + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    t = ad.findElement(By.xpath(PATH)).getAttribute(VAL); 
                    break;
                case "css":
                    t = ad.findElement(By.cssSelector(PATH)).getAttribute(VAL); 
                    break;
                case "className":
                    t = ad.findElement(By.className(PATH)).getAttribute(VAL); 
                    break;
                case "id":
                    t = ad.findElement(By.id(PATH)).getAttribute(VAL); 
                    break;
                case "tagName":
                    t = ad.findElement(By.tagName(PATH)).getAttribute(VAL); 
                    break;
                case "name":
                    t = ad.findElement(By.name(PATH)).getAttribute(VAL); 
                    break;
                case "linkText":
                    t = ad.findElement(By.linkText(PATH)).getAttribute(VAL); 
                    break;
                case "partialLinkText":
                    t = ad.findElement(By.partialLinkText(PATH)).getAttribute(VAL); 
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
            _p++;  
            EX += _t + "\t" + NAME + "\t" + VAL  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;                    
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy                 
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }
            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                clipboard.setContents( new StringSelection(""), null); 
            }catch (Exception ex){
                Thread.sleep(20);
                clipboard = toolkit.getSystemClipboard();
                clipboard.setContents( new StringSelection(""), null);
            }
            switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.doubleClick(ae).perform();
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy             
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy                   
            }            

            t = (String) clipboard.getData(DataFlavor.stringFlavor);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_DblClick_Paste(String NAME, String BY, String PATH, String VAL,  String JIRA ) throws Exception {
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH));
                    break;
                default:
                    break;
            }
            Actions action = new Actions(ad);
            action.doubleClick(ae).perform();
            
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                ae.sendKeys(Keys.chord(Keys.CONTROL, "v")); //paste       
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "c")); //copy
                t = (String) clipboard.getData(DataFlavor.stringFlavor);
                ae.sendKeys(Keys.chord(Keys.COMMAND, "v")); //paste                
            }               
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + " > " + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH  + "\t" + t + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH)); 
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(A.A.WsOS.toLowerCase().contains("windows")){
                ae.sendKeys(Keys.chord(Keys.CONTROL, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.BACK_SPACE)); //delete it                  
            }else{
                ae.sendKeys(Keys.chord(Keys.COMMAND, "a")); //select all text in textbox
                ae.sendKeys(Keys.chord(Keys.DELETE)); //delete it                   
            }

            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Cleared" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + BY + "\t" + PATH + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_By_Path_Text_Enter(String NAME, String BY, String PATH, String VAL, boolean HIDE,String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            if(null != BY) switch (BY) {
                case "xpath":
                    ae = ad.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae = ad.findElement(By.cssSelector(PATH)); 
                    break;
                case "className":
                    ae = ad.findElement(By.className(PATH)); 
                    break;
                case "id":
                    ae = ad.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae = ad.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae = ad.findElement(By.name(PATH));
                    break;
                 case "linkText":
                    ae = ad.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae = ad.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            ae.sendKeys(VAL);
            _p++; 
            if(HIDE){
                VAL = "*****";
            }
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + VAL + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "sendKeys" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }

    protected void Element_Text(String NAME, AndroidElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        t = "?";
        try {
            t = E.getText();
            if(t.trim().equals("")){
                //t = E.getAttribute("content-desc");
                t = E.getAttribute("name");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element fron the previous step", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Text_Clear(String NAME, AndroidElement E, ExtentTest ParentTest, String JIRA) throws Exception {
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
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element fron the previous step", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Text_Enter(String NAME, AndroidElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            E.sendKeys(VAL);
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + VAL + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + VAL + "<br />Element fron the previous step", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Attribute(String NAME, AndroidElement E, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {       
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
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element fron the previous step", false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }
    protected void Element_Click(String NAME, AndroidElement E, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            Actions action = new Actions(ad);
            action.moveToElement(E).click().perform();
            _p++; 
            EX += _t + "\t" + NAME + "\t" + "Passed Element"  + "\t" + "Click successful" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element fron the previous step", false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + "Passed Element" + "\t" + " - "+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element fron the previous step", true, ParentTest.createNode(NAME));
        }
        sw1.reset();
    }

    protected void Element_Child_List_L1(String NAME, AndroidElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.className(PATH));
                    break;
                case "id":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL1 = (List<AndroidElement>) (AndroidElement) E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL1.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL1.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL1.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_List_L2(String NAME, AndroidElement  E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.className(PATH));
                    break;
                case "id":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL2 = (List<AndroidElement>) (AndroidElement) E.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL2.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L2.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL2.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL2.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL2.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_E2(String NAME, AndroidElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        try {
            switch (BY) {
                case "xpath":
                    ae2 = (AndroidElement) E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    ae2 = (AndroidElement) E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    ae2 = (AndroidElement) E.findElement(By.className(PATH));
                    break;
                case "id":
                    ae2 = (AndroidElement) E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    ae2 = (AndroidElement) E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    ae2 = (AndroidElement) E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    ae2 = (AndroidElement) E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    ae2 = (AndroidElement) E.findElement(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            _p++; 
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Element (e2) found" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "e2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text(String NAME, AndroidElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
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
                t = E.getAttribute("content-desc");
            }
            if(t != null){
                t = t.replace("\r\n", " ").replace("\n", " ");
                t = t.replaceAll("[ ]+", " ");
            } else {
                t = "null";
            }
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + t + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Text_Enter(String NAME, AndroidElement E, String BY, String PATH, String VAL, boolean HIDE, ExtentTest ParentTest, String JIRA) throws Exception {
        if(sw1.isRunning()){
            sw1.reset();
        }
        _t++; sw1.start();        
 
        FAIL = false;
        AndroidElement _e = null;
        try {
            switch (BY) {
                case "xpath":
                    _e = (AndroidElement) E.findElement(By.xpath(PATH));
                    break;
                case "css":
                    _e = (AndroidElement) E.findElement(By.cssSelector(PATH));
                    break;
                case "className":
                    _e = (AndroidElement) E.findElement(By.className(PATH));
                    break;
                case "id":
                    _e = (AndroidElement) E.findElement(By.id(PATH));
                    break;
                case "tagName":
                    _e = (AndroidElement) E.findElement(By.tagName(PATH));
                    break;
                case "name":
                    _e = (AndroidElement) E.findElement(By.name(PATH));
                    break;
                case "linkText":
                    _e = (AndroidElement) E.findElement(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    _e = (AndroidElement) E.findElement(By.partialLinkText(PATH));
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
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + VAL + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true;  err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "sendKeys"+ "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }
    protected void Element_Child_Click(String NAME, AndroidElement E, String BY, String PATH, ExtentTest ParentTest, String JIRA) throws Exception {
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
            _p++;
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click OK" + "\t" + "PASS" + "\t" + " - " +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "Click" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    }    
    protected void Element_Child_Attribute(String NAME, AndroidElement E, String BY, String PATH, String VAL, ExtentTest ParentTest, String JIRA) throws Exception {
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
            if (t.contains("placeholder") || t.contains("adminpanel.compassdigital.org") || t.contains("img-default")) {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "WARN" + "\t" + "No Image" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _w++;
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            } else {
                EX += _t + "\t" + NAME + "\t" + VAL + "\t" + t + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
                _p++;
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " > " + t + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            } 
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim(); 
            EX += _t + "\t" + NAME + "\t" + VAL + "\t" + "Text" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
        if(aL0 != null) {aL0.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL0 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL0 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL0 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL0 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL0 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL0 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL0 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL0 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL0.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L0.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL0.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL0.size() + " item(s) (L0)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL0.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L0" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
        if(aL1 != null) {aL1.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL1 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL1 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL1 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL1 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL1 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL1 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL1 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL1 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL1.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L1.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL1.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL1.size() + " item(s) (L1)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL1.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L1" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
        if(aL2 != null) {aL2.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL2 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL2 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL2 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL2 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL2 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL2 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL2 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL2 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL2.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L2.isEmpty()" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL2.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL2.size() + " item(s) (L2)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";               
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL2.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L2" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
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
        if(aL3 != null) {aL3.clear();}
        try {
            switch (BY) {
                case "xpath":
                    aL3 = ad.findElements(By.xpath(PATH));
                    break;
                case "css":
                    aL3 = ad.findElements(By.cssSelector(PATH));
                    break;
                case "className":
                    aL3 = ad.findElements(By.className(PATH));
                    break;
                case "id":
                    aL3 = ad.findElements(By.id(PATH));
                    break;
                case "tagName":
                    aL3 = ad.findElements(By.tagName(PATH));
                    break;
                case "name":
                    aL3 = ad.findElements(By.name(PATH));
                    break;
                case "linkText":
                    aL3 = ad.findElements(By.linkText(PATH));
                    break;
                case "partialLinkText":
                    aL3 = ad.findElements(By.partialLinkText(PATH));
                    break;
                default:
                    break;
            }
            if(aL3.isEmpty()){
                _w++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "List is Empty" + "\t" + "WARN" + "\t" + "L3.isEmpty" +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                    
                Log_Html_Result("WARN", "Method: " + new Exception().getStackTrace()[0].getMethodName()  + " " + "List Size: " + aL3.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }else{
                _p++; 
                EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + aL3.size() + " item(s) (L3)" + "\t" + "PASS" + "\t" + " - " +
                "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";                
                Log_Html_Result("PASS", "Method: " + new Exception().getStackTrace()[0].getMethodName() + " " + "List Size: " + aL3.size() + "<br />Element locator: " + BY + " > " + PATH, false, ParentTest.createNode(NAME));
            }
        } catch(Exception ex){
            _f++; FAIL = true; err = ex.getMessage().trim();
            if(err.contains("\n")) (err = err.substring(0, err.indexOf("\n"))).trim();
            EX += _t + "\t" + NAME + "\t" + BY + " > " + PATH + "\t" + "L3" + "\t" + "FAIL" + "\t" + err +
            "\t" + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec" + "\t" + LocalDateTime.now().format(Time_12_formatter) + "\t" + JIRA + "\r\n";
            F += "Step: " + _t + " > " + err + "\r\n";
            Log_Html_Result("FAIL", "Error: " + err + "<br />Element locator: " + BY + " > " + PATH, true, ParentTest.createNode(NAME));
        } 
        sw1.reset();
    } 
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV2;
    private javax.swing.JTable DV3;
    private javax.swing.JCheckBox _acc_options;
    private javax.swing.JCheckBox _all_cards;
    private javax.swing.JCheckBox _allow_loc;
    private javax.swing.JCheckBox _edit_item;
    private javax.swing.JCheckBox _edit_profile;
    private javax.swing.JCheckBox _explore;
    private javax.swing.JCheckBox _feedback;
    private javax.swing.JCheckBox _forgot_pw;
    private javax.swing.JCheckBox _invalids;
    private javax.swing.JCheckBox _login;
    private javax.swing.JCheckBox _logout;
    private javax.swing.JCheckBox _mplan;
    private javax.swing.JCheckBox _optX;
    private javax.swing.JCheckBox _order_email;
    private javax.swing.JCheckBox _order_history;
    private javax.swing.JCheckBox _promo;
    private javax.swing.JCheckBox _reorder;
    private javax.swing.JCheckBox _slack;
    private javax.swing.JCheckBox _support;
    private javax.swing.JCheckBox _welcome;
    private javax.swing.JButton btnExel;
    private javax.swing.JButton btnFails;
    private javax.swing.JButton btnFindDevice;
    private javax.swing.JButton btnGetAPK;
    private javax.swing.JButton btnGetScreenshot;
    private javax.swing.JButton btnInstallAPK;
    private javax.swing.JButton btnInstallAll;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnS3Install;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JButton btnScreenshotFolder;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbDevice;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JComboBox<String> cmbMPlan;
    private javax.swing.JComboBox<String> cmbPromo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton jrbNU;
    private javax.swing.JLabel lblAPK;
    private javax.swing.JLabel lblBRANDS;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JLabel lblSITES10;
    private javax.swing.JLabel lblSITES12;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES3;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES8;
    private javax.swing.JLabel lblSITES9;
    private javax.swing.JSpinner nWaitElement;
    private javax.swing.JSpinner nWaitLoad;
    private javax.swing.JPanel paneCore_Scope;
    private javax.swing.JRadioButton rbEU;
    private javax.swing.JRadioButton rbNU_EU;
    private javax.swing.ButtonGroup rb_NU_EU;
    private javax.swing.JTextField txtBolter_Id;
    private javax.swing.JTextField txtBolter_Pw;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_Id;
    private javax.swing.JTextField txtMobile_Pw;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
