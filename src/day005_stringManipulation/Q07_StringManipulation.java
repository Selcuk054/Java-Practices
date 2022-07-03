package day005_stringManipulation;

import java.util.Scanner;

public class Q07_StringManipulation {
    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harf iceren bir kelime yaziniz");
        String kelime=scan.next();
     
       /* if (kelime.length()==4){
        String terskelime =kelime.substring(3)
                + kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
            System.out.println(terskelime);
        }else{
            System.out.println("Lutfen gecerli bir kelime giriniz");
        }*/

        String tersKelime=kelime.substring(kelime.length()-1);

        for (int i = kelime.length()-2; i >=0 ; i--) {
         tersKelime+=kelime.substring(i,i+1);
        }
        System.out.println(tersKelime);
    }


}

