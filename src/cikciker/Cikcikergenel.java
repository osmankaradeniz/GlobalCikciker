package cikciker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Osman Karadeniz
 */
public class Cikcikergenel {
    public static String oturum_id;
    //Default
   
    
    
    public static void DosyaOlustur(String dosya_adi){
    File file = new File(dosya_adi);
    
    try {
        if(!file.exists()){ 
            file.createNewFile();
             JOptionPane.showMessageDialog(null, "Veri dosyası oluşturuldu !");
        }else{
           //veri dosyası var
        }
    } catch (IOException e) { 
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    public static void DosyaYaz(String dosya_adi,String veri){
    File file = new File(dosya_adi); // hangi dosya üzerinde işlem yapacağımızı seçiyoruz.
        try {
            
            FileWriter yaz = new FileWriter(file,true);
            yaz.write(veri+"\n");
            yaz.flush();
        }catch (IOException e) {  
        JOptionPane.showMessageDialog(null, e);
        }
}
    
    
    public static int[] id_num_olustur() {
        // https://github.com/users/osmankaradeniz/projects/1
        // yukarıdaki bağlantıda kurmuş olduğum yapıya benzer yapı ile benzersiz id oluşturuyorum.

        Random rnd = new Random();
        
        int boyut = 10;
        int dizi[] = new int[boyut];

        boolean kontrol = true;
        int i = 0;
        int rasgele_sayi;

        while (i < dizi.length) {
            kontrol = true;
            rasgele_sayi = rnd.nextInt(dizi.length);

            for (int j = 0; j < dizi.length; j++) {
                if (rasgele_sayi == 0) {
                    continue;
                }

                if (dizi[j] == rasgele_sayi) {
                    kontrol = false;
                    break;
                }
            }

            if (kontrol == true) {
                dizi[i] = rasgele_sayi;
                i++;
            }

        }
        return dizi;
    }
    
    public static String  yeni_id()
    {
    String id_num = "";
        int id[] = Cikcikergenel.id_num_olustur();
        for (int i : id) {
            id_num = id_num + i;
        }
        return id_num;
    }
     
    public static boolean Oturum_kontrol(String dosya, String id,String sifre) {
        boolean oturum=false;
        try {

            FileReader okuyucu = new FileReader(dosya);
            BufferedReader nesne = new BufferedReader(okuyucu);
            String satir = nesne.readLine();
            
            while (satir != null) {
                String[] parcala = satir.split(";");
                
                if (id.equals(parcala[0]) && sifre.equals(parcala[1])) 
                { 
                    oturum=true;
                    Cikcikergenel.oturum_id=id;
                    break;
                }
                else
                {
                    oturum=false;
                }
                
                satir = nesne.readLine();
            }
            
           if(oturum==true) 
               JOptionPane.showMessageDialog(null, "Giriş Başarılı !"); 
            else
           {JOptionPane.showMessageDialog(null, "Giriş Bilgileri Hatalı !"); }
            
        } catch (FileNotFoundException exception) {
          JOptionPane.showMessageDialog(null, "Dosya Bulunamadı ! -> KAYIT OLARAK VERİ DOSYASINA ERİŞEBİLİRSİNİZ");

        } catch (IOException exception) {
             JOptionPane.showMessageDialog(null, "Hata oluştu !");
        }
        
        return oturum;
        
    }
    
    public static String tarihigetir(String tarihFormati)
    {
        Calendar takvim = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(tarihFormati);
        return sdf.format(takvim.getTime());
    }
    
    
    public static void satirguncelle(String dosya_adi, String eski_veri, String yeni_veri)
	{
		File dosya = new File(dosya_adi);
		
		String eski_icerik = "";
                
		try 
		{
			BufferedReader oku = oku = new BufferedReader(new FileReader(dosya));
			
			//oku
                        
			String satir = oku.readLine();
			
			while (satir != null) 
			{
				eski_icerik = eski_icerik  + satir + System.lineSeparator();
				satir = oku.readLine();
				
			}
			
			//değiştir
//                        System.out.println(yeni_veri);
//                        System.out.println(eski_icerik);
			String yeniicerik = eski_icerik.replaceAll(eski_veri, yeni_veri);
                        
			// güncelle
			FileWriter yaz = new FileWriter(dosya);
                        yaz.write(yeniicerik);
                        yaz.close();
      
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
    
    public static boolean icerik_kontrol(String dosya_adi, String veri) {
        
        BufferedReader oku = null;
        
        boolean kontrol = false; // daha önce yok kabul ediyoruz gelen veriyi
        String satir ="";

        try {
            

            oku = new BufferedReader(new FileReader(dosya_adi));

            while ((satir = oku.readLine()) != null) {
                String dizi[] = satir.split(";");
               
                String kontrol_veri =dizi[0].substring(1,dizi[0].length())+";"+dizi[1];
                System.out.println(kontrol_veri);
                System.out.println(veri);
             if(kontrol_veri.equals(veri))
                    kontrol=true;
             
            }
            
            
            

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                if (oku != null) {
                    oku.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return kontrol;
    }
    
    public static String icerik_safele(String veri) {
        String safe_icerik = "";

        //String yasaklar_yaz[] = {"\\)", "\\(", "\n", "\\;", "\\*", "\\|", "\\+" + "\\s"}; 
        // /n \\s
        char yasaklar[] = {')', '(', ';', '*', '|', '+','?'};;
      
       
        
        for (int i = 0; i < veri.length(); i++) {
            
            boolean ekle = true;
            
            for (int j = 0; j < yasaklar.length; j++)
            {
                if (yasaklar[j] == veri.charAt(i))
                {
                   ekle=false;
                }
              
            }
            
            if(ekle==true)
                safe_icerik +=veri.charAt(i);
        }
        
        
        safe_icerik = safe_icerik.replaceAll("/n", "");
        
      
        return safe_icerik;

    }
     
     
}
