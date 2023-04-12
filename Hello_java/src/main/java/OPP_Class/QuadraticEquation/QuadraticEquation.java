package OPP_Class.QuadraticEquation;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }
    public double getRoot1() {
        double x1 = this.b*this.b - 4 * this.a * this.c;
        double r1 = (-this.b + Math.pow(x1, 0.5)) / 2*this.a;
        return r1;
    }
    public double getRoot2() {
        double r2 = (( -this.b - Math.pow(((this.b*this.b)- 4*this.a*this.c),0.5))) / 2*this.a;
        return r2;
    }
}
