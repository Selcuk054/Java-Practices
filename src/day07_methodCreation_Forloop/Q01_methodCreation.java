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
        ilkdeger();
    }
    public static void ilkdeger() {
        String input="aaaabbbbcccccdddddbbbbbaaaaaadddddd";
        if (input.contains("a") ||input.contains("b")
                ||input.contains("c") ||input.contains("d")) {
            System.out.println("abcd");
        }
    }
}
