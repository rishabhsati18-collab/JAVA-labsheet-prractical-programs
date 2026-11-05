class DeadlockDemo {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 has Lock 1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }

                synchronized (lock2) {
                    System.out.println("Thread 1 has Lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 has Lock 2");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e);
                }

                synchronized (lock1) {
                    System.out.println("Thread 2 has Lock 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}