package day12_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_Arraylist {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun degerlerini bulan java programi yaziniz
         * not kisa metodlar kullanmayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr={1,2,3,4,5,6,7,8,9};

        Arrays.sort(arr);
        System.out.println((arr.length-2) +" and " +(arr.length-1));



    }
}
