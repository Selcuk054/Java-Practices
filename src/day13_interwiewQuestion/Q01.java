package day13_interwiewQuestion;

import java.util.Scanner;

public class Q01 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
    toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

        ---
        method create ediniz
        parametre sayi aldin method
        sayilarin kup toplami container atamasi
        girilen container
        if icinde kontrol
        % kullanimi
        basamaktaki sayi diye bos bir variable olustur
        ---



      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    //Cevap 1:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        armstrong(sayi);
        girilenSayiyaKadarOlanArmstronSayilar(sayi);


    }
    private static void armstrong(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi; //girilen sayinin kupler toplami ile kiyaslamak icin

        while(sayi>0){
            basamaktakiSayi=sayi%10; //rakam rakam ayirdik
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi=sayi/10;

        }
        if(girilenSayi==sayininKuplerToplami){
            System.out.println("Girilen sayi armstrong sayidir : "+girilenSayi);
        }else{
            System.out.println("Grilien sayi armstrong sayi degildir : "+ girilenSayi);
        }


       // Cevap 2

    }



    private static void girilenSayiyaKadarOlanArmstronSayilar(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            armstrong(i);

        }


    }
    }
