package Loop;

import java.util.Scanner;

public class showImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for ( int i = 0; i < 3; i++ ) {
                        for ( int j = 0; j < 6; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Print the triangle");
//                    botton-left
                    for ( int i = 0; i < 6; i++ ) {
                        for ( int j = 0; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
//                    top-left
                    for ( int i = 0; i < 6; i++ ) {
                        for ( int j = 0; j <= 6 - i -1; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
//                    botton-right
                    for ( int i = 1; i <= 6; i++) {
                        for ( int j = 1; j <= 6; j++) {
                            if ( j <= 6 - i )
                                System.out.print("   ");
                            else
                                System.out.print("  *");
                        }
                        System.out.println("");
                    }
//                    top-right
                    for ( int i = 1; i <= 6; i++) {
                        for ( int j = 1; j<= 6; j++) {
                            if (j < i)
                                System.out.print("   ");
                            else
                                System.out.print("  *");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for ( int i = 1; i <= 6; i++) {
                        for ( int j = 1 ; j <=6-i; j++)
                            System.out.print(" ");
                        for ( int j = 1; j <= i; j++)
                            System.out.print("* ");

                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
