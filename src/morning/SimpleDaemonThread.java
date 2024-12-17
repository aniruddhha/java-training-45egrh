package morning;

public class SimpleDaemonThread {

    public static void main(String[] args) {

        var th = new Thread(() -> {

            while(true) {
                System.out.println("Hey Hi " + System.currentTimeMillis());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th.setDaemon(true);
        th.start();
    }
}
