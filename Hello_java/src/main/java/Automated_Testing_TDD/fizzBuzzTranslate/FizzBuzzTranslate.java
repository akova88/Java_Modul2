package Automated_Testing_TDD.fizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0)
            return "Số không hợp lệ";
        else if ( number % 15 == 0 || findCharAt3(number) && findCharAt5(number))
            return "FizzBuzz";
        else if (number % 3 == 0 || findCharAt3(number))
            return "Fizz";
        else if (number % 5 == 0 || findCharAt5(number))
            return "Buzz";
        else
            return readNumber(number);
    }
    public static boolean findCharAt3(int number) {
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            if ( numberString.charAt(i) == '3')
                return true;
        }
        return false;
    }


    public static boolean findCharAt5(int number) {
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            if ( numberString.charAt(i) == '5')
                return true;
        }
        return false;
    }
    public static String readNumber(int number) {
        String[] numbers = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        if ( number < 100) {
            if (number < 10)
                return numbers[number];
            else return numbers[number/10] +" " + numbers[number%10];
        } else
            return Integer.toString(number);
    }
}
