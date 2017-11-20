package core.com.udemy.fundamental.linearSearch;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/20/20173:38 PM.
 */
public class LinearSearchApp {
    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,1,0,11,12};
        System.out.println(LinearSearch.indexOf(array, 12));
        System.out.println(LinearSearch.indexOf(array, -1));
        System.out.println(LinearSearch.indexOf(array, 13));
        System.out.println(LinearSearch.indexOf(array, 0));
    }

}
