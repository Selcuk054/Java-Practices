package day06_NestedForloop;

public class Q01_NestedForloop_Mtd {
    public static void main(String[] args) {
        int input = 10;
        yildizYapma(input);

    }

    public static int yildizYapma(int input) {

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
        for (int i = 1; i <=input ; i++) {
            for (int j = input-1; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        return input;

    }


    }
