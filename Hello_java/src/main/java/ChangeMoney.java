import java.util.Scanner;

public class ChangeMoney {
    public static final int rate = 23000;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap so USD can doi:");
        long dola = scanner.nextInt();
        long vnd = dola * rate;
        System.out.printf("Doi qua VND la: " + vnd);

    }
}
