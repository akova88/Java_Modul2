package Threading;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName()
            + " generated number: " + i
            + " with hashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("My thread interrupted");;
            }
        }
        System.out.println("My thread run is over");
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        NumberGenerator numberGenerator2 = new NumberGenerator();

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
    }
}
