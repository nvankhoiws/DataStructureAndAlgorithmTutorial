package core.com.udemy.fundamental.dataStructures.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private Integer capacity;
    private Integer size;
    private Integer topIndex;
    private List bank;

    public Stack(){
        this.capacity = 5;
        this.size = 0;
        this.topIndex = -1;
        this.bank = new ArrayList<>();
    }

    public boolean push(String s) {
        if(getSize().compareTo(getCapacity()) == 0){
            return false;
        } else {
            bank.add(s);
            topIndex++;
            size++;
            return true;
        }
    }

    public String pop() {
        String s = (java.lang.String) this.bank.get(getSize() - 1);
        bank.remove(getSize() - 1);
        this.size--;
        topIndex--;
        return s;
    }

    public String peak() {
        return (java.lang.String) this.bank.get(getSize() - 1);
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Stack setCapacity(Integer capacity) {
        Stack stack = new Stack();
        if (getSize() != null && getSize() > 0) {
            if (capacity <= getSize()) {
                System.out.println("Cannot generate new sizing stack");
                return this;
            } else {
                // copy all element in current stack to new sizing stack
                while (this.getSize() > 0){
                    stack.push(this.pop());
                }
                return stack;
            }
        } else {
            stack.capacity = capacity;
            return stack;
        }
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTopIndex() {
        return topIndex;
    }

    public void setTopIndex(Integer topIndex) {
        this.topIndex = topIndex;
    }
}