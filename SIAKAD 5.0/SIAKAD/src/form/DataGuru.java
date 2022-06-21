package form;


import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.awt.HeadlessException;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;
public class DataGuru extends javax.swing.JFrame {
    String sql;
    public DataGuru() {
        initComponents();
        tampildata();
        pencariandata();
        bersihText();
    }
    
    
       private void bersihText(){
       jNama.setText("");
       jnip.setText("");
       jJenisKelamin.setSelectedItem("");
       jstatus.setSelectedItem("");
       jalamat.setText("");
       jtelpon.setText("");
    }
    
    private void pencariandata() {
       try{
            Connection conn = (Connection)koneksi.koneksidb.GetConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM dataguru WHERE nama like '%"+txtpencarian.getText()+"%'");
            tabel.setModel(DbUtils.resultSetToTableModel(sql));
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"KONEKSI GAGAL");
        }
}
    
    
    private void tampildata(){
        
        try{
            Connection conn = (Connection)koneksi.koneksidb.GetConnection();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("SELECT * FROM dataguru");
            tabel.setModel(DbUtils.resultSetToTableModel(sql));
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"KONEKSI GAGAL");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jNama = new javax.swing.JTextField();
        jnip = new javax.swing.JTextField();
        jalamat = new javax.swing.JTextField();
        jJenisKelamin = new javax.swing.JComboBox<>();
        jstatus = new javax.swing.JComboBox<>();
        delete = new javax.swing.JButton();
        jtelpon = new javax.swing.JTextField();
        bSimpan1 = new javax.swing.JButton();
        bSimpan2 = new javax.swing.JButton();
        bbuat = new javax.swing.JButton();
        txtpencarian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "NIP :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "NIP :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setDisplayedMnemonic('[');
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siakad/Image/gnome-session-switch.png"))); // NOI18N
        jLabel2.setText("DATA GURU");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jNama.setBackground(new java.awt.Color(0, 204, 204));
        jNama.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Nama : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNamaActionPerformed(evt);
            }
        });

        jnip.setBackground(new java.awt.Color(0, 204, 204));
        jnip.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "NIP :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnipActionPerformed(evt);
            }
        });

        jalamat.setBackground(new java.awt.Color(0, 204, 204));
        jalamat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Alamat : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jalamatActionPerformed(evt);
            }
        });

        jJenisKelamin.setBackground(new java.awt.Color(0, 204, 204));
        jJenisKelamin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Laki-laki", "Perempuan" }));
        jJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJenisKelaminActionPerformed(evt);
            }
        });

        jstatus.setBackground(new java.awt.Color(0, 204, 204));
        jstatus.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ASN", "Honorer" }));
        jstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstatusActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 204, 204));
        delete.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siakad/Image/gtk-undelete-rtl.png"))); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jtelpon.setBackground(new java.awt.Color(0, 204, 204));
        jtelpon.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "No Telepon : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jtelpon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtelponActionPerformed(evt);
            }
        });

        bSimpan1.setBackground(new java.awt.Color(0, 204, 204));
        bSimpan1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bSimpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siakad/Image/zoom-in.png"))); // NOI18N
        bSimpan1.setText("UPDATE");
        bSimpan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSimpan1MouseClicked(evt);
            }
        });
        bSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpan1ActionPerformed(evt);
            }
        });

        bSimpan2.setBackground(new java.awt.Color(0, 204, 204));
        bSimpan2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bSimpan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siakad/Image/lxfind.png"))); // NOI18N
        bSimpan2.setText("READ");
        bSimpan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSimpan2MouseClicked(evt);
            }
        });
        bSimpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpan2ActionPerformed(evt);
            }
        });

        bbuat.setBackground(new java.awt.Color(0, 204, 204));
        bbuat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bbuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siakad/Image/package-reinstall.png"))); // NOI18N
        bbuat.setText("CREATE");
        bbuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbuatActionPerformed(evt);
            }
        });

        txtpencarian.setBackground(new java.awt.Color(0, 204, 204));
        txtpencarian.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cari Data : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        txtpencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpencarianActionPerformed(evt);
            }
        });

        tabel.setBackground(new java.awt.Color(0, 204, 204));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "NIP", "Jenis Kelamin", "Status", "Alamat", "No Telepon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabel.setGridColor(new java.awt.Color(0, 0, 0));
        tabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabel.setShowGrid(true);
        tabel.setSurrendersFocusOnKeystroke(true);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnip, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jJenisKelamin, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jalamat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtelpon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jNama)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtpencarian)
                        .addGap(123, 123, 123)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bSimpan2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bbuat)
                        .addGap(18, 18, 18)
                        .addComponent(bSimpan1)
                        .addGap(18, 18, 18)
                        .addComponent(delete)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(bbuat)
                    .addComponent(bSimpan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSimpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNamaActionPerformed

    private void jnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnipActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jalamatActionPerformed

    private void jJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jJenisKelaminActionPerformed

    private void jstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstatusActionPerformed

    private void jtelponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtelponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtelponActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void bSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSimpan1ActionPerformed

    private void bSimpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSimpan2ActionPerformed

    private void bbuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbuatActionPerformed
       try{
           String sql = "INSERT INTO dataguru VALUES('"+ jNama.getText()
                   +"','"+  jnip.getText()
                   +"','"+ (String) jJenisKelamin.getSelectedItem()
                   +"','"+ (String) jstatus.getSelectedItem()
                   +"','"+ jalamat.getText()
                   +"','"+ jtelpon.getText()+"')";
           java.sql.Connection conn = (java.sql.Connection)koneksi.koneksidb.GetConnection();
           java.sql.PreparedStatement pst = conn.prepareStatement(sql);
           pst.execute();
           tampildata();
           JOptionPane.showMessageDialog(null,"data tersimpan");
           
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);     
        }
    }//GEN-LAST:event_bbuatActionPerformed

    private void txtpencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpencarianActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.getSelectedRow();
        String nama = tabel.getValueAt(baris,0).toString();
        jNama.setText(nama);
        String nip = tabel.getValueAt(baris,1).toString();
        jnip.setText(nip);
        jJenisKelamin.setSelectedItem(tabel.getValueAt(baris,2));
        jstatus.setSelectedItem(tabel.getValueAt(baris,3));
        String alamat = tabel.getValueAt(baris,4).toString();
        jalamat.setText(alamat);
        String telepon = tabel.getValueAt(baris,5).toString();
        jtelpon.setText(telepon);
    }//GEN-LAST:event_tabelMouseClicked

    private void bSimpan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimpan1MouseClicked
        try{
             String sql = "UPDATE dataguru SET nama='" + jNama.getText() + "',nip='" + jnip.getText()
                     + "',jenis_kelamin='" + jJenisKelamin.getSelectedItem() + "',status='" + jstatus.getSelectedItem()
                     + "',alamat='" + jalamat.getText() + "',notelp='" + jtelpon.getText() + "'WHERE nama='" + jNama.getText() + "'";
            Connection con = (Connection)koneksi.koneksidb.GetConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            tampildata();
            bersihText();
            
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "format data masih ada yang salah");
        }
    }//GEN-LAST:event_bSimpan1MouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        
    }//GEN-LAST:event_deleteMouseClicked

    private void bSimpan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSimpan2MouseClicked
        pencariandata();
    }//GEN-LAST:event_bSimpan2MouseClicked

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
            java.util.logging.Logger.getLogger(DataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSimpan1;
    private javax.swing.JButton bSimpan2;
    private javax.swing.JButton bbuat;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> jJenisKelamin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jNama;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jalamat;
    private javax.swing.JTextField jnip;
    private javax.swing.JComboBox<String> jstatus;
    private javax.swing.JTextField jtelpon;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtpencarian;
    // End of variables declaration//GEN-END:variables
}
