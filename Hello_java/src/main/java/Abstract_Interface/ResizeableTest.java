package Abstract_Interface;

import Abstract_Interface.shape.Circle;
import Abstract_Interface.shape.Rectangle;
import Abstract_Interface.shape.Shape;
import Abstract_Interface.shape.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2,6);
        shapes[2] = new Square(4);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        double percent = Math.random();
        for (Shape shape : shapes){
            if ( shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
                System.out.println(shape);
            }
        }
    }
}
