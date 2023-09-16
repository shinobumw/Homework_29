package Homework4;

public class Homework4_2 {
    public static void main(String[] args) {
        String s = "Hello World";
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }
        System.out.println(reversedString);
    }
}
