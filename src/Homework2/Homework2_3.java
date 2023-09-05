package Homework2;

public class Homework2_3 {
    public static void main(String[] args) {
        int product = 1;
        int number = 1;
        while (number <= 10) {
            product *= number;
            ++number;
        }
        System.out.println("1~10的連乘積為" + product);
    }
}
