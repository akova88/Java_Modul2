package Exception_Debug.triangleException;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập cạnh c: ");
        double c = Double.parseDouble(scanner.nextLine());

        try {
           new Triangle(a, b, c);
            System.out.println("Ba cạnh " + a+", " + b+", " + c+ " là cạnh của tam giác");
        } catch (TriangleException e) {
            System.err.println("Ba cạnh " + a+", " + b+", " + c+ " không là cạnh của tam giác "+ e.getMessage());
        }
    }
}
