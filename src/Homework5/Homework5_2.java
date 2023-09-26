package Homework5;

import java.util.Scanner;

public class Homework5_2 {
    public static void main(String[] args) {
        randAvg();
    }

    public static void randAvg() {
        System.out.println("本次亂數結果：");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int number = (int)(Math.random() * 101);
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum / 10);
    }
}
