class AliveDemo extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        AliveDemo t = new AliveDemo();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("During running: " + t.isAlive());

        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("After finish: " + t.isAlive());
    }
}