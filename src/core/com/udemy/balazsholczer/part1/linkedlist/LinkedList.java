package core.com.udemy.balazsholczer.part1.linkedlist;

public class LinkedList <T extends Comparable<T>> implements List<T> {

    private Node root;
    private int size;

    @Override
    public void insert(T data) {
        size++;
        if (root == null) {
            this.root = new Node(data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    private void insertDataAtBeginning(T data) {
        Node<T> newNode = new Node(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node newNode = new Node(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root != null) {

        }
    }

    @Override
    public void traverseList() {

    }

    @Override
    public int size() {
        return 0;
    }
}
