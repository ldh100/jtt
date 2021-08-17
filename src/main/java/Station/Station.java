/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Station;

import static A.A.*;
import A.Func;
import com.google.common.base.Stopwatch;
import java.awt.Cursor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultListModel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
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
/**
 *
 * @author Oleg.Spozito
 */
public class Station extends javax.swing.JInternalFrame {

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
        jScrollPane5 = new javax.swing.JScrollPane();
        DV_Categories = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        DV_Items = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        DV_Mods = new javax.swing.JTable();
        btnLog = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        DV_Menus = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        DV_BTS = new javax.swing.JTable();
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
        txtPROMO = new javax.swing.JTextField();
        lblBDOFF = new javax.swing.JLabel();
        cmbDropOffLocations = new javax.swing.JComboBox<>();
        btnDOrder = new javax.swing.JButton();
        btnPOrder = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Site > Station > Menu >>> loading, please wait ... ... ... ...");
        setMaximumSize(new java.awt.Dimension(864, 527));
        setMinimumSize(new java.awt.Dimension(864, 527));
        setName("Station"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setPreferredSize(new java.awt.Dimension(864, 527));
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
        txtLog.setText("Start >");
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
        DV_MTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_MTSMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DV_MTS);

        lblMenus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMenus.setText("Click Brand to get Menu(s) ...");
        lblMenus.setAlignmentX(0.5F);

        DV_Categories.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Categories.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Categories.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Categories.setCellSelectionEnabled(true);
        DV_Categories.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Categories.setName("DV_Categories"); // NOI18N
        DV_Categories.setOpaque(false);
        DV_Categories.setRowHeight(18);
        DV_Categories.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_Categories.getTableHeader().setReorderingAllowed(false);
        DV_Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_CategoriesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(DV_Categories);

        DV_Items.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_Items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_Items.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_Items.setCellSelectionEnabled(true);
        DV_Items.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Items.setName("DV_Items"); // NOI18N
        DV_Items.setOpaque(false);
        DV_Items.setRowHeight(18);
        DV_Items.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        DV_Mods.setCellSelectionEnabled(true);
        DV_Mods.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_Mods.setName("DV_Mods"); // NOI18N
        DV_Mods.setOpaque(false);
        DV_Mods.setRowHeight(18);
        DV_Mods.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_Mods.getTableHeader().setReorderingAllowed(false);
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

        DV_BTS.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        DV_BTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        DV_BTS.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        DV_BTS.setCellSelectionEnabled(true);
        DV_BTS.setGridColor(java.awt.SystemColor.activeCaptionBorder);
        DV_BTS.setName("DV_BTS"); // NOI18N
        DV_BTS.setRowHeight(18);
        DV_BTS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        DV_BTS.getTableHeader().setReorderingAllowed(false);
        DV_BTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DV_BTSMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(DV_BTS);

        lblMTS.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblMTS.setText("Menu Timeslots");

        lblBTS.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lblBTS.setText("Brand Timeslots");

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
        txtMobile_ID.setText("App_User@?.?");

        lblSITES6.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES6.setText("Mobile User Password");
        lblSITES6.setAlignmentX(0.5F);

        txtMobile_PW.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtMobile_PW.setText("password");

        lblSITES7.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblSITES7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSITES7.setText("Promo Code");
        lblSITES7.setAlignmentX(0.5F);

        txtPROMO.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtPROMO.setText("None");

        lblBDOFF.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        lblBDOFF.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBDOFF.setText("Drop Off Locations");
        lblBDOFF.setAlignmentX(0.5F);

