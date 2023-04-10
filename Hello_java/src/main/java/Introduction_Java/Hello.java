package Introduction_Java;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten của bạn:");
        String name = scanner.nextLine();
        System.out.printf("Xin chào: " + name);
    }
}
