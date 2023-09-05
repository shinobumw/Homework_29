package Homework2;

public class Homework2_7 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
