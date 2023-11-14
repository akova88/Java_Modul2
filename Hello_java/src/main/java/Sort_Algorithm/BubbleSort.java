package Sort_Algorithm;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubbleSort(int[] numbers) {
        boolean next = true;

        for (int i = 1; i < numbers.length && next; i++) {
            next = false;
            for (int j = 0; j < numbers.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    next = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubbleSort(list);
        for (int num : list) {
            System.out.println(num + "");
        }
    }
}


