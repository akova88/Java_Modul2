package Loop;

import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        int month;
        double interestRate;
        System.out.println("Nhập số tiền gửi:");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng gửi:");
        month = sc.nextInt();
        System.out.println("Nhập lãi suất % năm:");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for ( int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi: " + totalInterest);

    }
}
