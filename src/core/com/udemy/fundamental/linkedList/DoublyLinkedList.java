package core.com.udemy.fundamental.linkedList;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/17/201711:41 AM.
 */
public class DoublyLinkedList {
    private DoublyNode first;
    private DoublyNode last;

    public DoublyLinkedList() {

    }

    public void insertFirst(int data){
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()){
            last = newNode;
        }
        first.setPrevious(newNode);
        newNode.setNext(first);
        first = newNode;
    }

    public void insertLast(int data){

    }

    public void deleteFirst(){

    }

    public void deleteLast(){

    }

    public void add(int data){

    }

    public void add(int index, int data){

    }

    public void set(int index, int data){

    }

    public void remove(int data){

    }

    public void remove(int index, boolean flagRemoveByIndex){

    }

    public int size(){
        if (isEmpty()){
            return 0;
        } else {
            int count = 1;
            DoublyNode forward = first;
            DoublyNode backward = last;
        }
    }

    // done
    public boolean isEmpty(){
        return first == null;
    }

    public boolean contains(int data) {

    }

    public int indexOf(int data){

    }

    public Node get(int index) {

    }

    public void clear(){
        first = null;
    }

    public void displayAsString() {
        System.out.println("===================");
        DoublyNode tmp = first;
        int count = 0;
        while (tmp != null) {
            System.out.println("Node no " + count + " | " + tmp.getData());
            tmp = tmp.getNext();
            count++;
        }
        System.out.println("===================");
    }
}
