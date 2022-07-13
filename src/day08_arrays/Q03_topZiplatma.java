package day08_arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q03_topZiplatma {
    public static void main(String[] args) {
      /*  SORU2 : Bir top belirli bir yukseklikten bırakılmaktadır. Birakildigi yuksekligi isteyin.
        Bırakıldıktan  sonra, bırakıldığı yuksekligin 3/4'ü kadar yerden yukari doğru ziplamaktadir
        Top; ziplama yuksekligi 1 metrenin altina indiginde durmaktaadir
        Bu ana kadar aldigi toplam yolu ve yere vurma sayisini bulan kodları do - while ile çözünüz

       */

        System.out.println("Lutfen topun birakildigi yuksekligi giriniz");
        double toplam=0;
        double biriken=0;
        int vurmaSayisi=0;
        double ikinci=0;
        Scanner scan=new Scanner(System.in);
        double hoog=scan.nextDouble();
// Scan scanner   do nun yada while in icinde kullanildiginda kullanicidan devamli sayi istiyor.
        //fakat disinda oldugunda ise donguyu ustteki isteneni alip devam ediyor, tekrar tekrar istemiyor.

        do {
            hoog=(hoog*3)/4;
                ikinci=hoog;
                biriken+=hoog;
                vurmaSayisi++;
        }while (ikinci>1);
        System.out.println("Topun aldigi yol ;"+biriken +"\n"+ "Vurma Sayisi :"+vurmaSayisi );

    }
}
