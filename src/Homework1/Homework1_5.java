package Homework1;

public class Homework1_5 {
    public static void main(String[] args) {
        double deposit = 1500000;
        System.out.printf("150萬元10年後本金加利息共有%.0f元\n", deposit * Math.pow(1 + 0.02, 10));
    }
}
