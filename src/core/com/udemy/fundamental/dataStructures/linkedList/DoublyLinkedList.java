package core.com.udemy.fundamental.dataStructures.linkedList;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 11/17/201711:41 AM.
 */
public class DoublyLinkedList {
    private DoublyNode first;
    private DoublyNode last;

    public DoublyLinkedList() {

    }

    // done
    public void insertFirst(int data){
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()){
            last = newNode;
        } else {
            first.setPrevious(newNode);
        }
        newNode.setNext(first);
        first = newNode;
    }

    // done
    public void insertLast(int data){
        if (isEmpty()) {
            insertFirst(data);
        } else {
            add(data);
        }
    }

    // done
    public void deleteFirst(){
        if (size() <= 1) {
            clear();
        } else {
            DoublyNode node = first.getNext();
            node.setPrevious(null);
            first = node;
        }
    }

    // done
    public void deleteLast(){
        if (size() <= 1) {
            clear();
        } else {
            DoublyNode node = last.getPrevious();
            node.setNext(null);
            last = node;
        }
    }
    // done
    public void add(int data){
        if (isEmpty()){
            insertFirst(data);
        } else {
            DoublyNode newNode = new DoublyNode(data);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
    }

    // done
    public void add(int index, int data){
        try {
            if (index != 0) {
                DoublyNode newNode = new DoublyNode(data);
                DoublyNode node = first;
                int count = 0;
                while (node != null){
                    if(count == index) {
                        newNode.setNext(node);
                        newNode.setPrevious(node.getPrevious());
                        node.setPrevious(newNode);
                        newNode.getPrevious().setNext(newNode);
                        break;
                    } else {
                        node = node.getNext();
                        count++;
                    }
                }
                if (node == null && count == index){
                    insertLast(data);
                }
            } else {
                insertFirst(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // done
    public void set(int index, int data){
        if (index >= 0 && index <= size()) {
            DoublyNode node = get(index);
            if (node != null){
                DoublyNode newNode = new DoublyNode(data);
                newNode.setNext(node.getNext());
                newNode.setPrevious(node.getPrevious());
                node.getNext().setPrevious(newNode);
                node.getPrevious().setNext(newNode);
            } else {
                add(data);
            }
        }
    }

    // done
    public DoublyNode removeFirstIndex(int data){
        DoublyNode node = first;
        while (node != null){
            if (node.getData() == data) {
                if (node ==first) {
                    node.getNext().setPrevious(null);
                    first = node.getNext();
                    return node;
                } else if(node == last){
                    node.getPrevious().setNext(null);
                    last = node.getPrevious();
                    return node;
                } else {
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                    return node;
                }
            } else {
                node = node.getNext();
            }
        }
        return null;
    }

    // done
    public DoublyNode remove(int index, boolean flagRemoveByIndex){
        DoublyNode node = first;
        int count = 0;
        while (node != null){
            if (count == index){
                node.getNext().setPrevious(node.getPrevious());
                node.getPrevious().setNext(node.getNext());
                return node;
            } else {
                node = node.getNext();
                count++;
            }
        }
        return null;
    }

    // done
    public int size(){
        if (isEmpty()){
            return 0;
        } else {
            int count = 1;
            DoublyNode node = first;
            while (node.getNext() != null){
                count++;
                node = node.getNext();
            }
            return count;
        }
    }

    // done
    public boolean isEmpty(){
        return first == null && last == null;
    }

    // done
    public boolean contains(int data) {
        if (firstIndexOf(data) != -1)
            return true;
        else
            return false;
    }

    // done
    public int firstIndexOf(int data){
        if (!isEmpty()){
            DoublyNode node = first;
            int count = 1;
            while (node != null){
                if (node.getData() == data) {
                    return count - 1;
                } else {
                    node = node.getNext();
                    count++;
                }
            }
            return -1;
        } else return -1;
    }

    // done
    public int lastIndexOf(int data){
        int returnedValue = -1;
        if (!isEmpty()){
            DoublyNode node = first;
            int count = 1;
            while (node != null){
                if (node.getData() == data) {
                    returnedValue =  count - 1;
                    return returnedValue;
                } else {
                    node = node.getNext();
                    count++;
                }
            }
            return returnedValue;
        } else return -1;
    }

    // done
    public DoublyNode get(int index) {
        try {
            DoublyNode node = first;
            int count = 0;
            while (node != null) {
                if (count == index) {
                    return node;
                } else {
                    node = node.getNext();
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // done
    public void clear(){
        first = null;
        last = null;
    }

    // done
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
