package day09_deneme;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        System.out.println("Lutfen bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();

        basamakToplama(sayi);
        System.out.println("Rakamlar Toplami :"+basamakToplama(sayi));

    }

    public static int basamakToplama(int sayi) {
        int toplam=0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }



        return toplam;
    }
}
