package day13_interwiewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

/*
Kullanicidan alinan bir tamsayiya kadar FIBONACCU dizisi olusturun

 */
public static void main(String[] args) {
    List<Integer> fibonacciList=new ArrayList<>();
    Scanner scan =new Scanner(System.in);
    System.out.println("bir sayi gir");
    int sayi=scan.nextInt();

    fibonacciList.add(0);
    fibonacciList.add(1);
    System.out.println("fibonacciList = " + fibonacciList);

    int i=1; //Bu i yi while sartini olusturmak icin kullandim.
    if (sayi<=1){
        System.out.println("Sifirdan buyuk sayi giriniz");
    }else {
        while (fibonacciList.get(i)<sayi){ //fibonacci elemanlari sayidan kucuk oldugu surece
            fibonacciList.add(fibonacciList.get(i)+ fibonacciList.get(i-1)); //bir onceki elemani yanindaki eleman il toplar.
            i++;
            System.out.println("fibonacciList = " + fibonacciList);
        }
    }
    int sonIdextekiEleman=fibonacciList.size()-1;
    if (fibonacciList.get(sonIdextekiEleman)>sayi){
        fibonacciList.remove(sonIdextekiEleman); //son elemani kaldirir
        System.out.println("Girilen sayi fibonacci dizisinde bulunmamaktadir = " +
                "sizin girdiginiz sayiya kadarki fibonacci dizisi budur "+fibonacciList);
    }else {
        System.out.println("girilen sayi fibonacci listesinde var fibonaccilist = "+ fibonacciList);
    }

  }
}
