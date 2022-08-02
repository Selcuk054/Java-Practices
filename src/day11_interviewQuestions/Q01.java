package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
            hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
    */

    /*
    daha oncelikler Scannner obj olusturcaz
    onceliklr split methodu kullanicaz
    sonra sort yapcaz
    for loop a alcaz
    if ile control yapicaz ve sout ile yazdiricaz
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir string ifade giriniz ede");
        String str=scan.nextLine();

        String arr[]=str.split(""); // Split ile tum harfleri ve bosluklari aayri bir eleman haline getiririyoruz.

        System.out.println("Arrays.toString(arr)arr = " + Arrays.toString(arr));

        Arrays.sort(arr);//Siralamak icin sort() kullanildi
        System.out.println(Arrays.toString(arr));

        int hesaplayici=0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                hesaplayici++;
            }else {
                System.out.println(arr[i-1]+" karakteri : "+(hesaplayici+1)+" ");
                hesaplayici=0;
            }if (i==arr.length-1) {   //yani forloopda en sona gelindiginde
                System.out.print(arr[i]+" karakteri : "+(hesaplayici+1+" "));
            }

        }


    }
}
