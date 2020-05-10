/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cikciker;
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Osman Karadeniz
 */
public class Cikcikerkayit extends javax.swing.JFrame {

    /**
     * Creates new form Cikcikerkayit
     */
    public Cikcikerkayit() {
        initComponents();
        benzersizidno.setText(Cikcikergenel.yeni_id());
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
        jLabel5 = new javax.swing.JLabel();
        lokasyon = new javax.swing.JComboBox<>();
        lokasyonlabel = new javax.swing.JLabel();
        idolustur = new javax.swing.JButton();
        benzersizidno = new javax.swing.JLabel();
        sifre = new javax.swing.JTextField();
        lokasyonlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        geri = new javax.swing.JButton();
        kayitol = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GLOBAL CİKCİKER V1");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yellowtail", 0, 19)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KAYIT ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        lokasyon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TR", "FR", "DE" }));
        getContentPane().add(lokasyon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 30));

        lokasyonlabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lokasyonlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokasyonlabel.setText("Şifre :");
        getContentPane().add(lokasyonlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 70, 30));

        idolustur.setText("YENİ ID NO.");
        idolustur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idolusturActionPerformed(evt);
            }
        });
        getContentPane().add(idolustur, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 53, 100, 30));

        benzersizidno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        benzersizidno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        benzersizidno.setText("XXXXXXXXXX");
        getContentPane().add(benzersizidno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, 20));
        getContentPane().add(sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 160, 30));

        lokasyonlabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lokasyonlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokasyonlabel1.setText("LOKASYON : ");
        getContentPane().add(lokasyonlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID NUMARASI :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 20));

        geri.setText("<< Geri");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });
        getContentPane().add(geri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        kayitol.setText("KAYIT OL");
        kayitol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitolActionPerformed(evt);
            }
        });
        getContentPane().add(kayitol, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 280, 30));

        setSize(new java.awt.Dimension(331, 288));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
  

    
    
   
    
    private void idolusturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idolusturActionPerformed

        benzersizidno.setText(Cikcikergenel.yeni_id());

    }//GEN-LAST:event_idolusturActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        setVisible(false);
        new Cikcikergiris().setVisible(true);
    }//GEN-LAST:event_geriActionPerformed

    private void kayitolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitolActionPerformed
        // KAYIT İŞLEMİ START
        // DAHA FAZLA GELİŞTİRİLEBİLİR KISMI BULUNMAKTADIR
        // MEVCUT KAYIT ENGELLEME , İSTİSNALARIN YÖNETİMİ VS. 
        
        Cikcikergenel.DosyaOlustur("uyeler.txt");
        String konum = (String) lokasyon.getSelectedItem();
        String idno = benzersizidno.getText();
        String kulsif = sifre.getText();

        String veri =konum + idno + ";" + kulsif;

        try {
            if (!(kulsif.isBlank())) {
                
                Cikcikergenel.DosyaYaz("uyeler.txt", veri);
                
                JOptionPane.showMessageDialog(null, "KAYIT BAŞARILI !");
                JOptionPane.showMessageDialog(null, "UYARI : GİRİŞ BİLGİLERİNİZİ KAYDEDİNİZ !");
                JOptionPane.showConfirmDialog(null, "GİRİŞ BİLGİLERİNİZ \n lokasyon : " + konum + "\n ID Numarası : " + idno + " \n Şifre : " + kulsif + " \n Giriş Bilgilerinizi kaydettinizmi ?");
                benzersizidno.setText(Cikcikergenel.yeni_id());
                lokasyon.setSelectedIndex(0);
                sifre.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Şifre Alanı Boş Bırakılamaz !" + Cikcikergenel.oturum_id);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_kayitolActionPerformed

    
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
            java.util.logging.Logger.getLogger(Cikcikerkayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cikcikerkayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cikcikerkayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cikcikerkayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cikcikerkayit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benzersizidno;
    private javax.swing.JButton geri;
    private javax.swing.JButton idolustur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kayitol;
    private javax.swing.JComboBox<String> lokasyon;
    private javax.swing.JLabel lokasyonlabel;
    private javax.swing.JLabel lokasyonlabel1;
    private javax.swing.JTextField sifre;
    // End of variables declaration//GEN-END:variables
}