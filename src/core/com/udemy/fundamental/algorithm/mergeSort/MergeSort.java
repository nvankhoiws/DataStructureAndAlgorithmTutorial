package core.com.udemy.fundamental.algorithm.mergeSort;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/24/20175:05 PM.
 */

/**
 * MergeSort has O(n * log n)
 */
public class MergeSort {
    public static void main(String[] args) {
//        int[] sortedArray = mergeSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78});
//        System.out.print("[\t");
//        for (int i = 0; i < sortedArray.length; i++) {
//            System.out.print(String.valueOf(sortedArray[i]) + '\t');
//        }
//        System.out.println("]");

        int[] sortedArray = merge(new int[]{1,3,5,7,9,0,2,4,6,8,10,11,13,14,17,19,20,22,24,26,28,30}, 0, 4, 9);
        System.out.print("[\t");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(String.valueOf(sortedArray[i]) + '\t');
        }
        System.out.println("]");
    }

//    public static int[] mergeSort(int[] array) {
//
//    }

    public static int[] merge(int[] array, int p, int q, int r) {
        if () {

        }
    }
}
