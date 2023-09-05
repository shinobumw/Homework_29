package Homework2;

public class Homework2_5 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("阿文可以選擇的數字有:");
        for (int i = 1; i <= 49; ++i) {
            if (i % 10 == 4 || i / 10 ==4)
                continue;
            System.out.print(i);
            System.out.print(" ");
            ++count;
        }
        System.out.println("\n總共有" + count + "個");
    }
}
