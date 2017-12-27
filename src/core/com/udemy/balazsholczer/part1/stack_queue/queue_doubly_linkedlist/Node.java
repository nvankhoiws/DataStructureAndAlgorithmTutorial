package core.com.udemy.balazsholczer.part1.stack_queue.queue_doubly_linkedlist;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/27/20175:43 PM.
 */
public class Node <T> {
    T data;

    Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
