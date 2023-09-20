package Homework5;

import java.util.Scanner;

public class Homework5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入寬與高：");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        starSquare(width, length);
    }

    public static void starSquare(int width, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
