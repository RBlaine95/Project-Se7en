
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class GraphUI extends JFrame {

    String batch;
    ResultSet rs;
    String[] data = new String[7];
    JFreeChart chart;
    ChartPanel cp;
    JFileChooser fc;

    /**
     * Creates new form GraphUI
     */
    public GraphUI() {
        try {
            //graphPane is the jPanel in the jFrame
            //cp is the ChartPanel that needs to be held inside jPanel1
            initComponents();
            data = Pinwheel.getData();
            this.batch = data[0];

            //jPanel1 = createChartPanel();
            cp = createChartPanel();
            //cp = new ChartPanel(chart);
            cp.setMouseWheelEnabled(true);

            jPanel1.add(cp);

            XYPlot plot = chart.getXYPlot();

            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

            renderer.setSeriesStroke(0, new BasicStroke(3.0f));
            renderer.setSeriesStroke(1, new BasicStroke(3.0f));

            plot.setBackgroundPaint(Color.DARK_GRAY);

            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(Color.BLACK);

            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.BLACK);

            plot.setRenderer(renderer);

        } catch (SQLException ex) {
            Logger.getLogger(GraphUI.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        saveBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        saveBtn.setText("Save Graph");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        refreshBtn.setText("Refresh Graph");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update Graph");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(refreshBtn)
                        .addGap(55, 55, 55)
                        .addComponent(saveBtn)
                        .addGap(56, 56, 56)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshBtn)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //bring popup to enter new Balling and or Temp
        UpdateGraph up = new UpdateGraph(this);
        up.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int width = 640;
        int height = 480;
        fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileNameExtensionFilter("PNG (*.png)", "png"));
        fc.setAcceptAllFileFilterUsed(false);
        fc.showSaveDialog(null);
        
        String path = fc.getSelectedFile().getAbsolutePath() + ".png";
        String filename = fc.getSelectedFile().getName() + ".png";
        File imageFile = new File(path);

        /*
        System.out.println("getCurrentDirectory(): "
                + f.getCurrentDirectory());
        System.out.println("getSelectedFile() : "
                + f.getSelectedFile());
         */
        try {
            ChartUtilities.saveChartAsPNG(imageFile, chart, width, height);
            JOptionPane.showMessageDialog(null, "Graph saved as " + filename);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        //graphPane.setVisible(false);

        GraphUI g = new GraphUI();
        g.setVisible(true);
        this.dispose();

        //graphPane.setVisible(true);
    }//GEN-LAST:event_refreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private ChartPanel createChartPanel() throws SQLException {
        String chartTitle = "Balling and Temperature graph for Batch ID " + batch;
        String xAxisLabel = "Days";
        String yAxisLabel = "Balling and Temperature";

        XYDataset dataset = createDataset();

        chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() throws SQLException {
        //get data from table
        String sql = "SELECT * FROM " + batch;
        rs = Pinwheel.queryGraphDB(sql);
        ResultSet rsC = Pinwheel.queryGraphDB("SELECT COUNT(*) FROM " + batch);
        rsC.next();
        int days = rsC.getInt(1);
        int count = 1;

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries balling = new XYSeries("Balling");
        XYSeries temp = new XYSeries("Temperature");

        while (rs.next() && count <= days) {
            //rows are Time (x), Balling (y1), Temp (y2)
            balling.add(count, rs.getDouble(2));
            temp.add(count, rs.getDouble(3));
            count++;
        }

        // returns the dataset
        dataset.addSeries(balling);
        dataset.addSeries(temp);
        return dataset;
    }
    public void refesh(){
        GraphUI g = new GraphUI();
        g.setVisible(true);
        this.dispose();
    }
    public void kill(){
        this.dispose();
    }
}
