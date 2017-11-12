package core.com.udemy.fundamental.queue;

public class Queue {
    private int[] queueArray;
    private int front = 0;
    private int rear = -1;
    private int maxSize;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        queueArray = new int[this.maxSize];
        nItems = 0;
    }

    public boolean insert(int item){
        if (isFull()) {
            System.out.println("The queue is full");
            return false;
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            this.rear++;
            this.nItems++;
            queueArray[this.rear] = item;
            return true;
        }
    }

    public int remove(){
        if (isEmpty()){
            System.out.println("The queue is already empty");
            return -1;
        } else {
            int returned = queueArray[front];
            front++;
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            System.out.println("Remove front element " + returned);
            return returned;
        }
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public int peak(){
        return queueArray[front];
    }

    public void view(){
//        for (int i = 0; i < queueArray.length; i++) {
//            System.out.print(queueArray[i] + "\t");
//        }
//        System.out.println();
        for (int i = 0; i < nItems; i++) {
            if (front + i <= maxSize - 1) {
                System.out.print(queueArray[front + i] + "\t");
            } else {
                System.out.println(queueArray[front + i - maxSize]);
            }
        }
        System.out.println();
    }
}
