package day003_recap2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q002_Scanner {
    /*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
*/

    public static void main(String[] args) {
        System.out.println("Bu isci isi kac gunde bitirmektedir");
        Scanner scan=new Scanner(System.in);
        int birIsciBitirmeSuresi= scan.nextInt();

        System.out.println("toplam isci sayisi");
        int isci_Sayisi= scan.nextInt();

        double cokluBitirmeSuresi=birIsciBitirmeSuresi/isci_Sayisi;

        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);;



    }
}
