/**
 * Created by andrewsouthard on 5/31/17.
 */
public class Main {

    public static int binarySearch(int item, int[] array) {
        int i = 0;
        int j = array.length;
        int middle = (i + j) / 2;

        while (i < j) {
            if (array[middle] == item) {
                return middle;
            } else if (array[middle] < item) {
                i = middle + 1;
                middle = (i + j) / 2;
            } else {
                j = middle - 1;
                middle = (i + j) / 2;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Algs program");
        int[] testSortedArray = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(4, testSortedArray));
        System.out.println(binarySearch(3, testSortedArray));
    }
}
