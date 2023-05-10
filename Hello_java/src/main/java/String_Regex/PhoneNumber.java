package String_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)";
    public PhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] validPhoneNumber = {"(84)-(0978489648)"};
        String[] invalidPhoneNumber = {"(a8)-(22222222)", "(84)-(0232222233)", "(84)-(9978489648)"};
        for (String phone : validPhoneNumber) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Số điện thoại là: " + phone + " is valid: " + isValid);
        }

        for (String phone : invalidPhoneNumber) {
            boolean isValid = phoneNumber.validate(phone);
            System.out.println("Số điện thoại là: " + phone + " is valid: " + isValid);
        }
    }
}