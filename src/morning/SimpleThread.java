package morning;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SimpleThread {
    public static void main(String[] args) {

        ThreadOne th1 = new ThreadOne();
        th1.start();

        ThreadTwo t = new ThreadTwo();
        Thread th2 = new Thread(t);
        th2.setPriority(Thread.MAX_PRIORITY);
        th2.start();

        ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        tpe.execute(() -> {}); // upload files
        tpe.execute(() -> {}); // sort data
        tpe.execute(() -> {}); // publish events
        tpe.execute(() -> {});
        tpe.execute(() -> {});
        tpe.execute(() -> {});
        tpe.execute(() -> {});
        tpe.execute(() -> {});
    }
}

class ThreadOne extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("th1 i = " + i);
        }
    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("th2 i = " + i);
        }
    }
}