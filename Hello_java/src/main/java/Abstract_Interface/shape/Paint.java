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
        editShape(shapes);
    }
    public static void printShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
    public static void editShape(List<Shape> shapes) {
        int menu;
        do{
            System.out.println("1. Chinh sua hinh hoc:");
            System.out.println("0. Exit");
            menu = Integer.parseInt(sc.nextLine());
            if (menu ==0)
                System.exit(0);
            int index;
            do {
                System.out.println("Nhap vi tri shape muon sua");
                index = Integer.parseInt(sc.nextLine());
            } while (index < 0 || index > shapes.size());
            int action;
            do {
                do {
                    System.out.println("1. Chinh sua hinh cu: ");
                    System.out.println("2. Thay the hinh cu bang hinh moi: ");
                    System.out.println("0. Exit");
                    action = Integer.parseInt(sc.nextLine());
                } while (action < 0 || action > 2);
                switch (action){
                    case 1:
                        switch (shapes.get(index).getClass().getSimpleName()) {
                            case "Circle":
                                editCircle((Circle) shapes.get(index));
                                break;
                            case "Rectangle":
                                editRectangle((Rectangle) shapes.get(index));
                                break;
                            case "Square":
                                editSquare((Square) shapes.get(index));
                                break;
                            case "Triangle":
                                editTriangle((Triangle) shapes.get(index));
                                break;
                            default:
                                break;
                        }
                        break;
                    case 2:
                        switch (shapes.get(index).getClass().getSimpleName()) {
                            case "Circle":
                                replaceCircle(shapes,index);
                                break;
                            case "Rectangle":
                                replaceRectangle(shapes,index);
                                break;
                            case "Square":
                                replaceSquare(shapes,index);
                                break;
                            case "Triangle":
                                replaceTriangle(shapes,index);
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }
            } while (action !=0 );
        } while (menu != 0);
    }
    public static boolean isFilled() {
        char input;
        do {
            System.out.println("Bạn có muốn tô màu không? Có()->Y/Không->(N)");
            input = sc.nextLine().charAt(0);
        } while (input!= 'y' && input!= 'Y' && input!= 'N' && input!= 'n' );
        return (input == 'Y' || input == 'y');
    }
    public static  boolean isTriangle(double side1, double side2, double side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            return false;
        else
            return true;
    }
    public static Circle createNewCircle() {
        System.out.println("Nhập vào thông tin để tạo Circle:");
        System.out.print("Nhập radius: ");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập color: ");
        String color = sc.nextLine();
        boolean filled = isFilled();
        return new Circle(radius,color, filled);
    }
    public static Rectangle createNewRectangle() {
        System.out.println("Nhập vào thông tin để tạo Rectangle:");
        System.out.print("Nhập chiều dài: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập chiều cao: ");
        double length = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập color: ");
        String color = sc.nextLine();
        boolean filled = isFilled();
        return new Rectangle(width,length,color, filled);
    }

    public static Square createNewSquare() {
        System.out.println("Nhập vào thông tin để tạo Square:");
        System.out.print("Nhập độ dài cạnh: ");
        double slide = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập color: ");
        String color = sc.nextLine();
        boolean filled = isFilled();
        return new Square(slide,color, filled);
    }
    public static Triangle createNewTriangle() {
        double side1,side2,side3;
        do{
            System.out.println("Nhập side1: ");
            side1 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập side2: ");
            side2 = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập side3: ");
            side3 = Double.parseDouble(sc.nextLine());
        } while (!isTriangle(side1,side2,side3));
        System.out.print("Nhập color: ");
        String color = sc.nextLine();
        boolean filled = isFilled();
        return new Triangle(color,filled,side1,side2,side3);
    }
    public static void editTriangle(Triangle triangle) {
        int chose;
        double side1 = triangle.getSide1();
        double side2 = triangle.getSide2();
        double side3 = triangle.getSide3();
        do {
            do {
                System.out.println("1- Thay doi side 1: ");
                System.out.println("2- Thay doi side 2: ");
                System.out.println("3- Thay doi side 3: ");
                System.out.println("4- Thay doi color: ");
                System.out.println("5- Thay doi filled: ");
                System.out.println("0- Exit");
                chose = Integer.parseInt(sc.nextLine());
            } while (chose < 0 || chose > 5);
            switch (chose) {
                case 1:
                    side1 = editSide(side2, side3);
                    triangle.setSide1(side1);
                    break;
                case 2:
                    side2 = editSide(side1,side3);
                    triangle.setSide2(side2);
                    break;
                case 3:
                    side3 = editSide(side1,side2);
                    triangle.setSide3(side3);
                    break;
                case 4:
                    System.out.println("Chon mau moi: ");
                    String color = sc.nextLine();
                    triangle.setColor(color);
                    break;
                case 5:
                    triangle.setFilled(isFilled());
                    break;
                default:
                    break;
            }
        }while (chose!=0);
    }

    public static void editSquare(Square square) {
        int chose;
        do {
            do {
                System.out.println("1- Thay doi side: ");
                System.out.println("2- Thay doi color: ");
                System.out.println("3- Thay doi filled: ");
                System.out.println("0- Exit");
                chose = Integer.parseInt(sc.nextLine());
            } while (chose < 0 || chose > 5);
            switch (chose) {
                case 1:
                    System.out.println("Nhap side moi: ");
                    double side = Double.parseDouble(sc.nextLine());
                    square.setSide(side);
                    break;
                case 2:
                    System.out.println("Chon mau moi: ");
                    String color = sc.nextLine();
                    square.setColor(color);
                    break;
                case 3:
                    square.setFilled(isFilled());
                    break;
                default:
                    break;
            }
        }while (chose!=0);
    }

    public static void editRectangle(Rectangle rectangle) {
        int chose;
        do {
            do {
                System.out.println("1- Thay doi width: ");
                System.out.println("2- Thay doi length: ");
                System.out.println("3- Thay doi color: ");
                System.out.println("4- Thay doi filled: ");
                System.out.println("0- Exit");
                chose = Integer.parseInt(sc.nextLine());
            } while (chose < 0 || chose > 5);
            switch (chose) {
                case 1:
                    System.out.println("Nhap width: ");
                    double width = Double.parseDouble(sc.nextLine());
                    rectangle.setWidth(width);
                    break;
                case 2:
                    System.out.println("Nhap length: ");
                    double length = Double.parseDouble(sc.nextLine());
                    rectangle.setLength(length);
                    break;
                case 3:
                    System.out.println("Chon mau moi: ");
                    String color = sc.nextLine();
                    rectangle.setColor(color);
                    break;
                case 4:
                    rectangle.setFilled(isFilled());
                    break;
                default:
                    break;
            }
        }while (chose!=0);
    }

    public static void editCircle(Circle circle) {
        int chose;
        do {
            do {
                System.out.println("1- Thay doi radius: ");
                System.out.println("2- Thay doi color: ");
                System.out.println("3- Thay doi filled: ");
                System.out.println("0- Exit");
                chose = Integer.parseInt(sc.nextLine());
            } while (chose < 0 || chose > 5);
            switch (chose) {
                case 1:
                    System.out.println("Nhap radius: ");
                    double radius = Double.parseDouble(sc.nextLine());
                    circle.setRadius(radius);
                    break;
                case 2:
                    System.out.println("Chon mau moi: ");
                    String color = sc.nextLine();
                    circle.setColor(color);
                    break;
                case 3:
                    circle.setFilled(isFilled());
                    break;
                default:
                    break;
            }
        }while (chose!=0);
    }

    private static double editSide(double side2, double side3) {
        double side1;

        do {
            System.out.println("3 canh ko phai cua tam giac");
            System.out.println("Nhap thay doi side: ");
            side1 = Double.parseDouble(sc.nextLine());
        } while (!isTriangle(side1, side2, side3));
        return side1;
    }

    public static void replaceCircle(List<Shape> shapes, int index ) {
        int action;

            do {
                System.out.println("Chon hinh muon thay the");
                System.out.println("1. Rectangle");
                System.out.println("2. Triangle");
                System.out.println("3. Square");
                System.out.println("0. Exit");
                action = Integer.parseInt(sc.nextLine());
            } while (action<0 || action>3);
            switch (action) {
                case 1:
                    shapes.set(index,createNewRectangle());
                    break;
                case 2:
                    shapes.set(index,createNewTriangle());
                    break;
                case 3:
                    shapes.set(index,createNewSquare());
                    break;
                default:
                    break;
            }

    }

    public static void replaceRectangle(List<Shape> shapes, int index ) {
        int action;

            do {
                System.out.println("Chon hinh muon thay the");
                System.out.println("1. Circle");
                System.out.println("2. Triangle");
                System.out.println("3. Square");
                System.out.println("0. Exit");
                action = Integer.parseInt(sc.nextLine());
            } while (action<0 || action>3);
            switch (action) {
                case 1:
                    shapes.set(index,createNewCircle());
                    break;
                case 2:
                    shapes.set(index,createNewTriangle());
                    break;
                case 3:
                    shapes.set(index,createNewSquare());
                    break;
                default:
                    break;
            }

    }

    public static void replaceTriangle(List<Shape> shapes, int index ) {
        int action;

            do {
                System.out.println("Chon hinh muon thay the");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Square");
                System.out.println("0. Exit");
                action = Integer.parseInt(sc.nextLine());
            } while (action<0 || action>3);
            switch (action) {
                case 1:
                    shapes.set(index,createNewCircle());
                    break;
                case 2:
                    shapes.set(index,createNewRectangle());
                    break;
                case 3:
                    shapes.set(index,createNewSquare());
                    break;
                default:
                    break;
            }

    }

    public static void replaceSquare(List<Shape> shapes, int index ) {
        int action;

            do {
                System.out.println("Chon hinh muon thay the");
                System.out.println("1. Circle");
                System.out.println("2. Rectangle");
                System.out.println("3. Triangle");
                System.out.println("0. Exit");
                action = Integer.parseInt(sc.nextLine());
            } while (action<0 || action>3);
            switch (action) {
                case 1:
                    shapes.set(index,createNewCircle());
                    break;
                case 2:
                    shapes.set(index,createNewRectangle());
                    break;
                case 3:
                    shapes.set(index,createNewTriangle());
                    break;
                default:
                    break;
            }

    }
}

