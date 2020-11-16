/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import AP3.AP3;
import API.API;
import Reports.W_Report;
//import com.tomtessier.scrollabledesktop.*;
import com.google.common.base.Stopwatch;
import java.awt.Cursor;
import java.beans.PropertyVetoException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.List;
import java.util.TimerTask;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Oleg.Spozito
 */
public class A extends javax.swing.JFrame {
    /**
     * Creates new form A
     */
    public A() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu_AP3 = new javax.swing.JMenu();
        jMenu_FW = new javax.swing.JMenu();
        jMenuWO = new javax.swing.JMenu();
        jMenuORDERS = new javax.swing.JMenu();
        jMenu_API = new javax.swing.JMenu();
        jMenuReports = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JTT");
        setMinimumSize(new java.awt.Dimension(912, 648));
        setSize(new java.awt.Dimension(912, 648));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setName("A"); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );

        jMenu_AP3.setBorder(null);
        jMenu_AP3.setText("AP3");
        jMenu_AP3.setName("AP3"); // NOI18N
        jMenu_AP3.setVerifyInputWhenFocusTarget(false);
        jMenu_AP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_AP3MouseClicked(evt);
            }
        });
        jMenuBar.add(jMenu_AP3);

        jMenu_FW.setText("FW");
        jMenu_FW.setEnabled(false);
        jMenu_FW.setName("FW"); // NOI18N
        jMenu_FW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_FWMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenu_FW);

        jMenuWO.setText("WebOrdering");
        jMenuWO.setEnabled(false);
        jMenuWO.setName("FW"); // NOI18N
        jMenuWO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuWOMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuWO);

        jMenuORDERS.setText("Orders");
        jMenuORDERS.setEnabled(false);
        jMenuORDERS.setName("FW"); // NOI18N
        jMenuORDERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuORDERSMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuORDERS);

        jMenu_API.setBorder(null);
        jMenu_API.setText("APIs");
        jMenu_API.setName("AP3"); // NOI18N
        jMenu_API.setVerifyInputWhenFocusTarget(false);
        jMenu_API.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_APIMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenu_API);

        jMenuReports.setBorder(null);
        jMenuReports.setText("Reports");
        jMenuReports.setName("FW"); // NOI18N
        jMenuReports.setVerifyInputWhenFocusTarget(false);
        jMenuReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuReportsMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuReports);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_AP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_AP3MouseClicked
        if(jMenu_AP3.isEnabled()){
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            Open_AP3();
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_jMenu_AP3MouseClicked
    private void Open_AP3(){
        AP3 ap3 = new AP3();
        this.jDesktopPane1.add(ap3);
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
        try {
            ap3.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //ap3.show();
        F_COUNT++;     
    }
    private void Open_API(){
        API api = new API();
        this.jDesktopPane1.add(api);
        int Y;
        int X;
        if(F_COUNT > 4) {
            Y = F_COUNT;
            X = F_COUNT - 5;
        }else{
            Y = X = F_COUNT;
        }
        api.setLocation(X*20, Y*20);
        try {
            api.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        } 
        //api.show();
        F_COUNT++;     
    }    
    private void jMenu_FWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_FWMouseClicked
        if(jMenu_FW.isEnabled()){
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            //OpenFM();
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
        }
        
    }//GEN-LAST:event_jMenu_FWMouseClicked
 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Get_Version();
        Get_User();
        if(!ConnectDB()){
            jMenuBar.setVisible(false);
            this.setTitle("JTT - no connection to QA DB");
        }else{
            this.setTitle("JTT v1.0.1" + " - " + "User: " + UserID + ", Machine: " + WsID + ", OS: " + WsOS);
            Keep_DB_Connection();
        }
        Open_AP3();
        //Open_API();
    }//GEN-LAST:event_formWindowOpened

    private void Keep_DB_Connection() {  
        Timer ti = new Timer();  
        TimerTask tt = new TimerTask() {  
            @Override  
            public void run() {  
                try {
                    ResultSet rs = conn.createStatement().executeQuery("SELECT TOP 1 [qID] FROM [dbo].[users]");
                    System.out.println("Keep_DB_Connection - OK @" + LocalDateTime.now().format(Time_12_formatter)); 
                }catch (Exception ex){
                    System.out.println("Keep_DB_Connection " + ex.getMessage());
                }
 
            };  
        };  // 29*60*1000=1,740,000
        ti.schedule(tt, 1740000, 1740000);  
    }  

    private void jMenuORDERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuORDERSMouseClicked
        //OpenREPORT();
    }//GEN-LAST:event_jMenuORDERSMouseClicked
    private void jMenuWOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuWOMouseClicked
        if(jMenuWO.isEnabled()){
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            //OpenWO();
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));             
        }
    }//GEN-LAST:event_jMenuWOMouseClicked
    private void jMenuReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuReportsMouseClicked
        if(jMenuReports.isEnabled()){
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            OpenREPORT(); 
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));             

        }   
    }//GEN-LAST:event_jMenuReportsMouseClicked

    private void jMenu_APIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_APIMouseClicked
        if(jMenu_API.isEnabled()){
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            Open_API(); 
            jDesktopPane1.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            jMenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));             

        }
    }//GEN-LAST:event_jMenu_APIMouseClicked
    private void OpenREPORT() {                                    
        W_Report wr = new W_Report();
        this.jDesktopPane1.add(wr);
        int X = this.jDesktopPane1.getWidth();
        int X1 = wr.getWidth();
        int Y = this.jDesktopPane1.getHeight();
        int Y1 = wr.getHeight();
        wr.setLocation(X - X1, Y - Y1);
//        try {
//            wr.setSelected(true);
//        } catch (PropertyVetoException ex) {
//            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
//        }
        wr.show();                           
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
    private static void Get_User() {
        //setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        UserID = System.getProperty("user.name");
        //UserID = "theleepan.sivabalasi";
        WsOS = System.getProperty("os.name");
        try {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            WsID = addr.getHostName();
        } catch (UnknownHostException ex) { 
            WsID = "Unknown - " + ex.getMessage();
        }
        //setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    } 
    private  boolean ConnectDB() {
        setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        boolean OK = false;
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://dev-digitalhospitality-sql.database.windows.net:1433;database=cdlqadb;user=xttadmin;password=Sp515s10#a;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;"); 
            OK = true;
        } catch (SQLException  ex) {
            //txtLOG.append("\r\n- ConnectDB" + ex.getMessage());  
            Logger.getLogger(AP3.class.getName()).log(Level.SEVERE, null, ex);
        }
        setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        return OK;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Get_User();
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
            java.util.logging.Logger.getLogger(AP3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            final A F = new A();
            F.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    try {
                        if(conn != null && !conn.isClosed()){ conn.close(); }
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(AP3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            F.setLocationRelativeTo(null);
            F.setVisible(true);
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Public & Private Variables">
    
    public static String API_Response_Body = "";
    public static int T_Index;
    public static WebDriver d1;
    public static WebDriver d2;
    public static WebElement e;
    public static WebElement e1;
    public static WebElement e2;
    public static FluentWait wait;
    public static WebDriverWait wait_msg;
    public static WebDriverWait timeout;
    public static List<WebElement> L0 = null;
    public static List<WebElement> L1 = null;
    public static List<WebElement> L2 = null;
    public static List<WebElement> L3 = null;
    public static List<WebElement> Opens = null;
    public static List<WebElement> Closes = null;
    
    public static double sleep = 0.5;
    public static double Timeout = 15;
    public static double Wait = 3;

    
    public static String t;
    public static String err;
    public static String F; 
    public static String EX; 
    
    public static String ADMIN_ID;
    public static String ADMIN_PW;
    public static String SM_ID; 
    public static String SM_PW;
    public static String IM_ID; 
    public static String IM_PW;
    
    public static int _t = 0; // Total
    public static int _p = 0; // Passed
    public static int _f = 0; // Failed
    public static int _w = 0; // Warn
    public static boolean FAIL = false;
    public static boolean ALL_DATA = false;
    public static boolean NO_DATA = false;
    
    public static Stopwatch sw1 = Stopwatch.createUnstarted();;
    public static String r_time = "";
    public static String Ver = "";
    public static String TZone;   
    
    public static String New_ID = "";
    public static String Toast_Msg = "";        

    
    public static String Tab_Name;
    public static String Day;
    public static String Open;
    public static String Close;
    public static String New_From;
    public static String New_To;
    public static String _24;
    public static String Summary;
    public static String r_type;  
    
    public static int t_calls = 0;
    public static double t_min = 0;
    public static double t_max = 0;
    public static double t_avg = 0;
    public static double p_50 = 0;
    public static double p_90 = 0;
    

    public static String S_OAuth_TKN = "";
    public static String S_Client_ID = "";
    public static String S_Client_Secret  = "";
    public static String S_Signing_Secret = "";
    public static String S_Hook = "";

    public static Connection conn = null;

    public static DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    public static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static int F_COUNT;    
    public static String Version = "";
    public static String UserID = "";
    public static String WsID = "";    
    public static String WsOS = "";  

    public static String SQL = "";  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuORDERS;
    private javax.swing.JMenu jMenuReports;
    private javax.swing.JMenu jMenuWO;
    private javax.swing.JMenu jMenu_AP3;
    private javax.swing.JMenu jMenu_API;
    private javax.swing.JMenu jMenu_FW;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>   
}
