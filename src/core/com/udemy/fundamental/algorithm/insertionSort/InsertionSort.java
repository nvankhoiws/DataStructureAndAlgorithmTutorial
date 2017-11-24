package core.com.udemy.fundamental.algorithm.insertionSort;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/24/20173:12 PM.
 */

/**
 * InsertionSort has O(n^2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedArray = insertionSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78}, 1);
        System.out.print("[\t");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(String.valueOf(sortedArray[i]) + '\t');
        }
        System.out.println("]");

        System.out.println();

        int[] sortedArray2 = insertionSort(new int[]{-1, 3, 2, 66, -100, 1000, 12, 9, 8, 33, 1, 0, 78});
        System.out.print("[\t");
        for (int i = 0; i < sortedArray2.length; i++) {
            System.out.print(String.valueOf(sortedArray2[i]) + '\t');
        }
        System.out.println("]");

    }

    public static int[] insertionSort(int[] array, int index) {
        if (array.length <= 1){
            return array;
        } else {
            if (index == array.length){
                return array;
            } else {
                int j = index - 1;
                int neededSortValue = array[index];
                for (int i = index - 1; i > -1; i--) {
                    if (neededSortValue < array[i]){
                        array[i+1] = array[i];
                        j--;
                    } else {
                        break;
                    }
                }
                array[j + 1] = neededSortValue;
                return insertionSort(array, index +1);
            }
        }
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int neededSortValue = array[i];
            int currentIndex = i - 1;
            for (; currentIndex > -1 ; currentIndex--) {
                if (neededSortValue< array[currentIndex]){
                    array[currentIndex+1] = array[currentIndex];
                } else {
                    break;
                }
            }
            array[currentIndex + 1] = neededSortValue;
        }
        return array;
    }
}
