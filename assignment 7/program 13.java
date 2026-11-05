class Buffer {
    int number;
    boolean available = false;

    synchronized void produce(int n) {
        try {
            while (available) {
                wait();
            }

            number = n;
            System.out.println("Produced: " + number);

            available = true;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized void consume() {
        try {
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + number);

            available = false;
            notify();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Buffer b = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                b.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}