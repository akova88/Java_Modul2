package Automated_Testing_TDD.triangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void checkTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);

    }

    @Test
    void checkTriangle2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void checkTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void checkTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }

    @Test
    void checkTriangle5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expected,result);
    }
}