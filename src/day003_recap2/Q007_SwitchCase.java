package day003_recap2;

import javax.swing.*;
import java.util.Scanner;

public class Q007_SwitchCase {
    public static void main(String[] args) {
        //Girilen uc haneli bir sayinin okunusunu yazi ile yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("uc basamakli bir syi giriniz");
        int sayi = scan.nextInt();

        int birlerBs=sayi%10, onlarBs = (sayi/10)%10, yuzlerBs=sayi/100;

        if (sayi>99 && sayi<1000){
            switch (yuzlerBs){
                case 0: System.out.println(""); break;
                case 1: System.out.println("yuz\t"); break;
                case 2: System.out.println("ikiyuz\t"); break;
                case 3: System.out.println("ucyuz\t"); break;
                case 4: System.out.println("dortyuz\t"); break;
                case 5: System.out.println("besyuz\t"); break;
                case 6: System.out.println("altiyuz\t"); break;
                case 7: System.out.println("yediyuz\t"); break;
                case 8: System.out.println("sekizyuz\t"); break;
                case 9: System.out.println("dokuzyuz\t"); break;
            }
            switch (onlarBs){
                case 0: System.out.println(""); break;
                case 1: System.out.println("on\t"); break;
                case 2: System.out.println("yirmi\t"); break;
                case 3: System.out.println("otuz\t"); break;
                case 4: System.out.println("kirk\t"); break;
                case 5: System.out.println("elli\t"); break;
                case 6: System.out.println("altmis\t"); break;
                case 7: System.out.println("yetmis\t"); break;
                case 8: System.out.println("seksen\t"); break;
                case 9: System.out.println("doksan\t"); break;
            }
            switch (birlerBs){
                case 0: System.out.println(""); break;
                case 1: System.out.println("bir"); break;
                case 2: System.out.println("iki"); break;
                case 3: System.out.println("uc"); break;
                case 4: System.out.println("dort"); break;
                case 5: System.out.println("bes"); break;
                case 6: System.out.println("alti"); break;
                case 7: System.out.println("yedi"); break;
                case 8: System.out.println("sekiz"); break;
                case 9: System.out.println("dokuz"); break;
            }



        }else System.out.println("Lutfen Uc basamakli bir sayi giriniz");



    }
}
