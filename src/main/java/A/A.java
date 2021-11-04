package A;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

/**
 * @author Oleg.Spozito
 */

public class A extends javax.swing.JFrame {
    public A() {
        initComponents();
    }
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(A.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            final A AF = new A();
            AF.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    //
                }
            });
//            try{
//                //Image i = (new ImageIcon(ClassLoader.getResource("/images/jTTi32.png"))).getImage(); // .png
//                //ImageIcon ii = new ImageIcon("jTTi32.png", "JTT");               
//
//                ImageIcon ii = new ImageIcon(new URL("images/jTTi32.png"));
//                Image i = ii.getImage();// .png
//                F.setIconImage(i);
//            }catch(MalformedURLException ex){
//                java.util.logging.// Logger.getLogger(AP3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
//            }
            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());                
            AF.setSize(screenSize.width - 150, screenSize.height - 150);    
            AF.setLocationRelativeTo(null);
            AF.setVisible(true);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        Menu_Tools = new javax.swing.JMenu();
        Menu_C360_ = new javax.swing.JMenu();
        Menu_C360_DE = new javax.swing.JMenu();
        Menu_C360_ST = new javax.swing.JMenu();
        Menu_C360_PR = new javax.swing.JMenu();
        Menu_AP3_ = new javax.swing.JMenu();
        Menu_AP3_DE = new javax.swing.JMenu();
        Menu_AP3_ST = new javax.swing.JMenu();
        Menu_AP3_PR = new javax.swing.JMenu();
        Menu_DL_ = new javax.swing.JMenu();
        Menu_DL_DE = new javax.swing.JMenu();
        Menu_DL_ST = new javax.swing.JMenu();
        Menu_DL_PR = new javax.swing.JMenu();
        Menu_FW_ = new javax.swing.JMenu();
        Menu_FW_DE = new javax.swing.JMenu();
        Menu_FW_ST = new javax.swing.JMenu();
        Menu_FW_PR = new javax.swing.JMenu();
        Menu_WO_ = new javax.swing.JMenu();
        Menu_WO_DE = new javax.swing.JMenu();
        Menu_WO_ST = new javax.swing.JMenu();
        Menu_WO_PR = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Menu_Devices = new javax.swing.JMenu();
        Menu_UI_Viewer = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Menu_Swagger = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Menu_Web_Tools = new javax.swing.JMenu();
        Menu_Env = new javax.swing.JMenu();
        Menu_Android = new javax.swing.JMenu();
        Menu_iOS = new javax.swing.JMenu();
        Menu_C360 = new javax.swing.JMenu();
        Menu_AP3 = new javax.swing.JMenu();
        Menu_WO = new javax.swing.JMenu();
        Menu_FW = new javax.swing.JMenu();
        Menu_DL = new javax.swing.JMenu();
        Menu_SL = new javax.swing.JMenu();
        MenuStation = new javax.swing.JMenu();
        Menu_OR = new javax.swing.JMenu();
        Menu_API = new javax.swing.JMenu();
        Menu_JIRA = new javax.swing.JMenu();
        Menu_JOBS = new javax.swing.JMenu();
        MenuReports = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JTT");
        setMinimumSize(new java.awt.Dimension(912, 648));
        setSize(new java.awt.Dimension(912, 648));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DesktopPane.setBackground(new java.awt.Color(204, 204, 204));
        DesktopPane.setAutoscrolls(true);
        DesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DesktopPane.setName("A_Panel"); // NOI18N
        DesktopPane.setPreferredSize(new java.awt.Dimension(99600, 97000));

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        Menu_Tools.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_Tools.setText("Links");
        Menu_Tools.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Tools.setName("Menu_Tools"); // NOI18N

        Menu_C360_.setText("Cafe 360");
        Menu_C360_.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Menu_C360_DE.setText("- Development (dev.cafe360.compassdigital.org)");
        Menu_C360_DE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_C360_DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_C360_DEMouseClicked(evt);
            }
        });
        Menu_C360_.add(Menu_C360_DE);

        Menu_C360_ST.setText("- Staging (staging.cafe360.compassdigital.org)");
        Menu_C360_ST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_C360_ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_C360_STMouseClicked(evt);
            }
        });
        Menu_C360_.add(Menu_C360_ST);

        Menu_C360_PR.setText("- Production (cafe360.compassdigital.org)");
        Menu_C360_PR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_C360_PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_C360_PRMouseClicked(evt);
            }
        });
        Menu_C360_.add(Menu_C360_PR);

        Menu_Tools.add(Menu_C360_);

        Menu_AP3_.setText("AP3");
        Menu_AP3_.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Menu_AP3_DE.setText("- Development (https://dev.adminpanel.compassdigital.org/)");
        Menu_AP3_DE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_AP3_DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AP3_DEMouseClicked(evt);
            }
        });
        Menu_AP3_.add(Menu_AP3_DE);

        Menu_AP3_ST.setText("- Staging (https://staging.adminpanel.compassdigital.org/)");
        Menu_AP3_ST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_AP3_ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AP3_STMouseClicked(evt);
            }
        });
        Menu_AP3_.add(Menu_AP3_ST);

        Menu_AP3_PR.setText("- Production (https://adminpanel.compassdigital.org/)");
        Menu_AP3_PR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_AP3_PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AP3_PRMouseClicked(evt);
            }
        });
        Menu_AP3_.add(Menu_AP3_PR);

        Menu_Tools.add(Menu_AP3_);

        Menu_DL_.setText("Distilr");
        Menu_DL_.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Menu_DL_DE.setText("- Development (https://dev.member.distilr.io)");
        Menu_DL_DE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_DL_DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DL_DEMouseClicked(evt);
            }
        });
        Menu_DL_.add(Menu_DL_DE);

        Menu_DL_ST.setText("- Staging (https://staging.member.distilr.io)");
        Menu_DL_ST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_DL_ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DL_STMouseClicked(evt);
            }
        });
        Menu_DL_.add(Menu_DL_ST);

        Menu_DL_PR.setText("- Production (https://mpower.distilr.io/)");
        Menu_DL_PR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_DL_PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DL_PRMouseClicked(evt);
            }
        });
        Menu_DL_.add(Menu_DL_PR);

        Menu_Tools.add(Menu_DL_);

        Menu_FW_.setText("FoodWorks");
        Menu_FW_.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Menu_FW_DE.setText("- Development (https://dev.app.foodworks.org/)");
        Menu_FW_DE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_FW_DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FW_DEMouseClicked(evt);
            }
        });
        Menu_FW_.add(Menu_FW_DE);

        Menu_FW_ST.setText("- Staging (https://staging.app.foodworks.org/)");
        Menu_FW_ST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_FW_ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FW_STMouseClicked(evt);
            }
        });
        Menu_FW_.add(Menu_FW_ST);

        Menu_FW_PR.setText("- Production (https://app.foodworks.org/\")");
        Menu_FW_PR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_FW_PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FW_PRMouseClicked(evt);
            }
        });
        Menu_FW_.add(Menu_FW_PR);

        Menu_Tools.add(Menu_FW_);

        Menu_WO_.setText("Web Order");
        Menu_WO_.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        Menu_WO_DE.setText("- Development (https://dev.thriveapp.io/");
        Menu_WO_DE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_WO_DE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_WO_DEMouseClicked(evt);
            }
        });
        Menu_WO_.add(Menu_WO_DE);

        Menu_WO_ST.setText("- Staging (https://staging.thriveapp.io/)");
        Menu_WO_ST.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_WO_ST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_WO_STMouseClicked(evt);
            }
        });
        Menu_WO_.add(Menu_WO_ST);

        Menu_WO_PR.setText("- Production (https://thriveapp.io/)");
        Menu_WO_PR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_WO_PR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_WO_PRMouseClicked(evt);
            }
        });
        Menu_WO_.add(Menu_WO_PR);

        Menu_Tools.add(Menu_WO_);
        Menu_Tools.add(jSeparator2);

        Menu_Devices.setBorder(null);
        Menu_Devices.setText("Mobile Devices");
        Menu_Devices.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Devices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DevicesMouseClicked(evt);
            }
        });
        Menu_Tools.add(Menu_Devices);

        Menu_UI_Viewer.setText("Android UI Automator Viewer");
        Menu_UI_Viewer.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_UI_Viewer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_UI_ViewerMouseClicked(evt);
            }
        });
        Menu_Tools.add(Menu_UI_Viewer);
        Menu_Tools.add(jSeparator3);

        Menu_Swagger.setBorder(null);
        Menu_Swagger.setText("Swagger");
        Menu_Swagger.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Swagger.setName("Swagger"); // NOI18N
        Menu_Swagger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_SwaggerMouseClicked(evt);
            }
        });
        Menu_Tools.add(Menu_Swagger);
        Menu_Tools.add(jSeparator4);

        Menu_Web_Tools.setBorder(null);
        Menu_Web_Tools.setText("Base64 decode - Other Tools");
        Menu_Web_Tools.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Web_Tools.setName("Swagger"); // NOI18N
        Menu_Web_Tools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_Web_ToolsMouseClicked(evt);
            }
        });
        Menu_Tools.add(Menu_Web_Tools);

        MenuBar.add(Menu_Tools);

        Menu_Env.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_Env.setText("Environment");
        Menu_Env.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Env.setName("JOBS"); // NOI18N
        Menu_Env.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_EnvMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_Env);

        Menu_Android.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_Android.setText("Android");
        Menu_Android.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_Android.setName("Station"); // NOI18N
        Menu_Android.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AndroidMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_Android);

        Menu_iOS.setText("iOS");
        Menu_iOS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_iOS.setName("Station"); // NOI18N
        Menu_iOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_iOSMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_iOS);

        Menu_C360.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_C360.setText("C360");
        Menu_C360.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_C360.setName("AP3"); // NOI18N
        Menu_C360.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_C360MouseClicked(evt);
            }
        });
        MenuBar.add(Menu_C360);

        Menu_AP3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_AP3.setText("AP3");
        Menu_AP3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_AP3.setName("AP3"); // NOI18N
        Menu_AP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AP3MouseClicked(evt);
            }
        });
        MenuBar.add(Menu_AP3);

        Menu_WO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_WO.setText("WO");
        Menu_WO.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_WO.setName("WO"); // NOI18N
        Menu_WO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_WOMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_WO);

        Menu_FW.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_FW.setText("FW");
        Menu_FW.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_FW.setName("FW"); // NOI18N
        Menu_FW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FWMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_FW);

        Menu_DL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_DL.setText("DL");
        Menu_DL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_DL.setName("FW"); // NOI18N
        Menu_DL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DLMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_DL);

        Menu_SL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_SL.setText("SL");
        Menu_SL.setToolTipText("Supplier Automation Manager");
        Menu_SL.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_SL.setName("FW"); // NOI18N
        Menu_SL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_SLMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_SL);

        MenuStation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuStation.setText("Station");
        MenuStation.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuStation.setName("Station"); // NOI18N
        MenuStation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuStationMouseClicked(evt);
            }
        });
        MenuBar.add(MenuStation);

        Menu_OR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_OR.setText("Orders");
        Menu_OR.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_OR.setName("Station"); // NOI18N
        Menu_OR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ORMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_OR);

        Menu_API.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_API.setText("APIs");
        Menu_API.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_API.setName("AP3"); // NOI18N
        Menu_API.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_APIMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_API);

        Menu_JIRA.setBorder(null);
        Menu_JIRA.setText("JIRA");
        Menu_JIRA.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_JIRA.setName("JIRA"); // NOI18N
        Menu_JIRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_JIRAMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_JIRA);

        Menu_JOBS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Menu_JOBS.setText("Jobs");
        Menu_JOBS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Menu_JOBS.setName("JOBS"); // NOI18N
        Menu_JOBS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_JOBSMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_JOBS);

        MenuReports.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuReports.setText("Reports");
        MenuReports.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        MenuReports.setName("FW"); // NOI18N
        MenuReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuReportsMouseClicked(evt);
            }
        });
        MenuBar.add(MenuReports);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">      
    private void Menu_FWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FWMouseClicked
        if(Menu_FW.isVisible()){
            Menu_FW.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_FW();
            }
            catch (PropertyVetoException ex) {
                // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_FW.setVisible(true);
        }
    }//GEN-LAST:event_Menu_FWMouseClicked
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Get_User();
        try{
            Files.createDirectories(Paths.get(CWD + File.separator + "ScreenShots"));           
            Files.createDirectories(Paths.get(CWD + File.separator + "MobileBuilds"));  
            Files.createDirectories(Paths.get(CWD + File.separator + "FilesToUpload"));  
        } catch(IOException ex){
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, "=== Create Directories ERROR: " + ex.getMessage(), ex);
        }

        this.setTitle("JTT v1.0.1" + " - " + "User: " + UserID + ", Machine: " + WsID + ", OS: " + WsOS);
        if (!UserID.toLowerCase().contains("oleg")){
            Register_Login();            
        }
        Get_TKN_KEYS();
        
        Menu_Android.setToolTipText("Android Mobile Automation Manager - in Development");
        Menu_iOS.setToolTipText("iOS Mobile Automation Manager - in Development");
        Menu_WO.setToolTipText("Web Ordering Automation"); 
        Menu_AP3.setToolTipText("Ap3 Automation Manager");
        Menu_FW.setToolTipText("Food Works Automation"); 
        Menu_DL.setToolTipText("Distiller Automation");
        Menu_SL.setToolTipText("Supplier Automation");
        Menu_API.setToolTipText("Configutation / AP3 API(s)"); 
        MenuReports.setToolTipText("All xTT and JTT reports"); 
        MenuStation.setToolTipText("Site > Brand > Menus(s) difinitions"); 
    }//GEN-LAST:event_formWindowOpened
    private void MenuStationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuStationMouseClicked
        if(!MenuStation.isEnabled()){
            return;
        }
        MenuStation.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_Station();
        } catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        MenuStation.setEnabled(true);
    }//GEN-LAST:event_MenuStationMouseClicked
    private void Menu_WOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_WOMouseClicked
        if(!Menu_WO.isEnabled()){
            return;
        }
        Menu_WO.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_WO();
        } catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_WO.setEnabled(true);

    }//GEN-LAST:event_Menu_WOMouseClicked
    private void MenuReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuReportsMouseClicked
        if(!MenuReports.isEnabled()){
            return;
        }
        MenuReports.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Open_REPORT();
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        MenuReports.setEnabled(true);
    }//GEN-LAST:event_MenuReportsMouseClicked
    private void Menu_APIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_APIMouseClicked
        if(!Menu_API.isEnabled()){
            return;
        }
        Menu_API.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_API();
        } catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_API.setEnabled(true); 
    }//GEN-LAST:event_Menu_APIMouseClicked
    private void Menu_DLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DLMouseClicked
        if(!Menu_DL.isEnabled()){
            return;
        }
        Menu_DL.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_DL();
        } catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_DL.setEnabled(true); 
    }//GEN-LAST:event_Menu_DLMouseClicked
    private void Menu_ORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ORMouseClicked
        if(!Menu_OR.isEnabled()){
            return;
        }
        Menu_OR.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_OR();
        }
        catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_OR.setEnabled(true); 
    }//GEN-LAST:event_Menu_ORMouseClicked
    private void Menu_iOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_iOSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_iOSMouseClicked
    private void Menu_JIRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_JIRAMouseClicked
        if(!Menu_JIRA.isEnabled()){
            return;
        }
        Menu_JIRA.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_JIRA();
        }
        catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_JIRA.setEnabled(true); 
    }//GEN-LAST:event_Menu_JIRAMouseClicked
    private void Menu_AndroidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AndroidMouseClicked
        if(!Menu_Android.isEnabled()){
            return;
        }
        Menu_Android.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_Android();
        }
        catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_Android.setEnabled(true);
    }//GEN-LAST:event_Menu_AndroidMouseClicked
    private void Menu_JOBSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_JOBSMouseClicked
        if(!Menu_JOBS.isEnabled()){
            return;
        }
        Menu_JOBS.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_JOBS();
        }
        catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_JOBS.setEnabled(true);
    }//GEN-LAST:event_Menu_JOBSMouseClicked

    private void Menu_AP3_DEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AP3_DEMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://dev.adminpanel.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_AP3_DEMouseClicked
    private void Menu_AP3_STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AP3_STMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://staging.adminpanel.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_AP3_STMouseClicked
    private void Menu_AP3_PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AP3_PRMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://adminpanel.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_AP3_PRMouseClicked
    private void Menu_DevicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DevicesMouseClicked
        try {
            Open_Devices();
        }
        catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }    
        javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath(); //   DEBUG   --- to close menu after click !!!
    }//GEN-LAST:event_Menu_DevicesMouseClicked
    private void Menu_DL_DEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DL_DEMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://dev.member.distilr.io"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_DL_DEMouseClicked
    private void Menu_DL_STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DL_STMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://staging.member.distilr.io"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_DL_STMouseClicked
    private void Menu_DL_PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_DL_PRMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://mpower.distilr.io/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_DL_PRMouseClicked
    private void Menu_WO_DEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_WO_DEMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://dev.thriveapp.io/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_WO_DEMouseClicked
    private void Menu_WO_STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_WO_STMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://staging.thriveapp.io/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_WO_STMouseClicked
    private void Menu_WO_PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_WO_PRMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://thriveapp.io/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_WO_PRMouseClicked
    private void Menu_UI_ViewerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_UI_ViewerMouseClicked
        Func.ExecuteCmdProcessBuilder(ADB_HOME + "uiautomatorviewer.bat", CWD, false, false).trim();
    }//GEN-LAST:event_Menu_UI_ViewerMouseClicked
    private void Menu_C360_DEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_C360_DEMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("http://dev.cafe360.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_C360_DEMouseClicked
    private void Menu_C360_STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_C360_STMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("http://staging.cafe360.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_C360_STMouseClicked
    private void Menu_C360_PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_C360_PRMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("http://cafe360.compassdigital.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_C360_PRMouseClicked
    private void Menu_FW_PRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FW_PRMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://app.foodworks.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_FW_PRMouseClicked
    private void Menu_FW_STMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FW_STMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://staging.app.foodworks.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_FW_STMouseClicked
    private void Menu_FW_DEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FW_DEMouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://dev.app.foodworks.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_FW_DEMouseClicked
    private void Menu_C360MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_C360MouseClicked
        if(Menu_C360.isVisible()){
            Menu_C360.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_C360();
            } catch (PropertyVetoException ex) {
                // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_C360.setVisible(true);
        }        
    }//GEN-LAST:event_Menu_C360MouseClicked
    private void Menu_SwaggerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_SwaggerMouseClicked
//        if(Menu_Swagger.isVisible()){
//            Menu_Swagger.setVisible(false);
//            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
//            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_SWAGGER();
            } catch (PropertyVetoException ex) {
                // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
//            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
//            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
//            Menu_Swagger.setVisible(true);
            javax.swing.MenuSelectionManager.defaultManager().clearSelectedPath(); //   DEBUG   --- to close menu after click !!!
//        } 
    }//GEN-LAST:event_Menu_SwaggerMouseClicked
    private void Menu_AP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AP3MouseClicked
        if(Menu_AP3.isVisible()){
            Menu_AP3.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_AP3();
            } catch (PropertyVetoException ex) {
                // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_AP3.setVisible(true);
        }
    }//GEN-LAST:event_Menu_AP3MouseClicked
    private void Menu_Web_ToolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_Web_ToolsMouseClicked
         try {
            java.awt.Desktop.getDesktop().browse(URI.create("https://www.base64decode.org/"));
        }
        catch (IOException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Menu_Web_ToolsMouseClicked
    private void Menu_EnvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_EnvMouseClicked
        if(Menu_Env.isVisible()){
            Menu_Env.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_Env();
            } catch (PropertyVetoException ex) {
                // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_Env.setVisible(true);
        }
    }//GEN-LAST:event_Menu_EnvMouseClicked

    private void Menu_SLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_SLMouseClicked
        // TODO add your handling code here:
        if(!Menu_SL.isEnabled()){
            return;
        }
        Menu_SL.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_SL();
        } catch (PropertyVetoException ex) {
            // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_SL.setEnabled(true); 
    }//GEN-LAST:event_Menu_SLMouseClicked
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Package Functions/Methods">      
 
    private void Open_Env() throws PropertyVetoException {       
        Env es = new Env();
        this.DesktopPane.add(es);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        es.setLocation(X*20, Y*20);
        es.setVisible(true);
        es.show();
        es.setSelected(true);
        F_COUNT++;
    }     
    private void Open_Devices() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("Devices")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        
        Mob_Devices.M_Devices md = new Mob_Devices.M_Devices();
        this.DesktopPane.add(md);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        md.setLocation(X*20, Y*20);
        md.setVisible(true);
        md.show();
        md.setSelected(true);
        F_COUNT++;
    }
    private void Open_Android() throws PropertyVetoException {
        if(An_F_COUNT > 3){
            return;
        }
        int Y;
        int X;
        
        Mob_Android.An_GUI an = new Mob_Android.An_GUI();
        this.DesktopPane.add(an);
        Y = X = An_F_COUNT;
        an.setLocation(X*20, Y*20);
        an.show();
        an.setSelected(true);
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        F_COUNT++;
        An_F_COUNT++;
    }
    private void Open_REPORT() {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("Report")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        Reports.W_Report wr = new Reports.W_Report();
        DesktopPane.add(wr);
        int X = this.DesktopPane.getWidth();
        int X1 = wr.getWidth();
        int Y = this.DesktopPane.getHeight();
        int Y1 = wr.getHeight();
        wr.setLocation(X - X1, Y - Y1);
        wr.setVisible(true);
        wr.show();
    }
    private void Open_C360() throws PropertyVetoException{
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("C360")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        C360.C360_GUI c360 = new C360.C360_GUI();
        DesktopPane.add(c360);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        c360.setLocation(X*20, Y*20);
        c360.show();
        c360.setSelected(true);
        F_COUNT++;
    }
    private void Open_AP3() throws PropertyVetoException{
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("AP3")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        AP3.AP3_GUI ap3 = new AP3.AP3_GUI();
        DesktopPane.add(ap3);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        ap3.setLocation(X*20, Y*20);
        ap3.show();
        ap3.setSelected(true);
        F_COUNT++;
    }    
    
    private void Open_API() throws PropertyVetoException{
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("API")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        API.API_GUI api = new API.API_GUI();
        DesktopPane.add(api);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        api.setLocation(X*20, Y*20);
        api.show();
        api.setSelected(true);
        F_COUNT++;     //
    }
    private void Open_WO() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("WO")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        WO.WO_GUI wo = new WO.WO_GUI();
        this.DesktopPane.add(wo);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        wo.setLocation(X*20, Y*20);
        wo.show();
        wo.setSelected(true);
        F_COUNT++;
    }
    private void Open_FW() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("FW")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        FW.FW fw = new FW.FW();
        this.DesktopPane.add(fw);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        fw.setLocation(X*20, Y*20);
        fw.show();
        fw.setSelected(true);
        F_COUNT++;
    }
    private void Open_DL() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("DL")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        DL.DL_GUI dl = new DL.DL_GUI();
        this.DesktopPane.add(dl);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        dl.setLocation(X*20, Y*20);
        dl.show();
        dl.setSelected(true);
        F_COUNT++;
    }
    private void Open_SL() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("SL")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        SL.SL_GUI dl = new SL.SL_GUI();
        this.DesktopPane.add(dl);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        dl.setLocation(X*20, Y*20);
        dl.show();
        dl.setSelected(true);
        F_COUNT++;
    }
    private void Open_Station() throws PropertyVetoException {
//        final JInternalFrame[] frames = DesktopPane.getAllFrames();
//        for (JInternalFrame frame : frames) {
//            if (frame.getName().equals("Station")) {
//                try {
//                    frame.setSelected(true);
//                    if (frame.isIcon()) {
//                        frame.setIcon(false);
//                    }
//                    frame.setSelected(true);
//                }catch (PropertyVetoException ex) {
//                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                frame.requestFocus();
//                frame.toFront();
//                return;
//            }
//        }
        Station.Station dl = new Station.Station();
        this.DesktopPane.add(dl);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        dl.setLocation(X*20, Y*20);
        dl.show();
        dl.setSelected(true);
        F_COUNT++;
    }
    private void Open_OR() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("ORDER")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        Orders.Orders or = new Orders.Orders();
        this.DesktopPane.add(or);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        or.setLocation(X*20, Y*20);
        or.show();
        or.setSelected(true);
        F_COUNT++;
    }
    private void Open_JIRA() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("JIRA")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        JIRA.JIRA jira = new JIRA.JIRA();
        this.DesktopPane.add(jira);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        jira.setLocation(X*20, Y*20);
        jira.show();
        jira.setSelected(true);
        F_COUNT++;
    }
    private void Open_JOBS() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("JOBS")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        Jobs.Jobs_GUI jobs = new Jobs.Jobs_GUI();
        this.DesktopPane.add(jobs);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        jobs.setLocation(X*20, Y*20);
        jobs.show();
        jobs.setSelected(true);
        F_COUNT++;
    }
    private void Open_SWAGGER() throws PropertyVetoException {
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("Swagger")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    // Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        
        Swagger.Swagger sw = new Swagger.Swagger();
        this.DesktopPane.add(sw);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        sw.setLocation(X*20, Y*20);
        sw.setVisible(true);
        sw.show();
        sw.setSelected(true);
        F_COUNT++;
    }
    
    private void Get_Version() {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Version =  "?";
        try {
            String s = "A.A";
            Version = s.getClass().getPackage().getImplementationVersion();
            String path = getClass().getResource("").getPath();
            Manifest m = new JarFile(path).getManifest();
            //s = "1";
            
            Attributes attributes = m.getMainAttributes();
            if (attributes!=null){
                java.util.Iterator it = attributes.keySet().iterator();
                while (it.hasNext()){
                    java.util.jar.Attributes.Name key = (java.util.jar.Attributes.Name) it.next();
                    String keyword = key.toString();
                    if (keyword.equals("Implementation-Version") || keyword.equals("Bundle-Version")){
                        Version = (String) attributes.get(key);
                        break;
                    }
                }
            }
        } catch(Exception ex){
            Version =  ex.getMessage();
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_User() {
        UserID = System.getProperty("user.name");
        WsOS = System.getProperty("os.name");
        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            WsID = addr.getHostName();
        } catch (UnknownHostException ex) {
            WsID = "Unknown - " + ex.getMessage();
        }
    }
    private void Register_Login() {
        new Thread(() -> {
            try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
                PreparedStatement _update = conn.prepareStatement("UPDATE users SET " +
                        "LogIN = 'JTT', " +
                        "LastL = '" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm a")) + "', " +
                                "USER_MACHINE = '" + WsID + "', " +
                                "IP = '" + "Not used" + "' " +
                        "WHERE User_ID = '" + UserID + "'");
                int row = _update.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, "=== Register_Login > SQL ERROR: " + ex.getMessage(), ex);
            }
        }).start();
    }
    //</editor-fold> 
    
    private void Get_TKN_KEYS(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        ResultSet rs;
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S_OAuth_TKN'");
            rs.next();
            S_OAuth_TKN = rs.getString(1);
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'AWS_Routing_Key'");
            rs.next();
            AWS_Routing_Key = rs.getString(1);  
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'C1_Num'");
            rs.next();
            C1_Num = new String(Base64.getDecoder().decode(rs.getString(1)));
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'C1_Cvv'");
            rs.next();
            C1_Cvv = new String(Base64.getDecoder().decode(rs.getString(1)));   
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'C1_Exp'");
            rs.next();
            C1_Exp = new String(Base64.getDecoder().decode(rs.getString(1)));
            C1_Exp = C1_Exp.replace("/", "");
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'C1_Zip'");
            rs.next();
            C1_Zip = new String(Base64.getDecoder().decode(rs.getString(1)));
            C1_Zip = C1_Zip.replace(" ", "");
            
            rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'C1_Name'");
            rs.next();
            C1_Name = new String(Base64.getDecoder().decode(rs.getString(1)));  
            
            // clean-up Reports
//            Statement st = conn.createStatement();
//            int d = st.executeUpdate("DELETE FROM [dbo].[aw_result] WHERE [Date] < '" + simpleDateFormat.format(dtpDel.getDate()) + "'");
            
            conn.close();
            //Logger.getLogger(A.class.getName()).log(Level.INFO, "Keys Loaded");
        } catch (SQLException ex) {
            //Logger.getLogger(A.class.getName()).log(Level.SEVERE, "=== Load Keys > SQL ERROR: " + ex.getMessage(), ex);
            JOptionPane.showMessageDialog(this, 
            ex.getMessage(),
            "QA DB Connection Error",
            JOptionPane.OK_OPTION
            ); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Project Variables Declarations">
    //public static final String QA_BD_CON_STRING = "jdbc:sqlserver://dev-digitalhospitality-sql.database.windows.net:1433;database=cdlqadb;user=xttadmin;password=Sp515s10#a;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    public static final String QA_BD_CON_STRING = "jdbc:sqlserver://dev-digitalhospitality-sql-cdlqadb.cmrngnuvohvf.us-east-1.rds.amazonaws.com:1433;database=cdlqadb;user=admin;password=KcKqdYF5cEDYhJxc;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    public static String SQL = "";
    
    public static int F_COUNT = 0;
    public static int An_F_COUNT = 0;
    
    public static final String CWD = System.getProperty("user.dir");
    public static String ADB_HOME = "";
    public static String S_OAuth_TKN = "";
    public static String AWS_Routing_Key = "";
    public static String AP3_TKN = "";
    public static String C1_Num = "";
    public static String C1_Cvv = "";
    public static String C1_Exp = "";
    public static String C1_Zip = "";
    public static String C1_Name = "";
    
    public static final DecimalFormat df = new DecimalFormat("#.##");
    public static final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    public static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    
    public static String Version = "";
    public static String UserID = "";
    public static String WsID = "";
    public static String WsOS = "";
    private ImageIcon II;
    
    //move all below to individual packages when all of them converted to 'no static/job ready'
    public static String API_Response_Body = "";
    public static int T_Index;
    public static WebDriver d1;
    public static WebElement e;
    public static WebElement e1;
    public static WebElement e2;
    public static String HeadLess = "";
    
    public static List<WebElement> L0 = null;
    public static List<WebElement> L1 = null;
    public static List<WebElement> L2 = null;
    public static List<WebElement> L3 = null;
    public static List<WebElement> Opens = null;
    public static List<WebElement> Closes = null;
    
    public static double sleep = 500; // milisec
    public static double LoadTimeOut = 15 *1000; // milisec
    public static long WaitForElement = 3000; // milisec
    public static FluentWait loadTimeout;
    
    public static String t;
    public static String err;
    public static String F;
    public static String EX;
    
    public static int _t = 0; // Total
    public static int _p = 0; // Passed
    public static int _f = 0; // Failed
    public static int _w = 0; // Warn
    public static boolean FAIL = false;
    public static boolean ALL_DATA = false;
    public static boolean NO_DATA = false;
    
    
    public static String r_time = "";
    public static String Ver = "";
    public static String TZone;
    public static String Summary;
    public static String r_type;
    
    public static int t_calls = 0;
    public static double t_min = 0;
    public static double t_max = 0;
    public static double t_avg = 0;
    public static double p_50 = 0;
    public static double p_90 = 0;
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuReports;
    private javax.swing.JMenu MenuStation;
    private javax.swing.JMenu Menu_AP3;
    private javax.swing.JMenu Menu_AP3_;
    private javax.swing.JMenu Menu_AP3_DE;
    private javax.swing.JMenu Menu_AP3_PR;
    private javax.swing.JMenu Menu_AP3_ST;
    private javax.swing.JMenu Menu_API;
    private javax.swing.JMenu Menu_Android;
    private javax.swing.JMenu Menu_C360;
    private javax.swing.JMenu Menu_C360_;
    private javax.swing.JMenu Menu_C360_DE;
    private javax.swing.JMenu Menu_C360_PR;
    private javax.swing.JMenu Menu_C360_ST;
    private javax.swing.JMenu Menu_DL;
    private javax.swing.JMenu Menu_DL_;
    private javax.swing.JMenu Menu_DL_DE;
    private javax.swing.JMenu Menu_DL_PR;
    private javax.swing.JMenu Menu_DL_ST;
    private javax.swing.JMenu Menu_Devices;
    private javax.swing.JMenu Menu_Env;
    private javax.swing.JMenu Menu_FW;
    private javax.swing.JMenu Menu_FW_;
    private javax.swing.JMenu Menu_FW_DE;
    private javax.swing.JMenu Menu_FW_PR;
    private javax.swing.JMenu Menu_FW_ST;
    private javax.swing.JMenu Menu_JIRA;
    private javax.swing.JMenu Menu_JOBS;
    private javax.swing.JMenu Menu_OR;
    private javax.swing.JMenu Menu_SL;
    private javax.swing.JMenu Menu_Swagger;
    private javax.swing.JMenu Menu_Tools;
    private javax.swing.JMenu Menu_UI_Viewer;
    private javax.swing.JMenu Menu_WO;
    private javax.swing.JMenu Menu_WO_;
    private javax.swing.JMenu Menu_WO_DE;
    private javax.swing.JMenu Menu_WO_PR;
    private javax.swing.JMenu Menu_WO_ST;
    private javax.swing.JMenu Menu_Web_Tools;
    private javax.swing.JMenu Menu_iOS;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>   
}
