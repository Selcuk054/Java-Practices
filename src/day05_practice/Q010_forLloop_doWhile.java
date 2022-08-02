package day05_practice;

import java.util.Scanner;

public class Q010_forLloop_doWhile {
    /*
    SORU 1 : Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
    o ana kadar kaç sayı girildiği ekrana yazdırılacak.
    bu soruyu hem for-loop döngüsü ile yapınız.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int sayac = 0;
        int toplam = 0;


        for (int i = 0; i <= sayac; i++) {
            if (toplam < 100) {
                System.out.println("Lutfen toplanmasini istediginiz sayilari giriniz");
                sayi = scan.nextInt();
                toplam += sayi;
                sayac++;
            } else {
                System.out.println(sayac + " sayi girdiniz ve toplamlari :" + toplam);
            }


        }

    }
}
