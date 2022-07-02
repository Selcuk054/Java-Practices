package day002_recap1;

import java.util.Scanner;

public class Q09_NotHesaplama {

    /*
     * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int vize1;
        int vize2;
        int finalNotu;

        System.out.print("Vize1:");
        vize1=scan.nextInt();

        System.out.print("ikinci vize");
        vize2=scan.nextInt();

        System.out.print("final notu:");
        finalNotu=scan.nextInt();

        double sonuc= ((vize1+vize2)/2)*0.3 + finalNotu * 0.7;
        System.out.println("sonuc = " + sonuc);




    }

}
