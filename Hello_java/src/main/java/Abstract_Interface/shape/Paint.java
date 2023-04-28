package Abstract_Interface.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paint {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5,"Red",true));
        shapes.add(new Rectangle(4,5,"red",true));
        shapes.add(new Rectangle(4,5,"red",false));
        shapes.add(new Circle(6,"black",false));
        shapes.add(new Rectangle(7,2,"red",true));
        shapes.add(new Triangle("red", true, 7,1,6));
        printShapes(shapes);
    }
    public static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    public static Circle createNewCircle() {
        System.out.println("Nhập vào thông tin để tạo Circle:");
        System.out.print("Nhập radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập color: ");
        String color = sc.nextLine();
        return new Circle(radius,color, createNewCircle().isFilled());
    }
}

