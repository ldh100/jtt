package V1;

import A.Func;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import org.json.JSONArray;
import org.json.JSONObject;

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

        lblMetrics = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtModsS = new javax.swing.JTextArea();
        lblMetrics1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtModsB = new javax.swing.JTextArea();
        lblMetrics2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        lblMetrics3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listSector = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        listCompanies = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        listMenus = new javax.swing.JList<>();
        lblMetrics4 = new javax.swing.JLabel();
        chkV1_Only = new javax.swing.JCheckBox();
        txtMods2 = new javax.swing.JTextField();
        txtMods1 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        listItems = new javax.swing.JList<>();
        lblMetrics5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Production V1 Menus updata\\e");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("V1"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
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

        lblMetrics.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics.setText("Company > Global V1 Menus: Name, ID");
        lblMetrics.setAlignmentX(0.5F);

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        txtModsS.setEditable(false);
        txtModsS.setColumns(20);
        txtModsS.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtModsS.setRows(5);
        txtModsS.setText("700029\tWhole Fruit\n700030\tSnickers Bar 1.8oz\n700031\tM&m Peanut 1.74oz\n700032\tReese Peanut Butter Cups 1.5oz\n700033\tDoritos Nacho Cheese 1.75oz\n700034\tMiss Vickie's Jalapeno\n700035\tTwix 1.79oz\n700036\tLays Plain 1.5oz\n700037\tNature Valley Crunchy Oats 'N Honey 1.49oz\n700038\tBar Nutri Grain Strawberry 1.3oz\n700039\tChip Baked Lays BBQ 1.5oz\n700040\tBar Kind Caramel Almond & Sea Salt 1.4oz\n700041\tSahale Honey Glazed Almonds 1.5oz\n700042\tOrchard Valley Keto Crunchy Trail Mix 1.85oz\n700043\tChip Terra Blue Potato Chips 1oz\n700044\tCheez Its Whole Grain 1oz\n700045\tBar Kind Dark Chocolate Nuts/Sea Salt 1.4oz\n700046\tRX Bar Blueberry 1.83oz\n700047\tNutri Grain Bar Apple Cinnamon 1.3oz\n700048\tMiss Vickie's Bbq 1 3/8oz\n700049\tM&m Plain 1.69oz\n700050\tSun Harvest Cheddar 1.5oz\n700051\tMiss Vickie's Sea Salt Vin 1 3/8oz\n700052\tHershey Milk Chocolate\n700053\tNabisco Belvita Blueberry 1.76oz\n700054\tSmartfood White Cheddar Popcorn .625oz\n700055\tSahale Dry Roasted Almonds 1.5oz\n700056\tOrchard Valley Harvest Omega-3 Mix 2oz\n700057\tFSTG Multigrain Tortilla Chips 1.5oz\n700058\tBaked Lays Plain 1.125oz");
        txtModsS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModsS.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtModsS.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane2.setViewportView(txtModsS);

        lblMetrics1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMetrics1.setText("Mods: PLU /t Name");
        lblMetrics1.setAlignmentX(0.5F);

        txtModsB.setColumns(20);
        txtModsB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtModsB.setRows(5);
        txtModsB.setText("700000\tClassic Coke 20oz\n700001\tDiet Coke 20oz\n700002\tCoke Zero 20oz\n700003\tPepsi 20oz\n700004\tDiet Pepsi 20oz\n700005\tMountain Dew 20oz\n700006\tDiet Mountain Dew 20oz\n700007\tSprite 20oz\n700008\tDiet Sprite 20oz\n700009\tAquafina 20oz\n700010\tDasani 20oz\n700011\tSmartwater 20oz\n700012\tLifewater 20oz\n700013\tVitamin Water Power C\n700014\tVitamin Water Zero Sugar Squeezed\n700015\tMonster Energy 16oz\n700016\tMonster Zero Ultra 16oz\n700017\tPure Leaf Diet Tea\n700018\tPure Leaf Sweet Tea\n700019\tGatorade Fruit Punch\n700020\tGatorade Zero Glacier\n700021\tStarbucks Cold Brew\n700022\tStarbucks Frappuccino Vanilla\n700023\tBubly Lime\n700024\tBubly Grapefruit\n700025\tBubly Cherry\n700026\tBubly Orange\n700027\tBubly Lemon\n700028\tBubly Black Cherry");
        txtModsB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModsB.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtModsB.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane4.setViewportView(txtModsB);

        lblMetrics2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMetrics2.setText("Mods: PLU /t Name");
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
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });

        lblMetrics3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics3.setText("Target Sectors: Name, ID");
        lblMetrics3.setAlignmentX(0.5F);

        listSector.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listSector.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pilot Sector/US ID: AXqLKdPK53uozRZKgkjOh0GOOXoBJAH1klp4QymZUvBPDBkarLSEqeewez5Kf3D1O1D2vBh83EXQ", "Eurest Internal Brands/US  ID: 41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
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

        lblMetrics4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics4.setText("Selected Sector > Companies: Name, ID");
        lblMetrics4.setAlignmentX(0.5F);

        chkV1_Only.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        chkV1_Only.setSelected(true);
        chkV1_Only.setText("Only v1 Menus");
        chkV1_Only.setFocusPainted(false);

        txtMods2.setText("Snacks");
        txtMods2.setDragEnabled(false);

        txtMods1.setText("Beverage");
        txtMods1.setDragEnabled(false);

        listItems.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        listItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listItemsValueChanged(evt);
            }
        });
        jScrollPane9.setViewportView(listItems);

        lblMetrics5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics5.setText("Selected Menu > Items: Name, ID");
        lblMetrics5.setAlignmentX(0.5F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMods1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(lblMetrics2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMods2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblMetrics1))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(chkV1_Only))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblMetrics4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblMetrics3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(lblMetrics, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMetrics5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMetrics3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMetrics)
                        .addComponent(lblMetrics5)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblMetrics4)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMods1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblMetrics2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMods2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblMetrics1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(chkV1_Only)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRun, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String err = "";
    private String FAILED = "";
    private JSONObject json;
    private JSONArray companies;
    private JSONArray menus;
    private JSONArray groups;
    private JSONArray items;
    private final String BaseAPI = "https://api.compassdigital.org/v1";
    private String AP3_TKN = "";
    private String SectorID = "";
    private String CompID = "";
    private String MenuID = "";
    private String ItemID = "";

    private void btnRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRunMouseClicked
        if(!btnRun.isEnabled()){
            return;
        }
    }//GEN-LAST:event_btnRunMouseClicked
    
