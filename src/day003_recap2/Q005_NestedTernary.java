package day003_recap2;

import java.util.Scanner;

public class Q005_NestedTernary {
    /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        System.out.println("lutfen final notunuzu giriniz");

        char finalNotu='C';

        String result= finalNotu=='A' ? "Gayet Basarili " : finalNotu=='B'? "Basarili" :finalNotu=='C'? "Ha gayret":"Digerleri..";
        System.out.println("result = " + result);




    }
}
