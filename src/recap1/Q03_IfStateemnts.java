package recap1;

public class Q03_IfStateemnts {
    /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */
    public static void main(String[] args) {
        int not=30;
        if (not>=90 && not<=100){
            System.out.println("A");
        }else if (not<90 && not>=80){
            System.out.println("B");
        }else if (not<80 && not>=70){
            System.out.println("C");
        }else if (not<70 && not>60){
            System.out.println("D");
        }else if (not<60 && not>=0) {
            System.out.println("E");
        }else
            System.out.println("Lutfen 100-0 araliginda bir sayi giriniz");


    }
}
