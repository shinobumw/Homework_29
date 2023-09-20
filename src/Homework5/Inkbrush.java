package Homework5;

// Homework5_6
public class Inkbrush extends Pen{
    public Inkbrush() {

    }

    public Inkbrush(String brand, double price) {
        super(brand, price);
    }


    @Override
    public double getPrice() {
        return this.price * 0.9;
    }

    @Override
    public void write() {
        System.out.println("沾墨汁再寫");
    }
}
