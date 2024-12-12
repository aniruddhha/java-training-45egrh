package afternoon.revision;

public class ThreadDemo {

    public static void main(String[] args) {

        CarThread ct = new CarThread();
        ct.start();

        TruckThread tr = new TruckThread();
        Thread tt = new Thread(tr);
        tt.start();
    }
}

class CarThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Car Thread is Running");
    }
}

class TruckThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Truck is Running");
    }
}