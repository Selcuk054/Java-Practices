package day12_Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Q00_Eski_soru {
    public static void main(String[] args) {
        /*

   kullanıcının girdigi bir array'in en buyuk elemani ile
   en kucuk elemanının  farkını bulan bir method create ediniz.
*/
   farkiniBul();
        
        
    }

    private static void farkiniBul() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Array uzunlugunu giriniz : ");
        int uzunluk=scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Aray in " +(i+1)+ ". elemanini giriniz" ); //i --> oldugunda 0. eleman diyecek direkt eleman sorduk
            arr[i]=scan.nextInt(); //for i den gelen indexler, bu satirda kullanici tarafindan dongu bitene kadar girilen elemanlar okunur.
        }

        Arrays.sort(arr);
        System.out.println("Arraydeki enbuyuk eleman ile en kucuk eleman arasindaki fark ; "+ (arr[uzunluk-1]-arr[0]));

        //Odev : bu soruyu matematik class i kullanrak cozunuz





    }
    }

