
package Sarkici_Programi;

import java.util.Scanner;


public class Main {

    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner input = new Scanner(System.in);
    
    public static void islemleri_goster(){
        System.out.println("0 - Islem Menusu");
        System.out.println("1 - şarkıcıları goruntule");
        System.out.println("2 - şarkıcı ekle");
        System.out.println("3 - şarkıcı guncelle");
        System.out.println("4 - sarkıcı sil");
        System.out.println("5 - şarkıcı ara");
        System.out.println("6 - uygulamadan çık");
    }
    
    public static void sarkicilari_goruntule(){
        sarkicilar.sarkicilari_goster();
    }
    
    public static void sarkici_ekle(){
        System.out.println("eklemek istediginiz şarkıcıyı giriniz: ");
        String isim = input.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    
    public static void sarkici_guncelle(){
        System.out.println("Güncellemek  istediginiz şarkıcının posizyonunu giriniz : ");
        int pozisyon = input.nextInt();
        input.nextLine();
        String isim = input.nextLine();
        sarkicilar.sarkici_guncelle(isim, pozisyon - 1);
    }
    
    public static void sarkici_sil(){
        System.out.println("silme istediginiz şarkıcının posziyonunu giriniz : ");
        int pozisyon = input.nextInt();
        sarkicilar.sarkici_sil(pozisyon - 1);
    }
    
    public static void sarkici_ara(){
        System.out.println("aramak istediginiz şarkıcının adını giriniz : ");
        String isim = input.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    
    public static void main(String[] args) {
        
        System.out.println("Sarkici uygulamasına hoşgeldiniz");
        islemleri_goster();
        boolean cikis = false;
        int islem;
        
        while(!cikis){
            System.out.println("Lutfen bir işlem seciniz");
            islem = input.nextInt();
            input.nextLine();
            
                switch(islem){
                    case 0:
                        islemleri_goster();
                        break;
                    case 1:
                        sarkicilari_goruntule();
                        break;
                    case 2:
                        sarkici_ekle();
                        break;
                    case 3:
                        sarkici_guncelle();
                        break;
                    case 4:
                        sarkici_sil();
                        break;    
                    case 5:
                        sarkici_ara();
                        break;
                    case 6:
                        cikis = true;
                        System.out.println("Uygulamadan çıkılıyor");
                        break;
                }
        }
        
    }
    
}
