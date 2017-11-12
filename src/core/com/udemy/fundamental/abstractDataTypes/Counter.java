package core.com.udemy.fundamental.abstractDataTypes;

public class Counter {
    private String name;
    private int currentValue;

    public Counter(String name) {
        this.name = name;
        this.currentValue = 0;
    }

    public void increment(){
        this.currentValue++;
    }

    @Override
    public String toString() {
        return "Name " + this.name + " | current value " + this.currentValue;
    }

    public String getName() {
        return name;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