//<editor-fold defaultstate="collapsed" desc="JWT">    
//    private void Z_JWT(){
//        try{
//            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
//            long nowMillis = System.currentTimeMillis();
//            Date now = new Date(nowMillis);
//            String Z_Base_URL = "https://prod-api.zephyr4jiracloud.com/connect/"; 
//            String id = "5a68ac8fd57c332a76e1a9c9"; // oleg.spozito@compassdigital.io
//            String A_Key = "amlyYTo4YWU2N2I0MC0xNThhLTQzYWQtYjEyMi0wMGMwMTc2MjZiMjMgNWE2OGFjOGZkNTdjMzMyYTc2ZTFhOWM5IFVTRVJfREVGQVVMVF9OQU1F";
//            String S_Key = "bl-AwwkFeqRNcbPrL91ypPsNj-whyXxdwOeBcJRBlRc";
//
//            
//            String subject = "subject";
//            String issuer = "issuer";
//            
//
//            
//            //We will sign our JWT with our ApiKey secret
//            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(S_Key);
//            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
//
//            //Let's set the JWT Claims
//            JwtBuilder builder = Jwts.builder().setId(id)
//                                        .setIssuedAt(now)
//                                        .setSubject(subject)
//                                        .setIssuer(issuer)
//                                        .signWith(signatureAlgorithm, signingKey);
//            long expMillis = nowMillis + 600000;
//            Date exp = new Date(expMillis);
//            builder.setExpiration(exp);
//
//            //Builds the JWT and serializes it to a compact, URL-safe string
//            String JWT = builder.compact();  
//            ParseJWT(JWT);
//        } catch(Exception ex){
//            txtLog.append("Z_JWT: " + ex.getMessage() + "\r\n"); 
//            txtLog.setCaretPosition(txtLog.getDocument().getLength());               
//        }
//    }
//    private void ParseJWT(String jwt) {
//        //This line will throw an exception if it is not a signed JWS (as expected)
//        try {
//            Claims claims = Jwts.parser()         
//                .setSigningKey(DatatypeConverter.parseBase64Binary("QH827PyS_3vJ25hK6YhKCx3OKOCXEtc3B9F6wP_x1Pc"))
//                .parseClaimsJws(jwt).getBody();
//             System.out.println("ID: " + claims.getId());
//             System.out.println("Subject: " + claims.getSubject());
//             System.out.println("Issuer: " + claims.getIssuer());
//             System.out.println("Expiration: " + claims.getExpiration());
//        } catch(Exception ex){
//            txtLog.append("ParseJWT: " + ex.getMessage() + "\r\n"); 
//            txtLog.setCaretPosition(txtLog.getDocument().getLength());             
//        }         
//     }    
//    static String getQSH(String qstring)
//    {
//        System.Security.Cryptography.SHA256Managed crypt = new System.Security.Cryptography.SHA256Managed();
//        StringBuilder hash = new StringBuilder();
//        byte[] crypto = crypt.ComputeHash(Encoding.UTF8.GetBytes(qstring), 0, Encoding.UTF8.GetByteCount(qstring));
//        foreach (byte theByte in crypto)
//        {
//            hash.Append(theByte.ToString("x2"));
//        }
//        return hash.ToString();
//    }
     //</editor-fold>
 
    private void btnLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogMouseClicked
        String R = A.Func.SHOW_FILE(txtLog.getText(), "json");
