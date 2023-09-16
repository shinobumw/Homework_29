package Homework4;

public class Homework4_3 {
    public static void main(String[] args) {
        String[] solarSystem = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int[] vowels = new int[5];
        for (int i = 0; i < solarSystem.length; i++) {
            for (int j = 0; j < solarSystem[i].length(); j++) {
                switch (solarSystem[i].charAt(j)) {
                    case 'a' -> vowels[0]++;
                    case 'e' -> vowels[1]++;
                    case 'i' -> vowels[2]++;
                    case 'o' -> vowels[3]++;
                    case 'u' -> vowels[4]++;
                }
            }
        }

        System.out.println("母音數量");
        System.out.println("a: " + vowels[0]);
        System.out.println("e: " + vowels[1]);
        System.out.println("i: " + vowels[2]);
        System.out.println("o: " + vowels[3]);
        System.out.println("u: " + vowels[4]);

    }
}
