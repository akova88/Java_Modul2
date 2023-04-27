package Abstract_Interface.shape;

public class Paint {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5, "RED", true);
        shapes[1] = new Rectangle(4, 5, "RED", true);
        shapes[2] = new Rectangle(5, 5, "RED", false);
        shapes[3] = new Circle(6, "BLACK", false);
        shapes[4] = new Rectangle(7, 1, "RED", true);
    }
}
