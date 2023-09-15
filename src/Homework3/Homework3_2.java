package Homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("開始猜數字吧！請輸入一個整數介於0~100：");
        int number = (int)(Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input > number) {
                System.out.println("猜錯囉，請再輸入小一點的數字");
            } else if (input < number) {
                System.out.println("猜錯囉，請再輸入大一點的數字");
            } else {
                System.out.println("答對了！答案就是" + number);
                break;
            }
        }
    }
}
