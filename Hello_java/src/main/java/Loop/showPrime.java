package Loop;

import java.util.Scanner;

public class showPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {
                    if (isPrime(i) ) {
                    System.out.print(i + " ");
                }
            }
    }

    public static Boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                return true;
            } else {
                return false;
            }
        }
    }
}
