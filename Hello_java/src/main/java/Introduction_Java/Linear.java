package Introduction_Java;

import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if ( a!=0) {
            double result = (c-b)/a;
            System.out.println("Nghiem cua pt là: " + result);
        } else {
            if ( b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
