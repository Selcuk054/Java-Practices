package day09_deneme;

import java.util.Scanner;

public class Q03_doWhileLoop {
    public static void main(String[] args) {
        /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */

        Scanner scan=new Scanner(System.in);
        String okunan="";
        do{
            System.out.println("Harf giriniz : ");
            okunan=scan.next();
            System.out.println("Program Calisiyor");


        }while(okunan.equalsIgnoreCase("x"));
        System.out.println("Progrem bitti");


    }
}
