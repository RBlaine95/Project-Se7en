
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class AdminEdit extends javax.swing.JFrame {

    String batch;

    boolean checked = false;
    String[] data;

    /**
     * Creates new form AdminEdit
     */

    public AdminEdit() {
        initComponents();
        this.data = Pinwheel.getData();
        this.batch = data[0];
        
        switch (Pinwheel.searchType) {
            
            case "supplier":
                batchTbl.getColumnModel().getColumn(0).setHeaderValue("Supplier name");
                batchTbl.getColumnModel().getColumn(1).setHeaderValue("Contact No");
                batchTbl.getColumnModel().getColumn(2).setHeaderValue("Email");
                batchTbl.getColumnModel().getColumn(3).setHeaderValue("Contact Liason");
                batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(4));
                this.chemTbl.setEnabled(false);
                this.chemLbl.setEnabled(false);
                break;
                
            case "chemical":
                batchTbl.getColumnModel().getColumn(0).setHeaderValue("Chemical");
                batchTbl.getColumnModel().getColumn(1).setHeaderValue("Value");
                batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(2));
                batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(2));
                batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(2));
                this.chemTbl.setEnabled(false);
                this.chemLbl.setEnabled(false);
                break;
        }
        ((DefaultTableModel) this.batchTbl.getModel()).insertRow(0, data);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        warningLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        batchTbl = new javax.swing.JTable();
        chemLbl = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        typeTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chemTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(673, 415));
        setMinimumSize(new java.awt.Dimension(673, 415));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        warningLbl.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(200, 0, 0));
        warningLbl.setText("WARNING: Changing these may corrupt the database");
        getContentPane().add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel1.setOpaque(false);

        batchTbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        batchTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch ID", "Colour", "Type", "Stage", "Mass"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        batchTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(batchTbl);

        chemLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chemLbl.setText("Chemicals");

        okBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        typeTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        typeTxt.setText("Batch");

        chemTbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chemical", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(chemTbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeTxt)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chemLbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(chemLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(okBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        Pinwheel.setBounce("edit");
        Prompt p = new Prompt();
        p.setVisible(true);
    }//GEN-LAST:event_okBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable batchTbl;
    private javax.swing.JLabel chemLbl;
    private javax.swing.JTable chemTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel typeTxt;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /*void change() {
     
     Pinwheel.updateCCDB(sql);
     JOptionPane.showMessageDialog(null, "Record Updated");
     }*/
}
