/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package expense.tracker;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.Date;
/**
 *
 * @author hrish
 */
public class Viewduration extends javax.swing.JFrame {

    /**
     * Creates new form Viewduration
     */
    public Viewduration() {
        initComponents();
          d1.setSelectableDateRange(null, new java.util.Date() );
            d2.setSelectableDateRange(null, new java.util.Date() );
         d1.setDate(new java.util.Date());
                  d2.setDate(new java.util.Date());
    }
    public void username(String str1){
        txt_lab.setText(str1);
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
        jButton1 = new javax.swing.JButton();
        d1 = new com.toedter.calendar.JDateChooser();
        d2 = new com.toedter.calendar.JDateChooser();
        txt_lab = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_ex = new javax.swing.JTextField();
        txt_in = new javax.swing.JTextField();
        rSMaterialButtonCircle1 = new necesario.RSMaterialButtonCircle();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new rojeru_san.complementos.RSTableMetro();
        jScrollPane4 = new javax.swing.JScrollPane();
        table1 = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Date wise");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("From:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 20));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("To:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 110, -1));

        d1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        d1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                d1PropertyChange(evt);
            }
        });
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, -1));

        d2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 270, -1));

        txt_lab.setForeground(new java.awt.Color(242, 228, 232));
        getContentPane().add(txt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 40));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel5.setText("Expense");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel6.setText("Income");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        txt_ex.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        getContentPane().add(txt_ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 160, 40));

        txt_in.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        getContentPane().add(txt_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 152, 160, 40));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 0, 0));
        rSMaterialButtonCircle1.setText("x");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 40, 40));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "uid", "Vendor", "Category", "Date", "Amount", "Paid by"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setColorBackgoundHead(new java.awt.Color(176, 127, 165));
        table2.setFuenteFilas(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table2.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table2.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jScrollPane3.setViewportView(table2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 420, -1));

        table1.setForeground(new java.awt.Color(42, 103, 176));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "uid", "Vendor", "Category", "Date", "Amount", "Paid by"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setCellSelectionEnabled(true);
        table1.setColorBackgoundHead(new java.awt.Color(176, 127, 165));
        table1.setFuenteFilas(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table1.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        table1.setFuenteHead(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jScrollPane4.setViewportView(table1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 410, -1));

        jPanel1.setBackground(new java.awt.Color(242, 228, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{
         
         
         
            javax.swing.table.DefaultTableModel dtm1=
                    (javax.swing.table.DefaultTableModel)table1.getModel();
            javax.swing.table.DefaultTableModel dtm2=
                    (javax.swing.table.DefaultTableModel)table2.getModel();
             
            int rc1=dtm1.getRowCount();
             int rc2=dtm2.getRowCount();
           
            while(rc1--!=0  ){
                dtm1.removeRow(0);
                             
            }
             while(rc2--!=0  ){
                dtm2.removeRow(0);
                             
            }
              
              
         java.sql.Date dt1 = new java.sql.Date(d1.getDate().getTime());
     
       java.sql.Date dt2 = new java.sql.Date(d2.getDate().getTime());
       
       
       
       
       
                Connection con = DBConnection.getConnection();
              Statement s = con.createStatement();
              String str1 = txt_lab.getText();
            
              ResultSet rs= s.executeQuery("select ID from users where name='"+str1+"'");
              rs.next();
              String sd = rs.getString(1);
              int id=Integer.parseInt(sd);
                int total = 0,in = 0,ex = 0;
               rs = s.executeQuery("select cat,amt,day,py,vendor,type,idm from money where day>='"+dt1+"' and day<='"+dt2+"' and Pid='"+id+"'");
              while(rs.next()){
                String cat,paidby,vendor,type;
                int amt;
                int idm;
                Date d;
                cat=rs.getString("cat");
                amt=rs.getInt("amt");
                d=rs.getDate("day");
                paidby=rs.getString("py");
                vendor=rs.getString("vendor");
                type=rs.getString("type");
                idm=rs.getInt("idm");
                Object o[] = {idm,vendor,cat,d,amt,paidby};
                if(type.equals("Expense")){
                    dtm1.addRow(o);
                }
                else{
                    dtm2.addRow(o);
                }
                
                
                 if("Income".equals(type)){
                    total+=amt;
                    in+=amt;
                  
              }
                else{
                    total-=amt;
                    ex+=amt;
                }
              }
              
               
                  
              
                Color color = Color.RED;                
                txt_ex.setBackground(color);
              txt_ex.setText(ex+"");
                color = Color.GREEN;
                txt_in.setBackground(color);
              txt_in.setText(in+"");
                
             
              
              
              
              
              
              
     }catch(Exception e){
         
         JOptionPane.showMessageDialog(null,e);
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void d1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_d1PropertyChange
       d2.setSelectableDateRange(d1.getDate(),new java.util.Date());
       d2.setDate(d1.getDate());
       
    }//GEN-LAST:event_d1PropertyChange

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

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
            java.util.logging.Logger.getLogger(Viewduration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewduration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewduration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewduration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewduration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojeru_san.complementos.RSTableMetro table1;
    private rojeru_san.complementos.RSTableMetro table2;
    private javax.swing.JTextField txt_ex;
    private javax.swing.JTextField txt_in;
    private javax.swing.JLabel txt_lab;
    // End of variables declaration//GEN-END:variables
}
