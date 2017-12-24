package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class LinearSearch{
    private int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int searchIterative(int i) {
        int e = array.length - 1;
        while(e > -1){
            if (array[e] == i) return e;
            e--;
        }
        return -1;
    }

    public int searchRecursive(int index, int i) {
        if (index == array.length || index == -1) return -1;
        if (array[index] == i) return index;
        return searchRecursive(index - 1, i);
    }
}
