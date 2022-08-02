package day03_practice;

import java.util.Scanner;

public class Q06_StringManipulation {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bosluk karakter olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.nextLine();

        if (kelime.contains(" ")){
            System.out.println("Girdiginiz kelime bosluk icermektedir");
        }else{
            System.out.println("Girdiginiz kelime bosluk icermemektedir");
        }

    }

}
