

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class Edit extends javax.swing.JFrame {

    String batch;

    String[] data = new String[7];

    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
        data = Pinwheel.getData();
        this.batch = data[0];
        
        if(Pinwheel.queryGraph(batch) || this.data[3].equals("Fermentation")){
            graphBtn.setEnabled(true);
        }

        this.selectedTxt.setText(batch);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blendBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedTxt = new javax.swing.JTextField();
        chemBtn = new javax.swing.JButton();
        subBatchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        graphBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Batch");

        blendBtn.setText("Create Blend");
        blendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update Batch");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Selected:");

        selectedTxt.setEditable(false);

        chemBtn.setText("Add Chemicals");
        chemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemBtnActionPerformed(evt);
            }
        });

        subBatchBtn.setText("Create Sub-Batch");
        subBatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBatchBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        graphBtn.setText("Graph Tools");
        graphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subBatchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chemBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(graphBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(selectedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blendBtn)
                    .addComponent(updateBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subBatchBtn)
                    .addComponent(chemBtn))
                .addGap(18, 18, 18)
                .addComponent(graphBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Update u = new Update();
        u.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void chemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemBtnActionPerformed
        Chemicals chem = new Chemicals();
        chem.setVisible(true);
    }//GEN-LAST:event_chemBtnActionPerformed

    private void subBatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBatchBtnActionPerformed
        SubBatch sub = new SubBatch();
        sub.setVisible(true);
    }//GEN-LAST:event_subBatchBtnActionPerformed

    private void blendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendBtnActionPerformed
        Blend b = new Blend();
        b.setVisible(true);
    }//GEN-LAST:event_blendBtnActionPerformed

    private void graphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphBtnActionPerformed
        
    }//GEN-LAST:event_graphBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton blendBtn;
    private javax.swing.JButton chemBtn;
    private javax.swing.JButton graphBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField selectedTxt;
    private javax.swing.JButton subBatchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
