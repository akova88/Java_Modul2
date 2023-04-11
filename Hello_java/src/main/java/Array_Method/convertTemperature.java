package Array_Method;

import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC;
        double doF;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển độ F => độ C");
            System.out.println("2. Chuyển độ C => độ F");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập vào độ F: ");
                    doF = sc.nextDouble();
                    System.out.println("Đổi qua độ C là: " + FtoC(doF));
                    break;
                case 2:
                    System.out.println("Nhập vào độ C: ");
                    doC = sc.nextDouble();
                    System.out.println("Đổi qua độ F là: " + CtoF(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }

    public static double CtoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double FtoC(double doF) {
        double doC = (5 / 9) * ( doF - 32);
        return doC;
    }
}


