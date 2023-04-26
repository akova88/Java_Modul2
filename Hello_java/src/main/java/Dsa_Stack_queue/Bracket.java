package Dsa_Stack_queue;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String str1 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String str2 = "s * (s – a) * s – b) * (s – c)";

        System.out.println(checkBracket(str));
        System.out.println(checkBracket(str1));
        System.out.println(checkBracket(str2));


    }
    public static boolean checkBracket(String str) {
        Stack<Character> bstack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char sym = str.charAt(i);
            if (sym == '(') {
                bstack.push(sym);
            } else if (sym ==')') {
                if (bstack.isEmpty()) {
                    return false;
                } else bstack.pop();
            }
        }
        return bstack.isEmpty();
    }
}
