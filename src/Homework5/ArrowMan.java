package Homework5;

// Homework5_7
public class ArrowMan extends Hero {

    public ArrowMan() {
        super();
    }

    public ArrowMan(String name, int level, double exp) {
        super(name, level, exp);
    }

    @Override
    public void attack() {
        System.out.println("放弓箭");
    }
}
