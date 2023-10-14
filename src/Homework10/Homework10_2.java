package Homework10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Homework10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        double number;
        while (true) {
            System.out.print("請輸入數字: ");
            input = sc.next();
            String regex = "-?\\d+(\\.\\d+)?";
            if (input.matches(regex)) {
                number = Double.parseDouble(input);
                break;
            } else {
                System.out.println("數字格式不正確，請再輸入一次！");
            }
        }

        // Reference: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
        System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號: ");
        input = sc.next();
        switch (input) {
            case "1" -> {
                Format formatter = new DecimalFormat("#,###,###,###,###.######");
                System.out.println(formatter.format(number));
            }
            case "2" -> {
                Format formatter = new DecimalFormat("###.##%");
                System.out.println(formatter.format(number));
            }
            case "3" -> {
                Format formatter = new DecimalFormat("0.###E00");
                System.out.println(formatter.format(number));
            }
            default -> {
                System.out.println("沒有這個選項！");
            }
        }
    }
}
