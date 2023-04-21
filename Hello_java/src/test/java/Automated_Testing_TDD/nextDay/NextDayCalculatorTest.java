package Automated_Testing_TDD.nextDay;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDate() {
        String dayNow = "01/01/2018";
        String expected = "02/01/2018";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }

    @Test
    void nextDate1() {
        String dayNow = "31/01/2018";
        String expected = "01/02/2018";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }

    @Test
    void nextDate3() {
        String dayNow = "30/04/2018";
        String expected = "01/05/2018";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }

    @Test
    void nextDate4() {
        String dayNow = "28/02/2018";
        String expected = "01/03/2018";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }

    @Test
    void nextDate5() {
        String dayNow = "29/02/2020";
        String expected = "01/03/2020";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }

    @Test
    void nextDate6() {
        String dayNow = "31/12/2018";
        String expected = "01/01/2019";
        String result = NextDayCalculator.findNextDate(dayNow);
        assertEquals(expected,result);
    }
}