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

    // done
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
    // done
    public void add(int index, int data){
        if (index >= size() + 1 || index < 0) {
            System.out.println("SinglyLinkedList is out of bound.");
        } else {
            Node newNode = new Node(data);
            Node tmp = first;
            int count = 0;
            if (index == 0) {
                newNode.setNext(tmp);
                first = newNode;
            } else if (index == 1){
                tmp = tmp.getNext();
                newNode.setNext(tmp);
                first.setNext(newNode);
            } else {
                while(count < index - 1){
                    tmp = tmp.getNext();
                    count++;
                }
                newNode.setNext(tmp.getNext());
                tmp.setNext(newNode);
            }
        }
    }
    // done
    public void set(int index, int data){
        if (index >= size() + 1 || index < 0) {
            System.out.println("SinglyLinkedList is out of bound.");
        } else {
            Node newNode = new Node(data);
            Node tmp = first;
            int count = 0;
            if (index == 0) {
                newNode.setNext(tmp.getNext());
                first = newNode;
            } else if (index == 1){
                tmp = tmp.getNext();
                newNode.setNext(tmp.getNext());
                first.setNext(newNode);
            } else if (index == size()){
                Node lastNode = get(size() - 1);
                lastNode.setNext(newNode);
            } else {
                while(count < index){
                    tmp = tmp.getNext();
                    count++;
                }
                newNode.setNext(tmp.getNext());
                tmp.setNext(newNode);
            }
        }
    }

    // done
    public void remove(int data){
        for (int i = 0; i < size(); i++){
            Node currentNode = get(i);
            if (currentNode.getData() == data) {
                if (i == 0 ){
                    first = currentNode.getNext();
                } else {
                    Node prevNode = get(i - 1);
                    prevNode.setNext(currentNode.getNext());
                }
            }
        }
    }

    // done
    public void remove(int index, boolean flagRemoveByIndex){
        Node currentNode = get(index);
        remove(currentNode.getData());
    }

    // done
    public int size(){
        Node tmp = first;
        if (tmp == null){
            return 0;
        } else {
            int counter = 0;
            while (tmp != null) {
                counter++;
                tmp = tmp.getNext();
            }
            return counter;
        }
    }
    // done
    public boolean isEmpty(){
        return size() == 0;
    }
    // done
    public boolean contains(int data) {
        return indexOf(data) > -1;
    }
    // done
    public int indexOf(int data){
        for (int i = 0; i < size(); i++){
            Node currentNode = get(i);
            if (currentNode.getData() == data) {
                return i;
            }
        }
        return -1;
    }

    // done
    public Node get(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("SinglyLinkedList is out of bound: " + index);
            return null;
        } else {
            Node node = first;
            int currentIndex = 0;
            while (currentIndex < index) {
                currentIndex++;
                node = node.getNext();
            }
            return node;
        }
    }
    //done
    public void clear(){
        first = null;
    }
    //done
    public void displayAsString() {
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
