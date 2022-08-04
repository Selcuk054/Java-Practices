package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogretmenList=new ArrayList<>();
    static List<Kisi> ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;
    //static yazmamizin sebebi tum methodlardan ulasmak icin. gokteki ay gibi.

   public static void girisPaneli(){
       System.out.println("====================================");
       System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
       System.out.println("====================================");
       System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
       System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
       System.out.println("Q- ÇIKIŞ");

       String secim=scan.nextLine().toUpperCase(); //Kullanici kucuk harf girse bile buyuk harfe cevirdik
       switch (secim){
           case "1":
               islemMenusu();
               kisiTuru="Ogrenci";

               break;
           case "2":
               islemMenusu();
               kisiTuru="Ogretmen";

               break;
           case "Q":

               break;
           default:
               System.out.println("Hatali giris :()");
               girisPaneli();
               break;
       }

   }

    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu : "+ kisiTuru+" lutfen asagidaki islemlerden birini seciniz ");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("Islem tercihinizi giriniz");
        int secilenIslem= scan.nextInt();

        switch (secilenIslem){
            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
               // arama();
                islemMenusu();
                break;


            case 3:
               // listeleme();
                islemMenusu();
                break;

            case 4:
                //silme();
                islemMenusu();
                break;

            case 5:
                girisPaneli(); //ana menu
                break;

            case 0:
                //cikis();
                break;
            default:
                System.out.println("Gecersiz giris yaptiniz");
                islemMenusu();
        }
    }

    private static void ekle() { // bu method hem ogrenci hemde ogretmen iciin tasarlandi
        System.out.println("****** "+ kisiTuru+" ekleme sayfasina hosgeldiniz");
        System.out.println("Isim soyisim giriniz");
        String adSoyad=scan.nextLine();
        scan.nextLine();

        System.out.println("Kimlik no giriniz");
        String kimlikNo=scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

       if(kisiTuru.equals("OGRENCI")){ //TODO sonra doldur

       }else{
           System.out.println("bolum giriniz");
           String bolum=scan.nextLine();
           scan.nextLine(); //dummy code
           System.out.println("sicil no giriniz");
           String sicilNo=scan.nextLine();

           Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
           ogretmenList.add(ogretmen);
           System.out.println(ogretmenList);
       }
    }
}
 