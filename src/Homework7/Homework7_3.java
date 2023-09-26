package Homework7;

import java.io.*;

public class Homework7_3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Lucy");
        animals[1] = new Dog("Charlie");
        animals[2] = new Cat("Kiki");
        animals[3] = new Cat("Mocha");

        File dir = new File("C:/data");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File("C:/data/Object.ser");

        // Output
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            for (int i = 0; i < animals.length; i++) {
                oos.writeObject(animals[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Input
        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            System.out.println(file.getName() + "檔案內容如下: ");
            System.out.println("--------------------");
            try {
                while (true) {
                    ((Animal) ois.readObject()).speak();
                    System.out.println("--------------------");
                }
            } catch (EOFException e) {
                System.out.println("資料讀取完畢！");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
