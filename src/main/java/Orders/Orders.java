package Orders;

import com.google.common.base.Stopwatch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import org.joda.time.DateTime;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.json.JSONArray;
import org.json.JSONObject;

public class Orders extends javax.swing.JInternalFrame {

    public Orders() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrders = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnLog = new javax.swing.JButton();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES13 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        lblSITES14 = new javax.swing.JLabel();
        cmbApp = new javax.swing.JComboBox<>();
        lblSITES4 = new javax.swing.JLabel();
        txtMobile_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtMobile_PW = new javax.swing.JTextField();
        btnOR_User = new javax.swing.JButton();
        btnOR_Site = new javax.swing.JButton();
        btnOR_Brand = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        cmbDAYS = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DV_Sites = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV_Brands = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Orders >>> loading, please wait ... ... ... ...");
        setMaximumSize(new java.awt.Dimension(860, 32532));
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("ORDER"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setPreferredSize(new java.awt.Dimension(860, 532));
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

        lblOrders.setText("Orders");
        lblOrders.setAlignmentX(0.5F);

        DV1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV1.setGridColor(java.awt.SystemColor.windowBorder);
        DV1.setName("DV1"); // NOI18N
        DV1.setRowHeight(18);
        DV1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV1.getTableHeader().setReorderingAllowed(false);
        DV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DV1);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

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

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Environment:");
        lblSITES13.setAlignmentX(0.5F);

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("Application:");
        lblSITES14.setAlignmentX(0.5F);

