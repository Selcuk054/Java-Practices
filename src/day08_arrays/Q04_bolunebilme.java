package day08_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q04_bolunebilme {
    public static void main(String[] args) {
       // SORU 3 : 0 ile 5.000 arasındaki sayılardan;  9 ve 11 e tam bölünebilen sayıları
        // ve bu sayıların toplam kaç tane olduğunu yazdırın

        int bas=0;
        int bitis=5000;
        int sayac=0;

        Scanner scan=new Scanner(System.in);
        for (int i = 1; i <=bitis ; i++) {
            if (i%9==0 && i%11==0){
                System.out.println(i);
                sayac++;
            }

        }
        System.out.println("");
        System.out.println("9 ve 11 e bolunebilen sayilar :"+ sayac +"adet");

        int dizi[]=new int[sayac];
        sayac=0;
        for (int i = 99; i <=5000 ; i+=99) {
            if (i%99==0){
                dizi[sayac]=i;
                sayac++;
            }

        }
        System.out.println(Arrays.toString(dizi));

    }
}
