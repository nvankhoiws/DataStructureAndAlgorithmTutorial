package core.com.udemy.fundamental.dataStructures.linkedList;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/17/20179:27 AM.
 */
public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {

    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            last = newNode;
        }
        newNode.setNext(first);
        first = newNode;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            first = newNode;
        }
        last.setNext(newNode);
        last = newNode;
    }

    public void deleteFirst(){
        if (first != null) {
            if (first.getNext() == null){
                last = null;
            }
            first = first.getNext();
        }
    }

    public void displayList(){
        System.out.println("===================");
        Node tmp = first;
        int count = 0;
        while (tmp != null) {
            System.out.println("Node no " + count + " | " + tmp.getData());
            tmp = tmp.getNext();
            count++;
        }
        System.out.println("===================");
    }
}
