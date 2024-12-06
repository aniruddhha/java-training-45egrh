package afternoon;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadDemo {

    public static void main(String[] args) {

        ThreadOne th1 = new ThreadOne();
        th1.start();

        ThreadTwo th2 = new ThreadTwo();
        Thread t = new Thread(th2);
        t.start();

        Executor ex = Executors.newFixedThreadPool(3);
        ex.execute(th2); // task1
        ex.execute(() -> {});  // task2
        ex.execute(() -> {});  // task3
        ex.execute(() -> {});  // task4
        ex.execute(() -> {});  // task5
        ex.execute(() -> {});  // task6
        ex.execute(() -> {});  // task7
        ex.execute(() -> {});  // task8
    }
}

class ThreadOne extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("thread 1 : i = " + i);
        }
    }
}

class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("thread 2 : i = " + i);
        }
    }
}
