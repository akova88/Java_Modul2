package String_Regex;

import String_Regex.email.EmailExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public NameClass() {
        pattern = Pattern.compile(NAME_REGEX);
    }
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        String[] validName = {"C0223G", "A0323K"};
        String[] inValidName = {"M0318G", "P0323A"};

        for (String name : validName) {
            boolean isValid = nameClass.validate(name);
            System.out.println(" Tên là: "+ name + " is valid " + isValid);
        }

        for (String name : inValidName) {
            boolean isValid = nameClass.validate(name);
            System.out.println(" Tên là: "+ name + " is valid " + isValid);
        }
    }
}
