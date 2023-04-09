package Loop;

import java.util.Scanner;

public class greateCommonFactor {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();

        if ( a == 0 || b == 0 ) {
            System.out.println("Không có UCLN");
        }
        while (a != b) {
            if ( a> b)
                a = a -b;
            else
                b = b - a;
        }
        System.out.println("UCLN là: " + a);
    }
}
