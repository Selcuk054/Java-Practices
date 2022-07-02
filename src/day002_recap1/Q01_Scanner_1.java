package day002_recap1;

import java.util.Scanner;

public class Q01_Scanner_1 {
    public static void main(String[] args) {
// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminiz :");
        String isim= scan.nextLine();

        System.out.println("Memleketiniz :");
        String memleket= scan.nextLine();

        System.out.println("Konumunuz");
        String konum = scan.nextLine();

        System.out.println("yasiniz");
       int yas=scan.nextInt();

        System.out.println("boyunuz");
        double boy=scan.nextDouble();

        System.out.println("yasadiginiz" + konum + " u seviyor musunuz?  true/false");
        boolean seviyorMu= scan.hasNextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);






}
}