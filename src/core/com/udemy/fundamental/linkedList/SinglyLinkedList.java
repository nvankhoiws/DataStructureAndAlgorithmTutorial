package core.com.udemy.fundamental.linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/13/20179:16 AM.
 */
public class SinglyLinkedList {
    Node first;

    public void add(Node newNode){
        if (first == null){
            first = new Node();
            first.setNext(newNode);
        } else {
            Node tmp = first.getNext();
            while(tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
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

    public void add(int index, Node node){
        Node tmp = first.getNext();
        Node prevNode = first;
        int count = 0;
        while(count <= index){
            if (count == index) {
                prevNode.setNext(node);
                node.setNext(tmp);
            } else {
                prevNode = tmp;
                tmp = tmp.getNext();
            }
            count++;
        }

    }

    public void clear(){
        first = null;
    }

    @Override
    public String toString() {
        String represented = "[ ";
        Node tmp = (first != null) ? first.getNext() : null;
        while (tmp != null && tmp.getNext() == null) {
            represented += tmp.getData() + "\t";
        }
        represented += "]";
        return represented;
    }
}
