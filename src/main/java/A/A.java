/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Test Pull request Branch permission 2nd:
// Check for at least 1 approval from default reviewers > 
// chnged to  >
// Check for at least 1 approval
package A;
import AP3.AP3;
import API.API;
import Reports.W_Report;
import DL.DL;
import FW.FW;
import WO.WO;
import Orders.Orders;
import Station.Station;
import java.awt.Cursor;
import java.beans.PropertyVetoException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
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

        DesktopPane = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        Menu_Android = new javax.swing.JMenu();
        Menu_iOS = new javax.swing.JMenu();
        Menu_AP3 = new javax.swing.JMenu();
        Menu_API = new javax.swing.JMenu();
        MenuWO = new javax.swing.JMenu();
        Menu_FW = new javax.swing.JMenu();
        Menu_DL = new javax.swing.JMenu();
        MenuStation = new javax.swing.JMenu();
        Menu_OR = new javax.swing.JMenu();
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
            .addGap(0, 697, Short.MAX_VALUE)
        );

        Menu_Android.setText("Android");
        Menu_Android.setName("Station"); // NOI18N
        Menu_Android.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AndroidMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_Android);

        Menu_iOS.setText("iOS");
        Menu_iOS.setName("Station"); // NOI18N
        Menu_iOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_iOSMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_iOS);

        Menu_AP3.setBorder(null);
        Menu_AP3.setText("AP3");
        Menu_AP3.setName("AP3"); // NOI18N
        Menu_AP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AP3MouseClicked(evt);
            }
        });
        MenuBar.add(Menu_AP3);

        Menu_API.setBorder(null);
        Menu_API.setText("APIs");
        Menu_API.setName("AP3"); // NOI18N
        Menu_API.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_APIMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_API);

        MenuWO.setText("WO");
        MenuWO.setName("FW"); // NOI18N
        MenuWO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuWOMouseClicked(evt);
            }
        });
        MenuBar.add(MenuWO);

        Menu_FW.setText("FW");
        Menu_FW.setName("FW"); // NOI18N
        Menu_FW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FWMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_FW);

        Menu_DL.setText("DL");
        Menu_DL.setName("FW"); // NOI18N
        Menu_DL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_DLMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_DL);

        MenuStation.setText("Station");
        MenuStation.setName("Station"); // NOI18N
        MenuStation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuStationMouseClicked(evt);
            }
        });
        MenuBar.add(MenuStation);

        Menu_OR.setText("Orders");
        Menu_OR.setName("Station"); // NOI18N
        Menu_OR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ORMouseClicked(evt);
            }
        });
        MenuBar.add(Menu_OR);

        MenuReports.setBorder(null);
        MenuReports.setText("Reports");
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
                .addComponent(DesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_AP3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AP3MouseClicked
        if(Menu_AP3.isVisible()){
            Menu_AP3.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_AP3();
            } catch (PropertyVetoException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_AP3.setVisible(true);
        }
    }//GEN-LAST:event_Menu_AP3MouseClicked
 
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        }
        W_Report wr = new W_Report();
        DesktopPane.add(wr);
        int X = this.DesktopPane.getWidth();
        int X1 = wr.getWidth();
        int Y = this.DesktopPane.getHeight();
        int Y1 = wr.getHeight();
        wr.setLocation(X - X1, Y - Y1);
        wr.setVisible(true);
        wr.show();
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        AP3 ap3 = new AP3();
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        API api = new API();
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        WO wo = new WO();
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        FW fw = new FW();
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
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        DL dl = new DL();
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
        final JInternalFrame[] frames = DesktopPane.getAllFrames();
        for (JInternalFrame frame : frames) {
            if (frame.getName().equals("Station")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        Station dl = new Station();
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
            if (frame.getName().equals("OR")) {
                try {
                    frame.setSelected(true);
                    if (frame.isIcon()) {
                        frame.setIcon(false);
                    }
                    frame.setSelected(true);
                }catch (PropertyVetoException ex) {
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
                }
                frame.requestFocus();
                frame.toFront();
                return;
            }
        } 
        Orders or = new Orders();
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

    private void Menu_FWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FWMouseClicked
        if(Menu_FW.isVisible()){
            Menu_FW.setVisible(false);
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            try {
                Open_FW();
            }
            catch (PropertyVetoException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
            DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
            Menu_FW.setVisible(true);
        }
    }//GEN-LAST:event_Menu_FWMouseClicked
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Get_User();
        this.setTitle("JTT v1.0.1" + " - " + "User: " + UserID + ", Machine: " + WsID + ", OS: " + WsOS);
        if (!UserID.toLowerCase().contains("oleg")){
            Register_Login();            
        }
        Get_AP3_TKN_and_Slack_IDs();
        
        Menu_Android.setToolTipText("Android Mobile Automation Manager - in Development");
        Menu_iOS.setToolTipText("iOS Mobile Automation Manager - in Development");
        MenuWO.setToolTipText("Web Ordering Automation"); 
        Menu_AP3.setToolTipText("Ap3 Automation Manager");
        MenuWO.setToolTipText("Web Ordering Automation"); 
        Menu_FW.setToolTipText("Food Works Automation"); 
        Menu_DL.setToolTipText("Distiller Automation");
        Menu_API.setToolTipText("Configutation / AP3 API(s)"); 
        MenuReports.setToolTipText("All xTT and JTT reports"); 
        MenuStation.setToolTipText("Site > Brand > Menus(s) difinitions"); 
        //Open_AP3();
        //Open_API();
    }//GEN-LAST:event_formWindowOpened

    private void Register_Login() {     
        new Thread(new Runnable() {
            @Override
            public void run() {
                try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
                    PreparedStatement _update = conn.prepareStatement("UPDATE users SET " +
                            "LogIN = 'JTT', " +
                            "LastL = '" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm a")) + "', " +
                            "USER_MACHINE = '" + WsID + "', " +
                            "IP = '" + "Not used" + "' " +
                            "WHERE User_ID = '" + UserID + "'");
                    int row = _update.executeUpdate();
                    //Logger.getLogger(A.class.getName()).log(Level.SEVERE, "=== Register_Login: " + row + " row updated");
                } catch (SQLException ex) {                  
                    Logger.getLogger(A.class.getName()).log(Level.SEVERE, "=== Register_Login > SQL ERROR: " + ex.getMessage(), ex);
                }
            }
        }).start();
    } 

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
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        MenuStation.setEnabled(true);
    }//GEN-LAST:event_MenuStationMouseClicked
    private void MenuWOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuWOMouseClicked
        if(!MenuWO.isEnabled()){
            return;
        }
        MenuWO.setEnabled(false);
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            Open_WO();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        MenuWO.setEnabled(true);

    }//GEN-LAST:event_MenuWOMouseClicked
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
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        MenuBar.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
        Menu_OR.setEnabled(true); 
    }//GEN-LAST:event_Menu_ORMouseClicked

    private void Menu_AndroidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AndroidMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_AndroidMouseClicked

    private void Menu_iOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_iOSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_iOSMouseClicked
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
    private void Get_AP3_TKN_and_Slack_IDs(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [_value] FROM[dbo].[keys] WHERE [_key] = 'S_OAuth_TKN'");
            rs.next();
            S_OAuth_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            S_OAuth_TKN = ex.getMessage();

        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AP3.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            final A F = new A();
            F.addWindowListener(new java.awt.event.WindowAdapter() {
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
//                java.util.logging.Logger.getLogger(AP3.class.getName()).log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
//            }
            F.setLocationRelativeTo(null);
            F.setVisible(true);
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Public & Private Variables">
    public static final String QA_BD_CON_STRING = "jdbc:sqlserver://dev-digitalhospitality-sql.database.windows.net:1433;database=cdlqadb;user=xttadmin;password=Sp515s10#a;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    public static String S_OAuth_TKN = "";
    public static String API_Response_Body = "";
    public static int T_Index;
    public static WebDriver d1;
    public static WebElement e;
    public static WebElement e1;
    public static WebElement e2;
    public static FluentWait fluentWait;
    public static WebDriverWait loadTimeout;
    public static List<WebElement> L0 = null;
    public static List<WebElement> L1 = null;
    public static List<WebElement> L2 = null;
    public static List<WebElement> L3 = null;
    public static List<WebElement> Opens = null;
    public static List<WebElement> Closes = null;
    
    public static double sleep = 500; // milisec
    public static double LoadTimeOut = 15; // sec
    public static long WaitForElement = 3000; // milisec

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
    
    public static DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    public static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static int F_COUNT;    
    public static String Version = "";
    public static String UserID = "";
    public static String WsID = "";    
    public static String WsOS = "";  

    public static String SQL = "";  
    private ImageIcon II;  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuReports;
    private javax.swing.JMenu MenuStation;
    private javax.swing.JMenu MenuWO;
    private javax.swing.JMenu Menu_AP3;
    private javax.swing.JMenu Menu_API;
    private javax.swing.JMenu Menu_Android;
    private javax.swing.JMenu Menu_DL;
    private javax.swing.JMenu Menu_FW;
    private javax.swing.JMenu Menu_OR;
    private javax.swing.JMenu Menu_iOS;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>   
}
