package Array_Method;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        String[] sudents = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm:");
        String input = sc.nextLine();

        boolean check = false;
        for ( int i = 0; i < sudents.length; i++) {
            if ( sudents[i].equals(input)) {
                System.out.println("Tên sinh viên: " + sudents[i] + " vị trí thứ: " + i);
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Ko tim thay " + input + " trong danh sach");
    }
}
