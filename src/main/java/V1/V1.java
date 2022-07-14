package V1;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
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
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSectors = new javax.swing.JTextArea();
        lblMetrics1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtModsB = new javax.swing.JTextArea();
        lblMetrics2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();
        btnRun = new javax.swing.JButton();
        btnV1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setTitle("Production V1 Menus updata\\e");
        setMinimumSize(new java.awt.Dimension(860, 532));
        setName("V1"); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 104, 0));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMetrics.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics.setText("Target Sectors : Name, ID");
        lblMetrics.setAlignmentX(0.5F);
        getContentPane().add(lblMetrics, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 170, -1));

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtLog.setRows(5);
        txtLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLog.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLog.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 148, 730, 380));

        txtModsS.setEditable(false);
        txtModsS.setColumns(20);
        txtModsS.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtModsS.setRows(5);
        txtModsS.setText("700029\tWhole Fruit\n700030\tSnickers Bar 1.8oz\n700031\tM&m Peanut 1.74oz\n700032\tReese Peanut Butter Cups 1.5oz\n700033\tDoritos Nacho Cheese 1.75oz\n700034\tMiss Vickie's Jalapeno\n700035\tTwix 1.79oz\n700036\tLays Plain 1.5oz\n700037\tNature Valley Crunchy Oats 'N Honey 1.49oz\n700038\tBar Nutri Grain Strawberry 1.3oz\n700039\tChip Baked Lays BBQ 1.5oz\n700040\tBar Kind Caramel Almond & Sea Salt 1.4oz\n700041\tSahale Honey Glazed Almonds 1.5oz\n700042\tOrchard Valley Keto Crunchy Trail Mix 1.85oz\n700043\tChip Terra Blue Potato Chips 1oz\n700044\tCheez Its Whole Grain 1oz\n700045\tBar Kind Dark Chocolate Nuts/Sea Salt 1.4oz\n700046\tRX Bar Blueberry 1.83oz\n700047\tNutri Grain Bar Apple Cinnamon 1.3oz\n700048\tMiss Vickie's Bbq 1 3/8oz\n700049\tM&m Plain 1.69oz\n700050\tSun Harvest Cheddar 1.5oz\n700051\tMiss Vickie's Sea Salt Vin 1 3/8oz\n700052\tHershey Milk Chocolate\n700053\tNabisco Belvita Blueberry 1.76oz\n700054\tSmartfood White Cheddar Popcorn .625oz\n700055\tSahale Dry Roasted Almonds 1.5oz\n700056\tOrchard Valley Harvest Omega-3 Mix 2oz\n700057\tFSTG Multigrain Tortilla Chips 1.5oz\n700058\tBaked Lays Plain 1.125oz");
        txtModsS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModsS.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtModsS.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane2.setViewportView(txtModsS);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 290, 110));

        txtSectors.setEditable(false);
        txtSectors.setColumns(20);
        txtSectors.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtSectors.setRows(5);
        txtSectors.setText("Eurest Internal Brands/US 41pwNJPNRWC25LjpaORKI9Y11rAgE0uqYzXvPaGzfKZ4qDY0adc4GzWmvEqaCXQ0qDQmeQCrkr5G");
        txtSectors.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSectors.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtSectors.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane3.setViewportView(txtSectors);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 230, 110));

        lblMetrics1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics1.setText("Snack Modifiers: PLU, Name");
        lblMetrics1.setAlignmentX(0.5F);
        getContentPane().add(lblMetrics1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 280, -1));

        txtModsB.setEditable(false);
        txtModsB.setColumns(20);
        txtModsB.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        txtModsB.setRows(5);
        txtModsB.setText("700000\tClassic Coke 20oz\n700001\tDiet Coke 20oz\n700002\tCoke Zero 20oz\n700003\tPepsi 20oz\n700004\tDiet Pepsi 20oz\n700005\tMountain Dew 20oz\n700006\tDiet Mountain Dew 20oz\n700007\tSprite 20oz\n700008\tDiet Sprite 20oz\n700009\tAquafina 20oz\n700010\tDasani 20oz\n700011\tSmartwater 20oz\n700012\tLifewater 20oz\n700013\tVitamin Water Power C\n700014\tVitamin Water Zero Sugar Squeezed\n700015\tMonster Energy 16oz\n700016\tMonster Zero Ultra 16oz\n700017\tPure Leaf Diet Tea\n700018\tPure Leaf Sweet Tea\n700019\tGatorade Fruit Punch\n700020\tGatorade Zero Glacier\n700021\tStarbucks Cold Brew\n700022\tStarbucks Frappuccino Vanilla\n700023\tBubly Lime\n700024\tBubly Grapefruit\n700025\tBubly Cherry\n700026\tBubly Orange\n700027\tBubly Lemon\n700028\tBubly Black Cherry");
        txtModsB.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModsB.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtModsB.setMinimumSize(new java.awt.Dimension(50, 19));
        jScrollPane4.setViewportView(txtModsB);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 110));

        lblMetrics2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMetrics2.setText("Beverage Modifiers: PLU, Name");
        lblMetrics2.setAlignmentX(0.5F);
        getContentPane().add(lblMetrics2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 280, -1));

        btnLog.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnLog.setText(" < Log");
        btnLog.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogMouseClicked(evt);
            }
        });
        getContentPane().add(btnLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 100, 22));

        btnRun.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnRun.setForeground(new java.awt.Color(204, 0, 0));
        btnRun.setText("Run");
        btnRun.setName("btnRun"); // NOI18N
        btnRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRunMouseClicked(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 100, 28));

        btnV1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnV1.setText("Get V1 nemus");
        btnV1.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnV1MouseClicked(evt);
            }
        });
        getContentPane().add(btnV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 100, 22));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String url = "";
    private String env = "";
    private String BaseAPI = "";

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
        String R = A.Func.SHOW_FILE(txtLog.getText(), "txt");
        if(!R.equals("OK")){
            txtLog.append(R + "\r\n");
            txtLog.setCaretPosition(txtLog.getDocument().getLength()); 
        }
    }//GEN-LAST:event_btnLogMouseClicked

    private void btnV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnV1MouseClicked
        Get_V1_Menus();
    }//GEN-LAST:event_btnV1MouseClicked

    private void Load_Form(){
        BaseAPI = "https://api.compassdigital.org/v1";
        env = "PR";
    }

    private void Get_V1_Menus(){
        String AJ = "";

    }


    // <editor-fold defaultstate="collapsed" desc="GUI Components Declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnV1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblMetrics;
    private javax.swing.JLabel lblMetrics1;
    private javax.swing.JLabel lblMetrics2;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtModsB;
    private javax.swing.JTextArea txtModsS;
    private javax.swing.JTextArea txtSectors;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
