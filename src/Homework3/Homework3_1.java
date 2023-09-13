package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        System.out.println("請輸入三個整數：");
        Scanner s = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = s.nextInt();
        }
        Arrays.sort(input);
        if (input[0] + input[1] <= input[2]) {
            System.out.println("不是三角形");
        } else if (input[0] == input[1] && input[1] == input[2]) {
            System.out.println("正三角形");
        } else if (Double.compare(Math.pow(input[0], 2) + Math.pow(input[1], 2), Math.pow(input[2], 2)) == 0) {
            System.out.println("直角三角形");
        } else if (input[0] == input[1] || input[1] == input[2]) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("其他三角形");
        }
    }
}
