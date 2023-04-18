package Inheritance.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double side1 = 0;
        double side2 = 0;
        double side3 = 0;

        do {
            System.out.println("Nhập 3 cạnh của tam giác");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
            if ( (side1 + side2) <= side3 || (side1 + side3) <= side2 || (side3 + side2) <= side1) {
                System.out.println("Không hợp lệ vui lòng nhập lại:");
            }
        } while ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side3 + side2) <= side1);

        scanner.nextLine();
        System.out.println("Nhập màu của tam giác:");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color, side1,side2,side3);
        System.out.println(triangle);
        System.out.println("Diện tích tam giác = " + triangle.getArea());
        System.out.println("Chu vi tam giác = " + triangle.getPrimeter());
    }

}
