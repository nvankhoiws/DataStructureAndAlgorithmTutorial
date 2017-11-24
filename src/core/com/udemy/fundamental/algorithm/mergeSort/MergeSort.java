package core.com.udemy.fundamental.algorithm.mergeSort;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/24/20175:05 PM.
 */

/**
 * MergeSort has O(n * log n)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] sortedArray = mergeSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78});
        System.out.print("[\t");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(String.valueOf(sortedArray[i]) + '\t');
        }
        System.out.println("]");

    }

    public static int[] mergeSort(int[] array) {

    }
}
