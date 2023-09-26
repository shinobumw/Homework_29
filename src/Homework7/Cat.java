package Homework7;

import java.io.Serializable;

// Homework7_3
public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }
}
