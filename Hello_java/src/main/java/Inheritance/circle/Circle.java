package Inheritance.circle;

public class Circle {
    private double radius;
    private String color;
    public Circle() {

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius()+ " with color = " + getColor();
    }
    public static class Cylinder extends Circle {
        private double height;
        public Cylinder() {

        }
        public Cylinder(double height) {
            this.height = height;
        }
        public Cylinder(double height, double radius, String color) {
            super(radius, color);
            this.height = height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getHeight() {
            return height;
        }
        public double getVolume() {
            return height*super.getArea();
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "height=" + height + super.toString();
        }
    }

    public static void main(String[] args) {

        Circle.Cylinder cylinder = new Circle.Cylinder(3, 5, "blue");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}


