package core.com.udemy.balazsholczer.part1.stack_queue.queue_doubly_linkedlist;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/27/20175:46 PM.
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueDoublyLinkedList<String> queue = new QueueDoublyLinkedList<>();

        queue.enqueue("Khoi");
        queue.enqueue("Dung");
        queue.enqueue("Coca");

        System.out.println(queue.size());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.size());

        System.out.println(queue.peek());

    }

}
