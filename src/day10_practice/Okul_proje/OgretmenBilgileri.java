package day10_practice.Okul_proje;

public class OgretmenBilgileri {

    String isim;
    String soyisim;
    int yas;
    String brans;
    String telNo;

    public OgretmenBilgileri(String isim, String soyisim,
                             int yas, String brans,
                             String telNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntel='" + telNo + '\'' +
                '}';


    }
}
