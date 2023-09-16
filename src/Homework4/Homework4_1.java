package Homework4;

public class Homework4_1 {
    public static void main(String[] args) {
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println("所有元素的平均值: " + average);
        System.out.println("大於平均值的元素:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average)
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
