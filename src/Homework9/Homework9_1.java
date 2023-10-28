package Homework9;

public class Homework9_1 implements Runnable {
    String name;

    public Homework9_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int counter = 1;
        while (counter < 10) {
            System.out.println(name + "吃第" + counter + "碗飯");
            counter++;

            // Sleep時間由亂數產生500～3000之間的毫秒數
            int ms = (int) (Math.random() * 2501) + 500;
//            System.out.println(name + "睡" + ms + "毫妙");
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (counter == 10) {
            System.out.println(name + "吃第" + counter + "碗飯");
            System.out.println(name + "吃完了！");
        }
    }

    public static void main(String[] args) {
        System.out.println("-----大胃王快食比賽開始！-----");

        Homework9_1 r1 = new Homework9_1("饅頭人");
        Thread t1 = new Thread(r1);
        Homework9_1 r2 = new Homework9_1("詹姆士");
        Thread t2 = new Thread(r2);
        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("-----大胃王快食比賽結束！-----"); // 沒join()的話這行就不會等到執行緒結束後才執行
    }
}
