package core.com.udemy.fundamental.algorithm.recursion;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,6,9};
        System.out.println(recursionLinearSearch(array,0, 6));
    }

    public static int recursionLinearSearch(int[] array, int x, int data){
        if (x == array.length){
            return -1;
        } else if (array[x] == data) {
            return x;
        } else {
            System.out.println("Node index " + x);
            return recursionLinearSearch(array, x + 1, data);
        }
    }
}
