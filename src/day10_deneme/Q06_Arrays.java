package day10_deneme;

import java.util.Arrays;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        String str = "HeySiri";
        str= str.replace("Hey","Bye");
        System.out.println("str = " + str);
        String [] arr = new String [1];
        arr[0] = str;
        System.out.println(Arrays.toString(arr));
    }
}
