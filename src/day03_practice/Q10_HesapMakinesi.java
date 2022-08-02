package day03_practice;

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
        System.out.println("Islemi giriniz");
        char islem=scan.next().charAt(0);
        System.out.println("Ilk sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        if       (islem=='-') {System.out.println("Islemin sonucu :"+(sayi1-sayi2));
        }else if (islem=='+') {System.out.println("Islemin sonucu :"+(sayi1+sayi2));
        }else if (islem=='*') {System.out.println("Islemin sonucu :"+(sayi1*sayi2));
        }else if (islem=='/') {System.out.println("Islemin sonucu :"+(sayi1/sayi2));
        }else System.out.println("Gecerli bir deger giriniz");}}

