package Sort_Algorithm;

public class BubbleSortByStep {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSortByStep(int[] numbers) {
        boolean next = true;

        for (int i = 1; i < numbers.length && next; i++) {
            next = false;
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    System.out.println("Đổi vị trí: " + numbers[j] + " với: " + numbers[j+1]);
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    next = true;
                }
            }
            if (!next) {
                System.out.println("Mảng đã được sắp xếp không cần hoán đổi vị trí");
            }
            System.out.println("Mảng sau lần thứ " + i + " sắp xếp");
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[k] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
}
