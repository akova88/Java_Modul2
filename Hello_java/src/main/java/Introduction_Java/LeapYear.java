package Introduction_Java;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập vào năm:");
        year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if ( year % 100 == 0) {
//                if ( year % 400 == 0) {
//                    System.out.printf("%d là năm nhuận", year);
//                } else {
//                    System.out.printf("%d khong phai la nam nhuan",year);
//                }
//            } else {
//                System.out.printf("%d là năm nhuận", year);
//            }
//        } else {
//            System.out.printf("%d khong phai la nam nhuan",year);
//        }
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
    if (isLeapYear) {
        System.out.printf("%d la nam nhuan", year);
    } else {
        System.out.printf("%d ko la nam nhuan", year);
    }
        }
    }

