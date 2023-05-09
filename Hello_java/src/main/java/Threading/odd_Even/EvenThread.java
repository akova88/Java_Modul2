package Threading.odd_Even;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() +": "+ i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.out.println("Even Thread interrupted");
            }
        }
        System.out.println("Even Thread run is over");
    }
}
