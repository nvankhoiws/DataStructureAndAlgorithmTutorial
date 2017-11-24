package core.com.udemy.fundamental.algorithm.selectionSort;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/24/201712:08 PM.
 */

/**
 * SelectionSort has O(n^2)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] sortedArray = selectionSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78}, 0);
        System.out.print("[\t");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(String.valueOf(sortedArray[i]) + '\t');
        }

        System.out.println();

        int[] sortedArray2 = selectionSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78});
        System.out.print("[\t");
        for (int i = 0; i < sortedArray2.length; i++) {
            System.out.print(String.valueOf(sortedArray2[i]) + '\t');
        }

        System.out.println("]");
    }

    public static int[] selectionSort(int[] array, int index) {
        if (index == array.length) {
            return array;
        } else {
            int smallest = array[index];
            int swapIndex = index;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    smallest = array[i];
                    swapIndex = i;
                }
            }
            array[swapIndex] = array[index];
            array[index] = smallest;
            return selectionSort(array, index + 1);
        }
    }

    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]){
                    smallestIndex = j;
                }
            }
            int smallestValue = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = smallestValue;
        }
        return array;
    }

}
