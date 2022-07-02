package day004_practice;

import java.util.Scanner;

public class Q003_String_Manipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri kelime giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan =new Scanner(System.in);
        System.out.println("Iki ayri kelime giriniz");

        String woord1=scan.next();
        String woord2=scan.next();

        System.out.println(woord1.concat(woord2));

        woord1=woord1.substring(1);
        woord2=woord2.substring(1);
        System.out.println(woord1.concat(woord2));


    }
}
