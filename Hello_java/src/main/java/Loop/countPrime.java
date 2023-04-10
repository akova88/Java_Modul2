package Loop;

import java.util.Scanner;

public class countPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra:");
        int number = sc.nextInt();

        int count = 0;
        for ( int i = 0; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if ( count >= number)
                    break;;
            }
        }
    }
    public static Boolean isPrime(int number) {
        if ( number < 2 ) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if ( number % i == 0) {
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
