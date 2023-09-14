package Homework3;

import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        System.out.println("阿文...請輸入你討厭郡個數字？");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println();
        int count = 0;
        for (int i = 1; i <= 49; ++i) {
            if (i % 10 == input || i / 10 == input)
                continue;
            System.out.print(i + "\t");
            ++count;
            if (count % 6 == 0)
                System.out.println();
        }
        System.out.println("總共有" + count + "數字可選");
    }
}
