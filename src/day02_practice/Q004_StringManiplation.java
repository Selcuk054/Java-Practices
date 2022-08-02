package day02_practice;

import java.util.Scanner;

public class Q004_StringManiplation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin.
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen isminizi ve soyisminzi giriniz");
        String firstname=scan.nextLine(),
                lastname=scan.nextLine();//multiple declaration
        String fullName= firstname.concat(" "+lastname).toUpperCase();
        System.out.println("fullName = " + fullName);


    }


}
