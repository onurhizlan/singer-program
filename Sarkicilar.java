
package Sarkici_Programi;

import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new ArrayList<String>();
    
    public void sarkicilari_goster(){
        
        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i+1) +  ". Şarkıcı " +  sarkici_listesi.get(i));
        }
    }
    
    public void sarkici_ekle(String isim){
        
        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı Eklendi");
    }
    
    public void sarkici_guncelle(String isim, int pozisyon){
    
        sarkici_listesi.set(pozisyon, isim);
        System.out.println("şarkıcı listesi guncellendi");
    }
    
    public void sarkici_sil(int pozisyon){
        
        String isim = sarkici_listesi.get(pozisyon);
        sarkici_listesi.remove(pozisyon);
        System.out.println(isim + "Şarkıcı silindi");
    }
    
    public void sarkici_ara(String isim){
    
        int pozisyon = sarkici_listesi.indexOf(isim);
        System.out.println("Şarkıcı bulundu");
        if (pozisyon >= 0) {
            System.out.println(isim + " isimli şarkıcı" + (pozisyon+0) + ". pozisyonda");
        }else{
            System.out.println("Şarkıcı bulunamadı");
        }
    }
    
}
