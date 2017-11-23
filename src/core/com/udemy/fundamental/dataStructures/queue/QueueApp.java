package core.com.udemy.fundamental.dataStructures.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(12);
        queue.insert(22);
        queue.insert(32);
        queue.insert(42);
        queue.insert(52);
        queue.insert(62);
        queue.view();

        queue.remove();
        queue.view();
        queue.insert(62);
        queue.view();
        queue.insert(72);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.view();
        queue.insert(82);
        queue.view();
        queue.remove();
        queue.view();


    }

}
