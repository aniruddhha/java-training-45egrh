package morning;

import javax.sound.midi.Soundbank;

public class ThreadMethods {
}

class WaitNotifyEx {

    private static final Object lock = new Object();

    public static void main(String[] args) {

        Thread waitingThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("WT1: Waiting for task to be completed");

                synchronized (lock) {
                    try {
                        System.out.println("WT1: Entering in waiting mode");
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("WT1: Got the Notify Message from other thread");
                    System.out.println("WT1: This is getting executed after returning from other thread");
                }
            }
        });

        Thread waitingThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("WT2: Waiting for task to be completed");

                synchronized (lock) {
                    try {
                        System.out.println("WT2: Entering in waiting mode");
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("WT2: Got the Notify Message from other thread");
                    System.out.println("WT2: This is getting executed after returning from other thread");
                }
            }
        });

        Thread notifyingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("NT: Entered Here because some thread entered waiting mode ");
                    System.out.println("NT: Notifying ");
//                    lock.notify();
                    lock.notifyAll();
                    System.out.println("NT: Notified to waiting threads");
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

        notifyingThread.start();
    }
}