package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        System.out.println("開始猜數字吧！");
        int number = (int)(Math.random() * 10);
        Scanner s = new Scanner(System.in);
        while (true) {
            int input = s.nextInt();
            if (input == number) {
                System.out.println("答對了！答案就是" + number);
                break;
            } else {
                System.out.println("猜錯囉");
                continue;
            }
        }
    }
}
