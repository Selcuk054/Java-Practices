package day09_MethodCreation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q11_kareleriToplami {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
    ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
    hesaplayan kodu yazınız.

    Örnek Ekran Çıktısı
    Girilen sayı=4
    Kareler toplamı=14
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("1 den buyuk bir sayi tamsayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            toplam+=(i*i);

        }
        System.out.println("sayilarin  kareleri tolami :"+ toplam);

    }
}
