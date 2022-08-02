package day05_practice;

import java.util.Scanner;

public class Q011_doWhile {
    public static void main(String[] args) {
 /*
    SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
    o ana kadar kaç sayı girildiği ekrana yazdırılacak.
    bu soruyu while -do döngüsü ile yapınız.
     */
        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int sayac = 0;
        int toplam = 0;


        do {
            System.out.println("Lutfen toplanmasini istediginiz sayilari giriniz");
            sayi = scan.nextInt();

            toplam += sayi;
            sayac++;
        } while (toplam < 100);
        System.out.println(sayac + " sayi girdiniz ve toplamlari :" + toplam);
    }
}