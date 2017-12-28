package core.com.udemy.balazsholczer.part1.binary_search_tree;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/28/201712:04 PM.
 */
public class Node<T> {

    private T data;

    private Node<T> leftChild;

    private Node<T> rightChild;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }
}
