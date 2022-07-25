package V1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.util.Base64;
import java.util.Date;
import javax.swing.DefaultListModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
/**
 *
 * @author Oleg.Spozito
 */
public class V1 extends javax.swing.JInternalFrame {
    public V1() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMods2 = new javax.swing.JTextArea();
        lblMetrics1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMods1 = new javax.swing.JTextArea();
        lblMetrics2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        lblS = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listSector = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        listCompanies = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listMenus = new javax.swing.JList<>();
        lblC = new javax.swing.JLabel();
        chkRemove = new javax.swing.JCheckBox();
        txtMod2 = new javax.swing.JTextField();
        txtMod1 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        listItems = new javax.swing.JList<>();
        lblI = new javax.swing.JLabel();
        txtAP3_ID = new javax.swing.JTextField();
        txtAP3_PW = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chkByCategory = new javax.swing.JCheckBox();
        btnSave_Opt = new javax.swing.JButton();
        cmbEnv = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Global Menus (v1 only) - Items > Modifiers update");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("V1"); // NOI18N
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

        lblM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblM.setText("Company > Global V1 Menus: Name, ID");
        lblM.setAlignmentX(0.5F);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        txtMods2.setEditable(false);
        txtMods2.setColumns(20);
        txtMods2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtMods2.setRows(5);
        txtMods2.setText("700029\tWhole Fruit\n700030\tSnickers Bar 1.8oz\n700031\tM&m Peanut 1.74oz\n700032\tReese Peanut Butter Cups 1.5oz\n700033\tDoritos Nacho Cheese 1.75oz\n700034\tMiss Vickie's Jalapeno\n700035\tTwix 1.79oz\n700036\tLays Plain 1.5oz\n700037\tNature Valley Crunchy Oats 'N Honey 1.49oz\n700038\tBar Nutri Grain Strawberry 1.3oz\n700039\tChip Baked Lays BBQ 1.5oz\n700040\tBar Kind Caramel Almond & Sea Salt 1.4oz\n700041\tSahale Honey Glazed Almonds 1.5oz\n700042\tOrchard Valley Keto Crunchy Trail Mix 1.85oz\n700043\tChip Terra Blue Potato Chips 1oz\n700044\tCheez Its Whole Grain 1oz\n700045\tBar Kind Dark Chocolate Nuts/Sea Salt 1.4oz\n700046\tRX Bar Blueberry 1.83oz\n700047\tNutri Grain Bar Apple Cinnamon 1.3oz\n700048\tMiss Vickie's Bbq 1 3/8oz\n700049\tM&m Plain 1.69oz\n700050\tSun Harvest Cheddar 1.5oz\n700051\tMiss Vickie's Sea Salt Vin 1 3/8oz\n700052\tHershey Milk Chocolate\n700053\tNabisco Belvita Blueberry 1.76oz\n700054\tSmartfood White Cheddar Popcorn .625oz\n700055\tSahale Dry Roasted Almonds 1.5oz\n700056\tOrchard Valley Harvest Omega-3 Mix 2oz\n700057\tFSTG Multigrain Tortilla Chips 1.5oz\n700058\tBaked Lays Plain 1.125oz");
        txtMods2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMods2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtMods2.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane2.setViewportView(txtMods2);

        lblMetrics1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMetrics1.setText("Mods: PLU \\t Name");
        lblMetrics1.setAlignmentX(0.5F);

        txtMods1.setColumns(20);
        txtMods1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtMods1.setRows(5);
        txtMods1.setText("700000\tClassic Coke 20oz\n700001\tDiet Coke 20oz\n700002\tCoke Zero 20oz\n700003\tPepsi 20oz\n700004\tDiet Pepsi 20oz\n700005\tMountain Dew 20oz\n700006\tDiet Mountain Dew 20oz\n700007\tSprite 20oz\n700008\tDiet Sprite 20oz\n700009\tAquafina 20oz\n700010\tDasani 20oz\n700011\tSmartwater 20oz\n700012\tLifewater 20oz\n700013\tVitamin Water Power C\n700014\tVitamin Water Zero Sugar Squeezed\n700015\tMonster Energy 16oz\n700016\tMonster Zero Ultra 16oz\n700017\tPure Leaf Diet Tea\n700018\tPure Leaf Sweet Tea\n700019\tGatorade Fruit Punch\n700020\tGatorade Zero Glacier\n700021\tStarbucks Cold Brew\n700022\tStarbucks Frappuccino Vanilla\n700023\tBubly Lime\n700024\tBubly Grapefruit\n700025\tBubly Cherry\n700026\tBubly Orange\n700027\tBubly Lemon\n700028\tBubly Black Cherry");
        txtMods1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMods1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtMods1.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane4.setViewportView(txtMods1);

