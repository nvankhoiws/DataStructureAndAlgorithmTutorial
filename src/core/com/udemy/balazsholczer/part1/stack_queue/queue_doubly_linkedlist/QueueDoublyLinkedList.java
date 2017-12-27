package core.com.udemy.balazsholczer.part1.stack_queue.queue_doubly_linkedlist;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/27/20175:42 PM.
 */
public class QueueDoublyLinkedList<T> {

    private Node<T> firstNode;

    private Node<T> lastNode;

    private int size;

    public QueueDoublyLinkedList() {
        this.size = 0;
    }

    public void enqueue(T data) {
        if (size() == 0) {
            firstNode = lastNode = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            lastNode.setNextNode(newNode);
            this.lastNode = newNode;
        }
        this.size++;
    }

    public T dequeue() {
        if (size() == 0) {
            return null;
        } else {
            size--;
            Node<T> node = firstNode;
            firstNode = firstNode.getNextNode();
            if (size == 0) lastNode = null;
            return node.getData();
        }
    }

    public T peek() {
        if (size() == 0) return null;
        else return firstNode.getData();
    }

    public int size() {
        return this.size;
    }
}
