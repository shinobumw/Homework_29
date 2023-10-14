package Homework10;

public class Homework10_1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("亂數產生5個介於1～100之間的整數，判斷是否為質數");
        for (int i = 0; i < 5; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.println(numbers[i] + (isPrime(numbers[i]) ? "是質數" : "不是質數"));
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