        lblMetrics2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMetrics2.setText("Mods: PLU \\t Name");
        lblMetrics2.setAlignmentX(0.5F);

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Update ^ Modifiers");
        btnRun.setEnabled(false);
        btnRun.setMaximumSize(new java.awt.Dimension(150, 29));
        btnRun.setMinimumSize(new java.awt.Dimension(150, 28));
        btnRun.setName("btnRun"); // NOI18N
        btnRun.setPreferredSize(new java.awt.Dimension(150, 28));
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        lblS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblS.setText("Target Sectors: Name, ID");
        lblS.setAlignmentX(0.5F);

        listSector.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listSector.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listSectorValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(listSector);

        listCompanies.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listCompanies.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listCompaniesValueChanged(evt);
            }
        });
        jScrollPane7.setViewportView(listCompanies);

        listMenus.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listMenus.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listMenusValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(listMenus);

        lblC.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblC.setText("Selected Sector > Companies: Name, ID");
        lblC.setAlignmentX(0.5F);

        chkRemove.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        chkRemove.setText("Remove Existing ^^");
        chkRemove.setFocusPainted(false);

        txtMod2.setText("Snacks");
        txtMod2.setDragEnabled(false);

        txtMod1.setText("Beverages");
        txtMod1.setDragEnabled(false);

        listItems.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listItemsMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(listItems);

        lblI.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblI.setText("Selected Menu > Items: Name, ID");
        lblI.setAlignmentX(0.5F);

        txtAP3_ID.setText("Enter your AP3 User ID/Email");
        txtAP3_ID.setDragEnabled(false);

        txtAP3_PW.setText("Enter AP3 PW > Save Setup");
        txtAP3_PW.setDragEnabled(false);

        jLabel1.setText("User ID");

        jLabel2.setText("PW");

        chkByCategory.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        chkByCategory.setText("By Category only");
        chkByCategory.setFocusPainted(false);
        chkByCategory.setRequestFocusEnabled(false);
        chkByCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkByCategoryItemStateChanged(evt);
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

        cmbEnv.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbEnv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEnvItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Environment:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblI, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblM, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtAP3_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(txtAP3_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtMod1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblMetrics2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMod2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblMetrics1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRemove)
                            .addComponent(chkByCategory)
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblS)
                    .addComponent(lblI)
                    .addComponent(lblM))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblC)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAP3_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAP3_PW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblMetrics2))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblMetrics1)))
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(chkByCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSave_Opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Variables ">
    private String env = "";
    private boolean CONFIG = false;
    private boolean Load = true;
    private boolean ALLOW = true;
    private String err = "";
    private String FAILED = "";
    private JSONObject json;

    private JSONArray companies;
    private JSONArray menus;
    private JSONArray groups;
    private JSONArray items;

    private JSONObject getMenu;
    private JSONObject putMenu;

    private JSONObject ModGr1;
    private JSONObject ModGr2;
    private JSONArray Mods1;
    private JSONArray Mods2;
    private JSONArray newOptions;

    private DecimalFormat DEC_FORMAT = new DecimalFormat("#.##");
    private double PutMenu_Size = 0;
    private double GetMenu_Size = 0;

    private String BaseAPI = "";
    private String AP3_TKN = "";
    private String AP3_User_ID = "";

    private String SectorID = "";
    private String CompID = "";
    private String MenuID = "";
    private String ItemID = "";

    private String AAA = "";
    // </editor-fold> 

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
        Publish_Menu();
    }//GEN-LAST:event_btnRunMouseClicked
 
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        txtLog.setText("");
        txtLog.append("=== Original Full Menu GET Json:\r\n" 
                    + getMenu.toString(4) + "\r\n\r\n"
                    + "=== Update Menu PUT Json:\r\n"
                    + putMenu.toString(4));
        txtLog.setCaretPosition(0);
        String R = A.Func.SHOW_FILE(txtLog.getText(), "json");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));
    }//GEN-LAST:event_btnLogMouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        cmbEnv.addItem("Development"); 
        cmbEnv.addItem("Staging");
        cmbEnv.addItem("Production");
        cmbEnv.setSelectedIndex(0); // delevopment

        txtAP3_ID.setText(A.A.UserID + "@compassdigital.io");
 
        Load_CONFIG();


        if (CONFIG) {
            Load = true;
            Load_Env();            //cmbEnv.setSelectedItem(app);
            Load = false;
        }

        if(A.A.UserID.equals("oleg.spozito") || A.A.UserID.equals("roya.jacob") || A.A.UserID.equals("alex.koss")){
            ALLOW = true;
        } else{
            ALLOW = false;
        }
    }//GEN-LAST:event_formAncestorAdded

    private void listSectorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSectorValueChanged
        Get_Comp();
    }//GEN-LAST:event_listSectorValueChanged

    private void listCompaniesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCompaniesValueChanged
        Get_Company_Menus();
    }//GEN-LAST:event_listCompaniesValueChanged

    private void listMenusValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMenusValueChanged
        Get_Full_Menu();
    }//GEN-LAST:event_listMenusValueChanged

    private void listItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listItemsMouseClicked
        if(chkByCategory.isSelected()){
            String GR = listItems.getSelectedValue().toString();
            if(!GR.startsWith("==")) {
                listItems.clearSelection();
                return;
            }
            String GR_Name = GR.substring(GR.indexOf(": ") + 2, GR.lastIndexOf("ID:")).trim();
            if(GR_Name.equals(txtMod1.getText().trim()) || GR_Name.equals(txtMod2.getText().trim())) {
                listItems.clearSelection();
                return;
            }

        }else{
            listItems.clearSelection();
        }
        CHECK_Allow();
    }//GEN-LAST:event_listItemsMouseClicked

    private void btnSave_OptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSave_OptMouseClicked
        Save_CONFIG();
    }//GEN-LAST:event_btnSave_OptMouseClicked

    private void cmbEnvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEnvItemStateChanged
        if(Load){
            return;
        }
        if (evt.getStateChange() == 1) {
            cmbEnv.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            Load_Env();
            cmbEnv.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_cmbEnvItemStateChanged

    private void chkByCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkByCategoryItemStateChanged
        listItems.clearSelection();
        if(evt.getStateChange() == ItemEvent.SELECTED){
            txtLog.setText("");
            txtLog.append("\r\n==== Please Select Menu Category to update" + "\r\n\r\n");
        } else{
            txtLog.setText("");
            txtLog.append("\r\n==== Ready to update Selected Memu" + "\r\n\r\n");
        }
        CHECK_Allow();
    }//GEN-LAST:event_chkByCategoryItemStateChanged

    private void Load_Env(){
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
        Get_AP3_TKN_and_UserID();

        if (env.equals("PR")) {
            DefaultListModel<String> listmodel = new DefaultListModel<>();
            listSector.setModel(listmodel);
            listmodel.addElement("Pilot Sector/US ID: AXqLKdPK53uozRZKgkjOh0GOOXoBJAH1klp4QymZUvBPDBkarLSEqeewez5Kf3D1O1D2vBh83EXQ"); 
            listmodel.addElement("Eurest Internal Brands/US  ID: 41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G"); 
            txtLog.setText("");
            txtLog.append("\r\n==== Please select Sector (Production!)" + "\r\n\r\n");

            listSector.setModel(listmodel);
            lblS.setText("Sectors/Groups: " + listSector.getModel().getSize());
        } else{
            Get_Sector();   
        }


    }
    private void Get_AP3_TKN_and_UserID(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        String Auth = "Basic " + Base64.getEncoder().encodeToString((txtAP3_ID.getText() + ":" + txtAP3_PW.getText()).getBytes());
        Api_Call("GET", BaseAPI + "/user/auth" + "?realm=" + "6MNvqeNgGWSLAv4DoQr7CaKzaNGZl5", Auth, "");
        if(json != null){ 
            try {
                if(json.has("user")) {
                    AP3_User_ID = json.getString("user");
                } 
                if(json.has("token")) {
                    AP3_TKN = json.getString("token");
                } 
            } catch (Exception ex){
                txtLog.setText("");
                txtLog.append(json.toString(4) + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            }
        }
        AAA = Get_UUID();
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private String Get_UUID(){
        //return UUID.randomUUID().toString().replace("-", "");
        return RandomStringUtils.random(85, true, true);
    }

    private void Load_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Load = true;
        String C = "";
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            String SQL = "SELECT [_conf] FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'V1'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            rs.next();
            C = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            CONFIG = false;
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            return;
        }
        //String[] lines = C.split(System.getProperty("line.separator"));  
        String[] lines = C.split("\n");  
        String value;
        try {
            for (String l : lines) {
                value = l.substring(l.indexOf(" ")).trim();
                if (l.contains("env: ")) env = value;
                if (l.contains("ADMIN_ID: ")) txtAP3_ID.setText(value);           
                if (l.contains("ADMIN_PW: ")) txtAP3_PW.setText(value);
                if (l.contains("ByCategory: ")) chkByCategory.setSelected(Boolean.parseBoolean(value));
                if (l.contains("Remove: ")) chkRemove.setSelected(Boolean.parseBoolean(value));
            }

            if(env.equals("DE")){
                cmbEnv.setSelectedIndex(0); // delevopment
            }else if(env.equals("ST")){
                cmbEnv.setSelectedIndex(1); // Staging
            }else{
                cmbEnv.setSelectedIndex(2); // Production
            }
            CONFIG = true;
            txtLog.append("==== LOAD_CONFIG > OK" + "\r\n");
            txtLog.append("\r\n==== Please select Sector (" + cmbEnv.getSelectedItem().toString() + ")\r\n\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        } catch (Exception ex) {
            CONFIG = false;
            txtLog.append("=== LOAD_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        Load = false;
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    private void Save_CONFIG() {
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String C = "";
        String _S = "n/a";
        String _B = "n/a";
        try {
            C = "";
            C += "env: " + env + "\r\n";
            C += "ADMIN_ID: " + txtAP3_ID.getText() + "\r\n";
            C += "ADMIN_PW: " + txtAP3_PW.getText() + "\r\n";
            C += "ByCategory: " + chkByCategory.isSelected() + "\r\n";
            C += "Remove: " + chkRemove.isSelected() + "\r\n";
        } catch (Exception ex) {
            txtLog.append("=== SAVE_CONFIG > ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            return;
        }

        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            String SQL = "DELETE FROM [dbo].[a_config] WHERE [user_id] = '" + A.A.UserID + "' AND [platform] = 'WEB' AND [app] = 'V1'";
            Statement _del = conn.createStatement();
            _del.execute(SQL);
            PreparedStatement _insert = conn.prepareStatement("INSERT INTO [dbo].[a_config]"
                    + "([user_id]"
                    + // 1
                    ",[env]"
                    + // 2
                    ",[platform]"
                    + // 3
                    ",[app]"
                    + // 4
                    ",[_conf]"
                    + // 5
                    ") VALUES ("
                    + "?"
                    + ",?"
                    + ",?"
                    + ",?"
                    + ",?"
                    + ")");
            _insert.setString(1, A.A.UserID);
            _insert.setString(2, env);
            _insert.setString(3, "WEB");
            _insert.setString(4, "V1");
            _insert.setString(5, C);
            int row = _insert.executeUpdate();
            txtLog.append("=== SAVE_CONFIG > OK (" + row + " row)" + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
            conn.close();
        } catch (SQLException ex) {
            txtLog.append("=== SAVE_CONFIG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength());
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }
    private void DB_LOG(){
        String SectorName = listSector.getSelectedValue().toString();
        SectorName = SectorName.substring(0, SectorName.lastIndexOf("ID:")).trim();

        String CompanyName = listCompanies.getSelectedValue().toString();
        CompanyName = CompanyName.substring(0, CompanyName.lastIndexOf("ID:")).trim();

        String MenuName = listMenus.getSelectedValue().toString();
        MenuName = MenuName.substring(0, MenuName.lastIndexOf("ID:")).trim();

        String CategoryName = "";
        if(chkByCategory.isSelected()){
            CategoryName = listItems.getSelectedValue().toString();
            CategoryName = ", " + CategoryName.substring(CategoryName.indexOf("== ") + 3, CategoryName.lastIndexOf("ID:")).trim();
        }
        String Done = "Done: " + 
            DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB" +
            " > " + DEC_FORMAT.format((double) PutMenu_Size / (1024*1024)) + " " + "MB";


        String Scope = env + " Sector: " + SectorName +  ", Company: " + CompanyName + ", Menu: " + MenuName + CategoryName;
        String LOG = 
                Scope + "\r\n\r\n" 
                + "Remove existing Mod Groups < " + txtMod1.getText() + " " + txtMod2.getText() + " > : " + chkRemove.isSelected() + "\r\n"
                + "Update by selected Category: " + chkByCategory.isSelected() + "\r\n\r\n"

                + "   === Original Menu (GET) size: " 
                + DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB" +"\r\n"
                + "   === Updated Menu (PUT) size: " 
                + DEC_FORMAT.format((double) PutMenu_Size / (1024*1024)) + " " + "MB" +"\r\n\r\n" +

                "Menu Gategoryes with the same name(s) as requested Mod Groups - excluded from the update";

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
            _insert.setString(3, "V1 Menus - Mods update");
            _insert.setString(4, BaseAPI);
            _insert.setString(5, Scope);
            _insert.setString(6, "0");
            _insert.setString(7, "0");
            _insert.setString(8, "0");
            _insert.setString(9, "0");
            _insert.setString(10, "0");
            _insert.setString(11, "0");
            _insert.setString(12, "Manual");
            _insert.setString(13, A.A.UserID);
            _insert.setString(14, A.A.WsID);
            _insert.setString(15, env);
            _insert.setString(16, LOG); 
            _insert.setString(17, Done);
            _insert.setString(18, "None");
            int row = _insert.executeUpdate();
            conn.close();
        }  catch (SQLException ex) {
            txtLog.append( "= DB_LOG > SQL ERROR: " + ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }

    private void CHECK_Allow(){
        if(ALLOW){
            if(listMenus.getSelectedIndex() > -1 ){
                btnRun.setEnabled(true);
            }   
            if(chkByCategory.isSelected()){
                if(listItems.getSelectedIndex() > -1 ){
                    btnRun.setEnabled(true);
                }else{
                    btnRun.setEnabled(false);
                } 
            }           
        } else{
            btnRun.setEnabled(false);
        }
    }
                              
    private void Api_Call(String Method, String EndPoint, String AUTH, String BODY) {
        String Result = "?";
        int status = 0;
        String ErrorMsg = "";
        json = null;
        RequestSpecification request;
        request = RestAssured.given();
        if (!AUTH.isEmpty()) {
            request.header("Authorization", AUTH);
        }
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");
        try {
            Response response = null;
            switch (Method) {
                case "GET":
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

            if (response.asString().startsWith("{") && response.asString().endsWith("}")) {
                json = new JSONObject(response.asString());
            }else{
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            }       
        } catch (Exception ex) {
           FAILED += EndPoint + "\r\n" + err + ")\r\n\r\n";
           this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
        }
    }

    private void Get_Sector(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));  
        txtLog.setText("");
        txtLog.append("Get_Sectors @" + new Date() + "\r\n\r\n");
        txtLog.setCaretPosition(0);

        DefaultListModel<String> listmodel = new DefaultListModel<>();
        listSector.setModel(listmodel);

        Api_Call("GET", BaseAPI + "/location/sector?_provider=cdl", "Bearer " + AP3_TKN, "");
        try{
            String M_line = "";
            if(json != null && json.has("sectors")){
                JSONArray sectors = json.getJSONArray("sectors");
                for(int i = 0; i < sectors.length(); i++){
                    JSONObject sector = sectors.getJSONObject(i);
                    if(sector.has("name")){
                        M_line = sector.getString("name");
                        M_line += "                            ID: " + sector.getString("id");
                        listmodel.addElement(M_line);  
                    }
                }
                txtLog.setText("");
                txtLog.append("\r\n==== Please select Sector (" + cmbEnv.getSelectedItem().toString() + ")\r\n\r\n");
            } else{
                txtLog.append("\r\n");
                txtLog.append("\r\n==== No Sectors Found" + "\r\n\r\n");
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
        lblC.setText("Companies - ?");
        lblM.setText("Menus - ?");
        lblI.setText("Categories/Item - ?");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Comp(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));  
        txtLog.setText("");
        txtLog.append("Get_Companies/Global Menus @" + new Date() + "\r\n\r\n");
        txtLog.setCaretPosition(0);

        DefaultListModel<String> listmodel = new DefaultListModel<String>();
        listCompanies.setModel(listmodel);

        //SectorID = "41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G";
        if(listSector.getSelectedIndex() < 0){
            txtLog.setText("");
            txtLog.append("\r\n==== Please Select Sector" + "\r\n\r\n");
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }else{
            SectorID = listSector.getSelectedValue().toString();
            SectorID = SectorID.substring(SectorID.lastIndexOf(" ")).trim();
        }
        Api_Call("GET", BaseAPI + "/location/sector/" + SectorID, "Bearer " + AP3_TKN, "");

        try{
            String M_line = "";
            if(json != null && json.has("companies")){
                companies = json.getJSONArray("companies");
                txtLog.setText("");
                txtLog.append("\r\n==== Please Select Company");
                txtLog.setCaretPosition(0);

                for(int i = 0; i < companies.length(); i++){
                    JSONObject copmpany = companies.getJSONObject(i);
                    if(copmpany.has("name")){ // && !menu.has("location_brand")){
                        M_line = copmpany.getString("name");
                        M_line += "                            ID: " + copmpany.getString("id");
                        listmodel.addElement(M_line);  
                    }
                }
                listCompanies.setModel(listmodel);
                txtLog.setText("");
                txtLog.append("\r\n==== Please Select Company" + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            } else{
                txtLog.setText("");
                txtLog.append(json.toString(4) + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
        lblC.setText("Companies: " + listCompanies.getModel().getSize());
        lblM.setText("Menus - ?");
        lblI.setText("Categories/Item - ?");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Company_Menus(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
//        txtLog.setText("");
//        txtLog.append("Get Menus @" + new Date() + "\r\n\r\n");
//        txtLog.setCaretPosition(0);

        DefaultListModel<String> listmodel = new DefaultListModel<String>();
        listMenus.setModel(listmodel);

        if(listCompanies.getSelectedIndex() < 0){
            txtLog.setText("");
            txtLog.append("\r\n==== Please Select Company" + "\r\n\r\n");
            txtLog.setCaretPosition(0);
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }else{
            CompID = listCompanies.getSelectedValue().toString();
            CompID = CompID.substring(CompID.lastIndexOf(" ")).trim();
        }

        Api_Call("GET", BaseAPI + "/menu/company/" + CompID, "Bearer " + AP3_TKN, "");
        try{
            String M_line = "";
            if(json != null && json.has("menus")){
                //txtLog.append(json.toString(4) + "\r\n"); 
                menus = json.getJSONArray("menus");
                for(int i = 0; i < menus.length(); i++){
                    JSONObject menu = menus.getJSONObject(i);
                    if(menu.has("label") && menu.getJSONObject("label").has("en") && !menu.has("location_brand")){
                        M_line = menu.getJSONObject("label").getString("en");
                        M_line += "                            ID: " + menu.getString("id");
                        if(menu.has("meta") && menu.getJSONObject("meta").has("version") && menu.getJSONObject("meta").getNumber("version").equals(2)){
                            //listmodel.addElement(I_line);
                        } else{
                            listmodel.addElement(M_line); // v1 menu
                        }
                    }
                }
                listMenus.setModel(listmodel);
                txtLog.setText("");
                txtLog.append("\r\n==== Please Select Menu" + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            }else{
                txtLog.setText("");
                txtLog.append(json.toString(4));
                txtLog.setCaretPosition(0);
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
        //txtLog.append("\r\n === Menu Json >>>\r\n " + json.toString(4) + "\r\n\r\n");
        lblM.setText("v1 Menus: " + listMenus.getModel().getSize()); 
        lblI.setText("Categories/Item - ?");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Full_Menu(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        txtLog.setText("");
        txtLog.append("Get Items @" + new Date() + "\r\n\r\n");
        txtLog.setCaretPosition(0);

        btnRun.setEnabled(false);

        int tot_items = 0;
        int tot_cats = 0;
        DefaultListModel<String> listmodel = new DefaultListModel<String>();
        listItems.setModel(listmodel);

        //SectorID = "41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G";
        if(listMenus.getSelectedIndex() < 0){
            txtLog.setText("");
            txtLog.append("\r\n==== Please Select Menu" + "\r\n\r\n");
            txtLog.setCaretPosition(0);

            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }else{
            MenuID = listMenus.getSelectedValue();
            MenuID = MenuID.substring(MenuID.lastIndexOf(" ")).trim();
        }

        Api_Call("GET", BaseAPI + "/menu/" + MenuID + "?nocache=true&extended=true&show_unlinked=false", "Bearer " + AP3_TKN, "");
        try{
            String G_line = "";
            String I_line = "";
            if(json != null && json.has("groups")){
                getMenu = json;
                putMenu = json;
                //txtLog.append(json.toString(4) + "\r\n"); 
                groups = json.getJSONArray("groups");
                for(int i = 0; i < groups.length(); i++){
                    tot_cats += groups.length();
                    JSONObject group = groups.getJSONObject(i);
                    if(group.has("label") && group.getJSONObject("label").has("en")){
                        G_line = "== Category: " + group.getJSONObject("label").getString("en");
                        G_line += "                            ID: " + group.getString("id");
                        listmodel.addElement(G_line);
                        if(group.has("items")){
                            items = group.getJSONArray("items");
                            tot_items += items.length();
                            for(int j = 0; j < items.length(); j++){
                                JSONObject item = items.getJSONObject(j);
                                if(item.has("label") && item.getJSONObject("label").has("en")){
                                    I_line = item.getJSONObject("label").getString("en");
                                    I_line += "                            ID: " + item.getString("id");
                                    listmodel.addElement(I_line);
                                }
                            }
                            listItems.setModel(listmodel);
                        }
                    }
                }
                txtLog.setText("");
                if(chkByCategory.isSelected()){
                    txtLog.append("\r\n==== Please Select Menu Category to update" + "\r\n\r\n");
                }else{
                    //txtLog.append(json.toString(4));
                    CHECK_Allow();
                }                         
                txtLog.setCaretPosition(0);
            }else{
                lblI.setText("Total Items: " + tot_items);
                txtLog.setText("");
                txtLog.append(json.toString(4));
                txtLog.setCaretPosition(0);
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
        lblI.setText("Categories: " + tot_cats + " Total Items: " + tot_items);
        //txtLog.append("\r\n === Menu Json >>>\r\n " + json.toString(4) + "\r\n\r\n");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }

    private void Publish_Menu(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        txtLog.setText("");
        String putMenuID = "";
        String gzipped = "";
        String[] lines;

        // === Create Berage and Snacks object arrays
        Mods1 = new JSONArray();
        Mods2 = new JSONArray();
        ModGr1 = new JSONObject();
        ModGr2 = new JSONObject();

        JSONObject mod;
        JSONObject tempObj;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date _ee = new DateTime(new Date()).toDate();
        String Date_Modified = sdf.format(_ee); 

        try {
            GetMenu_Size = putMenu.toString().getBytes().length; 

            // <editor-fold defaultstate="collapsed" desc="=== 1st Mods Oblect ">
            if(!txtMod1.getText().trim().isEmpty()){
                lines = txtMods1.getText().split("\n"); 
                for (String l : lines){
                    mod = new JSONObject();
                    tempObj = new JSONObject();
                    tempObj.put("disabled", false);
                    mod.put("is", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("plu", l.substring(0, l.indexOf("\t")).trim());
                    mod.put("meta", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("en", l.substring(l.indexOf("\t")).trim());
                    mod.put("label", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("amount", 0);
                    mod.put("price", tempObj);

                    Mods1.put(mod); 
                }
                tempObj = new JSONObject();
                tempObj.put("disabled", false);
                ModGr1.put("is", tempObj);

                //ModGr1.put("unique_name", "");

                tempObj = new JSONObject();
                tempObj.put("en", txtMod1.getText().trim());
                ModGr1.put("label", tempObj);

                ModGr1.put("items", Mods1);
            }
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="=== 2nd Mods Oblect ">
            if(!txtMod2.getText().trim().isEmpty()){
                lines = txtMods2.getText().split("\n"); 
                for (String l : lines){
                    mod = new JSONObject();
                    tempObj = new JSONObject();
                    tempObj.put("disabled", false);
                    mod.put("is", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("plu", l.substring(0, l.indexOf("\t")).trim());
                    mod.put("meta", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("en", l.substring(l.indexOf("\t")).trim());
                    mod.put("label", tempObj);

                    tempObj = new JSONObject();
                    tempObj.put("amount", 0);
                    mod.put("price", tempObj);

                    Mods2.put(mod); 
                }
                tempObj = new JSONObject();
                tempObj.put("disabled", false);
                ModGr2.put("is", tempObj);

                //ModGr2.put("unique_name", "");

                tempObj = new JSONObject();
                tempObj.put("en", txtMod2.getText().trim());
                ModGr2.put("label", tempObj);

                ModGr2.put("items", Mods2);
            }
            // </editor-fold> 

            // <editor-fold defaultstate="collapsed" desc="=== Create PUT Json from Full GET">

            // === Update LastUser, modified and published dates
            if(putMenu.has("date") && putMenu.getJSONObject("date").has("modified")){
                putMenu.getJSONObject("date").remove("modified");
                putMenu.getJSONObject("date").put("modified", Date_Modified);
            }
            if(putMenu.has("date") && putMenu.getJSONObject("date").has("published")){
                putMenu.getJSONObject("date").remove("published");
                putMenu.getJSONObject("date").put("published", Date_Modified);
            }
            if(putMenu.has("meta") && putMenu.getJSONObject("meta").has("last_modified_user")){
                putMenu.getJSONObject("meta").remove("last_modified_user");
                putMenu.getJSONObject("meta").put("last_modified_user", AP3_User_ID);
            }

            // for each existing groups > item check/remove ModX, add options new ModX/Items
            if(putMenu.has("groups")){
                JSONArray options = new JSONArray(); 
                groups = json.getJSONArray("groups");
                for(int i = 0; i < groups.length(); i++){
                    JSONObject group = groups.getJSONObject(i);

                    boolean Include_Group = true;
                    String GR_Name = group.getJSONObject("label").getString("en").trim();
                    if(GR_Name.equals(txtMod1.getText().trim()) || GR_Name.equals(txtMod2.getText().trim())) {
                        Include_Group = false;
                    }

                    if(chkByCategory.isSelected()){
                        String CategoryName = ""; 
                        CategoryName = listItems.getSelectedValue().toString();
                        CategoryName = CategoryName.substring(CategoryName.indexOf("== Category: ") + 13, CategoryName.lastIndexOf("ID:")).trim();
                        if(!GR_Name.equals(CategoryName)) {
                            Include_Group = false;
                        }
                    }

                    if(group.has("items") && Include_Group){ 
                        items = group.getJSONArray("items");
                        for(int j = 0; j < items.length(); j++){
                            JSONObject item = items.getJSONObject(j);
                            if(item.has("options")){
                                newOptions = new JSONArray();
                                options = item.getJSONArray("options");

                                if(chkRemove.isSelected()){ 
                                    for(int k = 0; k < options.length(); k++){
                                        JSONObject option = options.getJSONObject(k);
                                        if(!option.getJSONObject("label").getString("en").equals(txtMod1.getText().trim())
                                            && !option.getJSONObject("label").getString("en").equals(txtMod2.getText().trim())){
                                            newOptions.put(option);
                                        }
                                    }
                                    item.remove("options");
                                    item.put("options", newOptions);
                                    options = item.getJSONArray("options");
                                }

                                if(!ModGr1.isEmpty()){
                                    options.put(ModGr1);
                                }
                                if(!ModGr2.isEmpty()){
                                    options.put(ModGr2);
                                } 
                            }
                        }
                    }
                }
            }
            // </editor-fold> 


            txtLog.append("\r\n== Select GET Menu Json size: >> " + DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB" + "\r\n");
            
            PutMenu_Size = putMenu.toString().getBytes().length; 
            txtLog.append("\r\n== Prepared PUT Menu Json size: >> " + DEC_FORMAT.format((double) PutMenu_Size / (1024*1024)) + " " + "MB" + "\r\n\r\n");

//            txtLog.append("== Publish > PUT Body un-zipped >> \r\n\r\n" + putMenu.toString(4) + "\r\n\r\n");
//            txtLog.setCaretPosition(0);  

            // <editor-fold defaultstate="collapsed" desc="=== Warning / COnfirmation ">
            String SectorName = listSector.getSelectedValue().toString();
            SectorName = SectorName.substring(0, SectorName.lastIndexOf("ID:")).trim();

            String CompanyName = listCompanies.getSelectedValue().toString();
            CompanyName = CompanyName.substring(0, CompanyName.lastIndexOf("ID:")).trim();

            String MenuName = listMenus.getSelectedValue().toString();
            MenuName = MenuName.substring(0, MenuName.lastIndexOf("ID:")).trim();

            String CategoryName = "";
            if(chkByCategory.isSelected()){
                CategoryName = listItems.getSelectedValue().toString();
                CategoryName = "\r\n" + "   " + CategoryName.substring(CategoryName.indexOf("== ") + 3, CategoryName.lastIndexOf("ID:")).trim();
            }
            Object[] options = {"Yes", "No"};
            int reply = JOptionPane.showOptionDialog(this,
                "Are you sure to update in " + cmbEnv.getSelectedItem().toString() + "? >>\r\n" +
                    "\r\n" + "   Sector: " + SectorName + 
                    "\r\n" + "   Company: " + CompanyName + 
                    "\r\n" + "   Menu: " + MenuName + 
                    CategoryName + "\r\n\r\n"

                + "   === Original Menu (GET) size: " 
                + DEC_FORMAT.format((double) GetMenu_Size / (1024*1024)) + " " + "MB" +"\r\n"
                + "   === Updated Menu (PUT) size: " 
                + DEC_FORMAT.format((double) PutMenu_Size / (1024*1024)) + " " + "MB" +"\r\n\r\n"

                + "Remove existing Mod Groups < " + txtMod1.getText() + " " + txtMod2.getText() + " > : " + chkRemove.isSelected() + "\r\n"
                + "Update by selected Category: " + chkByCategory.isSelected() + "\r\n\r\n" +

                "Menu Categories with the same name(s) as requested Mod Groups excluded from the update\r\n",

                "Menu - update Modifiers",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                "No"); 
            if (reply == 1){
                this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
                return;
            }
            // </editor-fold> 

            ByteArrayOutputStream byteOutStream = new ByteArrayOutputStream();
            GZIPOutputStream gzipOutStream = new GZIPOutputStream(byteOutStream);
            gzipOutStream.write(putMenu.toString().getBytes());
            IOUtils.closeQuietly(gzipOutStream);
            byte[] bytes = byteOutStream.toByteArray();
            gzipped = Base64.getEncoder().encodeToString(bytes);

            // === Publish Menu
            putMenuID = putMenu.getString("id");
            Api_Call("PUT", BaseAPI + "/menu/" + putMenuID, "Bearer " + AP3_TKN, gzipped);

            DB_LOG();
            //Get_Full_Menu();                          // refresh PUT Menu after PUT/Publish

            if(json != null){
                txtLog.setText("");
                txtLog.append("\r\n== Publish > PUT Json >> \r\n\r\n" + putMenu.toString(4) + "\r\n\r\n");
                txtLog.setCaretPosition(0);
            }

        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
            txtLog.setCaretPosition(0);
        }
        btnRun.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR)); 
    }

    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnSave_Opt;
    private javax.swing.JCheckBox chkByCategory;
    private javax.swing.JCheckBox chkRemove;
    private javax.swing.JComboBox<String> cmbEnv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblI;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblMetrics1;
    private javax.swing.JLabel lblMetrics2;
    private javax.swing.JLabel lblS;
    private javax.swing.JList<String> listCompanies;
    private javax.swing.JList<String> listItems;
    private javax.swing.JList<String> listMenus;
    private javax.swing.JList<String> listSector;
    private javax.swing.JTextField txtAP3_ID;
    private javax.swing.JTextField txtAP3_PW;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMod1;
    private javax.swing.JTextField txtMod2;
    private javax.swing.JTextArea txtMods1;
    private javax.swing.JTextArea txtMods2;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
