
import java.util.Scanner;
public class main1 {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        width = scanner.nextFloat();
        System.out.println("Nhap chieu cao: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Diện tích là: " + area);
    }
}
