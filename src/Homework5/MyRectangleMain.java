package Homework5;

// Homework5_4
public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle();
        rectangle1.setWidth(10);
        rectangle1.setDepth(20);
        System.out.println(rectangle1.getArea());

        MyRectangle rectangle2 = new MyRectangle(10, 20);
        System.out.println(rectangle2.getArea());
    }
}
