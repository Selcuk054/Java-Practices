package day10_practice.constructor;

public class BookClass {

    String adi, yazari;
    int yayinYili;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin


    public BookClass(String adi, String yazari, int yayinYili) { // 3 parametre
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) { //2 parametre
        this.adi = adi;
        this.yazari = yazari;
    }

    @Override
    public String toString() {
        return "BookClass{" +"\n" +
                "Adi='" + adi + "\n" +
                "Yazari='" + yazari +"\n" +
                "Yayin Yili=" + yayinYili +
                '}';

    }

    public static void main(String[] args) {
        BookClass kitapBilgileri=new BookClass("Cagrisimlar / Biz Kimiz?", "Savas Barkcin");
        BookClass kitapBilgileri1= new BookClass("Liderlik","Henry Kissinger", 2022);
        yazdir(kitapBilgileri, kitapBilgileri1);
    }

    private static void yazdir(BookClass kitapBilgileri, BookClass kitapBilgileri1) {
        System.out.println("Ilk Kitap :"+kitapBilgileri);
        System.out.println("Ikinci Kitap :"+kitapBilgileri1);
    }
}
