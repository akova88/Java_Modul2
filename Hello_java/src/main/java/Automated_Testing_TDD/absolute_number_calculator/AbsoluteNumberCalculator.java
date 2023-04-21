package Automated_Testing_TDD.absolute_number_calculator;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
//        throw new UnsupportedOperationException();
        if (number < 0)
            return -number;
        return number;
    }
}
