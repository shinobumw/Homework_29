package Homework5;

// Homework5_6
public class Pencil extends Pen{
    public Pencil() {

    }

    public Pencil(String brand, double price) {
        super(brand, price);
    }

    @Override
    public double getPrice() {
        return price * 0.8;
    }

    @Override
    public void write() {
        System.out.println("削鉛筆再寫");
    }
}
