package day06_practice;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        System.out.println("Lutfen bir sayi giriniz");
        Scanner scan=new Scanner(System.in);
        int sayi= scan.nextInt();
        int count=0;

        while(sayi>0) {
            if (sayi % 2 == 1){

                System.out.println(sayi);
                count++;
            }
            sayi--;

        }
        System.out.println("Count = "+ count);

    }
}
