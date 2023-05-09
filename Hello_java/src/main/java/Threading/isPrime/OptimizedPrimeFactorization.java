package Threading.isPrime;

public class OptimizedPrimeFactorization implements Runnable{
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(Thread.currentThread().getName() + ": " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("Optimized đã chạy xong!");

    }
}
