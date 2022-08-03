package Station;

import com.google.common.base.Stopwatch;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//PROMO CODES (that work on Staging)
//boostper8 - 20%
//promo100-  100%
//promo100up2- 100%
//comsonetime- flat 5 dollars
//compassunlimited- 5 dollars  

/*  Prod
        cdltaut98
        b-boost
        t-thrive

    Production Site for BC 
    https://adminpanel.compassdigital.org/#/sites/Ym7By6oy1dTOBE5P880jTamr9022GqCD7BB2y1vOIlgk1B16Y7hzOGjMXNMoh1oQRojae9T8JqBXJ8llt9d/site/PpzmrEBrveH1kX3Zrk3ytzrrB0O1XpSk3m973O9Xcw46vkWyKPtl8JGR17m2TEoDLA2YAETGOo/
    

    Production :
    Frictionless site Boost : Compass Group Canada   >> Brand : Vending Machine
    Frictionless site Thrive : Compass group Canada. >> Brand : Avenue C

    Staging :
    Frictionless site Boost : Compass HQ >> Brand : test_brand
    Frictionless site Thrive : CDL Head Office  >> Brand : Avenue
*/   
public class Station extends javax.swing.JInternalFrame {
    List<String> Payment_Tokens_FP = new ArrayList<>();
    public Station() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSITES = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DV_Sites = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        DV_Brands = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        DV_MTS = new javax.swing.JTable();
        lblMenus = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        DV_Items = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        DV_Mods = new javax.swing.JTable();
        btnLog = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        DV_Menus = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        DV_DTS = new javax.swing.JTable();
        lblMTS = new javax.swing.JLabel();
        lblBTS = new javax.swing.JLabel();
        btnSave_Opt = new javax.swing.JButton();
        lblSITES13 = new javax.swing.JLabel();
        cmbEnv = new javax.swing.JComboBox<>();
        lblSITES14 = new javax.swing.JLabel();
        cmbApp = new javax.swing.JComboBox<>();
        lblSITES4 = new javax.swing.JLabel();
        txtMobile_ID = new javax.swing.JTextField();
        lblSITES6 = new javax.swing.JLabel();
        txtMobile_PW = new javax.swing.JTextField();
        lblSITES7 = new javax.swing.JLabel();
        lblBDOFF = new javax.swing.JLabel();
        btnDOrder = new javax.swing.JButton();
        btnPOrder = new javax.swing.JButton();
        cmbLoc = new javax.swing.JComboBox<>();
        txtMSG = new javax.swing.JTextField();
        lblSITES8 = new javax.swing.JLabel();
        btnSCart = new javax.swing.JButton();
        cmbPROMO = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Site > Station > Menu >>> loading, please wait ... ... ... ...");
        setMaximumSize(new java.awt.Dimension(850, 532));
        setMinimumSize(new java.awt.Dimension(850, 532));
        setName("Station"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setRequestFocusEnabled(false);
        setSize(new java.awt.Dimension(850, 532));
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
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
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
        });

        lblSITES.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblSITES.setText("Sites");
        lblSITES.setAlignmentX(0.5F);

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
        DV_Sites.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Sites.setName("DV_Sites"); // NOI18N
        DV_Sites.setRowHeight(18);
        DV_Sites.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_Sites.getTableHeader().setReorderingAllowed(false);
        DV_Sites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_SitesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(DV_Sites);

        DV_Brands.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Brands.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Brands.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Brands.setCellSelectionEnabled(true);
        DV_Brands.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Brands.setName("DV_Brands"); // NOI18N
        DV_Brands.setOpaque(false);
        DV_Brands.setRowHeight(18);
        DV_Brands.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_Brands.getTableHeader().setReorderingAllowed(false);
        DV_Brands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_BrandsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DV_Brands);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        DV_MTS.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_MTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_MTS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_MTS.setCellSelectionEnabled(true);
        DV_MTS.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_MTS.setName("DV_MTS"); // NOI18N
        DV_MTS.setRowHeight(18);
        DV_MTS.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(DV_MTS);

        lblMenus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMenus.setText("Click Brand to get Menu(s) ...");
        lblMenus.setAlignmentX(0.5F);

        DV_Items.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Items.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Items.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Items.setName("DV_Items"); // NOI18N
        DV_Items.setOpaque(false);
        DV_Items.setRowHeight(18);
        DV_Items.getTableHeader().setReorderingAllowed(false);
        DV_Items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_ItemsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(DV_Items);

        DV_Mods.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Mods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Mods.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Mods.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Mods.setName("DV_Mods"); // NOI18N
        DV_Mods.setOpaque(false);
        DV_Mods.setRowHeight(18);
        DV_Mods.getTableHeader().setReorderingAllowed(false);
        DV_Mods.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_ModsMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(DV_Mods);

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        DV_Menus.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Menus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Menus.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Menus.setCellSelectionEnabled(true);
        DV_Menus.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Menus.setName("DV_Menus"); // NOI18N
        DV_Menus.setOpaque(false);
        DV_Menus.setRowHeight(18);
        DV_Menus.getTableHeader().setReorderingAllowed(false);
        DV_Menus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_MenusMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(DV_Menus);

        DV_DTS.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_DTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_DTS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_DTS.setCellSelectionEnabled(true);
        DV_DTS.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_DTS.setName("DV_DTS"); // NOI18N
        DV_DTS.setRowHeight(18);
        DV_DTS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_DTS.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(DV_DTS);

        lblMTS.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblMTS.setText("Pickup TSlots");

        lblBTS.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblBTS.setText("Delivery TSlots");

        btnSave_Opt.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSave_Opt.setText("Save Setup");
        btnSave_Opt.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSave_Opt.setName("btnSAVE"); // NOI18N
        btnSave_Opt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSave_OptMouseClicked(evt);
            }
        });

        lblSITES13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES13.setText("Env:");
        lblSITES13.setAlignmentX(0.5F);

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        lblSITES14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSITES14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES14.setText("App:");
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

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES7.setText("Your custom text in Order 'PickupName'");
        lblSITES7.setAlignmentX(0.5F);

        lblBDOFF.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblBDOFF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBDOFF.setText("Drop Off Locations");
        lblBDOFF.setAlignmentX(0.5F);

        btnDOrder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDOrder.setText("Place Delivery Order");
        btnDOrder.setEnabled(false);
        btnDOrder.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnDOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDOrderMouseClicked(evt);
            }
        });

        btnPOrder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnPOrder.setText("Place Pickup Order");
        btnPOrder.setEnabled(false);
        btnPOrder.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnPOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOrderMouseClicked(evt);
            }
        });

        cmbLoc.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        txtMSG.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMSG.setText("JTT  > Station > Order");

        lblSITES8.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES8.setText("Promo Code");
        lblSITES8.setAlignmentX(0.5F);

        btnSCart.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnSCart.setText("Last Updated SCart");
        btnSCart.setEnabled(false);
        btnSCart.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnSCart.setName("btnSAVE"); // NOI18N
        btnSCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSCartMouseClicked(evt);
            }
        });

        cmbPROMO.setEditable(true);
        cmbPROMO.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        cmbPROMO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "compassunlimited", "boostper8", "promo100" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblSITES, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblBTS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMTS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblSITES4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES6)
                    .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSCart, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSITES8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPROMO, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBDOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblSITES7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSITES)
                    .addComponent(lblMenus)
                    .addComponent(lblBTS))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblMTS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSITES4)
                                .addGap(1, 1, 1)
                                .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(lblSITES6)
                                .addGap(2, 2, 2)
                                .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnSCart, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSITES8)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbPROMO, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(lblBDOFF)
                                        .addGap(0, 0, 0)
                                        .addComponent(cmbLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(btnDOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)
                                .addComponent(lblSITES7)
                                .addGap(0, 0, 0)
                                .addComponent(txtMSG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variables Declarations">
    protected boolean FLess = false;
    protected boolean SandG = false;
    protected double combined_tax_rate = 0.0;
    protected double gst_tax_rate = 0.0;
    protected double qst_tax_rate = 0.0;
    protected double pst_tax_rate = 0.0;
    protected double service_fee = 0.0;
    protected double delivery_fee = 0.0;    
    protected double promo_amount = 0.0;    
    protected double promo_amount_off = 0.0;  
    protected double total = 0.0; 
    protected double sub_total = 0.0;    
    protected double taxes = 0.0;
    protected String TAXES = "";    
    
    JSONArray JArray_MENUS;
    JSONArray JArray_CATS;
    JSONArray JArray_ITEMS; 
    
    private boolean Load;
    private boolean FAIL;
    
    protected String COUNTRY = "COUNTRY";
    protected String platform = "CDL";
    protected String BaseAPI;
    protected String PProvider = "";
  
    private int SitesLastRow = -1; 
    private int BrandLastRow = -1; 
    private int MenuLastRow = -1; 
    private int ItemLastRow = -1; 
    
    private boolean CONFIG = false;
    private String C = "";
    
    protected String AP3_TKN = "";
    protected String Mobile_User_ID = "";
    protected String Mobile_User_TKN = "";

    protected int T_Index;   
    protected Stopwatch sw1 = Stopwatch.createUnstarted();
    protected DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    protected final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    protected final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    protected String SQL = ""; 
    protected String url = "";
    protected String app = "";
    protected String appId = "";
    protected String env = "";
    protected String SITE = "";
    protected String SiteID = "";
    protected String GROUP = "";
    protected String BRAND = "";
    protected String BrandID = "";
    
    protected JSONObject json;
    protected JSONObject requestParams = null;
    protected String BODY = "";   
    //  "exact": {
    protected String exact_gateway_password = "~RSQzgwC";
    protected String exact_gateway_id = "AE7628-02";
    protected String exact_id = "APE3Ev9vQkfo2mmOpKP7fGJ48NKAPOugo0gdlWJqS3O";
    protected String exate_gateway_password = "";
    //  "freedompay": {
    protected String freedompay_id = "9PGDGvzvrKfJ366ZBz09h2e0pr13RMSA9wAmerk4C1gJ3v15mO";
    protected String freedompay_terminal_id = "2479168011";
    protected String freedompay_store_id = "1456207013";
    protected String FP_URL = ""; //https://cwallet.uat.freedompay.com"; // https://cwallet.freedompay.com
    
    protected String ShoppingCart_Delivery_ID = "";
    protected String Order_Delivery_ID = "";
    protected String ShoppingCart_Pickup_ID = "";
    protected String Order_Pickup_ID = "";
    protected String Requested_Date = "";
    
    protected String Auth = "";
    protected String EXACT_Payment_TKN = "";
    protected String FP_Payment_TKN = "";
    protected String Last_SCart_URL = "";
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="GUI Components Actions">        
    private void DV_SitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_SitesMouseClicked
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
           return;
        }
        SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
        COUNTRY = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));
        SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 4));

        Get_Site_Config();  // ================================      
        GetBrands();        // ================================
        
        SitesLastRow = DV_Sites.getSelectedRow();  
    }//GEN-LAST:event_DV_SitesMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        A.A.F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed

    private void DV_BrandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_BrandsMouseClicked
        if(DV_Brands.getRowCount() < 1){
            return;
        }
        if (BrandLastRow == DV_Brands.getSelectedRow()) {
           return;
        }
        BRAND = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 0));
        BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3));

        BrandLastRow = DV_Brands.getSelectedRow();  
        FLess  = Boolean.parseBoolean(String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 5))); 
        SandG  = Boolean.parseBoolean(String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 6))); 
        if(FLess) {
            btnPOrder.setText("Place FrLess Order");
        } else if(SandG) {
            btnPOrder.setText("Place SandG Order");
        } else {
            btnPOrder.setText("Place Pickup Order");
        }
     
        GetBrandDropOffLocations(); // ===================================
        GetMenus();                 // ===================================  
        Validate_Place_Order();
    }//GEN-LAST:event_DV_BrandsMouseClicked

    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked

    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        SAVE_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked

    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            LOAD_ENV();
            cmbEnv.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
        this.setTitle("Site > Station > Menu");
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void cmbAppItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppItemStateChanged
        if(!Load && evt.getStateChange() == 1) {
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
            app = cmbApp.getSelectedItem().toString();
            GetSites();
            cmbApp.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbAppItemStateChanged

    private void DV_ItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_ItemsMouseClicked
        if (ItemLastRow == DV_Items.getSelectedRow()) {
            return;
        } 
        GetMods(); // =================================== 
        ItemLastRow = DV_Items.getSelectedRow();              
    }//GEN-LAST:event_DV_ItemsMouseClicked

    private void DV_MenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_MenusMouseClicked
        if(DV_Menus.getRowCount() < 1){
            return;
        }
        if (MenuLastRow == DV_Menus.getSelectedRow()) {
           return;
        }   
        GetMenuTimeslots();
        GetDeliveryTimeslots();
        GetItems();
        MenuLastRow = DV_Menus.getSelectedRow();  
        Validate_Place_Order();        
    }//GEN-LAST:event_DV_MenusMouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Load_Form();
    }//GEN-LAST:event_formAncestorAdded

    private void btnPOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOrderMouseClicked
        if(btnPOrder.isEnabled()) {
            PLACE_ORDERS("P");
            txtLog.append("\r\n" + TAXES); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnPOrderMouseClicked

    private void btnDOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDOrderMouseClicked
        if(btnDOrder.isEnabled()) {
            PLACE_ORDERS("D");
            txtLog.append("\r\n" + TAXES); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }//GEN-LAST:event_btnDOrderMouseClicked

    private void DV_ModsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_ModsMouseClicked
        int index = DV_Mods.getSelectedRow();
        try{
            if(String.valueOf(DV_Mods.getValueAt(index, 0)).equals(" === ")){
                DV_Mods.getSelectionModel().removeSelectionInterval(index, index);
            }
        } catch (Exception ex){
            txtLog.append("DV_ModsMouseClicked ERROR: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());            
        }
    }//GEN-LAST:event_DV_ModsMouseClicked

    private void btnSCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSCartMouseClicked
        Print_SCart();
    }//GEN-LAST:event_btnSCartMouseClicked
    // </editor-fold>

    private void Load_Form(){
        Load = true;
        cmbApp.addItem("Boost");
        cmbApp.addItem("Canteen");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Nourish");
        cmbApp.addItem("Rogers");
        cmbApp.addItem("Tacit");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Development"); 
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");  
        
        cmbEnv.setSelectedIndex(1); // Staging
        cmbApp.setSelectedIndex(0); // Boost  

        Load = false;
        LOAD_ENV();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;   
        this.setTitle("Site > Station/Brand > Menu(s)");
    }
    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'Station' AND [env] = '" + env + "'";
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
        //String[] lines = C.split(System.getProperty("line.separator"));  
        String[] lines = C.split("\n");  
        String value;
        try {
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if (l.contains("env: ")) { env = value; }
                if (l.contains("app: ")) {  app = value; }
                if (l.contains("url: ")) {  url = value; }
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
            C = "";
            C += "env: " + env + "\r\n";
            C += "app: " + cmbApp.getSelectedItem().toString() + "\r\n";
            C += "url: " + url + "\r\n";
            
            C += "SITE: " + _S + "\r\n";
            C += "BRAND: " + _B + "\r\n";
            C += "COUNTRY: " + COUNTRY + "\r\n"; 
            C += "MOBILE_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "MOBILE_PW: " + txtMobile_PW.getText()  + "\r\n";
        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'Station' AND [env] = '" + env + "'";
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
            _insert.setString(4, "Station");
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

    private void LOAD_ENV(){
        if (cmbEnv.getSelectedItem().toString().contains("Staging")) {
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://staging.adminpanel.compassdigital.org/";
            FP_URL = "https://cwallet.uat.freedompay.com"; 
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")) {
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "https://dev.adminpanel.compassdigital.org/";
            FP_URL = "https://cwallet.uat.freedompay.com"; 
        } else {
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "https://adminpanel.compassdigital.org/";
            FP_URL = "https://cwallet.freedompay.com";
        }
        LOAD_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        Get_AP3_TKN();
        GetSites(); 
        txtMSG.setText(txtMobile_ID.getText() + " (JTT)");
    }
    private void Get_AP3_TKN() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM[dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            AP3_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    private void GetSites() {   
        SitesLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
              
        appId = A.Func.App_ID(cmbApp.getSelectedItem().toString(), env);

        String[] SitesColumnsName = {"Site","Platf","St","Country","Id"}; 
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
            Api_Call("GET", BaseAPI + "/location/multigroup/" + appId, "", "");
            String site;
            String country;
            String state;
            String id;
            JSONObject addresses;
            JSONObject meta;

            JSONArray Groups = json.getJSONArray("groups");
            for (int i = 0; i < Groups.length(); i++) {
                site = "";
                country = "null";
                state = "null";
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
                    if(addresses != null && addresses.has("state")){
                        state = addresses.getString("state");   
                    }
                    SitesModel.addRow(new Object[]{site, platform, state, country, id});                   
                }
            DV_Sites.setModel(SitesModel);
            DV_Sites.setDefaultEditor(Object.class, null);
            DV_Sites.getColumnModel().getColumn(0).setPreferredWidth(240);
            DV_Sites.getColumnModel().getColumn(1).setPreferredWidth(50);
            DV_Sites.getColumnModel().getColumn(2).setPreferredWidth(40);
            DV_Sites.getColumnModel().getColumn(3).setPreferredWidth(50);
            DV_Sites.getColumnModel().getColumn(4).setPreferredWidth(400);
            
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
            COUNTRY = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));
            SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 4));  
        }
        lblSITES.setText(app + " Sites (" + DV_Sites.getRowCount() + " found)");
        txtLog.append(app + " > " + DV_Sites.getRowCount() + " Site(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        cmbLoc.removeAllItems();
        Get_Site_Config();
        GetBrands(); 
        SitesLastRow = DV_Sites.getSelectedRow();
    }
    private void Get_Site_Config(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Get Site Config ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        Auth = "Bearer " + AP3_TKN; 
        Api_Call("GET", BaseAPI + "/config/" + SiteID, Auth, "");
        PProvider = "Neither FP nor EXACT";
        if (json != null) {
            try {
                JSONObject p = json.getJSONObject("payment");
                if (p.has("freedompay")) {
                    PProvider = "Freedompay";
                    freedompay_id = p.getJSONObject("freedompay").getString("id");
                    freedompay_terminal_id = p.getJSONObject("freedompay").getString("freedompay_terminal_id");
                    freedompay_store_id = p.getJSONObject("freedompay").getString("freedompay_store_id");
                } else if (p.has("exact")) {
                    PProvider = "Exact";
                    exact_gateway_password = p.getJSONObject("exact").getString("exact_gateway_password");
                    exact_gateway_id = p.getJSONObject("exact").getString("exact_gateway_id");
                    exact_id = p.getJSONObject("exact").getString("id");
                }
                txtLog.append("" + SITE + " > Payment Provider: " + PProvider + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } catch (Exception ex) {
                txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
                txtLog.setCaretPosition(txtLog.getDocument().getLength());    
            }
        }        
    }
    private void GetBrands() {
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
           return;
        }
        btnPOrder.setEnabled(false);
        btnDOrder.setEnabled(false);
        SitesLastRow = DV_Sites.getSelectedRow();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Brands ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String[] ColumnsName = {}; 
        DefaultTableModel Model = new DefaultTableModel();
        Model.setColumnIdentifiers(ColumnsName);
        DV_Menus.setModel(Model);
        DV_Items.setModel(Model);
        DV_Mods.setModel(Model);
        DV_DTS.setModel(Model);
        DV_MTS.setModel(Model);
        lblMenus.setText("Click Brand to get Menu(s) ...");              
     
        String[] BrandsColumnsName = {"Brand / Station","Location","menu_ids", "Brand Id", "Unit ID", "FLess", "SandG"}; 
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
            Api_Call("GET", BaseAPI + "/location/group/" + SiteID + "?extended=true&nocache=1", "", "");
            
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
                            if(br.has("is") && !br.getJSONObject("is").isNull("frictionless_supported")){
                                FLess =  br.getJSONObject("is").getBoolean("frictionless_supported");
                            }else{
                                FLess = false;
                            }
                            if(br.has("is") && !br.getJSONObject("is").isNull("scan_and_go_supported")){
                                SandG =  br.getJSONObject("is").getBoolean("scan_and_go_supported");
                            }else{
                                SandG = false;
                            }
                            BrandsModel.addRow(new Object[]{brand, location, menu_ids, id, unit_id, FLess, SandG});
                        }
                    }
                }
            }
            DV_Brands.setModel(BrandsModel);    
            DV_Brands.setDefaultEditor(Object.class, null);
            DV_Brands.getColumnModel().getColumn(0).setPreferredWidth(140);
            DV_Brands.getColumnModel().getColumn(1).setPreferredWidth(140);
            DV_Brands.getColumnModel().getColumn(2).setPreferredWidth(80);
            
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
//            GetBrandDropOffLocations(); // ============== comment to force only after Brand click / selection
//            GetDeliveryTimeslots();     // ============== comment to force only after Brand click / selection
//            GetMenus();                 // ============== comment to force only after Brand click / selection
        } else {
            BrandID = "null";
            txtLog.append("" + SITE + " > " + "0 Station(s) found" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }  
        BrandLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetBrandDropOffLocations(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Brand Drop Off Locations ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());      
        cmbLoc.removeAllItems();
        try {
            Api_Call("GET", BaseAPI + "/config/public/" + BrandID, "", "");

            if(json.has("delivery_destinations")) {
                JSONArray DESTINATIONS = json.getJSONArray("delivery_destinations");
                for (int i = 0; i < DESTINATIONS.length(); i++) {
                    cmbLoc.addItem(DESTINATIONS.getString(i));
                }
            }
        } catch (Exception ex) {
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }                     
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
    }
    
    private void GetMenus(){
        txtLog.append("\r\n- Load Menus ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String[] cName = {}; 
        DefaultTableModel M = new DefaultTableModel();
        M.setColumnIdentifiers(cName);
        DV_Items.setModel(M);
        DV_Mods.setModel(M);
        DV_MTS.setModel(M);
        String[] ColumnsName = {"Menu Label (en)", "Response", "Id"}; 
        DefaultTableModel Model = new DefaultTableModel();
        Model.setColumnIdentifiers(ColumnsName);
        DV_Menus.setModel(Model);
        
        String IDS = DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 2).toString(); // ================== col 2
        if(IDS.trim().isEmpty()){
            lblMenus.setText("Brand/Station " + BRAND + " > No Menus found");
            return;
        }
        Stopwatch sw2 = Stopwatch.createUnstarted();
        
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        String label = "<empty> 'en'";
        String resp;
        JArray_MENUS = new JSONArray();
        try {
            String[] Menu_IDs = IDS.split(",");
            for (String id : Menu_IDs) {
                if(sw2.isRunning()){
                    sw2.reset();
                }
                sw2.start();                
                Api_Call("GET", BaseAPI + "/menu/" + id, "", "");

                JArray_MENUS.put(json);
                resp = "OK " + String.format("%.2f", (double)(sw2.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec";
                if(json.has("label")){                    
                    if(json.getJSONObject("label").has("en")) {
                        label = json.getJSONObject("label").getString("en");
                        if(label.trim().equals("")) {
                            label = "label 'en' Empty";
                        }
                    }
                }else{
                    label = "label 'en' Not Found";
                }
                Model.addRow(new Object[]{label, resp, id});
                sw2.reset();
            }
        } catch (Exception ex) {
            txtLog.append("Error " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         

        DV_Menus.setModel(Model);    
        DV_Menus.setDefaultEditor(Object.class, null);
        DV_Menus.getColumnModel().getColumn(0).setPreferredWidth(140);
        DV_Menus.getColumnModel().getColumn(1).setPreferredWidth(140);
        DV_Menus.getColumnModel().getColumn(2).setPreferredWidth(80);
        DV_Menus.changeSelection(0, 0, false, false);

        
        lblMenus.setText("Brand/Station '" + BRAND + "' > " + DV_Menus.getRowCount() + " Menu(s) found");
        txtLog.append("=== Brand/Station '" + BRAND + "' > " + DV_Menus.getRowCount() + " Menu(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
     
        GetDeliveryTimeslots();        // ===================================
        GetMenuTimeslots();
        GetItems();
        Validate_Place_Order();
        MenuLastRow = 0;
    }
    private void GetDeliveryTimeslots(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Brand Timeslots ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        String MenuID = String.valueOf(DV_Menus.getValueAt(DV_Menus.getSelectedRow(), 2));
        
        String[] ColumnsName = {"Time", "epoch"}; 
        DefaultTableModel DTS_Model = new DefaultTableModel();
        DTS_Model.setColumnIdentifiers(ColumnsName);
        DV_DTS.setModel(DTS_Model);        
        try { 
            Api_Call("GET", BaseAPI + "/location/brand/" + BrandID + "/timeslots/delivery/menu/" + MenuID, "", "");
            if (json.has("timeslots")) {
                JSONArray timeslots = json.getJSONArray("timeslots");
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
                for (int i = 0; i < timeslots.length(); i++) {
                    JSONObject timeslot = timeslots.getJSONObject(i);
                    DTS_Model.addRow(new Object[]{sdf.format(new Date(timeslot.getLong("id")*1000)), timeslot.getLong("id")});
                }
            } 
            DV_DTS.setModel(DTS_Model); 
            DV_DTS.setDefaultEditor(Object.class, null);
            DV_DTS.getColumnModel().getColumn(0).setPreferredWidth(55);
            DV_DTS.getColumnModel().getColumn(1).sizeWidthToFit();

        } catch (Exception ex) {
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }         
 
        if(DV_DTS.getRowCount() > 0){
            DV_DTS.changeSelection(DV_DTS.getRowCount() - 1, 0, false, false);
        }        
        lblBTS.setText("Del Slots " + DV_DTS.getRowCount());     
        txtLog.append("=== Selected Brand > " + DV_DTS.getRowCount() + " Delivery Time Slots" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());         
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
    }
    private void GetMenuTimeslots(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("\r\n- Load Menu (Pickup) Timeslots ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String MenuID = String.valueOf(DV_Menus.getValueAt(DV_Menus.getSelectedRow(), 2));
        String[] BrandsColumnsName = {"Time", "epoch"}; 
        DefaultTableModel MTS_Model = new DefaultTableModel();
        MTS_Model.setColumnIdentifiers(BrandsColumnsName);
        DV_MTS.setModel(MTS_Model);        
        try {
            Api_Call("GET", BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID, "", "");
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            if (json.has("timeslots")) {
                JSONArray timeslots = json.getJSONArray("timeslots");
                for (int i = 0; i < timeslots.length(); i++) {
                    JSONObject timeslot = timeslots.getJSONObject(i);
                    MTS_Model.addRow(new Object[]{sdf.format(new Date(timeslot.getLong("id")*1000)), timeslot.getLong("id")});
                }
            }   
            DV_MTS.setModel(MTS_Model);  
            DV_MTS.setDefaultEditor(Object.class, null);
            DV_MTS.getColumnModel().getColumn(0).setPreferredWidth(55);
            DV_MTS.getColumnModel().getColumn(1).sizeWidthToFit();
            
            if(DV_MTS.getRowCount() > 0){
                DV_MTS.changeSelection(DV_MTS.getRowCount() - 1, 0, false, false);
            }     
        } catch (Exception ex) {
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());     
        }          
        lblMTS.setText("Menu Slots " + DV_MTS.getRowCount());    
        txtLog.append("=== Selected Menu > " + DV_MTS.getRowCount() + " Menu (Pickup) Time Slots" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 

        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void GetItems(){
        txtLog.append("\r\n- GetItems: " + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String hidden = "?";  
        String disabled = "?"; 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        int _Cat_Count = 0; 
        try {
            String c_name = "";
            String c_id = "?"; 
            String label = "";
            String price = "?";
            String id = "?";
            String Taxes = "";

            JArray_ITEMS = new JSONArray();
            String[] ColumnsNames = {"Category", "Item", "Price", "Qty", "hidden","disabled","item_id", "cat_id", "Taxes"}; 
            boolean[] isEditable = {false,false,false,true,false,false};
            DefaultTableModel Model = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row, int column){             
                    return isEditable[column]; // || column == 13 || column == 14; // make read only fields except column 0,13,14
                }
            };
            Model.setColumnIdentifiers(ColumnsNames);
            DV_Items.setModel(Model);
            
            TableColumn Qt = DV_Items.getColumnModel().getColumn(3);
            JComboBox<Integer> comboBox = new JComboBox<>();
            comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
            comboBox.setMaximumRowCount(10);
            comboBox.addItem(1);
            comboBox.addItem(2);
            comboBox.addItem(3);
            comboBox.addItem(4);
            comboBox.addItem(5);
            comboBox.addItem(6);
            comboBox.addItem(7);
            comboBox.addItem(8);
            comboBox.addItem(9);
            comboBox.addItem(10);
            Qt.setCellEditor(new DefaultCellEditor(comboBox));            
            
            JSONObject menu = (JSONObject) JArray_MENUS.get(DV_Menus.getSelectedRow());             
            if (menu.has("groups")) {
                JSONArray groups = menu.getJSONArray("groups");
                _Cat_Count = groups.length();
                for (Object g : groups) {
                    JSONObject gr = (JSONObject) g;
                    c_name = gr.getString("name");
                    if(gr.has("id")){
                        c_id = gr.getString("id");
                    }else{
                        c_id = "not found";
                    }           
                    if (gr.has("items")) {
                        JSONArray items = gr.getJSONArray("items");
                        for (Object item : items) {
                            JSONObject Item = (JSONObject) item;
                            JArray_ITEMS.put(new JSONObject(Item.toString())); 
                            if(Item.has("label")){                    
                               if(Item.getJSONObject("label").has("en")) {
                                   label = Item.getJSONObject("label").getString("en");
                                   if(label.trim().equals("")) {
                                       label = "label 'en' Empty";
                                   }
                               }
                            }else{
                                label = "label 'en' Not Found";
                            }                   
                            if(Item.has("is")){
                               JSONObject is =  Item.getJSONObject("is");
                               if(is.has("hidden") && is.getBoolean("hidden")){
                                   hidden = "true";
                               }else{
                                   hidden = "false";
                               }
                               if(is.has("disabled") && is.getBoolean("disabled")){
                                   disabled = "true";
                               }else{
                                   disabled = "false";
                               } 
                            }

                            if(Item.has("price") && Item.getJSONObject("price").has("amount")){
                                price = "$" + Item.getJSONObject("price").getNumber("amount").toString();
                            }else{
                                price = "Not Found";
                            } 
                            if(Item.has("id")){
                                id = Item.getString("id");
                            }else{
                                id = "not found";
                            }
                            Taxes = " ";
                            if(Item.has("meta") && Item.getJSONObject("meta").has("taxes")){
                               JSONArray taxes = Item.getJSONObject("meta").getJSONArray("taxes");
                               for (Object tax : taxes) {
                                   Taxes += tax.toString() + ", ";                                       
                               }
                           }                        
                            Model.addRow(new Object[]{c_name, label, price, "1", hidden, disabled, id, c_id, Taxes}); 
                        }   
                    }
                    DV_Items.setModel(Model);    
                    DV_Items.setDefaultEditor(Object.class, null);
                    DV_Items.getColumnModel().getColumn(0).setPreferredWidth(130);
                    DV_Items.getColumnModel().getColumn(1).setPreferredWidth(150);
                    DV_Items.getColumnModel().getColumn(2).setPreferredWidth(40);
                    DV_Items.getColumnModel().getColumn(3).setPreferredWidth(30);
                    DV_Items.getColumnModel().getColumn(4).setPreferredWidth(40);
                    DV_Items.getColumnModel().getColumn(5).setPreferredWidth(40);
                    DV_Items.getColumnModel().getColumn(6).setPreferredWidth(40);
                    DV_Items.getColumnModel().getColumn(7).setPreferredWidth(40);
                    DV_Items.getColumnModel().getColumn(8).setPreferredWidth(300);
                    DV_Items.changeSelection(0, 0, false, false);
                    MenuLastRow = 0;
                }
            }
        }
        catch(JSONException ex){
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("== Selected Menu > " + DV_Items.getRowCount() + " Items in " + _Cat_Count +  " Categories" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));        
        
        GetMods();
    }
    private void GetMods(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        int[] SelectedItems = DV_Items.getSelectedRows(); 
        txtLog.append("\r\n- GetMods for " + SelectedItems.length + " selected Item(s): " + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 

        int mGR = 0;
        int mIT = 0;
        try {
            String label = "";
            String price = "?";
            String id = "?";
            String GroupID = "?";
            String GroupName = "?";
            String TaxPrice = " ";
            String Taxes = " ";
            
            String[] ColumnsName = {"Item", "Modifier", "Price", "GroupName", "id", "GroupID", "TaxPrice", "Taxes"}; 
            DefaultTableModel Model = new DefaultTableModel();
            Model.setColumnIdentifiers(ColumnsName);
            DV_Mods.setModel(Model); 
            

            for(int i = 0; i < SelectedItems.length; i++ ){
                JSONObject item = (JSONObject) JArray_ITEMS.get(SelectedItems[i]);           
                if (item.has("options")) {
                    JSONArray options = item.getJSONArray("options");
                    for (Object ops : options) {
                        mGR++;
                        JSONObject oGroup = (JSONObject) ops;
                        if(oGroup.has("label")){                    
                           if(oGroup.getJSONObject("label").has("en")) {
                               GroupName = oGroup.getJSONObject("label").getString("en");
                               if(GroupName.trim().equals("")) {
                                   GroupName = "label 'en' Empty";
                               }
                           }
                        }else{
                            GroupName = "label 'en' Not Found";
                        } 

                        label = GroupName;
                        if(!GroupName.contains("min") && oGroup.has("min") && oGroup.has("max")){
                            label = label + " (min:" + oGroup.getNumber("min").toString() + ", max:" + oGroup.getNumber("max").toString() + ")";
                        }

                        if(oGroup.has("id")){
                            GroupID = oGroup.getString("id");
                        }else{
                            GroupID = "not found";
                        }
                        Model.addRow(new Object[]{" === ", label, " ", " ", " ", GroupID});  //==================== 

                        label = "?";
                        if (oGroup.has("items")) {
                            JSONArray Oitems = oGroup.getJSONArray("items");
                            for (Object Oitem : Oitems) {
                                mIT++;
                                JSONObject OItem = (JSONObject) Oitem;
                                if(OItem.has("label")){                    
                                    if(OItem.getJSONObject("label").has("en")) {
                                        label = OItem.getJSONObject("label").getString("en");
                                        if(label.trim().equals("")) {
                                            label = "label 'en' Empty";
                                        }
                                    }
                                }else{
                                    label = "label 'en' Not Found";
                                }                   

                                if(OItem.has("id")){
                                    id = OItem.getString("id");
                                }else{
                                    id = "not found";
                                }
                                if(OItem.has("price") && OItem.getJSONObject("price").has("amount")){
                                    price = "$" + OItem.getJSONObject("price").getNumber("amount").toString();
                                }else{
                                    price = "Not Found";
                                }
                                if(OItem.has("meta") && OItem.getJSONObject("meta").has("taxable_price") && OItem.getJSONObject("meta").getJSONObject("taxable_price").has("amount")){
                                    TaxPrice = "$" + OItem.getJSONObject("meta").getJSONObject("taxable_price").getNumber("amount").toString();
                                }else{
                                    TaxPrice = " ";
                                }
                                Taxes = " ";
                                if(OItem.has("meta") && OItem.getJSONObject("meta").has("taxes")){
                                    JSONArray taxes = OItem.getJSONObject("meta").getJSONArray("taxes");
                                    for (Object tax : taxes) {
                                        Taxes += tax.toString() + ", ";                                       
                                    }
                                }          
                                Model.addRow(new Object[]{item.getJSONObject("label").getString("en"), label, price, GroupName, id, GroupID, TaxPrice, Taxes});  
                            }
                        }
                    }
                }
            }
            DV_Mods.setModel(Model);    
            DV_Mods.setDefaultEditor(Object.class, null);
            DV_Mods.getColumnModel().getColumn(0).setPreferredWidth(140);
            DV_Mods.getColumnModel().getColumn(1).setPreferredWidth(160);
            DV_Mods.getColumnModel().getColumn(2).setPreferredWidth(40);
            DV_Mods.getColumnModel().getColumn(3).setPreferredWidth(120);
            DV_Mods.getColumnModel().getColumn(4).setPreferredWidth(40);
            DV_Mods.getColumnModel().getColumn(5).setPreferredWidth(50);  
            DV_Mods.getColumnModel().getColumn(6).setPreferredWidth(60);              
            DV_Mods.getColumnModel().getColumn(7).setPreferredWidth(300);  
        }
        catch(Exception ex){
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("== Selected Item(s) > " + mGR + " Mofifier Group(s), " + mIT + " total Mods" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    protected void Api_Call(String Method, String EndPoint, String AUTH, String BODY) {
        FAIL = false;
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
            switch (Method) {
                case "GET":
                    if (BODY.equals("Bolter")) {
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
                    response = request.options(EndPoint);
                    break;
                default:
                    break;
            }
            Result = response.getStatusLine();
            status = response.getStatusCode();
//            if (status != 200 && status != 201) {
                txtLog.append("Endpoint: " + EndPoint + "\r\n");
                txtLog.append("Result: " + status + " - " + Result + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());                
//            }
            if (response.asString().startsWith("{") && response.asString().endsWith("}")) {
                json = new JSONObject(response.asString());
                if (json.has("error")) {
                    txtLog.append("Error: " + json.getString("error") + "\r\n");
                }
            }
        } catch (Exception ex) {
            FAIL = true;
            txtLog.append("API Call Error: " + ex.getMessage().trim() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
    }
    
    private void Validate_Place_Order() {
        btnPOrder.setEnabled(false);
        btnDOrder.setEnabled(false);
        if(DV_Items.getSelectedRowCount() > 0 && DV_MTS.getSelectedRowCount() > 0){
            btnPOrder.setEnabled(true);
        }
        if(DV_Items.getSelectedRowCount() > 0 && DV_DTS.getSelectedRowCount() > 0){
            //btnPOrder.setEnabled(true);
            if(cmbLoc.getItemCount() > 0 && cmbLoc.getSelectedItem().toString().trim() != ""){
                btnDOrder.setEnabled(true);
            }
        }
    }

    private void PLACE_ORDERS(String TYPE){
        btnDOrder.setEnabled(false);
        btnPOrder.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        Get_Mobile_User_TKN();
        if(FAIL) {
            Validate_Place_Order();
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
            return;
        }
        Set_Requested_Date(TYPE);
        if(FAIL) {
            Validate_Place_Order();
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
            return;
        }
//        if(COUNTRY.toLowerCase().startsWith("c")){
//            if(TYPE.equals("P")){
//                New_Pickup_ShoppingCart(); 
//                if(FAIL) {
//                    Validate_Place_Order();
//                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                    return;
//                }
//                if(env.equals("PR")){
//                    txtLog.append("\r\n=== Place Order In Production not supported. Shopping Cart created." + "\r\n");
//                    txtLog.setCaretPosition(txtLog.getDocument().getLength());                     
//                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));  
//                    Validate_Place_Order();
//                    return;
//                }else{                 
//                    EXACT();
//                    if(FAIL) {
//                        Validate_Place_Order();
//                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                        return;
//                    }                
//                    Place_Update_Pickup_Order(EXACT_Payment_TKN);
//                    if(FAIL) {
//                        Validate_Place_Order();
//                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                        return;
//                    }
//                }
//            }
//            if(TYPE.equals("D")){
//                New_Delivery_ShoppingCart(); 
//                if(FAIL) {
//                    Validate_Place_Order();
//                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                    return;
//                }
//                if(env.equals("PR")){
//                    txtLog.append("\r\n=== Place Order In Production not supported. Shopping Cart created." + "\r\n");
//                    txtLog.setCaretPosition(txtLog.getDocument().getLength());                     
//                    Validate_Place_Order();
//                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                    return;
//                }else{                
//                    EXACT();
//                    if(FAIL) {
//                        Validate_Place_Order();
//                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                        return;
//                    }                
//                    Place_Update_Delivery_Order(EXACT_Payment_TKN);
//                    if(FAIL) {
//                        Validate_Place_Order();
//                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
//                        return;
//                    }
//                }
//            }            
//        }
//        if(COUNTRY.toLowerCase().startsWith("u")){
            if(TYPE.equals("P")){
                New_Pickup_ShoppingCart();  
                if(FAIL) {
                    Validate_Place_Order();
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                    return;
                }
                if(env.equals("PR")){
                    txtLog.append("\r\n=== Place Order In Production is Not Supported. \r\n=== Shopping Cart created." + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                    Validate_Place_Order();
                    return;
                }else{                
                    FP();
                    if(FAIL) {
                        Validate_Place_Order();
                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                        return;
                    }                
                    Place_Update_Pickup_Order(FP_Payment_TKN);
                    if(FAIL) {
                        Validate_Place_Order();
                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                        return;
                    }
                }
            }
            if(TYPE.equals("D")){
                New_Delivery_ShoppingCart();   
                if(FAIL) {
                    Validate_Place_Order();
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                    return;
                }
                if(env.equals("PR")){
                    txtLog.append("\r\n=== Place Order In Production not supported. Shopping Cart created." + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());                    
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                    Validate_Place_Order();
                    return;
                }else{
                    FP();
                    if(FAIL) {
                        Validate_Place_Order();
                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                        return;
                    }                   
                    Place_Update_Delivery_Order(FP_Payment_TKN);
                    if(FAIL) {
                        Validate_Place_Order();
                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
                        return;
                    }
                }
            } 
        //}
        Validate_Place_Order();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
    } 
    
    private void Get_Mobile_User_TKN(){
        FAIL = false;
        txtLog.append("\r\n- Moblibe User Authentication.." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String J = "==== User API(s):" + "\r\n";
        Mobile_User_ID = "";
        Mobile_User_TKN = "";
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = A.Func.Realm_ID(cmbApp.getSelectedItem().toString(), env);  

       
        try {     // ============ Mobile User Authentication =====================================
            Api_Call("GET", BaseAPI + "/user/auth" + "?realm=" + Realm, "Basic " + UserAuth, "");
            J += BaseAPI + "/user/auth?realm=" + Realm + "\r\n" + json.toString(4);
            Mobile_User_ID = json.getString("user");
            Mobile_User_TKN = json.getString("token");
            txtLog.append("== " + BaseAPI + "/user/auth?realm="  + Realm + " > " + "\r\n");
            txtLog.append("== " + "UserID: "  + Mobile_User_ID + "\r\n");
            txtLog.append("== " + "UserTKN: "  + Mobile_User_TKN + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            FAIL = true;
            txtLog.append(" > " + J + "\r\n"); 
            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }

//        try {     // ============ Mobile User Change Location =====================================
//            Auth = "Bearer " + Mobile_User_TKN;
//            BODY = "{\"meta\": {\"last_location\":\"" + SiteID + "\"}}"; 
//            Api_Call("PUT", BaseAPI + "/user/" + Mobile_User_ID + "?lang=en", Auth, BODY);
//            if(json != null){
//                txtLog.append("== " + BaseAPI + "/user/" + Mobile_User_ID + "?lang=en" + "\r\n");
//                txtLog.setCaretPosition(txtLog.getDocument().getLength());
//            }    
//        } catch (Exception ex) {
//            FAIL = true;
//            txtLog.append(" > " + J + "\r\n"); 
//            txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
//            txtLog.setCaretPosition(txtLog.getDocument().getLength());
//        }     
    }                                    

    private void New_Pickup_ShoppingCart(){
        FAIL = false;
        btnSCart.setEnabled(false);
        txtLog.append("\r\n- " + "New Shopping Cart ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String type = "pickup";
        if(FLess)  {                           
            type = "pickup";
        } else if(SandG) {
            type = "scan_and_go";
        }
        Auth = "Bearer " + Mobile_User_TKN; 
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"" + type + "\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + DV_Menus.getValueAt(DV_Menus.getSelectedRow(), 2).toString() + "\"," +  
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        Api_Call("POST", BaseAPI + "/shoppingcart", Auth, BODY);
        if(json != null){
            try {
                ShoppingCart_Pickup_ID = json.getString("id");
                txtLog.append("== " + "New SCart (POST) ID:  \r\n" + BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex){
                FAIL = true;
                txtLog.append("== " + "New SCart ERROR: "  + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
                return;
            }
        } 
        Last_SCart_URL = BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID;
        txtLog.append("\r\n- " + "Add Menu Item(s) to Shopping Cart ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        

        String ModGroup = "";
        int[] SelectedMods = DV_Mods.getSelectedRows();
        int[] SelectedItems = DV_Items.getSelectedRows();
        JSONArray jItems = new JSONArray();
        JSONObject jItem = null;

        try{
            for(int Item_Index = 0; Item_Index < SelectedItems.length; Item_Index++){
                JSONArray jOptions = new JSONArray();
                jItem = new JSONObject();  
                jItem.put("id", DV_Items.getValueAt(SelectedItems[Item_Index],6).toString());
                int q = Integer.parseInt(DV_Items.getValueAt(SelectedItems[Item_Index],3).toString());
                jItem.put("quantity", q);

                if(SelectedMods.length > 0){
                    for(int Mod_Index = 0; Mod_Index < SelectedMods.length; Mod_Index++){
                        if(DV_Items.getValueAt(SelectedItems[Item_Index],1).equals(DV_Mods.getValueAt(SelectedMods[Mod_Index],0))){
                            JSONObject jOption = new JSONObject(); 
                            JSONArray jOptItems = new JSONArray();
                            JSONObject jOptionItem = new JSONObject();                                
                                jOptionItem.put("id", DV_Mods.getValueAt(SelectedMods[Mod_Index],4).toString());
                                jOptItems.put(jOptionItem);
                            JSONObject label = new JSONObject();
                                label.putOpt("en", DV_Mods.getValueAt(SelectedMods[Mod_Index],3).toString());
                                jOption.put("label", label);
                                jOption.put("items", jOptItems);
                            jOptions.put(jOption);
                        }                               
                    }                                   
                    jItem.put("options", jOptions);                    
                }
                jItems.put(jItem);            
            }
            JSONObject ITEMS = new JSONObject();
            ITEMS.put("items", jItems);
            BODY = ITEMS.toString(); 
        } catch (Exception ex){
            FAIL = true;
            txtLog.append("== " + "Json ERROR: "  + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            return;
        }
        Api_Call("PUT", BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID, Auth, BODY);
        if(json != null){
            try{
                ShoppingCart_Pickup_ID = json.getString("id");
                txtLog.append("== " + "Updated Shopping Cart: \r\n"  + BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex){
                FAIL = true;
                txtLog.append("== " + "Update SCart ERROR: "  + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
                return;
            }
        }  
        
        if(!cmbPROMO.getSelectedItem().toString().isEmpty() && !cmbPROMO.getSelectedItem().toString().toLowerCase().equals("none")){   
            txtLog.append("\r\n- " + "Add Promo " + cmbPROMO.getSelectedItem().toString() + " to Shopping Cart ...." + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            JSONObject requestParams = new JSONObject(); 
            requestParams.put("code", cmbPROMO.getSelectedItem().toString());
            //requestParams.put("email", Mobile_User_ID);
            requestParams.put("email", txtMobile_ID.getText().trim());
            BODY = requestParams.toString();
            Api_Call("PUT", BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID + "/promo", Auth, BODY);        
            if(json != null){
                try{
                    ShoppingCart_Delivery_ID = json.getString("id");
                    txtLog.append("== " + "Apply Promo (PUT) > Updated SCart: \r\n" + BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                } catch (Exception ex){
                    FAIL = true;
                    txtLog.append("== " + "Update SCart ERROR: "  + ex.getMessage() + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                }
            }        
        } 
        Last_SCart_URL = BaseAPI + "/shoppingcart/" + ShoppingCart_Pickup_ID;
        btnSCart.setEnabled(true);
        Report_Tax();
    }
    private void New_Delivery_ShoppingCart(){
        FAIL = false;
        btnSCart.setEnabled(false);
        txtLog.append("\r\n- " + "New Delivery Shopping Cart ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());

        Auth = "Bearer " + Mobile_User_TKN;
        
        BODY = "{\"brand\":\"" + BrandID + "\"," +
            "\"is\":{\"type\":\"delivery\"}," +
            "\"mealSwipeTotal\":0.0," +
            "\"menu\":\"" + DV_Menus.getValueAt(DV_Menus.getSelectedRow(), 2).toString() + "\"," +   
            "\"showSingleTimeSlot\":false," +
            "\"type\":0," +
            "\"typeOfCell\":0}";
        Api_Call("POST", BaseAPI + "/shoppingcart", Auth, BODY);
        if(json != null){
            try {
                ShoppingCart_Delivery_ID = json.getString("id");
                txtLog.append("== " + "New SCart (POST) ID: \r\n" + BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex){
                FAIL = true;
                txtLog.append("== " + "New SCart ERROR: "  + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
                return;
            }
        } 
        Last_SCart_URL = BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID;
        txtLog.append("\r\n- " + "Add Menu Item(s) to Delivery Shopping Cart ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        
        String ModGroup = "";
        int[] SelectedMods = DV_Mods.getSelectedRows();
        int[] SelectedItems = DV_Items.getSelectedRows();
        JSONArray jItems = new JSONArray();
        JSONObject jItem = null;
        
        try{
            for(int Item_Index = 0; Item_Index < SelectedItems.length; Item_Index++){
                JSONArray jOptions = new JSONArray();
                jItem = new JSONObject();  
                jItem.put("id", DV_Items.getValueAt(SelectedItems[Item_Index],6).toString());
                int q = Integer.parseInt(DV_Items.getValueAt(SelectedItems[Item_Index],3).toString());
                jItem.put("quantity", q);

                if(SelectedMods.length >0){
                    for(int Mod_Index = 0; Mod_Index < SelectedMods.length; Mod_Index++){
                        if(DV_Items.getValueAt(SelectedItems[Item_Index],1).equals(DV_Mods.getValueAt(SelectedMods[Mod_Index],0))){
                            JSONObject jOption = new JSONObject(); 
                            JSONArray jOptItems = new JSONArray();
                            JSONObject jOptionItem = new JSONObject();                                
                                jOptionItem.put("id", DV_Mods.getValueAt(SelectedMods[Mod_Index],4).toString());
                                jOptItems.put(jOptionItem);
                            JSONObject label = new JSONObject();
                                label.putOpt("en", DV_Mods.getValueAt(SelectedMods[Mod_Index],3).toString());
                                jOption.put("label", label);
                                jOption.put("items", jOptItems);
                            jOptions.put(jOption);
                        }                               
                    }                                   
                    jItem.put("options", jOptions);                    
                }
                jItems.put(jItem);            
            }
            JSONObject ITEMS = new JSONObject();
            ITEMS.put("items", jItems);
            BODY = ITEMS.toString();  
        } catch (Exception ex){
            FAIL = true;
            txtLog.append("== " + "Json ERROR: "  + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            return;
        }        
        Api_Call("PUT", BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID, Auth, BODY);
        if(json != null){
            try{
                ShoppingCart_Delivery_ID = json.getString("id");
                txtLog.append("== " + "Add Item {PUT) > Updated SCart \r\n" + BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex){
                FAIL = true;
                txtLog.append("== " + "Update SCart ERROR: "  + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
                return;
            }
        } 
        
        if(!cmbPROMO.getSelectedItem().toString().isEmpty() && !cmbPROMO.getSelectedItem().toString().toLowerCase().equals("none")){   
            txtLog.append("\r\n- " + "Add Promo " + cmbPROMO.getSelectedItem().toString() + " to Delivery Shopping Cart ...." + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            JSONObject requestParams = new JSONObject(); 
            requestParams.put("code", cmbPROMO.getSelectedItem().toString());
            //requestParams.put("email", Mobile_User_ID);
            requestParams.put("email", txtMobile_ID.getText().trim());
            BODY = requestParams.toString();
            Api_Call("PUT", BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID + "/promo", Auth, BODY);        
            if(json != null){
                try{
                    ShoppingCart_Delivery_ID = json.getString("id");
                    txtLog.append("== " + "Apply Promo (PUT) > Updated SCart ID: "  + ShoppingCart_Delivery_ID + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                } catch (Exception ex){
                    FAIL = true;
                    txtLog.append("== " + "Update SCart ERROR: "  + ex.getMessage() + "\r\n");
                    txtLog.setCaretPosition(txtLog.getDocument().getLength());
                    return;
                }
            }        
        }   
        Last_SCart_URL = BaseAPI + "/shoppingcart/" + ShoppingCart_Delivery_ID;
        btnSCart.setEnabled(true);
        Report_Tax();
    }

    private void Report_Tax(){
        try { 
            String TAX_RATES = "";
            TAXES = "";
            if(json.getJSONObject("taxes").has("breakdown")){
                combined_tax_rate = json.getJSONObject("taxes").getJSONObject("breakdown").getDouble("combined_tax_rate");
                if(COUNTRY.toLowerCase().startsWith("c")){
                    gst_tax_rate = json.getJSONObject("taxes").getJSONObject("breakdown").getDouble("gst_tax_rate");
                    qst_tax_rate = json.getJSONObject("taxes").getJSONObject("breakdown").getDouble("qst_tax_rate");
                    pst_tax_rate = json.getJSONObject("taxes").getJSONObject("breakdown").getDouble("pst_tax_rate");
                    TAX_RATES = "Rates > Combined " + combined_tax_rate + ", PST " + pst_tax_rate + ", GST " + gst_tax_rate + ", QST " + qst_tax_rate;
                }else{
                    TAX_RATES = "US Combined Tax Rate: " + combined_tax_rate;
                }
            }else if(json.getJSONObject("taxes").has("rate")){
                TAX_RATES = "Tax Rate > " + json.getJSONObject("taxes").getDouble("rate") + " (no 'breakdown')";
            }else{
                TAX_RATES = "Tax Rates > no 'rate', no 'breakdown'";
            }
            service_fee = json.getJSONObject("service_fee").getDouble("amount");
            delivery_fee = json.getJSONObject("delivery_fee").getDouble("amount");
            total = json.getJSONObject("total").getDouble("amount");  
            if(json.has("promo")){
                if(json.getJSONObject("promo").has("amount")){
                    promo_amount = json.getJSONObject("promo").getDouble("amount");  
                } 
            }
            sub_total = json.getJSONObject("sub_total").getDouble("amount");  
            taxes = json.getJSONObject("taxes").getDouble("amount");
                      
            TAXES += TAX_RATES + "\r\n" +
                "Discount: " + promo_amount + ", Serv Fee: " + service_fee + ", Del Fee: " + delivery_fee + "\r\n" +
                "Subtotal: " + sub_total + ", Tax: " + taxes +  ", Total: " + total;
        } catch (Exception ex) {
            TAXES = "Report_Tax Error: " + ex.getMessage();
            txtLog.append("\r\n- Report_Tax Error: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }
    private void Print_SCart() {
        if(btnSCart.isEnabled()){
            txtLog.append("\r\n- " + "Print Last Update Shopping Cart ...." + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());            
            Api_Call("GET", Last_SCart_URL, "", "");
            String R = A.Func.SHOW_FILE(Last_SCart_URL + "\r\n\r\n" + json.toString(4), "json");
        }
    }  
    private void Set_Requested_Date(String TYPE){
        FAIL = false;
        Long TimeSlot = 0L;
        try{
            if(TYPE.equals("D")){
                TimeSlot = Long.parseLong(DV_DTS.getValueAt(DV_DTS.getSelectedRow(), 1).toString());            
                txtLog.append("\r\n- " + "Set Order Requested date from Delivery Timeslot...." + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
            if(TYPE.equals("P")){
                TimeSlot = Long.parseLong(DV_MTS.getValueAt(DV_MTS.getSelectedRow(), 1).toString());            
                txtLog.append("\r\n- " + "Set Order Requested date from Menu (Pickup) Timeslot...." + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date requested_date = new Date(TimeSlot *1000L);
            Requested_Date = sdf.format(requested_date);
            
            txtLog.append("== " + "Requested UTC Date: " + Requested_Date + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        } catch (Exception ex){
            FAIL = true;
            txtLog.append("== " + "Requested Date ERROR: "  + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
    }

    private void Delete_User_Payments(){
        txtLog.append("\r\n- Delete_Payments..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        List<String> Payment_Methods_IDS = new ArrayList<>();
        Auth = "Bearer " + Mobile_User_TKN;
        Api_Call("GET", BaseAPI + "/payment/method" + "?user_id=" + Mobile_User_ID, Auth, "");
        if (json != null) {
            try {
                if (json.has("payment_methods")) {
                    JSONArray payment_methods = json.getJSONArray("payment_methods");
                    for (int i = 0; i < payment_methods.length(); i++) {
                        JSONObject p = payment_methods.getJSONObject(i);
                        Payment_Methods_IDS.add(p.getString("token"));
                    }
                }

            } catch (Exception ex) {
                txtLog.append("\r\n- Exception: " + ex.getMessage() + "\r\n"); 
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
        }
        txtLog.append("Mobile User Payments: " + Payment_Methods_IDS.size() + " found" + "\r\n"); 
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
                
        BODY = "{\"user\":\"" + Mobile_User_ID + "\"}";
        for (int i = 0; i < Payment_Methods_IDS.size(); i++) {            
//            JOB_Api_Call("Mobile User Delete Payment Method " + (Item_Index + 1), "DELETE",
//                    BaseAPI + "/payment/" + exact_id + "/method/" + Payment_Methods_IDS.get(Item_Index), Auth, BODY, 200, ParentTest, "no_jira");
        }
    }
    private void EXACT(){
        FAIL = false;
        txtLog.append("\r\n- Exact API(s)..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        
        EXACT_Payment_TKN = "";
        Auth = "Bearer " + Mobile_User_TKN;
        JSONObject requestParams = new JSONObject();
        requestParams.put("cardholder_name", "JTT API Automation");
        requestParams.put("cc_expiry", "1224");
        requestParams.put("cc_number", "5555555555554444"); // Mastercard
        requestParams.put("cc_verification_str2", "123");
        requestParams.put("postal_code", "L3L3C4");
        JSONObject options = new JSONObject();
        options.put("exact_gateway_id", exact_gateway_id);
        options.put("exact_gateway_password", exact_gateway_password);
        requestParams.put("options", options);
        BODY = requestParams.toString();

        Api_Call("POST", BaseAPI + "/payment/" + exact_id + "/paymenttoken", Auth, BODY);
        if (json != null && json.has("token")) {
            try {
                EXACT_Payment_TKN = json.getString("token");
            } catch (Exception ex) {
                FAIL = true;
                String AAAA = ex.getMessage();
            }
        }
        txtLog.append("=== EXACT_Payment_TKN: " + EXACT_Payment_TKN + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
    }
    private void FP(){
        FAIL = false;
        txtLog.append("\r\n- Freedompay API(s)..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        FP_Payment_TKN = "";
        String Access_TKN = "";
        
        Auth = "Bearer " + Mobile_User_TKN;
        Api_Call("GET", BaseAPI + "/payment/" + freedompay_id + "/clienttoken", Auth, "");
        if (json != null && json.has("access_token")) {
            try {
                Access_TKN = json.getString("access_token");
            } catch (Exception ex) {
                FAIL = true;
                txtLog.append("FP_Client_TKN Error: " + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
                return;
            }
        }
// =========================
        Auth = "Bearer " + Access_TKN;
        Api_Call("GET", FP_URL + "/TokenService/api/consumers/tokens", Auth, "");
        if (json != null) {
            String AAA = json.toString(4);
            try {
                if (json.has("data")) {
                    JSONArray tokens = json.getJSONArray("data");
                    for (int i = 0; i < tokens.length(); i++) {
                        JSONObject p = tokens.getJSONObject(i);
                        Payment_Tokens_FP.add(p.getString("token"));
                    }
                }
            } catch (Exception ex) {
                AAA = ex.getMessage();
            }
        }       

        for (int i = 0; i < Payment_Tokens_FP.size(); i++) {
            Api_Call("DELETE", FP_URL + "/TokenService/api/consumers/tokens/" + Payment_Tokens_FP.get(i), Auth, "");
        } 
// ==========================
        
        Auth = "Bearer " + Access_TKN;
        requestParams = new JSONObject();
        requestParams.put("nameOnCard", "JTT API Automation");
        requestParams.put("cardNumber", "4111111111111111"); // Visa
        requestParams.put("CVV", "123");
        requestParams.put("avsVerificationRequired", true);
        requestParams.put("cvvVerificationRequired", true);
        JSONObject billingAddress = new JSONObject();
            billingAddress.put("postalCode", "L3L3C4");
        requestParams.put("billingAddress", billingAddress); 
        requestParams.put("isPreferred", true);
        requestParams.put("expiryMonth", 12);
        requestParams.put("expiryYear", 2024);

        BODY = requestParams.toString();
        Api_Call("POST", FP_URL + "/TokenService/api/consumers/tokens", Auth, BODY);
        if (json != null) {
            try {
                FP_Payment_TKN = json.getString("token");
                txtLog.append("=== FP_Payment_TKN: " + FP_Payment_TKN + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex) {
                FAIL = true;
                txtLog.append("FP_Payment_TKN Error: " + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
        }
    }

    private void Place_Update_Delivery_Order(String Payment_TKN){
        FAIL = false;
        txtLog.append("\r\n- " + "Place Delivery Order ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        Auth = "Bearer " + Mobile_User_TKN;

        BODY = "{" +                                                //  Mobile User Place Delivery Order  =================
                "\"location_brand\":\"" + BrandID + "\"," + 
                "\"customer\":\"" + Mobile_User_ID + "\"," +  
                "\"details\":" +                                   
                    "{\"contact_number\":\"4165551234\"," +
                    "\"destination\":\"" + cmbLoc.getSelectedItem().toString() + "\"," +
                    "\"duration\":\"" + "00:05:00" + "\"," +
                    "\"instructions\":\"" + "Discard this Order" + "\"," +
                    "\"name\":\"" + txtMSG.getText() + "\"," +
                    "\"order_type\":\"delivery\"}," + 
                "\"payment\":" + 
                    "{\"token\":\"" + Payment_TKN + "\"}," +
                "\"requested_date\":\"" + Requested_Date + "\"," +
                "\"shoppingcart\":\"" + ShoppingCart_Delivery_ID + 
                "\"}";        
        Api_Call("POST",  BaseAPI + "/order", Auth, BODY);
        if(json != null && json.has("id")){
            Order_Delivery_ID = json.getString("id");
            txtLog.append("== " + "New Delivery Order ID: "  + Order_Delivery_ID + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } else{
            FAIL = true;
            return;
        } 
  
        try {
            Thread.sleep(2000);    // maybe to fast to update right after creation >>  Could not send push notifications       
        } catch (Exception e) {
        }
           

        txtLog.append("\r\n- " + "Update Delivery Order > 'Ready' ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        Auth = "Bearer " + AP3_TKN;
        requestParams = new JSONObject();   //  Update Delivery Order > Status and requested_date =================
        
        ZoneOffset offset = OffsetDateTime.now(ZoneId.of(TimeZone.getDefault().getID())).getOffset();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = new Date();
        date.setTime(date.getTime() + 20000); // now + 20 sec
        String requested_date = dateFormat.format(date);

        JSONObject is = new JSONObject(); 
        is.put("in_progress", true);
        is.put("ready", true);     
        requestParams.put("is", is); 
        requestParams.put("requested_date", requested_date); 
        
        BODY = requestParams.toString();
        Api_Call("PATCH",  BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY); 
//        if(json != null){
//            try {
//                Order_Delivery_ID = json.getString("id");
//                txtLog.append("== " + "Updated Delivery Order ID: "  + Order_Delivery_ID + "\r\n");
//                txtLog.setCaretPosition(txtLog.getDocument().getLength());
//            } catch (Exception ex){
//                FAIL = true;
//                txtLog.append("== " + "Update Delivery Order ERROR: "  + ex.getMessage() + "\r\n");
//                txtLog.setCaretPosition(txtLog.getDocument().getLength());
//            }
//        }   
    }
    private void Place_Update_Pickup_Order(String Payment_TKN){
        FAIL = false;
        txtLog.append("\r\n- " + "Place Order ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        
        Auth = "Bearer " + Mobile_User_TKN;  
        if(FLess)  {                           
            requestParams = new JSONObject();       //  Mobile User Place Frictionless Order  =================
            requestParams.put("location_brand", BrandID);
            requestParams.put("customer", Mobile_User_ID);
            requestParams.put("pickup_name", txtMSG.getText());
            requestParams.put("pickup", Requested_Date);
            requestParams.put("requested_date", Requested_Date);
            requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
            JSONObject payment = new JSONObject();
            payment.put("token", Payment_TKN);
            requestParams.put("payment", payment); 

            JSONObject meta = new JSONObject();
            meta.put("checkin_uuid", UUID.randomUUID().toString().replace("-", ""));
            requestParams.put("meta", meta);

            JSONObject details = new JSONObject();
            details.put("name", "JTT Frictionless");
            details.put("order_type", "frictionless"); //  "order_type": "scan_and_go",     "scan_and_go_supported": true,
            //details.put("destination", cmbLoc.getSelectedItem().toString());
            requestParams.put("details", details); 
        } else if(SandG) {
            requestParams = new JSONObject();       //  Mobile User Place Scan and Go Order  =================
            requestParams.put("location_brand", BrandID);
            requestParams.put("customer", Mobile_User_ID);
            requestParams.put("pickup_name", txtMSG.getText());
            requestParams.put("pickup", Requested_Date);
            requestParams.put("requested_date", Requested_Date);
            requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
            JSONObject payment = new JSONObject();
            payment.put("token", Payment_TKN);
            requestParams.put("payment", payment); 

            JSONObject details = new JSONObject();
            details.put("name", "JTT Scan&Go");
            details.put("order_type", "scan_and_go"); //  "order_type": "scan_and_go",     "scan_and_go_supported": true,
            //details.put("destination", cmbLoc.getSelectedItem().toString());
            requestParams.put("details", details); 
        } else {
            requestParams = new JSONObject();       //  Mobile User Place Pickup Order  =================
            requestParams.put("location_brand", BrandID);
            requestParams.put("customer", Mobile_User_ID);
            requestParams.put("pickup_name", txtMSG.getText());
            requestParams.put("pickup", Requested_Date);
            requestParams.put("requested_date", Requested_Date);
            requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
            JSONObject payment = new JSONObject();
            payment.put("token", Payment_TKN);
            requestParams.put("payment", payment); 

            JSONObject details = new JSONObject();
            details.put("order_type", "pickup");
            requestParams.put("details", details); 
        }
        BODY = requestParams.toString();  
     
        Api_Call("POST",  BaseAPI + "/order", Auth, BODY);
        if(json != null && json.has("id")){
            Order_Pickup_ID = json.getString("id");
            txtLog.append("== " + "New Order ID: "  + Order_Pickup_ID + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }else{
            FAIL = true; 
            return;
        }        
        if(FLess || SandG)  { 
            return; // Skip Update status for Frictionless ???
        }
        txtLog.append("\r\n- " + "Update Order > 'Ready' ...." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        Auth = "Bearer " + AP3_TKN;
        requestParams = new JSONObject();   //  Update Order  =================
        JSONObject is = new JSONObject();      
        is.put("in_progress", true);
        is.put("ready", true);     
        requestParams.put("is", is); 
        BODY = requestParams.toString();
        Api_Call("PATCH",  BaseAPI + "/order/" + Order_Pickup_ID, Auth, BODY);        
        if(json != null){
            try {
                Order_Pickup_ID = json.getString("id");
                txtLog.append("== " + "Updated Order ID: "  + Order_Pickup_ID + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            } catch (Exception ex){
                FAIL = true;
                txtLog.append("== " + "Update Order ERROR: "  + ex.getMessage() + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength());
            }
        }   
    }

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV_Brands;
    private javax.swing.JTable DV_DTS;
    private javax.swing.JTable DV_Items;
    private javax.swing.JTable DV_MTS;
    private javax.swing.JTable DV_Menus;
    private javax.swing.JTable DV_Mods;
    private javax.swing.JTable DV_Sites;
    private javax.swing.JButton btnDOrder;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnPOrder;
    private javax.swing.JButton btnSCart;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JComboBox<String> cmbLoc;
    private javax.swing.JComboBox<String> cmbPROMO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblBDOFF;
    private javax.swing.JLabel lblBTS;
    private javax.swing.JLabel lblMTS;
    private javax.swing.JLabel lblMenus;
    private javax.swing.JLabel lblSITES;
    private javax.swing.JLabel lblSITES13;
    private javax.swing.JLabel lblSITES14;
    private javax.swing.JLabel lblSITES4;
    private javax.swing.JLabel lblSITES6;
    private javax.swing.JLabel lblSITES7;
    private javax.swing.JLabel lblSITES8;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMSG;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
