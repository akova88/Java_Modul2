import java.sql.SQLOutput;
import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so mot thang tu 1-12:");
        int month = scanner.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
//                System.out.println("Thang 2 có 28 hoac 29 ngay");
                dayInMonth = "28 hoặc 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                System.out.println("Tháng " + month + " có 31 ngày");
                dayInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                System.out.println("Tháng " + month + " có 30 ngày");
                dayInMonth = "30";
                break;
            default:
//                System.out.println("Nhập lại");
                dayInMonth = "";
        }
        if (!dayInMonth.equals("")) System.out.printf("Tháng '%d' có %s ngày", month, dayInMonth);
        else System.out.println("Nhập lại");
//        if (!dayInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, dayInMonth);
//        else System.out.print("Invalid input!");
    }
}
