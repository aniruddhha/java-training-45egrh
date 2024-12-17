package afternoon;

public class SimpleDeamonThread {

    public static void main(String[] args) {

        var thread = new Thread(() -> {
            while (true) {
                System.out.println("Hey Hi");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } );

        thread.setDaemon(true);
        thread.start();
    }
}
