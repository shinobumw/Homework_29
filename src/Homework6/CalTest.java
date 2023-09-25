package Homework6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        boolean hasException = false;

        do {
            System.out.println("請輸入x的值：");
            while (!sc.hasNextInt()) {
                System.out.println("輸入格式不正確");
                System.out.println("請輸入x的值：");
                sc.next();
            }
            x = sc.nextInt();

            System.out.println("請輸入y的值：");
            while (!sc.hasNextInt()) {
                System.out.println("輸入格式不正確");
                System.out.println("請輸入y的值：");
                sc.next();
            }
            y = sc.nextInt();

            try {
                System.out.println(x + "的" + y + "次方等於" + Calculator.powerXY(x, y));
                hasException = false;
            } catch (CalException e) {
                System.out.println(e.getMessage());
                hasException = true;
            }
        } while (hasException);
    }
}
