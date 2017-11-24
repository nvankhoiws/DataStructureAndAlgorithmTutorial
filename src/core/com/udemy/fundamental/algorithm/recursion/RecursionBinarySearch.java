package core.com.udemy.fundamental.algorithm.recursion;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/24/20179:50 AM.
 */
public class RecursionBinarySearch {

    public static void main(String[] args) {
        recursionBinarySearch(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13}, 0, 13, -1);
    }

    public static int recursionBinarySearch(int[] array, int p, int r, int data){
        int q = (p+r)/2;
        if (p <= r) {
            if (array[q] ==  data) {
                System.out.println("Found the element at index " + q);
                return q;
            } else if (array[q] > data) {
                return recursionBinarySearch(array, p, q-1, data);
            } else {
                return recursionBinarySearch(array, q+1, r, data);
            }
            }
        System.out.println("Cannot find the element!");
        return -1;
    }

}
