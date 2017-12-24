package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class BinarySearch{
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    public int searchIterative(int i) {
        int p = 0;
        int q = array.length - 1;
        while(p <= q) {
            int m = (p + q) /2;
            if (array[m] == i) return m;
            if (array[m] > i) {
                q = m -1;
            }
            if (array[m] < i) {
                p = m + 1;
            }
        }
        return -1;
    }

    public int searchRecursive(int p, int q, int searchVal) {
        if (p <= q) {
            int m = (p+q)/2;
            if (array[m] == searchVal) return m;
            if (array[m] > searchVal) return searchRecursive(p, m - 1, searchVal);
            if (array[m] < searchVal) return searchRecursive(m + 1, q, searchVal);
        }
        return -1;
    }

}
