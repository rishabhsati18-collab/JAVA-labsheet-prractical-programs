class DeadlockFix {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 has Lock 1");

                synchronized (lock2) {
                    System.out.println("Thread 1 has Lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 2 has Lock 1");

                synchronized (lock2) {
                    System.out.println("Thread 2 has Lock 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}