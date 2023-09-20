package Homework5;

public class Homework5_3 {
    public static void main(String[] args) {
        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };

        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };

        Homework5_3 w = new Homework5_3();
        System.out.println(w.maxElement(intArray));
        System.out.println(w.maxElement(doubleArray));
    }

    public static int maxElement(int[][] x) {
        int max = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max)
                    max = x[i][j];
            }
        }
        return max;
    }

    public static double maxElement(double[][] x) {
        double max = x[0][0];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > max)
                    max = x[i][j];
            }
        }
        return max;
    }
}
