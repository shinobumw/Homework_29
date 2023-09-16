package Homework4;

import java.util.Scanner;

public class Homework4_5 {
    public static void main(String[] args) {
        System.out.print("請輸入三個整數分別代表西元yyyy年、mm月、dd日: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        // Validate input year
        if (year < 1) {
            System.out.println("輸入錯誤！年份不得小於1");
            return;
        }

        // Validate input month
        if (month < 1 || month > 12) {
            System.out.println("輸入錯誤！月份請介於1~12月");
            return;
        }

        // Determine whether it is a leap year
        // 潤年的規則
        // - 西元年份除以4不可整除，為平年。
        // - 西元年份除以4可整除，且除以100不可整除，為閏年。
        // - 西元年份除以100可整除，且除以400不可整除，為平年
        // - 西元年份除以400可整除，為閏年。
        int[] calendar = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (isLeapYear) {
            calendar[1]++;
        }

        // Validate input day
        if (day < 1 || day > calendar[month - 1]) {
            System.out.println("輸入錯誤！天數不得超過該月天數");
            return;
        }

        // Sum up total days
        int days = day;
        for (int i = 0; i < month - 1; i++) {
            days += calendar[i];
        }
        System.out.println("輸入的日期為該年第" + days + "天");
    }
}
