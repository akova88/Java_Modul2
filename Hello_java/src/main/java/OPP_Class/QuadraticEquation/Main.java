package OPP_Class.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a = ");
        double a = sc.nextDouble();

        System.out.print("Nhập vào giá trị b = ");
        double b = sc.nextDouble();

        System.out.print("Nhập vào giá trị c = ");
        double c = sc.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        double delta = ptb2.getDiscriminant();
        System.out.println("Phương trình có delta = " + delta);

        if ( delta > 0) {
            System.out.println("Nghiệm thứ 1 = "+ ptb2.getRoot1());
            System.out.println("Nghiệm thứ 2 = "+ ptb2.getRoot2());
        } else if ( delta == 0) {
            System.out.println("Nghiệm có 1 nghiệm = "+ ptb2.getRoot1());
        } else
            System.out.println("The equation has no roots");

    }
}
