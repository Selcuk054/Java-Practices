package day10_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05 {
    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
     */
    public static void main(String[] args) {

        List<String> databseIsimler= new ArrayList<>();
        databseIsimler.add("Ense");
        databseIsimler.add("Ismail");
        databseIsimler.add("AbdulBaki");
        databseIsimler.add("Melisa");
        databseIsimler.add("Oguz");
        databseIsimler.add("Selcuk");
        System.out.println("databseIsimler = " + databseIsimler);

        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanmak istediginiz use name i giriniz");
        String username = scan.nextLine().trim();

        boolean usernameVarmi = databseIsimler.contains(username);

        if (usernameVarmi){
            System.out.println("Bu kullanici ismi zaten alinmis");
        }else{
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }

        if (usernameVarmi){
            int randomSayi=new Random().nextInt(100);
            username=username+""+randomSayi;

            System.out.println("Yeni kullanici adiniz :"+username);
            databseIsimler.add(username);
            System.out.println("databaseIsimler = " + databseIsimler);
        } else{
            System.out.println("yeni kullanici adiniz :"+ username);
        }



    }
}
