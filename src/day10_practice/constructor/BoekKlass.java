package day10_practice.constructor;

public class BoekKlass {
    String adi, yazari, dil, yayinevi;
    double yayinYili, ISBN, fiyat;
    boolean dortYildizVeUstuMu;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2 3 ve 4 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin uc const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin


    public BoekKlass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;
    }

    public BoekKlass(String dil, String yayinevi, double yayinYili) {
        this.dil = dil;
        this.yayinevi = yayinevi;
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return "BoekKlass{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", dil='" + dil + '\'' +
                ", yayinevi='" + yayinevi + '\'' +
                ", yayinYili=" + yayinYili +
                ", ISBN=" + ISBN +
                ", fiyat=" + fiyat +
                ", dortYildizVeUstuMu=" + dortYildizVeUstuMu +
                '}';
    }

    public BoekKlass(String adi, double ISBN, double fiyat, boolean dortYildizVeUstuMu) {
        this.adi = adi;
        this.ISBN = ISBN;
        this.fiyat = fiyat;
        this.dortYildizVeUstuMu = dortYildizVeUstuMu;


    }

    public static void main(String[] args) {

        BoekKlass boekInformatie1=new BoekKlass("Oluhane Kapilari",97862532, 118.95,true );
        BoekKlass boekInformatie2=new BoekKlass("Turkce","Ithaki Yayinlari",2022);
        BoekKlass boekInformatie3=new BoekKlass("Oluhane Kapilari","Steven Erikson");

        System.out.println("Kitapbilgileri 1 : "+boekInformatie1 );
        System.out.println("Kitapbilgileri 2 : "+boekInformatie2 );
        System.out.println("Kitapbilgileri 3 : "+boekInformatie3 );

    }
}
