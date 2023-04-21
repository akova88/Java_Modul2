package Automated_Testing_TDD.triangleClassifier;

public class TriangleClassifier {
    public static String checkTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return  "không phải là tam giác";
        else if (a == b && b == c)
            return  "tam giác đều";
        else if (a == b || b == c || c == a)
            return  "tam giác cân";
        else
            return  "tam giác thường";
    }
}