        cmbDropOffLocations.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbDropOffLocations.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDropOffLocationsItemStateChanged(evt);
            }
        });

        btnDOrder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDOrder.setText("Place Delivery Order");
        btnDOrder.setEnabled(false);
        btnDOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDOrderMouseClicked(evt);
            }
        });

        btnPOrder.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnPOrder.setText("Place Pickup Order");
        btnPOrder.setEnabled(false);
        btnPOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLog)
                        .addGap(8, 8, 8)
                        .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSITES4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSITES6))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBDOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDropOffLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSITES7)
                    .addComponent(txtPROMO, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblSITES, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblBTS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMTS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSITES)
                    .addComponent(lblMenus)
                    .addComponent(lblBTS))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblMTS, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBDOFF)
                        .addGap(2, 2, 2)
                        .addComponent(cmbDropOffLocations, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblSITES7)
                        .addGap(2, 2, 2)
                        .addComponent(txtPROMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnPOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbApp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(lblSITES14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(lblSITES4)
                .addGap(2, 2, 2)
                .addComponent(txtMobile_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblSITES6)
                .addGap(2, 2, 2)
                .addComponent(txtMobile_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblSITES13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DV_SitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_SitesMouseClicked
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
           return;
        }
        SITE = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 0));
        SiteID = String.valueOf(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3));
                
        GetBrands(); // ================================
        SitesLastRow = DV_Sites.getSelectedRow();  
    }//GEN-LAST:event_DV_SitesMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        F_COUNT--;
    }//GEN-LAST:event_formInternalFrameClosed

    private void DV_BrandsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_BrandsMouseClicked
        if(DV_Brands.getRowCount() < 1){
            return;
        }
        BRAND = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 0));
        BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3));

        GetBrandDropOffLocations(); // ===================================
        GetBrandTimeslots();        // ===================================
        GetMenus();                 // ===================================
        BrandsLastRow = DV_Brands.getSelectedRow();   
        Validate_Pleace_Order();
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

    private void DV_MTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_MTSMouseClicked
        if(DV_MTS.getRowCount() > 0 && DV_BTS.getRowCount() > 0){
            DV_BTS.clearSelection();
        }
    }//GEN-LAST:event_DV_MTSMouseClicked

    private void DV_CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_CategoriesMouseClicked
        GetItems(); // ===================================
        CategoriesLastRow = DV_Categories.getSelectedRow(); 
    }//GEN-LAST:event_DV_CategoriesMouseClicked

    private void DV_ItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_ItemsMouseClicked
        GetMods(); // ===================================
        ItemsLastRow = DV_Items.getSelectedRow(); 
    }//GEN-LAST:event_DV_ItemsMouseClicked

    private void DV_MenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_MenusMouseClicked
        if(DV_Menus.getRowCount() < 1){
            return;
        }
        GetMenuTimeslots();
        GetCategories();
        CategoriesLastRow = DV_Categories.getSelectedRow();
    }//GEN-LAST:event_DV_MenusMouseClicked

    private void DV_BTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DV_BTSMouseClicked
        if(DV_MTS.getRowCount() > 0 && DV_BTS.getRowCount() > 0){
            DV_MTS.clearSelection();
        }
    }//GEN-LAST:event_DV_BTSMouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Load_Form();
    }//GEN-LAST:event_formAncestorAdded

    private void cmbDropOffLocationsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDropOffLocationsItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDropOffLocationsItemStateChanged

    private void btnPOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOrderMouseClicked
        PLACE_ORDERS("P");
    }//GEN-LAST:event_btnPOrderMouseClicked

    private void btnDOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDOrderMouseClicked
        PLACE_ORDERS("D");
    }//GEN-LAST:event_btnDOrderMouseClicked

    private void Load_Form(){
        Load = true;
        cmbApp.addItem("Boost");
        cmbApp.addItem("Canteen");
        cmbApp.addItem("JJKitchen");
        cmbApp.addItem("Nourish");
        cmbApp.addItem("Rogers");
        cmbApp.addItem("Tacit");
        cmbApp.addItem("Thrive");
        
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Development");
        cmbEnv.addItem("Production");         
        cmbEnv.setSelectedIndex(0); // Staging
        
        cmbApp.setSelectedIndex(6);

        Load = false;
        LOAD_ENV();
        app = cmbApp.getSelectedItem().toString();
        CONFIG = false;   
        this.setTitle("Site > Station(Brand) > Menu(s)");
    }

    private void LOAD_CONFIG(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'Station' AND [env] = '" + env + "'";
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
            
        try{            
            if (C.contains(": ")) {
                String c;
                c = C.substring(C.indexOf("env:")); c = c.substring(0, c.indexOf("\r\n")).trim(); env = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("app:")); c = c.substring(0, c.indexOf("\r\n")).trim(); app = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("url:")); c = c.substring(0, c.indexOf("\r\n")).trim(); url = c.substring(c.indexOf(" ")).trim();

                c = C.substring(C.indexOf("SITE:")); c = c.substring(0, c.indexOf("\r\n")).trim(); SITE = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("BRAND:")); c = c.substring(0, c.indexOf("\r\n")).trim(); BRAND = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("COUNTRY:")); c = c.substring(0, c.indexOf("\r\n")).trim(); COUNTRY = c.substring(c.indexOf(" ")).trim();
                c = C.substring(C.indexOf("txtMobile_ID:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_ID.setText(c.substring(c.indexOf(" ")).trim());
                c = C.substring(C.indexOf("txtMobile_PW:")); c = c.substring(0, c.indexOf("\r\n")).trim(); txtMobile_PW.setText(c.substring(c.indexOf(" ")).trim());

                CONFIG = true;
                txtLog.append("=== LOAD_CONFIG > OK" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            } else {
                CONFIG = false;
                txtLog.append("=== Station, User: " + UserID + ", Env: " + env + " > No saved Configuration Found" + "\r\n");
                txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            }
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
            C += "txtMobile_ID: " + txtMobile_ID.getText().trim() + "\r\n";
            C += "txtMobile_PW: " + txtMobile_PW.getText()  + "\r\n";

        } catch (Exception ex)  {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
            return;
        }
        
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + UserID + "' AND [platform] = 'WEB' AND [app] = 'Station' AND [env] = '" + env + "'";
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
        if(cmbEnv.getSelectedItem().toString().contains("Staging")){
            BaseAPI = "https://api.compassdigital.org/staging";
            env = "ST";
            url = "https://dev.thriveapp.io/"; 
        } else if (cmbEnv.getSelectedItem().toString().contains("Dev")){
            BaseAPI = "https://api.compassdigital.org/dev";
            env = "DE";
            url = "https://dev.thriveapp.io/";
        } else{
            BaseAPI = "https://api.compassdigital.org/v1";
            env = "PR";
            url = "https://dev.thriveapp.io/";
        }
        Get_AP3_TKN();
        LOAD_CONFIG();
        if (CONFIG) {
            Load = true;
            cmbApp.setSelectedItem(app);
            Load = false;
        }
        app = cmbApp.getSelectedItem().toString();
        GetSites();       
    }
    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));       
        try (Connection conn = DriverManager.getConnection(QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM[dbo].[env] WHERE [DESCRIPTION] = '" + cmbEnv.getSelectedItem() + "'");
            rs.next();
            WO_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== WO_TKN > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetSites() {   
        SitesLastRow = -1;
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Sites ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        

        appId = Func.App_ID(cmbApp.getSelectedItem().toString(), env);

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
                 
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try { 
            HttpGet httpget = new HttpGet(BaseAPI + "/location/multigroup/" + appId);   //  + "?web=true&expanded=true"    
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
            DV_Sites.getColumnModel().getColumn(3).setPreferredWidth(400);
            
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
        lblSITES.setText(app + " Sites (" + DV_Sites.getRowCount() + " found)");
        txtLog.append("" + app + " > " + DV_Sites.getRowCount() + " Site(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        
        GetBrands();
    }
    private void GetBrands() {
        if (SitesLastRow == DV_Sites.getSelectedRow()) {
           return;
        }
        btnPOrder.setEnabled(false);
        btnDOrder.setEnabled(false);
        BrandsLastRow = -1;
        SitesLastRow = DV_Sites.getSelectedRow();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Brands ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String[] ColumnsName = {}; 
        DefaultTableModel Model = new DefaultTableModel();
        Model.setColumnIdentifiers(ColumnsName);
        DV_Menus.setModel(Model);
        DV_Categories.setModel(Model);
        DV_Items.setModel(Model);
        DV_Mods.setModel(Model);
        DV_BTS.setModel(Model);
        DV_MTS.setModel(Model);
        lblMenus.setText("Click Brand to get Menu(s) ...");
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
     
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
        
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/group/" + DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 3) + "?extended=true&nocache=1"); 
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
            BrandID = String.valueOf(DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 3));           
            //GetMenus(); // ======================== force only after Brand selection
        } else {
            BrandID = "null";
        }
        txtLog.append("" + SITE + " > " + DV_Brands.getRowCount() + " Station(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        BrandsLastRow = -1;         
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void GetBrandDropOffLocations(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Brand Drop Off Locations ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        cmbDropOffLocations.removeAllItems();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/config/public/" + BrandID); 
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
            if(json.has("delivery_destinations")) {
                JSONArray DESTINATIONS = json.getJSONArray("delivery_destinations");
                for (int i = 0; i < DESTINATIONS.length(); i++) {
                    cmbDropOffLocations.addItem(DESTINATIONS.getString(i));
                }
            }
        } catch (Exception ex) {
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
        lblBDOFF.setText("Brand Drop Off Locations " + cmbDropOffLocations.getItemCount());
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();            
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
    }
    
    private void GetBrandTimeslots(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Brand Timeslots ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        String[] ColumnsName = {"Time", "epoch"}; 
        DefaultTableModel BTS_Model = new DefaultTableModel();
        BTS_Model.setColumnIdentifiers(ColumnsName);
        DV_BTS.setModel(BTS_Model);        
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/brand/" + BrandID + "/timeslots"); 
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
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            if (json.has("timeslots")) {
                JSONArray timeslots = json.getJSONArray("timeslots");
                for (int i = 0; i < timeslots.length(); i++) {
                    JSONObject timeslot = timeslots.getJSONObject(i);
                    BTS_Model.addRow(new Object[]{sdf.format(new Date(timeslot.getLong("id")*1000)), timeslot.getLong("id")});
                }
            } 
            DV_BTS.setModel(BTS_Model); 
            DV_BTS.setDefaultEditor(Object.class, null);
            DV_BTS.getColumnModel().getColumn(0).setPreferredWidth(50);
            DV_BTS.getColumnModel().getColumn(1).sizeWidthToFit();

        } catch (Exception ex) {
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
        if(DV_BTS.getRowCount() > 0){
            DV_BTS.changeSelection(0, 0, false, false);
        }        
        lblBTS.setText("Brand Slots " + DV_BTS.getRowCount());
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();            
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));            
    }
    private void GetMenus(){
        txtLog.append("- Load Menus ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        String[] cName = {}; 
        DefaultTableModel M = new DefaultTableModel();
        M.setColumnIdentifiers(cName);
        DV_Categories.setModel(M);
        DV_Items.setModel(M);
        DV_Mods.setModel(M);
        MenusLastRow = -1;
        String[] ColumnsName = {"Menu Label (en)", "Response", "Id"}; 
        DefaultTableModel Model = new DefaultTableModel();
        Model.setColumnIdentifiers(ColumnsName);
        DV_Menus.setModel(Model);
        
        String IDS = DV_Brands.getValueAt(DV_Brands.getSelectedRow(), 2).toString(); // ================== col 2
        if(IDS.trim().isEmpty()){
            lblMenus.setText("Brand/Station " + BRAND + " > No Menus found");
            return;
        }
        
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
         
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String label = "<empty> 'en'";
        String resp;
        JArray_MENUS = new JSONArray();
        try {
            String[] Menu_IDs = IDS.split(",");
            for (String id : Menu_IDs) {
                HttpGet httpget = new HttpGet(BaseAPI + "/menu/" + id); // + "?extended=true&nocache=1"
                ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                    int status = response.getStatusLine().getStatusCode();
                    String Msg = response.getStatusLine().getReasonPhrase();
                    if (status >= 200 && status < 500) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
                        throw new ClientProtocolException("Response: " + status + " - " + Msg);
                    }
                };
                String responseBody = httpclient.execute(httpget, responseHandler);
                JArray_MENUS.put(new JSONObject(responseBody));
                JSONObject menu = new JSONObject(responseBody);
                resp = "OK " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec";
                if(menu.has("label")){                    
                    if(menu.getJSONObject("label").has("en")) {
                        label = menu.getJSONObject("label").getString("en");
                        if(label.trim().equals("")) {
                            label = "label 'en' Empty";
                        }
                    }
                }else{
                    label = "label 'en' Not Found";
                }
                Model.addRow(new Object[]{label, resp, id});
            }
        } catch (IOException | JSONException ex) {
            resp = "Error " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec";
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
        DV_Menus.setModel(Model);    
        DV_Menus.setDefaultEditor(Object.class, null);
        DV_Menus.getColumnModel().getColumn(0).setPreferredWidth(140);
        DV_Menus.getColumnModel().getColumn(1).setPreferredWidth(140);
        DV_Menus.getColumnModel().getColumn(2).setPreferredWidth(80);
        DV_Menus.changeSelection(0, 0, false, false);
        
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();
 
        lblMenus.setText("Brand/Station '" + BRAND + "' > " + DV_Menus.getRowCount() + " Menu(s) found");
        txtLog.append("Brand/Station '" + BRAND + "' > " + DV_Menus.getRowCount() + " Menu(s) found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
     
        GetMenuTimeslots();
        GetCategories();
        MenusLastRow = DV_Menus.getSelectedRow();  
        Validate_Pleace_Order();
    }
    private void GetMenuTimeslots(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load Menu Timeslots ..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();  
        String MenuID = String.valueOf(DV_Menus.getValueAt(DV_Menus.getSelectedRow(), 2));
        String[] BrandsColumnsName = {"Time", "epoch"}; 
        DefaultTableModel MTS_Model = new DefaultTableModel();
        MTS_Model.setColumnIdentifiers(BrandsColumnsName);
        DV_MTS.setModel(MTS_Model);        
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpget = new HttpGet(BaseAPI + "/location/brand/" + BrandID + "/timeslots/menu/" + MenuID); 
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
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
            String responseBody = httpclient.execute(httpget, responseHandler);
            JSONObject json = new JSONObject(responseBody);
            if (json.has("timeslots")) {
                JSONArray timeslots = json.getJSONArray("timeslots");
                for (int i = 0; i < timeslots.length(); i++) {
                    JSONObject timeslot = timeslots.getJSONObject(i);
                    MTS_Model.addRow(new Object[]{sdf.format(new Date(timeslot.getLong("id")*1000)), timeslot.getLong("id")});
                }
            }   
            DV_MTS.setModel(MTS_Model);  
            DV_MTS.setDefaultEditor(Object.class, null);
            DV_MTS.getColumnModel().getColumn(0).setPreferredWidth(50);
            DV_MTS.getColumnModel().getColumn(1).sizeWidthToFit();

        } catch (Exception ex) {
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
        lblMTS.setText("Menu Slots " + DV_MTS.getRowCount());
        txtLog.append("== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        sw1.reset();               
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void GetCategories(){
        if (MenusLastRow == DV_Menus.getSelectedRow()) {
           return;
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            String name = "";
            String hidden = "?";  
            String linked = "?"; 
            String id = "?"; 
            JArray_CATS = new JSONArray();
            String[] ColumnsName = {"Category (group) Name", "Hidden", "Linked", "id"}; 
            DefaultTableModel Model = new DefaultTableModel();
            Model.setColumnIdentifiers(ColumnsName);
            DV_Categories.setModel(Model);
            CategoriesLastRow = -1; 
            
            JSONObject menu = (JSONObject) JArray_MENUS.get(DV_Menus.getSelectedRow());             
            if (menu.has("groups")) {
                    JSONArray groups = menu.getJSONArray("groups");
                    for (Object g : groups) {
                        JSONObject gr = (JSONObject) g;
                        JArray_CATS.put(new JSONObject(gr.toString())); 
                        name = gr.getString("name");
                        if(gr.has("id")){
                            id = gr.getString("id");
                        }else{
                            id = "not found";
                        }
                        if(gr.has("is")){
                           JSONObject is =  gr.getJSONObject("is");
                           if(is.has("hidden") && is.getBoolean("hidden")){
                               hidden = "true";
                           }else{
                               hidden = "false";
                           }
                           if(is.has("linked") && is.getBoolean("linked")){
                               linked = "true";
                           }else{
                               hidden = "false";
                           } 
                        }
                        Model.addRow(new Object[]{name, hidden, linked, id});            
                    DV_Categories.setModel(Model);    
                    DV_Categories.setDefaultEditor(Object.class, null);
                    DV_Categories.getColumnModel().getColumn(0).setPreferredWidth(180);
                    DV_Categories.getColumnModel().getColumn(1).setPreferredWidth(60);
                    DV_Categories.getColumnModel().getColumn(2).setPreferredWidth(60);
                    DV_Categories.changeSelection(0, 0, false, false);
                }
            }
        }
        catch(Exception ex){
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("Selected Menu > " + DV_Categories.getRowCount() + " Categories found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        GetItems();
        CategoriesLastRow = DV_Categories.getSelectedRow(); 
    }
    private void GetItems(){
        if (CategoriesLastRow == DV_Categories.getSelectedRow()) {
           return;
        }else{
            txtLog.append("- GetItems: " + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        try {
            String label = "";
            String hidden = "?";  
            String disabled = "?"; 
            String price = "?";
            String cal = "?";
            String id = "?";
            JArray_ITEMS = new JSONArray();
            String[] ColumnsName = {"Item Label (en)", "Price", "Cal", "Hidden", "Disabled", "id"}; 
            DefaultTableModel Model = new DefaultTableModel();
            Model.setColumnIdentifiers(ColumnsName);
            DV_Items.setModel(Model);
            ItemsLastRow = -1;
            
            JSONObject cat = (JSONObject) JArray_CATS.get(DV_Categories.getSelectedRow());             
            if (cat.has("items")) {
                JSONArray items = cat.getJSONArray("items");
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
                    if(Item.has("id")){
                        id = Item.getString("id");
                    }else{
                        id = "not found";
                    }
                    if(Item.has("price") && Item.getJSONObject("price").has("amount")){
                        price = "$" + Item.getJSONObject("price").getNumber("amount").toString();
                    }else{
                        price = "Not Found";
                    }
                    if(Item.has("nutrition") && 
                            Item.getJSONObject("nutrition").has("calories") && 
                            Item.getJSONObject("nutrition").getJSONObject("calories").has("amount")){
                        cal = Item.getJSONObject("nutrition").getJSONObject("calories").getNumber("amount").toString();
                    }else{
                        cal = "Not Found";
                    }                    
                    Model.addRow(new Object[]{label, price, cal, hidden, disabled, id});            
                    DV_Items.setModel(Model);    
                    DV_Items.setDefaultEditor(Object.class, null);
                    DV_Items.getColumnModel().getColumn(0).setPreferredWidth(180);
                    DV_Items.getColumnModel().getColumn(1).setPreferredWidth(60);
                    DV_Items.getColumnModel().getColumn(2).setPreferredWidth(60);
                    DV_Items.changeSelection(0, 0, false, false);
                }
            }
        }
        catch(JSONException ex){
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());   
        }
        txtLog.append("Selected Category > " + DV_Items.getRowCount() + " Items found" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));        
        
        GetMods();
        ItemsLastRow = DV_Items.getSelectedRow(); 
    }
    private void GetMods(){
        if (ItemsLastRow == DV_Items.getSelectedRow()) {
            return;
        }else{
            txtLog.append("- GetMods: " + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        int mGR = 0;
        int mIT = 0;
        try {
            String label = "";
            String hidden = "?";  
            String disabled = "?"; 
            String price = "?";
            String cal = "?";
            String id = "?";

            String[] ColumnsName = {"Modifires - Label (en)" , "Price", "Cal", "Hidden", "Disabled", "id"}; 
            DefaultTableModel Model = new DefaultTableModel();
            Model.setColumnIdentifiers(ColumnsName);
            DV_Mods.setModel(Model);
            
            JSONObject item = (JSONObject) JArray_ITEMS.get(DV_Items.getSelectedRow());             
            if (item.has("options")) {
                JSONArray options = item.getJSONArray("options");
                for (Object ops : options) {
                    mGR++;
                    JSONObject oGroup = (JSONObject) ops;
                    if(oGroup.has("label")){                    
                       if(oGroup.getJSONObject("label").has("en")) {
                           label = oGroup.getJSONObject("label").getString("en");
                           if(label.trim().equals("")) {
                               label = "label 'en' Empty";
                           }
                       }
                    }else{
                        label = "label 'en' Not Found";
                    } 
                    if(oGroup.has("min") && oGroup.has("max")){
                        label = label + " (min:" + oGroup.getNumber("min").toString() + ", max:" + oGroup.getNumber("max").toString() + ")";
                    }
                    if(oGroup.has("id")){
                        id = oGroup.getString("id");
                    }else{
                        id = "not found";
                    }
                    Model.addRow(new Object[]{"= " + label + " >>> ", " ", " ", " ", " ", id});  //==================== 
                    
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
                            if(OItem.has("is")){
                               JSONObject is =  OItem.getJSONObject("is");
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
                            if(OItem.has("nutrition") && OItem.getJSONObject("nutrition").has("calories") &&
                                    OItem.getJSONObject("nutrition").getJSONObject("calories").has("amount")){                                
                                cal = OItem.getJSONObject("nutrition").getJSONObject("calories").getNumber("amount").toString();
                            }else{
                                cal = "Not Found";
                            }
                            Model.addRow(new Object[]{label, price, cal, hidden, disabled, id});  
                        }
                    }
                }
            }
            DV_Mods.setModel(Model);    
            DV_Mods.setDefaultEditor(Object.class, null);
            DV_Mods.getColumnModel().getColumn(0).setPreferredWidth(180);
            DV_Mods.getColumnModel().getColumn(1).setPreferredWidth(80);
            DV_Mods.getColumnModel().getColumn(2).setPreferredWidth(80);
            DV_Mods.changeSelection(0, 0, false, false);    
        }
        catch(Exception ex){
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());  
        }
        txtLog.append("Selected Item > " + mGR + " Mofifier Group(s), " + mIT + " total Mods" + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    
    private void Validate_Pleace_Order() {
        btnPOrder.setEnabled(false);
        btnDOrder.setEnabled(false);
        if(DV_Items.getSelectedRowCount() > 0 && (DV_BTS.getSelectedRowCount() > 0 || DV_MTS.getSelectedRowCount() > 0)){
            btnPOrder.setEnabled(true);
            if(cmbDropOffLocations.getSelectedItem().toString().trim() != ""){
                btnDOrder.setEnabled(true);
            }
        }
    }
    private void PLACE_ORDERS(String TYPE){
        Get_Mobile_User_TKN();
        if(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 2).toString().toLowerCase().startsWith("c")){
             EXACT();
        }
        if(DV_Sites.getValueAt(DV_Sites.getSelectedRow(), 2).toString().toLowerCase().startsWith("u")){
            FP();
        }
    } 
    
    
    private void Get_Mobile_User_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
        txtLog.append("- Load User..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        String J = "==== User API(s):" + "\r\n";
        userID = "";
        userTKN = "";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String UserAuth = Base64.getEncoder().encodeToString((txtMobile_ID.getText().trim() + ":" + txtMobile_PW.getText().trim()).getBytes());
        String Realm = Func.Realm_ID(cmbApp.getSelectedItem().toString(), env);
        if(sw1.isRunning()){
            sw1.reset();
        }
        sw1.start();        
        
        try {     // ============ User
            HttpGet httpget = new HttpGet(BaseAPI + "/user/auth" + "?realm=" + Realm);
            httpget.setHeader("Authorization", "Basic " + UserAuth);
            ResponseHandler<String> responseHandler = (final HttpResponse response) -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 500) {
                    HttpEntity entity = response.getEntity();
                    return entity != null ? EntityUtils.toString(entity) : null;
                } else {
                    this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                    throw new ClientProtocolException("Response: " + status + " - " + response.getStatusLine().getReasonPhrase());
                }
            };
            JSONObject json = new JSONObject(httpclient.execute(httpget, responseHandler));
            J += BaseAPI + "/user/auth?realm=" + Realm + "\r\n" + json.toString(4);

            userID = json.getString("user");
            userTKN = json.getString("token");

        } catch (IOException | JSONException ex) {
            txtLog.append(" > " + J); 
            txtLog.append("- Exception: " + ex.getMessage() + "\r\n"); 
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        txtLog.append("== " + BaseAPI + "/user/auth?realm="  + Realm + " > " + "\r\n== " + String.format("%.2f", (double)(sw1.elapsed(TimeUnit.MILLISECONDS)) / (long)(1000)) + " sec ==" + "\r\n");
        txtLog.append("== " + "UserID:"  + userID + "\r\n");
        txtLog.append("== " + "UserTKN:"  + userTKN + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
        sw1.reset();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }                                    
    private void EXACT(){
        txtLog.append("- EXACT..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());
    }
    private void FP(){
         txtLog.append("- FP..." + "\r\n");
        txtLog.setCaretPosition(txtLog.getDocument().getLength());       
    }


//        Auth = "Bearer " + Mobile_User_TKN;
//        Date requested_date = new Date(Long.parseLong(BRAND_TIMESLOTS.get(BRAND_TIMESLOTS.size() - 1))*1000L);
//        //Date requested_date = new Date(Long.parseLong(MENU_TIMESLOTS.get(MENU_TIMESLOTS.size() - 1))*1000L);
//        

//
//        String Requested_Date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(requested_date);
//
//        requestParams = new JSONObject();       //  Mobile User Place Pickup Order  =================
//        requestParams.put("location_brand", BrandID);
//        requestParams.put("customer", Mobile_User_ID);
//        requestParams.put("pickup_name", "JTT API Test Pickup");
//        requestParams.put("pickup", Requested_Date);
//        requestParams.put("requested_date", Requested_Date);
//        requestParams.put("shoppingcart", ShoppingCart_Pickup_ID);
//        JSONObject payment = new JSONObject();
//        payment.put("token", EXACT_Payment_TKN);
//        requestParams.put("payment", payment); 
//        BODY = requestParams.toString();        
//        JOB_Api_Call("Place Pickup Order", "POST", 
//            BaseAPI + "/order?lang=en", Auth, BODY, 200, ParentTest, "no_jira");
//        if(json != null && json.has("id")){
//            Order_Pickup_ID = json.getString("id");
//        }   
//

//        Auth = "Bearer " + Mobile_User_TKN;
//        BODY = "{" +                                                //  Mobile User Place Delivery Order  =================
//                "\"location_brand\":\"" + BrandID + "\"," + 
//                "\"customer\":\"" + Mobile_User_ID + "\"," +  
//                "\"details\":" +                                   
//                    "{\"contact_number\":\"4165551234\"," +
//                    "\"destination\":\"" + DELIEVERY_DESTINATIONS.get(0) + "\"," +
//                    "\"duration\":\"" + "00:05:00" + "\"," +
//                    "\"instructions\":\"" + "Discard this Order" + "\"," +
//                    "\"name\":\"" + "JTT API Test Delivery" + "\"," +
//                    "\"order_type\":\"delivery\"}," + 
//                "\"payment\":" + 
//                    "{\"token\":\"" + EXACT_Payment_TKN + "\"}," +
//                "\"requested_date\":\"" + Requested_Date + "\"," +
//                "\"shoppingcart\":\"" + ShoppingCart_Delivery_ID + 
//                "\"}";        
//        JOB_Api_Call("Place Delivery Order", "POST", 
//            BaseAPI + "/order", Auth, BODY, 200, ParentTest, "no_jira");
//        if(json != null && json.has("id")){
//            Order_Delivery_ID = json.getString("id");
//        }               
//        
//        Auth = "Bearer " + AP3_TKN;
//        requestParams = new JSONObject();   //  Mobile User Update Delivery Order  =================
//        JSONObject is = new JSONObject();
//        is.put("in_progress", true);
//        is.put("ready", true);
//        //is.put("out_for_delivery", true);        
//        requestParams.put("is", is); 
//        BODY = requestParams.toString();
//        JOB_Api_Call("Update Delivery Order Status - ready", "PATCH", 
//            BaseAPI + "/order/" + Order_Delivery_ID, Auth, BODY, 200, ParentTest, "no_jira");        
//        if(json != null){           
//            AAA = json.toString(4);  // Check actual update
//        }         
//    }



    // <editor-fold defaultstate="collapsed" desc="Form Variables Declaration - do not modify">
    JSONArray JArray_MENUS;
    JSONArray JArray_CATS;
    JSONArray JArray_ITEMS; 
    
    private boolean Load;
    private static Duration DD;
  
    private int SitesLastRow = -1; 
    private int BrandsLastRow = -1; 
    private int MenusLastRow = -1;  
    private int CategoriesLastRow = -1; 
    private int ItemsLastRow = -1; 
    
    private boolean CONFIG = false;
    private String C = "";
    private String userID;
    private String userTKN;
    public static int T_Index;
    private String Last_EX;    
    public static Stopwatch sw1 = Stopwatch.createUnstarted();
    public static DateTimeFormatter Time_12_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
    public static final DateTimeFormatter Time_24_formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static final DateTimeFormatter Date_formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    public static String SQL = ""; 
    private String SCOPE;
    public static String WO_TKN = "";    
    public static String url = "";
    public static String app = "";
    public static String appId = "";
    public static String env = "";
    public static String SITE = "";
    public static String SiteID = "";
    public static String GROUP = "";
    public static String BRAND = "";
    public static String BrandID = "";

    public static String COUNTRY = "COUNTRY";

    public static String platform = "CDL";
    public static String BaseAPI;
    public static String TZone; 
    public static String PROMO; 
    public static String New_ID = "";
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DV_BTS;
    private javax.swing.JTable DV_Brands;
    private javax.swing.JTable DV_Categories;
    private javax.swing.JTable DV_Items;
    private javax.swing.JTable DV_MTS;
    private javax.swing.JTable DV_Menus;
    private javax.swing.JTable DV_Mods;
    private javax.swing.JTable DV_Sites;
    private javax.swing.JButton btnDOrder;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnPOrder;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JComboBox<String> cmbApp;
    private javax.swing.JComboBox<String> cmbDropOffLocations;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
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
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMobile_ID;
    private javax.swing.JTextField txtMobile_PW;
    private javax.swing.JTextField txtPROMO;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
