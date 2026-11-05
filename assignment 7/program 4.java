class TwoThreads extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        TwoThreads t1 = new TwoThreads();
        TwoThreads t2 = new TwoThreads();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}