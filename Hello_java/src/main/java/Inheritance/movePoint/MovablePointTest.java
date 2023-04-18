package Inheritance.movePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 5, 2,2 );
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
        movablePoint.setSpeed(3,3);
        System.out.println(movablePoint.move());
    }
}
