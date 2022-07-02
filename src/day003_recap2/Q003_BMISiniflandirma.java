package day003_recap2;

import java.util.Scanner;

public class Q003_BMISiniflandirma {
    public static void main(String[] args) {
        /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu cm cinsinden giriniz");
        double boy=scan.nextDouble()/100;

        System.out.println("kilonuzu kg cinsinden giriniz");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("Oldukca zayifsiniz");
        }else if (bmi<=25){
            System.out.println("normal sinirlardasiniz");
        }else if (bmi<=30){
            System.out.println("sisman kategoridsiniz");
        }else {
            System.out.println("obez grubundasiniz");
        }




    }
}
