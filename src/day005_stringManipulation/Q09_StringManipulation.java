package day005_stringManipulation;

import java.util.Scanner;

public class Q09_StringManipulation {
    /*
            * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
 * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
 *
         * ornek
 * input = Ali
 * output = lilili
 *
         * input = el
 * output = el
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();

        if (str.length()>=3){
            System.out.println(str.substring(str.length()-2)
                    + str.substring(str.length()-2) + str.substring(str.length()-2) );
        }
    }
}
