package cikciker;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Osman Karadeniz
 */

public class Cikcikeranasayfa extends javax.swing.JFrame {

    /**
     * Creates new form Cikcikeranasayfa
     */
    public Cikcikeranasayfa() {
        initComponents();
        Cikcikergenel.DosyaOlustur("veriler.txt");
        cikciker_kur();
        soru1();
        soru2();
        soru4();
        
         try{
             if(Cikcikergenel.oturum_id.equals(" "))
         oturumid.setText("XX1234567890");
         else
             {oturumid.setText(Cikcikergenel.oturum_id);
             
             }
             
         }catch(Exception e)
         {
                 JOptionPane.showMessageDialog(null, "HATA ! -> KULLANICI GİRİŞİ BULUNMAMAKTADIR !");
         }
         
      
        
       
       // DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
       // tarih.setDate(df);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oturumid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cikis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cikcikler = new javax.swing.JTable();
        soru1 = new javax.swing.JLabel();
        kisacikciklabel = new javax.swing.JLabel();
        tarih = new com.toedter.calendar.JDateChooser();
        soru3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recikcikle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiketlabel = new javax.swing.JLabel();
        etiket = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cikcik = new javax.swing.JTextArea();
        etiketlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kalankarakter = new javax.swing.JLabel();
        cikcikle = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        enkisacikcik = new javax.swing.JTextArea();
        soru2 = new javax.swing.JLabel();
        encokbul = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GLOBAL CİKCİKER V1");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oturumid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oturumid.setText("XX1234567890");
        getContentPane().add(oturumid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CİKCİKER'e Hoşgeldin ,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        cikis.setText("Çıkış Yap");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });
        getContentPane().add(cikis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        cikcikler.setBackground(new java.awt.Color(153, 153, 153));
        cikcikler.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cikcikler.setForeground(new java.awt.Color(255, 255, 255));
        cikcikler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KULLANICI", "CİKCİK", "ETİKET", "TARİH", "RE-CİKCİK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cikcikler.setRowHeight(18);
        cikcikler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cikcikler.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        cikcikler.setShowVerticalLines(false);
        cikcikler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikciklerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cikcikler);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1130, 360));

        soru1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        soru1.setText("soru1");
        getContentPane().add(soru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        kisacikciklabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        kisacikciklabel.setText("EN KISA CİKCİK");
        getContentPane().add(kisacikciklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, 20));

