
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class AddSupplier extends javax.swing.JFrame {

    
    /**
     * Creates new form AddSupplier
     */
    public AddSupplier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        contactTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        liasonTxt = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Add New Supplier");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 11, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 51, -1, -1));

        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, -1, -1));

        jLabel5.setText("Contact Person");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, -1, -1));

        nameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTxtKeyReleased(evt);
            }
        });
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 48, 120, -1));

        contactTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactTxtKeyReleased(evt);
            }
        });
        getContentPane().add(contactTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 86, 120, -1));

        emailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTxtKeyReleased(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 124, 120, -1));

        liasonTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                liasonTxtKeyReleased(evt);
            }
        });
        getContentPane().add(liasonTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 162, 120, -1));

        okBtn.setText("OK");
        okBtn.setEnabled(false);
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        getContentPane().add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 207, -1, -1));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 207, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed

        ArrayList arr = null;
        try {
            arr = Pinwheel.getSupplier();
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (arr.contains(this.nameTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Supplier Already Exists");
        } else {
            String sql = "INSERT INTO supplier (sname, tel, email, liason) VALUES('" + this.nameTxt.getText() + "', '" + this.contactTxt.getText()
                    + "', '" + this.emailTxt.getText() + "', '" + this.liasonTxt.getText() + "')";
            
            Pinwheel.updateCCDB(sql);
            try {
                Pinwheel.refreshSupplier();
            } catch (SQLException ex) {
                Logger.getLogger(AddSupplier.class.getName()).log(Level.SEVERE, null, ex);
            }
            Add ad = new Add();
            ad.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void liasonTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_liasonTxtKeyReleased
        this.check();
    }//GEN-LAST:event_liasonTxtKeyReleased

    private void emailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTxtKeyReleased
        this.check();
    }//GEN-LAST:event_emailTxtKeyReleased

    private void contactTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTxtKeyReleased
        this.check();
    }//GEN-LAST:event_contactTxtKeyReleased

    private void nameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtKeyReleased
        this.check();
    }//GEN-LAST:event_nameTxtKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField contactTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField liasonTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
public void check() {
        if (!this.nameTxt.getText().equals("") && !this.contactTxt.getText().equals("") && !this.emailTxt.getText().equals("") && !this.liasonTxt.getText().equals("")) {
            this.okBtn.setEnabled(true);
        } else {
            this.okBtn.setEnabled(false);
        }
    }
}
