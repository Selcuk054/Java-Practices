package day02_practice;

import java.util.Scanner;

public class Q002_String_Manipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin.

    public static void main(String[] args) {
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        Scanner scan =new Scanner(System.in);

        String naam=scan.nextLine();
        System.out.println(naam.toUpperCase());
        String achternaam=scan.nextLine();
        System.out.println(achternaam);




    }


}
