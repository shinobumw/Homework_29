package Homework7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_2 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data/Data.txt", true)) {
            for (int j = 0; j < 10; j++) {
                int number = (int) (Math.random() * 1000) + 1;
                fw.write(Integer.toString(number));
                fw.write(" ");
            }
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        copyFile("data/Data.txt", "data/CopyData.txt");
    }

    public static void copyFile(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination);
        ) {
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
                fos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
