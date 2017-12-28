package core.com.udemy.balazsholczer.part1.binary_search_tree;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/28/201712:05 PM.
 */
public interface Tree<T> {
    void traversal();

    void insert(T data);

    void delete(T data);

    T getMax();

    T getMin();
}
