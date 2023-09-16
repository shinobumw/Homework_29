package Homework3;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        System.out.println("阿文...請輸入你討厭哪個數字？(1~9)");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println();
        boolean[] availableNumbers = new boolean[50];  // 可選擇的號碼
        int count = 0;
        for (int i = 1; i <= 49; ++i) {
            if (i % 10 == input || i / 10 == input)
                continue;
            System.out.print(i + "\t");
            availableNumbers[i] = true;  // 標註可選擇的號碼
            ++count;
            if (count % 6 == 0)
                System.out.println();
        }
        System.out.println("總共有" + count + "數字可選\n");
        System.out.println("電腦亂數選出以下6個不重複的號碼：");
        int countChosen = 0;
        while (countChosen < 6) {
            int chosenNumber = (int)(Math.random() * 49) + 1;
            if (!availableNumbers[chosenNumber])
                continue;
            System.out.print(chosenNumber + " ");
            availableNumbers[chosenNumber] = false;  // 被選過就改成false
            ++countChosen;
        }
        System.out.println();
    }
}