//        if(!R.equals("OK")){
//            txtLog.append(R + "\r\n");
//            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
//        }
    }//GEN-LAST:event_btnLogMouseClicked

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        Get_AP3_TKN();
        txtLog.setText("");
        txtLog.append("\r\n==== Please select Sector" + "\r\n\r\n");
    }//GEN-LAST:event_formAncestorAdded

    private void listSectorValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listSectorValueChanged
//        if(!evt.getValueIsAdjusting()) {
            Get_Comp();
//        }
    }//GEN-LAST:event_listSectorValueChanged

    private void listCompaniesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCompaniesValueChanged
//        if(!evt.getValueIsAdjusting()) {
            Get_Menus();
//        }
    }//GEN-LAST:event_listCompaniesValueChanged

    private void listMenusValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listMenusValueChanged
        Get_Items();
    }//GEN-LAST:event_listMenusValueChanged

    private void listItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listItemsValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listItemsValueChanged
    private void Get_AP3_TKN(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));         
        try (Connection conn = DriverManager.getConnection(A.A.QA_BD_CON_STRING)) {
            ResultSet rs = conn.createStatement().executeQuery("SELECT [ap_token] FROM [dbo].[env] WHERE [DESCRIPTION] = '" + "Production" + "'");
            rs.next();
            AP3_TKN = rs.getString(1);
            conn.close();
        } catch (SQLException ex) {
            txtLog.setText("");
            txtLog.append( "= AP3_TKN > ERROR: " + ex.getMessage() + "\r\n");
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Comp(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR));  
        txtLog.setText("");
        txtLog.append("Get_Companies/Global Menus @" + new Date() + "\r\n\r\n");

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
                txtLog.append("\r\n==== Selected Sector > Total Global Mnenus/Companies: " + companies.length() + "\r\n");
                txtLog.append("\r\n==== Please Select Company");
                for(int i = 0; i < companies.length(); i++){
                    JSONObject copmpany = companies.getJSONObject(i);
                    if(copmpany.has("name")){ // && !menu.has("location_brand")){
                        M_line = copmpany.getString("name");
                        M_line += "      ID: " + copmpany.getString("id");
                        listmodel.addElement(M_line);  
                    }
                }
                listCompanies.setModel(listmodel);
            } else{
                txtLog.setText("");
                txtLog.append(json.toString(4) + "\r\n\r\n");
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
        }
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Menus(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        txtLog.setText("");
        txtLog.append("Get Menus @" + new Date() + "\r\n\r\n");

        DefaultListModel<String> listmodel = new DefaultListModel<String>();
        listMenus.setModel(listmodel);

        //SectorID = "41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G";
        if(listCompanies.getSelectedIndex() < 0){
            txtLog.setText("");
            txtLog.append("==== Please Select Company" + "\r\n\r\n");
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
                txtLog.append(json.toString(4) + "\r\n"); 
                menus = json.getJSONArray("menus");
                for(int i = 0; i < menus.length(); i++){
                    JSONObject menu = menus.getJSONObject(i);
                    if(menu.has("label") && menu.getJSONObject("label").has("en") && !menu.has("location_brand")){
                        M_line = menu.getJSONObject("label").getString("en");
                        M_line += "      ID: " + menu.getString("id");
                        if(!chkV1_Only.isSelected()){
                            listmodel.addElement(M_line);
                        } else {
                            if(menu.has("meta") && menu.getJSONObject("meta").has("version") && menu.getJSONObject("meta").getNumber("version").equals(2)){
                                //listmodel.addElement(I_line);
                            } else{
                                listmodel.addElement(M_line); // v1 menu
                            }
                        }
                    }
                }
                listMenus.setModel(listmodel);
            }else{
                txtLog.setText("");
                txtLog.append(json.toString(4));
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
        }
        //txtLog.append("\r\n === Menu Json >>>\r\n " + json.toString(4) + "\r\n\r\n");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
    }
    private void Get_Items(){
        this.setCursor(Cursor.getPredefinedCursor (Cursor.WAIT_CURSOR)); 
        txtLog.setText("");
        txtLog.append("Get Items @" + new Date() + "\r\n\r\n");

        DefaultListModel<String> listmodel = new DefaultListModel<String>();
        listItems.setModel(listmodel);

        //SectorID = "41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G";
        if(listMenus.getSelectedIndex() < 0){
            txtLog.setText("");
            txtLog.append("==== Please Select Company" + "\r\n\r\n");
            this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
            return;
        }else{
            MenuID = listMenus.getSelectedValue();
            MenuID = MenuID.substring(MenuID.lastIndexOf(" ")).trim();
        }

        Api_Call("GET", BaseAPI + "/menu/" + MenuID, "Bearer " + AP3_TKN, "");
        try{
            String G_line = "";
            String I_line = "";
            if(json != null && json.has("groups")){
                txtLog.append(json.toString(4) + "\r\n"); 
                groups = json.getJSONArray("groups");
                for(int i = 0; i < groups.length(); i++){
                    JSONObject group = groups.getJSONObject(i);
                    if(group.has("label") && group.getJSONObject("label").has("en")){
                        G_line = "=== Group: " + group.getJSONObject("label").getString("en");
                        G_line += "      gID:" + group.getString("id");
                        listmodel.addElement(G_line);
                        if(group.has("items")){
                            items = group.getJSONArray("items");
                            for(int j = 0; j < items.length(); j++){
                                JSONObject item = items.getJSONObject(j);
                                if(item.has("label") && item.getJSONObject("label").has("en")){
                                    I_line = item.getJSONObject("label").getString("en");
                                    I_line += "      ID: " + item.getString("id");
                                    listmodel.addElement(I_line);
                                }
                            }
                            listItems.setModel(listmodel);
                        }
                    }
                }
            }else{
                txtLog.setText("");
                txtLog.append(json.toString(4));
            }

            if(json != null && json.has("items")){
                items = json.getJSONArray("items");
                for(int i = 0; i < items.length(); i++){
                    JSONObject item = items.getJSONObject(i);
                    if(item.has("label") && item.getJSONObject("label").has("en")){
                        I_line = item.getJSONObject("label").getString("en");
                        I_line += "      ID: " + item.getString("id");
                        listmodel.addElement(I_line);
                    }
                }
                listMenus.setModel(listmodel);
            }else{
                txtLog.setText("");
                txtLog.append(json.toString(4));
            }
        } catch(Exception ex){
            txtLog.setText("");
            txtLog.append(ex.getMessage() + "\r\n");
        }
        //txtLog.append("\r\n === Menu Json >>>\r\n " + json.toString(4) + "\r\n\r\n");
        this.setCursor(Cursor.getPredefinedCursor (Cursor.DEFAULT_CURSOR));
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


    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JCheckBox chkV1_Only;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblMetrics;
    private javax.swing.JLabel lblMetrics1;
    private javax.swing.JLabel lblMetrics2;
    private javax.swing.JLabel lblMetrics3;
    private javax.swing.JLabel lblMetrics4;
    private javax.swing.JLabel lblMetrics5;
    private javax.swing.JList<String> listCompanies;
    private javax.swing.JList<String> listItems;
    private javax.swing.JList<String> listMenus;
    private javax.swing.JList<String> listSector;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtMods1;
    private javax.swing.JTextField txtMods2;
    private javax.swing.JTextArea txtModsB;
    private javax.swing.JTextArea txtModsS;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
