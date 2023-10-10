package Homework8;

import java.util.Objects;

public class Train implements Comparable<Train> {
    int number;
    String type;
    String start;
    String dest;
    double price;

    public Train() {

    }

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Train train = (Train) object;
        return number == train.number && Double.compare(price, train.price) == 0 && Objects.equals(type, train.type) && Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    @Override
    public String toString() {
        return "班次" + number + type + "從" + start + "到" + dest + "，票價為" + price + "元";
    }

    // 依班次由大到小排序
    @Override
    public int compareTo(Train o) {
        if (this.number < o.number) {
            return 1;
        }else if (this.number == o.number) {
            return 0;
        } else {
            return -1;
        }
    }
}