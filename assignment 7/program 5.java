class ThreeThreads extends Thread {
    ThreeThreads(String name) {
        setName(name);
    }

    public void run() {
        try {
            Thread.sleep((int)(Math.random() * 501));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(getName() + " is working");
    }

    public static void main(String[] args) {
        ThreeThreads t1 = new ThreeThreads("Reader");
        ThreeThreads t2 = new ThreeThreads("Writer");
        ThreeThreads t3 = new ThreeThreads("Logger");

        t1.start();
        t2.start();
        t3.start();
    }
}