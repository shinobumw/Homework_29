package Homework1;

public class Homework1_6 {
    public static void main(String[] args) {
        System.out.println(5 + 5);  // int + int，印出10
        System.out.println(5 + '5');  // int + char，會將char透過ASCII編碼表轉成數字後再與int相加，印出58
        System.out.println(5 + "5");  // int + String，會將int轉成String後和後面的String接在一起，印出55
    }
}
