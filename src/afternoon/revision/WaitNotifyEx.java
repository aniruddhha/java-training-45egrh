package afternoon.revision;

public class WaitNotifyEx {

    public static void main(String[] args) {

        final Object lock = new Object();

        Thread waitingThread = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("wt: I am executing task1");

                    System.out.println("wt: entering in wait state, bcz of dep on oth thread");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("wt: returned for other thread, after satisfying dep");
                }
            }
        });

        Thread notiftyingThread = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("nt: entered in this th to satisfy some dep");
                    System.out.println("nt: fulfilled and notifying to oth th");
                    lock.notify();
                    System.out.println("nt: notified");
                }
            }
        });

        waitingThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        notiftyingThread.start();

    }
}
