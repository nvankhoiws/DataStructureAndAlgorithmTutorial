package core.com.udemy.balazsholczer.part1.stack_queue.stack_with_linkedlist;

public class Stack<T extends Comparable<T>> {

    private Node root;

    private int size;

    public Stack() {

    }

    public void push (T data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            Node newNode = new Node(data);
            newNode.setNextNode(this.root);
            this.root = newNode;
        }
    }

    public T pop() {
        Node node = this.root;
        this.root = node.getNextNode();
        return (T) node.getData();
    }

    public T peak() {
        if (this.root != null) return (T) this.root.getData();
        return null;
    }

    public int size() {
        return this.size;
    }

    public void traverseStack() {
        Node node = this.root;
        while (node != null) {
            System.out.println("Data is " + node.getData());
            node = node.getNextNode();
        }
        System.out.println("===================");
    }
}
