package Homework2;

/**
 * 九九乘法表
 */
public class Homework2_8 {
    public static void main(String[] args) {
        System.out.println("1. for + while:");
        for (int i = 1; i < 10; i++) {
            int j = 1;
            while (j < 10) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                ++j;
            }
            System.out.println();
        }

        System.out.println("\n2. for + do-while:");
        for (int i = 1; i < 10; i++) {
            int j = 1;
            do {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
                ++j;
            } while (j < 10);
            System.out.println();
        }

        System.out.println("\n3. while + do-while:");
        int x = 1;
        while (x < 10) {
            int y = 1;
            do {
                System.out.print(x + "*" + y + "=" + x * y + "\t");
                ++y;
            } while (y < 10);
            ++x;
            System.out.println();
        }
    }
}
