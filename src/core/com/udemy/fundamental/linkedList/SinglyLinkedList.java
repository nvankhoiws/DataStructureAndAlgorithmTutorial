package core.com.udemy.fundamental.linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/13/20179:16 AM.
 */
public class SinglyLinkedList {
    Node first;

    public void add(Node newNode){
        Node tmp = first.getNext();
        while(tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(newNode);
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

    public Node get(int index){

    }

    public void set(int index, Node node){

    }

    public void add(int index, Node node){

    }

    public void clear(){
        first = null;
    }
}
