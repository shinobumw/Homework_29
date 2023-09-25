package Homework7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {
    public static void main(String[] args) {
        File file = new File("files/Sample.txt");
        int countChar = 0, countLine = 0;
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
//                System.out.print((char) i);
                if ((char) i == '\n')
                    countLine++;
                else
                    countChar++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println();

        System.out.println(file.getName() + "檔案共有" + file.length() + "個位元組，" +
                countChar + "個字元，" + countLine + "列資料");
    }
}
