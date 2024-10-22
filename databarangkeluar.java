/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gudang1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class databarangkeluar extends javax.swing.JFrame {
private DefaultTableModel model=null;
private PreparedStatement stat;
private ResultSet rs;
koneksi k = new koneksi();
    /**
     * Creates new form databarangkeluar
     */
    public databarangkeluar() {
        initComponents();
        k.connect ();
        refreshTable();
    }
class brgklr extends databarangkeluar{
        int id_bk,id_barang,jumlah;
        String tanggal_keluar;
        
        public brgklr(){
            this.id_barang=Integer.parseInt(idbrg.getText());
            this.jumlah=Integer.parseInt(jumlh.getText());
            try{
            Date date =tglkeluar.getDate();
          DateFormat dateformat= new SimpleDateFormat("YYYY-MM-dd");
          this.tanggal_keluar=dateformat.format(date);
            }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
        }
}
            public void refreshTable() { 
model=new DefaultTableModel(); 
model.addColumn("Id_bk"); 
model.addColumn("Id_barang"); 
model.addColumn("Tanggal_keluar"); 
model.addColumn("Jumlah");
tblbk.setModel(model); 
try {
this.stat=k.getCon().prepareStatement("select * from barang_keluar"); 
this.rs=this.stat.executeQuery();
while(rs.next()) { 
Object[] data={ rs.getInt("id_bk"), 
rs.getInt("id_barang"),
rs.getString("tanggal_keluar"),
rs.getInt("jumlah"), 
}; 
model.addRow (data);
}
}catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        } 

idbrg.setText(""); 
jumlh.setText("");

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
        idbk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbk = new javax.swing.JTable();
        logoutbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idbrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inptbtn = new javax.swing.JButton();
        ubhbtn = new javax.swing.JButton();
        hpsbtn = new javax.swing.JButton();
        jumlh = new javax.swing.JTextField();
        tglkeluar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Barang Keluar");

        jLabel2.setText("Id_bk");

        idbk.setEnabled(false);

        tblbk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblbk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbk);

        logoutbtn.setText("Log out");
        logoutbtn.setEnabled(false);
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("id_barang");

        jLabel4.setText("Tanggal Keluar");

        jLabel5.setText("Jumlah");

        inptbtn.setText("input");
        inptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptbtnActionPerformed(evt);
            }
        });

        ubhbtn.setText("ubah");
        ubhbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubhbtnActionPerformed(evt);
            }
        });

        hpsbtn.setText("hapus");
        hpsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(logoutbtn)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tglkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(jumlh)
                                    .addComponent(idbk, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(idbrg))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 317, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inptbtn)
                        .addGap(73, 73, 73)
                        .addComponent(ubhbtn)
                        .addGap(74, 74, 74)
                        .addComponent(hpsbtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(logoutbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idbk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tglkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inptbtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ubhbtn)
                        .addComponent(hpsbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptbtnActionPerformed
try{
         brgklr m=new brgklr();
         this.stat=k.getCon().prepareStatement("insert into barang_keluar values (?,?,?,?)");
         stat.setInt(1,0);
         stat.setInt(2,m.id_barang);
         stat.setString(3,m.tanggal_keluar);
         stat.setInt(4,m.jumlah);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_inptbtnActionPerformed

    private void ubhbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubhbtnActionPerformed
    try{
         brgklr m=new brgklr();
         this.stat=k.getCon().prepareStatement("update barang_keluar set id_barang=?,"+"tanggal_keluar=?"+"jumlah=?");
         stat.setInt(1,m.id_barang);
         stat.setString(2,m.tanggal_keluar);
         stat.setInt(3,m.jumlah);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }   
    }//GEN-LAST:event_ubhbtnActionPerformed

    private void hpsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsbtnActionPerformed
    try{
         brgklr m=new brgklr();
         this.stat=k.getCon().prepareStatement("DELETE FROM barang_keluar WHERE id_bk=?");
         stat.setInt(1,Integer.parseInt(idbk.getText()));
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_hpsbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
Login l= new Login();
l.setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void tblbkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbkMouseClicked
    idbk.setText(model.getValueAt(tblbk.getSelectedRow(),0).toString());
    idbrg.setText(model.getValueAt(tblbk.getSelectedRow(),1).toString());
    jumlh.setText(model.getValueAt(tblbk.getSelectedRow(),2).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_tblbkMouseClicked

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
            java.util.logging.Logger.getLogger(databarangkeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(databarangkeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(databarangkeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(databarangkeluar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new databarangkeluar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hpsbtn;
    private javax.swing.JTextField idbk;
    private javax.swing.JTextField idbrg;
    private javax.swing.JButton inptbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlh;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTable tblbk;
    private com.toedter.calendar.JDateChooser tglkeluar;
    private javax.swing.JButton ubhbtn;
    // End of variables declaration//GEN-END:variables
}