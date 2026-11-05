class FiveThreads extends Thread {
    FiveThreads(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }

    public static void main(String[] args) {
        FiveThreads t1 = new FiveThreads("Thread 1", 1);
        FiveThreads t2 = new FiveThreads("Thread 2", 3);
        FiveThreads t3 = new FiveThreads("Thread 3", 5);
        FiveThreads t4 = new FiveThreads("Thread 4", 7);
        FiveThreads t5 = new FiveThreads("Thread 5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}