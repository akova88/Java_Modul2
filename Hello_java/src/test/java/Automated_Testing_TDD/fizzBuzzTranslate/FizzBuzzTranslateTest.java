package Automated_Testing_TDD.fizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int number = 0;
        String expected = "Số không hợp lệ";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate1() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate2() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate3() {
        int number = 4;
        String expected = "bon";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate4() {
        int number = -10;
        String expected = "Số không hợp lệ";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate5() {
        int number = 26;
        String expected = "hai sau";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }

    @Test
    void translate6() {
        int number = 101;
        String expected = "101";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
}