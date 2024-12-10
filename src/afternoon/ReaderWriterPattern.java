package afternoon;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReaderWriterPattern {

    private String sharedResource = "Initial Data";
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


    public void readData() {
        lock.readLock().lock();

        try {
            System.out.println(Thread.currentThread().getName() +" Reads: " + sharedResource);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        finally {
            lock.readLock().unlock();
        }
    }

    public void writeData(String newData) {
        lock.writeLock().lock();

        try {
            sharedResource = newData;
            System.out.println(Thread.currentThread().getName() +" Writes: " + newData);
            Thread.sleep(500);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        ReaderWriterPattern pattern = new ReaderWriterPattern();

        Runnable readerTask = pattern::readData;

        Runnable writerTask = () -> pattern.writeData("Updated Data By: " + Thread.currentThread().getName());

        Thread reader1 = new Thread(readerTask, "Reader-1");
        Thread reader2 = new Thread(readerTask, "Reader-2");
        Thread writer1 = new Thread(writerTask, "Writer-1");

        reader1.start();
        reader2.start();
        writer1.start();

        try {
            reader1.join();
            reader2.join();
            writer1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads completed execution.");
    }
}
