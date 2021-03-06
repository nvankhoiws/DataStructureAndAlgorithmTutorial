package core.com.udemy.fundamental.dataStructures.linkedList;

public class Node {
    private int data;
    private Node next = null;

    public Node(){

    }

    public Node(int data){
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public String toString(){
        return "Node data " + getData();
    }
}
