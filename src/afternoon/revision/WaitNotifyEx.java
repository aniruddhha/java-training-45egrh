package afternoon.revision;

public class WaitNotifyEx {

    public static void main(String[] args) {

        final Object lock = new Object();

        Thread waitingThread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("wt1: I am executing task1");

                    System.out.println("wt1: entering in wait state, bcz of dep on oth thread");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("wt1: returned for other thread, after satisfying dep");
                }
            }
        });

        Thread waitingThread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("wt2: I am executing task1");

                    System.out.println("wt2: entering in wait state, bcz of dep on oth thread");

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("wt2: returned for other thread, after satisfying dep");
                }
            }
        });

        Thread notiftyingThread = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("nt: entered in this th to satisfy some dep");
                    System.out.println("nt: fulfilled and notifying to oth th");
                    lock.notifyAll();
                    System.out.println("nt: notified");
                }
            }
        });

        waitingThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        waitingThread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        notiftyingThread.start();

    }
}
