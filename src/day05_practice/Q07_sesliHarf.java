package day05_practice;

import java.util.Scanner;

public class Q07_sesliHarf {
    public static void main(String[] args) {

        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u
     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.
     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.
     Test Data:
     we  yada  %
     Beklenen Çıktı:
     Yanlis karakter girdiniz!
     */

        System.out.println("Lutfen bir harf giriniz");
        Scanner scan=new Scanner(System.in);
        String harf=scan.nextLine();

        if(harf.contains("a") || harf.contains("e") ||harf.contains("i")|| harf.contains("o")
        || harf.contains("u")){
            System.out.println(harf+" harfi sesli harfdir");
        } else if (harf.charAt(0)>= 'a' && harf.charAt(0)<='z' ) {
            System.out.println(harf+" harfi sesli harf degildir");
        } else{
            System.out.println("Yanlis karakter girdiniz");
        }

    }
}
