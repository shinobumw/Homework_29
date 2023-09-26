package Homework5;

// Homework5_6
public abstract class Pen {
    protected String brand;
    protected double price;

    public Pen() {

    }

    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void write();
}
