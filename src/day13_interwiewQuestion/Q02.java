package day13_interwiewQuestion;

public class Q02 {
     /*
      Stringi ters cevirmek icin bir Java Programi yazin
        1.Yol: StringBuilder () kullanarak
        2.Yol: String Classini kullanarak
        3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin (odev olsun q01 deki reccursive ile deneyelim)
  */
     public static void main(String[] args) {
        // 1.Yol: StringBuilder () kullanarak
         String input = "All is well";

         StringBuilder str=new StringBuilder();

         str.append(input); //String builder methodunda ekleme yapar
         System.out.println("str = " + str);

         String tersInput=str.reverse().toString(); //revrse ile tersine cevrildi tostring ile string ile tersine cevrildi
         System.out.println("StringBuffer Ile TersINput : "+tersInput);

         // 2.Yol: String Classini kullanarak
         System.out.println("2. yol");

         int sonHarf=input.length()-1;

         for (int i = sonHarf; i >=0 ; i--) {
             System.out.print(input.charAt(i)); //her bir karakteri alip yazdirdik yanyana
         }
     }
}
