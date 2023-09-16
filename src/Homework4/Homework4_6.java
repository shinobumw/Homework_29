package Homework4;

public class Homework4_6 {
    public static void main(String[] args) {
        int[][] scores = {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}
        };
        int[] countHighestScore = new int[8];
        for (int i = 0; i < scores.length; i++) {
            int highestScore = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > highestScore)
                    highestScore = scores[i][j];
            }
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == highestScore)
                    countHighestScore[j]++;
            }
        }

        for (int i = 0; i < countHighestScore.length; i++) {
            System.out.println((i + 1) + "號同學考最高分的次數為" + countHighestScore[i] + "次");
        }
    }
}
