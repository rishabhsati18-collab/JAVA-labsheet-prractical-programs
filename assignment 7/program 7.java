class JoinDemo extends Thread {
    public void run() {
        int sum = 0;

        for (int i = 1; i <= 10000; i++) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        JoinDemo t = new JoinDemo();

        t.start();

        try {
            t.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Task finished");
    }
}