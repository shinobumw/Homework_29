package Homework9;

class Account {
    private int balance = 0;
    private int momCount = 0;
    private int xiongDaCount = 0;


    public synchronized void deposit(int amount) {
        momCount++;
        if (xiongDaCount >= 10)
            return;

        while (balance > 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
                wait();
                System.out.println("媽媽被熊大要求匯款！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);
        notify();
    }

    public synchronized void withdraw(int amount) {
        xiongDaCount++;
        if (momCount >= 10)
            return;

        while (balance < amount) {
            System.out.println("熊大看到帳戶沒錢，暫停提款");
            try {
                wait();
                System.out.println("熊大被老媽告知帳戶已經有錢！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        balance -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有：" + balance);
        if (balance <= 2000) {
            System.out.println("熊大看到餘額在2000以下，要求匯款");
            notify();
        }
    }
}

class Parent extends Thread {
    Account account;

    public Parent(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("[媽媽第" + (i + 1) + "次]");
            account.deposit(2000);
        }
    }
}

class Children extends Thread {
    Account account;

    public Children(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            System.out.println("[熊大第" + (i + 1) + "次]");
            account.withdraw(1000);
        }
    }
}

public class Homework9_2 {
    public static void main(String[] args) {
        Account account = new Account();
        Parent mom = new Parent(account);
        Children xiongDa = new Children(account);
        mom.start();
        xiongDa.start();
    }
}