package Access_modifier.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"blue");
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
