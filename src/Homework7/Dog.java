package Homework7;

import java.io.Serializable;

// Homework7_3
public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}