        cmbApp.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbApp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppItemStateChanged(evt);
            }
        });

        lblSITES4.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES4.setText("Mobile User E-mail:");
        lblSITES4.setToolTipText("");
        lblSITES4.setAlignmentX(0.5F);

        txtMobile_ID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_ID.setForeground(new java.awt.Color(204, 0, 51));
        txtMobile_ID.setText("App_User@?.?");

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("Mobile User Password");
        lblSITES6.setAlignmentX(0.5F);

        txtMobile_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_PW.setForeground(new java.awt.Color(204, 0, 51));
        txtMobile_PW.setText("password");

        btnOR_User.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnOR_User.setText("Load Orders > User");
        btnOR_User.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnOR_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOR_UserMouseClicked(evt);
            }
        });

        btnOR_Site.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnOR_Site.setText("Load Orders > Site");
        btnOR_Site.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnOR_Site.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOR_SiteMouseClicked(evt);
            }
        });

        btnOR_Brand.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnOR_Brand.setText("Load Orders > Brand");
        btnOR_Brand.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnOR_Brand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOR_BrandMouseClicked(evt);
            }
        });

        btnCart.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCart.setText(" ^ Selected Order > Print SCart & Order JSON");
        btnCart.setEnabled(false);
        btnCart.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartMouseClicked(evt);
            }
        });

        cmbDAYS.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbDAYS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "14", "30", "60", "120" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Last");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel2.setText("days");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMobile_ID)
                            .addComponent(txtMobile_PW)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSITES4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES6))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOR_User, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnOR_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOR_Site, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmbDAYS, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDAYS, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSITES4)
                        .addGap(2, 2, 2)
                        .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblSITES6)
                        .addGap(2, 2, 2)
                        .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(btnOR_Site, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOR_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOR_User, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        DV_Sites.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DV_Sites.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Sites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Sites.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Sites.setCellSelectionEnabled(true);
        DV_Sites.setGridColor(java.awt.SystemColor.windowBorder);
        DV_Sites.setName("DV_Sites"); // NOI18N
        DV_Sites.setRowHeight(18);
        DV_Sites.getTableHeader().setReorderingAllowed(false);
        DV_Sites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_SitesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DV_Sites);

        DV_Brands.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Brands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Brands.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Brands.setCellSelectionEnabled(true);
        DV_Brands.setGridColor(java.awt.SystemColor.windowBorder);
        DV_Brands.setName("DV_Brands"); // NOI18N
        DV_Brands.setOpaque(false);
        DV_Brands.setRowHeight(18);
        DV_Brands.getTableHeader().setReorderingAllowed(false);
        DV_Brands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_BrandsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV_Brands);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblOrders)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration">
    private boolean Load;
    private JSONObject PaymetMethod;

    private String C = "";
  
    private boolean CONFIG = false;
   
    private String Mobile_User_ID;
    private String Mobile_User_TKN;
    protected String AP3_TKN = "";
    protected final Stopwatch sw1 = Stopwatch.createUnstarted();
    protected final DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    protected final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    protected final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    protected String SQL = ""; 
    protected String app = "";
    protected String appId = "";
    protected String env;
    protected String BaseAPI;
    protected String platform = "CDL";
    protected String SITE = "";
    protected String SiteID = "";
    protected String BRAND = "";
    protected String BrandID = "";
    private int SitesLastRow = -1; 
    protected JSONObject json;
    protected JSONObject requestParams = null;
    protected String BODY = ""; 
    protected String Auth = "";
    // </editor-fold>
        
    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">     
    private void DV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV1MouseClicked
        if(DV1.getSelectedRowCount() > 0 ){
            btnCart.setEnabled(true);
        }else{
            btnCart.setEnabled(false);
        } 
    }//GEN-LAST:event_DV1MouseClicked
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed

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
    private void Load_Form(){
        Load = true;
        cmbApp.addItem("Boost");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Development");
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");  
        
        cmbEnv.setSelectedIndex(2); // Production
        cmbApp.setSelectedIndex(0); // Boost      
        Load = false;
        LOAD_ENV();
        this.setTitle("Orders");
    }
    private void btnOR_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOR_UserMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        Get_Mobile_User();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }  
    private void Load_User_V_Orders(){

    }//GEN-LAST:event_btnOR_UserMouseClicked
    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            app = cmbApp.getSelectedItem().toString();
            GetSites();
        }
    }//GEN-LAST:event_cmbAppItemStateChanged
    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            LOAD_ENV();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged
    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        SAVE_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnLogMouseClicked
    private void btnCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartMouseClicked
        if(btnCart.isEnabled() && DV1.getSelectedRowCount() > 0){
            GetShoppingCartAndOrder();
        }
    }//GEN-LAST:event_btnCartMouseClicked
    private void DV_SitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_SitesMouseClicked
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
            return;
        }
        SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
        SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));

        GetBrands(); // ================================
        SitesLastRow = DV_Sites.getSelectedRow();
    }//GEN-LAST:event_DV_SitesMouseClicked
    private void DV_BrandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_BrandsMouseClicked
        if(DV_Brands.getRowCount() < 1){
            return;
        }
        BRAND = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 0));
        BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3));
    }//GEN-LAST:event_DV_BrandsMouseClicked
    private void btnOR_SiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOR_SiteMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Get Site Orders ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        Auth = "Bearer " + AP3_TKN;
        SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
        SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));
        
        int Days_Back = Integer.parseInt(cmbDAYS.getSelectedItem().toString());
        long m1 = System.currentTimeMillis() + (60*60*24*1*1000);  // Now + 1 day to include future 'requested date'
        //long m7 = System.currentTimeMillis() - (60*60*24*(Days_Back - 1)*1000);  // Now - 7 days
        Date DateBack = new DateTime(new Date()).minusDays(Days_Back - 1).withTimeAtStartOfDay().toDate();      
        long m7 = DateBack.getTime();
        
        Api_Call(BaseAPI + "/order/location/group/" + SiteID + "?start=" + m7 + "&end=" + m1 + "&order_type=all&extended=true", Auth);
        //Api_Call("GET",  BaseAPI + "/order/location/group/" + SiteID + "?pickup_start=" + m7 + "&pickup_end=" + m1 + "&order_type=all&extended=true", Auth, "");
        
        Load_Orders("SITE");      
        // &_query=%7Borders%7BALL%7D%7D"
        lblOrders.setText(env + ": Site '" + SITE + "'   >>>  Last " +  cmbDAYS.getSelectedItem().toString() + " days Orders: " + DV1.getRowCount() + " found");
        txtLog.append(env + " > " + cmbApp.getSelectedItem().toString() + " > " + SITE + " - " + DV1.getRowCount() + " found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());         
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnOR_SiteMouseClicked
    private void btnOR_BrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOR_BrandMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Get Brand Orders ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        Auth = "Bearer " + AP3_TKN;
        BRAND = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 0));
        BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3));

        int Days_Back = Integer.parseInt(cmbDAYS.getSelectedItem().toString());
        long m1 = System.currentTimeMillis() + (1*24*3600*1000);  // Now + 1 day to include future 'requested date'
        //long m7 = System.currentTimeMillis() - ((Days_Back-1)*24*3600*1000);  // Now - Days_Back days > default 7
        Date DateBack = new DateTime(new Date()).minusDays(Days_Back - 1).withTimeAtStartOfDay().toDate();      
        long m7 = DateBack.getTime();
        
        Api_Call(BaseAPI + "/order/location/brand/" + BrandID + "?start=" + m7 + "&end=" + m1 + "&order_type=all&extended=true", Auth);
        
        Load_Orders("BRAND");
        
        lblOrders.setText(env + ": Site '" + SITE + "', Brand '" + BRAND + "'   >>>  Last " +  cmbDAYS.getSelectedItem().toString() + " days Orders: " + DV1.getRowCount() + " found");
        txtLog.append(env + " > " + cmbApp.getSelectedItem().toString() + " > " + SITE + " > " + BRAND + " - " + DV1.getRowCount() + " found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnOR_BrandMouseClicked
    // </editor-fold>

    private void LOAD_ENV(){
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
        }        
        Get_AP3_TKN(); // ===============================
        LOAD_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        GetSites(); // ================================      
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
    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'OR' AND [env] = '" + env + "'";
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
        //String[] lines = C.split(System.getProperty("line.separator"));  
        String[] lines = C.split("\n");  
        String value;
        try {
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if (l.contains("env: ")) { env = value; }
                if (l.contains("app: ")) {  app = value; }
                if (l.contains("SITE: ")) { SITE = value; }
                if (l.contains("BRAND: ")) { BRAND = value;  }
                if (l.contains("MOBILE_ID: ")) { txtMobile_ID.setText(value); }
                if (l.contains("MOBILE_PW: ")) { txtMobile_PW.setText(value); }
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
            if(DV_Sites.getRowCount() > 0){
                _S = DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0).toString();
            }
            if(DV_Brands.getRowCount() > 0){
                _B = DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 0).toString();
            }
            C += "env: " + env + "\r\n";
            C += "app: " + cmbApp.getSelectedItem().toString() + "\r\n";
            C += "MOBILE_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "MOBILE_PW: " + txtMobile_PW.getText()  + "\r\n"; 
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'OR' AND [env] = '" + env + "'";
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
            _insert.setString(4, "OR");
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
    private void GetSites() {   
        SitesLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
              
        appId = A.Func.App_ID(cmbApp.getSelectedItem().toString(), env);

        String[] SitesColumnsName = {"Site","Platform","Country","Id"}; 
        DefaultTableModel SitesModel = new DefaultTableModel();
        SitesModel.setColumnIdentifiers(SitesColumnsName);
        DV_Sites.setModel(SitesModel);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV_Sites.getModel());
        DV_Sites.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);  
        sorter.setSortable(0, false);         
                 
        try { 
            Api_Call(BaseAPI + "/location/multigroup/" + appId, "");
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
                        country = addresses.getString("country");   
                    }
                    SitesModel.addRow(new Object[]{site, platform, country, id});                   
                }
            DV_Sites.setModel(SitesModel);
            DV_Sites.setDefaultEditor(Object.class, null);
            DV_Sites.getColumnModel().getColumn(0).setPreferredWidth(250);
            DV_Sites.getColumnModel().getColumn(1).setPreferredWidth(70);
            DV_Sites.getColumnModel().getColumn(2).setPreferredWidth(50);
            DV_Sites.getColumnModel().getColumn(3).setPreferredWidth(500);
            
            sorter.setSortable(0, true); 
            sorter.sort();            
      
        } catch (Exception ex) {
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n");   
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }         
        
        if (DV_Sites.getRowCount() > 0) {
            DV_Sites.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(SITE.trim())) {
                for(int row = 0; row < DV_Sites.getRowCount(); row++) {
                    if(DV_Sites.getValueAt(row, 0).equals(SITE)){
                        DV_Sites.changeSelection(row, 0, false, false);
                        break;
                    }
                }
            }
            SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
            SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));           

        }
        txtLog.append(app + " > " + DV_Sites.getRowCount() + " Site(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));

        GetBrands();
    }
    private void GetBrands() {
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
           return;
        }
        SitesLastRow = DV_Sites.getSelectedRow();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Brands ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String[] ColumnsName = {}; 
        DefaultTableModel Model = new DefaultTableModel();
        Model.setColumnIdentifiers(ColumnsName);
            
     
        String[] BrandsColumnsName = {"Brand / Station","Location","menu_ids", "Brand Id", "Unit ID"}; 
        DefaultTableModel BrandsModel = new DefaultTableModel();
        BrandsModel.setColumnIdentifiers(BrandsColumnsName);
        DV_Brands.setModel(BrandsModel);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV_Brands.getModel());
        DV_Brands.setRowSorter(sorter);
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);  
        sorter.setSortable(0, false);                  
        
        try {
            Api_Call(BaseAPI + "/location/group/" + DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3) + "?extended=true&nocache=1", "");
            
            JSONArray Location = json.getJSONArray("locations");
            JSONArray brands = null;
            
            String brand;
            String location;
            String id;
            String unit_id;
            String menu_ids;
            if (Location != null) {
                for (Object l : Location) {
                    brand = "";
                    location = "";
                    id = "";
                    unit_id = "";
                    menu_ids = "";
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
                            if(br.has("menus")){
                                menu_ids = "";
                                JSONArray Menus = br.getJSONArray("menus");
                                for (Object m : Menus) {
                                    JSONObject menu = (JSONObject) m;
                                    menu_ids += menu.getString("id") + ","; 
                                }  
                            }
                            BrandsModel.addRow(new Object[]{brand, location, menu_ids, id, unit_id});
                        }
                    }
                }
            }
            DV_Brands.setModel(BrandsModel);    
            DV_Brands.setDefaultEditor(Object.class, null);
            DV_Brands.getColumnModel().getColumn(0).setPreferredWidth(140);
            DV_Brands.getColumnModel().getColumn(1).setPreferredWidth(140);
            DV_Brands.getColumnModel().getColumn(2).setPreferredWidth(80);
            DV_Brands.getColumnModel().getColumn(3).setPreferredWidth(400);            
            DV_Brands.getColumnModel().getColumn(4).setPreferredWidth(400);

            sorter.setSortable(0, true); 
            sorter.sort();            
               
        } catch (Exception ex) {
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         

        if (DV_Brands.getRowCount() > 0) {
            DV_Brands.changeSelection(0, 0, false, false);
            if (CONFIG && !"".equals(BRAND.trim())) {
                for(int row = 0; row < DV_Brands.getRowCount(); row++) {
                    if(DV_Brands.getValueAt(row, 0).equals(BRAND)){
                        DV_Brands.changeSelection(row, 0, false, false);
                        break;
                    } 
                }
            }
            txtLog.append("" + SITE + " > " + DV_Brands.getRowCount() + " Station(s) found" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3)); 
        } else {
            BrandID = "null";
            txtLog.append("" + SITE + " > " + "0 Station(s) found" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
       
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
 
    private void Get_Mobile_User(){
        txtLog.append("\r\n- Moblibe User Authentication.." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        Mobile_User_ID = "";
        Mobile_User_TKN = "";
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = A.Func.Realm_ID(cmbApp.getSelectedItem().toString(), env);      
        
        // ============ Mobile User Authentication =====================================
        Api_Call(BaseAPI + "/user/auth" + "?realm=" + Realm, "Basic " + UserAuth);

        Mobile_User_ID = json.getString("user");
        Mobile_User_TKN = json.getString("token");

        txtLog.append("== " + BaseAPI + "/user/auth?realm="  + Realm + " > " + "\r\n");
        txtLog.append("== " + "UserID: "  + Mobile_User_ID + "\r\n");
        txtLog.append("== " + "UserTKN: "  + Mobile_User_TKN + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());

        if(Mobile_User_ID.isEmpty()){
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }
               
        int Days_Back = Integer.parseInt(cmbDAYS.getSelectedItem().toString());
        long m1 = System.currentTimeMillis() + (60*60*24*1*1000);  // Now + 1 day to include future 'requested date'

        //long m7 = System.currentTimeMillis() - (60*60*24*(Days_Back-1)*1000);  // Now - 7 days
        Date DateBack = new DateTime(new Date()).minusDays(Days_Back - 1).withTimeAtStartOfDay().toDate();      
        long m7 = DateBack.getTime();

        txtLog.append("\r\n- Get Mobile User Orders ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        Auth = "Bearer " + Mobile_User_TKN;
        SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
        SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));
        
        Api_Call(BaseAPI + "/order/customer/" + Mobile_User_ID + "?start=" + m7 + "&end=" + m1 + "&order_type=all&extended=true", Auth);
        //Api_Call("GET",  BaseAPI + "/order/customer/" + Mobile_User_ID + "?pickup_start=" + m7 + "&pickup_end=" + m1 + "&order_type=all&extended=true", Auth, "");
        
        Load_Orders("USER");
        lblOrders.setText(env + ": Mobile User " + txtMobile_ID.getText() + "  >>>  Last " +  cmbDAYS.getSelectedItem().toString() + " days Orders: " + DV1.getRowCount() + " found");
        txtLog.append(env + " > " + cmbApp.getSelectedItem().toString() + " > " + txtMobile_ID.getText() + " - " + DV1.getRowCount() + " found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
    }   

    private void Load_Orders(String TYPE) {
        String _Site = SITE;
        if(TYPE.equals("USER")){
            _Site = "?";
        }
        btnCart.setEnabled(false);
        String _Promo = "None";
        String _Name = "?";
        String _Payment = "?";
        String _Amount = "0";
        
        String[] SitesColumnsName = {"Env", "App", "Site", "Destination", "Req_Date", "Amount", "PickupName", "Promo", "Payment", "Service","SCartID", "OrderID", "Modified_Date"}; 
        DefaultTableModel dm = new DefaultTableModel();
        dm.setColumnIdentifiers(SitesColumnsName);
        DV1.setModel(dm);
        
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(DV1.getModel());
        ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(12, SortOrder.DESCENDING));
        sorter.setSortKeys(sortKeys);      
        DV1.setRowSorter(sorter);
        
        ZoneOffset offset = OffsetDateTime.now(ZoneId.of(TimeZone.getDefault().getID())).getOffset();
        DateTimeFormatter UTC_formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        DateTimeFormatter LOC_formatter = DateTimeFormatter.ofPattern("dd-MMM hh:mm a");
        LocalDateTime Date_Modified;
        LocalDateTime Date_Requested;
        
        if(json != null){
            try{
                JSONArray OR = json.getJSONArray("orders");
                if (!OR.isEmpty()) {
                    for (int i = 0; i < OR.length(); i++) {
                        _Promo = "None";
                        _Name = "?";
                        _Payment = "?";
                        _Amount = "?";
                        JSONObject or = OR.getJSONObject(i);
                        if(or.has("meta") && or.getJSONObject("meta").has("transaction") && or.getJSONObject("meta").getJSONObject("transaction").has("amount")){
                            _Amount = or.getJSONObject("meta").getJSONObject("transaction").getNumber("amount").toString();
                        }else{
                            if(or.has("meta") && or.getJSONObject("meta").has("shoppingcart") && or.getJSONObject("meta").getJSONObject("shoppingcart").has("total")){
                                _Amount = or.getJSONObject("meta").getJSONObject("shoppingcart").getJSONObject("total").getNumber("amount").toString();
                            }
                        }

                        if(or.has("payment") && or.getJSONObject("payment").has("credit_card") && 
                            or.getJSONObject("payment").getJSONObject("credit_card").has("card_type")){
                            String Last4 = " x????";
                            if(or.getJSONObject("payment").getJSONObject("credit_card").has("last4")){
                                Last4 = " x" + or.getJSONObject("payment").getJSONObject("credit_card").getString("last4");
                            }
                            _Payment = or.getJSONObject("payment").getJSONObject("credit_card").getString("card_type") + Last4;
                        } 
                        if(or.has("payment") && or.getJSONObject("payment").has("digital_wallet_pay")){
                            _Payment = or.getJSONObject("payment").getString("digital_wallet_pay");
                        }                        
                        if(or.has("payment") && or.getJSONObject("payment").has("badge_pay")){
                            if(or.getJSONObject("payment").getJSONObject("badge_pay").has("tender")){
                                _Payment = "Badge Pay";
                            }
                        } 
                        if(or.has("mealplan") && or.getJSONObject("mealplan").has("name")){
                            _Payment = "MPlan " + or.getJSONObject("mealplan").getString("name");
                        }  
                      
                        if(or.has("meta") && or.getJSONObject("meta").has("promo")){
                            _Promo = or.getJSONObject("meta").getJSONObject("promo").getString("code");
                        }
                        if (or.has("pickup_name")) {
                            _Name = or.getString("pickup_name");
                        }
                        Date_Modified = LocalDateTime.parse(or.getJSONObject("date").getString("modified"), UTC_formatter).plusSeconds(offset.getTotalSeconds());
                        Date_Requested = LocalDateTime.parse(or.getString("requested_date"), UTC_formatter).plusSeconds(offset.getTotalSeconds());

                        dm.addRow(new Object[]{env, app, _Site,
                            or.getJSONObject("details").getString("destination"),
                            Date_Requested.format(LOC_formatter),
                            _Amount,
                            _Name,
                            _Promo,                  
                            _Payment, 
                            or.getJSONObject("details").getString("order_type"),
                            or.getString("shoppingcart"),
                            or.getString("id"),
                            Date_Modified
                        });  
                    }
                }
                DV1.setModel(dm);

                DV1.setDefaultEditor(Object.class, null);
                DV1.getColumnModel().getColumn(0).setPreferredWidth(35); // Env
                DV1.getColumnModel().getColumn(1).setPreferredWidth(50); // App
                DV1.getColumnModel().getColumn(2).setPreferredWidth(120); // Site
                DV1.getColumnModel().getColumn(3).setPreferredWidth(120); // Destination       
                DV1.getColumnModel().getColumn(4).setPreferredWidth(95);  // req date
                DV1.getColumnModel().getColumn(5).setPreferredWidth(50);  // Amount
                DV1.getColumnModel().getColumn(6).setPreferredWidth(130); // Pickup name           
                DV1.getColumnModel().getColumn(7).setPreferredWidth(100); // Promo
                DV1.getColumnModel().getColumn(8).setPreferredWidth(70); // payment
                DV1.getColumnModel().getColumn(9).setPreferredWidth(50);  // service
                DV1.getColumnModel().getColumn(10).setPreferredWidth(50); // SCard ID
                DV1.getColumnModel().getColumn(11).setPreferredWidth(60); // Order ID
                DV1.getColumnModel().getColumn(12).setPreferredWidth(150); // Modfied Date UTC
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 

                sorter.setSortable(12, true); 
                sorter.sort(); 
                
            } catch (Exception ex) {
                txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n");   
                txtLog.setCaretPosition(txtLog.getDocument().getLength());   
            }    
        }    
    }

    private void GetShoppingCartAndOrder() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        txtLog.append("- Shopping Cart..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String J = "==== Shopping Cart" + "\r\n";
        String SC_Brand_ID = "";
        String SC_Site_ID = "";
        
        String CartID = "";
        Auth = "Bearer " + AP3_TKN;
        try {
            CartID = DV1.getValueAt(DV1.getSelectedRow(), 10).toString();
            Api_Call(BaseAPI + "/shoppingcart/" + CartID, "");
            J += BaseAPI + "/shoppingcart/" + CartID + "\r\n" + json.toString(4) + "\r\n";
            if(json.has("brand")){
                SC_Brand_ID = json.getString("brand");
            }
        } catch (Exception ex) {
            J += BaseAPI + "/shoppingcart/" + CartID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }

        txtLog.append("== " + BaseAPI + "/shoppingcart/" + CartID + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());

        J += "\r\n==== Order" + "\r\n";
        txtLog.append("- Order..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String OrderID = "";

        try {
            OrderID = DV1.getValueAt(DV1.getSelectedRow(), 11).toString();
            Api_Call(BaseAPI + "/order/" + OrderID, Auth);
            J += BaseAPI + "/order/" + OrderID + "\r\n" + json.toString(4) + "\r\n";
        } catch (Exception ex) {
            J += BaseAPI + "/order/" + OrderID + " > " + ex.getMessage() + "\r\n";
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/order/" + OrderID + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());

        String R = A.Func.SHOW_FILE(J, "json");
        if (!R.equals("OK")) {
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        
        if(DV1.getValueAt(DV1.getSelectedRow(), 2).toString().trim().equals("?")){
            Api_Call(BaseAPI + "/location/brand/" + SC_Brand_ID, Auth);    
            if(json.has("group")){
                SC_Site_ID = json.getString("group");
                Api_Call(BaseAPI + "/location/group/" + SC_Site_ID, Auth);                 
                if(json.has("name")){
                    String SC_Site = json.getString("name");
                    DV1.setValueAt(SC_Site, DV1.getSelectedRow(), 2);
                } 
            }      
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    protected void Api_Call(String EndPoint, String AUTH) {
        json = null;
        RequestSpecification request;
        request = RestAssured.given();
        int status = 0;
        String Result = "?";
        if (sw1.isRunning()) {
            sw1.reset();
        }        
        if (!AUTH.isEmpty()) {
            request.header("Authorization", AUTH);
        }
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        try {
            sw1.start();
            Response response = null;
            response = request.get(EndPoint); // only get for Orders
            Result = response.getStatusLine();
            status = response.getStatusCode();
            if (status != 200) {
                txtLog.append("Endpoint: " + EndPoint + "\r\n");
                txtLog.append("Result: " + status + " - " + Result + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());                
            }
            if (response.asString().startsWith("{") && response.asString().endsWith("}")) {
                json = new JSONObject(response.asString());
                if (json.has("error")) {
                    txtLog.append("Error: " + json.getString("error") + "\r\n");
                }
            }
        } catch (Exception ex) {
            txtLog.append("API Call Error: " + ex.getMessage().trim() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
    }
 
    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV1;
    private javax.swing.JTable DV_Brands;
    private javax.swing.JTable DV_Sites;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnOR_Brand;
    private javax.swing.JButton btnOR_Site;
    private javax.swing.JButton btnOR_User;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbDAYS;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblOrders;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
