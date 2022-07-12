package day07_methodCreation_Forloop;

import java.util.Scanner;

public class Q03_Fibonacci {
    public static void main(String[] args) {
        /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

        fibonacci();
    }

    public static void fibonacci() {

        System.out.println("Lutfen 47 den kucuk bir deger giriniz");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int ikinci=1;
        int ilk=0;
        int toplam=0;

        System.out.println("0"); //ilk rakami almasi icin bunu kendimiz yazabiliriz.
        for (int i = 0; i <=num ; i++) {

            toplam=ilk+ikinci;
            ilk=ikinci;
            ikinci=toplam;



            System.out.println(toplam);




    }
}
}