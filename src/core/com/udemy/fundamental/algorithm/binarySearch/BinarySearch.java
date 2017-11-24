package core.com.udemy.fundamental.algorithm.binarySearch;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/20/20175:40 PM.
 */

/**
 * BinarySearch works on sorted Array
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        int[] array = new int[]{100,101,102,103,104,105,106,107,108,109};
        System.out.println(BinarySearch.binarySearch(array,111));
    }

    public static int binarySearch(int[] array, int data) {
        int p = 0;
        int r = array.length - 1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (array[q] == data) {
                return q;
            } else if (array[q] < data) {
                p = q + 1;
            } else {
                r = q - 1;
            }
        }
        return -1;
    }

}
