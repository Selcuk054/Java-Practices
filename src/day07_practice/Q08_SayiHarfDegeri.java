package day07_practice;

public class Q08_SayiHarfDegeri {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {
        System.out.println("For ile");

        for (int i = 0; i <= 255; i++) {
            char c = (char) i;//Casting yaptik sayi harf ve karakter icin gecerlidir.
            System.out.println(i + " -> " + c);
        }
        System.out.println("While ile");
        int i = 0;
        while (i < 255) {

            char symbol = (char) i;
            System.out.println(i + "-" + symbol);
            i++;
        }
        System.out.println("do while ile");
        int a = 0;
        do {
            char karakter = (char) a;
            System.out.println(a + "   " + karakter);
            a++;
        } while (a <= 255);
    }




    }

