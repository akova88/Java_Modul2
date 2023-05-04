package Exception_Debug.triangleException;

public class Triangle {
    double a,b,c;

    public Triangle(double a, double b, double c) throws TriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new TriangleException("Cạnh phải là số dương");
        }
        if (a + b <= c || a + c <= b || c + b <= a) {
            throw new TriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
