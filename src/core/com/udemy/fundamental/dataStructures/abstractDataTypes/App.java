package core.com.udemy.fundamental.dataStructures.abstractDataTypes;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter("newCounter");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());
    }
}
