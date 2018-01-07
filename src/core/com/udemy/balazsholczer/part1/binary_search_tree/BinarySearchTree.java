package core.com.udemy.balazsholczer.part1.binary_search_tree;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/28/201712:05 PM.
 */
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;

    public BinarySearchTree() {

    }

    @Override
    public void traversal() {
        // In order inorder_traversal
        if (root != null){
            inorder_traversal(root);
        }
    }

    private void inorder_traversal(Node<T> node) {
        if (node.getLeftChild() != null){
            inorder_traversal(node.getLeftChild());
        }
        System.out.println("Visiting node " + node.toString());
        if (node.getRightChild() != null) {
            inorder_traversal(node.getRightChild());
        }
    }

    private void preorder_traversal(){

    }

    private void postorder_traversal(){

    }

    @Override
    public void insert(T data) {
        if (root == null){
            root = new Node<>(data);
        } else {
            insertNode(data, root);
        }
    }

    private void insertNode(T data, Node<T> node) {
        if (data.compareTo(node.getData()) < 0){
            if (node.getLeftChild() == null) {
                node.setLeftChild(new Node<>(data));
            } else {
                insertNode(data, node.getLeftChild());
            }
        } else if (data.compareTo(node.getData()) > 0){
            if (node.getRightChild() == null) {
                node.setRightChild(new Node<>(data));
            } else {
                insertNode(data, node.getRightChild());
            }
        }
    }

    @Override
    public void delete(T data) {

    }

    @Override
    public T getMin() {
        if (root == null) return null;
        else return getMinData(root);
    }

    private T getMinData(Node<T> node) {
        if (node.getLeftChild() == null) return node.getData();
        else return getMinData(node.getLeftChild());
    }

    @Override
    public T getMax() {
        if (root == null) return null;
        else return getMaxData(root);
    }

    private T getMaxData(Node<T> node) {
        if (node.getRightChild() == null) return node.getData();
        else return getMaxData(node.getRightChild());
    }
}
