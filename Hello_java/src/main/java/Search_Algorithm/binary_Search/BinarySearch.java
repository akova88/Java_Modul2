package Search_Algorithm.binary_Search;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int binarySearch(int[] lists, int key) {
        int low = 0;
        int high = lists.length -1;
        while (high >= low) {
            int mid = (high+low)/2;
            if (key < lists[mid]) {
                high = mid-1;
            } else if (key == lists[mid]) {
                return mid;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
