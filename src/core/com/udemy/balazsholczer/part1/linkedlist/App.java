package core.com.udemy.balazsholczer.part1.linkedlist;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/22/201710:14 AM.
 */
public class App {

    public static void main(String[] args) {
        CList<Customer> customers = new CLinkedList<Customer>();

        Customer p = new Customer("Ninh", 70);

        customers.insert(new Customer("Khoi", 27));
        customers.insert(new Customer("Hung", 30));
        customers.insert(p);
        customers.insert(new Customer("Hieu Minh", 55));

        System.out.println("Size of the list = " + customers.size());
        customers.traverseList();

        Customer fakeCustomer = new Customer("Ninh", 68);

        customers.remove(fakeCustomer);

        System.out.println("Size of the list = " + customers.size());

        customers.traverseList();
    }
}
