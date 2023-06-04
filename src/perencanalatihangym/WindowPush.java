/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perencanalatihangym;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class WindowPush extends javax.swing.JFrame {

    /**
     * Creates new form outputWindow
     */
    public WindowPush() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Page Push Day");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Tentukan Latihan Push Day (Chest, Tricep, dan Shoulder)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 16, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 286, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Mulai Latihan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 286, -1, -1));

        jCheckBox1.setText("Bench Press");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 73, 93, -1));

        jCheckBox2.setText("Incline Bench Press");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 73, 130, -1));

        jCheckBox3.setText("Cable Fly");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 113, 87, -1));

        jCheckBox4.setText("Shoulder Press");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 113, -1, -1));

        jCheckBox5.setText("Lateral Raises");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 153, -1, -1));

        jCheckBox6.setText("Rope Pushdown");
        jPanel1.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 153, -1, -1));

        jCheckBox7.setText("Skull Crusher");
        jPanel1.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 193, 93, -1));

        jCheckBox8.setText("Push Up");
        jPanel1.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 193, 87, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("Fasilitas Gym yang Digunakan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 226, -1, -1));

        jCheckBox9.setText("Dumbell/Barbel");
        jPanel1.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 254, -1, -1));

        jCheckBox10.setText("Machine/Cable");
        jPanel1.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 254, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 72, 40, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 72, 40, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 112, 40, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 112, 40, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 152, 40, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 152, 40, -1));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 192, 40, -1));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 192, 40, -1));

        jLabel3.setText("*isi text field dengan repetisi (misal: 12x3)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 44, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perencanalatihangym/bg_push (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 560, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        FormUtama frm = new FormUtama();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        latihanpushyangdipilih = "Latihan Push Day yang Anda Dipilih: \n";
        arrLatihanPush = new JCheckBox[] {jCheckBox1, jCheckBox2, jCheckBox3, 
                                         jCheckBox4, jCheckBox5, jCheckBox6, 
                                         jCheckBox7, jCheckBox8};
        
        for (int i=0; i<arrLatihanPush.length; i++) {
            if(arrLatihanPush[i].isSelected())
                latihanpushyangdipilih += arrLatihanPush[i].getText() + "\n";
        }
        
        fasilitasgym = "Fasilitas/Alat Gym yang Digunakan: \n";
        arrFasilitasGymCheckBox = new JCheckBox[] {jCheckBox9, jCheckBox10};
        
        for (int i=0; i<arrFasilitasGymCheckBox.length; i++) {
            if(arrFasilitasGymCheckBox[i].isSelected())
                fasilitasgym += arrFasilitasGymCheckBox[i].getText() + "\n";                  
        }
        
        arrRepetisi = new JTextField[] {jTextField1, jTextField2, jTextField3, jTextField4,
                                        jTextField5, jTextField6, jTextField7, jTextField8};
        
        StringBuilder repetisiMessage = new StringBuilder("Jumlah Repetisi Dan Set yang Anda Mau:\n");
        for (JTextField textField : arrRepetisi) {
            String value = textField.getText();
            if (!value.isEmpty()) {
                repetisilatihan += value + "\n";
                repetisiMessage.append(value).append("\n");        
            
               }   
            }       

         if ((jTextField1.getText().isEmpty() && jCheckBox1.isSelected()) || 
            (jTextField2.getText().isEmpty() && jCheckBox2.isSelected()) ||
            (jTextField3.getText().isEmpty() && jCheckBox3.isSelected()) ||
            (jTextField4.getText().isEmpty() && jCheckBox4.isSelected()) || 
            (jTextField5.getText().isEmpty() && jCheckBox5.isSelected()) ||
            (jTextField6.getText().isEmpty() && jCheckBox6.isSelected()) ||
            (jTextField7.getText().isEmpty() && jCheckBox7.isSelected()) || 
            (jTextField8.getText().isEmpty() && jCheckBox8.isSelected()) )
        {
            JOptionPane.showMessageDialog(null, "Repetisi dan set belum ditentukan, Harap input dengan format RepetisixSet terlebih dahulu");
        }
        
        else if ((!jTextField1.getText().isEmpty() && !jCheckBox1.isSelected()) || 
            (!jTextField2.getText().isEmpty() && !jCheckBox2.isSelected()) ||
            (!jTextField3.getText().isEmpty() && !jCheckBox3.isSelected()) ||
            (!jTextField4.getText().isEmpty() && !jCheckBox4.isSelected()) || 
            (!jTextField5.getText().isEmpty() && !jCheckBox5.isSelected()) ||
            (!jTextField6.getText().isEmpty() && !jCheckBox6.isSelected()) ||
            (!jTextField7.getText().isEmpty() && !jCheckBox7.isSelected()) || 
            (!jTextField8.getText().isEmpty() && !jCheckBox8.isSelected()) )
        {
            JOptionPane.showMessageDialog(null, "Latihan Belum Terpilih, Harap Tentukan Pilihan Latihan yang Anda Inginkan");            
        }

        else if ((jTextField1.getText().isEmpty() && !jCheckBox1.isSelected()) && 
            (jTextField2.getText().isEmpty() && !jCheckBox2.isSelected()) &&
            (jTextField3.getText().isEmpty() && !jCheckBox3.isSelected()) &&
            (jTextField4.getText().isEmpty() && !jCheckBox4.isSelected()) && 
            (jTextField5.getText().isEmpty() && !jCheckBox5.isSelected()) &&
            (jTextField6.getText().isEmpty() && !jCheckBox6.isSelected()) &&
            (jTextField7.getText().isEmpty() && !jCheckBox7.isSelected()) && 
            (jTextField8.getText().isEmpty() && !jCheckBox8.isSelected()) )
        {
            JOptionPane.showMessageDialog(null, "Check Box dan Text Field Kosong, Harap Isi dengan Benar");            
 
        }
        else
        {   
            
            if (!jCheckBox9.isSelected() && !jCheckBox10.isSelected())
            {
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Fasilitas/Alat yang Akan Digunakan");                            
            }
            
            else 
            {
            JOptionPane.showMessageDialog(this, latihanpushyangdipilih + "\n" + repetisiMessage.toString() +
            "\n"+ fasilitasgym,"Hasil Pilihan Latihan Anda", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WindowPush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowPush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowPush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowPush.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowPush().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    
    String latihanpushyangdipilih = "";
    JCheckBox[] arrLatihanPush;
    String fasilitasgym = "";
    JCheckBox[] arrFasilitasGymCheckBox;
    String repetisilatihan ="";
    JTextField[] arrRepetisi;
}