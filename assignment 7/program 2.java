class RunnableDemo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Your Name");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
    }
}