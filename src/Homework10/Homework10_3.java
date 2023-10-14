package Homework10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Homework10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        Date date;
        while (true) {
            System.out.print("讓輸入日期(年月日，例如:20110131): ");
            input = sc.next();
            String regex = "\\d{8}";
            if (input.matches(regex)) {
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd");
                try {
                    date = inputFormat.parse(input);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;
            } else {
                System.out.println("日期格式不正確，請再輸入一次！");
            }
        }

        System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年: ");
        input = sc.next();
        switch (input) {
            case "1" -> {
                System.out.print("年/月/日: ");
                SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
                System.out.println(outputFormat.format(date));
            }
            case "2" -> {
                System.out.print("月/日/年: ");
                SimpleDateFormat outputFormat = new SimpleDateFormat("MM/dd/yyyy");
                System.out.println(outputFormat.format(date));
            }
            case "3" -> {
                System.out.print("日/月/年: ");
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println(outputFormat.format(date));
            }
            default -> {
                System.out.println("沒有這個選項！");
            }
        }
    }
}
