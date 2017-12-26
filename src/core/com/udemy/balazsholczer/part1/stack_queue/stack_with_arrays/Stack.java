package core.com.udemy.balazsholczer.part1.stack_queue.stack_with_arrays;

public class Stack<T> {
    private T[] data;

    private int numberofitems;

    public Stack() {
        this.data = (T[]) new Object[1];
    }

    public void push(T data) {
        if (numberofitems == this.data.length) {
            rezise(2*this.data.length);
        }
        this.data[numberofitems] = data;
        this.numberofitems++;
    }

    private void rezise(int i) {
        T[] newOne = (T[]) new Object[i];
        for (int j = 0; j < this.data.length; j++) {
            newOne[j] = this.data[j];
        }
        this.data = newOne;
    }

    public T pop(){
        T one = this.data[numberofitems - 1];
        this.data[numberofitems - 1] = null;
        this.numberofitems--;
        if (numberofitems > 0 && numberofitems < this.data.length / 4){
            rezise(this.data.length / 2);
        }
        return one;
    }

    public T peek(){
        return this.data[numberofitems - 1];
    }

    public int size() {
        return this.numberofitems;
    }

    public boolean isEmpty() {
        return numberofitems == 0;
    }

    public void traverseStack() {
        for (int i = numberofitems - 1; i > -1 ; i--) {
            System.out.println("Data " + this.data[i]);
        }
    }
}
