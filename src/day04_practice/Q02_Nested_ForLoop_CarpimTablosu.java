package day04_practice;

import java.util.Scanner;

public class Q02_Nested_ForLoop_CarpimTablosu {
    //Kullanicidan pozitif bir rakam girmesini isteyin ve girilen
   // rakama gore carpim tablosu olusturun.
    //Ornek kullanici 3 girerse
    //   123
    //   246
    //   369

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir rakam giriniz");
        int rakam=scan.nextInt();

        for (int i = 1; i <=rakam ; i++) {
            for (int j = 1; j <=rakam ; j++)
            {System.out.print(" "+i*j);

            }System.out.println(" ");
        }
    }
}
