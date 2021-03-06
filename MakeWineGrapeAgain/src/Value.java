
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class Value extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("0.00");

    /**
     * Creates new form value
     */
    public Value() {
        initComponents();
        this.amountPerBottle.setText("750");
        this.selectedTxt.setText(Pinwheel.data[0]);

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                backBtn.doClick();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectedTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        costPerBottle = new javax.swing.JTextField();
        costPerCork = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amountPerBottle = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        afterBottling = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pricePerBottle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        beforeBottling = new javax.swing.JTextField();
        calculateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Value Calculator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Selected:");

        selectedTxt.setEditable(false);
        selectedTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Cost per Bottle");

        costPerBottle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        costPerBottle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costPerBottleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costPerBottleKeyReleased(evt);
            }
        });

        costPerCork.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        costPerCork.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costPerCorkKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costPerCorkKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Cost per Cork/Screw cap");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setText("Amount (ml) per bottle");

        amountPerBottle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        amountPerBottle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountPerBottleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountPerBottleKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setText("Price Per Bottle");

        afterBottling.setEditable(false);
        afterBottling.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("After Bottling");

        pricePerBottle.setEditable(false);
        pricePerBottle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Before Bottling");

        beforeBottling.setEditable(false);
        beforeBottling.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        calculateBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(amountPerBottle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(costPerCork, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel10)
                                .addGap(21, 21, 21)
                                .addComponent(pricePerBottle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(selectedTxt))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(costPerBottle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(afterBottling, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(beforeBottling))))))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(costPerBottle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(beforeBottling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(costPerCork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(afterBottling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(amountPerBottle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(pricePerBottle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(calculateBtn))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 250));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 280));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        try {
            this.recalculate();
        } catch (SQLException ex) {
            Logger.getLogger(Value.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void costPerBottleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPerBottleKeyReleased
        costPerBottle.setText(Pinwheel.numEx(costPerBottle.getText()));
    }//GEN-LAST:event_costPerBottleKeyReleased

    private void costPerCorkKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPerCorkKeyReleased
        costPerCork.setText(Pinwheel.numEx(costPerCork.getText()));
    }//GEN-LAST:event_costPerCorkKeyReleased

    private void amountPerBottleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountPerBottleKeyReleased
        amountPerBottle.setText(Pinwheel.numEx(amountPerBottle.getText()));
    }//GEN-LAST:event_amountPerBottleKeyReleased

    private void costPerBottleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPerBottleKeyPressed
        costPerBottle.setText(Pinwheel.numEx(costPerBottle.getText()));
    }//GEN-LAST:event_costPerBottleKeyPressed

    private void costPerCorkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPerCorkKeyPressed
        costPerCork.setText(Pinwheel.numEx(costPerCork.getText()));
    }//GEN-LAST:event_costPerCorkKeyPressed

    private void amountPerBottleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountPerBottleKeyPressed
        amountPerBottle.setText(Pinwheel.numEx(amountPerBottle.getText()));
    }//GEN-LAST:event_amountPerBottleKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Value.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Value.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Value.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Value.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Value().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField afterBottling;
    private javax.swing.JTextField amountPerBottle;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField beforeBottling;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JTextField costPerBottle;
    private javax.swing.JTextField costPerCork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pricePerBottle;
    private javax.swing.JTextField selectedTxt;
    // End of variables declaration//GEN-END:variables
private void recalculate() throws SQLException {
        if (!costPerBottle.getText().isEmpty() && !costPerCork.getText().isEmpty() && !amountPerBottle.getText().isEmpty()) {
            double cpb = Double.parseDouble(costPerBottle.getText());
            double cpc = Double.parseDouble(costPerCork.getText());
            double apb = Double.parseDouble(amountPerBottle.getText())/1000;
            double chemvalue = 0;
            String chemical;
            double amount;
            String sql = "SELECT * FROM " + this.selectedTxt.getText();
            ResultSet rs = Pinwheel.queryChem(sql);
            while (rs.next()) {
                System.out.println("found chem");
                chemical = rs.getNString(1);
                amount = rs.getDouble(2);
                System.out.println("Chemical" + chemical + "\nAmount: " + amount);
                sql = "SELECT value FROM chemicaltbl WHERE chemical = '" + chemical + "'";
                ResultSet rs1 = Pinwheel.queryChem(sql);
                rs1.next();
                double value = rs1.getDouble(1);
                System.out.println("Value:" + value);
                chemvalue += amount * value;
            }
            this.beforeBottling.setText(df.format(chemvalue) + "");
            double mass = Double.parseDouble(Pinwheel.data[4]);
            int bottles = (int) (mass / apb);
            double bottlevalue = (bottles * (cpb + cpc));
            this.afterBottling.setText((df.format(chemvalue + bottlevalue)) + "");

            this.pricePerBottle.setText(df.format(Double.parseDouble(this.afterBottling.getText()) / bottles) + "");
        }
    }
}
