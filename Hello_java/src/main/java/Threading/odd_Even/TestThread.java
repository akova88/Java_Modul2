package Threading.odd_Even;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.setName("oddThread");
        evenThread.setName("evenThread");

        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}
