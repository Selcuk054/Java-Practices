package day05_practice;

import java.util.Scanner;

public class Q08_karelerToplami {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
        System.out.println("Lutfen 1 den buyuk bir tamsayi giriniz");
        Scanner scan =new Scanner(System.in);
        int getal= scan.nextInt();
        int kare=1;
        int toplam=1;

        for (int i = 1; i <=getal; i++) {
            kare=i*i;
            toplam+=kare;
        }
        System.out.println("Kareler Toplmai :"+toplam);

    }
}
