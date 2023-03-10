package ec.edu.espe.decisiontree.view;

import com.mongodb.client.MongoCollection;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jairo Bonilla & Nahir Carrera, Gaman GeekLords, DCCO-ESPE
 */
    public class PnlInventoryAddNewProduct extends javax.swing.JPanel {
        private final MongoCollection productsCollection;
        /**
         * Creates new form PnlAddProductInventor
         * @param collectionProducts

         */
    public PnlInventoryAddNewProduct(MongoCollection collectionProducts) {
        initComponents();
        productsCollection = collectionProducts;
        validateFields();
    }   

//    private boolean addProduct() throws ParseException{
//        Product productToAdd = createProductToUpdate();
//        if(!Inventory.existsProduct(productsCollection,"name", productToAdd.getName())){
//            return Inventory.insertProduct(productsCollection,productToAdd);
//        }else{
//            JOptionPane.showMessageDialog(this, "There's already a product in your inventory named: "+ productToAdd.getName(), "Saved failed", JOptionPane.ERROR_MESSAGE); 
//            return false;
//        }
//    }
    
//    private Product createProductToUpdate() throws ParseException{
//        String name = txtProductName.getText();
//        float productionCost = 0.0F;
//        String description = txtADescription.getText();
//        int workingTime = (int) spnrWorkingTime.getValue();
//        int quantity = (int) spnrSalesRate.getValue();
//        ArrayList materialsIds = getTableInfo("id", 0);
//        ArrayList materialsQuantities = getTableInfo("quantity", 2);
//        HashMap materials = DictionaryConversor.convertToDictionary(materialsIds, materialsQuantities);
//        Product productToAdd;
//        productToAdd = new Product(0, name, productionCost, description, materials, workingTime, quantity);
//        float cost = CostsCalculator.computeTotalProductProductionCost(materialsCollection, userCollection, productToAdd);
//        productToAdd.setProductionCost(cost);
//        return productToAdd;
//    }
    
    
   
    public void validateFields() {
        if (txtProductName.getText().isEmpty()) {
            lblNameWarning.setText("Field required");
            pictureWarningProduct();
        } else {
            lblNameWarning.setText("");
            pictureWhiteProduct();
        }
        if(txtProductName.getText().isEmpty())
        {
            btnSave.setEnabled(false);
        }
        else
        {
            btnSave.setEnabled(true);
        }
    }
    
    private void cleanFields(){
        txtProductName.setText("");

        spnrSalesRate.setValue(1);

    }
    
    
    public void pictureWarningProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/alert.png")));

        lblNameWarning.setText("");

    }

    public void pictureWhiteProduct() {
        lblPictureNameWarning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/whiteSeen.png"))); // NOI18N
        lblNameWarning.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbProductName2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lbProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblPictureNameWarning = new javax.swing.JLabel();
        lblNameWarning = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        spnrSalesRate = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        spnrPrice1 = new javax.swing.JSpinner();

        jPanel2.setBackground(new java.awt.Color(80, 59, 108));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbProductName2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName2.setForeground(new java.awt.Color(255, 255, 255));
        lbProductName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProductName2.setText("New Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbProductName2, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbProductName2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec.edu.espe.ehamanagement.picture/Inventory.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(80, 59, 108));

        btnSave.setBackground(new java.awt.Color(129, 87, 154));
        btnSave.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(null);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        lbProductName.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        lbProductName.setText("Nombre");

        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtProductName.setBorder(null);
        txtProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductNameMousePressed(evt);
            }
        });
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductNameKeyTyped(evt);
            }
        });

        lblNameWarning.setForeground(new java.awt.Color(204, 0, 0));
        lblNameWarning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        spnrSalesRate.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrSalesRate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrSalesRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnrSalesRateMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setText("Precio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Fecha de expiraci??n");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Tasa de venta");

        jSpinner1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_YEAR));

        spnrPrice1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnrPrice1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spnrPrice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnrPrice1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(spnrSalesRate)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtProductName)
                                .addComponent(lbProductName))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNameWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(spnrPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(lbProductName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPictureNameWarning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(spnrPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrSalesRate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//        int decision = JOptionPane.showConfirmDialog(this,"Are you sure you want to save this product?", "Add Product", JOptionPane.YES_NO_OPTION);
//        switch(decision){
//            case 0 -> {
//            try {
//                if(addProduct()){
//                    cleanFields();
//                    btnSave.setEnabled(false);
//                    JOptionPane.showMessageDialog(this, "Your changes have been successfully saved!", "Added successfully to your Inventory", JOptionPane.INFORMATION_MESSAGE);
//                } else{
//                    JOptionPane.showMessageDialog(this, "Something went wrong. Failed to save this product", "Saved failed", JOptionPane.ERROR_MESSAGE);
//                }        
//            } catch (ParseException ex) {
//                Logger.getLogger(PnlInventoryAddNewProduct.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            }
//
//        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void spnrSalesRateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnrSalesRateMouseClicked
        validateFields();
    }//GEN-LAST:event_spnrSalesRateMouseClicked

    private void txtProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyTyped
        char character = evt.getKeyChar();
        if (!Character.isLetter(character) && (character != KeyEvent.VK_BACK_SPACE && character != KeyEvent.VK_SPACE)) {
            //getToolkit().beep();
            evt.consume();
            pictureWarningProduct();
            lblNameWarning.setText(character + " is not accepted here!");

        } else {
            lblNameWarning.setText("");
            pictureWhiteProduct();
        }
    }//GEN-LAST:event_txtProductNameKeyTyped

    private void txtProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyReleased

    }//GEN-LAST:event_txtProductNameKeyReleased

    private void txtProductNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductNameMousePressed
        if(!btnSave.isEnabled()){
            validateFields();
        }
    }//GEN-LAST:event_txtProductNameMousePressed

    private void spnrPrice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnrPrice1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spnrPrice1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbProductName;
    private javax.swing.JLabel lbProductName2;
    private javax.swing.JLabel lblNameWarning;
    private javax.swing.JLabel lblPictureNameWarning;
    private javax.swing.JSpinner spnrPrice1;
    private javax.swing.JSpinner spnrSalesRate;
    private javax.swing.JTextField txtProductName;
    // End of variables declaration//GEN-END:variables
}
