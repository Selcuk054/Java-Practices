package day005_stringManipulation;

import java.util.Scanner;

public class Q10_HesapMakinesi {
    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Islemi giriniz");
        char islem=scan.next().charAt(0);
        System.out.println("Ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        if (islem=='-') {
            if (sayi1 > sayi2) { System.out.println("Islemin sonucu :" + (sayi1 - sayi2));
            }else if (sayi2>sayi1){System.out.println("Islemin sonucu :" + (sayi2-sayi1));
            }else System.out.println("Sonuc 0 dir");
        }else if (islem=='+') {System.out.println("Islemin sonucu :"+(sayi1+sayi2));
        }else if (islem=='*') {System.out.println("Islemin sonucu :"+(sayi1*sayi2));
        }else if (islem=='/') {
            if (sayi1>sayi2) {System.out.println("Islemin sonucu :" + (sayi1 / sayi2));
            }else if(sayi2>sayi1){System.out.println("Islemin sonucu :" + (sayi2/sayi1));
            }else System.out.println("Islemin sonucu 1 dir");
        }else System.out.println("Gecerli bir deger giriniz");}}

