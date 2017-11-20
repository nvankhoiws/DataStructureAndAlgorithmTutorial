package core.com.udemy.fundamental.linearSearch;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/20/201712:51 PM.
 */
public class LinearSearch {
    public static int indexOf (int[] inputArray, int data) {
        int returned = -1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == data)
                return i;
        }
        return -1;
    }
}
