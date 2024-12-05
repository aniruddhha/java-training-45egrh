package morning;

public class InterThreadComm {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.produce(i);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                resource.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
class SharedResource {
    private int data;
    private boolean isDataAvailable = false;

    public synchronized void produce(int value) {
        while (isDataAvailable) {
            try {
                wait(); // Wait until data is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        isDataAvailable = true;
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that data is ready
    }

    public synchronized void consume() {
        while (!isDataAvailable) {
            try {
                wait(); // Wait until data is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        isDataAvailable = false;
        notify(); // Notify the producer to produce more data
    }
}


