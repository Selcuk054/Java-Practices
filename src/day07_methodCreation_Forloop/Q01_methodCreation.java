package day07_methodCreation_Forloop;

public class Q01_methodCreation {
    public static void main(String[] args) {
        /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
        cozum2("aaasssdddjjjfff");
        ilkdeger();
        String abbbaaaaccccdddeeeee;

    }

    public static void cozum2(String str) {
        String output = ""; //String defoult degeri "" oldugu iciin isleme etki etmesin diye bu sekilde atama yaptik


        for (int i = 0; i <str.length() ; i++) {  // -1 seklindede olur
            if (!output.contains(str.substring(i,i+1))){ //tekrarsiz krakterleri dondurecegimiz icin sonucumuz stredn aldigimiz
                //herhangi bir karakteri icermesin.
                output +=str.substring(i,i+1); // ozaman sonuca eklesin

            }

        }
        System.out.println(output);





    }

    public static void ilkdeger() {
        String input="aaaabbbbcccccdddddbbbbbaaaaaadddddd";
        if (input.contains("a") ||input.contains("b")
                ||input.contains("c") ||input.contains("d")) {
            System.out.println("abcd");
        }
    }
}