        tarih.setDateFormatString("dd.MM.yyyy");
        getContentPane().add(tarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 130, 30));

        soru3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(soru3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 410, 30));

        jLabel3.setText("Tarih :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 40, 30));

        recikcikle.setBackground(new java.awt.Color(0, 0, 0));
        recikcikle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        recikcikle.setForeground(new java.awt.Color(255, 255, 255));
        recikcikle.setText("RE-CİKCİK'LE");
        recikcikle.setEnabled(false);
        recikcikle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recikcikleActionPerformed(evt);
            }
        });
        getContentPane().add(recikcikle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 1130, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("GÜNÜN CİKCİKLERİ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiketlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiketlabel.setText("CİKCİK :");

        etiket.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                etiketKeyReleased(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        cikcik.setColumns(15);
        cikcik.setLineWrap(true);
        cikcik.setRows(5);
        cikcik.setHighlighter(null);
        cikcik.setInheritsPopupMenu(true);
        cikcik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cikcikKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(cikcik);

        etiketlabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiketlabel1.setText("#ETİKET :");

        jLabel2.setText("Kalan karakter hakkı :");

        kalankarakter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kalankarakter.setText("140");

        cikcikle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cikcikle.setText("CİKCİKLE");
        cikcikle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikcikleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cikcikle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etiketlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(etiketlabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kalankarakter))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(etiket, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiketlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(etiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiketlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalankarakter, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cikcikle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 320, 230));

        enkisacikcik.setEditable(false);
        enkisacikcik.setColumns(20);
        enkisacikcik.setLineWrap(true);
        enkisacikcik.setRows(5);
        jScrollPane3.setViewportView(enkisacikcik);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 110));

        soru2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(soru2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 20));

        encokbul.setText("en çok cikciklenen etiketi bul");
        encokbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encokbulActionPerformed(evt);
            }
        });
        getContentPane().add(encokbul, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 190, 30));

        jButton1.setText("VERİLERİ GÜNCELLE || TÜNELİ TEMİZLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 10, 440, 20));

        setSize(new java.awt.Dimension(1146, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void cikciker_temizle()
    {
        DefaultTableModel tablo = (DefaultTableModel)cikcikler.getModel();
        int rowCount = tablo.getRowCount();
        
        for (int i = rowCount - 1; i >= 0; i--) {
            tablo.removeRow(i);
        }
    
    }

    void cikciker_kur()
    {
        cikciker_temizle();
        
        File file = new File("veriler.txt"); 
        cikcikler.getColumnModel().getColumn(0).setMaxWidth(95);
        cikcikler.getColumnModel().getColumn(1).setPreferredWidth(450);
        cikcikler.getColumnModel().getColumn(2).setMaxWidth(180);
        cikcikler.getColumnModel().getColumn(3).setMaxWidth(90);
        cikcikler.getColumnModel().getColumn(4).setMaxWidth(80);
        
        try{
            
            
            FileReader fr = new  FileReader(file);
            BufferedReader br =new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)cikcikler.getModel();
            
            Object[] sutunlar = br.lines().toArray();
            String[] satir;
            
            for(int i=sutunlar.length-1;i>=0;i--)
            {
                satir = sutunlar[i].toString().split(";");
                    
                for(int j=0;j<satir.length+1;j++)
                {
                    
                if(j==0)
                    {satir[j]=satir[j].substring(1,satir[j].length()); }
                
                if(j==4)
                    {satir[j]=satir[j].substring(0,satir[j].length()-1); }
                }
                
            model.addRow(satir);
            }
             
             
        }catch(FileNotFoundException ex)
        {   
            
            }
    }
    
    void soru1()
    {
    //ID NUMARASI SON RAKAMI 3 OLAN  KULLANICI SAYISI :
     File file = new File("uyeler.txt"); 
        
        try{
            
            
            FileReader fr = new  FileReader(file);
            BufferedReader br =new BufferedReader(fr);
            
            
            Object[] sutunlar = br.lines().toArray();
            String[] satir;
            
            int kullanici_say=0;
            
         for (Object sutunlar1 : sutunlar) {
             satir = sutunlar1.toString().split(";");
             for (int j = 0; j < satir.length + 1; j++) {
                 
                 if (j == 0  )
                 {
                     if(Integer.parseInt(satir[j].substring(11, 12))==3)
                         kullanici_say++;
                     
                 }
             }
         }
          
          soru1.setText("ID numarası son rakamı 3 olan kullanıcı sayısı: "+ kullanici_say);
        }  catch(FileNotFoundException e){  }
        
    
    }
    
    void soru2()
    {
    //en fazla yenidencikciklenen kullanıcının ülkesi
        
        File file = new File("veriler.txt"); 
        
        try{
            
            
            FileReader fr = new  FileReader(file);
            BufferedReader br =new BufferedReader(fr);
            
            
            Object[] sutunlar = br.lines().toArray();
            String[] satir;
            
            String veri="";
            
            String [] ulke = new String[sutunlar.length];
            int [] recikcik = new int[sutunlar.length];
            
            for (int i = 0; i < sutunlar.length; i++) {

                satir = sutunlar[i].toString().split(";");

                for (int j = 0; j < satir.length + 1; j++) {
                    if (j == 0) {
                        satir[j] = satir[j].substring(1, 3);
                    }
                    if (j == 4) {
                        ulke[i] = satir[0];
                        recikcik[i] = Integer.parseInt(satir[j]);
                    }
                }
            }
            
          //en büyük değeri bul ;
          
          int enbyk = recikcik[0];
          int indis = 0;
          
          for(int i =0; i<recikcik.length;i++)
          {
              if(recikcik[i]>enbyk){
                  enbyk=recikcik[i];
                  indis=i;
              }
          }
          
          soru2.setText("en fazla re-cikciklenen kullanıcının ülkesi: "+ulke[indis]);
          
        }catch(Exception e)
        { }
        
        
    }
    
    void soru3()
    {  
       // xx.xx.xxxx tarihinde en çok cikciklenen etiket 
        
       File file = new File("veriler.txt"); 
       cikciker_kur();
       
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        String tarih_cek = "";
        
        boolean tarih_mevcutmu = false;
        try {
           

            if (!(df.format(tarih.getDate()).isBlank()))  {
                tarih_cek = df.format(tarih.getDate());
                tarih_mevcutmu = true;
            }

            if (tarih_mevcutmu == true) {
                
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                Object[] sutunlar = br.lines().toArray();
                String[] satir;

                
                String[] etiketler = new String[sutunlar.length];
                int[] recikcik = new int[sutunlar.length];

                for (int i = 0; i < sutunlar.length; i++) {

                    satir = sutunlar[i].toString().split(";");

                    for (int j = 0; j < satir.length + 1; j++) {
                        if (j == 2) {
                            if(satir[3].equals(tarih_cek))
                              etiketler[i] = satir[j];
                        }
                        if (j == 4) {
                            if(satir[3].equals(tarih_cek))
                            recikcik[i] = Integer.parseInt(satir[j].substring(0,satir[j].length()-1));
                            
                        }
                    }
                }

                //en büyük değeri bul ;
                int enbyk = recikcik[0];
                int indis = 0;

                for (int i = 0; i < recikcik.length; i++) {
                    if (recikcik[i] > enbyk) {
                        enbyk = recikcik[i];
                        indis = i;
                    }
                }
                
                if(!(etiketler[indis]==null))
                 soru3.setText(tarih_cek+" Tarihinde En çok cikciklenen etiket: "+etiketler[indis]);
                
            }
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HATA ! -> Hatalı tarih yada Teknik bir hata oluştu !");
            soru3.setText("");
        }
        
          
    }
    
    void soru4()
    {
    //EN KISA CİKCİK BİLGİSİ
     File file = new File("veriler.txt"); 
        
        try{
            
            
            FileReader fr = new  FileReader(file);
            BufferedReader br =new BufferedReader(fr);
            
            
            Object[] sutunlar = br.lines().toArray();
            String[] satir;
            
           String [] cikcik = new String[sutunlar.length];
            int [] uzunluk = new int[sutunlar.length];
            
            for (int i = 0; i < sutunlar.length; i++) {

                satir = sutunlar[i].toString().split(";");

                for (int j = 0; j < satir.length + 1; j++) {
                    if (j == 1) {
                        uzunluk[i]=satir[j].length();
                        cikcik[i]=satir[j];
                    }
                }
            }
            
            int en_kisa = uzunluk[0];
            int indis=0;
            
            for(int i =0; i<uzunluk.length;i++)
            {
                if(en_kisa>uzunluk[i])
                {en_kisa=uzunluk[i];
                 indis=i;
                }
            }
          
            enkisacikcik.setText(cikcik[indis]);
            
        }  catch(Exception e){  }
        
    
    }
    
    
    
    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
       Cikcikergenel.oturum_id="";
       setVisible(false);
       new Cikcikergiris().setVisible(true);
    }//GEN-LAST:event_cikisActionPerformed

    void kalankarakterhesapla() {
        int girilen_karakter = cikcik.getText().length();
        int max_karakter = 140;

        int kalan_hak = max_karakter - girilen_karakter;

        if (girilen_karakter <= max_karakter) {
            kalankarakter.setText("" + kalan_hak);
        } else {
            String metin = cikcik.getText().substring(0, max_karakter + 1);
            cikcik.setText(metin);
        }

    }
    
    private void cikcikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cikcikKeyReleased
        kalankarakterhesapla();   
    }//GEN-LAST:event_cikcikKeyReleased

    private void cikcikleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikcikleActionPerformed
        Cikcikergenel.DosyaOlustur("veriler.txt");

        String etiket_icerik = etiket.getText();
        String cikcik_icerik = cikcik.getText().trim();
        
        String safe_icerik= Cikcikergenel.icerik_safele(cikcik_icerik);
        
        String veri;
        boolean oturum_kontrol = false;
        try {
            if (!(etiket_icerik.isBlank() || safe_icerik.isBlank())) {

                veri = "("+oturumid.getText() +";"+safe_icerik+ ";#" + etiket_icerik + ";" + Cikcikergenel.tarihigetir("dd.MM.yyyy") + ";" + "0"+")";
                String veri_kontrol = oturumid.getText() + ";" + safe_icerik;
                
                if (Cikcikergenel.icerik_kontrol("veriler.txt",veri_kontrol)==false) {
                    Cikcikergenel.DosyaYaz("veriler.txt", veri);
                    JOptionPane.showMessageDialog(null, "CİKCİKLENDİ !");
                }
                else
                {JOptionPane.showMessageDialog(null, "HATA ! -> CİKCİK ZATEN CİKCİKLENMİŞ !");}
                
            } else {
                JOptionPane.showMessageDialog(null, "HATA ! -> Etiket veya Cikcik alanı boş bırakılamaz ve sadece özel karakter girilemez !");
            }

            cikciker_kur();
            soru1();
            soru2();
            soru4();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_cikcikleActionPerformed

    
    private void etiketKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etiketKeyReleased
        int girilen_karakter = etiket.getText().length();
        int max_karakter = 20;

        int kalan_hak = max_karakter - girilen_karakter;

        if (girilen_karakter>max_karakter) { 
            String metin = etiket.getText().substring(0, max_karakter + 1);
            etiket.setText(metin);
        }
    }//GEN-LAST:event_etiketKeyReleased

    private void encokbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encokbulActionPerformed
   
    soru3();
    }//GEN-LAST:event_encokbulActionPerformed

    
    private void recikcikleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recikcikleActionPerformed
  
        //SECİLEN SATIRDAKİ VERİLERİ ALIP İSTEDİKLERİMİ DEĞİŞKENLERE ATIYORUM
        //KONTROL VE GÜNCELLEME YAPABİLMEK İÇİN KULLANCAĞIM
        DefaultTableModel model = (DefaultTableModel)cikcikler.getModel();
        int secilen_satir_indis = cikcikler.getSelectedRow();
        
        String cikcik_sayi_degeri = model.getValueAt(secilen_satir_indis,4).toString();
         
        int cikcik_yenideger=Integer.parseInt(cikcik_sayi_degeri)+1;
        model.setValueAt(cikcik_yenideger, secilen_satir_indis, 4);
        
        String secilen_id = model.getValueAt(secilen_satir_indis, 0).toString();
        
        String yenicikciksayiverisi =model.getValueAt(secilen_satir_indis, 4).toString();
       
        String etiket_icerik = model.getValueAt(secilen_satir_indis, 2).toString();;
        String cikcik_icerik = model.getValueAt(secilen_satir_indis, 1).toString();;
        String cikcik_tarih = model.getValueAt(secilen_satir_indis, 3).toString();;
         //SECİLEN STOP
         
        String eski_veri=secilen_id+";"+cikcik_icerik+";"+etiket_icerik+";"+cikcik_tarih+";"+cikcik_sayi_degeri;
        String yeni_veri=secilen_id+";"+cikcik_icerik+";"+etiket_icerik+";"+cikcik_tarih+";"+yenicikciksayiverisi;
        
        Cikcikergenel.satirguncelle("veriler.txt", eski_veri, yeni_veri);
        
        cikciker_kur();
        recikcikle.setEnabled(false);     
        
    }//GEN-LAST:event_recikcikleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cikciker_kur();
        soru3.setText("");
        etiket.setText("");
        cikcik.setText("");
        kalankarakter.setText("140");
        recikcikle.setEnabled(false);   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
 
    private void cikciklerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikciklerMouseClicked
      recikcikle.setEnabled(true);      
    }//GEN-LAST:event_cikciklerMouseClicked

  
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Cikcikeranasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cikcikeranasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cikcikeranasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cikcikeranasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cikcikeranasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cikcik;
    private javax.swing.JButton cikcikle;
    private javax.swing.JTable cikcikler;
    private javax.swing.JButton cikis;
    private javax.swing.JButton encokbul;
    private javax.swing.JTextArea enkisacikcik;
    private javax.swing.JTextField etiket;
    private javax.swing.JLabel etiketlabel;
    private javax.swing.JLabel etiketlabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel kalankarakter;
    private javax.swing.JLabel kisacikciklabel;
    private javax.swing.JLabel oturumid;
    private javax.swing.JButton recikcikle;
    private javax.swing.JLabel soru1;
    private javax.swing.JLabel soru2;
    private javax.swing.JLabel soru3;
    private com.toedter.calendar.JDateChooser tarih;
    // End of variables declaration//GEN-END:variables
}
