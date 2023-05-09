package Threading.isPrime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int number = 10000;
        LazyPrimeFactorization lz = new LazyPrimeFactorization(number);
        OptimizedPrimeFactorization ot = new OptimizedPrimeFactorization(number);

        Thread lzThread = new Thread(lz);
        Thread otThread = new Thread(ot);

        lzThread.setName("lzThread");
        otThread.setName("otThread");

        lzThread.start();
        otThread.start();

    }
}
