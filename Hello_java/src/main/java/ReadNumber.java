import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so can doc: ");
        int number = scanner.nextInt();

        String result = "";
        if (number < 0 || number > 999) {
            result = "Không đọc được";
        } else if (number == 0) {
            result = "zero";
        } else {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;

            if (hundreds > 0) {
                result += readOneNum(hundreds) + " hundred";
                if (tens > 0 || ones > 0) {
                    result += " and ";
                }
            }
            if (tens == 0) {
                result += readOneNum(ones);
            } else if (tens == 1) {
                result += readTwoNum(number % 100);
            } else {
                result += readTensNum(tens);
                if (ones > 0) {
                    result += " " + readOneNum(ones);
                }
            }
        }
        System.out.println(result);
    }
        public static String readOneNum(int value){
            switch (value) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                default:
                    return "";
            }
        }

        public static String readTensNum( int value) {
            switch (value) {
                case 2:
                    return "twenty";
                case 3:
                    return "thirty";
                case 4:
                    return "forty";
                case 5:
                    return "fifty";
                case 6:
                    return "sixty";
                case 7:
                    return "seventy";
                case 8:
                    return "eighty";
                case 9:
                    return "ninety";
                default:
                    return "";
            }
        }

        public static String readTwoNum( int num) {
            switch (num) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "";
            }
        }
    }
