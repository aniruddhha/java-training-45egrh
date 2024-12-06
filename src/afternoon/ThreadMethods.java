package afternoon;

public class ThreadMethods {
}

class WaitNotifyEx {

    private static final Object lock = new Object();

    public static void main(String[] args) {

        Thread waitingThread = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("Waiting Thread: Waiting ....");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Waiting Thread: Notified ....");
                }
            }
        });

        Thread notifyingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Notifying thread: Notifying...");
                    lock.notify();
                    System.out.println("Notifying thread: Done notifying.");
                }
            }
        });

        waitingThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notifyingThread.start();
    }
}

class JoinExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: Started");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: Completed");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class YeildExample {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running");
                Thread.yield();
                System.out.println("Step 2: Thread 1 is running");
                System.out.println("Step 3: Thread 1 is running");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 in running");
            }
        });

        t1.start();
        t2.start();

    }
}

class InterruptExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread: Working...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread: Interrupted!");
            }
        });

        t.start();
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); } // Let the thread run for a while
        System.out.println("Main thread: Interrupting the worker thread.");
        t.interrupt(); // Interrupt the worker thread
    }
}
