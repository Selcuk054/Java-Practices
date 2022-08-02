package day05_practice;

import java.util.Scanner;

public class Q02_methodCreation {
    public static void main(String[] args) {
         /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */

        metre_km();
    }

    public static void metre_km() {
        System.out.println("Degerin kac cm oldugunu giriniz");
        Scanner scan=new Scanner(System.in);
        double cm=scan.nextDouble();

        System.out.println("Girilen deger :"+cm/100 +"metre dir");
        System.out.println("Girilen deger :"+cm/100000 +"kilometre dir");

    }
}
