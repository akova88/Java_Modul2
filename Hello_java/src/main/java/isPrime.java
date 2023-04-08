import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int number = sc.nextInt();

        if ( number < 2 ) {
            System.out.println(number + " is not prime");
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
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
