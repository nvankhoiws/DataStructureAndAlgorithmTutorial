package core.com.udemy.balazsholczer.part1.linkedlist;

public class CLinkedList<T extends Comparable<T>> implements CList<T> {

    private Node root;
    private int size;

    @Override
    public void insert(T data) {
        size++;
        if (root == null) {
            this.root = new Node(data);
        } else {
            insertDataAtStart(data);
        }
    }

    private void insertDataAtStart(T data) {
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
    public Node<T> remove(T data) {
        if (root != null) {
            if (root.getData().equals(data)) {
                size--;
                Node removed  = root;
                root = root.getNextNode();
                return removed;
            } else {
                return removeByTraversing(data, root, root.getNextNode());
            }
        } else return null;
    }

    private Node<T> removeByTraversing(T data, Node previousNode, Node currentNode) {
        while(currentNode != null) {
            if (currentNode.getData().compareTo(data ) == 0) {
                previousNode.setNextNode(currentNode.getNextNode());
                size--;
                return currentNode;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    @Override
    public void traverseList() {
        Node<T> node = this.root;
        while( node != null){
            System.out.print(node.getData() + "-");
            node = node.getNextNode();
        }
    }

    @Override
    public int size() {
        return size;
    }
}
