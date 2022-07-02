package day003_recap2;

public class Q006_SwitchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String day = "Carsamba";
        switch (day) {
            case "Pazartesi":
            case "Sali":
                System.out.println("Java Dersi");
                break;
            case "Carsamba":
            case "Cumartesi":
                System.out.println("SQL");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenium");
                break;
            default:
                System.out.println("Izin gunum");

        }


    }
}
