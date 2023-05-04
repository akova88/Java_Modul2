package Search_Algorithm.find_max_subsequence;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        System.out.println("Nhập vào chuỗi");
        String string = input.nextLine();

//        Tìm chuỗi liên tiếp có độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch: max) {
            System.out.println(ch);
        }
    }
}
