import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhap can nang:");
        weight = scanner.nextDouble();

        System.out.println("Nhap chieu cao:");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        if ( bmi < 18) {
            System.out.println(bmi + " Thieu can");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " Binh thuong");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " Thua can");
        } else {
            System.out.println(bmi + " Beo phi");
        }
    }
}
