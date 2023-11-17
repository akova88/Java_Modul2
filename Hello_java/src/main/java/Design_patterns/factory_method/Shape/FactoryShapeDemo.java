package Design_patterns.factory_method.Shape;

public class FactoryShapeDemo {
    public static void main(String[] args) {
        ShapeFactory squareFactory = new SquareFactory();
        Shape shape1 = squareFactory.createShape();
        shape1.draw();

        ShapeFactory circleFactory = new CircleFactory();
        Shape shape2 = circleFactory.createShape();
        shape2.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape shape3 = rectangleFactory.createShape();
        shape3.draw();
    }
}
