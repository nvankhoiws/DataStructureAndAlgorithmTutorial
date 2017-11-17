package core.com.udemy.fundamental.linkedList;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/17/201711:42 AM.
 */
public class DoublyNode {
    private int data;
    private DoublyNode next = null;
    private DoublyNode previous = null;

    public DoublyNode(){

    }

    public DoublyNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public DoublyNode getNext() {
        return next;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public String toString(){
        return "Node data " + getData();
    }
}
