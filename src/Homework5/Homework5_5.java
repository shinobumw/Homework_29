package Homework5;

public class Homework5_5 {
    public static void main(String[] args) {
        System.out.println("本次隨機產生驗證碼為：" + genAuthCode());
    }

    // Generate 8-digit code which is a combination of uppercase letters, lowercase letters, and numbers
    public static String genAuthCode() {
        String digits = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String code = "";
        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * digits.length());
            code += digits.charAt(index);
        }
        return code;
    }
}
