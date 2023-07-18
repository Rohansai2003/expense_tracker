/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package expense.tracker;

import java.sql.*;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author hrish
 */
public class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
        initComponents();
        getEntries();
    }
    
    private void getEntries(){
        try{
            javax.swing.table.DefaultTableModel dtm=
                        (javax.swing.table.DefaultTableModel)tabc.getModel();
            
            int rc=dtm.getRowCount();
            while(rc--!=0){
                dtm.removeRow(0);
            }
            Connection con = DBConnection.getConnection();
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from category");
            int sno=0;
            while(rs.next()){
                String cat;
                cat = rs.getString("cate");
                
                Object o[]={++sno,cat }; 
                
                dtm.addRow(o);
            }   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
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

        evaluatorDimension2D1 = new org.jdesktop.swing.animation.timing.evaluators.EvaluatorDimension2D();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSMaterialButtonCircle3 = new necesario.RSMaterialButtonCircle();
        txt_cat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabc = new rojeru_san.complementos.RSTableMetro();
        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        rSMaterialButtonCircle2 = new necesario.RSMaterialButtonCircle();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setMinimumSize(new java.awt.Dimension(400, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categories");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, -1));

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(255, 255, 255));
        rSMaterialButtonCircle3.setForeground(new java.awt.Color(0, 0, 0));
        rSMaterialButtonCircle3.setText("x");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        txt_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_catActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel2.setText("Category");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 72, 70, 30));

        tabc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabc.setColorBackgoundHead(new java.awt.Color(255, 51, 102));
        tabc.setColorBordeFilas(new java.awt.Color(255, 51, 102));
        tabc.setColorBordeHead(new java.awt.Color(255, 51, 102));
        tabc.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabc.setColorFilasForeground1(new java.awt.Color(255, 51, 102));
        tabc.setColorFilasForeground2(new java.awt.Color(255, 51, 102));
        tabc.setColorSelBackgound(new java.awt.Color(255, 51, 102));
        tabc.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabc.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabc.setFuenteHead(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabc.setMinimumSize(new java.awt.Dimension(0, 0));
        tabc.setRowHeight(16);
        jScrollPane2.setViewportView(tabc);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 330, 240));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 51, 51));
        rSMaterialButtonCircle1.setText("+");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, 40));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(0, 51, 51));
        rSMaterialButtonCircle2.setText("-");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 40, 40));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        try{
            String c=txt_cat.getText();
            if(!c.equals("")){
                Connection con = DBConnection.getConnection();
                Statement s= con.createStatement();
                s.executeUpdate("insert into category values('"+c+"')");
                JOptionPane.showMessageDialog(null,"Category added");
                getEntries();
            } else{
                JOptionPane.showMessageDialog(null,"Please enter the category");
            }
        }catch(SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null, "Category already exits");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,evt);
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
    int r=JOptionPane.showConfirmDialog(null,"Do you really want to delete?","Deletion Confirmation",JOptionPane.YES_NO_OPTION);
    if(r==JOptionPane.YES_OPTION){
          int ri = tabc.getSelectedRow();
      String category=(String)tabc.getValueAt(ri,1);
      try{
          Connection con = DBConnection.getConnection();
              Statement s = con.createStatement();
              s.executeUpdate("delete from category where cate='"+category+"'");
              JOptionPane.showMessageDialog(null, "Category deleted successfully");
              getEntries();
              con.close();
              
              
      }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
      }
    }
    
    
    
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void txt_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_catActionPerformed

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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swing.animation.timing.evaluators.EvaluatorDimension2D evaluatorDimension2D1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private rojeru_san.complementos.RSTableMetro tabc;
    private javax.swing.JTextField txt_cat;
    // End of variables declaration//GEN-END:variables
}
