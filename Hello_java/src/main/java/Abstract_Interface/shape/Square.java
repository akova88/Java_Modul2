package Abstract_Interface.shape;

import Abstract_Interface.Colorable;
import Abstract_Interface.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
//      hoặc return getLength(); --> lúc này width và length đều = side
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.setLength(10);
        System.out.println(square);
    }
}


