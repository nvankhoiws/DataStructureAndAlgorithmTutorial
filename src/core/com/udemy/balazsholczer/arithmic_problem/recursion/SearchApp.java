package core.com.udemy.balazsholczer.arithmic_problem.recursion;

public class SearchApp {

    private static int[] array = new int[]{9,8,4,5,3,8,1,6,4,7,98298,3999};
    private static int[] array2 = new int[]{1,3,5,7,99,171,187,301,433,627,3999};

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch(array);
        System.out.println(linearSearch.searchIterative(4));
        System.out.println(linearSearch.searchRecursive(array.length -1, 4));

        BinarySearch binarySearch = new BinarySearch(array2);
        System.out.println(binarySearch.searchIterative(301));
        System.out.println(binarySearch.searchRecursive(0,array2.length -1, 301));
    }

}
