package core.com.udemy.balazsholczer.part1.linkedlist;

public class Customer implements Comparable<Customer> {
    private String name;

    private Integer age;

    public Customer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Customer o) {
        // compare both name and age
        return (this.age < o.age) ? -1 : ((this.age > o.age) ? 1 : ((this.name.equalsIgnoreCase(o.name)) ? 0 : -1));

        // compare only the age
//        return (this.age < o.age) ? -1 : ((this.age > o.age) ? 1 : 0);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
