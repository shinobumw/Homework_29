package Homework5;

import java.util.Scanner;

public class Homework5_2 {
    public static void main(String[] args) {
        randAvg();
    }

    public static void randAvg() {
        System.out.println("本次亂數結果：");
        int[] array = new int[10];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.println(sum / array.length);
    }
}
