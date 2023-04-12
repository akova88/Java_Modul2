package OPP_Class.rectangle;

public class Rectangle {
    double width;
    double height;
    public Rectangle(){  // constructor mặc định

    }
    public Rectangle(double width, double height) { // contructor có 2 tham số
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height )*2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
