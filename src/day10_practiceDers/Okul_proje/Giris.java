package day10_practiceDers.Okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {

        /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */

        System.out.println("Hosgeldiniz Okulumuza");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in); //TODO static tanimla
        String isim=scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans=scan.next();
      //  scan.nextLine();//dummy hayalet code

        System.out.println("tel no giriniz");
        String telNo=scan.next();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,telNo);

        List<OgretmenBilgileri>ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }



}
