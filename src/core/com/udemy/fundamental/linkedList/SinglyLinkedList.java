package core.com.udemy.fundamental.linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/13/20179:16 AM.
 */
public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList(){

    }

    public void add(int data){
        Node tmp = first;
        if (tmp == null) {
            tmp = new Node();
            tmp.setData(data);
            tmp.setNext(first);
            first = tmp;
        } else {
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(data));
        }
    }

    public void add(int index, int data){
        Node newNode = new Node(data);
        Node tmp = first;
        int count = -1;
//        0 1 2
//        0 1 101
//        index = 2
//        count = -1
//-> tmp 0, count = -1
//-> tmp 1, count = 0 = 2 - 2
//-> tmp 2, count = 1
        while(count < index - 1){
            tmp = tmp.getNext();
            count++;
        }
        newNode.setNext(tmp.getNext());
        tmp.setNext(newNode);
    }

    public void set(int index, Node node){
        Node tmp = first.getNext();
        int count = 0;
        while(count <= index){
            if (count ==  index){
                tmp.setData(node.getData());
            } else {
                tmp = tmp.getNext();
            }
            count++;
        }
    }

    public void remove(Node removedNode){

    }

    public int size(){
        int counter = 0;
        Node node = first.getNext();
        while (node != null) {
            counter++;
            node = node.getNext();
        }
        return counter;
    }

    public boolean isEmpty(){
        return first.getNext() == null;
    }

    public boolean contains(Node node) {
        int data = node.getData();
        Node tmp = first.getNext();
        do {
            if (tmp.getData() == data){
                return true;
            } else {
                tmp = tmp.getNext();
                if (tmp == null){
                    return false;
                }
            }
        } while (true);
    }

    public int indexOf(Node node){
        int counter = -1;
        int data = node.getData();
        Node tmp = first.getNext();
        do {
            if (tmp.getData() == data){
                return ++counter;
            } else {
                counter++;
                tmp = tmp.getNext();
                if (tmp == null){
                    return -1;
                }
            }
        } while (true);
    }

    public Node get(int index) {
        Node node = first.getNext();
        int currentIndex = 0;
        while (currentIndex <= index) {
            if (currentIndex == index) {
                return node;
            } else {
                currentIndex++;
                node = node.getNext();
            }
        }
        return null;
    }

    public void clear(){
        first = null;
    }

    @Override
    public String toString() {
        String represented = "[\t";
        Node tmp = first;
        while (tmp != null) {
            represented += tmp.getData() + "\t";
            tmp = tmp.getNext();
        }
        represented += "]";
        return represented;
    }
}
