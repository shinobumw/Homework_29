package Homework7;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void speak();
}
