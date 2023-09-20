package Homework5;

// Homework5_4
public class MyRectangle {
    private double width;
    private double depth;

    public MyRectangle() {

    }

    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    double getArea() {
        return width * depth;
    }
}
