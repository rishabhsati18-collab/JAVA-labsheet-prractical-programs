class BankAccount {
    int balance = 100000;

    synchronized void withdraw(int amount) {
        balance = balance - amount;
    }
}

class SynchronizedDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                b.withdraw(1);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                b.withdraw(1);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + b.balance);
    }
}