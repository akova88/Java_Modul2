package Abstract_Interface;

import Abstract_Interface.shape.Circle;
import Abstract_Interface.shape.Rectangle;
import Abstract_Interface.shape.Shape;
import Abstract_Interface.shape.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(6);

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            if ( shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
