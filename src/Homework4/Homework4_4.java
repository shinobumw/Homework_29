package Homework4;

import java.util.Scanner;

public class Homework4_4 {
    public static void main(String[] args) {
        int[][] cash = {
                {25, 2500},
                {32, 800},
                {8, 500},
                {19, 1000},
                {27, 1200}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入欲借的金額: ");
        int input = scanner.nextInt();
        System.out.print("有錢可借的員工編號: ");
        int count = 0;
        for (int i = 0; i < cash.length; i++) {
            if (cash[i][1] >= input) {
                System.out.print(cash[i][0] + " ");
                count++;
            }
        }
        System.out.println("共" + count + "人！");
    }
}
